grammar GraphLang;

options {
  language = Java;
  output=template;
}


@header {
  package graphlang;
  
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
	  :  s+=globalExpression* {$programm::curBlock = "main";} mainBlock ->MyMainBlock(globalExpression={$s}, mainBlock={$mainBlock.st})
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
	      '{' blockStatement*  returnOperator? '}'
	      {
	        boolean result = names.checkReturnType($ID.text, $functionDeclaration::returnVariable, $programm::curBlock, $functionDeclaration::isReturnUsed, $ID.line);
	        if(result==false){
	          errors.add(names.getLAstError());
	        }
	      }
	      ->MyFunctionDeclaration(returnType={$TYPE.text},name={$ID.text},argumentList={$functionDeclaration::functionArgumentDeclaratorList})
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
      {$functionDeclaration::functionArgumentDeclaratorList.add($TYPE.text+" "+$ID.text);}
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
    : '{' statement* '}'
    ;

statement
    :   'if' '(' logicalExpression ')' block ('else' block)? //->test()
    |   'for' '(' forControl ')' block ->MyForControl()
    |   'foreach' '(' foreachControl ')' block //->test()
    |   'while' '(' logicalExpression ')' block //->test()
    |   'do'  block 'while' '(' logicalExpression ')' ';' //->test() 
    |   assignmentOperation ';' ->{$assignmentOperation.st}
    |   setArcOperation ';' //-> test()
    |   setGraphOperation ';' //->test()
    |   callClassMethod ';' //->test()
    |   callInlineFunction ';' //->test()
    ;
    
foreachControl
    :   f=idLiteral ';' s=idLiteral (';' foreachType?)?
		    {
		        if(!names.checkForeachControl($programm::curBlock+"."+$f.text, $programm::curBlock+"."+$s.text,$foreachType.text, $s.curLine)){
		          names.getAllErrors(errors);
		        }
		    }
    ;

foreachType
    :  'output'
    |  'input'
    ;

forControl
    :   forInit? ';' forLiteral ';' forLiteral
    ;

    
forLiteral
    :   intLiteral 
    |   idLiteral {if(!$idLiteral.idType.equals("int")){errors.add("line "+$idLiteral.curLine+": for  variable must have type int ");}}
    |   callClassMethod {if(!$callClassMethod.methodType.equals("int")){errors.add("line "+$callClassMethod.curLine+": for variable must have type int ");}}
    |   callInlineFunction {if(!$callInlineFunction.functionType.equals("int")){errors.add("line "+$callInlineFunction.curLine+": for variable must have type int ");}}
    ;


forInit
    :   idLiteral
     {
        if(!$idLiteral.idType.equals("int")){
          errors.add("line "+$idLiteral.curLine+": for init variable must have type int ");
        }
     }
    ;

callInlineFunction returns [String functionType, int curLine]
    :  ID '(' argumentList? ')'
    {
          $functionType = "?";
          ArrayList list = null;
          $curLine = $ID.line;
          if($argumentList.argumentTypeList==null) list = new ArrayList<String>();
          else list =  $argumentList.argumentTypeList;
          if(!names.checkCallFunction($programm::curBlock, $ID.text, list, $ID.line)){
              names.getAllErrors(errors);
          }
          else{
              $functionType = names.getFunction($ID.text).getReturnType();
          }
    }
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
    ;

assignmentOperation
scope{
    String idType;
}
@init{
    $assignmentOperation::idType = "none";
}
    :  ID 
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
       ->test()
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
        ->MyVariableDeclarators(type={$variableDeclaration::varType},list={$variableDeclarators.tVariableList})
        //{$variableDeclaration.tVariableList = $variableDeclarators.tVariableList;}
        //{$variableDeclaration.tVariableType = $TYPE.text;}
        //{System.out.println($variableDeclarators.tVariableList);}
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
    :   ID //{System.out.println(currentBlock+" "+tmpType+ " " + $ID.text);}
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
      }
    ;

mathTerm returns [String mathTermType]
    :  literal {$mathTerm.mathTermType = $literal.literalType;}
    |  '(' mathExpression ')' {$mathTerm.mathTermType = $mathExpression.mathExpressionType;}
    ;

unaryExpression returns [String unaryExpressionType]
    :  '+' a=unaryExpression {$unaryExpression.unaryExpressionType = $a.unaryExpressionType;}
    |  '-' b=unaryExpression {$unaryExpression.unaryExpressionType = $b.unaryExpressionType;}
    |  mathTerm {$unaryExpression.unaryExpressionType = $mathTerm.mathTermType;}
    ;

multiplicativeExpression  returns [String multiplicativeExpressionType]
    : {ArrayList<String> type = new ArrayList<String>();} 
      a=unaryExpression {type.add($a.unaryExpressionType);} (('*'|'/') b=unaryExpression {type.add($b.unaryExpressionType);} )*
      {
          $multiplicativeExpressionType = typeCheker.checkMathExpressionTypes(type);
      }
       
    ;

mathExpression returns [String mathExpressionType]
    :   {ArrayList<String> type = new ArrayList<String>();} 
        a=multiplicativeExpression {type.add($a.multiplicativeExpressionType);}  (('-'|'+') b=multiplicativeExpression  {type.add($b.multiplicativeExpressionType);}  )*
        {
          $mathExpressionType = typeCheker.checkMathExpressionTypes(type);
        }
    ;

logicalExpression
	  :  relationExpression (('&&'|'||') relationExpression)*
	  ;


relationExpression
    :  ('(' logicalExpression ')'
    |  t1=logicalAtom  RELATIONALOP t2=logicalAtom
       {
          if(!$t1.atomType.equals($t2.atomType)){
            if($t1.atomType.equals("null")){
              if(!$t2.atomType.equals("OArc") && !$t2.atomType.equals("Graph") && !$t2.atomType.equals("Node") && !$t2.atomType.equals("Text")){
                  errors.add("line "+$RELATIONALOP.line+": the operator "+$RELATIONALOP.text +" is undefined for arguments null,"+$t2.atomType);
              }
            }
            else if($t2.atomType.equals("null")){
              if(!$t1.atomType.equals("OArc") && !$t1.atomType.equals("Graph") && !$t1.atomType.equals("Node") && !$t1.atomType.equals("Text")){
                  errors.add("line "+$RELATIONALOP.line+": the operator "+$RELATIONALOP.text +" is undefined for arguments null,"+$t2.atomType);
              }
            }
            else {
              errors.add("line "+$RELATIONALOP.line+": the operator "+$RELATIONALOP.text +" is undefined for arguments "+$t1.atomType+","+$t2.atomType);
            }
            
          }
       }
    )
    ;

logicalAtom returns [String atomType]
    :   intLiteral {$atomType = "int"; }
    |   floatLiteral {$atomType = "float"; }
    |   idLiteral {$atomType = $idLiteral.idType;}
    |   stringLiteral {$atomType = "Text"; }
    |   booleanLiteral {$atomType = "bool"; }
    |   callClassMethod {$atomType = $callClassMethod.methodType;}
    |   callInlineFunction {$atomType = $callInlineFunction.functionType;}
    |   nullLiteral {$atomType = "null";}
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
	  | 'float' //->type_int()
	  | 'OArc' //->type_int()
	  | 'Graph'// ->type_int()
	  | 'Text' //->type_int()
	  | 'Node' // ->type_int()
	  | 'void' //->type_int()
	  | 'bool' //->type_int()
	  ;

literal returns [String literalType, String literalValue]
    :   intLiteral {$literalType = "int"; $literalValue=$intLiteral.text;}
    |   floatLiteral {$literalType = "float"; $literalValue=$floatLiteral.text;}
    |   idLiteral {$literalType = $idLiteral.idType; $literalValue=$idLiteral.text;}
    |   stringLiteral {$literalType = "Text"; $literalValue=$stringLiteral.text;}
    |   booleanLiteral {$literalType = "bool"; $literalValue=$booleanLiteral.text; }
    |   callClassMethod {$literalType = $callClassMethod.methodType;}
    |   callInlineFunction {$literalType = $callInlineFunction.functionType;}
    ;

argumentList returns[ArrayList<String> argumentTypeList]
  :  {
        $argumentTypeList = new ArrayList<String>();
     }  
  a=literal {$argumentTypeList.add($a.literalType);}  
  (',' b=literal {$argumentTypeList.add($b.literalType);} )*
  ;

floatLiteral
  : FLOAT 
  ;

idLiteral returns [String idType, int curLine]
  : ID  
    {
      $curLine = $ID.line;
      if(!names.isExistVariable($programm::curBlock+"."+$ID.text)){
        errors.add("line "+$ID.line+": unknown variable "+$ID.text);
        $idType = "";
      }
      else{
        names.getVariable($programm::curBlock+"."+$ID.text).addLineUses($ID.line);
        $idType = names.getVariable($programm::curBlock+"."+$ID.text).getType();
      }
    }
  ;

intLiteral
  : INT 
  ;

stringLiteral
  :  STRING 
  ;

booleanLiteral
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
