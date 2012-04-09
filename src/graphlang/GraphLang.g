grammar GraphLang;

options {
  language = Java;
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
}
@init{
  $programm::curBlock = "";
}
	  : globalExpression* {$programm::curBlock = "main";} mainBlock 
	  ;


globalExpression
	  :  globalVariableDeclaration
	  |  functionDeclaration
	  ;

globalVariableDeclaration
	  :  {$programm::curBlock = "global";}
	     variableDeclarationStatement ';'
	  ;

functionDeclaration
scope{
  String funcType;
  String funcName;
  ArrayList<String> funcArgTypes;
  ArrayList<String> funcArgNames;
  String returnVariable;
  boolean isReturnUsed;
}
@init{
  $functionDeclaration::funcType = "";
  $functionDeclaration::funcName = "";
  $functionDeclaration::funcArgTypes = new ArrayList<String>();
  $functionDeclaration::funcArgNames = new ArrayList<String>();
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
    :  TYPE ID //{System.out.println(currentBlock+" "+currentFuncName+" "+$TYPE.text+" "+$ID.text);}
    {
      // add variable and it's type in lists funcArgTypes and funcArgNames
      $functionDeclaration::funcArgTypes.add($TYPE.text);
      $functionDeclaration::funcArgNames.add($ID.text);
      if(!names.isExistVariable($programm::curBlock+"."+$ID.text)){
          names.addVariable(names.new VariableName($programm::curBlock+"."+$ID.text, $TYPE.text, $ID.line));
      }
      else{
          errors.add("line "+$ID.line+": duplicated variable name "+$ID.text);
      }
    }
    ;

mainBlock
	  : 'main' '{' blockStatement* '}'
	  ;

blockStatement
    :   variableDeclarationStatement ';'
    |   statement
    ;
    
    
block
    : '{' statement* '}'
    ;

statement
    :   'if' '(' logicalExpression ')' block ('else' block)?
    |   'for' '(' forControl ')' block
    |   'foreach' '(' foreachControl ')' block
    |   'while' '(' logicalExpression ')' block
    |   'do'  block 'while' '(' logicalExpression ')' ';' 
    |   assignmentOperation ';'
    |   setArcOperation ';'
    |   setGraphOperation ';'
    |   callClassMethod ';'
    |   callInlineFunction ';'
    ;
    
foreachControl
    :   idLiteral ';' idLiteral (';' foreachType?)?
    ;

foreachType
    :  'output'
    |  'input'
    ;

forControl
    :   forInit ';' forBegin ';' forEnd
    ;

forBegin
    :   intLiteral
    |   idLiteral
    ;
    
forEnd
    :   intLiteral
    |   idLiteral
    |   callClassMethod
    |   callInlineFunction
    ;

forInit
    :   intLiteral
    |   idLiteral
    ;

callInlineFunction returns [String functionType]
    :  ID '(' argumentList? ')'
    {
          functionType = "?";
          ArrayList list = null;
          if($argumentList.argumentTypeList==null) list = new ArrayList<String>();
          else list =  $argumentList.argumentTypeList;
          if(!names.checkCallFunction($programm::curBlock, $ID.text, list, $ID.line)){
              names.getAllErrors(errors);
          }
          else{
              functionType = names.getFunction($ID.text).getReturnType();
          }
    }
    ;



callClassMethod returns[String methodType]
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
    :   varId=ID '.' {$callClassMethod::variableId=$varId.text;} 
        mName=ID   {$callClassMethod::methodName=$mName.text;}
        '(' argumentList? ')' //{System.out.println($argumentList.argumentTypeList);} //add check type in class method
        {
          methodType="?";
          ArrayList list = null;
          if($argumentList.argumentTypeList==null) list = new ArrayList<String>();
          else list =  $argumentList.argumentTypeList;
          if(!names.checkCallClassMethod($programm::curBlock, $varId.text, $mName.text, $argumentList.argumentTypeList, $varId.line)){
              names.getAllErrors(errors);
          }
          if(names.isExistMethod($programm::curBlock, $varId.text, $mName.text)){
            methodType = names.getMethod($programm::curBlock, $varId.text, $mName.text).getReturnType();
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
       } 
       assignmentOperator 
       mathExpression
       {
          if(!typeCheker.checkAssignOperation($assignmentOperator.text,  $assignmentOperation::idType, $mathExpression.mathExpressionType, $ID.line)){
              typeCheker.getAllErrors(errors);
          }
       }
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

expression
	  :  
	  ;

variableDeclarationStatement
	  : variableDeclaration
	  ;

variableDeclaration
scope{
  String varType;
}
@init{
  $variableDeclaration::varType = "";
}
    :   TYPE {$variableDeclaration::varType = $TYPE.text;} variableDeclarators
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
scope{
  ArrayList<String> varList;
}
@init{
  $variableDeclarator::varList = new ArrayList<String>();
}
    :   ID //{System.out.println(currentBlock+" "+tmpType+ " " + $ID.text);}
    {
        if(!names.isExistVariable($programm::curBlock+"."+$ID.text) ){
          names.addVariable(names.new VariableName($programm::curBlock+"."+$ID.text, $variableDeclaration::varType, $ID.line));
          $variableDeclarator::varList.add($programm::curBlock+"."+$ID.text);
	      }
	      else{
	          errors.add("line "+$ID.line+": duplicated variable name "+$ID.text);
	      }
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
          multiplicativeExpressionType = typeCheker.checkMathExpressionTypes(type);
      }
       
    ;

mathExpression returns [String mathExpressionType]
    :   {ArrayList<String> type = new ArrayList<String>();} 
        a=multiplicativeExpression {type.add($a.multiplicativeExpressionType);}  (('-'|'+') b=multiplicativeExpression  {type.add($b.multiplicativeExpressionType);}  )*
        {
          mathExpressionType = typeCheker.checkMathExpressionTypes(type);
        }
    ;

logicalExpression
	  :  relationExpression (('&&'|'||') relationExpression)*
	  ;

relationExpression
    :  '(' logicalExpression ')'
    |  logicalAtom  relationalOp logicalAtom
    ;

logicalAtom returns [String atomType]
    : intLiteral {$atomType = "Int"; }
    |   floatLiteral {$atomType = "Float"; }
    |   idLiteral {$atomType = $idLiteral.idType;}
    |   stringLiteral {$atomType = "Text"; }
    |   booleanLiteral {$atomType = "Bool"; }
    |   callClassMethod {$atomType = $callClassMethod.methodType;}
    |   callInlineFunction {$atomType = $callInlineFunction.functionType;}
    | nullLiteral {$atomType = "null";}
    ;

nullLiteral
    : 'null'
    ;

relationalOp
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
	  : 'Int'
	  | 'Float'
	  | 'OArc'
	  | 'Graph'
	  | 'Text'
	  | 'Node'  
	  | 'void'
	  | 'Bool'
	  ;

test
    : logicalExpression ';'
    ;

literal returns [String literalType, String literalValue]
    :   intLiteral {$literalType = "Int"; $literalValue=$intLiteral.text;}
    |   floatLiteral {$literalType = "Float"; $literalValue=$floatLiteral.text;}
    |   idLiteral {$literalType = $idLiteral.idType; $literalValue=$idLiteral.text;}
    |   stringLiteral {$literalType = "Text"; $literalValue=$stringLiteral.text;}
    |   booleanLiteral {$literalType = "Bool"; $literalValue=$booleanLiteral.text; }
    |   callClassMethod {$literalType = $callClassMethod.methodType;}
    |   callInlineFunction {$literalType = $callInlineFunction.functionType;}
    ;

argumentList returns[ArrayList<String> argumentTypeList]
  :  {
        argumentTypeList = new ArrayList<String>();
     }  
  a=literal {argumentTypeList.add($a.literalType);}  
  (',' b=literal {argumentTypeList.add($b.literalType);} )*
  ;

floatLiteral
  : FLOAT 
  ;

idLiteral returns [String idType]
  : ID  
    {
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
