package org.xrepl.xscript.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xrepl.xscript.services.XscriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXscriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'new'", "'.'", "'*'", "'import'", "'static'", "'extension'", "'use'", "'as'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'", "'super'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalXscriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXscriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXscriptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g"; }



     	private XscriptGrammarAccess grammarAccess;
     	
        public InternalXscriptParser(TokenStream input, XscriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XScript";	
       	}
       	
       	@Override
       	protected XscriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXScript"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:67:1: entryRuleXScript returns [EObject current=null] : iv_ruleXScript= ruleXScript EOF ;
    public final EObject entryRuleXScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXScript = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:68:2: (iv_ruleXScript= ruleXScript EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:69:2: iv_ruleXScript= ruleXScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXScriptRule()); 
            }
            pushFollow(FOLLOW_ruleXScript_in_entryRuleXScript75);
            iv_ruleXScript=ruleXScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXScript85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXScript"


    // $ANTLR start "ruleXScript"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:76:1: ruleXScript returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )* ) ;
    public final EObject ruleXScript() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:79:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:80:1: ( () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:80:1: ( () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:80:2: () ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )*
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:80:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXScriptAccess().getXScriptAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:86:2: ( ( (lv_expressions_1_0= ruleXExpression ) ) | ( (lv_expressions_2_0= ruleXScriptExpression ) ) | ( (lv_expressions_3_0= ruleXVariableDeclaration ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case 11:
                case 29:
                case 32:
                case 33:
                case 37:
                case 41:
                case 43:
                case 46:
                case 48:
                case 50:
                case 54:
                case 55:
                case 56:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                case 17:
                    {
                    alt1=2;
                    }
                    break;
                case 58:
                case 59:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:86:3: ( (lv_expressions_1_0= ruleXExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:86:3: ( (lv_expressions_1_0= ruleXExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:87:1: (lv_expressions_1_0= ruleXExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:87:1: (lv_expressions_1_0= ruleXExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:88:3: lv_expressions_1_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXScriptAccess().getExpressionsXExpressionParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXScript141);
            	    lv_expressions_1_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:105:6: ( (lv_expressions_2_0= ruleXScriptExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:105:6: ( (lv_expressions_2_0= ruleXScriptExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:106:1: (lv_expressions_2_0= ruleXScriptExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:106:1: (lv_expressions_2_0= ruleXScriptExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:107:3: lv_expressions_2_0= ruleXScriptExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXScriptAccess().getExpressionsXScriptExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXScriptExpression_in_ruleXScript168);
            	    lv_expressions_2_0=ruleXScriptExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XScriptExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:124:6: ( (lv_expressions_3_0= ruleXVariableDeclaration ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:124:6: ( (lv_expressions_3_0= ruleXVariableDeclaration ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:125:1: (lv_expressions_3_0= ruleXVariableDeclaration )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:125:1: (lv_expressions_3_0= ruleXVariableDeclaration )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:126:3: lv_expressions_3_0= ruleXVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXScriptAccess().getExpressionsXVariableDeclarationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXScript195);
            	    lv_expressions_3_0=ruleXVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_3_0, 
            	              		"XVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXScript"


    // $ANTLR start "entryRuleXScriptExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:150:1: entryRuleXScriptExpression returns [EObject current=null] : iv_ruleXScriptExpression= ruleXScriptExpression EOF ;
    public final EObject entryRuleXScriptExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXScriptExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:151:2: (iv_ruleXScriptExpression= ruleXScriptExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:152:2: iv_ruleXScriptExpression= ruleXScriptExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXScriptExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXScriptExpression_in_entryRuleXScriptExpression233);
            iv_ruleXScriptExpression=ruleXScriptExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXScriptExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXScriptExpression243); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXScriptExpression"


    // $ANTLR start "ruleXScriptExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:159:1: ruleXScriptExpression returns [EObject current=null] : (this_XImport_0= ruleXImport | this_XPackageUse_1= ruleXPackageUse ) ;
    public final EObject ruleXScriptExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XImport_0 = null;

        EObject this_XPackageUse_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:162:28: ( (this_XImport_0= ruleXImport | this_XPackageUse_1= ruleXPackageUse ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:163:1: (this_XImport_0= ruleXImport | this_XPackageUse_1= ruleXPackageUse )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:163:1: (this_XImport_0= ruleXImport | this_XPackageUse_1= ruleXPackageUse )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:164:5: this_XImport_0= ruleXImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXScriptExpressionAccess().getXImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXImport_in_ruleXScriptExpression290);
                    this_XImport_0=ruleXImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XImport_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:174:5: this_XPackageUse_1= ruleXPackageUse
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXScriptExpressionAccess().getXPackageUseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXPackageUse_in_ruleXScriptExpression317);
                    this_XPackageUse_1=ruleXPackageUse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XPackageUse_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXScriptExpression"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:190:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:191:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:192:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall352);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall362); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:199:1: ruleXConstructorCall returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:202:28: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:203:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:203:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:203:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleXConstructorCall399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXConstructorCallAccess().getNewKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:207:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:208:1: (otherlv_1= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:208:1: (otherlv_1= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:209:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXConstructorCall419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getTypeEClassCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:228:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:229:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:230:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard456);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard467); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:237:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:240:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:241:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:241:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:242:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard514);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:252:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:253:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildCard546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleXImport"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:272:1: entryRuleXImport returns [EObject current=null] : iv_ruleXImport= ruleXImport EOF ;
    public final EObject entryRuleXImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImport = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:273:2: (iv_ruleXImport= ruleXImport EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:274:2: iv_ruleXImport= ruleXImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportRule()); 
            }
            pushFollow(FOLLOW_ruleXImport_in_entryRuleXImport588);
            iv_ruleXImport=ruleXImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImport598); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImport"


    // $ANTLR start "ruleXImport"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:281:1: ruleXImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleXImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:284:28: ( (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:285:1: (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:285:1: (otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:285:3: otherlv_0= 'import' ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )? ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleXImport635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:289:1: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:289:2: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )?
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:289:2: ( (lv_static_1_0= 'static' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:290:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:290:1: (lv_static_1_0= 'static' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:291:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,15,FOLLOW_15_in_ruleXImport654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getXImportAccess().getStaticStaticKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:304:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==16) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:305:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:305:1: (lv_extension_2_0= 'extension' )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:306:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,16,FOLLOW_16_in_ruleXImport685); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getXImportAccess().getExtensionExtensionKeyword_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:319:5: ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:320:1: (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:320:1: (lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:321:3: lv_importedNamespace_3_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImport722);
            lv_importedNamespace_3_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_3_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImport"


    // $ANTLR start "entryRuleXPackageUse"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:345:1: entryRuleXPackageUse returns [EObject current=null] : iv_ruleXPackageUse= ruleXPackageUse EOF ;
    public final EObject entryRuleXPackageUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPackageUse = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:346:2: (iv_ruleXPackageUse= ruleXPackageUse EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:347:2: iv_ruleXPackageUse= ruleXPackageUse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPackageUseRule()); 
            }
            pushFollow(FOLLOW_ruleXPackageUse_in_entryRuleXPackageUse758);
            iv_ruleXPackageUse=ruleXPackageUse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPackageUse; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPackageUse768); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPackageUse"


    // $ANTLR start "ruleXPackageUse"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:354:1: ruleXPackageUse returns [EObject current=null] : (otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleXPackageUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nsUri_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:357:28: ( (otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:358:1: (otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:358:1: (otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:358:3: otherlv_0= 'use' ( (lv_nsUri_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleXPackageUse805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXPackageUseAccess().getUseKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:362:1: ( (lv_nsUri_1_0= RULE_STRING ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:363:1: (lv_nsUri_1_0= RULE_STRING )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:363:1: (lv_nsUri_1_0= RULE_STRING )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:364:3: lv_nsUri_1_0= RULE_STRING
            {
            lv_nsUri_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXPackageUse822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nsUri_1_0, grammarAccess.getXPackageUseAccess().getNsUriSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXPackageUseRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nsUri",
                      		lv_nsUri_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:380:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:380:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXPackageUse840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXPackageUseAccess().getAsKeyword_2_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:384:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:385:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:385:1: (lv_name_3_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:386:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXPackageUse857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getXPackageUseAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXPackageUseRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPackageUse"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:410:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:411:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:412:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression900);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:419:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:422:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:424:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression956);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:440:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:441:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:442:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment990);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1000); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:449:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:452:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:453:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:453:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=RULE_ID && LA8_1<=RULE_INT)||(LA8_1>=11 && LA8_1<=14)||(LA8_1>=17 && LA8_1<=18)||(LA8_1>=20 && LA8_1<=43)||(LA8_1>=45 && LA8_1<=69)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==19) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)||LA8_0==11||LA8_0==29||(LA8_0>=32 && LA8_0<=33)||LA8_0==37||LA8_0==41||LA8_0==43||LA8_0==46||LA8_0==48||LA8_0==50||(LA8_0>=54 && LA8_0<=56)||(LA8_0>=60 && LA8_0<=66)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:453:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:453:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:453:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:453:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:454:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:459:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:460:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:460:1: (otherlv_1= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:461:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment1055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1071);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:480:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:481:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:481:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:482:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1091);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:499:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:499:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:500:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1121);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        int LA7_1 = input.LA(2);

                        if ( (synpred1_InternalXscript()) ) {
                            alt7=1;
                        }
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:513:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:513:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:513:7: ()
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:514:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:519:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:520:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:520:1: ( ruleOpMultiAssign )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:521:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1174);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:534:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:535:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:535:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:536:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1197);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:560:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:561:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:562:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1237);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1248); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:569:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:572:28: (kw= '=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:574:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:587:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:588:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:589:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1325);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1336); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:596:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:599:28: (kw= '+=' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:601:2: kw= '+='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMultiAssign1373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:614:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:615:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:616:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1412);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:623:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:626:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:627:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:627:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:628:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1469);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred2_InternalXscript()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:641:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:641:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:641:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:642:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:647:2: ( ( ruleOpOr ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:648:1: ( ruleOpOr )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:648:1: ( ruleOpOr )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:649:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1522);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:662:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:663:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:663:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:664:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1545);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:688:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:689:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:690:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1584);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1595); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:697:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:700:28: (kw= '||' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:702:2: kw= '||'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpOr1632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:715:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:716:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:717:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1671);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:724:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:727:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:728:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:728:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:729:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1728);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred3_InternalXscript()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:742:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:742:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:742:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:743:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:748:2: ( ( ruleOpAnd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:749:1: ( ruleOpAnd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:749:1: ( ruleOpAnd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:750:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1781);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:763:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:764:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:764:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:765:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1804);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:789:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:790:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:791:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1843);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1854); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:798:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:801:28: (kw= '&&' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:803:2: kw= '&&'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpAnd1891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:816:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:817:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:818:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1930);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1940); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:825:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:828:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:829:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:829:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:830:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1987);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred4_InternalXscript()) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==24) ) {
                    int LA11_3 = input.LA(2);

                    if ( (synpred4_InternalXscript()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:843:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:843:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:843:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:844:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:849:2: ( ( ruleOpEquality ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:850:1: ( ruleOpEquality )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:850:1: ( ruleOpEquality )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:851:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2040);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:864:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:865:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:865:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:866:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2063);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:890:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:891:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:892:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2102);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2113); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:899:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:902:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:903:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:903:1: (kw= '==' | kw= '!=' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:904:2: kw= '=='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality2151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:911:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:924:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:925:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:926:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2210);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2220); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:933:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:936:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:937:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:937:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:938:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2267);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop13:
            do {
                int alt13=3;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred5_InternalXscript()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA13_6 = input.LA(2);

                    if ( (synpred6_InternalXscript()) ) {
                        alt13=2;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:948:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:948:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:948:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:949:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXRelationalExpression2303); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:958:3: ( ( ruleQualifiedName ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:959:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:959:1: ( ruleQualifiedName )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:960:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2328);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:979:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:979:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:979:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:980:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:985:2: ( ( ruleOpCompare ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:986:1: ( ruleOpCompare )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:986:1: ( ruleOpCompare )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:987:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2389);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1000:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1001:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1001:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1002:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2412);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1026:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1027:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1028:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2452);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2463); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1035:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1038:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1039:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1039:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1040:2: kw= '>='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1047:2: kw= '<='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1054:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1061:2: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1074:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1075:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1076:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2598);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2608); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1083:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1086:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1087:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1087:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1088:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2655);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred7_InternalXscript()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==31) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred7_InternalXscript()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1101:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1101:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1101:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1102:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1107:2: ( ( ruleOpOther ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:1: ( ruleOpOther )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1108:1: ( ruleOpOther )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1109:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2708);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1122:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1123:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1123:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1124:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2731);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1148:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1149:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1150:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2770);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2781); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1157:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1160:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1161:1: (kw= '->' | kw= '..' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1161:1: (kw= '->' | kw= '..' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1162:2: kw= '->'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1169:2: kw= '..'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1182:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1183:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1184:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2878);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2888); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1191:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1194:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1195:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1195:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1196:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2935);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred8_InternalXscript()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==32) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred8_InternalXscript()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1209:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1209:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1209:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1210:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1215:2: ( ( ruleOpAdd ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1216:1: ( ruleOpAdd )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1216:1: ( ruleOpAdd )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1217:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2988);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1230:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1231:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1231:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1232:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3011);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1256:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1257:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1258:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3050);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3061); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1265:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1268:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1269:1: (kw= '+' | kw= '-' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1269:1: (kw= '+' | kw= '-' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1270:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd3099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1277:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1290:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1291:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1292:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3158);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3168); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1299:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1302:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1303:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1303:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1304:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3215);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred9_InternalXscript()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1317:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1317:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1317:7: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1318:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1323:2: ( ( ruleOpMulti ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1324:1: ( ruleOpMulti )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1324:1: ( ruleOpMulti )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1325:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3268);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1338:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1339:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1339:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1340:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3291);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1364:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1365:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1366:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3330);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3341); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1373:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1376:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1377:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1377:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 35:
                {
                alt20=3;
                }
                break;
            case 36:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1378:2: kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleOpMulti3379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1385:2: kw= '**'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1392:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1399:2: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1412:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1413:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1414:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3476);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3486); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1421:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1424:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1425:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1425:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=32 && LA21_0<=33)||LA21_0==37) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==11||LA21_0==29||LA21_0==41||LA21_0==43||LA21_0==46||LA21_0==48||LA21_0==50||(LA21_0>=54 && LA21_0<=56)||(LA21_0>=60 && LA21_0<=66)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1425:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1425:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1425:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1425:3: ()
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1426:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1431:2: ( ( ruleOpUnary ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1432:1: ( ruleOpUnary )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1432:1: ( ruleOpUnary )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1433:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3544);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1446:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1447:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1447:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1448:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3565);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1466:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3594);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1482:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1483:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1484:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3630);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3641); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1491:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1494:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1495:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1495:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt22=1;
                }
                break;
            case 33:
                {
                alt22=2;
                }
                break;
            case 32:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1496:2: kw= '!'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary3679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1503:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1510:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1523:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1524:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1525:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3757);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3767); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1532:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1535:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1536:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1536:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1537:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3814);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred10_InternalXscript()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1547:5: ( () otherlv_2= 'as' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1547:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1547:6: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1548:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXCastedExpression3849); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1557:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1558:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1558:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1559:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3872);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1583:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1584:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1585:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3910);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3920); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1592:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1595:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1596:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1596:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1597:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3967);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop30:
            do {
                int alt30=3;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred11_InternalXscript()) ) {
                        alt30=1;
                    }
                    else if ( (synpred12_InternalXscript()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred12_InternalXscript()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred12_InternalXscript()) ) {
                        alt30=2;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1612:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1612:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1612:26: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1613:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleXMemberFeatureCall4016); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1622:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1623:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1623:1: (otherlv_3= RULE_ID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1624:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4036); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4052);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1643:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1644:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1644:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1645:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4074);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1678:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1678:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1678:8: ()
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1679:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1684:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1684:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleXMemberFeatureCall4160); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1689:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1689:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1690:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1690:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1691:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4184); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1705:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1706:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1706:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1707:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4221); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1720:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==29) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1720:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4250); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1724:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1725:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1725:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1726:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4271);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1742:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==40) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1742:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4284); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1746:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1747:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1747:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1748:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4305);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop25;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4319); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1768:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1769:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1769:1: (otherlv_15= RULE_ID )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1770:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4341); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1781:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1781:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1781:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1781:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1788:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1789:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4375); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt28=3;
            	            alt28 = dfa28.predict(input);
            	            switch (alt28) {
            	                case 1 :
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1814:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1815:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4450);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1832:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1832:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1832:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1832:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1833:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1833:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1834:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4478);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1850:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop27:
            	                    do {
            	                        int alt27=2;
            	                        int LA27_0 = input.LA(1);

            	                        if ( (LA27_0==40) ) {
            	                            alt27=1;
            	                        }


            	                        switch (alt27) {
            	                    	case 1 :
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1850:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4491); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1854:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1855:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1855:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1856:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4512);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop27;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4529); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1884:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1885:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1886:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4570);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4580); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1893:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1896:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1897:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1897:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt31=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt31=1;
                }
                break;
            case 50:
                {
                alt31=2;
                }
                break;
            case 48:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
            case 29:
                {
                alt31=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 43:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt31=5;
                }
                break;
            case 46:
                {
                alt31=6;
                }
                break;
            case 54:
                {
                alt31=7;
                }
                break;
            case 55:
                {
                alt31=8;
                }
                break;
            case 56:
                {
                alt31=9;
                }
                break;
            case 64:
                {
                alt31=10;
                }
                break;
            case 65:
                {
                alt31=11;
                }
                break;
            case 66:
                {
                alt31=12;
                }
                break;
            case 41:
                {
                alt31=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1898:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4627);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1908:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4654);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1918:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4681);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1928:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4708);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1938:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4735);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1948:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4762);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1958:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4789);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1968:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4816);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1978:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4843);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1988:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4870);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1998:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4897);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2008:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4924);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2018:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4951);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2034:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2035:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2036:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4986);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4996); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2043:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2046:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2047:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2047:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt32=1;
                }
                break;
            case 60:
            case 61:
                {
                alt32=2;
                }
                break;
            case RULE_INT:
                {
                alt32=3;
                }
                break;
            case 62:
                {
                alt32=4;
                }
                break;
            case RULE_STRING:
                {
                alt32=5;
                }
                break;
            case 63:
                {
                alt32=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2048:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5043);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2058:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5070);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2068:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5097);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2078:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5124);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2088:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5151);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2098:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5178);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2114:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2115:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2116:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5213);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5223); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2123:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2126:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2127:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2127:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2127:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2127:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2128:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2137:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==41||LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2137:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2137:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2138:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2138:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2139:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5291);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2155:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==40) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2155:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleXClosure5304); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2159:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2160:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2160:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2161:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5325);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2181:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2182:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2182:1: (lv_expression_6_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2183:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5362);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2211:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2212:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2213:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5410);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5420); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2220:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2223:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2224:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2224:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2224:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2224:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2224:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2235:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2235:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2235:6: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2236:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2241:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==41||LA36_0==69) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2241:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2241:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2242:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2242:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2243:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5518);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2259:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==40) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2259:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXShortClosure5531); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2263:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2264:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2264:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2265:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5552);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXShortClosure5568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2285:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2286:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2286:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2287:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5591);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2311:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2312:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2313:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5627);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5637); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2320:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2323:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2324:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2324:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2324:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5696);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression5707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2349:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2350:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2351:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5743);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5753); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2358:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2361:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2362:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2362:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2362:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2362:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2363:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2376:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2377:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2377:1: (lv_if_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2378:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5832);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression5844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2398:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2399:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2399:1: (lv_then_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2400:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5865);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2416:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred16_InternalXscript()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2416:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2416:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2416:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression5886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2421:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2422:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2422:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2423:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5908);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2447:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2448:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2449:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5946);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5956); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2456:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_localVarName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2459:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2460:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2460:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2460:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2460:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2461:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2470:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==49) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2470:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2470:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2471:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2471:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2472:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression6020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_localVarName_2_0, grammarAccess.getXSwitchExpressionAccess().getLocalVarNameIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2492:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2493:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2493:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2494:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6060);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2514:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==41||LA39_0==49||LA39_0==53||LA39_0==69) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2515:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2515:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2516:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6093);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2532:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2532:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2540:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2541:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2541:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2542:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6140);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2570:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2571:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2572:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6190);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2579:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2582:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2583:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2583:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2583:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2583:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==41||LA41_0==69) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2584:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2584:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2585:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6246);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2601:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2601:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXCasePart6260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2605:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2606:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2606:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2607:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6281);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXCasePart6295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2627:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2628:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2628:1: (lv_then_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2629:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6316);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2653:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2654:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2655:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6352);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6362); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2662:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2665:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2666:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2666:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2666:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2666:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2667:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression6408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2680:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2681:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2681:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2682:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6441);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression6453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2702:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2703:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2703:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2704:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6474);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleXForLoopExpression6486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2724:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2725:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2725:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2726:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6507);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2750:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2751:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2752:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6543);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6553); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2759:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2762:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2763:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2763:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2763:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2763:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2764:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXWhileExpression6599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2777:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2778:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2778:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2779:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6632);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression6644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2799:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2800:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2800:1: (lv_body_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2801:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6665);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2825:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2826:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2827:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6701);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6711); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2834:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2837:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2838:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2838:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2838:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2838:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2839:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXDoWhileExpression6757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2848:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2849:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2849:1: (lv_body_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2850:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6778);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2874:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2875:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2875:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2876:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6823);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,42,FOLLOW_42_in_ruleXDoWhileExpression6835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2904:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2905:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2906:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6871);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6881); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2913:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2916:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2917:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2917:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2917:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2917:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2918:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression6927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2927:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_INT)||LA44_0==11||LA44_0==29||(LA44_0>=32 && LA44_0<=33)||LA44_0==37||LA44_0==41||LA44_0==43||LA44_0==46||LA44_0==48||LA44_0==50||(LA44_0>=54 && LA44_0<=56)||(LA44_0>=58 && LA44_0<=66)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2927:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2927:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2928:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2928:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2929:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6949);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2945:2: (otherlv_3= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==57) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2945:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXBlockExpression6962); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression6978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2961:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2962:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2963:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7014);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7024); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2970:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2973:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2974:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2974:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=58 && LA45_0<=59)) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||LA45_0==11||LA45_0==29||(LA45_0>=32 && LA45_0<=33)||LA45_0==37||LA45_0==41||LA45_0==43||LA45_0==46||LA45_0==48||LA45_0==50||(LA45_0>=54 && LA45_0<=56)||(LA45_0>=60 && LA45_0<=66)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2975:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7071);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2985:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7098);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3001:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3002:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3003:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7133);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7143); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3010:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3013:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3014:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3014:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3014:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3014:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3020:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            else if ( (LA46_0==59) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3020:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3020:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3021:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3021:1: (lv_writeable_1_0= 'var' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3022:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3036:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred17_InternalXscript()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==41) && (synpred17_InternalXscript())) {
                alt47=1;
            }
            else if ( (LA47_0==69) && (synpred17_InternalXscript())) {
                alt47=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3049:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3049:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3049:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3050:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3051:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7276);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3067:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3068:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3068:1: (lv_name_4_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3069:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration7293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_4_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3086:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3086:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3087:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3087:1: (lv_name_5_0= RULE_ID )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3088:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration7323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3104:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3104:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration7342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3108:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3109:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3109:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3110:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7363);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3134:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3135:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3136:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7401);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7411); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3143:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3146:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3147:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3147:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3147:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3147:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_ID||LA49_1==12||LA49_1==29) ) {
                    alt49=1;
                }
            }
            else if ( (LA49_0==41||LA49_0==69) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3148:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3148:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3149:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7457);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3165:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3166:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3166:1: (lv_name_1_0= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3167:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter7475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getJvmFormalParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3191:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3192:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3193:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7516);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7526); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3200:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_7_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_typeArguments_2_0 = null;

        EObject lv_typeArguments_4_0 = null;

        EObject lv_featureCallArguments_8_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3203:28: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3204:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3204:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3204:2: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( (otherlv_6= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3204:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3205:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3210:2: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==29) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3210:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall7573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3214:1: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3215:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3215:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3216:3: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7594);
                    lv_typeArguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3232:2: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==40) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3232:4: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7607); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3236:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3237:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3237:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3238:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7628);
                    	    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3258:3: ( (otherlv_6= RULE_ID ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3259:1: (otherlv_6= RULE_ID )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3259:1: (otherlv_6= RULE_ID )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3260:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXFeatureCall7664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3271:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3271:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3271:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3271:4: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3278:1: (lv_explicitOperationCall_7_0= '(' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3279:3: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_7_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt53=3;
                    alt53 = dfa53.predict(input);
                    switch (alt53) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3304:1: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3305:3: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7773);
                            lv_featureCallArguments_8_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_8_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3322:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3322:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3322:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3322:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3323:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3324:3: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7801);
                            lv_featureCallArguments_9_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3340:2: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==40) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3340:4: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7814); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3344:1: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3345:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3345:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3346:3: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7835);
                            	    lv_featureCallArguments_11_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_11_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall7852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3374:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3375:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3376:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral7890);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral7900); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3383:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3386:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3387:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3387:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3387:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3387:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3388:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3393:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==60) ) {
                alt55=1;
            }
            else if ( (LA55_0==61) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3393:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXBooleanLiteral7947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3398:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3398:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3399:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3399:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3400:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,61,FOLLOW_61_in_ruleXBooleanLiteral7971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3421:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3422:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3423:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8021);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8031); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3430:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3433:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3434:1: ( () otherlv_1= 'null' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3434:1: ( () otherlv_1= 'null' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3434:2: () otherlv_1= 'null'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3434:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3435:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXNullLiteral8077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3452:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3453:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3454:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8113);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8123); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3461:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3464:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3465:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3465:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3465:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3465:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3466:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3471:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3472:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3472:1: (lv_value_1_0= RULE_INT )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3473:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3497:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3498:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3499:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8215);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3506:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3509:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3510:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3510:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3510:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3510:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3511:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3516:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3517:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3517:1: (lv_value_1_0= RULE_STRING )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3518:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3542:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3543:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3544:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8317);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8327); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3551:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3554:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3555:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3555:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3555:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3555:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3556:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXTypeLiteral8373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral8385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3569:1: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3570:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3570:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3571:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8408);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXTypeLiteral8420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3596:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3597:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3598:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8456);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8466); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3605:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3608:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3609:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3609:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3609:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3609:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3610:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXThrowExpression8512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3619:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3620:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3620:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3621:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression8533);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3645:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3646:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3647:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression8569);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression8579); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3654:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3657:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3658:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3658:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3658:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3658:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXReturnExpression8625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3668:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3668:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3673:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3674:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression8656);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3698:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3699:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3700:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression8693);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression8703); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3707:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3710:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3711:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3711:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3711:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3711:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3712:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXTryCatchFinallyExpression8749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3721:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3722:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3722:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3723:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8770);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==68) ) {
                alt59=1;
            }
            else if ( (LA59_0==67) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==68) ) {
                            int LA57_2 = input.LA(2);

                            if ( (synpred21_InternalXscript()) ) {
                                alt57=1;
                            }


                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3741:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3742:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression8800);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3758:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==67) ) {
                        int LA58_1 = input.LA(2);

                        if ( (synpred22_InternalXscript()) ) {
                            alt58=1;
                        }
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3758:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3758:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3758:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression8822); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3763:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3764:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3764:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3765:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8844);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3782:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3782:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3782:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression8866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3786:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3787:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3788:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8887);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3812:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3813:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3814:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause8925);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause8935); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3821:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3824:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3825:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3825:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3825:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3825:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3825:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleXCatchClause8980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause8993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3834:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3835:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3835:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3836:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9014);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXCatchClause9026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3856:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3857:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3857:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3858:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9047);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3882:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3883:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3884:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9084);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9095); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3891:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3894:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3895:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3895:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3895:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3902:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==12) ) {
                    int LA60_1 = input.LA(2);

                    if ( (LA60_1==RULE_ID) ) {
                        int LA60_3 = input.LA(3);

                        if ( (synpred24_InternalXscript()) ) {
                            alt60=1;
                        }


                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3902:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3902:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3902:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName9163); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3925:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3926:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3927:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9226);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9236); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3934:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3937:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3938:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3938:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==41||LA61_0==69) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3939:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9283);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3949:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9310);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3965:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3966:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3967:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9345);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9355); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3974:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3977:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3978:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3978:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3978:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3978:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==41) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3978:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef9393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3982:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3983:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3983:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3984:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9414);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4000:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==40) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4000:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef9427); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4004:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4005:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4005:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4006:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9448);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef9462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleXFunctionTypeRef9476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4030:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4031:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4031:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4032:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9497);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4056:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4057:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4058:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9533);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9543); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4065:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4068:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4069:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4069:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4069:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4069:2: ( ( ruleQualifiedName ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4070:1: ( ruleQualifiedName )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4070:1: ( ruleQualifiedName )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4071:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9591);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference9612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4089:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4090:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4090:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4091:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9634);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4107:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==40) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4107:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleJvmParameterizedTypeReference9647); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4111:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4112:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4112:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4113:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9668);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference9682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4141:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4142:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4143:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference9720);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference9730); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4150:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4153:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4154:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4154:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID||LA66_0==41||LA66_0==69) ) {
                alt66=1;
            }
            else if ( (LA66_0==70) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4155:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference9777);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4165:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference9804);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4181:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4182:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4183:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference9839);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference9849); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4190:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4193:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4194:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4194:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4194:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4194:2: ()
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4195:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleJvmWildcardTypeReference9895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4204:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==71) ) {
                alt67=1;
            }
            else if ( (LA67_0==73) ) {
                alt67=2;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4204:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4204:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4205:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4205:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4206:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference9917);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4223:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4223:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4224:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4224:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4225:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference9944);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4249:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4250:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4251:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound9982);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound9992); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4258:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4261:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4262:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4262:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4262:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleJvmUpperBound10029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4266:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4267:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4267:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4268:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10050);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4292:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4293:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4294:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10086);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10096); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4301:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4304:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4305:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4305:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4305:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleJvmUpperBoundAnded10133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4309:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4310:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4310:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4311:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10154);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4335:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4336:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4337:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10190);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4344:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4347:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4348:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4348:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4348:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmLowerBound10237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4352:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4353:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4353:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4354:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10258);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"

    // $ANTLR start synpred1_InternalXscript
    public final void synpred1_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:508:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:509:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:509:2: ( ( ruleOpMultiAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:510:1: ( ruleOpMultiAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:510:1: ( ruleOpMultiAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:511:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript1142);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalXscript

    // $ANTLR start synpred2_InternalXscript
    public final void synpred2_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:5: () ( ( ruleOpOr ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:636:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:637:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:637:2: ( ( ruleOpOr ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:638:1: ( ruleOpOr )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:638:1: ( ruleOpOr )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:639:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalXscript1490);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalXscript

    // $ANTLR start synpred3_InternalXscript
    public final void synpred3_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:737:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:738:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:738:2: ( ( ruleOpAnd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:739:1: ( ruleOpAnd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:739:1: ( ruleOpAnd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:740:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalXscript1749);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalXscript

    // $ANTLR start synpred4_InternalXscript
    public final void synpred4_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:838:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:839:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:839:2: ( ( ruleOpEquality ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:840:1: ( ruleOpEquality )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:840:1: ( ruleOpEquality )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:841:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalXscript2008);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalXscript

    // $ANTLR start synpred5_InternalXscript
    public final void synpred5_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:4: ( ( () 'instanceof' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:5: ( () 'instanceof' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:5: ( () 'instanceof' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:6: () 'instanceof'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:946:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:947:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred5_InternalXscript2284); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalXscript

    // $ANTLR start synpred6_InternalXscript
    public final void synpred6_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:974:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:975:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:975:2: ( ( ruleOpCompare ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:976:1: ( ruleOpCompare )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:976:1: ( ruleOpCompare )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:977:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2357);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalXscript

    // $ANTLR start synpred7_InternalXscript
    public final void synpred7_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:5: () ( ( ruleOpOther ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1096:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1097:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1097:2: ( ( ruleOpOther ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1098:1: ( ruleOpOther )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1098:1: ( ruleOpOther )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1099:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalXscript2676);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalXscript

    // $ANTLR start synpred8_InternalXscript
    public final void synpred8_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1204:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1205:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1205:2: ( ( ruleOpAdd ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1206:1: ( ruleOpAdd )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1206:1: ( ruleOpAdd )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1207:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalXscript2956);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalXscript

    // $ANTLR start synpred9_InternalXscript
    public final void synpred9_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1312:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1313:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1313:2: ( ( ruleOpMulti ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1314:1: ( ruleOpMulti )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1314:1: ( ruleOpMulti )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1315:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalXscript3236);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalXscript

    // $ANTLR start synpred10_InternalXscript
    public final void synpred10_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:3: ( ( () 'as' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:4: ( () 'as' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:4: ( () 'as' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:5: () 'as'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1545:5: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1546:1: 
        {
        }

        match(input,18,FOLLOW_18_in_synpred10_InternalXscript3830); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalXscript

    // $ANTLR start synpred11_InternalXscript
    public final void synpred11_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1605:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1606:1: 
        {
        }

        match(input,12,FOLLOW_12_in_synpred11_InternalXscript3984); if (state.failed) return ;
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1607:1: ( ( RULE_ID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1608:1: ( RULE_ID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1608:1: ( RULE_ID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1609:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred11_InternalXscript3992); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript3999);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalXscript

    // $ANTLR start synpred12_InternalXscript
    public final void synpred12_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1662:10: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1663:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1663:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt68=3;
        switch ( input.LA(1) ) {
        case 12:
            {
            alt68=1;
            }
            break;
        case 38:
            {
            alt68=2;
            }
            break;
        case 39:
            {
            alt68=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 68, 0, input);

            throw nvae;
        }

        switch (alt68) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1663:4: '.'
                {
                match(input,12,FOLLOW_12_in_synpred12_InternalXscript4099); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1665:6: ( ( '?.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1665:6: ( ( '?.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1666:1: ( '?.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1666:1: ( '?.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1667:2: '?.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalXscript4113); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1672:6: ( ( '*.' ) )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1672:6: ( ( '*.' ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1673:1: ( '*.' )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1673:1: ( '*.' )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1674:2: '*.'
                {
                match(input,39,FOLLOW_39_in_synpred12_InternalXscript4133); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalXscript

    // $ANTLR start synpred13_InternalXscript
    public final void synpred13_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1781:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1782:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1782:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1783:2: '('
        {
        match(input,41,FOLLOW_41_in_synpred13_InternalXscript4357); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalXscript

    // $ANTLR start synpred14_InternalXscript
    public final void synpred14_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1802:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1803:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1803:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( (LA70_0==RULE_ID||LA70_0==41||LA70_0==69) ) {
            alt70=1;
        }
        switch (alt70) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1803:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1803:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1804:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1804:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1805:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4409);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1807:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==40) ) {
                        alt69=1;
                    }


                    switch (alt69) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1807:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,40,FOLLOW_40_in_synpred14_InternalXscript4416); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1808:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1809:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1809:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:1810:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4423);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);


                }
                break;

        }

        match(input,44,FOLLOW_44_in_synpred14_InternalXscript4433); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalXscript

    // $ANTLR start synpred16_InternalXscript
    public final void synpred16_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2416:4: ( 'else' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:2416:6: 'else'
        {
        match(input,47,FOLLOW_47_in_synpred16_InternalXscript5878); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalXscript

    // $ANTLR start synpred17_InternalXscript
    public final void synpred17_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:6: ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3040:6: ( ( ruleJvmTypeReference ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3041:1: ( ruleJvmTypeReference )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3041:1: ( ruleJvmTypeReference )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3042:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXscript7245);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3044:2: ( ( RULE_ID ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3045:1: ( RULE_ID )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3045:1: ( RULE_ID )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3046:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred17_InternalXscript7254); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalXscript

    // $ANTLR start synpred18_InternalXscript
    public final void synpred18_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3271:4: ( ( '(' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3272:1: ( '(' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3272:1: ( '(' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3273:2: '('
        {
        match(input,41,FOLLOW_41_in_synpred18_InternalXscript7680); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalXscript

    // $ANTLR start synpred19_InternalXscript
    public final void synpred19_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3292:6: ()
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3293:1: 
        {
        }

        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3293:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==RULE_ID||LA74_0==41||LA74_0==69) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3293:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3293:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3294:1: ( ruleJvmFormalParameter )
                {
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3294:1: ( ruleJvmFormalParameter )
                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3295:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7732);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3297:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==40) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3297:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,40,FOLLOW_40_in_synpred19_InternalXscript7739); if (state.failed) return ;
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3298:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3299:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3299:1: ( ruleJvmFormalParameter )
                	    // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3300:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7746);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop73;
                    }
                } while (true);


                }
                break;

        }

        match(input,44,FOLLOW_44_in_synpred19_InternalXscript7756); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalXscript

    // $ANTLR start synpred20_InternalXscript
    public final void synpred20_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3668:2: ( ( ruleXExpression ) )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3669:1: ( ruleXExpression )
        {
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3669:1: ( ruleXExpression )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3670:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred20_InternalXscript8639);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalXscript

    // $ANTLR start synpred21_InternalXscript
    public final void synpred21_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:5: ( 'catch' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3739:7: 'catch'
        {
        match(input,68,FOLLOW_68_in_synpred21_InternalXscript8784); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalXscript

    // $ANTLR start synpred22_InternalXscript
    public final void synpred22_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3758:5: ( 'finally' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3758:7: 'finally'
        {
        match(input,67,FOLLOW_67_in_synpred22_InternalXscript8814); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalXscript

    // $ANTLR start synpred24_InternalXscript
    public final void synpred24_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3902:3: ( '.' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:3903:2: '.'
        {
        match(input,12,FOLLOW_12_in_synpred24_InternalXscript9154); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalXscript

    // $ANTLR start synpred25_InternalXscript
    public final void synpred25_InternalXscript_fragment() throws RecognitionException {   
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:4: ( '<' )
        // ../org.xrepl.xscript/src-gen/org/xrepl/xscript/parser/antlr/internal/InternalXscript.g:4084:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred25_InternalXscript9604); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalXscript

    // Delegated rules

    public final boolean synpred5_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalXscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalXscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA29_eotS =
        "\75\uffff";
    static final String DFA29_eofS =
        "\1\2\74\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA29_maxS =
        "\1\105\1\0\73\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\2\2\1\uffff\25\2\1\1\2\2\1\uffff\31"+
            "\2",
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
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1781:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\33\uffff";
    static final String DFA28_eofS =
        "\33\uffff";
    static final String DFA28_minS =
        "\1\4\2\0\30\uffff";
    static final String DFA28_maxS =
        "\1\105\2\0\30\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\2\1\1\2\24\uffff\1\3";
    static final String DFA28_specialS =
        "\1\0\1\1\1\2\30\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\2\5\4\uffff\1\5\21\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3"+
            "\uffff\1\2\1\32\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\3\uffff\7\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1802:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==RULE_ID) ) {s = 1;}

                        else if ( (LA28_0==41) ) {s = 2;}

                        else if ( (LA28_0==69) && (synpred14_InternalXscript())) {s = 3;}

                        else if ( (LA28_0==44) && (synpred14_InternalXscript())) {s = 4;}

                        else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_INT)||LA28_0==11||LA28_0==29||(LA28_0>=32 && LA28_0<=33)||LA28_0==37||LA28_0==43||LA28_0==46||LA28_0==48||LA28_0==50||(LA28_0>=54 && LA28_0<=56)||(LA28_0>=60 && LA28_0<=66)) ) {s = 5;}

                        else if ( (LA28_0==42) ) {s = 26;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\75\uffff";
    static final String DFA54_eofS =
        "\1\2\74\uffff";
    static final String DFA54_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA54_maxS =
        "\1\105\1\0\73\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA54_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA54_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\2\2\1\uffff\25\2\1\1\2\2\1\uffff\31"+
            "\2",
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
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3271:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\33\uffff";
    static final String DFA53_eofS =
        "\33\uffff";
    static final String DFA53_minS =
        "\1\4\2\0\30\uffff";
    static final String DFA53_maxS =
        "\1\105\2\0\30\uffff";
    static final String DFA53_acceptS =
        "\3\uffff\2\1\1\2\24\uffff\1\3";
    static final String DFA53_specialS =
        "\1\0\1\1\1\2\30\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\2\5\4\uffff\1\5\21\uffff\1\5\2\uffff\2\5\3\uffff\1\5\3"+
            "\uffff\1\2\1\32\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\3\uffff\7\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3292:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==RULE_ID) ) {s = 1;}

                        else if ( (LA53_0==41) ) {s = 2;}

                        else if ( (LA53_0==69) && (synpred19_InternalXscript())) {s = 3;}

                        else if ( (LA53_0==44) && (synpred19_InternalXscript())) {s = 4;}

                        else if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_INT)||LA53_0==11||LA53_0==29||(LA53_0>=32 && LA53_0<=33)||LA53_0==37||LA53_0==43||LA53_0==46||LA53_0==48||LA53_0==50||(LA53_0>=54 && LA53_0<=56)||(LA53_0>=60 && LA53_0<=66)) ) {s = 5;}

                        else if ( (LA53_0==42) ) {s = 26;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalXscript()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\75\uffff";
    static final String DFA56_eofS =
        "\1\30\74\uffff";
    static final String DFA56_minS =
        "\1\4\27\0\45\uffff";
    static final String DFA56_maxS =
        "\1\105\27\0\45\uffff";
    static final String DFA56_acceptS =
        "\30\uffff\1\2\43\uffff\1\1";
    static final String DFA56_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\45\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\1\16\1\14\4\uffff\1\5\3\30\2\uffff\2\30\1\uffff\11\30\1"+
            "\10\2\30\1\4\1\3\3\30\1\2\3\30\1\27\1\30\1\11\1\uffff\1\30\1"+
            "\20\1\30\1\7\1\30\1\6\3\30\1\21\1\22\1\23\3\30\1\12\1\13\1\15"+
            "\1\17\1\24\1\25\1\26\3\30",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3668:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA56_9 = input.LA(1);

                         
                        int index56_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA56_10 = input.LA(1);

                         
                        int index56_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA56_11 = input.LA(1);

                         
                        int index56_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA56_12 = input.LA(1);

                         
                        int index56_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA56_13 = input.LA(1);

                         
                        int index56_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA56_14 = input.LA(1);

                         
                        int index56_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA56_15 = input.LA(1);

                         
                        int index56_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA56_16 = input.LA(1);

                         
                        int index56_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA56_17 = input.LA(1);

                         
                        int index56_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA56_18 = input.LA(1);

                         
                        int index56_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA56_19 = input.LA(1);

                         
                        int index56_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA56_20 = input.LA(1);

                         
                        int index56_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA56_21 = input.LA(1);

                         
                        int index56_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA56_22 = input.LA(1);

                         
                        int index56_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA56_23 = input.LA(1);

                         
                        int index56_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index56_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\75\uffff";
    static final String DFA65_eofS =
        "\1\2\74\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA65_maxS =
        "\1\105\1\0\73\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA65_transitionS = {
            "\3\2\4\uffff\4\2\2\uffff\2\2\1\uffff\11\2\1\1\16\2\1\uffff\31"+
            "\2",
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
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "4084:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalXscript()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXScript_in_entryRuleXScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXScript141 = new BitSet(new long[]{0xFDC54A2320024872L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_ruleXScript168 = new BitSet(new long[]{0xFDC54A2320024872L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXScript195 = new BitSet(new long[]{0xFDC54A2320024872L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXScriptExpression_in_entryRuleXScriptExpression233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXScriptExpression243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImport_in_ruleXScriptExpression290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPackageUse_in_ruleXScriptExpression317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXConstructorCall399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXConstructorCall419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard514 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard533 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildCard546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImport_in_entryRuleXImport588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImport598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleXImport635 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleXImport654 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_16_in_ruleXImport685 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImport722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPackageUse_in_entryRuleXPackageUse758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPackageUse768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXPackageUse805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXPackageUse822 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXPackageUse840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXPackageUse857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment1055 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1071 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1121 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1174 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMultiAssign1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1469 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1522 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1545 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpOr1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1728 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1781 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1804 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpAnd1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1987 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2040 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2063 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2267 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_25_in_ruleXRelationalExpression2303 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2328 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2389 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2412 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2655 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2708 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2731 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2935 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2988 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3011 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3215 = new BitSet(new long[]{0x0000001C00002002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3268 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3291 = new BitSet(new long[]{0x0000001C00002002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOpMulti3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3544 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3814 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXCastedExpression3849 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3872 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3967 = new BitSet(new long[]{0x000000C000001002L});
    public static final BitSet FOLLOW_12_in_ruleXMemberFeatureCall4016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4036 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4052 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4074 = new BitSet(new long[]{0x000000C000001002L});
    public static final BitSet FOLLOW_12_in_ruleXMemberFeatureCall4160 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4184 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4221 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4250 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4271 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4284 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4305 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4341 = new BitSet(new long[]{0x000002C000001002L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4375 = new BitSet(new long[]{0xF1C55E2320008870L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4450 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4478 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4491 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4512 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4529 = new BitSet(new long[]{0x000000C000001002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5269 = new BitSet(new long[]{0x0000120000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5291 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_ruleXClosure5304 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5325 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5341 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5362 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5518 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_ruleXShortClosure5531 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5552 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_ruleXShortClosure5568 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5674 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5696 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5799 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5811 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5832 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression5844 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5865 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression5886 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6002 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression6020 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6037 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6060 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6072 = new BitSet(new long[]{0x0022020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6093 = new BitSet(new long[]{0x003A020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6107 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6119 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6140 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6246 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCasePart6260 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6281 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCasePart6295 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression6408 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6420 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6441 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression6453 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6474 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXForLoopExpression6486 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXWhileExpression6599 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6611 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6632 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression6644 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXDoWhileExpression6757 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6778 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6790 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6802 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6823 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXDoWhileExpression6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression6927 = new BitSet(new long[]{0xFDD54A2320024870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6949 = new BitSet(new long[]{0xFFD54A2320024870L,0x0000000000000007L});
    public static final BitSet FOLLOW_57_in_ruleXBlockExpression6962 = new BitSet(new long[]{0xFDD54A2320024870L,0x0000000000000007L});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7196 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7227 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration7293 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration7323 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration7342 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall7573 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7594 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7607 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7628 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXFeatureCall7664 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7698 = new BitSet(new long[]{0xF1C55E2320008870L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7773 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7801 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7814 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7835 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral7890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXBooleanLiteral7947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXBooleanLiteral7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXNullLiteral8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXTypeLiteral8373 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral8385 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8408 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXTypeLiteral8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXThrowExpression8512 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression8569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression8579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXReturnExpression8625 = new BitSet(new long[]{0xF1C54A2320000872L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression8656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression8693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression8703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXTryCatchFinallyExpression8749 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression8800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression8822 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression8866 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause8925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause8935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXCatchClause8980 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause8993 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9014 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXCatchClause9026 = new BitSet(new long[]{0xF1C54A2320000870L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9135 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName9163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9179 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef9393 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9414 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef9427 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9448 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef9462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleXFunctionTypeRef9476 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9591 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference9612 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9634 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_40_in_ruleJvmParameterizedTypeReference9647 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9668 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference9720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference9777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference9804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference9839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmWildcardTypeReference9895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference9917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference9944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound9982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound9992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleJvmUpperBound10029 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmUpperBoundAnded10133 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmLowerBound10237 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalXscript1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalXscript1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalXscript1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalXscript2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred5_InternalXscript2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalXscript2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalXscript2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalXscript2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalXscript3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred10_InternalXscript3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred11_InternalXscript3984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred11_InternalXscript3992 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalXscript3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred12_InternalXscript4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalXscript4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalXscript4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred13_InternalXscript4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4409 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalXscript4416 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalXscript4423 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalXscript4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalXscript5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalXscript7245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred17_InternalXscript7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred18_InternalXscript7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7732 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_40_in_synpred19_InternalXscript7739 = new BitSet(new long[]{0x0000020000008010L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalXscript7746 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_44_in_synpred19_InternalXscript7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred20_InternalXscript8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_synpred21_InternalXscript8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred22_InternalXscript8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred24_InternalXscript9154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred25_InternalXscript9604 = new BitSet(new long[]{0x0000000000000002L});

}