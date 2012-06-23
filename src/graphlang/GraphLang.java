package graphlang;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.TokenStream;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

public class GraphLang {
	public static void main(String[] args) throws Exception {
		if(args.length==0){
			System.out.println("enter name of file for compilation, please");
			return;
		}
		GraphLang t = new GraphLang();
		if(new File(args[0]).isFile()){
			t.run(args);
		}
		else{
			System.out.println("file "+args[0]+" not found");
		}
	}
	
	public void run(String[] args) throws Exception{
		InputStream inputStream = getClass().getResourceAsStream("GraphLang2Java.stg");
		StringTemplateGroup templates = new StringTemplateGroup(new InputStreamReader(inputStream),
			    AngleBracketTemplateLexer.class);

        ANTLRFileStream fileStream = new ANTLRFileStream(args[0]);
        GraphLangLexer lexer = new GraphLangLexer(fileStream);
	    TokenStream tokenStream = new CommonTokenStream(lexer);
		GraphLangParser parser = new GraphLangParser(tokenStream);
		
		parser.setTemplateLib(templates);
		
		RuleReturnScope r = parser.programm();
		
		for(String s: parser.errors){
			System.err.println(s);
		}
		
		if(parser.errors.isEmpty()){
			FileWriter outWr = new FileWriter("GraphLangProgram.java");
            outWr.write(r.getTemplate().toString());
            outWr.close();
		}
	}

}
