package test;

import java.util.ArrayList;

import graphlang.*;

public class test {

	/**
	 * @param args
	 */

	protected ArrayList<String> errors = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> tmpVarNamesList = new ArrayList<String>();
		ExpressionTypeChecker typeCheker = new ExpressionTypeChecker();
		NamesTable names = new NamesTable();
		ArrayList<String> errors = new ArrayList<String>();
		
		names.addVariable(names.new  VariableName("sdfsdf", "", 123));
		
		tmpVarNamesList.add("asd");
		System.out.println();
		names.addFunction(names.new FunctionName("", "", null, null, 13) );
		names.isExistFunction("");
		names.getFunction("sdfsdf").getReturnType();
		String s;
//		names.getAllErrors(list);
//		names.checkSetArcOperator(id, from, to, curBlock, line);
		//names.checkReturnType(funcName, varName, curBlock, isUsed, line);
		//if(names.isExistMethod(""))
		
		
	}

}
