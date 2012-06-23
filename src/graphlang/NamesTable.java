package graphlang;




import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;




public class NamesTable {
	public class VariableName {
		private String 	idtf;
		private String	type;
		private int		lineDeclaration;
		private ArrayList<Integer> linesUses = new ArrayList<Integer>();
		
		public VariableName(String idtf, String type, int line) {
			this.idtf = idtf;
			this.type = type;
			lineDeclaration = line;
//			int i;
//			if(i==null){
//			}
		}
		public void addLineUses(int line) {
			linesUses.add(new Integer(line));
		}
		public String toString() {
			return idtf + ", " + type + ", " + lineDeclaration + ", " 
				+ ((linesUses.isEmpty())? "not uses" : linesUses);
		}
		public String getType() {
			return type;
		}
		
	}
	public class FunctionName {
		private String 	idtf;
		private int lineDeclaration;
		private String returnType;
		private ArrayList<String> argumentTypesList;
		private ArrayList<String> argumentNamesList;
		private ArrayList<Integer> linesUses = new ArrayList<Integer>();
		
		public FunctionName(String idtf, String rType, ArrayList<String> types, ArrayList<String> names,  int line) {
			this.idtf = idtf;
			this.returnType = rType;
			this.argumentTypesList = types;
			this.argumentNamesList = names;
			lineDeclaration = line;
		}
		public void addLineUses(int line) {
			linesUses.add(new Integer(line));
		}
		public String toString() {
			return idtf + ", " + returnType + ", " + lineDeclaration + ", " 
				+ ((linesUses.isEmpty())? "not uses" : linesUses);
		}
		public String getReturnType() {
			return returnType;
		}
		public ArrayList<String> getArgumentTypes(){
			return argumentTypesList;
		}
		public ArrayList<String> getArgumentNames(){
			return argumentNamesList;
		}
		
	}
	public class MethodName {
		private String 	idtf;
		private String	returnType;
		private String	inputType;
		private ArrayList<String> argumentTypes;
		private ArrayList<Integer> linesUses = new ArrayList<Integer>();
		
		public MethodName(String idtf,String iType, String rType, ArrayList<String> argTypes) {
			this.idtf = iType+"."+idtf;
			this.returnType = rType;
			this.inputType = iType;
			this.argumentTypes = argTypes;
		}
		public void addLineUses(int line) {
			linesUses.add(new Integer(line));
		}
		public String toString() {
			return idtf //+ ", " + type + ", " + lineDeclaration + ", " 
				+ ((linesUses.isEmpty())? " not uses" : linesUses);
		}
		public String getReturnType() {
			return returnType;
		}
		public String getInputType() {
			return inputType;
		}
		public ArrayList<String> getArgumentTypes(){
			return argumentTypes;
		}
		
	}
	private HashMap<String, FunctionName> functionNames = new HashMap<String, FunctionName>();
	private HashMap<String, VariableName> variableNames = new HashMap<String, VariableName>();
	private HashMap<String, MethodName> methodNames = new HashMap<String, MethodName>();
	private Stack<String> errors = new Stack<String>();
	public String getLAstError(){
		if(!errors.isEmpty())
			return errors.pop();
		else return "";
	}
	public boolean isExistVariable(String name) {
		//System.out.println(name);
		boolean rv = variableNames.containsKey(name);
		if (! rv && name.indexOf('.')!=-1) {
			rv = variableNames.containsKey("global"+name.substring(name.indexOf('.')));
			if(!rv){
				// search variable name in functions names
				//System.out.println(name.substring(name.indexOf('.')+1).toString());
				rv = variableNames.containsKey(name.substring(name.indexOf('.')+1));
			}
		}
		return rv;
	}
	
	public boolean isDeclaredVariable(String name){
		boolean result = false;
		result = variableNames.containsKey(name);
//		if(result==false){
//			result = variableNames.containsKey("global"+name.substring(name.indexOf('.')));
//		}
		return result;
	}
	
	public void addVariable(VariableName n) {
		//System.out.println("Declaration var : "+n.idtf+" line " + n.lineDeclaration);
		variableNames.put(n.idtf, n);
	}
	
	public void printVars(){
		System.out.println(variableNames);
	}
	
	public VariableName getVariable(String n) {
		//System.out.println(n);
		VariableName _n = variableNames.get(n); 
		if (_n == null) {
			if (n.indexOf('.')==-1)
				_n = variableNames.get("global."+n);
			else 
				_n = variableNames.get("global"+n.substring(n.indexOf('.')));
		}
		return _n;
	}
	
	public void printVariable(PrintStream out) {
		for (String idtf : variableNames.keySet()) {
			VariableName n = variableNames.get(idtf);
			out.println(n);
		}
	}
	
	public boolean isExistFunction(String name) {
		boolean rv = functionNames.containsKey(name);
//		if (! rv) {
//			rv = functionNames.containsKey(name.substring(name.indexOf('.')));
//		}
		return rv;
	}
	
	public void addFunction(FunctionName n) {
		//System.out.println("Declaration func : "+n.idtf+" line " + n.lineDeclaration + " " +n.argumentNamesList.toString()+ " " + n.argumentTypesList.toString());
		functionNames.put(n.idtf, n);
	}
	
	public FunctionName getFunction(String n) {
		FunctionName _n = functionNames.get(n); 
		return _n;
	}
	
	
	public void printFunction(PrintStream out) {
		for (String idtf : functionNames.keySet()) {
			FunctionName n = functionNames.get(idtf);
			out.println(n);
		}
	}
	
	public boolean isExistMethod(String name) {
		return methodNames.containsKey(name);
	}
	
	public boolean isExistMethod(String curBlock, String idName, String methodName) {
		if(isExistVariable(curBlock+"."+idName)){
			String idType = getVariable(curBlock+"."+idName).getType();
			return methodNames.containsKey(idType+"."+methodName);
		}
		return methodNames.containsKey(idName);
	}
	
	public void addMethod(MethodName n) {
		methodNames.put(n.idtf, n);
	}
	
	public MethodName getMethod(String n) {
		return methodNames.get(n);
	}
	
	public MethodName getMethod(String curBlock, String idName, String methodName) {
		if(isExistVariable(curBlock+"."+idName)){
			String idType = getVariable(curBlock+"."+idName).getType();
			return methodNames.get(idType+"."+methodName);
		}
		return methodNames.get(methodName);
	}
	
	public void printMethod(PrintStream out) {
		for (String idtf : methodNames.keySet()) {
			MethodName n = methodNames.get(idtf);
			out.println(n);
		}
	}
	
	
	public boolean checkReturnType(String funcName, String varName, String curBlock,boolean isUsed, int line){
		//System.out.println(curBlock+"."+varName);
		if(curBlock.equals("main")){
			//System.out.println("1");
			errors.add("line "+line+": return statment in main block");
			return false;
		}
		if(!isExistFunction(funcName)){
			//error func with name funcName doesn't exists
//			System.out.println("2");
			errors.add("line "+line+": function "+funcName+" doesn't exists");
			return false;
		}
		if(!isExistVariable(curBlock+"."+varName) && varName!=null && !varName.equals("")){
//			System.out.println("3");
			errors.add("line "+line+": variable "+varName+" doesn't exists");
			return false;
		}
		FunctionName func = getFunction(funcName);
		VariableName var = getVariable(curBlock+"."+varName);
		String funcReturnType = func.getReturnType();
		//String varReturnType = variableNames.get(curBlock+"."+varName).getType();
		//VariableName var = variableNames.get(varName);
		
		if(funcReturnType.equals("void")){
			// need return a void type  "return ;"
			if(varName==null || varName.equals("")){
				// всё хорошо, так и должно быть
				return true;
			}
			else{
				// какая то переменная возвращается, а не должно ничего возвращаться
				errors.add("line "+line+": return type of "+ funcName +" mismatch - need void, found "+var.getType());			
				return false;	
			}
		}
		else{
			if(!isUsed){
				// return not used but func must return a value
//				System.out.println("5");
				errors.add("line "+line+": function "+ funcName +" must return a value of type "+funcReturnType);
				return false;
			}
			else{
				if(varName==null){
//					System.out.println("6");
					errors.add("line "+line+": function "+ funcName +" must return a value of type "+funcReturnType);
					return false;
				}
				else{
					String varType = var.getType();
					if(!varType.equals(funcReturnType)){
//						System.out.println("7");
						errors.add("line "+line+": return type of "+ funcName +" mismatch - need "+funcReturnType+", found "+varType);
						return false;
					}
				}
			}
		}
		if(var!=null)var.addLineUses(line);
		return true;
	}
	
	public boolean checkSetArcOperator(String id, String from, String to, String curBlock, int line){
		boolean result = true;
		String type = null;
//		System.out.println("id="+id);
//		System.out.println("from="+from);
//		System.out.println("to="+to);
//		System.out.println("curBlock="+curBlock);
//		System.out.println("line="+line);
		if(!isExistVariable(curBlock+"."+id)){
			errors.add("line "+line+": unknown variable "+id);
			result = false;
		}
		else{
			type = getVariable(curBlock+"."+id).getType();
			if(!type.equals("OArc")){
				errors.add("line "+line+": type of variable "+id+" must be OArc, but found "+type);
				result = false;
			}
			else{
				getVariable(curBlock+"."+id).addLineUses(line);
			}
		}
		
		if(!isExistVariable(curBlock+"."+from)){
			errors.add("line "+line+": unknown variable "+from);
			result = false;
		}
		else{
			type = getVariable(curBlock+"."+from).getType();
			if(!type.equals("Node")){
				errors.add("line "+line+": type of variable "+from+" must be Node, but found "+type);
				result = false;
			}
			else{
				getVariable(curBlock+"."+from).addLineUses(line);
			}
		}
		
		if(!isExistVariable(curBlock+"."+to)){
			errors.add("line "+line+": unknown variable "+to);
			result = false;
		}
		else{
			type = getVariable(curBlock+"."+to).getType();
			if(!type.equals("Node")){
				errors.add("line "+line+": type of variable "+to+" must be Node, but found "+type);
				result = false;
			}
			else{
				getVariable(curBlock+"."+to).addLineUses(line);
			}
		}
		return result;
	}
	
	public boolean checkSetGraphOperator(String varId, String curBlock,ArrayList<String> idList,ArrayList<String> firstIdList,ArrayList<String> secondIdList,int line){
		boolean result = true;
		if(!isExistVariable(curBlock+"."+varId)){
			errors.add("line "+line+": unknown variable "+varId);
			result = false;
		}
		else{
			String type = getVariable(curBlock+"."+varId).getType();
			if(!type.equals("Graph")){
				errors.add("line "+line+": type of variable "+varId+" must be Graph, but found "+type);
				result = false;
			}
		}
		if(firstIdList==null || secondIdList==null)
			return result;
		if(firstIdList.size()!=secondIdList.size()){
			errors.add("line "+line+": undefined error");
			result = false;
		}
		else{
			int size = firstIdList.size();
			String first=null;
			String second=null;
			for(int i=0;i<size;i++){
				first = firstIdList.get(i);
				second = secondIdList.get(i);
				if(!idList.contains(first)){
					errors.add("line "+line+": variable "+first+" must be define in SetGraphOperator's define block");
					result = false;
				}
				if(!idList.contains(second)){
					errors.add("line "+line+": variable "+second+" must be define in SetGraphOperator's define block");
					result = false;
				}
			}
		}
		return result;
	}
	
	public boolean checkCallClassMethod(String curBlock, String idName,String methodName, ArrayList<String> list, int line){
		if(list==null) list = new ArrayList<String>();
		//System.out.println("in chechCallClassMethod : need check "+methodName +" with types "+list.toString());
		boolean result = true;
		if(!isExistVariable(curBlock+"."+idName)){
			errors.add("line "+line+": unknown variable "+idName);
			return false;
		}
		//System.out.println(getVariable(curBlock+"."+idName).getType()+"."+methodName);
		MethodName method = getMethod(getVariable(curBlock+"."+idName).getType()+"."+methodName);
		if(method==null){
			errors.add("line "+line+": unknown method name "+methodName+" with arguments "+list.toString());
			result = false;
		}
		else{
			ArrayList<String> typeList =  method.getArgumentTypes();
			//System.out.println(typeList.toString()+" "+list.toString());
			if(!typeList.equals(list)){
				errors.add("line "+line+": incorrect argument types for class method "+methodName+" need " + typeList.toString() +" found "+ list.toString() );
				result = false;
			}
		}
		return  result;
	}
	
	
	public boolean checkCallFunction(String curBlock, String funcName, ArrayList<String> list, int line ){
		boolean result = true;
		if(list == null) list = new ArrayList<String>();
		if(!isExistFunction(funcName)){
			errors.add("line "+line+": unknown function "+funcName);
			return false;
		}
		FunctionName func = functionNames.get(funcName);
		if(!func.getArgumentTypes().equals(list)){
			errors.add("line "+line+": incorrect argument types for function "+funcName+" need " + func.getArgumentTypes().toString() +" found "+ list.toString() );
			result = false;
		}
		return result;
	}
	
	public boolean checkForeachControl(String fIdLiteral, String sIdLiteral, String foreachType, int line){
//		System.out.println(fIdLiteral);
//		System.out.println(sIdLiteral);
//		System.out.println(foreachType);
//		System.out.println(Integer.toString(line));
		boolean result = false;
		// проверка на существование переменных
		if(!isExistVariable(fIdLiteral)){
			errors.add("line "+line+": unknown variable "+fIdLiteral.substring(fIdLiteral.indexOf('.')));
			return false;
		}
		if(!isExistVariable(sIdLiteral)){
			errors.add("line "+line+": unknown variable "+sIdLiteral.substring(sIdLiteral.indexOf('.')));
			return false;
		}
		VariableName fVar = getVariable(fIdLiteral);
		VariableName sVar = getVariable(sIdLiteral);
		if(fVar.getType().equals("Node")){
			if(!sVar.getType().equals("Graph")){
				errors.add("line "+line+": foreach expression - second variable need type Graph, found "+sVar.getType());
				return false;
			}
		}
		if(fVar.getType().equals("OArc")){
			if(!sVar.getType().equals("Node")){
				errors.add("line "+line+": foreach expression - second variable need type Node, found "+sVar.getType());
				return false;
			}
			//!!!!!!!!!!!!!!!!!!!!!!!!!!
		}
		if(!fVar.getType().equals("Node") && !fVar.getType().equals("OArc")){
			errors.add("line "+line+": foreach expression - first variable need type Node or OArc, found "+fVar.getType());
			return false;
		}
		
		return true;
	}
	
	public void getAllErrors(ArrayList<String> list){
		while(!errors.isEmpty()){
			list.add(errors.pop());
		}
	}
	
	public static void main(String[] args) {
	}
	
	
	{
		FunctionName name = null;
		ArrayList<String> list = null;
		list = new ArrayList<String>(); list.add("String");
		name = new FunctionName("read", "void", list, null, 0);
		functionNames.put(name.idtf, name);
		name = new FunctionName("write", "void", list, null, 0);
		functionNames.put(name.idtf, name);
		list = new ArrayList<String>(); list.add("Graph");
		name = new FunctionName("printGraph", "void", list, null, 0);
		functionNames.put(name.idtf, name);
		list = new ArrayList<String>(); list.add("Node");
		name = new FunctionName("printNode", "void", list, null, 0);
		functionNames.put(name.idtf, name);
		list = new ArrayList<String>(); list.add("OArc");
		name = new FunctionName("printArc", "void", list, null, 0);
		functionNames.put(name.idtf, name);
	}
	{
		MethodName name=null;
		ArrayList<String> list = null;
		ArrayList<String> nullList = new ArrayList<String>();
		name = new MethodName("getFirst", "OArc", "Node", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("getSecond", "OArc", "Node", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("name", "Node", "String", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("name", "Graph", "String", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("name", "OArc", "String", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("nodeNumber", "Graph", "int", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("arcNumber", "Graph", "int", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("IOArcNumber", "Node", "int", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("IArcNumber", "Node", "int", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("OArcNumber", "Node", "int", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("toText", "int", "String", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("toText", "double", "String", nullList);
		methodNames.put(name.idtf, name);
		name = new MethodName("clearMarks", "Graph", "void", nullList);
		methodNames.put(name.idtf, name);
		list = new ArrayList<String>(); list.add("Node");
		name = new MethodName("markNode", "Node", "void", new ArrayList<String>());
		methodNames.put(name.idtf, name);
		list = new ArrayList<String>(); list.add("Node");
		name = new MethodName("unmarkNode", "Node", "void", new ArrayList<String>()); 
		methodNames.put(name.idtf, name);
		list = new ArrayList<String>(); list.add("String");
		name = new MethodName("getNode", "Graph", "Node", list);
		methodNames.put(name.idtf, name);
		list = new ArrayList<String>(); list.add("Node");
		name = new MethodName("containNode", "Graph", "bool", list);
		methodNames.put(name.idtf, name);
		list = new ArrayList<String>(); list.add("OArc");
		name = new MethodName("containArc", "Graph", "bool", list);
		methodNames.put(name.idtf, name);
		name = new MethodName("isMark", "Node", "bool", nullList);
		methodNames.put(name.idtf, name);
		//System.out.println(methodNames.toString());
	}

}
