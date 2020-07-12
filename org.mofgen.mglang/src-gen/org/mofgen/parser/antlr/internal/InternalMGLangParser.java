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

@SuppressWarnings("all")
public class InternalMGLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ASSIGNMENT_OP", "RULE_NEWLINE", "RULE_INT", "RULE_TRUE", "RULE_FALSE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'as'", "'pattern'", "'('", "','", "')'", "'{'", "'}'", "'return'", "'this'", "'.'", "'->'", "'gen'", "'for'", "'in'", "'-'", "'switch'", "'case'", "':'", "'default'", "'when'", "'List'", "'['", "']'", "'Map'", "'!'", "'sqrt'", "'abs'", "'int'", "'char'", "'double'", "'String'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'+'", "'||'", "'%'", "'^'", "'*'", "'/'", "'&&'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_FALSE=10;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=4;
    public static final int RULE_ASSIGNMENT_OP=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_TRUE=9;
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
             newCompositeNode(grammarAccess.getMofgenFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMofgenFile=ruleMofgenFile();

            state._fsp--;

             current =iv_ruleMofgenFile; 
            match(input,EOF,FOLLOW_2); 

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

            	    					newCompositeNode(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


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
                else if ( (LA2_0==27) ) {
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

            	    						newCompositeNode(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_patterns_1_0=rulePattern();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_generators_2_0=ruleGenerator();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMGLang.g:163:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMGLang.g:164:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMGLang.g:164:4: (lv_name_1_0= RULE_STRING )
            // InternalMGLang.g:165:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
            		
            // InternalMGLang.g:185:3: ( (lv_alias_3_0= RULE_ID ) )
            // InternalMGLang.g:186:4: (lv_alias_3_0= RULE_ID )
            {
            // InternalMGLang.g:186:4: (lv_alias_3_0= RULE_ID )
            // InternalMGLang.g:187:5: lv_alias_3_0= RULE_ID
            {
            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_alias_3_0, grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_3_0());
            				

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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:214:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )? ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_13=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_colls_9_0 = null;

        EObject lv_nodes_10_0 = null;

        EObject lv_paramManipulations_11_0 = null;

        EObject lv_switches_12_0 = null;

        EObject lv_return_14_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:220:2: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )? ) )
            // InternalMGLang.g:221:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )? )
            {
            // InternalMGLang.g:221:2: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )? )
            // InternalMGLang.g:222:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) ) otherlv_13= '}' ( (lv_return_14_0= rulePatternReturn ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
            		
            // InternalMGLang.g:226:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:227:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:227:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:228:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalMGLang.g:244:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            // InternalMGLang.g:245:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            				newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalMGLang.g:249:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=43 && LA4_0<=46)) ) {
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

                    							newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


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
                    	    otherlv_4=(Token)match(input,19,FOLLOW_11); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0());
                    	    					
                    	    // InternalMGLang.g:274:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMGLang.g:275:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMGLang.g:275:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMGLang.g:276:8: lv_parameters_5_0= ruleParameter
                    	    {

                    	    								newCompositeNode(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_12); 

            				newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2());
            			

            }

            otherlv_7=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMGLang.g:304:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) ) )
            // InternalMGLang.g:305:4: ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) )
            {
            // InternalMGLang.g:305:4: ( ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* ) )
            // InternalMGLang.g:306:5: ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            				
            // InternalMGLang.g:309:5: ( ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )* )
            // InternalMGLang.g:310:6: ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )*
            {
            // InternalMGLang.g:310:6: ( ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_nodes_10_0= ruleNode ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_paramManipulations_11_0= ruleParamManipulation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) ) )*
            loop9:
            do {
                int alt9=5;
                int LA9_0 = input.LA(1);

                if ( ( LA9_0 == 36 || LA9_0 == 39 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                    int LA9_3 = input.LA(2);

                    if ( LA9_3 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                        alt9=3;
                    }
                    else if ( LA9_3 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                        alt9=2;
                    }


                }
                else if ( LA9_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                    alt9=4;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMGLang.g:311:4: ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:311:4: ({...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ ) )
            	    // InternalMGLang.g:312:5: {...}? => ( ({...}? => ( (lv_colls_9_0= ruleCollection ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
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

            	        if ( (LA5_0==36) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }
            	        else if ( (LA5_0==39) ) {
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
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:316:19: ( (lv_colls_9_0= ruleCollection ) )
            	    	    // InternalMGLang.g:316:20: (lv_colls_9_0= ruleCollection )
            	    	    {
            	    	    // InternalMGLang.g:316:20: (lv_colls_9_0= ruleCollection )
            	    	    // InternalMGLang.g:317:10: lv_colls_9_0= ruleCollection
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPatternAccess().getCollsCollectionParserRuleCall_4_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_colls_9_0=ruleCollection();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
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
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:344:19: ( (lv_nodes_10_0= ruleNode ) )
            	    	    // InternalMGLang.g:344:20: (lv_nodes_10_0= ruleNode )
            	    	    {
            	    	    // InternalMGLang.g:344:20: (lv_nodes_10_0= ruleNode )
            	    	    // InternalMGLang.g:345:10: lv_nodes_10_0= ruleNode
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPatternAccess().getNodesNodeParserRuleCall_4_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_nodes_10_0=ruleNode();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
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
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:372:19: ( (lv_paramManipulations_11_0= ruleParamManipulation ) )
            	    	    // InternalMGLang.g:372:20: (lv_paramManipulations_11_0= ruleParamManipulation )
            	    	    {
            	    	    // InternalMGLang.g:372:20: (lv_paramManipulations_11_0= ruleParamManipulation )
            	    	    // InternalMGLang.g:373:10: lv_paramManipulations_11_0= ruleParamManipulation
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPatternAccess().getParamManipulationsParamManipulationParserRuleCall_4_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_paramManipulations_11_0=ruleParamManipulation();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
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
            	case 4 :
            	    // InternalMGLang.g:395:4: ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) )
            	    {
            	    // InternalMGLang.g:395:4: ({...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ ) )
            	    // InternalMGLang.g:396:5: {...}? => ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalMGLang.g:396:104: ( ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+ )
            	    // InternalMGLang.g:397:6: ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalMGLang.g:400:9: ({...}? => ( (lv_switches_12_0= ruleSwitch ) ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==31) ) {
            	            int LA8_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMGLang.g:400:10: {...}? => ( (lv_switches_12_0= ruleSwitch ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePattern", "true");
            	    	    }
            	    	    // InternalMGLang.g:400:19: ( (lv_switches_12_0= ruleSwitch ) )
            	    	    // InternalMGLang.g:400:20: (lv_switches_12_0= ruleSwitch )
            	    	    {
            	    	    // InternalMGLang.g:400:20: (lv_switches_12_0= ruleSwitch )
            	    	    // InternalMGLang.g:401:10: lv_switches_12_0= ruleSwitch
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPatternAccess().getSwitchesSwitchParserRuleCall_4_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_switches_12_0=ruleSwitch();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPatternRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"switches",
            	    	    											lv_switches_12_0,
            	    	    											"org.mofgen.MGLang.Switch");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            				

            }

            otherlv_13=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMGLang.g:434:3: ( (lv_return_14_0= rulePatternReturn ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:435:4: (lv_return_14_0= rulePatternReturn )
                    {
                    // InternalMGLang.g:435:4: (lv_return_14_0= rulePatternReturn )
                    // InternalMGLang.g:436:5: lv_return_14_0= rulePatternReturn
                    {

                    					newCompositeNode(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_return_14_0=rulePatternReturn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPatternRule());
                    					}
                    					set(
                    						current,
                    						"return",
                    						lv_return_14_0,
                    						"org.mofgen.MGLang.PatternReturn");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:457:1: entryRulePatternReturn returns [EObject current=null] : iv_rulePatternReturn= rulePatternReturn EOF ;
    public final EObject entryRulePatternReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternReturn = null;


        try {
            // InternalMGLang.g:457:54: (iv_rulePatternReturn= rulePatternReturn EOF )
            // InternalMGLang.g:458:2: iv_rulePatternReturn= rulePatternReturn EOF
            {
             newCompositeNode(grammarAccess.getPatternReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternReturn=rulePatternReturn();

            state._fsp--;

             current =iv_rulePatternReturn; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:464:1: rulePatternReturn returns [EObject current=null] : ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject rulePatternReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMGLang.g:470:2: ( ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalMGLang.g:471:2: ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalMGLang.g:471:2: ( () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalMGLang.g:472:3: () otherlv_1= 'return' otherlv_2= 'this' (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalMGLang.g:472:3: ()
            // InternalMGLang.g:473:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternReturnAccess().getPatternReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternReturnAccess().getReturnKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternReturnAccess().getThisKeyword_2());
            		
            // InternalMGLang.g:487:3: (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:488:4: otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0());
                    			
                    // InternalMGLang.g:492:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMGLang.g:493:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMGLang.g:493:5: (otherlv_4= RULE_ID )
                    // InternalMGLang.g:494:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatternReturnRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:510:1: entryRuleParamManipulation returns [EObject current=null] : iv_ruleParamManipulation= ruleParamManipulation EOF ;
    public final EObject entryRuleParamManipulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamManipulation = null;


        try {
            // InternalMGLang.g:510:58: (iv_ruleParamManipulation= ruleParamManipulation EOF )
            // InternalMGLang.g:511:2: iv_ruleParamManipulation= ruleParamManipulation EOF
            {
             newCompositeNode(grammarAccess.getParamManipulationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamManipulation=ruleParamManipulation();

            state._fsp--;

             current =iv_ruleParamManipulation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:517:1: ruleParamManipulation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) ) ;
    public final EObject ruleParamManipulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:523:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) ) )
            // InternalMGLang.g:524:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) )
            {
            // InternalMGLang.g:524:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) ) )
            // InternalMGLang.g:525:3: ( (otherlv_0= RULE_ID ) ) ( (lv_content_1_0= ruleNodeContent ) )
            {
            // InternalMGLang.g:525:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:526:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:526:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:527:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamManipulationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:538:3: ( (lv_content_1_0= ruleNodeContent ) )
            // InternalMGLang.g:539:4: (lv_content_1_0= ruleNodeContent )
            {
            // InternalMGLang.g:539:4: (lv_content_1_0= ruleNodeContent )
            // InternalMGLang.g:540:5: lv_content_1_0= ruleNodeContent
            {

            					newCompositeNode(grammarAccess.getParamManipulationAccess().getContentNodeContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_1_0=ruleNodeContent();

            state._fsp--;


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


            	leaveRule();

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
    // InternalMGLang.g:561:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalMGLang.g:561:45: (iv_ruleNode= ruleNode EOF )
            // InternalMGLang.g:562:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:568:1: ruleNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_3=null;
        EObject lv_createdBy_2_0 = null;

        EObject lv_createdBy_4_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:574:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? ) )
            // InternalMGLang.g:575:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? )
            {
            // InternalMGLang.g:575:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )? )
            // InternalMGLang.g:576:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )?
            {
            // InternalMGLang.g:576:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:577:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:577:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:578:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:589:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:590:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:590:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:591:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalMGLang.g:607:3: ( ( (lv_createdBy_2_0= ruleNodeContent ) ) | (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ASSIGNMENT_OP) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGLang.g:608:4: ( (lv_createdBy_2_0= ruleNodeContent ) )
                    {
                    // InternalMGLang.g:608:4: ( (lv_createdBy_2_0= ruleNodeContent ) )
                    // InternalMGLang.g:609:5: (lv_createdBy_2_0= ruleNodeContent )
                    {
                    // InternalMGLang.g:609:5: (lv_createdBy_2_0= ruleNodeContent )
                    // InternalMGLang.g:610:6: lv_createdBy_2_0= ruleNodeContent
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_createdBy_2_0=ruleNodeContent();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalMGLang.g:628:4: (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) )
                    {
                    // InternalMGLang.g:628:4: (this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) ) )
                    // InternalMGLang.g:629:5: this_ASSIGNMENT_OP_3= RULE_ASSIGNMENT_OP ( (lv_createdBy_4_0= rulePatternCall ) )
                    {
                    this_ASSIGNMENT_OP_3=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_7); 

                    					newLeafNode(this_ASSIGNMENT_OP_3, grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_2_1_0());
                    				
                    // InternalMGLang.g:633:5: ( (lv_createdBy_4_0= rulePatternCall ) )
                    // InternalMGLang.g:634:6: (lv_createdBy_4_0= rulePatternCall )
                    {
                    // InternalMGLang.g:634:6: (lv_createdBy_4_0= rulePatternCall )
                    // InternalMGLang.g:635:7: lv_createdBy_4_0= rulePatternCall
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_createdBy_4_0=rulePatternCall();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:658:1: entryRuleNodeContent returns [EObject current=null] : iv_ruleNodeContent= ruleNodeContent EOF ;
    public final EObject entryRuleNodeContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeContent = null;


        try {
            // InternalMGLang.g:658:52: (iv_ruleNodeContent= ruleNodeContent EOF )
            // InternalMGLang.g:659:2: iv_ruleNodeContent= ruleNodeContent EOF
            {
             newCompositeNode(grammarAccess.getNodeContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeContent=ruleNodeContent();

            state._fsp--;

             current =iv_ruleNodeContent; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:665:1: ruleNodeContent returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' ) ;
    public final EObject ruleNodeContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refsAssigns_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:671:2: ( ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' ) )
            // InternalMGLang.g:672:2: ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' )
            {
            // InternalMGLang.g:672:2: ( () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}' )
            // InternalMGLang.g:673:3: () otherlv_1= '{' ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )* otherlv_3= '}'
            {
            // InternalMGLang.g:673:3: ()
            // InternalMGLang.g:674:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeContentAccess().getNodeContentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeContentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMGLang.g:684:3: ( (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMGLang.g:685:4: (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment )
            	    {
            	    // InternalMGLang.g:685:4: (lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment )
            	    // InternalMGLang.g:686:5: lv_refsAssigns_2_0= ruleNodeReferenceOrAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_refsAssigns_2_0=ruleNodeReferenceOrAssignment();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeContentAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:711:1: entryRulePatternCall returns [EObject current=null] : iv_rulePatternCall= rulePatternCall EOF ;
    public final EObject entryRulePatternCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternCall = null;


        try {
            // InternalMGLang.g:711:52: (iv_rulePatternCall= rulePatternCall EOF )
            // InternalMGLang.g:712:2: iv_rulePatternCall= rulePatternCall EOF
            {
             newCompositeNode(grammarAccess.getPatternCallRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternCall=rulePatternCall();

            state._fsp--;

             current =iv_rulePatternCall; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:718:1: rulePatternCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')' ) ;
    public final EObject rulePatternCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:724:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')' ) )
            // InternalMGLang.g:725:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')' )
            {
            // InternalMGLang.g:725:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')' )
            // InternalMGLang.g:726:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleArithmeticExpression ) )* otherlv_3= ')'
            {
            // InternalMGLang.g:726:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:727:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:727:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:728:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGLang.g:743:3: ( (lv_params_2_0= ruleArithmeticExpression ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||(LA14_0>=RULE_INT && LA14_0<=RULE_FALSE)||LA14_0==18||(LA14_0>=40 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGLang.g:744:4: (lv_params_2_0= ruleArithmeticExpression )
            	    {
            	    // InternalMGLang.g:744:4: (lv_params_2_0= ruleArithmeticExpression )
            	    // InternalMGLang.g:745:5: lv_params_2_0= ruleArithmeticExpression
            	    {

            	    					newCompositeNode(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_params_2_0=ruleArithmeticExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:770:1: entryRuleNodeReferenceOrAssignment returns [EObject current=null] : iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF ;
    public final EObject entryRuleNodeReferenceOrAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeReferenceOrAssignment = null;


        try {
            // InternalMGLang.g:770:66: (iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF )
            // InternalMGLang.g:771:2: iv_ruleNodeReferenceOrAssignment= ruleNodeReferenceOrAssignment EOF
            {
             newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeReferenceOrAssignment=ruleNodeReferenceOrAssignment();

            state._fsp--;

             current =iv_ruleNodeReferenceOrAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:777:1: ruleNodeReferenceOrAssignment returns [EObject current=null] : (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) ;
    public final EObject ruleNodeReferenceOrAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_PatternNodeReference_0 = null;

        EObject this_Assignment_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:783:2: ( (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment ) )
            // InternalMGLang.g:784:2: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment )
            {
            // InternalMGLang.g:784:2: (this_PatternNodeReference_0= rulePatternNodeReference | this_Assignment_1= ruleAssignment )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==26) ) {
                    alt15=1;
                }
                else if ( (LA15_1==RULE_ASSIGNMENT_OP) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

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
                    // InternalMGLang.g:785:3: this_PatternNodeReference_0= rulePatternNodeReference
                    {

                    			newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternNodeReference_0=rulePatternNodeReference();

                    state._fsp--;


                    			current = this_PatternNodeReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:794:3: this_Assignment_1= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:806:1: entryRulePatternNodeReference returns [EObject current=null] : iv_rulePatternNodeReference= rulePatternNodeReference EOF ;
    public final EObject entryRulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternNodeReference = null;


        try {
            // InternalMGLang.g:806:61: (iv_rulePatternNodeReference= rulePatternNodeReference EOF )
            // InternalMGLang.g:807:2: iv_rulePatternNodeReference= rulePatternNodeReference EOF
            {
             newCompositeNode(grammarAccess.getPatternNodeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternNodeReference=rulePatternNodeReference();

            state._fsp--;

             current =iv_rulePatternNodeReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:813:1: rulePatternNodeReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePatternNodeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:819:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMGLang.g:820:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMGLang.g:820:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalMGLang.g:821:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMGLang.g:821:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:822:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:822:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:823:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMGLang.g:838:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:839:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:839:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:840:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternNodeReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:855:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMGLang.g:855:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMGLang.g:856:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:862:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ASSIGNMENT_OP_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:868:2: ( ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) ) )
            // InternalMGLang.g:869:2: ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) )
            {
            // InternalMGLang.g:869:2: ( ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) ) )
            // InternalMGLang.g:870:3: ( (otherlv_0= RULE_ID ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_value_2_0= ruleArithmeticExpression ) )
            {
            // InternalMGLang.g:870:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:871:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:871:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:872:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0());
            				

            }


            }

            this_ASSIGNMENT_OP_1=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_22); 

            			newLeafNode(this_ASSIGNMENT_OP_1, grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1());
            		
            // InternalMGLang.g:887:3: ( (lv_value_2_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:888:4: (lv_value_2_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:888:4: (lv_value_2_0= ruleArithmeticExpression )
            // InternalMGLang.g:889:5: lv_value_2_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueArithmeticExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleArithmeticExpression();

            state._fsp--;


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


            	leaveRule();

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
    // InternalMGLang.g:910:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMGLang.g:910:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMGLang.g:911:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:917:1: ruleParameter returns [EObject current=null] : (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveParameter_0 = null;

        EObject this_ParameterNode_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:923:2: ( (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode ) )
            // InternalMGLang.g:924:2: (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode )
            {
            // InternalMGLang.g:924:2: (this_PrimitiveParameter_0= rulePrimitiveParameter | this_ParameterNode_1= ruleParameterNode )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=43 && LA16_0<=46)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMGLang.g:925:3: this_PrimitiveParameter_0= rulePrimitiveParameter
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveParameter_0=rulePrimitiveParameter();

                    state._fsp--;


                    			current = this_PrimitiveParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:934:3: this_ParameterNode_1= ruleParameterNode
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getParameterNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterNode_1=ruleParameterNode();

                    state._fsp--;


                    			current = this_ParameterNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:946:1: entryRulePrimitiveParameter returns [EObject current=null] : iv_rulePrimitiveParameter= rulePrimitiveParameter EOF ;
    public final EObject entryRulePrimitiveParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveParameter = null;


        try {
            // InternalMGLang.g:946:59: (iv_rulePrimitiveParameter= rulePrimitiveParameter EOF )
            // InternalMGLang.g:947:2: iv_rulePrimitiveParameter= rulePrimitiveParameter EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveParameter=rulePrimitiveParameter();

            state._fsp--;

             current =iv_rulePrimitiveParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:953:1: rulePrimitiveParameter returns [EObject current=null] : ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:959:2: ( ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:960:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:960:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:961:3: ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:961:3: ( (lv_type_0_0= rulePrimitiveType ) )
            // InternalMGLang.g:962:4: (lv_type_0_0= rulePrimitiveType )
            {
            // InternalMGLang.g:962:4: (lv_type_0_0= rulePrimitiveType )
            // InternalMGLang.g:963:5: lv_type_0_0= rulePrimitiveType
            {

            					newCompositeNode(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=rulePrimitiveType();

            state._fsp--;


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

            // InternalMGLang.g:980:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:981:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:981:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:982:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

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


            	leaveRule();

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
    // InternalMGLang.g:1002:1: entryRuleParameterNode returns [EObject current=null] : iv_ruleParameterNode= ruleParameterNode EOF ;
    public final EObject entryRuleParameterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterNode = null;


        try {
            // InternalMGLang.g:1002:54: (iv_ruleParameterNode= ruleParameterNode EOF )
            // InternalMGLang.g:1003:2: iv_ruleParameterNode= ruleParameterNode EOF
            {
             newCompositeNode(grammarAccess.getParameterNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterNode=ruleParameterNode();

            state._fsp--;

             current =iv_ruleParameterNode; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1009:1: ruleParameterNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1015:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1016:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1016:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:1017:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:1017:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1018:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1018:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1019:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterNodeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1030:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:1031:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:1031:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:1032:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

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


            	leaveRule();

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


    // $ANTLR start "entryRuleRefOrCall"
    // InternalMGLang.g:1052:1: entryRuleRefOrCall returns [EObject current=null] : iv_ruleRefOrCall= ruleRefOrCall EOF ;
    public final EObject entryRuleRefOrCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOrCall = null;


        try {
            // InternalMGLang.g:1052:50: (iv_ruleRefOrCall= ruleRefOrCall EOF )
            // InternalMGLang.g:1053:2: iv_ruleRefOrCall= ruleRefOrCall EOF
            {
             newCompositeNode(grammarAccess.getRefOrCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefOrCall=ruleRefOrCall();

            state._fsp--;

             current =iv_ruleRefOrCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRefOrCall"


    // $ANTLR start "ruleRefOrCall"
    // InternalMGLang.g:1059:1: ruleRefOrCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleRefOrCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMGLang.g:1065:2: ( ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMGLang.g:1066:2: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMGLang.g:1066:2: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMGLang.g:1067:3: ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalMGLang.g:1067:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1068:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1068:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1069:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefOrCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getRefOrCallAccess().getRefRefTypeCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1080:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMGLang.g:1081:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalMGLang.g:1081:4: ()
            	    // InternalMGLang.g:1082:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRefOrCallAccess().getRefOrCallTargetAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRefOrCallAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalMGLang.g:1092:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMGLang.g:1093:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMGLang.g:1093:5: (otherlv_3= RULE_ID )
            	    // InternalMGLang.g:1094:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRefOrCallRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_3, grammarAccess.getRefOrCallAccess().getCalledETypedElementCrossReference_1_2_0());
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefOrCall"


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:1110:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // InternalMGLang.g:1110:50: (iv_ruleGenerator= ruleGenerator EOF )
            // InternalMGLang.g:1111:2: iv_ruleGenerator= ruleGenerator EOF
            {
             newCompositeNode(grammarAccess.getGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;

             current =iv_ruleGenerator; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1117:1: ruleGenerator returns [EObject current=null] : ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' ) ;
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
            // InternalMGLang.g:1123:2: ( ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' ) )
            // InternalMGLang.g:1124:2: ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' )
            {
            // InternalMGLang.g:1124:2: ( () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}' )
            // InternalMGLang.g:1125:3: () otherlv_1= 'gen' otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_commands_6_0= ruleGeneratorExpression ) )* otherlv_7= '}'
            {
            // InternalMGLang.g:1125:3: ()
            // InternalMGLang.g:1126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeneratorAccess().getGeneratorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getGenKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMGLang.g:1140:3: ( (lv_params_3_0= ruleParameter ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=43 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMGLang.g:1141:4: (lv_params_3_0= ruleParameter )
            	    {
            	    // InternalMGLang.g:1141:4: (lv_params_3_0= ruleParameter )
            	    // InternalMGLang.g:1142:5: lv_params_3_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getGeneratorAccess().getParamsParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_params_3_0=ruleParameter();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMGLang.g:1167:3: ( (lv_commands_6_0= ruleGeneratorExpression ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==28||LA19_0==31||LA19_0==36||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMGLang.g:1168:4: (lv_commands_6_0= ruleGeneratorExpression )
            	    {
            	    // InternalMGLang.g:1168:4: (lv_commands_6_0= ruleGeneratorExpression )
            	    // InternalMGLang.g:1169:5: lv_commands_6_0= ruleGeneratorExpression
            	    {

            	    					newCompositeNode(grammarAccess.getGeneratorAccess().getCommandsGeneratorExpressionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_commands_6_0=ruleGeneratorExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:1194:1: entryRuleGeneratorExpression returns [EObject current=null] : iv_ruleGeneratorExpression= ruleGeneratorExpression EOF ;
    public final EObject entryRuleGeneratorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratorExpression = null;


        try {
            // InternalMGLang.g:1194:60: (iv_ruleGeneratorExpression= ruleGeneratorExpression EOF )
            // InternalMGLang.g:1195:2: iv_ruleGeneratorExpression= ruleGeneratorExpression EOF
            {
             newCompositeNode(grammarAccess.getGeneratorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneratorExpression=ruleGeneratorExpression();

            state._fsp--;

             current =iv_ruleGeneratorExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1201:1: ruleGeneratorExpression returns [EObject current=null] : (this_ForStatement_0= ruleForStatement | this_Switch_1= ruleSwitch | this_Collection_2= ruleCollection | this_PatternCall_3= rulePatternCall | this_PatternObjectCreation_4= rulePatternObjectCreation ) ;
    public final EObject ruleGeneratorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ForStatement_0 = null;

        EObject this_Switch_1 = null;

        EObject this_Collection_2 = null;

        EObject this_PatternCall_3 = null;

        EObject this_PatternObjectCreation_4 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1207:2: ( (this_ForStatement_0= ruleForStatement | this_Switch_1= ruleSwitch | this_Collection_2= ruleCollection | this_PatternCall_3= rulePatternCall | this_PatternObjectCreation_4= rulePatternObjectCreation ) )
            // InternalMGLang.g:1208:2: (this_ForStatement_0= ruleForStatement | this_Switch_1= ruleSwitch | this_Collection_2= ruleCollection | this_PatternCall_3= rulePatternCall | this_PatternObjectCreation_4= rulePatternObjectCreation )
            {
            // InternalMGLang.g:1208:2: (this_ForStatement_0= ruleForStatement | this_Switch_1= ruleSwitch | this_Collection_2= ruleCollection | this_PatternCall_3= rulePatternCall | this_PatternObjectCreation_4= rulePatternObjectCreation )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case 36:
            case 39:
                {
                alt20=3;
                }
                break;
            case RULE_ID:
                {
                int LA20_4 = input.LA(2);

                if ( (LA20_4==18) ) {
                    alt20=4;
                }
                else if ( (LA20_4==RULE_ID) ) {
                    alt20=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMGLang.g:1209:3: this_ForStatement_0= ruleForStatement
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getForStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForStatement_0=ruleForStatement();

                    state._fsp--;


                    			current = this_ForStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1218:3: this_Switch_1= ruleSwitch
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getSwitchParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Switch_1=ruleSwitch();

                    state._fsp--;


                    			current = this_Switch_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1227:3: this_Collection_2= ruleCollection
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Collection_2=ruleCollection();

                    state._fsp--;


                    			current = this_Collection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1236:3: this_PatternCall_3= rulePatternCall
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternCall_3=rulePatternCall();

                    state._fsp--;


                    			current = this_PatternCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1245:3: this_PatternObjectCreation_4= rulePatternObjectCreation
                    {

                    			newCompositeNode(grammarAccess.getGeneratorExpressionAccess().getPatternObjectCreationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternObjectCreation_4=rulePatternObjectCreation();

                    state._fsp--;


                    			current = this_PatternObjectCreation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:1257:1: entryRulePatternObjectCreation returns [EObject current=null] : iv_rulePatternObjectCreation= rulePatternObjectCreation EOF ;
    public final EObject entryRulePatternObjectCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternObjectCreation = null;


        try {
            // InternalMGLang.g:1257:62: (iv_rulePatternObjectCreation= rulePatternObjectCreation EOF )
            // InternalMGLang.g:1258:2: iv_rulePatternObjectCreation= rulePatternObjectCreation EOF
            {
             newCompositeNode(grammarAccess.getPatternObjectCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternObjectCreation=rulePatternObjectCreation();

            state._fsp--;

             current =iv_rulePatternObjectCreation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1264:1: rulePatternObjectCreation returns [EObject current=null] : ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) ) ;
    public final EObject rulePatternObjectCreation() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGNMENT_OP_1=null;
        EObject lv_pObject_0_0 = null;

        EObject lv_patternCall_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1270:2: ( ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) ) )
            // InternalMGLang.g:1271:2: ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) )
            {
            // InternalMGLang.g:1271:2: ( ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) ) )
            // InternalMGLang.g:1272:3: ( (lv_pObject_0_0= rulePatternObject ) ) this_ASSIGNMENT_OP_1= RULE_ASSIGNMENT_OP ( (lv_patternCall_2_0= rulePatternCall ) )
            {
            // InternalMGLang.g:1272:3: ( (lv_pObject_0_0= rulePatternObject ) )
            // InternalMGLang.g:1273:4: (lv_pObject_0_0= rulePatternObject )
            {
            // InternalMGLang.g:1273:4: (lv_pObject_0_0= rulePatternObject )
            // InternalMGLang.g:1274:5: lv_pObject_0_0= rulePatternObject
            {

            					newCompositeNode(grammarAccess.getPatternObjectCreationAccess().getPObjectPatternObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_pObject_0_0=rulePatternObject();

            state._fsp--;


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

            this_ASSIGNMENT_OP_1=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_7); 

            			newLeafNode(this_ASSIGNMENT_OP_1, grammarAccess.getPatternObjectCreationAccess().getASSIGNMENT_OPTerminalRuleCall_1());
            		
            // InternalMGLang.g:1295:3: ( (lv_patternCall_2_0= rulePatternCall ) )
            // InternalMGLang.g:1296:4: (lv_patternCall_2_0= rulePatternCall )
            {
            // InternalMGLang.g:1296:4: (lv_patternCall_2_0= rulePatternCall )
            // InternalMGLang.g:1297:5: lv_patternCall_2_0= rulePatternCall
            {

            					newCompositeNode(grammarAccess.getPatternObjectCreationAccess().getPatternCallPatternCallParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_patternCall_2_0=rulePatternCall();

            state._fsp--;


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


            	leaveRule();

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
    // InternalMGLang.g:1318:1: entryRulePatternObject returns [EObject current=null] : iv_rulePatternObject= rulePatternObject EOF ;
    public final EObject entryRulePatternObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternObject = null;


        try {
            // InternalMGLang.g:1318:54: (iv_rulePatternObject= rulePatternObject EOF )
            // InternalMGLang.g:1319:2: iv_rulePatternObject= rulePatternObject EOF
            {
             newCompositeNode(grammarAccess.getPatternObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternObject=rulePatternObject();

            state._fsp--;

             current =iv_rulePatternObject; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1325:1: rulePatternObject returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePatternObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:1331:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1332:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1332:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMGLang.g:1333:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMGLang.g:1333:3: ( (otherlv_0= RULE_ID ) )
            // InternalMGLang.g:1334:4: (otherlv_0= RULE_ID )
            {
            // InternalMGLang.g:1334:4: (otherlv_0= RULE_ID )
            // InternalMGLang.g:1335:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternObjectRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0());
            				

            }


            }

            // InternalMGLang.g:1346:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:1347:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:1347:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:1348:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatternObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

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


            	leaveRule();

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
    // InternalMGLang.g:1368:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalMGLang.g:1368:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalMGLang.g:1369:2: iv_ruleForStatement= ruleForStatement EOF
            {
             newCompositeNode(grammarAccess.getForStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;

             current =iv_ruleForStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1375:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1381:2: ( (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' ) )
            // InternalMGLang.g:1382:2: (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' )
            {
            // InternalMGLang.g:1382:2: (otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}' )
            // InternalMGLang.g:1383:3: otherlv_0= 'for' ( (lv_head_1_0= ruleForHead ) ) otherlv_2= '{' ( (lv_body_3_0= ruleForBody ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
            		
            // InternalMGLang.g:1387:3: ( (lv_head_1_0= ruleForHead ) )
            // InternalMGLang.g:1388:4: (lv_head_1_0= ruleForHead )
            {
            // InternalMGLang.g:1388:4: (lv_head_1_0= ruleForHead )
            // InternalMGLang.g:1389:5: lv_head_1_0= ruleForHead
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getHeadForHeadParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_head_1_0=ruleForHead();

            state._fsp--;


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

            otherlv_2=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMGLang.g:1410:3: ( (lv_body_3_0= ruleForBody ) )
            // InternalMGLang.g:1411:4: (lv_body_3_0= ruleForBody )
            {
            // InternalMGLang.g:1411:4: (lv_body_3_0= ruleForBody )
            // InternalMGLang.g:1412:5: lv_body_3_0= ruleForBody
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getBodyForBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_body_3_0=ruleForBody();

            state._fsp--;


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

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:1437:1: entryRuleForHead returns [EObject current=null] : iv_ruleForHead= ruleForHead EOF ;
    public final EObject entryRuleForHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForHead = null;


        try {
            // InternalMGLang.g:1437:48: (iv_ruleForHead= ruleForHead EOF )
            // InternalMGLang.g:1438:2: iv_ruleForHead= ruleForHead EOF
            {
             newCompositeNode(grammarAccess.getForHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForHead=ruleForHead();

            state._fsp--;

             current =iv_ruleForHead; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1444:1: ruleForHead returns [EObject current=null] : (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead ) ;
    public final EObject ruleForHead() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralForHead_0 = null;

        EObject this_ForEachHead_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1450:2: ( (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead ) )
            // InternalMGLang.g:1451:2: (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead )
            {
            // InternalMGLang.g:1451:2: (this_GeneralForHead_0= ruleGeneralForHead | this_ForEachHead_1= ruleForEachHead )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==29) ) {
                    alt21=1;
                }
                else if ( (LA21_1==25||LA21_1==30) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMGLang.g:1452:3: this_GeneralForHead_0= ruleGeneralForHead
                    {

                    			newCompositeNode(grammarAccess.getForHeadAccess().getGeneralForHeadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralForHead_0=ruleGeneralForHead();

                    state._fsp--;


                    			current = this_GeneralForHead_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1461:3: this_ForEachHead_1= ruleForEachHead
                    {

                    			newCompositeNode(grammarAccess.getForHeadAccess().getForEachHeadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForEachHead_1=ruleForEachHead();

                    state._fsp--;


                    			current = this_ForEachHead_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:1473:1: entryRuleGeneralForHead returns [EObject current=null] : iv_ruleGeneralForHead= ruleGeneralForHead EOF ;
    public final EObject entryRuleGeneralForHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralForHead = null;


        try {
            // InternalMGLang.g:1473:55: (iv_ruleGeneralForHead= ruleGeneralForHead EOF )
            // InternalMGLang.g:1474:2: iv_ruleGeneralForHead= ruleGeneralForHead EOF
            {
             newCompositeNode(grammarAccess.getGeneralForHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralForHead=ruleGeneralForHead();

            state._fsp--;

             current =iv_ruleGeneralForHead; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1480:1: ruleGeneralForHead returns [EObject current=null] : ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) ) ;
    public final EObject ruleGeneralForHead() throws RecognitionException {
        EObject current = null;

        Token lv_iteratorVar_0_0=null;
        Token otherlv_1=null;
        EObject lv_range_2_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1486:2: ( ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) ) )
            // InternalMGLang.g:1487:2: ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) )
            {
            // InternalMGLang.g:1487:2: ( ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) ) )
            // InternalMGLang.g:1488:3: ( (lv_iteratorVar_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_range_2_0= ruleForRange ) )
            {
            // InternalMGLang.g:1488:3: ( (lv_iteratorVar_0_0= RULE_ID ) )
            // InternalMGLang.g:1489:4: (lv_iteratorVar_0_0= RULE_ID )
            {
            // InternalMGLang.g:1489:4: (lv_iteratorVar_0_0= RULE_ID )
            // InternalMGLang.g:1490:5: lv_iteratorVar_0_0= RULE_ID
            {
            lv_iteratorVar_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_iteratorVar_0_0, grammarAccess.getGeneralForHeadAccess().getIteratorVarIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralForHeadAccess().getInKeyword_1());
            		
            // InternalMGLang.g:1510:3: ( (lv_range_2_0= ruleForRange ) )
            // InternalMGLang.g:1511:4: (lv_range_2_0= ruleForRange )
            {
            // InternalMGLang.g:1511:4: (lv_range_2_0= ruleForRange )
            // InternalMGLang.g:1512:5: lv_range_2_0= ruleForRange
            {

            					newCompositeNode(grammarAccess.getGeneralForHeadAccess().getRangeForRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_range_2_0=ruleForRange();

            state._fsp--;


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


            	leaveRule();

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
    // InternalMGLang.g:1533:1: entryRuleForEachHead returns [EObject current=null] : iv_ruleForEachHead= ruleForEachHead EOF ;
    public final EObject entryRuleForEachHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachHead = null;


        try {
            // InternalMGLang.g:1533:52: (iv_ruleForEachHead= ruleForEachHead EOF )
            // InternalMGLang.g:1534:2: iv_ruleForEachHead= ruleForEachHead EOF
            {
             newCompositeNode(grammarAccess.getForEachHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEachHead=ruleForEachHead();

            state._fsp--;

             current =iv_ruleForEachHead; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1540:1: ruleForEachHead returns [EObject current=null] : ( ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) ) ;
    public final EObject ruleForEachHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_iteratorVar_4_0=null;
        EObject lv_src_0_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1546:2: ( ( ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) ) )
            // InternalMGLang.g:1547:2: ( ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) )
            {
            // InternalMGLang.g:1547:2: ( ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) ) )
            // InternalMGLang.g:1548:3: ( (lv_src_0_0= ruleRefOrCall ) ) otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (lv_iteratorVar_4_0= RULE_ID ) )
            {
            // InternalMGLang.g:1548:3: ( (lv_src_0_0= ruleRefOrCall ) )
            // InternalMGLang.g:1549:4: (lv_src_0_0= ruleRefOrCall )
            {
            // InternalMGLang.g:1549:4: (lv_src_0_0= ruleRefOrCall )
            // InternalMGLang.g:1550:5: lv_src_0_0= ruleRefOrCall
            {

            					newCompositeNode(grammarAccess.getForEachHeadAccess().getSrcRefOrCallParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_src_0_0=ruleRefOrCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachHeadRule());
            					}
            					set(
            						current,
            						"src",
            						lv_src_0_0,
            						"org.mofgen.MGLang.RefOrCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getForEachHeadAccess().getHyphenMinusKeyword_1());
            		
            // InternalMGLang.g:1571:3: ( (otherlv_2= RULE_ID ) )
            // InternalMGLang.g:1572:4: (otherlv_2= RULE_ID )
            {
            // InternalMGLang.g:1572:4: (otherlv_2= RULE_ID )
            // InternalMGLang.g:1573:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachHeadRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getForEachHeadAccess().getErefEReferenceCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMGLang.g:1588:3: ( (lv_iteratorVar_4_0= RULE_ID ) )
            // InternalMGLang.g:1589:4: (lv_iteratorVar_4_0= RULE_ID )
            {
            // InternalMGLang.g:1589:4: (lv_iteratorVar_4_0= RULE_ID )
            // InternalMGLang.g:1590:5: lv_iteratorVar_4_0= RULE_ID
            {
            lv_iteratorVar_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_iteratorVar_4_0, grammarAccess.getForEachHeadAccess().getIteratorVarIDTerminalRuleCall_4_0());
            				

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


            	leaveRule();

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
    // InternalMGLang.g:1610:1: entryRuleForBody returns [EObject current=null] : iv_ruleForBody= ruleForBody EOF ;
    public final EObject entryRuleForBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForBody = null;


        try {
            // InternalMGLang.g:1610:48: (iv_ruleForBody= ruleForBody EOF )
            // InternalMGLang.g:1611:2: iv_ruleForBody= ruleForBody EOF
            {
             newCompositeNode(grammarAccess.getForBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForBody=ruleForBody();

            state._fsp--;

             current =iv_ruleForBody; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1617:1: ruleForBody returns [EObject current=null] : ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* ) ;
    public final EObject ruleForBody() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1623:2: ( ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* ) )
            // InternalMGLang.g:1624:2: ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* )
            {
            // InternalMGLang.g:1624:2: ( () ( (lv_commands_1_0= ruleGeneratorExpression ) )* )
            // InternalMGLang.g:1625:3: () ( (lv_commands_1_0= ruleGeneratorExpression ) )*
            {
            // InternalMGLang.g:1625:3: ()
            // InternalMGLang.g:1626:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForBodyAccess().getForBodyAction_0(),
            					current);
            			

            }

            // InternalMGLang.g:1632:3: ( (lv_commands_1_0= ruleGeneratorExpression ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==28||LA22_0==31||LA22_0==36||LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMGLang.g:1633:4: (lv_commands_1_0= ruleGeneratorExpression )
            	    {
            	    // InternalMGLang.g:1633:4: (lv_commands_1_0= ruleGeneratorExpression )
            	    // InternalMGLang.g:1634:5: lv_commands_1_0= ruleGeneratorExpression
            	    {

            	    					newCompositeNode(grammarAccess.getForBodyAccess().getCommandsGeneratorExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_commands_1_0=ruleGeneratorExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleSwitch"
    // InternalMGLang.g:1655:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalMGLang.g:1655:47: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalMGLang.g:1656:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalMGLang.g:1662:1: ruleSwitch returns [EObject current=null] : (this_IfElseSwitch_0= ruleIfElseSwitch | this_SwitchCase_1= ruleSwitchCase ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        EObject this_IfElseSwitch_0 = null;

        EObject this_SwitchCase_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1668:2: ( (this_IfElseSwitch_0= ruleIfElseSwitch | this_SwitchCase_1= ruleSwitchCase ) )
            // InternalMGLang.g:1669:2: (this_IfElseSwitch_0= ruleIfElseSwitch | this_SwitchCase_1= ruleSwitchCase )
            {
            // InternalMGLang.g:1669:2: (this_IfElseSwitch_0= ruleIfElseSwitch | this_SwitchCase_1= ruleSwitchCase )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==21) ) {
                    alt23=1;
                }
                else if ( (LA23_1==18) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMGLang.g:1670:3: this_IfElseSwitch_0= ruleIfElseSwitch
                    {

                    			newCompositeNode(grammarAccess.getSwitchAccess().getIfElseSwitchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfElseSwitch_0=ruleIfElseSwitch();

                    state._fsp--;


                    			current = this_IfElseSwitch_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1679:3: this_SwitchCase_1= ruleSwitchCase
                    {

                    			newCompositeNode(grammarAccess.getSwitchAccess().getSwitchCaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SwitchCase_1=ruleSwitchCase();

                    state._fsp--;


                    			current = this_SwitchCase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleIfElseSwitch"
    // InternalMGLang.g:1691:1: entryRuleIfElseSwitch returns [EObject current=null] : iv_ruleIfElseSwitch= ruleIfElseSwitch EOF ;
    public final EObject entryRuleIfElseSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseSwitch = null;


        try {
            // InternalMGLang.g:1691:53: (iv_ruleIfElseSwitch= ruleIfElseSwitch EOF )
            // InternalMGLang.g:1692:2: iv_ruleIfElseSwitch= ruleIfElseSwitch EOF
            {
             newCompositeNode(grammarAccess.getIfElseSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfElseSwitch=ruleIfElseSwitch();

            state._fsp--;

             current =iv_ruleIfElseSwitch; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIfElseSwitch"


    // $ANTLR start "ruleIfElseSwitch"
    // InternalMGLang.g:1698:1: ruleIfElseSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) ;
    public final EObject ruleIfElseSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_cases_2_0 = null;

        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1704:2: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) )
            // InternalMGLang.g:1705:2: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            {
            // InternalMGLang.g:1705:2: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            // InternalMGLang.g:1706:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleIfElseCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseSwitchAccess().getSwitchKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getIfElseSwitchAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMGLang.g:1714:3: ( (lv_cases_2_0= ruleIfElseCase ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGLang.g:1715:4: (lv_cases_2_0= ruleIfElseCase )
            	    {
            	    // InternalMGLang.g:1715:4: (lv_cases_2_0= ruleIfElseCase )
            	    // InternalMGLang.g:1716:5: lv_cases_2_0= ruleIfElseCase
            	    {

            	    					newCompositeNode(grammarAccess.getIfElseSwitchAccess().getCasesIfElseCaseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_cases_2_0=ruleIfElseCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfElseSwitchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cases",
            	    						lv_cases_2_0,
            	    						"org.mofgen.MGLang.IfElseCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalMGLang.g:1733:3: ( (lv_default_3_0= ruleDefault ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMGLang.g:1734:4: (lv_default_3_0= ruleDefault )
                    {
                    // InternalMGLang.g:1734:4: (lv_default_3_0= ruleDefault )
                    // InternalMGLang.g:1735:5: lv_default_3_0= ruleDefault
                    {

                    					newCompositeNode(grammarAccess.getIfElseSwitchAccess().getDefaultDefaultParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_default_3_0=ruleDefault();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfElseSwitchRule());
                    					}
                    					set(
                    						current,
                    						"default",
                    						lv_default_3_0,
                    						"org.mofgen.MGLang.Default");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIfElseSwitchAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfElseSwitch"


    // $ANTLR start "entryRuleIfElseCase"
    // InternalMGLang.g:1760:1: entryRuleIfElseCase returns [EObject current=null] : iv_ruleIfElseCase= ruleIfElseCase EOF ;
    public final EObject entryRuleIfElseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseCase = null;


        try {
            // InternalMGLang.g:1760:51: (iv_ruleIfElseCase= ruleIfElseCase EOF )
            // InternalMGLang.g:1761:2: iv_ruleIfElseCase= ruleIfElseCase EOF
            {
             newCompositeNode(grammarAccess.getIfElseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfElseCase=ruleIfElseCase();

            state._fsp--;

             current =iv_ruleIfElseCase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIfElseCase"


    // $ANTLR start "ruleIfElseCase"
    // InternalMGLang.g:1767:1: ruleIfElseCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) ) ;
    public final EObject ruleIfElseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_val_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1773:2: ( (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) ) )
            // InternalMGLang.g:1774:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) )
            {
            // InternalMGLang.g:1774:2: (otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) ) )
            // InternalMGLang.g:1775:3: otherlv_0= 'case' ( (lv_val_1_0= ruleArithmeticExpression ) ) otherlv_2= ':' ( (lv_body_3_0= ruleCaseBody ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseCaseAccess().getCaseKeyword_0());
            		
            // InternalMGLang.g:1779:3: ( (lv_val_1_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:1780:4: (lv_val_1_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:1780:4: (lv_val_1_0= ruleArithmeticExpression )
            // InternalMGLang.g:1781:5: lv_val_1_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getIfElseCaseAccess().getValArithmeticExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_val_1_0=ruleArithmeticExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseCaseRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.mofgen.MGLang.ArithmeticExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getIfElseCaseAccess().getColonKeyword_2());
            		
            // InternalMGLang.g:1802:3: ( (lv_body_3_0= ruleCaseBody ) )
            // InternalMGLang.g:1803:4: (lv_body_3_0= ruleCaseBody )
            {
            // InternalMGLang.g:1803:4: (lv_body_3_0= ruleCaseBody )
            // InternalMGLang.g:1804:5: lv_body_3_0= ruleCaseBody
            {

            					newCompositeNode(grammarAccess.getIfElseCaseAccess().getBodyCaseBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleCaseBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseCaseRule());
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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfElseCase"


    // $ANTLR start "entryRuleDefault"
    // InternalMGLang.g:1825:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalMGLang.g:1825:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalMGLang.g:1826:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1832:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_CaseBody_2 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1838:2: ( (otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody ) )
            // InternalMGLang.g:1839:2: (otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody )
            {
            // InternalMGLang.g:1839:2: (otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody )
            // InternalMGLang.g:1840:3: otherlv_0= 'default' otherlv_1= ':' this_CaseBody_2= ruleCaseBody
            {
            otherlv_0=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDefaultKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getDefaultAccess().getCaseBodyParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_CaseBody_2=ruleCaseBody();

            state._fsp--;


            			current = this_CaseBody_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleSwitchCase"
    // InternalMGLang.g:1860:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalMGLang.g:1860:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalMGLang.g:1861:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
             newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;

             current =iv_ruleSwitchCase; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1867:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}' ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_attribute_2_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_default_6_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1873:2: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}' ) )
            // InternalMGLang.g:1874:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}' )
            {
            // InternalMGLang.g:1874:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}' )
            // InternalMGLang.g:1875:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_attribute_2_0= ruleRefOrCall ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleCase ) )+ ( (lv_default_6_0= ruleDefault ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSwitchCaseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGLang.g:1883:3: ( (lv_attribute_2_0= ruleRefOrCall ) )
            // InternalMGLang.g:1884:4: (lv_attribute_2_0= ruleRefOrCall )
            {
            // InternalMGLang.g:1884:4: (lv_attribute_2_0= ruleRefOrCall )
            // InternalMGLang.g:1885:5: lv_attribute_2_0= ruleRefOrCall
            {

            					newCompositeNode(grammarAccess.getSwitchCaseAccess().getAttributeRefOrCallParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_attribute_2_0=ruleRefOrCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.mofgen.MGLang.RefOrCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMGLang.g:1910:3: ( (lv_cases_5_0= ruleCase ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMGLang.g:1911:4: (lv_cases_5_0= ruleCase )
            	    {
            	    // InternalMGLang.g:1911:4: (lv_cases_5_0= ruleCase )
            	    // InternalMGLang.g:1912:5: lv_cases_5_0= ruleCase
            	    {

            	    					newCompositeNode(grammarAccess.getSwitchCaseAccess().getCasesCaseParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_cases_5_0=ruleCase();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalMGLang.g:1929:3: ( (lv_default_6_0= ruleDefault ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMGLang.g:1930:4: (lv_default_6_0= ruleDefault )
                    {
                    // InternalMGLang.g:1930:4: (lv_default_6_0= ruleDefault )
                    // InternalMGLang.g:1931:5: lv_default_6_0= ruleDefault
                    {

                    					newCompositeNode(grammarAccess.getSwitchCaseAccess().getDefaultDefaultParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_default_6_0=ruleDefault();

                    state._fsp--;


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
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSwitchCaseAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleCase"
    // InternalMGLang.g:1956:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalMGLang.g:1956:45: (iv_ruleCase= ruleCase EOF )
            // InternalMGLang.g:1957:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1963:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_node_1_0 = null;

        EObject lv_when_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:1969:2: ( (otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) ) ) )
            // InternalMGLang.g:1970:2: (otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) ) )
            {
            // InternalMGLang.g:1970:2: (otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) ) )
            // InternalMGLang.g:1971:3: otherlv_0= 'case' ( (lv_node_1_0= ruleNode ) ) (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )? otherlv_4= ':' ( (lv_body_5_0= ruleCaseBody ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
            		
            // InternalMGLang.g:1975:3: ( (lv_node_1_0= ruleNode ) )
            // InternalMGLang.g:1976:4: (lv_node_1_0= ruleNode )
            {
            // InternalMGLang.g:1976:4: (lv_node_1_0= ruleNode )
            // InternalMGLang.g:1977:5: lv_node_1_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getNodeNodeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_node_1_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_1_0,
            						"org.mofgen.MGLang.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGLang.g:1994:3: (otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMGLang.g:1995:4: otherlv_2= 'when' ( (lv_when_3_0= ruleArithmeticExpression ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getWhenKeyword_2_0());
                    			
                    // InternalMGLang.g:1999:4: ( (lv_when_3_0= ruleArithmeticExpression ) )
                    // InternalMGLang.g:2000:5: (lv_when_3_0= ruleArithmeticExpression )
                    {
                    // InternalMGLang.g:2000:5: (lv_when_3_0= ruleArithmeticExpression )
                    // InternalMGLang.g:2001:6: lv_when_3_0= ruleArithmeticExpression
                    {

                    						newCompositeNode(grammarAccess.getCaseAccess().getWhenArithmeticExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_when_3_0=ruleArithmeticExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCaseRule());
                    						}
                    						set(
                    							current,
                    							"when",
                    							lv_when_3_0,
                    							"org.mofgen.MGLang.ArithmeticExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getColonKeyword_3());
            		
            // InternalMGLang.g:2023:3: ( (lv_body_5_0= ruleCaseBody ) )
            // InternalMGLang.g:2024:4: (lv_body_5_0= ruleCaseBody )
            {
            // InternalMGLang.g:2024:4: (lv_body_5_0= ruleCaseBody )
            // InternalMGLang.g:2025:5: lv_body_5_0= ruleCaseBody
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getBodyCaseBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleCaseBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"org.mofgen.MGLang.CaseBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2046:1: entryRuleCaseBody returns [EObject current=null] : iv_ruleCaseBody= ruleCaseBody EOF ;
    public final EObject entryRuleCaseBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseBody = null;


        try {
            // InternalMGLang.g:2046:49: (iv_ruleCaseBody= ruleCaseBody EOF )
            // InternalMGLang.g:2047:2: iv_ruleCaseBody= ruleCaseBody EOF
            {
             newCompositeNode(grammarAccess.getCaseBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseBody=ruleCaseBody();

            state._fsp--;

             current =iv_ruleCaseBody; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2053:1: ruleCaseBody returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) | ( ( (lv_expressions_4_0= ruleGeneratorExpression ) ) this_NEWLINE_5= RULE_NEWLINE ) ) ;
    public final EObject ruleCaseBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NEWLINE_5=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2059:2: ( ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) | ( ( (lv_expressions_4_0= ruleGeneratorExpression ) ) this_NEWLINE_5= RULE_NEWLINE ) ) )
            // InternalMGLang.g:2060:2: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) | ( ( (lv_expressions_4_0= ruleGeneratorExpression ) ) this_NEWLINE_5= RULE_NEWLINE ) )
            {
            // InternalMGLang.g:2060:2: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' ) | ( ( (lv_expressions_4_0= ruleGeneratorExpression ) ) this_NEWLINE_5= RULE_NEWLINE ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID||LA30_0==28||LA30_0==31||LA30_0==36||LA30_0==39) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMGLang.g:2061:3: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' )
                    {
                    // InternalMGLang.g:2061:3: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}' )
                    // InternalMGLang.g:2062:4: () otherlv_1= '{' ( (lv_expressions_2_0= ruleGeneratorExpression ) )* otherlv_3= '}'
                    {
                    // InternalMGLang.g:2062:4: ()
                    // InternalMGLang.g:2063:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getCaseBodyAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalMGLang.g:2073:4: ( (lv_expressions_2_0= ruleGeneratorExpression ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID||LA29_0==28||LA29_0==31||LA29_0==36||LA29_0==39) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMGLang.g:2074:5: (lv_expressions_2_0= ruleGeneratorExpression )
                    	    {
                    	    // InternalMGLang.g:2074:5: (lv_expressions_2_0= ruleGeneratorExpression )
                    	    // InternalMGLang.g:2075:6: lv_expressions_2_0= ruleGeneratorExpression
                    	    {

                    	    						newCompositeNode(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_expressions_2_0=ruleGeneratorExpression();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCaseBodyAccess().getRightCurlyBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2098:3: ( ( (lv_expressions_4_0= ruleGeneratorExpression ) ) this_NEWLINE_5= RULE_NEWLINE )
                    {
                    // InternalMGLang.g:2098:3: ( ( (lv_expressions_4_0= ruleGeneratorExpression ) ) this_NEWLINE_5= RULE_NEWLINE )
                    // InternalMGLang.g:2099:4: ( (lv_expressions_4_0= ruleGeneratorExpression ) ) this_NEWLINE_5= RULE_NEWLINE
                    {
                    // InternalMGLang.g:2099:4: ( (lv_expressions_4_0= ruleGeneratorExpression ) )
                    // InternalMGLang.g:2100:5: (lv_expressions_4_0= ruleGeneratorExpression )
                    {
                    // InternalMGLang.g:2100:5: (lv_expressions_4_0= ruleGeneratorExpression )
                    // InternalMGLang.g:2101:6: lv_expressions_4_0= ruleGeneratorExpression
                    {

                    						newCompositeNode(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_expressions_4_0=ruleGeneratorExpression();

                    state._fsp--;


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

                    this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_5, grammarAccess.getCaseBodyAccess().getNEWLINETerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2127:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMGLang.g:2127:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMGLang.g:2128:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2134:1: ruleCollection returns [EObject current=null] : (this_List_0= ruleList | this_Map_1= ruleMap ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject this_List_0 = null;

        EObject this_Map_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2140:2: ( (this_List_0= ruleList | this_Map_1= ruleMap ) )
            // InternalMGLang.g:2141:2: (this_List_0= ruleList | this_Map_1= ruleMap )
            {
            // InternalMGLang.g:2141:2: (this_List_0= ruleList | this_Map_1= ruleMap )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            else if ( (LA31_0==39) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMGLang.g:2142:3: this_List_0= ruleList
                    {

                    			newCompositeNode(grammarAccess.getCollectionAccess().getListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_0=ruleList();

                    state._fsp--;


                    			current = this_List_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2151:3: this_Map_1= ruleMap
                    {

                    			newCompositeNode(grammarAccess.getCollectionAccess().getMapParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Map_1=ruleMap();

                    state._fsp--;


                    			current = this_Map_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2163:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalMGLang.g:2163:45: (iv_ruleList= ruleList EOF )
            // InternalMGLang.g:2164:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2170:1: ruleList returns [EObject current=null] : (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAssignment_3= ruleListAssignment ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_2=null;
        EObject this_ListAssignment_3 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2176:2: ( (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAssignment_3= ruleListAssignment ) ) )
            // InternalMGLang.g:2177:2: (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAssignment_3= ruleListAssignment ) )
            {
            // InternalMGLang.g:2177:2: (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAssignment_3= ruleListAssignment ) )
            // InternalMGLang.g:2178:3: otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAssignment_3= ruleListAssignment )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
            		
            // InternalMGLang.g:2182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:2183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:2183:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:2184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getListAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalMGLang.g:2200:3: (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAssignment_3= ruleListAssignment )
            // InternalMGLang.g:2201:4: this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_ListAssignment_3= ruleListAssignment
            {
            this_ASSIGNMENT_OP_2=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_36); 

            				newLeafNode(this_ASSIGNMENT_OP_2, grammarAccess.getListAccess().getASSIGNMENT_OPTerminalRuleCall_2_0());
            			

            				newCompositeNode(grammarAccess.getListAccess().getListAssignmentParserRuleCall_2_1());
            			
            pushFollow(FOLLOW_2);
            this_ListAssignment_3=ruleListAssignment();

            state._fsp--;


            				current = this_ListAssignment_3;
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleListAssignment"
    // InternalMGLang.g:2218:1: entryRuleListAssignment returns [EObject current=null] : iv_ruleListAssignment= ruleListAssignment EOF ;
    public final EObject entryRuleListAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAssignment = null;


        try {
            // InternalMGLang.g:2218:55: (iv_ruleListAssignment= ruleListAssignment EOF )
            // InternalMGLang.g:2219:2: iv_ruleListAssignment= ruleListAssignment EOF
            {
             newCompositeNode(grammarAccess.getListAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListAssignment=ruleListAssignment();

            state._fsp--;

             current =iv_ruleListAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListAssignment"


    // $ANTLR start "ruleListAssignment"
    // InternalMGLang.g:2225:1: ruleListAssignment returns [EObject current=null] : (this_ListAdHoc_0= ruleListAdHoc | this_RefOrCall_1= ruleRefOrCall ) ;
    public final EObject ruleListAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_ListAdHoc_0 = null;

        EObject this_RefOrCall_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2231:2: ( (this_ListAdHoc_0= ruleListAdHoc | this_RefOrCall_1= ruleRefOrCall ) )
            // InternalMGLang.g:2232:2: (this_ListAdHoc_0= ruleListAdHoc | this_RefOrCall_1= ruleRefOrCall )
            {
            // InternalMGLang.g:2232:2: (this_ListAdHoc_0= ruleListAdHoc | this_RefOrCall_1= ruleRefOrCall )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMGLang.g:2233:3: this_ListAdHoc_0= ruleListAdHoc
                    {

                    			newCompositeNode(grammarAccess.getListAssignmentAccess().getListAdHocParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListAdHoc_0=ruleListAdHoc();

                    state._fsp--;


                    			current = this_ListAdHoc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2242:3: this_RefOrCall_1= ruleRefOrCall
                    {

                    			newCompositeNode(grammarAccess.getListAssignmentAccess().getRefOrCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefOrCall_1=ruleRefOrCall();

                    state._fsp--;


                    			current = this_RefOrCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListAssignment"


    // $ANTLR start "entryRuleListAdHoc"
    // InternalMGLang.g:2254:1: entryRuleListAdHoc returns [EObject current=null] : iv_ruleListAdHoc= ruleListAdHoc EOF ;
    public final EObject entryRuleListAdHoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAdHoc = null;


        try {
            // InternalMGLang.g:2254:50: (iv_ruleListAdHoc= ruleListAdHoc EOF )
            // InternalMGLang.g:2255:2: iv_ruleListAdHoc= ruleListAdHoc EOF
            {
             newCompositeNode(grammarAccess.getListAdHocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListAdHoc=ruleListAdHoc();

            state._fsp--;

             current =iv_ruleListAdHoc; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2261:1: ruleListAdHoc returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListAdHoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_elements_1_0 = null;

        AntlrDatatypeRuleToken lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2267:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' ) )
            // InternalMGLang.g:2268:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' )
            {
            // InternalMGLang.g:2268:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']' )
            // InternalMGLang.g:2269:3: otherlv_0= '[' ( (lv_elements_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMGLang.g:2273:3: ( (lv_elements_1_0= ruleLiteral ) )
            // InternalMGLang.g:2274:4: (lv_elements_1_0= ruleLiteral )
            {
            // InternalMGLang.g:2274:4: (lv_elements_1_0= ruleLiteral )
            // InternalMGLang.g:2275:5: lv_elements_1_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_elements_1_0=ruleLiteral();

            state._fsp--;


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

            // InternalMGLang.g:2292:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMGLang.g:2293:4: otherlv_2= ',' ( (lv_elements_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_37); 

            	    				newLeafNode(otherlv_2, grammarAccess.getListAdHocAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMGLang.g:2297:4: ( (lv_elements_3_0= ruleLiteral ) )
            	    // InternalMGLang.g:2298:5: (lv_elements_3_0= ruleLiteral )
            	    {
            	    // InternalMGLang.g:2298:5: (lv_elements_3_0= ruleLiteral )
            	    // InternalMGLang.g:2299:6: lv_elements_3_0= ruleLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_elements_3_0=ruleLiteral();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2325:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalMGLang.g:2325:44: (iv_ruleMap= ruleMap EOF )
            // InternalMGLang.g:2326:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2332:1: ruleMap returns [EObject current=null] : (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAssignment_3= ruleMapAssignment ) ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGNMENT_OP_2=null;
        EObject this_MapAssignment_3 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2338:2: ( (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAssignment_3= ruleMapAssignment ) ) )
            // InternalMGLang.g:2339:2: (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAssignment_3= ruleMapAssignment ) )
            {
            // InternalMGLang.g:2339:2: (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAssignment_3= ruleMapAssignment ) )
            // InternalMGLang.g:2340:3: otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAssignment_3= ruleMapAssignment )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getMapKeyword_0());
            		
            // InternalMGLang.g:2344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGLang.g:2345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGLang.g:2345:4: (lv_name_1_0= RULE_ID )
            // InternalMGLang.g:2346:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMapAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalMGLang.g:2362:3: (this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAssignment_3= ruleMapAssignment )
            // InternalMGLang.g:2363:4: this_ASSIGNMENT_OP_2= RULE_ASSIGNMENT_OP this_MapAssignment_3= ruleMapAssignment
            {
            this_ASSIGNMENT_OP_2=(Token)match(input,RULE_ASSIGNMENT_OP,FOLLOW_36); 

            				newLeafNode(this_ASSIGNMENT_OP_2, grammarAccess.getMapAccess().getASSIGNMENT_OPTerminalRuleCall_2_0());
            			

            				newCompositeNode(grammarAccess.getMapAccess().getMapAssignmentParserRuleCall_2_1());
            			
            pushFollow(FOLLOW_2);
            this_MapAssignment_3=ruleMapAssignment();

            state._fsp--;


            				current = this_MapAssignment_3;
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleMapAssignment"
    // InternalMGLang.g:2380:1: entryRuleMapAssignment returns [EObject current=null] : iv_ruleMapAssignment= ruleMapAssignment EOF ;
    public final EObject entryRuleMapAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapAssignment = null;


        try {
            // InternalMGLang.g:2380:54: (iv_ruleMapAssignment= ruleMapAssignment EOF )
            // InternalMGLang.g:2381:2: iv_ruleMapAssignment= ruleMapAssignment EOF
            {
             newCompositeNode(grammarAccess.getMapAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapAssignment=ruleMapAssignment();

            state._fsp--;

             current =iv_ruleMapAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMapAssignment"


    // $ANTLR start "ruleMapAssignment"
    // InternalMGLang.g:2387:1: ruleMapAssignment returns [EObject current=null] : (this_MapAdHoc_0= ruleMapAdHoc | this_RefOrCall_1= ruleRefOrCall ) ;
    public final EObject ruleMapAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_MapAdHoc_0 = null;

        EObject this_RefOrCall_1 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2393:2: ( (this_MapAdHoc_0= ruleMapAdHoc | this_RefOrCall_1= ruleRefOrCall ) )
            // InternalMGLang.g:2394:2: (this_MapAdHoc_0= ruleMapAdHoc | this_RefOrCall_1= ruleRefOrCall )
            {
            // InternalMGLang.g:2394:2: (this_MapAdHoc_0= ruleMapAdHoc | this_RefOrCall_1= ruleRefOrCall )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMGLang.g:2395:3: this_MapAdHoc_0= ruleMapAdHoc
                    {

                    			newCompositeNode(grammarAccess.getMapAssignmentAccess().getMapAdHocParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapAdHoc_0=ruleMapAdHoc();

                    state._fsp--;


                    			current = this_MapAdHoc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2404:3: this_RefOrCall_1= ruleRefOrCall
                    {

                    			newCompositeNode(grammarAccess.getMapAssignmentAccess().getRefOrCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefOrCall_1=ruleRefOrCall();

                    state._fsp--;


                    			current = this_RefOrCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapAssignment"


    // $ANTLR start "entryRuleMapAdHoc"
    // InternalMGLang.g:2416:1: entryRuleMapAdHoc returns [EObject current=null] : iv_ruleMapAdHoc= ruleMapAdHoc EOF ;
    public final EObject entryRuleMapAdHoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapAdHoc = null;


        try {
            // InternalMGLang.g:2416:49: (iv_ruleMapAdHoc= ruleMapAdHoc EOF )
            // InternalMGLang.g:2417:2: iv_ruleMapAdHoc= ruleMapAdHoc EOF
            {
             newCompositeNode(grammarAccess.getMapAdHocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapAdHoc=ruleMapAdHoc();

            state._fsp--;

             current =iv_ruleMapAdHoc; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2423:1: ruleMapAdHoc returns [EObject current=null] : (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMapAdHoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2429:2: ( (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' ) )
            // InternalMGLang.g:2430:2: (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' )
            {
            // InternalMGLang.g:2430:2: (otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']' )
            // InternalMGLang.g:2431:3: otherlv_0= '[' ( (lv_entries_1_0= ruleMapTupel ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMGLang.g:2435:3: ( (lv_entries_1_0= ruleMapTupel ) )
            // InternalMGLang.g:2436:4: (lv_entries_1_0= ruleMapTupel )
            {
            // InternalMGLang.g:2436:4: (lv_entries_1_0= ruleMapTupel )
            // InternalMGLang.g:2437:5: lv_entries_1_0= ruleMapTupel
            {

            					newCompositeNode(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_entries_1_0=ruleMapTupel();

            state._fsp--;


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

            // InternalMGLang.g:2454:3: (otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMGLang.g:2455:4: otherlv_2= ',' ( (lv_entries_3_0= ruleMapTupel ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMapAdHocAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMGLang.g:2459:4: ( (lv_entries_3_0= ruleMapTupel ) )
            	    // InternalMGLang.g:2460:5: (lv_entries_3_0= ruleMapTupel )
            	    {
            	    // InternalMGLang.g:2460:5: (lv_entries_3_0= ruleMapTupel )
            	    // InternalMGLang.g:2461:6: lv_entries_3_0= ruleMapTupel
            	    {

            	    						newCompositeNode(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_entries_3_0=ruleMapTupel();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2487:1: entryRuleMapTupel returns [EObject current=null] : iv_ruleMapTupel= ruleMapTupel EOF ;
    public final EObject entryRuleMapTupel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTupel = null;


        try {
            // InternalMGLang.g:2487:49: (iv_ruleMapTupel= ruleMapTupel EOF )
            // InternalMGLang.g:2488:2: iv_ruleMapTupel= ruleMapTupel EOF
            {
             newCompositeNode(grammarAccess.getMapTupelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapTupel=ruleMapTupel();

            state._fsp--;

             current =iv_ruleMapTupel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2494:1: ruleMapTupel returns [EObject current=null] : (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMapTupel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2500:2: ( (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' ) )
            // InternalMGLang.g:2501:2: (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' )
            {
            // InternalMGLang.g:2501:2: (otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')' )
            // InternalMGLang.g:2502:3: otherlv_0= '(' ( (lv_key_1_0= ruleLiteral ) ) otherlv_2= ',' ( (lv_value_3_0= ruleArithmeticExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMapTupelAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMGLang.g:2506:3: ( (lv_key_1_0= ruleLiteral ) )
            // InternalMGLang.g:2507:4: (lv_key_1_0= ruleLiteral )
            {
            // InternalMGLang.g:2507:4: (lv_key_1_0= ruleLiteral )
            // InternalMGLang.g:2508:5: lv_key_1_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getMapTupelAccess().getKeyLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_key_1_0=ruleLiteral();

            state._fsp--;


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

            otherlv_2=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getMapTupelAccess().getCommaKeyword_2());
            		
            // InternalMGLang.g:2529:3: ( (lv_value_3_0= ruleArithmeticExpression ) )
            // InternalMGLang.g:2530:4: (lv_value_3_0= ruleArithmeticExpression )
            {
            // InternalMGLang.g:2530:4: (lv_value_3_0= ruleArithmeticExpression )
            // InternalMGLang.g:2531:5: lv_value_3_0= ruleArithmeticExpression
            {

            					newCompositeNode(grammarAccess.getMapTupelAccess().getValueArithmeticExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
            lv_value_3_0=ruleArithmeticExpression();

            state._fsp--;


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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMapTupelAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2556:1: entryRuleForRange returns [EObject current=null] : iv_ruleForRange= ruleForRange EOF ;
    public final EObject entryRuleForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForRange = null;


        try {
            // InternalMGLang.g:2556:49: (iv_ruleForRange= ruleForRange EOF )
            // InternalMGLang.g:2557:2: iv_ruleForRange= ruleForRange EOF
            {
             newCompositeNode(grammarAccess.getForRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForRange=ruleForRange();

            state._fsp--;

             current =iv_ruleForRange; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2563:1: ruleForRange returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleForRange() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:2569:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalMGLang.g:2570:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalMGLang.g:2570:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalMGLang.g:2571:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalMGLang.g:2571:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalMGLang.g:2572:4: (lv_start_0_0= RULE_INT )
            {
            // InternalMGLang.g:2572:4: (lv_start_0_0= RULE_INT )
            // InternalMGLang.g:2573:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            					newLeafNode(lv_start_0_0, grammarAccess.getForRangeAccess().getStartINTTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getForRangeAccess().getColonKeyword_1());
            		
            // InternalMGLang.g:2593:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalMGLang.g:2594:4: (lv_end_2_0= RULE_INT )
            {
            // InternalMGLang.g:2594:4: (lv_end_2_0= RULE_INT )
            // InternalMGLang.g:2595:5: lv_end_2_0= RULE_INT
            {
            lv_end_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_end_2_0, grammarAccess.getForRangeAccess().getEndINTTerminalRuleCall_2_0());
            				

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


            	leaveRule();

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


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalMGLang.g:2615:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalMGLang.g:2615:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalMGLang.g:2616:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2622:1: ruleArithmeticExpression returns [EObject current=null] : this_TertiaryExpression_0= ruleTertiaryExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TertiaryExpression_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2628:2: (this_TertiaryExpression_0= ruleTertiaryExpression )
            // InternalMGLang.g:2629:2: this_TertiaryExpression_0= ruleTertiaryExpression
            {

            		newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getTertiaryExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TertiaryExpression_0=ruleTertiaryExpression();

            state._fsp--;


            		current = this_TertiaryExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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
    // InternalMGLang.g:2640:1: entryRuleTertiaryExpression returns [EObject current=null] : iv_ruleTertiaryExpression= ruleTertiaryExpression EOF ;
    public final EObject entryRuleTertiaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTertiaryExpression = null;


        try {
            // InternalMGLang.g:2640:59: (iv_ruleTertiaryExpression= ruleTertiaryExpression EOF )
            // InternalMGLang.g:2641:2: iv_ruleTertiaryExpression= ruleTertiaryExpression EOF
            {
             newCompositeNode(grammarAccess.getTertiaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTertiaryExpression=ruleTertiaryExpression();

            state._fsp--;

             current =iv_ruleTertiaryExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2647:1: ruleTertiaryExpression returns [EObject current=null] : (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* ) ;
    public final EObject ruleTertiaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SecondaryExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2653:2: ( (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* ) )
            // InternalMGLang.g:2654:2: (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* )
            {
            // InternalMGLang.g:2654:2: (this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )* )
            // InternalMGLang.g:2655:3: this_SecondaryExpression_0= ruleSecondaryExpression ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getSecondaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_SecondaryExpression_0=ruleSecondaryExpression();

            state._fsp--;


            			current = this_SecondaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:2663:3: ( () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30||(LA36_0>=53 && LA36_0<=54)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMGLang.g:2664:4: () ( (lv_op_2_0= ruleTertiaryOp ) ) ( (lv_right_3_0= ruleSecondaryExpression ) )
            	    {
            	    // InternalMGLang.g:2664:4: ()
            	    // InternalMGLang.g:2665:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGLang.g:2671:4: ( (lv_op_2_0= ruleTertiaryOp ) )
            	    // InternalMGLang.g:2672:5: (lv_op_2_0= ruleTertiaryOp )
            	    {
            	    // InternalMGLang.g:2672:5: (lv_op_2_0= ruleTertiaryOp )
            	    // InternalMGLang.g:2673:6: lv_op_2_0= ruleTertiaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getOpTertiaryOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleTertiaryOp();

            	    state._fsp--;


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

            	    // InternalMGLang.g:2690:4: ( (lv_right_3_0= ruleSecondaryExpression ) )
            	    // InternalMGLang.g:2691:5: (lv_right_3_0= ruleSecondaryExpression )
            	    {
            	    // InternalMGLang.g:2691:5: (lv_right_3_0= ruleSecondaryExpression )
            	    // InternalMGLang.g:2692:6: lv_right_3_0= ruleSecondaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getTertiaryExpressionAccess().getRightSecondaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleSecondaryExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2714:1: entryRuleSecondaryExpression returns [EObject current=null] : iv_ruleSecondaryExpression= ruleSecondaryExpression EOF ;
    public final EObject entryRuleSecondaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondaryExpression = null;


        try {
            // InternalMGLang.g:2714:60: (iv_ruleSecondaryExpression= ruleSecondaryExpression EOF )
            // InternalMGLang.g:2715:2: iv_ruleSecondaryExpression= ruleSecondaryExpression EOF
            {
             newCompositeNode(grammarAccess.getSecondaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondaryExpression=ruleSecondaryExpression();

            state._fsp--;

             current =iv_ruleSecondaryExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2721:1: ruleSecondaryExpression returns [EObject current=null] : (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleSecondaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpr_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2727:2: ( (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) )
            // InternalMGLang.g:2728:2: (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            {
            // InternalMGLang.g:2728:2: (this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            // InternalMGLang.g:2729:3: this_PrimaryExpr_0= rulePrimaryExpr ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getPrimaryExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;


            			current = this_PrimaryExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:2737:3: ( () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=55 && LA37_0<=56)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMGLang.g:2738:4: () ( (lv_op_2_0= ruleSecondaryOp ) ) ( (lv_right_3_0= rulePrimaryExpr ) )
            	    {
            	    // InternalMGLang.g:2738:4: ()
            	    // InternalMGLang.g:2739:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGLang.g:2745:4: ( (lv_op_2_0= ruleSecondaryOp ) )
            	    // InternalMGLang.g:2746:5: (lv_op_2_0= ruleSecondaryOp )
            	    {
            	    // InternalMGLang.g:2746:5: (lv_op_2_0= ruleSecondaryOp )
            	    // InternalMGLang.g:2747:6: lv_op_2_0= ruleSecondaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getOpSecondaryOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleSecondaryOp();

            	    state._fsp--;


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

            	    // InternalMGLang.g:2764:4: ( (lv_right_3_0= rulePrimaryExpr ) )
            	    // InternalMGLang.g:2765:5: (lv_right_3_0= rulePrimaryExpr )
            	    {
            	    // InternalMGLang.g:2765:5: (lv_right_3_0= rulePrimaryExpr )
            	    // InternalMGLang.g:2766:6: lv_right_3_0= rulePrimaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getSecondaryExpressionAccess().getRightPrimaryExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=rulePrimaryExpr();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2788:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalMGLang.g:2788:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalMGLang.g:2789:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2795:1: rulePrimaryExpr returns [EObject current=null] : (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_RelationExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2801:2: ( (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* ) )
            // InternalMGLang.g:2802:2: (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* )
            {
            // InternalMGLang.g:2802:2: (this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )* )
            // InternalMGLang.g:2803:3: this_RelationExpression_0= ruleRelationExpression ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExprAccess().getRelationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_RelationExpression_0=ruleRelationExpression();

            state._fsp--;


            			current = this_RelationExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:2811:3: ( () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=57 && LA38_0<=59)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMGLang.g:2812:4: () ( (lv_op_2_0= rulePrimaryOp ) ) ( (lv_right_3_0= ruleRelationExpression ) )
            	    {
            	    // InternalMGLang.g:2812:4: ()
            	    // InternalMGLang.g:2813:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGLang.g:2819:4: ( (lv_op_2_0= rulePrimaryOp ) )
            	    // InternalMGLang.g:2820:5: (lv_op_2_0= rulePrimaryOp )
            	    {
            	    // InternalMGLang.g:2820:5: (lv_op_2_0= rulePrimaryOp )
            	    // InternalMGLang.g:2821:6: lv_op_2_0= rulePrimaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getPrimaryExprAccess().getOpPrimaryOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=rulePrimaryOp();

            	    state._fsp--;


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

            	    // InternalMGLang.g:2838:4: ( (lv_right_3_0= ruleRelationExpression ) )
            	    // InternalMGLang.g:2839:5: (lv_right_3_0= ruleRelationExpression )
            	    {
            	    // InternalMGLang.g:2839:5: (lv_right_3_0= ruleRelationExpression )
            	    // InternalMGLang.g:2840:6: lv_right_3_0= ruleRelationExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPrimaryExprAccess().getRightRelationExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleRelationExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2862:1: entryRuleRelationExpression returns [EObject current=null] : iv_ruleRelationExpression= ruleRelationExpression EOF ;
    public final EObject entryRuleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationExpression = null;


        try {
            // InternalMGLang.g:2862:59: (iv_ruleRelationExpression= ruleRelationExpression EOF )
            // InternalMGLang.g:2863:2: iv_ruleRelationExpression= ruleRelationExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationExpression=ruleRelationExpression();

            state._fsp--;

             current =iv_ruleRelationExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2869:1: ruleRelationExpression returns [EObject current=null] : (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* ) ;
    public final EObject ruleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BaseExpr_0 = null;

        Enumerator lv_relation_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2875:2: ( (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* ) )
            // InternalMGLang.g:2876:2: (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* )
            {
            // InternalMGLang.g:2876:2: (this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )* )
            // InternalMGLang.g:2877:3: this_BaseExpr_0= ruleBaseExpr ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationExpressionAccess().getBaseExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_BaseExpr_0=ruleBaseExpr();

            state._fsp--;


            			current = this_BaseExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGLang.g:2885:3: ( () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=47 && LA39_0<=52)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMGLang.g:2886:4: () ( (lv_relation_2_0= ruleRelationalOp ) ) ( (lv_right_3_0= ruleBaseExpr ) )
            	    {
            	    // InternalMGLang.g:2886:4: ()
            	    // InternalMGLang.g:2887:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGLang.g:2893:4: ( (lv_relation_2_0= ruleRelationalOp ) )
            	    // InternalMGLang.g:2894:5: (lv_relation_2_0= ruleRelationalOp )
            	    {
            	    // InternalMGLang.g:2894:5: (lv_relation_2_0= ruleRelationalOp )
            	    // InternalMGLang.g:2895:6: lv_relation_2_0= ruleRelationalOp
            	    {

            	    						newCompositeNode(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_relation_2_0=ruleRelationalOp();

            	    state._fsp--;


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

            	    // InternalMGLang.g:2912:4: ( (lv_right_3_0= ruleBaseExpr ) )
            	    // InternalMGLang.g:2913:5: (lv_right_3_0= ruleBaseExpr )
            	    {
            	    // InternalMGLang.g:2913:5: (lv_right_3_0= ruleBaseExpr )
            	    // InternalMGLang.g:2914:6: lv_right_3_0= ruleBaseExpr
            	    {

            	    						newCompositeNode(grammarAccess.getRelationExpressionAccess().getRightBaseExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=ruleBaseExpr();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalMGLang.g:2936:1: entryRuleBaseExpr returns [EObject current=null] : iv_ruleBaseExpr= ruleBaseExpr EOF ;
    public final EObject entryRuleBaseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpr = null;


        try {
            // InternalMGLang.g:2936:49: (iv_ruleBaseExpr= ruleBaseExpr EOF )
            // InternalMGLang.g:2937:2: iv_ruleBaseExpr= ruleBaseExpr EOF
            {
             newCompositeNode(grammarAccess.getBaseExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpr=ruleBaseExpr();

            state._fsp--;

             current =iv_ruleBaseExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:2943:1: ruleBaseExpr returns [EObject current=null] : ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | ( () ruleLiteral ) | this_RefOrCall_13= ruleRefOrCall ) ;
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

        EObject this_RefOrCall_13 = null;



        	enterRule();

        try {
            // InternalMGLang.g:2949:2: ( ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | ( () ruleLiteral ) | this_RefOrCall_13= ruleRefOrCall ) )
            // InternalMGLang.g:2950:2: ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | ( () ruleLiteral ) | this_RefOrCall_13= ruleRefOrCall )
            {
            // InternalMGLang.g:2950:2: ( (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) ) | ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' ) | ( () ruleLiteral ) | this_RefOrCall_13= ruleRefOrCall )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt40=1;
                }
                break;
            case 40:
                {
                alt40=2;
                }
                break;
            case 41:
            case 42:
                {
                alt40=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt40=4;
                }
                break;
            case RULE_ID:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMGLang.g:2951:3: (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' )
                    {
                    // InternalMGLang.g:2951:3: (otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')' )
                    // InternalMGLang.g:2952:4: otherlv_0= '(' this_ArithmeticExpression_1= ruleArithmeticExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExprAccess().getArithmeticExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_33);
                    this_ArithmeticExpression_1=ruleArithmeticExpression();

                    state._fsp--;


                    				current = this_ArithmeticExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2970:3: ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) )
                    {
                    // InternalMGLang.g:2970:3: ( () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) ) )
                    // InternalMGLang.g:2971:4: () otherlv_4= '!' ( (lv_expr_5_0= ruleBaseExpr ) )
                    {
                    // InternalMGLang.g:2971:4: ()
                    // InternalMGLang.g:2972:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalMGLang.g:2982:4: ( (lv_expr_5_0= ruleBaseExpr ) )
                    // InternalMGLang.g:2983:5: (lv_expr_5_0= ruleBaseExpr )
                    {
                    // InternalMGLang.g:2983:5: (lv_expr_5_0= ruleBaseExpr )
                    // InternalMGLang.g:2984:6: lv_expr_5_0= ruleBaseExpr
                    {

                    						newCompositeNode(grammarAccess.getBaseExprAccess().getExprBaseExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_5_0=ruleBaseExpr();

                    state._fsp--;


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
                    break;
                case 3 :
                    // InternalMGLang.g:3003:3: ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' )
                    {
                    // InternalMGLang.g:3003:3: ( () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')' )
                    // InternalMGLang.g:3004:4: () ( (lv_func_7_0= ruleMathFunc ) ) otherlv_8= '(' ( (lv_expr_9_0= ruleArithmeticExpression ) ) otherlv_10= ')'
                    {
                    // InternalMGLang.g:3004:4: ()
                    // InternalMGLang.g:3005:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMGLang.g:3011:4: ( (lv_func_7_0= ruleMathFunc ) )
                    // InternalMGLang.g:3012:5: (lv_func_7_0= ruleMathFunc )
                    {
                    // InternalMGLang.g:3012:5: (lv_func_7_0= ruleMathFunc )
                    // InternalMGLang.g:3013:6: lv_func_7_0= ruleMathFunc
                    {

                    						newCompositeNode(grammarAccess.getBaseExprAccess().getFuncMathFuncEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_func_7_0=ruleMathFunc();

                    state._fsp--;


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

                    otherlv_8=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalMGLang.g:3034:4: ( (lv_expr_9_0= ruleArithmeticExpression ) )
                    // InternalMGLang.g:3035:5: (lv_expr_9_0= ruleArithmeticExpression )
                    {
                    // InternalMGLang.g:3035:5: (lv_expr_9_0= ruleArithmeticExpression )
                    // InternalMGLang.g:3036:6: lv_expr_9_0= ruleArithmeticExpression
                    {

                    						newCompositeNode(grammarAccess.getBaseExprAccess().getExprArithmeticExpressionParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_expr_9_0=ruleArithmeticExpression();

                    state._fsp--;


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

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:3059:3: ( () ruleLiteral )
                    {
                    // InternalMGLang.g:3059:3: ( () ruleLiteral )
                    // InternalMGLang.g:3060:4: () ruleLiteral
                    {
                    // InternalMGLang.g:3060:4: ()
                    // InternalMGLang.g:3061:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBaseExprAccess().getLiteralAction_3_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:3076:3: this_RefOrCall_13= ruleRefOrCall
                    {

                    			newCompositeNode(grammarAccess.getBaseExprAccess().getRefOrCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefOrCall_13=ruleRefOrCall();

                    state._fsp--;


                    			current = this_RefOrCall_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:3088:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalMGLang.g:3088:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMGLang.g:3089:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:3095:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BooleanLiteral_0 = null;

        AntlrDatatypeRuleToken this_StringLiteral_1 = null;

        AntlrDatatypeRuleToken this_NumberLiteral_2 = null;



        	enterRule();

        try {
            // InternalMGLang.g:3101:2: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral ) )
            // InternalMGLang.g:3102:2: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral )
            {
            // InternalMGLang.g:3102:2: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt41=1;
                }
                break;
            case RULE_STRING:
                {
                alt41=2;
                }
                break;
            case RULE_INT:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMGLang.g:3103:3: this_BooleanLiteral_0= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;


                    			current.merge(this_BooleanLiteral_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3114:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current.merge(this_StringLiteral_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3125:3: this_NumberLiteral_2= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;


                    			current.merge(this_NumberLiteral_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:3139:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // InternalMGLang.g:3139:54: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalMGLang.g:3140:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:3146:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_0=null;
        Token this_FALSE_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:3152:2: ( (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) )
            // InternalMGLang.g:3153:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            {
            // InternalMGLang.g:3153:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_TRUE) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_FALSE) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMGLang.g:3154:3: this_TRUE_0= RULE_TRUE
                    {
                    this_TRUE_0=(Token)match(input,RULE_TRUE,FOLLOW_2); 

                    			current.merge(this_TRUE_0);
                    		

                    			newLeafNode(this_TRUE_0, grammarAccess.getBooleanLiteralAccess().getTRUETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3162:3: this_FALSE_1= RULE_FALSE
                    {
                    this_FALSE_1=(Token)match(input,RULE_FALSE,FOLLOW_2); 

                    			current.merge(this_FALSE_1);
                    		

                    			newLeafNode(this_FALSE_1, grammarAccess.getBooleanLiteralAccess().getFALSETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:3173:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalMGLang.g:3173:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMGLang.g:3174:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:3180:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalMGLang.g:3186:2: (this_STRING_0= RULE_STRING )
            // InternalMGLang.g:3187:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalMGLang.g:3197:1: entryRuleNumberLiteral returns [String current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final String entryRuleNumberLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberLiteral = null;


        try {
            // InternalMGLang.g:3197:53: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMGLang.g:3198:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:3204:1: ruleNumberLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumberLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:3210:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalMGLang.g:3211:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalMGLang.g:3211:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalMGLang.g:3212:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_0());
            		
            // InternalMGLang.g:3219:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMGLang.g:3220:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,25,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberLiteralAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "ruleMathFunc"
    // InternalMGLang.g:3237:1: ruleMathFunc returns [Enumerator current=null] : ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) ) ;
    public final Enumerator ruleMathFunc() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:3243:2: ( ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) ) )
            // InternalMGLang.g:3244:2: ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) )
            {
            // InternalMGLang.g:3244:2: ( (enumLiteral_0= 'sqrt' ) | (enumLiteral_1= 'abs' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            else if ( (LA44_0==42) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMGLang.g:3245:3: (enumLiteral_0= 'sqrt' )
                    {
                    // InternalMGLang.g:3245:3: (enumLiteral_0= 'sqrt' )
                    // InternalMGLang.g:3246:4: enumLiteral_0= 'sqrt'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3253:3: (enumLiteral_1= 'abs' )
                    {
                    // InternalMGLang.g:3253:3: (enumLiteral_1= 'abs' )
                    // InternalMGLang.g:3254:4: enumLiteral_1= 'abs'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:3264:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMGLang.g:3270:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) )
            // InternalMGLang.g:3271:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            {
            // InternalMGLang.g:3271:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt45=1;
                }
                break;
            case 44:
                {
                alt45=2;
                }
                break;
            case 45:
                {
                alt45=3;
                }
                break;
            case 46:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalMGLang.g:3272:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMGLang.g:3272:3: (enumLiteral_0= 'int' )
                    // InternalMGLang.g:3273:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3280:3: (enumLiteral_1= 'char' )
                    {
                    // InternalMGLang.g:3280:3: (enumLiteral_1= 'char' )
                    // InternalMGLang.g:3281:4: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3288:3: (enumLiteral_2= 'double' )
                    {
                    // InternalMGLang.g:3288:3: (enumLiteral_2= 'double' )
                    // InternalMGLang.g:3289:4: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:3296:3: (enumLiteral_3= 'String' )
                    {
                    // InternalMGLang.g:3296:3: (enumLiteral_3= 'String' )
                    // InternalMGLang.g:3297:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:3307:1: ruleRelationalOp returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
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
            // InternalMGLang.g:3313:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalMGLang.g:3314:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalMGLang.g:3314:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt46=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt46=1;
                }
                break;
            case 48:
                {
                alt46=2;
                }
                break;
            case 49:
                {
                alt46=3;
                }
                break;
            case 50:
                {
                alt46=4;
                }
                break;
            case 51:
                {
                alt46=5;
                }
                break;
            case 52:
                {
                alt46=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalMGLang.g:3315:3: (enumLiteral_0= '>' )
                    {
                    // InternalMGLang.g:3315:3: (enumLiteral_0= '>' )
                    // InternalMGLang.g:3316:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3323:3: (enumLiteral_1= '>=' )
                    {
                    // InternalMGLang.g:3323:3: (enumLiteral_1= '>=' )
                    // InternalMGLang.g:3324:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3331:3: (enumLiteral_2= '==' )
                    {
                    // InternalMGLang.g:3331:3: (enumLiteral_2= '==' )
                    // InternalMGLang.g:3332:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:3339:3: (enumLiteral_3= '!=' )
                    {
                    // InternalMGLang.g:3339:3: (enumLiteral_3= '!=' )
                    // InternalMGLang.g:3340:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:3347:3: (enumLiteral_4= '<=' )
                    {
                    // InternalMGLang.g:3347:3: (enumLiteral_4= '<=' )
                    // InternalMGLang.g:3348:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:3355:3: (enumLiteral_5= '<' )
                    {
                    // InternalMGLang.g:3355:3: (enumLiteral_5= '<' )
                    // InternalMGLang.g:3356:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:3366:1: ruleTertiaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) ) ;
    public final Enumerator ruleTertiaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:3372:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) ) )
            // InternalMGLang.g:3373:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) )
            {
            // InternalMGLang.g:3373:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '||' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt47=1;
                }
                break;
            case 30:
                {
                alt47=2;
                }
                break;
            case 54:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalMGLang.g:3374:3: (enumLiteral_0= '+' )
                    {
                    // InternalMGLang.g:3374:3: (enumLiteral_0= '+' )
                    // InternalMGLang.g:3375:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3382:3: (enumLiteral_1= '-' )
                    {
                    // InternalMGLang.g:3382:3: (enumLiteral_1= '-' )
                    // InternalMGLang.g:3383:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3390:3: (enumLiteral_2= '||' )
                    {
                    // InternalMGLang.g:3390:3: (enumLiteral_2= '||' )
                    // InternalMGLang.g:3391:4: enumLiteral_2= '||'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:3401:1: ruleSecondaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) ) ;
    public final Enumerator ruleSecondaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMGLang.g:3407:2: ( ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) ) )
            // InternalMGLang.g:3408:2: ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) )
            {
            // InternalMGLang.g:3408:2: ( (enumLiteral_0= '%' ) | (enumLiteral_1= '^' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==55) ) {
                alt48=1;
            }
            else if ( (LA48_0==56) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalMGLang.g:3409:3: (enumLiteral_0= '%' )
                    {
                    // InternalMGLang.g:3409:3: (enumLiteral_0= '%' )
                    // InternalMGLang.g:3410:4: enumLiteral_0= '%'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3417:3: (enumLiteral_1= '^' )
                    {
                    // InternalMGLang.g:3417:3: (enumLiteral_1= '^' )
                    // InternalMGLang.g:3418:4: enumLiteral_1= '^'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalMGLang.g:3428:1: rulePrimaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) ) ;
    public final Enumerator rulePrimaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMGLang.g:3434:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) ) )
            // InternalMGLang.g:3435:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) )
            {
            // InternalMGLang.g:3435:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '&&' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt49=1;
                }
                break;
            case 58:
                {
                alt49=2;
                }
                break;
            case 59:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalMGLang.g:3436:3: (enumLiteral_0= '*' )
                    {
                    // InternalMGLang.g:3436:3: (enumLiteral_0= '*' )
                    // InternalMGLang.g:3437:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:3444:3: (enumLiteral_1= '/' )
                    {
                    // InternalMGLang.g:3444:3: (enumLiteral_1= '/' )
                    // InternalMGLang.g:3445:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:3452:3: (enumLiteral_2= '&&' )
                    {
                    // InternalMGLang.g:3452:3: (enumLiteral_2= '&&' )
                    // InternalMGLang.g:3453:4: enumLiteral_2= '&&'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008028002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000780000100020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000780000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000009080400020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000070000140730L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000070000040730L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000009090400020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000009090000022L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000500400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000009090200020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000072000040730L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000710L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0060000040000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0E00000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x001F800000000002L});

}
