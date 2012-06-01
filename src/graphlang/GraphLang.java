package graphlang;

import java.io.FileReader;
import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.TokenStream;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

public class GraphLang {
	//public static StringTemplateGroup templates;
	public static void main(String[] args) throws IOException, RecognitionException {
		String templateFileName="GraphLang2Java.stg";
		
		StringTemplateGroup templates = new StringTemplateGroup(new FileReader(templateFileName),
			    AngleBracketTemplateLexer.class);
		
        ANTLRFileStream fileStream = new ANTLRFileStream(args[0]);
        GraphLangLexer lexer = new GraphLangLexer(fileStream);
	    TokenStream tokenStream = new CommonTokenStream(lexer);
		GraphLangParser parser = new GraphLangParser(tokenStream);
		parser.setTemplateLib(templates);
		RuleReturnScope r = parser.programm();
		//parser.programm();
		if(r!=null && r.getTemplate()!=null) System.out.println(r.getTemplate().toString());
		for(String s: parser.errors){
			System.err.println(s);
		}
		System.out.println("done work");
	}

}
