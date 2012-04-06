package graphlang;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class GraphLang {
	public static void main(String[] args) throws IOException, RecognitionException {
        //CharStream charStream = new ANTLRStringStream("Int a,b,c; main{}");
        //System.out.println(args[0]);
        ANTLRFileStream fileStream = new ANTLRFileStream("all.txt");
	    //GraphLangLexer lexer = new GraphLangLexer(charStream);
        GraphLangLexer lexer = new GraphLangLexer(fileStream);
	    TokenStream tokenStream = new CommonTokenStream(lexer);
		GraphLangParser parser = new GraphLangParser(tokenStream);
		parser.programm();
		for(String s: parser.errors){
			System.err.println(s);
		}
		//System.out.println("done");
	}

}
