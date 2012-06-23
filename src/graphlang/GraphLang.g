grammar GraphLang;

options {
  language = Java;
  output=template;
  //backtrack=true;
}


@header {

package graphlang;
  import java.util.Random;
  
  
}

@lexer::header {
  package graphlang;
}

@members {
  // list of programs variable
  protected NamesTable names = new NamesTable();
  protected ArrayList<String> errors = new ArrayList<String>();
  protected ExpressionTypeChecker typeCheker = new ExpressionTypeChecker();
  ArrayList<String> tmpVarNamesList = new ArrayList<String>(); 
  Random __generator = new Random();
  private int index = 1;
  private int errorLine;
  
  public String getErrorHeader(RecognitionException e) {
        errorLine = e.line;
        return "";
  }
  
  
  public void emitErrorMessage(String message) {
        //ErrorsTable.getInstance().addError(message, errorLine);
        if(message.contains("EOF")){
            message=" rubbish at the end of file. I did not fall:-D";
        }
        errors.add("line "+errorLine+":"+message);
    }
  
}



programm  
scope{
  String curBlock;
  ArrayList<String> tGlobalVariables;
}
@init{
  $programm::curBlock = "";
  $programm::tGlobalVariables = new ArrayList<String>();
}
	  :  s+=globalExpression*  {$programm::curBlock = "main";} mainBlock  EOF ->MyMainBlock(globalExpression={$s}, mainBlock={$mainBlock.st}) 
	  ;

globalExpression
	  :  globalVariableDeclaration  ->MyGlobalVariableDeclaration(list={$globalVariableDeclaration.st}) //-> {$globalVariableDeclaration.st;}//{$st = %MyGlobalVariable(type={$globalVariableDeclaration.tVariableType},list={$globalVariableDeclaration.tVariableList});}
	  |  functionDeclaration -> {$functionDeclaration.st;}
	  ;

globalVariableDeclaration returns [String tVariableType,ArrayList<String> tVariableList]
	  :  {$programm::curBlock = "global";}
	     variableDeclarationStatement ';' ->{$variableDeclarationStatement.st;} //->print(value={$variableDeclarationStatement.st})
	  ;

functionDeclaration
scope{
  String funcType;
  String funcName;
  ArrayList<String> funcArgTypes;
  ArrayList<String> funcArgNames;
  ArrayList<String> functionArgumentDeclaratorList;
  String returnVariable;
  boolean isReturnUsed;
}
@init{
  $functionDeclaration::funcType = "";
  $functionDeclaration::funcName = "";
  $functionDeclaration::funcArgTypes = new ArrayList<String>();
  $functionDeclaration::funcArgNames = new ArrayList<String>();
  $functionDeclaration::functionArgumentDeclaratorList = new ArrayList<String>();
  $functionDeclaration::isReturnUsed = false;
  $functionDeclaration::returnVariable="";
}
	  :   
	      TYPE{$functionDeclaration::funcType = $TYPE.text; } 
	      ID  {$programm::curBlock = $ID.text;} 
	      '(' functionArgumentList? ')'
	          {
	            //add functon in namestable if it's not exists
	            if(!names.isExistFunction($ID.text)){
	              names.addFunction(names.new FunctionName($ID.text, $TYPE.text ,  $functionDeclaration::funcArgTypes,  $functionDeclaration::funcArgNames, $ID.line));
	            }
	            else{
	              errors.add("line "+$ID.line+": duplicated function declaration "+$ID.text);
	            }
	          }  
	       
	      '{' st+=blockStatement*  returnOperator? '}'  
	      {
	        boolean result = names.checkReturnType($ID.text, $functionDeclaration::returnVariable, $programm::curBlock, $functionDeclaration::isReturnUsed, $ID.line);
	        if(result==false){
	          errors.add(names.getLAstError());
	        }
	      }
	      {
	       if($functionDeclaration::returnVariable==null)$functionDeclaration::returnVariable="";
	       else{$functionDeclaration::returnVariable="___"+$functionDeclaration::returnVariable;}
	      }
	      {$functionDeclaration::returnVariable = "return "+$functionDeclaration::returnVariable+";";}
	      {if($functionDeclaration::funcType.equals("Text")) $functionDeclaration::funcType="String";}
	      {if($functionDeclaration::funcType.equals("float")) $functionDeclaration::funcType="double";}
	      
	      ->MyFunctionDeclaration(returnType={$TYPE.text},name={$ID.text},argumentList={$functionDeclaration::functionArgumentDeclaratorList}, statements={$st}, retSt={$functionDeclaration::returnVariable})
	  ;

returnOperator 
    :     'return' ID? ';'
          {
              $functionDeclaration::isReturnUsed = true;
              $functionDeclaration::returnVariable=$ID.text;
          }
    ;

functionArgumentList
    :  functionArgumentDeclarator (',' functionArgumentDeclarator)*
    ;

functionArgumentDeclarator
    :  TYPE ID 
      { String type=$TYPE.text; 
      if($TYPE.text.equals("Text")) type="String";
      if($TYPE.text.equals("float")) type="double";
      
      $functionDeclaration::functionArgumentDeclaratorList.add(type+" ___"+$ID.text);
      
      }
    //{System.out.println(currentBlock+" "+currentFuncName+" "+$TYPE.text+" "+$ID.text);}
    {
      // add variable and it's type in lists funcArgTypes and funcArgNames
      $functionDeclaration::funcArgTypes.add($TYPE.text);
      $functionDeclaration::funcArgNames.add($ID.text);
      if(!names.isDeclaredVariable($programm::curBlock+"."+$ID.text)){
          names.addVariable(names.new VariableName($programm::curBlock+"."+$ID.text, $TYPE.text, $ID.line));
      }
      else{
          errors.add("line "+$ID.line+": duplicated variable name "+$ID.text);
      }
    }
    ;

mainBlock
	  : 'main' '{' s+=blockStatement* '}'  -> print(value = {$s})
	  ;

blockStatement
    :   variableDeclarationStatement ';' -> {$variableDeclarationStatement.st}
    |   statement -> {$statement.st}
    ;
    
    
block
    : '{' s+=statement* '}' ->print(value={$s})
    ;

statement
    :   'if' '(' logicalExpression ')' a=block ('else' b=block)? ->MyIfStatement(logicalExpr={$logicalExpression.st},blockIf={$a.st},blockElse={$b.st})
    |   'for' '(' forControl ')' a=block ->MyForControl(expr={$forControl.st},block={$a.st})
    |   'foreach' '(' foreachControl ')' block ->MyForeachStatment(expr={$foreachControl.st},block={$block.st})
    |   'while' '(' logicalExpression ')' block ->MyWhileStatement(logicalExpr={$logicalExpression.st},block={$block.st})
    |   'do'  block 'while' '(' logicalExpression ')' ';' ->MyDoWhileStatement(logicalExpr={$logicalExpression.st},block={$block.st})
    |   assignmentOperation ';' ->{$assignmentOperation.st}
    |   setArcOperation ';' ->print(value={$setArcOperation.st+";\n"})
    |   setGraphOperation ';' ->print(value={$setGraphOperation.st+";\n"})
    |   callClassMethod ';' ->print(value={$callClassMethod.st+";\n"})
    |   callInlineFunction ';' ->print(value={$callInlineFunction.st+";\n"})
    ;
    
foreachControl
    :   
        {String tmp="";}
        f=idLiteral ';' s=idLiteral (';' foreachType? {tmp=$foreachType.text;})?
		    {
		        if(!names.checkForeachControl($programm::curBlock+"."+$f.text, $programm::curBlock+"."+$s.text,$foreachType.text, $s.curLine)){
		          names.getAllErrors(errors);
		        }
		    }
		    {
		      String itType="";
		      if(tmp==null) tmp="all";
		      String iterator="";
		      String type=$s.idType;
		      if(type.equals("Node")){
		        itType="graphlib.NodeIterator";
		        if(tmp.equals("output")){
		          iterator="OIterator";
		        }
		        else if(tmp.equals("input")){
		          iterator="IIterator";
		        }
		        else if(tmp.equals("all")){
		          iterator="IOIterator";
		        }
		        else errors.add("line "+$f.curLine+": undefined foreach type ");
		      }
		      
		      else if(type.equals("Graph")){
		        itType="GraphIterator";
            iterator="vertexIterator";
		      }
		      else {errors.add("line "+$f.curLine+": undefined foreachType type for variable");}
		    } ->MyCreateIteratorStatement(itType={itType},var={$f.st},itVar={$s.st},iterator={iterator},randNumber={Integer.toString(index++)})
    ;

foreachType
    :  'output'
    |  'input'
    |  'all'
    ;

forControl
    :   forInit ';' a=forLiteral ';' b=forLiteral
      ->MyForStatement(var={$forInit.st},begin={$a.st},end={$b.st})
    ;

    
forLiteral
    :   intLiteral ->{$intLiteral.st} 
    |   idLiteral {if(!$idLiteral.idType.equals("int")){errors.add("line "+$idLiteral.curLine+": for  variable must have type int ");}} ->{$idLiteral.st}
    |   callClassMethod {if(!$callClassMethod.methodType.equals("int")){errors.add("line "+$callClassMethod.curLine+": for variable must have type int ");}} ->{$callClassMethod.st}
    |   callInlineFunction {if(!$callInlineFunction.functionType.equals("int")){errors.add("line "+$callInlineFunction.curLine+": for variable must have type int ");}} ->{$callInlineFunction.st}
    ;


forInit
    :   idLiteral 
     {
        if(!$idLiteral.idType.equals("int")){
          errors.add("line "+$idLiteral.curLine+": for init variable must have type int ");
        }
     } ->print(value={$idLiteral.st})
    ;

callInlineFunction returns [String functionType, int curLine]
    :  ID '(' argumentList? ')'
    {
          String funcName=$ID.text;
          String tmp="";
         
          
          $functionType = "?";
          ArrayList list = null;
          $curLine = $ID.line;
          if($argumentList.argumentTypeList==null) list = new ArrayList<String>();
          else list =  $argumentList.argumentTypeList;
          
          if($ID.text.equals("write")){
            list.clear();
            list.add("String");
          } 
          
          if(!names.checkCallFunction($programm::curBlock, $ID.text, list, $ID.line)){
              names.getAllErrors(errors);
          }
          else{
              $functionType = names.getFunction($ID.text).getReturnType();
          }
          
                
          
          if($argumentList.st!=null)
            tmp+=$argumentList.st;
            
          if(funcName.equals("write")){
            funcName="System.out.println";
          }
          if(funcName.equals("read")){
            funcName=tmp+"=__in.nextLine";
            tmp="";
          }
          if(funcName.equals("printNode")||funcName.equals("printArc")||funcName.equals("printGraph")){
            funcName="System.out.println";
          }  
            
            
    }
    ->print(value={funcName+"("+tmp+")"})
    ;



callClassMethod returns[String methodType, int curLine]
scope{
  String variableId;
  String methodName;
  //ArrayList<String> argumentTypeList;
}
@init{
  $callClassMethod::variableId="";
  $callClassMethod::methodName="";
  //$callClassMethod::argumentTypeList= new ArrayList<String>();
}
    :   varId=ID '.' {$callClassMethod::variableId=$varId.text; } 
        mName=ID   {$callClassMethod::methodName=$mName.text;}
        {String tmp="";}
        '(' argumentList? ')' //{System.out.println($argumentList.argumentTypeList);} //add check type in class method
        {
          $methodType="?";
          $curLine = $varId.line;
          ArrayList list = null;
          if($argumentList.argumentTypeList==null) list = new ArrayList<String>();
          else list =  $argumentList.argumentTypeList;
          
          if(!names.checkCallClassMethod($programm::curBlock, $varId.text, $mName.text, $argumentList.argumentTypeList, $varId.line)){
              names.getAllErrors(errors);
          }
          if(names.isExistMethod($programm::curBlock, $varId.text, $mName.text)){
            $methodType = names.getMethod($programm::curBlock, $varId.text, $mName.text).getReturnType();
          }
        }
        
        {
          if($argumentList.text!=null)
            tmp+=$argumentList.st;
        }
        ->print(value={"___"+$varId.text+"."+$mName.text+"("+tmp+")"})
    ;

assignmentOperation
scope{
    String idType;
}
@init{
    $assignmentOperation::idType = "none";
}
    :  ID 
       {String id="";
        String operator="";
        StringTemplate mathExpr;
        String idType="none";
        String exprType="";
        String additionExpr="";
       }
       {
          if(names.isExistVariable($programm::curBlock+"."+$ID.text)){
            $assignmentOperation::idType = names.getVariable($programm::curBlock+"."+$ID.text).getType();
          }
          else{
            errors.add("line "+$ID.line+": unknown variable "+$ID.text);
          }
       } 
       
       assignmentOperator 
       mathExpression
       {
          if(!typeCheker.checkAssignOperation($assignmentOperator.text,  $assignmentOperation::idType, $mathExpression.mathExpressionType, $ID.line)){
              typeCheker.getAllErrors(errors);
          }
       }
       {
        id=$ID.text;
        operator=$assignmentOperator.text;
        mathExpr=$mathExpression.st;
        exprType= $mathExpression.mathExpressionType;
        idType=$assignmentOperation::idType;
        if(operator.equals("+=")){
            if(idType.equals("Graph"))
              if(exprType.equals("Node")){
                operator=".addNode(";
                additionExpr=")";
              }
              if(exprType.equals("Graph")){
                operator=".addGraph(";
                additionExpr=")";
              }
              if(exprType.equals("OArc")){
                operator=".addArc(";
                additionExpr=")";
              }
        }
        
        if(operator.equals("-=")){
            if(idType.equals("Graph"))
              if(exprType.equals("Node")){
                operator=".removeNode(";
                additionExpr=")";
              }
              if(exprType.equals("Graph")){
                operator=".removeGraph(";
                additionExpr=")";
              }
              if(exprType.equals("OArc")){
                operator=".removeArc(";
                additionExpr=")";
              }
        }
        
        if(operator.equals("=")){
            if(idType.equals("Graph"))
              if(exprType.equals("String")){
                operator=".setName(";
                additionExpr=")";
              }
            if(idType.equals("Node"))
              if(exprType.equals("String")){
                operator=".setName(";
                additionExpr=")";
              }
            if(idType.equals("OArc"))
              if(exprType.equals("String")){
                operator=".setName(";
                additionExpr=")";
              }
        }
        
        
       }
       ->MyAssignmentOperation(id={id},operator={operator}, mathExpr={mathExpr},additionExpr={additionExpr})
    ;

setGraphOperation
scope{
  ArrayList<String> varList;
  ArrayList<String> firstIdList;
  ArrayList<String> secondIdList;
}
@init{
  $setGraphOperation::varList = new ArrayList<String>();
  $setGraphOperation::firstIdList = new ArrayList<String>();
  $setGraphOperation::secondIdList = new ArrayList<String>();
}
    :  ID '=' '('  '{' variableList '}' ',' '{' setArcExpressions? '}'  ')'
        {
            names.checkSetGraphOperator($ID.text,$programm::curBlock,$setGraphOperation::varList,$setGraphOperation::firstIdList,$setGraphOperation::secondIdList,$ID.line);
            names.getAllErrors(errors);
        }
        
        ->MySetGraphOperation(idGraph={$ID.text},var={$setGraphOperation::varList},fV={$setGraphOperation::firstIdList},sV={$setGraphOperation::secondIdList})
    ;

variableList
    :  a=ID { $setGraphOperation::varList.add($a.text);} (',' b=ID  { $setGraphOperation::varList.add($b.text);}  )*
    ;


setArcExpressions
    :  f=ID '->' s=ID 
          {
            $setGraphOperation::firstIdList.add($f.text);
            $setGraphOperation::secondIdList.add($s.text);
          }
       (',' a=ID '->' b=ID {$setGraphOperation::firstIdList.add($a.text); $setGraphOperation::secondIdList.add($b.text); })* 
    ;



variableDeclarationStatement returns [String tVariableType,ArrayList<String> tVariableList]
	  : variableDeclaration -> {$variableDeclaration.st}//{System.out.println($variableDeclaration.tVariableList);}
	    //{$variableDeclarationStatement.tVariableList = $variableDeclaration.tVariableList;}
      //{$variableDeclarationStatement.tVariableType = $variableDeclaration.tVariableType;}
	  ;

variableDeclaration returns [String tVariableType,ArrayList<String> tVariableList]
scope{
  String varType;
}
@init{
  $variableDeclaration::varType = "";
}
    :   TYPE {$variableDeclaration::varType = $TYPE.text;} variableDeclarators
        {if($TYPE.text.equals("Text")) $variableDeclaration::varType = "String";}
        {if($TYPE.text.equals("bool")) $variableDeclaration::varType = "boolean";}
        {
          String additionPart="";
          if($TYPE.text.equals("String")) additionPart="=\"\"";
          if($TYPE.text.equals("Node")) additionPart="=new Node()";
          if($TYPE.text.equals("OArc")) additionPart="=new OArc()";
          if($TYPE.text.equals("Graph")) additionPart="=new Graph()";
          if($TYPE.text.equals("int")) additionPart="=0";
          if($TYPE.text.equals("double")) {additionPart="=0"; $variableDeclaration::varType = "double";}
        }
        ->MyVariableDeclarators(type={$variableDeclaration::varType},list={$variableDeclarators.tVariableList},additionPart={additionPart})

    ;

variableDeclarators returns[ArrayList<String> tVariableList]
    :   
      {$variableDeclarators.tVariableList = new ArrayList<String>();}
      a=variableDeclarator {$variableDeclarators.tVariableList.add($a.tVariableId);}
      (',' b=variableDeclarator  {$variableDeclarators.tVariableList.add($b.tVariableId);} )*
    ;

variableDeclarator returns[String tVariableId]
scope{
  ArrayList<String> varList;
}
@init{
  $variableDeclarator::varList = new ArrayList<String>();
}
    :   ID 
    {
        if(!names.isDeclaredVariable($programm::curBlock+"."+$ID.text) ){
          names.addVariable(names.new VariableName($programm::curBlock+"."+$ID.text, $variableDeclaration::varType, $ID.line));
          $variableDeclarator::varList.add($programm::curBlock+"."+$ID.text);
	      }
	      else{
	          errors.add("line "+$ID.line+": duplicated variable name "+$ID.text);
	      }
	      $variableDeclarator.tVariableId = $ID.text;
    }
    ;

setArcOperation
    :  id=ID '=' '(' from=ID '->' to=ID')' 
      {
        boolean result = names.checkSetArcOperator($id.text, $from.text, $to.text, $programm::curBlock, $id.line);
        if(result==false){
          names.getAllErrors(errors);
        }
      } ->print(value={"___"+$id.text+".setVertex"+"("+"___"+$from.text+","+"___"+$to.text+")"})
    ;

mathTerm returns [String mathTermType]
    :  literal {$mathTerm.mathTermType = $literal.literalType;} ->print(value={$literal.st})
    |  '(' mathExpression ')' {$mathTerm.mathTermType = $mathExpression.mathExpressionType;} ->print(value={"("+$mathExpression.st+")"})
    ;

unaryExpression returns [String unaryExpressionType]
    :  '+' a=unaryExpression {$unaryExpression.unaryExpressionType = $a.unaryExpressionType;} ->print(value={"+"+$a.st})
    |  '-' b=unaryExpression {$unaryExpression.unaryExpressionType = $b.unaryExpressionType;} ->print(value={"-"+$b.st})
    |  mathTerm {$unaryExpression.unaryExpressionType = $mathTerm.mathTermType;} ->{$mathTerm.st}
    ;



multiplicativeExpression  returns [String multiplicativeExpressionType, String textValue]
    : {ArrayList<String> type = new ArrayList<String>();} 
    {String tmp="";}
      a=unaryExpression {type.add($a.unaryExpressionType);} ((c='*'|c='/') b=unaryExpression {tmp+=$c.text; tmp+=$b.st; type.add($b.unaryExpressionType);} )*
      {
          $multiplicativeExpressionType = typeCheker.checkMathExpressionTypes(type);
      }
      {
        

      }
      ->print(value={$a.st+tmp}) 
    ;

mathExpression returns [String mathExpressionType]
    :   {ArrayList<String> type = new ArrayList<String>();} 
        {String tmp=""; }
        {String tmp2="";}
        a=multiplicativeExpression {type.add($a.multiplicativeExpressionType);}  ((c='-'|c='+') b=multiplicativeExpression   {tmp+=$c.text; tmp+=$b.st; type.add($b.multiplicativeExpressionType);})*
        {
          $mathExpressionType = typeCheker.checkMathExpressionTypes(type);
        }

        ->print(value={$a.st +tmp})
        
        
    ;

logicalExpression
	  : {String tmp="";} 
	    a=relationExpression ((c='&&'|c='||') b=relationExpression {tmp+=$c.text; tmp+=$b.st;})* 
	    ->print(value={$a.st+tmp})
	  ;


relationExpression
    :  ('(' logicalExpression ')' ->print(value={"("+$logicalExpression.st+")"})
    |  t1=logicalAtom  RELATIONALOP t2=logicalAtom
       {
          if(!$t1.atomType.equals($t2.atomType)){
            if($t1.atomType.equals("null")){
              if(!$t2.atomType.equals("OArc") && !$t2.atomType.equals("Graph") && !$t2.atomType.equals("Node") && !$t2.atomType.equals("String")){
                  errors.add("line "+$RELATIONALOP.line+": the operator "+$RELATIONALOP.text +" is undefined for arguments null,"+$t2.atomType);
              }
            }
            else if($t2.atomType.equals("null")){
              if(!$t1.atomType.equals("OArc") && !$t1.atomType.equals("Graph") && !$t1.atomType.equals("Node") && !$t1.atomType.equals("String")){
                  errors.add("line "+$RELATIONALOP.line+": the operator "+$RELATIONALOP.text +" is undefined for arguments null,"+$t2.atomType);
              }
            }
            else {
              errors.add("line "+$RELATIONALOP.line+": the operator "+$RELATIONALOP.text +" is undefined for arguments "+$t1.atomType+","+$t2.atomType);
            }
            
          }
       } ->print(value={$t1.st+$RELATIONALOP.text+$t2.st})
    )
    
    ;

logicalAtom returns [String atomType]
    :   intLiteral {$atomType = "int"; } ->{$intLiteral.st}
    |   floatLiteral {$atomType = "double"; } ->{$floatLiteral.st}
    |   idLiteral {$atomType = $idLiteral.idType;} ->{$idLiteral.st}
    |   stringLiteral {$atomType = "String"; } ->{$stringLiteral.st}
    |   BOOLEANLITERAL {$atomType = "bool"; } ->print(value={$BOOLEANLITERAL.text})
    |   callClassMethod {$atomType = $callClassMethod.methodType;} ->{$callClassMethod.st;}
    |   callInlineFunction {$atomType = $callInlineFunction.functionType;} ->{$callInlineFunction.st;}
    |   nullLiteral {$atomType = "null";} ->print(value={"null"})
    //|   '(' c=logicalAtom ')' {$atomType = $c.atomType;}
    ;

nullLiteral
    : 'null'
    ;

RELATIONALOP
	  :  '>'
	  |  '<' 
	  |  '<='
	  |  '>='
	  |  '!='
	  |  '=='
	  ;

assignmentOperator
    :   '='
    |   '+='
    |   '-='
    |   '*='
    |   '/='
    |   '%='
    ;

TYPE  
	  : 'int' //->test()
	  | 'double' //->type_int()
	  | 'OArc' //->type_int()
	  | 'Graph'// ->type_int()
	  | 'String' //->type_int()
	  | 'Node' // ->type_int()
	  | 'void' //->type_int()
	  | 'bool' //->type_int()
	  ;

literal returns [String literalType, String literalValue]
    :   intLiteral {$literalType = "int"; $literalValue=$intLiteral.text;} ->{$intLiteral.st;}
    |   floatLiteral {$literalType = "double"; $literalValue=$floatLiteral.text;} ->{$floatLiteral.st;}
    |   idLiteral {$literalType = $idLiteral.idType; $literalValue=$idLiteral.text;} ->{$idLiteral.st;}
    |   stringLiteral {$literalType = "String"; $literalValue=$stringLiteral.text;} ->{$stringLiteral.st;}
    |   BOOLEANLITERAL {$literalType = "bool"; $literalValue=$BOOLEANLITERAL.text; } ->print(value={$BOOLEANLITERAL.text})
    |   callClassMethod {$literalType = $callClassMethod.methodType;  $literalValue="callClassMethod\n"; } ->{$callClassMethod.st;}
    |   callInlineFunction {$literalType = $callInlineFunction.functionType; $literalValue="callInlineFunction\n";} ->{$callInlineFunction.st;}
    ;

argumentList returns[ArrayList<String> argumentTypeList]
  :  {
        $argumentTypeList = new ArrayList<String>();
        String tmp="";
     }  
  a=literal {$argumentTypeList.add($a.literalType);}  
  (',' b=literal {$argumentTypeList.add($b.literalType); tmp+=","; tmp+=$b.st;} )*
    ->print(value={$a.st+tmp})
  ;

floatLiteral
  : FLOAT ->print(value={$FLOAT.text})
  ;

idLiteral returns [String idType, int curLine]
  : ID  
    {
      $curLine = $ID.line;
      //System.out.println($programm::curBlock+"."+$ID.text);
      if(!names.isExistVariable($programm::curBlock+"."+$ID.text)){
        errors.add("line "+$ID.line+": unknown variable "+$ID.text);
        $idType = "";
      }
      else{
        //names.getVariable($programm::curBlock+"."+$ID.text).addLineUses($ID.line);
        if(names.getVariable($programm::curBlock+"."+$ID.text)!=null) $idType = names.getVariable($programm::curBlock+"."+$ID.text).getType();
      }
    }
    ->print(value={"___"+$ID.text})
  ;

intLiteral
  : INT ->print(value={$INT.text})
  ;

stringLiteral
  :  STRING ->print(value={$STRING.text})
  ;
    

BOOLEANLITERAL
    :   'true' 
    |   'false'
    ;

ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT : '0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* 
    |   '.' ('0'..'9')+
    |   ('0'..'9')+ 
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;




STRING
    :  '"' (~('\\'|'"') )* '"'
    ;
