package org.mofgen.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mofgen.services.MGLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMGLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ASSIGNMENT_OP", "RULE_TRUE", "RULE_FALSE", "RULE_INT", "RULE_NEWLINE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'as'", "'pattern'", "'('", "','", "')'", "'{'", "'}'", "'return'", "'this'", "'.'", "'['", "']'", "'->'", "'!'", "'gen'", "'for'", "'in'", "'-'", "'if'", "'else'", "'switch'", "'default'", "':'", "'case'", "'List'", "'Map'", "'sqrt'", "'abs'", "'int'", "'char'", "'double'", "'String'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'+'", "'||'", "'%'", "'^'", "'*'", "'/'", "'&&'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_FALSE=8;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=10;
    public static final int RULE_STRING=4;
    public static final int RULE_ASSIGNMENT_OP=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_TRUE=7;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMGLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMGLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMGLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMGLang.g"; }



     	private MGLangGrammarAccess grammarAccess;

        public InternalMGLangParser(TokenStream input, MGLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MofgenFile";
       	}

       	@Override
       	protected MGLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMofgenFile"
    // InternalMGLang.g:65:1: entryRuleMofgenFile returns [EObject current=null] : iv_ruleMofgenFile= ruleMofgenFile EOF ;
    public final EObject entryRuleMofgenFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMofgenFile = null;


        try {
            // InternalMGLang.g:65:51: (iv_ruleMofgenFile= ruleMofgenFile EOF )
            // InternalMGLang.g:66:2: iv_ruleMofgenFile= ruleMofgenFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMofgenFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMofgenFile=ruleMofgenFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMofgenFile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMofgenFile"


    // $ANTLR start "ruleMofgenFile"
    // InternalMGLang.g:72:1: ruleMofgenFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )* ) ;
    public final EObject ruleMofgenFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_patterns_1_0 = null;

        EObject lv_generators_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )* ) )
            // InternalMGLang.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )* )
            {
            // InternalMGLang.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )* )
            // InternalMGLang.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )*
            {
            // InternalMGLang.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMGLang.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalMGLang.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalMGLang.g:82:5: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_0_0,
            	      						"org.mofgen.MGLang.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMGLang.g:99:3: ( ( (lv_patterns_1_0= rulePattern ) ) | ( (lv_generators_2_0= ruleGenerator ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }
                else if ( (LA2_0==30) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMGLang.g:100:4: ( (lv_patterns_1_0= rulePattern ) )
            	    {
            	    // InternalMGLang.g:100:4: ( (lv_patterns_1_0= rulePattern ) )
            	    // InternalMGLang.g:101:5: (lv_patterns_1_0= rulePattern )
            	    {
            	    // InternalMGLang.g:101:5: (lv_patterns_1_0= rulePattern )
            	    // InternalMGLang.g:102:6: lv_patterns_1_0= rulePattern
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_patterns_1_0=rulePattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"patterns",
            	      							lv_patterns_1_0,
            	      							"org.mofgen.MGLang.Pattern");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMGLang.g:120:4: ( (lv_generators_2_0= ruleGenerator ) )
            	    {
            	    // InternalMGLang.g:120:4: ( (lv_generators_2_0= ruleGenerator ) )
            	    // InternalMGLang.g:121:5: (lv_generators_2_0= ruleGenerator )
            	    {
            	    // InternalMGLang.g:121:5: (lv_generators_2_0= ruleGenerator )
            	    // InternalMGLang.g:122:6: lv_generators_2_0= ruleGenerator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_generators_2_0=ruleGenerator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMofgenFileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"generators",
            	      							lv_generators_2_0,
            	      							"org.mofgen.MGLang.Generator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleMofgenFile"


    // $ANTLR start "entryRuleImport"
    // InternalMGLang.g:144:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMGLang.g:144:47: (iv_ruleImport= ruleImport EOF )
            // InternalMGLang.g:145:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMGLang.g:151:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:157:2: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) )
            // InternalMGLang.g:158:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:158:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
            // InternalMGLang.g:159:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalMGLang.g:163:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMGLang.g:164:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMGLang.g:164:4: (lv_name_1_0= RULE_STRING )
            // InternalMGLang.g:165:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
              		
            }
            // InternalMGLang.g:185:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalMGLang.g:186:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalMGLang.g:186:4: (lv_alias_3_0= RULE_ID )
            // InternalMGLang.g:187:5: lv_alias_3_0= RULE_ID
            {
            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_alias_3_0, grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"alias",
              						lv_alias_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePattern"
    // InternalMGLang.g:207:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMGLang.g:207:48: (iv_rulePattern= rulePattern EOF )
            // InternalMGLang.g:208:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMGLang.g:214:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* ) ) ) otherlv_12= '}' ( (lv_return_13_0= rulePatternReturn ) )? ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_colls_9_0 = null;

        EObject lv_nodes_10_0 = null;

        EObject lv_paramManipulations_11_0 = null;

        EObject lv_return_13_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:220:2: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* ) ) ) otherlv_12= '}' ( (lv_return_13_0= rulePatternReturn ) )? ) )
            // InternalMGLang.g:221:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* ) ) ) otherlv_12= '}' ( (lv_return_13_0= rulePatternReturn ) )? )
            {
            // InternalMGLang.g:221:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* ) ) ) otherlv_12= '}' ( (lv_return_13_0= rulePatternReturn ) )? )
            // InternalMGLang.g:222:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* ) ) ) otherlv_12= '}' ( (lv_return_13_0= rulePatternReturn ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
              		
            }
            // InternalMGLang.g:226:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:227:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:227:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:228:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPatternRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMGLang.g:244:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            // InternalMGLang.g:245:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0());
              			
            }
            // InternalMGLang.g:249:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=44 && LA4_0<=47)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGLang.g:250:5: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalMGLang.g:250:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalMGLang.g:251:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalMGLang.g:251:6: (lv_parameters_3_0= ruleParameter )
                    // InternalMGLang.g:252:7: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_10);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPatternRule());
                      							}
                      							add(
                      								current,
                      								"parameters",
                      								lv_parameters_3_0,
                      								"org.mofgen.MGLang.Parameter");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMGLang.g:269:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMGLang.g:270:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0());
                    	      					
                    	    }
                    	    // InternalMGLang.g:274:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMGLang.g:275:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMGLang.g:275:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMGLang.g:276:8: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getPatternRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"parameters",
                    	      									lv_parameters_5_0,
                    	      									"org.mofgen.MGLang.Parameter");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2());
              			
            }

            }

            otherlv_7=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMGLang.g:304:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* ) ) )
            // InternalMGLang.g:305:4: ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* ) )
            {
            // InternalMGLang.g:305:4: ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* ) )
            // InternalMGLang.g:306:5: ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            // InternalMGLang.g:309:5: ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )* )
            // InternalMGLang.g:310:6: ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )*
            {
            // InternalMGLang.g:310:6: ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) )*
            loop8:
            do {
                int alt8=4;
                int LA8_0 = input.LA(1);

                if ( LA8_0 >= 40 && LA8_0 <= 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                    int LA8_3 = input.LA(2);

                    if ( LA8_3 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                        alt8=3;
                    }
                    else if ( LA8_3 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                        alt8=2;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalMGLang.g:311:4: ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:311:4: ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) )
            	    // InternalMGLang.g:312:5: {...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalMGLang.g:312:104: ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ )
            	    // InternalMGLang.g:313:6: ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0);
            	    // InternalMGLang.g:316:9: ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==40) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }
            	        else if ( (LA5_0==41) ) {
            	            int LA5_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMGLang.g:316:10: {...}? => ( (lv_colls_9_0= ruleCollection ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:316:19: ( (lv_colls_9_0= ruleCollection ) )
            	    	    // InternalMGLang.g:316:20: (lv_colls_9_0= ruleCollection )
            	    	    {
            	    	    // InternalMGLang.g:316:20: (lv_colls_9_0= ruleCollection )
            	    	    // InternalMGLang.g:317:10: lv_colls_9_0= ruleCollection
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getPatternAccess().getCollsCollectionParserRuleCall_4_0_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_colls_9_0=ruleCollection();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										if (current==null) {
            	    	      											current = createModelElementForParent(grammarAccess.getPatternRule());
            	    	      										}
            	    	      										add(
            	    	      											current,
            	    	      											"colls",
            	    	      											lv_colls_9_0,
            	    	      											"org.mofgen.MGLang.Collection");
            	    	      										afterParserOrEnumRuleCall();
            	    	      									
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMGLang.g:339:4: ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:339:4: ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) )
            	    // InternalMGLang.g:340:5: {...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalMGLang.g:340:104: ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ )
            	    // InternalMGLang.g:341:6: ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1);
            	    // InternalMGLang.g:344:9: ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_ID) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMGLang.g:344:10: {...}? => ( (lv_nodes_10_0= ruleNode ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:344:19: ( (lv_nodes_10_0= ruleNode ) )
            	    	    // InternalMGLang.g:344:20: (lv_nodes_10_0= ruleNode )
            	    	    {
            	    	    // InternalMGLang.g:344:20: (lv_nodes_10_0= ruleNode )
            	    	    // InternalMGLang.g:345:10: lv_nodes_10_0= ruleNode
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getPatternAccess().getNodesNodeParserRuleCall_4_1_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_nodes_10_0=ruleNode();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										if (current==null) {
            	    	      											current = createModelElementForParent(grammarAccess.getPatternRule());
            	    	      										}
            	    	      										add(
            	    	      											current,
            	    	      											"nodes",
            	    	      											lv_nodes_10_0,
            	    	      											"org.mofgen.MGLang.Node");
            	    	      										afterParserOrEnumRuleCall();
            	    	      									
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMGLang.g:367:4: ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:367:4: ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) )
            	    // InternalMGLang.g:368:5: {...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalMGLang.g:368:104: ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ )
            	    // InternalMGLang.g:369:6: ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2);
            	    // InternalMGLang.g:372:9: ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ID) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMGLang.g:372:10: {...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:372:19: ( (lv_paramManipulations_11_0= ruleParamManipulation ) )
            	    	    // InternalMGLang.g:372:20: (lv_paramManipulations_11_0= ruleParamManipulation )
            	    	    {
            	    	    // InternalMGLang.g:372:20: (lv_paramManipulations_11_0= ruleParamManipulation )
            	    	    // InternalMGLang.g:373:10: lv_paramManipulations_11_0= ruleParamManipulation
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getPatternAccess().getParamManipulationsParamManipulationParserRuleCall_4_2_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_paramManipulations_11_0=ruleParamManipulation();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										if (current==null) {
            	    	      											current = createModelElementForParent(grammarAccess.getPatternRule());
            	    	      										}
            	    	      										add(
            	    	      											current,
            	    	      											"paramManipulations",
            	    	      											lv_paramManipulations_11_0,
            	    	      											"org.mofgen.MGLang.ParamManipulation");
            	    	      										afterParserOrEnumRuleCall();
            	    	      									
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getPatternAccess().getUnorderedGroup_4());

            }

            otherlv_12=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
              		
            }
            // InternalMGLang.g:406:3: ( (lv_return_13_0= rulePatternReturn ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:407:4: (lv_return_13_0= rulePatternReturn )
                    {
                    // InternalMGLang.g:407:4: (lv_return_13_0= rulePatternReturn )
                    // InternalMGLang.g:408:5: lv_return_13_0= rulePatternReturn
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_return_13_0=rulePatternReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPatternRule());
                      					}
                      					set(
                      						current,
                      						"return",
                      						lv_return_13_0,
                      						"org.mofgen.MGLang.PatternReturn");
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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRulePatternReturn"
    // InternalMGLang.g:429:1: entryRulePatternReturn returns [EObject current=null] : iv_rulePatternReturn= rulePatternReturn EOF ;
    public final EObject entryRulePatternReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternReturn = null;


        try {
            // InternalMGLang.g:429:54: (iv_rulePatternReturn= rulePatternReturn EOF )
            // InternalMGLang.g:430:2: iv_rulePatternReturn= rulePatternReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternReturn=rulePatternReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternReturn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternReturn"


    // $ANTLR start "rulePatternReturn"
    // InternalMGLang.g:436:1: rulePatternReturn returns [EObject current=null] : ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject rulePatternReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMGLang.g:442:2: ( ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalMGLang.g:443:2: ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalMGLang.g:443:2: ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalMGLang.g:444:3: () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalMGLang.g:444:3: ()
            // InternalMGLang.g:445:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPatternReturnAccess().getPatternReturnAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternReturnAccess().getReturnKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPatternReturnAccess().getThisKeyword_2());
              		
            }
            // InternalMGLang.g:459:3: (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:460:4: otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0());
                      			
                    }
                    // InternalMGLang.g:464:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMGLang.g:465:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMGLang.g:465:5: (otherlv_4= RULE_ID )
                    // InternalMGLang.g:466:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPatternReturnRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0());
                      					
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
    // $ANTLR end "rulePatternReturn"


    // $ANTLR start "entryRuleParamManipulation"
    // InternalMGLang.g:482:1: entryRuleParamManipulation returns [EObject current=null] : iv_ruleParamManipulation= ruleParamManipulation EOF ;
    public final EObject entryRuleParamManipulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamManipulation = null;


        try {
            // InternalMGLang.g:482:58: (iv_ruleParamManipulation= ruleParamManipulation EOF )
            // InternalMGLang.g:483:2: iv_ruleParamManipulation= ruleParamManipulation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamManipulationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamManipulation=ruleParamManipulation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamManipulation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParamManipulation"


    // $ANTLR start "ruleParamManipulation"
    // InternalMGLang.g:489:1: ruleParamManipulation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) ) ;
    public final EObject ruleParamManipulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:495:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) ) )
            // InternalMGLang.g:496:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) )
            {
            // InternalMGLang.g:496:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) )
            // InternalMGLang.g:497:3: ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) )
            {
            // InternalMGLang.g:497:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:498:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:498:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:499:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamManipulationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0());
              				
            }

            }


            }

            // InternalMGLang.g:510:3: ( (lv_content_1_0= ruleNodeContent ) )
            // InternalMGLang.g:511:4: (lv_content_1_0= ruleNodeContent )
            {
            // InternalMGLang.g:511:4: (lv_content_1_0= ruleNodeContent )
            // InternalMGLang.g:512:5: lv_content_1_0= ruleNodeContent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamManipulationAccess().getContentNodeContentParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_content_1_0=ruleNodeContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamManipulationRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_1_0,
              						"org.mofgen.MGLang.NodeContent");
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
    // $ANTLR end "ruleParamManipulation"


    // $ANTLR start "entryRuleNode"
    // InternalMGLang.g:533:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalMGLang.g:533:45: (iv_ruleNode= ruleNode EOF )
            // InternalMGLang.g:534:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalMGLang.g:540:1: ruleNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_3=null;
        EObject lv_createdBy_2_0 = null;

        EObject lv_createdBy_4_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:546:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? ) )
            // InternalMGLang.g:547:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? )
            {
            // InternalMGLang.g:547:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? )
            // InternalMGLang.g:548:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )?
            {
            // InternalMGLang.g:548:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:549:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:549:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:550:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNodeRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0());
              				
            }

            }


            }

            // InternalMGLang.g:561:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:562:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:562:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:563:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMGLang.g:579:3: ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ASSIGNMENT_OP) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:580:4: ( (lv_createdBy_2_0= ruleNodeContent ) )
                    {
                    // InternalMGLang.g:580:4: ( (lv_createdBy_2_0= ruleNodeContent ) )
                    // InternalMGLang.g:581:5: (lv_createdBy_2_0= ruleNodeContent )
                    {
                    // InternalMGLang.g:581:5: (lv_createdBy_2_0= ruleNodeContent )
                    // InternalMGLang.g:582:6: lv_createdBy_2_0= ruleNodeContent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_createdBy_2_0=ruleNodeContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeRule());
                      						}
                      						set(
                      							current,
                      							"createdBy",
                      							lv_createdBy_2_0,
                      							"org.mofgen.MGLang.NodeContent");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:600:4: (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) )
                    {
                    // InternalMGLang.g:600:4: (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) )
                    // InternalMGLang.g:601:5: this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) )
                    {
                    this_ASSIGNMENT_OP_3=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ASSIGNMENT_OP_3, grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalMGLang.g:605:5: ( (lv_createdBy_4_0= rulePatternCall ) )
                    // InternalMGLang.g:606:6: (lv_createdBy_4_0= rulePatternCall )
                    {
                    // InternalMGLang.g:606:6: (lv_createdBy_4_0= rulePatternCall )
                    // InternalMGLang.g:607:7: lv_createdBy_4_0= rulePatternCall
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_createdBy_4_0=rulePatternCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNodeRule());
                      							}
                      							set(
                      								current,
                      								"createdBy",
                      								lv_createdBy_4_0,
                      								"org.mofgen.MGLang.PatternCall");
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeContent"
    // InternalMGLang.g:630:1: entryRuleNodeContent returns [EObject current=null] : iv_ruleNodeContent= ruleNodeContent EOF ;
    public final EObject entryRuleNodeContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeContent = null;


        try {
            // InternalMGLang.g:630:52: (iv_ruleNodeContent= ruleNodeContent EOF )
            // InternalMGLang.g:631:2: iv_ruleNodeContent= ruleNodeContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeContentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeContent=ruleNodeContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeContent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeContent"


    // $ANTLR start "ruleNodeContent"
    // InternalMGLang.g:637:1: ruleNodeContent returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' ) ;
    public final EObject ruleNodeContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refsAssigns_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:643:2: ( ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' ) )
            // InternalMGLang.g:644:2: ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' )
            {
            // InternalMGLang.g:644:2: ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' )
            // InternalMGLang.g:645:3: () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}'
            {
            // InternalMGLang.g:645:3: ()
            // InternalMGLang.g:646:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNodeContentAccess().getNodeContentAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNodeContentAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMGLang.g:656:3: ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMGLang.g:657:4: (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment )
            	    {
            	    // InternalMGLang.g:657:4: (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment )
            	    // InternalMGLang.g:658:5: lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_refsAssigns_2_0=ruleNodeReferenceOrAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNodeContentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"refsAssigns",
            	      						lv_refsAssigns_2_0,
            	      						"org.mofgen.MGLang.NodeReferenceOrAssignment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNodeContentAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleNodeContent"


    // $ANTLR start "entryRulePatternCall"
    // InternalMGLang.g:683:1: entryRulePatternCall returns [EObject current=null] : iv_rulePatternCall= rulePatternCall EOF ;
    public final EObject entryRulePatternCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternCall = null;


        try {
            // InternalMGLang.g:683:52: (iv_rulePatternCall= rulePatternCall EOF )
            // InternalMGLang.g:684:2: iv_rulePatternCall= rulePatternCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternCall=rulePatternCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternCall"


    // $ANTLR start "rulePatternCall"
    // InternalMGLang.g:690:1: rulePatternCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')' ) ;
    public final EObject rulePatternCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:696:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')' ) )
            // InternalMGLang.g:697:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')' )
            {
            // InternalMGLang.g:697:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')' )
            // InternalMGLang.g:698:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')'
            {
            // InternalMGLang.g:698:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:699:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:699:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:700:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPatternCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMGLang.g:715:3: ( (lv_params_2_0= ruleArithmeticExpression ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||(LA13_0>=RULE_TRUE && LA13_0<=RULE_INT)||LA13_0==18||LA13_0==29||(LA13_0>=42 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMGLang.g:716:4: (lv_params_2_0= ruleArithmeticExpression )
            	    {
            	    // InternalMGLang.g:716:4: (lv_params_2_0= ruleArithmeticExpression )
            	    // InternalMGLang.g:717:5: lv_params_2_0= ruleArithmeticExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_params_2_0=ruleArithmeticExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPatternCallRule());
            	      					}
            	      					add(
            	      						current,
            	      						"params",
            	      						lv_params_2_0,
            	      						"org.mofgen.MGLang.ArithmeticExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "rulePatternCall"


    // $ANTLR start "entryRuleNodeReferenceOrAssignment"
    // InternalMGLang.g:742:1: entryRuleNodeReferenceOrAssignment returns [EObject current=null] : iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF ;
    public final EObject entryRuleNodeReferenceOrAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeReferenceOrAssignment = null;


        try {
            // InternalMGLang.g:742:66: (iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF )
            // InternalMGLang.g:743:2: iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeReferenceOrAssignment=ruleNodeReferenceOrAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeReferenceOrAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeReferenceOrAssignment"


    // $ANTLR start "ruleNodeReferenceOrAssignment"
    // InternalMGLang.g:749:1: ruleNodeReferenceOrAssignment returns [EObject current=null] : ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleArithmeticExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleNodeReferenceOrAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PatternNodeReference_0 = null;

        EObject this_Assignment_1 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:755:2: ( ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleArithmeticExpression ) ) otherlv_4= ']' )? ) )
            // InternalMGLang.g:756:2: ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleArithmeticExpression ) ) otherlv_4= ']' )? )
            {
            // InternalMGLang.g:756:2: ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleArithmeticExpression ) ) otherlv_4= ']' )? )
            // InternalMGLang.g:757:3: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) (otherlv_2= '[' ( (lv_condition_3_0= ruleArithmeticExpression ) ) otherlv_4= ']' )?
            {
            // InternalMGLang.g:757:3: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==28) ) {
                    alt14=1;
                }
                else if ( (LA14_1==RULE_ASSIGNMENT_OP) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMGLang.g:758:4: this_PatternNodeReference_0= rulePatternNodeReference
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_PatternNodeReference_0=rulePatternNodeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PatternNodeReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:767:4: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Assignment_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMGLang.g:776:3: (otherlv_2= '[' ( (lv_condition_3_0= ruleArithmeticExpression ) ) otherlv_4= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:777:4: otherlv_2= '[' ( (lv_condition_3_0= ruleArithmeticExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalMGLang.g:781:4: ( (lv_condition_3_0= ruleArithmeticExpression ) )
                    // InternalMGLang.g:782:5: (lv_condition_3_0= ruleArithmeticExpression )
                    {
                    // InternalMGLang.g:782:5: (lv_condition_3_0= ruleArithmeticExpression )
                    // InternalMGLang.g:783:6: lv_condition_3_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionArithmeticExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_condition_3_0=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodeReferenceOrAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_3_0,
                      							"org.mofgen.MGLang.ArithmeticExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2());
                      			
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
    // $ANTLR end "ruleNodeReferenceOrAssignment"


    // $ANTLR start "entryRulePatternNodeReference"
    // InternalMGLang.g:809:1: entryRulePatternNodeReference returns [EObject current=null] : iv_rulePatternNodeReference= rulePatternNodeReference EOF ;
    public final EObject entryRulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternNodeReference = null;


        try {
            // InternalMGLang.g:809:61: (iv_rulePatternNodeReference= rulePatternNodeReference EOF )
            // InternalMGLang.g:810:2: iv_rulePatternNodeReference= rulePatternNodeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternNodeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternNodeReference=rulePatternNodeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternNodeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternNodeReference"


    // $ANTLR start "rulePatternNodeReference"
    // InternalMGLang.g:816:1: rulePatternNodeReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:822:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:823:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:823:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:824:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:824:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:825:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:825:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:826:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalMGLang.g:841:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:842:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:842:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:843:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0());
              				
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
    // $ANTLR end "rulePatternNodeReference"


    // $ANTLR start "entryRuleAssignment"
    // InternalMGLang.g:858:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMGLang.g:858:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMGLang.g:859:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMGLang.g:865:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ASSIGNMENT_OP_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:871:2: ( ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) ) )
            // InternalMGLang.g:872:2: ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) )
            {
            // InternalMGLang.g:872:2: ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) )
            // InternalMGLang.g:873:3: ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) )
            {
            // InternalMGLang.g:873:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:874:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:874:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:875:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssignmentRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0());
              				
            }

            }


            }

            this_ASSIGNMENT_OP_1=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ASSIGNMENT_OP_1, grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1());
              		
            }
            // InternalMGLang.g:890:3: ( (lv_value_2_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:891:4: (lv_value_2_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:891:4: (lv_value_2_0= ruleArithmeticExpression )
            // InternalMGLang.g:892:5: lv_value_2_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getValueArithmeticExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.mofgen.MGLang.ArithmeticExpression");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleParameter"
    // InternalMGLang.g:913:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMGLang.g:913:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMGLang.g:914:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMGLang.g:920:1: ruleParameter returns [EObject current=null] : (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveParameter_0 = null;

        EObject this_ParameterNode_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:926:2: ( (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode ) )
            // InternalMGLang.g:927:2: (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode )
            {
            // InternalMGLang.g:927:2: (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=44 && LA16_0<=47)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
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
                    // InternalMGLang.g:928:3: this_PrimitiveParameter_0= rulePrimitiveParameter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveParameter_0=rulePrimitiveParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveParameter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:937:3: this_ParameterNode_1= ruleParameterNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterAccess().getParameterNodeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterNode_1=ruleParameterNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterNode_1;
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePrimitiveParameter"
    // InternalMGLang.g:949:1: entryRulePrimitiveParameter returns [EObject current=null] : iv_rulePrimitiveParameter= rulePrimitiveParameter EOF ;
    public final EObject entryRulePrimitiveParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveParameter = null;


        try {
            // InternalMGLang.g:949:59: (iv_rulePrimitiveParameter= rulePrimitiveParameter EOF )
            // InternalMGLang.g:950:2: iv_rulePrimitiveParameter= rulePrimitiveParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveParameter=rulePrimitiveParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveParameter"


    // $ANTLR start "rulePrimitiveParameter"
    // InternalMGLang.g:956:1: rulePrimitiveParameter returns [EObject current=null] : ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:962:2: ( ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:963:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:963:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:964:3: ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:964:3: ( (lv_type_0_0= rulePrimitiveType ) )
            // InternalMGLang.g:965:4: (lv_type_0_0= rulePrimitiveType )
            {
            // InternalMGLang.g:965:4: (lv_type_0_0= rulePrimitiveType )
            // InternalMGLang.g:966:5: lv_type_0_0= rulePrimitiveType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_type_0_0=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrimitiveParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.mofgen.MGLang.PrimitiveType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGLang.g:983:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:984:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:984:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:985:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrimitiveParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "rulePrimitiveParameter"


    // $ANTLR start "entryRuleParameterNode"
    // InternalMGLang.g:1005:1: entryRuleParameterNode returns [EObject current=null] : iv_ruleParameterNode= ruleParameterNode EOF ;
    public final EObject entryRuleParameterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterNode = null;


        try {
            // InternalMGLang.g:1005:54: (iv_ruleParameterNode= ruleParameterNode EOF )
            // InternalMGLang.g:1006:2: iv_ruleParameterNode= ruleParameterNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterNode=ruleParameterNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterNode"


    // $ANTLR start "ruleParameterNode"
    // InternalMGLang.g:1012:1: ruleParameterNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1018:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1019:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1019:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:1020:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:1020:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1021:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1021:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1022:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterNodeRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_0_0());
              				
            }

            }


            }

            // InternalMGLang.g:1033:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:1034:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:1034:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:1035:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleParameterNode"


    // $ANTLR start "entryRuleParameterRefOrMethodCall"
    // InternalMGLang.g:1055:1: entryRuleParameterRefOrMethodCall returns [EObject current=null] : iv_ruleParameterRefOrMethodCall= ruleParameterRefOrMethodCall EOF ;
    public final EObject entryRuleParameterRefOrMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRefOrMethodCall = null;


        try {
            // InternalMGLang.g:1055:65: (iv_ruleParameterRefOrMethodCall= ruleParameterRefOrMethodCall EOF )
            // InternalMGLang.g:1056:2: iv_ruleParameterRefOrMethodCall= ruleParameterRefOrMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRefOrMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterRefOrMethodCall=ruleParameterRefOrMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterRefOrMethodCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterRefOrMethodCall"


    // $ANTLR start "ruleParameterRefOrMethodCall"
    // InternalMGLang.g:1062:1: ruleParameterRefOrMethodCall returns [EObject current=null] : (this_ParameterRef_0= ruleParameterRef | this_MethodCall_1= ruleMethodCall ) ;
    public final EObject ruleParameterRefOrMethodCall() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterRef_0 = null;

        EObject this_MethodCall_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1068:2: ( (this_ParameterRef_0= ruleParameterRef | this_MethodCall_1= ruleMethodCall ) )
            // InternalMGLang.g:1069:2: (this_ParameterRef_0= ruleParameterRef | this_MethodCall_1= ruleMethodCall )
            {
            // InternalMGLang.g:1069:2: (this_ParameterRef_0= ruleParameterRef | this_MethodCall_1= ruleMethodCall )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==25) ) {
                    alt17=2;
                }
                else if ( (LA17_1==EOF||(LA17_1>=RULE_STRING && LA17_1<=RULE_ID)||(LA17_1>=RULE_TRUE && LA17_1<=RULE_INT)||LA17_1==18||LA17_1==20||LA17_1==22||(LA17_1>=26 && LA17_1<=27)||LA17_1==29||LA17_1==33||LA17_1==38||(LA17_1>=42 && LA17_1<=43)||(LA17_1>=48 && LA17_1<=60)) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGLang.g:1070:3: this_ParameterRef_0= ruleParameterRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterRefOrMethodCallAccess().getParameterRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterRef_0=ruleParameterRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1079:3: this_MethodCall_1= ruleMethodCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterRefOrMethodCallAccess().getMethodCallParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MethodCall_1=ruleMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MethodCall_1;
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
    // $ANTLR end "ruleParameterRefOrMethodCall"


    // $ANTLR start "entryRuleParameterRef"
    // InternalMGLang.g:1091:1: entryRuleParameterRef returns [EObject current=null] : iv_ruleParameterRef= ruleParameterRef EOF ;
    public final EObject entryRuleParameterRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRef = null;


        try {
            // InternalMGLang.g:1091:53: (iv_ruleParameterRef= ruleParameterRef EOF )
            // InternalMGLang.g:1092:2: iv_ruleParameterRef= ruleParameterRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterRef=ruleParameterRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterRef"


    // $ANTLR start "ruleParameterRef"
    // InternalMGLang.g:1098:1: ruleParameterRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1104:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMGLang.g:1105:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMGLang.g:1105:2: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1106:3: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1106:3: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1107:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameterRefRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0());
              			
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
    // $ANTLR end "ruleParameterRef"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMGLang.g:1121:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalMGLang.g:1121:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalMGLang.g:1122:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMGLang.g:1128:1: ruleMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:1134:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:1135:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:1135:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:1136:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:1136:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1137:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1137:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1138:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getCalledNodeNodeCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getFullStopKeyword_1());
              		
            }
            // InternalMGLang.g:1153:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:1154:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:1154:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:1155:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMethodCallAccess().getMethodEOperationCrossReference_2_0());
              				
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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalMGLang.g:1170:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalMGLang.g:1170:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalMGLang.g:1171:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalMGLang.g:1177:1: ruleArithmeticExpression returns [EObject current=null] : this_TertiaryExpression_0= ruleTertiaryExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TertiaryExpression_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1183:2: (this_TertiaryExpression_0= ruleTertiaryExpression )
            // InternalMGLang.g:1184:2: this_TertiaryExpression_0= ruleTertiaryExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTertiaryExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_TertiaryExpression_0=ruleTertiaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_TertiaryExpression_0;
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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleTertiaryExpression"
    // InternalMGLang.g:1195:1: entryRuleTertiaryExpression returns [EObject current=null] : iv_ruleTertiaryExpression= ruleTertiaryExpression EOF ;
    public final EObject entryRuleTertiaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTertiaryExpression = null;


        try {
            // InternalMGLang.g:1195:59: (iv_ruleTertiaryExpression= ruleTertiaryExpression EOF )
            // InternalMGLang.g:1196:2: iv_ruleTertiaryExpression= ruleTertiaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTertiaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTertiaryExpression=ruleTertiaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTertiaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTertiaryExpression"


    // $ANTLR start "ruleTertiaryExpression"
    // InternalMGLang.g:1202:1: ruleTertiaryExpression returns [EObject current=null] : (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* ) ;
    public final EObject ruleTertiaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SecondaryExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1208:2: ( (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* ) )
            // InternalMGLang.g:1209:2: (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* )
            {
            // InternalMGLang.g:1209:2: (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* )
            // InternalMGLang.g:1210:3: this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getSecondaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_SecondaryExpression_0=ruleSecondaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SecondaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGLang.g:1218:3: ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33||(LA18_0>=54 && LA18_0<=55)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMGLang.g:1219:4: () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) )
            	    {
            	    // InternalMGLang.g:1219:4: ()
            	    // InternalMGLang.g:1220:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGLang.g:1226:4: ( (lv_op_2_0= ruleTertiaryOp ) )
            	    // InternalMGLang.g:1227:5: (lv_op_2_0= ruleTertiaryOp )
            	    {
            	    // InternalMGLang.g:1227:5: (lv_op_2_0= ruleTertiaryOp )
            	    // InternalMGLang.g:1228:6: lv_op_2_0= ruleTertiaryOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getOpTertiaryOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_op_2_0=ruleTertiaryOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTertiaryExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"org.mofgen.MGLang.TertiaryOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMGLang.g:1245:4: ( (lv_right_3_0= ruleSecondaryExpression ) )
            	    // InternalMGLang.g:1246:5: (lv_right_3_0= ruleSecondaryExpression )
            	    {
            	    // InternalMGLang.g:1246:5: (lv_right_3_0= ruleSecondaryExpression )
            	    // InternalMGLang.g:1247:6: lv_right_3_0= ruleSecondaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getRightSecondaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleSecondaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTertiaryExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.mofgen.MGLang.SecondaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleTertiaryExpression"


    // $ANTLR start "entryRuleSecondaryExpression"
    // InternalMGLang.g:1269:1: entryRuleSecondaryExpression returns [EObject current=null] : iv_ruleSecondaryExpression= ruleSecondaryExpression EOF ;
    public final EObject entryRuleSecondaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondaryExpression = null;


        try {
            // InternalMGLang.g:1269:60: (iv_ruleSecondaryExpression= ruleSecondaryExpression EOF )
            // InternalMGLang.g:1270:2: iv_ruleSecondaryExpression= ruleSecondaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSecondaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSecondaryExpression=ruleSecondaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSecondaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSecondaryExpression"


    // $ANTLR start "ruleSecondaryExpression"
    // InternalMGLang.g:1276:1: ruleSecondaryExpression returns [EObject current=null] : (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleSecondaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpr_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1282:2: ( (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) )
            // InternalMGLang.g:1283:2: (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            {
            // InternalMGLang.g:1283:2: (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            // InternalMGLang.g:1284:3: this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getPrimaryExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGLang.g:1292:3: ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=56 && LA19_0<=57)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMGLang.g:1293:4: () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) )
            	    {
            	    // InternalMGLang.g:1293:4: ()
            	    // InternalMGLang.g:1294:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGLang.g:1300:4: ( (lv_op_2_0= ruleSecondaryOp ) )
            	    // InternalMGLang.g:1301:5: (lv_op_2_0= ruleSecondaryOp )
            	    {
            	    // InternalMGLang.g:1301:5: (lv_op_2_0= ruleSecondaryOp )
            	    // InternalMGLang.g:1302:6: lv_op_2_0= ruleSecondaryOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getOpSecondaryOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_op_2_0=ruleSecondaryOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSecondaryExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"org.mofgen.MGLang.SecondaryOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMGLang.g:1319:4: ( (lv_right_3_0= rulePrimaryExpr ) )
            	    // InternalMGLang.g:1320:5: (lv_right_3_0= rulePrimaryExpr )
            	    {
            	    // InternalMGLang.g:1320:5: (lv_right_3_0= rulePrimaryExpr )
            	    // InternalMGLang.g:1321:6: lv_right_3_0= rulePrimaryExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getRightPrimaryExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=rulePrimaryExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSecondaryExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.mofgen.MGLang.PrimaryExpr");
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
    // $ANTLR end "ruleSecondaryExpression"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalMGLang.g:1343:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalMGLang.g:1343:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalMGLang.g:1344:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalMGLang.g:1350:1: rulePrimaryExpr returns [EObject current=null] : (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_RelationExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1356:2: ( (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* ) )
            // InternalMGLang.g:1357:2: (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* )
            {
            // InternalMGLang.g:1357:2: (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* )
            // InternalMGLang.g:1358:3: this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPrimaryExprAccess().getRelationExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_RelationExpression_0=ruleRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGLang.g:1366:3: ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=58 && LA20_0<=60)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMGLang.g:1367:4: () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) )
            	    {
            	    // InternalMGLang.g:1367:4: ()
            	    // InternalMGLang.g:1368:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGLang.g:1374:4: ( (lv_op_2_0= rulePrimaryOp ) )
            	    // InternalMGLang.g:1375:5: (lv_op_2_0= rulePrimaryOp )
            	    {
            	    // InternalMGLang.g:1375:5: (lv_op_2_0= rulePrimaryOp )
            	    // InternalMGLang.g:1376:6: lv_op_2_0= rulePrimaryOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPrimaryExprAccess().getOpPrimaryOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_op_2_0=rulePrimaryOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"org.mofgen.MGLang.PrimaryOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMGLang.g:1393:4: ( (lv_right_3_0= ruleRelationExpression ) )
            	    // InternalMGLang.g:1394:5: (lv_right_3_0= ruleRelationExpression )
            	    {
            	    // InternalMGLang.g:1394:5: (lv_right_3_0= ruleRelationExpression )
            	    // InternalMGLang.g:1395:6: lv_right_3_0= ruleRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPrimaryExprAccess().getRightRelationExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleRelationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.mofgen.MGLang.RelationExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleRelationExpression"
    // InternalMGLang.g:1417:1: entryRuleRelationExpression returns [EObject current=null] : iv_ruleRelationExpression= ruleRelationExpression EOF ;
    public final EObject entryRuleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationExpression = null;


        try {
            // InternalMGLang.g:1417:59: (iv_ruleRelationExpression= ruleRelationExpression EOF )
            // InternalMGLang.g:1418:2: iv_ruleRelationExpression= ruleRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationExpression=ruleRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationExpression"


    // $ANTLR start "ruleRelationExpression"
    // InternalMGLang.g:1424:1: ruleRelationExpression returns [EObject current=null] : (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* ) ;
    public final EObject ruleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BaseExpr_0 = null;

        Enumerator lv_relation_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1430:2: ( (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* ) )
            // InternalMGLang.g:1431:2: (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* )
            {
            // InternalMGLang.g:1431:2: (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* )
            // InternalMGLang.g:1432:3: this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationExpressionAccess().getBaseExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_BaseExpr_0=ruleBaseExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BaseExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMGLang.g:1440:3: ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=48 && LA21_0<=53)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMGLang.g:1441:4: () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) )
            	    {
            	    // InternalMGLang.g:1441:4: ()
            	    // InternalMGLang.g:1442:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMGLang.g:1448:4: ( (lv_relation_2_0= ruleRelationalOp ) )
            	    // InternalMGLang.g:1449:5: (lv_relation_2_0= ruleRelationalOp )
            	    {
            	    // InternalMGLang.g:1449:5: (lv_relation_2_0= ruleRelationalOp )
            	    // InternalMGLang.g:1450:6: lv_relation_2_0= ruleRelationalOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_relation_2_0=ruleRelationalOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelationExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"relation",
            	      							lv_relation_2_0,
            	      							"org.mofgen.MGLang.RelationalOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalMGLang.g:1467:4: ( (lv_right_3_0= ruleBaseExpr ) )
            	    // InternalMGLang.g:1468:5: (lv_right_3_0= ruleBaseExpr )
            	    {
            	    // InternalMGLang.g:1468:5: (lv_right_3_0= ruleBaseExpr )
            	    // InternalMGLang.g:1469:6: lv_right_3_0= ruleBaseExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelationExpressionAccess().getRightBaseExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleBaseExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelationExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.mofgen.MGLang.BaseExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleRelationExpression"


    // $ANTLR start "entryRuleBaseExpr"
    // InternalMGLang.g:1491:1: entryRuleBaseExpr returns [EObject current=null] : iv_ruleBaseExpr= ruleBaseExpr EOF ;
    public final EObject entryRuleBaseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpr = null;


        try {
            // InternalMGLang.g:1491:49: (iv_ruleBaseExpr= ruleBaseExpr EOF )
            // InternalMGLang.g:1492:2: iv_ruleBaseExpr= ruleBaseExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpr=ruleBaseExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseExpr"


    // $ANTLR start "ruleBaseExpr"
    // InternalMGLang.g:1498:1: ruleBaseExpr returns [EObject current=null] : ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | ( () ruleLiteral ) | this_ParameterRefOrMethodCall_13= ruleParameterRefOrMethodCall ) ;
    public final EObject ruleBaseExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_ArithmeticExpression_1 = null;

        EObject lv_expr_5_0 = null;

        Enumerator lv_func_7_0 = null;

        EObject lv_expr_9_0 = null;

        EObject this_ParameterRefOrMethodCall_13 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1504:2: ( ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | ( () ruleLiteral ) | this_ParameterRefOrMethodCall_13= ruleParameterRefOrMethodCall ) )
            // InternalMGLang.g:1505:2: ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | ( () ruleLiteral ) | this_ParameterRefOrMethodCall_13= ruleParameterRefOrMethodCall )
            {
            // InternalMGLang.g:1505:2: ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | ( () ruleLiteral ) | this_ParameterRefOrMethodCall_13= ruleParameterRefOrMethodCall )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt22=1;
                }
                break;
            case 29:
                {
                alt22=2;
                }
                break;
            case 42:
            case 43:
                {
                alt22=3;
                }
                break;
            case RULE_STRING:
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_INT:
                {
                alt22=4;
                }
                break;
            case RULE_ID:
                {
                alt22=5;
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
                    // InternalMGLang.g:1506:3: (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' )
                    {
                    // InternalMGLang.g:1506:3: (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' )
                    // InternalMGLang.g:1507:4: otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBaseExprAccess().getArithmeticExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_ArithmeticExpression_1=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ArithmeticExpression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1525:3: ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) )
                    {
                    // InternalMGLang.g:1525:3: ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) )
                    // InternalMGLang.g:1526:4: () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) )
                    {
                    // InternalMGLang.g:1526:4: ()
                    // InternalMGLang.g:1527:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalMGLang.g:1537:4: ( (lv_expr_5_0= ruleBaseExpr ) )
                    // InternalMGLang.g:1538:5: (lv_expr_5_0= ruleBaseExpr )
                    {
                    // InternalMGLang.g:1538:5: (lv_expr_5_0= ruleBaseExpr )
                    // InternalMGLang.g:1539:6: lv_expr_5_0= ruleBaseExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBaseExprAccess().getExprBaseExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_5_0=ruleBaseExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBaseExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_5_0,
                      							"org.mofgen.MGLang.BaseExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1558:3: ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' )
                    {
                    // InternalMGLang.g:1558:3: ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' )
                    // InternalMGLang.g:1559:4: () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')'
                    {
                    // InternalMGLang.g:1559:4: ()
                    // InternalMGLang.g:1560:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMGLang.g:1566:4: ( (lv_func_7_0= ruleMathFunc ) )
                    // InternalMGLang.g:1567:5: (lv_func_7_0= ruleMathFunc )
                    {
                    // InternalMGLang.g:1567:5: (lv_func_7_0= ruleMathFunc )
                    // InternalMGLang.g:1568:6: lv_func_7_0= ruleMathFunc
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBaseExprAccess().getFuncMathFuncEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_func_7_0=ruleMathFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBaseExprRule());
                      						}
                      						set(
                      							current,
                      							"func",
                      							lv_func_7_0,
                      							"org.mofgen.MGLang.MathFunc");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalMGLang.g:1589:4: ( (lv_expr_9_0= ruleArithmeticExpression ) )
                    // InternalMGLang.g:1590:5: (lv_expr_9_0= ruleArithmeticExpression )
                    {
                    // InternalMGLang.g:1590:5: (lv_expr_9_0= ruleArithmeticExpression )
                    // InternalMGLang.g:1591:6: lv_expr_9_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBaseExprAccess().getExprArithmeticExpressionParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_expr_9_0=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBaseExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_9_0,
                      							"org.mofgen.MGLang.ArithmeticExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1614:3: ( () ruleLiteral )
                    {
                    // InternalMGLang.g:1614:3: ( () ruleLiteral )
                    // InternalMGLang.g:1615:4: () ruleLiteral
                    {
                    // InternalMGLang.g:1615:4: ()
                    // InternalMGLang.g:1616:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBaseExprAccess().getLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1631:3: this_ParameterRefOrMethodCall_13= ruleParameterRefOrMethodCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseExprAccess().getParameterRefOrMethodCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterRefOrMethodCall_13=ruleParameterRefOrMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterRefOrMethodCall_13;
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
    // $ANTLR end "ruleBaseExpr"


    // $ANTLR start "entryRuleLiteral"
    // InternalMGLang.g:1643:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalMGLang.g:1643:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMGLang.g:1644:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMGLang.g:1650:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BooleanLiteral_0 = null;

        AntlrDatatypeRuleToken this_StringLiteral_1 = null;

        AntlrDatatypeRuleToken this_NumberLiteral_2 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1656:2: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral ) )
            // InternalMGLang.g:1657:2: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral )
            {
            // InternalMGLang.g:1657:2: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case RULE_INT:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMGLang.g:1658:3: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BooleanLiteral_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1669:3: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_StringLiteral_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1680:3: this_NumberLiteral_2= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NumberLiteral_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMGLang.g:1694:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // InternalMGLang.g:1694:54: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalMGLang.g:1695:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMGLang.g:1701:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_0=null;
        Token this_FALSE_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:1707:2: ( (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) )
            // InternalMGLang.g:1708:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            {
            // InternalMGLang.g:1708:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_TRUE) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_FALSE) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMGLang.g:1709:3: this_TRUE_0= RULE_TRUE
                    {
                    this_TRUE_0=(Token)match(input,RULE_TRUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TRUE_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TRUE_0, grammarAccess.getBooleanLiteralAccess().getTRUETerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1717:3: this_FALSE_1= RULE_FALSE
                    {
                    this_FALSE_1=(Token)match(input,RULE_FALSE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FALSE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_FALSE_1, grammarAccess.getBooleanLiteralAccess().getFALSETerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMGLang.g:1728:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalMGLang.g:1728:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMGLang.g:1729:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMGLang.g:1735:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1741:2: (this_STRING_0= RULE_STRING )
            // InternalMGLang.g:1742:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
              	
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMGLang.g:1752:1: entryRuleNumberLiteral returns [String current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final String entryRuleNumberLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberLiteral = null;


        try {
            // InternalMGLang.g:1752:53: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMGLang.g:1753:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMGLang.g:1759:1: ruleNumberLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumberLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:1765:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalMGLang.g:1766:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalMGLang.g:1766:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalMGLang.g:1767:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalMGLang.g:1774:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMGLang.g:1775:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,25,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNumberLiteralAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_2, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1_1());
                      			
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:1792:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // InternalMGLang.g:1792:50: (iv_ruleGenerator= ruleGenerator EOF )
            // InternalMGLang.g:1793:2: iv_ruleGenerator= ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // InternalMGLang.g:1799:1: ruleGenerator returns [EObject current=null] : ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_params_3_0 = null;

        EObject lv_commands_6_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1805:2: ( ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' ) )
            // InternalMGLang.g:1806:2: ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' )
            {
            // InternalMGLang.g:1806:2: ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' )
            // InternalMGLang.g:1807:3: () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}'
            {
            // InternalMGLang.g:1807:3: ()
            // InternalMGLang.g:1808:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGeneratorAccess().getGeneratorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getGenKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMGLang.g:1822:3: ( (lv_params_3_0= ruleParameter ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=44 && LA26_0<=47)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMGLang.g:1823:4: (lv_params_3_0= ruleParameter )
            	    {
            	    // InternalMGLang.g:1823:4: (lv_params_3_0= ruleParameter )
            	    // InternalMGLang.g:1824:5: lv_params_3_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGeneratorAccess().getParamsParameterParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_params_3_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGeneratorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"params",
            	      						lv_params_3_0,
            	      						"org.mofgen.MGLang.Parameter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalMGLang.g:1849:3: ( (lv_commands_6_0= ruleGeneratorExpression ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==31||LA27_0==34||LA27_0==36||(LA27_0>=40 && LA27_0<=41)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMGLang.g:1850:4: (lv_commands_6_0= ruleGeneratorExpression )
            	    {
            	    // InternalMGLang.g:1850:4: (lv_commands_6_0= ruleGeneratorExpression )
            	    // InternalMGLang.g:1851:5: lv_commands_6_0= ruleGeneratorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGeneratorAccess().getCommandsGeneratorExpressionParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_commands_6_0=ruleGeneratorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGeneratorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_6_0,
            	      						"org.mofgen.MGLang.GeneratorExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_7());
              		
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
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleGeneratorExpression"
    // InternalMGLang.g:1876:1: entryRuleGeneratorExpression returns [EObject current=null] : iv_ruleGeneratorExpression= ruleGeneratorExpression EOF ;
    public final EObject entryRuleGeneratorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorExpression = null;


        try {
            // InternalMGLang.g:1876:60: (iv_ruleGeneratorExpression= ruleGeneratorExpression EOF )
            // InternalMGLang.g:1877:2: iv_ruleGeneratorExpression= ruleGeneratorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGeneratorExpression=ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneratorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGeneratorExpression"


    // $ANTLR start "ruleGeneratorExpression"
    // InternalMGLang.g:1883:1: ruleGeneratorExpression returns [EObject current=null] : (this_ForStatement_0= ruleForStatement | this_IfStatement_1= ruleIfStatement | this_SwitchCase_2= ruleSwitchCase | this_Collection_3= ruleCollection | this_PatternCall_4= rulePatternCall | this_PatternObjectCreation_5= rulePatternObjectCreation ) ;
    public final EObject ruleGeneratorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ForStatement_0 = null;

        EObject this_IfStatement_1 = null;

        EObject this_SwitchCase_2 = null;

        EObject this_Collection_3 = null;

        EObject this_PatternCall_4 = null;

        EObject this_PatternObjectCreation_5 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1889:2: ( (this_ForStatement_0= ruleForStatement | this_IfStatement_1= ruleIfStatement | this_SwitchCase_2= ruleSwitchCase | this_Collection_3= ruleCollection | this_PatternCall_4= rulePatternCall | this_PatternObjectCreation_5= rulePatternObjectCreation ) )
            // InternalMGLang.g:1890:2: (this_ForStatement_0= ruleForStatement | this_IfStatement_1= ruleIfStatement | this_SwitchCase_2= ruleSwitchCase | this_Collection_3= ruleCollection | this_PatternCall_4= rulePatternCall | this_PatternObjectCreation_5= rulePatternObjectCreation )
            {
            // InternalMGLang.g:1890:2: (this_ForStatement_0= ruleForStatement | this_IfStatement_1= ruleIfStatement | this_SwitchCase_2= ruleSwitchCase | this_Collection_3= ruleCollection | this_PatternCall_4= rulePatternCall | this_PatternObjectCreation_5= rulePatternObjectCreation )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt28=1;
                }
                break;
            case 34:
                {
                alt28=2;
                }
                break;
            case 36:
                {
                alt28=3;
                }
                break;
            case 40:
            case 41:
                {
                alt28=4;
                }
                break;
            case RULE_ID:
                {
                int LA28_5 = input.LA(2);

                if ( (LA28_5==18) ) {
                    alt28=5;
                }
                else if ( (LA28_5==RULE_ID) ) {
                    alt28=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMGLang.g:1891:3: this_ForStatement_0= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getForStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_0=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStatement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1900:3: this_IfStatement_1= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getIfStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_1=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1909:3: this_SwitchCase_2= ruleSwitchCase
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getSwitchCaseParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchCase_2=ruleSwitchCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SwitchCase_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1918:3: this_Collection_3= ruleCollection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Collection_3=ruleCollection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Collection_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1927:3: this_PatternCall_4= rulePatternCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PatternCall_4=rulePatternCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PatternCall_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMGLang.g:1936:3: this_PatternObjectCreation_5= rulePatternObjectCreation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getPatternObjectCreationParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PatternObjectCreation_5=rulePatternObjectCreation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PatternObjectCreation_5;
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
    // $ANTLR end "ruleGeneratorExpression"


    // $ANTLR start "entryRulePatternObjectCreation"
    // InternalMGLang.g:1948:1: entryRulePatternObjectCreation returns [EObject current=null] : iv_rulePatternObjectCreation= rulePatternObjectCreation EOF ;
    public final EObject entryRulePatternObjectCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternObjectCreation = null;


        try {
            // InternalMGLang.g:1948:62: (iv_rulePatternObjectCreation= rulePatternObjectCreation EOF )
            // InternalMGLang.g:1949:2: iv_rulePatternObjectCreation= rulePatternObjectCreation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternObjectCreationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternObjectCreation=rulePatternObjectCreation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternObjectCreation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternObjectCreation"


    // $ANTLR start "rulePatternObjectCreation"
    // InternalMGLang.g:1955:1: rulePatternObjectCreation returns [EObject current=null] : ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) ) ;
    public final EObject rulePatternObjectCreation() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGNMENT_OP_1=null;
        EObject lv_pObject_0_0 = null;

        EObject lv_patternCall_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1961:2: ( ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) ) )
            // InternalMGLang.g:1962:2: ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) )
            {
            // InternalMGLang.g:1962:2: ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) )
            // InternalMGLang.g:1963:3: ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) )
            {
            // InternalMGLang.g:1963:3: ( (lv_pObject_0_0= rulePatternObject ) )
            // InternalMGLang.g:1964:4: (lv_pObject_0_0= rulePatternObject )
            {
            // InternalMGLang.g:1964:4: (lv_pObject_0_0= rulePatternObject )
            // InternalMGLang.g:1965:5: lv_pObject_0_0= rulePatternObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternObjectCreationAccess().getPObjectPatternObjectParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_pObject_0_0=rulePatternObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternObjectCreationRule());
              					}
              					set(
              						current,
              						"pObject",
              						lv_pObject_0_0,
              						"org.mofgen.MGLang.PatternObject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ASSIGNMENT_OP_1=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ASSIGNMENT_OP_1, grammarAccess.getPatternObjectCreationAccess().getASSIGNMENT_OPTerminalRuleCall_1());
              		
            }
            // InternalMGLang.g:1986:3: ( (lv_patternCall_2_0= rulePatternCall ) )
            // InternalMGLang.g:1987:4: (lv_patternCall_2_0= rulePatternCall )
            {
            // InternalMGLang.g:1987:4: (lv_patternCall_2_0= rulePatternCall )
            // InternalMGLang.g:1988:5: lv_patternCall_2_0= rulePatternCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternObjectCreationAccess().getPatternCallPatternCallParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_patternCall_2_0=rulePatternCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternObjectCreationRule());
              					}
              					set(
              						current,
              						"patternCall",
              						lv_patternCall_2_0,
              						"org.mofgen.MGLang.PatternCall");
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
    // $ANTLR end "rulePatternObjectCreation"


    // $ANTLR start "entryRulePatternObject"
    // InternalMGLang.g:2009:1: entryRulePatternObject returns [EObject current=null] : iv_rulePatternObject= rulePatternObject EOF ;
    public final EObject entryRulePatternObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternObject = null;


        try {
            // InternalMGLang.g:2009:54: (iv_rulePatternObject= rulePatternObject EOF )
            // InternalMGLang.g:2010:2: iv_rulePatternObject= rulePatternObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternObject=rulePatternObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternObject"


    // $ANTLR start "rulePatternObject"
    // InternalMGLang.g:2016:1: rulePatternObject returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePatternObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:2022:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:2023:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:2023:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:2024:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:2024:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:2025:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:2025:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:2026:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPatternObjectRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0());
              				
            }

            }


            }

            // InternalMGLang.g:2037:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:2038:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:2038:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:2039:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPatternObjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPatternObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "rulePatternObject"


    // $ANTLR start "entryRuleForStatement"
    // InternalMGLang.g:2059:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalMGLang.g:2059:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalMGLang.g:2060:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMGLang.g:2066:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2072:2: ( (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' ) )
            // InternalMGLang.g:2073:2: (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' )
            {
            // InternalMGLang.g:2073:2: (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' )
            // InternalMGLang.g:2074:3: otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            // InternalMGLang.g:2078:3: ( (lv_head_1_0= ruleForHead ) )
            // InternalMGLang.g:2079:4: (lv_head_1_0= ruleForHead )
            {
            // InternalMGLang.g:2079:4: (lv_head_1_0= ruleForHead )
            // InternalMGLang.g:2080:5: lv_head_1_0= ruleForHead
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getHeadForHeadParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_head_1_0=ruleForHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"head",
              						lv_head_1_0,
              						"org.mofgen.MGLang.ForHead");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMGLang.g:2101:3: ( (lv_body_3_0= ruleForBody ) )
            // InternalMGLang.g:2102:4: (lv_body_3_0= ruleForBody )
            {
            // InternalMGLang.g:2102:4: (lv_body_3_0= ruleForBody )
            // InternalMGLang.g:2103:5: lv_body_3_0= ruleForBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getBodyForBodyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_body_3_0=ruleForBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_3_0,
              						"org.mofgen.MGLang.ForBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleForHead"
    // InternalMGLang.g:2128:1: entryRuleForHead returns [EObject current=null] : iv_ruleForHead= ruleForHead EOF ;
    public final EObject entryRuleForHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForHead = null;


        try {
            // InternalMGLang.g:2128:48: (iv_ruleForHead= ruleForHead EOF )
            // InternalMGLang.g:2129:2: iv_ruleForHead= ruleForHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForHeadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForHead=ruleForHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForHead; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForHead"


    // $ANTLR start "ruleForHead"
    // InternalMGLang.g:2135:1: ruleForHead returns [EObject current=null] : (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead ) ;
    public final EObject ruleForHead() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralForHead_0 = null;

        EObject this_ForEachHead_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2141:2: ( (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead ) )
            // InternalMGLang.g:2142:2: (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead )
            {
            // InternalMGLang.g:2142:2: (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==33) ) {
                    alt29=2;
                }
                else if ( (LA29_1==32) ) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMGLang.g:2143:3: this_GeneralForHead_0= ruleGeneralForHead
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getForHeadAccess().getGeneralForHeadParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GeneralForHead_0=ruleGeneralForHead();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GeneralForHead_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2152:3: this_ForEachHead_1= ruleForEachHead
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getForHeadAccess().getForEachHeadParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForEachHead_1=ruleForEachHead();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForEachHead_1;
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
    // $ANTLR end "ruleForHead"


    // $ANTLR start "entryRuleGeneralForHead"
    // InternalMGLang.g:2164:1: entryRuleGeneralForHead returns [EObject current=null] : iv_ruleGeneralForHead= ruleGeneralForHead EOF ;
    public final EObject entryRuleGeneralForHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralForHead = null;


        try {
            // InternalMGLang.g:2164:55: (iv_ruleGeneralForHead= ruleGeneralForHead EOF )
            // InternalMGLang.g:2165:2: iv_ruleGeneralForHead= ruleGeneralForHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneralForHeadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGeneralForHead=ruleGeneralForHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneralForHead; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGeneralForHead"


    // $ANTLR start "ruleGeneralForHead"
    // InternalMGLang.g:2171:1: ruleGeneralForHead returns [EObject current=null] : ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) ) ;
    public final EObject ruleGeneralForHead() throws RecognitionException {
        EObject current = null;

        Token lv_iteratorVar_0_0=null;
        Token otherlv_1=null;
        EObject lv_range_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2177:2: ( ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) ) )
            // InternalMGLang.g:2178:2: ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) )
            {
            // InternalMGLang.g:2178:2: ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) )
            // InternalMGLang.g:2179:3: ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) )
            {
            // InternalMGLang.g:2179:3: ( (lv_iteratorVar_0_0= RULE_ID ) )
            // InternalMGLang.g:2180:4: (lv_iteratorVar_0_0= RULE_ID )
            {
            // InternalMGLang.g:2180:4: (lv_iteratorVar_0_0= RULE_ID )
            // InternalMGLang.g:2181:5: lv_iteratorVar_0_0= RULE_ID
            {
            lv_iteratorVar_0_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_iteratorVar_0_0, grammarAccess.getGeneralForHeadAccess().getIteratorVarIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGeneralForHeadRule());
              					}
              					setWithLastConsumed(
              						current,
              						"iteratorVar",
              						lv_iteratorVar_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGeneralForHeadAccess().getInKeyword_1());
              		
            }
            // InternalMGLang.g:2201:3: ( (lv_range_2_0= ruleForRange ) )
            // InternalMGLang.g:2202:4: (lv_range_2_0= ruleForRange )
            {
            // InternalMGLang.g:2202:4: (lv_range_2_0= ruleForRange )
            // InternalMGLang.g:2203:5: lv_range_2_0= ruleForRange
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGeneralForHeadAccess().getRangeForRangeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_range_2_0=ruleForRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGeneralForHeadRule());
              					}
              					set(
              						current,
              						"range",
              						lv_range_2_0,
              						"org.mofgen.MGLang.ForRange");
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
    // $ANTLR end "ruleGeneralForHead"


    // $ANTLR start "entryRuleForEachHead"
    // InternalMGLang.g:2224:1: entryRuleForEachHead returns [EObject current=null] : iv_ruleForEachHead= ruleForEachHead EOF ;
    public final EObject entryRuleForEachHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachHead = null;


        try {
            // InternalMGLang.g:2224:52: (iv_ruleForEachHead= ruleForEachHead EOF )
            // InternalMGLang.g:2225:2: iv_ruleForEachHead= ruleForEachHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForEachHeadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForEachHead=ruleForEachHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForEachHead; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForEachHead"


    // $ANTLR start "ruleForEachHead"
    // InternalMGLang.g:2231:1: ruleForEachHead returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) ) ;
    public final EObject ruleForEachHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_iteratorVar_4_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:2237:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) ) )
            // InternalMGLang.g:2238:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:2238:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) )
            // InternalMGLang.g:2239:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) )
            {
            // InternalMGLang.g:2239:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:2240:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:2240:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:2241:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForEachHeadRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getForEachHeadAccess().getSrcNodeOrParameterOrCollectionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForEachHeadAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalMGLang.g:2256:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:2257:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:2257:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:2258:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForEachHeadRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getForEachHeadAccess().getRefEReferenceCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalMGLang.g:2273:3: ( (lv_iteratorVar_4_0= RULE_ID ) )
            // InternalMGLang.g:2274:4: (lv_iteratorVar_4_0= RULE_ID )
            {
            // InternalMGLang.g:2274:4: (lv_iteratorVar_4_0= RULE_ID )
            // InternalMGLang.g:2275:5: lv_iteratorVar_4_0= RULE_ID
            {
            lv_iteratorVar_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_iteratorVar_4_0, grammarAccess.getForEachHeadAccess().getIteratorVarIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForEachHeadRule());
              					}
              					setWithLastConsumed(
              						current,
              						"iteratorVar",
              						lv_iteratorVar_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleForEachHead"


    // $ANTLR start "entryRuleForBody"
    // InternalMGLang.g:2295:1: entryRuleForBody returns [EObject current=null] : iv_ruleForBody= ruleForBody EOF ;
    public final EObject entryRuleForBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForBody = null;


        try {
            // InternalMGLang.g:2295:48: (iv_ruleForBody= ruleForBody EOF )
            // InternalMGLang.g:2296:2: iv_ruleForBody= ruleForBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForBody=ruleForBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForBody"


    // $ANTLR start "ruleForBody"
    // InternalMGLang.g:2302:1: ruleForBody returns [EObject current=null] : ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* ) ;
    public final EObject ruleForBody() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2308:2: ( ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* ) )
            // InternalMGLang.g:2309:2: ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* )
            {
            // InternalMGLang.g:2309:2: ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* )
            // InternalMGLang.g:2310:3: () ( (lv_commands_1_0= ruleGeneratorExpression ) )*
            {
            // InternalMGLang.g:2310:3: ()
            // InternalMGLang.g:2311:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForBodyAccess().getForBodyAction_0(),
              					current);
              			
            }

            }

            // InternalMGLang.g:2317:3: ( (lv_commands_1_0= ruleGeneratorExpression ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==31||LA30_0==34||LA30_0==36||(LA30_0>=40 && LA30_0<=41)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMGLang.g:2318:4: (lv_commands_1_0= ruleGeneratorExpression )
            	    {
            	    // InternalMGLang.g:2318:4: (lv_commands_1_0= ruleGeneratorExpression )
            	    // InternalMGLang.g:2319:5: lv_commands_1_0= ruleGeneratorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForBodyAccess().getCommandsGeneratorExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_commands_1_0=ruleGeneratorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForBodyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_1_0,
            	      						"org.mofgen.MGLang.GeneratorExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleForBody"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMGLang.g:2340:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalMGLang.g:2340:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMGLang.g:2341:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMGLang.g:2347:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' (otherlv_8= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_cond_3_0 = null;

        EObject lv_then_6_0 = null;

        EObject lv_elseIf_9_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2353:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' (otherlv_8= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse ) ) )? ) )
            // InternalMGLang.g:2354:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' (otherlv_8= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse ) ) )? )
            {
            // InternalMGLang.g:2354:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' (otherlv_8= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse ) ) )? )
            // InternalMGLang.g:2355:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' (otherlv_8= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse ) ) )?
            {
            // InternalMGLang.g:2355:3: ()
            // InternalMGLang.g:2356:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMGLang.g:2370:3: ( (lv_cond_3_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:2371:4: (lv_cond_3_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:2371:4: (lv_cond_3_0= ruleArithmeticExpression )
            // InternalMGLang.g:2372:5: lv_cond_3_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getCondArithmeticExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_cond_3_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_3_0,
              						"org.mofgen.MGLang.ArithmeticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalMGLang.g:2397:3: ( (lv_then_6_0= ruleGeneratorExpression ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==31||LA31_0==34||LA31_0==36||(LA31_0>=40 && LA31_0<=41)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMGLang.g:2398:4: (lv_then_6_0= ruleGeneratorExpression )
            	    {
            	    // InternalMGLang.g:2398:4: (lv_then_6_0= ruleGeneratorExpression )
            	    // InternalMGLang.g:2399:5: lv_then_6_0= ruleGeneratorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getThenGeneratorExpressionParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_then_6_0=ruleGeneratorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"then",
            	      						lv_then_6_0,
            	      						"org.mofgen.MGLang.GeneratorExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7());
              		
            }
            // InternalMGLang.g:2420:3: (otherlv_8= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMGLang.g:2421:4: otherlv_8= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getElseKeyword_8_0());
                      			
                    }
                    // InternalMGLang.g:2425:4: ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse ) )
                    // InternalMGLang.g:2426:5: ( ( ruleElseIfOrElse ) )=> (lv_elseIf_9_0= ruleElseIfOrElse )
                    {
                    // InternalMGLang.g:2430:5: (lv_elseIf_9_0= ruleElseIfOrElse )
                    // InternalMGLang.g:2431:6: lv_elseIf_9_0= ruleElseIfOrElse
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfElseIfOrElseParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseIf_9_0=ruleElseIfOrElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseIf",
                      							lv_elseIf_9_0,
                      							"org.mofgen.MGLang.ElseIfOrElse");
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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElseIfOrElse"
    // InternalMGLang.g:2453:1: entryRuleElseIfOrElse returns [EObject current=null] : iv_ruleElseIfOrElse= ruleElseIfOrElse EOF ;
    public final EObject entryRuleElseIfOrElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfOrElse = null;


        try {
            // InternalMGLang.g:2453:53: (iv_ruleElseIfOrElse= ruleElseIfOrElse EOF )
            // InternalMGLang.g:2454:2: iv_ruleElseIfOrElse= ruleElseIfOrElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfOrElseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseIfOrElse=ruleElseIfOrElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfOrElse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseIfOrElse"


    // $ANTLR start "ruleElseIfOrElse"
    // InternalMGLang.g:2460:1: ruleElseIfOrElse returns [EObject current=null] : ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleArithmeticExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleGeneratorExpression ) )* otherlv_6= '}' (otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) ) ) ) | this_ElseStatement_9= ruleElseStatement ) ;
    public final EObject ruleElseIfOrElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_cond_2_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_elseIf_8_0 = null;

        EObject this_ElseStatement_9 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2466:2: ( ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleArithmeticExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleGeneratorExpression ) )* otherlv_6= '}' (otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) ) ) ) | this_ElseStatement_9= ruleElseStatement ) )
            // InternalMGLang.g:2467:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleArithmeticExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleGeneratorExpression ) )* otherlv_6= '}' (otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) ) ) ) | this_ElseStatement_9= ruleElseStatement )
            {
            // InternalMGLang.g:2467:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleArithmeticExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleGeneratorExpression ) )* otherlv_6= '}' (otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) ) ) ) | this_ElseStatement_9= ruleElseStatement )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            else if ( (LA34_0==21) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMGLang.g:2468:3: (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleArithmeticExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleGeneratorExpression ) )* otherlv_6= '}' (otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) ) ) )
                    {
                    // InternalMGLang.g:2468:3: (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleArithmeticExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleGeneratorExpression ) )* otherlv_6= '}' (otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) ) ) )
                    // InternalMGLang.g:2469:4: otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleArithmeticExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleGeneratorExpression ) )* otherlv_6= '}' (otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) ) )
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getElseIfOrElseAccess().getIfKeyword_0_0());
                      			
                    }
                    otherlv_1=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getElseIfOrElseAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalMGLang.g:2477:4: ( (lv_cond_2_0= ruleArithmeticExpression ) )
                    // InternalMGLang.g:2478:5: (lv_cond_2_0= ruleArithmeticExpression )
                    {
                    // InternalMGLang.g:2478:5: (lv_cond_2_0= ruleArithmeticExpression )
                    // InternalMGLang.g:2479:6: lv_cond_2_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getElseIfOrElseAccess().getCondArithmeticExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_cond_2_0=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getElseIfOrElseRule());
                      						}
                      						set(
                      							current,
                      							"cond",
                      							lv_cond_2_0,
                      							"org.mofgen.MGLang.ArithmeticExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getElseIfOrElseAccess().getRightParenthesisKeyword_0_3());
                      			
                    }
                    otherlv_4=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getElseIfOrElseAccess().getLeftCurlyBracketKeyword_0_4());
                      			
                    }
                    // InternalMGLang.g:2504:4: ( (lv_then_5_0= ruleGeneratorExpression ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID||LA33_0==31||LA33_0==34||LA33_0==36||(LA33_0>=40 && LA33_0<=41)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMGLang.g:2505:5: (lv_then_5_0= ruleGeneratorExpression )
                    	    {
                    	    // InternalMGLang.g:2505:5: (lv_then_5_0= ruleGeneratorExpression )
                    	    // InternalMGLang.g:2506:6: lv_then_5_0= ruleGeneratorExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getElseIfOrElseAccess().getThenGeneratorExpressionParserRuleCall_0_5_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_32);
                    	    lv_then_5_0=ruleGeneratorExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getElseIfOrElseRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"then",
                    	      							lv_then_5_0,
                    	      							"org.mofgen.MGLang.GeneratorExpression");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,22,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getElseIfOrElseAccess().getRightCurlyBracketKeyword_0_6());
                      			
                    }
                    // InternalMGLang.g:2527:4: (otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) ) )
                    // InternalMGLang.g:2528:5: otherlv_7= 'else' ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getElseIfOrElseAccess().getElseKeyword_0_7_0());
                      				
                    }
                    // InternalMGLang.g:2532:5: ( ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse ) )
                    // InternalMGLang.g:2533:6: ( ( ruleElseIfOrElse ) )=> (lv_elseIf_8_0= ruleElseIfOrElse )
                    {
                    // InternalMGLang.g:2537:6: (lv_elseIf_8_0= ruleElseIfOrElse )
                    // InternalMGLang.g:2538:7: lv_elseIf_8_0= ruleElseIfOrElse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getElseIfOrElseAccess().getElseIfElseIfOrElseParserRuleCall_0_7_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseIf_8_0=ruleElseIfOrElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getElseIfOrElseRule());
                      							}
                      							set(
                      								current,
                      								"elseIf",
                      								lv_elseIf_8_0,
                      								"org.mofgen.MGLang.ElseIfOrElse");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2558:3: this_ElseStatement_9= ruleElseStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElseIfOrElseAccess().getElseStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ElseStatement_9=ruleElseStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ElseStatement_9;
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
    // $ANTLR end "ruleElseIfOrElse"


    // $ANTLR start "entryRuleElseStatement"
    // InternalMGLang.g:2570:1: entryRuleElseStatement returns [EObject current=null] : iv_ruleElseStatement= ruleElseStatement EOF ;
    public final EObject entryRuleElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseStatement = null;


        try {
            // InternalMGLang.g:2570:54: (iv_ruleElseStatement= ruleElseStatement EOF )
            // InternalMGLang.g:2571:2: iv_ruleElseStatement= ruleElseStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseStatement=ruleElseStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseStatement"


    // $ANTLR start "ruleElseStatement"
    // InternalMGLang.g:2577:1: ruleElseStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_else_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2583:2: ( ( () otherlv_1= '{' ( (lv_else_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) )
            // InternalMGLang.g:2584:2: ( () otherlv_1= '{' ( (lv_else_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' )
            {
            // InternalMGLang.g:2584:2: ( () otherlv_1= '{' ( (lv_else_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' )
            // InternalMGLang.g:2585:3: () otherlv_1= '{' ( (lv_else_2_0= ruleGeneratorExpression ) )* otherlv_3= '}'
            {
            // InternalMGLang.g:2585:3: ()
            // InternalMGLang.g:2586:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElseStatementAccess().getElseStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElseStatementAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMGLang.g:2596:3: ( (lv_else_2_0= ruleGeneratorExpression ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==31||LA35_0==34||LA35_0==36||(LA35_0>=40 && LA35_0<=41)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMGLang.g:2597:4: (lv_else_2_0= ruleGeneratorExpression )
            	    {
            	    // InternalMGLang.g:2597:4: (lv_else_2_0= ruleGeneratorExpression )
            	    // InternalMGLang.g:2598:5: lv_else_2_0= ruleGeneratorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseStatementAccess().getElseGeneratorExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_else_2_0=ruleGeneratorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getElseStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"else",
            	      						lv_else_2_0,
            	      						"org.mofgen.MGLang.GeneratorExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElseStatementAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleElseStatement"


    // $ANTLR start "entryRuleSwitchCase"
    // InternalMGLang.g:2623:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalMGLang.g:2623:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalMGLang.g:2624:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // InternalMGLang.g:2630:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleParameterRefOrMethodCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) ) ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_attribute_2_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_default_6_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2636:2: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleParameterRefOrMethodCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) ) ) )
            // InternalMGLang.g:2637:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleParameterRefOrMethodCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) ) )
            {
            // InternalMGLang.g:2637:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleParameterRefOrMethodCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) ) )
            // InternalMGLang.g:2638:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleParameterRefOrMethodCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSwitchCaseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMGLang.g:2646:3: ( (lv_attribute_2_0= ruleParameterRefOrMethodCall ) )
            // InternalMGLang.g:2647:4: (lv_attribute_2_0= ruleParameterRefOrMethodCall )
            {
            // InternalMGLang.g:2647:4: (lv_attribute_2_0= ruleParameterRefOrMethodCall )
            // InternalMGLang.g:2648:5: lv_attribute_2_0= ruleParameterRefOrMethodCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchCaseAccess().getAttributeParameterRefOrMethodCallParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_attribute_2_0=ruleParameterRefOrMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              					}
              					set(
              						current,
              						"attribute",
              						lv_attribute_2_0,
              						"org.mofgen.MGLang.ParameterRefOrMethodCall");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMGLang.g:2673:3: ( (lv_cases_5_0= ruleCase ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==39) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMGLang.g:2674:4: (lv_cases_5_0= ruleCase )
            	    {
            	    // InternalMGLang.g:2674:4: (lv_cases_5_0= ruleCase )
            	    // InternalMGLang.g:2675:5: lv_cases_5_0= ruleCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseAccess().getCasesCaseParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_cases_5_0=ruleCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cases",
            	      						lv_cases_5_0,
            	      						"org.mofgen.MGLang.Case");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // InternalMGLang.g:2692:3: ( (lv_default_6_0= ruleDefault ) )
            // InternalMGLang.g:2693:4: (lv_default_6_0= ruleDefault )
            {
            // InternalMGLang.g:2693:4: (lv_default_6_0= ruleDefault )
            // InternalMGLang.g:2694:5: lv_default_6_0= ruleDefault
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchCaseAccess().getDefaultDefaultParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_default_6_0=ruleDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              					}
              					set(
              						current,
              						"default",
              						lv_default_6_0,
              						"org.mofgen.MGLang.Default");
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
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleDefault"
    // InternalMGLang.g:2715:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalMGLang.g:2715:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalMGLang.g:2716:2: iv_ruleDefault= ruleDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefault; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalMGLang.g:2722:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' this_GeneratorExpression_2= ruleGeneratorExpression ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_GeneratorExpression_2 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2728:2: ( (otherlv_0= 'default' otherlv_1= ':' this_GeneratorExpression_2= ruleGeneratorExpression ) )
            // InternalMGLang.g:2729:2: (otherlv_0= 'default' otherlv_1= ':' this_GeneratorExpression_2= ruleGeneratorExpression )
            {
            // InternalMGLang.g:2729:2: (otherlv_0= 'default' otherlv_1= ':' this_GeneratorExpression_2= ruleGeneratorExpression )
            // InternalMGLang.g:2730:3: otherlv_0= 'default' otherlv_1= ':' this_GeneratorExpression_2= ruleGeneratorExpression
            {
            otherlv_0=(Token)match(input,37,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDefaultKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,38,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefaultAccess().getGeneratorExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_GeneratorExpression_2=ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_GeneratorExpression_2;
              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleCase"
    // InternalMGLang.g:2750:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalMGLang.g:2750:45: (iv_ruleCase= ruleCase EOF )
            // InternalMGLang.g:2751:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalMGLang.g:2757:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2763:2: ( (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) ) )
            // InternalMGLang.g:2764:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) )
            {
            // InternalMGLang.g:2764:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) )
            // InternalMGLang.g:2765:3: otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
              		
            }
            // InternalMGLang.g:2769:3: ( (lv_val_1_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:2770:4: (lv_val_1_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:2770:4: (lv_val_1_0= ruleArithmeticExpression )
            // InternalMGLang.g:2771:5: lv_val_1_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseAccess().getValArithmeticExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_val_1_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseRule());
              					}
              					set(
              						current,
              						"val",
              						lv_val_1_0,
              						"org.mofgen.MGLang.ArithmeticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_2());
              		
            }
            // InternalMGLang.g:2792:3: ( (lv_body_3_0= ruleCaseBody ) )
            // InternalMGLang.g:2793:4: (lv_body_3_0= ruleCaseBody )
            {
            // InternalMGLang.g:2793:4: (lv_body_3_0= ruleCaseBody )
            // InternalMGLang.g:2794:5: lv_body_3_0= ruleCaseBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseAccess().getBodyCaseBodyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleCaseBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_3_0,
              						"org.mofgen.MGLang.CaseBody");
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleCaseBody"
    // InternalMGLang.g:2815:1: entryRuleCaseBody returns [EObject current=null] : iv_ruleCaseBody= ruleCaseBody EOF ;
    public final EObject entryRuleCaseBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseBody = null;


        try {
            // InternalMGLang.g:2815:49: (iv_ruleCaseBody= ruleCaseBody EOF )
            // InternalMGLang.g:2816:2: iv_ruleCaseBody= ruleCaseBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseBody=ruleCaseBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCaseBody"


    // $ANTLR start "ruleCaseBody"
    // InternalMGLang.g:2822:1: ruleCaseBody returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) | ( (lv_expressions_4_0= ruleGeneratorExpression ) ) ) ;
    public final EObject ruleCaseBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2828:2: ( ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) | ( (lv_expressions_4_0= ruleGeneratorExpression ) ) ) )
            // InternalMGLang.g:2829:2: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) | ( (lv_expressions_4_0= ruleGeneratorExpression ) ) )
            {
            // InternalMGLang.g:2829:2: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) | ( (lv_expressions_4_0= ruleGeneratorExpression ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID||LA38_0==31||LA38_0==34||LA38_0==36||(LA38_0>=40 && LA38_0<=41)) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMGLang.g:2830:3: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' )
                    {
                    // InternalMGLang.g:2830:3: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' )
                    // InternalMGLang.g:2831:4: () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}'
                    {
                    // InternalMGLang.g:2831:4: ()
                    // InternalMGLang.g:2832:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCaseBodyAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalMGLang.g:2842:4: ( (lv_expressions_2_0= ruleGeneratorExpression ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID||LA37_0==31||LA37_0==34||LA37_0==36||(LA37_0>=40 && LA37_0<=41)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMGLang.g:2843:5: (lv_expressions_2_0= ruleGeneratorExpression )
                    	    {
                    	    // InternalMGLang.g:2843:5: (lv_expressions_2_0= ruleGeneratorExpression )
                    	    // InternalMGLang.g:2844:6: lv_expressions_2_0= ruleGeneratorExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_0_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_32);
                    	    lv_expressions_2_0=ruleGeneratorExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getCaseBodyRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"expressions",
                    	      							lv_expressions_2_0,
                    	      							"org.mofgen.MGLang.GeneratorExpression");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCaseBodyAccess().getRightCurlyBracketKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2867:3: ( (lv_expressions_4_0= ruleGeneratorExpression ) )
                    {
                    // InternalMGLang.g:2867:3: ( (lv_expressions_4_0= ruleGeneratorExpression ) )
                    // InternalMGLang.g:2868:4: (lv_expressions_4_0= ruleGeneratorExpression )
                    {
                    // InternalMGLang.g:2868:4: (lv_expressions_4_0= ruleGeneratorExpression )
                    // InternalMGLang.g:2869:5: lv_expressions_4_0= ruleGeneratorExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressions_4_0=ruleGeneratorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCaseBodyRule());
                      					}
                      					add(
                      						current,
                      						"expressions",
                      						lv_expressions_4_0,
                      						"org.mofgen.MGLang.GeneratorExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

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
    // $ANTLR end "ruleCaseBody"


    // $ANTLR start "entryRuleCollection"
    // InternalMGLang.g:2890:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMGLang.g:2890:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMGLang.g:2891:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMGLang.g:2897:1: ruleCollection returns [EObject current=null] : (this_List_0= ruleList | this_Map_1= ruleMap ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject this_List_0 = null;

        EObject this_Map_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2903:2: ( (this_List_0= ruleList | this_Map_1= ruleMap ) )
            // InternalMGLang.g:2904:2: (this_List_0= ruleList | this_Map_1= ruleMap )
            {
            // InternalMGLang.g:2904:2: (this_List_0= ruleList | this_Map_1= ruleMap )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            else if ( (LA39_0==41) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMGLang.g:2905:3: this_List_0= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCollectionAccess().getListParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_List_0=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_List_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2914:3: this_Map_1= ruleMap
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCollectionAccess().getMapParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Map_1=ruleMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Map_1;
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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleList"
    // InternalMGLang.g:2926:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalMGLang.g:2926:45: (iv_ruleList= ruleList EOF )
            // InternalMGLang.g:2927:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMGLang.g:2933:1: ruleList returns [EObject current=null] : (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAdHoc_3= ruleListAdHoc ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_2=null;
        EObject this_ListAdHoc_3 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2939:2: ( (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAdHoc_3= ruleListAdHoc ) ) )
            // InternalMGLang.g:2940:2: (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAdHoc_3= ruleListAdHoc ) )
            {
            // InternalMGLang.g:2940:2: (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAdHoc_3= ruleListAdHoc ) )
            // InternalMGLang.g:2941:3: otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAdHoc_3= ruleListAdHoc )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
              		
            }
            // InternalMGLang.g:2945:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:2946:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:2946:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:2947:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getListAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getListRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMGLang.g:2963:3: (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAdHoc_3= ruleListAdHoc )
            // InternalMGLang.g:2964:4: this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAdHoc_3= ruleListAdHoc
            {
            this_ASSIGNMENT_OP_2=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(this_ASSIGNMENT_OP_2, grammarAccess.getListAccess().getASSIGNMENT_OPTerminalRuleCall_2_0());
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getListAccess().getListAdHocParserRuleCall_2_1());
              			
            }
            pushFollow(FOLLOW_2);
            this_ListAdHoc_3=ruleListAdHoc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_ListAdHoc_3;
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleListAdHoc"
    // InternalMGLang.g:2981:1: entryRuleListAdHoc returns [EObject current=null] : iv_ruleListAdHoc= ruleListAdHoc EOF ;
    public final EObject entryRuleListAdHoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAdHoc = null;


        try {
            // InternalMGLang.g:2981:50: (iv_ruleListAdHoc= ruleListAdHoc EOF )
            // InternalMGLang.g:2982:2: iv_ruleListAdHoc= ruleListAdHoc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListAdHocRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListAdHoc=ruleListAdHoc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListAdHoc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListAdHoc"


    // $ANTLR start "ruleListAdHoc"
    // InternalMGLang.g:2988:1: ruleListAdHoc returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListAdHoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_elements_1_0 = null;

        AntlrDatatypeRuleToken lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2994:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' ) )
            // InternalMGLang.g:2995:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' )
            {
            // InternalMGLang.g:2995:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' )
            // InternalMGLang.g:2996:3: otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMGLang.g:3000:3: ( (lv_elements_1_0= ruleLiteral ) )
            // InternalMGLang.g:3001:4: (lv_elements_1_0= ruleLiteral )
            {
            // InternalMGLang.g:3001:4: (lv_elements_1_0= ruleLiteral )
            // InternalMGLang.g:3002:5: lv_elements_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_elements_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListAdHocRule());
              					}
              					add(
              						current,
              						"elements",
              						lv_elements_1_0,
              						"org.mofgen.MGLang.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGLang.g:3019:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMGLang.g:3020:4: otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getListAdHocAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMGLang.g:3024:4: ( (lv_elements_3_0= ruleLiteral ) )
            	    // InternalMGLang.g:3025:5: (lv_elements_3_0= ruleLiteral )
            	    {
            	    // InternalMGLang.g:3025:5: (lv_elements_3_0= ruleLiteral )
            	    // InternalMGLang.g:3026:6: lv_elements_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_elements_3_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getListAdHocRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_3_0,
            	      							"org.mofgen.MGLang.Literal");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleListAdHoc"


    // $ANTLR start "entryRuleMap"
    // InternalMGLang.g:3052:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalMGLang.g:3052:44: (iv_ruleMap= ruleMap EOF )
            // InternalMGLang.g:3053:2: iv_ruleMap= ruleMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMap; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalMGLang.g:3059:1: ruleMap returns [EObject current=null] : (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAdHoc_3= ruleMapAdHoc ) ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_2=null;
        EObject this_MapAdHoc_3 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3065:2: ( (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAdHoc_3= ruleMapAdHoc ) ) )
            // InternalMGLang.g:3066:2: (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAdHoc_3= ruleMapAdHoc ) )
            {
            // InternalMGLang.g:3066:2: (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAdHoc_3= ruleMapAdHoc ) )
            // InternalMGLang.g:3067:3: otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAdHoc_3= ruleMapAdHoc )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getMapKeyword_0());
              		
            }
            // InternalMGLang.g:3071:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:3072:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:3072:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:3073:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMapAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMGLang.g:3089:3: (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAdHoc_3= ruleMapAdHoc )
            // InternalMGLang.g:3090:4: this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAdHoc_3= ruleMapAdHoc
            {
            this_ASSIGNMENT_OP_2=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(this_ASSIGNMENT_OP_2, grammarAccess.getMapAccess().getASSIGNMENT_OPTerminalRuleCall_2_0());
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMapAccess().getMapAdHocParserRuleCall_2_1());
              			
            }
            pushFollow(FOLLOW_2);
            this_MapAdHoc_3=ruleMapAdHoc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_MapAdHoc_3;
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapAdHoc"
    // InternalMGLang.g:3107:1: entryRuleMapAdHoc returns [EObject current=null] : iv_ruleMapAdHoc= ruleMapAdHoc EOF ;
    public final EObject entryRuleMapAdHoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapAdHoc = null;


        try {
            // InternalMGLang.g:3107:49: (iv_ruleMapAdHoc= ruleMapAdHoc EOF )
            // InternalMGLang.g:3108:2: iv_ruleMapAdHoc= ruleMapAdHoc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapAdHocRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapAdHoc=ruleMapAdHoc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapAdHoc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapAdHoc"


    // $ANTLR start "ruleMapAdHoc"
    // InternalMGLang.g:3114:1: ruleMapAdHoc returns [EObject current=null] : (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMapAdHoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3120:2: ( (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' ) )
            // InternalMGLang.g:3121:2: (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' )
            {
            // InternalMGLang.g:3121:2: (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' )
            // InternalMGLang.g:3122:3: otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMGLang.g:3126:3: ( (lv_entries_1_0= ruleMapTupel ) )
            // InternalMGLang.g:3127:4: (lv_entries_1_0= ruleMapTupel )
            {
            // InternalMGLang.g:3127:4: (lv_entries_1_0= ruleMapTupel )
            // InternalMGLang.g:3128:5: lv_entries_1_0= ruleMapTupel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_entries_1_0=ruleMapTupel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapAdHocRule());
              					}
              					add(
              						current,
              						"entries",
              						lv_entries_1_0,
              						"org.mofgen.MGLang.MapTupel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMGLang.g:3145:3: (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==19) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMGLang.g:3146:4: otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getMapAdHocAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMGLang.g:3150:4: ( (lv_entries_3_0= ruleMapTupel ) )
            	    // InternalMGLang.g:3151:5: (lv_entries_3_0= ruleMapTupel )
            	    {
            	    // InternalMGLang.g:3151:5: (lv_entries_3_0= ruleMapTupel )
            	    // InternalMGLang.g:3152:6: lv_entries_3_0= ruleMapTupel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_entries_3_0=ruleMapTupel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMapAdHocRule());
            	      						}
            	      						add(
            	      							current,
            	      							"entries",
            	      							lv_entries_3_0,
            	      							"org.mofgen.MGLang.MapTupel");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleMapAdHoc"


    // $ANTLR start "entryRuleMapTupel"
    // InternalMGLang.g:3178:1: entryRuleMapTupel returns [EObject current=null] : iv_ruleMapTupel= ruleMapTupel EOF ;
    public final EObject entryRuleMapTupel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTupel = null;


        try {
            // InternalMGLang.g:3178:49: (iv_ruleMapTupel= ruleMapTupel EOF )
            // InternalMGLang.g:3179:2: iv_ruleMapTupel= ruleMapTupel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTupelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapTupel=ruleMapTupel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTupel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapTupel"


    // $ANTLR start "ruleMapTupel"
    // InternalMGLang.g:3185:1: ruleMapTupel returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMapTupel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3191:2: ( (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' ) )
            // InternalMGLang.g:3192:2: (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' )
            {
            // InternalMGLang.g:3192:2: (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' )
            // InternalMGLang.g:3193:3: otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMapTupelAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMGLang.g:3197:3: ( (lv_key_1_0= ruleLiteral ) )
            // InternalMGLang.g:3198:4: (lv_key_1_0= ruleLiteral )
            {
            // InternalMGLang.g:3198:4: (lv_key_1_0= ruleLiteral )
            // InternalMGLang.g:3199:5: lv_key_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapTupelAccess().getKeyLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_key_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapTupelRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_1_0,
              						"org.mofgen.MGLang.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMapTupelAccess().getCommaKeyword_2());
              		
            }
            // InternalMGLang.g:3220:3: ( (lv_value_3_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:3221:4: (lv_value_3_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:3221:4: (lv_value_3_0= ruleArithmeticExpression )
            // InternalMGLang.g:3222:5: lv_value_3_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapTupelAccess().getValueArithmeticExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_value_3_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapTupelRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"org.mofgen.MGLang.ArithmeticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMapTupelAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleMapTupel"


    // $ANTLR start "entryRuleForRange"
    // InternalMGLang.g:3247:1: entryRuleForRange returns [EObject current=null] : iv_ruleForRange= ruleForRange EOF ;
    public final EObject entryRuleForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForRange = null;


        try {
            // InternalMGLang.g:3247:49: (iv_ruleForRange= ruleForRange EOF )
            // InternalMGLang.g:3248:2: iv_ruleForRange= ruleForRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForRange=ruleForRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForRange; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForRange"


    // $ANTLR start "ruleForRange"
    // InternalMGLang.g:3254:1: ruleForRange returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleForRange() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:3260:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalMGLang.g:3261:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalMGLang.g:3261:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalMGLang.g:3262:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalMGLang.g:3262:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalMGLang.g:3263:4: (lv_start_0_0= RULE_INT )
            {
            // InternalMGLang.g:3263:4: (lv_start_0_0= RULE_INT )
            // InternalMGLang.g:3264:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_start_0_0, grammarAccess.getForRangeAccess().getStartINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForRangeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"start",
              						lv_start_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForRangeAccess().getColonKeyword_1());
              		
            }
            // InternalMGLang.g:3284:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalMGLang.g:3285:4: (lv_end_2_0= RULE_INT )
            {
            // InternalMGLang.g:3285:4: (lv_end_2_0= RULE_INT )
            // InternalMGLang.g:3286:5: lv_end_2_0= RULE_INT
            {
            lv_end_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_end_2_0, grammarAccess.getForRangeAccess().getEndINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForRangeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"end",
              						lv_end_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
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
    // $ANTLR end "ruleForRange"


    // $ANTLR start "ruleMathFunc"
    // InternalMGLang.g:3306:1: ruleMathFunc returns [Enumerator current=null] : ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) ) ;
    public final Enumerator ruleMathFunc() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:3312:2: ( ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) ) )
            // InternalMGLang.g:3313:2: ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) )
            {
            // InternalMGLang.g:3313:2: ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            else if ( (LA42_0==43) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMGLang.g:3314:3: (enumLiteral_0= 'sqrt' )
                    {
                    // InternalMGLang.g:3314:3: (enumLiteral_0= 'sqrt' )
                    // InternalMGLang.g:3315:4: enumLiteral_0= 'sqrt'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3322:3: (enumLiteral_1= 'abs' )
                    {
                    // InternalMGLang.g:3322:3: (enumLiteral_1= 'abs' )
                    // InternalMGLang.g:3323:4: enumLiteral_1= 'abs'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleMathFunc"


    // $ANTLR start "rulePrimitiveType"
    // InternalMGLang.g:3333:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMGLang.g:3339:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) )
            // InternalMGLang.g:3340:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            {
            // InternalMGLang.g:3340:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt43=1;
                }
                break;
            case 45:
                {
                alt43=2;
                }
                break;
            case 46:
                {
                alt43=3;
                }
                break;
            case 47:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalMGLang.g:3341:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMGLang.g:3341:3: (enumLiteral_0= 'int' )
                    // InternalMGLang.g:3342:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3349:3: (enumLiteral_1= 'char' )
                    {
                    // InternalMGLang.g:3349:3: (enumLiteral_1= 'char' )
                    // InternalMGLang.g:3350:4: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3357:3: (enumLiteral_2= 'double' )
                    {
                    // InternalMGLang.g:3357:3: (enumLiteral_2= 'double' )
                    // InternalMGLang.g:3358:4: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:3365:3: (enumLiteral_3= 'String' )
                    {
                    // InternalMGLang.g:3365:3: (enumLiteral_3= 'String' )
                    // InternalMGLang.g:3366:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleRelationalOp"
    // InternalMGLang.g:3376:1: ruleRelationalOp returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleRelationalOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMGLang.g:3382:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalMGLang.g:3383:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalMGLang.g:3383:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt44=1;
                }
                break;
            case 49:
                {
                alt44=2;
                }
                break;
            case 50:
                {
                alt44=3;
                }
                break;
            case 51:
                {
                alt44=4;
                }
                break;
            case 52:
                {
                alt44=5;
                }
                break;
            case 53:
                {
                alt44=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMGLang.g:3384:3: (enumLiteral_0= '>' )
                    {
                    // InternalMGLang.g:3384:3: (enumLiteral_0= '>' )
                    // InternalMGLang.g:3385:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3392:3: (enumLiteral_1= '>=' )
                    {
                    // InternalMGLang.g:3392:3: (enumLiteral_1= '>=' )
                    // InternalMGLang.g:3393:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3400:3: (enumLiteral_2= '==' )
                    {
                    // InternalMGLang.g:3400:3: (enumLiteral_2= '==' )
                    // InternalMGLang.g:3401:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:3408:3: (enumLiteral_3= '!=' )
                    {
                    // InternalMGLang.g:3408:3: (enumLiteral_3= '!=' )
                    // InternalMGLang.g:3409:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:3416:3: (enumLiteral_4= '<=' )
                    {
                    // InternalMGLang.g:3416:3: (enumLiteral_4= '<=' )
                    // InternalMGLang.g:3417:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:3424:3: (enumLiteral_5= '<' )
                    {
                    // InternalMGLang.g:3424:3: (enumLiteral_5= '<' )
                    // InternalMGLang.g:3425:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5());
                      			
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
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "ruleTertiaryOp"
    // InternalMGLang.g:3435:1: ruleTertiaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) ) ;
    public final Enumerator ruleTertiaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:3441:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) ) )
            // InternalMGLang.g:3442:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) )
            {
            // InternalMGLang.g:3442:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt45=1;
                }
                break;
            case 33:
                {
                alt45=2;
                }
                break;
            case 55:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalMGLang.g:3443:3: (enumLiteral_0= '+' )
                    {
                    // InternalMGLang.g:3443:3: (enumLiteral_0= '+' )
                    // InternalMGLang.g:3444:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3451:3: (enumLiteral_1= '-' )
                    {
                    // InternalMGLang.g:3451:3: (enumLiteral_1= '-' )
                    // InternalMGLang.g:3452:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3459:3: (enumLiteral_2= '||' )
                    {
                    // InternalMGLang.g:3459:3: (enumLiteral_2= '||' )
                    // InternalMGLang.g:3460:4: enumLiteral_2= '||'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleTertiaryOp"


    // $ANTLR start "ruleSecondaryOp"
    // InternalMGLang.g:3470:1: ruleSecondaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) ) ;
    public final Enumerator ruleSecondaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:3476:2: ( ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) ) )
            // InternalMGLang.g:3477:2: ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) )
            {
            // InternalMGLang.g:3477:2: ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            else if ( (LA46_0==57) ) {
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
                    // InternalMGLang.g:3478:3: (enumLiteral_0= '%' )
                    {
                    // InternalMGLang.g:3478:3: (enumLiteral_0= '%' )
                    // InternalMGLang.g:3479:4: enumLiteral_0= '%'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3486:3: (enumLiteral_1= '^' )
                    {
                    // InternalMGLang.g:3486:3: (enumLiteral_1= '^' )
                    // InternalMGLang.g:3487:4: enumLiteral_1= '^'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleSecondaryOp"


    // $ANTLR start "rulePrimaryOp"
    // InternalMGLang.g:3497:1: rulePrimaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) ) ;
    public final Enumerator rulePrimaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:3503:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) ) )
            // InternalMGLang.g:3504:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) )
            {
            // InternalMGLang.g:3504:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt47=1;
                }
                break;
            case 59:
                {
                alt47=2;
                }
                break;
            case 60:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalMGLang.g:3505:3: (enumLiteral_0= '*' )
                    {
                    // InternalMGLang.g:3505:3: (enumLiteral_0= '*' )
                    // InternalMGLang.g:3506:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3513:3: (enumLiteral_1= '/' )
                    {
                    // InternalMGLang.g:3513:3: (enumLiteral_1= '/' )
                    // InternalMGLang.g:3514:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3521:3: (enumLiteral_2= '&&' )
                    {
                    // InternalMGLang.g:3521:3: (enumLiteral_2= '&&' )
                    // InternalMGLang.g:3522:4: enumLiteral_2= '&&'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "rulePrimaryOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040028002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000F00000100020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000F00000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000030000400020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000C00201403B0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000C00200403B0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00C0000200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x003F000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000031480400020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000031480000022L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000031480000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000031480200020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000390L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000080000L});

}
