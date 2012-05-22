// $ANTLR 3.4 Php.g 2012-05-06 22:24:42

package it.freax.fpm.test.main; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PhpParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "AccessModifier", "Ampersand", "And", "Apply", "Array", "ArrayAssign", "AsignmentOperator", "Asterisk", "Bang", "Block", "BodyString", "Boolean", "Break", "Case", "Cast", "Class", "ClassDefinition", "ClassMember", "Clone", "CloseBrace", "CloseCurlyBrace", "CloseSquareBrace", "Colon", "Comma", "ComparisionOperator", "Const", "Continue", "DNum", "Decimal", "Default", "Digits", "Do", "Dollar", "Dot", "DoubleQuotedString", "Echo", "Else", "ElseIf", "Empty", "Eol", "EqualityOperator", "Equals", "EscapeCharector", "Exponent_DNum", "Extends", "Field", "FirstBodyString", "For", "ForCondition", "ForInit", "ForUpdate", "Foreach", "Forwardslash", "Function", "Global", "HereDoc", "HereDocContents", "Hexadecimal", "If", "IfExpression", "Implements", "IncrementOperator", "InstanceMember", "Instanceof", "Integer", "Interface", "Label", "LogicalAnd", "LogicalOr", "Member", "MethodType", "Minus", "Modifiers", "MultilineComment", "New", "Octal", "OpenBrace", "OpenCurlyBrace", "OpenSquareBrace", "Or", "Params", "Percent", "Pipe", "Plus", "Postfix", "Prefix", "PrimitiveType", "QuestionMark", "Real", "Reference", "RequireOperator", "Return", "SemiColon", "ShiftOperator", "SingleQuotedString", "SinglelineComment", "Static", "SuppressWarnings", "Switch", "Tilde", "UnixComment", "UnquotedString", "Var", "While", "WhiteSpace", "Xor", "'as'"
    };

    public static final int EOF=-1;
    public static final int T__111=111;
    public static final int Abstract=4;
    public static final int AccessModifier=5;
    public static final int Ampersand=6;
    public static final int And=7;
    public static final int Apply=8;
    public static final int Array=9;
    public static final int ArrayAssign=10;
    public static final int AsignmentOperator=11;
    public static final int Asterisk=12;
    public static final int Bang=13;
    public static final int Block=14;
    public static final int BodyString=15;
    public static final int Boolean=16;
    public static final int Break=17;
    public static final int Case=18;
    public static final int Cast=19;
    public static final int Class=20;
    public static final int ClassDefinition=21;
    public static final int ClassMember=22;
    public static final int Clone=23;
    public static final int CloseBrace=24;
    public static final int CloseCurlyBrace=25;
    public static final int CloseSquareBrace=26;
    public static final int Colon=27;
    public static final int Comma=28;
    public static final int ComparisionOperator=29;
    public static final int Const=30;
    public static final int Continue=31;
    public static final int DNum=32;
    public static final int Decimal=33;
    public static final int Default=34;
    public static final int Digits=35;
    public static final int Do=36;
    public static final int Dollar=37;
    public static final int Dot=38;
    public static final int DoubleQuotedString=39;
    public static final int Echo=40;
    public static final int Else=41;
    public static final int ElseIf=42;
    public static final int Empty=43;
    public static final int Eol=44;
    public static final int EqualityOperator=45;
    public static final int Equals=46;
    public static final int EscapeCharector=47;
    public static final int Exponent_DNum=48;
    public static final int Extends=49;
    public static final int Field=50;
    public static final int FirstBodyString=51;
    public static final int For=52;
    public static final int ForCondition=53;
    public static final int ForInit=54;
    public static final int ForUpdate=55;
    public static final int Foreach=56;
    public static final int Forwardslash=57;
    public static final int Function=58;
    public static final int Global=59;
    public static final int HereDoc=60;
    public static final int HereDocContents=61;
    public static final int Hexadecimal=62;
    public static final int If=63;
    public static final int IfExpression=64;
    public static final int Implements=65;
    public static final int IncrementOperator=66;
    public static final int InstanceMember=67;
    public static final int Instanceof=68;
    public static final int Integer=69;
    public static final int Interface=70;
    public static final int Label=71;
    public static final int LogicalAnd=72;
    public static final int LogicalOr=73;
    public static final int Member=74;
    public static final int Method=75;
    public static final int Minus=76;
    public static final int Modifiers=77;
    public static final int MultilineComment=78;
    public static final int New=79;
    public static final int Octal=80;
    public static final int OpenBrace=81;
    public static final int OpenCurlyBrace=82;
    public static final int OpenSquareBrace=83;
    public static final int Or=84;
    public static final int Params=85;
    public static final int Percent=86;
    public static final int Pipe=87;
    public static final int Plus=88;
    public static final int Postfix=89;
    public static final int Prefix=90;
    public static final int PrimitiveType=91;
    public static final int QuestionMark=92;
    public static final int Real=93;
    public static final int Reference=94;
    public static final int RequireOperator=95;
    public static final int Return=96;
    public static final int SemiColon=97;
    public static final int ShiftOperator=98;
    public static final int SingleQuotedString=99;
    public static final int SinglelineComment=100;
    public static final int Static=101;
    public static final int SuppressWarnings=102;
    public static final int Switch=103;
    public static final int Tilde=104;
    public static final int UnixComment=105;
    public static final int UnquotedString=106;
    public static final int Var=107;
    public static final int While=108;
    public static final int WhiteSpace=109;
    public static final int Xor=110;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PhpParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PhpParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[170+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PhpParser.tokenNames; }
    public String getGrammarFileName() { return "Php.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // Php.g:131:1: prog : ( statement )* ;
    public final PhpParser.prog_return prog() throws RecognitionException {
        PhpParser.prog_return retval = new PhpParser.prog_return();
        retval.start = input.LT(1);

        int prog_StartIndex = input.index();

        CommonTree root_0 = null;

        PhpParser.statement_return statement1 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // Php.g:131:6: ( ( statement )* )
            // Php.g:131:8: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Php.g:131:8: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Abstract||LA1_0==Ampersand||LA1_0==Array||LA1_0==Bang||(LA1_0 >= BodyString && LA1_0 <= Break)||LA1_0==Class||LA1_0==Clone||LA1_0==Continue||(LA1_0 >= Do && LA1_0 <= Dollar)||(LA1_0 >= DoubleQuotedString && LA1_0 <= Echo)||LA1_0==For||LA1_0==Foreach||(LA1_0 >= Function && LA1_0 <= HereDoc)||LA1_0==If||LA1_0==IncrementOperator||(LA1_0 >= Integer && LA1_0 <= Interface)||LA1_0==Minus||LA1_0==New||(LA1_0 >= OpenBrace && LA1_0 <= OpenCurlyBrace)||LA1_0==Real||(LA1_0 >= RequireOperator && LA1_0 <= Return)||LA1_0==SingleQuotedString||(LA1_0 >= Static && LA1_0 <= Tilde)||LA1_0==UnquotedString||LA1_0==While) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Php.g:131:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_prog877);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // Php.g:133:1: statement : ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' !);
    public final PhpParser.statement_return statement() throws RecognitionException {
        PhpParser.statement_return retval = new PhpParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token BodyString3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token char_literal12=null;
        PhpParser.simpleStatement_return simpleStatement2 =null;

        PhpParser.statement_return statement5 =null;

        PhpParser.bracketedBlock_return bracketedBlock7 =null;

        PhpParser.classDefinition_return classDefinition8 =null;

        PhpParser.interfaceDefinition_return interfaceDefinition9 =null;

        PhpParser.complexStatement_return complexStatement10 =null;

        PhpParser.simpleStatement_return simpleStatement11 =null;


        CommonTree BodyString3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // Php.g:134:5: ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' !)
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // Php.g:134:7: ( simpleStatement )? BodyString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // Php.g:134:7: ( simpleStatement )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==Ampersand||LA2_0==Array||LA2_0==Bang||(LA2_0 >= Boolean && LA2_0 <= Break)||LA2_0==Clone||LA2_0==Continue||LA2_0==Dollar||(LA2_0 >= DoubleQuotedString && LA2_0 <= Echo)||(LA2_0 >= Global && LA2_0 <= HereDoc)||LA2_0==IncrementOperator||LA2_0==Integer||LA2_0==Minus||LA2_0==New||LA2_0==OpenBrace||LA2_0==Real||(LA2_0 >= RequireOperator && LA2_0 <= Return)||LA2_0==SingleQuotedString||(LA2_0 >= Static && LA2_0 <= SuppressWarnings)||LA2_0==Tilde||LA2_0==UnquotedString) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Php.g:134:7: simpleStatement
                            {
                            pushFollow(FOLLOW_simpleStatement_in_statement890);
                            simpleStatement2=simpleStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement2.getTree());

                            }
                            break;

                    }


                    BodyString3=(Token)match(input,BodyString,FOLLOW_BodyString_in_statement893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BodyString3_tree = 
                    (CommonTree)adaptor.create(BodyString3)
                    ;
                    adaptor.addChild(root_0, BodyString3_tree);
                    }

                    }
                    break;
                case 2 :
                    // Php.g:135:7: '{' statement '}'
                    {
                    char_literal4=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_statement901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal4);


                    pushFollow(FOLLOW_statement_in_statement903);
                    statement5=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement5.getTree());

                    char_literal6=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_statement905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal6);


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 135:25: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Php.g:136:7: bracketedBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_bracketedBlock_in_statement917);
                    bracketedBlock7=bracketedBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketedBlock7.getTree());

                    }
                    break;
                case 4 :
                    // Php.g:138:7: classDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_statement930);
                    classDefinition8=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition8.getTree());

                    }
                    break;
                case 5 :
                    // Php.g:139:7: interfaceDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDefinition_in_statement938);
                    interfaceDefinition9=interfaceDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDefinition9.getTree());

                    }
                    break;
                case 6 :
                    // Php.g:140:7: complexStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_complexStatement_in_statement946);
                    complexStatement10=complexStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, complexStatement10.getTree());

                    }
                    break;
                case 7 :
                    // Php.g:141:7: simpleStatement ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simpleStatement_in_statement954);
                    simpleStatement11=simpleStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement11.getTree());

                    char_literal12=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_statement956); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class bracketedBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bracketedBlock"
    // Php.g:144:1: bracketedBlock : '{' (stmts= statement )* '}' -> ^( Block $stmts) ;
    public final PhpParser.bracketedBlock_return bracketedBlock() throws RecognitionException {
        PhpParser.bracketedBlock_return retval = new PhpParser.bracketedBlock_return();
        retval.start = input.LT(1);

        int bracketedBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal13=null;
        Token char_literal14=null;
        PhpParser.statement_return stmts =null;


        CommonTree char_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // Php.g:145:5: ( '{' (stmts= statement )* '}' -> ^( Block $stmts) )
            // Php.g:145:7: '{' (stmts= statement )* '}'
            {
            char_literal13=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_bracketedBlock978); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal13);


            // Php.g:145:16: (stmts= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Abstract||LA4_0==Ampersand||LA4_0==Array||LA4_0==Bang||(LA4_0 >= BodyString && LA4_0 <= Break)||LA4_0==Class||LA4_0==Clone||LA4_0==Continue||(LA4_0 >= Do && LA4_0 <= Dollar)||(LA4_0 >= DoubleQuotedString && LA4_0 <= Echo)||LA4_0==For||LA4_0==Foreach||(LA4_0 >= Function && LA4_0 <= HereDoc)||LA4_0==If||LA4_0==IncrementOperator||(LA4_0 >= Integer && LA4_0 <= Interface)||LA4_0==Minus||LA4_0==New||(LA4_0 >= OpenBrace && LA4_0 <= OpenCurlyBrace)||LA4_0==Real||(LA4_0 >= RequireOperator && LA4_0 <= Return)||LA4_0==SingleQuotedString||(LA4_0 >= Static && LA4_0 <= Tilde)||LA4_0==UnquotedString||LA4_0==While) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Php.g:145:16: stmts= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bracketedBlock982);
            	    stmts=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(stmts.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            char_literal14=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_bracketedBlock985); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal14);


            // AST REWRITE
            // elements: stmts
            // token labels: 
            // rule labels: retval, stmts
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts",stmts!=null?stmts.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:32: -> ^( Block $stmts)
            {
                // Php.g:145:35: ^( Block $stmts)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(Block, "Block")
                , root_1);

                adaptor.addChild(root_1, stream_stmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, bracketedBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bracketedBlock"


    public static class interfaceDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceDefinition"
    // Php.g:148:1: interfaceDefinition : Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) ;
    public final PhpParser.interfaceDefinition_return interfaceDefinition() throws RecognitionException {
        PhpParser.interfaceDefinition_return retval = new PhpParser.interfaceDefinition_return();
        retval.start = input.LT(1);

        int interfaceDefinition_StartIndex = input.index();

        CommonTree root_0 = null;

        Token interfaceName=null;
        Token Interface15=null;
        Token OpenCurlyBrace17=null;
        Token CloseCurlyBrace19=null;
        PhpParser.interfaceExtends_return interfaceExtends16 =null;

        PhpParser.interfaceMember_return interfaceMember18 =null;


        CommonTree interfaceName_tree=null;
        CommonTree Interface15_tree=null;
        CommonTree OpenCurlyBrace17_tree=null;
        CommonTree CloseCurlyBrace19_tree=null;
        RewriteRuleTokenStream stream_Interface=new RewriteRuleTokenStream(adaptor,"token Interface");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleSubtreeStream stream_interfaceMember=new RewriteRuleSubtreeStream(adaptor,"rule interfaceMember");
        RewriteRuleSubtreeStream stream_interfaceExtends=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtends");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // Php.g:149:5: ( Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) )
            // Php.g:149:7: Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace
            {
            Interface15=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDefinition1011); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Interface.add(Interface15);


            interfaceName=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceDefinition1015); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(interfaceName);


            // Php.g:149:46: ( interfaceExtends )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Extends) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Php.g:149:46: interfaceExtends
                    {
                    pushFollow(FOLLOW_interfaceExtends_in_interfaceDefinition1017);
                    interfaceExtends16=interfaceExtends();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interfaceExtends.add(interfaceExtends16.getTree());

                    }
                    break;

            }


            OpenCurlyBrace17=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_interfaceDefinition1028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(OpenCurlyBrace17);


            // Php.g:151:9: ( interfaceMember )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= Abstract && LA6_0 <= AccessModifier)||LA6_0==Const||LA6_0==Function||LA6_0==Static) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Php.g:151:9: interfaceMember
            	    {
            	    pushFollow(FOLLOW_interfaceMember_in_interfaceDefinition1038);
            	    interfaceMember18=interfaceMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_interfaceMember.add(interfaceMember18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            CloseCurlyBrace19=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_interfaceDefinition1049); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(CloseCurlyBrace19);


            // AST REWRITE
            // elements: interfaceName, interfaceMember, interfaceExtends, Interface
            // token labels: interfaceName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_interfaceName=new RewriteRuleTokenStream(adaptor,"token interfaceName",interfaceName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:9: -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
            {
                // Php.g:153:12: ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_Interface.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_interfaceName.nextNode());

                // Php.g:153:39: ( interfaceExtends )?
                if ( stream_interfaceExtends.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceExtends.nextTree());

                }
                stream_interfaceExtends.reset();

                // Php.g:153:57: ( interfaceMember )*
                while ( stream_interfaceMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceMember.nextTree());

                }
                stream_interfaceMember.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, interfaceDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceDefinition"


    public static class interfaceExtends_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceExtends"
    // Php.g:156:1: interfaceExtends : Extends ^ UnquotedString ( Comma ! UnquotedString )* ;
    public final PhpParser.interfaceExtends_return interfaceExtends() throws RecognitionException {
        PhpParser.interfaceExtends_return retval = new PhpParser.interfaceExtends_return();
        retval.start = input.LT(1);

        int interfaceExtends_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Extends20=null;
        Token UnquotedString21=null;
        Token Comma22=null;
        Token UnquotedString23=null;

        CommonTree Extends20_tree=null;
        CommonTree UnquotedString21_tree=null;
        CommonTree Comma22_tree=null;
        CommonTree UnquotedString23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // Php.g:157:5: ( Extends ^ UnquotedString ( Comma ! UnquotedString )* )
            // Php.g:157:7: Extends ^ UnquotedString ( Comma ! UnquotedString )*
            {
            root_0 = (CommonTree)adaptor.nil();


            Extends20=(Token)match(input,Extends,FOLLOW_Extends_in_interfaceExtends1089); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Extends20_tree = 
            (CommonTree)adaptor.create(Extends20)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Extends20_tree, root_0);
            }

            UnquotedString21=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1092); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString21_tree = 
            (CommonTree)adaptor.create(UnquotedString21)
            ;
            adaptor.addChild(root_0, UnquotedString21_tree);
            }

            // Php.g:157:31: ( Comma ! UnquotedString )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Php.g:157:32: Comma ! UnquotedString
            	    {
            	    Comma22=(Token)match(input,Comma,FOLLOW_Comma_in_interfaceExtends1095); if (state.failed) return retval;

            	    UnquotedString23=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1098); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString23_tree = 
            	    (CommonTree)adaptor.create(UnquotedString23)
            	    ;
            	    adaptor.addChild(root_0, UnquotedString23_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, interfaceExtends_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceExtends"


    public static class interfaceMember_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceMember"
    // Php.g:159:1: interfaceMember : ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( MethodType ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) );
    public final PhpParser.interfaceMember_return interfaceMember() throws RecognitionException {
        PhpParser.interfaceMember_return retval = new PhpParser.interfaceMember_return();
        retval.start = input.LT(1);

        int interfaceMember_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Const24=null;
        Token UnquotedString25=null;
        Token Equals26=null;
        Token char_literal28=null;
        Token Function30=null;
        Token UnquotedString31=null;
        Token char_literal33=null;
        PhpParser.atom_return atom27 =null;

        PhpParser.fieldModifier_return fieldModifier29 =null;

        PhpParser.parametersDefinition_return parametersDefinition32 =null;


        CommonTree Const24_tree=null;
        CommonTree UnquotedString25_tree=null;
        CommonTree Equals26_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree Function30_tree=null;
        CommonTree UnquotedString31_tree=null;
        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");
        RewriteRuleSubtreeStream stream_fieldModifier=new RewriteRuleSubtreeStream(adaptor,"rule fieldModifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // Php.g:160:5: ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( MethodType ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Const) ) {
                alt10=1;
            }
            else if ( ((LA10_0 >= Abstract && LA10_0 <= AccessModifier)||LA10_0==Function||LA10_0==Static) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Php.g:160:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    Const24=(Token)match(input,Const,FOLLOW_Const_in_interfaceMember1116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Const.add(Const24);


                    UnquotedString25=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString25);


                    // Php.g:160:28: ( Equals atom )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Equals) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Php.g:160:29: Equals atom
                            {
                            Equals26=(Token)match(input,Equals,FOLLOW_Equals_in_interfaceMember1121); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals26);


                            pushFollow(FOLLOW_atom_in_interfaceMember1123);
                            atom27=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom27.getTree());

                            }
                            break;

                    }


                    char_literal28=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal28);


                    // AST REWRITE
                    // elements: UnquotedString, atom, Const
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 161:9: -> ^( Const UnquotedString ( atom )? )
                    {
                        // Php.g:161:12: ^( Const UnquotedString ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Const.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_UnquotedString.nextNode()
                        );

                        // Php.g:161:35: ( atom )?
                        if ( stream_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom.nextTree());

                        }
                        stream_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Php.g:162:7: ( fieldModifier )* Function UnquotedString parametersDefinition ';'
                    {
                    // Php.g:162:7: ( fieldModifier )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= Abstract && LA9_0 <= AccessModifier)||LA9_0==Static) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Php.g:162:7: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_interfaceMember1155);
                    	    fieldModifier29=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    Function30=(Token)match(input,Function,FOLLOW_Function_in_interfaceMember1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Function.add(Function30);


                    UnquotedString31=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString31);


                    pushFollow(FOLLOW_parametersDefinition_in_interfaceMember1162);
                    parametersDefinition32=parametersDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition32.getTree());

                    char_literal33=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal33);


                    // AST REWRITE
                    // elements: parametersDefinition, UnquotedString, fieldModifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 163:9: -> ^( MethodType ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
                    {
                        // Php.g:163:12: ^( MethodType ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Method, "MethodType")
                        , root_1);

                        // Php.g:163:21: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Modifiers, "Modifiers")
                        , root_2);

                        // Php.g:163:33: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        stream_UnquotedString.nextNode()
                        );

                        adaptor.addChild(root_1, stream_parametersDefinition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, interfaceMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceMember"


    public static class classDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // Php.g:166:1: classDefinition : ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) ;
    public final PhpParser.classDefinition_return classDefinition() throws RecognitionException {
        PhpParser.classDefinition_return retval = new PhpParser.classDefinition_return();
        retval.start = input.LT(1);

        int classDefinition_StartIndex = input.index();

        CommonTree root_0 = null;

        Token className=null;
        Token extendsclass=null;
        Token Class35=null;
        Token Extends36=null;
        Token OpenCurlyBrace38=null;
        Token CloseCurlyBrace40=null;
        PhpParser.classModifier_return classModifier34 =null;

        PhpParser.classImplements_return classImplements37 =null;

        PhpParser.classMember_return classMember39 =null;


        CommonTree className_tree=null;
        CommonTree extendsclass_tree=null;
        CommonTree Class35_tree=null;
        CommonTree Extends36_tree=null;
        CommonTree OpenCurlyBrace38_tree=null;
        CommonTree CloseCurlyBrace40_tree=null;
        RewriteRuleTokenStream stream_Extends=new RewriteRuleTokenStream(adaptor,"token Extends");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleSubtreeStream stream_classModifier=new RewriteRuleSubtreeStream(adaptor,"rule classModifier");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        RewriteRuleSubtreeStream stream_classImplements=new RewriteRuleSubtreeStream(adaptor,"rule classImplements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // Php.g:167:5: ( ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) )
            // Php.g:167:9: ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace
            {
            // Php.g:167:9: ( classModifier )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Abstract) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Php.g:167:9: classModifier
                    {
                    pushFollow(FOLLOW_classModifier_in_classDefinition1208);
                    classModifier34=classModifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classModifier.add(classModifier34.getTree());

                    }
                    break;

            }


            Class35=(Token)match(input,Class,FOLLOW_Class_in_classDefinition1220); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Class.add(Class35);


            className=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(className);


            // Php.g:169:9: ( Extends extendsclass= UnquotedString )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Extends) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Php.g:169:10: Extends extendsclass= UnquotedString
                    {
                    Extends36=(Token)match(input,Extends,FOLLOW_Extends_in_classDefinition1236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Extends.add(Extends36);


                    extendsclass=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(extendsclass);


                    }
                    break;

            }


            // Php.g:170:9: ( classImplements )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Implements) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Php.g:170:9: classImplements
                    {
                    pushFollow(FOLLOW_classImplements_in_classDefinition1253);
                    classImplements37=classImplements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classImplements.add(classImplements37.getTree());

                    }
                    break;

            }


            OpenCurlyBrace38=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_classDefinition1264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(OpenCurlyBrace38);


            // Php.g:172:9: ( classMember )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= Abstract && LA14_0 <= AccessModifier)||LA14_0==Const||LA14_0==Dollar||LA14_0==Function||LA14_0==Static||LA14_0==Var) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Php.g:172:9: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDefinition1274);
            	    classMember39=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember39.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            CloseCurlyBrace40=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_classDefinition1285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(CloseCurlyBrace40);


            // AST REWRITE
            // elements: classMember, classModifier, className, Class, extendsclass, classImplements, Extends
            // token labels: className, extendsclass
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_className=new RewriteRuleTokenStream(adaptor,"token className",className);
            RewriteRuleTokenStream stream_extendsclass=new RewriteRuleTokenStream(adaptor,"token extendsclass",extendsclass);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 174:9: -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
            {
                // Php.g:174:12: ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_Class.nextNode()
                , root_1);

                // Php.g:174:20: ^( Modifiers ( classModifier )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(Modifiers, "Modifiers")
                , root_2);

                // Php.g:174:32: ( classModifier )?
                if ( stream_classModifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_classModifier.nextTree());

                }
                stream_classModifier.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_className.nextNode());

                // Php.g:174:59: ( ^( Extends $extendsclass) )?
                if ( stream_extendsclass.hasNext()||stream_Extends.hasNext() ) {
                    // Php.g:174:59: ^( Extends $extendsclass)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_Extends.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_extendsclass.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_extendsclass.reset();
                stream_Extends.reset();

                // Php.g:174:85: ( classImplements )?
                if ( stream_classImplements.hasNext() ) {
                    adaptor.addChild(root_1, stream_classImplements.nextTree());

                }
                stream_classImplements.reset();

                // Php.g:175:13: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, classDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class classImplements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classImplements"
    // Php.g:179:1: classImplements : Implements ^ ( UnquotedString ( Comma ! UnquotedString )* ) ;
    public final PhpParser.classImplements_return classImplements() throws RecognitionException {
        PhpParser.classImplements_return retval = new PhpParser.classImplements_return();
        retval.start = input.LT(1);

        int classImplements_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Implements41=null;
        Token UnquotedString42=null;
        Token Comma43=null;
        Token UnquotedString44=null;

        CommonTree Implements41_tree=null;
        CommonTree UnquotedString42_tree=null;
        CommonTree Comma43_tree=null;
        CommonTree UnquotedString44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Php.g:180:5: ( Implements ^ ( UnquotedString ( Comma ! UnquotedString )* ) )
            // Php.g:180:8: Implements ^ ( UnquotedString ( Comma ! UnquotedString )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            Implements41=(Token)match(input,Implements,FOLLOW_Implements_in_classImplements1367); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Implements41_tree = 
            (CommonTree)adaptor.create(Implements41)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Implements41_tree, root_0);
            }

            // Php.g:180:20: ( UnquotedString ( Comma ! UnquotedString )* )
            // Php.g:180:21: UnquotedString ( Comma ! UnquotedString )*
            {
            UnquotedString42=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1371); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString42_tree = 
            (CommonTree)adaptor.create(UnquotedString42)
            ;
            adaptor.addChild(root_0, UnquotedString42_tree);
            }

            // Php.g:180:36: ( Comma ! UnquotedString )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Php.g:180:37: Comma ! UnquotedString
            	    {
            	    Comma43=(Token)match(input,Comma,FOLLOW_Comma_in_classImplements1374); if (state.failed) return retval;

            	    UnquotedString44=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1377); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString44_tree = 
            	    (CommonTree)adaptor.create(UnquotedString44)
            	    ;
            	    adaptor.addChild(root_0, UnquotedString44_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, classImplements_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classImplements"


    public static class classMember_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // Php.g:183:1: classMember : ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( MethodType ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) );
    public final PhpParser.classMember_return classMember() throws RecognitionException {
        PhpParser.classMember_return retval = new PhpParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Function46=null;
        Token UnquotedString47=null;
        Token char_literal50=null;
        Token Var51=null;
        Token Dollar52=null;
        Token UnquotedString53=null;
        Token Equals54=null;
        Token char_literal56=null;
        Token Const57=null;
        Token UnquotedString58=null;
        Token Equals59=null;
        Token char_literal61=null;
        Token Dollar63=null;
        Token UnquotedString64=null;
        Token Equals65=null;
        Token char_literal67=null;
        PhpParser.fieldModifier_return fieldModifier45 =null;

        PhpParser.parametersDefinition_return parametersDefinition48 =null;

        PhpParser.bracketedBlock_return bracketedBlock49 =null;

        PhpParser.atom_return atom55 =null;

        PhpParser.atom_return atom60 =null;

        PhpParser.fieldModifier_return fieldModifier62 =null;

        PhpParser.atom_return atom66 =null;


        CommonTree Function46_tree=null;
        CommonTree UnquotedString47_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree Var51_tree=null;
        CommonTree Dollar52_tree=null;
        CommonTree UnquotedString53_tree=null;
        CommonTree Equals54_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree Const57_tree=null;
        CommonTree UnquotedString58_tree=null;
        CommonTree Equals59_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree Dollar63_tree=null;
        CommonTree UnquotedString64_tree=null;
        CommonTree Equals65_tree=null;
        CommonTree char_literal67_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleTokenStream stream_Var=new RewriteRuleTokenStream(adaptor,"token Var");
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");
        RewriteRuleSubtreeStream stream_fieldModifier=new RewriteRuleSubtreeStream(adaptor,"rule fieldModifier");
        RewriteRuleSubtreeStream stream_bracketedBlock=new RewriteRuleSubtreeStream(adaptor,"rule bracketedBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Php.g:184:5: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( MethodType ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case Abstract:
            case AccessModifier:
            case Static:
                {
                switch ( input.LA(2) ) {
                case Function:
                    {
                    alt22=1;
                    }
                    break;
                case Abstract:
                case AccessModifier:
                case Static:
                    {
                    int LA22_7 = input.LA(3);

                    if ( (synpred23_Php()) ) {
                        alt22=1;
                    }
                    else if ( (true) ) {
                        alt22=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                case Dollar:
                    {
                    alt22=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }

                }
                break;
            case Function:
                {
                alt22=1;
                }
                break;
            case Var:
                {
                alt22=2;
                }
                break;
            case Const:
                {
                alt22=3;
                }
                break;
            case Dollar:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // Php.g:184:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
                    {
                    // Php.g:184:7: ( fieldModifier )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= Abstract && LA16_0 <= AccessModifier)||LA16_0==Static) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Php.g:184:7: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1397);
                    	    fieldModifier45=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    Function46=(Token)match(input,Function,FOLLOW_Function_in_classMember1400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Function.add(Function46);


                    UnquotedString47=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString47);


                    pushFollow(FOLLOW_parametersDefinition_in_classMember1404);
                    parametersDefinition48=parametersDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition48.getTree());

                    // Php.g:185:9: ( bracketedBlock | ';' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==OpenCurlyBrace) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==SemiColon) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }
                    switch (alt17) {
                        case 1 :
                            // Php.g:185:10: bracketedBlock
                            {
                            pushFollow(FOLLOW_bracketedBlock_in_classMember1416);
                            bracketedBlock49=bracketedBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock49.getTree());

                            }
                            break;
                        case 2 :
                            // Php.g:185:27: ';'
                            {
                            char_literal50=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1420); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal50);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: bracketedBlock, fieldModifier, parametersDefinition, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:9: -> ^( MethodType ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
                    {
                        // Php.g:186:12: ^( MethodType ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Method, "MethodType")
                        , root_1);

                        // Php.g:186:21: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Modifiers, "Modifiers")
                        , root_2);

                        // Php.g:186:33: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        stream_UnquotedString.nextNode()
                        );

                        adaptor.addChild(root_1, stream_parametersDefinition.nextTree());

                        // Php.g:186:85: ( bracketedBlock )?
                        if ( stream_bracketedBlock.hasNext() ) {
                            adaptor.addChild(root_1, stream_bracketedBlock.nextTree());

                        }
                        stream_bracketedBlock.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Php.g:187:7: Var Dollar UnquotedString ( Equals atom )? ';'
                    {
                    Var51=(Token)match(input,Var,FOLLOW_Var_in_classMember1457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Var.add(Var51);


                    Dollar52=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar52);


                    UnquotedString53=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString53);


                    // Php.g:187:33: ( Equals atom )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Equals) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Php.g:187:34: Equals atom
                            {
                            Equals54=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1464); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals54);


                            pushFollow(FOLLOW_atom_in_classMember1466);
                            atom55=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom55.getTree());

                            }
                            break;

                    }


                    char_literal56=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal56);


                    // AST REWRITE
                    // elements: atom, Dollar, Var, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:9: -> ^( Var ^( Dollar UnquotedString ) ( atom )? )
                    {
                        // Php.g:188:12: ^( Var ^( Dollar UnquotedString ) ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Var.nextNode()
                        , root_1);

                        // Php.g:188:18: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_Dollar.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_UnquotedString.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // Php.g:188:43: ( atom )?
                        if ( stream_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom.nextTree());

                        }
                        stream_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Php.g:189:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    Const57=(Token)match(input,Const,FOLLOW_Const_in_classMember1503); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Const.add(Const57);


                    UnquotedString58=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString58);


                    // Php.g:189:28: ( Equals atom )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Equals) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Php.g:189:29: Equals atom
                            {
                            Equals59=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1508); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals59);


                            pushFollow(FOLLOW_atom_in_classMember1510);
                            atom60=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom60.getTree());

                            }
                            break;

                    }


                    char_literal61=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal61);


                    // AST REWRITE
                    // elements: Const, atom, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:9: -> ^( Const UnquotedString ( atom )? )
                    {
                        // Php.g:190:12: ^( Const UnquotedString ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Const.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_UnquotedString.nextNode()
                        );

                        // Php.g:190:35: ( atom )?
                        if ( stream_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom.nextTree());

                        }
                        stream_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Php.g:191:7: ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';'
                    {
                    // Php.g:191:7: ( fieldModifier )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0 >= Abstract && LA20_0 <= AccessModifier)||LA20_0==Static) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Php.g:191:7: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1542);
                    	    fieldModifier62=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    // Php.g:191:22: ( Dollar UnquotedString )
                    // Php.g:191:23: Dollar UnquotedString
                    {
                    Dollar63=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar63);


                    UnquotedString64=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString64);


                    }


                    // Php.g:191:46: ( Equals atom )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Equals) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Php.g:191:47: Equals atom
                            {
                            Equals65=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1552); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals65);


                            pushFollow(FOLLOW_atom_in_classMember1554);
                            atom66=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom66.getTree());

                            }
                            break;

                    }


                    char_literal67=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal67);


                    // AST REWRITE
                    // elements: UnquotedString, Dollar, atom, fieldModifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 192:9: -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                    {
                        // Php.g:192:12: ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Field, "Field")
                        , root_1);

                        // Php.g:192:20: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Modifiers, "Modifiers")
                        , root_2);

                        // Php.g:192:32: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // Php.g:192:48: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_Dollar.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_UnquotedString.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // Php.g:192:73: ( atom )?
                        if ( stream_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom.nextTree());

                        }
                        stream_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class fieldDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDefinition"
    // Php.g:195:1: fieldDefinition : Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) ;
    public final PhpParser.fieldDefinition_return fieldDefinition() throws RecognitionException {
        PhpParser.fieldDefinition_return retval = new PhpParser.fieldDefinition_return();
        retval.start = input.LT(1);

        int fieldDefinition_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dollar68=null;
        Token UnquotedString69=null;
        Token Equals70=null;
        Token char_literal72=null;
        PhpParser.atom_return atom71 =null;


        CommonTree Dollar68_tree=null;
        CommonTree UnquotedString69_tree=null;
        CommonTree Equals70_tree=null;
        CommonTree char_literal72_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Php.g:196:5: ( Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) )
            // Php.g:196:7: Dollar UnquotedString ( Equals atom )? ';'
            {
            Dollar68=(Token)match(input,Dollar,FOLLOW_Dollar_in_fieldDefinition1606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Dollar.add(Dollar68);


            UnquotedString69=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_fieldDefinition1608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString69);


            // Php.g:196:29: ( Equals atom )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Equals) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Php.g:196:30: Equals atom
                    {
                    Equals70=(Token)match(input,Equals,FOLLOW_Equals_in_fieldDefinition1611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Equals.add(Equals70);


                    pushFollow(FOLLOW_atom_in_fieldDefinition1613);
                    atom71=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom71.getTree());

                    }
                    break;

            }


            char_literal72=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_fieldDefinition1617); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal72);


            // AST REWRITE
            // elements: Dollar, atom, UnquotedString
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 196:47: -> ^( Field ^( Dollar UnquotedString ) ( atom )? )
            {
                // Php.g:196:50: ^( Field ^( Dollar UnquotedString ) ( atom )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(Field, "Field")
                , root_1);

                // Php.g:196:58: ^( Dollar UnquotedString )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_Dollar.nextNode()
                , root_2);

                adaptor.addChild(root_2, 
                stream_UnquotedString.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // Php.g:196:83: ( atom )?
                if ( stream_atom.hasNext() ) {
                    adaptor.addChild(root_1, stream_atom.nextTree());

                }
                stream_atom.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, fieldDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldDefinition"


    public static class classModifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classModifier"
    // Php.g:199:1: classModifier : 'abstract' ;
    public final PhpParser.classModifier_return classModifier() throws RecognitionException {
        PhpParser.classModifier_return retval = new PhpParser.classModifier_return();
        retval.start = input.LT(1);

        int classModifier_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal73=null;

        CommonTree string_literal73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Php.g:200:5: ( 'abstract' )
            // Php.g:200:7: 'abstract'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal73=(Token)match(input,Abstract,FOLLOW_Abstract_in_classModifier1652); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal73_tree = 
            (CommonTree)adaptor.create(string_literal73)
            ;
            adaptor.addChild(root_0, string_literal73_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, classModifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classModifier"


    public static class fieldModifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldModifier"
    // Php.g:202:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' );
    public final PhpParser.fieldModifier_return fieldModifier() throws RecognitionException {
        PhpParser.fieldModifier_return retval = new PhpParser.fieldModifier_return();
        retval.start = input.LT(1);

        int fieldModifier_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set74=null;

        CommonTree set74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // Php.g:203:5: ( AccessModifier | 'abstract' | 'static' )
            // Php.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set74=(Token)input.LT(1);

            if ( (input.LA(1) >= Abstract && input.LA(1) <= AccessModifier)||input.LA(1)==Static ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set74)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, fieldModifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldModifier"


    public static class complexStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "complexStatement"
    // Php.g:207:1: complexStatement : ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' variable 'as' arrayEntry ')' statement -> ^( Foreach variable arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition );
    public final PhpParser.complexStatement_return complexStatement() throws RecognitionException {
        PhpParser.complexStatement_return retval = new PhpParser.complexStatement_return();
        retval.start = input.LT(1);

        int complexStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token If75=null;
        Token char_literal76=null;
        Token char_literal77=null;
        Token For79=null;
        Token char_literal80=null;
        Token char_literal84=null;
        Token Foreach86=null;
        Token char_literal87=null;
        Token string_literal89=null;
        Token char_literal91=null;
        Token While93=null;
        Token char_literal94=null;
        Token char_literal95=null;
        Token Do97=null;
        Token While99=null;
        Token char_literal100=null;
        Token char_literal101=null;
        Token char_literal102=null;
        Token Switch103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        PhpParser.expression_return ifCondition =null;

        PhpParser.statement_return ifTrue =null;

        PhpParser.expression_return whileCondition =null;

        PhpParser.expression_return doCondition =null;

        PhpParser.conditional_return conditional78 =null;

        PhpParser.forInit_return forInit81 =null;

        PhpParser.forCondition_return forCondition82 =null;

        PhpParser.forUpdate_return forUpdate83 =null;

        PhpParser.statement_return statement85 =null;

        PhpParser.variable_return variable88 =null;

        PhpParser.arrayEntry_return arrayEntry90 =null;

        PhpParser.statement_return statement92 =null;

        PhpParser.statement_return statement96 =null;

        PhpParser.statement_return statement98 =null;

        PhpParser.expression_return expression105 =null;

        PhpParser.cases_return cases108 =null;

        PhpParser.functionDefinition_return functionDefinition110 =null;


        CommonTree If75_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree For79_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree Foreach86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree While93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree char_literal95_tree=null;
        CommonTree Do97_tree=null;
        CommonTree While99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree char_literal101_tree=null;
        CommonTree char_literal102_tree=null;
        CommonTree Switch103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleTokenStream stream_Foreach=new RewriteRuleTokenStream(adaptor,"token Foreach");
        RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_cases=new RewriteRuleSubtreeStream(adaptor,"rule cases");
        RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
        RewriteRuleSubtreeStream stream_forCondition=new RewriteRuleSubtreeStream(adaptor,"rule forCondition");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
        RewriteRuleSubtreeStream stream_arrayEntry=new RewriteRuleSubtreeStream(adaptor,"rule arrayEntry");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // Php.g:208:5: ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' variable 'as' arrayEntry ')' statement -> ^( Foreach variable arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition )
            int alt26=7;
            switch ( input.LA(1) ) {
            case If:
                {
                alt26=1;
                }
                break;
            case For:
                {
                alt26=2;
                }
                break;
            case Foreach:
                {
                alt26=3;
                }
                break;
            case While:
                {
                alt26=4;
                }
                break;
            case Do:
                {
                alt26=5;
                }
                break;
            case Switch:
                {
                alt26=6;
                }
                break;
            case Function:
                {
                alt26=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Php.g:208:7: If '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    If75=(Token)match(input,If,FOLLOW_If_in_complexStatement1695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_If.add(If75);


                    char_literal76=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal76);


                    pushFollow(FOLLOW_expression_in_complexStatement1701);
                    ifCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());

                    char_literal77=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal77);


                    pushFollow(FOLLOW_statement_in_complexStatement1707);
                    ifTrue=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());

                    // Php.g:208:58: ( conditional )?
                    int alt24=2;
                    alt24 = dfa24.predict(input);
                    switch (alt24) {
                        case 1 :
                            // Php.g:208:58: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_complexStatement1709);
                            conditional78=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_conditional.add(conditional78.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expression, If, conditional, ifTrue
                    // token labels: 
                    // rule labels: ifTrue, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ifTrue=new RewriteRuleSubtreeStream(adaptor,"rule ifTrue",ifTrue!=null?ifTrue.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 209:9: -> ^( 'if' expression $ifTrue ( conditional )? )
                    {
                        // Php.g:209:12: ^( 'if' expression $ifTrue ( conditional )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(If, "If")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_ifTrue.nextTree());

                        // Php.g:209:38: ( conditional )?
                        if ( stream_conditional.hasNext() ) {
                            adaptor.addChild(root_1, stream_conditional.nextTree());

                        }
                        stream_conditional.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Php.g:210:7: For '(' forInit forCondition forUpdate ')' statement
                    {
                    For79=(Token)match(input,For,FOLLOW_For_in_complexStatement1740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_For.add(For79);


                    char_literal80=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal80);


                    pushFollow(FOLLOW_forInit_in_complexStatement1744);
                    forInit81=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forInit.add(forInit81.getTree());

                    pushFollow(FOLLOW_forCondition_in_complexStatement1746);
                    forCondition82=forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forCondition.add(forCondition82.getTree());

                    pushFollow(FOLLOW_forUpdate_in_complexStatement1748);
                    forUpdate83=forUpdate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate83.getTree());

                    char_literal84=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal84);


                    pushFollow(FOLLOW_statement_in_complexStatement1752);
                    statement85=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement85.getTree());

                    // AST REWRITE
                    // elements: statement, forUpdate, forInit, forCondition, For
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:60: -> ^( For forInit forCondition forUpdate statement )
                    {
                        // Php.g:210:63: ^( For forInit forCondition forUpdate statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_For.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_forInit.nextTree());

                        adaptor.addChild(root_1, stream_forCondition.nextTree());

                        adaptor.addChild(root_1, stream_forUpdate.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Php.g:211:7: Foreach '(' variable 'as' arrayEntry ')' statement
                    {
                    Foreach86=(Token)match(input,Foreach,FOLLOW_Foreach_in_complexStatement1774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Foreach.add(Foreach86);


                    char_literal87=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal87);


                    pushFollow(FOLLOW_variable_in_complexStatement1778);
                    variable88=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable88.getTree());

                    string_literal89=(Token)match(input,111,FOLLOW_111_in_complexStatement1780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(string_literal89);


                    pushFollow(FOLLOW_arrayEntry_in_complexStatement1782);
                    arrayEntry90=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry90.getTree());

                    char_literal91=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal91);


                    pushFollow(FOLLOW_statement_in_complexStatement1786);
                    statement92=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement92.getTree());

                    // AST REWRITE
                    // elements: Foreach, arrayEntry, variable, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:58: -> ^( Foreach variable arrayEntry statement )
                    {
                        // Php.g:211:61: ^( Foreach variable arrayEntry statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Foreach.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_arrayEntry.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Php.g:212:7: While '(' (whileCondition= expression )? ')' statement
                    {
                    While93=(Token)match(input,While,FOLLOW_While_in_complexStatement1806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_While.add(While93);


                    char_literal94=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal94);


                    // Php.g:212:31: (whileCondition= expression )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==Ampersand||LA25_0==Array||LA25_0==Bang||LA25_0==Boolean||LA25_0==Clone||LA25_0==Dollar||LA25_0==DoubleQuotedString||LA25_0==HereDoc||LA25_0==IncrementOperator||LA25_0==Integer||LA25_0==Minus||LA25_0==New||LA25_0==OpenBrace||LA25_0==Real||LA25_0==SingleQuotedString||LA25_0==SuppressWarnings||LA25_0==Tilde||LA25_0==UnquotedString) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // Php.g:212:31: whileCondition= expression
                            {
                            pushFollow(FOLLOW_expression_in_complexStatement1812);
                            whileCondition=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(whileCondition.getTree());

                            }
                            break;

                    }


                    char_literal95=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal95);


                    pushFollow(FOLLOW_statement_in_complexStatement1817);
                    statement96=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());

                    // AST REWRITE
                    // elements: statement, While, whileCondition
                    // token labels: 
                    // rule labels: retval, whileCondition
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_whileCondition=new RewriteRuleSubtreeStream(adaptor,"rule whileCondition",whileCondition!=null?whileCondition.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:58: -> ^( While $whileCondition statement )
                    {
                        // Php.g:212:61: ^( While $whileCondition statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_While.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_whileCondition.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Php.g:213:7: Do statement While '(' doCondition= expression ')' ';'
                    {
                    Do97=(Token)match(input,Do,FOLLOW_Do_in_complexStatement1836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Do.add(Do97);


                    pushFollow(FOLLOW_statement_in_complexStatement1838);
                    statement98=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement98.getTree());

                    While99=(Token)match(input,While,FOLLOW_While_in_complexStatement1840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_While.add(While99);


                    char_literal100=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal100);


                    pushFollow(FOLLOW_expression_in_complexStatement1846);
                    doCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(doCondition.getTree());

                    char_literal101=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal101);


                    char_literal102=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_complexStatement1850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal102);


                    // AST REWRITE
                    // elements: statement, doCondition, Do
                    // token labels: 
                    // rule labels: retval, doCondition
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_doCondition=new RewriteRuleSubtreeStream(adaptor,"rule doCondition",doCondition!=null?doCondition.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 213:61: -> ^( Do statement $doCondition)
                    {
                        // Php.g:213:64: ^( Do statement $doCondition)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Do.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_1, stream_doCondition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Php.g:214:7: Switch '(' expression ')' '{' cases '}'
                    {
                    Switch103=(Token)match(input,Switch,FOLLOW_Switch_in_complexStatement1869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Switch.add(Switch103);


                    char_literal104=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal104);


                    pushFollow(FOLLOW_expression_in_complexStatement1873);
                    expression105=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());

                    char_literal106=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal106);


                    char_literal107=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_complexStatement1877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal107);


                    pushFollow(FOLLOW_cases_in_complexStatement1878);
                    cases108=cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cases.add(cases108.getTree());

                    char_literal109=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_complexStatement1879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal109);


                    // AST REWRITE
                    // elements: Switch, cases, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:45: -> ^( Switch expression cases )
                    {
                        // Php.g:214:48: ^( Switch expression cases )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Switch.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_cases.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Php.g:215:7: functionDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionDefinition_in_complexStatement1897);
                    functionDefinition110=functionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDefinition110.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, complexStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "complexStatement"


    public static class simpleStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleStatement"
    // Php.g:218:1: simpleStatement : ( Echo ^ commaList | Global ^ name ( ',' ! name )* | Static ^ variable Equals ! atom | Break ^ ( Integer )? | Continue ^ ( Integer )? | Return ^ ( expression )? | RequireOperator ^ expression | expression );
    public final PhpParser.simpleStatement_return simpleStatement() throws RecognitionException {
        PhpParser.simpleStatement_return retval = new PhpParser.simpleStatement_return();
        retval.start = input.LT(1);

        int simpleStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Echo111=null;
        Token Global113=null;
        Token char_literal115=null;
        Token Static117=null;
        Token Equals119=null;
        Token Break121=null;
        Token Integer122=null;
        Token Continue123=null;
        Token Integer124=null;
        Token Return125=null;
        Token RequireOperator127=null;
        PhpParser.commaList_return commaList112 =null;

        PhpParser.name_return name114 =null;

        PhpParser.name_return name116 =null;

        PhpParser.variable_return variable118 =null;

        PhpParser.atom_return atom120 =null;

        PhpParser.expression_return expression126 =null;

        PhpParser.expression_return expression128 =null;

        PhpParser.expression_return expression129 =null;


        CommonTree Echo111_tree=null;
        CommonTree Global113_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree Static117_tree=null;
        CommonTree Equals119_tree=null;
        CommonTree Break121_tree=null;
        CommonTree Integer122_tree=null;
        CommonTree Continue123_tree=null;
        CommonTree Integer124_tree=null;
        CommonTree Return125_tree=null;
        CommonTree RequireOperator127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Php.g:219:5: ( Echo ^ commaList | Global ^ name ( ',' ! name )* | Static ^ variable Equals ! atom | Break ^ ( Integer )? | Continue ^ ( Integer )? | Return ^ ( expression )? | RequireOperator ^ expression | expression )
            int alt31=8;
            switch ( input.LA(1) ) {
            case Echo:
                {
                alt31=1;
                }
                break;
            case Global:
                {
                alt31=2;
                }
                break;
            case Static:
                {
                alt31=3;
                }
                break;
            case Break:
                {
                alt31=4;
                }
                break;
            case Continue:
                {
                alt31=5;
                }
                break;
            case Return:
                {
                alt31=6;
                }
                break;
            case RequireOperator:
                {
                alt31=7;
                }
                break;
            case Ampersand:
            case Array:
            case Bang:
            case Boolean:
            case Clone:
            case Dollar:
            case DoubleQuotedString:
            case HereDoc:
            case IncrementOperator:
            case Integer:
            case Minus:
            case New:
            case OpenBrace:
            case Real:
            case SingleQuotedString:
            case SuppressWarnings:
            case Tilde:
            case UnquotedString:
                {
                alt31=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // Php.g:219:7: Echo ^ commaList
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Echo111=(Token)match(input,Echo,FOLLOW_Echo_in_simpleStatement1914); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Echo111_tree = 
                    (CommonTree)adaptor.create(Echo111)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Echo111_tree, root_0);
                    }

                    pushFollow(FOLLOW_commaList_in_simpleStatement1917);
                    commaList112=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, commaList112.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:220:7: Global ^ name ( ',' ! name )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Global113=(Token)match(input,Global,FOLLOW_Global_in_simpleStatement1925); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Global113_tree = 
                    (CommonTree)adaptor.create(Global113)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Global113_tree, root_0);
                    }

                    pushFollow(FOLLOW_name_in_simpleStatement1928);
                    name114=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name114.getTree());

                    // Php.g:220:20: ( ',' ! name )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Php.g:220:21: ',' ! name
                    	    {
                    	    char_literal115=(Token)match(input,Comma,FOLLOW_Comma_in_simpleStatement1931); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_name_in_simpleStatement1934);
                    	    name116=name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name116.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // Php.g:221:7: Static ^ variable Equals ! atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Static117=(Token)match(input,Static,FOLLOW_Static_in_simpleStatement1944); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Static117_tree = 
                    (CommonTree)adaptor.create(Static117)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Static117_tree, root_0);
                    }

                    pushFollow(FOLLOW_variable_in_simpleStatement1947);
                    variable118=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable118.getTree());

                    Equals119=(Token)match(input,Equals,FOLLOW_Equals_in_simpleStatement1949); if (state.failed) return retval;

                    pushFollow(FOLLOW_atom_in_simpleStatement1952);
                    atom120=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom120.getTree());

                    }
                    break;
                case 4 :
                    // Php.g:222:7: Break ^ ( Integer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Break121=(Token)match(input,Break,FOLLOW_Break_in_simpleStatement1960); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Break121_tree = 
                    (CommonTree)adaptor.create(Break121)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Break121_tree, root_0);
                    }

                    // Php.g:222:14: ( Integer )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==Integer) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // Php.g:222:14: Integer
                            {
                            Integer122=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement1963); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Integer122_tree = 
                            (CommonTree)adaptor.create(Integer122)
                            ;
                            adaptor.addChild(root_0, Integer122_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Php.g:223:7: Continue ^ ( Integer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Continue123=(Token)match(input,Continue,FOLLOW_Continue_in_simpleStatement1972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Continue123_tree = 
                    (CommonTree)adaptor.create(Continue123)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Continue123_tree, root_0);
                    }

                    // Php.g:223:17: ( Integer )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==Integer) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Php.g:223:17: Integer
                            {
                            Integer124=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement1975); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Integer124_tree = 
                            (CommonTree)adaptor.create(Integer124)
                            ;
                            adaptor.addChild(root_0, Integer124_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // Php.g:225:7: Return ^ ( expression )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Return125=(Token)match(input,Return,FOLLOW_Return_in_simpleStatement1989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Return125_tree = 
                    (CommonTree)adaptor.create(Return125)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Return125_tree, root_0);
                    }

                    // Php.g:225:15: ( expression )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==Ampersand||LA30_0==Array||LA30_0==Bang||LA30_0==Boolean||LA30_0==Clone||LA30_0==Dollar||LA30_0==DoubleQuotedString||LA30_0==HereDoc||LA30_0==IncrementOperator||LA30_0==Integer||LA30_0==Minus||LA30_0==New||LA30_0==OpenBrace||LA30_0==Real||LA30_0==SingleQuotedString||LA30_0==SuppressWarnings||LA30_0==Tilde||LA30_0==UnquotedString) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // Php.g:225:15: expression
                            {
                            pushFollow(FOLLOW_expression_in_simpleStatement1992);
                            expression126=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression126.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Php.g:226:7: RequireOperator ^ expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    RequireOperator127=(Token)match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleStatement2001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RequireOperator127_tree = 
                    (CommonTree)adaptor.create(RequireOperator127)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(RequireOperator127_tree, root_0);
                    }

                    pushFollow(FOLLOW_expression_in_simpleStatement2004);
                    expression128=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression128.getTree());

                    }
                    break;
                case 8 :
                    // Php.g:227:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_simpleStatement2012);
                    expression129=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression129.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, simpleStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "simpleStatement"


    public static class conditional_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional"
    // Php.g:231:1: conditional : ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement );
    public final PhpParser.conditional_return conditional() throws RecognitionException {
        PhpParser.conditional_return retval = new PhpParser.conditional_return();
        retval.start = input.LT(1);

        int conditional_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ElseIf130=null;
        Token char_literal131=null;
        Token char_literal132=null;
        Token Else134=null;
        PhpParser.expression_return ifCondition =null;

        PhpParser.statement_return ifTrue =null;

        PhpParser.conditional_return conditional133 =null;

        PhpParser.statement_return statement135 =null;


        CommonTree ElseIf130_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree Else134_tree=null;
        RewriteRuleTokenStream stream_ElseIf=new RewriteRuleTokenStream(adaptor,"token ElseIf");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // Php.g:232:5: ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ElseIf) ) {
                alt33=1;
            }
            else if ( (LA33_0==Else) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // Php.g:232:7: ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    ElseIf130=(Token)match(input,ElseIf,FOLLOW_ElseIf_in_conditional2030); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ElseIf.add(ElseIf130);


                    char_literal131=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_conditional2032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal131);


                    pushFollow(FOLLOW_expression_in_conditional2036);
                    ifCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());

                    char_literal132=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_conditional2038); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal132);


                    pushFollow(FOLLOW_statement_in_conditional2042);
                    ifTrue=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());

                    // Php.g:232:62: ( conditional )?
                    int alt32=2;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // Php.g:232:62: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_conditional2044);
                            conditional133=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_conditional.add(conditional133.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: conditional, ifTrue, ifCondition
                    // token labels: 
                    // rule labels: ifTrue, retval, ifCondition
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ifTrue=new RewriteRuleSubtreeStream(adaptor,"rule ifTrue",ifTrue!=null?ifTrue.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ifCondition=new RewriteRuleSubtreeStream(adaptor,"rule ifCondition",ifCondition!=null?ifCondition.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:75: -> ^( If $ifCondition $ifTrue ( conditional )? )
                    {
                        // Php.g:232:78: ^( If $ifCondition $ifTrue ( conditional )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(If, "If")
                        , root_1);

                        adaptor.addChild(root_1, stream_ifCondition.nextTree());

                        adaptor.addChild(root_1, stream_ifTrue.nextTree());

                        // Php.g:232:104: ( conditional )?
                        if ( stream_conditional.hasNext() ) {
                            adaptor.addChild(root_1, stream_conditional.nextTree());

                        }
                        stream_conditional.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Php.g:233:7: Else statement
                    {
                    Else134=(Token)match(input,Else,FOLLOW_Else_in_conditional2068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Else.add(Else134);


                    pushFollow(FOLLOW_statement_in_conditional2070);
                    statement135=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement135.getTree());

                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 233:22: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, conditional_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditional"


    public static class forInit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forInit"
    // Php.g:236:1: forInit : ( commaList )? ';' -> ^( ForInit ( commaList )? ) ;
    public final PhpParser.forInit_return forInit() throws RecognitionException {
        PhpParser.forInit_return retval = new PhpParser.forInit_return();
        retval.start = input.LT(1);

        int forInit_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal137=null;
        PhpParser.commaList_return commaList136 =null;


        CommonTree char_literal137_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // Php.g:237:5: ( ( commaList )? ';' -> ^( ForInit ( commaList )? ) )
            // Php.g:237:7: ( commaList )? ';'
            {
            // Php.g:237:7: ( commaList )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Ampersand||LA34_0==Array||LA34_0==Bang||LA34_0==Boolean||LA34_0==Clone||LA34_0==Dollar||LA34_0==DoubleQuotedString||LA34_0==HereDoc||LA34_0==IncrementOperator||LA34_0==Integer||LA34_0==Minus||LA34_0==New||LA34_0==OpenBrace||LA34_0==Real||LA34_0==SingleQuotedString||LA34_0==SuppressWarnings||LA34_0==Tilde||LA34_0==UnquotedString) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Php.g:237:7: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forInit2091);
                    commaList136=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList136.getTree());

                    }
                    break;

            }


            char_literal137=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forInit2094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal137);


            // AST REWRITE
            // elements: commaList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 237:22: -> ^( ForInit ( commaList )? )
            {
                // Php.g:237:25: ^( ForInit ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ForInit, "ForInit")
                , root_1);

                // Php.g:237:35: ( commaList )?
                if ( stream_commaList.hasNext() ) {
                    adaptor.addChild(root_1, stream_commaList.nextTree());

                }
                stream_commaList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, forInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forInit"


    public static class forCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forCondition"
    // Php.g:240:1: forCondition : ( commaList )? ';' -> ^( ForCondition ( commaList )? ) ;
    public final PhpParser.forCondition_return forCondition() throws RecognitionException {
        PhpParser.forCondition_return retval = new PhpParser.forCondition_return();
        retval.start = input.LT(1);

        int forCondition_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal139=null;
        PhpParser.commaList_return commaList138 =null;


        CommonTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // Php.g:241:5: ( ( commaList )? ';' -> ^( ForCondition ( commaList )? ) )
            // Php.g:241:7: ( commaList )? ';'
            {
            // Php.g:241:7: ( commaList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Ampersand||LA35_0==Array||LA35_0==Bang||LA35_0==Boolean||LA35_0==Clone||LA35_0==Dollar||LA35_0==DoubleQuotedString||LA35_0==HereDoc||LA35_0==IncrementOperator||LA35_0==Integer||LA35_0==Minus||LA35_0==New||LA35_0==OpenBrace||LA35_0==Real||LA35_0==SingleQuotedString||LA35_0==SuppressWarnings||LA35_0==Tilde||LA35_0==UnquotedString) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Php.g:241:7: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forCondition2120);
                    commaList138=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList138.getTree());

                    }
                    break;

            }


            char_literal139=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forCondition2123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal139);


            // AST REWRITE
            // elements: commaList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 241:22: -> ^( ForCondition ( commaList )? )
            {
                // Php.g:241:25: ^( ForCondition ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ForCondition, "ForCondition")
                , root_1);

                // Php.g:241:40: ( commaList )?
                if ( stream_commaList.hasNext() ) {
                    adaptor.addChild(root_1, stream_commaList.nextTree());

                }
                stream_commaList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, forCondition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forCondition"


    public static class forUpdate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forUpdate"
    // Php.g:244:1: forUpdate : ( commaList )? -> ^( ForUpdate ( commaList )? ) ;
    public final PhpParser.forUpdate_return forUpdate() throws RecognitionException {
        PhpParser.forUpdate_return retval = new PhpParser.forUpdate_return();
        retval.start = input.LT(1);

        int forUpdate_StartIndex = input.index();

        CommonTree root_0 = null;

        PhpParser.commaList_return commaList140 =null;


        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // Php.g:245:5: ( ( commaList )? -> ^( ForUpdate ( commaList )? ) )
            // Php.g:245:7: ( commaList )?
            {
            // Php.g:245:7: ( commaList )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Ampersand||LA36_0==Array||LA36_0==Bang||LA36_0==Boolean||LA36_0==Clone||LA36_0==Dollar||LA36_0==DoubleQuotedString||LA36_0==HereDoc||LA36_0==IncrementOperator||LA36_0==Integer||LA36_0==Minus||LA36_0==New||LA36_0==OpenBrace||LA36_0==Real||LA36_0==SingleQuotedString||LA36_0==SuppressWarnings||LA36_0==Tilde||LA36_0==UnquotedString) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // Php.g:245:7: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forUpdate2153);
                    commaList140=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList140.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: commaList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 245:18: -> ^( ForUpdate ( commaList )? )
            {
                // Php.g:245:21: ^( ForUpdate ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ForUpdate, "ForUpdate")
                , root_1);

                // Php.g:245:33: ( commaList )?
                if ( stream_commaList.hasNext() ) {
                    adaptor.addChild(root_1, stream_commaList.nextTree());

                }
                stream_commaList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, forUpdate_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forUpdate"


    public static class cases_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cases"
    // Php.g:248:1: cases : ( casestatement )* defaultcase ;
    public final PhpParser.cases_return cases() throws RecognitionException {
        PhpParser.cases_return retval = new PhpParser.cases_return();
        retval.start = input.LT(1);

        int cases_StartIndex = input.index();

        CommonTree root_0 = null;

        PhpParser.casestatement_return casestatement141 =null;

        PhpParser.defaultcase_return defaultcase142 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // Php.g:249:5: ( ( casestatement )* defaultcase )
            // Php.g:249:7: ( casestatement )* defaultcase
            {
            root_0 = (CommonTree)adaptor.nil();


            // Php.g:249:7: ( casestatement )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Case) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Php.g:249:7: casestatement
            	    {
            	    pushFollow(FOLLOW_casestatement_in_cases2181);
            	    casestatement141=casestatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, casestatement141.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            pushFollow(FOLLOW_defaultcase_in_cases2185);
            defaultcase142=defaultcase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultcase142.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, cases_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "cases"


    public static class casestatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "casestatement"
    // Php.g:252:1: casestatement : Case ^ expression ':' ! ( statement )* ;
    public final PhpParser.casestatement_return casestatement() throws RecognitionException {
        PhpParser.casestatement_return retval = new PhpParser.casestatement_return();
        retval.start = input.LT(1);

        int casestatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Case143=null;
        Token char_literal145=null;
        PhpParser.expression_return expression144 =null;

        PhpParser.statement_return statement146 =null;


        CommonTree Case143_tree=null;
        CommonTree char_literal145_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // Php.g:253:5: ( Case ^ expression ':' ! ( statement )* )
            // Php.g:253:7: Case ^ expression ':' ! ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            Case143=(Token)match(input,Case,FOLLOW_Case_in_casestatement2202); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Case143_tree = 
            (CommonTree)adaptor.create(Case143)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Case143_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_casestatement2205);
            expression144=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression144.getTree());

            char_literal145=(Token)match(input,Colon,FOLLOW_Colon_in_casestatement2207); if (state.failed) return retval;

            // Php.g:253:29: ( statement )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Abstract||LA38_0==Ampersand||LA38_0==Array||LA38_0==Bang||(LA38_0 >= BodyString && LA38_0 <= Break)||LA38_0==Class||LA38_0==Clone||LA38_0==Continue||(LA38_0 >= Do && LA38_0 <= Dollar)||(LA38_0 >= DoubleQuotedString && LA38_0 <= Echo)||LA38_0==For||LA38_0==Foreach||(LA38_0 >= Function && LA38_0 <= HereDoc)||LA38_0==If||LA38_0==IncrementOperator||(LA38_0 >= Integer && LA38_0 <= Interface)||LA38_0==Minus||LA38_0==New||(LA38_0 >= OpenBrace && LA38_0 <= OpenCurlyBrace)||LA38_0==Real||(LA38_0 >= RequireOperator && LA38_0 <= Return)||LA38_0==SingleQuotedString||(LA38_0 >= Static && LA38_0 <= Tilde)||LA38_0==UnquotedString||LA38_0==While) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Php.g:253:29: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestatement2210);
            	    statement146=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement146.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, casestatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "casestatement"


    public static class defaultcase_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultcase"
    // Php.g:256:1: defaultcase : ( Default ^ ':' ! ( statement )* ) ;
    public final PhpParser.defaultcase_return defaultcase() throws RecognitionException {
        PhpParser.defaultcase_return retval = new PhpParser.defaultcase_return();
        retval.start = input.LT(1);

        int defaultcase_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Default147=null;
        Token char_literal148=null;
        PhpParser.statement_return statement149 =null;


        CommonTree Default147_tree=null;
        CommonTree char_literal148_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // Php.g:257:5: ( ( Default ^ ':' ! ( statement )* ) )
            // Php.g:257:7: ( Default ^ ':' ! ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            // Php.g:257:7: ( Default ^ ':' ! ( statement )* )
            // Php.g:257:8: Default ^ ':' ! ( statement )*
            {
            Default147=(Token)match(input,Default,FOLLOW_Default_in_defaultcase2230); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Default147_tree = 
            (CommonTree)adaptor.create(Default147)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Default147_tree, root_0);
            }

            char_literal148=(Token)match(input,Colon,FOLLOW_Colon_in_defaultcase2233); if (state.failed) return retval;

            // Php.g:257:22: ( statement )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Abstract||LA39_0==Ampersand||LA39_0==Array||LA39_0==Bang||(LA39_0 >= BodyString && LA39_0 <= Break)||LA39_0==Class||LA39_0==Clone||LA39_0==Continue||(LA39_0 >= Do && LA39_0 <= Dollar)||(LA39_0 >= DoubleQuotedString && LA39_0 <= Echo)||LA39_0==For||LA39_0==Foreach||(LA39_0 >= Function && LA39_0 <= HereDoc)||LA39_0==If||LA39_0==IncrementOperator||(LA39_0 >= Integer && LA39_0 <= Interface)||LA39_0==Minus||LA39_0==New||(LA39_0 >= OpenBrace && LA39_0 <= OpenCurlyBrace)||LA39_0==Real||(LA39_0 >= RequireOperator && LA39_0 <= Return)||LA39_0==SingleQuotedString||(LA39_0 >= Static && LA39_0 <= Tilde)||LA39_0==UnquotedString||LA39_0==While) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Php.g:257:22: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultcase2236);
            	    statement149=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement149.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, defaultcase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "defaultcase"


    public static class functionDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDefinition"
    // Php.g:260:1: functionDefinition : Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) ;
    public final PhpParser.functionDefinition_return functionDefinition() throws RecognitionException {
        PhpParser.functionDefinition_return retval = new PhpParser.functionDefinition_return();
        retval.start = input.LT(1);

        int functionDefinition_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Function150=null;
        Token UnquotedString151=null;
        PhpParser.parametersDefinition_return parametersDefinition152 =null;

        PhpParser.bracketedBlock_return bracketedBlock153 =null;


        CommonTree Function150_tree=null;
        CommonTree UnquotedString151_tree=null;
        RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");
        RewriteRuleSubtreeStream stream_bracketedBlock=new RewriteRuleSubtreeStream(adaptor,"rule bracketedBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Php.g:261:5: ( Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) )
            // Php.g:261:7: Function UnquotedString parametersDefinition bracketedBlock
            {
            Function150=(Token)match(input,Function,FOLLOW_Function_in_functionDefinition2255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Function.add(Function150);


            UnquotedString151=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition2257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString151);


            pushFollow(FOLLOW_parametersDefinition_in_functionDefinition2259);
            parametersDefinition152=parametersDefinition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition152.getTree());

            pushFollow(FOLLOW_bracketedBlock_in_functionDefinition2261);
            bracketedBlock153=bracketedBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock153.getTree());

            // AST REWRITE
            // elements: UnquotedString, bracketedBlock, parametersDefinition, Function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 261:67: -> ^( Function UnquotedString parametersDefinition bracketedBlock )
            {
                // Php.g:262:9: ^( Function UnquotedString parametersDefinition bracketedBlock )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_Function.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_UnquotedString.nextNode()
                );

                adaptor.addChild(root_1, stream_parametersDefinition.nextTree());

                adaptor.addChild(root_1, stream_bracketedBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, functionDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionDefinition"


    public static class parametersDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parametersDefinition"
    // Php.g:265:1: parametersDefinition : OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace -> ^( Params ( paramDef )* ) ;
    public final PhpParser.parametersDefinition_return parametersDefinition() throws RecognitionException {
        PhpParser.parametersDefinition_return retval = new PhpParser.parametersDefinition_return();
        retval.start = input.LT(1);

        int parametersDefinition_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OpenBrace154=null;
        Token Comma156=null;
        Token CloseBrace158=null;
        PhpParser.paramDef_return paramDef155 =null;

        PhpParser.paramDef_return paramDef157 =null;


        CommonTree OpenBrace154_tree=null;
        CommonTree Comma156_tree=null;
        CommonTree CloseBrace158_tree=null;
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_paramDef=new RewriteRuleSubtreeStream(adaptor,"rule paramDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Php.g:266:5: ( OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace -> ^( Params ( paramDef )* ) )
            // Php.g:266:7: OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace
            {
            OpenBrace154=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_parametersDefinition2299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace154);


            // Php.g:266:17: ( paramDef ( Comma paramDef )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Ampersand||LA41_0==Dollar) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Php.g:266:18: paramDef ( Comma paramDef )*
                    {
                    pushFollow(FOLLOW_paramDef_in_parametersDefinition2302);
                    paramDef155=paramDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramDef.add(paramDef155.getTree());

                    // Php.g:266:27: ( Comma paramDef )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Php.g:266:28: Comma paramDef
                    	    {
                    	    Comma156=(Token)match(input,Comma,FOLLOW_Comma_in_parametersDefinition2305); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Comma.add(Comma156);


                    	    pushFollow(FOLLOW_paramDef_in_parametersDefinition2307);
                    	    paramDef157=paramDef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_paramDef.add(paramDef157.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }


            CloseBrace158=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_parametersDefinition2313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace158);


            // AST REWRITE
            // elements: paramDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 266:58: -> ^( Params ( paramDef )* )
            {
                // Php.g:266:61: ^( Params ( paramDef )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(Params, "Params")
                , root_1);

                // Php.g:266:70: ( paramDef )*
                while ( stream_paramDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramDef.nextTree());

                }
                stream_paramDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, parametersDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parametersDefinition"


    public static class paramDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramDef"
    // Php.g:269:1: paramDef : paramName ( Equals ^ atom )? ;
    public final PhpParser.paramDef_return paramDef() throws RecognitionException {
        PhpParser.paramDef_return retval = new PhpParser.paramDef_return();
        retval.start = input.LT(1);

        int paramDef_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Equals160=null;
        PhpParser.paramName_return paramName159 =null;

        PhpParser.atom_return atom161 =null;


        CommonTree Equals160_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Php.g:270:5: ( paramName ( Equals ^ atom )? )
            // Php.g:270:7: paramName ( Equals ^ atom )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_paramName_in_paramDef2340);
            paramName159=paramName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramName159.getTree());

            // Php.g:270:17: ( Equals ^ atom )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Equals) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Php.g:270:18: Equals ^ atom
                    {
                    Equals160=(Token)match(input,Equals,FOLLOW_Equals_in_paramDef2343); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Equals160_tree = 
                    (CommonTree)adaptor.create(Equals160)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Equals160_tree, root_0);
                    }

                    pushFollow(FOLLOW_atom_in_paramDef2346);
                    atom161=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom161.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, paramDef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "paramDef"


    public static class paramName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramName"
    // Php.g:273:1: paramName : ( Dollar ^ UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) );
    public final PhpParser.paramName_return paramName() throws RecognitionException {
        PhpParser.paramName_return retval = new PhpParser.paramName_return();
        retval.start = input.LT(1);

        int paramName_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dollar162=null;
        Token UnquotedString163=null;
        Token Ampersand164=null;
        Token Dollar165=null;
        Token UnquotedString166=null;

        CommonTree Dollar162_tree=null;
        CommonTree UnquotedString163_tree=null;
        CommonTree Ampersand164_tree=null;
        CommonTree Dollar165_tree=null;
        CommonTree UnquotedString166_tree=null;
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleTokenStream stream_Ampersand=new RewriteRuleTokenStream(adaptor,"token Ampersand");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Php.g:274:5: ( Dollar ^ UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Dollar) ) {
                alt43=1;
            }
            else if ( (LA43_0==Ampersand) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // Php.g:274:7: Dollar ^ UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Dollar162=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar162_tree = 
                    (CommonTree)adaptor.create(Dollar162)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Dollar162_tree, root_0);
                    }

                    UnquotedString163=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString163_tree = 
                    (CommonTree)adaptor.create(UnquotedString163)
                    ;
                    adaptor.addChild(root_0, UnquotedString163_tree);
                    }

                    }
                    break;
                case 2 :
                    // Php.g:275:7: Ampersand Dollar UnquotedString
                    {
                    Ampersand164=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_paramName2376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Ampersand.add(Ampersand164);


                    Dollar165=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar165);


                    UnquotedString166=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString166);


                    // AST REWRITE
                    // elements: Ampersand, UnquotedString, Dollar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 275:39: -> ^( Ampersand ^( Dollar UnquotedString ) )
                    {
                        // Php.g:275:42: ^( Ampersand ^( Dollar UnquotedString ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Ampersand.nextNode()
                        , root_1);

                        // Php.g:275:54: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_Dollar.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_UnquotedString.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, paramName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "paramName"


    public static class commaList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commaList"
    // Php.g:278:1: commaList : expression ( ',' ! expression )* ;
    public final PhpParser.commaList_return commaList() throws RecognitionException {
        PhpParser.commaList_return retval = new PhpParser.commaList_return();
        retval.start = input.LT(1);

        int commaList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal168=null;
        PhpParser.expression_return expression167 =null;

        PhpParser.expression_return expression169 =null;


        CommonTree char_literal168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Php.g:279:5: ( expression ( ',' ! expression )* )
            // Php.g:279:7: expression ( ',' ! expression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_commaList2409);
            expression167=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression167.getTree());

            // Php.g:279:18: ( ',' ! expression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Comma) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // Php.g:279:19: ',' ! expression
            	    {
            	    char_literal168=(Token)match(input,Comma,FOLLOW_Comma_in_commaList2412); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_commaList2415);
            	    expression169=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression169.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, commaList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "commaList"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // Php.g:282:1: expression : weakLogicalOr ;
    public final PhpParser.expression_return expression() throws RecognitionException {
        PhpParser.expression_return retval = new PhpParser.expression_return();
        retval.start = input.LT(1);

        int expression_StartIndex = input.index();

        CommonTree root_0 = null;

        PhpParser.weakLogicalOr_return weakLogicalOr170 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Php.g:283:5: ( weakLogicalOr )
            // Php.g:283:7: weakLogicalOr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_weakLogicalOr_in_expression2439);
            weakLogicalOr170=weakLogicalOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalOr170.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class weakLogicalOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "weakLogicalOr"
    // Php.g:286:1: weakLogicalOr : weakLogicalXor ( Or ^ weakLogicalXor )* ;
    public final PhpParser.weakLogicalOr_return weakLogicalOr() throws RecognitionException {
        PhpParser.weakLogicalOr_return retval = new PhpParser.weakLogicalOr_return();
        retval.start = input.LT(1);

        int weakLogicalOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Or172=null;
        PhpParser.weakLogicalXor_return weakLogicalXor171 =null;

        PhpParser.weakLogicalXor_return weakLogicalXor173 =null;


        CommonTree Or172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Php.g:287:5: ( weakLogicalXor ( Or ^ weakLogicalXor )* )
            // Php.g:287:7: weakLogicalXor ( Or ^ weakLogicalXor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2456);
            weakLogicalXor171=weakLogicalXor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor171.getTree());

            // Php.g:287:22: ( Or ^ weakLogicalXor )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Or) ) {
                    int LA45_9 = input.LA(2);

                    if ( (synpred65_Php()) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // Php.g:287:23: Or ^ weakLogicalXor
            	    {
            	    Or172=(Token)match(input,Or,FOLLOW_Or_in_weakLogicalOr2459); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Or172_tree = 
            	    (CommonTree)adaptor.create(Or172)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or172_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2462);
            	    weakLogicalXor173=weakLogicalXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor173.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, weakLogicalOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "weakLogicalOr"


    public static class weakLogicalXor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "weakLogicalXor"
    // Php.g:290:1: weakLogicalXor : weakLogicalAnd ( Xor ^ weakLogicalAnd )* ;
    public final PhpParser.weakLogicalXor_return weakLogicalXor() throws RecognitionException {
        PhpParser.weakLogicalXor_return retval = new PhpParser.weakLogicalXor_return();
        retval.start = input.LT(1);

        int weakLogicalXor_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Xor175=null;
        PhpParser.weakLogicalAnd_return weakLogicalAnd174 =null;

        PhpParser.weakLogicalAnd_return weakLogicalAnd176 =null;


        CommonTree Xor175_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Php.g:291:5: ( weakLogicalAnd ( Xor ^ weakLogicalAnd )* )
            // Php.g:291:7: weakLogicalAnd ( Xor ^ weakLogicalAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2481);
            weakLogicalAnd174=weakLogicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd174.getTree());

            // Php.g:291:22: ( Xor ^ weakLogicalAnd )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Xor) ) {
                    int LA46_9 = input.LA(2);

                    if ( (synpred66_Php()) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // Php.g:291:23: Xor ^ weakLogicalAnd
            	    {
            	    Xor175=(Token)match(input,Xor,FOLLOW_Xor_in_weakLogicalXor2484); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Xor175_tree = 
            	    (CommonTree)adaptor.create(Xor175)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Xor175_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2487);
            	    weakLogicalAnd176=weakLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd176.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, weakLogicalXor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "weakLogicalXor"


    public static class weakLogicalAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "weakLogicalAnd"
    // Php.g:294:1: weakLogicalAnd : assignment ( And ^ assignment )* ;
    public final PhpParser.weakLogicalAnd_return weakLogicalAnd() throws RecognitionException {
        PhpParser.weakLogicalAnd_return retval = new PhpParser.weakLogicalAnd_return();
        retval.start = input.LT(1);

        int weakLogicalAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token And178=null;
        PhpParser.assignment_return assignment177 =null;

        PhpParser.assignment_return assignment179 =null;


        CommonTree And178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Php.g:295:5: ( assignment ( And ^ assignment )* )
            // Php.g:295:7: assignment ( And ^ assignment )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_assignment_in_weakLogicalAnd2510);
            assignment177=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment177.getTree());

            // Php.g:295:18: ( And ^ assignment )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==And) ) {
                    int LA47_9 = input.LA(2);

                    if ( (synpred67_Php()) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // Php.g:295:19: And ^ assignment
            	    {
            	    And178=(Token)match(input,And,FOLLOW_And_in_weakLogicalAnd2513); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    And178_tree = 
            	    (CommonTree)adaptor.create(And178)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(And178_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_assignment_in_weakLogicalAnd2516);
            	    assignment179=assignment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment179.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, weakLogicalAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "weakLogicalAnd"


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // Php.g:298:1: assignment : ( name ( ( Equals | AsignmentOperator ) ^ assignment ) | ternary );
    public final PhpParser.assignment_return assignment() throws RecognitionException {
        PhpParser.assignment_return retval = new PhpParser.assignment_return();
        retval.start = input.LT(1);

        int assignment_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set181=null;
        PhpParser.name_return name180 =null;

        PhpParser.assignment_return assignment182 =null;

        PhpParser.ternary_return ternary183 =null;


        CommonTree set181_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Php.g:299:5: ( name ( ( Equals | AsignmentOperator ) ^ assignment ) | ternary )
            int alt48=2;
            switch ( input.LA(1) ) {
            case UnquotedString:
                {
                switch ( input.LA(2) ) {
                case ClassMember:
                    {
                    int LA48_17 = input.LA(3);

                    if ( (synpred69_Php()) ) {
                        alt48=1;
                    }
                    else if ( (true) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 17, input);

                        throw nvae;

                    }
                    }
                    break;
                case OpenSquareBrace:
                    {
                    int LA48_18 = input.LA(3);

                    if ( (synpred69_Php()) ) {
                        alt48=1;
                    }
                    else if ( (true) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 18, input);

                        throw nvae;

                    }
                    }
                    break;
                case InstanceMember:
                    {
                    int LA48_19 = input.LA(3);

                    if ( (synpred69_Php()) ) {
                        alt48=1;
                    }
                    else if ( (true) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 19, input);

                        throw nvae;

                    }
                    }
                    break;
                case AsignmentOperator:
                case Equals:
                    {
                    alt48=1;
                    }
                    break;
                case EOF:
                case Ampersand:
                case And:
                case ArrayAssign:
                case Asterisk:
                case BodyString:
                case CloseBrace:
                case CloseSquareBrace:
                case Colon:
                case Comma:
                case ComparisionOperator:
                case Dot:
                case EqualityOperator:
                case Forwardslash:
                case IncrementOperator:
                case Instanceof:
                case LogicalAnd:
                case LogicalOr:
                case Minus:
                case OpenBrace:
                case Or:
                case Percent:
                case Pipe:
                case Plus:
                case QuestionMark:
                case SemiColon:
                case ShiftOperator:
                case Xor:
                    {
                    alt48=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }

                }
                break;
            case Dollar:
                {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==Dollar) ) {
                    int LA48_45 = input.LA(3);

                    if ( (synpred69_Php()) ) {
                        alt48=1;
                    }
                    else if ( (true) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 45, input);

                        throw nvae;

                    }
                }
                else if ( (LA48_2==UnquotedString) ) {
                    int LA48_46 = input.LA(3);

                    if ( (synpred69_Php()) ) {
                        alt48=1;
                    }
                    else if ( (true) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 46, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;

                }
                }
                break;
            case Ampersand:
            case Array:
            case Bang:
            case Boolean:
            case Clone:
            case DoubleQuotedString:
            case HereDoc:
            case IncrementOperator:
            case Integer:
            case Minus:
            case New:
            case OpenBrace:
            case Real:
            case SingleQuotedString:
            case SuppressWarnings:
            case Tilde:
                {
                alt48=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // Php.g:299:7: name ( ( Equals | AsignmentOperator ) ^ assignment )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_name_in_assignment2535);
                    name180=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name180.getTree());

                    // Php.g:299:12: ( ( Equals | AsignmentOperator ) ^ assignment )
                    // Php.g:299:13: ( Equals | AsignmentOperator ) ^ assignment
                    {
                    set181=(Token)input.LT(1);

                    set181=(Token)input.LT(1);

                    if ( input.LA(1)==AsignmentOperator||input.LA(1)==Equals ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(set181)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_assignment_in_assignment2547);
                    assignment182=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment182.getTree());

                    }


                    }
                    break;
                case 2 :
                    // Php.g:300:7: ternary
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ternary_in_assignment2556);
                    ternary183=ternary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary183.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, assignment_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class ternary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ternary"
    // Php.g:303:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );
    public final PhpParser.ternary_return ternary() throws RecognitionException {
        PhpParser.ternary_return retval = new PhpParser.ternary_return();
        retval.start = input.LT(1);

        int ternary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token QuestionMark185=null;
        Token Colon187=null;
        PhpParser.logicalOr_return logicalOr184 =null;

        PhpParser.expression_return expression186 =null;

        PhpParser.expression_return expression188 =null;

        PhpParser.logicalOr_return logicalOr189 =null;


        CommonTree QuestionMark185_tree=null;
        CommonTree Colon187_tree=null;
        RewriteRuleTokenStream stream_QuestionMark=new RewriteRuleTokenStream(adaptor,"token QuestionMark");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_logicalOr=new RewriteRuleSubtreeStream(adaptor,"rule logicalOr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Php.g:304:5: ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr )
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // Php.g:304:7: logicalOr QuestionMark expression Colon expression
                    {
                    pushFollow(FOLLOW_logicalOr_in_ternary2573);
                    logicalOr184=logicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalOr.add(logicalOr184.getTree());

                    QuestionMark185=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QuestionMark.add(QuestionMark185);


                    pushFollow(FOLLOW_expression_in_ternary2577);
                    expression186=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression186.getTree());

                    Colon187=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(Colon187);


                    pushFollow(FOLLOW_expression_in_ternary2581);
                    expression188=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression188.getTree());

                    // AST REWRITE
                    // elements: expression, logicalOr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 304:58: -> ^( IfExpression logicalOr ( expression )* )
                    {
                        // Php.g:304:61: ^( IfExpression logicalOr ( expression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IfExpression, "IfExpression")
                        , root_1);

                        adaptor.addChild(root_1, stream_logicalOr.nextTree());

                        // Php.g:304:86: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Php.g:305:7: logicalOr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_logicalOr_in_ternary2600);
                    logicalOr189=logicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr189.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, ternary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ternary"


    public static class logicalOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalOr"
    // Php.g:308:1: logicalOr : logicalAnd ( LogicalOr ^ logicalAnd )* ;
    public final PhpParser.logicalOr_return logicalOr() throws RecognitionException {
        PhpParser.logicalOr_return retval = new PhpParser.logicalOr_return();
        retval.start = input.LT(1);

        int logicalOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LogicalOr191=null;
        PhpParser.logicalAnd_return logicalAnd190 =null;

        PhpParser.logicalAnd_return logicalAnd192 =null;


        CommonTree LogicalOr191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Php.g:309:5: ( logicalAnd ( LogicalOr ^ logicalAnd )* )
            // Php.g:309:7: logicalAnd ( LogicalOr ^ logicalAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logicalAnd_in_logicalOr2621);
            logicalAnd190=logicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd190.getTree());

            // Php.g:309:18: ( LogicalOr ^ logicalAnd )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==LogicalOr) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Php.g:309:19: LogicalOr ^ logicalAnd
            	    {
            	    LogicalOr191=(Token)match(input,LogicalOr,FOLLOW_LogicalOr_in_logicalOr2624); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LogicalOr191_tree = 
            	    (CommonTree)adaptor.create(LogicalOr191)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(LogicalOr191_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicalAnd_in_logicalOr2627);
            	    logicalAnd192=logicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd192.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, logicalOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalOr"


    public static class logicalAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalAnd"
    // Php.g:312:1: logicalAnd : bitwiseOr ( LogicalAnd ^ bitwiseOr )* ;
    public final PhpParser.logicalAnd_return logicalAnd() throws RecognitionException {
        PhpParser.logicalAnd_return retval = new PhpParser.logicalAnd_return();
        retval.start = input.LT(1);

        int logicalAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LogicalAnd194=null;
        PhpParser.bitwiseOr_return bitwiseOr193 =null;

        PhpParser.bitwiseOr_return bitwiseOr195 =null;


        CommonTree LogicalAnd194_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Php.g:313:5: ( bitwiseOr ( LogicalAnd ^ bitwiseOr )* )
            // Php.g:313:7: bitwiseOr ( LogicalAnd ^ bitwiseOr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2646);
            bitwiseOr193=bitwiseOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr193.getTree());

            // Php.g:313:17: ( LogicalAnd ^ bitwiseOr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LogicalAnd) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Php.g:313:18: LogicalAnd ^ bitwiseOr
            	    {
            	    LogicalAnd194=(Token)match(input,LogicalAnd,FOLLOW_LogicalAnd_in_logicalAnd2649); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LogicalAnd194_tree = 
            	    (CommonTree)adaptor.create(LogicalAnd194)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(LogicalAnd194_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2652);
            	    bitwiseOr195=bitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr195.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, logicalAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalAnd"


    public static class bitwiseOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseOr"
    // Php.g:316:1: bitwiseOr : bitWiseAnd ( Pipe ^ bitWiseAnd )* ;
    public final PhpParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
        PhpParser.bitwiseOr_return retval = new PhpParser.bitwiseOr_return();
        retval.start = input.LT(1);

        int bitwiseOr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Pipe197=null;
        PhpParser.bitWiseAnd_return bitWiseAnd196 =null;

        PhpParser.bitWiseAnd_return bitWiseAnd198 =null;


        CommonTree Pipe197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Php.g:317:5: ( bitWiseAnd ( Pipe ^ bitWiseAnd )* )
            // Php.g:317:7: bitWiseAnd ( Pipe ^ bitWiseAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2675);
            bitWiseAnd196=bitWiseAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd196.getTree());

            // Php.g:317:18: ( Pipe ^ bitWiseAnd )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==Pipe) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // Php.g:317:19: Pipe ^ bitWiseAnd
            	    {
            	    Pipe197=(Token)match(input,Pipe,FOLLOW_Pipe_in_bitwiseOr2678); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Pipe197_tree = 
            	    (CommonTree)adaptor.create(Pipe197)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Pipe197_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2681);
            	    bitWiseAnd198=bitWiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd198.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, bitwiseOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseOr"


    public static class bitWiseAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitWiseAnd"
    // Php.g:320:1: bitWiseAnd : equalityCheck ( Ampersand ^ equalityCheck )* ;
    public final PhpParser.bitWiseAnd_return bitWiseAnd() throws RecognitionException {
        PhpParser.bitWiseAnd_return retval = new PhpParser.bitWiseAnd_return();
        retval.start = input.LT(1);

        int bitWiseAnd_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Ampersand200=null;
        PhpParser.equalityCheck_return equalityCheck199 =null;

        PhpParser.equalityCheck_return equalityCheck201 =null;


        CommonTree Ampersand200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Php.g:321:5: ( equalityCheck ( Ampersand ^ equalityCheck )* )
            // Php.g:321:7: equalityCheck ( Ampersand ^ equalityCheck )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2700);
            equalityCheck199=equalityCheck();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck199.getTree());

            // Php.g:321:21: ( Ampersand ^ equalityCheck )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==Ampersand) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Php.g:321:22: Ampersand ^ equalityCheck
            	    {
            	    Ampersand200=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_bitWiseAnd2703); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Ampersand200_tree = 
            	    (CommonTree)adaptor.create(Ampersand200)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Ampersand200_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2706);
            	    equalityCheck201=equalityCheck();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck201.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, bitWiseAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitWiseAnd"


    public static class equalityCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityCheck"
    // Php.g:324:1: equalityCheck : comparisionCheck ( EqualityOperator ^ comparisionCheck )? ;
    public final PhpParser.equalityCheck_return equalityCheck() throws RecognitionException {
        PhpParser.equalityCheck_return retval = new PhpParser.equalityCheck_return();
        retval.start = input.LT(1);

        int equalityCheck_StartIndex = input.index();

        CommonTree root_0 = null;

        Token EqualityOperator203=null;
        PhpParser.comparisionCheck_return comparisionCheck202 =null;

        PhpParser.comparisionCheck_return comparisionCheck204 =null;


        CommonTree EqualityOperator203_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Php.g:325:5: ( comparisionCheck ( EqualityOperator ^ comparisionCheck )? )
            // Php.g:325:7: comparisionCheck ( EqualityOperator ^ comparisionCheck )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2725);
            comparisionCheck202=comparisionCheck();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck202.getTree());

            // Php.g:325:24: ( EqualityOperator ^ comparisionCheck )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EqualityOperator) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Php.g:325:25: EqualityOperator ^ comparisionCheck
                    {
                    EqualityOperator203=(Token)match(input,EqualityOperator,FOLLOW_EqualityOperator_in_equalityCheck2728); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EqualityOperator203_tree = 
                    (CommonTree)adaptor.create(EqualityOperator203)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EqualityOperator203_tree, root_0);
                    }

                    pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2731);
                    comparisionCheck204=comparisionCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck204.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, equalityCheck_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityCheck"


    public static class comparisionCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisionCheck"
    // Php.g:328:1: comparisionCheck : bitWiseShift ( ComparisionOperator ^ bitWiseShift )? ;
    public final PhpParser.comparisionCheck_return comparisionCheck() throws RecognitionException {
        PhpParser.comparisionCheck_return retval = new PhpParser.comparisionCheck_return();
        retval.start = input.LT(1);

        int comparisionCheck_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ComparisionOperator206=null;
        PhpParser.bitWiseShift_return bitWiseShift205 =null;

        PhpParser.bitWiseShift_return bitWiseShift207 =null;


        CommonTree ComparisionOperator206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Php.g:329:5: ( bitWiseShift ( ComparisionOperator ^ bitWiseShift )? )
            // Php.g:329:7: bitWiseShift ( ComparisionOperator ^ bitWiseShift )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2754);
            bitWiseShift205=bitWiseShift();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift205.getTree());

            // Php.g:329:20: ( ComparisionOperator ^ bitWiseShift )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ComparisionOperator) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // Php.g:329:21: ComparisionOperator ^ bitWiseShift
                    {
                    ComparisionOperator206=(Token)match(input,ComparisionOperator,FOLLOW_ComparisionOperator_in_comparisionCheck2757); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ComparisionOperator206_tree = 
                    (CommonTree)adaptor.create(ComparisionOperator206)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ComparisionOperator206_tree, root_0);
                    }

                    pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2760);
                    bitWiseShift207=bitWiseShift();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift207.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, comparisionCheck_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "comparisionCheck"


    public static class bitWiseShift_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitWiseShift"
    // Php.g:332:1: bitWiseShift : addition ( ShiftOperator ^ addition )* ;
    public final PhpParser.bitWiseShift_return bitWiseShift() throws RecognitionException {
        PhpParser.bitWiseShift_return retval = new PhpParser.bitWiseShift_return();
        retval.start = input.LT(1);

        int bitWiseShift_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ShiftOperator209=null;
        PhpParser.addition_return addition208 =null;

        PhpParser.addition_return addition210 =null;


        CommonTree ShiftOperator209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Php.g:333:5: ( addition ( ShiftOperator ^ addition )* )
            // Php.g:333:7: addition ( ShiftOperator ^ addition )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_addition_in_bitWiseShift2779);
            addition208=addition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addition208.getTree());

            // Php.g:333:16: ( ShiftOperator ^ addition )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==ShiftOperator) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Php.g:333:17: ShiftOperator ^ addition
            	    {
            	    ShiftOperator209=(Token)match(input,ShiftOperator,FOLLOW_ShiftOperator_in_bitWiseShift2782); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ShiftOperator209_tree = 
            	    (CommonTree)adaptor.create(ShiftOperator209)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(ShiftOperator209_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_addition_in_bitWiseShift2785);
            	    addition210=addition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addition210.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, bitWiseShift_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitWiseShift"


    public static class addition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addition"
    // Php.g:336:1: addition : multiplication ( ( Plus | Minus | Dot ) ^ multiplication )* ;
    public final PhpParser.addition_return addition() throws RecognitionException {
        PhpParser.addition_return retval = new PhpParser.addition_return();
        retval.start = input.LT(1);

        int addition_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set212=null;
        PhpParser.multiplication_return multiplication211 =null;

        PhpParser.multiplication_return multiplication213 =null;


        CommonTree set212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Php.g:337:5: ( multiplication ( ( Plus | Minus | Dot ) ^ multiplication )* )
            // Php.g:337:7: multiplication ( ( Plus | Minus | Dot ) ^ multiplication )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplication_in_addition2808);
            multiplication211=multiplication();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication211.getTree());

            // Php.g:337:22: ( ( Plus | Minus | Dot ) ^ multiplication )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==Dot||LA57_0==Minus||LA57_0==Plus) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Php.g:337:23: ( Plus | Minus | Dot ) ^ multiplication
            	    {
            	    set212=(Token)input.LT(1);

            	    set212=(Token)input.LT(1);

            	    if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set212)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplication_in_addition2824);
            	    multiplication213=multiplication();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication213.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, addition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "addition"


    public static class multiplication_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplication"
    // Php.g:340:1: multiplication : logicalNot ( ( Asterisk | Forwardslash | Percent ) ^ logicalNot )* ;
    public final PhpParser.multiplication_return multiplication() throws RecognitionException {
        PhpParser.multiplication_return retval = new PhpParser.multiplication_return();
        retval.start = input.LT(1);

        int multiplication_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set215=null;
        PhpParser.logicalNot_return logicalNot214 =null;

        PhpParser.logicalNot_return logicalNot216 =null;


        CommonTree set215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Php.g:341:5: ( logicalNot ( ( Asterisk | Forwardslash | Percent ) ^ logicalNot )* )
            // Php.g:341:7: logicalNot ( ( Asterisk | Forwardslash | Percent ) ^ logicalNot )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logicalNot_in_multiplication2843);
            logicalNot214=logicalNot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot214.getTree());

            // Php.g:341:18: ( ( Asterisk | Forwardslash | Percent ) ^ logicalNot )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==Asterisk||LA58_0==Forwardslash||LA58_0==Percent) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Php.g:341:19: ( Asterisk | Forwardslash | Percent ) ^ logicalNot
            	    {
            	    set215=(Token)input.LT(1);

            	    set215=(Token)input.LT(1);

            	    if ( input.LA(1)==Asterisk||input.LA(1)==Forwardslash||input.LA(1)==Percent ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set215)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_logicalNot_in_multiplication2859);
            	    logicalNot216=logicalNot();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot216.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, multiplication_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multiplication"


    public static class logicalNot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalNot"
    // Php.g:344:1: logicalNot : ( Bang ^ logicalNot | instanceOf );
    public final PhpParser.logicalNot_return logicalNot() throws RecognitionException {
        PhpParser.logicalNot_return retval = new PhpParser.logicalNot_return();
        retval.start = input.LT(1);

        int logicalNot_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Bang217=null;
        PhpParser.logicalNot_return logicalNot218 =null;

        PhpParser.instanceOf_return instanceOf219 =null;


        CommonTree Bang217_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Php.g:345:5: ( Bang ^ logicalNot | instanceOf )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Bang) ) {
                alt59=1;
            }
            else if ( (LA59_0==Ampersand||LA59_0==Array||LA59_0==Boolean||LA59_0==Clone||LA59_0==Dollar||LA59_0==DoubleQuotedString||LA59_0==HereDoc||LA59_0==IncrementOperator||LA59_0==Integer||LA59_0==Minus||LA59_0==New||LA59_0==OpenBrace||LA59_0==Real||LA59_0==SingleQuotedString||LA59_0==SuppressWarnings||LA59_0==Tilde||LA59_0==UnquotedString) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // Php.g:345:7: Bang ^ logicalNot
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Bang217=(Token)match(input,Bang,FOLLOW_Bang_in_logicalNot2878); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Bang217_tree = 
                    (CommonTree)adaptor.create(Bang217)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Bang217_tree, root_0);
                    }

                    pushFollow(FOLLOW_logicalNot_in_logicalNot2881);
                    logicalNot218=logicalNot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot218.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:346:7: instanceOf
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_instanceOf_in_logicalNot2889);
                    instanceOf219=instanceOf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf219.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, logicalNot_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalNot"


    public static class instanceOf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instanceOf"
    // Php.g:349:1: instanceOf : negateOrCast ( Instanceof ^ negateOrCast )? ;
    public final PhpParser.instanceOf_return instanceOf() throws RecognitionException {
        PhpParser.instanceOf_return retval = new PhpParser.instanceOf_return();
        retval.start = input.LT(1);

        int instanceOf_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Instanceof221=null;
        PhpParser.negateOrCast_return negateOrCast220 =null;

        PhpParser.negateOrCast_return negateOrCast222 =null;


        CommonTree Instanceof221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Php.g:350:5: ( negateOrCast ( Instanceof ^ negateOrCast )? )
            // Php.g:350:7: negateOrCast ( Instanceof ^ negateOrCast )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_negateOrCast_in_instanceOf2906);
            negateOrCast220=negateOrCast();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast220.getTree());

            // Php.g:350:20: ( Instanceof ^ negateOrCast )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Instanceof) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // Php.g:350:21: Instanceof ^ negateOrCast
                    {
                    Instanceof221=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2909); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Instanceof221_tree = 
                    (CommonTree)adaptor.create(Instanceof221)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Instanceof221_tree, root_0);
                    }

                    pushFollow(FOLLOW_negateOrCast_in_instanceOf2912);
                    negateOrCast222=negateOrCast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast222.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, instanceOf_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "instanceOf"


    public static class negateOrCast_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negateOrCast"
    // Php.g:353:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) ^ increment | OpenBrace PrimitiveType CloseBrace increment -> ^( Cast PrimitiveType increment ) | OpenBrace ! weakLogicalAnd CloseBrace !| increment );
    public final PhpParser.negateOrCast_return negateOrCast() throws RecognitionException {
        PhpParser.negateOrCast_return retval = new PhpParser.negateOrCast_return();
        retval.start = input.LT(1);

        int negateOrCast_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set223=null;
        Token OpenBrace225=null;
        Token PrimitiveType226=null;
        Token CloseBrace227=null;
        Token OpenBrace229=null;
        Token CloseBrace231=null;
        PhpParser.increment_return increment224 =null;

        PhpParser.increment_return increment228 =null;

        PhpParser.weakLogicalAnd_return weakLogicalAnd230 =null;

        PhpParser.increment_return increment232 =null;


        CommonTree set223_tree=null;
        CommonTree OpenBrace225_tree=null;
        CommonTree PrimitiveType226_tree=null;
        CommonTree CloseBrace227_tree=null;
        CommonTree OpenBrace229_tree=null;
        CommonTree CloseBrace231_tree=null;
        RewriteRuleTokenStream stream_PrimitiveType=new RewriteRuleTokenStream(adaptor,"token PrimitiveType");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleSubtreeStream stream_increment=new RewriteRuleSubtreeStream(adaptor,"rule increment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Php.g:354:5: ( ( Tilde | Minus | SuppressWarnings ) ^ increment | OpenBrace PrimitiveType CloseBrace increment -> ^( Cast PrimitiveType increment ) | OpenBrace ! weakLogicalAnd CloseBrace !| increment )
            int alt61=4;
            switch ( input.LA(1) ) {
            case Minus:
            case SuppressWarnings:
            case Tilde:
                {
                alt61=1;
                }
                break;
            case OpenBrace:
                {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==PrimitiveType) ) {
                    alt61=2;
                }
                else if ( (LA61_2==Ampersand||LA61_2==Array||LA61_2==Bang||LA61_2==Boolean||LA61_2==Clone||LA61_2==Dollar||LA61_2==DoubleQuotedString||LA61_2==HereDoc||LA61_2==IncrementOperator||LA61_2==Integer||LA61_2==Minus||LA61_2==New||LA61_2==OpenBrace||LA61_2==Real||LA61_2==SingleQuotedString||LA61_2==SuppressWarnings||LA61_2==Tilde||LA61_2==UnquotedString) ) {
                    alt61=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;

                }
                }
                break;
            case Ampersand:
            case Array:
            case Boolean:
            case Clone:
            case Dollar:
            case DoubleQuotedString:
            case HereDoc:
            case IncrementOperator:
            case Integer:
            case New:
            case Real:
            case SingleQuotedString:
            case UnquotedString:
                {
                alt61=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // Php.g:354:7: ( Tilde | Minus | SuppressWarnings ) ^ increment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    set223=(Token)input.LT(1);

                    set223=(Token)input.LT(1);

                    if ( input.LA(1)==Minus||input.LA(1)==SuppressWarnings||input.LA(1)==Tilde ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(set223)
                        , root_0);
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_increment_in_negateOrCast2944);
                    increment224=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, increment224.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:355:7: OpenBrace PrimitiveType CloseBrace increment
                    {
                    OpenBrace225=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_negateOrCast2952); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace225);


                    PrimitiveType226=(Token)match(input,PrimitiveType,FOLLOW_PrimitiveType_in_negateOrCast2954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PrimitiveType.add(PrimitiveType226);


                    CloseBrace227=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_negateOrCast2956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace227);


                    pushFollow(FOLLOW_increment_in_negateOrCast2958);
                    increment228=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_increment.add(increment228.getTree());

                    // AST REWRITE
                    // elements: PrimitiveType, increment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 355:52: -> ^( Cast PrimitiveType increment )
                    {
                        // Php.g:355:55: ^( Cast PrimitiveType increment )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Cast, "Cast")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_PrimitiveType.nextNode()
                        );

                        adaptor.addChild(root_1, stream_increment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Php.g:356:7: OpenBrace ! weakLogicalAnd CloseBrace !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    OpenBrace229=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_negateOrCast2976); if (state.failed) return retval;

                    pushFollow(FOLLOW_weakLogicalAnd_in_negateOrCast2979);
                    weakLogicalAnd230=weakLogicalAnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd230.getTree());

                    CloseBrace231=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_negateOrCast2981); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Php.g:357:7: increment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_increment_in_negateOrCast2990);
                    increment232=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, increment232.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, negateOrCast_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "negateOrCast"


    public static class increment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "increment"
    // Php.g:360:1: increment : ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone );
    public final PhpParser.increment_return increment() throws RecognitionException {
        PhpParser.increment_return retval = new PhpParser.increment_return();
        retval.start = input.LT(1);

        int increment_StartIndex = input.index();

        CommonTree root_0 = null;

        Token IncrementOperator233=null;
        Token IncrementOperator236=null;
        PhpParser.name_return name234 =null;

        PhpParser.name_return name235 =null;

        PhpParser.newOrClone_return newOrClone237 =null;


        CommonTree IncrementOperator233_tree=null;
        CommonTree IncrementOperator236_tree=null;
        RewriteRuleTokenStream stream_IncrementOperator=new RewriteRuleTokenStream(adaptor,"token IncrementOperator");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Php.g:361:5: ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone )
            int alt62=3;
            switch ( input.LA(1) ) {
            case IncrementOperator:
                {
                alt62=1;
                }
                break;
            case UnquotedString:
                {
                switch ( input.LA(2) ) {
                case ClassMember:
                    {
                    int LA62_14 = input.LA(3);

                    if ( (synpred92_Php()) ) {
                        alt62=2;
                    }
                    else if ( (true) ) {
                        alt62=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 14, input);

                        throw nvae;

                    }
                    }
                    break;
                case OpenSquareBrace:
                    {
                    int LA62_15 = input.LA(3);

                    if ( (synpred92_Php()) ) {
                        alt62=2;
                    }
                    else if ( (true) ) {
                        alt62=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 15, input);

                        throw nvae;

                    }
                    }
                    break;
                case InstanceMember:
                    {
                    int LA62_16 = input.LA(3);

                    if ( (synpred92_Php()) ) {
                        alt62=2;
                    }
                    else if ( (true) ) {
                        alt62=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 16, input);

                        throw nvae;

                    }
                    }
                    break;
                case IncrementOperator:
                    {
                    alt62=2;
                    }
                    break;
                case EOF:
                case Ampersand:
                case And:
                case ArrayAssign:
                case Asterisk:
                case BodyString:
                case CloseBrace:
                case CloseSquareBrace:
                case Colon:
                case Comma:
                case ComparisionOperator:
                case Dot:
                case EqualityOperator:
                case Forwardslash:
                case Instanceof:
                case LogicalAnd:
                case LogicalOr:
                case Minus:
                case OpenBrace:
                case Or:
                case Percent:
                case Pipe:
                case Plus:
                case QuestionMark:
                case SemiColon:
                case ShiftOperator:
                case Xor:
                    {
                    alt62=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;

                }

                }
                break;
            case Dollar:
                {
                int LA62_3 = input.LA(2);

                if ( (LA62_3==Dollar) ) {
                    int LA62_41 = input.LA(3);

                    if ( (synpred92_Php()) ) {
                        alt62=2;
                    }
                    else if ( (true) ) {
                        alt62=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 41, input);

                        throw nvae;

                    }
                }
                else if ( (LA62_3==UnquotedString) ) {
                    int LA62_42 = input.LA(3);

                    if ( (synpred92_Php()) ) {
                        alt62=2;
                    }
                    else if ( (true) ) {
                        alt62=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 42, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 3, input);

                    throw nvae;

                }
                }
                break;
            case Ampersand:
            case Array:
            case Boolean:
            case Clone:
            case DoubleQuotedString:
            case HereDoc:
            case Integer:
            case New:
            case Real:
            case SingleQuotedString:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // Php.g:361:7: IncrementOperator name
                    {
                    IncrementOperator233=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator233);


                    pushFollow(FOLLOW_name_in_increment3009);
                    name234=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name234.getTree());

                    // AST REWRITE
                    // elements: IncrementOperator, name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 361:30: -> ^( Prefix IncrementOperator name )
                    {
                        // Php.g:361:33: ^( Prefix IncrementOperator name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Prefix, "Prefix")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IncrementOperator.nextNode()
                        );

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Php.g:362:7: name IncrementOperator
                    {
                    pushFollow(FOLLOW_name_in_increment3027);
                    name235=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name235.getTree());

                    IncrementOperator236=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator236);


                    // AST REWRITE
                    // elements: IncrementOperator, name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 362:30: -> ^( Postfix IncrementOperator name )
                    {
                        // Php.g:362:33: ^( Postfix IncrementOperator name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Postfix, "Postfix")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IncrementOperator.nextNode()
                        );

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Php.g:363:7: newOrClone
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_newOrClone_in_increment3047);
                    newOrClone237=newOrClone();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone237.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, increment_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "increment"


    public static class newOrClone_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "newOrClone"
    // Php.g:366:1: newOrClone : ( New ^ nameOrFunctionCall | Clone ^ name | atomOrReference );
    public final PhpParser.newOrClone_return newOrClone() throws RecognitionException {
        PhpParser.newOrClone_return retval = new PhpParser.newOrClone_return();
        retval.start = input.LT(1);

        int newOrClone_StartIndex = input.index();

        CommonTree root_0 = null;

        Token New238=null;
        Token Clone240=null;
        PhpParser.nameOrFunctionCall_return nameOrFunctionCall239 =null;

        PhpParser.name_return name241 =null;

        PhpParser.atomOrReference_return atomOrReference242 =null;


        CommonTree New238_tree=null;
        CommonTree Clone240_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Php.g:367:5: ( New ^ nameOrFunctionCall | Clone ^ name | atomOrReference )
            int alt63=3;
            switch ( input.LA(1) ) {
            case New:
                {
                alt63=1;
                }
                break;
            case Clone:
                {
                alt63=2;
                }
                break;
            case Ampersand:
            case Array:
            case Boolean:
            case Dollar:
            case DoubleQuotedString:
            case HereDoc:
            case Integer:
            case Real:
            case SingleQuotedString:
            case UnquotedString:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // Php.g:367:7: New ^ nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    New238=(Token)match(input,New,FOLLOW_New_in_newOrClone3064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    New238_tree = 
                    (CommonTree)adaptor.create(New238)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(New238_tree, root_0);
                    }

                    pushFollow(FOLLOW_nameOrFunctionCall_in_newOrClone3067);
                    nameOrFunctionCall239=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall239.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:368:7: Clone ^ name
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Clone240=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone3075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Clone240_tree = 
                    (CommonTree)adaptor.create(Clone240)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Clone240_tree, root_0);
                    }

                    pushFollow(FOLLOW_name_in_newOrClone3078);
                    name241=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name241.getTree());

                    }
                    break;
                case 3 :
                    // Php.g:369:7: atomOrReference
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atomOrReference_in_newOrClone3086);
                    atomOrReference242=atomOrReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomOrReference242.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, newOrClone_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "newOrClone"


    public static class atomOrReference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomOrReference"
    // Php.g:372:1: atomOrReference : ( atom | reference );
    public final PhpParser.atomOrReference_return atomOrReference() throws RecognitionException {
        PhpParser.atomOrReference_return retval = new PhpParser.atomOrReference_return();
        retval.start = input.LT(1);

        int atomOrReference_StartIndex = input.index();

        CommonTree root_0 = null;

        PhpParser.atom_return atom243 =null;

        PhpParser.reference_return reference244 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Php.g:373:5: ( atom | reference )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Array||LA64_0==Boolean||LA64_0==DoubleQuotedString||LA64_0==HereDoc||LA64_0==Integer||LA64_0==Real||LA64_0==SingleQuotedString) ) {
                alt64=1;
            }
            else if ( (LA64_0==Ampersand||LA64_0==Dollar||LA64_0==UnquotedString) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // Php.g:373:7: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_atomOrReference3103);
                    atom243=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom243.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:374:7: reference
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_reference_in_atomOrReference3111);
                    reference244=reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference244.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, atomOrReference_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "atomOrReference"


    public static class arrayDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayDeclaration"
    // Php.g:377:1: arrayDeclaration : Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace -> ^( Array ( arrayEntry )* ) ;
    public final PhpParser.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
        PhpParser.arrayDeclaration_return retval = new PhpParser.arrayDeclaration_return();
        retval.start = input.LT(1);

        int arrayDeclaration_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Array245=null;
        Token OpenBrace246=null;
        Token Comma248=null;
        Token CloseBrace250=null;
        PhpParser.arrayEntry_return arrayEntry247 =null;

        PhpParser.arrayEntry_return arrayEntry249 =null;


        CommonTree Array245_tree=null;
        CommonTree OpenBrace246_tree=null;
        CommonTree Comma248_tree=null;
        CommonTree CloseBrace250_tree=null;
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_Array=new RewriteRuleTokenStream(adaptor,"token Array");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_arrayEntry=new RewriteRuleSubtreeStream(adaptor,"rule arrayEntry");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Php.g:378:5: ( Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace -> ^( Array ( arrayEntry )* ) )
            // Php.g:378:7: Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace
            {
            Array245=(Token)match(input,Array,FOLLOW_Array_in_arrayDeclaration3128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Array.add(Array245);


            OpenBrace246=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_arrayDeclaration3130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace246);


            // Php.g:378:23: ( arrayEntry ( Comma arrayEntry )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Ampersand||LA66_0==Array||LA66_0==Bang||LA66_0==Boolean||LA66_0==Clone||LA66_0==Dollar||LA66_0==DoubleQuotedString||LA66_0==HereDoc||LA66_0==IncrementOperator||LA66_0==Integer||LA66_0==Minus||LA66_0==New||LA66_0==OpenBrace||LA66_0==Real||LA66_0==SingleQuotedString||LA66_0==SuppressWarnings||LA66_0==Tilde||LA66_0==UnquotedString) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // Php.g:378:24: arrayEntry ( Comma arrayEntry )*
                    {
                    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3133);
                    arrayEntry247=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry247.getTree());

                    // Php.g:378:35: ( Comma arrayEntry )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==Comma) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // Php.g:378:36: Comma arrayEntry
                    	    {
                    	    Comma248=(Token)match(input,Comma,FOLLOW_Comma_in_arrayDeclaration3136); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Comma.add(Comma248);


                    	    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3138);
                    	    arrayEntry249=arrayEntry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry249.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }


            CloseBrace250=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_arrayDeclaration3144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace250);


            // AST REWRITE
            // elements: Array, arrayEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 378:68: -> ^( Array ( arrayEntry )* )
            {
                // Php.g:378:71: ^( Array ( arrayEntry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_Array.nextNode()
                , root_1);

                // Php.g:378:79: ( arrayEntry )*
                while ( stream_arrayEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayEntry.nextTree());

                }
                stream_arrayEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, arrayDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayDeclaration"


    public static class arrayEntry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayEntry"
    // Php.g:381:1: arrayEntry : ( keyValuePair | expression ) ;
    public final PhpParser.arrayEntry_return arrayEntry() throws RecognitionException {
        PhpParser.arrayEntry_return retval = new PhpParser.arrayEntry_return();
        retval.start = input.LT(1);

        int arrayEntry_StartIndex = input.index();

        CommonTree root_0 = null;

        PhpParser.keyValuePair_return keyValuePair251 =null;

        PhpParser.expression_return expression252 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Php.g:382:5: ( ( keyValuePair | expression ) )
            // Php.g:382:7: ( keyValuePair | expression )
            {
            root_0 = (CommonTree)adaptor.nil();


            // Php.g:382:7: ( keyValuePair | expression )
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // Php.g:382:8: keyValuePair
                    {
                    pushFollow(FOLLOW_keyValuePair_in_arrayEntry3171);
                    keyValuePair251=keyValuePair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyValuePair251.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:382:23: expression
                    {
                    pushFollow(FOLLOW_expression_in_arrayEntry3175);
                    expression252=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression252.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, arrayEntry_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayEntry"


    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keyValuePair"
    // Php.g:385:1: keyValuePair : ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) ;
    public final PhpParser.keyValuePair_return keyValuePair() throws RecognitionException {
        PhpParser.keyValuePair_return retval = new PhpParser.keyValuePair_return();
        retval.start = input.LT(1);

        int keyValuePair_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ArrayAssign254=null;
        PhpParser.expression_return expression253 =null;

        PhpParser.expression_return expression255 =null;


        CommonTree ArrayAssign254_tree=null;
        RewriteRuleTokenStream stream_ArrayAssign=new RewriteRuleTokenStream(adaptor,"token ArrayAssign");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Php.g:386:5: ( ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) )
            // Php.g:386:7: ( expression ArrayAssign expression )
            {
            // Php.g:386:7: ( expression ArrayAssign expression )
            // Php.g:386:8: expression ArrayAssign expression
            {
            pushFollow(FOLLOW_expression_in_keyValuePair3194);
            expression253=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression253.getTree());

            ArrayAssign254=(Token)match(input,ArrayAssign,FOLLOW_ArrayAssign_in_keyValuePair3196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ArrayAssign.add(ArrayAssign254);


            pushFollow(FOLLOW_expression_in_keyValuePair3198);
            expression255=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression255.getTree());

            }


            // AST REWRITE
            // elements: ArrayAssign, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 386:43: -> ^( ArrayAssign ( expression )+ )
            {
                // Php.g:386:46: ^( ArrayAssign ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ArrayAssign.nextNode()
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, keyValuePair_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "keyValuePair"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // Php.g:389:1: atom : ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration );
    public final PhpParser.atom_return atom() throws RecognitionException {
        PhpParser.atom_return retval = new PhpParser.atom_return();
        retval.start = input.LT(1);

        int atom_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SingleQuotedString256=null;
        Token DoubleQuotedString257=null;
        Token HereDoc258=null;
        Token Integer259=null;
        Token Real260=null;
        Token Boolean261=null;
        PhpParser.arrayDeclaration_return arrayDeclaration262 =null;


        CommonTree SingleQuotedString256_tree=null;
        CommonTree DoubleQuotedString257_tree=null;
        CommonTree HereDoc258_tree=null;
        CommonTree Integer259_tree=null;
        CommonTree Real260_tree=null;
        CommonTree Boolean261_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Php.g:389:5: ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration )
            int alt68=7;
            switch ( input.LA(1) ) {
            case SingleQuotedString:
                {
                alt68=1;
                }
                break;
            case DoubleQuotedString:
                {
                alt68=2;
                }
                break;
            case HereDoc:
                {
                alt68=3;
                }
                break;
            case Integer:
                {
                alt68=4;
                }
                break;
            case Real:
                {
                alt68=5;
                }
                break;
            case Boolean:
                {
                alt68=6;
                }
                break;
            case Array:
                {
                alt68=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // Php.g:389:7: SingleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SingleQuotedString256=(Token)match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom3220); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SingleQuotedString256_tree = 
                    (CommonTree)adaptor.create(SingleQuotedString256)
                    ;
                    adaptor.addChild(root_0, SingleQuotedString256_tree);
                    }

                    }
                    break;
                case 2 :
                    // Php.g:389:28: DoubleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DoubleQuotedString257=(Token)match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom3224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DoubleQuotedString257_tree = 
                    (CommonTree)adaptor.create(DoubleQuotedString257)
                    ;
                    adaptor.addChild(root_0, DoubleQuotedString257_tree);
                    }

                    }
                    break;
                case 3 :
                    // Php.g:389:49: HereDoc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    HereDoc258=(Token)match(input,HereDoc,FOLLOW_HereDoc_in_atom3228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HereDoc258_tree = 
                    (CommonTree)adaptor.create(HereDoc258)
                    ;
                    adaptor.addChild(root_0, HereDoc258_tree);
                    }

                    }
                    break;
                case 4 :
                    // Php.g:389:59: Integer
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Integer259=(Token)match(input,Integer,FOLLOW_Integer_in_atom3232); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Integer259_tree = 
                    (CommonTree)adaptor.create(Integer259)
                    ;
                    adaptor.addChild(root_0, Integer259_tree);
                    }

                    }
                    break;
                case 5 :
                    // Php.g:389:69: Real
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Real260=(Token)match(input,Real,FOLLOW_Real_in_atom3236); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Real260_tree = 
                    (CommonTree)adaptor.create(Real260)
                    ;
                    adaptor.addChild(root_0, Real260_tree);
                    }

                    }
                    break;
                case 6 :
                    // Php.g:389:76: Boolean
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Boolean261=(Token)match(input,Boolean,FOLLOW_Boolean_in_atom3240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Boolean261_tree = 
                    (CommonTree)adaptor.create(Boolean261)
                    ;
                    adaptor.addChild(root_0, Boolean261_tree);
                    }

                    }
                    break;
                case 7 :
                    // Php.g:389:86: arrayDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_arrayDeclaration_in_atom3244);
                    arrayDeclaration262=arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayDeclaration262.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, atom_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class reference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reference"
    // Php.g:393:1: reference : ( Ampersand ^ nameOrFunctionCall | nameOrFunctionCall );
    public final PhpParser.reference_return reference() throws RecognitionException {
        PhpParser.reference_return retval = new PhpParser.reference_return();
        retval.start = input.LT(1);

        int reference_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Ampersand263=null;
        PhpParser.nameOrFunctionCall_return nameOrFunctionCall264 =null;

        PhpParser.nameOrFunctionCall_return nameOrFunctionCall265 =null;


        CommonTree Ampersand263_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Php.g:394:5: ( Ampersand ^ nameOrFunctionCall | nameOrFunctionCall )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Ampersand) ) {
                alt69=1;
            }
            else if ( (LA69_0==Dollar||LA69_0==UnquotedString) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // Php.g:394:7: Ampersand ^ nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Ampersand263=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_reference3262); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ampersand263_tree = 
                    (CommonTree)adaptor.create(Ampersand263)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Ampersand263_tree, root_0);
                    }

                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference3265);
                    nameOrFunctionCall264=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall264.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:395:7: nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference3273);
                    nameOrFunctionCall265=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall265.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, reference_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "reference"


    public static class nameOrFunctionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nameOrFunctionCall"
    // Php.g:398:1: nameOrFunctionCall : ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace -> ^( Apply name ( expression )* ) | name );
    public final PhpParser.nameOrFunctionCall_return nameOrFunctionCall() throws RecognitionException {
        PhpParser.nameOrFunctionCall_return retval = new PhpParser.nameOrFunctionCall_return();
        retval.start = input.LT(1);

        int nameOrFunctionCall_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OpenBrace267=null;
        Token Comma269=null;
        Token CloseBrace271=null;
        PhpParser.name_return name266 =null;

        PhpParser.expression_return expression268 =null;

        PhpParser.expression_return expression270 =null;

        PhpParser.name_return name272 =null;


        CommonTree OpenBrace267_tree=null;
        CommonTree Comma269_tree=null;
        CommonTree CloseBrace271_tree=null;
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Php.g:399:5: ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace -> ^( Apply name ( expression )* ) | name )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==UnquotedString) ) {
                switch ( input.LA(2) ) {
                case ClassMember:
                    {
                    int LA72_3 = input.LA(3);

                    if ( (synpred108_Php()) ) {
                        alt72=1;
                    }
                    else if ( (true) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 3, input);

                        throw nvae;

                    }
                    }
                    break;
                case OpenSquareBrace:
                    {
                    int LA72_4 = input.LA(3);

                    if ( (synpred108_Php()) ) {
                        alt72=1;
                    }
                    else if ( (true) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 4, input);

                        throw nvae;

                    }
                    }
                    break;
                case InstanceMember:
                    {
                    int LA72_5 = input.LA(3);

                    if ( (synpred108_Php()) ) {
                        alt72=1;
                    }
                    else if ( (true) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case OpenBrace:
                    {
                    alt72=1;
                    }
                    break;
                case EOF:
                case Ampersand:
                case And:
                case ArrayAssign:
                case Asterisk:
                case BodyString:
                case CloseBrace:
                case CloseSquareBrace:
                case Colon:
                case Comma:
                case ComparisionOperator:
                case Dot:
                case EqualityOperator:
                case Forwardslash:
                case Instanceof:
                case LogicalAnd:
                case LogicalOr:
                case Minus:
                case Or:
                case Percent:
                case Pipe:
                case Plus:
                case QuestionMark:
                case SemiColon:
                case ShiftOperator:
                case Xor:
                    {
                    alt72=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA72_0==Dollar) ) {
                int LA72_2 = input.LA(2);

                if ( (LA72_2==Dollar) ) {
                    int LA72_29 = input.LA(3);

                    if ( (synpred108_Php()) ) {
                        alt72=1;
                    }
                    else if ( (true) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 29, input);

                        throw nvae;

                    }
                }
                else if ( (LA72_2==UnquotedString) ) {
                    int LA72_30 = input.LA(3);

                    if ( (synpred108_Php()) ) {
                        alt72=1;
                    }
                    else if ( (true) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 30, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // Php.g:399:7: name OpenBrace ( expression ( Comma expression )* )? CloseBrace
                    {
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3290);
                    name266=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name266.getTree());

                    OpenBrace267=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_nameOrFunctionCall3292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace267);


                    // Php.g:399:22: ( expression ( Comma expression )* )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==Ampersand||LA71_0==Array||LA71_0==Bang||LA71_0==Boolean||LA71_0==Clone||LA71_0==Dollar||LA71_0==DoubleQuotedString||LA71_0==HereDoc||LA71_0==IncrementOperator||LA71_0==Integer||LA71_0==Minus||LA71_0==New||LA71_0==OpenBrace||LA71_0==Real||LA71_0==SingleQuotedString||LA71_0==SuppressWarnings||LA71_0==Tilde||LA71_0==UnquotedString) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // Php.g:399:23: expression ( Comma expression )*
                            {
                            pushFollow(FOLLOW_expression_in_nameOrFunctionCall3295);
                            expression268=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression268.getTree());

                            // Php.g:399:34: ( Comma expression )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==Comma) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // Php.g:399:35: Comma expression
                            	    {
                            	    Comma269=(Token)match(input,Comma,FOLLOW_Comma_in_nameOrFunctionCall3298); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_Comma.add(Comma269);


                            	    pushFollow(FOLLOW_expression_in_nameOrFunctionCall3300);
                            	    expression270=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_expression.add(expression270.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop70;
                                }
                            } while (true);


                            }
                            break;

                    }


                    CloseBrace271=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_nameOrFunctionCall3306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace271);


                    // AST REWRITE
                    // elements: name, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 399:67: -> ^( Apply name ( expression )* )
                    {
                        // Php.g:399:70: ^( Apply name ( expression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(Apply, "Apply")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        // Php.g:399:83: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Php.g:400:7: name
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3325);
                    name272=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name272.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, nameOrFunctionCall_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nameOrFunctionCall"


    public static class name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // Php.g:403:1: name : ( staticMemberAccess | memberAccess | variable );
    public final PhpParser.name_return name() throws RecognitionException {
        PhpParser.name_return retval = new PhpParser.name_return();
        retval.start = input.LT(1);

        int name_StartIndex = input.index();

        CommonTree root_0 = null;

        PhpParser.staticMemberAccess_return staticMemberAccess273 =null;

        PhpParser.memberAccess_return memberAccess274 =null;

        PhpParser.variable_return variable275 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Php.g:403:5: ( staticMemberAccess | memberAccess | variable )
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==UnquotedString) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==ClassMember) ) {
                    alt73=1;
                }
                else if ( (synpred110_Php()) ) {
                    alt73=2;
                }
                else if ( (true) ) {
                    alt73=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA73_0==Dollar) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==Dollar) ) {
                    int LA73_33 = input.LA(3);

                    if ( (synpred110_Php()) ) {
                        alt73=2;
                    }
                    else if ( (true) ) {
                        alt73=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 33, input);

                        throw nvae;

                    }
                }
                else if ( (LA73_2==UnquotedString) ) {
                    int LA73_34 = input.LA(3);

                    if ( (synpred110_Php()) ) {
                        alt73=2;
                    }
                    else if ( (true) ) {
                        alt73=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 34, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // Php.g:403:7: staticMemberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_staticMemberAccess_in_name3337);
                    staticMemberAccess273=staticMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticMemberAccess273.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:404:7: memberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_memberAccess_in_name3345);
                    memberAccess274=memberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess274.getTree());

                    }
                    break;
                case 3 :
                    // Php.g:405:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_name3353);
                    variable275=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable275.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, name_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "name"


    public static class staticMemberAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "staticMemberAccess"
    // Php.g:408:1: staticMemberAccess : UnquotedString '::' ^ variable ;
    public final PhpParser.staticMemberAccess_return staticMemberAccess() throws RecognitionException {
        PhpParser.staticMemberAccess_return retval = new PhpParser.staticMemberAccess_return();
        retval.start = input.LT(1);

        int staticMemberAccess_StartIndex = input.index();

        CommonTree root_0 = null;

        Token UnquotedString276=null;
        Token string_literal277=null;
        PhpParser.variable_return variable278 =null;


        CommonTree UnquotedString276_tree=null;
        CommonTree string_literal277_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Php.g:409:5: ( UnquotedString '::' ^ variable )
            // Php.g:409:7: UnquotedString '::' ^ variable
            {
            root_0 = (CommonTree)adaptor.nil();


            UnquotedString276=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess3374); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString276_tree = 
            (CommonTree)adaptor.create(UnquotedString276)
            ;
            adaptor.addChild(root_0, UnquotedString276_tree);
            }

            string_literal277=(Token)match(input,ClassMember,FOLLOW_ClassMember_in_staticMemberAccess3376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal277_tree = 
            (CommonTree)adaptor.create(string_literal277)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal277_tree, root_0);
            }

            pushFollow(FOLLOW_variable_in_staticMemberAccess3379);
            variable278=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable278.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, staticMemberAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "staticMemberAccess"


    public static class memberAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberAccess"
    // Php.g:412:1: memberAccess : variable ( OpenSquareBrace ^ expression CloseSquareBrace !| '->' ^ UnquotedString )* ;
    public final PhpParser.memberAccess_return memberAccess() throws RecognitionException {
        PhpParser.memberAccess_return retval = new PhpParser.memberAccess_return();
        retval.start = input.LT(1);

        int memberAccess_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OpenSquareBrace280=null;
        Token CloseSquareBrace282=null;
        Token string_literal283=null;
        Token UnquotedString284=null;
        PhpParser.variable_return variable279 =null;

        PhpParser.expression_return expression281 =null;


        CommonTree OpenSquareBrace280_tree=null;
        CommonTree CloseSquareBrace282_tree=null;
        CommonTree string_literal283_tree=null;
        CommonTree UnquotedString284_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Php.g:413:5: ( variable ( OpenSquareBrace ^ expression CloseSquareBrace !| '->' ^ UnquotedString )* )
            // Php.g:413:7: variable ( OpenSquareBrace ^ expression CloseSquareBrace !| '->' ^ UnquotedString )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_variable_in_memberAccess3396);
            variable279=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable279.getTree());

            // Php.g:414:9: ( OpenSquareBrace ^ expression CloseSquareBrace !| '->' ^ UnquotedString )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==OpenSquareBrace) ) {
                    alt74=1;
                }
                else if ( (LA74_0==InstanceMember) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // Php.g:414:11: OpenSquareBrace ^ expression CloseSquareBrace !
            	    {
            	    OpenSquareBrace280=(Token)match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_memberAccess3409); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OpenSquareBrace280_tree = 
            	    (CommonTree)adaptor.create(OpenSquareBrace280)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OpenSquareBrace280_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_expression_in_memberAccess3412);
            	    expression281=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression281.getTree());

            	    CloseSquareBrace282=(Token)match(input,CloseSquareBrace,FOLLOW_CloseSquareBrace_in_memberAccess3414); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // Php.g:415:11: '->' ^ UnquotedString
            	    {
            	    string_literal283=(Token)match(input,InstanceMember,FOLLOW_InstanceMember_in_memberAccess3427); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal283_tree = 
            	    (CommonTree)adaptor.create(string_literal283)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal283_tree, root_0);
            	    }

            	    UnquotedString284=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess3430); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString284_tree = 
            	    (CommonTree)adaptor.create(UnquotedString284)
            	    ;
            	    adaptor.addChild(root_0, UnquotedString284_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, memberAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "memberAccess"


    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // Php.g:418:1: variable : ( Dollar ^ variable | UnquotedString );
    public final PhpParser.variable_return variable() throws RecognitionException {
        PhpParser.variable_return retval = new PhpParser.variable_return();
        retval.start = input.LT(1);

        int variable_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dollar285=null;
        Token UnquotedString287=null;
        PhpParser.variable_return variable286 =null;


        CommonTree Dollar285_tree=null;
        CommonTree UnquotedString287_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Php.g:419:5: ( Dollar ^ variable | UnquotedString )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Dollar) ) {
                alt75=1;
            }
            else if ( (LA75_0==UnquotedString) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // Php.g:419:7: Dollar ^ variable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Dollar285=(Token)match(input,Dollar,FOLLOW_Dollar_in_variable3453); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar285_tree = 
                    (CommonTree)adaptor.create(Dollar285)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Dollar285_tree, root_0);
                    }

                    pushFollow(FOLLOW_variable_in_variable3456);
                    variable286=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable286.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:420:7: UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    UnquotedString287=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_variable3464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString287_tree = 
                    (CommonTree)adaptor.create(UnquotedString287)
                    ;
                    adaptor.addChild(root_0, UnquotedString287_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, variable_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variable"

    // $ANTLR start synpred3_Php
    public final void synpred3_Php_fragment() throws RecognitionException {
        // Php.g:134:7: ( ( simpleStatement )? BodyString )
        // Php.g:134:7: ( simpleStatement )? BodyString
        {
        // Php.g:134:7: ( simpleStatement )?
        int alt76=2;
        int LA76_0 = input.LA(1);

        if ( (LA76_0==Ampersand||LA76_0==Array||LA76_0==Bang||(LA76_0 >= Boolean && LA76_0 <= Break)||LA76_0==Clone||LA76_0==Continue||LA76_0==Dollar||(LA76_0 >= DoubleQuotedString && LA76_0 <= Echo)||(LA76_0 >= Global && LA76_0 <= HereDoc)||LA76_0==IncrementOperator||LA76_0==Integer||LA76_0==Minus||LA76_0==New||LA76_0==OpenBrace||LA76_0==Real||(LA76_0 >= RequireOperator && LA76_0 <= Return)||LA76_0==SingleQuotedString||(LA76_0 >= Static && LA76_0 <= SuppressWarnings)||LA76_0==Tilde||LA76_0==UnquotedString) ) {
            alt76=1;
        }
        switch (alt76) {
            case 1 :
                // Php.g:134:7: simpleStatement
                {
                pushFollow(FOLLOW_simpleStatement_in_synpred3_Php890);
                simpleStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,BodyString,FOLLOW_BodyString_in_synpred3_Php893); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Php

    // $ANTLR start synpred4_Php
    public final void synpred4_Php_fragment() throws RecognitionException {
        // Php.g:135:7: ( '{' statement '}' )
        // Php.g:135:7: '{' statement '}'
        {
        match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_synpred4_Php901); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred4_Php903);
        statement();

        state._fsp--;
        if (state.failed) return ;

        match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_synpred4_Php905); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Php

    // $ANTLR start synpred5_Php
    public final void synpred5_Php_fragment() throws RecognitionException {
        // Php.g:136:7: ( bracketedBlock )
        // Php.g:136:7: bracketedBlock
        {
        pushFollow(FOLLOW_bracketedBlock_in_synpred5_Php917);
        bracketedBlock();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Php

    // $ANTLR start synpred23_Php
    public final void synpred23_Php_fragment() throws RecognitionException {
        // Php.g:184:7: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) )
        // Php.g:184:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
        {
        // Php.g:184:7: ( fieldModifier )*
        loop78:
        do {
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0 >= Abstract && LA78_0 <= AccessModifier)||LA78_0==Static) ) {
                alt78=1;
            }


            switch (alt78) {
        	case 1 :
        	    // Php.g:184:7: fieldModifier
        	    {
        	    pushFollow(FOLLOW_fieldModifier_in_synpred23_Php1397);
        	    fieldModifier();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop78;
            }
        } while (true);


        match(input,Function,FOLLOW_Function_in_synpred23_Php1400); if (state.failed) return ;

        match(input,UnquotedString,FOLLOW_UnquotedString_in_synpred23_Php1402); if (state.failed) return ;

        pushFollow(FOLLOW_parametersDefinition_in_synpred23_Php1404);
        parametersDefinition();

        state._fsp--;
        if (state.failed) return ;

        // Php.g:185:9: ( bracketedBlock | ';' )
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( (LA79_0==OpenCurlyBrace) ) {
            alt79=1;
        }
        else if ( (LA79_0==SemiColon) ) {
            alt79=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 79, 0, input);

            throw nvae;

        }
        switch (alt79) {
            case 1 :
                // Php.g:185:10: bracketedBlock
                {
                pushFollow(FOLLOW_bracketedBlock_in_synpred23_Php1416);
                bracketedBlock();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Php.g:185:27: ';'
                {
                match(input,SemiColon,FOLLOW_SemiColon_in_synpred23_Php1420); if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred23_Php

    // $ANTLR start synpred33_Php
    public final void synpred33_Php_fragment() throws RecognitionException {
        // Php.g:208:58: ( conditional )
        // Php.g:208:58: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred33_Php1709);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred33_Php

    // $ANTLR start synpred52_Php
    public final void synpred52_Php_fragment() throws RecognitionException {
        // Php.g:232:62: ( conditional )
        // Php.g:232:62: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred52_Php2044);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_Php

    // $ANTLR start synpred65_Php
    public final void synpred65_Php_fragment() throws RecognitionException {
        // Php.g:287:23: ( Or weakLogicalXor )
        // Php.g:287:23: Or weakLogicalXor
        {
        match(input,Or,FOLLOW_Or_in_synpred65_Php2459); if (state.failed) return ;

        pushFollow(FOLLOW_weakLogicalXor_in_synpred65_Php2462);
        weakLogicalXor();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred65_Php

    // $ANTLR start synpred66_Php
    public final void synpred66_Php_fragment() throws RecognitionException {
        // Php.g:291:23: ( Xor weakLogicalAnd )
        // Php.g:291:23: Xor weakLogicalAnd
        {
        match(input,Xor,FOLLOW_Xor_in_synpred66_Php2484); if (state.failed) return ;

        pushFollow(FOLLOW_weakLogicalAnd_in_synpred66_Php2487);
        weakLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred66_Php

    // $ANTLR start synpred67_Php
    public final void synpred67_Php_fragment() throws RecognitionException {
        // Php.g:295:19: ( And assignment )
        // Php.g:295:19: And assignment
        {
        match(input,And,FOLLOW_And_in_synpred67_Php2513); if (state.failed) return ;

        pushFollow(FOLLOW_assignment_in_synpred67_Php2516);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred67_Php

    // $ANTLR start synpred69_Php
    public final void synpred69_Php_fragment() throws RecognitionException {
        // Php.g:299:7: ( name ( ( Equals | AsignmentOperator ) assignment ) )
        // Php.g:299:7: name ( ( Equals | AsignmentOperator ) assignment )
        {
        pushFollow(FOLLOW_name_in_synpred69_Php2535);
        name();

        state._fsp--;
        if (state.failed) return ;

        // Php.g:299:12: ( ( Equals | AsignmentOperator ) assignment )
        // Php.g:299:13: ( Equals | AsignmentOperator ) assignment
        {
        if ( input.LA(1)==AsignmentOperator||input.LA(1)==Equals ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_assignment_in_synpred69_Php2547);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred69_Php

    // $ANTLR start synpred70_Php
    public final void synpred70_Php_fragment() throws RecognitionException {
        // Php.g:304:7: ( logicalOr QuestionMark expression Colon expression )
        // Php.g:304:7: logicalOr QuestionMark expression Colon expression
        {
        pushFollow(FOLLOW_logicalOr_in_synpred70_Php2573);
        logicalOr();

        state._fsp--;
        if (state.failed) return ;

        match(input,QuestionMark,FOLLOW_QuestionMark_in_synpred70_Php2575); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred70_Php2577);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,Colon,FOLLOW_Colon_in_synpred70_Php2579); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred70_Php2581);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred70_Php

    // $ANTLR start synpred92_Php
    public final void synpred92_Php_fragment() throws RecognitionException {
        // Php.g:362:7: ( name IncrementOperator )
        // Php.g:362:7: name IncrementOperator
        {
        pushFollow(FOLLOW_name_in_synpred92_Php3027);
        name();

        state._fsp--;
        if (state.failed) return ;

        match(input,IncrementOperator,FOLLOW_IncrementOperator_in_synpred92_Php3029); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred92_Php

    // $ANTLR start synpred98_Php
    public final void synpred98_Php_fragment() throws RecognitionException {
        // Php.g:382:8: ( keyValuePair )
        // Php.g:382:8: keyValuePair
        {
        pushFollow(FOLLOW_keyValuePair_in_synpred98_Php3171);
        keyValuePair();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred98_Php

    // $ANTLR start synpred108_Php
    public final void synpred108_Php_fragment() throws RecognitionException {
        // Php.g:399:7: ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace )
        // Php.g:399:7: name OpenBrace ( expression ( Comma expression )* )? CloseBrace
        {
        pushFollow(FOLLOW_name_in_synpred108_Php3290);
        name();

        state._fsp--;
        if (state.failed) return ;

        match(input,OpenBrace,FOLLOW_OpenBrace_in_synpred108_Php3292); if (state.failed) return ;

        // Php.g:399:22: ( expression ( Comma expression )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==Ampersand||LA93_0==Array||LA93_0==Bang||LA93_0==Boolean||LA93_0==Clone||LA93_0==Dollar||LA93_0==DoubleQuotedString||LA93_0==HereDoc||LA93_0==IncrementOperator||LA93_0==Integer||LA93_0==Minus||LA93_0==New||LA93_0==OpenBrace||LA93_0==Real||LA93_0==SingleQuotedString||LA93_0==SuppressWarnings||LA93_0==Tilde||LA93_0==UnquotedString) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // Php.g:399:23: expression ( Comma expression )*
                {
                pushFollow(FOLLOW_expression_in_synpred108_Php3295);
                expression();

                state._fsp--;
                if (state.failed) return ;

                // Php.g:399:34: ( Comma expression )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==Comma) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // Php.g:399:35: Comma expression
                	    {
                	    match(input,Comma,FOLLOW_Comma_in_synpred108_Php3298); if (state.failed) return ;

                	    pushFollow(FOLLOW_expression_in_synpred108_Php3300);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }


        match(input,CloseBrace,FOLLOW_CloseBrace_in_synpred108_Php3306); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred108_Php

    // $ANTLR start synpred110_Php
    public final void synpred110_Php_fragment() throws RecognitionException {
        // Php.g:404:7: ( memberAccess )
        // Php.g:404:7: memberAccess
        {
        pushFollow(FOLLOW_memberAccess_in_synpred110_Php3345);
        memberAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred110_Php

    // Delegated rules

    public final boolean synpred67_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA67 dfa67 = new DFA67(this);
    static final String DFA3_eotS =
        "\u0134\uffff";
    static final String DFA3_eofS =
        "\u0134\uffff";
    static final String DFA3_minS =
        "\1\4\1\6\2\45\2\17\3\6\1\45\3\6\3\45\6\6\1\121\1\45\1\uffff\1\4"+
        "\12\uffff\25\0\2\uffff\1\0\2\uffff\20\0\2\uffff\44\0\2\uffff\104"+
        "\0\2\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\16"+
        "\0\2\uffff\46\0\2\uffff";
    static final String DFA3_maxS =
        "\1\154\3\152\2\141\2\152\1\156\7\152\6\156\1\121\1\152\1\uffff\1"+
        "\154\12\uffff\25\0\2\uffff\1\0\2\uffff\20\0\2\uffff\44\0\2\uffff"+
        "\104\0\2\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff"+
        "\16\0\2\uffff\46\0\2\uffff";
    static final String DFA3_acceptS =
        "\30\uffff\1\1\1\uffff\1\4\1\uffff\1\5\1\6\34\uffff\1\7\u00f7\uffff"+
        "\1\3\1\2";
    static final String DFA3_specialS =
        "\44\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\uffff\1\25\2\uffff"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\1\45\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
        "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72"+
        "\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1"+
        "\106\1\107\1\110\1\111\2\uffff\1\112\1\113\1\114\1\115\1\116\1\117"+
        "\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132"+
        "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145"+
        "\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160"+
        "\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173"+
        "\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084"+
        "\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
        "\1\u008d\2\uffff\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093"+
        "\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b"+
        "\2\uffff\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2"+
        "\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\2\uffff"+
        "\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1"+
        "\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\2\uffff\1\u00b8"+
        "\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0"+
        "\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\2\uffff\1\u00c6\1\u00c7"+
        "\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf"+
        "\1\u00d0\1\u00d1\1\u00d2\1\u00d3\2\uffff\1\u00d4\1\u00d5\1\u00d6"+
        "\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de"+
        "\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6"+
        "\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\u00ee"+
        "\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6"+
        "\1\u00f7\1\u00f8\1\u00f9\2\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\32\1\uffff\1\27\2\uffff\1\26\3\uffff\1\12\1\uffff\1\30\1"+
            "\25\1\4\2\uffff\1\32\2\uffff\1\17\7\uffff\1\5\4\uffff\1\35\1"+
            "\11\1\uffff\1\21\1\1\13\uffff\1\35\3\uffff\1\35\1\uffff\1\35"+
            "\1\2\1\22\2\uffff\1\35\2\uffff\1\15\2\uffff\1\23\1\34\5\uffff"+
            "\1\13\2\uffff\1\16\1\uffff\1\14\1\31\12\uffff\1\24\1\uffff\1"+
            "\7\1\6\2\uffff\1\20\1\uffff\1\3\1\13\1\35\1\13\1\uffff\1\10"+
            "\1\uffff\1\35",
            "\1\63\2\uffff\1\62\3\uffff\1\46\2\uffff\1\61\6\uffff\1\53\15"+
            "\uffff\1\45\1\uffff\1\55\24\uffff\1\56\5\uffff\1\51\2\uffff"+
            "\1\57\6\uffff\1\47\2\uffff\1\52\1\uffff\1\50\13\uffff\1\60\5"+
            "\uffff\1\54\2\uffff\1\47\1\uffff\1\47\1\uffff\1\44",
            "\1\65\104\uffff\1\64",
            "\1\66\104\uffff\1\67",
            "\1\30\65\uffff\1\70\33\uffff\1\72",
            "\1\30\65\uffff\1\73\33\uffff\1\72",
            "\1\115\2\uffff\1\114\3\uffff\1\100\1\uffff\1\30\1\113\6\uffff"+
            "\1\105\15\uffff\1\77\1\uffff\1\107\24\uffff\1\110\5\uffff\1"+
            "\103\2\uffff\1\111\6\uffff\1\101\2\uffff\1\104\1\uffff\1\102"+
            "\13\uffff\1\112\3\uffff\1\72\1\uffff\1\106\2\uffff\1\101\1\uffff"+
            "\1\101\1\uffff\1\76",
            "\1\137\2\uffff\1\136\3\uffff\1\122\2\uffff\1\135\6\uffff\1"+
            "\127\15\uffff\1\121\1\uffff\1\131\24\uffff\1\132\5\uffff\1\125"+
            "\2\uffff\1\133\6\uffff\1\123\2\uffff\1\126\1\uffff\1\124\13"+
            "\uffff\1\134\5\uffff\1\130\2\uffff\1\123\1\uffff\1\123\1\uffff"+
            "\1\120",
            "\1\154\1\161\3\uffff\1\143\1\147\2\uffff\1\30\6\uffff\1\140"+
            "\6\uffff\1\152\10\uffff\1\150\6\uffff\1\153\1\143\12\uffff\1"+
            "\147\10\uffff\1\144\1\142\1\146\3\uffff\1\156\1\157\2\uffff"+
            "\1\150\4\uffff\1\145\1\uffff\1\141\1\163\1\uffff\1\147\1\155"+
            "\1\150\3\uffff\1\160\4\uffff\1\72\1\151\13\uffff\1\162",
            "\1\166\104\uffff\1\167",
            "\1\u0087\2\uffff\1\u0086\3\uffff\1\170\2\uffff\1\u0085\6\uffff"+
            "\1\177\15\uffff\1\175\1\uffff\1\u0081\24\uffff\1\u0082\5\uffff"+
            "\1\173\2\uffff\1\u0083\6\uffff\1\171\2\uffff\1\176\1\uffff\1"+
            "\172\13\uffff\1\u0084\5\uffff\1\u0080\2\uffff\1\171\1\uffff"+
            "\1\171\1\uffff\1\174",
            "\1\u0094\2\uffff\1\u0093\6\uffff\1\u0092\6\uffff\1\u008c\15"+
            "\uffff\1\u008a\1\uffff\1\u008e\24\uffff\1\u008f\5\uffff\1\u0088"+
            "\2\uffff\1\u0090\11\uffff\1\u008b\15\uffff\1\u0091\5\uffff\1"+
            "\u008d\6\uffff\1\u0089",
            "\1\u00a5\2\uffff\1\u00a4\3\uffff\1\u0098\2\uffff\1\u00a3\6"+
            "\uffff\1\u009d\15\uffff\1\u0097\1\uffff\1\u009f\24\uffff\1\u00a0"+
            "\5\uffff\1\u009b\2\uffff\1\u00a1\6\uffff\1\u0099\2\uffff\1\u009c"+
            "\1\uffff\1\u009a\11\uffff\1\u0095\1\uffff\1\u00a2\5\uffff\1"+
            "\u009e\2\uffff\1\u0099\1\uffff\1\u0099\1\uffff\1\u0096",
            "\1\u00a7\104\uffff\1\u00a6",
            "\1\u00a9\104\uffff\1\u00a8",
            "\1\u00ab\104\uffff\1\u00aa",
            "\1\u00b2\1\u00b7\4\uffff\1\u00ad\2\uffff\1\30\15\uffff\1\u00b0"+
            "\10\uffff\1\u00ae\6\uffff\1\u00b1\13\uffff\1\u00ad\12\uffff"+
            "\1\u00ac\3\uffff\1\u00b4\1\u00b5\2\uffff\1\u00ae\7\uffff\1\u00b9"+
            "\1\uffff\1\u00ad\1\u00b3\1\u00ae\3\uffff\1\u00b6\4\uffff\1\72"+
            "\1\u00af\13\uffff\1\u00b8",
            "\1\u00c2\1\u00c7\4\uffff\1\u00bd\2\uffff\1\30\15\uffff\1\u00c0"+
            "\10\uffff\1\u00be\6\uffff\1\u00c1\13\uffff\1\u00bd\12\uffff"+
            "\1\u00bc\3\uffff\1\u00c4\1\u00c5\2\uffff\1\u00be\7\uffff\1\u00c9"+
            "\1\uffff\1\u00bd\1\u00c3\1\u00be\3\uffff\1\u00c6\4\uffff\1\72"+
            "\1\u00bf\13\uffff\1\u00c8",
            "\1\u00d2\1\u00d7\4\uffff\1\u00cd\2\uffff\1\30\15\uffff\1\u00d0"+
            "\10\uffff\1\u00ce\6\uffff\1\u00d1\13\uffff\1\u00cd\12\uffff"+
            "\1\u00cc\3\uffff\1\u00d4\1\u00d5\2\uffff\1\u00ce\7\uffff\1\u00d9"+
            "\1\uffff\1\u00cd\1\u00d3\1\u00ce\3\uffff\1\u00d6\4\uffff\1\72"+
            "\1\u00cf\13\uffff\1\u00d8",
            "\1\u00e2\1\u00e7\4\uffff\1\u00dd\2\uffff\1\30\15\uffff\1\u00e0"+
            "\10\uffff\1\u00de\6\uffff\1\u00e1\13\uffff\1\u00dd\12\uffff"+
            "\1\u00dc\3\uffff\1\u00e4\1\u00e5\2\uffff\1\u00de\7\uffff\1\u00e9"+
            "\1\uffff\1\u00dd\1\u00e3\1\u00de\3\uffff\1\u00e6\4\uffff\1\72"+
            "\1\u00df\13\uffff\1\u00e8",
            "\1\u00f2\1\u00f7\4\uffff\1\u00ed\2\uffff\1\30\15\uffff\1\u00f0"+
            "\10\uffff\1\u00ee\6\uffff\1\u00f1\13\uffff\1\u00ed\12\uffff"+
            "\1\u00ec\3\uffff\1\u00f4\1\u00f5\2\uffff\1\u00ee\7\uffff\1\u00f9"+
            "\1\uffff\1\u00ed\1\u00f3\1\u00ee\3\uffff\1\u00f6\4\uffff\1\72"+
            "\1\u00ef\13\uffff\1\u00f8",
            "\1\u0102\1\u0107\4\uffff\1\u00fd\2\uffff\1\30\15\uffff\1\u0100"+
            "\10\uffff\1\u00fe\6\uffff\1\u0101\13\uffff\1\u00fd\12\uffff"+
            "\1\u00fc\3\uffff\1\u0104\1\u0105\2\uffff\1\u00fe\7\uffff\1\u0109"+
            "\1\uffff\1\u00fd\1\u0103\1\u00fe\3\uffff\1\u0106\4\uffff\1\72"+
            "\1\u00ff\13\uffff\1\u0108",
            "\1\u010c",
            "\1\u010e\104\uffff\1\u010d",
            "",
            "\1\u0128\1\uffff\1\u0125\2\uffff\1\u0124\3\uffff\1\u0118\1"+
            "\uffff\1\u0126\1\u0123\1\u0112\2\uffff\1\u0129\2\uffff\1\u011d"+
            "\1\uffff\1\u0132\5\uffff\1\u0113\4\uffff\1\u012f\1\u0117\1\uffff"+
            "\1\u011f\1\u010f\13\uffff\1\u012c\3\uffff\1\u012d\1\uffff\1"+
            "\u0131\1\u0110\1\u0120\2\uffff\1\u012b\2\uffff\1\u011b\2\uffff"+
            "\1\u0121\1\u012a\5\uffff\1\u0119\2\uffff\1\u011c\1\uffff\1\u011a"+
            "\1\u0127\12\uffff\1\u0122\1\uffff\1\u0115\1\u0114\2\uffff\1"+
            "\u011e\1\uffff\1\u0111\1\u0119\1\u0130\1\u0119\1\uffff\1\u0116"+
            "\1\uffff\1\u012e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "133:1: statement : ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' !);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_36 = input.LA(1);

                         
                        int index3_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_36);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA3_37 = input.LA(1);

                         
                        int index3_37 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_37);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA3_38 = input.LA(1);

                         
                        int index3_38 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_38);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA3_39 = input.LA(1);

                         
                        int index3_39 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_39);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA3_40 = input.LA(1);

                         
                        int index3_40 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_40);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA3_41 = input.LA(1);

                         
                        int index3_41 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_41);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA3_42 = input.LA(1);

                         
                        int index3_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_42);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA3_43 = input.LA(1);

                         
                        int index3_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_43);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA3_44 = input.LA(1);

                         
                        int index3_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_44);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA3_45 = input.LA(1);

                         
                        int index3_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_45);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA3_46 = input.LA(1);

                         
                        int index3_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_46);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA3_47 = input.LA(1);

                         
                        int index3_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_47);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA3_48 = input.LA(1);

                         
                        int index3_48 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_48);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA3_49 = input.LA(1);

                         
                        int index3_49 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_49);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA3_50 = input.LA(1);

                         
                        int index3_50 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_50);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA3_51 = input.LA(1);

                         
                        int index3_51 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_51);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA3_52 = input.LA(1);

                         
                        int index3_52 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_52);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA3_53 = input.LA(1);

                         
                        int index3_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_53);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA3_54 = input.LA(1);

                         
                        int index3_54 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_54);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA3_55 = input.LA(1);

                         
                        int index3_55 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_55);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA3_56 = input.LA(1);

                         
                        int index3_56 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_56);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA3_59 = input.LA(1);

                         
                        int index3_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_59);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA3_62 = input.LA(1);

                         
                        int index3_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_62);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA3_63 = input.LA(1);

                         
                        int index3_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_63);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA3_64 = input.LA(1);

                         
                        int index3_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_64);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA3_65 = input.LA(1);

                         
                        int index3_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_65);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA3_66 = input.LA(1);

                         
                        int index3_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_66);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA3_67 = input.LA(1);

                         
                        int index3_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_67);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA3_68 = input.LA(1);

                         
                        int index3_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_68);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA3_69 = input.LA(1);

                         
                        int index3_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_69);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA3_70 = input.LA(1);

                         
                        int index3_70 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_70);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA3_71 = input.LA(1);

                         
                        int index3_71 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_71);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA3_72 = input.LA(1);

                         
                        int index3_72 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_72);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA3_73 = input.LA(1);

                         
                        int index3_73 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_73);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA3_74 = input.LA(1);

                         
                        int index3_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_74);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA3_75 = input.LA(1);

                         
                        int index3_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_75);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA3_76 = input.LA(1);

                         
                        int index3_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_76);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA3_77 = input.LA(1);

                         
                        int index3_77 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_77);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA3_80 = input.LA(1);

                         
                        int index3_80 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_80);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA3_81 = input.LA(1);

                         
                        int index3_81 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_81);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA3_82 = input.LA(1);

                         
                        int index3_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_82);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA3_83 = input.LA(1);

                         
                        int index3_83 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_83);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA3_84 = input.LA(1);

                         
                        int index3_84 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_84);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA3_85 = input.LA(1);

                         
                        int index3_85 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_85);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA3_86 = input.LA(1);

                         
                        int index3_86 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_86);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA3_87 = input.LA(1);

                         
                        int index3_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_87);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA3_88 = input.LA(1);

                         
                        int index3_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_88);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA3_89 = input.LA(1);

                         
                        int index3_89 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_89);

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA3_90 = input.LA(1);

                         
                        int index3_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_90);

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA3_91 = input.LA(1);

                         
                        int index3_91 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_91);

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA3_92 = input.LA(1);

                         
                        int index3_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_92);

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA3_93 = input.LA(1);

                         
                        int index3_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_93);

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA3_94 = input.LA(1);

                         
                        int index3_94 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_94);

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA3_95 = input.LA(1);

                         
                        int index3_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_95);

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_96);

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA3_97 = input.LA(1);

                         
                        int index3_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_97);

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA3_98 = input.LA(1);

                         
                        int index3_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_98);

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA3_99 = input.LA(1);

                         
                        int index3_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_99);

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA3_100 = input.LA(1);

                         
                        int index3_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_100);

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA3_101 = input.LA(1);

                         
                        int index3_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_101);

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA3_102 = input.LA(1);

                         
                        int index3_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_102);

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA3_103 = input.LA(1);

                         
                        int index3_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_103);

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA3_104 = input.LA(1);

                         
                        int index3_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_104);

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA3_105 = input.LA(1);

                         
                        int index3_105 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_105);

                        if ( s>=0 ) return s;
                        break;

                    case 64 : 
                        int LA3_106 = input.LA(1);

                         
                        int index3_106 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_106);

                        if ( s>=0 ) return s;
                        break;

                    case 65 : 
                        int LA3_107 = input.LA(1);

                         
                        int index3_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_107);

                        if ( s>=0 ) return s;
                        break;

                    case 66 : 
                        int LA3_108 = input.LA(1);

                         
                        int index3_108 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_108);

                        if ( s>=0 ) return s;
                        break;

                    case 67 : 
                        int LA3_109 = input.LA(1);

                         
                        int index3_109 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_109);

                        if ( s>=0 ) return s;
                        break;

                    case 68 : 
                        int LA3_110 = input.LA(1);

                         
                        int index3_110 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_110);

                        if ( s>=0 ) return s;
                        break;

                    case 69 : 
                        int LA3_111 = input.LA(1);

                         
                        int index3_111 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_111);

                        if ( s>=0 ) return s;
                        break;

                    case 70 : 
                        int LA3_112 = input.LA(1);

                         
                        int index3_112 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_112);

                        if ( s>=0 ) return s;
                        break;

                    case 71 : 
                        int LA3_113 = input.LA(1);

                         
                        int index3_113 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_113);

                        if ( s>=0 ) return s;
                        break;

                    case 72 : 
                        int LA3_114 = input.LA(1);

                         
                        int index3_114 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_114);

                        if ( s>=0 ) return s;
                        break;

                    case 73 : 
                        int LA3_115 = input.LA(1);

                         
                        int index3_115 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_115);

                        if ( s>=0 ) return s;
                        break;

                    case 74 : 
                        int LA3_118 = input.LA(1);

                         
                        int index3_118 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_118);

                        if ( s>=0 ) return s;
                        break;

                    case 75 : 
                        int LA3_119 = input.LA(1);

                         
                        int index3_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_119);

                        if ( s>=0 ) return s;
                        break;

                    case 76 : 
                        int LA3_120 = input.LA(1);

                         
                        int index3_120 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_120);

                        if ( s>=0 ) return s;
                        break;

                    case 77 : 
                        int LA3_121 = input.LA(1);

                         
                        int index3_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_121);

                        if ( s>=0 ) return s;
                        break;

                    case 78 : 
                        int LA3_122 = input.LA(1);

                         
                        int index3_122 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_122);

                        if ( s>=0 ) return s;
                        break;

                    case 79 : 
                        int LA3_123 = input.LA(1);

                         
                        int index3_123 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_123);

                        if ( s>=0 ) return s;
                        break;

                    case 80 : 
                        int LA3_124 = input.LA(1);

                         
                        int index3_124 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_124);

                        if ( s>=0 ) return s;
                        break;

                    case 81 : 
                        int LA3_125 = input.LA(1);

                         
                        int index3_125 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_125);

                        if ( s>=0 ) return s;
                        break;

                    case 82 : 
                        int LA3_126 = input.LA(1);

                         
                        int index3_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_126);

                        if ( s>=0 ) return s;
                        break;

                    case 83 : 
                        int LA3_127 = input.LA(1);

                         
                        int index3_127 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_127);

                        if ( s>=0 ) return s;
                        break;

                    case 84 : 
                        int LA3_128 = input.LA(1);

                         
                        int index3_128 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_128);

                        if ( s>=0 ) return s;
                        break;

                    case 85 : 
                        int LA3_129 = input.LA(1);

                         
                        int index3_129 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_129);

                        if ( s>=0 ) return s;
                        break;

                    case 86 : 
                        int LA3_130 = input.LA(1);

                         
                        int index3_130 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_130);

                        if ( s>=0 ) return s;
                        break;

                    case 87 : 
                        int LA3_131 = input.LA(1);

                         
                        int index3_131 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_131);

                        if ( s>=0 ) return s;
                        break;

                    case 88 : 
                        int LA3_132 = input.LA(1);

                         
                        int index3_132 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_132);

                        if ( s>=0 ) return s;
                        break;

                    case 89 : 
                        int LA3_133 = input.LA(1);

                         
                        int index3_133 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_133);

                        if ( s>=0 ) return s;
                        break;

                    case 90 : 
                        int LA3_134 = input.LA(1);

                         
                        int index3_134 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_134);

                        if ( s>=0 ) return s;
                        break;

                    case 91 : 
                        int LA3_135 = input.LA(1);

                         
                        int index3_135 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_135);

                        if ( s>=0 ) return s;
                        break;

                    case 92 : 
                        int LA3_136 = input.LA(1);

                         
                        int index3_136 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_136);

                        if ( s>=0 ) return s;
                        break;

                    case 93 : 
                        int LA3_137 = input.LA(1);

                         
                        int index3_137 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_137);

                        if ( s>=0 ) return s;
                        break;

                    case 94 : 
                        int LA3_138 = input.LA(1);

                         
                        int index3_138 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_138);

                        if ( s>=0 ) return s;
                        break;

                    case 95 : 
                        int LA3_139 = input.LA(1);

                         
                        int index3_139 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_139);

                        if ( s>=0 ) return s;
                        break;

                    case 96 : 
                        int LA3_140 = input.LA(1);

                         
                        int index3_140 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_140);

                        if ( s>=0 ) return s;
                        break;

                    case 97 : 
                        int LA3_141 = input.LA(1);

                         
                        int index3_141 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_141);

                        if ( s>=0 ) return s;
                        break;

                    case 98 : 
                        int LA3_142 = input.LA(1);

                         
                        int index3_142 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_142);

                        if ( s>=0 ) return s;
                        break;

                    case 99 : 
                        int LA3_143 = input.LA(1);

                         
                        int index3_143 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_143);

                        if ( s>=0 ) return s;
                        break;

                    case 100 : 
                        int LA3_144 = input.LA(1);

                         
                        int index3_144 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_144);

                        if ( s>=0 ) return s;
                        break;

                    case 101 : 
                        int LA3_145 = input.LA(1);

                         
                        int index3_145 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_145);

                        if ( s>=0 ) return s;
                        break;

                    case 102 : 
                        int LA3_146 = input.LA(1);

                         
                        int index3_146 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_146);

                        if ( s>=0 ) return s;
                        break;

                    case 103 : 
                        int LA3_147 = input.LA(1);

                         
                        int index3_147 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_147);

                        if ( s>=0 ) return s;
                        break;

                    case 104 : 
                        int LA3_148 = input.LA(1);

                         
                        int index3_148 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_148);

                        if ( s>=0 ) return s;
                        break;

                    case 105 : 
                        int LA3_149 = input.LA(1);

                         
                        int index3_149 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_149);

                        if ( s>=0 ) return s;
                        break;

                    case 106 : 
                        int LA3_150 = input.LA(1);

                         
                        int index3_150 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_150);

                        if ( s>=0 ) return s;
                        break;

                    case 107 : 
                        int LA3_151 = input.LA(1);

                         
                        int index3_151 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_151);

                        if ( s>=0 ) return s;
                        break;

                    case 108 : 
                        int LA3_152 = input.LA(1);

                         
                        int index3_152 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_152);

                        if ( s>=0 ) return s;
                        break;

                    case 109 : 
                        int LA3_153 = input.LA(1);

                         
                        int index3_153 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_153);

                        if ( s>=0 ) return s;
                        break;

                    case 110 : 
                        int LA3_154 = input.LA(1);

                         
                        int index3_154 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_154);

                        if ( s>=0 ) return s;
                        break;

                    case 111 : 
                        int LA3_155 = input.LA(1);

                         
                        int index3_155 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_155);

                        if ( s>=0 ) return s;
                        break;

                    case 112 : 
                        int LA3_156 = input.LA(1);

                         
                        int index3_156 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_156);

                        if ( s>=0 ) return s;
                        break;

                    case 113 : 
                        int LA3_157 = input.LA(1);

                         
                        int index3_157 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_157);

                        if ( s>=0 ) return s;
                        break;

                    case 114 : 
                        int LA3_158 = input.LA(1);

                         
                        int index3_158 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_158);

                        if ( s>=0 ) return s;
                        break;

                    case 115 : 
                        int LA3_159 = input.LA(1);

                         
                        int index3_159 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_159);

                        if ( s>=0 ) return s;
                        break;

                    case 116 : 
                        int LA3_160 = input.LA(1);

                         
                        int index3_160 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_160);

                        if ( s>=0 ) return s;
                        break;

                    case 117 : 
                        int LA3_161 = input.LA(1);

                         
                        int index3_161 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_161);

                        if ( s>=0 ) return s;
                        break;

                    case 118 : 
                        int LA3_162 = input.LA(1);

                         
                        int index3_162 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_162);

                        if ( s>=0 ) return s;
                        break;

                    case 119 : 
                        int LA3_163 = input.LA(1);

                         
                        int index3_163 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_163);

                        if ( s>=0 ) return s;
                        break;

                    case 120 : 
                        int LA3_164 = input.LA(1);

                         
                        int index3_164 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_164);

                        if ( s>=0 ) return s;
                        break;

                    case 121 : 
                        int LA3_165 = input.LA(1);

                         
                        int index3_165 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_165);

                        if ( s>=0 ) return s;
                        break;

                    case 122 : 
                        int LA3_166 = input.LA(1);

                         
                        int index3_166 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_166);

                        if ( s>=0 ) return s;
                        break;

                    case 123 : 
                        int LA3_167 = input.LA(1);

                         
                        int index3_167 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_167);

                        if ( s>=0 ) return s;
                        break;

                    case 124 : 
                        int LA3_168 = input.LA(1);

                         
                        int index3_168 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_168);

                        if ( s>=0 ) return s;
                        break;

                    case 125 : 
                        int LA3_169 = input.LA(1);

                         
                        int index3_169 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_169);

                        if ( s>=0 ) return s;
                        break;

                    case 126 : 
                        int LA3_170 = input.LA(1);

                         
                        int index3_170 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_170);

                        if ( s>=0 ) return s;
                        break;

                    case 127 : 
                        int LA3_171 = input.LA(1);

                         
                        int index3_171 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_171);

                        if ( s>=0 ) return s;
                        break;

                    case 128 : 
                        int LA3_172 = input.LA(1);

                         
                        int index3_172 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_172);

                        if ( s>=0 ) return s;
                        break;

                    case 129 : 
                        int LA3_173 = input.LA(1);

                         
                        int index3_173 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_173);

                        if ( s>=0 ) return s;
                        break;

                    case 130 : 
                        int LA3_174 = input.LA(1);

                         
                        int index3_174 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_174);

                        if ( s>=0 ) return s;
                        break;

                    case 131 : 
                        int LA3_175 = input.LA(1);

                         
                        int index3_175 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_175);

                        if ( s>=0 ) return s;
                        break;

                    case 132 : 
                        int LA3_176 = input.LA(1);

                         
                        int index3_176 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_176);

                        if ( s>=0 ) return s;
                        break;

                    case 133 : 
                        int LA3_177 = input.LA(1);

                         
                        int index3_177 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_177);

                        if ( s>=0 ) return s;
                        break;

                    case 134 : 
                        int LA3_178 = input.LA(1);

                         
                        int index3_178 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_178);

                        if ( s>=0 ) return s;
                        break;

                    case 135 : 
                        int LA3_179 = input.LA(1);

                         
                        int index3_179 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_179);

                        if ( s>=0 ) return s;
                        break;

                    case 136 : 
                        int LA3_180 = input.LA(1);

                         
                        int index3_180 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_180);

                        if ( s>=0 ) return s;
                        break;

                    case 137 : 
                        int LA3_181 = input.LA(1);

                         
                        int index3_181 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_181);

                        if ( s>=0 ) return s;
                        break;

                    case 138 : 
                        int LA3_182 = input.LA(1);

                         
                        int index3_182 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_182);

                        if ( s>=0 ) return s;
                        break;

                    case 139 : 
                        int LA3_183 = input.LA(1);

                         
                        int index3_183 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_183);

                        if ( s>=0 ) return s;
                        break;

                    case 140 : 
                        int LA3_184 = input.LA(1);

                         
                        int index3_184 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_184);

                        if ( s>=0 ) return s;
                        break;

                    case 141 : 
                        int LA3_185 = input.LA(1);

                         
                        int index3_185 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_185);

                        if ( s>=0 ) return s;
                        break;

                    case 142 : 
                        int LA3_188 = input.LA(1);

                         
                        int index3_188 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_188);

                        if ( s>=0 ) return s;
                        break;

                    case 143 : 
                        int LA3_189 = input.LA(1);

                         
                        int index3_189 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_189);

                        if ( s>=0 ) return s;
                        break;

                    case 144 : 
                        int LA3_190 = input.LA(1);

                         
                        int index3_190 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_190);

                        if ( s>=0 ) return s;
                        break;

                    case 145 : 
                        int LA3_191 = input.LA(1);

                         
                        int index3_191 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_191);

                        if ( s>=0 ) return s;
                        break;

                    case 146 : 
                        int LA3_192 = input.LA(1);

                         
                        int index3_192 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_192);

                        if ( s>=0 ) return s;
                        break;

                    case 147 : 
                        int LA3_193 = input.LA(1);

                         
                        int index3_193 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_193);

                        if ( s>=0 ) return s;
                        break;

                    case 148 : 
                        int LA3_194 = input.LA(1);

                         
                        int index3_194 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_194);

                        if ( s>=0 ) return s;
                        break;

                    case 149 : 
                        int LA3_195 = input.LA(1);

                         
                        int index3_195 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_195);

                        if ( s>=0 ) return s;
                        break;

                    case 150 : 
                        int LA3_196 = input.LA(1);

                         
                        int index3_196 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_196);

                        if ( s>=0 ) return s;
                        break;

                    case 151 : 
                        int LA3_197 = input.LA(1);

                         
                        int index3_197 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_197);

                        if ( s>=0 ) return s;
                        break;

                    case 152 : 
                        int LA3_198 = input.LA(1);

                         
                        int index3_198 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_198);

                        if ( s>=0 ) return s;
                        break;

                    case 153 : 
                        int LA3_199 = input.LA(1);

                         
                        int index3_199 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_199);

                        if ( s>=0 ) return s;
                        break;

                    case 154 : 
                        int LA3_200 = input.LA(1);

                         
                        int index3_200 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_200);

                        if ( s>=0 ) return s;
                        break;

                    case 155 : 
                        int LA3_201 = input.LA(1);

                         
                        int index3_201 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_201);

                        if ( s>=0 ) return s;
                        break;

                    case 156 : 
                        int LA3_204 = input.LA(1);

                         
                        int index3_204 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_204);

                        if ( s>=0 ) return s;
                        break;

                    case 157 : 
                        int LA3_205 = input.LA(1);

                         
                        int index3_205 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_205);

                        if ( s>=0 ) return s;
                        break;

                    case 158 : 
                        int LA3_206 = input.LA(1);

                         
                        int index3_206 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_206);

                        if ( s>=0 ) return s;
                        break;

                    case 159 : 
                        int LA3_207 = input.LA(1);

                         
                        int index3_207 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_207);

                        if ( s>=0 ) return s;
                        break;

                    case 160 : 
                        int LA3_208 = input.LA(1);

                         
                        int index3_208 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_208);

                        if ( s>=0 ) return s;
                        break;

                    case 161 : 
                        int LA3_209 = input.LA(1);

                         
                        int index3_209 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_209);

                        if ( s>=0 ) return s;
                        break;

                    case 162 : 
                        int LA3_210 = input.LA(1);

                         
                        int index3_210 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_210);

                        if ( s>=0 ) return s;
                        break;

                    case 163 : 
                        int LA3_211 = input.LA(1);

                         
                        int index3_211 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_211);

                        if ( s>=0 ) return s;
                        break;

                    case 164 : 
                        int LA3_212 = input.LA(1);

                         
                        int index3_212 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_212);

                        if ( s>=0 ) return s;
                        break;

                    case 165 : 
                        int LA3_213 = input.LA(1);

                         
                        int index3_213 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_213);

                        if ( s>=0 ) return s;
                        break;

                    case 166 : 
                        int LA3_214 = input.LA(1);

                         
                        int index3_214 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_214);

                        if ( s>=0 ) return s;
                        break;

                    case 167 : 
                        int LA3_215 = input.LA(1);

                         
                        int index3_215 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_215);

                        if ( s>=0 ) return s;
                        break;

                    case 168 : 
                        int LA3_216 = input.LA(1);

                         
                        int index3_216 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_216);

                        if ( s>=0 ) return s;
                        break;

                    case 169 : 
                        int LA3_217 = input.LA(1);

                         
                        int index3_217 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_217);

                        if ( s>=0 ) return s;
                        break;

                    case 170 : 
                        int LA3_220 = input.LA(1);

                         
                        int index3_220 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_220);

                        if ( s>=0 ) return s;
                        break;

                    case 171 : 
                        int LA3_221 = input.LA(1);

                         
                        int index3_221 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_221);

                        if ( s>=0 ) return s;
                        break;

                    case 172 : 
                        int LA3_222 = input.LA(1);

                         
                        int index3_222 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_222);

                        if ( s>=0 ) return s;
                        break;

                    case 173 : 
                        int LA3_223 = input.LA(1);

                         
                        int index3_223 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_223);

                        if ( s>=0 ) return s;
                        break;

                    case 174 : 
                        int LA3_224 = input.LA(1);

                         
                        int index3_224 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_224);

                        if ( s>=0 ) return s;
                        break;

                    case 175 : 
                        int LA3_225 = input.LA(1);

                         
                        int index3_225 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_225);

                        if ( s>=0 ) return s;
                        break;

                    case 176 : 
                        int LA3_226 = input.LA(1);

                         
                        int index3_226 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_226);

                        if ( s>=0 ) return s;
                        break;

                    case 177 : 
                        int LA3_227 = input.LA(1);

                         
                        int index3_227 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_227);

                        if ( s>=0 ) return s;
                        break;

                    case 178 : 
                        int LA3_228 = input.LA(1);

                         
                        int index3_228 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_228);

                        if ( s>=0 ) return s;
                        break;

                    case 179 : 
                        int LA3_229 = input.LA(1);

                         
                        int index3_229 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_229);

                        if ( s>=0 ) return s;
                        break;

                    case 180 : 
                        int LA3_230 = input.LA(1);

                         
                        int index3_230 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_230);

                        if ( s>=0 ) return s;
                        break;

                    case 181 : 
                        int LA3_231 = input.LA(1);

                         
                        int index3_231 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_231);

                        if ( s>=0 ) return s;
                        break;

                    case 182 : 
                        int LA3_232 = input.LA(1);

                         
                        int index3_232 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_232);

                        if ( s>=0 ) return s;
                        break;

                    case 183 : 
                        int LA3_233 = input.LA(1);

                         
                        int index3_233 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_233);

                        if ( s>=0 ) return s;
                        break;

                    case 184 : 
                        int LA3_236 = input.LA(1);

                         
                        int index3_236 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_236);

                        if ( s>=0 ) return s;
                        break;

                    case 185 : 
                        int LA3_237 = input.LA(1);

                         
                        int index3_237 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_237);

                        if ( s>=0 ) return s;
                        break;

                    case 186 : 
                        int LA3_238 = input.LA(1);

                         
                        int index3_238 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_238);

                        if ( s>=0 ) return s;
                        break;

                    case 187 : 
                        int LA3_239 = input.LA(1);

                         
                        int index3_239 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_239);

                        if ( s>=0 ) return s;
                        break;

                    case 188 : 
                        int LA3_240 = input.LA(1);

                         
                        int index3_240 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_240);

                        if ( s>=0 ) return s;
                        break;

                    case 189 : 
                        int LA3_241 = input.LA(1);

                         
                        int index3_241 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_241);

                        if ( s>=0 ) return s;
                        break;

                    case 190 : 
                        int LA3_242 = input.LA(1);

                         
                        int index3_242 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_242);

                        if ( s>=0 ) return s;
                        break;

                    case 191 : 
                        int LA3_243 = input.LA(1);

                         
                        int index3_243 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_243);

                        if ( s>=0 ) return s;
                        break;

                    case 192 : 
                        int LA3_244 = input.LA(1);

                         
                        int index3_244 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_244);

                        if ( s>=0 ) return s;
                        break;

                    case 193 : 
                        int LA3_245 = input.LA(1);

                         
                        int index3_245 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_245);

                        if ( s>=0 ) return s;
                        break;

                    case 194 : 
                        int LA3_246 = input.LA(1);

                         
                        int index3_246 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_246);

                        if ( s>=0 ) return s;
                        break;

                    case 195 : 
                        int LA3_247 = input.LA(1);

                         
                        int index3_247 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_247);

                        if ( s>=0 ) return s;
                        break;

                    case 196 : 
                        int LA3_248 = input.LA(1);

                         
                        int index3_248 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_248);

                        if ( s>=0 ) return s;
                        break;

                    case 197 : 
                        int LA3_249 = input.LA(1);

                         
                        int index3_249 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_249);

                        if ( s>=0 ) return s;
                        break;

                    case 198 : 
                        int LA3_252 = input.LA(1);

                         
                        int index3_252 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_252);

                        if ( s>=0 ) return s;
                        break;

                    case 199 : 
                        int LA3_253 = input.LA(1);

                         
                        int index3_253 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_253);

                        if ( s>=0 ) return s;
                        break;

                    case 200 : 
                        int LA3_254 = input.LA(1);

                         
                        int index3_254 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_254);

                        if ( s>=0 ) return s;
                        break;

                    case 201 : 
                        int LA3_255 = input.LA(1);

                         
                        int index3_255 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_255);

                        if ( s>=0 ) return s;
                        break;

                    case 202 : 
                        int LA3_256 = input.LA(1);

                         
                        int index3_256 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_256);

                        if ( s>=0 ) return s;
                        break;

                    case 203 : 
                        int LA3_257 = input.LA(1);

                         
                        int index3_257 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_257);

                        if ( s>=0 ) return s;
                        break;

                    case 204 : 
                        int LA3_258 = input.LA(1);

                         
                        int index3_258 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_258);

                        if ( s>=0 ) return s;
                        break;

                    case 205 : 
                        int LA3_259 = input.LA(1);

                         
                        int index3_259 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_259);

                        if ( s>=0 ) return s;
                        break;

                    case 206 : 
                        int LA3_260 = input.LA(1);

                         
                        int index3_260 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_260);

                        if ( s>=0 ) return s;
                        break;

                    case 207 : 
                        int LA3_261 = input.LA(1);

                         
                        int index3_261 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_261);

                        if ( s>=0 ) return s;
                        break;

                    case 208 : 
                        int LA3_262 = input.LA(1);

                         
                        int index3_262 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_262);

                        if ( s>=0 ) return s;
                        break;

                    case 209 : 
                        int LA3_263 = input.LA(1);

                         
                        int index3_263 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_263);

                        if ( s>=0 ) return s;
                        break;

                    case 210 : 
                        int LA3_264 = input.LA(1);

                         
                        int index3_264 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_264);

                        if ( s>=0 ) return s;
                        break;

                    case 211 : 
                        int LA3_265 = input.LA(1);

                         
                        int index3_265 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_265);

                        if ( s>=0 ) return s;
                        break;

                    case 212 : 
                        int LA3_268 = input.LA(1);

                         
                        int index3_268 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_268);

                        if ( s>=0 ) return s;
                        break;

                    case 213 : 
                        int LA3_269 = input.LA(1);

                         
                        int index3_269 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_269);

                        if ( s>=0 ) return s;
                        break;

                    case 214 : 
                        int LA3_270 = input.LA(1);

                         
                        int index3_270 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_270);

                        if ( s>=0 ) return s;
                        break;

                    case 215 : 
                        int LA3_271 = input.LA(1);

                         
                        int index3_271 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_271);

                        if ( s>=0 ) return s;
                        break;

                    case 216 : 
                        int LA3_272 = input.LA(1);

                         
                        int index3_272 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_272);

                        if ( s>=0 ) return s;
                        break;

                    case 217 : 
                        int LA3_273 = input.LA(1);

                         
                        int index3_273 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_273);

                        if ( s>=0 ) return s;
                        break;

                    case 218 : 
                        int LA3_274 = input.LA(1);

                         
                        int index3_274 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_274);

                        if ( s>=0 ) return s;
                        break;

                    case 219 : 
                        int LA3_275 = input.LA(1);

                         
                        int index3_275 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_275);

                        if ( s>=0 ) return s;
                        break;

                    case 220 : 
                        int LA3_276 = input.LA(1);

                         
                        int index3_276 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_276);

                        if ( s>=0 ) return s;
                        break;

                    case 221 : 
                        int LA3_277 = input.LA(1);

                         
                        int index3_277 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_277);

                        if ( s>=0 ) return s;
                        break;

                    case 222 : 
                        int LA3_278 = input.LA(1);

                         
                        int index3_278 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_278);

                        if ( s>=0 ) return s;
                        break;

                    case 223 : 
                        int LA3_279 = input.LA(1);

                         
                        int index3_279 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_279);

                        if ( s>=0 ) return s;
                        break;

                    case 224 : 
                        int LA3_280 = input.LA(1);

                         
                        int index3_280 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_280);

                        if ( s>=0 ) return s;
                        break;

                    case 225 : 
                        int LA3_281 = input.LA(1);

                         
                        int index3_281 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_281);

                        if ( s>=0 ) return s;
                        break;

                    case 226 : 
                        int LA3_282 = input.LA(1);

                         
                        int index3_282 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_282);

                        if ( s>=0 ) return s;
                        break;

                    case 227 : 
                        int LA3_283 = input.LA(1);

                         
                        int index3_283 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_283);

                        if ( s>=0 ) return s;
                        break;

                    case 228 : 
                        int LA3_284 = input.LA(1);

                         
                        int index3_284 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_284);

                        if ( s>=0 ) return s;
                        break;

                    case 229 : 
                        int LA3_285 = input.LA(1);

                         
                        int index3_285 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_285);

                        if ( s>=0 ) return s;
                        break;

                    case 230 : 
                        int LA3_286 = input.LA(1);

                         
                        int index3_286 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_286);

                        if ( s>=0 ) return s;
                        break;

                    case 231 : 
                        int LA3_287 = input.LA(1);

                         
                        int index3_287 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_287);

                        if ( s>=0 ) return s;
                        break;

                    case 232 : 
                        int LA3_288 = input.LA(1);

                         
                        int index3_288 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_288);

                        if ( s>=0 ) return s;
                        break;

                    case 233 : 
                        int LA3_289 = input.LA(1);

                         
                        int index3_289 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_289);

                        if ( s>=0 ) return s;
                        break;

                    case 234 : 
                        int LA3_290 = input.LA(1);

                         
                        int index3_290 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_290);

                        if ( s>=0 ) return s;
                        break;

                    case 235 : 
                        int LA3_291 = input.LA(1);

                         
                        int index3_291 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_291);

                        if ( s>=0 ) return s;
                        break;

                    case 236 : 
                        int LA3_292 = input.LA(1);

                         
                        int index3_292 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_292);

                        if ( s>=0 ) return s;
                        break;

                    case 237 : 
                        int LA3_293 = input.LA(1);

                         
                        int index3_293 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_293);

                        if ( s>=0 ) return s;
                        break;

                    case 238 : 
                        int LA3_294 = input.LA(1);

                         
                        int index3_294 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_294);

                        if ( s>=0 ) return s;
                        break;

                    case 239 : 
                        int LA3_295 = input.LA(1);

                         
                        int index3_295 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_295);

                        if ( s>=0 ) return s;
                        break;

                    case 240 : 
                        int LA3_296 = input.LA(1);

                         
                        int index3_296 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_296);

                        if ( s>=0 ) return s;
                        break;

                    case 241 : 
                        int LA3_297 = input.LA(1);

                         
                        int index3_297 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_297);

                        if ( s>=0 ) return s;
                        break;

                    case 242 : 
                        int LA3_298 = input.LA(1);

                         
                        int index3_298 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_298);

                        if ( s>=0 ) return s;
                        break;

                    case 243 : 
                        int LA3_299 = input.LA(1);

                         
                        int index3_299 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_299);

                        if ( s>=0 ) return s;
                        break;

                    case 244 : 
                        int LA3_300 = input.LA(1);

                         
                        int index3_300 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_300);

                        if ( s>=0 ) return s;
                        break;

                    case 245 : 
                        int LA3_301 = input.LA(1);

                         
                        int index3_301 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_301);

                        if ( s>=0 ) return s;
                        break;

                    case 246 : 
                        int LA3_302 = input.LA(1);

                         
                        int index3_302 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_302);

                        if ( s>=0 ) return s;
                        break;

                    case 247 : 
                        int LA3_303 = input.LA(1);

                         
                        int index3_303 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_303);

                        if ( s>=0 ) return s;
                        break;

                    case 248 : 
                        int LA3_304 = input.LA(1);

                         
                        int index3_304 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_304);

                        if ( s>=0 ) return s;
                        break;

                    case 249 : 
                        int LA3_305 = input.LA(1);

                         
                        int index3_305 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_305);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA24_eotS =
        "\117\uffff";
    static final String DFA24_eofS =
        "\1\3\116\uffff";
    static final String DFA24_minS =
        "\1\4\2\0\114\uffff";
    static final String DFA24_maxS =
        "\1\154\2\0\114\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\2\47\uffff\1\1\43\uffff";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\114\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\5\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\2\3\1\uffff\2\3\1\2\1\1\11\uffff\1\3\3\uffff\1\3\1\uffff\3"+
            "\3\2\uffff\1\3\2\uffff\1\3\2\uffff\2\3\5\uffff\1\3\2\uffff\1"+
            "\3\1\uffff\2\3\12\uffff\1\3\1\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\4\3\1\uffff\1\3\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "208:58: ( conditional )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred33_Php()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index24_1);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred33_Php()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index24_2);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA32_eotS =
        "\117\uffff";
    static final String DFA32_eofS =
        "\1\3\116\uffff";
    static final String DFA32_minS =
        "\1\4\2\0\114\uffff";
    static final String DFA32_maxS =
        "\1\154\2\0\114\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\1\2\47\uffff\1\1\43\uffff";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\114\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff\4\3\1\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\3\5\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\2\3\1\uffff\2\3\1\2\1\1\11\uffff\1\3\3\uffff\1\3\1\uffff\3"+
            "\3\2\uffff\1\3\2\uffff\1\3\2\uffff\2\3\5\uffff\1\3\2\uffff\1"+
            "\3\1\uffff\2\3\12\uffff\1\3\1\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\4\3\1\uffff\1\3\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "232:62: ( conditional )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred52_Php()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_1);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred52_Php()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_2);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA49_eotS =
        "\u00e9\uffff";
    static final String DFA49_eofS =
        "\5\uffff\1\121\3\uffff\6\121\u00da\uffff";
    static final String DFA49_minS =
        "\4\6\1\45\1\6\3\45\6\6\1\121\1\45\77\0\14\uffff\20\0\14\uffff\12"+
        "\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff"+
        "\3\0";
    static final String DFA49_maxS =
        "\5\152\1\156\3\152\6\156\1\121\1\152\77\0\14\uffff\20\0\14\uffff"+
        "\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\3\0";
    static final String DFA49_acceptS =
        "\120\uffff\1\1\1\2\u0097\uffff";
    static final String DFA49_specialS =
        "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14"+
        "\uffff\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
        "\1\111\1\112\1\113\1\114\1\115\1\116\14\uffff\1\117\1\120\1\121"+
        "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\1\131\1\132"+
        "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\14\uffff\1\143"+
        "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\14\uffff"+
        "\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\14"+
        "\uffff\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080"+
        "\14\uffff\1\u0081\1\u0082\1\u0083}>";
    static final String[] DFA49_transitionS = {
            "\1\20\2\uffff\1\17\3\uffff\1\1\2\uffff\1\16\6\uffff\1\10\15"+
            "\uffff\1\6\1\uffff\1\12\24\uffff\1\13\5\uffff\1\4\2\uffff\1"+
            "\14\6\uffff\1\2\2\uffff\1\7\1\uffff\1\3\13\uffff\1\15\5\uffff"+
            "\1\11\2\uffff\1\2\1\uffff\1\2\1\uffff\1\5",
            "\1\40\2\uffff\1\37\3\uffff\1\21\2\uffff\1\36\6\uffff\1\30\15"+
            "\uffff\1\26\1\uffff\1\32\24\uffff\1\33\5\uffff\1\24\2\uffff"+
            "\1\34\6\uffff\1\22\2\uffff\1\27\1\uffff\1\23\13\uffff\1\35\5"+
            "\uffff\1\31\2\uffff\1\22\1\uffff\1\22\1\uffff\1\25",
            "\1\55\2\uffff\1\54\6\uffff\1\53\6\uffff\1\45\15\uffff\1\43"+
            "\1\uffff\1\47\24\uffff\1\50\5\uffff\1\41\2\uffff\1\51\11\uffff"+
            "\1\44\15\uffff\1\52\5\uffff\1\46\6\uffff\1\42",
            "\1\76\2\uffff\1\75\3\uffff\1\61\2\uffff\1\74\6\uffff\1\66\15"+
            "\uffff\1\60\1\uffff\1\70\24\uffff\1\71\5\uffff\1\64\2\uffff"+
            "\1\72\6\uffff\1\62\2\uffff\1\65\1\uffff\1\63\11\uffff\1\56\1"+
            "\uffff\1\73\5\uffff\1\67\2\uffff\1\62\1\uffff\1\62\1\uffff\1"+
            "\57",
            "\1\100\104\uffff\1\77",
            "\1\114\1\121\2\uffff\1\121\1\uffff\1\107\2\uffff\1\121\6\uffff"+
            "\1\101\1\uffff\1\121\1\uffff\3\121\1\112\10\uffff\1\110\6\uffff"+
            "\1\113\13\uffff\1\107\10\uffff\1\104\1\103\1\106\3\uffff\1\116"+
            "\1\117\2\uffff\1\110\4\uffff\1\105\1\uffff\1\102\1\121\1\uffff"+
            "\1\107\1\115\1\110\3\uffff\1\120\4\uffff\1\121\1\111\13\uffff"+
            "\1\121",
            "\1\134\104\uffff\1\135",
            "\1\137\104\uffff\1\136",
            "\1\141\104\uffff\1\140",
            "\1\150\1\121\2\uffff\1\121\1\uffff\1\143\2\uffff\1\121\10\uffff"+
            "\1\121\1\uffff\3\121\1\146\10\uffff\1\144\6\uffff\1\147\13\uffff"+
            "\1\143\12\uffff\1\142\3\uffff\1\152\1\153\2\uffff\1\144\7\uffff"+
            "\1\121\1\uffff\1\143\1\151\1\144\3\uffff\1\120\4\uffff\1\121"+
            "\1\145\13\uffff\1\121",
            "\1\176\1\121\2\uffff\1\121\1\uffff\1\171\2\uffff\1\121\10\uffff"+
            "\1\121\1\uffff\3\121\1\174\10\uffff\1\172\6\uffff\1\175\13\uffff"+
            "\1\171\12\uffff\1\170\3\uffff\1\u0080\1\u0081\2\uffff\1\172"+
            "\7\uffff\1\121\1\uffff\1\171\1\177\1\172\3\uffff\1\120\4\uffff"+
            "\1\121\1\173\13\uffff\1\121",
            "\1\u0094\1\121\2\uffff\1\121\1\uffff\1\u008f\2\uffff\1\121"+
            "\10\uffff\1\121\1\uffff\3\121\1\u0092\10\uffff\1\u0090\6\uffff"+
            "\1\u0093\13\uffff\1\u008f\12\uffff\1\u008e\3\uffff\1\u0096\1"+
            "\u0097\2\uffff\1\u0090\7\uffff\1\121\1\uffff\1\u008f\1\u0095"+
            "\1\u0090\3\uffff\1\120\4\uffff\1\121\1\u0091\13\uffff\1\121",
            "\1\u00aa\1\121\2\uffff\1\121\1\uffff\1\u00a5\2\uffff\1\121"+
            "\10\uffff\1\121\1\uffff\3\121\1\u00a8\10\uffff\1\u00a6\6\uffff"+
            "\1\u00a9\13\uffff\1\u00a5\12\uffff\1\u00a4\3\uffff\1\u00ac\1"+
            "\u00ad\2\uffff\1\u00a6\7\uffff\1\121\1\uffff\1\u00a5\1\u00ab"+
            "\1\u00a6\3\uffff\1\120\4\uffff\1\121\1\u00a7\13\uffff\1\121",
            "\1\u00c0\1\121\2\uffff\1\121\1\uffff\1\u00bb\2\uffff\1\121"+
            "\10\uffff\1\121\1\uffff\3\121\1\u00be\10\uffff\1\u00bc\6\uffff"+
            "\1\u00bf\13\uffff\1\u00bb\12\uffff\1\u00ba\3\uffff\1\u00c2\1"+
            "\u00c3\2\uffff\1\u00bc\7\uffff\1\121\1\uffff\1\u00bb\1\u00c1"+
            "\1\u00bc\3\uffff\1\120\4\uffff\1\121\1\u00bd\13\uffff\1\121",
            "\1\u00d6\1\121\2\uffff\1\121\1\uffff\1\u00d1\2\uffff\1\121"+
            "\10\uffff\1\121\1\uffff\3\121\1\u00d4\10\uffff\1\u00d2\6\uffff"+
            "\1\u00d5\13\uffff\1\u00d1\12\uffff\1\u00d0\3\uffff\1\u00d8\1"+
            "\u00d9\2\uffff\1\u00d2\7\uffff\1\121\1\uffff\1\u00d1\1\u00d7"+
            "\1\u00d2\3\uffff\1\120\4\uffff\1\121\1\u00d3\13\uffff\1\121",
            "\1\u00e6",
            "\1\u00e8\104\uffff\1\u00e7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "303:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_17 = input.LA(1);

                         
                        int index49_17 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_17);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA49_18 = input.LA(1);

                         
                        int index49_18 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_18);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA49_19 = input.LA(1);

                         
                        int index49_19 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_19);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA49_20 = input.LA(1);

                         
                        int index49_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_20);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA49_21 = input.LA(1);

                         
                        int index49_21 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_21);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA49_22 = input.LA(1);

                         
                        int index49_22 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_22);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA49_23 = input.LA(1);

                         
                        int index49_23 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_23);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA49_24 = input.LA(1);

                         
                        int index49_24 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_24);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA49_25 = input.LA(1);

                         
                        int index49_25 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_25);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA49_26 = input.LA(1);

                         
                        int index49_26 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_26);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA49_27 = input.LA(1);

                         
                        int index49_27 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_27);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA49_28 = input.LA(1);

                         
                        int index49_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_28);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA49_29 = input.LA(1);

                         
                        int index49_29 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_29);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA49_30 = input.LA(1);

                         
                        int index49_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_30);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA49_31 = input.LA(1);

                         
                        int index49_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_31);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA49_32 = input.LA(1);

                         
                        int index49_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_32);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA49_33 = input.LA(1);

                         
                        int index49_33 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_33);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA49_34 = input.LA(1);

                         
                        int index49_34 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_34);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA49_35 = input.LA(1);

                         
                        int index49_35 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_35);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA49_36 = input.LA(1);

                         
                        int index49_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_36);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA49_37 = input.LA(1);

                         
                        int index49_37 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_37);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA49_38 = input.LA(1);

                         
                        int index49_38 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_38);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA49_39 = input.LA(1);

                         
                        int index49_39 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_39);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA49_40 = input.LA(1);

                         
                        int index49_40 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_40);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA49_41 = input.LA(1);

                         
                        int index49_41 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_41);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA49_42 = input.LA(1);

                         
                        int index49_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_42);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA49_43 = input.LA(1);

                         
                        int index49_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_43);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA49_44 = input.LA(1);

                         
                        int index49_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_44);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA49_45 = input.LA(1);

                         
                        int index49_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_45);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA49_46 = input.LA(1);

                         
                        int index49_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_46);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA49_47 = input.LA(1);

                         
                        int index49_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_47);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA49_48 = input.LA(1);

                         
                        int index49_48 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_48);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA49_49 = input.LA(1);

                         
                        int index49_49 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_49);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA49_50 = input.LA(1);

                         
                        int index49_50 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_50);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA49_51 = input.LA(1);

                         
                        int index49_51 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_51);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA49_52 = input.LA(1);

                         
                        int index49_52 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_52);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA49_53 = input.LA(1);

                         
                        int index49_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_53);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA49_54 = input.LA(1);

                         
                        int index49_54 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_54);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA49_55 = input.LA(1);

                         
                        int index49_55 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_55);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA49_56 = input.LA(1);

                         
                        int index49_56 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_56);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA49_57 = input.LA(1);

                         
                        int index49_57 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_57);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA49_58 = input.LA(1);

                         
                        int index49_58 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_58);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA49_59 = input.LA(1);

                         
                        int index49_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_59);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA49_60 = input.LA(1);

                         
                        int index49_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_60);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA49_61 = input.LA(1);

                         
                        int index49_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_61);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA49_62 = input.LA(1);

                         
                        int index49_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_62);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA49_63 = input.LA(1);

                         
                        int index49_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_63);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA49_64 = input.LA(1);

                         
                        int index49_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_64);

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA49_65 = input.LA(1);

                         
                        int index49_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_65);

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA49_66 = input.LA(1);

                         
                        int index49_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_66);

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA49_67 = input.LA(1);

                         
                        int index49_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_67);

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA49_68 = input.LA(1);

                         
                        int index49_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_68);

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA49_69 = input.LA(1);

                         
                        int index49_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_69);

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA49_70 = input.LA(1);

                         
                        int index49_70 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_70);

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA49_71 = input.LA(1);

                         
                        int index49_71 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_71);

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA49_72 = input.LA(1);

                         
                        int index49_72 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_72);

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA49_73 = input.LA(1);

                         
                        int index49_73 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_73);

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA49_74 = input.LA(1);

                         
                        int index49_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_74);

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA49_75 = input.LA(1);

                         
                        int index49_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_75);

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA49_76 = input.LA(1);

                         
                        int index49_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_76);

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA49_77 = input.LA(1);

                         
                        int index49_77 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_77);

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA49_78 = input.LA(1);

                         
                        int index49_78 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_78);

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA49_79 = input.LA(1);

                         
                        int index49_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_79);

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA49_92 = input.LA(1);

                         
                        int index49_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_92);

                        if ( s>=0 ) return s;
                        break;

                    case 64 : 
                        int LA49_93 = input.LA(1);

                         
                        int index49_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_93);

                        if ( s>=0 ) return s;
                        break;

                    case 65 : 
                        int LA49_94 = input.LA(1);

                         
                        int index49_94 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_94);

                        if ( s>=0 ) return s;
                        break;

                    case 66 : 
                        int LA49_95 = input.LA(1);

                         
                        int index49_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_95);

                        if ( s>=0 ) return s;
                        break;

                    case 67 : 
                        int LA49_96 = input.LA(1);

                         
                        int index49_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_96);

                        if ( s>=0 ) return s;
                        break;

                    case 68 : 
                        int LA49_97 = input.LA(1);

                         
                        int index49_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_97);

                        if ( s>=0 ) return s;
                        break;

                    case 69 : 
                        int LA49_98 = input.LA(1);

                         
                        int index49_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_98);

                        if ( s>=0 ) return s;
                        break;

                    case 70 : 
                        int LA49_99 = input.LA(1);

                         
                        int index49_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_99);

                        if ( s>=0 ) return s;
                        break;

                    case 71 : 
                        int LA49_100 = input.LA(1);

                         
                        int index49_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_100);

                        if ( s>=0 ) return s;
                        break;

                    case 72 : 
                        int LA49_101 = input.LA(1);

                         
                        int index49_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_101);

                        if ( s>=0 ) return s;
                        break;

                    case 73 : 
                        int LA49_102 = input.LA(1);

                         
                        int index49_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_102);

                        if ( s>=0 ) return s;
                        break;

                    case 74 : 
                        int LA49_103 = input.LA(1);

                         
                        int index49_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_103);

                        if ( s>=0 ) return s;
                        break;

                    case 75 : 
                        int LA49_104 = input.LA(1);

                         
                        int index49_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_104);

                        if ( s>=0 ) return s;
                        break;

                    case 76 : 
                        int LA49_105 = input.LA(1);

                         
                        int index49_105 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_105);

                        if ( s>=0 ) return s;
                        break;

                    case 77 : 
                        int LA49_106 = input.LA(1);

                         
                        int index49_106 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_106);

                        if ( s>=0 ) return s;
                        break;

                    case 78 : 
                        int LA49_107 = input.LA(1);

                         
                        int index49_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_107);

                        if ( s>=0 ) return s;
                        break;

                    case 79 : 
                        int LA49_120 = input.LA(1);

                         
                        int index49_120 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_120);

                        if ( s>=0 ) return s;
                        break;

                    case 80 : 
                        int LA49_121 = input.LA(1);

                         
                        int index49_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_121);

                        if ( s>=0 ) return s;
                        break;

                    case 81 : 
                        int LA49_122 = input.LA(1);

                         
                        int index49_122 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_122);

                        if ( s>=0 ) return s;
                        break;

                    case 82 : 
                        int LA49_123 = input.LA(1);

                         
                        int index49_123 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_123);

                        if ( s>=0 ) return s;
                        break;

                    case 83 : 
                        int LA49_124 = input.LA(1);

                         
                        int index49_124 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_124);

                        if ( s>=0 ) return s;
                        break;

                    case 84 : 
                        int LA49_125 = input.LA(1);

                         
                        int index49_125 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_125);

                        if ( s>=0 ) return s;
                        break;

                    case 85 : 
                        int LA49_126 = input.LA(1);

                         
                        int index49_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_126);

                        if ( s>=0 ) return s;
                        break;

                    case 86 : 
                        int LA49_127 = input.LA(1);

                         
                        int index49_127 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_127);

                        if ( s>=0 ) return s;
                        break;

                    case 87 : 
                        int LA49_128 = input.LA(1);

                         
                        int index49_128 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_128);

                        if ( s>=0 ) return s;
                        break;

                    case 88 : 
                        int LA49_129 = input.LA(1);

                         
                        int index49_129 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_129);

                        if ( s>=0 ) return s;
                        break;

                    case 89 : 
                        int LA49_142 = input.LA(1);

                         
                        int index49_142 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_142);

                        if ( s>=0 ) return s;
                        break;

                    case 90 : 
                        int LA49_143 = input.LA(1);

                         
                        int index49_143 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_143);

                        if ( s>=0 ) return s;
                        break;

                    case 91 : 
                        int LA49_144 = input.LA(1);

                         
                        int index49_144 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_144);

                        if ( s>=0 ) return s;
                        break;

                    case 92 : 
                        int LA49_145 = input.LA(1);

                         
                        int index49_145 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_145);

                        if ( s>=0 ) return s;
                        break;

                    case 93 : 
                        int LA49_146 = input.LA(1);

                         
                        int index49_146 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_146);

                        if ( s>=0 ) return s;
                        break;

                    case 94 : 
                        int LA49_147 = input.LA(1);

                         
                        int index49_147 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_147);

                        if ( s>=0 ) return s;
                        break;

                    case 95 : 
                        int LA49_148 = input.LA(1);

                         
                        int index49_148 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_148);

                        if ( s>=0 ) return s;
                        break;

                    case 96 : 
                        int LA49_149 = input.LA(1);

                         
                        int index49_149 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_149);

                        if ( s>=0 ) return s;
                        break;

                    case 97 : 
                        int LA49_150 = input.LA(1);

                         
                        int index49_150 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_150);

                        if ( s>=0 ) return s;
                        break;

                    case 98 : 
                        int LA49_151 = input.LA(1);

                         
                        int index49_151 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_151);

                        if ( s>=0 ) return s;
                        break;

                    case 99 : 
                        int LA49_164 = input.LA(1);

                         
                        int index49_164 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_164);

                        if ( s>=0 ) return s;
                        break;

                    case 100 : 
                        int LA49_165 = input.LA(1);

                         
                        int index49_165 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_165);

                        if ( s>=0 ) return s;
                        break;

                    case 101 : 
                        int LA49_166 = input.LA(1);

                         
                        int index49_166 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_166);

                        if ( s>=0 ) return s;
                        break;

                    case 102 : 
                        int LA49_167 = input.LA(1);

                         
                        int index49_167 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_167);

                        if ( s>=0 ) return s;
                        break;

                    case 103 : 
                        int LA49_168 = input.LA(1);

                         
                        int index49_168 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_168);

                        if ( s>=0 ) return s;
                        break;

                    case 104 : 
                        int LA49_169 = input.LA(1);

                         
                        int index49_169 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_169);

                        if ( s>=0 ) return s;
                        break;

                    case 105 : 
                        int LA49_170 = input.LA(1);

                         
                        int index49_170 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_170);

                        if ( s>=0 ) return s;
                        break;

                    case 106 : 
                        int LA49_171 = input.LA(1);

                         
                        int index49_171 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_171);

                        if ( s>=0 ) return s;
                        break;

                    case 107 : 
                        int LA49_172 = input.LA(1);

                         
                        int index49_172 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_172);

                        if ( s>=0 ) return s;
                        break;

                    case 108 : 
                        int LA49_173 = input.LA(1);

                         
                        int index49_173 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_173);

                        if ( s>=0 ) return s;
                        break;

                    case 109 : 
                        int LA49_186 = input.LA(1);

                         
                        int index49_186 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_186);

                        if ( s>=0 ) return s;
                        break;

                    case 110 : 
                        int LA49_187 = input.LA(1);

                         
                        int index49_187 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_187);

                        if ( s>=0 ) return s;
                        break;

                    case 111 : 
                        int LA49_188 = input.LA(1);

                         
                        int index49_188 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_188);

                        if ( s>=0 ) return s;
                        break;

                    case 112 : 
                        int LA49_189 = input.LA(1);

                         
                        int index49_189 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_189);

                        if ( s>=0 ) return s;
                        break;

                    case 113 : 
                        int LA49_190 = input.LA(1);

                         
                        int index49_190 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_190);

                        if ( s>=0 ) return s;
                        break;

                    case 114 : 
                        int LA49_191 = input.LA(1);

                         
                        int index49_191 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_191);

                        if ( s>=0 ) return s;
                        break;

                    case 115 : 
                        int LA49_192 = input.LA(1);

                         
                        int index49_192 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_192);

                        if ( s>=0 ) return s;
                        break;

                    case 116 : 
                        int LA49_193 = input.LA(1);

                         
                        int index49_193 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_193);

                        if ( s>=0 ) return s;
                        break;

                    case 117 : 
                        int LA49_194 = input.LA(1);

                         
                        int index49_194 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_194);

                        if ( s>=0 ) return s;
                        break;

                    case 118 : 
                        int LA49_195 = input.LA(1);

                         
                        int index49_195 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_195);

                        if ( s>=0 ) return s;
                        break;

                    case 119 : 
                        int LA49_208 = input.LA(1);

                         
                        int index49_208 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_208);

                        if ( s>=0 ) return s;
                        break;

                    case 120 : 
                        int LA49_209 = input.LA(1);

                         
                        int index49_209 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_209);

                        if ( s>=0 ) return s;
                        break;

                    case 121 : 
                        int LA49_210 = input.LA(1);

                         
                        int index49_210 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_210);

                        if ( s>=0 ) return s;
                        break;

                    case 122 : 
                        int LA49_211 = input.LA(1);

                         
                        int index49_211 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_211);

                        if ( s>=0 ) return s;
                        break;

                    case 123 : 
                        int LA49_212 = input.LA(1);

                         
                        int index49_212 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_212);

                        if ( s>=0 ) return s;
                        break;

                    case 124 : 
                        int LA49_213 = input.LA(1);

                         
                        int index49_213 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_213);

                        if ( s>=0 ) return s;
                        break;

                    case 125 : 
                        int LA49_214 = input.LA(1);

                         
                        int index49_214 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_214);

                        if ( s>=0 ) return s;
                        break;

                    case 126 : 
                        int LA49_215 = input.LA(1);

                         
                        int index49_215 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_215);

                        if ( s>=0 ) return s;
                        break;

                    case 127 : 
                        int LA49_216 = input.LA(1);

                         
                        int index49_216 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_216);

                        if ( s>=0 ) return s;
                        break;

                    case 128 : 
                        int LA49_217 = input.LA(1);

                         
                        int index49_217 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_217);

                        if ( s>=0 ) return s;
                        break;

                    case 129 : 
                        int LA49_230 = input.LA(1);

                         
                        int index49_230 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_230);

                        if ( s>=0 ) return s;
                        break;

                    case 130 : 
                        int LA49_231 = input.LA(1);

                         
                        int index49_231 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_231);

                        if ( s>=0 ) return s;
                        break;

                    case 131 : 
                        int LA49_232 = input.LA(1);

                         
                        int index49_232 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred70_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index49_232);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA67_eotS =
        "\u00ce\uffff";
    static final String DFA67_eofS =
        "\1\uffff\1\46\7\uffff\6\46\u00bf\uffff";
    static final String DFA67_minS =
        "\2\6\1\45\3\6\3\45\6\6\1\121\1\45\24\0\4\uffff\104\0\4\uffff\16"+
        "\0\4\uffff\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff\3"+
        "\0";
    static final String DFA67_maxS =
        "\1\152\1\156\7\152\6\156\1\121\1\152\24\0\4\uffff\104\0\4\uffff"+
        "\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff"+
        "\3\0";
    static final String DFA67_acceptS =
        "\45\uffff\1\1\1\2\u00a7\uffff";
    static final String DFA67_specialS =
        "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\24\1\25\1\26\1"+
        "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
        "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
        "\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75"+
        "\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
        "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123"+
        "\1\124\1\125\1\126\1\127\4\uffff\1\130\1\131\1\132\1\133\1\134\1"+
        "\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\4\uffff\1\146"+
        "\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161"+
        "\1\162\1\163\4\uffff\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1"+
        "\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\4\uffff\1\u0082\1\u0083"+
        "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
        "\1\u008c\1\u008d\1\u008e\1\u008f\4\uffff\1\u0090\1\u0091\1\u0092"+
        "\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a"+
        "\1\u009b\1\u009c\1\u009d\4\uffff\1\u009e\1\u009f\1\u00a0}>";
    static final String[] DFA67_transitionS = {
            "\1\20\2\uffff\1\17\3\uffff\1\3\2\uffff\1\16\6\uffff\1\10\15"+
            "\uffff\1\2\1\uffff\1\12\24\uffff\1\13\5\uffff\1\6\2\uffff\1"+
            "\14\6\uffff\1\4\2\uffff\1\7\1\uffff\1\5\13\uffff\1\15\5\uffff"+
            "\1\11\2\uffff\1\4\1\uffff\1\4\1\uffff\1\1",
            "\1\35\1\42\2\uffff\1\45\1\24\1\30\11\uffff\1\21\1\uffff\1\46"+
            "\3\uffff\1\46\1\33\10\uffff\1\31\6\uffff\1\34\1\24\12\uffff"+
            "\1\30\10\uffff\1\25\1\23\1\27\3\uffff\1\37\1\40\2\uffff\1\31"+
            "\4\uffff\1\26\1\uffff\1\22\1\44\1\uffff\1\30\1\36\1\31\3\uffff"+
            "\1\41\5\uffff\1\32\13\uffff\1\43",
            "\1\51\104\uffff\1\52",
            "\1\72\2\uffff\1\71\3\uffff\1\53\2\uffff\1\70\6\uffff\1\62\15"+
            "\uffff\1\60\1\uffff\1\64\24\uffff\1\65\5\uffff\1\56\2\uffff"+
            "\1\66\6\uffff\1\54\2\uffff\1\61\1\uffff\1\55\13\uffff\1\67\5"+
            "\uffff\1\63\2\uffff\1\54\1\uffff\1\54\1\uffff\1\57",
            "\1\107\2\uffff\1\106\6\uffff\1\105\6\uffff\1\77\15\uffff\1"+
            "\75\1\uffff\1\101\24\uffff\1\102\5\uffff\1\73\2\uffff\1\103"+
            "\11\uffff\1\76\15\uffff\1\104\5\uffff\1\100\6\uffff\1\74",
            "\1\130\2\uffff\1\127\3\uffff\1\113\2\uffff\1\126\6\uffff\1"+
            "\120\15\uffff\1\112\1\uffff\1\122\24\uffff\1\123\5\uffff\1\116"+
            "\2\uffff\1\124\6\uffff\1\114\2\uffff\1\117\1\uffff\1\115\11"+
            "\uffff\1\110\1\uffff\1\125\5\uffff\1\121\2\uffff\1\114\1\uffff"+
            "\1\114\1\uffff\1\111",
            "\1\132\104\uffff\1\131",
            "\1\134\104\uffff\1\133",
            "\1\136\104\uffff\1\135",
            "\1\145\1\152\2\uffff\1\45\1\uffff\1\140\13\uffff\1\46\3\uffff"+
            "\1\46\1\143\10\uffff\1\141\6\uffff\1\144\13\uffff\1\140\12\uffff"+
            "\1\137\3\uffff\1\147\1\150\2\uffff\1\141\7\uffff\1\154\1\uffff"+
            "\1\140\1\146\1\141\3\uffff\1\151\5\uffff\1\142\13\uffff\1\153",
            "\1\167\1\174\2\uffff\1\45\1\uffff\1\162\13\uffff\1\46\3\uffff"+
            "\1\46\1\165\10\uffff\1\163\6\uffff\1\166\13\uffff\1\162\12\uffff"+
            "\1\161\3\uffff\1\171\1\172\2\uffff\1\163\7\uffff\1\176\1\uffff"+
            "\1\162\1\170\1\163\3\uffff\1\173\5\uffff\1\164\13\uffff\1\175",
            "\1\u0089\1\u008e\2\uffff\1\45\1\uffff\1\u0084\13\uffff\1\46"+
            "\3\uffff\1\46\1\u0087\10\uffff\1\u0085\6\uffff\1\u0088\13\uffff"+
            "\1\u0084\12\uffff\1\u0083\3\uffff\1\u008b\1\u008c\2\uffff\1"+
            "\u0085\7\uffff\1\u0090\1\uffff\1\u0084\1\u008a\1\u0085\3\uffff"+
            "\1\u008d\5\uffff\1\u0086\13\uffff\1\u008f",
            "\1\u009b\1\u00a0\2\uffff\1\45\1\uffff\1\u0096\13\uffff\1\46"+
            "\3\uffff\1\46\1\u0099\10\uffff\1\u0097\6\uffff\1\u009a\13\uffff"+
            "\1\u0096\12\uffff\1\u0095\3\uffff\1\u009d\1\u009e\2\uffff\1"+
            "\u0097\7\uffff\1\u00a2\1\uffff\1\u0096\1\u009c\1\u0097\3\uffff"+
            "\1\u009f\5\uffff\1\u0098\13\uffff\1\u00a1",
            "\1\u00ad\1\u00b2\2\uffff\1\45\1\uffff\1\u00a8\13\uffff\1\46"+
            "\3\uffff\1\46\1\u00ab\10\uffff\1\u00a9\6\uffff\1\u00ac\13\uffff"+
            "\1\u00a8\12\uffff\1\u00a7\3\uffff\1\u00af\1\u00b0\2\uffff\1"+
            "\u00a9\7\uffff\1\u00b4\1\uffff\1\u00a8\1\u00ae\1\u00a9\3\uffff"+
            "\1\u00b1\5\uffff\1\u00aa\13\uffff\1\u00b3",
            "\1\u00bf\1\u00c4\2\uffff\1\45\1\uffff\1\u00ba\13\uffff\1\46"+
            "\3\uffff\1\46\1\u00bd\10\uffff\1\u00bb\6\uffff\1\u00be\13\uffff"+
            "\1\u00ba\12\uffff\1\u00b9\3\uffff\1\u00c1\1\u00c2\2\uffff\1"+
            "\u00bb\7\uffff\1\u00c6\1\uffff\1\u00ba\1\u00c0\1\u00bb\3\uffff"+
            "\1\u00c3\5\uffff\1\u00bc\13\uffff\1\u00c5",
            "\1\u00cb",
            "\1\u00cd\104\uffff\1\u00cc",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "382:7: ( keyValuePair | expression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_17 = input.LA(1);

                         
                        int index67_17 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_17);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_18);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_19);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA67_20 = input.LA(1);

                         
                        int index67_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_20);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA67_21 = input.LA(1);

                         
                        int index67_21 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_21);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA67_22 = input.LA(1);

                         
                        int index67_22 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_22);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA67_23 = input.LA(1);

                         
                        int index67_23 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_23);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA67_24 = input.LA(1);

                         
                        int index67_24 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_24);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA67_25 = input.LA(1);

                         
                        int index67_25 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_25);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA67_26 = input.LA(1);

                         
                        int index67_26 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_26);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA67_27 = input.LA(1);

                         
                        int index67_27 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_27);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA67_28 = input.LA(1);

                         
                        int index67_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_28);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA67_29 = input.LA(1);

                         
                        int index67_29 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_29);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA67_30 = input.LA(1);

                         
                        int index67_30 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_30);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA67_31 = input.LA(1);

                         
                        int index67_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_31);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA67_32 = input.LA(1);

                         
                        int index67_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_32);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA67_33 = input.LA(1);

                         
                        int index67_33 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_33);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA67_34 = input.LA(1);

                         
                        int index67_34 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_34);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA67_35 = input.LA(1);

                         
                        int index67_35 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_35);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA67_36 = input.LA(1);

                         
                        int index67_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_36);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA67_41 = input.LA(1);

                         
                        int index67_41 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_41);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA67_42 = input.LA(1);

                         
                        int index67_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_42);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA67_43 = input.LA(1);

                         
                        int index67_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_43);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA67_44 = input.LA(1);

                         
                        int index67_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_44);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA67_45 = input.LA(1);

                         
                        int index67_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_45);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA67_46 = input.LA(1);

                         
                        int index67_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_46);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA67_47 = input.LA(1);

                         
                        int index67_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_47);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA67_48 = input.LA(1);

                         
                        int index67_48 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_48);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA67_49 = input.LA(1);

                         
                        int index67_49 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_49);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA67_50 = input.LA(1);

                         
                        int index67_50 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_50);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA67_51 = input.LA(1);

                         
                        int index67_51 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_51);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA67_52 = input.LA(1);

                         
                        int index67_52 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_52);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA67_53 = input.LA(1);

                         
                        int index67_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_53);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA67_54 = input.LA(1);

                         
                        int index67_54 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_54);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA67_55 = input.LA(1);

                         
                        int index67_55 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_55);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA67_56 = input.LA(1);

                         
                        int index67_56 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_56);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA67_57 = input.LA(1);

                         
                        int index67_57 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_57);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA67_58 = input.LA(1);

                         
                        int index67_58 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_58);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA67_59 = input.LA(1);

                         
                        int index67_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_59);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA67_60 = input.LA(1);

                         
                        int index67_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_60);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA67_61 = input.LA(1);

                         
                        int index67_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_61);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA67_62 = input.LA(1);

                         
                        int index67_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_62);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA67_63 = input.LA(1);

                         
                        int index67_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_63);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA67_64 = input.LA(1);

                         
                        int index67_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_64);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA67_65 = input.LA(1);

                         
                        int index67_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_65);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA67_66 = input.LA(1);

                         
                        int index67_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_66);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA67_67 = input.LA(1);

                         
                        int index67_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_67);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA67_68 = input.LA(1);

                         
                        int index67_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_68);

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA67_69 = input.LA(1);

                         
                        int index67_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_69);

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA67_70 = input.LA(1);

                         
                        int index67_70 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_70);

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA67_71 = input.LA(1);

                         
                        int index67_71 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_71);

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA67_72 = input.LA(1);

                         
                        int index67_72 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_72);

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA67_73 = input.LA(1);

                         
                        int index67_73 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_73);

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA67_74 = input.LA(1);

                         
                        int index67_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_74);

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA67_75 = input.LA(1);

                         
                        int index67_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_75);

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA67_76 = input.LA(1);

                         
                        int index67_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_76);

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA67_77 = input.LA(1);

                         
                        int index67_77 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_77);

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA67_78 = input.LA(1);

                         
                        int index67_78 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_78);

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA67_79 = input.LA(1);

                         
                        int index67_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_79);

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA67_80 = input.LA(1);

                         
                        int index67_80 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_80);

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA67_81 = input.LA(1);

                         
                        int index67_81 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_81);

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA67_82 = input.LA(1);

                         
                        int index67_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_82);

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA67_83 = input.LA(1);

                         
                        int index67_83 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_83);

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA67_84 = input.LA(1);

                         
                        int index67_84 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_84);

                        if ( s>=0 ) return s;
                        break;

                    case 64 : 
                        int LA67_85 = input.LA(1);

                         
                        int index67_85 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_85);

                        if ( s>=0 ) return s;
                        break;

                    case 65 : 
                        int LA67_86 = input.LA(1);

                         
                        int index67_86 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_86);

                        if ( s>=0 ) return s;
                        break;

                    case 66 : 
                        int LA67_87 = input.LA(1);

                         
                        int index67_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_87);

                        if ( s>=0 ) return s;
                        break;

                    case 67 : 
                        int LA67_88 = input.LA(1);

                         
                        int index67_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_88);

                        if ( s>=0 ) return s;
                        break;

                    case 68 : 
                        int LA67_89 = input.LA(1);

                         
                        int index67_89 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_89);

                        if ( s>=0 ) return s;
                        break;

                    case 69 : 
                        int LA67_90 = input.LA(1);

                         
                        int index67_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_90);

                        if ( s>=0 ) return s;
                        break;

                    case 70 : 
                        int LA67_91 = input.LA(1);

                         
                        int index67_91 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_91);

                        if ( s>=0 ) return s;
                        break;

                    case 71 : 
                        int LA67_92 = input.LA(1);

                         
                        int index67_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_92);

                        if ( s>=0 ) return s;
                        break;

                    case 72 : 
                        int LA67_93 = input.LA(1);

                         
                        int index67_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_93);

                        if ( s>=0 ) return s;
                        break;

                    case 73 : 
                        int LA67_94 = input.LA(1);

                         
                        int index67_94 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_94);

                        if ( s>=0 ) return s;
                        break;

                    case 74 : 
                        int LA67_95 = input.LA(1);

                         
                        int index67_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_95);

                        if ( s>=0 ) return s;
                        break;

                    case 75 : 
                        int LA67_96 = input.LA(1);

                         
                        int index67_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_96);

                        if ( s>=0 ) return s;
                        break;

                    case 76 : 
                        int LA67_97 = input.LA(1);

                         
                        int index67_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_97);

                        if ( s>=0 ) return s;
                        break;

                    case 77 : 
                        int LA67_98 = input.LA(1);

                         
                        int index67_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_98);

                        if ( s>=0 ) return s;
                        break;

                    case 78 : 
                        int LA67_99 = input.LA(1);

                         
                        int index67_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_99);

                        if ( s>=0 ) return s;
                        break;

                    case 79 : 
                        int LA67_100 = input.LA(1);

                         
                        int index67_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_100);

                        if ( s>=0 ) return s;
                        break;

                    case 80 : 
                        int LA67_101 = input.LA(1);

                         
                        int index67_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_101);

                        if ( s>=0 ) return s;
                        break;

                    case 81 : 
                        int LA67_102 = input.LA(1);

                         
                        int index67_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_102);

                        if ( s>=0 ) return s;
                        break;

                    case 82 : 
                        int LA67_103 = input.LA(1);

                         
                        int index67_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_103);

                        if ( s>=0 ) return s;
                        break;

                    case 83 : 
                        int LA67_104 = input.LA(1);

                         
                        int index67_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_104);

                        if ( s>=0 ) return s;
                        break;

                    case 84 : 
                        int LA67_105 = input.LA(1);

                         
                        int index67_105 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_105);

                        if ( s>=0 ) return s;
                        break;

                    case 85 : 
                        int LA67_106 = input.LA(1);

                         
                        int index67_106 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_106);

                        if ( s>=0 ) return s;
                        break;

                    case 86 : 
                        int LA67_107 = input.LA(1);

                         
                        int index67_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_107);

                        if ( s>=0 ) return s;
                        break;

                    case 87 : 
                        int LA67_108 = input.LA(1);

                         
                        int index67_108 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_108);

                        if ( s>=0 ) return s;
                        break;

                    case 88 : 
                        int LA67_113 = input.LA(1);

                         
                        int index67_113 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_113);

                        if ( s>=0 ) return s;
                        break;

                    case 89 : 
                        int LA67_114 = input.LA(1);

                         
                        int index67_114 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_114);

                        if ( s>=0 ) return s;
                        break;

                    case 90 : 
                        int LA67_115 = input.LA(1);

                         
                        int index67_115 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_115);

                        if ( s>=0 ) return s;
                        break;

                    case 91 : 
                        int LA67_116 = input.LA(1);

                         
                        int index67_116 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_116);

                        if ( s>=0 ) return s;
                        break;

                    case 92 : 
                        int LA67_117 = input.LA(1);

                         
                        int index67_117 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_117);

                        if ( s>=0 ) return s;
                        break;

                    case 93 : 
                        int LA67_118 = input.LA(1);

                         
                        int index67_118 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_118);

                        if ( s>=0 ) return s;
                        break;

                    case 94 : 
                        int LA67_119 = input.LA(1);

                         
                        int index67_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_119);

                        if ( s>=0 ) return s;
                        break;

                    case 95 : 
                        int LA67_120 = input.LA(1);

                         
                        int index67_120 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_120);

                        if ( s>=0 ) return s;
                        break;

                    case 96 : 
                        int LA67_121 = input.LA(1);

                         
                        int index67_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_121);

                        if ( s>=0 ) return s;
                        break;

                    case 97 : 
                        int LA67_122 = input.LA(1);

                         
                        int index67_122 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_122);

                        if ( s>=0 ) return s;
                        break;

                    case 98 : 
                        int LA67_123 = input.LA(1);

                         
                        int index67_123 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_123);

                        if ( s>=0 ) return s;
                        break;

                    case 99 : 
                        int LA67_124 = input.LA(1);

                         
                        int index67_124 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_124);

                        if ( s>=0 ) return s;
                        break;

                    case 100 : 
                        int LA67_125 = input.LA(1);

                         
                        int index67_125 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_125);

                        if ( s>=0 ) return s;
                        break;

                    case 101 : 
                        int LA67_126 = input.LA(1);

                         
                        int index67_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_126);

                        if ( s>=0 ) return s;
                        break;

                    case 102 : 
                        int LA67_131 = input.LA(1);

                         
                        int index67_131 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_131);

                        if ( s>=0 ) return s;
                        break;

                    case 103 : 
                        int LA67_132 = input.LA(1);

                         
                        int index67_132 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_132);

                        if ( s>=0 ) return s;
                        break;

                    case 104 : 
                        int LA67_133 = input.LA(1);

                         
                        int index67_133 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_133);

                        if ( s>=0 ) return s;
                        break;

                    case 105 : 
                        int LA67_134 = input.LA(1);

                         
                        int index67_134 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_134);

                        if ( s>=0 ) return s;
                        break;

                    case 106 : 
                        int LA67_135 = input.LA(1);

                         
                        int index67_135 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_135);

                        if ( s>=0 ) return s;
                        break;

                    case 107 : 
                        int LA67_136 = input.LA(1);

                         
                        int index67_136 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_136);

                        if ( s>=0 ) return s;
                        break;

                    case 108 : 
                        int LA67_137 = input.LA(1);

                         
                        int index67_137 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_137);

                        if ( s>=0 ) return s;
                        break;

                    case 109 : 
                        int LA67_138 = input.LA(1);

                         
                        int index67_138 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_138);

                        if ( s>=0 ) return s;
                        break;

                    case 110 : 
                        int LA67_139 = input.LA(1);

                         
                        int index67_139 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_139);

                        if ( s>=0 ) return s;
                        break;

                    case 111 : 
                        int LA67_140 = input.LA(1);

                         
                        int index67_140 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_140);

                        if ( s>=0 ) return s;
                        break;

                    case 112 : 
                        int LA67_141 = input.LA(1);

                         
                        int index67_141 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_141);

                        if ( s>=0 ) return s;
                        break;

                    case 113 : 
                        int LA67_142 = input.LA(1);

                         
                        int index67_142 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_142);

                        if ( s>=0 ) return s;
                        break;

                    case 114 : 
                        int LA67_143 = input.LA(1);

                         
                        int index67_143 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_143);

                        if ( s>=0 ) return s;
                        break;

                    case 115 : 
                        int LA67_144 = input.LA(1);

                         
                        int index67_144 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_144);

                        if ( s>=0 ) return s;
                        break;

                    case 116 : 
                        int LA67_149 = input.LA(1);

                         
                        int index67_149 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_149);

                        if ( s>=0 ) return s;
                        break;

                    case 117 : 
                        int LA67_150 = input.LA(1);

                         
                        int index67_150 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_150);

                        if ( s>=0 ) return s;
                        break;

                    case 118 : 
                        int LA67_151 = input.LA(1);

                         
                        int index67_151 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_151);

                        if ( s>=0 ) return s;
                        break;

                    case 119 : 
                        int LA67_152 = input.LA(1);

                         
                        int index67_152 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_152);

                        if ( s>=0 ) return s;
                        break;

                    case 120 : 
                        int LA67_153 = input.LA(1);

                         
                        int index67_153 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_153);

                        if ( s>=0 ) return s;
                        break;

                    case 121 : 
                        int LA67_154 = input.LA(1);

                         
                        int index67_154 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_154);

                        if ( s>=0 ) return s;
                        break;

                    case 122 : 
                        int LA67_155 = input.LA(1);

                         
                        int index67_155 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_155);

                        if ( s>=0 ) return s;
                        break;

                    case 123 : 
                        int LA67_156 = input.LA(1);

                         
                        int index67_156 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_156);

                        if ( s>=0 ) return s;
                        break;

                    case 124 : 
                        int LA67_157 = input.LA(1);

                         
                        int index67_157 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_157);

                        if ( s>=0 ) return s;
                        break;

                    case 125 : 
                        int LA67_158 = input.LA(1);

                         
                        int index67_158 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_158);

                        if ( s>=0 ) return s;
                        break;

                    case 126 : 
                        int LA67_159 = input.LA(1);

                         
                        int index67_159 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_159);

                        if ( s>=0 ) return s;
                        break;

                    case 127 : 
                        int LA67_160 = input.LA(1);

                         
                        int index67_160 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_160);

                        if ( s>=0 ) return s;
                        break;

                    case 128 : 
                        int LA67_161 = input.LA(1);

                         
                        int index67_161 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_161);

                        if ( s>=0 ) return s;
                        break;

                    case 129 : 
                        int LA67_162 = input.LA(1);

                         
                        int index67_162 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_162);

                        if ( s>=0 ) return s;
                        break;

                    case 130 : 
                        int LA67_167 = input.LA(1);

                         
                        int index67_167 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_167);

                        if ( s>=0 ) return s;
                        break;

                    case 131 : 
                        int LA67_168 = input.LA(1);

                         
                        int index67_168 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_168);

                        if ( s>=0 ) return s;
                        break;

                    case 132 : 
                        int LA67_169 = input.LA(1);

                         
                        int index67_169 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_169);

                        if ( s>=0 ) return s;
                        break;

                    case 133 : 
                        int LA67_170 = input.LA(1);

                         
                        int index67_170 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_170);

                        if ( s>=0 ) return s;
                        break;

                    case 134 : 
                        int LA67_171 = input.LA(1);

                         
                        int index67_171 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_171);

                        if ( s>=0 ) return s;
                        break;

                    case 135 : 
                        int LA67_172 = input.LA(1);

                         
                        int index67_172 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_172);

                        if ( s>=0 ) return s;
                        break;

                    case 136 : 
                        int LA67_173 = input.LA(1);

                         
                        int index67_173 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_173);

                        if ( s>=0 ) return s;
                        break;

                    case 137 : 
                        int LA67_174 = input.LA(1);

                         
                        int index67_174 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_174);

                        if ( s>=0 ) return s;
                        break;

                    case 138 : 
                        int LA67_175 = input.LA(1);

                         
                        int index67_175 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_175);

                        if ( s>=0 ) return s;
                        break;

                    case 139 : 
                        int LA67_176 = input.LA(1);

                         
                        int index67_176 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_176);

                        if ( s>=0 ) return s;
                        break;

                    case 140 : 
                        int LA67_177 = input.LA(1);

                         
                        int index67_177 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_177);

                        if ( s>=0 ) return s;
                        break;

                    case 141 : 
                        int LA67_178 = input.LA(1);

                         
                        int index67_178 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_178);

                        if ( s>=0 ) return s;
                        break;

                    case 142 : 
                        int LA67_179 = input.LA(1);

                         
                        int index67_179 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_179);

                        if ( s>=0 ) return s;
                        break;

                    case 143 : 
                        int LA67_180 = input.LA(1);

                         
                        int index67_180 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_180);

                        if ( s>=0 ) return s;
                        break;

                    case 144 : 
                        int LA67_185 = input.LA(1);

                         
                        int index67_185 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_185);

                        if ( s>=0 ) return s;
                        break;

                    case 145 : 
                        int LA67_186 = input.LA(1);

                         
                        int index67_186 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_186);

                        if ( s>=0 ) return s;
                        break;

                    case 146 : 
                        int LA67_187 = input.LA(1);

                         
                        int index67_187 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_187);

                        if ( s>=0 ) return s;
                        break;

                    case 147 : 
                        int LA67_188 = input.LA(1);

                         
                        int index67_188 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_188);

                        if ( s>=0 ) return s;
                        break;

                    case 148 : 
                        int LA67_189 = input.LA(1);

                         
                        int index67_189 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_189);

                        if ( s>=0 ) return s;
                        break;

                    case 149 : 
                        int LA67_190 = input.LA(1);

                         
                        int index67_190 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_190);

                        if ( s>=0 ) return s;
                        break;

                    case 150 : 
                        int LA67_191 = input.LA(1);

                         
                        int index67_191 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_191);

                        if ( s>=0 ) return s;
                        break;

                    case 151 : 
                        int LA67_192 = input.LA(1);

                         
                        int index67_192 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_192);

                        if ( s>=0 ) return s;
                        break;

                    case 152 : 
                        int LA67_193 = input.LA(1);

                         
                        int index67_193 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_193);

                        if ( s>=0 ) return s;
                        break;

                    case 153 : 
                        int LA67_194 = input.LA(1);

                         
                        int index67_194 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_194);

                        if ( s>=0 ) return s;
                        break;

                    case 154 : 
                        int LA67_195 = input.LA(1);

                         
                        int index67_195 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_195);

                        if ( s>=0 ) return s;
                        break;

                    case 155 : 
                        int LA67_196 = input.LA(1);

                         
                        int index67_196 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_196);

                        if ( s>=0 ) return s;
                        break;

                    case 156 : 
                        int LA67_197 = input.LA(1);

                         
                        int index67_197 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_197);

                        if ( s>=0 ) return s;
                        break;

                    case 157 : 
                        int LA67_198 = input.LA(1);

                         
                        int index67_198 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_198);

                        if ( s>=0 ) return s;
                        break;

                    case 158 : 
                        int LA67_203 = input.LA(1);

                         
                        int index67_203 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_203);

                        if ( s>=0 ) return s;
                        break;

                    case 159 : 
                        int LA67_204 = input.LA(1);

                         
                        int index67_204 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_204);

                        if ( s>=0 ) return s;
                        break;

                    case 160 : 
                        int LA67_205 = input.LA(1);

                         
                        int index67_205 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred98_Php()) ) {s = 37;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index67_205);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_statement_in_prog877 = new BitSet(new long[]{0x9D1001B08093A252L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_simpleStatement_in_statement890 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_BodyString_in_statement893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_statement901 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_statement903 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_statement905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketedBlock_in_statement917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_statement930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDefinition_in_statement938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexStatement_in_statement946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_statement954 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_statement956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_bracketedBlock978 = new BitSet(new long[]{0x9D1001B08293A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_bracketedBlock982 = new BitSet(new long[]{0x9D1001B08293A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_bracketedBlock985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Interface_in_interfaceDefinition1011 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceDefinition1015 = new BitSet(new long[]{0x0002000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_interfaceExtends_in_interfaceDefinition1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_interfaceDefinition1028 = new BitSet(new long[]{0x0400000042000030L,0x0000002000000000L});
    public static final BitSet FOLLOW_interfaceMember_in_interfaceDefinition1038 = new BitSet(new long[]{0x0400000042000030L,0x0000002000000000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_interfaceDefinition1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Extends_in_interfaceExtends1089 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1092 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_Comma_in_interfaceExtends1095 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1098 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_Const_in_interfaceMember1116 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1118 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_Equals_in_interfaceMember1121 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
    public static final BitSet FOLLOW_atom_in_interfaceMember1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_interfaceMember1155 = new BitSet(new long[]{0x0400000000000030L,0x0000002000000000L});
    public static final BitSet FOLLOW_Function_in_interfaceMember1158 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parametersDefinition_in_interfaceMember1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDefinition1208 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Class_in_classDefinition1220 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1224 = new BitSet(new long[]{0x0002000000000000L,0x0000000000040002L});
    public static final BitSet FOLLOW_Extends_in_classDefinition1236 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040002L});
    public static final BitSet FOLLOW_classImplements_in_classDefinition1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_classDefinition1264 = new BitSet(new long[]{0x0400002042000030L,0x0000082000000000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition1274 = new BitSet(new long[]{0x0400002042000030L,0x0000082000000000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_classDefinition1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Implements_in_classImplements1367 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1371 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_Comma_in_classImplements1374 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1377 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1397 = new BitSet(new long[]{0x0400000000000030L,0x0000002000000000L});
    public static final BitSet FOLLOW_Function_in_classMember1400 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parametersDefinition_in_classMember1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000200040000L});
    public static final BitSet FOLLOW_bracketedBlock_in_classMember1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_classMember1457 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1459 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1461 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_Equals_in_classMember1464 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
    public static final BitSet FOLLOW_atom_in_classMember1466 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_classMember1503 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1505 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_Equals_in_classMember1508 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
    public static final BitSet FOLLOW_atom_in_classMember1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1542 = new BitSet(new long[]{0x0000002000000030L,0x0000002000000000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1546 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1548 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_Equals_in_classMember1552 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
    public static final BitSet FOLLOW_atom_in_classMember1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_fieldDefinition1606 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_fieldDefinition1608 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_Equals_in_fieldDefinition1611 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
    public static final BitSet FOLLOW_atom_in_fieldDefinition1613 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_fieldDefinition1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Abstract_in_classModifier1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_complexStatement1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1697 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_complexStatement1701 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1703 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_complexStatement1707 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_conditional_in_complexStatement1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_complexStatement1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1742 = new BitSet(new long[]{0x100000A000812240L,0x0000054A20029024L});
    public static final BitSet FOLLOW_forInit_in_complexStatement1744 = new BitSet(new long[]{0x100000A000812240L,0x0000054A20029024L});
    public static final BitSet FOLLOW_forCondition_in_complexStatement1746 = new BitSet(new long[]{0x100000A001812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_forUpdate_in_complexStatement1748 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1750 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_complexStatement1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Foreach_in_complexStatement1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1776 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_variable_in_complexStatement1778 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_complexStatement1780 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_arrayEntry_in_complexStatement1782 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1784 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_complexStatement1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_complexStatement1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1808 = new BitSet(new long[]{0x100000A001812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_complexStatement1812 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1815 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_complexStatement1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Do_in_complexStatement1836 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_complexStatement1838 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_While_in_complexStatement1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1842 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_complexStatement1846 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1848 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_complexStatement1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_complexStatement1869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1871 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_complexStatement1873 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_complexStatement1877 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_cases_in_complexStatement1878 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_complexStatement1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_complexStatement1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Echo_in_simpleStatement1914 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_commaList_in_simpleStatement1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Global_in_simpleStatement1925 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1928 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_Comma_in_simpleStatement1931 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1934 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_Static_in_simpleStatement1944 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_variable_in_simpleStatement1947 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_Equals_in_simpleStatement1949 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
    public static final BitSet FOLLOW_atom_in_simpleStatement1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Break_in_simpleStatement1960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_simpleStatement1972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_simpleStatement1989 = new BitSet(new long[]{0x100000A000812242L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_simpleStatement1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RequireOperator_in_simpleStatement2001 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElseIf_in_conditional2030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_conditional2032 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_conditional2036 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_conditional2038 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_conditional2042 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_conditional_in_conditional2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_conditional2068 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_conditional2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forInit2091 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_forInit2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forCondition2120 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SemiColon_in_forCondition2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forUpdate2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casestatement_in_cases2181 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_defaultcase_in_cases2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_casestatement2202 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_casestatement2205 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Colon_in_casestatement2207 = new BitSet(new long[]{0x9D1001B08093A252L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_casestatement2210 = new BitSet(new long[]{0x9D1001B08093A252L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_Default_in_defaultcase2230 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Colon_in_defaultcase2233 = new BitSet(new long[]{0x9D1001B08093A252L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_defaultcase2236 = new BitSet(new long[]{0x9D1001B08093A252L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_Function_in_functionDefinition2255 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_functionDefinition2257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parametersDefinition_in_functionDefinition2259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_bracketedBlock_in_functionDefinition2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenBrace_in_parametersDefinition2299 = new BitSet(new long[]{0x0000002001000040L});
    public static final BitSet FOLLOW_paramDef_in_parametersDefinition2302 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_Comma_in_parametersDefinition2305 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_paramDef_in_parametersDefinition2307 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_CloseBrace_in_parametersDefinition2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_paramDef2340 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Equals_in_paramDef2343 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
    public static final BitSet FOLLOW_atom_in_paramDef2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_paramName2365 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_paramName2376 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Dollar_in_paramName2378 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_commaList2409 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_Comma_in_commaList2412 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_commaList2415 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_weakLogicalOr_in_expression2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_Or_in_weakLogicalOr2459 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2481 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_Xor_in_weakLogicalXor2484 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2487 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2510 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_And_in_weakLogicalAnd2513 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2516 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_name_in_assignment2535 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_set_in_assignment2538 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_assignment_in_assignment2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternary_in_assignment2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_QuestionMark_in_ternary2575 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_ternary2577 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Colon_in_ternary2579 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_ternary2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_LogicalOr_in_logicalOr2624 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LogicalAnd_in_logicalAnd2649 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_Pipe_in_bitwiseOr2678 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2700 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_Ampersand_in_bitWiseAnd2703 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2706 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2725 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_EqualityOperator_in_equalityCheck2728 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2754 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ComparisionOperator_in_comparisionCheck2757 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2779 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ShiftOperator_in_bitWiseShift2782 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2785 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_multiplication_in_addition2808 = new BitSet(new long[]{0x0000004000000002L,0x0000000001001000L});
    public static final BitSet FOLLOW_set_in_addition2811 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_multiplication_in_addition2824 = new BitSet(new long[]{0x0000004000000002L,0x0000000001001000L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2843 = new BitSet(new long[]{0x0200000000001002L,0x0000000000400000L});
    public static final BitSet FOLLOW_set_in_multiplication2846 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2859 = new BitSet(new long[]{0x0200000000001002L,0x0000000000400000L});
    public static final BitSet FOLLOW_Bang_in_logicalNot2878 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_logicalNot_in_logicalNot2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceOf_in_logicalNot2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf2906 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_Instanceof_in_instanceOf2909 = new BitSet(new long[]{0x100000A000810240L,0x0000054820029024L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_negateOrCast2931 = new BitSet(new long[]{0x100000A000810240L,0x0000040820008024L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenBrace_in_negateOrCast2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_PrimitiveType_in_negateOrCast2954 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_negateOrCast2956 = new BitSet(new long[]{0x100000A000810240L,0x0000040820008024L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenBrace_in_negateOrCast2976 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_negateOrCast2979 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CloseBrace_in_negateOrCast2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment3007 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_name_in_increment3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_increment3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newOrClone_in_increment3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_New_in_newOrClone3064 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_newOrClone3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Clone_in_newOrClone3075 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_name_in_newOrClone3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomOrReference_in_newOrClone3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atomOrReference3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_atomOrReference3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_arrayDeclaration3128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_arrayDeclaration3130 = new BitSet(new long[]{0x100000A001812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3133 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_Comma_in_arrayDeclaration3136 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3138 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_CloseBrace_in_arrayDeclaration3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_arrayEntry3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayEntry3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_keyValuePair3194 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ArrayAssign_in_keyValuePair3196 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_keyValuePair3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleQuotedString_in_atom3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleQuotedString_in_atom3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HereDoc_in_atom3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_atom3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Real_in_atom3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Boolean_in_atom3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_atom3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_reference3262 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_nameOrFunctionCall3292 = new BitSet(new long[]{0x100000A001812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3295 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_Comma_in_nameOrFunctionCall3298 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3300 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_CloseBrace_in_nameOrFunctionCall3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticMemberAccess_in_name3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_name3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_name3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess3374 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ClassMember_in_staticMemberAccess3376 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_variable_in_staticMemberAccess3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_memberAccess3396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080008L});
    public static final BitSet FOLLOW_OpenSquareBrace_in_memberAccess3409 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_memberAccess3412 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CloseSquareBrace_in_memberAccess3414 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080008L});
    public static final BitSet FOLLOW_InstanceMember_in_memberAccess3427 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_memberAccess3430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080008L});
    public static final BitSet FOLLOW_Dollar_in_variable3453 = new BitSet(new long[]{0x0000002000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_variable_in_variable3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_variable3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_synpred3_Php890 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_BodyString_in_synpred3_Php893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_synpred4_Php901 = new BitSet(new long[]{0x9D1001B08093A250L,0x000015E9A0069064L});
    public static final BitSet FOLLOW_statement_in_synpred4_Php903 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_synpred4_Php905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketedBlock_in_synpred5_Php917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_synpred23_Php1397 = new BitSet(new long[]{0x0400000000000030L,0x0000002000000000L});
    public static final BitSet FOLLOW_Function_in_synpred23_Php1400 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_UnquotedString_in_synpred23_Php1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parametersDefinition_in_synpred23_Php1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000200040000L});
    public static final BitSet FOLLOW_bracketedBlock_in_synpred23_Php1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_synpred23_Php1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred33_Php1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred52_Php2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_synpred65_Php2459 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_weakLogicalXor_in_synpred65_Php2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_synpred66_Php2484 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_synpred66_Php2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_synpred67_Php2513 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_assignment_in_synpred67_Php2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred69_Php2535 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_set_in_synpred69_Php2538 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_assignment_in_synpred69_Php2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_synpred70_Php2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_QuestionMark_in_synpred70_Php2575 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_synpred70_Php2577 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Colon_in_synpred70_Php2579 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_synpred70_Php2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred92_Php3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IncrementOperator_in_synpred92_Php3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_synpred98_Php3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred108_Php3290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_OpenBrace_in_synpred108_Php3292 = new BitSet(new long[]{0x100000A001812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_synpred108_Php3295 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_Comma_in_synpred108_Php3298 = new BitSet(new long[]{0x100000A000812240L,0x0000054820029024L});
    public static final BitSet FOLLOW_expression_in_synpred108_Php3300 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_CloseBrace_in_synpred108_Php3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_synpred110_Php3345 = new BitSet(new long[]{0x0000000000000002L});

}