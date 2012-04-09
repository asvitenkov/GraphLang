package graphlang;

import java.util.ArrayList;
import java.util.Stack;

public class ExpressionTypeChecker {
	private Stack<String> errors = new Stack<String>();
	private ArrayList<String> types = new ArrayList<String>();
	
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
		if(!types.contains(lType) || !types.contains(lType)) {
			errors.add("line "+line+": checkAssignOperation undefined type ");
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
					add = "right expression must have type "+lType;
					errors.add("line "+line+": assignment operator type mismatch "+add);
					return false;
				}
			}			
		}
		if(operator.equals("+=")){
			if(lType.equals(rType)){
				if(lType.equals("Text")||lType.equals("Int")||lType.equals("Float")||lType.equals("Graph")){
					
				}
			}
			else{
				// error
			}
		}
		return result;
	}
	
	{
		types.add("Int"); types.add("Float"); types.add("void"); types.add("Graph"); types.add("OArc"); types.add("Node"); types.add("Bool"); types.add("Text");
	}
}
