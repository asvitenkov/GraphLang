package test;

import java.io.IOException;

import antlr.RecognitionException;

public class ProgramRun {
	public static void main(String[] args) throws RecognitionException, IOException{
		GraphLangProgram pr = new GraphLangProgram();
		pr.run();
	}
}
