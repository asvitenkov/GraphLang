// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g 2012-06-22 05:24:28


package graphlang;
  import java.util.Random;
  
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class GraphLangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "ID", "RELATIONALOP", "BOOLEANLITERAL", "FLOAT", "INT", "STRING", "COMMENT", "WS", "';'", "'('", "')'", "'{'", "'}'", "'return'", "','", "'main'", "'if'", "'else'", "'for'", "'foreach'", "'while'", "'do'", "'output'", "'input'", "'all'", "'.'", "'='", "'->'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'null'", "'+='", "'-='", "'*='", "'/='", "'%='"
    };
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int TYPE=4;
    public static final int ID=5;
    public static final int RELATIONALOP=6;
    public static final int BOOLEANLITERAL=7;
    public static final int FLOAT=8;
    public static final int INT=9;
    public static final int STRING=10;
    public static final int COMMENT=11;
    public static final int WS=12;

    // delegates
    // delegators


        public GraphLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GraphLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("GraphLangParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return GraphLangParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g"; }


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
            errors.add("line "+errorLine+":"+message);
        }
      


    protected static class programm_scope {
        String curBlock;
        ArrayList<String> tGlobalVariables;
    }
    protected Stack programm_stack = new Stack();

    public static class programm_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "programm"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:47:1: programm : (s+= globalExpression )* mainBlock -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st);
    public final GraphLangParser.programm_return programm() throws RecognitionException {
        programm_stack.push(new programm_scope());
        GraphLangParser.programm_return retval = new GraphLangParser.programm_return();
        retval.start = input.LT(1);

        List list_s=null;
        GraphLangParser.mainBlock_return mainBlock1 = null;

        RuleReturnScope s = null;

          ((programm_scope)programm_stack.peek()).curBlock = "";
          ((programm_scope)programm_stack.peek()).tGlobalVariables = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:56:4: ( (s+= globalExpression )* mainBlock -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:56:7: (s+= globalExpression )* mainBlock
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:56:8: (s+= globalExpression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:56:8: s+= globalExpression
            	    {
            	    pushFollow(FOLLOW_globalExpression_in_programm73);
            	    s=globalExpression();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            ((programm_scope)programm_stack.peek()).curBlock = "main";
            pushFollow(FOLLOW_mainBlock_in_programm79);
            mainBlock1=mainBlock();

            state._fsp--;



            // TEMPLATE REWRITE
            // 56:71: -> MyMainBlock(globalExpression=$smainBlock=$mainBlock.st)
            {
                retval.st = templateLib.getInstanceOf("MyMainBlock",
              new STAttrMap().put("globalExpression", list_s).put("mainBlock", (mainBlock1!=null?mainBlock1.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            programm_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "programm"

    public static class globalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "globalExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:59:1: globalExpression : ( globalVariableDeclaration -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st) | functionDeclaration -> {$functionDeclaration.st;});
    public final GraphLangParser.globalExpression_return globalExpression() throws RecognitionException {
        GraphLangParser.globalExpression_return retval = new GraphLangParser.globalExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.globalVariableDeclaration_return globalVariableDeclaration2 = null;

        GraphLangParser.functionDeclaration_return functionDeclaration3 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:60:4: ( globalVariableDeclaration -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st) | functionDeclaration -> {$functionDeclaration.st;})
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TYPE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==13||LA2_2==19) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==14) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:60:7: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalExpression108);
                    globalVariableDeclaration2=globalVariableDeclaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 60:34: -> MyGlobalVariableDeclaration(list=$globalVariableDeclaration.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyGlobalVariableDeclaration",
                      new STAttrMap().put("list", (globalVariableDeclaration2!=null?globalVariableDeclaration2.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:61:7: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_globalExpression126);
                    functionDeclaration3=functionDeclaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 61:27: -> {$functionDeclaration.st;}
                    {
                        retval.st = (functionDeclaration3!=null?functionDeclaration3.st:null);;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "globalExpression"

    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
        public String tVariableType;
        public ArrayList<String> tVariableList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "globalVariableDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:64:1: globalVariableDeclaration returns [String tVariableType,ArrayList<String> tVariableList] : variableDeclarationStatement ';' -> {$variableDeclarationStatement.st;};
    public final GraphLangParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        GraphLangParser.globalVariableDeclaration_return retval = new GraphLangParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement4 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:65:4: ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st;})
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:65:7: variableDeclarationStatement ';'
            {
            ((programm_scope)programm_stack.peek()).curBlock = "global";
            pushFollow(FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration158);
            variableDeclarationStatement4=variableDeclarationStatement();

            state._fsp--;

            match(input,13,FOLLOW_13_in_globalVariableDeclaration160); 


            // TEMPLATE REWRITE
            // 66:40: -> {$variableDeclarationStatement.st;}
            {
                retval.st = (variableDeclarationStatement4!=null?variableDeclarationStatement4.st:null);;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "globalVariableDeclaration"

    protected static class functionDeclaration_scope {
        String funcType;
        String funcName;
        ArrayList<String> funcArgTypes;
        ArrayList<String> funcArgNames;
        ArrayList<String> functionArgumentDeclaratorList;
        String returnVariable;
        boolean isReturnUsed;
    }
    protected Stack functionDeclaration_stack = new Stack();

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:69:1: functionDeclaration : TYPE ID '(' ( functionArgumentList )? ')' '{' (st+= blockStatement )* ( returnOperator )? '}' -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorListstatements=$stretSt=$functionDeclaration::returnVariable);
    public final GraphLangParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_stack.push(new functionDeclaration_scope());
        GraphLangParser.functionDeclaration_return retval = new GraphLangParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Token TYPE5=null;
        Token ID6=null;
        List list_st=null;
        RuleReturnScope st = null;

          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName = "";
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).functionArgumentDeclaratorList = new ArrayList<String>();
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = false;
          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable ="";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:88:4: ( TYPE ID '(' ( functionArgumentList )? ')' '{' (st+= blockStatement )* ( returnOperator )? '}' -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorListstatements=$stretSt=$functionDeclaration::returnVariable))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:89:8: TYPE ID '(' ( functionArgumentList )? ')' '{' (st+= blockStatement )* ( returnOperator )? '}'
            {
            TYPE5=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration196); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType = (TYPE5!=null?TYPE5.getText():null); 
            ID6=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration207); 
            ((programm_scope)programm_stack.peek()).curBlock = (ID6!=null?ID6.getText():null);
            match(input,14,FOLLOW_14_in_functionDeclaration220); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:91:12: ( functionArgumentList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:91:12: functionArgumentList
                    {
                    pushFollow(FOLLOW_functionArgumentList_in_functionDeclaration222);
                    functionArgumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_functionDeclaration225); 

            	            //add functon in namestable if it's not exists
            	            if(!names.isExistFunction((ID6!=null?ID6.getText():null))){
            	              names.addFunction(names.new FunctionName((ID6!=null?ID6.getText():null), (TYPE5!=null?TYPE5.getText():null) ,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes,  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames, (ID6!=null?ID6.getLine():0)));
            	            }
            	            else{
            	              errors.add("line "+(ID6!=null?ID6.getLine():0)+": duplicated function declaration "+(ID6!=null?ID6.getText():null));
            	            }
            	          
            match(input,16,FOLLOW_16_in_functionDeclaration258); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:102:14: (st+= blockStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TYPE && LA4_0<=ID)||LA4_0==21||(LA4_0>=23 && LA4_0<=26)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:102:14: st+= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_functionDeclaration262);
            	    st=blockStatement();

            	    state._fsp--;

            	    if (list_st==null) list_st=new ArrayList();
            	    list_st.add(st.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:102:33: ( returnOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:102:33: returnOperator
                    {
                    pushFollow(FOLLOW_returnOperator_in_functionDeclaration266);
                    returnOperator();

                    state._fsp--;


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_functionDeclaration269); 

            	        boolean result = names.checkReturnType((ID6!=null?ID6.getText():null), ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable, ((programm_scope)programm_stack.peek()).curBlock, ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed, (ID6!=null?ID6.getLine():0));
            	        if(result==false){
            	          errors.add(names.getLAstError());
            	        }
            	      

            	       if(((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable==null)((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable ="";
            	       else{((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable ="___"+((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable;}
            	      
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable = "return "+((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable+";";
            if(((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType.equals("Text")) ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType ="String";
            if(((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType.equals("float")) ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcType ="double";


            // TEMPLATE REWRITE
            // 116:8: -> MyFunctionDeclaration(returnType=$TYPE.textname=$ID.textargumentList=$functionDeclaration::functionArgumentDeclaratorListstatements=$stretSt=$functionDeclaration::returnVariable)
            {
                retval.st = templateLib.getInstanceOf("MyFunctionDeclaration",
              new STAttrMap().put("returnType", (TYPE5!=null?TYPE5.getText():null)).put("name", (ID6!=null?ID6.getText():null)).put("argumentList", ((functionDeclaration_scope)functionDeclaration_stack.peek()).functionArgumentDeclaratorList).put("statements", list_st).put("retSt", ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            functionDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class returnOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "returnOperator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:119:1: returnOperator : 'return' ( ID )? ';' ;
    public final GraphLangParser.returnOperator_return returnOperator() throws RecognitionException {
        GraphLangParser.returnOperator_return retval = new GraphLangParser.returnOperator_return();
        retval.start = input.LT(1);

        Token ID7=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:5: ( 'return' ( ID )? ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:11: 'return' ( ID )? ';'
            {
            match(input,18,FOLLOW_18_in_returnOperator370); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:20: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:120:20: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_returnOperator372); 

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_returnOperator375); 

                          ((functionDeclaration_scope)functionDeclaration_stack.peek()).isReturnUsed = true;
                          ((functionDeclaration_scope)functionDeclaration_stack.peek()).returnVariable =(ID7!=null?ID7.getText():null);
                      

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnOperator"

    public static class functionArgumentList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionArgumentList"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:127:1: functionArgumentList : functionArgumentDeclarator ( ',' functionArgumentDeclarator )* ;
    public final GraphLangParser.functionArgumentList_return functionArgumentList() throws RecognitionException {
        GraphLangParser.functionArgumentList_return retval = new GraphLangParser.functionArgumentList_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:5: ( functionArgumentDeclarator ( ',' functionArgumentDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:8: functionArgumentDeclarator ( ',' functionArgumentDeclarator )*
            {
            pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList405);
            functionArgumentDeclarator();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:35: ( ',' functionArgumentDeclarator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:128:36: ',' functionArgumentDeclarator
            	    {
            	    match(input,19,FOLLOW_19_in_functionArgumentList408); 
            	    pushFollow(FOLLOW_functionArgumentDeclarator_in_functionArgumentList410);
            	    functionArgumentDeclarator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionArgumentList"

    public static class functionArgumentDeclarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionArgumentDeclarator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:131:1: functionArgumentDeclarator : TYPE ID ;
    public final GraphLangParser.functionArgumentDeclarator_return functionArgumentDeclarator() throws RecognitionException {
        GraphLangParser.functionArgumentDeclarator_return retval = new GraphLangParser.functionArgumentDeclarator_return();
        retval.start = input.LT(1);

        Token TYPE8=null;
        Token ID9=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:132:5: ( TYPE ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:132:8: TYPE ID
            {
            TYPE8=(Token)match(input,TYPE,FOLLOW_TYPE_in_functionArgumentDeclarator430); 
            ID9=(Token)match(input,ID,FOLLOW_ID_in_functionArgumentDeclarator432); 
             String type=(TYPE8!=null?TYPE8.getText():null); 
                  if((TYPE8!=null?TYPE8.getText():null).equals("Text")) type="String";
                  if((TYPE8!=null?TYPE8.getText():null).equals("float")) type="double";
                  
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).functionArgumentDeclaratorList.add(type+" ___"+(ID9!=null?ID9.getText():null));
                  
                  

                  // add variable and it's type in lists funcArgTypes and funcArgNames
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgTypes.add((TYPE8!=null?TYPE8.getText():null));
                  ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcArgNames.add((ID9!=null?ID9.getText():null));
                  if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID9!=null?ID9.getText():null))){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID9!=null?ID9.getText():null), (TYPE8!=null?TYPE8.getText():null), (ID9!=null?ID9.getLine():0)));
                  }
                  else{
                      errors.add("line "+(ID9!=null?ID9.getLine():0)+": duplicated variable name "+(ID9!=null?ID9.getText():null));
                  }
                

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionArgumentDeclarator"

    public static class mainBlock_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mainBlock"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:154:1: mainBlock : 'main' '{' (s+= blockStatement )* '}' -> print(value=$s);
    public final GraphLangParser.mainBlock_return mainBlock() throws RecognitionException {
        GraphLangParser.mainBlock_return retval = new GraphLangParser.mainBlock_return();
        retval.start = input.LT(1);

        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:155:4: ( 'main' '{' (s+= blockStatement )* '}' -> print(value=$s))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:155:6: 'main' '{' (s+= blockStatement )* '}'
            {
            match(input,20,FOLLOW_20_in_mainBlock468); 
            match(input,16,FOLLOW_16_in_mainBlock470); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:155:18: (s+= blockStatement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=TYPE && LA8_0<=ID)||LA8_0==21||(LA8_0>=23 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:155:18: s+= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_mainBlock474);
            	    s=blockStatement();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_mainBlock477); 


            // TEMPLATE REWRITE
            // 155:41: -> print(value=$s)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", list_s));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mainBlock"

    public static class blockStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockStatement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:158:1: blockStatement : ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st} | statement -> {$statement.st});
    public final GraphLangParser.blockStatement_return blockStatement() throws RecognitionException {
        GraphLangParser.blockStatement_return retval = new GraphLangParser.blockStatement_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement10 = null;

        GraphLangParser.statement_return statement11 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:159:5: ( variableDeclarationStatement ';' -> {$variableDeclarationStatement.st} | statement -> {$statement.st})
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TYPE) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID||LA9_0==21||(LA9_0>=23 && LA9_0<=26)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:159:9: variableDeclarationStatement ';'
                    {
                    pushFollow(FOLLOW_variableDeclarationStatement_in_blockStatement507);
                    variableDeclarationStatement10=variableDeclarationStatement();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_blockStatement509); 


                    // TEMPLATE REWRITE
                    // 159:42: -> {$variableDeclarationStatement.st}
                    {
                        retval.st = (variableDeclarationStatement10!=null?variableDeclarationStatement10.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:160:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement523);
                    statement11=statement();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 160:19: -> {$statement.st}
                    {
                        retval.st = (statement11!=null?statement11.st:null);
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:164:1: block : '{' (s+= statement )* '}' -> print(value=$s);
    public final GraphLangParser.block_return block() throws RecognitionException {
        GraphLangParser.block_return retval = new GraphLangParser.block_return();
        retval.start = input.LT(1);

        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:5: ( '{' (s+= statement )* '}' -> print(value=$s))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:7: '{' (s+= statement )* '}'
            {
            match(input,16,FOLLOW_16_in_block553); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:12: (s+= statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||LA10_0==21||(LA10_0>=23 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:165:12: s+= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block557);
            	    s=statement();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_block560); 


            // TEMPLATE REWRITE
            // 165:29: -> print(value=$s)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", list_s));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:168:1: statement : ( 'if' '(' logicalExpression ')' a= block ( 'else' b= block )? -> MyIfStatement(logicalExpr=$logicalExpression.stblockIf=$a.stblockElse=$b.st) | 'for' '(' forControl ')' a= block -> MyForControl(expr=$forControl.stblock=$a.st) | 'foreach' '(' foreachControl ')' block -> MyForeachStatment(expr=$foreachControl.stblock=$block.st) | 'while' '(' logicalExpression ')' block -> MyWhileStatement(logicalExpr=$logicalExpression.stblock=$block.st) | 'do' block 'while' '(' logicalExpression ')' ';' -> MyDoWhileStatement(logicalExpr=$logicalExpression.stblock=$block.st) | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' -> print(value=$setArcOperation.st+\";\\n\") | setGraphOperation ';' -> print(value=$setGraphOperation.st+\";\\n\") | callClassMethod ';' -> print(value=$callClassMethod.st+\";\\n\") | callInlineFunction ';' -> print(value=$callInlineFunction.st+\";\\n\"));
    public final GraphLangParser.statement_return statement() throws RecognitionException {
        GraphLangParser.statement_return retval = new GraphLangParser.statement_return();
        retval.start = input.LT(1);

        GraphLangParser.block_return a = null;

        GraphLangParser.block_return b = null;

        GraphLangParser.logicalExpression_return logicalExpression12 = null;

        GraphLangParser.forControl_return forControl13 = null;

        GraphLangParser.foreachControl_return foreachControl14 = null;

        GraphLangParser.block_return block15 = null;

        GraphLangParser.logicalExpression_return logicalExpression16 = null;

        GraphLangParser.block_return block17 = null;

        GraphLangParser.logicalExpression_return logicalExpression18 = null;

        GraphLangParser.block_return block19 = null;

        GraphLangParser.assignmentOperation_return assignmentOperation20 = null;

        GraphLangParser.setArcOperation_return setArcOperation21 = null;

        GraphLangParser.setGraphOperation_return setGraphOperation22 = null;

        GraphLangParser.callClassMethod_return callClassMethod23 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction24 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:5: ( 'if' '(' logicalExpression ')' a= block ( 'else' b= block )? -> MyIfStatement(logicalExpr=$logicalExpression.stblockIf=$a.stblockElse=$b.st) | 'for' '(' forControl ')' a= block -> MyForControl(expr=$forControl.stblock=$a.st) | 'foreach' '(' foreachControl ')' block -> MyForeachStatment(expr=$foreachControl.stblock=$block.st) | 'while' '(' logicalExpression ')' block -> MyWhileStatement(logicalExpr=$logicalExpression.stblock=$block.st) | 'do' block 'while' '(' logicalExpression ')' ';' -> MyDoWhileStatement(logicalExpr=$logicalExpression.stblock=$block.st) | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' -> print(value=$setArcOperation.st+\";\\n\") | setGraphOperation ';' -> print(value=$setGraphOperation.st+\";\\n\") | callClassMethod ';' -> print(value=$callClassMethod.st+\";\\n\") | callInlineFunction ';' -> print(value=$callInlineFunction.st+\";\\n\"))
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:9: 'if' '(' logicalExpression ')' a= block ( 'else' b= block )?
                    {
                    match(input,21,FOLLOW_21_in_statement587); 
                    match(input,14,FOLLOW_14_in_statement589); 
                    pushFollow(FOLLOW_logicalExpression_in_statement591);
                    logicalExpression12=logicalExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement593); 
                    pushFollow(FOLLOW_block_in_statement597);
                    a=block();

                    state._fsp--;

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:48: ( 'else' b= block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:169:49: 'else' b= block
                            {
                            match(input,22,FOLLOW_22_in_statement600); 
                            pushFollow(FOLLOW_block_in_statement604);
                            b=block();

                            state._fsp--;


                            }
                            break;

                    }



                    // TEMPLATE REWRITE
                    // 169:66: -> MyIfStatement(logicalExpr=$logicalExpression.stblockIf=$a.stblockElse=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyIfStatement",
                      new STAttrMap().put("logicalExpr", (logicalExpression12!=null?logicalExpression12.st:null)).put("blockIf", (a!=null?a.st:null)).put("blockElse", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:170:9: 'for' '(' forControl ')' a= block
                    {
                    match(input,23,FOLLOW_23_in_statement632); 
                    match(input,14,FOLLOW_14_in_statement634); 
                    pushFollow(FOLLOW_forControl_in_statement636);
                    forControl13=forControl();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement638); 
                    pushFollow(FOLLOW_block_in_statement642);
                    a=block();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 170:42: -> MyForControl(expr=$forControl.stblock=$a.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyForControl",
                      new STAttrMap().put("expr", (forControl13!=null?forControl13.st:null)).put("block", (a!=null?a.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:171:9: 'foreach' '(' foreachControl ')' block
                    {
                    match(input,24,FOLLOW_24_in_statement664); 
                    match(input,14,FOLLOW_14_in_statement666); 
                    pushFollow(FOLLOW_foreachControl_in_statement668);
                    foreachControl14=foreachControl();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement670); 
                    pushFollow(FOLLOW_block_in_statement672);
                    block15=block();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 171:48: -> MyForeachStatment(expr=$foreachControl.stblock=$block.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyForeachStatment",
                      new STAttrMap().put("expr", (foreachControl14!=null?foreachControl14.st:null)).put("block", (block15!=null?block15.st:null)));
                    }


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:172:9: 'while' '(' logicalExpression ')' block
                    {
                    match(input,25,FOLLOW_25_in_statement694); 
                    match(input,14,FOLLOW_14_in_statement696); 
                    pushFollow(FOLLOW_logicalExpression_in_statement698);
                    logicalExpression16=logicalExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement700); 
                    pushFollow(FOLLOW_block_in_statement702);
                    block17=block();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 172:49: -> MyWhileStatement(logicalExpr=$logicalExpression.stblock=$block.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyWhileStatement",
                      new STAttrMap().put("logicalExpr", (logicalExpression16!=null?logicalExpression16.st:null)).put("block", (block17!=null?block17.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:173:9: 'do' block 'while' '(' logicalExpression ')' ';'
                    {
                    match(input,26,FOLLOW_26_in_statement724); 
                    pushFollow(FOLLOW_block_in_statement727);
                    block19=block();

                    state._fsp--;

                    match(input,25,FOLLOW_25_in_statement729); 
                    match(input,14,FOLLOW_14_in_statement731); 
                    pushFollow(FOLLOW_logicalExpression_in_statement733);
                    logicalExpression18=logicalExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_statement735); 
                    match(input,13,FOLLOW_13_in_statement737); 


                    // TEMPLATE REWRITE
                    // 173:59: -> MyDoWhileStatement(logicalExpr=$logicalExpression.stblock=$block.st)
                    {
                        retval.st = templateLib.getInstanceOf("MyDoWhileStatement",
                      new STAttrMap().put("logicalExpr", (logicalExpression18!=null?logicalExpression18.st:null)).put("block", (block19!=null?block19.st:null)));
                    }


                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:174:9: assignmentOperation ';'
                    {
                    pushFollow(FOLLOW_assignmentOperation_in_statement759);
                    assignmentOperation20=assignmentOperation();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement761); 


                    // TEMPLATE REWRITE
                    // 174:33: -> {$assignmentOperation.st}
                    {
                        retval.st = (assignmentOperation20!=null?assignmentOperation20.st:null);
                    }


                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:175:9: setArcOperation ';'
                    {
                    pushFollow(FOLLOW_setArcOperation_in_statement774);
                    setArcOperation21=setArcOperation();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement776); 


                    // TEMPLATE REWRITE
                    // 175:29: -> print(value=$setArcOperation.st+\";\\n\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (setArcOperation21!=null?setArcOperation21.st:null)+";\n"));
                    }


                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:176:9: setGraphOperation ';'
                    {
                    pushFollow(FOLLOW_setGraphOperation_in_statement794);
                    setGraphOperation22=setGraphOperation();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement796); 


                    // TEMPLATE REWRITE
                    // 176:31: -> print(value=$setGraphOperation.st+\";\\n\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (setGraphOperation22!=null?setGraphOperation22.st:null)+";\n"));
                    }


                    }
                    break;
                case 9 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:177:9: callClassMethod ';'
                    {
                    pushFollow(FOLLOW_callClassMethod_in_statement814);
                    callClassMethod23=callClassMethod();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement816); 


                    // TEMPLATE REWRITE
                    // 177:29: -> print(value=$callClassMethod.st+\";\\n\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (callClassMethod23!=null?callClassMethod23.st:null)+";\n"));
                    }


                    }
                    break;
                case 10 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:178:9: callInlineFunction ';'
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_statement834);
                    callInlineFunction24=callInlineFunction();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_statement836); 


                    // TEMPLATE REWRITE
                    // 178:32: -> print(value=$callInlineFunction.st+\";\\n\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (callInlineFunction24!=null?callInlineFunction24.st:null)+";\n"));
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class foreachControl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "foreachControl"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:181:1: foreachControl : f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? -> MyCreateIteratorStatement(itType=itTypevar=$f.stitVar=$s.stiterator=iteratorrandNumber=Integer.toString(index++));
    public final GraphLangParser.foreachControl_return foreachControl() throws RecognitionException {
        GraphLangParser.foreachControl_return retval = new GraphLangParser.foreachControl_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return f = null;

        GraphLangParser.idLiteral_return s = null;

        GraphLangParser.foreachType_return foreachType25 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:182:5: (f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )? -> MyCreateIteratorStatement(itType=itTypevar=$f.stitVar=$s.stiterator=iteratorrandNumber=Integer.toString(index++)))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:183:9: f= idLiteral ';' s= idLiteral ( ';' ( foreachType )? )?
            {
            String tmp="";
            pushFollow(FOLLOW_idLiteral_in_foreachControl888);
            f=idLiteral();

            state._fsp--;

            match(input,13,FOLLOW_13_in_foreachControl890); 
            pushFollow(FOLLOW_idLiteral_in_foreachControl894);
            s=idLiteral();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:184:37: ( ';' ( foreachType )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:184:38: ';' ( foreachType )?
                    {
                    match(input,13,FOLLOW_13_in_foreachControl897); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:184:42: ( foreachType )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=27 && LA13_0<=29)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:184:42: foreachType
                            {
                            pushFollow(FOLLOW_foreachType_in_foreachControl899);
                            foreachType25=foreachType();

                            state._fsp--;


                            }
                            break;

                    }

                    tmp=(foreachType25!=null?input.toString(foreachType25.start,foreachType25.stop):null);

                    }
                    break;

            }


            		        if(!names.checkForeachControl(((programm_scope)programm_stack.peek()).curBlock+"."+(f!=null?input.toString(f.start,f.stop):null), ((programm_scope)programm_stack.peek()).curBlock+"."+(s!=null?input.toString(s.start,s.stop):null),(foreachType25!=null?input.toString(foreachType25.start,foreachType25.stop):null), (s!=null?s.curLine:0))){
            		          names.getAllErrors(errors);
            		        }
            		    

            		      String itType="";
            		      if(tmp==null) tmp="all";
            		      String iterator="";
            		      String type=(s!=null?s.idType:null);
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
            		        else errors.add("line "+(f!=null?f.curLine:0)+": undefined foreach type ");
            		      }
            		      
            		      else if(type.equals("Graph")){
            		        itType="GraphIterator";
                        iterator="vertexIterator";
            		      }
            		      else {errors.add("line "+(f!=null?f.curLine:0)+": undefined foreachType type for variable");}
            		    


            // TEMPLATE REWRITE
            // 214:9: -> MyCreateIteratorStatement(itType=itTypevar=$f.stitVar=$s.stiterator=iteratorrandNumber=Integer.toString(index++))
            {
                retval.st = templateLib.getInstanceOf("MyCreateIteratorStatement",
              new STAttrMap().put("itType", itType).put("var", (f!=null?f.st:null)).put("itVar", (s!=null?s.st:null)).put("iterator", iterator).put("randNumber", Integer.toString(index++)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreachControl"

    public static class foreachType_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "foreachType"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:217:1: foreachType : ( 'output' | 'input' | 'all' );
    public final GraphLangParser.foreachType_return foreachType() throws RecognitionException {
        GraphLangParser.foreachType_return retval = new GraphLangParser.foreachType_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:218:5: ( 'output' | 'input' | 'all' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( (input.LA(1)>=27 && input.LA(1)<=29) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreachType"

    public static class forControl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forControl"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:223:1: forControl : forInit ';' a= forLiteral ';' b= forLiteral -> MyForStatement(var=$forInit.stbegin=$a.stend=$b.st);
    public final GraphLangParser.forControl_return forControl() throws RecognitionException {
        GraphLangParser.forControl_return retval = new GraphLangParser.forControl_return();
        retval.start = input.LT(1);

        GraphLangParser.forLiteral_return a = null;

        GraphLangParser.forLiteral_return b = null;

        GraphLangParser.forInit_return forInit26 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:224:5: ( forInit ';' a= forLiteral ';' b= forLiteral -> MyForStatement(var=$forInit.stbegin=$a.stend=$b.st))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:224:9: forInit ';' a= forLiteral ';' b= forLiteral
            {
            pushFollow(FOLLOW_forInit_in_forControl999);
            forInit26=forInit();

            state._fsp--;

            match(input,13,FOLLOW_13_in_forControl1001); 
            pushFollow(FOLLOW_forLiteral_in_forControl1005);
            a=forLiteral();

            state._fsp--;

            match(input,13,FOLLOW_13_in_forControl1007); 
            pushFollow(FOLLOW_forLiteral_in_forControl1011);
            b=forLiteral();

            state._fsp--;



            // TEMPLATE REWRITE
            // 225:7: -> MyForStatement(var=$forInit.stbegin=$a.stend=$b.st)
            {
                retval.st = templateLib.getInstanceOf("MyForStatement",
              new STAttrMap().put("var", (forInit26!=null?forInit26.st:null)).put("begin", (a!=null?a.st:null)).put("end", (b!=null?b.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControl"

    public static class forLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:229:1: forLiteral : ( intLiteral -> {$intLiteral.st} | idLiteral -> {$idLiteral.st} | callClassMethod -> {$callClassMethod.st} | callInlineFunction -> {$callInlineFunction.st});
    public final GraphLangParser.forLiteral_return forLiteral() throws RecognitionException {
        GraphLangParser.forLiteral_return retval = new GraphLangParser.forLiteral_return();
        retval.start = input.LT(1);

        GraphLangParser.intLiteral_return intLiteral27 = null;

        GraphLangParser.idLiteral_return idLiteral28 = null;

        GraphLangParser.callClassMethod_return callClassMethod29 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction30 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:230:5: ( intLiteral -> {$intLiteral.st} | idLiteral -> {$idLiteral.st} | callClassMethod -> {$callClassMethod.st} | callInlineFunction -> {$callInlineFunction.st})
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==ID) ) {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt15=3;
                    }
                    break;
                case 14:
                    {
                    alt15=4;
                    }
                    break;
                case 13:
                case 15:
                    {
                    alt15=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:230:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_forLiteral1057);
                    intLiteral27=intLiteral();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 230:20: -> {$intLiteral.st}
                    {
                        retval.st = (intLiteral27!=null?intLiteral27.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:231:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_forLiteral1071);
                    idLiteral28=idLiteral();

                    state._fsp--;

                    if(!(idLiteral28!=null?idLiteral28.idType:null).equals("int")){errors.add("line "+(idLiteral28!=null?idLiteral28.curLine:0)+": for  variable must have type int ");}


                    // TEMPLATE REWRITE
                    // 231:137: -> {$idLiteral.st}
                    {
                        retval.st = (idLiteral28!=null?idLiteral28.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:232:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_forLiteral1086);
                    callClassMethod29=callClassMethod();

                    state._fsp--;

                    if(!(callClassMethod29!=null?callClassMethod29.methodType:null).equals("int")){errors.add("line "+(callClassMethod29!=null?callClassMethod29.curLine:0)+": for variable must have type int ");}


                    // TEMPLATE REWRITE
                    // 232:158: -> {$callClassMethod.st}
                    {
                        retval.st = (callClassMethod29!=null?callClassMethod29.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:233:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_forLiteral1101);
                    callInlineFunction30=callInlineFunction();

                    state._fsp--;

                    if(!(callInlineFunction30!=null?callInlineFunction30.functionType:null).equals("int")){errors.add("line "+(callInlineFunction30!=null?callInlineFunction30.curLine:0)+": for variable must have type int ");}


                    // TEMPLATE REWRITE
                    // 233:169: -> {$callInlineFunction.st}
                    {
                        retval.st = (callInlineFunction30!=null?callInlineFunction30.st:null);
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forLiteral"

    public static class forInit_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forInit"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:237:1: forInit : idLiteral -> print(value=$idLiteral.st);
    public final GraphLangParser.forInit_return forInit() throws RecognitionException {
        GraphLangParser.forInit_return retval = new GraphLangParser.forInit_return();
        retval.start = input.LT(1);

        GraphLangParser.idLiteral_return idLiteral31 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:238:5: ( idLiteral -> print(value=$idLiteral.st))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:238:9: idLiteral
            {
            pushFollow(FOLLOW_idLiteral_in_forInit1126);
            idLiteral31=idLiteral();

            state._fsp--;


                    if(!(idLiteral31!=null?idLiteral31.idType:null).equals("int")){
                      errors.add("line "+(idLiteral31!=null?idLiteral31.curLine:0)+": for init variable must have type int ");
                    }
                 


            // TEMPLATE REWRITE
            // 243:8: -> print(value=$idLiteral.st)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (idLiteral31!=null?idLiteral31.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class callInlineFunction_return extends ParserRuleReturnScope {
        public String functionType;
        public int curLine;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "callInlineFunction"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:246:1: callInlineFunction returns [String functionType, int curLine] : ID '(' ( argumentList )? ')' -> print(value=funcName+\"(\"+tmp+\")\");
    public final GraphLangParser.callInlineFunction_return callInlineFunction() throws RecognitionException {
        GraphLangParser.callInlineFunction_return retval = new GraphLangParser.callInlineFunction_return();
        retval.start = input.LT(1);

        Token ID32=null;
        GraphLangParser.argumentList_return argumentList33 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:247:5: ( ID '(' ( argumentList )? ')' -> print(value=funcName+\"(\"+tmp+\")\"))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:247:8: ID '(' ( argumentList )? ')'
            {
            ID32=(Token)match(input,ID,FOLLOW_ID_in_callInlineFunction1164); 
            match(input,14,FOLLOW_14_in_callInlineFunction1166); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:247:15: ( argumentList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||(LA16_0>=BOOLEANLITERAL && LA16_0<=STRING)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:247:15: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callInlineFunction1168);
                    argumentList33=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_callInlineFunction1171); 

                      String funcName=(ID32!=null?ID32.getText():null);
                      String tmp="";
                     
                      
                      retval.functionType = "?";
                      ArrayList list = null;
                      retval.curLine = (ID32!=null?ID32.getLine():0);
                      if((argumentList33!=null?argumentList33.argumentTypeList:null)==null) list = new ArrayList<String>();
                      else list =  (argumentList33!=null?argumentList33.argumentTypeList:null);
                      
                      if((ID32!=null?ID32.getText():null).equals("write")){
                        list.clear();
                        list.add("String");
                      } 
                      
                      if(!names.checkCallFunction(((programm_scope)programm_stack.peek()).curBlock, (ID32!=null?ID32.getText():null), list, (ID32!=null?ID32.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      else{
                          retval.functionType = names.getFunction((ID32!=null?ID32.getText():null)).getReturnType();
                      }
                      
                            
                      
                      if((argumentList33!=null?argumentList33.st:null)!=null)
                        tmp+=(argumentList33!=null?argumentList33.st:null);
                        
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
                        
                        
                


            // TEMPLATE REWRITE
            // 289:5: -> print(value=funcName+\"(\"+tmp+\")\")
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", funcName+"("+tmp+")"));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "callInlineFunction"

    protected static class callClassMethod_scope {
        String variableId;
        String methodName;
        //ArrayList<String> argumentTypeList;
    }
    protected Stack callClassMethod_stack = new Stack();

    public static class callClassMethod_return extends ParserRuleReturnScope {
        public String methodType;
        public int curLine;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "callClassMethod"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:294:1: callClassMethod returns [String methodType, int curLine] : varId= ID '.' mName= ID '(' ( argumentList )? ')' -> print(value=\"___\"+$varId.text+\".\"+$mName.text+\"(\"+tmp+\")\");
    public final GraphLangParser.callClassMethod_return callClassMethod() throws RecognitionException {
        callClassMethod_stack.push(new callClassMethod_scope());
        GraphLangParser.callClassMethod_return retval = new GraphLangParser.callClassMethod_return();
        retval.start = input.LT(1);

        Token varId=null;
        Token mName=null;
        GraphLangParser.argumentList_return argumentList34 = null;



          ((callClassMethod_scope)callClassMethod_stack.peek()).variableId ="";
          ((callClassMethod_scope)callClassMethod_stack.peek()).methodName ="";
          //((callClassMethod_scope)callClassMethod_stack.peek()).argumentTypeList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:305:5: (varId= ID '.' mName= ID '(' ( argumentList )? ')' -> print(value=\"___\"+$varId.text+\".\"+$mName.text+\"(\"+tmp+\")\"))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:305:9: varId= ID '.' mName= ID '(' ( argumentList )? ')'
            {
            varId=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod1222); 
            match(input,30,FOLLOW_30_in_callClassMethod1224); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).variableId =(varId!=null?varId.getText():null); 
            mName=(Token)match(input,ID,FOLLOW_ID_in_callClassMethod1239); 
            ((callClassMethod_scope)callClassMethod_stack.peek()).methodName =(mName!=null?mName.getText():null);
            String tmp="";
            match(input,14,FOLLOW_14_in_callClassMethod1263); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:308:13: ( argumentList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=BOOLEANLITERAL && LA17_0<=STRING)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:308:13: argumentList
                    {
                    pushFollow(FOLLOW_argumentList_in_callClassMethod1265);
                    argumentList34=argumentList();

                    state._fsp--;


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_callClassMethod1268); 

                      retval.methodType ="?";
                      retval.curLine = (varId!=null?varId.getLine():0);
                      ArrayList list = null;
                      if((argumentList34!=null?argumentList34.argumentTypeList:null)==null) list = new ArrayList<String>();
                      else list =  (argumentList34!=null?argumentList34.argumentTypeList:null);
                      
                      if(!names.checkCallClassMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null), (argumentList34!=null?argumentList34.argumentTypeList:null), (varId!=null?varId.getLine():0))){
                          names.getAllErrors(errors);
                      }
                      if(names.isExistMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null))){
                        retval.methodType = names.getMethod(((programm_scope)programm_stack.peek()).curBlock, (varId!=null?varId.getText():null), (mName!=null?mName.getText():null)).getReturnType();
                      }
                    

                      if((argumentList34!=null?input.toString(argumentList34.start,argumentList34.stop):null)!=null)
                        tmp+=(argumentList34!=null?argumentList34.st:null);
                    


            // TEMPLATE REWRITE
            // 328:9: -> print(value=\"___\"+$varId.text+\".\"+$mName.text+\"(\"+tmp+\")\")
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", "___"+(varId!=null?varId.getText():null)+"."+(mName!=null?mName.getText():null)+"("+tmp+")"));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            callClassMethod_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "callClassMethod"

    protected static class assignmentOperation_scope {
        String idType;
    }
    protected Stack assignmentOperation_stack = new Stack();

    public static class assignmentOperation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentOperation"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:331:1: assignmentOperation : ID assignmentOperator mathExpression -> MyAssignmentOperation(id=idoperator=operatormathExpr=mathExpradditionExpr=additionExpr);
    public final GraphLangParser.assignmentOperation_return assignmentOperation() throws RecognitionException {
        assignmentOperation_stack.push(new assignmentOperation_scope());
        GraphLangParser.assignmentOperation_return retval = new GraphLangParser.assignmentOperation_return();
        retval.start = input.LT(1);

        Token ID35=null;
        GraphLangParser.assignmentOperator_return assignmentOperator36 = null;

        GraphLangParser.mathExpression_return mathExpression37 = null;



            ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = "none";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:338:5: ( ID assignmentOperator mathExpression -> MyAssignmentOperation(id=idoperator=operatormathExpr=mathExpradditionExpr=additionExpr))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:338:8: ID assignmentOperator mathExpression
            {
            ID35=(Token)match(input,ID,FOLLOW_ID_in_assignmentOperation1339); 
            String id="";
                    String operator="";
                    StringTemplate mathExpr;
                    String idType="none";
                    String exprType="";
                    String additionExpr="";
                   

                      if(names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID35!=null?ID35.getText():null))){
                        ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID35!=null?ID35.getText():null)).getType();
                      }
                      else{
                        errors.add("line "+(ID35!=null?ID35.getLine():0)+": unknown variable "+(ID35!=null?ID35.getText():null));
                      }
                   
            pushFollow(FOLLOW_assignmentOperator_in_assignmentOperation1376);
            assignmentOperator36=assignmentOperator();

            state._fsp--;

            pushFollow(FOLLOW_mathExpression_in_assignmentOperation1386);
            mathExpression37=mathExpression();

            state._fsp--;


                      if(!typeCheker.checkAssignOperation((assignmentOperator36!=null?input.toString(assignmentOperator36.start,assignmentOperator36.stop):null),  ((assignmentOperation_scope)assignmentOperation_stack.peek()).idType, (mathExpression37!=null?mathExpression37.mathExpressionType:null), (ID35!=null?ID35.getLine():0))){
                          typeCheker.getAllErrors(errors);
                      }
                   

                    id=(ID35!=null?ID35.getText():null);
                    operator=(assignmentOperator36!=null?input.toString(assignmentOperator36.start,assignmentOperator36.stop):null);
                    mathExpr=(mathExpression37!=null?mathExpression37.st:null);
                    exprType= (mathExpression37!=null?mathExpression37.mathExpressionType:null);
                    idType=((assignmentOperation_scope)assignmentOperation_stack.peek()).idType;
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
                    
                    
                   


            // TEMPLATE REWRITE
            // 420:8: -> MyAssignmentOperation(id=idoperator=operatormathExpr=mathExpradditionExpr=additionExpr)
            {
                retval.st = templateLib.getInstanceOf("MyAssignmentOperation",
              new STAttrMap().put("id", id).put("operator", operator).put("mathExpr", mathExpr).put("additionExpr", additionExpr));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            assignmentOperation_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "assignmentOperation"

    protected static class setGraphOperation_scope {
        ArrayList<String> varList;
        ArrayList<String> firstIdList;
        ArrayList<String> secondIdList;
    }
    protected Stack setGraphOperation_stack = new Stack();

    public static class setGraphOperation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "setGraphOperation"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:423:1: setGraphOperation : ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' -> MySetGraphOperation(idGraph=$ID.textvar=$setGraphOperation::varListfV=$setGraphOperation::firstIdListsV=$setGraphOperation::secondIdList);
    public final GraphLangParser.setGraphOperation_return setGraphOperation() throws RecognitionException {
        setGraphOperation_stack.push(new setGraphOperation_scope());
        GraphLangParser.setGraphOperation_return retval = new GraphLangParser.setGraphOperation_return();
        retval.start = input.LT(1);

        Token ID38=null;


          ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList = new ArrayList<String>();
          ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:434:5: ( ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')' -> MySetGraphOperation(idGraph=$ID.textvar=$setGraphOperation::varListfV=$setGraphOperation::firstIdListsV=$setGraphOperation::secondIdList))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:434:8: ID '=' '(' '{' variableList '}' ',' '{' ( setArcExpressions )? '}' ')'
            {
            ID38=(Token)match(input,ID,FOLLOW_ID_in_setGraphOperation1457); 
            match(input,31,FOLLOW_31_in_setGraphOperation1459); 
            match(input,14,FOLLOW_14_in_setGraphOperation1461); 
            match(input,16,FOLLOW_16_in_setGraphOperation1464); 
            pushFollow(FOLLOW_variableList_in_setGraphOperation1466);
            variableList();

            state._fsp--;

            match(input,17,FOLLOW_17_in_setGraphOperation1468); 
            match(input,19,FOLLOW_19_in_setGraphOperation1470); 
            match(input,16,FOLLOW_16_in_setGraphOperation1472); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:434:49: ( setArcExpressions )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:434:49: setArcExpressions
                    {
                    pushFollow(FOLLOW_setArcExpressions_in_setGraphOperation1474);
                    setArcExpressions();

                    state._fsp--;


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_setGraphOperation1477); 
            match(input,15,FOLLOW_15_in_setGraphOperation1480); 

                        names.checkSetGraphOperator((ID38!=null?ID38.getText():null),((programm_scope)programm_stack.peek()).curBlock,((setGraphOperation_scope)setGraphOperation_stack.peek()).varList,((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList,((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList,(ID38!=null?ID38.getLine():0));
                        names.getAllErrors(errors);
                    


            // TEMPLATE REWRITE
            // 440:9: -> MySetGraphOperation(idGraph=$ID.textvar=$setGraphOperation::varListfV=$setGraphOperation::firstIdListsV=$setGraphOperation::secondIdList)
            {
                retval.st = templateLib.getInstanceOf("MySetGraphOperation",
              new STAttrMap().put("idGraph", (ID38!=null?ID38.getText():null)).put("var", ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList).put("fV", ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList).put("sV", ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            setGraphOperation_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "setGraphOperation"

    public static class variableList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableList"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:443:1: variableList : a= ID ( ',' b= ID )* ;
    public final GraphLangParser.variableList_return variableList() throws RecognitionException {
        GraphLangParser.variableList_return retval = new GraphLangParser.variableList_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:444:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:444:8: a= ID ( ',' b= ID )*
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_variableList1547); 
             ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((a!=null?a.getText():null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:444:58: ( ',' b= ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:444:59: ',' b= ID
            	    {
            	    match(input,19,FOLLOW_19_in_variableList1552); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableList1556); 
            	     ((setGraphOperation_scope)setGraphOperation_stack.peek()).varList.add((b!=null?b.getText():null));

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableList"

    public static class setArcExpressions_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "setArcExpressions"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:448:1: setArcExpressions : f= ID '->' s= ID ( ',' a= ID '->' b= ID )* ;
    public final GraphLangParser.setArcExpressions_return setArcExpressions() throws RecognitionException {
        GraphLangParser.setArcExpressions_return retval = new GraphLangParser.setArcExpressions_return();
        retval.start = input.LT(1);

        Token f=null;
        Token s=null;
        Token a=null;
        Token b=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:5: (f= ID '->' s= ID ( ',' a= ID '->' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:449:8: f= ID '->' s= ID ( ',' a= ID '->' b= ID )*
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1584); 
            match(input,32,FOLLOW_32_in_setArcExpressions1586); 
            s=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1590); 

                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((f!=null?f.getText():null));
                        ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((s!=null?s.getText():null));
                      
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:454:8: ( ',' a= ID '->' b= ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:454:9: ',' a= ID '->' b= ID
            	    {
            	    match(input,19,FOLLOW_19_in_setArcExpressions1613); 
            	    a=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1617); 
            	    match(input,32,FOLLOW_32_in_setArcExpressions1619); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_setArcExpressions1623); 
            	    ((setGraphOperation_scope)setGraphOperation_stack.peek()).firstIdList.add((a!=null?a.getText():null)); ((setGraphOperation_scope)setGraphOperation_stack.peek()).secondIdList.add((b!=null?b.getText():null)); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setArcExpressions"

    public static class variableDeclarationStatement_return extends ParserRuleReturnScope {
        public String tVariableType;
        public ArrayList<String> tVariableList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarationStatement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:459:1: variableDeclarationStatement returns [String tVariableType,ArrayList<String> tVariableList] : variableDeclaration -> {$variableDeclaration.st};
    public final GraphLangParser.variableDeclarationStatement_return variableDeclarationStatement() throws RecognitionException {
        GraphLangParser.variableDeclarationStatement_return retval = new GraphLangParser.variableDeclarationStatement_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclaration_return variableDeclaration39 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:460:4: ( variableDeclaration -> {$variableDeclaration.st})
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:460:6: variableDeclaration
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationStatement1650);
            variableDeclaration39=variableDeclaration();

            state._fsp--;



            // TEMPLATE REWRITE
            // 460:26: -> {$variableDeclaration.st}
            {
                retval.st = (variableDeclaration39!=null?variableDeclaration39.st:null);
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarationStatement"

    protected static class variableDeclaration_scope {
        String varType;
    }
    protected Stack variableDeclaration_stack = new Stack();

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        public String tVariableType;
        public ArrayList<String> tVariableList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:465:1: variableDeclaration returns [String tVariableType,ArrayList<String> tVariableList] : TYPE variableDeclarators -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableListadditionPart=additionPart);
    public final GraphLangParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_stack.push(new variableDeclaration_scope());
        GraphLangParser.variableDeclaration_return retval = new GraphLangParser.variableDeclaration_return();
        retval.start = input.LT(1);

        Token TYPE40=null;
        GraphLangParser.variableDeclarators_return variableDeclarators41 = null;



          ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:5: ( TYPE variableDeclarators -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableListadditionPart=additionPart))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:472:9: TYPE variableDeclarators
            {
            TYPE40=(Token)match(input,TYPE,FOLLOW_TYPE_in_variableDeclaration1696); 
            ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = (TYPE40!=null?TYPE40.getText():null);
            pushFollow(FOLLOW_variableDeclarators_in_variableDeclaration1700);
            variableDeclarators41=variableDeclarators();

            state._fsp--;

            if((TYPE40!=null?TYPE40.getText():null).equals("Text")) ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "String";
            if((TYPE40!=null?TYPE40.getText():null).equals("bool")) ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "boolean";

                      String additionPart="";
                      if((TYPE40!=null?TYPE40.getText():null).equals("String")) additionPart="=\"\"";
                      if((TYPE40!=null?TYPE40.getText():null).equals("Node")) additionPart="=new Node()";
                      if((TYPE40!=null?TYPE40.getText():null).equals("OArc")) additionPart="=new OArc()";
                      if((TYPE40!=null?TYPE40.getText():null).equals("Graph")) additionPart="=new Graph()";
                      if((TYPE40!=null?TYPE40.getText():null).equals("int")) additionPart="=0";
                      if((TYPE40!=null?TYPE40.getText():null).equals("double")) {additionPart="=0"; ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType = "double";}
                    


            // TEMPLATE REWRITE
            // 484:9: -> MyVariableDeclarators(type=$variableDeclaration::varTypelist=$variableDeclarators.tVariableListadditionPart=additionPart)
            {
                retval.st = templateLib.getInstanceOf("MyVariableDeclarators",
              new STAttrMap().put("type", ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType).put("list", (variableDeclarators41!=null?variableDeclarators41.tVariableList:null)).put("additionPart", additionPart));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variableDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class variableDeclarators_return extends ParserRuleReturnScope {
        public ArrayList<String> tVariableList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarators"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:488:1: variableDeclarators returns [ArrayList<String> tVariableList] : a= variableDeclarator ( ',' b= variableDeclarator )* ;
    public final GraphLangParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
        GraphLangParser.variableDeclarators_return retval = new GraphLangParser.variableDeclarators_return();
        retval.start = input.LT(1);

        GraphLangParser.variableDeclarator_return a = null;

        GraphLangParser.variableDeclarator_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:489:5: (a= variableDeclarator ( ',' b= variableDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:490:7: a= variableDeclarator ( ',' b= variableDeclarator )*
            {
            retval.tVariableList = new ArrayList<String>();
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1794);
            a=variableDeclarator();

            state._fsp--;

            retval.tVariableList.add((a!=null?a.tVariableId:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:492:7: ( ',' b= variableDeclarator )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:492:8: ',' b= variableDeclarator
            	    {
            	    match(input,19,FOLLOW_19_in_variableDeclarators1805); 
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1809);
            	    b=variableDeclarator();

            	    state._fsp--;

            	    retval.tVariableList.add((b!=null?b.tVariableId:null));

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarators"

    protected static class variableDeclarator_scope {
        ArrayList<String> varList;
    }
    protected Stack variableDeclarator_stack = new Stack();

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        public String tVariableId;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:495:1: variableDeclarator returns [String tVariableId] : ID ;
    public final GraphLangParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        GraphLangParser.variableDeclarator_return retval = new GraphLangParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Token ID42=null;


          ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList = new ArrayList<String>();

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:502:5: ( ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:502:9: ID
            {
            ID42=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator1844); 

                    if(!names.isDeclaredVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID42!=null?ID42.getText():null)) ){
                      names.addVariable(names.new VariableName(((programm_scope)programm_stack.peek()).curBlock+"."+(ID42!=null?ID42.getText():null), ((variableDeclaration_scope)variableDeclaration_stack.peek()).varType, (ID42!=null?ID42.getLine():0)));
                      ((variableDeclarator_scope)variableDeclarator_stack.peek()).varList.add(((programm_scope)programm_stack.peek()).curBlock+"."+(ID42!=null?ID42.getText():null));
            	      }
            	      else{
            	          errors.add("line "+(ID42!=null?ID42.getLine():0)+": duplicated variable name "+(ID42!=null?ID42.getText():null));
            	      }
            	      retval.tVariableId = (ID42!=null?ID42.getText():null);
                

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variableDeclarator_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class setArcOperation_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "setArcOperation"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:515:1: setArcOperation : id= ID '=' '(' from= ID '->' to= ID ')' -> print(value=\"___\"+$id.text+\".setVertex\"+\"(\"+\"___\"+$from.text+\",\"+\"___\"+$to.text+\")\");
    public final GraphLangParser.setArcOperation_return setArcOperation() throws RecognitionException {
        GraphLangParser.setArcOperation_return retval = new GraphLangParser.setArcOperation_return();
        retval.start = input.LT(1);

        Token id=null;
        Token from=null;
        Token to=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:516:5: (id= ID '=' '(' from= ID '->' to= ID ')' -> print(value=\"___\"+$id.text+\".setVertex\"+\"(\"+\"___\"+$from.text+\",\"+\"___\"+$to.text+\")\"))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:516:8: id= ID '=' '(' from= ID '->' to= ID ')'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1871); 
            match(input,31,FOLLOW_31_in_setArcOperation1873); 
            match(input,14,FOLLOW_14_in_setArcOperation1875); 
            from=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1879); 
            match(input,32,FOLLOW_32_in_setArcOperation1881); 
            to=(Token)match(input,ID,FOLLOW_ID_in_setArcOperation1885); 
            match(input,15,FOLLOW_15_in_setArcOperation1886); 

                    boolean result = names.checkSetArcOperator((id!=null?id.getText():null), (from!=null?from.getText():null), (to!=null?to.getText():null), ((programm_scope)programm_stack.peek()).curBlock, (id!=null?id.getLine():0));
                    if(result==false){
                      names.getAllErrors(errors);
                    }
                  


            // TEMPLATE REWRITE
            // 522:9: -> print(value=\"___\"+$id.text+\".setVertex\"+\"(\"+\"___\"+$from.text+\",\"+\"___\"+$to.text+\")\")
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", "___"+(id!=null?id.getText():null)+".setVertex"+"("+"___"+(from!=null?from.getText():null)+","+"___"+(to!=null?to.getText():null)+")"));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setArcOperation"

    public static class mathTerm_return extends ParserRuleReturnScope {
        public String mathTermType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mathTerm"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:525:1: mathTerm returns [String mathTermType] : ( literal -> print(value=$literal.st) | '(' mathExpression ')' -> print(value=\"(\"+$mathExpression.st+\")\"));
    public final GraphLangParser.mathTerm_return mathTerm() throws RecognitionException {
        GraphLangParser.mathTerm_return retval = new GraphLangParser.mathTerm_return();
        retval.start = input.LT(1);

        GraphLangParser.literal_return literal43 = null;

        GraphLangParser.mathExpression_return mathExpression44 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:526:5: ( literal -> print(value=$literal.st) | '(' mathExpression ')' -> print(value=\"(\"+$mathExpression.st+\")\"))
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||(LA22_0>=BOOLEANLITERAL && LA22_0<=STRING)) ) {
                alt22=1;
            }
            else if ( (LA22_0==14) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:526:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_mathTerm1925);
                    literal43=literal();

                    state._fsp--;

                    retval.mathTermType = (literal43!=null?literal43.literalType:null);


                    // TEMPLATE REWRITE
                    // 526:65: -> print(value=$literal.st)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (literal43!=null?literal43.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:527:8: '(' mathExpression ')'
                    {
                    match(input,14,FOLLOW_14_in_mathTerm1944); 
                    pushFollow(FOLLOW_mathExpression_in_mathTerm1946);
                    mathExpression44=mathExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_mathTerm1948); 
                    retval.mathTermType = (mathExpression44!=null?mathExpression44.mathExpressionType:null);


                    // TEMPLATE REWRITE
                    // 527:94: -> print(value=\"(\"+$mathExpression.st+\")\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", "("+(mathExpression44!=null?mathExpression44.st:null)+")"));
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mathTerm"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public String unaryExpressionType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "unaryExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:530:1: unaryExpression returns [String unaryExpressionType] : ( '+' a= unaryExpression -> print(value=\"+\"+$a.st) | '-' b= unaryExpression -> print(value=\"-\"+$b.st) | mathTerm -> {$mathTerm.st});
    public final GraphLangParser.unaryExpression_return unaryExpression() throws RecognitionException {
        GraphLangParser.unaryExpression_return retval = new GraphLangParser.unaryExpression_return();
        retval.start = input.LT(1);

        GraphLangParser.unaryExpression_return a = null;

        GraphLangParser.unaryExpression_return b = null;

        GraphLangParser.mathTerm_return mathTerm45 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:531:5: ( '+' a= unaryExpression -> print(value=\"+\"+$a.st) | '-' b= unaryExpression -> print(value=\"-\"+$b.st) | mathTerm -> {$mathTerm.st})
            int alt23=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case ID:
            case BOOLEANLITERAL:
            case FLOAT:
            case INT:
            case STRING:
            case 14:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:531:8: '+' a= unaryExpression
                    {
                    match(input,33,FOLLOW_33_in_unaryExpression1980); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1984);
                    a=unaryExpression();

                    state._fsp--;

                    retval.unaryExpressionType = (a!=null?a.unaryExpressionType:null);


                    // TEMPLATE REWRITE
                    // 531:95: -> print(value=\"+\"+$a.st)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", "+"+(a!=null?a.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:532:8: '-' b= unaryExpression
                    {
                    match(input,34,FOLLOW_34_in_unaryExpression2003); 
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2007);
                    b=unaryExpression();

                    state._fsp--;

                    retval.unaryExpressionType = (b!=null?b.unaryExpressionType:null);


                    // TEMPLATE REWRITE
                    // 532:95: -> print(value=\"-\"+$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", "-"+(b!=null?b.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:533:8: mathTerm
                    {
                    pushFollow(FOLLOW_mathTerm_in_unaryExpression2026);
                    mathTerm45=mathTerm();

                    state._fsp--;

                    retval.unaryExpressionType = (mathTerm45!=null?mathTerm45.mathTermType:null);


                    // TEMPLATE REWRITE
                    // 533:82: -> {$mathTerm.st}
                    {
                        retval.st = (mathTerm45!=null?mathTerm45.st:null);
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public String multiplicativeExpressionType;
        public String textValue;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multiplicativeExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:538:1: multiplicativeExpression returns [String multiplicativeExpressionType, String textValue] : a= unaryExpression ( (c= '*' | c= '/' ) b= unaryExpression )* -> print(value=$a.st+tmp);
    public final GraphLangParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        GraphLangParser.multiplicativeExpression_return retval = new GraphLangParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Token c=null;
        GraphLangParser.unaryExpression_return a = null;

        GraphLangParser.unaryExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:539:5: (a= unaryExpression ( (c= '*' | c= '/' ) b= unaryExpression )* -> print(value=$a.st+tmp))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:539:7: a= unaryExpression ( (c= '*' | c= '/' ) b= unaryExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            String tmp="";
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2072);
            a=unaryExpression();

            state._fsp--;

            type.add((a!=null?a.unaryExpressionType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:541:61: ( (c= '*' | c= '/' ) b= unaryExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=35 && LA25_0<=36)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:541:62: (c= '*' | c= '/' ) b= unaryExpression
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:541:62: (c= '*' | c= '/' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==35) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==36) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:541:63: c= '*'
            	            {
            	            c=(Token)match(input,35,FOLLOW_35_in_multiplicativeExpression2080); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:541:69: c= '/'
            	            {
            	            c=(Token)match(input,36,FOLLOW_36_in_multiplicativeExpression2084); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2089);
            	    b=unaryExpression();

            	    state._fsp--;

            	    tmp+=(c!=null?c.getText():null); tmp+=(b!=null?b.st:null); type.add((b!=null?b.unaryExpressionType:null));

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


                      retval.multiplicativeExpressionType = typeCheker.checkMathExpressionTypes(type);
                  

                    

                  


            // TEMPLATE REWRITE
            // 549:7: -> print(value=$a.st+tmp)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (a!=null?a.st:null)+tmp));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class mathExpression_return extends ParserRuleReturnScope {
        public String mathExpressionType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mathExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:552:1: mathExpression returns [String mathExpressionType] : a= multiplicativeExpression ( (c= '-' | c= '+' ) b= multiplicativeExpression )* -> print(value=$a.st +tmp);
    public final GraphLangParser.mathExpression_return mathExpression() throws RecognitionException {
        GraphLangParser.mathExpression_return retval = new GraphLangParser.mathExpression_return();
        retval.start = input.LT(1);

        Token c=null;
        GraphLangParser.multiplicativeExpression_return a = null;

        GraphLangParser.multiplicativeExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:553:5: (a= multiplicativeExpression ( (c= '-' | c= '+' ) b= multiplicativeExpression )* -> print(value=$a.st +tmp))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:553:9: a= multiplicativeExpression ( (c= '-' | c= '+' ) b= multiplicativeExpression )*
            {
            ArrayList<String> type = new ArrayList<String>();
            String tmp=""; 
            String tmp2="";
            pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression2181);
            a=multiplicativeExpression();

            state._fsp--;

            type.add((a!=null?a.multiplicativeExpressionType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:556:82: ( (c= '-' | c= '+' ) b= multiplicativeExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=33 && LA27_0<=34)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:556:83: (c= '-' | c= '+' ) b= multiplicativeExpression
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:556:83: (c= '-' | c= '+' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==34) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==33) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:556:84: c= '-'
            	            {
            	            c=(Token)match(input,34,FOLLOW_34_in_mathExpression2190); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:556:90: c= '+'
            	            {
            	            c=(Token)match(input,33,FOLLOW_33_in_mathExpression2194); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_mathExpression2199);
            	    b=multiplicativeExpression();

            	    state._fsp--;

            	    tmp+=(c!=null?c.getText():null); tmp+=(b!=null?b.st:null); type.add((b!=null?b.multiplicativeExpressionType:null));

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


                      retval.mathExpressionType = typeCheker.checkMathExpressionTypes(type);
                    


            // TEMPLATE REWRITE
            // 561:9: -> print(value=$a.st +tmp)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (a!=null?a.st:null) +tmp));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mathExpression"

    public static class logicalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:566:1: logicalExpression : a= relationExpression ( (c= '&&' | c= '||' ) b= relationExpression )* -> print(value=$a.st+tmp);
    public final GraphLangParser.logicalExpression_return logicalExpression() throws RecognitionException {
        GraphLangParser.logicalExpression_return retval = new GraphLangParser.logicalExpression_return();
        retval.start = input.LT(1);

        Token c=null;
        GraphLangParser.relationExpression_return a = null;

        GraphLangParser.relationExpression_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:567:4: (a= relationExpression ( (c= '&&' | c= '||' ) b= relationExpression )* -> print(value=$a.st+tmp))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:567:6: a= relationExpression ( (c= '&&' | c= '||' ) b= relationExpression )*
            {
            String tmp="";
            pushFollow(FOLLOW_relationExpression_in_logicalExpression2276);
            a=relationExpression();

            state._fsp--;

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:568:27: ( (c= '&&' | c= '||' ) b= relationExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=37 && LA29_0<=38)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:568:28: (c= '&&' | c= '||' ) b= relationExpression
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:568:28: (c= '&&' | c= '||' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==37) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==38) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:568:29: c= '&&'
            	            {
            	            c=(Token)match(input,37,FOLLOW_37_in_logicalExpression2282); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:568:36: c= '||'
            	            {
            	            c=(Token)match(input,38,FOLLOW_38_in_logicalExpression2286); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationExpression_in_logicalExpression2291);
            	    b=relationExpression();

            	    state._fsp--;

            	    tmp+=(c!=null?c.getText():null); tmp+=(b!=null?b.st:null);

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 569:6: -> print(value=$a.st+tmp)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (a!=null?a.st:null)+tmp));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalExpression"

    public static class relationExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationExpression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:573:1: relationExpression : ( '(' logicalExpression ')' -> print(value=\"(\"+$logicalExpression.st+\")\") | t1= logicalAtom RELATIONALOP t2= logicalAtom -> print(value=$t1.st+$RELATIONALOP.text+$t2.st)) ;
    public final GraphLangParser.relationExpression_return relationExpression() throws RecognitionException {
        GraphLangParser.relationExpression_return retval = new GraphLangParser.relationExpression_return();
        retval.start = input.LT(1);

        Token RELATIONALOP47=null;
        GraphLangParser.logicalAtom_return t1 = null;

        GraphLangParser.logicalAtom_return t2 = null;

        GraphLangParser.logicalExpression_return logicalExpression46 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:574:5: ( ( '(' logicalExpression ')' -> print(value=\"(\"+$logicalExpression.st+\")\") | t1= logicalAtom RELATIONALOP t2= logicalAtom -> print(value=$t1.st+$RELATIONALOP.text+$t2.st)) )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:574:8: ( '(' logicalExpression ')' -> print(value=\"(\"+$logicalExpression.st+\")\") | t1= logicalAtom RELATIONALOP t2= logicalAtom -> print(value=$t1.st+$RELATIONALOP.text+$t2.st))
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:574:8: ( '(' logicalExpression ')' -> print(value=\"(\"+$logicalExpression.st+\")\") | t1= logicalAtom RELATIONALOP t2= logicalAtom -> print(value=$t1.st+$RELATIONALOP.text+$t2.st))
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            else if ( (LA30_0==ID||(LA30_0>=BOOLEANLITERAL && LA30_0<=STRING)||LA30_0==39) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:574:9: '(' logicalExpression ')'
                    {
                    match(input,14,FOLLOW_14_in_relationExpression2328); 
                    pushFollow(FOLLOW_logicalExpression_in_relationExpression2330);
                    logicalExpression46=logicalExpression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_relationExpression2332); 


                    // TEMPLATE REWRITE
                    // 574:35: -> print(value=\"(\"+$logicalExpression.st+\")\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", "("+(logicalExpression46!=null?logicalExpression46.st:null)+")"));
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:575:8: t1= logicalAtom RELATIONALOP t2= logicalAtom
                    {
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression2351);
                    t1=logicalAtom();

                    state._fsp--;

                    RELATIONALOP47=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_relationExpression2354); 
                    pushFollow(FOLLOW_logicalAtom_in_relationExpression2358);
                    t2=logicalAtom();

                    state._fsp--;


                              if(!(t1!=null?t1.atomType:null).equals((t2!=null?t2.atomType:null))){
                                if((t1!=null?t1.atomType:null).equals("null")){
                                  if(!(t2!=null?t2.atomType:null).equals("OArc") && !(t2!=null?t2.atomType:null).equals("Graph") && !(t2!=null?t2.atomType:null).equals("Node") && !(t2!=null?t2.atomType:null).equals("String")){
                                      errors.add("line "+(RELATIONALOP47!=null?RELATIONALOP47.getLine():0)+": the operator "+(RELATIONALOP47!=null?RELATIONALOP47.getText():null) +" is undefined for arguments null,"+(t2!=null?t2.atomType:null));
                                  }
                                }
                                else if((t2!=null?t2.atomType:null).equals("null")){
                                  if(!(t1!=null?t1.atomType:null).equals("OArc") && !(t1!=null?t1.atomType:null).equals("Graph") && !(t1!=null?t1.atomType:null).equals("Node") && !(t1!=null?t1.atomType:null).equals("String")){
                                      errors.add("line "+(RELATIONALOP47!=null?RELATIONALOP47.getLine():0)+": the operator "+(RELATIONALOP47!=null?RELATIONALOP47.getText():null) +" is undefined for arguments null,"+(t2!=null?t2.atomType:null));
                                  }
                                }
                                else {
                                  errors.add("line "+(RELATIONALOP47!=null?RELATIONALOP47.getLine():0)+": the operator "+(RELATIONALOP47!=null?RELATIONALOP47.getText():null) +" is undefined for arguments "+(t1!=null?t1.atomType:null)+","+(t2!=null?t2.atomType:null));
                                }
                                
                              }
                           


                    // TEMPLATE REWRITE
                    // 593:10: -> print(value=$t1.st+$RELATIONALOP.text+$t2.st)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (t1!=null?t1.st:null)+(RELATIONALOP47!=null?RELATIONALOP47.getText():null)+(t2!=null?t2.st:null)));
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationExpression"

    public static class logicalAtom_return extends ParserRuleReturnScope {
        public String atomType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalAtom"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:598:1: logicalAtom returns [String atomType] : ( intLiteral -> {$intLiteral.st} | floatLiteral -> {$floatLiteral.st} | idLiteral -> {$idLiteral.st} | stringLiteral -> {$stringLiteral.st} | BOOLEANLITERAL -> print(value=$BOOLEANLITERAL.text) | callClassMethod -> {$callClassMethod.st;} | callInlineFunction -> {$callInlineFunction.st;} | nullLiteral -> print(value=\"null\"));
    public final GraphLangParser.logicalAtom_return logicalAtom() throws RecognitionException {
        GraphLangParser.logicalAtom_return retval = new GraphLangParser.logicalAtom_return();
        retval.start = input.LT(1);

        Token BOOLEANLITERAL52=null;
        GraphLangParser.intLiteral_return intLiteral48 = null;

        GraphLangParser.floatLiteral_return floatLiteral49 = null;

        GraphLangParser.idLiteral_return idLiteral50 = null;

        GraphLangParser.stringLiteral_return stringLiteral51 = null;

        GraphLangParser.callClassMethod_return callClassMethod53 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction54 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:599:5: ( intLiteral -> {$intLiteral.st} | floatLiteral -> {$floatLiteral.st} | idLiteral -> {$idLiteral.st} | stringLiteral -> {$stringLiteral.st} | BOOLEANLITERAL -> print(value=$BOOLEANLITERAL.text) | callClassMethod -> {$callClassMethod.st;} | callInlineFunction -> {$callInlineFunction.st;} | nullLiteral -> print(value=\"null\"))
            int alt31=8;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:599:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_logicalAtom2409);
                    intLiteral48=intLiteral();

                    state._fsp--;

                    retval.atomType = "int"; 


                    // TEMPLATE REWRITE
                    // 599:42: -> {$intLiteral.st}
                    {
                        retval.st = (intLiteral48!=null?intLiteral48.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:600:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_logicalAtom2424);
                    floatLiteral49=floatLiteral();

                    state._fsp--;

                    retval.atomType = "double"; 


                    // TEMPLATE REWRITE
                    // 600:47: -> {$floatLiteral.st}
                    {
                        retval.st = (floatLiteral49!=null?floatLiteral49.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:601:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_logicalAtom2439);
                    idLiteral50=idLiteral();

                    state._fsp--;

                    retval.atomType = (idLiteral50!=null?idLiteral50.idType:null);


                    // TEMPLATE REWRITE
                    // 601:52: -> {$idLiteral.st}
                    {
                        retval.st = (idLiteral50!=null?idLiteral50.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:602:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_logicalAtom2454);
                    stringLiteral51=stringLiteral();

                    state._fsp--;

                    retval.atomType = "String"; 


                    // TEMPLATE REWRITE
                    // 602:48: -> {$stringLiteral.st}
                    {
                        retval.st = (stringLiteral51!=null?stringLiteral51.st:null);
                    }


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:603:9: BOOLEANLITERAL
                    {
                    BOOLEANLITERAL52=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_logicalAtom2469); 
                    retval.atomType = "bool"; 


                    // TEMPLATE REWRITE
                    // 603:47: -> print(value=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (BOOLEANLITERAL52!=null?BOOLEANLITERAL52.getText():null)));
                    }


                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:604:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_logicalAtom2489);
                    callClassMethod53=callClassMethod();

                    state._fsp--;

                    retval.atomType = (callClassMethod53!=null?callClassMethod53.methodType:null);


                    // TEMPLATE REWRITE
                    // 604:68: -> {$callClassMethod.st;}
                    {
                        retval.st = (callClassMethod53!=null?callClassMethod53.st:null);;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:605:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_logicalAtom2504);
                    callInlineFunction54=callInlineFunction();

                    state._fsp--;

                    retval.atomType = (callInlineFunction54!=null?callInlineFunction54.functionType:null);


                    // TEMPLATE REWRITE
                    // 605:76: -> {$callInlineFunction.st;}
                    {
                        retval.st = (callInlineFunction54!=null?callInlineFunction54.st:null);;
                    }


                    }
                    break;
                case 8 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:606:9: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_logicalAtom2519);
                    nullLiteral();

                    state._fsp--;

                    retval.atomType = "null";


                    // TEMPLATE REWRITE
                    // 606:43: -> print(value=\"null\")
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", "null"));
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalAtom"

    public static class nullLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "nullLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:610:1: nullLiteral : 'null' ;
    public final GraphLangParser.nullLiteral_return nullLiteral() throws RecognitionException {
        GraphLangParser.nullLiteral_return retval = new GraphLangParser.nullLiteral_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:611:5: ( 'null' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:611:7: 'null'
            {
            match(input,39,FOLLOW_39_in_nullLiteral2551); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nullLiteral"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentOperator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:623:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' );
    public final GraphLangParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        GraphLangParser.assignmentOperator_return retval = new GraphLangParser.assignmentOperator_return();
        retval.start = input.LT(1);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:624:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:
            {
            if ( input.LA(1)==31||(input.LA(1)>=40 && input.LA(1)<=44) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class literal_return extends ParserRuleReturnScope {
        public String literalType;
        public String literalValue;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:643:1: literal returns [String literalType, String literalValue] : ( intLiteral -> {$intLiteral.st;} | floatLiteral -> {$floatLiteral.st;} | idLiteral -> {$idLiteral.st;} | stringLiteral -> {$stringLiteral.st;} | BOOLEANLITERAL -> print(value=$BOOLEANLITERAL.text) | callClassMethod -> {$callClassMethod.st;} | callInlineFunction -> {$callInlineFunction.st;});
    public final GraphLangParser.literal_return literal() throws RecognitionException {
        GraphLangParser.literal_return retval = new GraphLangParser.literal_return();
        retval.start = input.LT(1);

        Token BOOLEANLITERAL59=null;
        GraphLangParser.intLiteral_return intLiteral55 = null;

        GraphLangParser.floatLiteral_return floatLiteral56 = null;

        GraphLangParser.idLiteral_return idLiteral57 = null;

        GraphLangParser.stringLiteral_return stringLiteral58 = null;

        GraphLangParser.callClassMethod_return callClassMethod60 = null;

        GraphLangParser.callInlineFunction_return callInlineFunction61 = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:644:5: ( intLiteral -> {$intLiteral.st;} | floatLiteral -> {$floatLiteral.st;} | idLiteral -> {$idLiteral.st;} | stringLiteral -> {$stringLiteral.st;} | BOOLEANLITERAL -> print(value=$BOOLEANLITERAL.text) | callClassMethod -> {$callClassMethod.st;} | callInlineFunction -> {$callInlineFunction.st;})
            int alt32=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt32=1;
                }
                break;
            case FLOAT:
                {
                alt32=2;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt32=6;
                    }
                    break;
                case 14:
                    {
                    alt32=7;
                    }
                    break;
                case 13:
                case 15:
                case 19:
                case 33:
                case 34:
                case 35:
                case 36:
                    {
                    alt32=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }

                }
                break;
            case STRING:
                {
                alt32=4;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:644:9: intLiteral
                    {
                    pushFollow(FOLLOW_intLiteral_in_literal2773);
                    intLiteral55=intLiteral();

                    state._fsp--;

                    retval.literalType = "int"; retval.literalValue =(intLiteral55!=null?input.toString(intLiteral55.start,intLiteral55.stop):null);


                    // TEMPLATE REWRITE
                    // 644:76: -> {$intLiteral.st;}
                    {
                        retval.st = (intLiteral55!=null?intLiteral55.st:null);;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:645:9: floatLiteral
                    {
                    pushFollow(FOLLOW_floatLiteral_in_literal2788);
                    floatLiteral56=floatLiteral();

                    state._fsp--;

                    retval.literalType = "double"; retval.literalValue =(floatLiteral56!=null?input.toString(floatLiteral56.start,floatLiteral56.stop):null);


                    // TEMPLATE REWRITE
                    // 645:83: -> {$floatLiteral.st;}
                    {
                        retval.st = (floatLiteral56!=null?floatLiteral56.st:null);;
                    }


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:646:9: idLiteral
                    {
                    pushFollow(FOLLOW_idLiteral_in_literal2803);
                    idLiteral57=idLiteral();

                    state._fsp--;

                    retval.literalType = (idLiteral57!=null?idLiteral57.idType:null); retval.literalValue =(idLiteral57!=null?input.toString(idLiteral57.start,idLiteral57.stop):null);


                    // TEMPLATE REWRITE
                    // 646:86: -> {$idLiteral.st;}
                    {
                        retval.st = (idLiteral57!=null?idLiteral57.st:null);;
                    }


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:647:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_literal2818);
                    stringLiteral58=stringLiteral();

                    state._fsp--;

                    retval.literalType = "String"; retval.literalValue =(stringLiteral58!=null?input.toString(stringLiteral58.start,stringLiteral58.stop):null);


                    // TEMPLATE REWRITE
                    // 647:85: -> {$stringLiteral.st;}
                    {
                        retval.st = (stringLiteral58!=null?stringLiteral58.st:null);;
                    }


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:648:9: BOOLEANLITERAL
                    {
                    BOOLEANLITERAL59=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literal2833); 
                    retval.literalType = "bool"; retval.literalValue =(BOOLEANLITERAL59!=null?BOOLEANLITERAL59.getText():null); 


                    // TEMPLATE REWRITE
                    // 648:86: -> print(value=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("print",
                      new STAttrMap().put("value", (BOOLEANLITERAL59!=null?BOOLEANLITERAL59.getText():null)));
                    }


                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:649:9: callClassMethod
                    {
                    pushFollow(FOLLOW_callClassMethod_in_literal2853);
                    callClassMethod60=callClassMethod();

                    state._fsp--;

                    retval.literalType = (callClassMethod60!=null?callClassMethod60.methodType:null);  retval.literalValue ="callClassMethod\n"; 


                    // TEMPLATE REWRITE
                    // 649:108: -> {$callClassMethod.st;}
                    {
                        retval.st = (callClassMethod60!=null?callClassMethod60.st:null);;
                    }


                    }
                    break;
                case 7 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:650:9: callInlineFunction
                    {
                    pushFollow(FOLLOW_callInlineFunction_in_literal2868);
                    callInlineFunction61=callInlineFunction();

                    state._fsp--;

                    retval.literalType = (callInlineFunction61!=null?callInlineFunction61.functionType:null); retval.literalValue ="callInlineFunction\n";


                    // TEMPLATE REWRITE
                    // 650:117: -> {$callInlineFunction.st;}
                    {
                        retval.st = (callInlineFunction61!=null?callInlineFunction61.st:null);;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class argumentList_return extends ParserRuleReturnScope {
        public ArrayList<String> argumentTypeList;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "argumentList"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:653:1: argumentList returns [ArrayList<String> argumentTypeList] : a= literal ( ',' b= literal )* -> print(value=$a.st+tmp);
    public final GraphLangParser.argumentList_return argumentList() throws RecognitionException {
        GraphLangParser.argumentList_return retval = new GraphLangParser.argumentList_return();
        retval.start = input.LT(1);

        GraphLangParser.literal_return a = null;

        GraphLangParser.literal_return b = null;


        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:654:3: (a= literal ( ',' b= literal )* -> print(value=$a.st+tmp))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:654:6: a= literal ( ',' b= literal )*
            {

                    retval.argumentTypeList = new ArrayList<String>();
                    String tmp="";
                 
            pushFollow(FOLLOW_literal_in_argumentList2900);
            a=literal();

            state._fsp--;

            retval.argumentTypeList.add((a!=null?a.literalType:null));
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:659:3: ( ',' b= literal )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:659:4: ',' b= literal
            	    {
            	    match(input,19,FOLLOW_19_in_argumentList2909); 
            	    pushFollow(FOLLOW_literal_in_argumentList2913);
            	    b=literal();

            	    state._fsp--;

            	    retval.argumentTypeList.add((b!=null?b.literalType:null)); tmp+=","; tmp+=(b!=null?b.st:null);

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 660:5: -> print(value=$a.st+tmp)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (a!=null?a.st:null)+tmp));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentList"

    public static class floatLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "floatLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:663:1: floatLiteral : FLOAT -> print(value=$FLOAT.text);
    public final GraphLangParser.floatLiteral_return floatLiteral() throws RecognitionException {
        GraphLangParser.floatLiteral_return retval = new GraphLangParser.floatLiteral_return();
        retval.start = input.LT(1);

        Token FLOAT62=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:664:3: ( FLOAT -> print(value=$FLOAT.text))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:664:5: FLOAT
            {
            FLOAT62=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_floatLiteral2943); 


            // TEMPLATE REWRITE
            // 664:11: -> print(value=$FLOAT.text)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (FLOAT62!=null?FLOAT62.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "floatLiteral"

    public static class idLiteral_return extends ParserRuleReturnScope {
        public String idType;
        public int curLine;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "idLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:667:1: idLiteral returns [String idType, int curLine] : ID -> print(value=\"___\"+$ID.text);
    public final GraphLangParser.idLiteral_return idLiteral() throws RecognitionException {
        GraphLangParser.idLiteral_return retval = new GraphLangParser.idLiteral_return();
        retval.start = input.LT(1);

        Token ID63=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:668:3: ( ID -> print(value=\"___\"+$ID.text))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:668:5: ID
            {
            ID63=(Token)match(input,ID,FOLLOW_ID_in_idLiteral2968); 

                  retval.curLine = (ID63!=null?ID63.getLine():0);
                  //System.out.println(((programm_scope)programm_stack.peek()).curBlock+"."+(ID63!=null?ID63.getText():null));
                  if(!names.isExistVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID63!=null?ID63.getText():null))){
                    errors.add("line "+(ID63!=null?ID63.getLine():0)+": unknown variable "+(ID63!=null?ID63.getText():null));
                    retval.idType = "";
                  }
                  else{
                    //names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID63!=null?ID63.getText():null)).addLineUses((ID63!=null?ID63.getLine():0));
                    if(names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID63!=null?ID63.getText():null))!=null) retval.idType = names.getVariable(((programm_scope)programm_stack.peek()).curBlock+"."+(ID63!=null?ID63.getText():null)).getType();
                  }
                


            // TEMPLATE REWRITE
            // 681:5: -> print(value=\"___\"+$ID.text)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", "___"+(ID63!=null?ID63.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idLiteral"

    public static class intLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "intLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:684:1: intLiteral : INT -> print(value=$INT.text);
    public final GraphLangParser.intLiteral_return intLiteral() throws RecognitionException {
        GraphLangParser.intLiteral_return retval = new GraphLangParser.intLiteral_return();
        retval.start = input.LT(1);

        Token INT64=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:685:3: ( INT -> print(value=$INT.text))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:685:5: INT
            {
            INT64=(Token)match(input,INT,FOLLOW_INT_in_intLiteral3001); 


            // TEMPLATE REWRITE
            // 685:9: -> print(value=$INT.text)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (INT64!=null?INT64.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "intLiteral"

    public static class stringLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stringLiteral"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:688:1: stringLiteral : STRING -> print(value=$STRING.text);
    public final GraphLangParser.stringLiteral_return stringLiteral() throws RecognitionException {
        GraphLangParser.stringLiteral_return retval = new GraphLangParser.stringLiteral_return();
        retval.start = input.LT(1);

        Token STRING65=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:689:3: ( STRING -> print(value=$STRING.text))
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\GraphLang\\src\\graphlang\\GraphLang.g:689:6: STRING
            {
            STRING65=(Token)match(input,STRING,FOLLOW_STRING_in_stringLiteral3023); 


            // TEMPLATE REWRITE
            // 689:13: -> print(value=$STRING.text)
            {
                retval.st = templateLib.getInstanceOf("print",
              new STAttrMap().put("value", (STRING65!=null?STRING65.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stringLiteral"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA12_eotS =
        "\17\uffff";
    static final String DFA12_eofS =
        "\17\uffff";
    static final String DFA12_minS =
        "\1\5\5\uffff\1\16\1\5\3\uffff\1\5\1\16\2\uffff";
    static final String DFA12_maxS =
        "\1\32\5\uffff\1\54\1\42\3\uffff\1\42\1\44\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\11\1\12\1\6\2\uffff\1\10"+
        "\1\7";
    static final String DFA12_specialS =
        "\17\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\17\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\11\17\uffff\1\10\1\7\10\uffff\5\12",
            "\1\12\1\uffff\4\12\3\uffff\1\13\22\uffff\2\12",
            "",
            "",
            "",
            "\1\14\1\uffff\4\12\3\uffff\1\12\1\uffff\1\15\20\uffff\2\12",
            "\2\12\16\uffff\1\12\1\uffff\1\16\4\12",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "168:1: statement : ( 'if' '(' logicalExpression ')' a= block ( 'else' b= block )? -> MyIfStatement(logicalExpr=$logicalExpression.stblockIf=$a.stblockElse=$b.st) | 'for' '(' forControl ')' a= block -> MyForControl(expr=$forControl.stblock=$a.st) | 'foreach' '(' foreachControl ')' block -> MyForeachStatment(expr=$foreachControl.stblock=$block.st) | 'while' '(' logicalExpression ')' block -> MyWhileStatement(logicalExpr=$logicalExpression.stblock=$block.st) | 'do' block 'while' '(' logicalExpression ')' ';' -> MyDoWhileStatement(logicalExpr=$logicalExpression.stblock=$block.st) | assignmentOperation ';' -> {$assignmentOperation.st} | setArcOperation ';' -> print(value=$setArcOperation.st+\";\\n\") | setGraphOperation ';' -> print(value=$setGraphOperation.st+\";\\n\") | callClassMethod ';' -> print(value=$callClassMethod.st+\";\\n\") | callInlineFunction ';' -> print(value=$callInlineFunction.st+\";\\n\"));";
        }
    }
    static final String DFA31_eotS =
        "\12\uffff";
    static final String DFA31_eofS =
        "\12\uffff";
    static final String DFA31_minS =
        "\1\5\2\uffff\1\6\6\uffff";
    static final String DFA31_maxS =
        "\1\47\2\uffff\1\46\6\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\10\1\6\1\7\1\3";
    static final String DFA31_specialS =
        "\12\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\3\1\uffff\1\5\1\2\1\1\1\4\34\uffff\1\6",
            "",
            "",
            "\1\11\7\uffff\1\10\1\11\16\uffff\1\7\6\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "598:1: logicalAtom returns [String atomType] : ( intLiteral -> {$intLiteral.st} | floatLiteral -> {$floatLiteral.st} | idLiteral -> {$idLiteral.st} | stringLiteral -> {$stringLiteral.st} | BOOLEANLITERAL -> print(value=$BOOLEANLITERAL.text) | callClassMethod -> {$callClassMethod.st;} | callInlineFunction -> {$callInlineFunction.st;} | nullLiteral -> print(value=\"null\"));";
        }
    }
 

    public static final BitSet FOLLOW_globalExpression_in_programm73 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_mainBlock_in_programm79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalExpression108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_globalExpression126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_globalVariableDeclaration158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_globalVariableDeclaration160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_functionDeclaration196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration207 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDeclaration220 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_functionArgumentList_in_functionDeclaration222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_functionDeclaration225 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDeclaration258 = new BitSet(new long[]{0x0000000007A60030L});
    public static final BitSet FOLLOW_blockStatement_in_functionDeclaration262 = new BitSet(new long[]{0x0000000007A60030L});
    public static final BitSet FOLLOW_returnOperator_in_functionDeclaration266 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDeclaration269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_returnOperator370 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_ID_in_returnOperator372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_returnOperator375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList405 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_functionArgumentList408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_functionArgumentDeclarator_in_functionArgumentList410 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_TYPE_in_functionArgumentDeclarator430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_functionArgumentDeclarator432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_mainBlock468 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_mainBlock470 = new BitSet(new long[]{0x0000000007A20030L});
    public static final BitSet FOLLOW_blockStatement_in_mainBlock474 = new BitSet(new long[]{0x0000000007A20030L});
    public static final BitSet FOLLOW_17_in_mainBlock477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarationStatement_in_blockStatement507 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_blockStatement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_block553 = new BitSet(new long[]{0x0000000007A20030L});
    public static final BitSet FOLLOW_statement_in_block557 = new BitSet(new long[]{0x0000000007A20030L});
    public static final BitSet FOLLOW_17_in_block560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_statement587 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement589 = new BitSet(new long[]{0x0000008007A047B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement591 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement597 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_statement600 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_forControl_in_statement636 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement638 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement664 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_foreachControl_in_statement668 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement670 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement694 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement696 = new BitSet(new long[]{0x0000008007A047B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement698 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement700 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_statement724 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statement727 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement729 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement731 = new BitSet(new long[]{0x0000008007A047B0L});
    public static final BitSet FOLLOW_logicalExpression_in_statement733 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement735 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperation_in_statement759 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setArcOperation_in_statement774 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setGraphOperation_in_statement794 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_statement814 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_statement834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl888 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_foreachControl890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idLiteral_in_foreachControl894 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_foreachControl897 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_foreachType_in_foreachControl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_foreachType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_forControl999 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_forControl1001 = new BitSet(new long[]{0x0000000007A00230L});
    public static final BitSet FOLLOW_forLiteral_in_forControl1005 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_forControl1007 = new BitSet(new long[]{0x0000000007A00230L});
    public static final BitSet FOLLOW_forLiteral_in_forControl1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_forLiteral1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forLiteral1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_forLiteral1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_forLiteral1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_forInit1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callInlineFunction1164 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callInlineFunction1166 = new BitSet(new long[]{0x0000000007A087B0L});
    public static final BitSet FOLLOW_argumentList_in_callInlineFunction1168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_callInlineFunction1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callClassMethod1222 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_callClassMethod1224 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_callClassMethod1239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_callClassMethod1263 = new BitSet(new long[]{0x0000000007A087B0L});
    public static final BitSet FOLLOW_argumentList_in_callClassMethod1265 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_callClassMethod1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentOperation1339 = new BitSet(new long[]{0x00001F0080000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentOperation1376 = new BitSet(new long[]{0x0000000607A047B0L});
    public static final BitSet FOLLOW_mathExpression_in_assignmentOperation1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setGraphOperation1457 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_setGraphOperation1459 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setGraphOperation1461 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation1464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_setGraphOperation1466 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_setGraphOperation1468 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_setGraphOperation1470 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_setGraphOperation1472 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_setArcExpressions_in_setGraphOperation1474 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_setGraphOperation1477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setGraphOperation1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList1547 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_variableList1552 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList1556 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1584 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_setArcExpressions1586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1590 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_setArcExpressions1613 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1617 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_setArcExpressions1619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcExpressions1623 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationStatement1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_variableDeclaration1696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarators_in_variableDeclaration1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1794 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_variableDeclarators1805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1809 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1871 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_setArcOperation1873 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_setArcOperation1875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1879 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_setArcOperation1881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_setArcOperation1885 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_setArcOperation1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_mathTerm1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_mathTerm1944 = new BitSet(new long[]{0x0000000607A047B0L});
    public static final BitSet FOLLOW_mathExpression_in_mathTerm1946 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_mathTerm1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_unaryExpression1980 = new BitSet(new long[]{0x0000000607A047B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_unaryExpression2003 = new BitSet(new long[]{0x0000000607A047B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mathTerm_in_unaryExpression2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2072 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_multiplicativeExpression2080 = new BitSet(new long[]{0x0000000607A047B0L});
    public static final BitSet FOLLOW_36_in_multiplicativeExpression2084 = new BitSet(new long[]{0x0000000607A047B0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2089 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression2181 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_34_in_mathExpression2190 = new BitSet(new long[]{0x0000000607A047B0L});
    public static final BitSet FOLLOW_33_in_mathExpression2194 = new BitSet(new long[]{0x0000000607A047B0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_mathExpression2199 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression2276 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_logicalExpression2282 = new BitSet(new long[]{0x0000008007A047B0L});
    public static final BitSet FOLLOW_38_in_logicalExpression2286 = new BitSet(new long[]{0x0000008007A047B0L});
    public static final BitSet FOLLOW_relationExpression_in_logicalExpression2291 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_14_in_relationExpression2328 = new BitSet(new long[]{0x0000008007A047B0L});
    public static final BitSet FOLLOW_logicalExpression_in_relationExpression2330 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_relationExpression2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression2351 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_relationExpression2354 = new BitSet(new long[]{0x0000008007A047B0L});
    public static final BitSet FOLLOW_logicalAtom_in_relationExpression2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_logicalAtom2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_logicalAtom2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_logicalAtom2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_logicalAtom2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_logicalAtom2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_logicalAtom2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_logicalAtom2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_logicalAtom2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nullLiteral2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLiteral_in_literal2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatLiteral_in_literal2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idLiteral_in_literal2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_literal2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literal2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callClassMethod_in_literal2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callInlineFunction_in_literal2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_argumentList2900 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_argumentList2909 = new BitSet(new long[]{0x0000000007A007B0L});
    public static final BitSet FOLLOW_literal_in_argumentList2913 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_FLOAT_in_floatLiteral2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idLiteral2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_intLiteral3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral3023 = new BitSet(new long[]{0x0000000000000002L});

}