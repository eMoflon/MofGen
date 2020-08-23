package org.mofgen.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mofgen.services.MGLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMGLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TRUE", "RULE_FALSE", "RULE_ASSIGNMENT_OP", "RULE_NEWLINE", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'test'", "'sqrt'", "'abs'", "'int'", "'char'", "'double'", "'String'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'+'", "'-'", "'||'", "'%'", "'^'", "'*'", "'/'", "'&&'", "'import'", "'as'", "'config'", "'('", "')'", "'{'", "'}'", "'pattern'", "','", "'return'", "'this'", "'.'", "'->'", "'gen'", "'for'", "'in'", "'switch'", "'case'", "':'", "'default'", "'when'", "'List'", "'['", "']'", "'Map'", "'!'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
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
    public static final int T__61=61;
    public static final int RULE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_FALSE=5;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=8;
    public static final int RULE_ASSIGNMENT_OP=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=10;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_TRUE=4;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
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

    	public void setGrammarAccess(MGLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMofgenFile"
    // InternalMGLang.g:53:1: entryRuleMofgenFile : ruleMofgenFile EOF ;
    public final void entryRuleMofgenFile() throws RecognitionException {
        try {
            // InternalMGLang.g:54:1: ( ruleMofgenFile EOF )
            // InternalMGLang.g:55:1: ruleMofgenFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMofgenFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMofgenFile"


    // $ANTLR start "ruleMofgenFile"
    // InternalMGLang.g:62:1: ruleMofgenFile : ( ( rule__MofgenFile__Group__0 ) ) ;
    public final void ruleMofgenFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:66:2: ( ( ( rule__MofgenFile__Group__0 ) ) )
            // InternalMGLang.g:67:2: ( ( rule__MofgenFile__Group__0 ) )
            {
            // InternalMGLang.g:67:2: ( ( rule__MofgenFile__Group__0 ) )
            // InternalMGLang.g:68:3: ( rule__MofgenFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getGroup()); 
            }
            // InternalMGLang.g:69:3: ( rule__MofgenFile__Group__0 )
            // InternalMGLang.g:69:4: rule__MofgenFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMofgenFile"


    // $ANTLR start "entryRuleImport"
    // InternalMGLang.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMGLang.g:79:1: ( ruleImport EOF )
            // InternalMGLang.g:80:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMGLang.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMGLang.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMGLang.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalMGLang.g:93:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalMGLang.g:94:3: ( rule__Import__Group__0 )
            // InternalMGLang.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleConfig"
    // InternalMGLang.g:103:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // InternalMGLang.g:104:1: ( ruleConfig EOF )
            // InternalMGLang.g:105:1: ruleConfig EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfig();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalMGLang.g:112:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:116:2: ( ( ( rule__Config__Group__0 ) ) )
            // InternalMGLang.g:117:2: ( ( rule__Config__Group__0 ) )
            {
            // InternalMGLang.g:117:2: ( ( rule__Config__Group__0 ) )
            // InternalMGLang.g:118:3: ( rule__Config__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getGroup()); 
            }
            // InternalMGLang.g:119:3: ( rule__Config__Group__0 )
            // InternalMGLang.g:119:4: rule__Config__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConfigExpression"
    // InternalMGLang.g:128:1: entryRuleConfigExpression : ruleConfigExpression EOF ;
    public final void entryRuleConfigExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:129:1: ( ruleConfigExpression EOF )
            // InternalMGLang.g:130:1: ruleConfigExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigExpression"


    // $ANTLR start "ruleConfigExpression"
    // InternalMGLang.g:137:1: ruleConfigExpression : ( 'test' ) ;
    public final void ruleConfigExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:141:2: ( ( 'test' ) )
            // InternalMGLang.g:142:2: ( 'test' )
            {
            // InternalMGLang.g:142:2: ( 'test' )
            // InternalMGLang.g:143:3: 'test'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigExpressionAccess().getTestKeyword()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigExpressionAccess().getTestKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigExpression"


    // $ANTLR start "entryRulePattern"
    // InternalMGLang.g:153:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMGLang.g:154:1: ( rulePattern EOF )
            // InternalMGLang.g:155:1: rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMGLang.g:162:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:166:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalMGLang.g:167:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalMGLang.g:167:2: ( ( rule__Pattern__Group__0 ) )
            // InternalMGLang.g:168:3: ( rule__Pattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup()); 
            }
            // InternalMGLang.g:169:3: ( rule__Pattern__Group__0 )
            // InternalMGLang.g:169:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRulePatternReturn"
    // InternalMGLang.g:178:1: entryRulePatternReturn : rulePatternReturn EOF ;
    public final void entryRulePatternReturn() throws RecognitionException {
        try {
            // InternalMGLang.g:179:1: ( rulePatternReturn EOF )
            // InternalMGLang.g:180:1: rulePatternReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePatternReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternReturn"


    // $ANTLR start "rulePatternReturn"
    // InternalMGLang.g:187:1: rulePatternReturn : ( ( rule__PatternReturn__Group__0 ) ) ;
    public final void rulePatternReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:191:2: ( ( ( rule__PatternReturn__Group__0 ) ) )
            // InternalMGLang.g:192:2: ( ( rule__PatternReturn__Group__0 ) )
            {
            // InternalMGLang.g:192:2: ( ( rule__PatternReturn__Group__0 ) )
            // InternalMGLang.g:193:3: ( rule__PatternReturn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getGroup()); 
            }
            // InternalMGLang.g:194:3: ( rule__PatternReturn__Group__0 )
            // InternalMGLang.g:194:4: rule__PatternReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternReturn"


    // $ANTLR start "entryRuleParamManipulation"
    // InternalMGLang.g:203:1: entryRuleParamManipulation : ruleParamManipulation EOF ;
    public final void entryRuleParamManipulation() throws RecognitionException {
        try {
            // InternalMGLang.g:204:1: ( ruleParamManipulation EOF )
            // InternalMGLang.g:205:1: ruleParamManipulation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParamManipulation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamManipulationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamManipulation"


    // $ANTLR start "ruleParamManipulation"
    // InternalMGLang.g:212:1: ruleParamManipulation : ( ( rule__ParamManipulation__Group__0 ) ) ;
    public final void ruleParamManipulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:216:2: ( ( ( rule__ParamManipulation__Group__0 ) ) )
            // InternalMGLang.g:217:2: ( ( rule__ParamManipulation__Group__0 ) )
            {
            // InternalMGLang.g:217:2: ( ( rule__ParamManipulation__Group__0 ) )
            // InternalMGLang.g:218:3: ( rule__ParamManipulation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getGroup()); 
            }
            // InternalMGLang.g:219:3: ( rule__ParamManipulation__Group__0 )
            // InternalMGLang.g:219:4: rule__ParamManipulation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamManipulationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamManipulation"


    // $ANTLR start "entryRuleNode"
    // InternalMGLang.g:228:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalMGLang.g:229:1: ( ruleNode EOF )
            // InternalMGLang.g:230:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalMGLang.g:237:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:241:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalMGLang.g:242:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalMGLang.g:242:2: ( ( rule__Node__Group__0 ) )
            // InternalMGLang.g:243:3: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalMGLang.g:244:3: ( rule__Node__Group__0 )
            // InternalMGLang.g:244:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeContent"
    // InternalMGLang.g:253:1: entryRuleNodeContent : ruleNodeContent EOF ;
    public final void entryRuleNodeContent() throws RecognitionException {
        try {
            // InternalMGLang.g:254:1: ( ruleNodeContent EOF )
            // InternalMGLang.g:255:1: ruleNodeContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNodeContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeContentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeContent"


    // $ANTLR start "ruleNodeContent"
    // InternalMGLang.g:262:1: ruleNodeContent : ( ( rule__NodeContent__Group__0 ) ) ;
    public final void ruleNodeContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:266:2: ( ( ( rule__NodeContent__Group__0 ) ) )
            // InternalMGLang.g:267:2: ( ( rule__NodeContent__Group__0 ) )
            {
            // InternalMGLang.g:267:2: ( ( rule__NodeContent__Group__0 ) )
            // InternalMGLang.g:268:3: ( rule__NodeContent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getGroup()); 
            }
            // InternalMGLang.g:269:3: ( rule__NodeContent__Group__0 )
            // InternalMGLang.g:269:4: rule__NodeContent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeContentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeContent"


    // $ANTLR start "entryRulePatternCall"
    // InternalMGLang.g:278:1: entryRulePatternCall : rulePatternCall EOF ;
    public final void entryRulePatternCall() throws RecognitionException {
        try {
            // InternalMGLang.g:279:1: ( rulePatternCall EOF )
            // InternalMGLang.g:280:1: rulePatternCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePatternCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternCall"


    // $ANTLR start "rulePatternCall"
    // InternalMGLang.g:287:1: rulePatternCall : ( ( rule__PatternCall__Group__0 ) ) ;
    public final void rulePatternCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:291:2: ( ( ( rule__PatternCall__Group__0 ) ) )
            // InternalMGLang.g:292:2: ( ( rule__PatternCall__Group__0 ) )
            {
            // InternalMGLang.g:292:2: ( ( rule__PatternCall__Group__0 ) )
            // InternalMGLang.g:293:3: ( rule__PatternCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getGroup()); 
            }
            // InternalMGLang.g:294:3: ( rule__PatternCall__Group__0 )
            // InternalMGLang.g:294:4: rule__PatternCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternCall"


    // $ANTLR start "entryRuleNodeReferenceOrAssignmentOrControlFlow"
    // InternalMGLang.g:303:1: entryRuleNodeReferenceOrAssignmentOrControlFlow : ruleNodeReferenceOrAssignmentOrControlFlow EOF ;
    public final void entryRuleNodeReferenceOrAssignmentOrControlFlow() throws RecognitionException {
        try {
            // InternalMGLang.g:304:1: ( ruleNodeReferenceOrAssignmentOrControlFlow EOF )
            // InternalMGLang.g:305:1: ruleNodeReferenceOrAssignmentOrControlFlow EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNodeReferenceOrAssignmentOrControlFlow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeReferenceOrAssignmentOrControlFlow"


    // $ANTLR start "ruleNodeReferenceOrAssignmentOrControlFlow"
    // InternalMGLang.g:312:1: ruleNodeReferenceOrAssignmentOrControlFlow : ( ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives ) ) ;
    public final void ruleNodeReferenceOrAssignmentOrControlFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:316:2: ( ( ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives ) ) )
            // InternalMGLang.g:317:2: ( ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives ) )
            {
            // InternalMGLang.g:317:2: ( ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives ) )
            // InternalMGLang.g:318:3: ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAlternatives()); 
            }
            // InternalMGLang.g:319:3: ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives )
            // InternalMGLang.g:319:4: rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeReferenceOrAssignmentOrControlFlow"


    // $ANTLR start "entryRulePatternNodeReference"
    // InternalMGLang.g:328:1: entryRulePatternNodeReference : rulePatternNodeReference EOF ;
    public final void entryRulePatternNodeReference() throws RecognitionException {
        try {
            // InternalMGLang.g:329:1: ( rulePatternNodeReference EOF )
            // InternalMGLang.g:330:1: rulePatternNodeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePatternNodeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternNodeReference"


    // $ANTLR start "rulePatternNodeReference"
    // InternalMGLang.g:337:1: rulePatternNodeReference : ( ( rule__PatternNodeReference__Group__0 ) ) ;
    public final void rulePatternNodeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:341:2: ( ( ( rule__PatternNodeReference__Group__0 ) ) )
            // InternalMGLang.g:342:2: ( ( rule__PatternNodeReference__Group__0 ) )
            {
            // InternalMGLang.g:342:2: ( ( rule__PatternNodeReference__Group__0 ) )
            // InternalMGLang.g:343:3: ( rule__PatternNodeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 
            }
            // InternalMGLang.g:344:3: ( rule__PatternNodeReference__Group__0 )
            // InternalMGLang.g:344:4: rule__PatternNodeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternNodeReference"


    // $ANTLR start "entryRuleAssignment"
    // InternalMGLang.g:353:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:354:1: ( ruleAssignment EOF )
            // InternalMGLang.g:355:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMGLang.g:362:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:366:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMGLang.g:367:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMGLang.g:367:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMGLang.g:368:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalMGLang.g:369:3: ( rule__Assignment__Group__0 )
            // InternalMGLang.g:369:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleParameter"
    // InternalMGLang.g:378:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:379:1: ( ruleParameter EOF )
            // InternalMGLang.g:380:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMGLang.g:387:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:391:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalMGLang.g:392:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalMGLang.g:392:2: ( ( rule__Parameter__Alternatives ) )
            // InternalMGLang.g:393:3: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // InternalMGLang.g:394:3: ( rule__Parameter__Alternatives )
            // InternalMGLang.g:394:4: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePrimitiveParameter"
    // InternalMGLang.g:403:1: entryRulePrimitiveParameter : rulePrimitiveParameter EOF ;
    public final void entryRulePrimitiveParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:404:1: ( rulePrimitiveParameter EOF )
            // InternalMGLang.g:405:1: rulePrimitiveParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimitiveParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveParameter"


    // $ANTLR start "rulePrimitiveParameter"
    // InternalMGLang.g:412:1: rulePrimitiveParameter : ( ( rule__PrimitiveParameter__Group__0 ) ) ;
    public final void rulePrimitiveParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:416:2: ( ( ( rule__PrimitiveParameter__Group__0 ) ) )
            // InternalMGLang.g:417:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            {
            // InternalMGLang.g:417:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            // InternalMGLang.g:418:3: ( rule__PrimitiveParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getGroup()); 
            }
            // InternalMGLang.g:419:3: ( rule__PrimitiveParameter__Group__0 )
            // InternalMGLang.g:419:4: rule__PrimitiveParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveParameter"


    // $ANTLR start "entryRuleParameterNode"
    // InternalMGLang.g:428:1: entryRuleParameterNode : ruleParameterNode EOF ;
    public final void entryRuleParameterNode() throws RecognitionException {
        try {
            // InternalMGLang.g:429:1: ( ruleParameterNode EOF )
            // InternalMGLang.g:430:1: ruleParameterNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterNode"


    // $ANTLR start "ruleParameterNode"
    // InternalMGLang.g:437:1: ruleParameterNode : ( ( rule__ParameterNode__Group__0 ) ) ;
    public final void ruleParameterNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:441:2: ( ( ( rule__ParameterNode__Group__0 ) ) )
            // InternalMGLang.g:442:2: ( ( rule__ParameterNode__Group__0 ) )
            {
            // InternalMGLang.g:442:2: ( ( rule__ParameterNode__Group__0 ) )
            // InternalMGLang.g:443:3: ( rule__ParameterNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getGroup()); 
            }
            // InternalMGLang.g:444:3: ( rule__ParameterNode__Group__0 )
            // InternalMGLang.g:444:4: rule__ParameterNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterNode"


    // $ANTLR start "entryRuleRefOrCall"
    // InternalMGLang.g:453:1: entryRuleRefOrCall : ruleRefOrCall EOF ;
    public final void entryRuleRefOrCall() throws RecognitionException {
        try {
            // InternalMGLang.g:454:1: ( ruleRefOrCall EOF )
            // InternalMGLang.g:455:1: ruleRefOrCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRefOrCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefOrCall"


    // $ANTLR start "ruleRefOrCall"
    // InternalMGLang.g:462:1: ruleRefOrCall : ( ( rule__RefOrCall__Group__0 ) ) ;
    public final void ruleRefOrCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:466:2: ( ( ( rule__RefOrCall__Group__0 ) ) )
            // InternalMGLang.g:467:2: ( ( rule__RefOrCall__Group__0 ) )
            {
            // InternalMGLang.g:467:2: ( ( rule__RefOrCall__Group__0 ) )
            // InternalMGLang.g:468:3: ( rule__RefOrCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getGroup()); 
            }
            // InternalMGLang.g:469:3: ( rule__RefOrCall__Group__0 )
            // InternalMGLang.g:469:4: rule__RefOrCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefOrCall"


    // $ANTLR start "entryRuleRefParams"
    // InternalMGLang.g:478:1: entryRuleRefParams : ruleRefParams EOF ;
    public final void entryRuleRefParams() throws RecognitionException {
        try {
            // InternalMGLang.g:479:1: ( ruleRefParams EOF )
            // InternalMGLang.g:480:1: ruleRefParams EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefParamsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRefParams();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefParamsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefParams"


    // $ANTLR start "ruleRefParams"
    // InternalMGLang.g:487:1: ruleRefParams : ( ( rule__RefParams__Group__0 ) ) ;
    public final void ruleRefParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:491:2: ( ( ( rule__RefParams__Group__0 ) ) )
            // InternalMGLang.g:492:2: ( ( rule__RefParams__Group__0 ) )
            {
            // InternalMGLang.g:492:2: ( ( rule__RefParams__Group__0 ) )
            // InternalMGLang.g:493:3: ( rule__RefParams__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefParamsAccess().getGroup()); 
            }
            // InternalMGLang.g:494:3: ( rule__RefParams__Group__0 )
            // InternalMGLang.g:494:4: rule__RefParams__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefParamsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefParams"


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:503:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalMGLang.g:504:1: ( ruleGenerator EOF )
            // InternalMGLang.g:505:1: ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // InternalMGLang.g:512:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:516:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalMGLang.g:517:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalMGLang.g:517:2: ( ( rule__Generator__Group__0 ) )
            // InternalMGLang.g:518:3: ( rule__Generator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup()); 
            }
            // InternalMGLang.g:519:3: ( rule__Generator__Group__0 )
            // InternalMGLang.g:519:4: rule__Generator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleGeneratorExpression"
    // InternalMGLang.g:528:1: entryRuleGeneratorExpression : ruleGeneratorExpression EOF ;
    public final void entryRuleGeneratorExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:529:1: ( ruleGeneratorExpression EOF )
            // InternalMGLang.g:530:1: ruleGeneratorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneratorExpression"


    // $ANTLR start "ruleGeneratorExpression"
    // InternalMGLang.g:537:1: ruleGeneratorExpression : ( ( rule__GeneratorExpression__Alternatives ) ) ;
    public final void ruleGeneratorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:541:2: ( ( ( rule__GeneratorExpression__Alternatives ) ) )
            // InternalMGLang.g:542:2: ( ( rule__GeneratorExpression__Alternatives ) )
            {
            // InternalMGLang.g:542:2: ( ( rule__GeneratorExpression__Alternatives ) )
            // InternalMGLang.g:543:3: ( rule__GeneratorExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorExpressionAccess().getAlternatives()); 
            }
            // InternalMGLang.g:544:3: ( rule__GeneratorExpression__Alternatives )
            // InternalMGLang.g:544:4: rule__GeneratorExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneratorExpression"


    // $ANTLR start "entryRulePatternVariable"
    // InternalMGLang.g:553:1: entryRulePatternVariable : rulePatternVariable EOF ;
    public final void entryRulePatternVariable() throws RecognitionException {
        try {
            // InternalMGLang.g:554:1: ( rulePatternVariable EOF )
            // InternalMGLang.g:555:1: rulePatternVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePatternVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternVariable"


    // $ANTLR start "rulePatternVariable"
    // InternalMGLang.g:562:1: rulePatternVariable : ( ( rule__PatternVariable__Group__0 ) ) ;
    public final void rulePatternVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:566:2: ( ( ( rule__PatternVariable__Group__0 ) ) )
            // InternalMGLang.g:567:2: ( ( rule__PatternVariable__Group__0 ) )
            {
            // InternalMGLang.g:567:2: ( ( rule__PatternVariable__Group__0 ) )
            // InternalMGLang.g:568:3: ( rule__PatternVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getGroup()); 
            }
            // InternalMGLang.g:569:3: ( rule__PatternVariable__Group__0 )
            // InternalMGLang.g:569:4: rule__PatternVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternVariable"


    // $ANTLR start "entryRuleForStatement"
    // InternalMGLang.g:578:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalMGLang.g:579:1: ( ruleForStatement EOF )
            // InternalMGLang.g:580:1: ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMGLang.g:587:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:591:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalMGLang.g:592:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalMGLang.g:592:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalMGLang.g:593:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalMGLang.g:594:3: ( rule__ForStatement__Group__0 )
            // InternalMGLang.g:594:4: rule__ForStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleForHead"
    // InternalMGLang.g:603:1: entryRuleForHead : ruleForHead EOF ;
    public final void entryRuleForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:604:1: ( ruleForHead EOF )
            // InternalMGLang.g:605:1: ruleForHead EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForHeadRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForHead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForHeadRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForHead"


    // $ANTLR start "ruleForHead"
    // InternalMGLang.g:612:1: ruleForHead : ( ( rule__ForHead__Alternatives ) ) ;
    public final void ruleForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:616:2: ( ( ( rule__ForHead__Alternatives ) ) )
            // InternalMGLang.g:617:2: ( ( rule__ForHead__Alternatives ) )
            {
            // InternalMGLang.g:617:2: ( ( rule__ForHead__Alternatives ) )
            // InternalMGLang.g:618:3: ( rule__ForHead__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForHeadAccess().getAlternatives()); 
            }
            // InternalMGLang.g:619:3: ( rule__ForHead__Alternatives )
            // InternalMGLang.g:619:4: rule__ForHead__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ForHead__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForHeadAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForHead"


    // $ANTLR start "entryRuleGeneralForHead"
    // InternalMGLang.g:628:1: entryRuleGeneralForHead : ruleGeneralForHead EOF ;
    public final void entryRuleGeneralForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:629:1: ( ruleGeneralForHead EOF )
            // InternalMGLang.g:630:1: ruleGeneralForHead EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGeneralForHead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralForHeadRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralForHead"


    // $ANTLR start "ruleGeneralForHead"
    // InternalMGLang.g:637:1: ruleGeneralForHead : ( ( rule__GeneralForHead__Group__0 ) ) ;
    public final void ruleGeneralForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:641:2: ( ( ( rule__GeneralForHead__Group__0 ) ) )
            // InternalMGLang.g:642:2: ( ( rule__GeneralForHead__Group__0 ) )
            {
            // InternalMGLang.g:642:2: ( ( rule__GeneralForHead__Group__0 ) )
            // InternalMGLang.g:643:3: ( rule__GeneralForHead__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getGroup()); 
            }
            // InternalMGLang.g:644:3: ( rule__GeneralForHead__Group__0 )
            // InternalMGLang.g:644:4: rule__GeneralForHead__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralForHeadAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralForHead"


    // $ANTLR start "entryRuleForEachHead"
    // InternalMGLang.g:653:1: entryRuleForEachHead : ruleForEachHead EOF ;
    public final void entryRuleForEachHead() throws RecognitionException {
        try {
            // InternalMGLang.g:654:1: ( ruleForEachHead EOF )
            // InternalMGLang.g:655:1: ruleForEachHead EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForEachHead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForEachHead"


    // $ANTLR start "ruleForEachHead"
    // InternalMGLang.g:662:1: ruleForEachHead : ( ( rule__ForEachHead__Group__0 ) ) ;
    public final void ruleForEachHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:666:2: ( ( ( rule__ForEachHead__Group__0 ) ) )
            // InternalMGLang.g:667:2: ( ( rule__ForEachHead__Group__0 ) )
            {
            // InternalMGLang.g:667:2: ( ( rule__ForEachHead__Group__0 ) )
            // InternalMGLang.g:668:3: ( rule__ForEachHead__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getGroup()); 
            }
            // InternalMGLang.g:669:3: ( rule__ForEachHead__Group__0 )
            // InternalMGLang.g:669:4: rule__ForEachHead__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForEachHead"


    // $ANTLR start "entryRuleForBody"
    // InternalMGLang.g:678:1: entryRuleForBody : ruleForBody EOF ;
    public final void entryRuleForBody() throws RecognitionException {
        try {
            // InternalMGLang.g:679:1: ( ruleForBody EOF )
            // InternalMGLang.g:680:1: ruleForBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForBodyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForBody"


    // $ANTLR start "ruleForBody"
    // InternalMGLang.g:687:1: ruleForBody : ( ( rule__ForBody__Group__0 ) ) ;
    public final void ruleForBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:691:2: ( ( ( rule__ForBody__Group__0 ) ) )
            // InternalMGLang.g:692:2: ( ( rule__ForBody__Group__0 ) )
            {
            // InternalMGLang.g:692:2: ( ( rule__ForBody__Group__0 ) )
            // InternalMGLang.g:693:3: ( rule__ForBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getGroup()); 
            }
            // InternalMGLang.g:694:3: ( rule__ForBody__Group__0 )
            // InternalMGLang.g:694:4: rule__ForBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForBody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForBodyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForBody"


    // $ANTLR start "entryRuleSwitchExpression"
    // InternalMGLang.g:703:1: entryRuleSwitchExpression : ruleSwitchExpression EOF ;
    public final void entryRuleSwitchExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:704:1: ( ruleSwitchExpression EOF )
            // InternalMGLang.g:705:1: ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSwitchExpression"


    // $ANTLR start "ruleSwitchExpression"
    // InternalMGLang.g:712:1: ruleSwitchExpression : ( ( rule__SwitchExpression__Alternatives ) ) ;
    public final void ruleSwitchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:716:2: ( ( ( rule__SwitchExpression__Alternatives ) ) )
            // InternalMGLang.g:717:2: ( ( rule__SwitchExpression__Alternatives ) )
            {
            // InternalMGLang.g:717:2: ( ( rule__SwitchExpression__Alternatives ) )
            // InternalMGLang.g:718:3: ( rule__SwitchExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getAlternatives()); 
            }
            // InternalMGLang.g:719:3: ( rule__SwitchExpression__Alternatives )
            // InternalMGLang.g:719:4: rule__SwitchExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSwitchExpression"


    // $ANTLR start "entryRuleSwitch"
    // InternalMGLang.g:728:1: entryRuleSwitch : ruleSwitch EOF ;
    public final void entryRuleSwitch() throws RecognitionException {
        try {
            // InternalMGLang.g:729:1: ( ruleSwitch EOF )
            // InternalMGLang.g:730:1: ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalMGLang.g:737:1: ruleSwitch : ( ( rule__Switch__Alternatives ) ) ;
    public final void ruleSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:741:2: ( ( ( rule__Switch__Alternatives ) ) )
            // InternalMGLang.g:742:2: ( ( rule__Switch__Alternatives ) )
            {
            // InternalMGLang.g:742:2: ( ( rule__Switch__Alternatives ) )
            // InternalMGLang.g:743:3: ( rule__Switch__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getAlternatives()); 
            }
            // InternalMGLang.g:744:3: ( rule__Switch__Alternatives )
            // InternalMGLang.g:744:4: rule__Switch__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Switch__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleIfElseSwitch"
    // InternalMGLang.g:753:1: entryRuleIfElseSwitch : ruleIfElseSwitch EOF ;
    public final void entryRuleIfElseSwitch() throws RecognitionException {
        try {
            // InternalMGLang.g:754:1: ( ruleIfElseSwitch EOF )
            // InternalMGLang.g:755:1: ruleIfElseSwitch EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfElseSwitch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfElseSwitch"


    // $ANTLR start "ruleIfElseSwitch"
    // InternalMGLang.g:762:1: ruleIfElseSwitch : ( ( rule__IfElseSwitch__Group__0 ) ) ;
    public final void ruleIfElseSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:766:2: ( ( ( rule__IfElseSwitch__Group__0 ) ) )
            // InternalMGLang.g:767:2: ( ( rule__IfElseSwitch__Group__0 ) )
            {
            // InternalMGLang.g:767:2: ( ( rule__IfElseSwitch__Group__0 ) )
            // InternalMGLang.g:768:3: ( rule__IfElseSwitch__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getGroup()); 
            }
            // InternalMGLang.g:769:3: ( rule__IfElseSwitch__Group__0 )
            // InternalMGLang.g:769:4: rule__IfElseSwitch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfElseSwitch"


    // $ANTLR start "entryRuleIfElseCase"
    // InternalMGLang.g:778:1: entryRuleIfElseCase : ruleIfElseCase EOF ;
    public final void entryRuleIfElseCase() throws RecognitionException {
        try {
            // InternalMGLang.g:779:1: ( ruleIfElseCase EOF )
            // InternalMGLang.g:780:1: ruleIfElseCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfElseCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseCaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfElseCase"


    // $ANTLR start "ruleIfElseCase"
    // InternalMGLang.g:787:1: ruleIfElseCase : ( ( rule__IfElseCase__Group__0 ) ) ;
    public final void ruleIfElseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:791:2: ( ( ( rule__IfElseCase__Group__0 ) ) )
            // InternalMGLang.g:792:2: ( ( rule__IfElseCase__Group__0 ) )
            {
            // InternalMGLang.g:792:2: ( ( rule__IfElseCase__Group__0 ) )
            // InternalMGLang.g:793:3: ( rule__IfElseCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getGroup()); 
            }
            // InternalMGLang.g:794:3: ( rule__IfElseCase__Group__0 )
            // InternalMGLang.g:794:4: rule__IfElseCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseCaseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfElseCase"


    // $ANTLR start "entryRuleDefault"
    // InternalMGLang.g:803:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // InternalMGLang.g:804:1: ( ruleDefault EOF )
            // InternalMGLang.g:805:1: ruleDefault EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalMGLang.g:812:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:816:2: ( ( ( rule__Default__Group__0 ) ) )
            // InternalMGLang.g:817:2: ( ( rule__Default__Group__0 ) )
            {
            // InternalMGLang.g:817:2: ( ( rule__Default__Group__0 ) )
            // InternalMGLang.g:818:3: ( rule__Default__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getGroup()); 
            }
            // InternalMGLang.g:819:3: ( rule__Default__Group__0 )
            // InternalMGLang.g:819:4: rule__Default__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleSwitchCase"
    // InternalMGLang.g:828:1: entryRuleSwitchCase : ruleSwitchCase EOF ;
    public final void entryRuleSwitchCase() throws RecognitionException {
        try {
            // InternalMGLang.g:829:1: ( ruleSwitchCase EOF )
            // InternalMGLang.g:830:1: ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // InternalMGLang.g:837:1: ruleSwitchCase : ( ( rule__SwitchCase__Group__0 ) ) ;
    public final void ruleSwitchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:841:2: ( ( ( rule__SwitchCase__Group__0 ) ) )
            // InternalMGLang.g:842:2: ( ( rule__SwitchCase__Group__0 ) )
            {
            // InternalMGLang.g:842:2: ( ( rule__SwitchCase__Group__0 ) )
            // InternalMGLang.g:843:3: ( rule__SwitchCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getGroup()); 
            }
            // InternalMGLang.g:844:3: ( rule__SwitchCase__Group__0 )
            // InternalMGLang.g:844:4: rule__SwitchCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleCase"
    // InternalMGLang.g:853:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalMGLang.g:854:1: ( ruleCase EOF )
            // InternalMGLang.g:855:1: ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalMGLang.g:862:1: ruleCase : ( ( rule__Case__Alternatives ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:866:2: ( ( ( rule__Case__Alternatives ) ) )
            // InternalMGLang.g:867:2: ( ( rule__Case__Alternatives ) )
            {
            // InternalMGLang.g:867:2: ( ( rule__Case__Alternatives ) )
            // InternalMGLang.g:868:3: ( rule__Case__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getAlternatives()); 
            }
            // InternalMGLang.g:869:3: ( rule__Case__Alternatives )
            // InternalMGLang.g:869:4: rule__Case__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Case__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleCaseWithCast"
    // InternalMGLang.g:878:1: entryRuleCaseWithCast : ruleCaseWithCast EOF ;
    public final void entryRuleCaseWithCast() throws RecognitionException {
        try {
            // InternalMGLang.g:879:1: ( ruleCaseWithCast EOF )
            // InternalMGLang.g:880:1: ruleCaseWithCast EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCaseWithCast();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaseWithCast"


    // $ANTLR start "ruleCaseWithCast"
    // InternalMGLang.g:887:1: ruleCaseWithCast : ( ( rule__CaseWithCast__Group__0 ) ) ;
    public final void ruleCaseWithCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:891:2: ( ( ( rule__CaseWithCast__Group__0 ) ) )
            // InternalMGLang.g:892:2: ( ( rule__CaseWithCast__Group__0 ) )
            {
            // InternalMGLang.g:892:2: ( ( rule__CaseWithCast__Group__0 ) )
            // InternalMGLang.g:893:3: ( rule__CaseWithCast__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getGroup()); 
            }
            // InternalMGLang.g:894:3: ( rule__CaseWithCast__Group__0 )
            // InternalMGLang.g:894:4: rule__CaseWithCast__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaseWithCast"


    // $ANTLR start "entryRuleCaseWithoutCast"
    // InternalMGLang.g:903:1: entryRuleCaseWithoutCast : ruleCaseWithoutCast EOF ;
    public final void entryRuleCaseWithoutCast() throws RecognitionException {
        try {
            // InternalMGLang.g:904:1: ( ruleCaseWithoutCast EOF )
            // InternalMGLang.g:905:1: ruleCaseWithoutCast EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithoutCastRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCaseWithoutCast();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithoutCastRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaseWithoutCast"


    // $ANTLR start "ruleCaseWithoutCast"
    // InternalMGLang.g:912:1: ruleCaseWithoutCast : ( ( rule__CaseWithoutCast__Group__0 ) ) ;
    public final void ruleCaseWithoutCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:916:2: ( ( ( rule__CaseWithoutCast__Group__0 ) ) )
            // InternalMGLang.g:917:2: ( ( rule__CaseWithoutCast__Group__0 ) )
            {
            // InternalMGLang.g:917:2: ( ( rule__CaseWithoutCast__Group__0 ) )
            // InternalMGLang.g:918:3: ( rule__CaseWithoutCast__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithoutCastAccess().getGroup()); 
            }
            // InternalMGLang.g:919:3: ( rule__CaseWithoutCast__Group__0 )
            // InternalMGLang.g:919:4: rule__CaseWithoutCast__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithoutCastAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaseWithoutCast"


    // $ANTLR start "entryRuleCaseBody"
    // InternalMGLang.g:928:1: entryRuleCaseBody : ruleCaseBody EOF ;
    public final void entryRuleCaseBody() throws RecognitionException {
        try {
            // InternalMGLang.g:929:1: ( ruleCaseBody EOF )
            // InternalMGLang.g:930:1: ruleCaseBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCaseBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaseBody"


    // $ANTLR start "ruleCaseBody"
    // InternalMGLang.g:937:1: ruleCaseBody : ( ( rule__CaseBody__Alternatives ) ) ;
    public final void ruleCaseBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:941:2: ( ( ( rule__CaseBody__Alternatives ) ) )
            // InternalMGLang.g:942:2: ( ( rule__CaseBody__Alternatives ) )
            {
            // InternalMGLang.g:942:2: ( ( rule__CaseBody__Alternatives ) )
            // InternalMGLang.g:943:3: ( rule__CaseBody__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getAlternatives()); 
            }
            // InternalMGLang.g:944:3: ( rule__CaseBody__Alternatives )
            // InternalMGLang.g:944:4: rule__CaseBody__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CaseBody__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaseBody"


    // $ANTLR start "entryRuleCollection"
    // InternalMGLang.g:953:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMGLang.g:954:1: ( ruleCollection EOF )
            // InternalMGLang.g:955:1: ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCollection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMGLang.g:962:1: ruleCollection : ( ( rule__Collection__Alternatives ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:966:2: ( ( ( rule__Collection__Alternatives ) ) )
            // InternalMGLang.g:967:2: ( ( rule__Collection__Alternatives ) )
            {
            // InternalMGLang.g:967:2: ( ( rule__Collection__Alternatives ) )
            // InternalMGLang.g:968:3: ( rule__Collection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getAlternatives()); 
            }
            // InternalMGLang.g:969:3: ( rule__Collection__Alternatives )
            // InternalMGLang.g:969:4: rule__Collection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleList"
    // InternalMGLang.g:978:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMGLang.g:979:1: ( ruleList EOF )
            // InternalMGLang.g:980:1: ruleList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMGLang.g:987:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:991:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalMGLang.g:992:2: ( ( rule__List__Group__0 ) )
            {
            // InternalMGLang.g:992:2: ( ( rule__List__Group__0 ) )
            // InternalMGLang.g:993:3: ( rule__List__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup()); 
            }
            // InternalMGLang.g:994:3: ( rule__List__Group__0 )
            // InternalMGLang.g:994:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleListAssignment"
    // InternalMGLang.g:1003:1: entryRuleListAssignment : ruleListAssignment EOF ;
    public final void entryRuleListAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:1004:1: ( ruleListAssignment EOF )
            // InternalMGLang.g:1005:1: ruleListAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListAssignment"


    // $ANTLR start "ruleListAssignment"
    // InternalMGLang.g:1012:1: ruleListAssignment : ( ( rule__ListAssignment__Alternatives ) ) ;
    public final void ruleListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1016:2: ( ( ( rule__ListAssignment__Alternatives ) ) )
            // InternalMGLang.g:1017:2: ( ( rule__ListAssignment__Alternatives ) )
            {
            // InternalMGLang.g:1017:2: ( ( rule__ListAssignment__Alternatives ) )
            // InternalMGLang.g:1018:3: ( rule__ListAssignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAssignmentAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1019:3: ( rule__ListAssignment__Alternatives )
            // InternalMGLang.g:1019:4: rule__ListAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListAssignment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAssignmentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListAssignment"


    // $ANTLR start "entryRuleListAdHoc"
    // InternalMGLang.g:1028:1: entryRuleListAdHoc : ruleListAdHoc EOF ;
    public final void entryRuleListAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:1029:1: ( ruleListAdHoc EOF )
            // InternalMGLang.g:1030:1: ruleListAdHoc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListAdHoc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListAdHoc"


    // $ANTLR start "ruleListAdHoc"
    // InternalMGLang.g:1037:1: ruleListAdHoc : ( ( rule__ListAdHoc__Group__0 ) ) ;
    public final void ruleListAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1041:2: ( ( ( rule__ListAdHoc__Group__0 ) ) )
            // InternalMGLang.g:1042:2: ( ( rule__ListAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:1042:2: ( ( rule__ListAdHoc__Group__0 ) )
            // InternalMGLang.g:1043:3: ( rule__ListAdHoc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getGroup()); 
            }
            // InternalMGLang.g:1044:3: ( rule__ListAdHoc__Group__0 )
            // InternalMGLang.g:1044:4: rule__ListAdHoc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListAdHoc"


    // $ANTLR start "entryRuleMap"
    // InternalMGLang.g:1053:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalMGLang.g:1054:1: ( ruleMap EOF )
            // InternalMGLang.g:1055:1: ruleMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalMGLang.g:1062:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1066:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalMGLang.g:1067:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalMGLang.g:1067:2: ( ( rule__Map__Group__0 ) )
            // InternalMGLang.g:1068:3: ( rule__Map__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getGroup()); 
            }
            // InternalMGLang.g:1069:3: ( rule__Map__Group__0 )
            // InternalMGLang.g:1069:4: rule__Map__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapAssignment"
    // InternalMGLang.g:1078:1: entryRuleMapAssignment : ruleMapAssignment EOF ;
    public final void entryRuleMapAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:1079:1: ( ruleMapAssignment EOF )
            // InternalMGLang.g:1080:1: ruleMapAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapAssignment"


    // $ANTLR start "ruleMapAssignment"
    // InternalMGLang.g:1087:1: ruleMapAssignment : ( ( rule__MapAssignment__Alternatives ) ) ;
    public final void ruleMapAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1091:2: ( ( ( rule__MapAssignment__Alternatives ) ) )
            // InternalMGLang.g:1092:2: ( ( rule__MapAssignment__Alternatives ) )
            {
            // InternalMGLang.g:1092:2: ( ( rule__MapAssignment__Alternatives ) )
            // InternalMGLang.g:1093:3: ( rule__MapAssignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAssignmentAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1094:3: ( rule__MapAssignment__Alternatives )
            // InternalMGLang.g:1094:4: rule__MapAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MapAssignment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAssignmentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapAssignment"


    // $ANTLR start "entryRuleMapAdHoc"
    // InternalMGLang.g:1103:1: entryRuleMapAdHoc : ruleMapAdHoc EOF ;
    public final void entryRuleMapAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:1104:1: ( ruleMapAdHoc EOF )
            // InternalMGLang.g:1105:1: ruleMapAdHoc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapAdHoc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapAdHoc"


    // $ANTLR start "ruleMapAdHoc"
    // InternalMGLang.g:1112:1: ruleMapAdHoc : ( ( rule__MapAdHoc__Group__0 ) ) ;
    public final void ruleMapAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1116:2: ( ( ( rule__MapAdHoc__Group__0 ) ) )
            // InternalMGLang.g:1117:2: ( ( rule__MapAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:1117:2: ( ( rule__MapAdHoc__Group__0 ) )
            // InternalMGLang.g:1118:3: ( rule__MapAdHoc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getGroup()); 
            }
            // InternalMGLang.g:1119:3: ( rule__MapAdHoc__Group__0 )
            // InternalMGLang.g:1119:4: rule__MapAdHoc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapAdHoc"


    // $ANTLR start "entryRuleMapTupel"
    // InternalMGLang.g:1128:1: entryRuleMapTupel : ruleMapTupel EOF ;
    public final void entryRuleMapTupel() throws RecognitionException {
        try {
            // InternalMGLang.g:1129:1: ( ruleMapTupel EOF )
            // InternalMGLang.g:1130:1: ruleMapTupel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapTupel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapTupel"


    // $ANTLR start "ruleMapTupel"
    // InternalMGLang.g:1137:1: ruleMapTupel : ( ( rule__MapTupel__Group__0 ) ) ;
    public final void ruleMapTupel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1141:2: ( ( ( rule__MapTupel__Group__0 ) ) )
            // InternalMGLang.g:1142:2: ( ( rule__MapTupel__Group__0 ) )
            {
            // InternalMGLang.g:1142:2: ( ( rule__MapTupel__Group__0 ) )
            // InternalMGLang.g:1143:3: ( rule__MapTupel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getGroup()); 
            }
            // InternalMGLang.g:1144:3: ( rule__MapTupel__Group__0 )
            // InternalMGLang.g:1144:4: rule__MapTupel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapTupel"


    // $ANTLR start "entryRuleForRange"
    // InternalMGLang.g:1153:1: entryRuleForRange : ruleForRange EOF ;
    public final void entryRuleForRange() throws RecognitionException {
        try {
            // InternalMGLang.g:1154:1: ( ruleForRange EOF )
            // InternalMGLang.g:1155:1: ruleForRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForRange"


    // $ANTLR start "ruleForRange"
    // InternalMGLang.g:1162:1: ruleForRange : ( ( rule__ForRange__Group__0 ) ) ;
    public final void ruleForRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1166:2: ( ( ( rule__ForRange__Group__0 ) ) )
            // InternalMGLang.g:1167:2: ( ( rule__ForRange__Group__0 ) )
            {
            // InternalMGLang.g:1167:2: ( ( rule__ForRange__Group__0 ) )
            // InternalMGLang.g:1168:3: ( rule__ForRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getGroup()); 
            }
            // InternalMGLang.g:1169:3: ( rule__ForRange__Group__0 )
            // InternalMGLang.g:1169:4: rule__ForRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForRange"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalMGLang.g:1178:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1179:1: ( ruleArithmeticExpression EOF )
            // InternalMGLang.g:1180:1: ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalMGLang.g:1187:1: ruleArithmeticExpression : ( ruleTertiaryExpression ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1191:2: ( ( ruleTertiaryExpression ) )
            // InternalMGLang.g:1192:2: ( ruleTertiaryExpression )
            {
            // InternalMGLang.g:1192:2: ( ruleTertiaryExpression )
            // InternalMGLang.g:1193:3: ruleTertiaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArithmeticExpressionAccess().getTertiaryExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleTertiaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArithmeticExpressionAccess().getTertiaryExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleTertiaryExpression"
    // InternalMGLang.g:1203:1: entryRuleTertiaryExpression : ruleTertiaryExpression EOF ;
    public final void entryRuleTertiaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1204:1: ( ruleTertiaryExpression EOF )
            // InternalMGLang.g:1205:1: ruleTertiaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTertiaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTertiaryExpression"


    // $ANTLR start "ruleTertiaryExpression"
    // InternalMGLang.g:1212:1: ruleTertiaryExpression : ( ( rule__TertiaryExpression__Group__0 ) ) ;
    public final void ruleTertiaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1216:2: ( ( ( rule__TertiaryExpression__Group__0 ) ) )
            // InternalMGLang.g:1217:2: ( ( rule__TertiaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:1217:2: ( ( rule__TertiaryExpression__Group__0 ) )
            // InternalMGLang.g:1218:3: ( rule__TertiaryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:1219:3: ( rule__TertiaryExpression__Group__0 )
            // InternalMGLang.g:1219:4: rule__TertiaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTertiaryExpression"


    // $ANTLR start "entryRuleSecondaryExpression"
    // InternalMGLang.g:1228:1: entryRuleSecondaryExpression : ruleSecondaryExpression EOF ;
    public final void entryRuleSecondaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1229:1: ( ruleSecondaryExpression EOF )
            // InternalMGLang.g:1230:1: ruleSecondaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSecondaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecondaryExpression"


    // $ANTLR start "ruleSecondaryExpression"
    // InternalMGLang.g:1237:1: ruleSecondaryExpression : ( ( rule__SecondaryExpression__Group__0 ) ) ;
    public final void ruleSecondaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1241:2: ( ( ( rule__SecondaryExpression__Group__0 ) ) )
            // InternalMGLang.g:1242:2: ( ( rule__SecondaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:1242:2: ( ( rule__SecondaryExpression__Group__0 ) )
            // InternalMGLang.g:1243:3: ( rule__SecondaryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:1244:3: ( rule__SecondaryExpression__Group__0 )
            // InternalMGLang.g:1244:4: rule__SecondaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecondaryExpression"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalMGLang.g:1253:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:1254:1: ( rulePrimaryExpr EOF )
            // InternalMGLang.g:1255:1: rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalMGLang.g:1262:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Group__0 ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1266:2: ( ( ( rule__PrimaryExpr__Group__0 ) ) )
            // InternalMGLang.g:1267:2: ( ( rule__PrimaryExpr__Group__0 ) )
            {
            // InternalMGLang.g:1267:2: ( ( rule__PrimaryExpr__Group__0 ) )
            // InternalMGLang.g:1268:3: ( rule__PrimaryExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup()); 
            }
            // InternalMGLang.g:1269:3: ( rule__PrimaryExpr__Group__0 )
            // InternalMGLang.g:1269:4: rule__PrimaryExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleRelationExpression"
    // InternalMGLang.g:1278:1: entryRuleRelationExpression : ruleRelationExpression EOF ;
    public final void entryRuleRelationExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1279:1: ( ruleRelationExpression EOF )
            // InternalMGLang.g:1280:1: ruleRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationExpression"


    // $ANTLR start "ruleRelationExpression"
    // InternalMGLang.g:1287:1: ruleRelationExpression : ( ( rule__RelationExpression__Group__0 ) ) ;
    public final void ruleRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1291:2: ( ( ( rule__RelationExpression__Group__0 ) ) )
            // InternalMGLang.g:1292:2: ( ( rule__RelationExpression__Group__0 ) )
            {
            // InternalMGLang.g:1292:2: ( ( rule__RelationExpression__Group__0 ) )
            // InternalMGLang.g:1293:3: ( rule__RelationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:1294:3: ( rule__RelationExpression__Group__0 )
            // InternalMGLang.g:1294:4: rule__RelationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationExpression"


    // $ANTLR start "entryRuleBaseExpr"
    // InternalMGLang.g:1303:1: entryRuleBaseExpr : ruleBaseExpr EOF ;
    public final void entryRuleBaseExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:1304:1: ( ruleBaseExpr EOF )
            // InternalMGLang.g:1305:1: ruleBaseExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBaseExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseExpr"


    // $ANTLR start "ruleBaseExpr"
    // InternalMGLang.g:1312:1: ruleBaseExpr : ( ( rule__BaseExpr__Alternatives ) ) ;
    public final void ruleBaseExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1316:2: ( ( ( rule__BaseExpr__Alternatives ) ) )
            // InternalMGLang.g:1317:2: ( ( rule__BaseExpr__Alternatives ) )
            {
            // InternalMGLang.g:1317:2: ( ( rule__BaseExpr__Alternatives ) )
            // InternalMGLang.g:1318:3: ( rule__BaseExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1319:3: ( rule__BaseExpr__Alternatives )
            // InternalMGLang.g:1319:4: rule__BaseExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseExpr"


    // $ANTLR start "entryRuleLiteral"
    // InternalMGLang.g:1328:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1329:1: ( ruleLiteral EOF )
            // InternalMGLang.g:1330:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMGLang.g:1337:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1341:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMGLang.g:1342:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMGLang.g:1342:2: ( ( rule__Literal__Alternatives ) )
            // InternalMGLang.g:1343:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1344:3: ( rule__Literal__Alternatives )
            // InternalMGLang.g:1344:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMGLang.g:1353:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1354:1: ( ruleBooleanLiteral EOF )
            // InternalMGLang.g:1355:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMGLang.g:1362:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1366:2: ( ( ( rule__BooleanLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1367:2: ( ( rule__BooleanLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1367:2: ( ( rule__BooleanLiteral__ValAssignment ) )
            // InternalMGLang.g:1368:3: ( rule__BooleanLiteral__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValAssignment()); 
            }
            // InternalMGLang.g:1369:3: ( rule__BooleanLiteral__ValAssignment )
            // InternalMGLang.g:1369:4: rule__BooleanLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMGLang.g:1378:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1379:1: ( ruleStringLiteral EOF )
            // InternalMGLang.g:1380:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMGLang.g:1387:1: ruleStringLiteral : ( ( rule__StringLiteral__ValAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1391:2: ( ( ( rule__StringLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1392:2: ( ( rule__StringLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1392:2: ( ( rule__StringLiteral__ValAssignment ) )
            // InternalMGLang.g:1393:3: ( rule__StringLiteral__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValAssignment()); 
            }
            // InternalMGLang.g:1394:3: ( rule__StringLiteral__ValAssignment )
            // InternalMGLang.g:1394:4: rule__StringLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMGLang.g:1403:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1404:1: ( ruleNumberLiteral EOF )
            // InternalMGLang.g:1405:1: ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMGLang.g:1412:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1416:2: ( ( ( rule__NumberLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1417:2: ( ( rule__NumberLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1417:2: ( ( rule__NumberLiteral__ValAssignment ) )
            // InternalMGLang.g:1418:3: ( rule__NumberLiteral__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValAssignment()); 
            }
            // InternalMGLang.g:1419:3: ( rule__NumberLiteral__ValAssignment )
            // InternalMGLang.g:1419:4: rule__NumberLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "ruleMathFunc"
    // InternalMGLang.g:1428:1: ruleMathFunc : ( ( rule__MathFunc__Alternatives ) ) ;
    public final void ruleMathFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1432:1: ( ( ( rule__MathFunc__Alternatives ) ) )
            // InternalMGLang.g:1433:2: ( ( rule__MathFunc__Alternatives ) )
            {
            // InternalMGLang.g:1433:2: ( ( rule__MathFunc__Alternatives ) )
            // InternalMGLang.g:1434:3: ( rule__MathFunc__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathFuncAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1435:3: ( rule__MathFunc__Alternatives )
            // InternalMGLang.g:1435:4: rule__MathFunc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MathFunc__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathFuncAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathFunc"


    // $ANTLR start "rulePrimitiveType"
    // InternalMGLang.g:1444:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1448:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMGLang.g:1449:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMGLang.g:1449:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMGLang.g:1450:3: ( rule__PrimitiveType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1451:3: ( rule__PrimitiveType__Alternatives )
            // InternalMGLang.g:1451:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleRelationalOp"
    // InternalMGLang.g:1460:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1464:1: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // InternalMGLang.g:1465:2: ( ( rule__RelationalOp__Alternatives ) )
            {
            // InternalMGLang.g:1465:2: ( ( rule__RelationalOp__Alternatives ) )
            // InternalMGLang.g:1466:3: ( rule__RelationalOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1467:3: ( rule__RelationalOp__Alternatives )
            // InternalMGLang.g:1467:4: rule__RelationalOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "ruleTertiaryOp"
    // InternalMGLang.g:1476:1: ruleTertiaryOp : ( ( rule__TertiaryOp__Alternatives ) ) ;
    public final void ruleTertiaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1480:1: ( ( ( rule__TertiaryOp__Alternatives ) ) )
            // InternalMGLang.g:1481:2: ( ( rule__TertiaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1481:2: ( ( rule__TertiaryOp__Alternatives ) )
            // InternalMGLang.g:1482:3: ( rule__TertiaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1483:3: ( rule__TertiaryOp__Alternatives )
            // InternalMGLang.g:1483:4: rule__TertiaryOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTertiaryOp"


    // $ANTLR start "ruleSecondaryOp"
    // InternalMGLang.g:1492:1: ruleSecondaryOp : ( ( rule__SecondaryOp__Alternatives ) ) ;
    public final void ruleSecondaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1496:1: ( ( ( rule__SecondaryOp__Alternatives ) ) )
            // InternalMGLang.g:1497:2: ( ( rule__SecondaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1497:2: ( ( rule__SecondaryOp__Alternatives ) )
            // InternalMGLang.g:1498:3: ( rule__SecondaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1499:3: ( rule__SecondaryOp__Alternatives )
            // InternalMGLang.g:1499:4: rule__SecondaryOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecondaryOp"


    // $ANTLR start "rulePrimaryOp"
    // InternalMGLang.g:1508:1: rulePrimaryOp : ( ( rule__PrimaryOp__Alternatives ) ) ;
    public final void rulePrimaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1512:1: ( ( ( rule__PrimaryOp__Alternatives ) ) )
            // InternalMGLang.g:1513:2: ( ( rule__PrimaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1513:2: ( ( rule__PrimaryOp__Alternatives ) )
            // InternalMGLang.g:1514:3: ( rule__PrimaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1515:3: ( rule__PrimaryOp__Alternatives )
            // InternalMGLang.g:1515:4: rule__PrimaryOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryOp"


    // $ANTLR start "rule__MofgenFile__Alternatives_2"
    // InternalMGLang.g:1523:1: rule__MofgenFile__Alternatives_2 : ( ( ( rule__MofgenFile__PatternsAssignment_2_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_2_1 ) ) );
    public final void rule__MofgenFile__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1527:1: ( ( ( rule__MofgenFile__PatternsAssignment_2_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            else if ( (LA1_0==50) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGLang.g:1528:2: ( ( rule__MofgenFile__PatternsAssignment_2_0 ) )
                    {
                    // InternalMGLang.g:1528:2: ( ( rule__MofgenFile__PatternsAssignment_2_0 ) )
                    // InternalMGLang.g:1529:3: ( rule__MofgenFile__PatternsAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMofgenFileAccess().getPatternsAssignment_2_0()); 
                    }
                    // InternalMGLang.g:1530:3: ( rule__MofgenFile__PatternsAssignment_2_0 )
                    // InternalMGLang.g:1530:4: rule__MofgenFile__PatternsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MofgenFile__PatternsAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMofgenFileAccess().getPatternsAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1534:2: ( ( rule__MofgenFile__GeneratorsAssignment_2_1 ) )
                    {
                    // InternalMGLang.g:1534:2: ( ( rule__MofgenFile__GeneratorsAssignment_2_1 ) )
                    // InternalMGLang.g:1535:3: ( rule__MofgenFile__GeneratorsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_2_1()); 
                    }
                    // InternalMGLang.g:1536:3: ( rule__MofgenFile__GeneratorsAssignment_2_1 )
                    // InternalMGLang.g:1536:4: rule__MofgenFile__GeneratorsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MofgenFile__GeneratorsAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Alternatives_2"


    // $ANTLR start "rule__Node__Alternatives_2"
    // InternalMGLang.g:1544:1: rule__Node__Alternatives_2 : ( ( ( rule__Node__CreatedByAssignment_2_0 ) ) | ( ( rule__Node__Group_2_1__0 ) ) );
    public final void rule__Node__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1548:1: ( ( ( rule__Node__CreatedByAssignment_2_0 ) ) | ( ( rule__Node__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ASSIGNMENT_OP) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMGLang.g:1549:2: ( ( rule__Node__CreatedByAssignment_2_0 ) )
                    {
                    // InternalMGLang.g:1549:2: ( ( rule__Node__CreatedByAssignment_2_0 ) )
                    // InternalMGLang.g:1550:3: ( rule__Node__CreatedByAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getCreatedByAssignment_2_0()); 
                    }
                    // InternalMGLang.g:1551:3: ( rule__Node__CreatedByAssignment_2_0 )
                    // InternalMGLang.g:1551:4: rule__Node__CreatedByAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__CreatedByAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getCreatedByAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1555:2: ( ( rule__Node__Group_2_1__0 ) )
                    {
                    // InternalMGLang.g:1555:2: ( ( rule__Node__Group_2_1__0 ) )
                    // InternalMGLang.g:1556:3: ( rule__Node__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getGroup_2_1()); 
                    }
                    // InternalMGLang.g:1557:3: ( rule__Node__Group_2_1__0 )
                    // InternalMGLang.g:1557:4: rule__Node__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives_2"


    // $ANTLR start "rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives"
    // InternalMGLang.g:1565:1: rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives : ( ( rulePatternNodeReference ) | ( ruleAssignment ) | ( ruleSwitch ) );
    public final void rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1569:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) | ( ruleSwitch ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==49) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_ASSIGNMENT_OP) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==53) ) {
                alt3=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMGLang.g:1570:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:1570:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:1571:3: rulePatternNodeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getPatternNodeReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternNodeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getPatternNodeReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1576:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:1576:2: ( ruleAssignment )
                    // InternalMGLang.g:1577:3: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAssignmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1582:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1582:2: ( ruleSwitch )
                    // InternalMGLang.g:1583:3: ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getSwitchParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitch();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getSwitchParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives"


    // $ANTLR start "rule__Parameter__Alternatives"
    // InternalMGLang.g:1592:1: rule__Parameter__Alternatives : ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1596:1: ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=22)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGLang.g:1597:2: ( rulePrimitiveParameter )
                    {
                    // InternalMGLang.g:1597:2: ( rulePrimitiveParameter )
                    // InternalMGLang.g:1598:3: rulePrimitiveParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimitiveParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1603:2: ( ruleParameterNode )
                    {
                    // InternalMGLang.g:1603:2: ( ruleParameterNode )
                    // InternalMGLang.g:1604:3: ruleParameterNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getParameterNodeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameterNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getParameterNodeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Alternatives"


    // $ANTLR start "rule__GeneratorExpression__Alternatives"
    // InternalMGLang.g:1613:1: rule__GeneratorExpression__Alternatives : ( ( ruleForStatement ) | ( ruleSwitch ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) );
    public final void rule__GeneratorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1617:1: ( ( ruleForStatement ) | ( ruleSwitch ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt5=1;
                }
                break;
            case 53:
                {
                alt5=2;
                }
                break;
            case 58:
            case 61:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==40) ) {
                    alt5=4;
                }
                else if ( (LA5_4==RULE_ID) ) {
                    alt5=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMGLang.g:1618:2: ( ruleForStatement )
                    {
                    // InternalMGLang.g:1618:2: ( ruleForStatement )
                    // InternalMGLang.g:1619:3: ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getForStatementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getForStatementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1624:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1624:2: ( ruleSwitch )
                    // InternalMGLang.g:1625:3: ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getSwitchParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitch();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getSwitchParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1630:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1630:2: ( ruleCollection )
                    // InternalMGLang.g:1631:3: ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCollection();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1636:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1636:2: ( rulePatternCall )
                    // InternalMGLang.g:1637:3: rulePatternCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1642:2: ( rulePatternVariable )
                    {
                    // InternalMGLang.g:1642:2: ( rulePatternVariable )
                    // InternalMGLang.g:1643:3: rulePatternVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getPatternVariableParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getPatternVariableParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorExpression__Alternatives"


    // $ANTLR start "rule__ForHead__Alternatives"
    // InternalMGLang.g:1652:1: rule__ForHead__Alternatives : ( ( ruleGeneralForHead ) | ( ruleForEachHead ) );
    public final void rule__ForHead__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1656:1: ( ( ruleGeneralForHead ) | ( ruleForEachHead ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==52) ) {
                    alt6=1;
                }
                else if ( (LA6_1==30||LA6_1==48) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:1657:2: ( ruleGeneralForHead )
                    {
                    // InternalMGLang.g:1657:2: ( ruleGeneralForHead )
                    // InternalMGLang.g:1658:3: ruleGeneralForHead
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForHeadAccess().getGeneralForHeadParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGeneralForHead();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForHeadAccess().getGeneralForHeadParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1663:2: ( ruleForEachHead )
                    {
                    // InternalMGLang.g:1663:2: ( ruleForEachHead )
                    // InternalMGLang.g:1664:3: ruleForEachHead
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForHeadAccess().getForEachHeadParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForEachHead();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForHeadAccess().getForEachHeadParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForHead__Alternatives"


    // $ANTLR start "rule__SwitchExpression__Alternatives"
    // InternalMGLang.g:1673:1: rule__SwitchExpression__Alternatives : ( ( ruleForStatement ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) | ( ruleNodeReferenceOrAssignmentOrControlFlow ) );
    public final void rule__SwitchExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1677:1: ( ( ruleForStatement ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) | ( ruleNodeReferenceOrAssignmentOrControlFlow ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt7=1;
                }
                break;
            case 58:
            case 61:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt7=4;
                    }
                    break;
                case RULE_ASSIGNMENT_OP:
                case 49:
                    {
                    alt7=5;
                    }
                    break;
                case 40:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }

                }
                break;
            case 53:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMGLang.g:1678:2: ( ruleForStatement )
                    {
                    // InternalMGLang.g:1678:2: ( ruleForStatement )
                    // InternalMGLang.g:1679:3: ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getForStatementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getForStatementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1684:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1684:2: ( ruleCollection )
                    // InternalMGLang.g:1685:3: ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getCollectionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCollection();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getCollectionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1690:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1690:2: ( rulePatternCall )
                    // InternalMGLang.g:1691:3: rulePatternCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getPatternCallParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getPatternCallParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1696:2: ( rulePatternVariable )
                    {
                    // InternalMGLang.g:1696:2: ( rulePatternVariable )
                    // InternalMGLang.g:1697:3: rulePatternVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getPatternVariableParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getPatternVariableParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1702:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
                    {
                    // InternalMGLang.g:1702:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
                    // InternalMGLang.g:1703:3: ruleNodeReferenceOrAssignmentOrControlFlow
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchExpressionAccess().getNodeReferenceOrAssignmentOrControlFlowParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNodeReferenceOrAssignmentOrControlFlow();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchExpressionAccess().getNodeReferenceOrAssignmentOrControlFlowParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Alternatives"


    // $ANTLR start "rule__Switch__Alternatives"
    // InternalMGLang.g:1712:1: rule__Switch__Alternatives : ( ( ruleIfElseSwitch ) | ( ruleSwitchCase ) );
    public final void rule__Switch__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1716:1: ( ( ruleIfElseSwitch ) | ( ruleSwitchCase ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==53) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==40) ) {
                    alt8=2;
                }
                else if ( (LA8_1==42) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMGLang.g:1717:2: ( ruleIfElseSwitch )
                    {
                    // InternalMGLang.g:1717:2: ( ruleIfElseSwitch )
                    // InternalMGLang.g:1718:3: ruleIfElseSwitch
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchAccess().getIfElseSwitchParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfElseSwitch();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchAccess().getIfElseSwitchParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1723:2: ( ruleSwitchCase )
                    {
                    // InternalMGLang.g:1723:2: ( ruleSwitchCase )
                    // InternalMGLang.g:1724:3: ruleSwitchCase
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitchAccess().getSwitchCaseParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitchCase();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitchAccess().getSwitchCaseParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Alternatives"


    // $ANTLR start "rule__Case__Alternatives"
    // InternalMGLang.g:1733:1: rule__Case__Alternatives : ( ( ruleCaseWithCast ) | ( ruleCaseWithoutCast ) );
    public final void rule__Case__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1737:1: ( ( ruleCaseWithCast ) | ( ruleCaseWithoutCast ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==54) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=RULE_TRUE && LA9_1<=RULE_FALSE)||LA9_1==RULE_STRING||LA9_1==RULE_DOUBLE||(LA9_1>=17 && LA9_1<=18)||LA9_1==40||LA9_1==62) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_ID) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==RULE_ID) ) {
                        alt9=1;
                    }
                    else if ( ((LA9_3>=23 && LA9_3<=36)||LA9_3==48||LA9_3==55) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:1738:2: ( ruleCaseWithCast )
                    {
                    // InternalMGLang.g:1738:2: ( ruleCaseWithCast )
                    // InternalMGLang.g:1739:3: ruleCaseWithCast
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCaseAccess().getCaseWithCastParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCaseWithCast();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCaseAccess().getCaseWithCastParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1744:2: ( ruleCaseWithoutCast )
                    {
                    // InternalMGLang.g:1744:2: ( ruleCaseWithoutCast )
                    // InternalMGLang.g:1745:3: ruleCaseWithoutCast
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCaseAccess().getCaseWithoutCastParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCaseWithoutCast();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCaseAccess().getCaseWithoutCastParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Alternatives"


    // $ANTLR start "rule__CaseBody__Alternatives"
    // InternalMGLang.g:1754:1: rule__CaseBody__Alternatives : ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__Group_1__0 ) ) );
    public final void rule__CaseBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1758:1: ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||LA10_0==51||LA10_0==53||LA10_0==58||LA10_0==61) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:1759:2: ( ( rule__CaseBody__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1759:2: ( ( rule__CaseBody__Group_0__0 ) )
                    // InternalMGLang.g:1760:3: ( rule__CaseBody__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCaseBodyAccess().getGroup_0()); 
                    }
                    // InternalMGLang.g:1761:3: ( rule__CaseBody__Group_0__0 )
                    // InternalMGLang.g:1761:4: rule__CaseBody__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseBody__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCaseBodyAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1765:2: ( ( rule__CaseBody__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1765:2: ( ( rule__CaseBody__Group_1__0 ) )
                    // InternalMGLang.g:1766:3: ( rule__CaseBody__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCaseBodyAccess().getGroup_1()); 
                    }
                    // InternalMGLang.g:1767:3: ( rule__CaseBody__Group_1__0 )
                    // InternalMGLang.g:1767:4: rule__CaseBody__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseBody__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCaseBodyAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Alternatives"


    // $ANTLR start "rule__Collection__Alternatives"
    // InternalMGLang.g:1775:1: rule__Collection__Alternatives : ( ( ruleList ) | ( ruleMap ) );
    public final void rule__Collection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1779:1: ( ( ruleList ) | ( ruleMap ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==58) ) {
                alt11=1;
            }
            else if ( (LA11_0==61) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:1780:2: ( ruleList )
                    {
                    // InternalMGLang.g:1780:2: ( ruleList )
                    // InternalMGLang.g:1781:3: ruleList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionAccess().getListParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionAccess().getListParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1786:2: ( ruleMap )
                    {
                    // InternalMGLang.g:1786:2: ( ruleMap )
                    // InternalMGLang.g:1787:3: ruleMap
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionAccess().getMapParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMap();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionAccess().getMapParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Alternatives"


    // $ANTLR start "rule__ListAssignment__Alternatives"
    // InternalMGLang.g:1796:1: rule__ListAssignment__Alternatives : ( ( ruleListAdHoc ) | ( ruleRefOrCall ) );
    public final void rule__ListAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1800:1: ( ( ruleListAdHoc ) | ( ruleRefOrCall ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==59) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGLang.g:1801:2: ( ruleListAdHoc )
                    {
                    // InternalMGLang.g:1801:2: ( ruleListAdHoc )
                    // InternalMGLang.g:1802:3: ruleListAdHoc
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListAssignmentAccess().getListAdHocParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleListAdHoc();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListAssignmentAccess().getListAdHocParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1807:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1807:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1808:3: ruleRefOrCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListAssignmentAccess().getRefOrCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRefOrCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListAssignmentAccess().getRefOrCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAssignment__Alternatives"


    // $ANTLR start "rule__MapAssignment__Alternatives"
    // InternalMGLang.g:1817:1: rule__MapAssignment__Alternatives : ( ( ruleMapAdHoc ) | ( ruleRefOrCall ) );
    public final void rule__MapAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1821:1: ( ( ruleMapAdHoc ) | ( ruleRefOrCall ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==59) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGLang.g:1822:2: ( ruleMapAdHoc )
                    {
                    // InternalMGLang.g:1822:2: ( ruleMapAdHoc )
                    // InternalMGLang.g:1823:3: ruleMapAdHoc
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMapAssignmentAccess().getMapAdHocParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMapAdHoc();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMapAssignmentAccess().getMapAdHocParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1828:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1828:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1829:3: ruleRefOrCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMapAssignmentAccess().getRefOrCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRefOrCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMapAssignmentAccess().getRefOrCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAssignment__Alternatives"


    // $ANTLR start "rule__BaseExpr__Alternatives"
    // InternalMGLang.g:1838:1: rule__BaseExpr__Alternatives : ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ruleLiteral ) | ( ruleRefOrCall ) );
    public final void rule__BaseExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1842:1: ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ruleLiteral ) | ( ruleRefOrCall ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt14=1;
                }
                break;
            case 62:
                {
                alt14=2;
                }
                break;
            case 17:
            case 18:
                {
                alt14=3;
                }
                break;
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_STRING:
            case RULE_DOUBLE:
                {
                alt14=4;
                }
                break;
            case RULE_ID:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMGLang.g:1843:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1843:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    // InternalMGLang.g:1844:3: ( rule__BaseExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_0()); 
                    }
                    // InternalMGLang.g:1845:3: ( rule__BaseExpr__Group_0__0 )
                    // InternalMGLang.g:1845:4: rule__BaseExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpr__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExprAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1849:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1849:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    // InternalMGLang.g:1850:3: ( rule__BaseExpr__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_1()); 
                    }
                    // InternalMGLang.g:1851:3: ( rule__BaseExpr__Group_1__0 )
                    // InternalMGLang.g:1851:4: rule__BaseExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExprAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1855:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    {
                    // InternalMGLang.g:1855:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    // InternalMGLang.g:1856:3: ( rule__BaseExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_2()); 
                    }
                    // InternalMGLang.g:1857:3: ( rule__BaseExpr__Group_2__0 )
                    // InternalMGLang.g:1857:4: rule__BaseExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpr__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExprAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1861:2: ( ruleLiteral )
                    {
                    // InternalMGLang.g:1861:2: ( ruleLiteral )
                    // InternalMGLang.g:1862:3: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1867:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1867:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1868:3: ruleRefOrCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getRefOrCallParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRefOrCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExprAccess().getRefOrCallParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalMGLang.g:1877:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1881:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                alt15=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:1882:2: ( ruleBooleanLiteral )
                    {
                    // InternalMGLang.g:1882:2: ( ruleBooleanLiteral )
                    // InternalMGLang.g:1883:3: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1888:2: ( ruleStringLiteral )
                    {
                    // InternalMGLang.g:1888:2: ( ruleStringLiteral )
                    // InternalMGLang.g:1889:3: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1894:2: ( ruleNumberLiteral )
                    {
                    // InternalMGLang.g:1894:2: ( ruleNumberLiteral )
                    // InternalMGLang.g:1895:3: ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__ValAlternatives_0"
    // InternalMGLang.g:1904:1: rule__BooleanLiteral__ValAlternatives_0 : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
    public final void rule__BooleanLiteral__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1908:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_TRUE) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_FALSE) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMGLang.g:1909:2: ( RULE_TRUE )
                    {
                    // InternalMGLang.g:1909:2: ( RULE_TRUE )
                    // InternalMGLang.g:1910:3: RULE_TRUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValTRUETerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_TRUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValTRUETerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1915:2: ( RULE_FALSE )
                    {
                    // InternalMGLang.g:1915:2: ( RULE_FALSE )
                    // InternalMGLang.g:1916:3: RULE_FALSE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValFALSETerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_FALSE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValFALSETerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValAlternatives_0"


    // $ANTLR start "rule__MathFunc__Alternatives"
    // InternalMGLang.g:1925:1: rule__MathFunc__Alternatives : ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) );
    public final void rule__MathFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1929:1: ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGLang.g:1930:2: ( ( 'sqrt' ) )
                    {
                    // InternalMGLang.g:1930:2: ( ( 'sqrt' ) )
                    // InternalMGLang.g:1931:3: ( 'sqrt' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1932:3: ( 'sqrt' )
                    // InternalMGLang.g:1932:4: 'sqrt'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1936:2: ( ( 'abs' ) )
                    {
                    // InternalMGLang.g:1936:2: ( ( 'abs' ) )
                    // InternalMGLang.g:1937:3: ( 'abs' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1938:3: ( 'abs' )
                    // InternalMGLang.g:1938:4: 'abs'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathFunc__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalMGLang.g:1946:1: rule__PrimitiveType__Alternatives : ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1950:1: ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt18=1;
                }
                break;
            case 20:
                {
                alt18=2;
                }
                break;
            case 21:
                {
                alt18=3;
                }
                break;
            case 22:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMGLang.g:1951:2: ( ( 'int' ) )
                    {
                    // InternalMGLang.g:1951:2: ( ( 'int' ) )
                    // InternalMGLang.g:1952:3: ( 'int' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1953:3: ( 'int' )
                    // InternalMGLang.g:1953:4: 'int'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1957:2: ( ( 'char' ) )
                    {
                    // InternalMGLang.g:1957:2: ( ( 'char' ) )
                    // InternalMGLang.g:1958:3: ( 'char' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1959:3: ( 'char' )
                    // InternalMGLang.g:1959:4: 'char'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1963:2: ( ( 'double' ) )
                    {
                    // InternalMGLang.g:1963:2: ( ( 'double' ) )
                    // InternalMGLang.g:1964:3: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1965:3: ( 'double' )
                    // InternalMGLang.g:1965:4: 'double'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1969:2: ( ( 'String' ) )
                    {
                    // InternalMGLang.g:1969:2: ( ( 'String' ) )
                    // InternalMGLang.g:1970:3: ( 'String' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    }
                    // InternalMGLang.g:1971:3: ( 'String' )
                    // InternalMGLang.g:1971:4: 'String'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__RelationalOp__Alternatives"
    // InternalMGLang.g:1979:1: rule__RelationalOp__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1983:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt19=1;
                }
                break;
            case 24:
                {
                alt19=2;
                }
                break;
            case 25:
                {
                alt19=3;
                }
                break;
            case 26:
                {
                alt19=4;
                }
                break;
            case 27:
                {
                alt19=5;
                }
                break;
            case 28:
                {
                alt19=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMGLang.g:1984:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:1984:2: ( ( '>' ) )
                    // InternalMGLang.g:1985:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1986:3: ( '>' )
                    // InternalMGLang.g:1986:4: '>'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1990:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:1990:2: ( ( '>=' ) )
                    // InternalMGLang.g:1991:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1992:3: ( '>=' )
                    // InternalMGLang.g:1992:4: '>='
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1996:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:1996:2: ( ( '==' ) )
                    // InternalMGLang.g:1997:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1998:3: ( '==' )
                    // InternalMGLang.g:1998:4: '=='
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:2002:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:2002:2: ( ( '!=' ) )
                    // InternalMGLang.g:2003:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalMGLang.g:2004:3: ( '!=' )
                    // InternalMGLang.g:2004:4: '!='
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:2008:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:2008:2: ( ( '<=' ) )
                    // InternalMGLang.g:2009:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalMGLang.g:2010:3: ( '<=' )
                    // InternalMGLang.g:2010:4: '<='
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:2014:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:2014:2: ( ( '<' ) )
                    // InternalMGLang.g:2015:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getLESSEnumLiteralDeclaration_5()); 
                    }
                    // InternalMGLang.g:2016:3: ( '<' )
                    // InternalMGLang.g:2016:4: '<'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getLESSEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalOp__Alternatives"


    // $ANTLR start "rule__TertiaryOp__Alternatives"
    // InternalMGLang.g:2024:1: rule__TertiaryOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) );
    public final void rule__TertiaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2028:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt20=1;
                }
                break;
            case 30:
                {
                alt20=2;
                }
                break;
            case 31:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMGLang.g:2029:2: ( ( '+' ) )
                    {
                    // InternalMGLang.g:2029:2: ( ( '+' ) )
                    // InternalMGLang.g:2030:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:2031:3: ( '+' )
                    // InternalMGLang.g:2031:4: '+'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2035:2: ( ( '-' ) )
                    {
                    // InternalMGLang.g:2035:2: ( ( '-' ) )
                    // InternalMGLang.g:2036:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:2037:3: ( '-' )
                    // InternalMGLang.g:2037:4: '-'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2041:2: ( ( '||' ) )
                    {
                    // InternalMGLang.g:2041:2: ( ( '||' ) )
                    // InternalMGLang.g:2042:3: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:2043:3: ( '||' )
                    // InternalMGLang.g:2043:4: '||'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryOp__Alternatives"


    // $ANTLR start "rule__SecondaryOp__Alternatives"
    // InternalMGLang.g:2051:1: rule__SecondaryOp__Alternatives : ( ( ( '%' ) ) | ( ( '^' ) ) );
    public final void rule__SecondaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2055:1: ( ( ( '%' ) ) | ( ( '^' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            else if ( (LA21_0==33) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMGLang.g:2056:2: ( ( '%' ) )
                    {
                    // InternalMGLang.g:2056:2: ( ( '%' ) )
                    // InternalMGLang.g:2057:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:2058:3: ( '%' )
                    // InternalMGLang.g:2058:4: '%'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2062:2: ( ( '^' ) )
                    {
                    // InternalMGLang.g:2062:2: ( ( '^' ) )
                    // InternalMGLang.g:2063:3: ( '^' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:2064:3: ( '^' )
                    // InternalMGLang.g:2064:4: '^'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryOp__Alternatives"


    // $ANTLR start "rule__PrimaryOp__Alternatives"
    // InternalMGLang.g:2072:1: rule__PrimaryOp__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) );
    public final void rule__PrimaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2076:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMGLang.g:2077:2: ( ( '*' ) )
                    {
                    // InternalMGLang.g:2077:2: ( ( '*' ) )
                    // InternalMGLang.g:2078:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:2079:3: ( '*' )
                    // InternalMGLang.g:2079:4: '*'
                    {
                    match(input,34,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2083:2: ( ( '/' ) )
                    {
                    // InternalMGLang.g:2083:2: ( ( '/' ) )
                    // InternalMGLang.g:2084:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:2085:3: ( '/' )
                    // InternalMGLang.g:2085:4: '/'
                    {
                    match(input,35,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2089:2: ( ( '&&' ) )
                    {
                    // InternalMGLang.g:2089:2: ( ( '&&' ) )
                    // InternalMGLang.g:2090:3: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:2091:3: ( '&&' )
                    // InternalMGLang.g:2091:4: '&&'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryOp__Alternatives"


    // $ANTLR start "rule__MofgenFile__Group__0"
    // InternalMGLang.g:2099:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2103:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:2104:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MofgenFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__0"


    // $ANTLR start "rule__MofgenFile__Group__0__Impl"
    // InternalMGLang.g:2111:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2115:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:2116:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:2116:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:2117:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            }
            // InternalMGLang.g:2118:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMGLang.g:2118:3: rule__MofgenFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MofgenFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__0__Impl"


    // $ANTLR start "rule__MofgenFile__Group__1"
    // InternalMGLang.g:2126:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2 ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2130:1: ( rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2 )
            // InternalMGLang.g:2131:2: rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MofgenFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__1"


    // $ANTLR start "rule__MofgenFile__Group__1__Impl"
    // InternalMGLang.g:2138:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__ConfigAssignment_1 ) ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2142:1: ( ( ( rule__MofgenFile__ConfigAssignment_1 ) ) )
            // InternalMGLang.g:2143:1: ( ( rule__MofgenFile__ConfigAssignment_1 ) )
            {
            // InternalMGLang.g:2143:1: ( ( rule__MofgenFile__ConfigAssignment_1 ) )
            // InternalMGLang.g:2144:2: ( rule__MofgenFile__ConfigAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getConfigAssignment_1()); 
            }
            // InternalMGLang.g:2145:2: ( rule__MofgenFile__ConfigAssignment_1 )
            // InternalMGLang.g:2145:3: rule__MofgenFile__ConfigAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__ConfigAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getConfigAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__1__Impl"


    // $ANTLR start "rule__MofgenFile__Group__2"
    // InternalMGLang.g:2153:1: rule__MofgenFile__Group__2 : rule__MofgenFile__Group__2__Impl ;
    public final void rule__MofgenFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2157:1: ( rule__MofgenFile__Group__2__Impl )
            // InternalMGLang.g:2158:2: rule__MofgenFile__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__2"


    // $ANTLR start "rule__MofgenFile__Group__2__Impl"
    // InternalMGLang.g:2164:1: rule__MofgenFile__Group__2__Impl : ( ( rule__MofgenFile__Alternatives_2 )* ) ;
    public final void rule__MofgenFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2168:1: ( ( ( rule__MofgenFile__Alternatives_2 )* ) )
            // InternalMGLang.g:2169:1: ( ( rule__MofgenFile__Alternatives_2 )* )
            {
            // InternalMGLang.g:2169:1: ( ( rule__MofgenFile__Alternatives_2 )* )
            // InternalMGLang.g:2170:2: ( rule__MofgenFile__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getAlternatives_2()); 
            }
            // InternalMGLang.g:2171:2: ( rule__MofgenFile__Alternatives_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44||LA24_0==50) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGLang.g:2171:3: rule__MofgenFile__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__MofgenFile__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMGLang.g:2180:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2184:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:2185:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMGLang.g:2192:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2196:1: ( ( 'import' ) )
            // InternalMGLang.g:2197:1: ( 'import' )
            {
            // InternalMGLang.g:2197:1: ( 'import' )
            // InternalMGLang.g:2198:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMGLang.g:2207:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2211:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:2212:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMGLang.g:2219:1: rule__Import__Group__1__Impl : ( ( rule__Import__UriAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2223:1: ( ( ( rule__Import__UriAssignment_1 ) ) )
            // InternalMGLang.g:2224:1: ( ( rule__Import__UriAssignment_1 ) )
            {
            // InternalMGLang.g:2224:1: ( ( rule__Import__UriAssignment_1 ) )
            // InternalMGLang.g:2225:2: ( rule__Import__UriAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getUriAssignment_1()); 
            }
            // InternalMGLang.g:2226:2: ( rule__Import__UriAssignment_1 )
            // InternalMGLang.g:2226:3: rule__Import__UriAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__UriAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getUriAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMGLang.g:2234:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2238:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:2239:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMGLang.g:2246:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2250:1: ( ( 'as' ) )
            // InternalMGLang.g:2251:1: ( 'as' )
            {
            // InternalMGLang.g:2251:1: ( 'as' )
            // InternalMGLang.g:2252:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalMGLang.g:2261:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2265:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:2266:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalMGLang.g:2272:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2276:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalMGLang.g:2277:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalMGLang.g:2277:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalMGLang.g:2278:2: ( rule__Import__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }
            // InternalMGLang.g:2279:2: ( rule__Import__NameAssignment_3 )
            // InternalMGLang.g:2279:3: rule__Import__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__0"
    // InternalMGLang.g:2288:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2292:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // InternalMGLang.g:2293:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Config__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // InternalMGLang.g:2300:1: rule__Config__Group__0__Impl : ( () ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2304:1: ( ( () ) )
            // InternalMGLang.g:2305:1: ( () )
            {
            // InternalMGLang.g:2305:1: ( () )
            // InternalMGLang.g:2306:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getConfigAction_0()); 
            }
            // InternalMGLang.g:2307:2: ()
            // InternalMGLang.g:2307:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getConfigAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // InternalMGLang.g:2315:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2319:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // InternalMGLang.g:2320:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Config__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // InternalMGLang.g:2327:1: rule__Config__Group__1__Impl : ( 'config' ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2331:1: ( ( 'config' ) )
            // InternalMGLang.g:2332:1: ( 'config' )
            {
            // InternalMGLang.g:2332:1: ( 'config' )
            // InternalMGLang.g:2333:2: 'config'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getConfigKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getConfigKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // InternalMGLang.g:2342:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2346:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // InternalMGLang.g:2347:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Config__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // InternalMGLang.g:2354:1: rule__Config__Group__2__Impl : ( '(' ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2358:1: ( ( '(' ) )
            // InternalMGLang.g:2359:1: ( '(' )
            {
            // InternalMGLang.g:2359:1: ( '(' )
            // InternalMGLang.g:2360:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // InternalMGLang.g:2369:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2373:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // InternalMGLang.g:2374:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Config__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // InternalMGLang.g:2381:1: rule__Config__Group__3__Impl : ( ')' ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2385:1: ( ( ')' ) )
            // InternalMGLang.g:2386:1: ( ')' )
            {
            // InternalMGLang.g:2386:1: ( ')' )
            // InternalMGLang.g:2387:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__4"
    // InternalMGLang.g:2396:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2400:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // InternalMGLang.g:2401:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Config__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4"


    // $ANTLR start "rule__Config__Group__4__Impl"
    // InternalMGLang.g:2408:1: rule__Config__Group__4__Impl : ( '{' ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2412:1: ( ( '{' ) )
            // InternalMGLang.g:2413:1: ( '{' )
            {
            // InternalMGLang.g:2413:1: ( '{' )
            // InternalMGLang.g:2414:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4__Impl"


    // $ANTLR start "rule__Config__Group__5"
    // InternalMGLang.g:2423:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2427:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // InternalMGLang.g:2428:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Config__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5"


    // $ANTLR start "rule__Config__Group__5__Impl"
    // InternalMGLang.g:2435:1: rule__Config__Group__5__Impl : ( ( rule__Config__ExpressionsAssignment_5 )* ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2439:1: ( ( ( rule__Config__ExpressionsAssignment_5 )* ) )
            // InternalMGLang.g:2440:1: ( ( rule__Config__ExpressionsAssignment_5 )* )
            {
            // InternalMGLang.g:2440:1: ( ( rule__Config__ExpressionsAssignment_5 )* )
            // InternalMGLang.g:2441:2: ( rule__Config__ExpressionsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getExpressionsAssignment_5()); 
            }
            // InternalMGLang.g:2442:2: ( rule__Config__ExpressionsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMGLang.g:2442:3: rule__Config__ExpressionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Config__ExpressionsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getExpressionsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5__Impl"


    // $ANTLR start "rule__Config__Group__6"
    // InternalMGLang.g:2450:1: rule__Config__Group__6 : rule__Config__Group__6__Impl ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2454:1: ( rule__Config__Group__6__Impl )
            // InternalMGLang.g:2455:2: rule__Config__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6"


    // $ANTLR start "rule__Config__Group__6__Impl"
    // InternalMGLang.g:2461:1: rule__Config__Group__6__Impl : ( '}' ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2465:1: ( ( '}' ) )
            // InternalMGLang.g:2466:1: ( '}' )
            {
            // InternalMGLang.g:2466:1: ( '}' )
            // InternalMGLang.g:2467:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalMGLang.g:2477:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2481:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:2482:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Pattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalMGLang.g:2489:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2493:1: ( ( 'pattern' ) )
            // InternalMGLang.g:2494:1: ( 'pattern' )
            {
            // InternalMGLang.g:2494:1: ( 'pattern' )
            // InternalMGLang.g:2495:2: 'pattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalMGLang.g:2504:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2508:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:2509:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Pattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalMGLang.g:2516:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2520:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:2521:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2521:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:2522:2: ( rule__Pattern__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:2523:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:2523:3: rule__Pattern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalMGLang.g:2531:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2535:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:2536:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Pattern__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalMGLang.g:2543:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2547:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:2548:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:2548:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:2549:2: ( rule__Pattern__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2()); 
            }
            // InternalMGLang.g:2550:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:2550:3: rule__Pattern__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalMGLang.g:2558:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2562:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:2563:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Pattern__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalMGLang.g:2570:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2574:1: ( ( '{' ) )
            // InternalMGLang.g:2575:1: ( '{' )
            {
            // InternalMGLang.g:2575:1: ( '{' )
            // InternalMGLang.g:2576:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalMGLang.g:2585:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2589:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:2590:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Pattern__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalMGLang.g:2597:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__UnorderedGroup_4 ) ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2601:1: ( ( ( rule__Pattern__UnorderedGroup_4 ) ) )
            // InternalMGLang.g:2602:1: ( ( rule__Pattern__UnorderedGroup_4 ) )
            {
            // InternalMGLang.g:2602:1: ( ( rule__Pattern__UnorderedGroup_4 ) )
            // InternalMGLang.g:2603:2: ( rule__Pattern__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getUnorderedGroup_4()); 
            }
            // InternalMGLang.g:2604:2: ( rule__Pattern__UnorderedGroup_4 )
            // InternalMGLang.g:2604:3: rule__Pattern__UnorderedGroup_4
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__5"
    // InternalMGLang.g:2612:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2616:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:2617:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Pattern__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5"


    // $ANTLR start "rule__Pattern__Group__5__Impl"
    // InternalMGLang.g:2624:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2628:1: ( ( '}' ) )
            // InternalMGLang.g:2629:1: ( '}' )
            {
            // InternalMGLang.g:2629:1: ( '}' )
            // InternalMGLang.g:2630:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5__Impl"


    // $ANTLR start "rule__Pattern__Group__6"
    // InternalMGLang.g:2639:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2643:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:2644:2: rule__Pattern__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6"


    // $ANTLR start "rule__Pattern__Group__6__Impl"
    // InternalMGLang.g:2650:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 )? ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2654:1: ( ( ( rule__Pattern__ReturnAssignment_6 )? ) )
            // InternalMGLang.g:2655:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            {
            // InternalMGLang.g:2655:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            // InternalMGLang.g:2656:2: ( rule__Pattern__ReturnAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            }
            // InternalMGLang.g:2657:2: ( rule__Pattern__ReturnAssignment_6 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMGLang.g:2657:3: rule__Pattern__ReturnAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__ReturnAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6__Impl"


    // $ANTLR start "rule__Pattern__Group_2__0"
    // InternalMGLang.g:2666:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2670:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:2671:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Pattern__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0"


    // $ANTLR start "rule__Pattern__Group_2__0__Impl"
    // InternalMGLang.g:2678:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2682:1: ( ( '(' ) )
            // InternalMGLang.g:2683:1: ( '(' )
            {
            // InternalMGLang.g:2683:1: ( '(' )
            // InternalMGLang.g:2684:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2__1"
    // InternalMGLang.g:2693:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2697:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:2698:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Pattern__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1"


    // $ANTLR start "rule__Pattern__Group_2__1__Impl"
    // InternalMGLang.g:2705:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2709:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:2710:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:2710:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:2711:2: ( rule__Pattern__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            }
            // InternalMGLang.g:2712:2: ( rule__Pattern__Group_2_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=19 && LA27_0<=22)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMGLang.g:2712:3: rule__Pattern__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1__Impl"


    // $ANTLR start "rule__Pattern__Group_2__2"
    // InternalMGLang.g:2720:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2724:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:2725:2: rule__Pattern__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__2"


    // $ANTLR start "rule__Pattern__Group_2__2__Impl"
    // InternalMGLang.g:2731:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2735:1: ( ( ')' ) )
            // InternalMGLang.g:2736:1: ( ')' )
            {
            // InternalMGLang.g:2736:1: ( ')' )
            // InternalMGLang.g:2737:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__2__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1__0"
    // InternalMGLang.g:2747:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2751:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:2752:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Pattern__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__0"


    // $ANTLR start "rule__Pattern__Group_2_1__0__Impl"
    // InternalMGLang.g:2759:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2763:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:2764:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:2764:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:2765:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            }
            // InternalMGLang.g:2766:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:2766:3: rule__Pattern__ParametersAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__ParametersAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1__1"
    // InternalMGLang.g:2774:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2778:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:2779:2: rule__Pattern__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__1"


    // $ANTLR start "rule__Pattern__Group_2_1__1__Impl"
    // InternalMGLang.g:2785:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2789:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:2790:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:2790:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:2791:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            }
            // InternalMGLang.g:2792:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMGLang.g:2792:3: rule__Pattern__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Pattern__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1__1__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1_1__0"
    // InternalMGLang.g:2801:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2805:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:2806:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Pattern__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1_1__0"


    // $ANTLR start "rule__Pattern__Group_2_1_1__0__Impl"
    // InternalMGLang.g:2813:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2817:1: ( ( ',' ) )
            // InternalMGLang.g:2818:1: ( ',' )
            {
            // InternalMGLang.g:2818:1: ( ',' )
            // InternalMGLang.g:2819:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2_1_1__1"
    // InternalMGLang.g:2828:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2832:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:2833:2: rule__Pattern__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1_1__1"


    // $ANTLR start "rule__Pattern__Group_2_1_1__1__Impl"
    // InternalMGLang.g:2839:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2843:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:2844:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:2844:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:2845:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            }
            // InternalMGLang.g:2846:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:2846:3: rule__Pattern__ParametersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__ParametersAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__PatternReturn__Group__0"
    // InternalMGLang.g:2855:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2859:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:2860:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__PatternReturn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__0"


    // $ANTLR start "rule__PatternReturn__Group__0__Impl"
    // InternalMGLang.g:2867:1: rule__PatternReturn__Group__0__Impl : ( () ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2871:1: ( ( () ) )
            // InternalMGLang.g:2872:1: ( () )
            {
            // InternalMGLang.g:2872:1: ( () )
            // InternalMGLang.g:2873:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 
            }
            // InternalMGLang.g:2874:2: ()
            // InternalMGLang.g:2874:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__0__Impl"


    // $ANTLR start "rule__PatternReturn__Group__1"
    // InternalMGLang.g:2882:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2886:1: ( rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 )
            // InternalMGLang.g:2887:2: rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__PatternReturn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__1"


    // $ANTLR start "rule__PatternReturn__Group__1__Impl"
    // InternalMGLang.g:2894:1: rule__PatternReturn__Group__1__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2898:1: ( ( 'return' ) )
            // InternalMGLang.g:2899:1: ( 'return' )
            {
            // InternalMGLang.g:2899:1: ( 'return' )
            // InternalMGLang.g:2900:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getReturnKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__1__Impl"


    // $ANTLR start "rule__PatternReturn__Group__2"
    // InternalMGLang.g:2909:1: rule__PatternReturn__Group__2 : rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 ;
    public final void rule__PatternReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2913:1: ( rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 )
            // InternalMGLang.g:2914:2: rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__PatternReturn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__2"


    // $ANTLR start "rule__PatternReturn__Group__2__Impl"
    // InternalMGLang.g:2921:1: rule__PatternReturn__Group__2__Impl : ( 'this' ) ;
    public final void rule__PatternReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2925:1: ( ( 'this' ) )
            // InternalMGLang.g:2926:1: ( 'this' )
            {
            // InternalMGLang.g:2926:1: ( 'this' )
            // InternalMGLang.g:2927:2: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getThisKeyword_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getThisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__2__Impl"


    // $ANTLR start "rule__PatternReturn__Group__3"
    // InternalMGLang.g:2936:1: rule__PatternReturn__Group__3 : rule__PatternReturn__Group__3__Impl ;
    public final void rule__PatternReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2940:1: ( rule__PatternReturn__Group__3__Impl )
            // InternalMGLang.g:2941:2: rule__PatternReturn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__3"


    // $ANTLR start "rule__PatternReturn__Group__3__Impl"
    // InternalMGLang.g:2947:1: rule__PatternReturn__Group__3__Impl : ( ( rule__PatternReturn__Group_3__0 )? ) ;
    public final void rule__PatternReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2951:1: ( ( ( rule__PatternReturn__Group_3__0 )? ) )
            // InternalMGLang.g:2952:1: ( ( rule__PatternReturn__Group_3__0 )? )
            {
            // InternalMGLang.g:2952:1: ( ( rule__PatternReturn__Group_3__0 )? )
            // InternalMGLang.g:2953:2: ( rule__PatternReturn__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getGroup_3()); 
            }
            // InternalMGLang.g:2954:2: ( rule__PatternReturn__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMGLang.g:2954:3: rule__PatternReturn__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternReturn__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group__3__Impl"


    // $ANTLR start "rule__PatternReturn__Group_3__0"
    // InternalMGLang.g:2963:1: rule__PatternReturn__Group_3__0 : rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 ;
    public final void rule__PatternReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2967:1: ( rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 )
            // InternalMGLang.g:2968:2: rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__PatternReturn__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group_3__0"


    // $ANTLR start "rule__PatternReturn__Group_3__0__Impl"
    // InternalMGLang.g:2975:1: rule__PatternReturn__Group_3__0__Impl : ( '.' ) ;
    public final void rule__PatternReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2979:1: ( ( '.' ) )
            // InternalMGLang.g:2980:1: ( '.' )
            {
            // InternalMGLang.g:2980:1: ( '.' )
            // InternalMGLang.g:2981:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group_3__0__Impl"


    // $ANTLR start "rule__PatternReturn__Group_3__1"
    // InternalMGLang.g:2990:1: rule__PatternReturn__Group_3__1 : rule__PatternReturn__Group_3__1__Impl ;
    public final void rule__PatternReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2994:1: ( rule__PatternReturn__Group_3__1__Impl )
            // InternalMGLang.g:2995:2: rule__PatternReturn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group_3__1"


    // $ANTLR start "rule__PatternReturn__Group_3__1__Impl"
    // InternalMGLang.g:3001:1: rule__PatternReturn__Group_3__1__Impl : ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) ;
    public final void rule__PatternReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3005:1: ( ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) )
            // InternalMGLang.g:3006:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            {
            // InternalMGLang.g:3006:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            // InternalMGLang.g:3007:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 
            }
            // InternalMGLang.g:3008:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            // InternalMGLang.g:3008:3: rule__PatternReturn__ReturnValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__ReturnValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__Group_3__1__Impl"


    // $ANTLR start "rule__ParamManipulation__Group__0"
    // InternalMGLang.g:3017:1: rule__ParamManipulation__Group__0 : rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 ;
    public final void rule__ParamManipulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3021:1: ( rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 )
            // InternalMGLang.g:3022:2: rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ParamManipulation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamManipulation__Group__0"


    // $ANTLR start "rule__ParamManipulation__Group__0__Impl"
    // InternalMGLang.g:3029:1: rule__ParamManipulation__Group__0__Impl : ( ( rule__ParamManipulation__ParamAssignment_0 ) ) ;
    public final void rule__ParamManipulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3033:1: ( ( ( rule__ParamManipulation__ParamAssignment_0 ) ) )
            // InternalMGLang.g:3034:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            {
            // InternalMGLang.g:3034:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            // InternalMGLang.g:3035:2: ( rule__ParamManipulation__ParamAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getParamAssignment_0()); 
            }
            // InternalMGLang.g:3036:2: ( rule__ParamManipulation__ParamAssignment_0 )
            // InternalMGLang.g:3036:3: rule__ParamManipulation__ParamAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__ParamAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamManipulationAccess().getParamAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamManipulation__Group__0__Impl"


    // $ANTLR start "rule__ParamManipulation__Group__1"
    // InternalMGLang.g:3044:1: rule__ParamManipulation__Group__1 : rule__ParamManipulation__Group__1__Impl ;
    public final void rule__ParamManipulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3048:1: ( rule__ParamManipulation__Group__1__Impl )
            // InternalMGLang.g:3049:2: rule__ParamManipulation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamManipulation__Group__1"


    // $ANTLR start "rule__ParamManipulation__Group__1__Impl"
    // InternalMGLang.g:3055:1: rule__ParamManipulation__Group__1__Impl : ( ( rule__ParamManipulation__ContentAssignment_1 ) ) ;
    public final void rule__ParamManipulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3059:1: ( ( ( rule__ParamManipulation__ContentAssignment_1 ) ) )
            // InternalMGLang.g:3060:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            {
            // InternalMGLang.g:3060:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            // InternalMGLang.g:3061:2: ( rule__ParamManipulation__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getContentAssignment_1()); 
            }
            // InternalMGLang.g:3062:2: ( rule__ParamManipulation__ContentAssignment_1 )
            // InternalMGLang.g:3062:3: rule__ParamManipulation__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamManipulationAccess().getContentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamManipulation__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalMGLang.g:3071:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3075:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:3076:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalMGLang.g:3083:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3087:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3088:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3088:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalMGLang.g:3089:2: ( rule__Node__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3090:2: ( rule__Node__TypeAssignment_0 )
            // InternalMGLang.g:3090:3: rule__Node__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalMGLang.g:3098:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3102:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalMGLang.g:3103:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Node__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalMGLang.g:3110:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3114:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalMGLang.g:3115:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3115:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalMGLang.g:3116:2: ( rule__Node__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:3117:2: ( rule__Node__NameAssignment_1 )
            // InternalMGLang.g:3117:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalMGLang.g:3125:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3129:1: ( rule__Node__Group__2__Impl )
            // InternalMGLang.g:3130:2: rule__Node__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalMGLang.g:3136:1: rule__Node__Group__2__Impl : ( ( rule__Node__Alternatives_2 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3140:1: ( ( ( rule__Node__Alternatives_2 )? ) )
            // InternalMGLang.g:3141:1: ( ( rule__Node__Alternatives_2 )? )
            {
            // InternalMGLang.g:3141:1: ( ( rule__Node__Alternatives_2 )? )
            // InternalMGLang.g:3142:2: ( rule__Node__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_2()); 
            }
            // InternalMGLang.g:3143:2: ( rule__Node__Alternatives_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ASSIGNMENT_OP||LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMGLang.g:3143:3: rule__Node__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group_2_1__0"
    // InternalMGLang.g:3152:1: rule__Node__Group_2_1__0 : rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1 ;
    public final void rule__Node__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3156:1: ( rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1 )
            // InternalMGLang.g:3157:2: rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Node__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Node__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_2_1__0"


    // $ANTLR start "rule__Node__Group_2_1__0__Impl"
    // InternalMGLang.g:3164:1: rule__Node__Group_2_1__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Node__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3168:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3169:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3169:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3170:2: RULE_ASSIGNMENT_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_2_1__0__Impl"


    // $ANTLR start "rule__Node__Group_2_1__1"
    // InternalMGLang.g:3179:1: rule__Node__Group_2_1__1 : rule__Node__Group_2_1__1__Impl ;
    public final void rule__Node__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3183:1: ( rule__Node__Group_2_1__1__Impl )
            // InternalMGLang.g:3184:2: rule__Node__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_2_1__1"


    // $ANTLR start "rule__Node__Group_2_1__1__Impl"
    // InternalMGLang.g:3190:1: rule__Node__Group_2_1__1__Impl : ( ( rule__Node__CreatedByAssignment_2_1_1 ) ) ;
    public final void rule__Node__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3194:1: ( ( ( rule__Node__CreatedByAssignment_2_1_1 ) ) )
            // InternalMGLang.g:3195:1: ( ( rule__Node__CreatedByAssignment_2_1_1 ) )
            {
            // InternalMGLang.g:3195:1: ( ( rule__Node__CreatedByAssignment_2_1_1 ) )
            // InternalMGLang.g:3196:2: ( rule__Node__CreatedByAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getCreatedByAssignment_2_1_1()); 
            }
            // InternalMGLang.g:3197:2: ( rule__Node__CreatedByAssignment_2_1_1 )
            // InternalMGLang.g:3197:3: rule__Node__CreatedByAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__CreatedByAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getCreatedByAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_2_1__1__Impl"


    // $ANTLR start "rule__NodeContent__Group__0"
    // InternalMGLang.g:3206:1: rule__NodeContent__Group__0 : rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 ;
    public final void rule__NodeContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3210:1: ( rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 )
            // InternalMGLang.g:3211:2: rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__NodeContent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__Group__0"


    // $ANTLR start "rule__NodeContent__Group__0__Impl"
    // InternalMGLang.g:3218:1: rule__NodeContent__Group__0__Impl : ( () ) ;
    public final void rule__NodeContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3222:1: ( ( () ) )
            // InternalMGLang.g:3223:1: ( () )
            {
            // InternalMGLang.g:3223:1: ( () )
            // InternalMGLang.g:3224:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getNodeContentAction_0()); 
            }
            // InternalMGLang.g:3225:2: ()
            // InternalMGLang.g:3225:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeContentAccess().getNodeContentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__Group__0__Impl"


    // $ANTLR start "rule__NodeContent__Group__1"
    // InternalMGLang.g:3233:1: rule__NodeContent__Group__1 : rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 ;
    public final void rule__NodeContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3237:1: ( rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 )
            // InternalMGLang.g:3238:2: rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__NodeContent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__Group__1"


    // $ANTLR start "rule__NodeContent__Group__1__Impl"
    // InternalMGLang.g:3245:1: rule__NodeContent__Group__1__Impl : ( '{' ) ;
    public final void rule__NodeContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3249:1: ( ( '{' ) )
            // InternalMGLang.g:3250:1: ( '{' )
            {
            // InternalMGLang.g:3250:1: ( '{' )
            // InternalMGLang.g:3251:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeContentAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__Group__1__Impl"


    // $ANTLR start "rule__NodeContent__Group__2"
    // InternalMGLang.g:3260:1: rule__NodeContent__Group__2 : rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 ;
    public final void rule__NodeContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3264:1: ( rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 )
            // InternalMGLang.g:3265:2: rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__NodeContent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__Group__2"


    // $ANTLR start "rule__NodeContent__Group__2__Impl"
    // InternalMGLang.g:3272:1: rule__NodeContent__Group__2__Impl : ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) ;
    public final void rule__NodeContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3276:1: ( ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) )
            // InternalMGLang.g:3277:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            {
            // InternalMGLang.g:3277:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            // InternalMGLang.g:3278:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getRefsAssignsAssignment_2()); 
            }
            // InternalMGLang.g:3279:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==53) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMGLang.g:3279:3: rule__NodeContent__RefsAssignsAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__NodeContent__RefsAssignsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeContentAccess().getRefsAssignsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__Group__2__Impl"


    // $ANTLR start "rule__NodeContent__Group__3"
    // InternalMGLang.g:3287:1: rule__NodeContent__Group__3 : rule__NodeContent__Group__3__Impl ;
    public final void rule__NodeContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3291:1: ( rule__NodeContent__Group__3__Impl )
            // InternalMGLang.g:3292:2: rule__NodeContent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__Group__3"


    // $ANTLR start "rule__NodeContent__Group__3__Impl"
    // InternalMGLang.g:3298:1: rule__NodeContent__Group__3__Impl : ( '}' ) ;
    public final void rule__NodeContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3302:1: ( ( '}' ) )
            // InternalMGLang.g:3303:1: ( '}' )
            {
            // InternalMGLang.g:3303:1: ( '}' )
            // InternalMGLang.g:3304:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeContentAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__Group__3__Impl"


    // $ANTLR start "rule__PatternCall__Group__0"
    // InternalMGLang.g:3314:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3318:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:3319:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PatternCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__0"


    // $ANTLR start "rule__PatternCall__Group__0__Impl"
    // InternalMGLang.g:3326:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3330:1: ( ( ( rule__PatternCall__CalledAssignment_0 ) ) )
            // InternalMGLang.g:3331:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            {
            // InternalMGLang.g:3331:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            // InternalMGLang.g:3332:2: ( rule__PatternCall__CalledAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 
            }
            // InternalMGLang.g:3333:2: ( rule__PatternCall__CalledAssignment_0 )
            // InternalMGLang.g:3333:3: rule__PatternCall__CalledAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__CalledAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__0__Impl"


    // $ANTLR start "rule__PatternCall__Group__1"
    // InternalMGLang.g:3341:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3345:1: ( rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 )
            // InternalMGLang.g:3346:2: rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__PatternCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__1"


    // $ANTLR start "rule__PatternCall__Group__1__Impl"
    // InternalMGLang.g:3353:1: rule__PatternCall__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3357:1: ( ( '(' ) )
            // InternalMGLang.g:3358:1: ( '(' )
            {
            // InternalMGLang.g:3358:1: ( '(' )
            // InternalMGLang.g:3359:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__1__Impl"


    // $ANTLR start "rule__PatternCall__Group__2"
    // InternalMGLang.g:3368:1: rule__PatternCall__Group__2 : rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 ;
    public final void rule__PatternCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3372:1: ( rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 )
            // InternalMGLang.g:3373:2: rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__PatternCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__2"


    // $ANTLR start "rule__PatternCall__Group__2__Impl"
    // InternalMGLang.g:3380:1: rule__PatternCall__Group__2__Impl : ( ( rule__PatternCall__Group_2__0 )? ) ;
    public final void rule__PatternCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3384:1: ( ( ( rule__PatternCall__Group_2__0 )? ) )
            // InternalMGLang.g:3385:1: ( ( rule__PatternCall__Group_2__0 )? )
            {
            // InternalMGLang.g:3385:1: ( ( rule__PatternCall__Group_2__0 )? )
            // InternalMGLang.g:3386:2: ( rule__PatternCall__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getGroup_2()); 
            }
            // InternalMGLang.g:3387:2: ( rule__PatternCall__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_TRUE && LA32_0<=RULE_FALSE)||(LA32_0>=RULE_STRING && LA32_0<=RULE_DOUBLE)||(LA32_0>=17 && LA32_0<=18)||LA32_0==40||LA32_0==62) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMGLang.g:3387:3: rule__PatternCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternCall__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__2__Impl"


    // $ANTLR start "rule__PatternCall__Group__3"
    // InternalMGLang.g:3395:1: rule__PatternCall__Group__3 : rule__PatternCall__Group__3__Impl ;
    public final void rule__PatternCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3399:1: ( rule__PatternCall__Group__3__Impl )
            // InternalMGLang.g:3400:2: rule__PatternCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__3"


    // $ANTLR start "rule__PatternCall__Group__3__Impl"
    // InternalMGLang.g:3406:1: rule__PatternCall__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3410:1: ( ( ')' ) )
            // InternalMGLang.g:3411:1: ( ')' )
            {
            // InternalMGLang.g:3411:1: ( ')' )
            // InternalMGLang.g:3412:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group__3__Impl"


    // $ANTLR start "rule__PatternCall__Group_2__0"
    // InternalMGLang.g:3422:1: rule__PatternCall__Group_2__0 : rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1 ;
    public final void rule__PatternCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3426:1: ( rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1 )
            // InternalMGLang.g:3427:2: rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__PatternCall__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_2__0"


    // $ANTLR start "rule__PatternCall__Group_2__0__Impl"
    // InternalMGLang.g:3434:1: rule__PatternCall__Group_2__0__Impl : ( ( rule__PatternCall__ParamsAssignment_2_0 ) ) ;
    public final void rule__PatternCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3438:1: ( ( ( rule__PatternCall__ParamsAssignment_2_0 ) ) )
            // InternalMGLang.g:3439:1: ( ( rule__PatternCall__ParamsAssignment_2_0 ) )
            {
            // InternalMGLang.g:3439:1: ( ( rule__PatternCall__ParamsAssignment_2_0 ) )
            // InternalMGLang.g:3440:2: ( rule__PatternCall__ParamsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getParamsAssignment_2_0()); 
            }
            // InternalMGLang.g:3441:2: ( rule__PatternCall__ParamsAssignment_2_0 )
            // InternalMGLang.g:3441:3: rule__PatternCall__ParamsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__ParamsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getParamsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_2__0__Impl"


    // $ANTLR start "rule__PatternCall__Group_2__1"
    // InternalMGLang.g:3449:1: rule__PatternCall__Group_2__1 : rule__PatternCall__Group_2__1__Impl ;
    public final void rule__PatternCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3453:1: ( rule__PatternCall__Group_2__1__Impl )
            // InternalMGLang.g:3454:2: rule__PatternCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_2__1"


    // $ANTLR start "rule__PatternCall__Group_2__1__Impl"
    // InternalMGLang.g:3460:1: rule__PatternCall__Group_2__1__Impl : ( ( rule__PatternCall__Group_2_1__0 )* ) ;
    public final void rule__PatternCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3464:1: ( ( ( rule__PatternCall__Group_2_1__0 )* ) )
            // InternalMGLang.g:3465:1: ( ( rule__PatternCall__Group_2_1__0 )* )
            {
            // InternalMGLang.g:3465:1: ( ( rule__PatternCall__Group_2_1__0 )* )
            // InternalMGLang.g:3466:2: ( rule__PatternCall__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getGroup_2_1()); 
            }
            // InternalMGLang.g:3467:2: ( rule__PatternCall__Group_2_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==45) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMGLang.g:3467:3: rule__PatternCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__PatternCall__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_2__1__Impl"


    // $ANTLR start "rule__PatternCall__Group_2_1__0"
    // InternalMGLang.g:3476:1: rule__PatternCall__Group_2_1__0 : rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1 ;
    public final void rule__PatternCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3480:1: ( rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1 )
            // InternalMGLang.g:3481:2: rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
            rule__PatternCall__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_2_1__0"


    // $ANTLR start "rule__PatternCall__Group_2_1__0__Impl"
    // InternalMGLang.g:3488:1: rule__PatternCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__PatternCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3492:1: ( ( ',' ) )
            // InternalMGLang.g:3493:1: ( ',' )
            {
            // InternalMGLang.g:3493:1: ( ',' )
            // InternalMGLang.g:3494:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__PatternCall__Group_2_1__1"
    // InternalMGLang.g:3503:1: rule__PatternCall__Group_2_1__1 : rule__PatternCall__Group_2_1__1__Impl ;
    public final void rule__PatternCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3507:1: ( rule__PatternCall__Group_2_1__1__Impl )
            // InternalMGLang.g:3508:2: rule__PatternCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_2_1__1"


    // $ANTLR start "rule__PatternCall__Group_2_1__1__Impl"
    // InternalMGLang.g:3514:1: rule__PatternCall__Group_2_1__1__Impl : ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) ) ;
    public final void rule__PatternCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3518:1: ( ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) ) )
            // InternalMGLang.g:3519:1: ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) )
            {
            // InternalMGLang.g:3519:1: ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) )
            // InternalMGLang.g:3520:2: ( rule__PatternCall__ParamsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getParamsAssignment_2_1_1()); 
            }
            // InternalMGLang.g:3521:2: ( rule__PatternCall__ParamsAssignment_2_1_1 )
            // InternalMGLang.g:3521:3: rule__PatternCall__ParamsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__ParamsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getParamsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__0"
    // InternalMGLang.g:3530:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3534:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:3535:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__PatternNodeReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__0"


    // $ANTLR start "rule__PatternNodeReference__Group__0__Impl"
    // InternalMGLang.g:3542:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3546:1: ( ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3547:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3547:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            // InternalMGLang.g:3548:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3549:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            // InternalMGLang.g:3549:3: rule__PatternNodeReference__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__0__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__1"
    // InternalMGLang.g:3557:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3561:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:3562:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PatternNodeReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__1"


    // $ANTLR start "rule__PatternNodeReference__Group__1__Impl"
    // InternalMGLang.g:3569:1: rule__PatternNodeReference__Group__1__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3573:1: ( ( '->' ) )
            // InternalMGLang.g:3574:1: ( '->' )
            {
            // InternalMGLang.g:3574:1: ( '->' )
            // InternalMGLang.g:3575:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__1__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__2"
    // InternalMGLang.g:3584:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3588:1: ( rule__PatternNodeReference__Group__2__Impl )
            // InternalMGLang.g:3589:2: rule__PatternNodeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__2"


    // $ANTLR start "rule__PatternNodeReference__Group__2__Impl"
    // InternalMGLang.g:3595:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3599:1: ( ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) )
            // InternalMGLang.g:3600:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            {
            // InternalMGLang.g:3600:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            // InternalMGLang.g:3601:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 
            }
            // InternalMGLang.g:3602:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            // InternalMGLang.g:3602:3: rule__PatternNodeReference__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__TargetAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMGLang.g:3611:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3615:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:3616:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalMGLang.g:3623:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3627:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMGLang.g:3628:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMGLang.g:3628:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMGLang.g:3629:2: ( rule__Assignment__TargetAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            }
            // InternalMGLang.g:3630:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMGLang.g:3630:3: rule__Assignment__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__TargetAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalMGLang.g:3638:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3642:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:3643:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalMGLang.g:3650:1: rule__Assignment__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3654:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3655:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3655:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3656:2: RULE_ASSIGNMENT_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 
            }
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalMGLang.g:3665:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3669:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:3670:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalMGLang.g:3676:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3680:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:3681:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:3681:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:3682:2: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // InternalMGLang.g:3683:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:3683:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveParameter__Group__0"
    // InternalMGLang.g:3692:1: rule__PrimitiveParameter__Group__0 : rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 ;
    public final void rule__PrimitiveParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3696:1: ( rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 )
            // InternalMGLang.g:3697:2: rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PrimitiveParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveParameter__Group__0"


    // $ANTLR start "rule__PrimitiveParameter__Group__0__Impl"
    // InternalMGLang.g:3704:1: rule__PrimitiveParameter__Group__0__Impl : ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3708:1: ( ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3709:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3709:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:3710:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3711:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            // InternalMGLang.g:3711:3: rule__PrimitiveParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveParameter__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveParameter__Group__1"
    // InternalMGLang.g:3719:1: rule__PrimitiveParameter__Group__1 : rule__PrimitiveParameter__Group__1__Impl ;
    public final void rule__PrimitiveParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3723:1: ( rule__PrimitiveParameter__Group__1__Impl )
            // InternalMGLang.g:3724:2: rule__PrimitiveParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveParameter__Group__1"


    // $ANTLR start "rule__PrimitiveParameter__Group__1__Impl"
    // InternalMGLang.g:3730:1: rule__PrimitiveParameter__Group__1__Impl : ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3734:1: ( ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:3735:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3735:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            // InternalMGLang.g:3736:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:3737:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            // InternalMGLang.g:3737:3: rule__PrimitiveParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveParameter__Group__1__Impl"


    // $ANTLR start "rule__ParameterNode__Group__0"
    // InternalMGLang.g:3746:1: rule__ParameterNode__Group__0 : rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 ;
    public final void rule__ParameterNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3750:1: ( rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 )
            // InternalMGLang.g:3751:2: rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group__0"


    // $ANTLR start "rule__ParameterNode__Group__0__Impl"
    // InternalMGLang.g:3758:1: rule__ParameterNode__Group__0__Impl : ( ( rule__ParameterNode__Group_0__0 )? ) ;
    public final void rule__ParameterNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3762:1: ( ( ( rule__ParameterNode__Group_0__0 )? ) )
            // InternalMGLang.g:3763:1: ( ( rule__ParameterNode__Group_0__0 )? )
            {
            // InternalMGLang.g:3763:1: ( ( rule__ParameterNode__Group_0__0 )? )
            // InternalMGLang.g:3764:2: ( rule__ParameterNode__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getGroup_0()); 
            }
            // InternalMGLang.g:3765:2: ( rule__ParameterNode__Group_0__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==48) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalMGLang.g:3765:3: rule__ParameterNode__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterNode__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group__0__Impl"


    // $ANTLR start "rule__ParameterNode__Group__1"
    // InternalMGLang.g:3773:1: rule__ParameterNode__Group__1 : rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2 ;
    public final void rule__ParameterNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3777:1: ( rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2 )
            // InternalMGLang.g:3778:2: rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ParameterNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group__1"


    // $ANTLR start "rule__ParameterNode__Group__1__Impl"
    // InternalMGLang.g:3785:1: rule__ParameterNode__Group__1__Impl : ( ( rule__ParameterNode__TypeAssignment_1 ) ) ;
    public final void rule__ParameterNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3789:1: ( ( ( rule__ParameterNode__TypeAssignment_1 ) ) )
            // InternalMGLang.g:3790:1: ( ( rule__ParameterNode__TypeAssignment_1 ) )
            {
            // InternalMGLang.g:3790:1: ( ( rule__ParameterNode__TypeAssignment_1 ) )
            // InternalMGLang.g:3791:2: ( rule__ParameterNode__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getTypeAssignment_1()); 
            }
            // InternalMGLang.g:3792:2: ( rule__ParameterNode__TypeAssignment_1 )
            // InternalMGLang.g:3792:3: rule__ParameterNode__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group__1__Impl"


    // $ANTLR start "rule__ParameterNode__Group__2"
    // InternalMGLang.g:3800:1: rule__ParameterNode__Group__2 : rule__ParameterNode__Group__2__Impl ;
    public final void rule__ParameterNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3804:1: ( rule__ParameterNode__Group__2__Impl )
            // InternalMGLang.g:3805:2: rule__ParameterNode__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group__2"


    // $ANTLR start "rule__ParameterNode__Group__2__Impl"
    // InternalMGLang.g:3811:1: rule__ParameterNode__Group__2__Impl : ( ( rule__ParameterNode__NameAssignment_2 ) ) ;
    public final void rule__ParameterNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3815:1: ( ( ( rule__ParameterNode__NameAssignment_2 ) ) )
            // InternalMGLang.g:3816:1: ( ( rule__ParameterNode__NameAssignment_2 ) )
            {
            // InternalMGLang.g:3816:1: ( ( rule__ParameterNode__NameAssignment_2 ) )
            // InternalMGLang.g:3817:2: ( rule__ParameterNode__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getNameAssignment_2()); 
            }
            // InternalMGLang.g:3818:2: ( rule__ParameterNode__NameAssignment_2 )
            // InternalMGLang.g:3818:3: rule__ParameterNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group__2__Impl"


    // $ANTLR start "rule__ParameterNode__Group_0__0"
    // InternalMGLang.g:3827:1: rule__ParameterNode__Group_0__0 : rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1 ;
    public final void rule__ParameterNode__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3831:1: ( rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1 )
            // InternalMGLang.g:3832:2: rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__ParameterNode__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group_0__0"


    // $ANTLR start "rule__ParameterNode__Group_0__0__Impl"
    // InternalMGLang.g:3839:1: rule__ParameterNode__Group_0__0__Impl : ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) ) ;
    public final void rule__ParameterNode__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3843:1: ( ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) ) )
            // InternalMGLang.g:3844:1: ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) )
            {
            // InternalMGLang.g:3844:1: ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) )
            // InternalMGLang.g:3845:2: ( rule__ParameterNode__SrcModelAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getSrcModelAssignment_0_0()); 
            }
            // InternalMGLang.g:3846:2: ( rule__ParameterNode__SrcModelAssignment_0_0 )
            // InternalMGLang.g:3846:3: rule__ParameterNode__SrcModelAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__SrcModelAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getSrcModelAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group_0__0__Impl"


    // $ANTLR start "rule__ParameterNode__Group_0__1"
    // InternalMGLang.g:3854:1: rule__ParameterNode__Group_0__1 : rule__ParameterNode__Group_0__1__Impl ;
    public final void rule__ParameterNode__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3858:1: ( rule__ParameterNode__Group_0__1__Impl )
            // InternalMGLang.g:3859:2: rule__ParameterNode__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group_0__1"


    // $ANTLR start "rule__ParameterNode__Group_0__1__Impl"
    // InternalMGLang.g:3865:1: rule__ParameterNode__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ParameterNode__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3869:1: ( ( '.' ) )
            // InternalMGLang.g:3870:1: ( '.' )
            {
            // InternalMGLang.g:3870:1: ( '.' )
            // InternalMGLang.g:3871:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getFullStopKeyword_0_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getFullStopKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__Group_0__1__Impl"


    // $ANTLR start "rule__RefOrCall__Group__0"
    // InternalMGLang.g:3881:1: rule__RefOrCall__Group__0 : rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1 ;
    public final void rule__RefOrCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3885:1: ( rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1 )
            // InternalMGLang.g:3886:2: rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RefOrCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group__0"


    // $ANTLR start "rule__RefOrCall__Group__0__Impl"
    // InternalMGLang.g:3893:1: rule__RefOrCall__Group__0__Impl : ( ( rule__RefOrCall__RefAssignment_0 ) ) ;
    public final void rule__RefOrCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3897:1: ( ( ( rule__RefOrCall__RefAssignment_0 ) ) )
            // InternalMGLang.g:3898:1: ( ( rule__RefOrCall__RefAssignment_0 ) )
            {
            // InternalMGLang.g:3898:1: ( ( rule__RefOrCall__RefAssignment_0 ) )
            // InternalMGLang.g:3899:2: ( rule__RefOrCall__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefAssignment_0()); 
            }
            // InternalMGLang.g:3900:2: ( rule__RefOrCall__RefAssignment_0 )
            // InternalMGLang.g:3900:3: rule__RefOrCall__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__RefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getRefAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group__0__Impl"


    // $ANTLR start "rule__RefOrCall__Group__1"
    // InternalMGLang.g:3908:1: rule__RefOrCall__Group__1 : rule__RefOrCall__Group__1__Impl ;
    public final void rule__RefOrCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3912:1: ( rule__RefOrCall__Group__1__Impl )
            // InternalMGLang.g:3913:2: rule__RefOrCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group__1"


    // $ANTLR start "rule__RefOrCall__Group__1__Impl"
    // InternalMGLang.g:3919:1: rule__RefOrCall__Group__1__Impl : ( ( rule__RefOrCall__Group_1__0 )* ) ;
    public final void rule__RefOrCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3923:1: ( ( ( rule__RefOrCall__Group_1__0 )* ) )
            // InternalMGLang.g:3924:1: ( ( rule__RefOrCall__Group_1__0 )* )
            {
            // InternalMGLang.g:3924:1: ( ( rule__RefOrCall__Group_1__0 )* )
            // InternalMGLang.g:3925:2: ( rule__RefOrCall__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getGroup_1()); 
            }
            // InternalMGLang.g:3926:2: ( rule__RefOrCall__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMGLang.g:3926:3: rule__RefOrCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RefOrCall__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group__1__Impl"


    // $ANTLR start "rule__RefOrCall__Group_1__0"
    // InternalMGLang.g:3935:1: rule__RefOrCall__Group_1__0 : rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1 ;
    public final void rule__RefOrCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3939:1: ( rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1 )
            // InternalMGLang.g:3940:2: rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__RefOrCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1__0"


    // $ANTLR start "rule__RefOrCall__Group_1__0__Impl"
    // InternalMGLang.g:3947:1: rule__RefOrCall__Group_1__0__Impl : ( () ) ;
    public final void rule__RefOrCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3951:1: ( ( () ) )
            // InternalMGLang.g:3952:1: ( () )
            {
            // InternalMGLang.g:3952:1: ( () )
            // InternalMGLang.g:3953:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefOrCallTargetAction_1_0()); 
            }
            // InternalMGLang.g:3954:2: ()
            // InternalMGLang.g:3954:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getRefOrCallTargetAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1__0__Impl"


    // $ANTLR start "rule__RefOrCall__Group_1__1"
    // InternalMGLang.g:3962:1: rule__RefOrCall__Group_1__1 : rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2 ;
    public final void rule__RefOrCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3966:1: ( rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2 )
            // InternalMGLang.g:3967:2: rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__RefOrCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1__1"


    // $ANTLR start "rule__RefOrCall__Group_1__1__Impl"
    // InternalMGLang.g:3974:1: rule__RefOrCall__Group_1__1__Impl : ( '.' ) ;
    public final void rule__RefOrCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3978:1: ( ( '.' ) )
            // InternalMGLang.g:3979:1: ( '.' )
            {
            // InternalMGLang.g:3979:1: ( '.' )
            // InternalMGLang.g:3980:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getFullStopKeyword_1_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1__1__Impl"


    // $ANTLR start "rule__RefOrCall__Group_1__2"
    // InternalMGLang.g:3989:1: rule__RefOrCall__Group_1__2 : rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3 ;
    public final void rule__RefOrCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3993:1: ( rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3 )
            // InternalMGLang.g:3994:2: rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__RefOrCall__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1__2"


    // $ANTLR start "rule__RefOrCall__Group_1__2__Impl"
    // InternalMGLang.g:4001:1: rule__RefOrCall__Group_1__2__Impl : ( ( rule__RefOrCall__RefAssignment_1_2 ) ) ;
    public final void rule__RefOrCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4005:1: ( ( ( rule__RefOrCall__RefAssignment_1_2 ) ) )
            // InternalMGLang.g:4006:1: ( ( rule__RefOrCall__RefAssignment_1_2 ) )
            {
            // InternalMGLang.g:4006:1: ( ( rule__RefOrCall__RefAssignment_1_2 ) )
            // InternalMGLang.g:4007:2: ( rule__RefOrCall__RefAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefAssignment_1_2()); 
            }
            // InternalMGLang.g:4008:2: ( rule__RefOrCall__RefAssignment_1_2 )
            // InternalMGLang.g:4008:3: rule__RefOrCall__RefAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__RefAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getRefAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1__2__Impl"


    // $ANTLR start "rule__RefOrCall__Group_1__3"
    // InternalMGLang.g:4016:1: rule__RefOrCall__Group_1__3 : rule__RefOrCall__Group_1__3__Impl ;
    public final void rule__RefOrCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4020:1: ( rule__RefOrCall__Group_1__3__Impl )
            // InternalMGLang.g:4021:2: rule__RefOrCall__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1__3"


    // $ANTLR start "rule__RefOrCall__Group_1__3__Impl"
    // InternalMGLang.g:4027:1: rule__RefOrCall__Group_1__3__Impl : ( ( rule__RefOrCall__Group_1_3__0 )? ) ;
    public final void rule__RefOrCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4031:1: ( ( ( rule__RefOrCall__Group_1_3__0 )? ) )
            // InternalMGLang.g:4032:1: ( ( rule__RefOrCall__Group_1_3__0 )? )
            {
            // InternalMGLang.g:4032:1: ( ( rule__RefOrCall__Group_1_3__0 )? )
            // InternalMGLang.g:4033:2: ( rule__RefOrCall__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getGroup_1_3()); 
            }
            // InternalMGLang.g:4034:2: ( rule__RefOrCall__Group_1_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMGLang.g:4034:3: rule__RefOrCall__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefOrCall__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getGroup_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1__3__Impl"


    // $ANTLR start "rule__RefOrCall__Group_1_3__0"
    // InternalMGLang.g:4043:1: rule__RefOrCall__Group_1_3__0 : rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1 ;
    public final void rule__RefOrCall__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4047:1: ( rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1 )
            // InternalMGLang.g:4048:2: rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1
            {
            pushFollow(FOLLOW_27);
            rule__RefOrCall__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1_3__0"


    // $ANTLR start "rule__RefOrCall__Group_1_3__0__Impl"
    // InternalMGLang.g:4055:1: rule__RefOrCall__Group_1_3__0__Impl : ( '(' ) ;
    public final void rule__RefOrCall__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4059:1: ( ( '(' ) )
            // InternalMGLang.g:4060:1: ( '(' )
            {
            // InternalMGLang.g:4060:1: ( '(' )
            // InternalMGLang.g:4061:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getLeftParenthesisKeyword_1_3_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getLeftParenthesisKeyword_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1_3__0__Impl"


    // $ANTLR start "rule__RefOrCall__Group_1_3__1"
    // InternalMGLang.g:4070:1: rule__RefOrCall__Group_1_3__1 : rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2 ;
    public final void rule__RefOrCall__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4074:1: ( rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2 )
            // InternalMGLang.g:4075:2: rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2
            {
            pushFollow(FOLLOW_27);
            rule__RefOrCall__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1_3__1"


    // $ANTLR start "rule__RefOrCall__Group_1_3__1__Impl"
    // InternalMGLang.g:4082:1: rule__RefOrCall__Group_1_3__1__Impl : ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? ) ;
    public final void rule__RefOrCall__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4086:1: ( ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? ) )
            // InternalMGLang.g:4087:1: ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? )
            {
            // InternalMGLang.g:4087:1: ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? )
            // InternalMGLang.g:4088:2: ( rule__RefOrCall__ParamsAssignment_1_3_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getParamsAssignment_1_3_1()); 
            }
            // InternalMGLang.g:4089:2: ( rule__RefOrCall__ParamsAssignment_1_3_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_TRUE && LA37_0<=RULE_FALSE)||(LA37_0>=RULE_STRING && LA37_0<=RULE_DOUBLE)||(LA37_0>=17 && LA37_0<=18)||LA37_0==40||LA37_0==62) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMGLang.g:4089:3: rule__RefOrCall__ParamsAssignment_1_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefOrCall__ParamsAssignment_1_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getParamsAssignment_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1_3__1__Impl"


    // $ANTLR start "rule__RefOrCall__Group_1_3__2"
    // InternalMGLang.g:4097:1: rule__RefOrCall__Group_1_3__2 : rule__RefOrCall__Group_1_3__2__Impl ;
    public final void rule__RefOrCall__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4101:1: ( rule__RefOrCall__Group_1_3__2__Impl )
            // InternalMGLang.g:4102:2: rule__RefOrCall__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1_3__2"


    // $ANTLR start "rule__RefOrCall__Group_1_3__2__Impl"
    // InternalMGLang.g:4108:1: rule__RefOrCall__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__RefOrCall__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4112:1: ( ( ')' ) )
            // InternalMGLang.g:4113:1: ( ')' )
            {
            // InternalMGLang.g:4113:1: ( ')' )
            // InternalMGLang.g:4114:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRightParenthesisKeyword_1_3_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getRightParenthesisKeyword_1_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__Group_1_3__2__Impl"


    // $ANTLR start "rule__RefParams__Group__0"
    // InternalMGLang.g:4124:1: rule__RefParams__Group__0 : rule__RefParams__Group__0__Impl rule__RefParams__Group__1 ;
    public final void rule__RefParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4128:1: ( rule__RefParams__Group__0__Impl rule__RefParams__Group__1 )
            // InternalMGLang.g:4129:2: rule__RefParams__Group__0__Impl rule__RefParams__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__RefParams__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefParams__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__Group__0"


    // $ANTLR start "rule__RefParams__Group__0__Impl"
    // InternalMGLang.g:4136:1: rule__RefParams__Group__0__Impl : ( ( rule__RefParams__ParamsAssignment_0 ) ) ;
    public final void rule__RefParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4140:1: ( ( ( rule__RefParams__ParamsAssignment_0 ) ) )
            // InternalMGLang.g:4141:1: ( ( rule__RefParams__ParamsAssignment_0 ) )
            {
            // InternalMGLang.g:4141:1: ( ( rule__RefParams__ParamsAssignment_0 ) )
            // InternalMGLang.g:4142:2: ( rule__RefParams__ParamsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefParamsAccess().getParamsAssignment_0()); 
            }
            // InternalMGLang.g:4143:2: ( rule__RefParams__ParamsAssignment_0 )
            // InternalMGLang.g:4143:3: rule__RefParams__ParamsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__ParamsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefParamsAccess().getParamsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__Group__0__Impl"


    // $ANTLR start "rule__RefParams__Group__1"
    // InternalMGLang.g:4151:1: rule__RefParams__Group__1 : rule__RefParams__Group__1__Impl ;
    public final void rule__RefParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4155:1: ( rule__RefParams__Group__1__Impl )
            // InternalMGLang.g:4156:2: rule__RefParams__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__Group__1"


    // $ANTLR start "rule__RefParams__Group__1__Impl"
    // InternalMGLang.g:4162:1: rule__RefParams__Group__1__Impl : ( ( rule__RefParams__Group_1__0 )* ) ;
    public final void rule__RefParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4166:1: ( ( ( rule__RefParams__Group_1__0 )* ) )
            // InternalMGLang.g:4167:1: ( ( rule__RefParams__Group_1__0 )* )
            {
            // InternalMGLang.g:4167:1: ( ( rule__RefParams__Group_1__0 )* )
            // InternalMGLang.g:4168:2: ( rule__RefParams__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefParamsAccess().getGroup_1()); 
            }
            // InternalMGLang.g:4169:2: ( rule__RefParams__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==45) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMGLang.g:4169:3: rule__RefParams__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RefParams__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefParamsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__Group__1__Impl"


    // $ANTLR start "rule__RefParams__Group_1__0"
    // InternalMGLang.g:4178:1: rule__RefParams__Group_1__0 : rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1 ;
    public final void rule__RefParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4182:1: ( rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1 )
            // InternalMGLang.g:4183:2: rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__RefParams__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefParams__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__Group_1__0"


    // $ANTLR start "rule__RefParams__Group_1__0__Impl"
    // InternalMGLang.g:4190:1: rule__RefParams__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RefParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4194:1: ( ( ',' ) )
            // InternalMGLang.g:4195:1: ( ',' )
            {
            // InternalMGLang.g:4195:1: ( ',' )
            // InternalMGLang.g:4196:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefParamsAccess().getCommaKeyword_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefParamsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__Group_1__0__Impl"


    // $ANTLR start "rule__RefParams__Group_1__1"
    // InternalMGLang.g:4205:1: rule__RefParams__Group_1__1 : rule__RefParams__Group_1__1__Impl ;
    public final void rule__RefParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4209:1: ( rule__RefParams__Group_1__1__Impl )
            // InternalMGLang.g:4210:2: rule__RefParams__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__Group_1__1"


    // $ANTLR start "rule__RefParams__Group_1__1__Impl"
    // InternalMGLang.g:4216:1: rule__RefParams__Group_1__1__Impl : ( ( rule__RefParams__ParamsAssignment_1_1 ) ) ;
    public final void rule__RefParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4220:1: ( ( ( rule__RefParams__ParamsAssignment_1_1 ) ) )
            // InternalMGLang.g:4221:1: ( ( rule__RefParams__ParamsAssignment_1_1 ) )
            {
            // InternalMGLang.g:4221:1: ( ( rule__RefParams__ParamsAssignment_1_1 ) )
            // InternalMGLang.g:4222:2: ( rule__RefParams__ParamsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefParamsAccess().getParamsAssignment_1_1()); 
            }
            // InternalMGLang.g:4223:2: ( rule__RefParams__ParamsAssignment_1_1 )
            // InternalMGLang.g:4223:3: rule__RefParams__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__ParamsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefParamsAccess().getParamsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__Group_1__1__Impl"


    // $ANTLR start "rule__Generator__Group__0"
    // InternalMGLang.g:4232:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4236:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:4237:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Generator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Generator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0"


    // $ANTLR start "rule__Generator__Group__0__Impl"
    // InternalMGLang.g:4244:1: rule__Generator__Group__0__Impl : ( () ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4248:1: ( ( () ) )
            // InternalMGLang.g:4249:1: ( () )
            {
            // InternalMGLang.g:4249:1: ( () )
            // InternalMGLang.g:4250:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
            }
            // InternalMGLang.g:4251:2: ()
            // InternalMGLang.g:4251:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0__Impl"


    // $ANTLR start "rule__Generator__Group__1"
    // InternalMGLang.g:4259:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4263:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:4264:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Generator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Generator__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__1"


    // $ANTLR start "rule__Generator__Group__1__Impl"
    // InternalMGLang.g:4271:1: rule__Generator__Group__1__Impl : ( 'gen' ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4275:1: ( ( 'gen' ) )
            // InternalMGLang.g:4276:1: ( 'gen' )
            {
            // InternalMGLang.g:4276:1: ( 'gen' )
            // InternalMGLang.g:4277:2: 'gen'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGenKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGenKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__1__Impl"


    // $ANTLR start "rule__Generator__Group__2"
    // InternalMGLang.g:4286:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4290:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:4291:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Generator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Generator__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__2"


    // $ANTLR start "rule__Generator__Group__2__Impl"
    // InternalMGLang.g:4298:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4302:1: ( ( '(' ) )
            // InternalMGLang.g:4303:1: ( '(' )
            {
            // InternalMGLang.g:4303:1: ( '(' )
            // InternalMGLang.g:4304:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__2__Impl"


    // $ANTLR start "rule__Generator__Group__3"
    // InternalMGLang.g:4313:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4317:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:4318:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Generator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Generator__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__3"


    // $ANTLR start "rule__Generator__Group__3__Impl"
    // InternalMGLang.g:4325:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__ParamsAssignment_3 )* ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4329:1: ( ( ( rule__Generator__ParamsAssignment_3 )* ) )
            // InternalMGLang.g:4330:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            {
            // InternalMGLang.g:4330:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            // InternalMGLang.g:4331:2: ( rule__Generator__ParamsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getParamsAssignment_3()); 
            }
            // InternalMGLang.g:4332:2: ( rule__Generator__ParamsAssignment_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||(LA39_0>=19 && LA39_0<=22)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMGLang.g:4332:3: rule__Generator__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Generator__ParamsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getParamsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__3__Impl"


    // $ANTLR start "rule__Generator__Group__4"
    // InternalMGLang.g:4340:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4344:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:4345:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Generator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Generator__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__4"


    // $ANTLR start "rule__Generator__Group__4__Impl"
    // InternalMGLang.g:4352:1: rule__Generator__Group__4__Impl : ( ')' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4356:1: ( ( ')' ) )
            // InternalMGLang.g:4357:1: ( ')' )
            {
            // InternalMGLang.g:4357:1: ( ')' )
            // InternalMGLang.g:4358:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__4__Impl"


    // $ANTLR start "rule__Generator__Group__5"
    // InternalMGLang.g:4367:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4371:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:4372:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Generator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Generator__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__5"


    // $ANTLR start "rule__Generator__Group__5__Impl"
    // InternalMGLang.g:4379:1: rule__Generator__Group__5__Impl : ( '{' ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4383:1: ( ( '{' ) )
            // InternalMGLang.g:4384:1: ( '{' )
            {
            // InternalMGLang.g:4384:1: ( '{' )
            // InternalMGLang.g:4385:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__5__Impl"


    // $ANTLR start "rule__Generator__Group__6"
    // InternalMGLang.g:4394:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl rule__Generator__Group__7 ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4398:1: ( rule__Generator__Group__6__Impl rule__Generator__Group__7 )
            // InternalMGLang.g:4399:2: rule__Generator__Group__6__Impl rule__Generator__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__Generator__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Generator__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__6"


    // $ANTLR start "rule__Generator__Group__6__Impl"
    // InternalMGLang.g:4406:1: rule__Generator__Group__6__Impl : ( ( rule__Generator__CommandsAssignment_6 )* ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4410:1: ( ( ( rule__Generator__CommandsAssignment_6 )* ) )
            // InternalMGLang.g:4411:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            {
            // InternalMGLang.g:4411:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            // InternalMGLang.g:4412:2: ( rule__Generator__CommandsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommandsAssignment_6()); 
            }
            // InternalMGLang.g:4413:2: ( rule__Generator__CommandsAssignment_6 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==51||LA40_0==53||LA40_0==58||LA40_0==61) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMGLang.g:4413:3: rule__Generator__CommandsAssignment_6
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Generator__CommandsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getCommandsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__6__Impl"


    // $ANTLR start "rule__Generator__Group__7"
    // InternalMGLang.g:4421:1: rule__Generator__Group__7 : rule__Generator__Group__7__Impl ;
    public final void rule__Generator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4425:1: ( rule__Generator__Group__7__Impl )
            // InternalMGLang.g:4426:2: rule__Generator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generator__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__7"


    // $ANTLR start "rule__Generator__Group__7__Impl"
    // InternalMGLang.g:4432:1: rule__Generator__Group__7__Impl : ( '}' ) ;
    public final void rule__Generator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4436:1: ( ( '}' ) )
            // InternalMGLang.g:4437:1: ( '}' )
            {
            // InternalMGLang.g:4437:1: ( '}' )
            // InternalMGLang.g:4438:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__7__Impl"


    // $ANTLR start "rule__PatternVariable__Group__0"
    // InternalMGLang.g:4448:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4452:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalMGLang.g:4453:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PatternVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__0"


    // $ANTLR start "rule__PatternVariable__Group__0__Impl"
    // InternalMGLang.g:4460:1: rule__PatternVariable__Group__0__Impl : ( ( rule__PatternVariable__TypeAssignment_0 ) ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4464:1: ( ( ( rule__PatternVariable__TypeAssignment_0 ) ) )
            // InternalMGLang.g:4465:1: ( ( rule__PatternVariable__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:4465:1: ( ( rule__PatternVariable__TypeAssignment_0 ) )
            // InternalMGLang.g:4466:2: ( rule__PatternVariable__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:4467:2: ( rule__PatternVariable__TypeAssignment_0 )
            // InternalMGLang.g:4467:3: rule__PatternVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__0__Impl"


    // $ANTLR start "rule__PatternVariable__Group__1"
    // InternalMGLang.g:4475:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4479:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalMGLang.g:4480:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__PatternVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__1"


    // $ANTLR start "rule__PatternVariable__Group__1__Impl"
    // InternalMGLang.g:4487:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4491:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalMGLang.g:4492:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalMGLang.g:4492:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalMGLang.g:4493:2: ( rule__PatternVariable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:4494:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalMGLang.g:4494:3: rule__PatternVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__1__Impl"


    // $ANTLR start "rule__PatternVariable__Group__2"
    // InternalMGLang.g:4502:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4506:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalMGLang.g:4507:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PatternVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__2"


    // $ANTLR start "rule__PatternVariable__Group__2__Impl"
    // InternalMGLang.g:4514:1: rule__PatternVariable__Group__2__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4518:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:4519:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:4519:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:4520:2: RULE_ASSIGNMENT_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getASSIGNMENT_OPTerminalRuleCall_2()); 
            }
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getASSIGNMENT_OPTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__2__Impl"


    // $ANTLR start "rule__PatternVariable__Group__3"
    // InternalMGLang.g:4529:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4533:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalMGLang.g:4534:2: rule__PatternVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__3"


    // $ANTLR start "rule__PatternVariable__Group__3__Impl"
    // InternalMGLang.g:4540:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternCallAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4544:1: ( ( ( rule__PatternVariable__PatternCallAssignment_3 ) ) )
            // InternalMGLang.g:4545:1: ( ( rule__PatternVariable__PatternCallAssignment_3 ) )
            {
            // InternalMGLang.g:4545:1: ( ( rule__PatternVariable__PatternCallAssignment_3 ) )
            // InternalMGLang.g:4546:2: ( rule__PatternVariable__PatternCallAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getPatternCallAssignment_3()); 
            }
            // InternalMGLang.g:4547:2: ( rule__PatternVariable__PatternCallAssignment_3 )
            // InternalMGLang.g:4547:3: rule__PatternVariable__PatternCallAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__PatternCallAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getPatternCallAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__Group__3__Impl"


    // $ANTLR start "rule__ForStatement__Group__0"
    // InternalMGLang.g:4556:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4560:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalMGLang.g:4561:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ForStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__0"


    // $ANTLR start "rule__ForStatement__Group__0__Impl"
    // InternalMGLang.g:4568:1: rule__ForStatement__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4572:1: ( ( 'for' ) )
            // InternalMGLang.g:4573:1: ( 'for' )
            {
            // InternalMGLang.g:4573:1: ( 'for' )
            // InternalMGLang.g:4574:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getForKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__0__Impl"


    // $ANTLR start "rule__ForStatement__Group__1"
    // InternalMGLang.g:4583:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4587:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalMGLang.g:4588:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ForStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__1"


    // $ANTLR start "rule__ForStatement__Group__1__Impl"
    // InternalMGLang.g:4595:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__HeadAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4599:1: ( ( ( rule__ForStatement__HeadAssignment_1 ) ) )
            // InternalMGLang.g:4600:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            {
            // InternalMGLang.g:4600:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            // InternalMGLang.g:4601:2: ( rule__ForStatement__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getHeadAssignment_1()); 
            }
            // InternalMGLang.g:4602:2: ( rule__ForStatement__HeadAssignment_1 )
            // InternalMGLang.g:4602:3: rule__ForStatement__HeadAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__HeadAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getHeadAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__1__Impl"


    // $ANTLR start "rule__ForStatement__Group__2"
    // InternalMGLang.g:4610:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4614:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalMGLang.g:4615:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ForStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__2"


    // $ANTLR start "rule__ForStatement__Group__2__Impl"
    // InternalMGLang.g:4622:1: rule__ForStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4626:1: ( ( '{' ) )
            // InternalMGLang.g:4627:1: ( '{' )
            {
            // InternalMGLang.g:4627:1: ( '{' )
            // InternalMGLang.g:4628:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__2__Impl"


    // $ANTLR start "rule__ForStatement__Group__3"
    // InternalMGLang.g:4637:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4641:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalMGLang.g:4642:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ForStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__3"


    // $ANTLR start "rule__ForStatement__Group__3__Impl"
    // InternalMGLang.g:4649:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__BodyAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4653:1: ( ( ( rule__ForStatement__BodyAssignment_3 ) ) )
            // InternalMGLang.g:4654:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:4654:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            // InternalMGLang.g:4655:2: ( rule__ForStatement__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getBodyAssignment_3()); 
            }
            // InternalMGLang.g:4656:2: ( rule__ForStatement__BodyAssignment_3 )
            // InternalMGLang.g:4656:3: rule__ForStatement__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__BodyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getBodyAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__3__Impl"


    // $ANTLR start "rule__ForStatement__Group__4"
    // InternalMGLang.g:4664:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4668:1: ( rule__ForStatement__Group__4__Impl )
            // InternalMGLang.g:4669:2: rule__ForStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__4"


    // $ANTLR start "rule__ForStatement__Group__4__Impl"
    // InternalMGLang.g:4675:1: rule__ForStatement__Group__4__Impl : ( '}' ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4679:1: ( ( '}' ) )
            // InternalMGLang.g:4680:1: ( '}' )
            {
            // InternalMGLang.g:4680:1: ( '}' )
            // InternalMGLang.g:4681:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__Group__4__Impl"


    // $ANTLR start "rule__GeneralForHead__Group__0"
    // InternalMGLang.g:4691:1: rule__GeneralForHead__Group__0 : rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 ;
    public final void rule__GeneralForHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4695:1: ( rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 )
            // InternalMGLang.g:4696:2: rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__GeneralForHead__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralForHead__Group__0"


    // $ANTLR start "rule__GeneralForHead__Group__0__Impl"
    // InternalMGLang.g:4703:1: rule__GeneralForHead__Group__0__Impl : ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) ;
    public final void rule__GeneralForHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4707:1: ( ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) )
            // InternalMGLang.g:4708:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            {
            // InternalMGLang.g:4708:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            // InternalMGLang.g:4709:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getIteratorVarAssignment_0()); 
            }
            // InternalMGLang.g:4710:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            // InternalMGLang.g:4710:3: rule__GeneralForHead__IteratorVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__IteratorVarAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralForHeadAccess().getIteratorVarAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralForHead__Group__0__Impl"


    // $ANTLR start "rule__GeneralForHead__Group__1"
    // InternalMGLang.g:4718:1: rule__GeneralForHead__Group__1 : rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 ;
    public final void rule__GeneralForHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4722:1: ( rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 )
            // InternalMGLang.g:4723:2: rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__GeneralForHead__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralForHead__Group__1"


    // $ANTLR start "rule__GeneralForHead__Group__1__Impl"
    // InternalMGLang.g:4730:1: rule__GeneralForHead__Group__1__Impl : ( 'in' ) ;
    public final void rule__GeneralForHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4734:1: ( ( 'in' ) )
            // InternalMGLang.g:4735:1: ( 'in' )
            {
            // InternalMGLang.g:4735:1: ( 'in' )
            // InternalMGLang.g:4736:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getInKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralForHeadAccess().getInKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralForHead__Group__1__Impl"


    // $ANTLR start "rule__GeneralForHead__Group__2"
    // InternalMGLang.g:4745:1: rule__GeneralForHead__Group__2 : rule__GeneralForHead__Group__2__Impl ;
    public final void rule__GeneralForHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4749:1: ( rule__GeneralForHead__Group__2__Impl )
            // InternalMGLang.g:4750:2: rule__GeneralForHead__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralForHead__Group__2"


    // $ANTLR start "rule__GeneralForHead__Group__2__Impl"
    // InternalMGLang.g:4756:1: rule__GeneralForHead__Group__2__Impl : ( ( rule__GeneralForHead__RangeAssignment_2 ) ) ;
    public final void rule__GeneralForHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4760:1: ( ( ( rule__GeneralForHead__RangeAssignment_2 ) ) )
            // InternalMGLang.g:4761:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            {
            // InternalMGLang.g:4761:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            // InternalMGLang.g:4762:2: ( rule__GeneralForHead__RangeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getRangeAssignment_2()); 
            }
            // InternalMGLang.g:4763:2: ( rule__GeneralForHead__RangeAssignment_2 )
            // InternalMGLang.g:4763:3: rule__GeneralForHead__RangeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__RangeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralForHeadAccess().getRangeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralForHead__Group__2__Impl"


    // $ANTLR start "rule__ForEachHead__Group__0"
    // InternalMGLang.g:4772:1: rule__ForEachHead__Group__0 : rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 ;
    public final void rule__ForEachHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4776:1: ( rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 )
            // InternalMGLang.g:4777:2: rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ForEachHead__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__0"


    // $ANTLR start "rule__ForEachHead__Group__0__Impl"
    // InternalMGLang.g:4784:1: rule__ForEachHead__Group__0__Impl : ( ( rule__ForEachHead__SrcAssignment_0 ) ) ;
    public final void rule__ForEachHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4788:1: ( ( ( rule__ForEachHead__SrcAssignment_0 ) ) )
            // InternalMGLang.g:4789:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            {
            // InternalMGLang.g:4789:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            // InternalMGLang.g:4790:2: ( rule__ForEachHead__SrcAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getSrcAssignment_0()); 
            }
            // InternalMGLang.g:4791:2: ( rule__ForEachHead__SrcAssignment_0 )
            // InternalMGLang.g:4791:3: rule__ForEachHead__SrcAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__SrcAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getSrcAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__0__Impl"


    // $ANTLR start "rule__ForEachHead__Group__1"
    // InternalMGLang.g:4799:1: rule__ForEachHead__Group__1 : rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 ;
    public final void rule__ForEachHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4803:1: ( rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 )
            // InternalMGLang.g:4804:2: rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ForEachHead__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__1"


    // $ANTLR start "rule__ForEachHead__Group__1__Impl"
    // InternalMGLang.g:4811:1: rule__ForEachHead__Group__1__Impl : ( '-' ) ;
    public final void rule__ForEachHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4815:1: ( ( '-' ) )
            // InternalMGLang.g:4816:1: ( '-' )
            {
            // InternalMGLang.g:4816:1: ( '-' )
            // InternalMGLang.g:4817:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getHyphenMinusKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__1__Impl"


    // $ANTLR start "rule__ForEachHead__Group__2"
    // InternalMGLang.g:4826:1: rule__ForEachHead__Group__2 : rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 ;
    public final void rule__ForEachHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4830:1: ( rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 )
            // InternalMGLang.g:4831:2: rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ForEachHead__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__2"


    // $ANTLR start "rule__ForEachHead__Group__2__Impl"
    // InternalMGLang.g:4838:1: rule__ForEachHead__Group__2__Impl : ( ( rule__ForEachHead__ErefAssignment_2 ) ) ;
    public final void rule__ForEachHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4842:1: ( ( ( rule__ForEachHead__ErefAssignment_2 ) ) )
            // InternalMGLang.g:4843:1: ( ( rule__ForEachHead__ErefAssignment_2 ) )
            {
            // InternalMGLang.g:4843:1: ( ( rule__ForEachHead__ErefAssignment_2 ) )
            // InternalMGLang.g:4844:2: ( rule__ForEachHead__ErefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getErefAssignment_2()); 
            }
            // InternalMGLang.g:4845:2: ( rule__ForEachHead__ErefAssignment_2 )
            // InternalMGLang.g:4845:3: rule__ForEachHead__ErefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__ErefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getErefAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__2__Impl"


    // $ANTLR start "rule__ForEachHead__Group__3"
    // InternalMGLang.g:4853:1: rule__ForEachHead__Group__3 : rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 ;
    public final void rule__ForEachHead__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4857:1: ( rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 )
            // InternalMGLang.g:4858:2: rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ForEachHead__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__3"


    // $ANTLR start "rule__ForEachHead__Group__3__Impl"
    // InternalMGLang.g:4865:1: rule__ForEachHead__Group__3__Impl : ( '->' ) ;
    public final void rule__ForEachHead__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4869:1: ( ( '->' ) )
            // InternalMGLang.g:4870:1: ( '->' )
            {
            // InternalMGLang.g:4870:1: ( '->' )
            // InternalMGLang.g:4871:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__3__Impl"


    // $ANTLR start "rule__ForEachHead__Group__4"
    // InternalMGLang.g:4880:1: rule__ForEachHead__Group__4 : rule__ForEachHead__Group__4__Impl ;
    public final void rule__ForEachHead__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4884:1: ( rule__ForEachHead__Group__4__Impl )
            // InternalMGLang.g:4885:2: rule__ForEachHead__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__4"


    // $ANTLR start "rule__ForEachHead__Group__4__Impl"
    // InternalMGLang.g:4891:1: rule__ForEachHead__Group__4__Impl : ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) ;
    public final void rule__ForEachHead__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4895:1: ( ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) )
            // InternalMGLang.g:4896:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            {
            // InternalMGLang.g:4896:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            // InternalMGLang.g:4897:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getIteratorVarAssignment_4()); 
            }
            // InternalMGLang.g:4898:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            // InternalMGLang.g:4898:3: rule__ForEachHead__IteratorVarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__IteratorVarAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getIteratorVarAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__Group__4__Impl"


    // $ANTLR start "rule__ForBody__Group__0"
    // InternalMGLang.g:4907:1: rule__ForBody__Group__0 : rule__ForBody__Group__0__Impl rule__ForBody__Group__1 ;
    public final void rule__ForBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4911:1: ( rule__ForBody__Group__0__Impl rule__ForBody__Group__1 )
            // InternalMGLang.g:4912:2: rule__ForBody__Group__0__Impl rule__ForBody__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ForBody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForBody__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBody__Group__0"


    // $ANTLR start "rule__ForBody__Group__0__Impl"
    // InternalMGLang.g:4919:1: rule__ForBody__Group__0__Impl : ( () ) ;
    public final void rule__ForBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4923:1: ( ( () ) )
            // InternalMGLang.g:4924:1: ( () )
            {
            // InternalMGLang.g:4924:1: ( () )
            // InternalMGLang.g:4925:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getForBodyAction_0()); 
            }
            // InternalMGLang.g:4926:2: ()
            // InternalMGLang.g:4926:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForBodyAccess().getForBodyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBody__Group__0__Impl"


    // $ANTLR start "rule__ForBody__Group__1"
    // InternalMGLang.g:4934:1: rule__ForBody__Group__1 : rule__ForBody__Group__1__Impl ;
    public final void rule__ForBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4938:1: ( rule__ForBody__Group__1__Impl )
            // InternalMGLang.g:4939:2: rule__ForBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForBody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBody__Group__1"


    // $ANTLR start "rule__ForBody__Group__1__Impl"
    // InternalMGLang.g:4945:1: rule__ForBody__Group__1__Impl : ( ( rule__ForBody__CommandsAssignment_1 )* ) ;
    public final void rule__ForBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4949:1: ( ( ( rule__ForBody__CommandsAssignment_1 )* ) )
            // InternalMGLang.g:4950:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            {
            // InternalMGLang.g:4950:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            // InternalMGLang.g:4951:2: ( rule__ForBody__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getCommandsAssignment_1()); 
            }
            // InternalMGLang.g:4952:2: ( rule__ForBody__CommandsAssignment_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==51||LA41_0==53||LA41_0==58||LA41_0==61) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMGLang.g:4952:3: rule__ForBody__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__ForBody__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForBodyAccess().getCommandsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBody__Group__1__Impl"


    // $ANTLR start "rule__IfElseSwitch__Group__0"
    // InternalMGLang.g:4961:1: rule__IfElseSwitch__Group__0 : rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1 ;
    public final void rule__IfElseSwitch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4965:1: ( rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1 )
            // InternalMGLang.g:4966:2: rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__IfElseSwitch__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__0"


    // $ANTLR start "rule__IfElseSwitch__Group__0__Impl"
    // InternalMGLang.g:4973:1: rule__IfElseSwitch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__IfElseSwitch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4977:1: ( ( 'switch' ) )
            // InternalMGLang.g:4978:1: ( 'switch' )
            {
            // InternalMGLang.g:4978:1: ( 'switch' )
            // InternalMGLang.g:4979:2: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getSwitchKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getSwitchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__0__Impl"


    // $ANTLR start "rule__IfElseSwitch__Group__1"
    // InternalMGLang.g:4988:1: rule__IfElseSwitch__Group__1 : rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2 ;
    public final void rule__IfElseSwitch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4992:1: ( rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2 )
            // InternalMGLang.g:4993:2: rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__IfElseSwitch__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__1"


    // $ANTLR start "rule__IfElseSwitch__Group__1__Impl"
    // InternalMGLang.g:5000:1: rule__IfElseSwitch__Group__1__Impl : ( '{' ) ;
    public final void rule__IfElseSwitch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5004:1: ( ( '{' ) )
            // InternalMGLang.g:5005:1: ( '{' )
            {
            // InternalMGLang.g:5005:1: ( '{' )
            // InternalMGLang.g:5006:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__1__Impl"


    // $ANTLR start "rule__IfElseSwitch__Group__2"
    // InternalMGLang.g:5015:1: rule__IfElseSwitch__Group__2 : rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3 ;
    public final void rule__IfElseSwitch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5019:1: ( rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3 )
            // InternalMGLang.g:5020:2: rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__IfElseSwitch__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__2"


    // $ANTLR start "rule__IfElseSwitch__Group__2__Impl"
    // InternalMGLang.g:5027:1: rule__IfElseSwitch__Group__2__Impl : ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) ) ;
    public final void rule__IfElseSwitch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5031:1: ( ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) ) )
            // InternalMGLang.g:5032:1: ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) )
            {
            // InternalMGLang.g:5032:1: ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) )
            // InternalMGLang.g:5033:2: ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* )
            {
            // InternalMGLang.g:5033:2: ( ( rule__IfElseSwitch__CasesAssignment_2 ) )
            // InternalMGLang.g:5034:3: ( rule__IfElseSwitch__CasesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            }
            // InternalMGLang.g:5035:3: ( rule__IfElseSwitch__CasesAssignment_2 )
            // InternalMGLang.g:5035:4: rule__IfElseSwitch__CasesAssignment_2
            {
            pushFollow(FOLLOW_40);
            rule__IfElseSwitch__CasesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            }

            }

            // InternalMGLang.g:5038:2: ( ( rule__IfElseSwitch__CasesAssignment_2 )* )
            // InternalMGLang.g:5039:3: ( rule__IfElseSwitch__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            }
            // InternalMGLang.g:5040:3: ( rule__IfElseSwitch__CasesAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==54) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMGLang.g:5040:4: rule__IfElseSwitch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__IfElseSwitch__CasesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__2__Impl"


    // $ANTLR start "rule__IfElseSwitch__Group__3"
    // InternalMGLang.g:5049:1: rule__IfElseSwitch__Group__3 : rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4 ;
    public final void rule__IfElseSwitch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5053:1: ( rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4 )
            // InternalMGLang.g:5054:2: rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__IfElseSwitch__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__3"


    // $ANTLR start "rule__IfElseSwitch__Group__3__Impl"
    // InternalMGLang.g:5061:1: rule__IfElseSwitch__Group__3__Impl : ( ( rule__IfElseSwitch__DefaultAssignment_3 )? ) ;
    public final void rule__IfElseSwitch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5065:1: ( ( ( rule__IfElseSwitch__DefaultAssignment_3 )? ) )
            // InternalMGLang.g:5066:1: ( ( rule__IfElseSwitch__DefaultAssignment_3 )? )
            {
            // InternalMGLang.g:5066:1: ( ( rule__IfElseSwitch__DefaultAssignment_3 )? )
            // InternalMGLang.g:5067:2: ( rule__IfElseSwitch__DefaultAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getDefaultAssignment_3()); 
            }
            // InternalMGLang.g:5068:2: ( rule__IfElseSwitch__DefaultAssignment_3 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMGLang.g:5068:3: rule__IfElseSwitch__DefaultAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfElseSwitch__DefaultAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getDefaultAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__3__Impl"


    // $ANTLR start "rule__IfElseSwitch__Group__4"
    // InternalMGLang.g:5076:1: rule__IfElseSwitch__Group__4 : rule__IfElseSwitch__Group__4__Impl ;
    public final void rule__IfElseSwitch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5080:1: ( rule__IfElseSwitch__Group__4__Impl )
            // InternalMGLang.g:5081:2: rule__IfElseSwitch__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__4"


    // $ANTLR start "rule__IfElseSwitch__Group__4__Impl"
    // InternalMGLang.g:5087:1: rule__IfElseSwitch__Group__4__Impl : ( '}' ) ;
    public final void rule__IfElseSwitch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5091:1: ( ( '}' ) )
            // InternalMGLang.g:5092:1: ( '}' )
            {
            // InternalMGLang.g:5092:1: ( '}' )
            // InternalMGLang.g:5093:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__Group__4__Impl"


    // $ANTLR start "rule__IfElseCase__Group__0"
    // InternalMGLang.g:5103:1: rule__IfElseCase__Group__0 : rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1 ;
    public final void rule__IfElseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5107:1: ( rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1 )
            // InternalMGLang.g:5108:2: rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__IfElseCase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__Group__0"


    // $ANTLR start "rule__IfElseCase__Group__0__Impl"
    // InternalMGLang.g:5115:1: rule__IfElseCase__Group__0__Impl : ( 'case' ) ;
    public final void rule__IfElseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5119:1: ( ( 'case' ) )
            // InternalMGLang.g:5120:1: ( 'case' )
            {
            // InternalMGLang.g:5120:1: ( 'case' )
            // InternalMGLang.g:5121:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getCaseKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseCaseAccess().getCaseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__Group__0__Impl"


    // $ANTLR start "rule__IfElseCase__Group__1"
    // InternalMGLang.g:5130:1: rule__IfElseCase__Group__1 : rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2 ;
    public final void rule__IfElseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5134:1: ( rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2 )
            // InternalMGLang.g:5135:2: rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__IfElseCase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__Group__1"


    // $ANTLR start "rule__IfElseCase__Group__1__Impl"
    // InternalMGLang.g:5142:1: rule__IfElseCase__Group__1__Impl : ( ( rule__IfElseCase__ValAssignment_1 ) ) ;
    public final void rule__IfElseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5146:1: ( ( ( rule__IfElseCase__ValAssignment_1 ) ) )
            // InternalMGLang.g:5147:1: ( ( rule__IfElseCase__ValAssignment_1 ) )
            {
            // InternalMGLang.g:5147:1: ( ( rule__IfElseCase__ValAssignment_1 ) )
            // InternalMGLang.g:5148:2: ( rule__IfElseCase__ValAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getValAssignment_1()); 
            }
            // InternalMGLang.g:5149:2: ( rule__IfElseCase__ValAssignment_1 )
            // InternalMGLang.g:5149:3: rule__IfElseCase__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfElseCase__ValAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseCaseAccess().getValAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__Group__1__Impl"


    // $ANTLR start "rule__IfElseCase__Group__2"
    // InternalMGLang.g:5157:1: rule__IfElseCase__Group__2 : rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3 ;
    public final void rule__IfElseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5161:1: ( rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3 )
            // InternalMGLang.g:5162:2: rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__IfElseCase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__Group__2"


    // $ANTLR start "rule__IfElseCase__Group__2__Impl"
    // InternalMGLang.g:5169:1: rule__IfElseCase__Group__2__Impl : ( ':' ) ;
    public final void rule__IfElseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5173:1: ( ( ':' ) )
            // InternalMGLang.g:5174:1: ( ':' )
            {
            // InternalMGLang.g:5174:1: ( ':' )
            // InternalMGLang.g:5175:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getColonKeyword_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseCaseAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__Group__2__Impl"


    // $ANTLR start "rule__IfElseCase__Group__3"
    // InternalMGLang.g:5184:1: rule__IfElseCase__Group__3 : rule__IfElseCase__Group__3__Impl ;
    public final void rule__IfElseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5188:1: ( rule__IfElseCase__Group__3__Impl )
            // InternalMGLang.g:5189:2: rule__IfElseCase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__Group__3"


    // $ANTLR start "rule__IfElseCase__Group__3__Impl"
    // InternalMGLang.g:5195:1: rule__IfElseCase__Group__3__Impl : ( ( rule__IfElseCase__BodyAssignment_3 ) ) ;
    public final void rule__IfElseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5199:1: ( ( ( rule__IfElseCase__BodyAssignment_3 ) ) )
            // InternalMGLang.g:5200:1: ( ( rule__IfElseCase__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:5200:1: ( ( rule__IfElseCase__BodyAssignment_3 ) )
            // InternalMGLang.g:5201:2: ( rule__IfElseCase__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getBodyAssignment_3()); 
            }
            // InternalMGLang.g:5202:2: ( rule__IfElseCase__BodyAssignment_3 )
            // InternalMGLang.g:5202:3: rule__IfElseCase__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfElseCase__BodyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseCaseAccess().getBodyAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__Group__3__Impl"


    // $ANTLR start "rule__Default__Group__0"
    // InternalMGLang.g:5211:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5215:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalMGLang.g:5216:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Default__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Default__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0"


    // $ANTLR start "rule__Default__Group__0__Impl"
    // InternalMGLang.g:5223:1: rule__Default__Group__0__Impl : ( 'default' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5227:1: ( ( 'default' ) )
            // InternalMGLang.g:5228:1: ( 'default' )
            {
            // InternalMGLang.g:5228:1: ( 'default' )
            // InternalMGLang.g:5229:2: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0__Impl"


    // $ANTLR start "rule__Default__Group__1"
    // InternalMGLang.g:5238:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5242:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalMGLang.g:5243:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Default__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Default__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1"


    // $ANTLR start "rule__Default__Group__1__Impl"
    // InternalMGLang.g:5250:1: rule__Default__Group__1__Impl : ( ':' ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5254:1: ( ( ':' ) )
            // InternalMGLang.g:5255:1: ( ':' )
            {
            // InternalMGLang.g:5255:1: ( ':' )
            // InternalMGLang.g:5256:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getColonKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1__Impl"


    // $ANTLR start "rule__Default__Group__2"
    // InternalMGLang.g:5265:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5269:1: ( rule__Default__Group__2__Impl )
            // InternalMGLang.g:5270:2: rule__Default__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2"


    // $ANTLR start "rule__Default__Group__2__Impl"
    // InternalMGLang.g:5276:1: rule__Default__Group__2__Impl : ( ruleCaseBody ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5280:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:5281:1: ( ruleCaseBody )
            {
            // InternalMGLang.g:5281:1: ( ruleCaseBody )
            // InternalMGLang.g:5282:2: ruleCaseBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getCaseBodyParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getCaseBodyParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2__Impl"


    // $ANTLR start "rule__SwitchCase__Group__0"
    // InternalMGLang.g:5292:1: rule__SwitchCase__Group__0 : rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 ;
    public final void rule__SwitchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5296:1: ( rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 )
            // InternalMGLang.g:5297:2: rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SwitchCase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__0"


    // $ANTLR start "rule__SwitchCase__Group__0__Impl"
    // InternalMGLang.g:5304:1: rule__SwitchCase__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5308:1: ( ( 'switch' ) )
            // InternalMGLang.g:5309:1: ( 'switch' )
            {
            // InternalMGLang.g:5309:1: ( 'switch' )
            // InternalMGLang.g:5310:2: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__0__Impl"


    // $ANTLR start "rule__SwitchCase__Group__1"
    // InternalMGLang.g:5319:1: rule__SwitchCase__Group__1 : rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 ;
    public final void rule__SwitchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5323:1: ( rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 )
            // InternalMGLang.g:5324:2: rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__SwitchCase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__1"


    // $ANTLR start "rule__SwitchCase__Group__1__Impl"
    // InternalMGLang.g:5331:1: rule__SwitchCase__Group__1__Impl : ( '(' ) ;
    public final void rule__SwitchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5335:1: ( ( '(' ) )
            // InternalMGLang.g:5336:1: ( '(' )
            {
            // InternalMGLang.g:5336:1: ( '(' )
            // InternalMGLang.g:5337:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__1__Impl"


    // $ANTLR start "rule__SwitchCase__Group__2"
    // InternalMGLang.g:5346:1: rule__SwitchCase__Group__2 : rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 ;
    public final void rule__SwitchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5350:1: ( rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 )
            // InternalMGLang.g:5351:2: rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SwitchCase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__2"


    // $ANTLR start "rule__SwitchCase__Group__2__Impl"
    // InternalMGLang.g:5358:1: rule__SwitchCase__Group__2__Impl : ( ( rule__SwitchCase__AttributeAssignment_2 ) ) ;
    public final void rule__SwitchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5362:1: ( ( ( rule__SwitchCase__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:5363:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:5363:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            // InternalMGLang.g:5364:2: ( rule__SwitchCase__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getAttributeAssignment_2()); 
            }
            // InternalMGLang.g:5365:2: ( rule__SwitchCase__AttributeAssignment_2 )
            // InternalMGLang.g:5365:3: rule__SwitchCase__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCase__AttributeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getAttributeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__2__Impl"


    // $ANTLR start "rule__SwitchCase__Group__3"
    // InternalMGLang.g:5373:1: rule__SwitchCase__Group__3 : rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 ;
    public final void rule__SwitchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5377:1: ( rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 )
            // InternalMGLang.g:5378:2: rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SwitchCase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__3"


    // $ANTLR start "rule__SwitchCase__Group__3__Impl"
    // InternalMGLang.g:5385:1: rule__SwitchCase__Group__3__Impl : ( ')' ) ;
    public final void rule__SwitchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5389:1: ( ( ')' ) )
            // InternalMGLang.g:5390:1: ( ')' )
            {
            // InternalMGLang.g:5390:1: ( ')' )
            // InternalMGLang.g:5391:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__3__Impl"


    // $ANTLR start "rule__SwitchCase__Group__4"
    // InternalMGLang.g:5400:1: rule__SwitchCase__Group__4 : rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 ;
    public final void rule__SwitchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5404:1: ( rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 )
            // InternalMGLang.g:5405:2: rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__SwitchCase__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__4"


    // $ANTLR start "rule__SwitchCase__Group__4__Impl"
    // InternalMGLang.g:5412:1: rule__SwitchCase__Group__4__Impl : ( '{' ) ;
    public final void rule__SwitchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5416:1: ( ( '{' ) )
            // InternalMGLang.g:5417:1: ( '{' )
            {
            // InternalMGLang.g:5417:1: ( '{' )
            // InternalMGLang.g:5418:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__4__Impl"


    // $ANTLR start "rule__SwitchCase__Group__5"
    // InternalMGLang.g:5427:1: rule__SwitchCase__Group__5 : rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 ;
    public final void rule__SwitchCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5431:1: ( rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 )
            // InternalMGLang.g:5432:2: rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__SwitchCase__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__5"


    // $ANTLR start "rule__SwitchCase__Group__5__Impl"
    // InternalMGLang.g:5439:1: rule__SwitchCase__Group__5__Impl : ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) ;
    public final void rule__SwitchCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5443:1: ( ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) )
            // InternalMGLang.g:5444:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            {
            // InternalMGLang.g:5444:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            // InternalMGLang.g:5445:2: ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* )
            {
            // InternalMGLang.g:5445:2: ( ( rule__SwitchCase__CasesAssignment_5 ) )
            // InternalMGLang.g:5446:3: ( rule__SwitchCase__CasesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }
            // InternalMGLang.g:5447:3: ( rule__SwitchCase__CasesAssignment_5 )
            // InternalMGLang.g:5447:4: rule__SwitchCase__CasesAssignment_5
            {
            pushFollow(FOLLOW_40);
            rule__SwitchCase__CasesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }

            }

            // InternalMGLang.g:5450:2: ( ( rule__SwitchCase__CasesAssignment_5 )* )
            // InternalMGLang.g:5451:3: ( rule__SwitchCase__CasesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }
            // InternalMGLang.g:5452:3: ( rule__SwitchCase__CasesAssignment_5 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==54) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMGLang.g:5452:4: rule__SwitchCase__CasesAssignment_5
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__SwitchCase__CasesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__5__Impl"


    // $ANTLR start "rule__SwitchCase__Group__6"
    // InternalMGLang.g:5461:1: rule__SwitchCase__Group__6 : rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7 ;
    public final void rule__SwitchCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5465:1: ( rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7 )
            // InternalMGLang.g:5466:2: rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__SwitchCase__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__6"


    // $ANTLR start "rule__SwitchCase__Group__6__Impl"
    // InternalMGLang.g:5473:1: rule__SwitchCase__Group__6__Impl : ( ( rule__SwitchCase__DefaultAssignment_6 )? ) ;
    public final void rule__SwitchCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5477:1: ( ( ( rule__SwitchCase__DefaultAssignment_6 )? ) )
            // InternalMGLang.g:5478:1: ( ( rule__SwitchCase__DefaultAssignment_6 )? )
            {
            // InternalMGLang.g:5478:1: ( ( rule__SwitchCase__DefaultAssignment_6 )? )
            // InternalMGLang.g:5479:2: ( rule__SwitchCase__DefaultAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getDefaultAssignment_6()); 
            }
            // InternalMGLang.g:5480:2: ( rule__SwitchCase__DefaultAssignment_6 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMGLang.g:5480:3: rule__SwitchCase__DefaultAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__SwitchCase__DefaultAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getDefaultAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__6__Impl"


    // $ANTLR start "rule__SwitchCase__Group__7"
    // InternalMGLang.g:5488:1: rule__SwitchCase__Group__7 : rule__SwitchCase__Group__7__Impl ;
    public final void rule__SwitchCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5492:1: ( rule__SwitchCase__Group__7__Impl )
            // InternalMGLang.g:5493:2: rule__SwitchCase__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__7"


    // $ANTLR start "rule__SwitchCase__Group__7__Impl"
    // InternalMGLang.g:5499:1: rule__SwitchCase__Group__7__Impl : ( '}' ) ;
    public final void rule__SwitchCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5503:1: ( ( '}' ) )
            // InternalMGLang.g:5504:1: ( '}' )
            {
            // InternalMGLang.g:5504:1: ( '}' )
            // InternalMGLang.g:5505:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__Group__7__Impl"


    // $ANTLR start "rule__CaseWithCast__Group__0"
    // InternalMGLang.g:5515:1: rule__CaseWithCast__Group__0 : rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1 ;
    public final void rule__CaseWithCast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5519:1: ( rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1 )
            // InternalMGLang.g:5520:2: rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CaseWithCast__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__0"


    // $ANTLR start "rule__CaseWithCast__Group__0__Impl"
    // InternalMGLang.g:5527:1: rule__CaseWithCast__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseWithCast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5531:1: ( ( 'case' ) )
            // InternalMGLang.g:5532:1: ( 'case' )
            {
            // InternalMGLang.g:5532:1: ( 'case' )
            // InternalMGLang.g:5533:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getCaseKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getCaseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__0__Impl"


    // $ANTLR start "rule__CaseWithCast__Group__1"
    // InternalMGLang.g:5542:1: rule__CaseWithCast__Group__1 : rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2 ;
    public final void rule__CaseWithCast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5546:1: ( rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2 )
            // InternalMGLang.g:5547:2: rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__CaseWithCast__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__1"


    // $ANTLR start "rule__CaseWithCast__Group__1__Impl"
    // InternalMGLang.g:5554:1: rule__CaseWithCast__Group__1__Impl : ( ( rule__CaseWithCast__NodeAssignment_1 ) ) ;
    public final void rule__CaseWithCast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5558:1: ( ( ( rule__CaseWithCast__NodeAssignment_1 ) ) )
            // InternalMGLang.g:5559:1: ( ( rule__CaseWithCast__NodeAssignment_1 ) )
            {
            // InternalMGLang.g:5559:1: ( ( rule__CaseWithCast__NodeAssignment_1 ) )
            // InternalMGLang.g:5560:2: ( rule__CaseWithCast__NodeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getNodeAssignment_1()); 
            }
            // InternalMGLang.g:5561:2: ( rule__CaseWithCast__NodeAssignment_1 )
            // InternalMGLang.g:5561:3: rule__CaseWithCast__NodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__NodeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getNodeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__1__Impl"


    // $ANTLR start "rule__CaseWithCast__Group__2"
    // InternalMGLang.g:5569:1: rule__CaseWithCast__Group__2 : rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3 ;
    public final void rule__CaseWithCast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5573:1: ( rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3 )
            // InternalMGLang.g:5574:2: rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__CaseWithCast__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__2"


    // $ANTLR start "rule__CaseWithCast__Group__2__Impl"
    // InternalMGLang.g:5581:1: rule__CaseWithCast__Group__2__Impl : ( ( rule__CaseWithCast__Group_2__0 )? ) ;
    public final void rule__CaseWithCast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5585:1: ( ( ( rule__CaseWithCast__Group_2__0 )? ) )
            // InternalMGLang.g:5586:1: ( ( rule__CaseWithCast__Group_2__0 )? )
            {
            // InternalMGLang.g:5586:1: ( ( rule__CaseWithCast__Group_2__0 )? )
            // InternalMGLang.g:5587:2: ( rule__CaseWithCast__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getGroup_2()); 
            }
            // InternalMGLang.g:5588:2: ( rule__CaseWithCast__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMGLang.g:5588:3: rule__CaseWithCast__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseWithCast__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__2__Impl"


    // $ANTLR start "rule__CaseWithCast__Group__3"
    // InternalMGLang.g:5596:1: rule__CaseWithCast__Group__3 : rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4 ;
    public final void rule__CaseWithCast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5600:1: ( rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4 )
            // InternalMGLang.g:5601:2: rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__CaseWithCast__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__3"


    // $ANTLR start "rule__CaseWithCast__Group__3__Impl"
    // InternalMGLang.g:5608:1: rule__CaseWithCast__Group__3__Impl : ( ':' ) ;
    public final void rule__CaseWithCast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5612:1: ( ( ':' ) )
            // InternalMGLang.g:5613:1: ( ':' )
            {
            // InternalMGLang.g:5613:1: ( ':' )
            // InternalMGLang.g:5614:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getColonKeyword_3()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__3__Impl"


    // $ANTLR start "rule__CaseWithCast__Group__4"
    // InternalMGLang.g:5623:1: rule__CaseWithCast__Group__4 : rule__CaseWithCast__Group__4__Impl ;
    public final void rule__CaseWithCast__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5627:1: ( rule__CaseWithCast__Group__4__Impl )
            // InternalMGLang.g:5628:2: rule__CaseWithCast__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__4"


    // $ANTLR start "rule__CaseWithCast__Group__4__Impl"
    // InternalMGLang.g:5634:1: rule__CaseWithCast__Group__4__Impl : ( ( rule__CaseWithCast__BodyAssignment_4 ) ) ;
    public final void rule__CaseWithCast__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5638:1: ( ( ( rule__CaseWithCast__BodyAssignment_4 ) ) )
            // InternalMGLang.g:5639:1: ( ( rule__CaseWithCast__BodyAssignment_4 ) )
            {
            // InternalMGLang.g:5639:1: ( ( rule__CaseWithCast__BodyAssignment_4 ) )
            // InternalMGLang.g:5640:2: ( rule__CaseWithCast__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getBodyAssignment_4()); 
            }
            // InternalMGLang.g:5641:2: ( rule__CaseWithCast__BodyAssignment_4 )
            // InternalMGLang.g:5641:3: rule__CaseWithCast__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__BodyAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getBodyAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group__4__Impl"


    // $ANTLR start "rule__CaseWithCast__Group_2__0"
    // InternalMGLang.g:5650:1: rule__CaseWithCast__Group_2__0 : rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1 ;
    public final void rule__CaseWithCast__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5654:1: ( rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1 )
            // InternalMGLang.g:5655:2: rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__CaseWithCast__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group_2__0"


    // $ANTLR start "rule__CaseWithCast__Group_2__0__Impl"
    // InternalMGLang.g:5662:1: rule__CaseWithCast__Group_2__0__Impl : ( 'when' ) ;
    public final void rule__CaseWithCast__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5666:1: ( ( 'when' ) )
            // InternalMGLang.g:5667:1: ( 'when' )
            {
            // InternalMGLang.g:5667:1: ( 'when' )
            // InternalMGLang.g:5668:2: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getWhenKeyword_2_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getWhenKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group_2__0__Impl"


    // $ANTLR start "rule__CaseWithCast__Group_2__1"
    // InternalMGLang.g:5677:1: rule__CaseWithCast__Group_2__1 : rule__CaseWithCast__Group_2__1__Impl ;
    public final void rule__CaseWithCast__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5681:1: ( rule__CaseWithCast__Group_2__1__Impl )
            // InternalMGLang.g:5682:2: rule__CaseWithCast__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group_2__1"


    // $ANTLR start "rule__CaseWithCast__Group_2__1__Impl"
    // InternalMGLang.g:5688:1: rule__CaseWithCast__Group_2__1__Impl : ( ( rule__CaseWithCast__WhenAssignment_2_1 ) ) ;
    public final void rule__CaseWithCast__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5692:1: ( ( ( rule__CaseWithCast__WhenAssignment_2_1 ) ) )
            // InternalMGLang.g:5693:1: ( ( rule__CaseWithCast__WhenAssignment_2_1 ) )
            {
            // InternalMGLang.g:5693:1: ( ( rule__CaseWithCast__WhenAssignment_2_1 ) )
            // InternalMGLang.g:5694:2: ( rule__CaseWithCast__WhenAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getWhenAssignment_2_1()); 
            }
            // InternalMGLang.g:5695:2: ( rule__CaseWithCast__WhenAssignment_2_1 )
            // InternalMGLang.g:5695:3: rule__CaseWithCast__WhenAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__WhenAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getWhenAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__Group_2__1__Impl"


    // $ANTLR start "rule__CaseWithoutCast__Group__0"
    // InternalMGLang.g:5704:1: rule__CaseWithoutCast__Group__0 : rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1 ;
    public final void rule__CaseWithoutCast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5708:1: ( rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1 )
            // InternalMGLang.g:5709:2: rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__CaseWithoutCast__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__Group__0"


    // $ANTLR start "rule__CaseWithoutCast__Group__0__Impl"
    // InternalMGLang.g:5716:1: rule__CaseWithoutCast__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseWithoutCast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5720:1: ( ( 'case' ) )
            // InternalMGLang.g:5721:1: ( 'case' )
            {
            // InternalMGLang.g:5721:1: ( 'case' )
            // InternalMGLang.g:5722:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithoutCastAccess().getCaseKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithoutCastAccess().getCaseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__Group__0__Impl"


    // $ANTLR start "rule__CaseWithoutCast__Group__1"
    // InternalMGLang.g:5731:1: rule__CaseWithoutCast__Group__1 : rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2 ;
    public final void rule__CaseWithoutCast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5735:1: ( rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2 )
            // InternalMGLang.g:5736:2: rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__CaseWithoutCast__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__Group__1"


    // $ANTLR start "rule__CaseWithoutCast__Group__1__Impl"
    // InternalMGLang.g:5743:1: rule__CaseWithoutCast__Group__1__Impl : ( ( rule__CaseWithoutCast__ValAssignment_1 ) ) ;
    public final void rule__CaseWithoutCast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5747:1: ( ( ( rule__CaseWithoutCast__ValAssignment_1 ) ) )
            // InternalMGLang.g:5748:1: ( ( rule__CaseWithoutCast__ValAssignment_1 ) )
            {
            // InternalMGLang.g:5748:1: ( ( rule__CaseWithoutCast__ValAssignment_1 ) )
            // InternalMGLang.g:5749:2: ( rule__CaseWithoutCast__ValAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithoutCastAccess().getValAssignment_1()); 
            }
            // InternalMGLang.g:5750:2: ( rule__CaseWithoutCast__ValAssignment_1 )
            // InternalMGLang.g:5750:3: rule__CaseWithoutCast__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__ValAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithoutCastAccess().getValAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__Group__1__Impl"


    // $ANTLR start "rule__CaseWithoutCast__Group__2"
    // InternalMGLang.g:5758:1: rule__CaseWithoutCast__Group__2 : rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3 ;
    public final void rule__CaseWithoutCast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5762:1: ( rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3 )
            // InternalMGLang.g:5763:2: rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__CaseWithoutCast__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__Group__2"


    // $ANTLR start "rule__CaseWithoutCast__Group__2__Impl"
    // InternalMGLang.g:5770:1: rule__CaseWithoutCast__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseWithoutCast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5774:1: ( ( ':' ) )
            // InternalMGLang.g:5775:1: ( ':' )
            {
            // InternalMGLang.g:5775:1: ( ':' )
            // InternalMGLang.g:5776:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithoutCastAccess().getColonKeyword_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithoutCastAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__Group__2__Impl"


    // $ANTLR start "rule__CaseWithoutCast__Group__3"
    // InternalMGLang.g:5785:1: rule__CaseWithoutCast__Group__3 : rule__CaseWithoutCast__Group__3__Impl ;
    public final void rule__CaseWithoutCast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5789:1: ( rule__CaseWithoutCast__Group__3__Impl )
            // InternalMGLang.g:5790:2: rule__CaseWithoutCast__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__Group__3"


    // $ANTLR start "rule__CaseWithoutCast__Group__3__Impl"
    // InternalMGLang.g:5796:1: rule__CaseWithoutCast__Group__3__Impl : ( ( rule__CaseWithoutCast__BodyAssignment_3 ) ) ;
    public final void rule__CaseWithoutCast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5800:1: ( ( ( rule__CaseWithoutCast__BodyAssignment_3 ) ) )
            // InternalMGLang.g:5801:1: ( ( rule__CaseWithoutCast__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:5801:1: ( ( rule__CaseWithoutCast__BodyAssignment_3 ) )
            // InternalMGLang.g:5802:2: ( rule__CaseWithoutCast__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithoutCastAccess().getBodyAssignment_3()); 
            }
            // InternalMGLang.g:5803:2: ( rule__CaseWithoutCast__BodyAssignment_3 )
            // InternalMGLang.g:5803:3: rule__CaseWithoutCast__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__BodyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithoutCastAccess().getBodyAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__Group__3__Impl"


    // $ANTLR start "rule__CaseBody__Group_0__0"
    // InternalMGLang.g:5812:1: rule__CaseBody__Group_0__0 : rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 ;
    public final void rule__CaseBody__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5816:1: ( rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 )
            // InternalMGLang.g:5817:2: rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CaseBody__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_0__0"


    // $ANTLR start "rule__CaseBody__Group_0__0__Impl"
    // InternalMGLang.g:5824:1: rule__CaseBody__Group_0__0__Impl : ( () ) ;
    public final void rule__CaseBody__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5828:1: ( ( () ) )
            // InternalMGLang.g:5829:1: ( () )
            {
            // InternalMGLang.g:5829:1: ( () )
            // InternalMGLang.g:5830:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0()); 
            }
            // InternalMGLang.g:5831:2: ()
            // InternalMGLang.g:5831:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_0__0__Impl"


    // $ANTLR start "rule__CaseBody__Group_0__1"
    // InternalMGLang.g:5839:1: rule__CaseBody__Group_0__1 : rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 ;
    public final void rule__CaseBody__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5843:1: ( rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 )
            // InternalMGLang.g:5844:2: rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2
            {
            pushFollow(FOLLOW_44);
            rule__CaseBody__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_0__1"


    // $ANTLR start "rule__CaseBody__Group_0__1__Impl"
    // InternalMGLang.g:5851:1: rule__CaseBody__Group_0__1__Impl : ( '{' ) ;
    public final void rule__CaseBody__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5855:1: ( ( '{' ) )
            // InternalMGLang.g:5856:1: ( '{' )
            {
            // InternalMGLang.g:5856:1: ( '{' )
            // InternalMGLang.g:5857:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getLeftCurlyBracketKeyword_0_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getLeftCurlyBracketKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_0__1__Impl"


    // $ANTLR start "rule__CaseBody__Group_0__2"
    // InternalMGLang.g:5866:1: rule__CaseBody__Group_0__2 : rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 ;
    public final void rule__CaseBody__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5870:1: ( rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 )
            // InternalMGLang.g:5871:2: rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3
            {
            pushFollow(FOLLOW_44);
            rule__CaseBody__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_0__2"


    // $ANTLR start "rule__CaseBody__Group_0__2__Impl"
    // InternalMGLang.g:5878:1: rule__CaseBody__Group_0__2__Impl : ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) ;
    public final void rule__CaseBody__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5882:1: ( ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) )
            // InternalMGLang.g:5883:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            {
            // InternalMGLang.g:5883:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            // InternalMGLang.g:5884:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_0_2()); 
            }
            // InternalMGLang.g:5885:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==51||LA47_0==53||LA47_0==58||LA47_0==61) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMGLang.g:5885:3: rule__CaseBody__ExpressionsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__CaseBody__ExpressionsAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_0__2__Impl"


    // $ANTLR start "rule__CaseBody__Group_0__3"
    // InternalMGLang.g:5893:1: rule__CaseBody__Group_0__3 : rule__CaseBody__Group_0__3__Impl ;
    public final void rule__CaseBody__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5897:1: ( rule__CaseBody__Group_0__3__Impl )
            // InternalMGLang.g:5898:2: rule__CaseBody__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_0__3"


    // $ANTLR start "rule__CaseBody__Group_0__3__Impl"
    // InternalMGLang.g:5904:1: rule__CaseBody__Group_0__3__Impl : ( '}' ) ;
    public final void rule__CaseBody__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5908:1: ( ( '}' ) )
            // InternalMGLang.g:5909:1: ( '}' )
            {
            // InternalMGLang.g:5909:1: ( '}' )
            // InternalMGLang.g:5910:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getRightCurlyBracketKeyword_0_3()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getRightCurlyBracketKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_0__3__Impl"


    // $ANTLR start "rule__CaseBody__Group_1__0"
    // InternalMGLang.g:5920:1: rule__CaseBody__Group_1__0 : rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1 ;
    public final void rule__CaseBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5924:1: ( rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1 )
            // InternalMGLang.g:5925:2: rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__CaseBody__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_1__0"


    // $ANTLR start "rule__CaseBody__Group_1__0__Impl"
    // InternalMGLang.g:5932:1: rule__CaseBody__Group_1__0__Impl : ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__CaseBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5936:1: ( ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) ) )
            // InternalMGLang.g:5937:1: ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) )
            {
            // InternalMGLang.g:5937:1: ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) )
            // InternalMGLang.g:5938:2: ( rule__CaseBody__ExpressionsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_1_0()); 
            }
            // InternalMGLang.g:5939:2: ( rule__CaseBody__ExpressionsAssignment_1_0 )
            // InternalMGLang.g:5939:3: rule__CaseBody__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CaseBody__ExpressionsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_1__0__Impl"


    // $ANTLR start "rule__CaseBody__Group_1__1"
    // InternalMGLang.g:5947:1: rule__CaseBody__Group_1__1 : rule__CaseBody__Group_1__1__Impl ;
    public final void rule__CaseBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5951:1: ( rule__CaseBody__Group_1__1__Impl )
            // InternalMGLang.g:5952:2: rule__CaseBody__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_1__1"


    // $ANTLR start "rule__CaseBody__Group_1__1__Impl"
    // InternalMGLang.g:5958:1: rule__CaseBody__Group_1__1__Impl : ( RULE_NEWLINE ) ;
    public final void rule__CaseBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5962:1: ( ( RULE_NEWLINE ) )
            // InternalMGLang.g:5963:1: ( RULE_NEWLINE )
            {
            // InternalMGLang.g:5963:1: ( RULE_NEWLINE )
            // InternalMGLang.g:5964:2: RULE_NEWLINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getNEWLINETerminalRuleCall_1_1()); 
            }
            match(input,RULE_NEWLINE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getNEWLINETerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__Group_1__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalMGLang.g:5974:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5978:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalMGLang.g:5979:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__List__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__List__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // InternalMGLang.g:5986:1: rule__List__Group__0__Impl : ( 'List' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5990:1: ( ( 'List' ) )
            // InternalMGLang.g:5991:1: ( 'List' )
            {
            // InternalMGLang.g:5991:1: ( 'List' )
            // InternalMGLang.g:5992:2: 'List'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getListKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // InternalMGLang.g:6001:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6005:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalMGLang.g:6006:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__List__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__List__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // InternalMGLang.g:6013:1: rule__List__Group__1__Impl : ( ( rule__List__NameAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6017:1: ( ( ( rule__List__NameAssignment_1 ) ) )
            // InternalMGLang.g:6018:1: ( ( rule__List__NameAssignment_1 ) )
            {
            // InternalMGLang.g:6018:1: ( ( rule__List__NameAssignment_1 ) )
            // InternalMGLang.g:6019:2: ( rule__List__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:6020:2: ( rule__List__NameAssignment_1 )
            // InternalMGLang.g:6020:3: rule__List__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__List__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // InternalMGLang.g:6028:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6032:1: ( rule__List__Group__2__Impl )
            // InternalMGLang.g:6033:2: rule__List__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // InternalMGLang.g:6039:1: rule__List__Group__2__Impl : ( ( rule__List__Group_2__0 )? ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6043:1: ( ( ( rule__List__Group_2__0 )? ) )
            // InternalMGLang.g:6044:1: ( ( rule__List__Group_2__0 )? )
            {
            // InternalMGLang.g:6044:1: ( ( rule__List__Group_2__0 )? )
            // InternalMGLang.g:6045:2: ( rule__List__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup_2()); 
            }
            // InternalMGLang.g:6046:2: ( rule__List__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ASSIGNMENT_OP) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMGLang.g:6046:3: rule__List__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group_2__0"
    // InternalMGLang.g:6055:1: rule__List__Group_2__0 : rule__List__Group_2__0__Impl rule__List__Group_2__1 ;
    public final void rule__List__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6059:1: ( rule__List__Group_2__0__Impl rule__List__Group_2__1 )
            // InternalMGLang.g:6060:2: rule__List__Group_2__0__Impl rule__List__Group_2__1
            {
            pushFollow(FOLLOW_47);
            rule__List__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__List__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_2__0"


    // $ANTLR start "rule__List__Group_2__0__Impl"
    // InternalMGLang.g:6067:1: rule__List__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__List__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6071:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:6072:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:6072:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:6073:2: RULE_ASSIGNMENT_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getASSIGNMENT_OPTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getASSIGNMENT_OPTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_2__0__Impl"


    // $ANTLR start "rule__List__Group_2__1"
    // InternalMGLang.g:6082:1: rule__List__Group_2__1 : rule__List__Group_2__1__Impl ;
    public final void rule__List__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6086:1: ( rule__List__Group_2__1__Impl )
            // InternalMGLang.g:6087:2: rule__List__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_2__1"


    // $ANTLR start "rule__List__Group_2__1__Impl"
    // InternalMGLang.g:6093:1: rule__List__Group_2__1__Impl : ( ( rule__List__CreatedByAssignment_2_1 ) ) ;
    public final void rule__List__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6097:1: ( ( ( rule__List__CreatedByAssignment_2_1 ) ) )
            // InternalMGLang.g:6098:1: ( ( rule__List__CreatedByAssignment_2_1 ) )
            {
            // InternalMGLang.g:6098:1: ( ( rule__List__CreatedByAssignment_2_1 ) )
            // InternalMGLang.g:6099:2: ( rule__List__CreatedByAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getCreatedByAssignment_2_1()); 
            }
            // InternalMGLang.g:6100:2: ( rule__List__CreatedByAssignment_2_1 )
            // InternalMGLang.g:6100:3: rule__List__CreatedByAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__List__CreatedByAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getCreatedByAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_2__1__Impl"


    // $ANTLR start "rule__ListAdHoc__Group__0"
    // InternalMGLang.g:6109:1: rule__ListAdHoc__Group__0 : rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 ;
    public final void rule__ListAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6113:1: ( rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 )
            // InternalMGLang.g:6114:2: rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__ListAdHoc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group__0"


    // $ANTLR start "rule__ListAdHoc__Group__0__Impl"
    // InternalMGLang.g:6121:1: rule__ListAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__ListAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6125:1: ( ( '[' ) )
            // InternalMGLang.g:6126:1: ( '[' )
            {
            // InternalMGLang.g:6126:1: ( '[' )
            // InternalMGLang.g:6127:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group__0__Impl"


    // $ANTLR start "rule__ListAdHoc__Group__1"
    // InternalMGLang.g:6136:1: rule__ListAdHoc__Group__1 : rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 ;
    public final void rule__ListAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6140:1: ( rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 )
            // InternalMGLang.g:6141:2: rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__ListAdHoc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group__1"


    // $ANTLR start "rule__ListAdHoc__Group__1__Impl"
    // InternalMGLang.g:6148:1: rule__ListAdHoc__Group__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) ;
    public final void rule__ListAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6152:1: ( ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) )
            // InternalMGLang.g:6153:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            {
            // InternalMGLang.g:6153:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            // InternalMGLang.g:6154:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getElementsAssignment_1()); 
            }
            // InternalMGLang.g:6155:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            // InternalMGLang.g:6155:3: rule__ListAdHoc__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__ElementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getElementsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group__1__Impl"


    // $ANTLR start "rule__ListAdHoc__Group__2"
    // InternalMGLang.g:6163:1: rule__ListAdHoc__Group__2 : rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 ;
    public final void rule__ListAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6167:1: ( rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 )
            // InternalMGLang.g:6168:2: rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__ListAdHoc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group__2"


    // $ANTLR start "rule__ListAdHoc__Group__2__Impl"
    // InternalMGLang.g:6175:1: rule__ListAdHoc__Group__2__Impl : ( ( rule__ListAdHoc__Group_2__0 )* ) ;
    public final void rule__ListAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6179:1: ( ( ( rule__ListAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:6180:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:6180:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            // InternalMGLang.g:6181:2: ( rule__ListAdHoc__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getGroup_2()); 
            }
            // InternalMGLang.g:6182:2: ( rule__ListAdHoc__Group_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==45) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMGLang.g:6182:3: rule__ListAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ListAdHoc__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group__2__Impl"


    // $ANTLR start "rule__ListAdHoc__Group__3"
    // InternalMGLang.g:6190:1: rule__ListAdHoc__Group__3 : rule__ListAdHoc__Group__3__Impl ;
    public final void rule__ListAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6194:1: ( rule__ListAdHoc__Group__3__Impl )
            // InternalMGLang.g:6195:2: rule__ListAdHoc__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group__3"


    // $ANTLR start "rule__ListAdHoc__Group__3__Impl"
    // InternalMGLang.g:6201:1: rule__ListAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__ListAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6205:1: ( ( ']' ) )
            // InternalMGLang.g:6206:1: ( ']' )
            {
            // InternalMGLang.g:6206:1: ( ']' )
            // InternalMGLang.g:6207:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group__3__Impl"


    // $ANTLR start "rule__ListAdHoc__Group_2__0"
    // InternalMGLang.g:6217:1: rule__ListAdHoc__Group_2__0 : rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 ;
    public final void rule__ListAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6221:1: ( rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 )
            // InternalMGLang.g:6222:2: rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1
            {
            pushFollow(FOLLOW_48);
            rule__ListAdHoc__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group_2__0"


    // $ANTLR start "rule__ListAdHoc__Group_2__0__Impl"
    // InternalMGLang.g:6229:1: rule__ListAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6233:1: ( ( ',' ) )
            // InternalMGLang.g:6234:1: ( ',' )
            {
            // InternalMGLang.g:6234:1: ( ',' )
            // InternalMGLang.g:6235:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getCommaKeyword_2_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group_2__0__Impl"


    // $ANTLR start "rule__ListAdHoc__Group_2__1"
    // InternalMGLang.g:6244:1: rule__ListAdHoc__Group_2__1 : rule__ListAdHoc__Group_2__1__Impl ;
    public final void rule__ListAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6248:1: ( rule__ListAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:6249:2: rule__ListAdHoc__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group_2__1"


    // $ANTLR start "rule__ListAdHoc__Group_2__1__Impl"
    // InternalMGLang.g:6255:1: rule__ListAdHoc__Group_2__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) ;
    public final void rule__ListAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6259:1: ( ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) )
            // InternalMGLang.g:6260:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            {
            // InternalMGLang.g:6260:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            // InternalMGLang.g:6261:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getElementsAssignment_2_1()); 
            }
            // InternalMGLang.g:6262:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            // InternalMGLang.g:6262:3: rule__ListAdHoc__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__ElementsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getElementsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__Group_2__1__Impl"


    // $ANTLR start "rule__Map__Group__0"
    // InternalMGLang.g:6271:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6275:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalMGLang.g:6276:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Map__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Map__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__0"


    // $ANTLR start "rule__Map__Group__0__Impl"
    // InternalMGLang.g:6283:1: rule__Map__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6287:1: ( ( 'Map' ) )
            // InternalMGLang.g:6288:1: ( 'Map' )
            {
            // InternalMGLang.g:6288:1: ( 'Map' )
            // InternalMGLang.g:6289:2: 'Map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getMapKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getMapKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__0__Impl"


    // $ANTLR start "rule__Map__Group__1"
    // InternalMGLang.g:6298:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6302:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // InternalMGLang.g:6303:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Map__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Map__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__1"


    // $ANTLR start "rule__Map__Group__1__Impl"
    // InternalMGLang.g:6310:1: rule__Map__Group__1__Impl : ( ( rule__Map__NameAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6314:1: ( ( ( rule__Map__NameAssignment_1 ) ) )
            // InternalMGLang.g:6315:1: ( ( rule__Map__NameAssignment_1 ) )
            {
            // InternalMGLang.g:6315:1: ( ( rule__Map__NameAssignment_1 ) )
            // InternalMGLang.g:6316:2: ( rule__Map__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:6317:2: ( rule__Map__NameAssignment_1 )
            // InternalMGLang.g:6317:3: rule__Map__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Map__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__1__Impl"


    // $ANTLR start "rule__Map__Group__2"
    // InternalMGLang.g:6325:1: rule__Map__Group__2 : rule__Map__Group__2__Impl ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6329:1: ( rule__Map__Group__2__Impl )
            // InternalMGLang.g:6330:2: rule__Map__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__2"


    // $ANTLR start "rule__Map__Group__2__Impl"
    // InternalMGLang.g:6336:1: rule__Map__Group__2__Impl : ( ( rule__Map__Group_2__0 )? ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6340:1: ( ( ( rule__Map__Group_2__0 )? ) )
            // InternalMGLang.g:6341:1: ( ( rule__Map__Group_2__0 )? )
            {
            // InternalMGLang.g:6341:1: ( ( rule__Map__Group_2__0 )? )
            // InternalMGLang.g:6342:2: ( rule__Map__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getGroup_2()); 
            }
            // InternalMGLang.g:6343:2: ( rule__Map__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ASSIGNMENT_OP) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMGLang.g:6343:3: rule__Map__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Map__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__2__Impl"


    // $ANTLR start "rule__Map__Group_2__0"
    // InternalMGLang.g:6352:1: rule__Map__Group_2__0 : rule__Map__Group_2__0__Impl rule__Map__Group_2__1 ;
    public final void rule__Map__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6356:1: ( rule__Map__Group_2__0__Impl rule__Map__Group_2__1 )
            // InternalMGLang.g:6357:2: rule__Map__Group_2__0__Impl rule__Map__Group_2__1
            {
            pushFollow(FOLLOW_47);
            rule__Map__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Map__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group_2__0"


    // $ANTLR start "rule__Map__Group_2__0__Impl"
    // InternalMGLang.g:6364:1: rule__Map__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Map__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6368:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:6369:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:6369:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:6370:2: RULE_ASSIGNMENT_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getASSIGNMENT_OPTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getASSIGNMENT_OPTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group_2__0__Impl"


    // $ANTLR start "rule__Map__Group_2__1"
    // InternalMGLang.g:6379:1: rule__Map__Group_2__1 : rule__Map__Group_2__1__Impl ;
    public final void rule__Map__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6383:1: ( rule__Map__Group_2__1__Impl )
            // InternalMGLang.g:6384:2: rule__Map__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group_2__1"


    // $ANTLR start "rule__Map__Group_2__1__Impl"
    // InternalMGLang.g:6390:1: rule__Map__Group_2__1__Impl : ( ( rule__Map__CreatedByAssignment_2_1 ) ) ;
    public final void rule__Map__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6394:1: ( ( ( rule__Map__CreatedByAssignment_2_1 ) ) )
            // InternalMGLang.g:6395:1: ( ( rule__Map__CreatedByAssignment_2_1 ) )
            {
            // InternalMGLang.g:6395:1: ( ( rule__Map__CreatedByAssignment_2_1 ) )
            // InternalMGLang.g:6396:2: ( rule__Map__CreatedByAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getCreatedByAssignment_2_1()); 
            }
            // InternalMGLang.g:6397:2: ( rule__Map__CreatedByAssignment_2_1 )
            // InternalMGLang.g:6397:3: rule__Map__CreatedByAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Map__CreatedByAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getCreatedByAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group_2__1__Impl"


    // $ANTLR start "rule__MapAdHoc__Group__0"
    // InternalMGLang.g:6406:1: rule__MapAdHoc__Group__0 : rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 ;
    public final void rule__MapAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6410:1: ( rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 )
            // InternalMGLang.g:6411:2: rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MapAdHoc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group__0"


    // $ANTLR start "rule__MapAdHoc__Group__0__Impl"
    // InternalMGLang.g:6418:1: rule__MapAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__MapAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6422:1: ( ( '[' ) )
            // InternalMGLang.g:6423:1: ( '[' )
            {
            // InternalMGLang.g:6423:1: ( '[' )
            // InternalMGLang.g:6424:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group__0__Impl"


    // $ANTLR start "rule__MapAdHoc__Group__1"
    // InternalMGLang.g:6433:1: rule__MapAdHoc__Group__1 : rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 ;
    public final void rule__MapAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6437:1: ( rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 )
            // InternalMGLang.g:6438:2: rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__MapAdHoc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group__1"


    // $ANTLR start "rule__MapAdHoc__Group__1__Impl"
    // InternalMGLang.g:6445:1: rule__MapAdHoc__Group__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) ;
    public final void rule__MapAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6449:1: ( ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) )
            // InternalMGLang.g:6450:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            {
            // InternalMGLang.g:6450:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            // InternalMGLang.g:6451:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_1()); 
            }
            // InternalMGLang.g:6452:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            // InternalMGLang.g:6452:3: rule__MapAdHoc__EntriesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__EntriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getEntriesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group__1__Impl"


    // $ANTLR start "rule__MapAdHoc__Group__2"
    // InternalMGLang.g:6460:1: rule__MapAdHoc__Group__2 : rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 ;
    public final void rule__MapAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6464:1: ( rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 )
            // InternalMGLang.g:6465:2: rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__MapAdHoc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group__2"


    // $ANTLR start "rule__MapAdHoc__Group__2__Impl"
    // InternalMGLang.g:6472:1: rule__MapAdHoc__Group__2__Impl : ( ( rule__MapAdHoc__Group_2__0 )* ) ;
    public final void rule__MapAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6476:1: ( ( ( rule__MapAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:6477:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:6477:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            // InternalMGLang.g:6478:2: ( rule__MapAdHoc__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getGroup_2()); 
            }
            // InternalMGLang.g:6479:2: ( rule__MapAdHoc__Group_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==45) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalMGLang.g:6479:3: rule__MapAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MapAdHoc__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group__2__Impl"


    // $ANTLR start "rule__MapAdHoc__Group__3"
    // InternalMGLang.g:6487:1: rule__MapAdHoc__Group__3 : rule__MapAdHoc__Group__3__Impl ;
    public final void rule__MapAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6491:1: ( rule__MapAdHoc__Group__3__Impl )
            // InternalMGLang.g:6492:2: rule__MapAdHoc__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group__3"


    // $ANTLR start "rule__MapAdHoc__Group__3__Impl"
    // InternalMGLang.g:6498:1: rule__MapAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__MapAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6502:1: ( ( ']' ) )
            // InternalMGLang.g:6503:1: ( ']' )
            {
            // InternalMGLang.g:6503:1: ( ']' )
            // InternalMGLang.g:6504:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group__3__Impl"


    // $ANTLR start "rule__MapAdHoc__Group_2__0"
    // InternalMGLang.g:6514:1: rule__MapAdHoc__Group_2__0 : rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 ;
    public final void rule__MapAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6518:1: ( rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 )
            // InternalMGLang.g:6519:2: rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__MapAdHoc__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group_2__0"


    // $ANTLR start "rule__MapAdHoc__Group_2__0__Impl"
    // InternalMGLang.g:6526:1: rule__MapAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MapAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6530:1: ( ( ',' ) )
            // InternalMGLang.g:6531:1: ( ',' )
            {
            // InternalMGLang.g:6531:1: ( ',' )
            // InternalMGLang.g:6532:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getCommaKeyword_2_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group_2__0__Impl"


    // $ANTLR start "rule__MapAdHoc__Group_2__1"
    // InternalMGLang.g:6541:1: rule__MapAdHoc__Group_2__1 : rule__MapAdHoc__Group_2__1__Impl ;
    public final void rule__MapAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6545:1: ( rule__MapAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:6546:2: rule__MapAdHoc__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group_2__1"


    // $ANTLR start "rule__MapAdHoc__Group_2__1__Impl"
    // InternalMGLang.g:6552:1: rule__MapAdHoc__Group_2__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) ;
    public final void rule__MapAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6556:1: ( ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) )
            // InternalMGLang.g:6557:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            {
            // InternalMGLang.g:6557:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            // InternalMGLang.g:6558:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_2_1()); 
            }
            // InternalMGLang.g:6559:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            // InternalMGLang.g:6559:3: rule__MapAdHoc__EntriesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__EntriesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getEntriesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__Group_2__1__Impl"


    // $ANTLR start "rule__MapTupel__Group__0"
    // InternalMGLang.g:6568:1: rule__MapTupel__Group__0 : rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 ;
    public final void rule__MapTupel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6572:1: ( rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 )
            // InternalMGLang.g:6573:2: rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__MapTupel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__0"


    // $ANTLR start "rule__MapTupel__Group__0__Impl"
    // InternalMGLang.g:6580:1: rule__MapTupel__Group__0__Impl : ( '(' ) ;
    public final void rule__MapTupel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6584:1: ( ( '(' ) )
            // InternalMGLang.g:6585:1: ( '(' )
            {
            // InternalMGLang.g:6585:1: ( '(' )
            // InternalMGLang.g:6586:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__0__Impl"


    // $ANTLR start "rule__MapTupel__Group__1"
    // InternalMGLang.g:6595:1: rule__MapTupel__Group__1 : rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 ;
    public final void rule__MapTupel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6599:1: ( rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 )
            // InternalMGLang.g:6600:2: rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__MapTupel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__1"


    // $ANTLR start "rule__MapTupel__Group__1__Impl"
    // InternalMGLang.g:6607:1: rule__MapTupel__Group__1__Impl : ( ( rule__MapTupel__KeyAssignment_1 ) ) ;
    public final void rule__MapTupel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6611:1: ( ( ( rule__MapTupel__KeyAssignment_1 ) ) )
            // InternalMGLang.g:6612:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            {
            // InternalMGLang.g:6612:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            // InternalMGLang.g:6613:2: ( rule__MapTupel__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getKeyAssignment_1()); 
            }
            // InternalMGLang.g:6614:2: ( rule__MapTupel__KeyAssignment_1 )
            // InternalMGLang.g:6614:3: rule__MapTupel__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MapTupel__KeyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelAccess().getKeyAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__1__Impl"


    // $ANTLR start "rule__MapTupel__Group__2"
    // InternalMGLang.g:6622:1: rule__MapTupel__Group__2 : rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 ;
    public final void rule__MapTupel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6626:1: ( rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 )
            // InternalMGLang.g:6627:2: rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__MapTupel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__2"


    // $ANTLR start "rule__MapTupel__Group__2__Impl"
    // InternalMGLang.g:6634:1: rule__MapTupel__Group__2__Impl : ( ',' ) ;
    public final void rule__MapTupel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6638:1: ( ( ',' ) )
            // InternalMGLang.g:6639:1: ( ',' )
            {
            // InternalMGLang.g:6639:1: ( ',' )
            // InternalMGLang.g:6640:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getCommaKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelAccess().getCommaKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__2__Impl"


    // $ANTLR start "rule__MapTupel__Group__3"
    // InternalMGLang.g:6649:1: rule__MapTupel__Group__3 : rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 ;
    public final void rule__MapTupel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6653:1: ( rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 )
            // InternalMGLang.g:6654:2: rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__MapTupel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__3"


    // $ANTLR start "rule__MapTupel__Group__3__Impl"
    // InternalMGLang.g:6661:1: rule__MapTupel__Group__3__Impl : ( ( rule__MapTupel__ValueAssignment_3 ) ) ;
    public final void rule__MapTupel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6665:1: ( ( ( rule__MapTupel__ValueAssignment_3 ) ) )
            // InternalMGLang.g:6666:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            {
            // InternalMGLang.g:6666:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            // InternalMGLang.g:6667:2: ( rule__MapTupel__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getValueAssignment_3()); 
            }
            // InternalMGLang.g:6668:2: ( rule__MapTupel__ValueAssignment_3 )
            // InternalMGLang.g:6668:3: rule__MapTupel__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MapTupel__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__3__Impl"


    // $ANTLR start "rule__MapTupel__Group__4"
    // InternalMGLang.g:6676:1: rule__MapTupel__Group__4 : rule__MapTupel__Group__4__Impl ;
    public final void rule__MapTupel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6680:1: ( rule__MapTupel__Group__4__Impl )
            // InternalMGLang.g:6681:2: rule__MapTupel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__4"


    // $ANTLR start "rule__MapTupel__Group__4__Impl"
    // InternalMGLang.g:6687:1: rule__MapTupel__Group__4__Impl : ( ')' ) ;
    public final void rule__MapTupel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6691:1: ( ( ')' ) )
            // InternalMGLang.g:6692:1: ( ')' )
            {
            // InternalMGLang.g:6692:1: ( ')' )
            // InternalMGLang.g:6693:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__Group__4__Impl"


    // $ANTLR start "rule__ForRange__Group__0"
    // InternalMGLang.g:6703:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6707:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:6708:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ForRange__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForRange__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__0"


    // $ANTLR start "rule__ForRange__Group__0__Impl"
    // InternalMGLang.g:6715:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6719:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:6720:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:6720:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:6721:2: ( rule__ForRange__StartAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            }
            // InternalMGLang.g:6722:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:6722:3: rule__ForRange__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__StartAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__0__Impl"


    // $ANTLR start "rule__ForRange__Group__1"
    // InternalMGLang.g:6730:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6734:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:6735:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ForRange__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForRange__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__1"


    // $ANTLR start "rule__ForRange__Group__1__Impl"
    // InternalMGLang.g:6742:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6746:1: ( ( ':' ) )
            // InternalMGLang.g:6747:1: ( ':' )
            {
            // InternalMGLang.g:6747:1: ( ':' )
            // InternalMGLang.g:6748:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__1__Impl"


    // $ANTLR start "rule__ForRange__Group__2"
    // InternalMGLang.g:6757:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6761:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:6762:2: rule__ForRange__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__2"


    // $ANTLR start "rule__ForRange__Group__2__Impl"
    // InternalMGLang.g:6768:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6772:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:6773:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:6773:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:6774:2: ( rule__ForRange__EndAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            }
            // InternalMGLang.g:6775:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:6775:3: rule__ForRange__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__EndAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__Group__2__Impl"


    // $ANTLR start "rule__TertiaryExpression__Group__0"
    // InternalMGLang.g:6784:1: rule__TertiaryExpression__Group__0 : rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 ;
    public final void rule__TertiaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6788:1: ( rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 )
            // InternalMGLang.g:6789:2: rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__TertiaryExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group__0"


    // $ANTLR start "rule__TertiaryExpression__Group__0__Impl"
    // InternalMGLang.g:6796:1: rule__TertiaryExpression__Group__0__Impl : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6800:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:6801:1: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:6801:1: ( ruleSecondaryExpression )
            // InternalMGLang.g:6802:2: ruleSecondaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getSecondaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSecondaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionAccess().getSecondaryExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group__0__Impl"


    // $ANTLR start "rule__TertiaryExpression__Group__1"
    // InternalMGLang.g:6811:1: rule__TertiaryExpression__Group__1 : rule__TertiaryExpression__Group__1__Impl ;
    public final void rule__TertiaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6815:1: ( rule__TertiaryExpression__Group__1__Impl )
            // InternalMGLang.g:6816:2: rule__TertiaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group__1"


    // $ANTLR start "rule__TertiaryExpression__Group__1__Impl"
    // InternalMGLang.g:6822:1: rule__TertiaryExpression__Group__1__Impl : ( ( rule__TertiaryExpression__Group_1__0 )* ) ;
    public final void rule__TertiaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6826:1: ( ( ( rule__TertiaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:6827:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:6827:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            // InternalMGLang.g:6828:2: ( rule__TertiaryExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:6829:2: ( rule__TertiaryExpression__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=29 && LA52_0<=31)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMGLang.g:6829:3: rule__TertiaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__TertiaryExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group__1__Impl"


    // $ANTLR start "rule__TertiaryExpression__Group_1__0"
    // InternalMGLang.g:6838:1: rule__TertiaryExpression__Group_1__0 : rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 ;
    public final void rule__TertiaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6842:1: ( rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 )
            // InternalMGLang.g:6843:2: rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__TertiaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group_1__0"


    // $ANTLR start "rule__TertiaryExpression__Group_1__0__Impl"
    // InternalMGLang.g:6850:1: rule__TertiaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TertiaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6854:1: ( ( () ) )
            // InternalMGLang.g:6855:1: ( () )
            {
            // InternalMGLang.g:6855:1: ( () )
            // InternalMGLang.g:6856:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:6857:2: ()
            // InternalMGLang.g:6857:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TertiaryExpression__Group_1__1"
    // InternalMGLang.g:6865:1: rule__TertiaryExpression__Group_1__1 : rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 ;
    public final void rule__TertiaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6869:1: ( rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 )
            // InternalMGLang.g:6870:2: rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__TertiaryExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group_1__1"


    // $ANTLR start "rule__TertiaryExpression__Group_1__1__Impl"
    // InternalMGLang.g:6877:1: rule__TertiaryExpression__Group_1__1__Impl : ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__TertiaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6881:1: ( ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:6882:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:6882:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:6883:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:6884:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:6884:3: rule__TertiaryExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TertiaryExpression__Group_1__2"
    // InternalMGLang.g:6892:1: rule__TertiaryExpression__Group_1__2 : rule__TertiaryExpression__Group_1__2__Impl ;
    public final void rule__TertiaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6896:1: ( rule__TertiaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:6897:2: rule__TertiaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group_1__2"


    // $ANTLR start "rule__TertiaryExpression__Group_1__2__Impl"
    // InternalMGLang.g:6903:1: rule__TertiaryExpression__Group_1__2__Impl : ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__TertiaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6907:1: ( ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:6908:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:6908:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:6909:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:6910:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:6910:3: rule__TertiaryExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SecondaryExpression__Group__0"
    // InternalMGLang.g:6919:1: rule__SecondaryExpression__Group__0 : rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 ;
    public final void rule__SecondaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6923:1: ( rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 )
            // InternalMGLang.g:6924:2: rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__SecondaryExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group__0"


    // $ANTLR start "rule__SecondaryExpression__Group__0__Impl"
    // InternalMGLang.g:6931:1: rule__SecondaryExpression__Group__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6935:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:6936:1: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:6936:1: ( rulePrimaryExpr )
            // InternalMGLang.g:6937:2: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getPrimaryExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionAccess().getPrimaryExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group__0__Impl"


    // $ANTLR start "rule__SecondaryExpression__Group__1"
    // InternalMGLang.g:6946:1: rule__SecondaryExpression__Group__1 : rule__SecondaryExpression__Group__1__Impl ;
    public final void rule__SecondaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6950:1: ( rule__SecondaryExpression__Group__1__Impl )
            // InternalMGLang.g:6951:2: rule__SecondaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group__1"


    // $ANTLR start "rule__SecondaryExpression__Group__1__Impl"
    // InternalMGLang.g:6957:1: rule__SecondaryExpression__Group__1__Impl : ( ( rule__SecondaryExpression__Group_1__0 )* ) ;
    public final void rule__SecondaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6961:1: ( ( ( rule__SecondaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:6962:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:6962:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            // InternalMGLang.g:6963:2: ( rule__SecondaryExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:6964:2: ( rule__SecondaryExpression__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=32 && LA53_0<=33)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMGLang.g:6964:3: rule__SecondaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__SecondaryExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group__1__Impl"


    // $ANTLR start "rule__SecondaryExpression__Group_1__0"
    // InternalMGLang.g:6973:1: rule__SecondaryExpression__Group_1__0 : rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 ;
    public final void rule__SecondaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6977:1: ( rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 )
            // InternalMGLang.g:6978:2: rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_52);
            rule__SecondaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group_1__0"


    // $ANTLR start "rule__SecondaryExpression__Group_1__0__Impl"
    // InternalMGLang.g:6985:1: rule__SecondaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SecondaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6989:1: ( ( () ) )
            // InternalMGLang.g:6990:1: ( () )
            {
            // InternalMGLang.g:6990:1: ( () )
            // InternalMGLang.g:6991:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:6992:2: ()
            // InternalMGLang.g:6992:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SecondaryExpression__Group_1__1"
    // InternalMGLang.g:7000:1: rule__SecondaryExpression__Group_1__1 : rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 ;
    public final void rule__SecondaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7004:1: ( rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 )
            // InternalMGLang.g:7005:2: rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__SecondaryExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group_1__1"


    // $ANTLR start "rule__SecondaryExpression__Group_1__1__Impl"
    // InternalMGLang.g:7012:1: rule__SecondaryExpression__Group_1__1__Impl : ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__SecondaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7016:1: ( ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:7017:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:7017:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:7018:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:7019:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:7019:3: rule__SecondaryExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SecondaryExpression__Group_1__2"
    // InternalMGLang.g:7027:1: rule__SecondaryExpression__Group_1__2 : rule__SecondaryExpression__Group_1__2__Impl ;
    public final void rule__SecondaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7031:1: ( rule__SecondaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:7032:2: rule__SecondaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group_1__2"


    // $ANTLR start "rule__SecondaryExpression__Group_1__2__Impl"
    // InternalMGLang.g:7038:1: rule__SecondaryExpression__Group_1__2__Impl : ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SecondaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7042:1: ( ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7043:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7043:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:7044:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:7045:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:7045:3: rule__SecondaryExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group__0"
    // InternalMGLang.g:7054:1: rule__PrimaryExpr__Group__0 : rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 ;
    public final void rule__PrimaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7058:1: ( rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 )
            // InternalMGLang.g:7059:2: rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__PrimaryExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group__0"


    // $ANTLR start "rule__PrimaryExpr__Group__0__Impl"
    // InternalMGLang.g:7066:1: rule__PrimaryExpr__Group__0__Impl : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7070:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:7071:1: ( ruleRelationExpression )
            {
            // InternalMGLang.g:7071:1: ( ruleRelationExpression )
            // InternalMGLang.g:7072:2: ruleRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRelationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getRelationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group__1"
    // InternalMGLang.g:7081:1: rule__PrimaryExpr__Group__1 : rule__PrimaryExpr__Group__1__Impl ;
    public final void rule__PrimaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7085:1: ( rule__PrimaryExpr__Group__1__Impl )
            // InternalMGLang.g:7086:2: rule__PrimaryExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group__1"


    // $ANTLR start "rule__PrimaryExpr__Group__1__Impl"
    // InternalMGLang.g:7092:1: rule__PrimaryExpr__Group__1__Impl : ( ( rule__PrimaryExpr__Group_1__0 )* ) ;
    public final void rule__PrimaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7096:1: ( ( ( rule__PrimaryExpr__Group_1__0 )* ) )
            // InternalMGLang.g:7097:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            {
            // InternalMGLang.g:7097:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            // InternalMGLang.g:7098:2: ( rule__PrimaryExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
            }
            // InternalMGLang.g:7099:2: ( rule__PrimaryExpr__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=34 && LA54_0<=36)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMGLang.g:7099:3: rule__PrimaryExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__PrimaryExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1__0"
    // InternalMGLang.g:7108:1: rule__PrimaryExpr__Group_1__0 : rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 ;
    public final void rule__PrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7112:1: ( rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 )
            // InternalMGLang.g:7113:2: rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_54);
            rule__PrimaryExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__0"


    // $ANTLR start "rule__PrimaryExpr__Group_1__0__Impl"
    // InternalMGLang.g:7120:1: rule__PrimaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7124:1: ( ( () ) )
            // InternalMGLang.g:7125:1: ( () )
            {
            // InternalMGLang.g:7125:1: ( () )
            // InternalMGLang.g:7126:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:7127:2: ()
            // InternalMGLang.g:7127:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1__1"
    // InternalMGLang.g:7135:1: rule__PrimaryExpr__Group_1__1 : rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 ;
    public final void rule__PrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7139:1: ( rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 )
            // InternalMGLang.g:7140:2: rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__PrimaryExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__1"


    // $ANTLR start "rule__PrimaryExpr__Group_1__1__Impl"
    // InternalMGLang.g:7147:1: rule__PrimaryExpr__Group_1__1__Impl : ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7151:1: ( ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:7152:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:7152:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            // InternalMGLang.g:7153:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:7154:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            // InternalMGLang.g:7154:3: rule__PrimaryExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1__2"
    // InternalMGLang.g:7162:1: rule__PrimaryExpr__Group_1__2 : rule__PrimaryExpr__Group_1__2__Impl ;
    public final void rule__PrimaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7166:1: ( rule__PrimaryExpr__Group_1__2__Impl )
            // InternalMGLang.g:7167:2: rule__PrimaryExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__2"


    // $ANTLR start "rule__PrimaryExpr__Group_1__2__Impl"
    // InternalMGLang.g:7173:1: rule__PrimaryExpr__Group_1__2__Impl : ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7177:1: ( ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7178:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7178:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            // InternalMGLang.g:7179:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:7180:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            // InternalMGLang.g:7180:3: rule__PrimaryExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_1__2__Impl"


    // $ANTLR start "rule__RelationExpression__Group__0"
    // InternalMGLang.g:7189:1: rule__RelationExpression__Group__0 : rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 ;
    public final void rule__RelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7193:1: ( rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 )
            // InternalMGLang.g:7194:2: rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__RelationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__0"


    // $ANTLR start "rule__RelationExpression__Group__0__Impl"
    // InternalMGLang.g:7201:1: rule__RelationExpression__Group__0__Impl : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7205:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:7206:1: ( ruleBaseExpr )
            {
            // InternalMGLang.g:7206:1: ( ruleBaseExpr )
            // InternalMGLang.g:7207:2: ruleBaseExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getBaseExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionAccess().getBaseExprParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationExpression__Group__1"
    // InternalMGLang.g:7216:1: rule__RelationExpression__Group__1 : rule__RelationExpression__Group__1__Impl ;
    public final void rule__RelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7220:1: ( rule__RelationExpression__Group__1__Impl )
            // InternalMGLang.g:7221:2: rule__RelationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__1"


    // $ANTLR start "rule__RelationExpression__Group__1__Impl"
    // InternalMGLang.g:7227:1: rule__RelationExpression__Group__1__Impl : ( ( rule__RelationExpression__Group_1__0 )* ) ;
    public final void rule__RelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7231:1: ( ( ( rule__RelationExpression__Group_1__0 )* ) )
            // InternalMGLang.g:7232:1: ( ( rule__RelationExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:7232:1: ( ( rule__RelationExpression__Group_1__0 )* )
            // InternalMGLang.g:7233:2: ( rule__RelationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:7234:2: ( rule__RelationExpression__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=23 && LA55_0<=28)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMGLang.g:7234:3: rule__RelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__RelationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationExpression__Group_1__0"
    // InternalMGLang.g:7243:1: rule__RelationExpression__Group_1__0 : rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 ;
    public final void rule__RelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7247:1: ( rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 )
            // InternalMGLang.g:7248:2: rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_56);
            rule__RelationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group_1__0"


    // $ANTLR start "rule__RelationExpression__Group_1__0__Impl"
    // InternalMGLang.g:7255:1: rule__RelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7259:1: ( ( () ) )
            // InternalMGLang.g:7260:1: ( () )
            {
            // InternalMGLang.g:7260:1: ( () )
            // InternalMGLang.g:7261:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0()); 
            }
            // InternalMGLang.g:7262:2: ()
            // InternalMGLang.g:7262:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RelationExpression__Group_1__1"
    // InternalMGLang.g:7270:1: rule__RelationExpression__Group_1__1 : rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 ;
    public final void rule__RelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7274:1: ( rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 )
            // InternalMGLang.g:7275:2: rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__RelationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group_1__1"


    // $ANTLR start "rule__RelationExpression__Group_1__1__Impl"
    // InternalMGLang.g:7282:1: rule__RelationExpression__Group_1__1__Impl : ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) ;
    public final void rule__RelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7286:1: ( ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) )
            // InternalMGLang.g:7287:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            {
            // InternalMGLang.g:7287:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            // InternalMGLang.g:7288:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1_1()); 
            }
            // InternalMGLang.g:7289:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            // InternalMGLang.g:7289:3: rule__RelationExpression__RelationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__RelationAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RelationExpression__Group_1__2"
    // InternalMGLang.g:7297:1: rule__RelationExpression__Group_1__2 : rule__RelationExpression__Group_1__2__Impl ;
    public final void rule__RelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7301:1: ( rule__RelationExpression__Group_1__2__Impl )
            // InternalMGLang.g:7302:2: rule__RelationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group_1__2"


    // $ANTLR start "rule__RelationExpression__Group_1__2__Impl"
    // InternalMGLang.g:7308:1: rule__RelationExpression__Group_1__2__Impl : ( ( rule__RelationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__RelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7312:1: ( ( ( rule__RelationExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7313:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7313:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:7314:2: ( rule__RelationExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:7315:2: ( rule__RelationExpression__RightAssignment_1_2 )
            // InternalMGLang.g:7315:3: rule__RelationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__BaseExpr__Group_0__0"
    // InternalMGLang.g:7324:1: rule__BaseExpr__Group_0__0 : rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 ;
    public final void rule__BaseExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7328:1: ( rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 )
            // InternalMGLang.g:7329:2: rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__BaseExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_0__0"


    // $ANTLR start "rule__BaseExpr__Group_0__0__Impl"
    // InternalMGLang.g:7336:1: rule__BaseExpr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7340:1: ( ( '(' ) )
            // InternalMGLang.g:7341:1: ( '(' )
            {
            // InternalMGLang.g:7341:1: ( '(' )
            // InternalMGLang.g:7342:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_0__0__Impl"


    // $ANTLR start "rule__BaseExpr__Group_0__1"
    // InternalMGLang.g:7351:1: rule__BaseExpr__Group_0__1 : rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 ;
    public final void rule__BaseExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7355:1: ( rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 )
            // InternalMGLang.g:7356:2: rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__BaseExpr__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_0__1"


    // $ANTLR start "rule__BaseExpr__Group_0__1__Impl"
    // InternalMGLang.g:7363:1: rule__BaseExpr__Group_0__1__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7367:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7368:1: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7368:1: ( ruleArithmeticExpression )
            // InternalMGLang.g:7369:2: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getArithmeticExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getArithmeticExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_0__1__Impl"


    // $ANTLR start "rule__BaseExpr__Group_0__2"
    // InternalMGLang.g:7378:1: rule__BaseExpr__Group_0__2 : rule__BaseExpr__Group_0__2__Impl ;
    public final void rule__BaseExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7382:1: ( rule__BaseExpr__Group_0__2__Impl )
            // InternalMGLang.g:7383:2: rule__BaseExpr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_0__2"


    // $ANTLR start "rule__BaseExpr__Group_0__2__Impl"
    // InternalMGLang.g:7389:1: rule__BaseExpr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7393:1: ( ( ')' ) )
            // InternalMGLang.g:7394:1: ( ')' )
            {
            // InternalMGLang.g:7394:1: ( ')' )
            // InternalMGLang.g:7395:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_0__2__Impl"


    // $ANTLR start "rule__BaseExpr__Group_1__0"
    // InternalMGLang.g:7405:1: rule__BaseExpr__Group_1__0 : rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 ;
    public final void rule__BaseExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7409:1: ( rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 )
            // InternalMGLang.g:7410:2: rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1
            {
            pushFollow(FOLLOW_58);
            rule__BaseExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_1__0"


    // $ANTLR start "rule__BaseExpr__Group_1__0__Impl"
    // InternalMGLang.g:7417:1: rule__BaseExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7421:1: ( ( () ) )
            // InternalMGLang.g:7422:1: ( () )
            {
            // InternalMGLang.g:7422:1: ( () )
            // InternalMGLang.g:7423:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0()); 
            }
            // InternalMGLang.g:7424:2: ()
            // InternalMGLang.g:7424:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_1__0__Impl"


    // $ANTLR start "rule__BaseExpr__Group_1__1"
    // InternalMGLang.g:7432:1: rule__BaseExpr__Group_1__1 : rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 ;
    public final void rule__BaseExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7436:1: ( rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 )
            // InternalMGLang.g:7437:2: rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__BaseExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_1__1"


    // $ANTLR start "rule__BaseExpr__Group_1__1__Impl"
    // InternalMGLang.g:7444:1: rule__BaseExpr__Group_1__1__Impl : ( '!' ) ;
    public final void rule__BaseExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7448:1: ( ( '!' ) )
            // InternalMGLang.g:7449:1: ( '!' )
            {
            // InternalMGLang.g:7449:1: ( '!' )
            // InternalMGLang.g:7450:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_1__1__Impl"


    // $ANTLR start "rule__BaseExpr__Group_1__2"
    // InternalMGLang.g:7459:1: rule__BaseExpr__Group_1__2 : rule__BaseExpr__Group_1__2__Impl ;
    public final void rule__BaseExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7463:1: ( rule__BaseExpr__Group_1__2__Impl )
            // InternalMGLang.g:7464:2: rule__BaseExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_1__2"


    // $ANTLR start "rule__BaseExpr__Group_1__2__Impl"
    // InternalMGLang.g:7470:1: rule__BaseExpr__Group_1__2__Impl : ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__BaseExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7474:1: ( ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) )
            // InternalMGLang.g:7475:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            {
            // InternalMGLang.g:7475:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            // InternalMGLang.g:7476:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExprAssignment_1_2()); 
            }
            // InternalMGLang.g:7477:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            // InternalMGLang.g:7477:3: rule__BaseExpr__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__ExprAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getExprAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_1__2__Impl"


    // $ANTLR start "rule__BaseExpr__Group_2__0"
    // InternalMGLang.g:7486:1: rule__BaseExpr__Group_2__0 : rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 ;
    public final void rule__BaseExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7490:1: ( rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 )
            // InternalMGLang.g:7491:2: rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1
            {
            pushFollow(FOLLOW_59);
            rule__BaseExpr__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__0"


    // $ANTLR start "rule__BaseExpr__Group_2__0__Impl"
    // InternalMGLang.g:7498:1: rule__BaseExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7502:1: ( ( () ) )
            // InternalMGLang.g:7503:1: ( () )
            {
            // InternalMGLang.g:7503:1: ( () )
            // InternalMGLang.g:7504:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0()); 
            }
            // InternalMGLang.g:7505:2: ()
            // InternalMGLang.g:7505:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__0__Impl"


    // $ANTLR start "rule__BaseExpr__Group_2__1"
    // InternalMGLang.g:7513:1: rule__BaseExpr__Group_2__1 : rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 ;
    public final void rule__BaseExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7517:1: ( rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 )
            // InternalMGLang.g:7518:2: rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__BaseExpr__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__1"


    // $ANTLR start "rule__BaseExpr__Group_2__1__Impl"
    // InternalMGLang.g:7525:1: rule__BaseExpr__Group_2__1__Impl : ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) ;
    public final void rule__BaseExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7529:1: ( ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) )
            // InternalMGLang.g:7530:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            {
            // InternalMGLang.g:7530:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            // InternalMGLang.g:7531:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getFuncAssignment_2_1()); 
            }
            // InternalMGLang.g:7532:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            // InternalMGLang.g:7532:3: rule__BaseExpr__FuncAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__FuncAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getFuncAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__1__Impl"


    // $ANTLR start "rule__BaseExpr__Group_2__2"
    // InternalMGLang.g:7540:1: rule__BaseExpr__Group_2__2 : rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 ;
    public final void rule__BaseExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7544:1: ( rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 )
            // InternalMGLang.g:7545:2: rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3
            {
            pushFollow(FOLLOW_28);
            rule__BaseExpr__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__2"


    // $ANTLR start "rule__BaseExpr__Group_2__2__Impl"
    // InternalMGLang.g:7552:1: rule__BaseExpr__Group_2__2__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7556:1: ( ( '(' ) )
            // InternalMGLang.g:7557:1: ( '(' )
            {
            // InternalMGLang.g:7557:1: ( '(' )
            // InternalMGLang.g:7558:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__2__Impl"


    // $ANTLR start "rule__BaseExpr__Group_2__3"
    // InternalMGLang.g:7567:1: rule__BaseExpr__Group_2__3 : rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 ;
    public final void rule__BaseExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7571:1: ( rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 )
            // InternalMGLang.g:7572:2: rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4
            {
            pushFollow(FOLLOW_11);
            rule__BaseExpr__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__3"


    // $ANTLR start "rule__BaseExpr__Group_2__3__Impl"
    // InternalMGLang.g:7579:1: rule__BaseExpr__Group_2__3__Impl : ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) ;
    public final void rule__BaseExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7583:1: ( ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) )
            // InternalMGLang.g:7584:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            {
            // InternalMGLang.g:7584:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            // InternalMGLang.g:7585:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExprAssignment_2_3()); 
            }
            // InternalMGLang.g:7586:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            // InternalMGLang.g:7586:3: rule__BaseExpr__ExprAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__ExprAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getExprAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__3__Impl"


    // $ANTLR start "rule__BaseExpr__Group_2__4"
    // InternalMGLang.g:7594:1: rule__BaseExpr__Group_2__4 : rule__BaseExpr__Group_2__4__Impl ;
    public final void rule__BaseExpr__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7598:1: ( rule__BaseExpr__Group_2__4__Impl )
            // InternalMGLang.g:7599:2: rule__BaseExpr__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__4"


    // $ANTLR start "rule__BaseExpr__Group_2__4__Impl"
    // InternalMGLang.g:7605:1: rule__BaseExpr__Group_2__4__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7609:1: ( ( ')' ) )
            // InternalMGLang.g:7610:1: ( ')' )
            {
            // InternalMGLang.g:7610:1: ( ')' )
            // InternalMGLang.g:7611:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_2__4__Impl"


    // $ANTLR start "rule__Pattern__UnorderedGroup_4"
    // InternalMGLang.g:7621:1: rule__Pattern__UnorderedGroup_4 : ( rule__Pattern__UnorderedGroup_4__0 )? ;
    public final void rule__Pattern__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPatternAccess().getUnorderedGroup_4());
        	
        try {
            // InternalMGLang.g:7626:1: ( ( rule__Pattern__UnorderedGroup_4__0 )? )
            // InternalMGLang.g:7627:2: ( rule__Pattern__UnorderedGroup_4__0 )?
            {
            // InternalMGLang.g:7627:2: ( rule__Pattern__UnorderedGroup_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ( LA56_0 == 58 || LA56_0 == 61 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt56=1;
            }
            else if ( LA56_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMGLang.g:7627:2: rule__Pattern__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__UnorderedGroup_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__UnorderedGroup_4"


    // $ANTLR start "rule__Pattern__UnorderedGroup_4__Impl"
    // InternalMGLang.g:7635:1: rule__Pattern__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) ) ) ;
    public final void rule__Pattern__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMGLang.g:7640:1: ( ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) ) ) )
            // InternalMGLang.g:7641:3: ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) ) )
            {
            // InternalMGLang.g:7641:3: ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) ) )
            int alt61=4;
            int LA61_0 = input.LA(1);

            if ( ( LA61_0 == 58 || LA61_0 == 61 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                int LA61_2 = input.LA(2);

                if ( LA61_2 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                    alt61=3;
                }
                else if ( LA61_2 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;
                }
            }
            else if ( LA61_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt61=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalMGLang.g:7642:3: ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) )
                    {
                    // InternalMGLang.g:7642:3: ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) )
                    // InternalMGLang.g:7643:4: {...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalMGLang.g:7643:103: ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) )
                    // InternalMGLang.g:7644:5: ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalMGLang.g:7650:5: ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) )
                    // InternalMGLang.g:7651:6: ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* )
                    {
                    // InternalMGLang.g:7651:6: ( ( rule__Pattern__CollsAssignment_4_0 ) )
                    // InternalMGLang.g:7652:7: ( rule__Pattern__CollsAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }
                    // InternalMGLang.g:7653:7: ( rule__Pattern__CollsAssignment_4_0 )
                    // InternalMGLang.g:7653:8: rule__Pattern__CollsAssignment_4_0
                    {
                    pushFollow(FOLLOW_60);
                    rule__Pattern__CollsAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }

                    }

                    // InternalMGLang.g:7656:6: ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* )
                    // InternalMGLang.g:7657:7: ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }
                    // InternalMGLang.g:7658:7: ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==58) ) {
                            int LA57_1 = input.LA(2);

                            if ( (LA57_1==RULE_ID) ) {
                                int LA57_4 = input.LA(3);

                                if ( (synpred1_InternalMGLang()) ) {
                                    alt57=1;
                                }


                            }


                        }
                        else if ( (LA57_0==61) ) {
                            int LA57_2 = input.LA(2);

                            if ( (LA57_2==RULE_ID) ) {
                                int LA57_5 = input.LA(3);

                                if ( (synpred1_InternalMGLang()) ) {
                                    alt57=1;
                                }


                            }


                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalMGLang.g:7658:8: ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_60);
                    	    rule__Pattern__CollsAssignment_4_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:7664:3: ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) )
                    {
                    // InternalMGLang.g:7664:3: ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) )
                    // InternalMGLang.g:7665:4: {...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalMGLang.g:7665:103: ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) )
                    // InternalMGLang.g:7666:5: ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalMGLang.g:7672:5: ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) )
                    // InternalMGLang.g:7673:6: ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* )
                    {
                    // InternalMGLang.g:7673:6: ( ( rule__Pattern__NodesAssignment_4_1 ) )
                    // InternalMGLang.g:7674:7: ( rule__Pattern__NodesAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }
                    // InternalMGLang.g:7675:7: ( rule__Pattern__NodesAssignment_4_1 )
                    // InternalMGLang.g:7675:8: rule__Pattern__NodesAssignment_4_1
                    {
                    pushFollow(FOLLOW_61);
                    rule__Pattern__NodesAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }

                    }

                    // InternalMGLang.g:7678:6: ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* )
                    // InternalMGLang.g:7679:7: ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }
                    // InternalMGLang.g:7680:7: ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_ID) ) {
                            int LA58_2 = input.LA(2);

                            if ( (LA58_2==RULE_ID) ) {
                                int LA58_3 = input.LA(3);

                                if ( (synpred2_InternalMGLang()) ) {
                                    alt58=1;
                                }


                            }


                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalMGLang.g:7680:8: ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1
                    	    {
                    	    pushFollow(FOLLOW_61);
                    	    rule__Pattern__NodesAssignment_4_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:7686:3: ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) )
                    {
                    // InternalMGLang.g:7686:3: ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) )
                    // InternalMGLang.g:7687:4: {...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalMGLang.g:7687:103: ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) )
                    // InternalMGLang.g:7688:5: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalMGLang.g:7694:5: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) )
                    // InternalMGLang.g:7695:6: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* )
                    {
                    // InternalMGLang.g:7695:6: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) )
                    // InternalMGLang.g:7696:7: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }
                    // InternalMGLang.g:7697:7: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
                    // InternalMGLang.g:7697:8: rule__Pattern__ParamManipulationsAssignment_4_2
                    {
                    pushFollow(FOLLOW_61);
                    rule__Pattern__ParamManipulationsAssignment_4_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }

                    }

                    // InternalMGLang.g:7700:6: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* )
                    // InternalMGLang.g:7701:7: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }
                    // InternalMGLang.g:7702:7: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            int LA59_3 = input.LA(2);

                            if ( (synpred3_InternalMGLang()) ) {
                                alt59=1;
                            }


                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalMGLang.g:7702:8: ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2
                    	    {
                    	    pushFollow(FOLLOW_61);
                    	    rule__Pattern__ParamManipulationsAssignment_4_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:7708:3: ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) )
                    {
                    // InternalMGLang.g:7708:3: ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) )
                    // InternalMGLang.g:7709:4: {...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3)");
                    }
                    // InternalMGLang.g:7709:103: ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) )
                    // InternalMGLang.g:7710:5: ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3);
                    selected = true;
                    // InternalMGLang.g:7716:5: ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) )
                    // InternalMGLang.g:7717:6: ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* )
                    {
                    // InternalMGLang.g:7717:6: ( ( rule__Pattern__SwitchesAssignment_4_3 ) )
                    // InternalMGLang.g:7718:7: ( rule__Pattern__SwitchesAssignment_4_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getSwitchesAssignment_4_3()); 
                    }
                    // InternalMGLang.g:7719:7: ( rule__Pattern__SwitchesAssignment_4_3 )
                    // InternalMGLang.g:7719:8: rule__Pattern__SwitchesAssignment_4_3
                    {
                    pushFollow(FOLLOW_26);
                    rule__Pattern__SwitchesAssignment_4_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getSwitchesAssignment_4_3()); 
                    }

                    }

                    // InternalMGLang.g:7722:6: ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* )
                    // InternalMGLang.g:7723:7: ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getSwitchesAssignment_4_3()); 
                    }
                    // InternalMGLang.g:7724:7: ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==53) ) {
                            int LA60_4 = input.LA(2);

                            if ( (synpred4_InternalMGLang()) ) {
                                alt60=1;
                            }


                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalMGLang.g:7724:8: ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3
                    	    {
                    	    pushFollow(FOLLOW_26);
                    	    rule__Pattern__SwitchesAssignment_4_3();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getSwitchesAssignment_4_3()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPatternAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Pattern__UnorderedGroup_4__0"
    // InternalMGLang.g:7738:1: rule__Pattern__UnorderedGroup_4__0 : rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )? ;
    public final void rule__Pattern__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7742:1: ( rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )? )
            // InternalMGLang.g:7743:2: rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMGLang.g:7744:2: ( rule__Pattern__UnorderedGroup_4__1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ( LA62_0 == 58 || LA62_0 == 61 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt62=1;
            }
            else if ( LA62_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMGLang.g:7744:2: rule__Pattern__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__UnorderedGroup_4__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__UnorderedGroup_4__0"


    // $ANTLR start "rule__Pattern__UnorderedGroup_4__1"
    // InternalMGLang.g:7750:1: rule__Pattern__UnorderedGroup_4__1 : rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )? ;
    public final void rule__Pattern__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7754:1: ( rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )? )
            // InternalMGLang.g:7755:2: rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMGLang.g:7756:2: ( rule__Pattern__UnorderedGroup_4__2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ( LA63_0 == 58 || LA63_0 == 61 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt63=1;
            }
            else if ( LA63_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt63=1;
            }
            else if ( LA63_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMGLang.g:7756:2: rule__Pattern__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__UnorderedGroup_4__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__UnorderedGroup_4__1"


    // $ANTLR start "rule__Pattern__UnorderedGroup_4__2"
    // InternalMGLang.g:7762:1: rule__Pattern__UnorderedGroup_4__2 : rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__3 )? ;
    public final void rule__Pattern__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7766:1: ( rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__3 )? )
            // InternalMGLang.g:7767:2: rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMGLang.g:7768:2: ( rule__Pattern__UnorderedGroup_4__3 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ( LA64_0 == 58 || LA64_0 == 61 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt64=1;
            }
            else if ( LA64_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt64=1;
            }
            else if ( LA64_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMGLang.g:7768:2: rule__Pattern__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__UnorderedGroup_4__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__UnorderedGroup_4__2"


    // $ANTLR start "rule__Pattern__UnorderedGroup_4__3"
    // InternalMGLang.g:7774:1: rule__Pattern__UnorderedGroup_4__3 : rule__Pattern__UnorderedGroup_4__Impl ;
    public final void rule__Pattern__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7778:1: ( rule__Pattern__UnorderedGroup_4__Impl )
            // InternalMGLang.g:7779:2: rule__Pattern__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__UnorderedGroup_4__3"


    // $ANTLR start "rule__MofgenFile__ImportsAssignment_0"
    // InternalMGLang.g:7786:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7790:1: ( ( ruleImport ) )
            // InternalMGLang.g:7791:2: ( ruleImport )
            {
            // InternalMGLang.g:7791:2: ( ruleImport )
            // InternalMGLang.g:7792:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__ImportsAssignment_0"


    // $ANTLR start "rule__MofgenFile__ConfigAssignment_1"
    // InternalMGLang.g:7801:1: rule__MofgenFile__ConfigAssignment_1 : ( ruleConfig ) ;
    public final void rule__MofgenFile__ConfigAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7805:1: ( ( ruleConfig ) )
            // InternalMGLang.g:7806:2: ( ruleConfig )
            {
            // InternalMGLang.g:7806:2: ( ruleConfig )
            // InternalMGLang.g:7807:3: ruleConfig
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getConfigConfigParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfig();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getConfigConfigParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__ConfigAssignment_1"


    // $ANTLR start "rule__MofgenFile__PatternsAssignment_2_0"
    // InternalMGLang.g:7816:1: rule__MofgenFile__PatternsAssignment_2_0 : ( rulePattern ) ;
    public final void rule__MofgenFile__PatternsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7820:1: ( ( rulePattern ) )
            // InternalMGLang.g:7821:2: ( rulePattern )
            {
            // InternalMGLang.g:7821:2: ( rulePattern )
            // InternalMGLang.g:7822:3: rulePattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__PatternsAssignment_2_0"


    // $ANTLR start "rule__MofgenFile__GeneratorsAssignment_2_1"
    // InternalMGLang.g:7831:1: rule__MofgenFile__GeneratorsAssignment_2_1 : ( ruleGenerator ) ;
    public final void rule__MofgenFile__GeneratorsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7835:1: ( ( ruleGenerator ) )
            // InternalMGLang.g:7836:2: ( ruleGenerator )
            {
            // InternalMGLang.g:7836:2: ( ruleGenerator )
            // InternalMGLang.g:7837:3: ruleGenerator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__GeneratorsAssignment_2_1"


    // $ANTLR start "rule__Import__UriAssignment_1"
    // InternalMGLang.g:7846:1: rule__Import__UriAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__UriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7850:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:7851:2: ( RULE_STRING )
            {
            // InternalMGLang.g:7851:2: ( RULE_STRING )
            // InternalMGLang.g:7852:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getUriSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getUriSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__UriAssignment_1"


    // $ANTLR start "rule__Import__NameAssignment_3"
    // InternalMGLang.g:7861:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7865:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7866:2: ( RULE_ID )
            {
            // InternalMGLang.g:7866:2: ( RULE_ID )
            // InternalMGLang.g:7867:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_3"


    // $ANTLR start "rule__Config__ExpressionsAssignment_5"
    // InternalMGLang.g:7876:1: rule__Config__ExpressionsAssignment_5 : ( ruleConfigExpression ) ;
    public final void rule__Config__ExpressionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7880:1: ( ( ruleConfigExpression ) )
            // InternalMGLang.g:7881:2: ( ruleConfigExpression )
            {
            // InternalMGLang.g:7881:2: ( ruleConfigExpression )
            // InternalMGLang.g:7882:3: ruleConfigExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getExpressionsConfigExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getExpressionsConfigExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__ExpressionsAssignment_5"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // InternalMGLang.g:7891:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7895:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7896:2: ( RULE_ID )
            {
            // InternalMGLang.g:7896:2: ( RULE_ID )
            // InternalMGLang.g:7897:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_1"


    // $ANTLR start "rule__Pattern__ParametersAssignment_2_1_0"
    // InternalMGLang.g:7906:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7910:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7911:2: ( ruleParameter )
            {
            // InternalMGLang.g:7911:2: ( ruleParameter )
            // InternalMGLang.g:7912:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ParametersAssignment_2_1_0"


    // $ANTLR start "rule__Pattern__ParametersAssignment_2_1_1_1"
    // InternalMGLang.g:7921:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7925:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7926:2: ( ruleParameter )
            {
            // InternalMGLang.g:7926:2: ( ruleParameter )
            // InternalMGLang.g:7927:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ParametersAssignment_2_1_1_1"


    // $ANTLR start "rule__Pattern__CollsAssignment_4_0"
    // InternalMGLang.g:7936:1: rule__Pattern__CollsAssignment_4_0 : ( ruleCollection ) ;
    public final void rule__Pattern__CollsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7940:1: ( ( ruleCollection ) )
            // InternalMGLang.g:7941:2: ( ruleCollection )
            {
            // InternalMGLang.g:7941:2: ( ruleCollection )
            // InternalMGLang.g:7942:3: ruleCollection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getCollsCollectionParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getCollsCollectionParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__CollsAssignment_4_0"


    // $ANTLR start "rule__Pattern__NodesAssignment_4_1"
    // InternalMGLang.g:7951:1: rule__Pattern__NodesAssignment_4_1 : ( ruleNode ) ;
    public final void rule__Pattern__NodesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7955:1: ( ( ruleNode ) )
            // InternalMGLang.g:7956:2: ( ruleNode )
            {
            // InternalMGLang.g:7956:2: ( ruleNode )
            // InternalMGLang.g:7957:3: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNodesNodeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getNodesNodeParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NodesAssignment_4_1"


    // $ANTLR start "rule__Pattern__ParamManipulationsAssignment_4_2"
    // InternalMGLang.g:7966:1: rule__Pattern__ParamManipulationsAssignment_4_2 : ( ruleParamManipulation ) ;
    public final void rule__Pattern__ParamManipulationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7970:1: ( ( ruleParamManipulation ) )
            // InternalMGLang.g:7971:2: ( ruleParamManipulation )
            {
            // InternalMGLang.g:7971:2: ( ruleParamManipulation )
            // InternalMGLang.g:7972:3: ruleParamManipulation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParamManipulationsParamManipulationParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamManipulation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParamManipulationsParamManipulationParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ParamManipulationsAssignment_4_2"


    // $ANTLR start "rule__Pattern__SwitchesAssignment_4_3"
    // InternalMGLang.g:7981:1: rule__Pattern__SwitchesAssignment_4_3 : ( ruleSwitch ) ;
    public final void rule__Pattern__SwitchesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7985:1: ( ( ruleSwitch ) )
            // InternalMGLang.g:7986:2: ( ruleSwitch )
            {
            // InternalMGLang.g:7986:2: ( ruleSwitch )
            // InternalMGLang.g:7987:3: ruleSwitch
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getSwitchesSwitchParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getSwitchesSwitchParserRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__SwitchesAssignment_4_3"


    // $ANTLR start "rule__Pattern__ReturnAssignment_6"
    // InternalMGLang.g:7996:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8000:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:8001:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:8001:2: ( rulePatternReturn )
            // InternalMGLang.g:8002:3: rulePatternReturn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePatternReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ReturnAssignment_6"


    // $ANTLR start "rule__PatternReturn__ReturnValueAssignment_3_1"
    // InternalMGLang.g:8011:1: rule__PatternReturn__ReturnValueAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PatternReturn__ReturnValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8015:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8016:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8016:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8017:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 
            }
            // InternalMGLang.g:8018:3: ( RULE_ID )
            // InternalMGLang.g:8019:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnValueNodeIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getReturnValueNodeIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternReturn__ReturnValueAssignment_3_1"


    // $ANTLR start "rule__ParamManipulation__ParamAssignment_0"
    // InternalMGLang.g:8030:1: rule__ParamManipulation__ParamAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParamManipulation__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8034:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8035:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8035:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8036:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0()); 
            }
            // InternalMGLang.g:8037:3: ( RULE_ID )
            // InternalMGLang.g:8038:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getParamParameterNodeIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamManipulationAccess().getParamParameterNodeIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamManipulation__ParamAssignment_0"


    // $ANTLR start "rule__ParamManipulation__ContentAssignment_1"
    // InternalMGLang.g:8049:1: rule__ParamManipulation__ContentAssignment_1 : ( ruleNodeContent ) ;
    public final void rule__ParamManipulation__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8053:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:8054:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:8054:2: ( ruleNodeContent )
            // InternalMGLang.g:8055:3: ruleNodeContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getContentNodeContentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodeContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamManipulationAccess().getContentNodeContentParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamManipulation__ContentAssignment_1"


    // $ANTLR start "rule__Node__TypeAssignment_0"
    // InternalMGLang.g:8064:1: rule__Node__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8068:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8069:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8069:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8070:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            }
            // InternalMGLang.g:8071:3: ( RULE_ID )
            // InternalMGLang.g:8072:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTypeEClassIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getTypeEClassIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__TypeAssignment_0"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalMGLang.g:8083:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8087:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8088:2: ( RULE_ID )
            {
            // InternalMGLang.g:8088:2: ( RULE_ID )
            // InternalMGLang.g:8089:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__CreatedByAssignment_2_0"
    // InternalMGLang.g:8098:1: rule__Node__CreatedByAssignment_2_0 : ( ruleNodeContent ) ;
    public final void rule__Node__CreatedByAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8102:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:8103:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:8103:2: ( ruleNodeContent )
            // InternalMGLang.g:8104:3: ruleNodeContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodeContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__CreatedByAssignment_2_0"


    // $ANTLR start "rule__Node__CreatedByAssignment_2_1_1"
    // InternalMGLang.g:8113:1: rule__Node__CreatedByAssignment_2_1_1 : ( rulePatternCall ) ;
    public final void rule__Node__CreatedByAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8117:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:8118:2: ( rulePatternCall )
            {
            // InternalMGLang.g:8118:2: ( rulePatternCall )
            // InternalMGLang.g:8119:3: rulePatternCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePatternCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__CreatedByAssignment_2_1_1"


    // $ANTLR start "rule__NodeContent__RefsAssignsAssignment_2"
    // InternalMGLang.g:8128:1: rule__NodeContent__RefsAssignsAssignment_2 : ( ruleNodeReferenceOrAssignmentOrControlFlow ) ;
    public final void rule__NodeContent__RefsAssignsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8132:1: ( ( ruleNodeReferenceOrAssignmentOrControlFlow ) )
            // InternalMGLang.g:8133:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
            {
            // InternalMGLang.g:8133:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
            // InternalMGLang.g:8134:3: ruleNodeReferenceOrAssignmentOrControlFlow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentOrControlFlowParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodeReferenceOrAssignmentOrControlFlow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentOrControlFlowParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeContent__RefsAssignsAssignment_2"


    // $ANTLR start "rule__PatternCall__CalledAssignment_0"
    // InternalMGLang.g:8143:1: rule__PatternCall__CalledAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8147:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8148:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8148:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8149:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 
            }
            // InternalMGLang.g:8150:3: ( RULE_ID )
            // InternalMGLang.g:8151:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getCalledPatternIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getCalledPatternIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__CalledAssignment_0"


    // $ANTLR start "rule__PatternCall__ParamsAssignment_2_0"
    // InternalMGLang.g:8162:1: rule__PatternCall__ParamsAssignment_2_0 : ( ruleArithmeticExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8166:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8167:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8167:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8168:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__ParamsAssignment_2_0"


    // $ANTLR start "rule__PatternCall__ParamsAssignment_2_1_1"
    // InternalMGLang.g:8177:1: rule__PatternCall__ParamsAssignment_2_1_1 : ( ruleArithmeticExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8181:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8182:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8182:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8183:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__ParamsAssignment_2_1_1"


    // $ANTLR start "rule__PatternNodeReference__TypeAssignment_0"
    // InternalMGLang.g:8192:1: rule__PatternNodeReference__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8196:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8197:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8197:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8198:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 
            }
            // InternalMGLang.g:8199:3: ( RULE_ID )
            // InternalMGLang.g:8200:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__TypeAssignment_0"


    // $ANTLR start "rule__PatternNodeReference__TargetAssignment_2"
    // InternalMGLang.g:8211:1: rule__PatternNodeReference__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8215:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8216:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8216:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8217:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 
            }
            // InternalMGLang.g:8218:3: ( RULE_ID )
            // InternalMGLang.g:8219:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternNodeReference__TargetAssignment_2"


    // $ANTLR start "rule__Assignment__TargetAssignment_0"
    // InternalMGLang.g:8230:1: rule__Assignment__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8234:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8235:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8235:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8236:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 
            }
            // InternalMGLang.g:8237:3: ( RULE_ID )
            // InternalMGLang.g:8238:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetEAttributeIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getTargetEAttributeIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__TargetAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalMGLang.g:8249:1: rule__Assignment__ValueAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8253:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8254:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8254:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8255:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueArithmeticExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueArithmeticExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__PrimitiveParameter__TypeAssignment_0"
    // InternalMGLang.g:8264:1: rule__PrimitiveParameter__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8268:1: ( ( rulePrimitiveType ) )
            // InternalMGLang.g:8269:2: ( rulePrimitiveType )
            {
            // InternalMGLang.g:8269:2: ( rulePrimitiveType )
            // InternalMGLang.g:8270:3: rulePrimitiveType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveParameter__TypeAssignment_0"


    // $ANTLR start "rule__PrimitiveParameter__NameAssignment_1"
    // InternalMGLang.g:8279:1: rule__PrimitiveParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8283:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8284:2: ( RULE_ID )
            {
            // InternalMGLang.g:8284:2: ( RULE_ID )
            // InternalMGLang.g:8285:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveParameter__NameAssignment_1"


    // $ANTLR start "rule__ParameterNode__SrcModelAssignment_0_0"
    // InternalMGLang.g:8294:1: rule__ParameterNode__SrcModelAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterNode__SrcModelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8298:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8299:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8299:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8300:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getSrcModelImportCrossReference_0_0_0()); 
            }
            // InternalMGLang.g:8301:3: ( RULE_ID )
            // InternalMGLang.g:8302:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getSrcModelImportIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getSrcModelImportIDTerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getSrcModelImportCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__SrcModelAssignment_0_0"


    // $ANTLR start "rule__ParameterNode__TypeAssignment_1"
    // InternalMGLang.g:8313:1: rule__ParameterNode__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8317:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8318:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8318:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8319:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_1_0()); 
            }
            // InternalMGLang.g:8320:3: ( RULE_ID )
            // InternalMGLang.g:8321:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getTypeEClassifierIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getTypeEClassifierIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__TypeAssignment_1"


    // $ANTLR start "rule__ParameterNode__NameAssignment_2"
    // InternalMGLang.g:8332:1: rule__ParameterNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8336:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8337:2: ( RULE_ID )
            {
            // InternalMGLang.g:8337:2: ( RULE_ID )
            // InternalMGLang.g:8338:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__NameAssignment_2"


    // $ANTLR start "rule__RefOrCall__RefAssignment_0"
    // InternalMGLang.g:8347:1: rule__RefOrCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RefOrCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8351:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8352:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8352:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8353:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefRefTypeCrossReference_0_0()); 
            }
            // InternalMGLang.g:8354:3: ( RULE_ID )
            // InternalMGLang.g:8355:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefRefTypeIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getRefRefTypeIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getRefRefTypeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__RefAssignment_0"


    // $ANTLR start "rule__RefOrCall__RefAssignment_1_2"
    // InternalMGLang.g:8366:1: rule__RefOrCall__RefAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__RefOrCall__RefAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8370:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8371:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8371:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8372:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefETypedElementCrossReference_1_2_0()); 
            }
            // InternalMGLang.g:8373:3: ( RULE_ID )
            // InternalMGLang.g:8374:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefETypedElementIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getRefETypedElementIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getRefETypedElementCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__RefAssignment_1_2"


    // $ANTLR start "rule__RefOrCall__ParamsAssignment_1_3_1"
    // InternalMGLang.g:8385:1: rule__RefOrCall__ParamsAssignment_1_3_1 : ( ruleRefParams ) ;
    public final void rule__RefOrCall__ParamsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8389:1: ( ( ruleRefParams ) )
            // InternalMGLang.g:8390:2: ( ruleRefParams )
            {
            // InternalMGLang.g:8390:2: ( ruleRefParams )
            // InternalMGLang.g:8391:3: ruleRefParams
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getParamsRefParamsParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRefParams();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefOrCallAccess().getParamsRefParamsParserRuleCall_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__ParamsAssignment_1_3_1"


    // $ANTLR start "rule__RefParams__ParamsAssignment_0"
    // InternalMGLang.g:8400:1: rule__RefParams__ParamsAssignment_0 : ( ruleArithmeticExpression ) ;
    public final void rule__RefParams__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8404:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8405:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8405:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8406:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__ParamsAssignment_0"


    // $ANTLR start "rule__RefParams__ParamsAssignment_1_1"
    // InternalMGLang.g:8415:1: rule__RefParams__ParamsAssignment_1_1 : ( ruleArithmeticExpression ) ;
    public final void rule__RefParams__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8419:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8420:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8420:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8421:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefParams__ParamsAssignment_1_1"


    // $ANTLR start "rule__Generator__ParamsAssignment_3"
    // InternalMGLang.g:8430:1: rule__Generator__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__Generator__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8434:1: ( ( ruleParameter ) )
            // InternalMGLang.g:8435:2: ( ruleParameter )
            {
            // InternalMGLang.g:8435:2: ( ruleParameter )
            // InternalMGLang.g:8436:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getParamsParameterParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getParamsParameterParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__ParamsAssignment_3"


    // $ANTLR start "rule__Generator__CommandsAssignment_6"
    // InternalMGLang.g:8445:1: rule__Generator__CommandsAssignment_6 : ( ruleGeneratorExpression ) ;
    public final void rule__Generator__CommandsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8449:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8450:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8450:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8451:3: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommandsGeneratorExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getCommandsGeneratorExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__CommandsAssignment_6"


    // $ANTLR start "rule__PatternVariable__TypeAssignment_0"
    // InternalMGLang.g:8460:1: rule__PatternVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8464:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8465:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8465:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8466:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getTypePatternCrossReference_0_0()); 
            }
            // InternalMGLang.g:8467:3: ( RULE_ID )
            // InternalMGLang.g:8468:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getTypePatternIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getTypePatternIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getTypePatternCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__TypeAssignment_0"


    // $ANTLR start "rule__PatternVariable__NameAssignment_1"
    // InternalMGLang.g:8479:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8483:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8484:2: ( RULE_ID )
            {
            // InternalMGLang.g:8484:2: ( RULE_ID )
            // InternalMGLang.g:8485:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__NameAssignment_1"


    // $ANTLR start "rule__PatternVariable__PatternCallAssignment_3"
    // InternalMGLang.g:8494:1: rule__PatternVariable__PatternCallAssignment_3 : ( rulePatternCall ) ;
    public final void rule__PatternVariable__PatternCallAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8498:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:8499:2: ( rulePatternCall )
            {
            // InternalMGLang.g:8499:2: ( rulePatternCall )
            // InternalMGLang.g:8500:3: rulePatternCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternVariableAccess().getPatternCallPatternCallParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePatternCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternVariableAccess().getPatternCallPatternCallParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternVariable__PatternCallAssignment_3"


    // $ANTLR start "rule__ForStatement__HeadAssignment_1"
    // InternalMGLang.g:8509:1: rule__ForStatement__HeadAssignment_1 : ( ruleForHead ) ;
    public final void rule__ForStatement__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8513:1: ( ( ruleForHead ) )
            // InternalMGLang.g:8514:2: ( ruleForHead )
            {
            // InternalMGLang.g:8514:2: ( ruleForHead )
            // InternalMGLang.g:8515:3: ruleForHead
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getHeadForHeadParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForHead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getHeadForHeadParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__HeadAssignment_1"


    // $ANTLR start "rule__ForStatement__BodyAssignment_3"
    // InternalMGLang.g:8524:1: rule__ForStatement__BodyAssignment_3 : ( ruleForBody ) ;
    public final void rule__ForStatement__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8528:1: ( ( ruleForBody ) )
            // InternalMGLang.g:8529:2: ( ruleForBody )
            {
            // InternalMGLang.g:8529:2: ( ruleForBody )
            // InternalMGLang.g:8530:3: ruleForBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getBodyForBodyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getBodyForBodyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForStatement__BodyAssignment_3"


    // $ANTLR start "rule__GeneralForHead__IteratorVarAssignment_0"
    // InternalMGLang.g:8539:1: rule__GeneralForHead__IteratorVarAssignment_0 : ( RULE_ID ) ;
    public final void rule__GeneralForHead__IteratorVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8543:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8544:2: ( RULE_ID )
            {
            // InternalMGLang.g:8544:2: ( RULE_ID )
            // InternalMGLang.g:8545:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getIteratorVarIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralForHeadAccess().getIteratorVarIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralForHead__IteratorVarAssignment_0"


    // $ANTLR start "rule__GeneralForHead__RangeAssignment_2"
    // InternalMGLang.g:8554:1: rule__GeneralForHead__RangeAssignment_2 : ( ruleForRange ) ;
    public final void rule__GeneralForHead__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8558:1: ( ( ruleForRange ) )
            // InternalMGLang.g:8559:2: ( ruleForRange )
            {
            // InternalMGLang.g:8559:2: ( ruleForRange )
            // InternalMGLang.g:8560:3: ruleForRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getRangeForRangeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralForHeadAccess().getRangeForRangeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralForHead__RangeAssignment_2"


    // $ANTLR start "rule__ForEachHead__SrcAssignment_0"
    // InternalMGLang.g:8569:1: rule__ForEachHead__SrcAssignment_0 : ( ruleRefOrCall ) ;
    public final void rule__ForEachHead__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8573:1: ( ( ruleRefOrCall ) )
            // InternalMGLang.g:8574:2: ( ruleRefOrCall )
            {
            // InternalMGLang.g:8574:2: ( ruleRefOrCall )
            // InternalMGLang.g:8575:3: ruleRefOrCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getSrcRefOrCallParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRefOrCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getSrcRefOrCallParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__SrcAssignment_0"


    // $ANTLR start "rule__ForEachHead__ErefAssignment_2"
    // InternalMGLang.g:8584:1: rule__ForEachHead__ErefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachHead__ErefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8588:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8589:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8589:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8590:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getErefEReferenceCrossReference_2_0()); 
            }
            // InternalMGLang.g:8591:3: ( RULE_ID )
            // InternalMGLang.g:8592:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getErefEReferenceIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getErefEReferenceIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getErefEReferenceCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__ErefAssignment_2"


    // $ANTLR start "rule__ForEachHead__IteratorVarAssignment_4"
    // InternalMGLang.g:8603:1: rule__ForEachHead__IteratorVarAssignment_4 : ( RULE_ID ) ;
    public final void rule__ForEachHead__IteratorVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8607:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8608:2: ( RULE_ID )
            {
            // InternalMGLang.g:8608:2: ( RULE_ID )
            // InternalMGLang.g:8609:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getIteratorVarIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getIteratorVarIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__IteratorVarAssignment_4"


    // $ANTLR start "rule__ForBody__CommandsAssignment_1"
    // InternalMGLang.g:8618:1: rule__ForBody__CommandsAssignment_1 : ( ruleGeneratorExpression ) ;
    public final void rule__ForBody__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8622:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8623:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8623:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8624:3: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getCommandsGeneratorExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForBodyAccess().getCommandsGeneratorExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBody__CommandsAssignment_1"


    // $ANTLR start "rule__IfElseSwitch__CasesAssignment_2"
    // InternalMGLang.g:8633:1: rule__IfElseSwitch__CasesAssignment_2 : ( ruleIfElseCase ) ;
    public final void rule__IfElseSwitch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8637:1: ( ( ruleIfElseCase ) )
            // InternalMGLang.g:8638:2: ( ruleIfElseCase )
            {
            // InternalMGLang.g:8638:2: ( ruleIfElseCase )
            // InternalMGLang.g:8639:3: ruleIfElseCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getCasesIfElseCaseParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIfElseCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getCasesIfElseCaseParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__CasesAssignment_2"


    // $ANTLR start "rule__IfElseSwitch__DefaultAssignment_3"
    // InternalMGLang.g:8648:1: rule__IfElseSwitch__DefaultAssignment_3 : ( ruleDefault ) ;
    public final void rule__IfElseSwitch__DefaultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8652:1: ( ( ruleDefault ) )
            // InternalMGLang.g:8653:2: ( ruleDefault )
            {
            // InternalMGLang.g:8653:2: ( ruleDefault )
            // InternalMGLang.g:8654:3: ruleDefault
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getDefaultDefaultParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getDefaultDefaultParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseSwitch__DefaultAssignment_3"


    // $ANTLR start "rule__IfElseCase__ValAssignment_1"
    // InternalMGLang.g:8663:1: rule__IfElseCase__ValAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__IfElseCase__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8667:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8668:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8668:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8669:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getValArithmeticExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseCaseAccess().getValArithmeticExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__ValAssignment_1"


    // $ANTLR start "rule__IfElseCase__BodyAssignment_3"
    // InternalMGLang.g:8678:1: rule__IfElseCase__BodyAssignment_3 : ( ruleCaseBody ) ;
    public final void rule__IfElseCase__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8682:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8683:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8683:2: ( ruleCaseBody )
            // InternalMGLang.g:8684:3: ruleCaseBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getBodyCaseBodyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseCaseAccess().getBodyCaseBodyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElseCase__BodyAssignment_3"


    // $ANTLR start "rule__SwitchCase__AttributeAssignment_2"
    // InternalMGLang.g:8693:1: rule__SwitchCase__AttributeAssignment_2 : ( ruleRefOrCall ) ;
    public final void rule__SwitchCase__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8697:1: ( ( ruleRefOrCall ) )
            // InternalMGLang.g:8698:2: ( ruleRefOrCall )
            {
            // InternalMGLang.g:8698:2: ( ruleRefOrCall )
            // InternalMGLang.g:8699:3: ruleRefOrCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getAttributeRefOrCallParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRefOrCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getAttributeRefOrCallParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__AttributeAssignment_2"


    // $ANTLR start "rule__SwitchCase__CasesAssignment_5"
    // InternalMGLang.g:8708:1: rule__SwitchCase__CasesAssignment_5 : ( ruleCase ) ;
    public final void rule__SwitchCase__CasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8712:1: ( ( ruleCase ) )
            // InternalMGLang.g:8713:2: ( ruleCase )
            {
            // InternalMGLang.g:8713:2: ( ruleCase )
            // InternalMGLang.g:8714:3: ruleCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getCasesCaseParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getCasesCaseParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__CasesAssignment_5"


    // $ANTLR start "rule__SwitchCase__DefaultAssignment_6"
    // InternalMGLang.g:8723:1: rule__SwitchCase__DefaultAssignment_6 : ( ruleDefault ) ;
    public final void rule__SwitchCase__DefaultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8727:1: ( ( ruleDefault ) )
            // InternalMGLang.g:8728:2: ( ruleDefault )
            {
            // InternalMGLang.g:8728:2: ( ruleDefault )
            // InternalMGLang.g:8729:3: ruleDefault
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getDefaultDefaultParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getDefaultDefaultParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCase__DefaultAssignment_6"


    // $ANTLR start "rule__CaseWithCast__NodeAssignment_1"
    // InternalMGLang.g:8738:1: rule__CaseWithCast__NodeAssignment_1 : ( ruleNode ) ;
    public final void rule__CaseWithCast__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8742:1: ( ( ruleNode ) )
            // InternalMGLang.g:8743:2: ( ruleNode )
            {
            // InternalMGLang.g:8743:2: ( ruleNode )
            // InternalMGLang.g:8744:3: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getNodeNodeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getNodeNodeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__NodeAssignment_1"


    // $ANTLR start "rule__CaseWithCast__WhenAssignment_2_1"
    // InternalMGLang.g:8753:1: rule__CaseWithCast__WhenAssignment_2_1 : ( ruleArithmeticExpression ) ;
    public final void rule__CaseWithCast__WhenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8757:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8758:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8758:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8759:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getWhenArithmeticExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getWhenArithmeticExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__WhenAssignment_2_1"


    // $ANTLR start "rule__CaseWithCast__BodyAssignment_4"
    // InternalMGLang.g:8768:1: rule__CaseWithCast__BodyAssignment_4 : ( ruleCaseBody ) ;
    public final void rule__CaseWithCast__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8772:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8773:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8773:2: ( ruleCaseBody )
            // InternalMGLang.g:8774:3: ruleCaseBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithCastAccess().getBodyCaseBodyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithCastAccess().getBodyCaseBodyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithCast__BodyAssignment_4"


    // $ANTLR start "rule__CaseWithoutCast__ValAssignment_1"
    // InternalMGLang.g:8783:1: rule__CaseWithoutCast__ValAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__CaseWithoutCast__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8787:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8788:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8788:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8789:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithoutCastAccess().getValArithmeticExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithoutCastAccess().getValArithmeticExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__ValAssignment_1"


    // $ANTLR start "rule__CaseWithoutCast__BodyAssignment_3"
    // InternalMGLang.g:8798:1: rule__CaseWithoutCast__BodyAssignment_3 : ( ruleCaseBody ) ;
    public final void rule__CaseWithoutCast__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8802:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8803:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8803:2: ( ruleCaseBody )
            // InternalMGLang.g:8804:3: ruleCaseBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseWithoutCastAccess().getBodyCaseBodyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseWithoutCastAccess().getBodyCaseBodyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseWithoutCast__BodyAssignment_3"


    // $ANTLR start "rule__CaseBody__ExpressionsAssignment_0_2"
    // InternalMGLang.g:8813:1: rule__CaseBody__ExpressionsAssignment_0_2 : ( ruleSwitchExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8817:1: ( ( ruleSwitchExpression ) )
            // InternalMGLang.g:8818:2: ( ruleSwitchExpression )
            {
            // InternalMGLang.g:8818:2: ( ruleSwitchExpression )
            // InternalMGLang.g:8819:3: ruleSwitchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__ExpressionsAssignment_0_2"


    // $ANTLR start "rule__CaseBody__ExpressionsAssignment_1_0"
    // InternalMGLang.g:8828:1: rule__CaseBody__ExpressionsAssignment_1_0 : ( ruleSwitchExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8832:1: ( ( ruleSwitchExpression ) )
            // InternalMGLang.g:8833:2: ( ruleSwitchExpression )
            {
            // InternalMGLang.g:8833:2: ( ruleSwitchExpression )
            // InternalMGLang.g:8834:3: ruleSwitchExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__ExpressionsAssignment_1_0"


    // $ANTLR start "rule__List__NameAssignment_1"
    // InternalMGLang.g:8843:1: rule__List__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8847:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8848:2: ( RULE_ID )
            {
            // InternalMGLang.g:8848:2: ( RULE_ID )
            // InternalMGLang.g:8849:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__NameAssignment_1"


    // $ANTLR start "rule__List__CreatedByAssignment_2_1"
    // InternalMGLang.g:8858:1: rule__List__CreatedByAssignment_2_1 : ( ruleListAssignment ) ;
    public final void rule__List__CreatedByAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8862:1: ( ( ruleListAssignment ) )
            // InternalMGLang.g:8863:2: ( ruleListAssignment )
            {
            // InternalMGLang.g:8863:2: ( ruleListAssignment )
            // InternalMGLang.g:8864:3: ruleListAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getCreatedByListAssignmentParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getCreatedByListAssignmentParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__CreatedByAssignment_2_1"


    // $ANTLR start "rule__ListAdHoc__ElementsAssignment_1"
    // InternalMGLang.g:8873:1: rule__ListAdHoc__ElementsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ListAdHoc__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8877:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8878:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8878:2: ( ruleLiteral )
            // InternalMGLang.g:8879:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__ElementsAssignment_1"


    // $ANTLR start "rule__ListAdHoc__ElementsAssignment_2_1"
    // InternalMGLang.g:8888:1: rule__ListAdHoc__ElementsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ListAdHoc__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8892:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8893:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8893:2: ( ruleLiteral )
            // InternalMGLang.g:8894:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAdHoc__ElementsAssignment_2_1"


    // $ANTLR start "rule__Map__NameAssignment_1"
    // InternalMGLang.g:8903:1: rule__Map__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Map__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8907:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8908:2: ( RULE_ID )
            {
            // InternalMGLang.g:8908:2: ( RULE_ID )
            // InternalMGLang.g:8909:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__NameAssignment_1"


    // $ANTLR start "rule__Map__CreatedByAssignment_2_1"
    // InternalMGLang.g:8918:1: rule__Map__CreatedByAssignment_2_1 : ( ruleMapAssignment ) ;
    public final void rule__Map__CreatedByAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8922:1: ( ( ruleMapAssignment ) )
            // InternalMGLang.g:8923:2: ( ruleMapAssignment )
            {
            // InternalMGLang.g:8923:2: ( ruleMapAssignment )
            // InternalMGLang.g:8924:3: ruleMapAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getCreatedByMapAssignmentParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getCreatedByMapAssignmentParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__CreatedByAssignment_2_1"


    // $ANTLR start "rule__MapAdHoc__EntriesAssignment_1"
    // InternalMGLang.g:8933:1: rule__MapAdHoc__EntriesAssignment_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8937:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:8938:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:8938:2: ( ruleMapTupel )
            // InternalMGLang.g:8939:3: ruleMapTupel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapTupel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__EntriesAssignment_1"


    // $ANTLR start "rule__MapAdHoc__EntriesAssignment_2_1"
    // InternalMGLang.g:8948:1: rule__MapAdHoc__EntriesAssignment_2_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8952:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:8953:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:8953:2: ( ruleMapTupel )
            // InternalMGLang.g:8954:3: ruleMapTupel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapTupel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapAdHoc__EntriesAssignment_2_1"


    // $ANTLR start "rule__MapTupel__KeyAssignment_1"
    // InternalMGLang.g:8963:1: rule__MapTupel__KeyAssignment_1 : ( ruleLiteral ) ;
    public final void rule__MapTupel__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8967:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8968:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8968:2: ( ruleLiteral )
            // InternalMGLang.g:8969:3: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getKeyLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelAccess().getKeyLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__KeyAssignment_1"


    // $ANTLR start "rule__MapTupel__ValueAssignment_3"
    // InternalMGLang.g:8978:1: rule__MapTupel__ValueAssignment_3 : ( ruleArithmeticExpression ) ;
    public final void rule__MapTupel__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8982:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8983:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8983:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8984:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getValueArithmeticExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTupelAccess().getValueArithmeticExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapTupel__ValueAssignment_3"


    // $ANTLR start "rule__ForRange__StartAssignment_0"
    // InternalMGLang.g:8993:1: rule__ForRange__StartAssignment_0 : ( ruleArithmeticExpression ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8997:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8998:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8998:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8999:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getStartArithmeticExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeAccess().getStartArithmeticExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__StartAssignment_0"


    // $ANTLR start "rule__ForRange__EndAssignment_2"
    // InternalMGLang.g:9008:1: rule__ForRange__EndAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9012:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9013:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9013:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9014:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getEndArithmeticExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeAccess().getEndArithmeticExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForRange__EndAssignment_2"


    // $ANTLR start "rule__TertiaryExpression__OpAssignment_1_1"
    // InternalMGLang.g:9023:1: rule__TertiaryExpression__OpAssignment_1_1 : ( ruleTertiaryOp ) ;
    public final void rule__TertiaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9027:1: ( ( ruleTertiaryOp ) )
            // InternalMGLang.g:9028:2: ( ruleTertiaryOp )
            {
            // InternalMGLang.g:9028:2: ( ruleTertiaryOp )
            // InternalMGLang.g:9029:3: ruleTertiaryOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getOpTertiaryOpEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTertiaryOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionAccess().getOpTertiaryOpEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__OpAssignment_1_1"


    // $ANTLR start "rule__TertiaryExpression__RightAssignment_1_2"
    // InternalMGLang.g:9038:1: rule__TertiaryExpression__RightAssignment_1_2 : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9042:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:9043:2: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:9043:2: ( ruleSecondaryExpression )
            // InternalMGLang.g:9044:3: ruleSecondaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getRightSecondaryExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSecondaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTertiaryExpressionAccess().getRightSecondaryExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TertiaryExpression__RightAssignment_1_2"


    // $ANTLR start "rule__SecondaryExpression__OpAssignment_1_1"
    // InternalMGLang.g:9053:1: rule__SecondaryExpression__OpAssignment_1_1 : ( ruleSecondaryOp ) ;
    public final void rule__SecondaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9057:1: ( ( ruleSecondaryOp ) )
            // InternalMGLang.g:9058:2: ( ruleSecondaryOp )
            {
            // InternalMGLang.g:9058:2: ( ruleSecondaryOp )
            // InternalMGLang.g:9059:3: ruleSecondaryOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getOpSecondaryOpEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSecondaryOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionAccess().getOpSecondaryOpEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__OpAssignment_1_1"


    // $ANTLR start "rule__SecondaryExpression__RightAssignment_1_2"
    // InternalMGLang.g:9068:1: rule__SecondaryExpression__RightAssignment_1_2 : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9072:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:9073:2: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:9073:2: ( rulePrimaryExpr )
            // InternalMGLang.g:9074:3: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryExpressionAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryExpression__RightAssignment_1_2"


    // $ANTLR start "rule__PrimaryExpr__OpAssignment_1_1"
    // InternalMGLang.g:9083:1: rule__PrimaryExpr__OpAssignment_1_1 : ( rulePrimaryOp ) ;
    public final void rule__PrimaryExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9087:1: ( ( rulePrimaryOp ) )
            // InternalMGLang.g:9088:2: ( rulePrimaryOp )
            {
            // InternalMGLang.g:9088:2: ( rulePrimaryOp )
            // InternalMGLang.g:9089:3: rulePrimaryOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getOpPrimaryOpEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getOpPrimaryOpEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__OpAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpr__RightAssignment_1_2"
    // InternalMGLang.g:9098:1: rule__PrimaryExpr__RightAssignment_1_2 : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9102:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:9103:2: ( ruleRelationExpression )
            {
            // InternalMGLang.g:9103:2: ( ruleRelationExpression )
            // InternalMGLang.g:9104:3: ruleRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightRelationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getRightRelationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__RightAssignment_1_2"


    // $ANTLR start "rule__RelationExpression__RelationAssignment_1_1"
    // InternalMGLang.g:9113:1: rule__RelationExpression__RelationAssignment_1_1 : ( ruleRelationalOp ) ;
    public final void rule__RelationExpression__RelationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9117:1: ( ( ruleRelationalOp ) )
            // InternalMGLang.g:9118:2: ( ruleRelationalOp )
            {
            // InternalMGLang.g:9118:2: ( ruleRelationalOp )
            // InternalMGLang.g:9119:3: ruleRelationalOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__RelationAssignment_1_1"


    // $ANTLR start "rule__RelationExpression__RightAssignment_1_2"
    // InternalMGLang.g:9128:1: rule__RelationExpression__RightAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9132:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:9133:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:9133:2: ( ruleBaseExpr )
            // InternalMGLang.g:9134:3: ruleBaseExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRightBaseExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationExpressionAccess().getRightBaseExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationExpression__RightAssignment_1_2"


    // $ANTLR start "rule__BaseExpr__ExprAssignment_1_2"
    // InternalMGLang.g:9143:1: rule__BaseExpr__ExprAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__BaseExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9147:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:9148:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:9148:2: ( ruleBaseExpr )
            // InternalMGLang.g:9149:3: ruleBaseExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExprBaseExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getExprBaseExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__ExprAssignment_1_2"


    // $ANTLR start "rule__BaseExpr__FuncAssignment_2_1"
    // InternalMGLang.g:9158:1: rule__BaseExpr__FuncAssignment_2_1 : ( ruleMathFunc ) ;
    public final void rule__BaseExpr__FuncAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9162:1: ( ( ruleMathFunc ) )
            // InternalMGLang.g:9163:2: ( ruleMathFunc )
            {
            // InternalMGLang.g:9163:2: ( ruleMathFunc )
            // InternalMGLang.g:9164:3: ruleMathFunc
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getFuncMathFuncEnumRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMathFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getFuncMathFuncEnumRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__FuncAssignment_2_1"


    // $ANTLR start "rule__BaseExpr__ExprAssignment_2_3"
    // InternalMGLang.g:9173:1: rule__BaseExpr__ExprAssignment_2_3 : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__ExprAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9177:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9178:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9178:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9179:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExprArithmeticExpressionParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getExprArithmeticExpressionParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__ExprAssignment_2_3"


    // $ANTLR start "rule__BooleanLiteral__ValAssignment"
    // InternalMGLang.g:9188:1: rule__BooleanLiteral__ValAssignment : ( ( rule__BooleanLiteral__ValAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9192:1: ( ( ( rule__BooleanLiteral__ValAlternatives_0 ) ) )
            // InternalMGLang.g:9193:2: ( ( rule__BooleanLiteral__ValAlternatives_0 ) )
            {
            // InternalMGLang.g:9193:2: ( ( rule__BooleanLiteral__ValAlternatives_0 ) )
            // InternalMGLang.g:9194:3: ( rule__BooleanLiteral__ValAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValAlternatives_0()); 
            }
            // InternalMGLang.g:9195:3: ( rule__BooleanLiteral__ValAlternatives_0 )
            // InternalMGLang.g:9195:4: rule__BooleanLiteral__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValAssignment"


    // $ANTLR start "rule__StringLiteral__ValAssignment"
    // InternalMGLang.g:9203:1: rule__StringLiteral__ValAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9207:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:9208:2: ( RULE_STRING )
            {
            // InternalMGLang.g:9208:2: ( RULE_STRING )
            // InternalMGLang.g:9209:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValAssignment"


    // $ANTLR start "rule__NumberLiteral__ValAssignment"
    // InternalMGLang.g:9218:1: rule__NumberLiteral__ValAssignment : ( RULE_DOUBLE ) ;
    public final void rule__NumberLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9222:1: ( ( RULE_DOUBLE ) )
            // InternalMGLang.g:9223:2: ( RULE_DOUBLE )
            {
            // InternalMGLang.g:9223:2: ( RULE_DOUBLE )
            // InternalMGLang.g:9224:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValDOUBLETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValAssignment"

    // $ANTLR start synpred1_InternalMGLang
    public final void synpred1_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7658:8: ( rule__Pattern__CollsAssignment_4_0 )
        // InternalMGLang.g:7658:9: rule__Pattern__CollsAssignment_4_0
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__CollsAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMGLang

    // $ANTLR start synpred2_InternalMGLang
    public final void synpred2_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7680:8: ( rule__Pattern__NodesAssignment_4_1 )
        // InternalMGLang.g:7680:9: rule__Pattern__NodesAssignment_4_1
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__NodesAssignment_4_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMGLang

    // $ANTLR start synpred3_InternalMGLang
    public final void synpred3_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7702:8: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
        // InternalMGLang.g:7702:9: rule__Pattern__ParamManipulationsAssignment_4_2
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__ParamManipulationsAssignment_4_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMGLang

    // $ANTLR start synpred4_InternalMGLang
    public final void synpred4_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7724:8: ( rule__Pattern__SwitchesAssignment_4_3 )
        // InternalMGLang.g:7724:9: rule__Pattern__SwitchesAssignment_4_3
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__SwitchesAssignment_4_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMGLang

    // Delegated rules

    public final boolean synpred1_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0004100000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0004100000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2420000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000780200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000780200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2420080000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x2420000000000202L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4000030000060730L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4000010000060730L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000780202L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2428080000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2428000000000202L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2428000000000200L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2428040000000200L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x24280C0000000200L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2428040000000202L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4800010000060730L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000530L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2400000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000202L});

}
