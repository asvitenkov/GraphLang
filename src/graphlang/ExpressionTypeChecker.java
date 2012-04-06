package graphlang;

import java.util.ArrayList;
import java.util.Stack;

public class ExpressionTypeChecker {
	private Stack<String> errors = new Stack<String>();
	
	public void getAllErrors(ArrayList<String> list){
		while(!errors.isEmpty()){
			list.add(errors.pop());
		}
	}
	
	public ExpressionTypeChecker(){
		
	}
	
	public String checkMathExpressionTypes(ArrayList<String> list){
		String result = "?";
		if(list.contains("Bool") && list.size()>1) return result;
		if(list.size()==0) return result;
		String lastType = list.get(0);
		result = lastType;
		for(String el:list){
			if(!el.equals(lastType))
				result = "?";
		}
		return result;
	}
	
	public boolean checkAssignOperation(String operator, String lType, String rType, int line){
		boolean result = true;
		if(operator==null || lType == null || rType == null){
			errors.add("line "+line+": checkAssignOperation undefined error ");
			return false;
		}
		//System.out.println("line "+line+": check assignment operator ltype="+lType+" rType="+rType+" operator "+operator);
		if(operator.equals("=")){
			// type = type
			// graph | arc | node = string
			if(lType.equals(rType)){
				return true;
			}
			else{
				if((lType.equals("Graph") || lType.equals("OArc") || lType.equals("Node")) && rType.equals("Text")){
					return true;
				}
				else{
					String add="";
					if(!lType.equals("none") && !lType.equals("?")) add = "right expression must have type "+lType;
					errors.add("line "+line+": assignment operator type mismatch "+add);
					return false;
				}
			}			
		}
		return result;
	}
}
