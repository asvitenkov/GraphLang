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
		if(list.contains("bool") && list.size()>1) return result;
		if(list.size()==0) return result;
		String lastType = list.get(0);
		result = lastType;
		for(String el:list){
			if(!el.equals(lastType) )
				result = "?";
		}
		if(list.size()>1&& !result.equals("String")&&!result.equals("int")&&!result.equals("double"))
			result="?";
		return result;
	}
	
	public boolean checkAssignOperation(String operator, String lType, String rType, int line){
		//!!!!!!!!!!!!!11111111 дописать проверку существования переменных
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
				if((lType.equals("Graph") || lType.equals("OArc") || lType.equals("Node")) && rType.equals("String")){
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
			if(lType.equals("String")||lType.equals("int")||lType.equals("double")||lType.equals("Graph")){
				//нужно проверять каждый тип в отдельности
				if(lType.equals("String")){
					if(!rType.equals("String")){
						errors.add("line "+line+": assignment operator type mismatch "+"right expression must have type "+lType+" , but have type"+rType);
						return false;
					}
				}
				else if(lType.equals("int")){
					if(!rType.equals("int")){
						errors.add("line "+line+": assignment operator type mismatch "+"right expression must have type "+lType+" , but have type "+rType);
						return false;
					}
				}
				else if(lType.equals("double")){
					if(!rType.equals("double")){
						errors.add("line "+line+": assignment operator type mismatch "+"right expression must have type "+lType+" , but have type "+rType);
						return false;
					}
				}
				else if(lType.equals("Graph")){
					if(!rType.equals("Node") &&  !rType.equals("Graph") &&  !rType.equals("OArc")){
						errors.add("line "+line+": assignment operator type mismatch "+"right expression must have type "+lType+" , but have type "+rType);
						return false;
					}
				}
				else{
					errors.add("line "+line+": undefined error");
					return false;
				}
			}
			else{
				// error
				errors.add("line "+line+": error smart assignment operator types");
				return false;
			}
		}

		if(operator.equals("-=")){
			if(lType.equals("int")||lType.equals("double")||lType.equals("Graph")){
				//нужно проверять каждый тип в отдельности
				if(lType.equals("int")){
					if(!rType.equals("int")){
						errors.add("line "+line+": assignment operator type mismatch "+"right expression must have type "+lType+" , but have type "+rType);
						return false;
					}
				}
				else if(lType.equals("double")){
					if(!rType.equals("double")){
						errors.add("line "+line+": assignment operator type mismatch "+"right expression must have type "+lType+" , but have type "+rType);
						return false;
					}
				}
				else if(lType.equals("Graph")){
					if(!rType.equals("Node") &&  !rType.equals("Graph") &&  !rType.equals("OArc")){
						errors.add("line "+line+": assignment operator type mismatch "+"right expression must have type "+lType+" , but have type "+rType);
						return false;
					}
				}
				else{
					errors.add("line "+line+": undefined error");
					return false;
				}
			}
			else{
				// error
				errors.add("line "+line+": error smart assignment operator types");
				return false;
			}
		}
		
		




		return result;
	}

	{
		types.add("int"); types.add("double"); types.add("void"); types.add("Graph"); types.add("OArc"); types.add("Node"); types.add("bool"); types.add("String");
	}
}
