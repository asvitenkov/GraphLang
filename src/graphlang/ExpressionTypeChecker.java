package graphlang;

import java.util.ArrayList;

public class ExpressionTypeChecker {
	public ExpressionTypeChecker(){
		
	}
	
	public String checkMathExpressionTypes(ArrayList<String> list){
		String result = "?";
		if(list.contains("Bool")) return result;
		if(list.size()==0) return result;
		String lastType = list.get(0);
		result = lastType;
		for(String el:list){
			if(!el.equals(lastType))
				result = "?";
		}
		return result;
	}
}
