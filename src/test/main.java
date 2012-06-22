package test;

import java.io.IOException;

import antlr.RecognitionException;

public class main {
	public static void main(String[] args) {
		GraphLangProgram pr = new GraphLangProgram();
		try {
			pr.run();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
