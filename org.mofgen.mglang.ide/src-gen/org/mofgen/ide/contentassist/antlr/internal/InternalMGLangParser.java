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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TRUE", "RULE_FALSE", "RULE_ASSIGNMENT_OP", "RULE_NEWLINE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sqrt'", "'abs'", "'int'", "'char'", "'double'", "'String'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'+'", "'-'", "'||'", "'%'", "'^'", "'*'", "'/'", "'&&'", "'import'", "'as'", "'pattern'", "'{'", "'}'", "'('", "')'", "','", "'return'", "'this'", "'.'", "'->'", "'gen'", "'for'", "'in'", "'switch'", "'case'", "':'", "'default'", "'when'", "'List'", "'['", "']'", "'Map'", "'!'"
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
    public static final int RULE_ID=10;
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
    public static final int RULE_FALSE=6;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=8;
    public static final int RULE_STRING=4;
    public static final int RULE_ASSIGNMENT_OP=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_TRUE=5;
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


    // $ANTLR start "entryRulePattern"
    // InternalMGLang.g:103:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMGLang.g:104:1: ( rulePattern EOF )
            // InternalMGLang.g:105:1: rulePattern EOF
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
    // InternalMGLang.g:112:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:116:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalMGLang.g:117:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalMGLang.g:117:2: ( ( rule__Pattern__Group__0 ) )
            // InternalMGLang.g:118:3: ( rule__Pattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup()); 
            }
            // InternalMGLang.g:119:3: ( rule__Pattern__Group__0 )
            // InternalMGLang.g:119:4: rule__Pattern__Group__0
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
    // InternalMGLang.g:128:1: entryRulePatternReturn : rulePatternReturn EOF ;
    public final void entryRulePatternReturn() throws RecognitionException {
        try {
            // InternalMGLang.g:129:1: ( rulePatternReturn EOF )
            // InternalMGLang.g:130:1: rulePatternReturn EOF
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
    // InternalMGLang.g:137:1: rulePatternReturn : ( ( rule__PatternReturn__Group__0 ) ) ;
    public final void rulePatternReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:141:2: ( ( ( rule__PatternReturn__Group__0 ) ) )
            // InternalMGLang.g:142:2: ( ( rule__PatternReturn__Group__0 ) )
            {
            // InternalMGLang.g:142:2: ( ( rule__PatternReturn__Group__0 ) )
            // InternalMGLang.g:143:3: ( rule__PatternReturn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getGroup()); 
            }
            // InternalMGLang.g:144:3: ( rule__PatternReturn__Group__0 )
            // InternalMGLang.g:144:4: rule__PatternReturn__Group__0
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
    // InternalMGLang.g:153:1: entryRuleParamManipulation : ruleParamManipulation EOF ;
    public final void entryRuleParamManipulation() throws RecognitionException {
        try {
            // InternalMGLang.g:154:1: ( ruleParamManipulation EOF )
            // InternalMGLang.g:155:1: ruleParamManipulation EOF
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
    // InternalMGLang.g:162:1: ruleParamManipulation : ( ( rule__ParamManipulation__Group__0 ) ) ;
    public final void ruleParamManipulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:166:2: ( ( ( rule__ParamManipulation__Group__0 ) ) )
            // InternalMGLang.g:167:2: ( ( rule__ParamManipulation__Group__0 ) )
            {
            // InternalMGLang.g:167:2: ( ( rule__ParamManipulation__Group__0 ) )
            // InternalMGLang.g:168:3: ( rule__ParamManipulation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getGroup()); 
            }
            // InternalMGLang.g:169:3: ( rule__ParamManipulation__Group__0 )
            // InternalMGLang.g:169:4: rule__ParamManipulation__Group__0
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
    // InternalMGLang.g:178:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalMGLang.g:179:1: ( ruleNode EOF )
            // InternalMGLang.g:180:1: ruleNode EOF
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
    // InternalMGLang.g:187:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:191:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalMGLang.g:192:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalMGLang.g:192:2: ( ( rule__Node__Group__0 ) )
            // InternalMGLang.g:193:3: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalMGLang.g:194:3: ( rule__Node__Group__0 )
            // InternalMGLang.g:194:4: rule__Node__Group__0
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
    // InternalMGLang.g:203:1: entryRuleNodeContent : ruleNodeContent EOF ;
    public final void entryRuleNodeContent() throws RecognitionException {
        try {
            // InternalMGLang.g:204:1: ( ruleNodeContent EOF )
            // InternalMGLang.g:205:1: ruleNodeContent EOF
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
    // InternalMGLang.g:212:1: ruleNodeContent : ( ( rule__NodeContent__Group__0 ) ) ;
    public final void ruleNodeContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:216:2: ( ( ( rule__NodeContent__Group__0 ) ) )
            // InternalMGLang.g:217:2: ( ( rule__NodeContent__Group__0 ) )
            {
            // InternalMGLang.g:217:2: ( ( rule__NodeContent__Group__0 ) )
            // InternalMGLang.g:218:3: ( rule__NodeContent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getGroup()); 
            }
            // InternalMGLang.g:219:3: ( rule__NodeContent__Group__0 )
            // InternalMGLang.g:219:4: rule__NodeContent__Group__0
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
    // InternalMGLang.g:228:1: entryRulePatternCall : rulePatternCall EOF ;
    public final void entryRulePatternCall() throws RecognitionException {
        try {
            // InternalMGLang.g:229:1: ( rulePatternCall EOF )
            // InternalMGLang.g:230:1: rulePatternCall EOF
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
    // InternalMGLang.g:237:1: rulePatternCall : ( ( rule__PatternCall__Group__0 ) ) ;
    public final void rulePatternCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:241:2: ( ( ( rule__PatternCall__Group__0 ) ) )
            // InternalMGLang.g:242:2: ( ( rule__PatternCall__Group__0 ) )
            {
            // InternalMGLang.g:242:2: ( ( rule__PatternCall__Group__0 ) )
            // InternalMGLang.g:243:3: ( rule__PatternCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getGroup()); 
            }
            // InternalMGLang.g:244:3: ( rule__PatternCall__Group__0 )
            // InternalMGLang.g:244:4: rule__PatternCall__Group__0
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


    // $ANTLR start "entryRuleNodeReferenceOrAssignment"
    // InternalMGLang.g:253:1: entryRuleNodeReferenceOrAssignment : ruleNodeReferenceOrAssignment EOF ;
    public final void entryRuleNodeReferenceOrAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:254:1: ( ruleNodeReferenceOrAssignment EOF )
            // InternalMGLang.g:255:1: ruleNodeReferenceOrAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNodeReferenceOrAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentRule()); 
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
    // $ANTLR end "entryRuleNodeReferenceOrAssignment"


    // $ANTLR start "ruleNodeReferenceOrAssignment"
    // InternalMGLang.g:262:1: ruleNodeReferenceOrAssignment : ( ( rule__NodeReferenceOrAssignment__Alternatives ) ) ;
    public final void ruleNodeReferenceOrAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:266:2: ( ( ( rule__NodeReferenceOrAssignment__Alternatives ) ) )
            // InternalMGLang.g:267:2: ( ( rule__NodeReferenceOrAssignment__Alternatives ) )
            {
            // InternalMGLang.g:267:2: ( ( rule__NodeReferenceOrAssignment__Alternatives ) )
            // InternalMGLang.g:268:3: ( rule__NodeReferenceOrAssignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives()); 
            }
            // InternalMGLang.g:269:3: ( rule__NodeReferenceOrAssignment__Alternatives )
            // InternalMGLang.g:269:4: rule__NodeReferenceOrAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeReferenceOrAssignment"


    // $ANTLR start "entryRulePatternNodeReference"
    // InternalMGLang.g:278:1: entryRulePatternNodeReference : rulePatternNodeReference EOF ;
    public final void entryRulePatternNodeReference() throws RecognitionException {
        try {
            // InternalMGLang.g:279:1: ( rulePatternNodeReference EOF )
            // InternalMGLang.g:280:1: rulePatternNodeReference EOF
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
    // InternalMGLang.g:287:1: rulePatternNodeReference : ( ( rule__PatternNodeReference__Group__0 ) ) ;
    public final void rulePatternNodeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:291:2: ( ( ( rule__PatternNodeReference__Group__0 ) ) )
            // InternalMGLang.g:292:2: ( ( rule__PatternNodeReference__Group__0 ) )
            {
            // InternalMGLang.g:292:2: ( ( rule__PatternNodeReference__Group__0 ) )
            // InternalMGLang.g:293:3: ( rule__PatternNodeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 
            }
            // InternalMGLang.g:294:3: ( rule__PatternNodeReference__Group__0 )
            // InternalMGLang.g:294:4: rule__PatternNodeReference__Group__0
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
    // InternalMGLang.g:303:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:304:1: ( ruleAssignment EOF )
            // InternalMGLang.g:305:1: ruleAssignment EOF
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
    // InternalMGLang.g:312:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:316:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMGLang.g:317:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMGLang.g:317:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMGLang.g:318:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalMGLang.g:319:3: ( rule__Assignment__Group__0 )
            // InternalMGLang.g:319:4: rule__Assignment__Group__0
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
    // InternalMGLang.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:329:1: ( ruleParameter EOF )
            // InternalMGLang.g:330:1: ruleParameter EOF
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
    // InternalMGLang.g:337:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:341:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalMGLang.g:342:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalMGLang.g:342:2: ( ( rule__Parameter__Alternatives ) )
            // InternalMGLang.g:343:3: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // InternalMGLang.g:344:3: ( rule__Parameter__Alternatives )
            // InternalMGLang.g:344:4: rule__Parameter__Alternatives
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
    // InternalMGLang.g:353:1: entryRulePrimitiveParameter : rulePrimitiveParameter EOF ;
    public final void entryRulePrimitiveParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:354:1: ( rulePrimitiveParameter EOF )
            // InternalMGLang.g:355:1: rulePrimitiveParameter EOF
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
    // InternalMGLang.g:362:1: rulePrimitiveParameter : ( ( rule__PrimitiveParameter__Group__0 ) ) ;
    public final void rulePrimitiveParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:366:2: ( ( ( rule__PrimitiveParameter__Group__0 ) ) )
            // InternalMGLang.g:367:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            {
            // InternalMGLang.g:367:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            // InternalMGLang.g:368:3: ( rule__PrimitiveParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getGroup()); 
            }
            // InternalMGLang.g:369:3: ( rule__PrimitiveParameter__Group__0 )
            // InternalMGLang.g:369:4: rule__PrimitiveParameter__Group__0
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
    // InternalMGLang.g:378:1: entryRuleParameterNode : ruleParameterNode EOF ;
    public final void entryRuleParameterNode() throws RecognitionException {
        try {
            // InternalMGLang.g:379:1: ( ruleParameterNode EOF )
            // InternalMGLang.g:380:1: ruleParameterNode EOF
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
    // InternalMGLang.g:387:1: ruleParameterNode : ( ( rule__ParameterNode__Group__0 ) ) ;
    public final void ruleParameterNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:391:2: ( ( ( rule__ParameterNode__Group__0 ) ) )
            // InternalMGLang.g:392:2: ( ( rule__ParameterNode__Group__0 ) )
            {
            // InternalMGLang.g:392:2: ( ( rule__ParameterNode__Group__0 ) )
            // InternalMGLang.g:393:3: ( rule__ParameterNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getGroup()); 
            }
            // InternalMGLang.g:394:3: ( rule__ParameterNode__Group__0 )
            // InternalMGLang.g:394:4: rule__ParameterNode__Group__0
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
    // InternalMGLang.g:403:1: entryRuleRefOrCall : ruleRefOrCall EOF ;
    public final void entryRuleRefOrCall() throws RecognitionException {
        try {
            // InternalMGLang.g:404:1: ( ruleRefOrCall EOF )
            // InternalMGLang.g:405:1: ruleRefOrCall EOF
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
    // InternalMGLang.g:412:1: ruleRefOrCall : ( ( rule__RefOrCall__Group__0 ) ) ;
    public final void ruleRefOrCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:416:2: ( ( ( rule__RefOrCall__Group__0 ) ) )
            // InternalMGLang.g:417:2: ( ( rule__RefOrCall__Group__0 ) )
            {
            // InternalMGLang.g:417:2: ( ( rule__RefOrCall__Group__0 ) )
            // InternalMGLang.g:418:3: ( rule__RefOrCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getGroup()); 
            }
            // InternalMGLang.g:419:3: ( rule__RefOrCall__Group__0 )
            // InternalMGLang.g:419:4: rule__RefOrCall__Group__0
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


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:428:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalMGLang.g:429:1: ( ruleGenerator EOF )
            // InternalMGLang.g:430:1: ruleGenerator EOF
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
    // InternalMGLang.g:437:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:441:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalMGLang.g:442:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalMGLang.g:442:2: ( ( rule__Generator__Group__0 ) )
            // InternalMGLang.g:443:3: ( rule__Generator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup()); 
            }
            // InternalMGLang.g:444:3: ( rule__Generator__Group__0 )
            // InternalMGLang.g:444:4: rule__Generator__Group__0
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
    // InternalMGLang.g:453:1: entryRuleGeneratorExpression : ruleGeneratorExpression EOF ;
    public final void entryRuleGeneratorExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:454:1: ( ruleGeneratorExpression EOF )
            // InternalMGLang.g:455:1: ruleGeneratorExpression EOF
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
    // InternalMGLang.g:462:1: ruleGeneratorExpression : ( ( rule__GeneratorExpression__Alternatives ) ) ;
    public final void ruleGeneratorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:466:2: ( ( ( rule__GeneratorExpression__Alternatives ) ) )
            // InternalMGLang.g:467:2: ( ( rule__GeneratorExpression__Alternatives ) )
            {
            // InternalMGLang.g:467:2: ( ( rule__GeneratorExpression__Alternatives ) )
            // InternalMGLang.g:468:3: ( rule__GeneratorExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorExpressionAccess().getAlternatives()); 
            }
            // InternalMGLang.g:469:3: ( rule__GeneratorExpression__Alternatives )
            // InternalMGLang.g:469:4: rule__GeneratorExpression__Alternatives
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


    // $ANTLR start "entryRulePatternObjectCreation"
    // InternalMGLang.g:478:1: entryRulePatternObjectCreation : rulePatternObjectCreation EOF ;
    public final void entryRulePatternObjectCreation() throws RecognitionException {
        try {
            // InternalMGLang.g:479:1: ( rulePatternObjectCreation EOF )
            // InternalMGLang.g:480:1: rulePatternObjectCreation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePatternObjectCreation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectCreationRule()); 
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
    // $ANTLR end "entryRulePatternObjectCreation"


    // $ANTLR start "rulePatternObjectCreation"
    // InternalMGLang.g:487:1: rulePatternObjectCreation : ( ( rule__PatternObjectCreation__Group__0 ) ) ;
    public final void rulePatternObjectCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:491:2: ( ( ( rule__PatternObjectCreation__Group__0 ) ) )
            // InternalMGLang.g:492:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            {
            // InternalMGLang.g:492:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            // InternalMGLang.g:493:3: ( rule__PatternObjectCreation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getGroup()); 
            }
            // InternalMGLang.g:494:3: ( rule__PatternObjectCreation__Group__0 )
            // InternalMGLang.g:494:4: rule__PatternObjectCreation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectCreationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternObjectCreation"


    // $ANTLR start "entryRulePatternObject"
    // InternalMGLang.g:503:1: entryRulePatternObject : rulePatternObject EOF ;
    public final void entryRulePatternObject() throws RecognitionException {
        try {
            // InternalMGLang.g:504:1: ( rulePatternObject EOF )
            // InternalMGLang.g:505:1: rulePatternObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePatternObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectRule()); 
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
    // $ANTLR end "entryRulePatternObject"


    // $ANTLR start "rulePatternObject"
    // InternalMGLang.g:512:1: rulePatternObject : ( ( rule__PatternObject__Group__0 ) ) ;
    public final void rulePatternObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:516:2: ( ( ( rule__PatternObject__Group__0 ) ) )
            // InternalMGLang.g:517:2: ( ( rule__PatternObject__Group__0 ) )
            {
            // InternalMGLang.g:517:2: ( ( rule__PatternObject__Group__0 ) )
            // InternalMGLang.g:518:3: ( rule__PatternObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getGroup()); 
            }
            // InternalMGLang.g:519:3: ( rule__PatternObject__Group__0 )
            // InternalMGLang.g:519:4: rule__PatternObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternObject"


    // $ANTLR start "entryRuleForStatement"
    // InternalMGLang.g:528:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalMGLang.g:529:1: ( ruleForStatement EOF )
            // InternalMGLang.g:530:1: ruleForStatement EOF
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
    // InternalMGLang.g:537:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:541:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalMGLang.g:542:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalMGLang.g:542:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalMGLang.g:543:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalMGLang.g:544:3: ( rule__ForStatement__Group__0 )
            // InternalMGLang.g:544:4: rule__ForStatement__Group__0
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
    // InternalMGLang.g:553:1: entryRuleForHead : ruleForHead EOF ;
    public final void entryRuleForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:554:1: ( ruleForHead EOF )
            // InternalMGLang.g:555:1: ruleForHead EOF
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
    // InternalMGLang.g:562:1: ruleForHead : ( ( rule__ForHead__Alternatives ) ) ;
    public final void ruleForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:566:2: ( ( ( rule__ForHead__Alternatives ) ) )
            // InternalMGLang.g:567:2: ( ( rule__ForHead__Alternatives ) )
            {
            // InternalMGLang.g:567:2: ( ( rule__ForHead__Alternatives ) )
            // InternalMGLang.g:568:3: ( rule__ForHead__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForHeadAccess().getAlternatives()); 
            }
            // InternalMGLang.g:569:3: ( rule__ForHead__Alternatives )
            // InternalMGLang.g:569:4: rule__ForHead__Alternatives
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
    // InternalMGLang.g:578:1: entryRuleGeneralForHead : ruleGeneralForHead EOF ;
    public final void entryRuleGeneralForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:579:1: ( ruleGeneralForHead EOF )
            // InternalMGLang.g:580:1: ruleGeneralForHead EOF
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
    // InternalMGLang.g:587:1: ruleGeneralForHead : ( ( rule__GeneralForHead__Group__0 ) ) ;
    public final void ruleGeneralForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:591:2: ( ( ( rule__GeneralForHead__Group__0 ) ) )
            // InternalMGLang.g:592:2: ( ( rule__GeneralForHead__Group__0 ) )
            {
            // InternalMGLang.g:592:2: ( ( rule__GeneralForHead__Group__0 ) )
            // InternalMGLang.g:593:3: ( rule__GeneralForHead__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getGroup()); 
            }
            // InternalMGLang.g:594:3: ( rule__GeneralForHead__Group__0 )
            // InternalMGLang.g:594:4: rule__GeneralForHead__Group__0
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
    // InternalMGLang.g:603:1: entryRuleForEachHead : ruleForEachHead EOF ;
    public final void entryRuleForEachHead() throws RecognitionException {
        try {
            // InternalMGLang.g:604:1: ( ruleForEachHead EOF )
            // InternalMGLang.g:605:1: ruleForEachHead EOF
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
    // InternalMGLang.g:612:1: ruleForEachHead : ( ( rule__ForEachHead__Group__0 ) ) ;
    public final void ruleForEachHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:616:2: ( ( ( rule__ForEachHead__Group__0 ) ) )
            // InternalMGLang.g:617:2: ( ( rule__ForEachHead__Group__0 ) )
            {
            // InternalMGLang.g:617:2: ( ( rule__ForEachHead__Group__0 ) )
            // InternalMGLang.g:618:3: ( rule__ForEachHead__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getGroup()); 
            }
            // InternalMGLang.g:619:3: ( rule__ForEachHead__Group__0 )
            // InternalMGLang.g:619:4: rule__ForEachHead__Group__0
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
    // InternalMGLang.g:628:1: entryRuleForBody : ruleForBody EOF ;
    public final void entryRuleForBody() throws RecognitionException {
        try {
            // InternalMGLang.g:629:1: ( ruleForBody EOF )
            // InternalMGLang.g:630:1: ruleForBody EOF
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
    // InternalMGLang.g:637:1: ruleForBody : ( ( rule__ForBody__Group__0 ) ) ;
    public final void ruleForBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:641:2: ( ( ( rule__ForBody__Group__0 ) ) )
            // InternalMGLang.g:642:2: ( ( rule__ForBody__Group__0 ) )
            {
            // InternalMGLang.g:642:2: ( ( rule__ForBody__Group__0 ) )
            // InternalMGLang.g:643:3: ( rule__ForBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getGroup()); 
            }
            // InternalMGLang.g:644:3: ( rule__ForBody__Group__0 )
            // InternalMGLang.g:644:4: rule__ForBody__Group__0
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


    // $ANTLR start "entryRuleSwitch"
    // InternalMGLang.g:653:1: entryRuleSwitch : ruleSwitch EOF ;
    public final void entryRuleSwitch() throws RecognitionException {
        try {
            // InternalMGLang.g:654:1: ( ruleSwitch EOF )
            // InternalMGLang.g:655:1: ruleSwitch EOF
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
    // InternalMGLang.g:662:1: ruleSwitch : ( ( rule__Switch__Alternatives ) ) ;
    public final void ruleSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:666:2: ( ( ( rule__Switch__Alternatives ) ) )
            // InternalMGLang.g:667:2: ( ( rule__Switch__Alternatives ) )
            {
            // InternalMGLang.g:667:2: ( ( rule__Switch__Alternatives ) )
            // InternalMGLang.g:668:3: ( rule__Switch__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getAlternatives()); 
            }
            // InternalMGLang.g:669:3: ( rule__Switch__Alternatives )
            // InternalMGLang.g:669:4: rule__Switch__Alternatives
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
    // InternalMGLang.g:678:1: entryRuleIfElseSwitch : ruleIfElseSwitch EOF ;
    public final void entryRuleIfElseSwitch() throws RecognitionException {
        try {
            // InternalMGLang.g:679:1: ( ruleIfElseSwitch EOF )
            // InternalMGLang.g:680:1: ruleIfElseSwitch EOF
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
    // InternalMGLang.g:687:1: ruleIfElseSwitch : ( ( rule__IfElseSwitch__Group__0 ) ) ;
    public final void ruleIfElseSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:691:2: ( ( ( rule__IfElseSwitch__Group__0 ) ) )
            // InternalMGLang.g:692:2: ( ( rule__IfElseSwitch__Group__0 ) )
            {
            // InternalMGLang.g:692:2: ( ( rule__IfElseSwitch__Group__0 ) )
            // InternalMGLang.g:693:3: ( rule__IfElseSwitch__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getGroup()); 
            }
            // InternalMGLang.g:694:3: ( rule__IfElseSwitch__Group__0 )
            // InternalMGLang.g:694:4: rule__IfElseSwitch__Group__0
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
    // InternalMGLang.g:703:1: entryRuleIfElseCase : ruleIfElseCase EOF ;
    public final void entryRuleIfElseCase() throws RecognitionException {
        try {
            // InternalMGLang.g:704:1: ( ruleIfElseCase EOF )
            // InternalMGLang.g:705:1: ruleIfElseCase EOF
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
    // InternalMGLang.g:712:1: ruleIfElseCase : ( ( rule__IfElseCase__Group__0 ) ) ;
    public final void ruleIfElseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:716:2: ( ( ( rule__IfElseCase__Group__0 ) ) )
            // InternalMGLang.g:717:2: ( ( rule__IfElseCase__Group__0 ) )
            {
            // InternalMGLang.g:717:2: ( ( rule__IfElseCase__Group__0 ) )
            // InternalMGLang.g:718:3: ( rule__IfElseCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getGroup()); 
            }
            // InternalMGLang.g:719:3: ( rule__IfElseCase__Group__0 )
            // InternalMGLang.g:719:4: rule__IfElseCase__Group__0
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
    // InternalMGLang.g:728:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // InternalMGLang.g:729:1: ( ruleDefault EOF )
            // InternalMGLang.g:730:1: ruleDefault EOF
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
    // InternalMGLang.g:737:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:741:2: ( ( ( rule__Default__Group__0 ) ) )
            // InternalMGLang.g:742:2: ( ( rule__Default__Group__0 ) )
            {
            // InternalMGLang.g:742:2: ( ( rule__Default__Group__0 ) )
            // InternalMGLang.g:743:3: ( rule__Default__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getGroup()); 
            }
            // InternalMGLang.g:744:3: ( rule__Default__Group__0 )
            // InternalMGLang.g:744:4: rule__Default__Group__0
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
    // InternalMGLang.g:753:1: entryRuleSwitchCase : ruleSwitchCase EOF ;
    public final void entryRuleSwitchCase() throws RecognitionException {
        try {
            // InternalMGLang.g:754:1: ( ruleSwitchCase EOF )
            // InternalMGLang.g:755:1: ruleSwitchCase EOF
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
    // InternalMGLang.g:762:1: ruleSwitchCase : ( ( rule__SwitchCase__Group__0 ) ) ;
    public final void ruleSwitchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:766:2: ( ( ( rule__SwitchCase__Group__0 ) ) )
            // InternalMGLang.g:767:2: ( ( rule__SwitchCase__Group__0 ) )
            {
            // InternalMGLang.g:767:2: ( ( rule__SwitchCase__Group__0 ) )
            // InternalMGLang.g:768:3: ( rule__SwitchCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getGroup()); 
            }
            // InternalMGLang.g:769:3: ( rule__SwitchCase__Group__0 )
            // InternalMGLang.g:769:4: rule__SwitchCase__Group__0
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
    // InternalMGLang.g:778:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalMGLang.g:779:1: ( ruleCase EOF )
            // InternalMGLang.g:780:1: ruleCase EOF
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
    // InternalMGLang.g:787:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:791:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalMGLang.g:792:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalMGLang.g:792:2: ( ( rule__Case__Group__0 ) )
            // InternalMGLang.g:793:3: ( rule__Case__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getGroup()); 
            }
            // InternalMGLang.g:794:3: ( rule__Case__Group__0 )
            // InternalMGLang.g:794:4: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleCaseBody"
    // InternalMGLang.g:803:1: entryRuleCaseBody : ruleCaseBody EOF ;
    public final void entryRuleCaseBody() throws RecognitionException {
        try {
            // InternalMGLang.g:804:1: ( ruleCaseBody EOF )
            // InternalMGLang.g:805:1: ruleCaseBody EOF
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
    // InternalMGLang.g:812:1: ruleCaseBody : ( ( rule__CaseBody__Alternatives ) ) ;
    public final void ruleCaseBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:816:2: ( ( ( rule__CaseBody__Alternatives ) ) )
            // InternalMGLang.g:817:2: ( ( rule__CaseBody__Alternatives ) )
            {
            // InternalMGLang.g:817:2: ( ( rule__CaseBody__Alternatives ) )
            // InternalMGLang.g:818:3: ( rule__CaseBody__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getAlternatives()); 
            }
            // InternalMGLang.g:819:3: ( rule__CaseBody__Alternatives )
            // InternalMGLang.g:819:4: rule__CaseBody__Alternatives
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
    // InternalMGLang.g:828:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMGLang.g:829:1: ( ruleCollection EOF )
            // InternalMGLang.g:830:1: ruleCollection EOF
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
    // InternalMGLang.g:837:1: ruleCollection : ( ( rule__Collection__Alternatives ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:841:2: ( ( ( rule__Collection__Alternatives ) ) )
            // InternalMGLang.g:842:2: ( ( rule__Collection__Alternatives ) )
            {
            // InternalMGLang.g:842:2: ( ( rule__Collection__Alternatives ) )
            // InternalMGLang.g:843:3: ( rule__Collection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getAlternatives()); 
            }
            // InternalMGLang.g:844:3: ( rule__Collection__Alternatives )
            // InternalMGLang.g:844:4: rule__Collection__Alternatives
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
    // InternalMGLang.g:853:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMGLang.g:854:1: ( ruleList EOF )
            // InternalMGLang.g:855:1: ruleList EOF
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
    // InternalMGLang.g:862:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:866:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalMGLang.g:867:2: ( ( rule__List__Group__0 ) )
            {
            // InternalMGLang.g:867:2: ( ( rule__List__Group__0 ) )
            // InternalMGLang.g:868:3: ( rule__List__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup()); 
            }
            // InternalMGLang.g:869:3: ( rule__List__Group__0 )
            // InternalMGLang.g:869:4: rule__List__Group__0
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
    // InternalMGLang.g:878:1: entryRuleListAssignment : ruleListAssignment EOF ;
    public final void entryRuleListAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:879:1: ( ruleListAssignment EOF )
            // InternalMGLang.g:880:1: ruleListAssignment EOF
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
    // InternalMGLang.g:887:1: ruleListAssignment : ( ( rule__ListAssignment__Alternatives ) ) ;
    public final void ruleListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:891:2: ( ( ( rule__ListAssignment__Alternatives ) ) )
            // InternalMGLang.g:892:2: ( ( rule__ListAssignment__Alternatives ) )
            {
            // InternalMGLang.g:892:2: ( ( rule__ListAssignment__Alternatives ) )
            // InternalMGLang.g:893:3: ( rule__ListAssignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAssignmentAccess().getAlternatives()); 
            }
            // InternalMGLang.g:894:3: ( rule__ListAssignment__Alternatives )
            // InternalMGLang.g:894:4: rule__ListAssignment__Alternatives
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
    // InternalMGLang.g:903:1: entryRuleListAdHoc : ruleListAdHoc EOF ;
    public final void entryRuleListAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:904:1: ( ruleListAdHoc EOF )
            // InternalMGLang.g:905:1: ruleListAdHoc EOF
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
    // InternalMGLang.g:912:1: ruleListAdHoc : ( ( rule__ListAdHoc__Group__0 ) ) ;
    public final void ruleListAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:916:2: ( ( ( rule__ListAdHoc__Group__0 ) ) )
            // InternalMGLang.g:917:2: ( ( rule__ListAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:917:2: ( ( rule__ListAdHoc__Group__0 ) )
            // InternalMGLang.g:918:3: ( rule__ListAdHoc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getGroup()); 
            }
            // InternalMGLang.g:919:3: ( rule__ListAdHoc__Group__0 )
            // InternalMGLang.g:919:4: rule__ListAdHoc__Group__0
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
    // InternalMGLang.g:928:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalMGLang.g:929:1: ( ruleMap EOF )
            // InternalMGLang.g:930:1: ruleMap EOF
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
    // InternalMGLang.g:937:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:941:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalMGLang.g:942:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalMGLang.g:942:2: ( ( rule__Map__Group__0 ) )
            // InternalMGLang.g:943:3: ( rule__Map__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getGroup()); 
            }
            // InternalMGLang.g:944:3: ( rule__Map__Group__0 )
            // InternalMGLang.g:944:4: rule__Map__Group__0
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
    // InternalMGLang.g:953:1: entryRuleMapAssignment : ruleMapAssignment EOF ;
    public final void entryRuleMapAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:954:1: ( ruleMapAssignment EOF )
            // InternalMGLang.g:955:1: ruleMapAssignment EOF
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
    // InternalMGLang.g:962:1: ruleMapAssignment : ( ( rule__MapAssignment__Alternatives ) ) ;
    public final void ruleMapAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:966:2: ( ( ( rule__MapAssignment__Alternatives ) ) )
            // InternalMGLang.g:967:2: ( ( rule__MapAssignment__Alternatives ) )
            {
            // InternalMGLang.g:967:2: ( ( rule__MapAssignment__Alternatives ) )
            // InternalMGLang.g:968:3: ( rule__MapAssignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAssignmentAccess().getAlternatives()); 
            }
            // InternalMGLang.g:969:3: ( rule__MapAssignment__Alternatives )
            // InternalMGLang.g:969:4: rule__MapAssignment__Alternatives
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
    // InternalMGLang.g:978:1: entryRuleMapAdHoc : ruleMapAdHoc EOF ;
    public final void entryRuleMapAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:979:1: ( ruleMapAdHoc EOF )
            // InternalMGLang.g:980:1: ruleMapAdHoc EOF
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
    // InternalMGLang.g:987:1: ruleMapAdHoc : ( ( rule__MapAdHoc__Group__0 ) ) ;
    public final void ruleMapAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:991:2: ( ( ( rule__MapAdHoc__Group__0 ) ) )
            // InternalMGLang.g:992:2: ( ( rule__MapAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:992:2: ( ( rule__MapAdHoc__Group__0 ) )
            // InternalMGLang.g:993:3: ( rule__MapAdHoc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getGroup()); 
            }
            // InternalMGLang.g:994:3: ( rule__MapAdHoc__Group__0 )
            // InternalMGLang.g:994:4: rule__MapAdHoc__Group__0
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
    // InternalMGLang.g:1003:1: entryRuleMapTupel : ruleMapTupel EOF ;
    public final void entryRuleMapTupel() throws RecognitionException {
        try {
            // InternalMGLang.g:1004:1: ( ruleMapTupel EOF )
            // InternalMGLang.g:1005:1: ruleMapTupel EOF
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
    // InternalMGLang.g:1012:1: ruleMapTupel : ( ( rule__MapTupel__Group__0 ) ) ;
    public final void ruleMapTupel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1016:2: ( ( ( rule__MapTupel__Group__0 ) ) )
            // InternalMGLang.g:1017:2: ( ( rule__MapTupel__Group__0 ) )
            {
            // InternalMGLang.g:1017:2: ( ( rule__MapTupel__Group__0 ) )
            // InternalMGLang.g:1018:3: ( rule__MapTupel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getGroup()); 
            }
            // InternalMGLang.g:1019:3: ( rule__MapTupel__Group__0 )
            // InternalMGLang.g:1019:4: rule__MapTupel__Group__0
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
    // InternalMGLang.g:1028:1: entryRuleForRange : ruleForRange EOF ;
    public final void entryRuleForRange() throws RecognitionException {
        try {
            // InternalMGLang.g:1029:1: ( ruleForRange EOF )
            // InternalMGLang.g:1030:1: ruleForRange EOF
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
    // InternalMGLang.g:1037:1: ruleForRange : ( ( rule__ForRange__Group__0 ) ) ;
    public final void ruleForRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1041:2: ( ( ( rule__ForRange__Group__0 ) ) )
            // InternalMGLang.g:1042:2: ( ( rule__ForRange__Group__0 ) )
            {
            // InternalMGLang.g:1042:2: ( ( rule__ForRange__Group__0 ) )
            // InternalMGLang.g:1043:3: ( rule__ForRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getGroup()); 
            }
            // InternalMGLang.g:1044:3: ( rule__ForRange__Group__0 )
            // InternalMGLang.g:1044:4: rule__ForRange__Group__0
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
    // InternalMGLang.g:1053:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1054:1: ( ruleArithmeticExpression EOF )
            // InternalMGLang.g:1055:1: ruleArithmeticExpression EOF
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
    // InternalMGLang.g:1062:1: ruleArithmeticExpression : ( ruleTertiaryExpression ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1066:2: ( ( ruleTertiaryExpression ) )
            // InternalMGLang.g:1067:2: ( ruleTertiaryExpression )
            {
            // InternalMGLang.g:1067:2: ( ruleTertiaryExpression )
            // InternalMGLang.g:1068:3: ruleTertiaryExpression
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
    // InternalMGLang.g:1078:1: entryRuleTertiaryExpression : ruleTertiaryExpression EOF ;
    public final void entryRuleTertiaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1079:1: ( ruleTertiaryExpression EOF )
            // InternalMGLang.g:1080:1: ruleTertiaryExpression EOF
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
    // InternalMGLang.g:1087:1: ruleTertiaryExpression : ( ( rule__TertiaryExpression__Group__0 ) ) ;
    public final void ruleTertiaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1091:2: ( ( ( rule__TertiaryExpression__Group__0 ) ) )
            // InternalMGLang.g:1092:2: ( ( rule__TertiaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:1092:2: ( ( rule__TertiaryExpression__Group__0 ) )
            // InternalMGLang.g:1093:3: ( rule__TertiaryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:1094:3: ( rule__TertiaryExpression__Group__0 )
            // InternalMGLang.g:1094:4: rule__TertiaryExpression__Group__0
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
    // InternalMGLang.g:1103:1: entryRuleSecondaryExpression : ruleSecondaryExpression EOF ;
    public final void entryRuleSecondaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1104:1: ( ruleSecondaryExpression EOF )
            // InternalMGLang.g:1105:1: ruleSecondaryExpression EOF
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
    // InternalMGLang.g:1112:1: ruleSecondaryExpression : ( ( rule__SecondaryExpression__Group__0 ) ) ;
    public final void ruleSecondaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1116:2: ( ( ( rule__SecondaryExpression__Group__0 ) ) )
            // InternalMGLang.g:1117:2: ( ( rule__SecondaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:1117:2: ( ( rule__SecondaryExpression__Group__0 ) )
            // InternalMGLang.g:1118:3: ( rule__SecondaryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:1119:3: ( rule__SecondaryExpression__Group__0 )
            // InternalMGLang.g:1119:4: rule__SecondaryExpression__Group__0
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
    // InternalMGLang.g:1128:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:1129:1: ( rulePrimaryExpr EOF )
            // InternalMGLang.g:1130:1: rulePrimaryExpr EOF
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
    // InternalMGLang.g:1137:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Group__0 ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1141:2: ( ( ( rule__PrimaryExpr__Group__0 ) ) )
            // InternalMGLang.g:1142:2: ( ( rule__PrimaryExpr__Group__0 ) )
            {
            // InternalMGLang.g:1142:2: ( ( rule__PrimaryExpr__Group__0 ) )
            // InternalMGLang.g:1143:3: ( rule__PrimaryExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup()); 
            }
            // InternalMGLang.g:1144:3: ( rule__PrimaryExpr__Group__0 )
            // InternalMGLang.g:1144:4: rule__PrimaryExpr__Group__0
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
    // InternalMGLang.g:1153:1: entryRuleRelationExpression : ruleRelationExpression EOF ;
    public final void entryRuleRelationExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1154:1: ( ruleRelationExpression EOF )
            // InternalMGLang.g:1155:1: ruleRelationExpression EOF
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
    // InternalMGLang.g:1162:1: ruleRelationExpression : ( ( rule__RelationExpression__Group__0 ) ) ;
    public final void ruleRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1166:2: ( ( ( rule__RelationExpression__Group__0 ) ) )
            // InternalMGLang.g:1167:2: ( ( rule__RelationExpression__Group__0 ) )
            {
            // InternalMGLang.g:1167:2: ( ( rule__RelationExpression__Group__0 ) )
            // InternalMGLang.g:1168:3: ( rule__RelationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:1169:3: ( rule__RelationExpression__Group__0 )
            // InternalMGLang.g:1169:4: rule__RelationExpression__Group__0
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
    // InternalMGLang.g:1178:1: entryRuleBaseExpr : ruleBaseExpr EOF ;
    public final void entryRuleBaseExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:1179:1: ( ruleBaseExpr EOF )
            // InternalMGLang.g:1180:1: ruleBaseExpr EOF
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
    // InternalMGLang.g:1187:1: ruleBaseExpr : ( ( rule__BaseExpr__Alternatives ) ) ;
    public final void ruleBaseExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1191:2: ( ( ( rule__BaseExpr__Alternatives ) ) )
            // InternalMGLang.g:1192:2: ( ( rule__BaseExpr__Alternatives ) )
            {
            // InternalMGLang.g:1192:2: ( ( rule__BaseExpr__Alternatives ) )
            // InternalMGLang.g:1193:3: ( rule__BaseExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1194:3: ( rule__BaseExpr__Alternatives )
            // InternalMGLang.g:1194:4: rule__BaseExpr__Alternatives
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
    // InternalMGLang.g:1203:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1204:1: ( ruleLiteral EOF )
            // InternalMGLang.g:1205:1: ruleLiteral EOF
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
    // InternalMGLang.g:1212:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1216:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMGLang.g:1217:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMGLang.g:1217:2: ( ( rule__Literal__Alternatives ) )
            // InternalMGLang.g:1218:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1219:3: ( rule__Literal__Alternatives )
            // InternalMGLang.g:1219:4: rule__Literal__Alternatives
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
    // InternalMGLang.g:1228:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1229:1: ( ruleBooleanLiteral EOF )
            // InternalMGLang.g:1230:1: ruleBooleanLiteral EOF
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
    // InternalMGLang.g:1237:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1241:2: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // InternalMGLang.g:1242:2: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // InternalMGLang.g:1242:2: ( ( rule__BooleanLiteral__Alternatives ) )
            // InternalMGLang.g:1243:3: ( rule__BooleanLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1244:3: ( rule__BooleanLiteral__Alternatives )
            // InternalMGLang.g:1244:4: rule__BooleanLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:1253:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1254:1: ( ruleStringLiteral EOF )
            // InternalMGLang.g:1255:1: ruleStringLiteral EOF
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
    // InternalMGLang.g:1262:1: ruleStringLiteral : ( RULE_STRING ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1266:2: ( ( RULE_STRING ) )
            // InternalMGLang.g:1267:2: ( RULE_STRING )
            {
            // InternalMGLang.g:1267:2: ( RULE_STRING )
            // InternalMGLang.g:1268:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:1278:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1279:1: ( ruleNumberLiteral EOF )
            // InternalMGLang.g:1280:1: ruleNumberLiteral EOF
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
    // InternalMGLang.g:1287:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1291:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalMGLang.g:1292:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalMGLang.g:1292:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalMGLang.g:1293:3: ( rule__NumberLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            }
            // InternalMGLang.g:1294:3: ( rule__NumberLiteral__Group__0 )
            // InternalMGLang.g:1294:4: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:1303:1: ruleMathFunc : ( ( rule__MathFunc__Alternatives ) ) ;
    public final void ruleMathFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1307:1: ( ( ( rule__MathFunc__Alternatives ) ) )
            // InternalMGLang.g:1308:2: ( ( rule__MathFunc__Alternatives ) )
            {
            // InternalMGLang.g:1308:2: ( ( rule__MathFunc__Alternatives ) )
            // InternalMGLang.g:1309:3: ( rule__MathFunc__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathFuncAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1310:3: ( rule__MathFunc__Alternatives )
            // InternalMGLang.g:1310:4: rule__MathFunc__Alternatives
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
    // InternalMGLang.g:1319:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1323:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMGLang.g:1324:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMGLang.g:1324:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMGLang.g:1325:3: ( rule__PrimitiveType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1326:3: ( rule__PrimitiveType__Alternatives )
            // InternalMGLang.g:1326:4: rule__PrimitiveType__Alternatives
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
    // InternalMGLang.g:1335:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1339:1: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // InternalMGLang.g:1340:2: ( ( rule__RelationalOp__Alternatives ) )
            {
            // InternalMGLang.g:1340:2: ( ( rule__RelationalOp__Alternatives ) )
            // InternalMGLang.g:1341:3: ( rule__RelationalOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1342:3: ( rule__RelationalOp__Alternatives )
            // InternalMGLang.g:1342:4: rule__RelationalOp__Alternatives
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
    // InternalMGLang.g:1351:1: ruleTertiaryOp : ( ( rule__TertiaryOp__Alternatives ) ) ;
    public final void ruleTertiaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1355:1: ( ( ( rule__TertiaryOp__Alternatives ) ) )
            // InternalMGLang.g:1356:2: ( ( rule__TertiaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1356:2: ( ( rule__TertiaryOp__Alternatives ) )
            // InternalMGLang.g:1357:3: ( rule__TertiaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1358:3: ( rule__TertiaryOp__Alternatives )
            // InternalMGLang.g:1358:4: rule__TertiaryOp__Alternatives
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
    // InternalMGLang.g:1367:1: ruleSecondaryOp : ( ( rule__SecondaryOp__Alternatives ) ) ;
    public final void ruleSecondaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1371:1: ( ( ( rule__SecondaryOp__Alternatives ) ) )
            // InternalMGLang.g:1372:2: ( ( rule__SecondaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1372:2: ( ( rule__SecondaryOp__Alternatives ) )
            // InternalMGLang.g:1373:3: ( rule__SecondaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1374:3: ( rule__SecondaryOp__Alternatives )
            // InternalMGLang.g:1374:4: rule__SecondaryOp__Alternatives
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
    // InternalMGLang.g:1383:1: rulePrimaryOp : ( ( rule__PrimaryOp__Alternatives ) ) ;
    public final void rulePrimaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1387:1: ( ( ( rule__PrimaryOp__Alternatives ) ) )
            // InternalMGLang.g:1388:2: ( ( rule__PrimaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1388:2: ( ( rule__PrimaryOp__Alternatives ) )
            // InternalMGLang.g:1389:3: ( rule__PrimaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1390:3: ( rule__PrimaryOp__Alternatives )
            // InternalMGLang.g:1390:4: rule__PrimaryOp__Alternatives
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


    // $ANTLR start "rule__MofgenFile__Alternatives_1"
    // InternalMGLang.g:1398:1: rule__MofgenFile__Alternatives_1 : ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) );
    public final void rule__MofgenFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1402:1: ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
                alt1=1;
            }
            else if ( (LA1_0==47) ) {
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
                    // InternalMGLang.g:1403:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    {
                    // InternalMGLang.g:1403:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    // InternalMGLang.g:1404:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMofgenFileAccess().getPatternsAssignment_1_0()); 
                    }
                    // InternalMGLang.g:1405:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    // InternalMGLang.g:1405:4: rule__MofgenFile__PatternsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MofgenFile__PatternsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMofgenFileAccess().getPatternsAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1409:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    {
                    // InternalMGLang.g:1409:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    // InternalMGLang.g:1410:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_1_1()); 
                    }
                    // InternalMGLang.g:1411:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    // InternalMGLang.g:1411:4: rule__MofgenFile__GeneratorsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MofgenFile__GeneratorsAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_1_1()); 
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
    // $ANTLR end "rule__MofgenFile__Alternatives_1"


    // $ANTLR start "rule__Node__Alternatives_2"
    // InternalMGLang.g:1419:1: rule__Node__Alternatives_2 : ( ( ( rule__Node__CreatedByAssignment_2_0 ) ) | ( ( rule__Node__Group_2_1__0 ) ) );
    public final void rule__Node__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1423:1: ( ( ( rule__Node__CreatedByAssignment_2_0 ) ) | ( ( rule__Node__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
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
                    // InternalMGLang.g:1424:2: ( ( rule__Node__CreatedByAssignment_2_0 ) )
                    {
                    // InternalMGLang.g:1424:2: ( ( rule__Node__CreatedByAssignment_2_0 ) )
                    // InternalMGLang.g:1425:3: ( rule__Node__CreatedByAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getCreatedByAssignment_2_0()); 
                    }
                    // InternalMGLang.g:1426:3: ( rule__Node__CreatedByAssignment_2_0 )
                    // InternalMGLang.g:1426:4: rule__Node__CreatedByAssignment_2_0
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
                    // InternalMGLang.g:1430:2: ( ( rule__Node__Group_2_1__0 ) )
                    {
                    // InternalMGLang.g:1430:2: ( ( rule__Node__Group_2_1__0 ) )
                    // InternalMGLang.g:1431:3: ( rule__Node__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getGroup_2_1()); 
                    }
                    // InternalMGLang.g:1432:3: ( rule__Node__Group_2_1__0 )
                    // InternalMGLang.g:1432:4: rule__Node__Group_2_1__0
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


    // $ANTLR start "rule__NodeReferenceOrAssignment__Alternatives"
    // InternalMGLang.g:1440:1: rule__NodeReferenceOrAssignment__Alternatives : ( ( rulePatternNodeReference ) | ( ruleAssignment ) );
    public final void rule__NodeReferenceOrAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1444:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==46) ) {
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
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMGLang.g:1445:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:1445:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:1446:3: rulePatternNodeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternNodeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1451:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:1451:2: ( ruleAssignment )
                    // InternalMGLang.g:1452:3: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_1()); 
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
    // $ANTLR end "rule__NodeReferenceOrAssignment__Alternatives"


    // $ANTLR start "rule__Parameter__Alternatives"
    // InternalMGLang.g:1461:1: rule__Parameter__Alternatives : ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1465:1: ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=17 && LA4_0<=20)) ) {
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
                    // InternalMGLang.g:1466:2: ( rulePrimitiveParameter )
                    {
                    // InternalMGLang.g:1466:2: ( rulePrimitiveParameter )
                    // InternalMGLang.g:1467:3: rulePrimitiveParameter
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
                    // InternalMGLang.g:1472:2: ( ruleParameterNode )
                    {
                    // InternalMGLang.g:1472:2: ( ruleParameterNode )
                    // InternalMGLang.g:1473:3: ruleParameterNode
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
    // InternalMGLang.g:1482:1: rule__GeneratorExpression__Alternatives : ( ( ruleForStatement ) | ( ruleSwitch ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternObjectCreation ) );
    public final void rule__GeneratorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1486:1: ( ( ruleForStatement ) | ( ruleSwitch ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternObjectCreation ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt5=1;
                }
                break;
            case 50:
                {
                alt5=2;
                }
                break;
            case 55:
            case 58:
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
                    // InternalMGLang.g:1487:2: ( ruleForStatement )
                    {
                    // InternalMGLang.g:1487:2: ( ruleForStatement )
                    // InternalMGLang.g:1488:3: ruleForStatement
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
                    // InternalMGLang.g:1493:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1493:2: ( ruleSwitch )
                    // InternalMGLang.g:1494:3: ruleSwitch
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
                    // InternalMGLang.g:1499:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1499:2: ( ruleCollection )
                    // InternalMGLang.g:1500:3: ruleCollection
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
                    // InternalMGLang.g:1505:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1505:2: ( rulePatternCall )
                    // InternalMGLang.g:1506:3: rulePatternCall
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
                    // InternalMGLang.g:1511:2: ( rulePatternObjectCreation )
                    {
                    // InternalMGLang.g:1511:2: ( rulePatternObjectCreation )
                    // InternalMGLang.g:1512:3: rulePatternObjectCreation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getPatternObjectCreationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternObjectCreation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getPatternObjectCreationParserRuleCall_4()); 
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
    // InternalMGLang.g:1521:1: rule__ForHead__Alternatives : ( ( ruleGeneralForHead ) | ( ruleForEachHead ) );
    public final void rule__ForHead__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1525:1: ( ( ruleGeneralForHead ) | ( ruleForEachHead ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==28||LA6_1==45) ) {
                    alt6=2;
                }
                else if ( (LA6_1==49) ) {
                    alt6=1;
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
                    // InternalMGLang.g:1526:2: ( ruleGeneralForHead )
                    {
                    // InternalMGLang.g:1526:2: ( ruleGeneralForHead )
                    // InternalMGLang.g:1527:3: ruleGeneralForHead
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
                    // InternalMGLang.g:1532:2: ( ruleForEachHead )
                    {
                    // InternalMGLang.g:1532:2: ( ruleForEachHead )
                    // InternalMGLang.g:1533:3: ruleForEachHead
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


    // $ANTLR start "rule__Switch__Alternatives"
    // InternalMGLang.g:1542:1: rule__Switch__Alternatives : ( ( ruleIfElseSwitch ) | ( ruleSwitchCase ) );
    public final void rule__Switch__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1546:1: ( ( ruleIfElseSwitch ) | ( ruleSwitchCase ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==50) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==38) ) {
                    alt7=1;
                }
                else if ( (LA7_1==40) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGLang.g:1547:2: ( ruleIfElseSwitch )
                    {
                    // InternalMGLang.g:1547:2: ( ruleIfElseSwitch )
                    // InternalMGLang.g:1548:3: ruleIfElseSwitch
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
                    // InternalMGLang.g:1553:2: ( ruleSwitchCase )
                    {
                    // InternalMGLang.g:1553:2: ( ruleSwitchCase )
                    // InternalMGLang.g:1554:3: ruleSwitchCase
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


    // $ANTLR start "rule__CaseBody__Alternatives"
    // InternalMGLang.g:1563:1: rule__CaseBody__Alternatives : ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__Group_1__0 ) ) );
    public final void rule__CaseBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1567:1: ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||LA8_0==48||LA8_0==50||LA8_0==55||LA8_0==58) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMGLang.g:1568:2: ( ( rule__CaseBody__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1568:2: ( ( rule__CaseBody__Group_0__0 ) )
                    // InternalMGLang.g:1569:3: ( rule__CaseBody__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCaseBodyAccess().getGroup_0()); 
                    }
                    // InternalMGLang.g:1570:3: ( rule__CaseBody__Group_0__0 )
                    // InternalMGLang.g:1570:4: rule__CaseBody__Group_0__0
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
                    // InternalMGLang.g:1574:2: ( ( rule__CaseBody__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1574:2: ( ( rule__CaseBody__Group_1__0 ) )
                    // InternalMGLang.g:1575:3: ( rule__CaseBody__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCaseBodyAccess().getGroup_1()); 
                    }
                    // InternalMGLang.g:1576:3: ( rule__CaseBody__Group_1__0 )
                    // InternalMGLang.g:1576:4: rule__CaseBody__Group_1__0
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
    // InternalMGLang.g:1584:1: rule__Collection__Alternatives : ( ( ruleList ) | ( ruleMap ) );
    public final void rule__Collection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1588:1: ( ( ruleList ) | ( ruleMap ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==55) ) {
                alt9=1;
            }
            else if ( (LA9_0==58) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:1589:2: ( ruleList )
                    {
                    // InternalMGLang.g:1589:2: ( ruleList )
                    // InternalMGLang.g:1590:3: ruleList
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
                    // InternalMGLang.g:1595:2: ( ruleMap )
                    {
                    // InternalMGLang.g:1595:2: ( ruleMap )
                    // InternalMGLang.g:1596:3: ruleMap
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
    // InternalMGLang.g:1605:1: rule__ListAssignment__Alternatives : ( ( ruleListAdHoc ) | ( ruleRefOrCall ) );
    public final void rule__ListAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1609:1: ( ( ruleListAdHoc ) | ( ruleRefOrCall ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==56) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
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
                    // InternalMGLang.g:1610:2: ( ruleListAdHoc )
                    {
                    // InternalMGLang.g:1610:2: ( ruleListAdHoc )
                    // InternalMGLang.g:1611:3: ruleListAdHoc
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
                    // InternalMGLang.g:1616:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1616:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1617:3: ruleRefOrCall
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
    // InternalMGLang.g:1626:1: rule__MapAssignment__Alternatives : ( ( ruleMapAdHoc ) | ( ruleRefOrCall ) );
    public final void rule__MapAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1630:1: ( ( ruleMapAdHoc ) | ( ruleRefOrCall ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==56) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
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
                    // InternalMGLang.g:1631:2: ( ruleMapAdHoc )
                    {
                    // InternalMGLang.g:1631:2: ( ruleMapAdHoc )
                    // InternalMGLang.g:1632:3: ruleMapAdHoc
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
                    // InternalMGLang.g:1637:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1637:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1638:3: ruleRefOrCall
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
    // InternalMGLang.g:1647:1: rule__BaseExpr__Alternatives : ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ( rule__BaseExpr__Group_3__0 ) ) | ( ruleRefOrCall ) );
    public final void rule__BaseExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1651:1: ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ( rule__BaseExpr__Group_3__0 ) ) | ( ruleRefOrCall ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt12=1;
                }
                break;
            case 59:
                {
                alt12=2;
                }
                break;
            case 15:
            case 16:
                {
                alt12=3;
                }
                break;
            case RULE_STRING:
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_INT:
                {
                alt12=4;
                }
                break;
            case RULE_ID:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMGLang.g:1652:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1652:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    // InternalMGLang.g:1653:3: ( rule__BaseExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_0()); 
                    }
                    // InternalMGLang.g:1654:3: ( rule__BaseExpr__Group_0__0 )
                    // InternalMGLang.g:1654:4: rule__BaseExpr__Group_0__0
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
                    // InternalMGLang.g:1658:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1658:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    // InternalMGLang.g:1659:3: ( rule__BaseExpr__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_1()); 
                    }
                    // InternalMGLang.g:1660:3: ( rule__BaseExpr__Group_1__0 )
                    // InternalMGLang.g:1660:4: rule__BaseExpr__Group_1__0
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
                    // InternalMGLang.g:1664:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    {
                    // InternalMGLang.g:1664:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    // InternalMGLang.g:1665:3: ( rule__BaseExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_2()); 
                    }
                    // InternalMGLang.g:1666:3: ( rule__BaseExpr__Group_2__0 )
                    // InternalMGLang.g:1666:4: rule__BaseExpr__Group_2__0
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
                    // InternalMGLang.g:1670:2: ( ( rule__BaseExpr__Group_3__0 ) )
                    {
                    // InternalMGLang.g:1670:2: ( ( rule__BaseExpr__Group_3__0 ) )
                    // InternalMGLang.g:1671:3: ( rule__BaseExpr__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_3()); 
                    }
                    // InternalMGLang.g:1672:3: ( rule__BaseExpr__Group_3__0 )
                    // InternalMGLang.g:1672:4: rule__BaseExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpr__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExprAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1676:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1676:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1677:3: ruleRefOrCall
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
    // InternalMGLang.g:1686:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1690:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case RULE_INT:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMGLang.g:1691:2: ( ruleBooleanLiteral )
                    {
                    // InternalMGLang.g:1691:2: ( ruleBooleanLiteral )
                    // InternalMGLang.g:1692:3: ruleBooleanLiteral
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
                    // InternalMGLang.g:1697:2: ( ruleStringLiteral )
                    {
                    // InternalMGLang.g:1697:2: ( ruleStringLiteral )
                    // InternalMGLang.g:1698:3: ruleStringLiteral
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
                    // InternalMGLang.g:1703:2: ( ruleNumberLiteral )
                    {
                    // InternalMGLang.g:1703:2: ( ruleNumberLiteral )
                    // InternalMGLang.g:1704:3: ruleNumberLiteral
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


    // $ANTLR start "rule__BooleanLiteral__Alternatives"
    // InternalMGLang.g:1713:1: rule__BooleanLiteral__Alternatives : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1717:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_TRUE) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_FALSE) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMGLang.g:1718:2: ( RULE_TRUE )
                    {
                    // InternalMGLang.g:1718:2: ( RULE_TRUE )
                    // InternalMGLang.g:1719:3: RULE_TRUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getTRUETerminalRuleCall_0()); 
                    }
                    match(input,RULE_TRUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getTRUETerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1724:2: ( RULE_FALSE )
                    {
                    // InternalMGLang.g:1724:2: ( RULE_FALSE )
                    // InternalMGLang.g:1725:3: RULE_FALSE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getFALSETerminalRuleCall_1()); 
                    }
                    match(input,RULE_FALSE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getFALSETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__BooleanLiteral__Alternatives"


    // $ANTLR start "rule__MathFunc__Alternatives"
    // InternalMGLang.g:1734:1: rule__MathFunc__Alternatives : ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) );
    public final void rule__MathFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1738:1: ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:1739:2: ( ( 'sqrt' ) )
                    {
                    // InternalMGLang.g:1739:2: ( ( 'sqrt' ) )
                    // InternalMGLang.g:1740:3: ( 'sqrt' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1741:3: ( 'sqrt' )
                    // InternalMGLang.g:1741:4: 'sqrt'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1745:2: ( ( 'abs' ) )
                    {
                    // InternalMGLang.g:1745:2: ( ( 'abs' ) )
                    // InternalMGLang.g:1746:3: ( 'abs' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1747:3: ( 'abs' )
                    // InternalMGLang.g:1747:4: 'abs'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

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
    // InternalMGLang.g:1755:1: rule__PrimitiveType__Alternatives : ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1759:1: ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt16=1;
                }
                break;
            case 18:
                {
                alt16=2;
                }
                break;
            case 19:
                {
                alt16=3;
                }
                break;
            case 20:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMGLang.g:1760:2: ( ( 'int' ) )
                    {
                    // InternalMGLang.g:1760:2: ( ( 'int' ) )
                    // InternalMGLang.g:1761:3: ( 'int' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1762:3: ( 'int' )
                    // InternalMGLang.g:1762:4: 'int'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1766:2: ( ( 'char' ) )
                    {
                    // InternalMGLang.g:1766:2: ( ( 'char' ) )
                    // InternalMGLang.g:1767:3: ( 'char' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1768:3: ( 'char' )
                    // InternalMGLang.g:1768:4: 'char'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1772:2: ( ( 'double' ) )
                    {
                    // InternalMGLang.g:1772:2: ( ( 'double' ) )
                    // InternalMGLang.g:1773:3: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1774:3: ( 'double' )
                    // InternalMGLang.g:1774:4: 'double'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1778:2: ( ( 'String' ) )
                    {
                    // InternalMGLang.g:1778:2: ( ( 'String' ) )
                    // InternalMGLang.g:1779:3: ( 'String' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    }
                    // InternalMGLang.g:1780:3: ( 'String' )
                    // InternalMGLang.g:1780:4: 'String'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

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
    // InternalMGLang.g:1788:1: rule__RelationalOp__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1792:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt17=1;
                }
                break;
            case 22:
                {
                alt17=2;
                }
                break;
            case 23:
                {
                alt17=3;
                }
                break;
            case 24:
                {
                alt17=4;
                }
                break;
            case 25:
                {
                alt17=5;
                }
                break;
            case 26:
                {
                alt17=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMGLang.g:1793:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:1793:2: ( ( '>' ) )
                    // InternalMGLang.g:1794:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1795:3: ( '>' )
                    // InternalMGLang.g:1795:4: '>'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1799:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:1799:2: ( ( '>=' ) )
                    // InternalMGLang.g:1800:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1801:3: ( '>=' )
                    // InternalMGLang.g:1801:4: '>='
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1805:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:1805:2: ( ( '==' ) )
                    // InternalMGLang.g:1806:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1807:3: ( '==' )
                    // InternalMGLang.g:1807:4: '=='
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1811:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:1811:2: ( ( '!=' ) )
                    // InternalMGLang.g:1812:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalMGLang.g:1813:3: ( '!=' )
                    // InternalMGLang.g:1813:4: '!='
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1817:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:1817:2: ( ( '<=' ) )
                    // InternalMGLang.g:1818:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalMGLang.g:1819:3: ( '<=' )
                    // InternalMGLang.g:1819:4: '<='
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:1823:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:1823:2: ( ( '<' ) )
                    // InternalMGLang.g:1824:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5()); 
                    }
                    // InternalMGLang.g:1825:3: ( '<' )
                    // InternalMGLang.g:1825:4: '<'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5()); 
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
    // InternalMGLang.g:1833:1: rule__TertiaryOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) );
    public final void rule__TertiaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1837:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 28:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
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
                    // InternalMGLang.g:1838:2: ( ( '+' ) )
                    {
                    // InternalMGLang.g:1838:2: ( ( '+' ) )
                    // InternalMGLang.g:1839:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1840:3: ( '+' )
                    // InternalMGLang.g:1840:4: '+'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1844:2: ( ( '-' ) )
                    {
                    // InternalMGLang.g:1844:2: ( ( '-' ) )
                    // InternalMGLang.g:1845:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1846:3: ( '-' )
                    // InternalMGLang.g:1846:4: '-'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1850:2: ( ( '||' ) )
                    {
                    // InternalMGLang.g:1850:2: ( ( '||' ) )
                    // InternalMGLang.g:1851:3: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1852:3: ( '||' )
                    // InternalMGLang.g:1852:4: '||'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

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
    // InternalMGLang.g:1860:1: rule__SecondaryOp__Alternatives : ( ( ( '%' ) ) | ( ( '^' ) ) );
    public final void rule__SecondaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1864:1: ( ( ( '%' ) ) | ( ( '^' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMGLang.g:1865:2: ( ( '%' ) )
                    {
                    // InternalMGLang.g:1865:2: ( ( '%' ) )
                    // InternalMGLang.g:1866:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1867:3: ( '%' )
                    // InternalMGLang.g:1867:4: '%'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1871:2: ( ( '^' ) )
                    {
                    // InternalMGLang.g:1871:2: ( ( '^' ) )
                    // InternalMGLang.g:1872:3: ( '^' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1873:3: ( '^' )
                    // InternalMGLang.g:1873:4: '^'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

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
    // InternalMGLang.g:1881:1: rule__PrimaryOp__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) );
    public final void rule__PrimaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1885:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 34:
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
                    // InternalMGLang.g:1886:2: ( ( '*' ) )
                    {
                    // InternalMGLang.g:1886:2: ( ( '*' ) )
                    // InternalMGLang.g:1887:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1888:3: ( '*' )
                    // InternalMGLang.g:1888:4: '*'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1892:2: ( ( '/' ) )
                    {
                    // InternalMGLang.g:1892:2: ( ( '/' ) )
                    // InternalMGLang.g:1893:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1894:3: ( '/' )
                    // InternalMGLang.g:1894:4: '/'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1898:2: ( ( '&&' ) )
                    {
                    // InternalMGLang.g:1898:2: ( ( '&&' ) )
                    // InternalMGLang.g:1899:3: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1900:3: ( '&&' )
                    // InternalMGLang.g:1900:4: '&&'
                    {
                    match(input,34,FOLLOW_2); if (state.failed) return ;

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
    // InternalMGLang.g:1908:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1912:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:1913:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
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
    // InternalMGLang.g:1920:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1924:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:1925:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:1925:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:1926:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            }
            // InternalMGLang.g:1927:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMGLang.g:1927:3: rule__MofgenFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MofgenFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMGLang.g:1935:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1939:1: ( rule__MofgenFile__Group__1__Impl )
            // InternalMGLang.g:1940:2: rule__MofgenFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__1__Impl();

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
    // InternalMGLang.g:1946:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__Alternatives_1 )* ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1950:1: ( ( ( rule__MofgenFile__Alternatives_1 )* ) )
            // InternalMGLang.g:1951:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            {
            // InternalMGLang.g:1951:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            // InternalMGLang.g:1952:2: ( rule__MofgenFile__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getAlternatives_1()); 
            }
            // InternalMGLang.g:1953:2: ( rule__MofgenFile__Alternatives_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37||LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMGLang.g:1953:3: rule__MofgenFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MofgenFile__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getAlternatives_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalMGLang.g:1962:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1966:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:1967:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMGLang.g:1974:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1978:1: ( ( 'import' ) )
            // InternalMGLang.g:1979:1: ( 'import' )
            {
            // InternalMGLang.g:1979:1: ( 'import' )
            // InternalMGLang.g:1980:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:1989:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1993:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:1994:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMGLang.g:2001:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2005:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalMGLang.g:2006:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2006:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalMGLang.g:2007:2: ( rule__Import__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:2008:2: ( rule__Import__NameAssignment_1 )
            // InternalMGLang.g:2008:3: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:2016:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2020:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:2021:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:2028:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2032:1: ( ( 'as' ) )
            // InternalMGLang.g:2033:1: ( 'as' )
            {
            // InternalMGLang.g:2033:1: ( 'as' )
            // InternalMGLang.g:2034:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2043:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2047:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:2048:2: rule__Import__Group__3__Impl
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
    // InternalMGLang.g:2054:1: rule__Import__Group__3__Impl : ( ( rule__Import__AliasAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2058:1: ( ( ( rule__Import__AliasAssignment_3 ) ) )
            // InternalMGLang.g:2059:1: ( ( rule__Import__AliasAssignment_3 ) )
            {
            // InternalMGLang.g:2059:1: ( ( rule__Import__AliasAssignment_3 ) )
            // InternalMGLang.g:2060:2: ( rule__Import__AliasAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAliasAssignment_3()); 
            }
            // InternalMGLang.g:2061:2: ( rule__Import__AliasAssignment_3 )
            // InternalMGLang.g:2061:3: rule__Import__AliasAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Import__AliasAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAliasAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalMGLang.g:2070:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2074:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:2075:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:2082:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2086:1: ( ( 'pattern' ) )
            // InternalMGLang.g:2087:1: ( 'pattern' )
            {
            // InternalMGLang.g:2087:1: ( 'pattern' )
            // InternalMGLang.g:2088:2: 'pattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2097:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2101:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:2102:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMGLang.g:2109:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2113:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:2114:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2114:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:2115:2: ( rule__Pattern__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:2116:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:2116:3: rule__Pattern__NameAssignment_1
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
    // InternalMGLang.g:2124:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2128:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:2129:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:2136:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2140:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:2141:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:2141:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:2142:2: ( rule__Pattern__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2()); 
            }
            // InternalMGLang.g:2143:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:2143:3: rule__Pattern__Group_2__0
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
    // InternalMGLang.g:2151:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2155:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:2156:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMGLang.g:2163:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2167:1: ( ( '{' ) )
            // InternalMGLang.g:2168:1: ( '{' )
            {
            // InternalMGLang.g:2168:1: ( '{' )
            // InternalMGLang.g:2169:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2178:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2182:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:2183:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMGLang.g:2190:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__UnorderedGroup_4 ) ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2194:1: ( ( ( rule__Pattern__UnorderedGroup_4 ) ) )
            // InternalMGLang.g:2195:1: ( ( rule__Pattern__UnorderedGroup_4 ) )
            {
            // InternalMGLang.g:2195:1: ( ( rule__Pattern__UnorderedGroup_4 ) )
            // InternalMGLang.g:2196:2: ( rule__Pattern__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getUnorderedGroup_4()); 
            }
            // InternalMGLang.g:2197:2: ( rule__Pattern__UnorderedGroup_4 )
            // InternalMGLang.g:2197:3: rule__Pattern__UnorderedGroup_4
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
    // InternalMGLang.g:2205:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2209:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:2210:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalMGLang.g:2217:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2221:1: ( ( '}' ) )
            // InternalMGLang.g:2222:1: ( '}' )
            {
            // InternalMGLang.g:2222:1: ( '}' )
            // InternalMGLang.g:2223:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2232:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2236:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:2237:2: rule__Pattern__Group__6__Impl
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
    // InternalMGLang.g:2243:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 )? ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2247:1: ( ( ( rule__Pattern__ReturnAssignment_6 )? ) )
            // InternalMGLang.g:2248:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            {
            // InternalMGLang.g:2248:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            // InternalMGLang.g:2249:2: ( rule__Pattern__ReturnAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            }
            // InternalMGLang.g:2250:2: ( rule__Pattern__ReturnAssignment_6 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMGLang.g:2250:3: rule__Pattern__ReturnAssignment_6
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
    // InternalMGLang.g:2259:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2263:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:2264:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMGLang.g:2271:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2275:1: ( ( '(' ) )
            // InternalMGLang.g:2276:1: ( '(' )
            {
            // InternalMGLang.g:2276:1: ( '(' )
            // InternalMGLang.g:2277:2: '('
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
    // InternalMGLang.g:2286:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2290:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:2291:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMGLang.g:2298:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2302:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:2303:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:2303:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:2304:2: ( rule__Pattern__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            }
            // InternalMGLang.g:2305:2: ( rule__Pattern__Group_2_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=17 && LA24_0<=20)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMGLang.g:2305:3: rule__Pattern__Group_2_1__0
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
    // InternalMGLang.g:2313:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2317:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:2318:2: rule__Pattern__Group_2__2__Impl
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
    // InternalMGLang.g:2324:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2328:1: ( ( ')' ) )
            // InternalMGLang.g:2329:1: ( ')' )
            {
            // InternalMGLang.g:2329:1: ( ')' )
            // InternalMGLang.g:2330:2: ')'
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
    // InternalMGLang.g:2340:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2344:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:2345:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMGLang.g:2352:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2356:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:2357:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:2357:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:2358:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            }
            // InternalMGLang.g:2359:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:2359:3: rule__Pattern__ParametersAssignment_2_1_0
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
    // InternalMGLang.g:2367:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2371:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:2372:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalMGLang.g:2378:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2382:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:2383:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:2383:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:2384:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            }
            // InternalMGLang.g:2385:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMGLang.g:2385:3: rule__Pattern__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Pattern__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMGLang.g:2394:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2398:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:2399:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMGLang.g:2406:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2410:1: ( ( ',' ) )
            // InternalMGLang.g:2411:1: ( ',' )
            {
            // InternalMGLang.g:2411:1: ( ',' )
            // InternalMGLang.g:2412:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2421:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2425:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:2426:2: rule__Pattern__Group_2_1_1__1__Impl
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
    // InternalMGLang.g:2432:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2436:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:2437:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:2437:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:2438:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            }
            // InternalMGLang.g:2439:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:2439:3: rule__Pattern__ParametersAssignment_2_1_1_1
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
    // InternalMGLang.g:2448:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2452:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:2453:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMGLang.g:2460:1: rule__PatternReturn__Group__0__Impl : ( () ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2464:1: ( ( () ) )
            // InternalMGLang.g:2465:1: ( () )
            {
            // InternalMGLang.g:2465:1: ( () )
            // InternalMGLang.g:2466:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 
            }
            // InternalMGLang.g:2467:2: ()
            // InternalMGLang.g:2467:3: 
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
    // InternalMGLang.g:2475:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2479:1: ( rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 )
            // InternalMGLang.g:2480:2: rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMGLang.g:2487:1: rule__PatternReturn__Group__1__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2491:1: ( ( 'return' ) )
            // InternalMGLang.g:2492:1: ( 'return' )
            {
            // InternalMGLang.g:2492:1: ( 'return' )
            // InternalMGLang.g:2493:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2502:1: rule__PatternReturn__Group__2 : rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 ;
    public final void rule__PatternReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2506:1: ( rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 )
            // InternalMGLang.g:2507:2: rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMGLang.g:2514:1: rule__PatternReturn__Group__2__Impl : ( 'this' ) ;
    public final void rule__PatternReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2518:1: ( ( 'this' ) )
            // InternalMGLang.g:2519:1: ( 'this' )
            {
            // InternalMGLang.g:2519:1: ( 'this' )
            // InternalMGLang.g:2520:2: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getThisKeyword_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2529:1: rule__PatternReturn__Group__3 : rule__PatternReturn__Group__3__Impl ;
    public final void rule__PatternReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2533:1: ( rule__PatternReturn__Group__3__Impl )
            // InternalMGLang.g:2534:2: rule__PatternReturn__Group__3__Impl
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
    // InternalMGLang.g:2540:1: rule__PatternReturn__Group__3__Impl : ( ( rule__PatternReturn__Group_3__0 )? ) ;
    public final void rule__PatternReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2544:1: ( ( ( rule__PatternReturn__Group_3__0 )? ) )
            // InternalMGLang.g:2545:1: ( ( rule__PatternReturn__Group_3__0 )? )
            {
            // InternalMGLang.g:2545:1: ( ( rule__PatternReturn__Group_3__0 )? )
            // InternalMGLang.g:2546:2: ( rule__PatternReturn__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getGroup_3()); 
            }
            // InternalMGLang.g:2547:2: ( rule__PatternReturn__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMGLang.g:2547:3: rule__PatternReturn__Group_3__0
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
    // InternalMGLang.g:2556:1: rule__PatternReturn__Group_3__0 : rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 ;
    public final void rule__PatternReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2560:1: ( rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 )
            // InternalMGLang.g:2561:2: rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:2568:1: rule__PatternReturn__Group_3__0__Impl : ( '.' ) ;
    public final void rule__PatternReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2572:1: ( ( '.' ) )
            // InternalMGLang.g:2573:1: ( '.' )
            {
            // InternalMGLang.g:2573:1: ( '.' )
            // InternalMGLang.g:2574:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2583:1: rule__PatternReturn__Group_3__1 : rule__PatternReturn__Group_3__1__Impl ;
    public final void rule__PatternReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2587:1: ( rule__PatternReturn__Group_3__1__Impl )
            // InternalMGLang.g:2588:2: rule__PatternReturn__Group_3__1__Impl
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
    // InternalMGLang.g:2594:1: rule__PatternReturn__Group_3__1__Impl : ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) ;
    public final void rule__PatternReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2598:1: ( ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) )
            // InternalMGLang.g:2599:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            {
            // InternalMGLang.g:2599:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            // InternalMGLang.g:2600:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 
            }
            // InternalMGLang.g:2601:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            // InternalMGLang.g:2601:3: rule__PatternReturn__ReturnValueAssignment_3_1
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
    // InternalMGLang.g:2610:1: rule__ParamManipulation__Group__0 : rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 ;
    public final void rule__ParamManipulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2614:1: ( rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 )
            // InternalMGLang.g:2615:2: rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:2622:1: rule__ParamManipulation__Group__0__Impl : ( ( rule__ParamManipulation__ParamAssignment_0 ) ) ;
    public final void rule__ParamManipulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2626:1: ( ( ( rule__ParamManipulation__ParamAssignment_0 ) ) )
            // InternalMGLang.g:2627:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            {
            // InternalMGLang.g:2627:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            // InternalMGLang.g:2628:2: ( rule__ParamManipulation__ParamAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getParamAssignment_0()); 
            }
            // InternalMGLang.g:2629:2: ( rule__ParamManipulation__ParamAssignment_0 )
            // InternalMGLang.g:2629:3: rule__ParamManipulation__ParamAssignment_0
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
    // InternalMGLang.g:2637:1: rule__ParamManipulation__Group__1 : rule__ParamManipulation__Group__1__Impl ;
    public final void rule__ParamManipulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2641:1: ( rule__ParamManipulation__Group__1__Impl )
            // InternalMGLang.g:2642:2: rule__ParamManipulation__Group__1__Impl
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
    // InternalMGLang.g:2648:1: rule__ParamManipulation__Group__1__Impl : ( ( rule__ParamManipulation__ContentAssignment_1 ) ) ;
    public final void rule__ParamManipulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2652:1: ( ( ( rule__ParamManipulation__ContentAssignment_1 ) ) )
            // InternalMGLang.g:2653:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            {
            // InternalMGLang.g:2653:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            // InternalMGLang.g:2654:2: ( rule__ParamManipulation__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getContentAssignment_1()); 
            }
            // InternalMGLang.g:2655:2: ( rule__ParamManipulation__ContentAssignment_1 )
            // InternalMGLang.g:2655:3: rule__ParamManipulation__ContentAssignment_1
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
    // InternalMGLang.g:2664:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2668:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:2669:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:2676:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2680:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2681:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2681:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalMGLang.g:2682:2: ( rule__Node__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:2683:2: ( rule__Node__TypeAssignment_0 )
            // InternalMGLang.g:2683:3: rule__Node__TypeAssignment_0
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
    // InternalMGLang.g:2691:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2695:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalMGLang.g:2696:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMGLang.g:2703:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2707:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalMGLang.g:2708:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2708:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalMGLang.g:2709:2: ( rule__Node__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:2710:2: ( rule__Node__NameAssignment_1 )
            // InternalMGLang.g:2710:3: rule__Node__NameAssignment_1
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
    // InternalMGLang.g:2718:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2722:1: ( rule__Node__Group__2__Impl )
            // InternalMGLang.g:2723:2: rule__Node__Group__2__Impl
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
    // InternalMGLang.g:2729:1: rule__Node__Group__2__Impl : ( ( rule__Node__Alternatives_2 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2733:1: ( ( ( rule__Node__Alternatives_2 )? ) )
            // InternalMGLang.g:2734:1: ( ( rule__Node__Alternatives_2 )? )
            {
            // InternalMGLang.g:2734:1: ( ( rule__Node__Alternatives_2 )? )
            // InternalMGLang.g:2735:2: ( rule__Node__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_2()); 
            }
            // InternalMGLang.g:2736:2: ( rule__Node__Alternatives_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ASSIGNMENT_OP||LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMGLang.g:2736:3: rule__Node__Alternatives_2
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
    // InternalMGLang.g:2745:1: rule__Node__Group_2_1__0 : rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1 ;
    public final void rule__Node__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2749:1: ( rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1 )
            // InternalMGLang.g:2750:2: rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:2757:1: rule__Node__Group_2_1__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Node__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2761:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2762:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2762:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:2763:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:2772:1: rule__Node__Group_2_1__1 : rule__Node__Group_2_1__1__Impl ;
    public final void rule__Node__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2776:1: ( rule__Node__Group_2_1__1__Impl )
            // InternalMGLang.g:2777:2: rule__Node__Group_2_1__1__Impl
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
    // InternalMGLang.g:2783:1: rule__Node__Group_2_1__1__Impl : ( ( rule__Node__CreatedByAssignment_2_1_1 ) ) ;
    public final void rule__Node__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2787:1: ( ( ( rule__Node__CreatedByAssignment_2_1_1 ) ) )
            // InternalMGLang.g:2788:1: ( ( rule__Node__CreatedByAssignment_2_1_1 ) )
            {
            // InternalMGLang.g:2788:1: ( ( rule__Node__CreatedByAssignment_2_1_1 ) )
            // InternalMGLang.g:2789:2: ( rule__Node__CreatedByAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getCreatedByAssignment_2_1_1()); 
            }
            // InternalMGLang.g:2790:2: ( rule__Node__CreatedByAssignment_2_1_1 )
            // InternalMGLang.g:2790:3: rule__Node__CreatedByAssignment_2_1_1
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
    // InternalMGLang.g:2799:1: rule__NodeContent__Group__0 : rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 ;
    public final void rule__NodeContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2803:1: ( rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 )
            // InternalMGLang.g:2804:2: rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:2811:1: rule__NodeContent__Group__0__Impl : ( () ) ;
    public final void rule__NodeContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2815:1: ( ( () ) )
            // InternalMGLang.g:2816:1: ( () )
            {
            // InternalMGLang.g:2816:1: ( () )
            // InternalMGLang.g:2817:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getNodeContentAction_0()); 
            }
            // InternalMGLang.g:2818:2: ()
            // InternalMGLang.g:2818:3: 
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
    // InternalMGLang.g:2826:1: rule__NodeContent__Group__1 : rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 ;
    public final void rule__NodeContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2830:1: ( rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 )
            // InternalMGLang.g:2831:2: rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMGLang.g:2838:1: rule__NodeContent__Group__1__Impl : ( '{' ) ;
    public final void rule__NodeContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2842:1: ( ( '{' ) )
            // InternalMGLang.g:2843:1: ( '{' )
            {
            // InternalMGLang.g:2843:1: ( '{' )
            // InternalMGLang.g:2844:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2853:1: rule__NodeContent__Group__2 : rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 ;
    public final void rule__NodeContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2857:1: ( rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 )
            // InternalMGLang.g:2858:2: rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMGLang.g:2865:1: rule__NodeContent__Group__2__Impl : ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) ;
    public final void rule__NodeContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2869:1: ( ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) )
            // InternalMGLang.g:2870:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            {
            // InternalMGLang.g:2870:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            // InternalMGLang.g:2871:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getRefsAssignsAssignment_2()); 
            }
            // InternalMGLang.g:2872:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMGLang.g:2872:3: rule__NodeContent__RefsAssignsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__NodeContent__RefsAssignsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMGLang.g:2880:1: rule__NodeContent__Group__3 : rule__NodeContent__Group__3__Impl ;
    public final void rule__NodeContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2884:1: ( rule__NodeContent__Group__3__Impl )
            // InternalMGLang.g:2885:2: rule__NodeContent__Group__3__Impl
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
    // InternalMGLang.g:2891:1: rule__NodeContent__Group__3__Impl : ( '}' ) ;
    public final void rule__NodeContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2895:1: ( ( '}' ) )
            // InternalMGLang.g:2896:1: ( '}' )
            {
            // InternalMGLang.g:2896:1: ( '}' )
            // InternalMGLang.g:2897:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:2907:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2911:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:2912:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMGLang.g:2919:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2923:1: ( ( ( rule__PatternCall__CalledAssignment_0 ) ) )
            // InternalMGLang.g:2924:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            {
            // InternalMGLang.g:2924:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            // InternalMGLang.g:2925:2: ( rule__PatternCall__CalledAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 
            }
            // InternalMGLang.g:2926:2: ( rule__PatternCall__CalledAssignment_0 )
            // InternalMGLang.g:2926:3: rule__PatternCall__CalledAssignment_0
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
    // InternalMGLang.g:2934:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2938:1: ( rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 )
            // InternalMGLang.g:2939:2: rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMGLang.g:2946:1: rule__PatternCall__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2950:1: ( ( '(' ) )
            // InternalMGLang.g:2951:1: ( '(' )
            {
            // InternalMGLang.g:2951:1: ( '(' )
            // InternalMGLang.g:2952:2: '('
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
    // InternalMGLang.g:2961:1: rule__PatternCall__Group__2 : rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 ;
    public final void rule__PatternCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2965:1: ( rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 )
            // InternalMGLang.g:2966:2: rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMGLang.g:2973:1: rule__PatternCall__Group__2__Impl : ( ( rule__PatternCall__ParamsAssignment_2 )* ) ;
    public final void rule__PatternCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2977:1: ( ( ( rule__PatternCall__ParamsAssignment_2 )* ) )
            // InternalMGLang.g:2978:1: ( ( rule__PatternCall__ParamsAssignment_2 )* )
            {
            // InternalMGLang.g:2978:1: ( ( rule__PatternCall__ParamsAssignment_2 )* )
            // InternalMGLang.g:2979:2: ( rule__PatternCall__ParamsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getParamsAssignment_2()); 
            }
            // InternalMGLang.g:2980:2: ( rule__PatternCall__ParamsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_FALSE)||(LA29_0>=RULE_INT && LA29_0<=RULE_ID)||(LA29_0>=15 && LA29_0<=16)||LA29_0==40||LA29_0==59) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMGLang.g:2980:3: rule__PatternCall__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__PatternCall__ParamsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getParamsAssignment_2()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:2988:1: rule__PatternCall__Group__3 : rule__PatternCall__Group__3__Impl ;
    public final void rule__PatternCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2992:1: ( rule__PatternCall__Group__3__Impl )
            // InternalMGLang.g:2993:2: rule__PatternCall__Group__3__Impl
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
    // InternalMGLang.g:2999:1: rule__PatternCall__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3003:1: ( ( ')' ) )
            // InternalMGLang.g:3004:1: ( ')' )
            {
            // InternalMGLang.g:3004:1: ( ')' )
            // InternalMGLang.g:3005:2: ')'
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


    // $ANTLR start "rule__PatternNodeReference__Group__0"
    // InternalMGLang.g:3015:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3019:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:3020:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMGLang.g:3027:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3031:1: ( ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3032:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3032:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            // InternalMGLang.g:3033:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3034:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            // InternalMGLang.g:3034:3: rule__PatternNodeReference__TypeAssignment_0
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
    // InternalMGLang.g:3042:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3046:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:3047:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:3054:1: rule__PatternNodeReference__Group__1__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3058:1: ( ( '->' ) )
            // InternalMGLang.g:3059:1: ( '->' )
            {
            // InternalMGLang.g:3059:1: ( '->' )
            // InternalMGLang.g:3060:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3069:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3073:1: ( rule__PatternNodeReference__Group__2__Impl )
            // InternalMGLang.g:3074:2: rule__PatternNodeReference__Group__2__Impl
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
    // InternalMGLang.g:3080:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3084:1: ( ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) )
            // InternalMGLang.g:3085:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            {
            // InternalMGLang.g:3085:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            // InternalMGLang.g:3086:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 
            }
            // InternalMGLang.g:3087:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            // InternalMGLang.g:3087:3: rule__PatternNodeReference__TargetAssignment_2
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
    // InternalMGLang.g:3096:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3100:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:3101:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:3108:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3112:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMGLang.g:3113:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMGLang.g:3113:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMGLang.g:3114:2: ( rule__Assignment__TargetAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            }
            // InternalMGLang.g:3115:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMGLang.g:3115:3: rule__Assignment__TargetAssignment_0
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
    // InternalMGLang.g:3123:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3127:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:3128:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:3135:1: rule__Assignment__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3139:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3140:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3140:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3141:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:3150:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3154:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:3155:2: rule__Assignment__Group__2__Impl
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
    // InternalMGLang.g:3161:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3165:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:3166:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:3166:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:3167:2: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // InternalMGLang.g:3168:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:3168:3: rule__Assignment__ValueAssignment_2
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
    // InternalMGLang.g:3177:1: rule__PrimitiveParameter__Group__0 : rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 ;
    public final void rule__PrimitiveParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3181:1: ( rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 )
            // InternalMGLang.g:3182:2: rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:3189:1: rule__PrimitiveParameter__Group__0__Impl : ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3193:1: ( ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3194:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3194:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:3195:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3196:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            // InternalMGLang.g:3196:3: rule__PrimitiveParameter__TypeAssignment_0
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
    // InternalMGLang.g:3204:1: rule__PrimitiveParameter__Group__1 : rule__PrimitiveParameter__Group__1__Impl ;
    public final void rule__PrimitiveParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3208:1: ( rule__PrimitiveParameter__Group__1__Impl )
            // InternalMGLang.g:3209:2: rule__PrimitiveParameter__Group__1__Impl
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
    // InternalMGLang.g:3215:1: rule__PrimitiveParameter__Group__1__Impl : ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3219:1: ( ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:3220:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3220:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            // InternalMGLang.g:3221:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:3222:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            // InternalMGLang.g:3222:3: rule__PrimitiveParameter__NameAssignment_1
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
    // InternalMGLang.g:3231:1: rule__ParameterNode__Group__0 : rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 ;
    public final void rule__ParameterNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3235:1: ( rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 )
            // InternalMGLang.g:3236:2: rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:3243:1: rule__ParameterNode__Group__0__Impl : ( ( rule__ParameterNode__TypeAssignment_0 ) ) ;
    public final void rule__ParameterNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3247:1: ( ( ( rule__ParameterNode__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3248:1: ( ( rule__ParameterNode__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3248:1: ( ( rule__ParameterNode__TypeAssignment_0 ) )
            // InternalMGLang.g:3249:2: ( rule__ParameterNode__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3250:2: ( rule__ParameterNode__TypeAssignment_0 )
            // InternalMGLang.g:3250:3: rule__ParameterNode__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:3258:1: rule__ParameterNode__Group__1 : rule__ParameterNode__Group__1__Impl ;
    public final void rule__ParameterNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3262:1: ( rule__ParameterNode__Group__1__Impl )
            // InternalMGLang.g:3263:2: rule__ParameterNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__1__Impl();

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
    // InternalMGLang.g:3269:1: rule__ParameterNode__Group__1__Impl : ( ( rule__ParameterNode__NameAssignment_1 ) ) ;
    public final void rule__ParameterNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3273:1: ( ( ( rule__ParameterNode__NameAssignment_1 ) ) )
            // InternalMGLang.g:3274:1: ( ( rule__ParameterNode__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3274:1: ( ( rule__ParameterNode__NameAssignment_1 ) )
            // InternalMGLang.g:3275:2: ( rule__ParameterNode__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:3276:2: ( rule__ParameterNode__NameAssignment_1 )
            // InternalMGLang.g:3276:3: rule__ParameterNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RefOrCall__Group__0"
    // InternalMGLang.g:3285:1: rule__RefOrCall__Group__0 : rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1 ;
    public final void rule__RefOrCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3289:1: ( rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1 )
            // InternalMGLang.g:3290:2: rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMGLang.g:3297:1: rule__RefOrCall__Group__0__Impl : ( ( rule__RefOrCall__RefAssignment_0 ) ) ;
    public final void rule__RefOrCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3301:1: ( ( ( rule__RefOrCall__RefAssignment_0 ) ) )
            // InternalMGLang.g:3302:1: ( ( rule__RefOrCall__RefAssignment_0 ) )
            {
            // InternalMGLang.g:3302:1: ( ( rule__RefOrCall__RefAssignment_0 ) )
            // InternalMGLang.g:3303:2: ( rule__RefOrCall__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefAssignment_0()); 
            }
            // InternalMGLang.g:3304:2: ( rule__RefOrCall__RefAssignment_0 )
            // InternalMGLang.g:3304:3: rule__RefOrCall__RefAssignment_0
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
    // InternalMGLang.g:3312:1: rule__RefOrCall__Group__1 : rule__RefOrCall__Group__1__Impl ;
    public final void rule__RefOrCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3316:1: ( rule__RefOrCall__Group__1__Impl )
            // InternalMGLang.g:3317:2: rule__RefOrCall__Group__1__Impl
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
    // InternalMGLang.g:3323:1: rule__RefOrCall__Group__1__Impl : ( ( rule__RefOrCall__Group_1__0 )* ) ;
    public final void rule__RefOrCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3327:1: ( ( ( rule__RefOrCall__Group_1__0 )* ) )
            // InternalMGLang.g:3328:1: ( ( rule__RefOrCall__Group_1__0 )* )
            {
            // InternalMGLang.g:3328:1: ( ( rule__RefOrCall__Group_1__0 )* )
            // InternalMGLang.g:3329:2: ( rule__RefOrCall__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getGroup_1()); 
            }
            // InternalMGLang.g:3330:2: ( rule__RefOrCall__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMGLang.g:3330:3: rule__RefOrCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__RefOrCall__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMGLang.g:3339:1: rule__RefOrCall__Group_1__0 : rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1 ;
    public final void rule__RefOrCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3343:1: ( rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1 )
            // InternalMGLang.g:3344:2: rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMGLang.g:3351:1: rule__RefOrCall__Group_1__0__Impl : ( () ) ;
    public final void rule__RefOrCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3355:1: ( ( () ) )
            // InternalMGLang.g:3356:1: ( () )
            {
            // InternalMGLang.g:3356:1: ( () )
            // InternalMGLang.g:3357:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefOrCallTargetAction_1_0()); 
            }
            // InternalMGLang.g:3358:2: ()
            // InternalMGLang.g:3358:3: 
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
    // InternalMGLang.g:3366:1: rule__RefOrCall__Group_1__1 : rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2 ;
    public final void rule__RefOrCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3370:1: ( rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2 )
            // InternalMGLang.g:3371:2: rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:3378:1: rule__RefOrCall__Group_1__1__Impl : ( '.' ) ;
    public final void rule__RefOrCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3382:1: ( ( '.' ) )
            // InternalMGLang.g:3383:1: ( '.' )
            {
            // InternalMGLang.g:3383:1: ( '.' )
            // InternalMGLang.g:3384:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getFullStopKeyword_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3393:1: rule__RefOrCall__Group_1__2 : rule__RefOrCall__Group_1__2__Impl ;
    public final void rule__RefOrCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3397:1: ( rule__RefOrCall__Group_1__2__Impl )
            // InternalMGLang.g:3398:2: rule__RefOrCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__2__Impl();

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
    // InternalMGLang.g:3404:1: rule__RefOrCall__Group_1__2__Impl : ( ( rule__RefOrCall__RefAssignment_1_2 ) ) ;
    public final void rule__RefOrCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3408:1: ( ( ( rule__RefOrCall__RefAssignment_1_2 ) ) )
            // InternalMGLang.g:3409:1: ( ( rule__RefOrCall__RefAssignment_1_2 ) )
            {
            // InternalMGLang.g:3409:1: ( ( rule__RefOrCall__RefAssignment_1_2 ) )
            // InternalMGLang.g:3410:2: ( rule__RefOrCall__RefAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefAssignment_1_2()); 
            }
            // InternalMGLang.g:3411:2: ( rule__RefOrCall__RefAssignment_1_2 )
            // InternalMGLang.g:3411:3: rule__RefOrCall__RefAssignment_1_2
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


    // $ANTLR start "rule__Generator__Group__0"
    // InternalMGLang.g:3420:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3424:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:3425:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMGLang.g:3432:1: rule__Generator__Group__0__Impl : ( () ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3436:1: ( ( () ) )
            // InternalMGLang.g:3437:1: ( () )
            {
            // InternalMGLang.g:3437:1: ( () )
            // InternalMGLang.g:3438:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
            }
            // InternalMGLang.g:3439:2: ()
            // InternalMGLang.g:3439:3: 
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
    // InternalMGLang.g:3447:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3451:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:3452:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMGLang.g:3459:1: rule__Generator__Group__1__Impl : ( 'gen' ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3463:1: ( ( 'gen' ) )
            // InternalMGLang.g:3464:1: ( 'gen' )
            {
            // InternalMGLang.g:3464:1: ( 'gen' )
            // InternalMGLang.g:3465:2: 'gen'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGenKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3474:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3478:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:3479:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMGLang.g:3486:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3490:1: ( ( '(' ) )
            // InternalMGLang.g:3491:1: ( '(' )
            {
            // InternalMGLang.g:3491:1: ( '(' )
            // InternalMGLang.g:3492:2: '('
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
    // InternalMGLang.g:3501:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3505:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:3506:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalMGLang.g:3513:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__ParamsAssignment_3 )* ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3517:1: ( ( ( rule__Generator__ParamsAssignment_3 )* ) )
            // InternalMGLang.g:3518:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            {
            // InternalMGLang.g:3518:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            // InternalMGLang.g:3519:2: ( rule__Generator__ParamsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getParamsAssignment_3()); 
            }
            // InternalMGLang.g:3520:2: ( rule__Generator__ParamsAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=17 && LA31_0<=20)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMGLang.g:3520:3: rule__Generator__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Generator__ParamsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalMGLang.g:3528:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3532:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:3533:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:3540:1: rule__Generator__Group__4__Impl : ( ')' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3544:1: ( ( ')' ) )
            // InternalMGLang.g:3545:1: ( ')' )
            {
            // InternalMGLang.g:3545:1: ( ')' )
            // InternalMGLang.g:3546:2: ')'
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
    // InternalMGLang.g:3555:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3559:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:3560:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalMGLang.g:3567:1: rule__Generator__Group__5__Impl : ( '{' ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3571:1: ( ( '{' ) )
            // InternalMGLang.g:3572:1: ( '{' )
            {
            // InternalMGLang.g:3572:1: ( '{' )
            // InternalMGLang.g:3573:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3582:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl rule__Generator__Group__7 ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3586:1: ( rule__Generator__Group__6__Impl rule__Generator__Group__7 )
            // InternalMGLang.g:3587:2: rule__Generator__Group__6__Impl rule__Generator__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalMGLang.g:3594:1: rule__Generator__Group__6__Impl : ( ( rule__Generator__CommandsAssignment_6 )* ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3598:1: ( ( ( rule__Generator__CommandsAssignment_6 )* ) )
            // InternalMGLang.g:3599:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            {
            // InternalMGLang.g:3599:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            // InternalMGLang.g:3600:2: ( rule__Generator__CommandsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommandsAssignment_6()); 
            }
            // InternalMGLang.g:3601:2: ( rule__Generator__CommandsAssignment_6 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==48||LA32_0==50||LA32_0==55||LA32_0==58) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMGLang.g:3601:3: rule__Generator__CommandsAssignment_6
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Generator__CommandsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalMGLang.g:3609:1: rule__Generator__Group__7 : rule__Generator__Group__7__Impl ;
    public final void rule__Generator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3613:1: ( rule__Generator__Group__7__Impl )
            // InternalMGLang.g:3614:2: rule__Generator__Group__7__Impl
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
    // InternalMGLang.g:3620:1: rule__Generator__Group__7__Impl : ( '}' ) ;
    public final void rule__Generator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3624:1: ( ( '}' ) )
            // InternalMGLang.g:3625:1: ( '}' )
            {
            // InternalMGLang.g:3625:1: ( '}' )
            // InternalMGLang.g:3626:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__PatternObjectCreation__Group__0"
    // InternalMGLang.g:3636:1: rule__PatternObjectCreation__Group__0 : rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 ;
    public final void rule__PatternObjectCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3640:1: ( rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 )
            // InternalMGLang.g:3641:2: rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__PatternObjectCreation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__Group__1();

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
    // $ANTLR end "rule__PatternObjectCreation__Group__0"


    // $ANTLR start "rule__PatternObjectCreation__Group__0__Impl"
    // InternalMGLang.g:3648:1: rule__PatternObjectCreation__Group__0__Impl : ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) ;
    public final void rule__PatternObjectCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3652:1: ( ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) )
            // InternalMGLang.g:3653:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            {
            // InternalMGLang.g:3653:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            // InternalMGLang.g:3654:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getPObjectAssignment_0()); 
            }
            // InternalMGLang.g:3655:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            // InternalMGLang.g:3655:3: rule__PatternObjectCreation__PObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__PObjectAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectCreationAccess().getPObjectAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__0__Impl"


    // $ANTLR start "rule__PatternObjectCreation__Group__1"
    // InternalMGLang.g:3663:1: rule__PatternObjectCreation__Group__1 : rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 ;
    public final void rule__PatternObjectCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3667:1: ( rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 )
            // InternalMGLang.g:3668:2: rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PatternObjectCreation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__Group__2();

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
    // $ANTLR end "rule__PatternObjectCreation__Group__1"


    // $ANTLR start "rule__PatternObjectCreation__Group__1__Impl"
    // InternalMGLang.g:3675:1: rule__PatternObjectCreation__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternObjectCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3679:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3680:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3680:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3681:2: RULE_ASSIGNMENT_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 
            }
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectCreationAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__1__Impl"


    // $ANTLR start "rule__PatternObjectCreation__Group__2"
    // InternalMGLang.g:3690:1: rule__PatternObjectCreation__Group__2 : rule__PatternObjectCreation__Group__2__Impl ;
    public final void rule__PatternObjectCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3694:1: ( rule__PatternObjectCreation__Group__2__Impl )
            // InternalMGLang.g:3695:2: rule__PatternObjectCreation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__Group__2__Impl();

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
    // $ANTLR end "rule__PatternObjectCreation__Group__2"


    // $ANTLR start "rule__PatternObjectCreation__Group__2__Impl"
    // InternalMGLang.g:3701:1: rule__PatternObjectCreation__Group__2__Impl : ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) ;
    public final void rule__PatternObjectCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3705:1: ( ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) )
            // InternalMGLang.g:3706:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            {
            // InternalMGLang.g:3706:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            // InternalMGLang.g:3707:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getPatternCallAssignment_2()); 
            }
            // InternalMGLang.g:3708:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            // InternalMGLang.g:3708:3: rule__PatternObjectCreation__PatternCallAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternObjectCreation__PatternCallAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectCreationAccess().getPatternCallAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__Group__2__Impl"


    // $ANTLR start "rule__PatternObject__Group__0"
    // InternalMGLang.g:3717:1: rule__PatternObject__Group__0 : rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 ;
    public final void rule__PatternObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3721:1: ( rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 )
            // InternalMGLang.g:3722:2: rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PatternObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PatternObject__Group__1();

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
    // $ANTLR end "rule__PatternObject__Group__0"


    // $ANTLR start "rule__PatternObject__Group__0__Impl"
    // InternalMGLang.g:3729:1: rule__PatternObject__Group__0__Impl : ( ( rule__PatternObject__TypeAssignment_0 ) ) ;
    public final void rule__PatternObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3733:1: ( ( ( rule__PatternObject__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3734:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3734:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            // InternalMGLang.g:3735:2: ( rule__PatternObject__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3736:2: ( rule__PatternObject__TypeAssignment_0 )
            // InternalMGLang.g:3736:3: rule__PatternObject__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternObject__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__Group__0__Impl"


    // $ANTLR start "rule__PatternObject__Group__1"
    // InternalMGLang.g:3744:1: rule__PatternObject__Group__1 : rule__PatternObject__Group__1__Impl ;
    public final void rule__PatternObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3748:1: ( rule__PatternObject__Group__1__Impl )
            // InternalMGLang.g:3749:2: rule__PatternObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternObject__Group__1__Impl();

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
    // $ANTLR end "rule__PatternObject__Group__1"


    // $ANTLR start "rule__PatternObject__Group__1__Impl"
    // InternalMGLang.g:3755:1: rule__PatternObject__Group__1__Impl : ( ( rule__PatternObject__NameAssignment_1 ) ) ;
    public final void rule__PatternObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3759:1: ( ( ( rule__PatternObject__NameAssignment_1 ) ) )
            // InternalMGLang.g:3760:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3760:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            // InternalMGLang.g:3761:2: ( rule__PatternObject__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:3762:2: ( rule__PatternObject__NameAssignment_1 )
            // InternalMGLang.g:3762:3: rule__PatternObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternObject__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__Group__1__Impl"


    // $ANTLR start "rule__ForStatement__Group__0"
    // InternalMGLang.g:3771:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3775:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalMGLang.g:3776:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:3783:1: rule__ForStatement__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3787:1: ( ( 'for' ) )
            // InternalMGLang.g:3788:1: ( 'for' )
            {
            // InternalMGLang.g:3788:1: ( 'for' )
            // InternalMGLang.g:3789:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getForKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3798:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3802:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalMGLang.g:3803:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:3810:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__HeadAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3814:1: ( ( ( rule__ForStatement__HeadAssignment_1 ) ) )
            // InternalMGLang.g:3815:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            {
            // InternalMGLang.g:3815:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            // InternalMGLang.g:3816:2: ( rule__ForStatement__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getHeadAssignment_1()); 
            }
            // InternalMGLang.g:3817:2: ( rule__ForStatement__HeadAssignment_1 )
            // InternalMGLang.g:3817:3: rule__ForStatement__HeadAssignment_1
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
    // InternalMGLang.g:3825:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3829:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalMGLang.g:3830:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalMGLang.g:3837:1: rule__ForStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3841:1: ( ( '{' ) )
            // InternalMGLang.g:3842:1: ( '{' )
            {
            // InternalMGLang.g:3842:1: ( '{' )
            // InternalMGLang.g:3843:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3852:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3856:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalMGLang.g:3857:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMGLang.g:3864:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__BodyAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3868:1: ( ( ( rule__ForStatement__BodyAssignment_3 ) ) )
            // InternalMGLang.g:3869:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:3869:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            // InternalMGLang.g:3870:2: ( rule__ForStatement__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getBodyAssignment_3()); 
            }
            // InternalMGLang.g:3871:2: ( rule__ForStatement__BodyAssignment_3 )
            // InternalMGLang.g:3871:3: rule__ForStatement__BodyAssignment_3
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
    // InternalMGLang.g:3879:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3883:1: ( rule__ForStatement__Group__4__Impl )
            // InternalMGLang.g:3884:2: rule__ForStatement__Group__4__Impl
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
    // InternalMGLang.g:3890:1: rule__ForStatement__Group__4__Impl : ( '}' ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3894:1: ( ( '}' ) )
            // InternalMGLang.g:3895:1: ( '}' )
            {
            // InternalMGLang.g:3895:1: ( '}' )
            // InternalMGLang.g:3896:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3906:1: rule__GeneralForHead__Group__0 : rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 ;
    public final void rule__GeneralForHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3910:1: ( rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 )
            // InternalMGLang.g:3911:2: rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMGLang.g:3918:1: rule__GeneralForHead__Group__0__Impl : ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) ;
    public final void rule__GeneralForHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3922:1: ( ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) )
            // InternalMGLang.g:3923:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            {
            // InternalMGLang.g:3923:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            // InternalMGLang.g:3924:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getIteratorVarAssignment_0()); 
            }
            // InternalMGLang.g:3925:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            // InternalMGLang.g:3925:3: rule__GeneralForHead__IteratorVarAssignment_0
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
    // InternalMGLang.g:3933:1: rule__GeneralForHead__Group__1 : rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 ;
    public final void rule__GeneralForHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3937:1: ( rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 )
            // InternalMGLang.g:3938:2: rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMGLang.g:3945:1: rule__GeneralForHead__Group__1__Impl : ( 'in' ) ;
    public final void rule__GeneralForHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3949:1: ( ( 'in' ) )
            // InternalMGLang.g:3950:1: ( 'in' )
            {
            // InternalMGLang.g:3950:1: ( 'in' )
            // InternalMGLang.g:3951:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getInKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3960:1: rule__GeneralForHead__Group__2 : rule__GeneralForHead__Group__2__Impl ;
    public final void rule__GeneralForHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3964:1: ( rule__GeneralForHead__Group__2__Impl )
            // InternalMGLang.g:3965:2: rule__GeneralForHead__Group__2__Impl
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
    // InternalMGLang.g:3971:1: rule__GeneralForHead__Group__2__Impl : ( ( rule__GeneralForHead__RangeAssignment_2 ) ) ;
    public final void rule__GeneralForHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3975:1: ( ( ( rule__GeneralForHead__RangeAssignment_2 ) ) )
            // InternalMGLang.g:3976:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            {
            // InternalMGLang.g:3976:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            // InternalMGLang.g:3977:2: ( rule__GeneralForHead__RangeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getRangeAssignment_2()); 
            }
            // InternalMGLang.g:3978:2: ( rule__GeneralForHead__RangeAssignment_2 )
            // InternalMGLang.g:3978:3: rule__GeneralForHead__RangeAssignment_2
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
    // InternalMGLang.g:3987:1: rule__ForEachHead__Group__0 : rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 ;
    public final void rule__ForEachHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3991:1: ( rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 )
            // InternalMGLang.g:3992:2: rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMGLang.g:3999:1: rule__ForEachHead__Group__0__Impl : ( ( rule__ForEachHead__SrcAssignment_0 ) ) ;
    public final void rule__ForEachHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4003:1: ( ( ( rule__ForEachHead__SrcAssignment_0 ) ) )
            // InternalMGLang.g:4004:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            {
            // InternalMGLang.g:4004:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            // InternalMGLang.g:4005:2: ( rule__ForEachHead__SrcAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getSrcAssignment_0()); 
            }
            // InternalMGLang.g:4006:2: ( rule__ForEachHead__SrcAssignment_0 )
            // InternalMGLang.g:4006:3: rule__ForEachHead__SrcAssignment_0
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
    // InternalMGLang.g:4014:1: rule__ForEachHead__Group__1 : rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 ;
    public final void rule__ForEachHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4018:1: ( rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 )
            // InternalMGLang.g:4019:2: rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:4026:1: rule__ForEachHead__Group__1__Impl : ( '-' ) ;
    public final void rule__ForEachHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4030:1: ( ( '-' ) )
            // InternalMGLang.g:4031:1: ( '-' )
            {
            // InternalMGLang.g:4031:1: ( '-' )
            // InternalMGLang.g:4032:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4041:1: rule__ForEachHead__Group__2 : rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 ;
    public final void rule__ForEachHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4045:1: ( rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 )
            // InternalMGLang.g:4046:2: rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMGLang.g:4053:1: rule__ForEachHead__Group__2__Impl : ( ( rule__ForEachHead__ErefAssignment_2 ) ) ;
    public final void rule__ForEachHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4057:1: ( ( ( rule__ForEachHead__ErefAssignment_2 ) ) )
            // InternalMGLang.g:4058:1: ( ( rule__ForEachHead__ErefAssignment_2 ) )
            {
            // InternalMGLang.g:4058:1: ( ( rule__ForEachHead__ErefAssignment_2 ) )
            // InternalMGLang.g:4059:2: ( rule__ForEachHead__ErefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getErefAssignment_2()); 
            }
            // InternalMGLang.g:4060:2: ( rule__ForEachHead__ErefAssignment_2 )
            // InternalMGLang.g:4060:3: rule__ForEachHead__ErefAssignment_2
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
    // InternalMGLang.g:4068:1: rule__ForEachHead__Group__3 : rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 ;
    public final void rule__ForEachHead__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4072:1: ( rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 )
            // InternalMGLang.g:4073:2: rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:4080:1: rule__ForEachHead__Group__3__Impl : ( '->' ) ;
    public final void rule__ForEachHead__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4084:1: ( ( '->' ) )
            // InternalMGLang.g:4085:1: ( '->' )
            {
            // InternalMGLang.g:4085:1: ( '->' )
            // InternalMGLang.g:4086:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4095:1: rule__ForEachHead__Group__4 : rule__ForEachHead__Group__4__Impl ;
    public final void rule__ForEachHead__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4099:1: ( rule__ForEachHead__Group__4__Impl )
            // InternalMGLang.g:4100:2: rule__ForEachHead__Group__4__Impl
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
    // InternalMGLang.g:4106:1: rule__ForEachHead__Group__4__Impl : ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) ;
    public final void rule__ForEachHead__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4110:1: ( ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) )
            // InternalMGLang.g:4111:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            {
            // InternalMGLang.g:4111:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            // InternalMGLang.g:4112:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getIteratorVarAssignment_4()); 
            }
            // InternalMGLang.g:4113:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            // InternalMGLang.g:4113:3: rule__ForEachHead__IteratorVarAssignment_4
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
    // InternalMGLang.g:4122:1: rule__ForBody__Group__0 : rule__ForBody__Group__0__Impl rule__ForBody__Group__1 ;
    public final void rule__ForBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4126:1: ( rule__ForBody__Group__0__Impl rule__ForBody__Group__1 )
            // InternalMGLang.g:4127:2: rule__ForBody__Group__0__Impl rule__ForBody__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMGLang.g:4134:1: rule__ForBody__Group__0__Impl : ( () ) ;
    public final void rule__ForBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4138:1: ( ( () ) )
            // InternalMGLang.g:4139:1: ( () )
            {
            // InternalMGLang.g:4139:1: ( () )
            // InternalMGLang.g:4140:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getForBodyAction_0()); 
            }
            // InternalMGLang.g:4141:2: ()
            // InternalMGLang.g:4141:3: 
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
    // InternalMGLang.g:4149:1: rule__ForBody__Group__1 : rule__ForBody__Group__1__Impl ;
    public final void rule__ForBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4153:1: ( rule__ForBody__Group__1__Impl )
            // InternalMGLang.g:4154:2: rule__ForBody__Group__1__Impl
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
    // InternalMGLang.g:4160:1: rule__ForBody__Group__1__Impl : ( ( rule__ForBody__CommandsAssignment_1 )* ) ;
    public final void rule__ForBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4164:1: ( ( ( rule__ForBody__CommandsAssignment_1 )* ) )
            // InternalMGLang.g:4165:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            {
            // InternalMGLang.g:4165:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            // InternalMGLang.g:4166:2: ( rule__ForBody__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getCommandsAssignment_1()); 
            }
            // InternalMGLang.g:4167:2: ( rule__ForBody__CommandsAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==48||LA33_0==50||LA33_0==55||LA33_0==58) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMGLang.g:4167:3: rule__ForBody__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ForBody__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMGLang.g:4176:1: rule__IfElseSwitch__Group__0 : rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1 ;
    public final void rule__IfElseSwitch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4180:1: ( rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1 )
            // InternalMGLang.g:4181:2: rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:4188:1: rule__IfElseSwitch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__IfElseSwitch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4192:1: ( ( 'switch' ) )
            // InternalMGLang.g:4193:1: ( 'switch' )
            {
            // InternalMGLang.g:4193:1: ( 'switch' )
            // InternalMGLang.g:4194:2: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getSwitchKeyword_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4203:1: rule__IfElseSwitch__Group__1 : rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2 ;
    public final void rule__IfElseSwitch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4207:1: ( rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2 )
            // InternalMGLang.g:4208:2: rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMGLang.g:4215:1: rule__IfElseSwitch__Group__1__Impl : ( '{' ) ;
    public final void rule__IfElseSwitch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4219:1: ( ( '{' ) )
            // InternalMGLang.g:4220:1: ( '{' )
            {
            // InternalMGLang.g:4220:1: ( '{' )
            // InternalMGLang.g:4221:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4230:1: rule__IfElseSwitch__Group__2 : rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3 ;
    public final void rule__IfElseSwitch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4234:1: ( rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3 )
            // InternalMGLang.g:4235:2: rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalMGLang.g:4242:1: rule__IfElseSwitch__Group__2__Impl : ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) ) ;
    public final void rule__IfElseSwitch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4246:1: ( ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) ) )
            // InternalMGLang.g:4247:1: ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) )
            {
            // InternalMGLang.g:4247:1: ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) )
            // InternalMGLang.g:4248:2: ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* )
            {
            // InternalMGLang.g:4248:2: ( ( rule__IfElseSwitch__CasesAssignment_2 ) )
            // InternalMGLang.g:4249:3: ( rule__IfElseSwitch__CasesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            }
            // InternalMGLang.g:4250:3: ( rule__IfElseSwitch__CasesAssignment_2 )
            // InternalMGLang.g:4250:4: rule__IfElseSwitch__CasesAssignment_2
            {
            pushFollow(FOLLOW_38);
            rule__IfElseSwitch__CasesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            }

            }

            // InternalMGLang.g:4253:2: ( ( rule__IfElseSwitch__CasesAssignment_2 )* )
            // InternalMGLang.g:4254:3: ( rule__IfElseSwitch__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            }
            // InternalMGLang.g:4255:3: ( rule__IfElseSwitch__CasesAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==51) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMGLang.g:4255:4: rule__IfElseSwitch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__IfElseSwitch__CasesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalMGLang.g:4264:1: rule__IfElseSwitch__Group__3 : rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4 ;
    public final void rule__IfElseSwitch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4268:1: ( rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4 )
            // InternalMGLang.g:4269:2: rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMGLang.g:4276:1: rule__IfElseSwitch__Group__3__Impl : ( ( rule__IfElseSwitch__DefaultAssignment_3 )? ) ;
    public final void rule__IfElseSwitch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4280:1: ( ( ( rule__IfElseSwitch__DefaultAssignment_3 )? ) )
            // InternalMGLang.g:4281:1: ( ( rule__IfElseSwitch__DefaultAssignment_3 )? )
            {
            // InternalMGLang.g:4281:1: ( ( rule__IfElseSwitch__DefaultAssignment_3 )? )
            // InternalMGLang.g:4282:2: ( rule__IfElseSwitch__DefaultAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getDefaultAssignment_3()); 
            }
            // InternalMGLang.g:4283:2: ( rule__IfElseSwitch__DefaultAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMGLang.g:4283:3: rule__IfElseSwitch__DefaultAssignment_3
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
    // InternalMGLang.g:4291:1: rule__IfElseSwitch__Group__4 : rule__IfElseSwitch__Group__4__Impl ;
    public final void rule__IfElseSwitch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4295:1: ( rule__IfElseSwitch__Group__4__Impl )
            // InternalMGLang.g:4296:2: rule__IfElseSwitch__Group__4__Impl
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
    // InternalMGLang.g:4302:1: rule__IfElseSwitch__Group__4__Impl : ( '}' ) ;
    public final void rule__IfElseSwitch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4306:1: ( ( '}' ) )
            // InternalMGLang.g:4307:1: ( '}' )
            {
            // InternalMGLang.g:4307:1: ( '}' )
            // InternalMGLang.g:4308:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseSwitchAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4318:1: rule__IfElseCase__Group__0 : rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1 ;
    public final void rule__IfElseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4322:1: ( rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1 )
            // InternalMGLang.g:4323:2: rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:4330:1: rule__IfElseCase__Group__0__Impl : ( 'case' ) ;
    public final void rule__IfElseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4334:1: ( ( 'case' ) )
            // InternalMGLang.g:4335:1: ( 'case' )
            {
            // InternalMGLang.g:4335:1: ( 'case' )
            // InternalMGLang.g:4336:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getCaseKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4345:1: rule__IfElseCase__Group__1 : rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2 ;
    public final void rule__IfElseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4349:1: ( rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2 )
            // InternalMGLang.g:4350:2: rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalMGLang.g:4357:1: rule__IfElseCase__Group__1__Impl : ( ( rule__IfElseCase__ValAssignment_1 ) ) ;
    public final void rule__IfElseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4361:1: ( ( ( rule__IfElseCase__ValAssignment_1 ) ) )
            // InternalMGLang.g:4362:1: ( ( rule__IfElseCase__ValAssignment_1 ) )
            {
            // InternalMGLang.g:4362:1: ( ( rule__IfElseCase__ValAssignment_1 ) )
            // InternalMGLang.g:4363:2: ( rule__IfElseCase__ValAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getValAssignment_1()); 
            }
            // InternalMGLang.g:4364:2: ( rule__IfElseCase__ValAssignment_1 )
            // InternalMGLang.g:4364:3: rule__IfElseCase__ValAssignment_1
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
    // InternalMGLang.g:4372:1: rule__IfElseCase__Group__2 : rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3 ;
    public final void rule__IfElseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4376:1: ( rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3 )
            // InternalMGLang.g:4377:2: rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalMGLang.g:4384:1: rule__IfElseCase__Group__2__Impl : ( ':' ) ;
    public final void rule__IfElseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4388:1: ( ( ':' ) )
            // InternalMGLang.g:4389:1: ( ':' )
            {
            // InternalMGLang.g:4389:1: ( ':' )
            // InternalMGLang.g:4390:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getColonKeyword_2()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4399:1: rule__IfElseCase__Group__3 : rule__IfElseCase__Group__3__Impl ;
    public final void rule__IfElseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4403:1: ( rule__IfElseCase__Group__3__Impl )
            // InternalMGLang.g:4404:2: rule__IfElseCase__Group__3__Impl
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
    // InternalMGLang.g:4410:1: rule__IfElseCase__Group__3__Impl : ( ( rule__IfElseCase__BodyAssignment_3 ) ) ;
    public final void rule__IfElseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4414:1: ( ( ( rule__IfElseCase__BodyAssignment_3 ) ) )
            // InternalMGLang.g:4415:1: ( ( rule__IfElseCase__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:4415:1: ( ( rule__IfElseCase__BodyAssignment_3 ) )
            // InternalMGLang.g:4416:2: ( rule__IfElseCase__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseCaseAccess().getBodyAssignment_3()); 
            }
            // InternalMGLang.g:4417:2: ( rule__IfElseCase__BodyAssignment_3 )
            // InternalMGLang.g:4417:3: rule__IfElseCase__BodyAssignment_3
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
    // InternalMGLang.g:4426:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4430:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalMGLang.g:4431:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMGLang.g:4438:1: rule__Default__Group__0__Impl : ( 'default' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4442:1: ( ( 'default' ) )
            // InternalMGLang.g:4443:1: ( 'default' )
            {
            // InternalMGLang.g:4443:1: ( 'default' )
            // InternalMGLang.g:4444:2: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4453:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4457:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalMGLang.g:4458:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalMGLang.g:4465:1: rule__Default__Group__1__Impl : ( ':' ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4469:1: ( ( ':' ) )
            // InternalMGLang.g:4470:1: ( ':' )
            {
            // InternalMGLang.g:4470:1: ( ':' )
            // InternalMGLang.g:4471:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getColonKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4480:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4484:1: ( rule__Default__Group__2__Impl )
            // InternalMGLang.g:4485:2: rule__Default__Group__2__Impl
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
    // InternalMGLang.g:4491:1: rule__Default__Group__2__Impl : ( ruleCaseBody ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4495:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:4496:1: ( ruleCaseBody )
            {
            // InternalMGLang.g:4496:1: ( ruleCaseBody )
            // InternalMGLang.g:4497:2: ruleCaseBody
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
    // InternalMGLang.g:4507:1: rule__SwitchCase__Group__0 : rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 ;
    public final void rule__SwitchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4511:1: ( rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 )
            // InternalMGLang.g:4512:2: rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMGLang.g:4519:1: rule__SwitchCase__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4523:1: ( ( 'switch' ) )
            // InternalMGLang.g:4524:1: ( 'switch' )
            {
            // InternalMGLang.g:4524:1: ( 'switch' )
            // InternalMGLang.g:4525:2: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4534:1: rule__SwitchCase__Group__1 : rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 ;
    public final void rule__SwitchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4538:1: ( rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 )
            // InternalMGLang.g:4539:2: rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:4546:1: rule__SwitchCase__Group__1__Impl : ( '(' ) ;
    public final void rule__SwitchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4550:1: ( ( '(' ) )
            // InternalMGLang.g:4551:1: ( '(' )
            {
            // InternalMGLang.g:4551:1: ( '(' )
            // InternalMGLang.g:4552:2: '('
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
    // InternalMGLang.g:4561:1: rule__SwitchCase__Group__2 : rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 ;
    public final void rule__SwitchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4565:1: ( rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 )
            // InternalMGLang.g:4566:2: rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:4573:1: rule__SwitchCase__Group__2__Impl : ( ( rule__SwitchCase__AttributeAssignment_2 ) ) ;
    public final void rule__SwitchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4577:1: ( ( ( rule__SwitchCase__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:4578:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:4578:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            // InternalMGLang.g:4579:2: ( rule__SwitchCase__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getAttributeAssignment_2()); 
            }
            // InternalMGLang.g:4580:2: ( rule__SwitchCase__AttributeAssignment_2 )
            // InternalMGLang.g:4580:3: rule__SwitchCase__AttributeAssignment_2
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
    // InternalMGLang.g:4588:1: rule__SwitchCase__Group__3 : rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 ;
    public final void rule__SwitchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4592:1: ( rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 )
            // InternalMGLang.g:4593:2: rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:4600:1: rule__SwitchCase__Group__3__Impl : ( ')' ) ;
    public final void rule__SwitchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4604:1: ( ( ')' ) )
            // InternalMGLang.g:4605:1: ( ')' )
            {
            // InternalMGLang.g:4605:1: ( ')' )
            // InternalMGLang.g:4606:2: ')'
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
    // InternalMGLang.g:4615:1: rule__SwitchCase__Group__4 : rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 ;
    public final void rule__SwitchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4619:1: ( rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 )
            // InternalMGLang.g:4620:2: rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalMGLang.g:4627:1: rule__SwitchCase__Group__4__Impl : ( '{' ) ;
    public final void rule__SwitchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4631:1: ( ( '{' ) )
            // InternalMGLang.g:4632:1: ( '{' )
            {
            // InternalMGLang.g:4632:1: ( '{' )
            // InternalMGLang.g:4633:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4642:1: rule__SwitchCase__Group__5 : rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 ;
    public final void rule__SwitchCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4646:1: ( rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 )
            // InternalMGLang.g:4647:2: rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalMGLang.g:4654:1: rule__SwitchCase__Group__5__Impl : ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) ;
    public final void rule__SwitchCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4658:1: ( ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) )
            // InternalMGLang.g:4659:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            {
            // InternalMGLang.g:4659:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            // InternalMGLang.g:4660:2: ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* )
            {
            // InternalMGLang.g:4660:2: ( ( rule__SwitchCase__CasesAssignment_5 ) )
            // InternalMGLang.g:4661:3: ( rule__SwitchCase__CasesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }
            // InternalMGLang.g:4662:3: ( rule__SwitchCase__CasesAssignment_5 )
            // InternalMGLang.g:4662:4: rule__SwitchCase__CasesAssignment_5
            {
            pushFollow(FOLLOW_38);
            rule__SwitchCase__CasesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }

            }

            // InternalMGLang.g:4665:2: ( ( rule__SwitchCase__CasesAssignment_5 )* )
            // InternalMGLang.g:4666:3: ( rule__SwitchCase__CasesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }
            // InternalMGLang.g:4667:3: ( rule__SwitchCase__CasesAssignment_5 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==51) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMGLang.g:4667:4: rule__SwitchCase__CasesAssignment_5
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__SwitchCase__CasesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalMGLang.g:4676:1: rule__SwitchCase__Group__6 : rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7 ;
    public final void rule__SwitchCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4680:1: ( rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7 )
            // InternalMGLang.g:4681:2: rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalMGLang.g:4688:1: rule__SwitchCase__Group__6__Impl : ( ( rule__SwitchCase__DefaultAssignment_6 )? ) ;
    public final void rule__SwitchCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4692:1: ( ( ( rule__SwitchCase__DefaultAssignment_6 )? ) )
            // InternalMGLang.g:4693:1: ( ( rule__SwitchCase__DefaultAssignment_6 )? )
            {
            // InternalMGLang.g:4693:1: ( ( rule__SwitchCase__DefaultAssignment_6 )? )
            // InternalMGLang.g:4694:2: ( rule__SwitchCase__DefaultAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getDefaultAssignment_6()); 
            }
            // InternalMGLang.g:4695:2: ( rule__SwitchCase__DefaultAssignment_6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMGLang.g:4695:3: rule__SwitchCase__DefaultAssignment_6
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
    // InternalMGLang.g:4703:1: rule__SwitchCase__Group__7 : rule__SwitchCase__Group__7__Impl ;
    public final void rule__SwitchCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4707:1: ( rule__SwitchCase__Group__7__Impl )
            // InternalMGLang.g:4708:2: rule__SwitchCase__Group__7__Impl
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
    // InternalMGLang.g:4714:1: rule__SwitchCase__Group__7__Impl : ( '}' ) ;
    public final void rule__SwitchCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4718:1: ( ( '}' ) )
            // InternalMGLang.g:4719:1: ( '}' )
            {
            // InternalMGLang.g:4719:1: ( '}' )
            // InternalMGLang.g:4720:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Case__Group__0"
    // InternalMGLang.g:4730:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4734:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalMGLang.g:4735:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Case__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group__1();

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
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // InternalMGLang.g:4742:1: rule__Case__Group__0__Impl : ( 'case' ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4746:1: ( ( 'case' ) )
            // InternalMGLang.g:4747:1: ( 'case' )
            {
            // InternalMGLang.g:4747:1: ( 'case' )
            // InternalMGLang.g:4748:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getCaseKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getCaseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // InternalMGLang.g:4757:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4761:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalMGLang.g:4762:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Case__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group__2();

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
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // InternalMGLang.g:4769:1: rule__Case__Group__1__Impl : ( ( rule__Case__NodeAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4773:1: ( ( ( rule__Case__NodeAssignment_1 ) ) )
            // InternalMGLang.g:4774:1: ( ( rule__Case__NodeAssignment_1 ) )
            {
            // InternalMGLang.g:4774:1: ( ( rule__Case__NodeAssignment_1 ) )
            // InternalMGLang.g:4775:2: ( rule__Case__NodeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getNodeAssignment_1()); 
            }
            // InternalMGLang.g:4776:2: ( rule__Case__NodeAssignment_1 )
            // InternalMGLang.g:4776:3: rule__Case__NodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Case__NodeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getNodeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // InternalMGLang.g:4784:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4788:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalMGLang.g:4789:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Case__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group__3();

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
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // InternalMGLang.g:4796:1: rule__Case__Group__2__Impl : ( ( rule__Case__Group_2__0 )? ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4800:1: ( ( ( rule__Case__Group_2__0 )? ) )
            // InternalMGLang.g:4801:1: ( ( rule__Case__Group_2__0 )? )
            {
            // InternalMGLang.g:4801:1: ( ( rule__Case__Group_2__0 )? )
            // InternalMGLang.g:4802:2: ( rule__Case__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getGroup_2()); 
            }
            // InternalMGLang.g:4803:2: ( rule__Case__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMGLang.g:4803:3: rule__Case__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Case__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__3"
    // InternalMGLang.g:4811:1: rule__Case__Group__3 : rule__Case__Group__3__Impl rule__Case__Group__4 ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4815:1: ( rule__Case__Group__3__Impl rule__Case__Group__4 )
            // InternalMGLang.g:4816:2: rule__Case__Group__3__Impl rule__Case__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Case__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group__4();

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
    // $ANTLR end "rule__Case__Group__3"


    // $ANTLR start "rule__Case__Group__3__Impl"
    // InternalMGLang.g:4823:1: rule__Case__Group__3__Impl : ( ':' ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4827:1: ( ( ':' ) )
            // InternalMGLang.g:4828:1: ( ':' )
            {
            // InternalMGLang.g:4828:1: ( ':' )
            // InternalMGLang.g:4829:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getColonKeyword_3()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3__Impl"


    // $ANTLR start "rule__Case__Group__4"
    // InternalMGLang.g:4838:1: rule__Case__Group__4 : rule__Case__Group__4__Impl ;
    public final void rule__Case__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4842:1: ( rule__Case__Group__4__Impl )
            // InternalMGLang.g:4843:2: rule__Case__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__4__Impl();

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
    // $ANTLR end "rule__Case__Group__4"


    // $ANTLR start "rule__Case__Group__4__Impl"
    // InternalMGLang.g:4849:1: rule__Case__Group__4__Impl : ( ( rule__Case__BodyAssignment_4 ) ) ;
    public final void rule__Case__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4853:1: ( ( ( rule__Case__BodyAssignment_4 ) ) )
            // InternalMGLang.g:4854:1: ( ( rule__Case__BodyAssignment_4 ) )
            {
            // InternalMGLang.g:4854:1: ( ( rule__Case__BodyAssignment_4 ) )
            // InternalMGLang.g:4855:2: ( rule__Case__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getBodyAssignment_4()); 
            }
            // InternalMGLang.g:4856:2: ( rule__Case__BodyAssignment_4 )
            // InternalMGLang.g:4856:3: rule__Case__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Case__BodyAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getBodyAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4__Impl"


    // $ANTLR start "rule__Case__Group_2__0"
    // InternalMGLang.g:4865:1: rule__Case__Group_2__0 : rule__Case__Group_2__0__Impl rule__Case__Group_2__1 ;
    public final void rule__Case__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4869:1: ( rule__Case__Group_2__0__Impl rule__Case__Group_2__1 )
            // InternalMGLang.g:4870:2: rule__Case__Group_2__0__Impl rule__Case__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Case__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case__Group_2__1();

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
    // $ANTLR end "rule__Case__Group_2__0"


    // $ANTLR start "rule__Case__Group_2__0__Impl"
    // InternalMGLang.g:4877:1: rule__Case__Group_2__0__Impl : ( 'when' ) ;
    public final void rule__Case__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4881:1: ( ( 'when' ) )
            // InternalMGLang.g:4882:1: ( 'when' )
            {
            // InternalMGLang.g:4882:1: ( 'when' )
            // InternalMGLang.g:4883:2: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getWhenKeyword_2_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getWhenKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_2__0__Impl"


    // $ANTLR start "rule__Case__Group_2__1"
    // InternalMGLang.g:4892:1: rule__Case__Group_2__1 : rule__Case__Group_2__1__Impl ;
    public final void rule__Case__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4896:1: ( rule__Case__Group_2__1__Impl )
            // InternalMGLang.g:4897:2: rule__Case__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group_2__1__Impl();

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
    // $ANTLR end "rule__Case__Group_2__1"


    // $ANTLR start "rule__Case__Group_2__1__Impl"
    // InternalMGLang.g:4903:1: rule__Case__Group_2__1__Impl : ( ( rule__Case__WhenAssignment_2_1 ) ) ;
    public final void rule__Case__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4907:1: ( ( ( rule__Case__WhenAssignment_2_1 ) ) )
            // InternalMGLang.g:4908:1: ( ( rule__Case__WhenAssignment_2_1 ) )
            {
            // InternalMGLang.g:4908:1: ( ( rule__Case__WhenAssignment_2_1 ) )
            // InternalMGLang.g:4909:2: ( rule__Case__WhenAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getWhenAssignment_2_1()); 
            }
            // InternalMGLang.g:4910:2: ( rule__Case__WhenAssignment_2_1 )
            // InternalMGLang.g:4910:3: rule__Case__WhenAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Case__WhenAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getWhenAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_2__1__Impl"


    // $ANTLR start "rule__CaseBody__Group_0__0"
    // InternalMGLang.g:4919:1: rule__CaseBody__Group_0__0 : rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 ;
    public final void rule__CaseBody__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4923:1: ( rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 )
            // InternalMGLang.g:4924:2: rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMGLang.g:4931:1: rule__CaseBody__Group_0__0__Impl : ( () ) ;
    public final void rule__CaseBody__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4935:1: ( ( () ) )
            // InternalMGLang.g:4936:1: ( () )
            {
            // InternalMGLang.g:4936:1: ( () )
            // InternalMGLang.g:4937:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0()); 
            }
            // InternalMGLang.g:4938:2: ()
            // InternalMGLang.g:4938:3: 
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
    // InternalMGLang.g:4946:1: rule__CaseBody__Group_0__1 : rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 ;
    public final void rule__CaseBody__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4950:1: ( rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 )
            // InternalMGLang.g:4951:2: rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMGLang.g:4958:1: rule__CaseBody__Group_0__1__Impl : ( '{' ) ;
    public final void rule__CaseBody__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4962:1: ( ( '{' ) )
            // InternalMGLang.g:4963:1: ( '{' )
            {
            // InternalMGLang.g:4963:1: ( '{' )
            // InternalMGLang.g:4964:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getLeftCurlyBracketKeyword_0_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4973:1: rule__CaseBody__Group_0__2 : rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 ;
    public final void rule__CaseBody__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4977:1: ( rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 )
            // InternalMGLang.g:4978:2: rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMGLang.g:4985:1: rule__CaseBody__Group_0__2__Impl : ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) ;
    public final void rule__CaseBody__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4989:1: ( ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) )
            // InternalMGLang.g:4990:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            {
            // InternalMGLang.g:4990:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            // InternalMGLang.g:4991:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_0_2()); 
            }
            // InternalMGLang.g:4992:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==48||LA39_0==50||LA39_0==55||LA39_0==58) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMGLang.g:4992:3: rule__CaseBody__ExpressionsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__CaseBody__ExpressionsAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalMGLang.g:5000:1: rule__CaseBody__Group_0__3 : rule__CaseBody__Group_0__3__Impl ;
    public final void rule__CaseBody__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5004:1: ( rule__CaseBody__Group_0__3__Impl )
            // InternalMGLang.g:5005:2: rule__CaseBody__Group_0__3__Impl
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
    // InternalMGLang.g:5011:1: rule__CaseBody__Group_0__3__Impl : ( '}' ) ;
    public final void rule__CaseBody__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5015:1: ( ( '}' ) )
            // InternalMGLang.g:5016:1: ( '}' )
            {
            // InternalMGLang.g:5016:1: ( '}' )
            // InternalMGLang.g:5017:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getRightCurlyBracketKeyword_0_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5027:1: rule__CaseBody__Group_1__0 : rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1 ;
    public final void rule__CaseBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5031:1: ( rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1 )
            // InternalMGLang.g:5032:2: rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMGLang.g:5039:1: rule__CaseBody__Group_1__0__Impl : ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__CaseBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5043:1: ( ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) ) )
            // InternalMGLang.g:5044:1: ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) )
            {
            // InternalMGLang.g:5044:1: ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) )
            // InternalMGLang.g:5045:2: ( rule__CaseBody__ExpressionsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_1_0()); 
            }
            // InternalMGLang.g:5046:2: ( rule__CaseBody__ExpressionsAssignment_1_0 )
            // InternalMGLang.g:5046:3: rule__CaseBody__ExpressionsAssignment_1_0
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
    // InternalMGLang.g:5054:1: rule__CaseBody__Group_1__1 : rule__CaseBody__Group_1__1__Impl ;
    public final void rule__CaseBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5058:1: ( rule__CaseBody__Group_1__1__Impl )
            // InternalMGLang.g:5059:2: rule__CaseBody__Group_1__1__Impl
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
    // InternalMGLang.g:5065:1: rule__CaseBody__Group_1__1__Impl : ( RULE_NEWLINE ) ;
    public final void rule__CaseBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5069:1: ( ( RULE_NEWLINE ) )
            // InternalMGLang.g:5070:1: ( RULE_NEWLINE )
            {
            // InternalMGLang.g:5070:1: ( RULE_NEWLINE )
            // InternalMGLang.g:5071:2: RULE_NEWLINE
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
    // InternalMGLang.g:5081:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5085:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalMGLang.g:5086:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:5093:1: rule__List__Group__0__Impl : ( 'List' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5097:1: ( ( 'List' ) )
            // InternalMGLang.g:5098:1: ( 'List' )
            {
            // InternalMGLang.g:5098:1: ( 'List' )
            // InternalMGLang.g:5099:2: 'List'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5108:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5112:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalMGLang.g:5113:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:5120:1: rule__List__Group__1__Impl : ( ( rule__List__NameAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5124:1: ( ( ( rule__List__NameAssignment_1 ) ) )
            // InternalMGLang.g:5125:1: ( ( rule__List__NameAssignment_1 ) )
            {
            // InternalMGLang.g:5125:1: ( ( rule__List__NameAssignment_1 ) )
            // InternalMGLang.g:5126:2: ( rule__List__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:5127:2: ( rule__List__NameAssignment_1 )
            // InternalMGLang.g:5127:3: rule__List__NameAssignment_1
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
    // InternalMGLang.g:5135:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5139:1: ( rule__List__Group__2__Impl )
            // InternalMGLang.g:5140:2: rule__List__Group__2__Impl
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
    // InternalMGLang.g:5146:1: rule__List__Group__2__Impl : ( ( rule__List__Group_2__0 ) ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5150:1: ( ( ( rule__List__Group_2__0 ) ) )
            // InternalMGLang.g:5151:1: ( ( rule__List__Group_2__0 ) )
            {
            // InternalMGLang.g:5151:1: ( ( rule__List__Group_2__0 ) )
            // InternalMGLang.g:5152:2: ( rule__List__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup_2()); 
            }
            // InternalMGLang.g:5153:2: ( rule__List__Group_2__0 )
            // InternalMGLang.g:5153:3: rule__List__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalMGLang.g:5162:1: rule__List__Group_2__0 : rule__List__Group_2__0__Impl rule__List__Group_2__1 ;
    public final void rule__List__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5166:1: ( rule__List__Group_2__0__Impl rule__List__Group_2__1 )
            // InternalMGLang.g:5167:2: rule__List__Group_2__0__Impl rule__List__Group_2__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMGLang.g:5174:1: rule__List__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__List__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5178:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:5179:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:5179:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:5180:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:5189:1: rule__List__Group_2__1 : rule__List__Group_2__1__Impl ;
    public final void rule__List__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5193:1: ( rule__List__Group_2__1__Impl )
            // InternalMGLang.g:5194:2: rule__List__Group_2__1__Impl
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
    // InternalMGLang.g:5200:1: rule__List__Group_2__1__Impl : ( ruleListAssignment ) ;
    public final void rule__List__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5204:1: ( ( ruleListAssignment ) )
            // InternalMGLang.g:5205:1: ( ruleListAssignment )
            {
            // InternalMGLang.g:5205:1: ( ruleListAssignment )
            // InternalMGLang.g:5206:2: ruleListAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListAssignmentParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleListAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getListAssignmentParserRuleCall_2_1()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:5216:1: rule__ListAdHoc__Group__0 : rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 ;
    public final void rule__ListAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5220:1: ( rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 )
            // InternalMGLang.g:5221:2: rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalMGLang.g:5228:1: rule__ListAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__ListAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5232:1: ( ( '[' ) )
            // InternalMGLang.g:5233:1: ( '[' )
            {
            // InternalMGLang.g:5233:1: ( '[' )
            // InternalMGLang.g:5234:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5243:1: rule__ListAdHoc__Group__1 : rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 ;
    public final void rule__ListAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5247:1: ( rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 )
            // InternalMGLang.g:5248:2: rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMGLang.g:5255:1: rule__ListAdHoc__Group__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) ;
    public final void rule__ListAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5259:1: ( ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) )
            // InternalMGLang.g:5260:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            {
            // InternalMGLang.g:5260:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            // InternalMGLang.g:5261:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getElementsAssignment_1()); 
            }
            // InternalMGLang.g:5262:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            // InternalMGLang.g:5262:3: rule__ListAdHoc__ElementsAssignment_1
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
    // InternalMGLang.g:5270:1: rule__ListAdHoc__Group__2 : rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 ;
    public final void rule__ListAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5274:1: ( rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 )
            // InternalMGLang.g:5275:2: rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalMGLang.g:5282:1: rule__ListAdHoc__Group__2__Impl : ( ( rule__ListAdHoc__Group_2__0 )* ) ;
    public final void rule__ListAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5286:1: ( ( ( rule__ListAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:5287:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:5287:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            // InternalMGLang.g:5288:2: ( rule__ListAdHoc__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getGroup_2()); 
            }
            // InternalMGLang.g:5289:2: ( rule__ListAdHoc__Group_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==42) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMGLang.g:5289:3: rule__ListAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ListAdHoc__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalMGLang.g:5297:1: rule__ListAdHoc__Group__3 : rule__ListAdHoc__Group__3__Impl ;
    public final void rule__ListAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5301:1: ( rule__ListAdHoc__Group__3__Impl )
            // InternalMGLang.g:5302:2: rule__ListAdHoc__Group__3__Impl
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
    // InternalMGLang.g:5308:1: rule__ListAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__ListAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5312:1: ( ( ']' ) )
            // InternalMGLang.g:5313:1: ( ']' )
            {
            // InternalMGLang.g:5313:1: ( ']' )
            // InternalMGLang.g:5314:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5324:1: rule__ListAdHoc__Group_2__0 : rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 ;
    public final void rule__ListAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5328:1: ( rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 )
            // InternalMGLang.g:5329:2: rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalMGLang.g:5336:1: rule__ListAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5340:1: ( ( ',' ) )
            // InternalMGLang.g:5341:1: ( ',' )
            {
            // InternalMGLang.g:5341:1: ( ',' )
            // InternalMGLang.g:5342:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getCommaKeyword_2_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5351:1: rule__ListAdHoc__Group_2__1 : rule__ListAdHoc__Group_2__1__Impl ;
    public final void rule__ListAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5355:1: ( rule__ListAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:5356:2: rule__ListAdHoc__Group_2__1__Impl
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
    // InternalMGLang.g:5362:1: rule__ListAdHoc__Group_2__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) ;
    public final void rule__ListAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5366:1: ( ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) )
            // InternalMGLang.g:5367:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            {
            // InternalMGLang.g:5367:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            // InternalMGLang.g:5368:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getElementsAssignment_2_1()); 
            }
            // InternalMGLang.g:5369:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            // InternalMGLang.g:5369:3: rule__ListAdHoc__ElementsAssignment_2_1
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
    // InternalMGLang.g:5378:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5382:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalMGLang.g:5383:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:5390:1: rule__Map__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5394:1: ( ( 'Map' ) )
            // InternalMGLang.g:5395:1: ( 'Map' )
            {
            // InternalMGLang.g:5395:1: ( 'Map' )
            // InternalMGLang.g:5396:2: 'Map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getMapKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5405:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5409:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // InternalMGLang.g:5410:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:5417:1: rule__Map__Group__1__Impl : ( ( rule__Map__NameAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5421:1: ( ( ( rule__Map__NameAssignment_1 ) ) )
            // InternalMGLang.g:5422:1: ( ( rule__Map__NameAssignment_1 ) )
            {
            // InternalMGLang.g:5422:1: ( ( rule__Map__NameAssignment_1 ) )
            // InternalMGLang.g:5423:2: ( rule__Map__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:5424:2: ( rule__Map__NameAssignment_1 )
            // InternalMGLang.g:5424:3: rule__Map__NameAssignment_1
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
    // InternalMGLang.g:5432:1: rule__Map__Group__2 : rule__Map__Group__2__Impl ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5436:1: ( rule__Map__Group__2__Impl )
            // InternalMGLang.g:5437:2: rule__Map__Group__2__Impl
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
    // InternalMGLang.g:5443:1: rule__Map__Group__2__Impl : ( ( rule__Map__Group_2__0 ) ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5447:1: ( ( ( rule__Map__Group_2__0 ) ) )
            // InternalMGLang.g:5448:1: ( ( rule__Map__Group_2__0 ) )
            {
            // InternalMGLang.g:5448:1: ( ( rule__Map__Group_2__0 ) )
            // InternalMGLang.g:5449:2: ( rule__Map__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getGroup_2()); 
            }
            // InternalMGLang.g:5450:2: ( rule__Map__Group_2__0 )
            // InternalMGLang.g:5450:3: rule__Map__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalMGLang.g:5459:1: rule__Map__Group_2__0 : rule__Map__Group_2__0__Impl rule__Map__Group_2__1 ;
    public final void rule__Map__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5463:1: ( rule__Map__Group_2__0__Impl rule__Map__Group_2__1 )
            // InternalMGLang.g:5464:2: rule__Map__Group_2__0__Impl rule__Map__Group_2__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMGLang.g:5471:1: rule__Map__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Map__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5475:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:5476:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:5476:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:5477:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:5486:1: rule__Map__Group_2__1 : rule__Map__Group_2__1__Impl ;
    public final void rule__Map__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5490:1: ( rule__Map__Group_2__1__Impl )
            // InternalMGLang.g:5491:2: rule__Map__Group_2__1__Impl
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
    // InternalMGLang.g:5497:1: rule__Map__Group_2__1__Impl : ( ruleMapAssignment ) ;
    public final void rule__Map__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5501:1: ( ( ruleMapAssignment ) )
            // InternalMGLang.g:5502:1: ( ruleMapAssignment )
            {
            // InternalMGLang.g:5502:1: ( ruleMapAssignment )
            // InternalMGLang.g:5503:2: ruleMapAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getMapAssignmentParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getMapAssignmentParserRuleCall_2_1()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:5513:1: rule__MapAdHoc__Group__0 : rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 ;
    public final void rule__MapAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5517:1: ( rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 )
            // InternalMGLang.g:5518:2: rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMGLang.g:5525:1: rule__MapAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__MapAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5529:1: ( ( '[' ) )
            // InternalMGLang.g:5530:1: ( '[' )
            {
            // InternalMGLang.g:5530:1: ( '[' )
            // InternalMGLang.g:5531:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5540:1: rule__MapAdHoc__Group__1 : rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 ;
    public final void rule__MapAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5544:1: ( rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 )
            // InternalMGLang.g:5545:2: rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMGLang.g:5552:1: rule__MapAdHoc__Group__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) ;
    public final void rule__MapAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5556:1: ( ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) )
            // InternalMGLang.g:5557:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            {
            // InternalMGLang.g:5557:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            // InternalMGLang.g:5558:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_1()); 
            }
            // InternalMGLang.g:5559:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            // InternalMGLang.g:5559:3: rule__MapAdHoc__EntriesAssignment_1
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
    // InternalMGLang.g:5567:1: rule__MapAdHoc__Group__2 : rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 ;
    public final void rule__MapAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5571:1: ( rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 )
            // InternalMGLang.g:5572:2: rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalMGLang.g:5579:1: rule__MapAdHoc__Group__2__Impl : ( ( rule__MapAdHoc__Group_2__0 )* ) ;
    public final void rule__MapAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5583:1: ( ( ( rule__MapAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:5584:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:5584:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            // InternalMGLang.g:5585:2: ( rule__MapAdHoc__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getGroup_2()); 
            }
            // InternalMGLang.g:5586:2: ( rule__MapAdHoc__Group_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==42) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMGLang.g:5586:3: rule__MapAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__MapAdHoc__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalMGLang.g:5594:1: rule__MapAdHoc__Group__3 : rule__MapAdHoc__Group__3__Impl ;
    public final void rule__MapAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5598:1: ( rule__MapAdHoc__Group__3__Impl )
            // InternalMGLang.g:5599:2: rule__MapAdHoc__Group__3__Impl
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
    // InternalMGLang.g:5605:1: rule__MapAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__MapAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5609:1: ( ( ']' ) )
            // InternalMGLang.g:5610:1: ( ']' )
            {
            // InternalMGLang.g:5610:1: ( ']' )
            // InternalMGLang.g:5611:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5621:1: rule__MapAdHoc__Group_2__0 : rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 ;
    public final void rule__MapAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5625:1: ( rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 )
            // InternalMGLang.g:5626:2: rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMGLang.g:5633:1: rule__MapAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MapAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5637:1: ( ( ',' ) )
            // InternalMGLang.g:5638:1: ( ',' )
            {
            // InternalMGLang.g:5638:1: ( ',' )
            // InternalMGLang.g:5639:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getCommaKeyword_2_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5648:1: rule__MapAdHoc__Group_2__1 : rule__MapAdHoc__Group_2__1__Impl ;
    public final void rule__MapAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5652:1: ( rule__MapAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:5653:2: rule__MapAdHoc__Group_2__1__Impl
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
    // InternalMGLang.g:5659:1: rule__MapAdHoc__Group_2__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) ;
    public final void rule__MapAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5663:1: ( ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) )
            // InternalMGLang.g:5664:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            {
            // InternalMGLang.g:5664:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            // InternalMGLang.g:5665:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_2_1()); 
            }
            // InternalMGLang.g:5666:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            // InternalMGLang.g:5666:3: rule__MapAdHoc__EntriesAssignment_2_1
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
    // InternalMGLang.g:5675:1: rule__MapTupel__Group__0 : rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 ;
    public final void rule__MapTupel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5679:1: ( rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 )
            // InternalMGLang.g:5680:2: rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalMGLang.g:5687:1: rule__MapTupel__Group__0__Impl : ( '(' ) ;
    public final void rule__MapTupel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5691:1: ( ( '(' ) )
            // InternalMGLang.g:5692:1: ( '(' )
            {
            // InternalMGLang.g:5692:1: ( '(' )
            // InternalMGLang.g:5693:2: '('
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
    // InternalMGLang.g:5702:1: rule__MapTupel__Group__1 : rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 ;
    public final void rule__MapTupel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5706:1: ( rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 )
            // InternalMGLang.g:5707:2: rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMGLang.g:5714:1: rule__MapTupel__Group__1__Impl : ( ( rule__MapTupel__KeyAssignment_1 ) ) ;
    public final void rule__MapTupel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5718:1: ( ( ( rule__MapTupel__KeyAssignment_1 ) ) )
            // InternalMGLang.g:5719:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            {
            // InternalMGLang.g:5719:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            // InternalMGLang.g:5720:2: ( rule__MapTupel__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getKeyAssignment_1()); 
            }
            // InternalMGLang.g:5721:2: ( rule__MapTupel__KeyAssignment_1 )
            // InternalMGLang.g:5721:3: rule__MapTupel__KeyAssignment_1
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
    // InternalMGLang.g:5729:1: rule__MapTupel__Group__2 : rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 ;
    public final void rule__MapTupel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5733:1: ( rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 )
            // InternalMGLang.g:5734:2: rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:5741:1: rule__MapTupel__Group__2__Impl : ( ',' ) ;
    public final void rule__MapTupel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5745:1: ( ( ',' ) )
            // InternalMGLang.g:5746:1: ( ',' )
            {
            // InternalMGLang.g:5746:1: ( ',' )
            // InternalMGLang.g:5747:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getCommaKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5756:1: rule__MapTupel__Group__3 : rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 ;
    public final void rule__MapTupel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5760:1: ( rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 )
            // InternalMGLang.g:5761:2: rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:5768:1: rule__MapTupel__Group__3__Impl : ( ( rule__MapTupel__ValueAssignment_3 ) ) ;
    public final void rule__MapTupel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5772:1: ( ( ( rule__MapTupel__ValueAssignment_3 ) ) )
            // InternalMGLang.g:5773:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            {
            // InternalMGLang.g:5773:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            // InternalMGLang.g:5774:2: ( rule__MapTupel__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getValueAssignment_3()); 
            }
            // InternalMGLang.g:5775:2: ( rule__MapTupel__ValueAssignment_3 )
            // InternalMGLang.g:5775:3: rule__MapTupel__ValueAssignment_3
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
    // InternalMGLang.g:5783:1: rule__MapTupel__Group__4 : rule__MapTupel__Group__4__Impl ;
    public final void rule__MapTupel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5787:1: ( rule__MapTupel__Group__4__Impl )
            // InternalMGLang.g:5788:2: rule__MapTupel__Group__4__Impl
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
    // InternalMGLang.g:5794:1: rule__MapTupel__Group__4__Impl : ( ')' ) ;
    public final void rule__MapTupel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5798:1: ( ( ')' ) )
            // InternalMGLang.g:5799:1: ( ')' )
            {
            // InternalMGLang.g:5799:1: ( ')' )
            // InternalMGLang.g:5800:2: ')'
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
    // InternalMGLang.g:5810:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5814:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:5815:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMGLang.g:5822:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5826:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:5827:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:5827:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:5828:2: ( rule__ForRange__StartAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            }
            // InternalMGLang.g:5829:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:5829:3: rule__ForRange__StartAssignment_0
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
    // InternalMGLang.g:5837:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5841:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:5842:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMGLang.g:5849:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5853:1: ( ( ':' ) )
            // InternalMGLang.g:5854:1: ( ':' )
            {
            // InternalMGLang.g:5854:1: ( ':' )
            // InternalMGLang.g:5855:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5864:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5868:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:5869:2: rule__ForRange__Group__2__Impl
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
    // InternalMGLang.g:5875:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5879:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:5880:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:5880:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:5881:2: ( rule__ForRange__EndAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            }
            // InternalMGLang.g:5882:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:5882:3: rule__ForRange__EndAssignment_2
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
    // InternalMGLang.g:5891:1: rule__TertiaryExpression__Group__0 : rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 ;
    public final void rule__TertiaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5895:1: ( rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 )
            // InternalMGLang.g:5896:2: rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalMGLang.g:5903:1: rule__TertiaryExpression__Group__0__Impl : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5907:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:5908:1: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:5908:1: ( ruleSecondaryExpression )
            // InternalMGLang.g:5909:2: ruleSecondaryExpression
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
    // InternalMGLang.g:5918:1: rule__TertiaryExpression__Group__1 : rule__TertiaryExpression__Group__1__Impl ;
    public final void rule__TertiaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5922:1: ( rule__TertiaryExpression__Group__1__Impl )
            // InternalMGLang.g:5923:2: rule__TertiaryExpression__Group__1__Impl
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
    // InternalMGLang.g:5929:1: rule__TertiaryExpression__Group__1__Impl : ( ( rule__TertiaryExpression__Group_1__0 )* ) ;
    public final void rule__TertiaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5933:1: ( ( ( rule__TertiaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:5934:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:5934:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            // InternalMGLang.g:5935:2: ( rule__TertiaryExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:5936:2: ( rule__TertiaryExpression__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=27 && LA42_0<=29)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMGLang.g:5936:3: rule__TertiaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__TertiaryExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalMGLang.g:5945:1: rule__TertiaryExpression__Group_1__0 : rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 ;
    public final void rule__TertiaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5949:1: ( rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 )
            // InternalMGLang.g:5950:2: rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalMGLang.g:5957:1: rule__TertiaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TertiaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5961:1: ( ( () ) )
            // InternalMGLang.g:5962:1: ( () )
            {
            // InternalMGLang.g:5962:1: ( () )
            // InternalMGLang.g:5963:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:5964:2: ()
            // InternalMGLang.g:5964:3: 
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
    // InternalMGLang.g:5972:1: rule__TertiaryExpression__Group_1__1 : rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 ;
    public final void rule__TertiaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5976:1: ( rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 )
            // InternalMGLang.g:5977:2: rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:5984:1: rule__TertiaryExpression__Group_1__1__Impl : ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__TertiaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5988:1: ( ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:5989:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:5989:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:5990:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:5991:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:5991:3: rule__TertiaryExpression__OpAssignment_1_1
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
    // InternalMGLang.g:5999:1: rule__TertiaryExpression__Group_1__2 : rule__TertiaryExpression__Group_1__2__Impl ;
    public final void rule__TertiaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6003:1: ( rule__TertiaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:6004:2: rule__TertiaryExpression__Group_1__2__Impl
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
    // InternalMGLang.g:6010:1: rule__TertiaryExpression__Group_1__2__Impl : ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__TertiaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6014:1: ( ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:6015:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:6015:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:6016:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:6017:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:6017:3: rule__TertiaryExpression__RightAssignment_1_2
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
    // InternalMGLang.g:6026:1: rule__SecondaryExpression__Group__0 : rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 ;
    public final void rule__SecondaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6030:1: ( rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 )
            // InternalMGLang.g:6031:2: rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalMGLang.g:6038:1: rule__SecondaryExpression__Group__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6042:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:6043:1: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:6043:1: ( rulePrimaryExpr )
            // InternalMGLang.g:6044:2: rulePrimaryExpr
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
    // InternalMGLang.g:6053:1: rule__SecondaryExpression__Group__1 : rule__SecondaryExpression__Group__1__Impl ;
    public final void rule__SecondaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6057:1: ( rule__SecondaryExpression__Group__1__Impl )
            // InternalMGLang.g:6058:2: rule__SecondaryExpression__Group__1__Impl
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
    // InternalMGLang.g:6064:1: rule__SecondaryExpression__Group__1__Impl : ( ( rule__SecondaryExpression__Group_1__0 )* ) ;
    public final void rule__SecondaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6068:1: ( ( ( rule__SecondaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:6069:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:6069:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            // InternalMGLang.g:6070:2: ( rule__SecondaryExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:6071:2: ( rule__SecondaryExpression__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=30 && LA43_0<=31)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMGLang.g:6071:3: rule__SecondaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__SecondaryExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalMGLang.g:6080:1: rule__SecondaryExpression__Group_1__0 : rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 ;
    public final void rule__SecondaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6084:1: ( rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 )
            // InternalMGLang.g:6085:2: rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalMGLang.g:6092:1: rule__SecondaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SecondaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6096:1: ( ( () ) )
            // InternalMGLang.g:6097:1: ( () )
            {
            // InternalMGLang.g:6097:1: ( () )
            // InternalMGLang.g:6098:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:6099:2: ()
            // InternalMGLang.g:6099:3: 
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
    // InternalMGLang.g:6107:1: rule__SecondaryExpression__Group_1__1 : rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 ;
    public final void rule__SecondaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6111:1: ( rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 )
            // InternalMGLang.g:6112:2: rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:6119:1: rule__SecondaryExpression__Group_1__1__Impl : ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__SecondaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6123:1: ( ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:6124:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:6124:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:6125:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:6126:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:6126:3: rule__SecondaryExpression__OpAssignment_1_1
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
    // InternalMGLang.g:6134:1: rule__SecondaryExpression__Group_1__2 : rule__SecondaryExpression__Group_1__2__Impl ;
    public final void rule__SecondaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6138:1: ( rule__SecondaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:6139:2: rule__SecondaryExpression__Group_1__2__Impl
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
    // InternalMGLang.g:6145:1: rule__SecondaryExpression__Group_1__2__Impl : ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SecondaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6149:1: ( ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:6150:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:6150:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:6151:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:6152:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:6152:3: rule__SecondaryExpression__RightAssignment_1_2
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
    // InternalMGLang.g:6161:1: rule__PrimaryExpr__Group__0 : rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 ;
    public final void rule__PrimaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6165:1: ( rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 )
            // InternalMGLang.g:6166:2: rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalMGLang.g:6173:1: rule__PrimaryExpr__Group__0__Impl : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6177:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:6178:1: ( ruleRelationExpression )
            {
            // InternalMGLang.g:6178:1: ( ruleRelationExpression )
            // InternalMGLang.g:6179:2: ruleRelationExpression
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
    // InternalMGLang.g:6188:1: rule__PrimaryExpr__Group__1 : rule__PrimaryExpr__Group__1__Impl ;
    public final void rule__PrimaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6192:1: ( rule__PrimaryExpr__Group__1__Impl )
            // InternalMGLang.g:6193:2: rule__PrimaryExpr__Group__1__Impl
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
    // InternalMGLang.g:6199:1: rule__PrimaryExpr__Group__1__Impl : ( ( rule__PrimaryExpr__Group_1__0 )* ) ;
    public final void rule__PrimaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6203:1: ( ( ( rule__PrimaryExpr__Group_1__0 )* ) )
            // InternalMGLang.g:6204:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            {
            // InternalMGLang.g:6204:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            // InternalMGLang.g:6205:2: ( rule__PrimaryExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
            }
            // InternalMGLang.g:6206:2: ( rule__PrimaryExpr__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=32 && LA44_0<=34)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMGLang.g:6206:3: rule__PrimaryExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__PrimaryExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalMGLang.g:6215:1: rule__PrimaryExpr__Group_1__0 : rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 ;
    public final void rule__PrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6219:1: ( rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 )
            // InternalMGLang.g:6220:2: rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalMGLang.g:6227:1: rule__PrimaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6231:1: ( ( () ) )
            // InternalMGLang.g:6232:1: ( () )
            {
            // InternalMGLang.g:6232:1: ( () )
            // InternalMGLang.g:6233:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:6234:2: ()
            // InternalMGLang.g:6234:3: 
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
    // InternalMGLang.g:6242:1: rule__PrimaryExpr__Group_1__1 : rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 ;
    public final void rule__PrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6246:1: ( rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 )
            // InternalMGLang.g:6247:2: rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:6254:1: rule__PrimaryExpr__Group_1__1__Impl : ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6258:1: ( ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:6259:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:6259:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            // InternalMGLang.g:6260:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:6261:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            // InternalMGLang.g:6261:3: rule__PrimaryExpr__OpAssignment_1_1
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
    // InternalMGLang.g:6269:1: rule__PrimaryExpr__Group_1__2 : rule__PrimaryExpr__Group_1__2__Impl ;
    public final void rule__PrimaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6273:1: ( rule__PrimaryExpr__Group_1__2__Impl )
            // InternalMGLang.g:6274:2: rule__PrimaryExpr__Group_1__2__Impl
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
    // InternalMGLang.g:6280:1: rule__PrimaryExpr__Group_1__2__Impl : ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6284:1: ( ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:6285:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:6285:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            // InternalMGLang.g:6286:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:6287:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            // InternalMGLang.g:6287:3: rule__PrimaryExpr__RightAssignment_1_2
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
    // InternalMGLang.g:6296:1: rule__RelationExpression__Group__0 : rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 ;
    public final void rule__RelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6300:1: ( rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 )
            // InternalMGLang.g:6301:2: rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalMGLang.g:6308:1: rule__RelationExpression__Group__0__Impl : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6312:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:6313:1: ( ruleBaseExpr )
            {
            // InternalMGLang.g:6313:1: ( ruleBaseExpr )
            // InternalMGLang.g:6314:2: ruleBaseExpr
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
    // InternalMGLang.g:6323:1: rule__RelationExpression__Group__1 : rule__RelationExpression__Group__1__Impl ;
    public final void rule__RelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6327:1: ( rule__RelationExpression__Group__1__Impl )
            // InternalMGLang.g:6328:2: rule__RelationExpression__Group__1__Impl
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
    // InternalMGLang.g:6334:1: rule__RelationExpression__Group__1__Impl : ( ( rule__RelationExpression__Group_1__0 )* ) ;
    public final void rule__RelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6338:1: ( ( ( rule__RelationExpression__Group_1__0 )* ) )
            // InternalMGLang.g:6339:1: ( ( rule__RelationExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:6339:1: ( ( rule__RelationExpression__Group_1__0 )* )
            // InternalMGLang.g:6340:2: ( rule__RelationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:6341:2: ( rule__RelationExpression__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=21 && LA45_0<=26)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMGLang.g:6341:3: rule__RelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__RelationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalMGLang.g:6350:1: rule__RelationExpression__Group_1__0 : rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 ;
    public final void rule__RelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6354:1: ( rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 )
            // InternalMGLang.g:6355:2: rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalMGLang.g:6362:1: rule__RelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6366:1: ( ( () ) )
            // InternalMGLang.g:6367:1: ( () )
            {
            // InternalMGLang.g:6367:1: ( () )
            // InternalMGLang.g:6368:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0()); 
            }
            // InternalMGLang.g:6369:2: ()
            // InternalMGLang.g:6369:3: 
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
    // InternalMGLang.g:6377:1: rule__RelationExpression__Group_1__1 : rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 ;
    public final void rule__RelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6381:1: ( rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 )
            // InternalMGLang.g:6382:2: rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:6389:1: rule__RelationExpression__Group_1__1__Impl : ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) ;
    public final void rule__RelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6393:1: ( ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) )
            // InternalMGLang.g:6394:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            {
            // InternalMGLang.g:6394:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            // InternalMGLang.g:6395:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1_1()); 
            }
            // InternalMGLang.g:6396:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            // InternalMGLang.g:6396:3: rule__RelationExpression__RelationAssignment_1_1
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
    // InternalMGLang.g:6404:1: rule__RelationExpression__Group_1__2 : rule__RelationExpression__Group_1__2__Impl ;
    public final void rule__RelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6408:1: ( rule__RelationExpression__Group_1__2__Impl )
            // InternalMGLang.g:6409:2: rule__RelationExpression__Group_1__2__Impl
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
    // InternalMGLang.g:6415:1: rule__RelationExpression__Group_1__2__Impl : ( ( rule__RelationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__RelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6419:1: ( ( ( rule__RelationExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:6420:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:6420:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:6421:2: ( rule__RelationExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:6422:2: ( rule__RelationExpression__RightAssignment_1_2 )
            // InternalMGLang.g:6422:3: rule__RelationExpression__RightAssignment_1_2
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
    // InternalMGLang.g:6431:1: rule__BaseExpr__Group_0__0 : rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 ;
    public final void rule__BaseExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6435:1: ( rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 )
            // InternalMGLang.g:6436:2: rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:6443:1: rule__BaseExpr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6447:1: ( ( '(' ) )
            // InternalMGLang.g:6448:1: ( '(' )
            {
            // InternalMGLang.g:6448:1: ( '(' )
            // InternalMGLang.g:6449:2: '('
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
    // InternalMGLang.g:6458:1: rule__BaseExpr__Group_0__1 : rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 ;
    public final void rule__BaseExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6462:1: ( rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 )
            // InternalMGLang.g:6463:2: rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:6470:1: rule__BaseExpr__Group_0__1__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6474:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:6475:1: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:6475:1: ( ruleArithmeticExpression )
            // InternalMGLang.g:6476:2: ruleArithmeticExpression
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
    // InternalMGLang.g:6485:1: rule__BaseExpr__Group_0__2 : rule__BaseExpr__Group_0__2__Impl ;
    public final void rule__BaseExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6489:1: ( rule__BaseExpr__Group_0__2__Impl )
            // InternalMGLang.g:6490:2: rule__BaseExpr__Group_0__2__Impl
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
    // InternalMGLang.g:6496:1: rule__BaseExpr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6500:1: ( ( ')' ) )
            // InternalMGLang.g:6501:1: ( ')' )
            {
            // InternalMGLang.g:6501:1: ( ')' )
            // InternalMGLang.g:6502:2: ')'
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
    // InternalMGLang.g:6512:1: rule__BaseExpr__Group_1__0 : rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 ;
    public final void rule__BaseExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6516:1: ( rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 )
            // InternalMGLang.g:6517:2: rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalMGLang.g:6524:1: rule__BaseExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6528:1: ( ( () ) )
            // InternalMGLang.g:6529:1: ( () )
            {
            // InternalMGLang.g:6529:1: ( () )
            // InternalMGLang.g:6530:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0()); 
            }
            // InternalMGLang.g:6531:2: ()
            // InternalMGLang.g:6531:3: 
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
    // InternalMGLang.g:6539:1: rule__BaseExpr__Group_1__1 : rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 ;
    public final void rule__BaseExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6543:1: ( rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 )
            // InternalMGLang.g:6544:2: rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:6551:1: rule__BaseExpr__Group_1__1__Impl : ( '!' ) ;
    public final void rule__BaseExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6555:1: ( ( '!' ) )
            // InternalMGLang.g:6556:1: ( '!' )
            {
            // InternalMGLang.g:6556:1: ( '!' )
            // InternalMGLang.g:6557:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6566:1: rule__BaseExpr__Group_1__2 : rule__BaseExpr__Group_1__2__Impl ;
    public final void rule__BaseExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6570:1: ( rule__BaseExpr__Group_1__2__Impl )
            // InternalMGLang.g:6571:2: rule__BaseExpr__Group_1__2__Impl
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
    // InternalMGLang.g:6577:1: rule__BaseExpr__Group_1__2__Impl : ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__BaseExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6581:1: ( ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) )
            // InternalMGLang.g:6582:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            {
            // InternalMGLang.g:6582:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            // InternalMGLang.g:6583:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExprAssignment_1_2()); 
            }
            // InternalMGLang.g:6584:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            // InternalMGLang.g:6584:3: rule__BaseExpr__ExprAssignment_1_2
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
    // InternalMGLang.g:6593:1: rule__BaseExpr__Group_2__0 : rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 ;
    public final void rule__BaseExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6597:1: ( rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 )
            // InternalMGLang.g:6598:2: rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalMGLang.g:6605:1: rule__BaseExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6609:1: ( ( () ) )
            // InternalMGLang.g:6610:1: ( () )
            {
            // InternalMGLang.g:6610:1: ( () )
            // InternalMGLang.g:6611:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0()); 
            }
            // InternalMGLang.g:6612:2: ()
            // InternalMGLang.g:6612:3: 
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
    // InternalMGLang.g:6620:1: rule__BaseExpr__Group_2__1 : rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 ;
    public final void rule__BaseExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6624:1: ( rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 )
            // InternalMGLang.g:6625:2: rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMGLang.g:6632:1: rule__BaseExpr__Group_2__1__Impl : ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) ;
    public final void rule__BaseExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6636:1: ( ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) )
            // InternalMGLang.g:6637:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            {
            // InternalMGLang.g:6637:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            // InternalMGLang.g:6638:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getFuncAssignment_2_1()); 
            }
            // InternalMGLang.g:6639:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            // InternalMGLang.g:6639:3: rule__BaseExpr__FuncAssignment_2_1
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
    // InternalMGLang.g:6647:1: rule__BaseExpr__Group_2__2 : rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 ;
    public final void rule__BaseExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6651:1: ( rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 )
            // InternalMGLang.g:6652:2: rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMGLang.g:6659:1: rule__BaseExpr__Group_2__2__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6663:1: ( ( '(' ) )
            // InternalMGLang.g:6664:1: ( '(' )
            {
            // InternalMGLang.g:6664:1: ( '(' )
            // InternalMGLang.g:6665:2: '('
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
    // InternalMGLang.g:6674:1: rule__BaseExpr__Group_2__3 : rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 ;
    public final void rule__BaseExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6678:1: ( rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 )
            // InternalMGLang.g:6679:2: rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:6686:1: rule__BaseExpr__Group_2__3__Impl : ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) ;
    public final void rule__BaseExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6690:1: ( ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) )
            // InternalMGLang.g:6691:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            {
            // InternalMGLang.g:6691:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            // InternalMGLang.g:6692:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExprAssignment_2_3()); 
            }
            // InternalMGLang.g:6693:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            // InternalMGLang.g:6693:3: rule__BaseExpr__ExprAssignment_2_3
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
    // InternalMGLang.g:6701:1: rule__BaseExpr__Group_2__4 : rule__BaseExpr__Group_2__4__Impl ;
    public final void rule__BaseExpr__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6705:1: ( rule__BaseExpr__Group_2__4__Impl )
            // InternalMGLang.g:6706:2: rule__BaseExpr__Group_2__4__Impl
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
    // InternalMGLang.g:6712:1: rule__BaseExpr__Group_2__4__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6716:1: ( ( ')' ) )
            // InternalMGLang.g:6717:1: ( ')' )
            {
            // InternalMGLang.g:6717:1: ( ')' )
            // InternalMGLang.g:6718:2: ')'
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


    // $ANTLR start "rule__BaseExpr__Group_3__0"
    // InternalMGLang.g:6728:1: rule__BaseExpr__Group_3__0 : rule__BaseExpr__Group_3__0__Impl rule__BaseExpr__Group_3__1 ;
    public final void rule__BaseExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6732:1: ( rule__BaseExpr__Group_3__0__Impl rule__BaseExpr__Group_3__1 )
            // InternalMGLang.g:6733:2: rule__BaseExpr__Group_3__0__Impl rule__BaseExpr__Group_3__1
            {
            pushFollow(FOLLOW_45);
            rule__BaseExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_3__1();

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
    // $ANTLR end "rule__BaseExpr__Group_3__0"


    // $ANTLR start "rule__BaseExpr__Group_3__0__Impl"
    // InternalMGLang.g:6740:1: rule__BaseExpr__Group_3__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6744:1: ( ( () ) )
            // InternalMGLang.g:6745:1: ( () )
            {
            // InternalMGLang.g:6745:1: ( () )
            // InternalMGLang.g:6746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getLiteralAction_3_0()); 
            }
            // InternalMGLang.g:6747:2: ()
            // InternalMGLang.g:6747:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getLiteralAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_3__0__Impl"


    // $ANTLR start "rule__BaseExpr__Group_3__1"
    // InternalMGLang.g:6755:1: rule__BaseExpr__Group_3__1 : rule__BaseExpr__Group_3__1__Impl ;
    public final void rule__BaseExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6759:1: ( rule__BaseExpr__Group_3__1__Impl )
            // InternalMGLang.g:6760:2: rule__BaseExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_3__1__Impl();

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
    // $ANTLR end "rule__BaseExpr__Group_3__1"


    // $ANTLR start "rule__BaseExpr__Group_3__1__Impl"
    // InternalMGLang.g:6766:1: rule__BaseExpr__Group_3__1__Impl : ( ruleLiteral ) ;
    public final void rule__BaseExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6770:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:6771:1: ( ruleLiteral )
            {
            // InternalMGLang.g:6771:1: ( ruleLiteral )
            // InternalMGLang.g:6772:2: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpr__Group_3__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // InternalMGLang.g:6782:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6786:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalMGLang.g:6787:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1();

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
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // InternalMGLang.g:6794:1: rule__NumberLiteral__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6798:1: ( ( RULE_INT ) )
            // InternalMGLang.g:6799:1: ( RULE_INT )
            {
            // InternalMGLang.g:6799:1: ( RULE_INT )
            // InternalMGLang.g:6800:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // InternalMGLang.g:6809:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6813:1: ( rule__NumberLiteral__Group__1__Impl )
            // InternalMGLang.g:6814:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // InternalMGLang.g:6820:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__Group_1__0 )? ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6824:1: ( ( ( rule__NumberLiteral__Group_1__0 )? ) )
            // InternalMGLang.g:6825:1: ( ( rule__NumberLiteral__Group_1__0 )? )
            {
            // InternalMGLang.g:6825:1: ( ( rule__NumberLiteral__Group_1__0 )? )
            // InternalMGLang.g:6826:2: ( rule__NumberLiteral__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
            }
            // InternalMGLang.g:6827:2: ( rule__NumberLiteral__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMGLang.g:6827:3: rule__NumberLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_1__0"
    // InternalMGLang.g:6836:1: rule__NumberLiteral__Group_1__0 : rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 ;
    public final void rule__NumberLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6840:1: ( rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 )
            // InternalMGLang.g:6841:2: rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__NumberLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_1__1();

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
    // $ANTLR end "rule__NumberLiteral__Group_1__0"


    // $ANTLR start "rule__NumberLiteral__Group_1__0__Impl"
    // InternalMGLang.g:6848:1: rule__NumberLiteral__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NumberLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6852:1: ( ( '.' ) )
            // InternalMGLang.g:6853:1: ( '.' )
            {
            // InternalMGLang.g:6853:1: ( '.' )
            // InternalMGLang.g:6854:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getFullStopKeyword_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group_1__1"
    // InternalMGLang.g:6863:1: rule__NumberLiteral__Group_1__1 : rule__NumberLiteral__Group_1__1__Impl ;
    public final void rule__NumberLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6867:1: ( rule__NumberLiteral__Group_1__1__Impl )
            // InternalMGLang.g:6868:2: rule__NumberLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group_1__1__Impl();

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
    // $ANTLR end "rule__NumberLiteral__Group_1__1"


    // $ANTLR start "rule__NumberLiteral__Group_1__1__Impl"
    // InternalMGLang.g:6874:1: rule__NumberLiteral__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NumberLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6878:1: ( ( RULE_INT ) )
            // InternalMGLang.g:6879:1: ( RULE_INT )
            {
            // InternalMGLang.g:6879:1: ( RULE_INT )
            // InternalMGLang.g:6880:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__Pattern__UnorderedGroup_4"
    // InternalMGLang.g:6890:1: rule__Pattern__UnorderedGroup_4 : ( rule__Pattern__UnorderedGroup_4__0 )? ;
    public final void rule__Pattern__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPatternAccess().getUnorderedGroup_4());
        	
        try {
            // InternalMGLang.g:6895:1: ( ( rule__Pattern__UnorderedGroup_4__0 )? )
            // InternalMGLang.g:6896:2: ( rule__Pattern__UnorderedGroup_4__0 )?
            {
            // InternalMGLang.g:6896:2: ( rule__Pattern__UnorderedGroup_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ( LA47_0 == 55 || LA47_0 == 58 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt47=1;
            }
            else if ( LA47_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMGLang.g:6896:2: rule__Pattern__UnorderedGroup_4__0
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
    // InternalMGLang.g:6904:1: rule__Pattern__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) ) ) ;
    public final void rule__Pattern__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMGLang.g:6909:1: ( ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) ) ) )
            // InternalMGLang.g:6910:3: ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) ) )
            {
            // InternalMGLang.g:6910:3: ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) ) )
            int alt52=4;
            int LA52_0 = input.LA(1);

            if ( ( LA52_0 == 55 || LA52_0 == 58 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                int LA52_2 = input.LA(2);

                if ( LA52_2 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                    alt52=2;
                }
                else if ( LA52_2 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                    alt52=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;
                }
            }
            else if ( LA52_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt52=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalMGLang.g:6911:3: ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) )
                    {
                    // InternalMGLang.g:6911:3: ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) )
                    // InternalMGLang.g:6912:4: {...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalMGLang.g:6912:103: ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) )
                    // InternalMGLang.g:6913:5: ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalMGLang.g:6919:5: ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) )
                    // InternalMGLang.g:6920:6: ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* )
                    {
                    // InternalMGLang.g:6920:6: ( ( rule__Pattern__CollsAssignment_4_0 ) )
                    // InternalMGLang.g:6921:7: ( rule__Pattern__CollsAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }
                    // InternalMGLang.g:6922:7: ( rule__Pattern__CollsAssignment_4_0 )
                    // InternalMGLang.g:6922:8: rule__Pattern__CollsAssignment_4_0
                    {
                    pushFollow(FOLLOW_57);
                    rule__Pattern__CollsAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }

                    }

                    // InternalMGLang.g:6925:6: ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* )
                    // InternalMGLang.g:6926:7: ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }
                    // InternalMGLang.g:6927:7: ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==55) ) {
                            int LA48_1 = input.LA(2);

                            if ( (synpred1_InternalMGLang()) ) {
                                alt48=1;
                            }


                        }
                        else if ( (LA48_0==58) ) {
                            int LA48_2 = input.LA(2);

                            if ( (synpred1_InternalMGLang()) ) {
                                alt48=1;
                            }


                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalMGLang.g:6927:8: ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_57);
                    	    rule__Pattern__CollsAssignment_4_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
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
                    // InternalMGLang.g:6933:3: ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) )
                    {
                    // InternalMGLang.g:6933:3: ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) )
                    // InternalMGLang.g:6934:4: {...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalMGLang.g:6934:103: ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) )
                    // InternalMGLang.g:6935:5: ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalMGLang.g:6941:5: ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) )
                    // InternalMGLang.g:6942:6: ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* )
                    {
                    // InternalMGLang.g:6942:6: ( ( rule__Pattern__NodesAssignment_4_1 ) )
                    // InternalMGLang.g:6943:7: ( rule__Pattern__NodesAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }
                    // InternalMGLang.g:6944:7: ( rule__Pattern__NodesAssignment_4_1 )
                    // InternalMGLang.g:6944:8: rule__Pattern__NodesAssignment_4_1
                    {
                    pushFollow(FOLLOW_22);
                    rule__Pattern__NodesAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }

                    }

                    // InternalMGLang.g:6947:6: ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* )
                    // InternalMGLang.g:6948:7: ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }
                    // InternalMGLang.g:6949:7: ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            int LA49_2 = input.LA(2);

                            if ( (LA49_2==RULE_ID) ) {
                                int LA49_3 = input.LA(3);

                                if ( (synpred2_InternalMGLang()) ) {
                                    alt49=1;
                                }


                            }


                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMGLang.g:6949:8: ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1
                    	    {
                    	    pushFollow(FOLLOW_22);
                    	    rule__Pattern__NodesAssignment_4_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
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
                    // InternalMGLang.g:6955:3: ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) )
                    {
                    // InternalMGLang.g:6955:3: ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) )
                    // InternalMGLang.g:6956:4: {...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalMGLang.g:6956:103: ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) )
                    // InternalMGLang.g:6957:5: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalMGLang.g:6963:5: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) )
                    // InternalMGLang.g:6964:6: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* )
                    {
                    // InternalMGLang.g:6964:6: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) )
                    // InternalMGLang.g:6965:7: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }
                    // InternalMGLang.g:6966:7: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
                    // InternalMGLang.g:6966:8: rule__Pattern__ParamManipulationsAssignment_4_2
                    {
                    pushFollow(FOLLOW_22);
                    rule__Pattern__ParamManipulationsAssignment_4_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }

                    }

                    // InternalMGLang.g:6969:6: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* )
                    // InternalMGLang.g:6970:7: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }
                    // InternalMGLang.g:6971:7: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_ID) ) {
                            int LA50_3 = input.LA(2);

                            if ( (synpred3_InternalMGLang()) ) {
                                alt50=1;
                            }


                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalMGLang.g:6971:8: ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2
                    	    {
                    	    pushFollow(FOLLOW_22);
                    	    rule__Pattern__ParamManipulationsAssignment_4_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
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
                    // InternalMGLang.g:6977:3: ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) )
                    {
                    // InternalMGLang.g:6977:3: ({...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) ) )
                    // InternalMGLang.g:6978:4: {...}? => ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3)");
                    }
                    // InternalMGLang.g:6978:103: ( ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) ) )
                    // InternalMGLang.g:6979:5: ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3);
                    selected = true;
                    // InternalMGLang.g:6985:5: ( ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* ) )
                    // InternalMGLang.g:6986:6: ( ( rule__Pattern__SwitchesAssignment_4_3 ) ) ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* )
                    {
                    // InternalMGLang.g:6986:6: ( ( rule__Pattern__SwitchesAssignment_4_3 ) )
                    // InternalMGLang.g:6987:7: ( rule__Pattern__SwitchesAssignment_4_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getSwitchesAssignment_4_3()); 
                    }
                    // InternalMGLang.g:6988:7: ( rule__Pattern__SwitchesAssignment_4_3 )
                    // InternalMGLang.g:6988:8: rule__Pattern__SwitchesAssignment_4_3
                    {
                    pushFollow(FOLLOW_58);
                    rule__Pattern__SwitchesAssignment_4_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getSwitchesAssignment_4_3()); 
                    }

                    }

                    // InternalMGLang.g:6991:6: ( ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )* )
                    // InternalMGLang.g:6992:7: ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getSwitchesAssignment_4_3()); 
                    }
                    // InternalMGLang.g:6993:7: ( ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3 )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==50) ) {
                            int LA51_4 = input.LA(2);

                            if ( (synpred4_InternalMGLang()) ) {
                                alt51=1;
                            }


                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMGLang.g:6993:8: ( rule__Pattern__SwitchesAssignment_4_3 )=> rule__Pattern__SwitchesAssignment_4_3
                    	    {
                    	    pushFollow(FOLLOW_58);
                    	    rule__Pattern__SwitchesAssignment_4_3();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
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
    // InternalMGLang.g:7007:1: rule__Pattern__UnorderedGroup_4__0 : rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )? ;
    public final void rule__Pattern__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7011:1: ( rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )? )
            // InternalMGLang.g:7012:2: rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_58);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMGLang.g:7013:2: ( rule__Pattern__UnorderedGroup_4__1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ( LA53_0 == 55 || LA53_0 == 58 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt53=1;
            }
            else if ( LA53_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMGLang.g:7013:2: rule__Pattern__UnorderedGroup_4__1
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
    // InternalMGLang.g:7019:1: rule__Pattern__UnorderedGroup_4__1 : rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )? ;
    public final void rule__Pattern__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7023:1: ( rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )? )
            // InternalMGLang.g:7024:2: rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_58);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMGLang.g:7025:2: ( rule__Pattern__UnorderedGroup_4__2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ( LA54_0 == 55 || LA54_0 == 58 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt54=1;
            }
            else if ( LA54_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMGLang.g:7025:2: rule__Pattern__UnorderedGroup_4__2
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
    // InternalMGLang.g:7031:1: rule__Pattern__UnorderedGroup_4__2 : rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__3 )? ;
    public final void rule__Pattern__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7035:1: ( rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__3 )? )
            // InternalMGLang.g:7036:2: rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_58);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMGLang.g:7037:2: ( rule__Pattern__UnorderedGroup_4__3 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ( LA55_0 == 55 || LA55_0 == 58 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt55=1;
            }
            else if ( LA55_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 3) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMGLang.g:7037:2: rule__Pattern__UnorderedGroup_4__3
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
    // InternalMGLang.g:7043:1: rule__Pattern__UnorderedGroup_4__3 : rule__Pattern__UnorderedGroup_4__Impl ;
    public final void rule__Pattern__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7047:1: ( rule__Pattern__UnorderedGroup_4__Impl )
            // InternalMGLang.g:7048:2: rule__Pattern__UnorderedGroup_4__Impl
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
    // InternalMGLang.g:7055:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7059:1: ( ( ruleImport ) )
            // InternalMGLang.g:7060:2: ( ruleImport )
            {
            // InternalMGLang.g:7060:2: ( ruleImport )
            // InternalMGLang.g:7061:3: ruleImport
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


    // $ANTLR start "rule__MofgenFile__PatternsAssignment_1_0"
    // InternalMGLang.g:7070:1: rule__MofgenFile__PatternsAssignment_1_0 : ( rulePattern ) ;
    public final void rule__MofgenFile__PatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7074:1: ( ( rulePattern ) )
            // InternalMGLang.g:7075:2: ( rulePattern )
            {
            // InternalMGLang.g:7075:2: ( rulePattern )
            // InternalMGLang.g:7076:3: rulePattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getPatternsPatternParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__PatternsAssignment_1_0"


    // $ANTLR start "rule__MofgenFile__GeneratorsAssignment_1_1"
    // InternalMGLang.g:7085:1: rule__MofgenFile__GeneratorsAssignment_1_1 : ( ruleGenerator ) ;
    public final void rule__MofgenFile__GeneratorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7089:1: ( ( ruleGenerator ) )
            // InternalMGLang.g:7090:2: ( ruleGenerator )
            {
            // InternalMGLang.g:7090:2: ( ruleGenerator )
            // InternalMGLang.g:7091:3: ruleGenerator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMofgenFileAccess().getGeneratorsGeneratorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__GeneratorsAssignment_1_1"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // InternalMGLang.g:7100:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7104:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:7105:2: ( RULE_STRING )
            {
            // InternalMGLang.g:7105:2: ( RULE_STRING )
            // InternalMGLang.g:7106:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_1"


    // $ANTLR start "rule__Import__AliasAssignment_3"
    // InternalMGLang.g:7115:1: rule__Import__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7119:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7120:2: ( RULE_ID )
            {
            // InternalMGLang.g:7120:2: ( RULE_ID )
            // InternalMGLang.g:7121:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__AliasAssignment_3"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // InternalMGLang.g:7130:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7134:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7135:2: ( RULE_ID )
            {
            // InternalMGLang.g:7135:2: ( RULE_ID )
            // InternalMGLang.g:7136:3: RULE_ID
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
    // InternalMGLang.g:7145:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7149:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7150:2: ( ruleParameter )
            {
            // InternalMGLang.g:7150:2: ( ruleParameter )
            // InternalMGLang.g:7151:3: ruleParameter
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
    // InternalMGLang.g:7160:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7164:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7165:2: ( ruleParameter )
            {
            // InternalMGLang.g:7165:2: ( ruleParameter )
            // InternalMGLang.g:7166:3: ruleParameter
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
    // InternalMGLang.g:7175:1: rule__Pattern__CollsAssignment_4_0 : ( ruleCollection ) ;
    public final void rule__Pattern__CollsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7179:1: ( ( ruleCollection ) )
            // InternalMGLang.g:7180:2: ( ruleCollection )
            {
            // InternalMGLang.g:7180:2: ( ruleCollection )
            // InternalMGLang.g:7181:3: ruleCollection
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
    // InternalMGLang.g:7190:1: rule__Pattern__NodesAssignment_4_1 : ( ruleNode ) ;
    public final void rule__Pattern__NodesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7194:1: ( ( ruleNode ) )
            // InternalMGLang.g:7195:2: ( ruleNode )
            {
            // InternalMGLang.g:7195:2: ( ruleNode )
            // InternalMGLang.g:7196:3: ruleNode
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
    // InternalMGLang.g:7205:1: rule__Pattern__ParamManipulationsAssignment_4_2 : ( ruleParamManipulation ) ;
    public final void rule__Pattern__ParamManipulationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7209:1: ( ( ruleParamManipulation ) )
            // InternalMGLang.g:7210:2: ( ruleParamManipulation )
            {
            // InternalMGLang.g:7210:2: ( ruleParamManipulation )
            // InternalMGLang.g:7211:3: ruleParamManipulation
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
    // InternalMGLang.g:7220:1: rule__Pattern__SwitchesAssignment_4_3 : ( ruleSwitch ) ;
    public final void rule__Pattern__SwitchesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7224:1: ( ( ruleSwitch ) )
            // InternalMGLang.g:7225:2: ( ruleSwitch )
            {
            // InternalMGLang.g:7225:2: ( ruleSwitch )
            // InternalMGLang.g:7226:3: ruleSwitch
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
    // InternalMGLang.g:7235:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7239:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:7240:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:7240:2: ( rulePatternReturn )
            // InternalMGLang.g:7241:3: rulePatternReturn
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
    // InternalMGLang.g:7250:1: rule__PatternReturn__ReturnValueAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PatternReturn__ReturnValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7254:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7255:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7255:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7256:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 
            }
            // InternalMGLang.g:7257:3: ( RULE_ID )
            // InternalMGLang.g:7258:4: RULE_ID
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
    // InternalMGLang.g:7269:1: rule__ParamManipulation__ParamAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParamManipulation__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7273:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7274:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7274:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7275:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0()); 
            }
            // InternalMGLang.g:7276:3: ( RULE_ID )
            // InternalMGLang.g:7277:4: RULE_ID
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
    // InternalMGLang.g:7288:1: rule__ParamManipulation__ContentAssignment_1 : ( ruleNodeContent ) ;
    public final void rule__ParamManipulation__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7292:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:7293:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:7293:2: ( ruleNodeContent )
            // InternalMGLang.g:7294:3: ruleNodeContent
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
    // InternalMGLang.g:7303:1: rule__Node__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7307:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7308:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7308:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7309:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            }
            // InternalMGLang.g:7310:3: ( RULE_ID )
            // InternalMGLang.g:7311:4: RULE_ID
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
    // InternalMGLang.g:7322:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7326:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7327:2: ( RULE_ID )
            {
            // InternalMGLang.g:7327:2: ( RULE_ID )
            // InternalMGLang.g:7328:3: RULE_ID
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
    // InternalMGLang.g:7337:1: rule__Node__CreatedByAssignment_2_0 : ( ruleNodeContent ) ;
    public final void rule__Node__CreatedByAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7341:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:7342:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:7342:2: ( ruleNodeContent )
            // InternalMGLang.g:7343:3: ruleNodeContent
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
    // InternalMGLang.g:7352:1: rule__Node__CreatedByAssignment_2_1_1 : ( rulePatternCall ) ;
    public final void rule__Node__CreatedByAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7356:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:7357:2: ( rulePatternCall )
            {
            // InternalMGLang.g:7357:2: ( rulePatternCall )
            // InternalMGLang.g:7358:3: rulePatternCall
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
    // InternalMGLang.g:7367:1: rule__NodeContent__RefsAssignsAssignment_2 : ( ruleNodeReferenceOrAssignment ) ;
    public final void rule__NodeContent__RefsAssignsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7371:1: ( ( ruleNodeReferenceOrAssignment ) )
            // InternalMGLang.g:7372:2: ( ruleNodeReferenceOrAssignment )
            {
            // InternalMGLang.g:7372:2: ( ruleNodeReferenceOrAssignment )
            // InternalMGLang.g:7373:3: ruleNodeReferenceOrAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNodeReferenceOrAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:7382:1: rule__PatternCall__CalledAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7386:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7387:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7387:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7388:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 
            }
            // InternalMGLang.g:7389:3: ( RULE_ID )
            // InternalMGLang.g:7390:4: RULE_ID
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


    // $ANTLR start "rule__PatternCall__ParamsAssignment_2"
    // InternalMGLang.g:7401:1: rule__PatternCall__ParamsAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7405:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7406:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7406:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:7407:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternCall__ParamsAssignment_2"


    // $ANTLR start "rule__PatternNodeReference__TypeAssignment_0"
    // InternalMGLang.g:7416:1: rule__PatternNodeReference__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7420:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7421:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7421:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7422:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 
            }
            // InternalMGLang.g:7423:3: ( RULE_ID )
            // InternalMGLang.g:7424:4: RULE_ID
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
    // InternalMGLang.g:7435:1: rule__PatternNodeReference__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7439:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7440:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7440:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7441:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 
            }
            // InternalMGLang.g:7442:3: ( RULE_ID )
            // InternalMGLang.g:7443:4: RULE_ID
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
    // InternalMGLang.g:7454:1: rule__Assignment__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7458:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7459:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7459:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7460:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 
            }
            // InternalMGLang.g:7461:3: ( RULE_ID )
            // InternalMGLang.g:7462:4: RULE_ID
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
    // InternalMGLang.g:7473:1: rule__Assignment__ValueAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7477:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7478:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7478:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:7479:3: ruleArithmeticExpression
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
    // InternalMGLang.g:7488:1: rule__PrimitiveParameter__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7492:1: ( ( rulePrimitiveType ) )
            // InternalMGLang.g:7493:2: ( rulePrimitiveType )
            {
            // InternalMGLang.g:7493:2: ( rulePrimitiveType )
            // InternalMGLang.g:7494:3: rulePrimitiveType
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
    // InternalMGLang.g:7503:1: rule__PrimitiveParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7507:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7508:2: ( RULE_ID )
            {
            // InternalMGLang.g:7508:2: ( RULE_ID )
            // InternalMGLang.g:7509:3: RULE_ID
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


    // $ANTLR start "rule__ParameterNode__TypeAssignment_0"
    // InternalMGLang.g:7518:1: rule__ParameterNode__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterNode__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7522:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7523:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7523:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7524:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_0_0()); 
            }
            // InternalMGLang.g:7525:3: ( RULE_ID )
            // InternalMGLang.g:7526:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getTypeEClassifierIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getTypeEClassifierIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__TypeAssignment_0"


    // $ANTLR start "rule__ParameterNode__NameAssignment_1"
    // InternalMGLang.g:7537:1: rule__ParameterNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7541:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7542:2: ( RULE_ID )
            {
            // InternalMGLang.g:7542:2: ( RULE_ID )
            // InternalMGLang.g:7543:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterNode__NameAssignment_1"


    // $ANTLR start "rule__RefOrCall__RefAssignment_0"
    // InternalMGLang.g:7552:1: rule__RefOrCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RefOrCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7556:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7557:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7557:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7558:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefRefTypeCrossReference_0_0()); 
            }
            // InternalMGLang.g:7559:3: ( RULE_ID )
            // InternalMGLang.g:7560:4: RULE_ID
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
    // InternalMGLang.g:7571:1: rule__RefOrCall__RefAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__RefOrCall__RefAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7575:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7576:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7576:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7577:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefOrCallAccess().getRefETypedElementCrossReference_1_2_0()); 
            }
            // InternalMGLang.g:7578:3: ( RULE_ID )
            // InternalMGLang.g:7579:4: RULE_ID
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


    // $ANTLR start "rule__Generator__ParamsAssignment_3"
    // InternalMGLang.g:7590:1: rule__Generator__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__Generator__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7594:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7595:2: ( ruleParameter )
            {
            // InternalMGLang.g:7595:2: ( ruleParameter )
            // InternalMGLang.g:7596:3: ruleParameter
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
    // InternalMGLang.g:7605:1: rule__Generator__CommandsAssignment_6 : ( ruleGeneratorExpression ) ;
    public final void rule__Generator__CommandsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7609:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:7610:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:7610:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:7611:3: ruleGeneratorExpression
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


    // $ANTLR start "rule__PatternObjectCreation__PObjectAssignment_0"
    // InternalMGLang.g:7620:1: rule__PatternObjectCreation__PObjectAssignment_0 : ( rulePatternObject ) ;
    public final void rule__PatternObjectCreation__PObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7624:1: ( ( rulePatternObject ) )
            // InternalMGLang.g:7625:2: ( rulePatternObject )
            {
            // InternalMGLang.g:7625:2: ( rulePatternObject )
            // InternalMGLang.g:7626:3: rulePatternObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getPObjectPatternObjectParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePatternObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectCreationAccess().getPObjectPatternObjectParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__PObjectAssignment_0"


    // $ANTLR start "rule__PatternObjectCreation__PatternCallAssignment_2"
    // InternalMGLang.g:7635:1: rule__PatternObjectCreation__PatternCallAssignment_2 : ( rulePatternCall ) ;
    public final void rule__PatternObjectCreation__PatternCallAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7639:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:7640:2: ( rulePatternCall )
            {
            // InternalMGLang.g:7640:2: ( rulePatternCall )
            // InternalMGLang.g:7641:3: rulePatternCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getPatternCallPatternCallParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePatternCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectCreationAccess().getPatternCallPatternCallParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObjectCreation__PatternCallAssignment_2"


    // $ANTLR start "rule__PatternObject__TypeAssignment_0"
    // InternalMGLang.g:7650:1: rule__PatternObject__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7654:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7655:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7655:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7656:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0()); 
            }
            // InternalMGLang.g:7657:3: ( RULE_ID )
            // InternalMGLang.g:7658:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getTypePatternIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectAccess().getTypePatternIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__TypeAssignment_0"


    // $ANTLR start "rule__PatternObject__NameAssignment_1"
    // InternalMGLang.g:7669:1: rule__PatternObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7673:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7674:2: ( RULE_ID )
            {
            // InternalMGLang.g:7674:2: ( RULE_ID )
            // InternalMGLang.g:7675:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternObject__NameAssignment_1"


    // $ANTLR start "rule__ForStatement__HeadAssignment_1"
    // InternalMGLang.g:7684:1: rule__ForStatement__HeadAssignment_1 : ( ruleForHead ) ;
    public final void rule__ForStatement__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7688:1: ( ( ruleForHead ) )
            // InternalMGLang.g:7689:2: ( ruleForHead )
            {
            // InternalMGLang.g:7689:2: ( ruleForHead )
            // InternalMGLang.g:7690:3: ruleForHead
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
    // InternalMGLang.g:7699:1: rule__ForStatement__BodyAssignment_3 : ( ruleForBody ) ;
    public final void rule__ForStatement__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7703:1: ( ( ruleForBody ) )
            // InternalMGLang.g:7704:2: ( ruleForBody )
            {
            // InternalMGLang.g:7704:2: ( ruleForBody )
            // InternalMGLang.g:7705:3: ruleForBody
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
    // InternalMGLang.g:7714:1: rule__GeneralForHead__IteratorVarAssignment_0 : ( RULE_ID ) ;
    public final void rule__GeneralForHead__IteratorVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7718:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7719:2: ( RULE_ID )
            {
            // InternalMGLang.g:7719:2: ( RULE_ID )
            // InternalMGLang.g:7720:3: RULE_ID
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
    // InternalMGLang.g:7729:1: rule__GeneralForHead__RangeAssignment_2 : ( ruleForRange ) ;
    public final void rule__GeneralForHead__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7733:1: ( ( ruleForRange ) )
            // InternalMGLang.g:7734:2: ( ruleForRange )
            {
            // InternalMGLang.g:7734:2: ( ruleForRange )
            // InternalMGLang.g:7735:3: ruleForRange
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
    // InternalMGLang.g:7744:1: rule__ForEachHead__SrcAssignment_0 : ( ruleRefOrCall ) ;
    public final void rule__ForEachHead__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7748:1: ( ( ruleRefOrCall ) )
            // InternalMGLang.g:7749:2: ( ruleRefOrCall )
            {
            // InternalMGLang.g:7749:2: ( ruleRefOrCall )
            // InternalMGLang.g:7750:3: ruleRefOrCall
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
    // InternalMGLang.g:7759:1: rule__ForEachHead__ErefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachHead__ErefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7763:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7764:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7764:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7765:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getErefEReferenceCrossReference_2_0()); 
            }
            // InternalMGLang.g:7766:3: ( RULE_ID )
            // InternalMGLang.g:7767:4: RULE_ID
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
    // InternalMGLang.g:7778:1: rule__ForEachHead__IteratorVarAssignment_4 : ( RULE_ID ) ;
    public final void rule__ForEachHead__IteratorVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7782:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7783:2: ( RULE_ID )
            {
            // InternalMGLang.g:7783:2: ( RULE_ID )
            // InternalMGLang.g:7784:3: RULE_ID
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
    // InternalMGLang.g:7793:1: rule__ForBody__CommandsAssignment_1 : ( ruleGeneratorExpression ) ;
    public final void rule__ForBody__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7797:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:7798:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:7798:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:7799:3: ruleGeneratorExpression
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
    // InternalMGLang.g:7808:1: rule__IfElseSwitch__CasesAssignment_2 : ( ruleIfElseCase ) ;
    public final void rule__IfElseSwitch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7812:1: ( ( ruleIfElseCase ) )
            // InternalMGLang.g:7813:2: ( ruleIfElseCase )
            {
            // InternalMGLang.g:7813:2: ( ruleIfElseCase )
            // InternalMGLang.g:7814:3: ruleIfElseCase
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
    // InternalMGLang.g:7823:1: rule__IfElseSwitch__DefaultAssignment_3 : ( ruleDefault ) ;
    public final void rule__IfElseSwitch__DefaultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7827:1: ( ( ruleDefault ) )
            // InternalMGLang.g:7828:2: ( ruleDefault )
            {
            // InternalMGLang.g:7828:2: ( ruleDefault )
            // InternalMGLang.g:7829:3: ruleDefault
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
    // InternalMGLang.g:7838:1: rule__IfElseCase__ValAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__IfElseCase__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7842:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7843:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7843:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:7844:3: ruleArithmeticExpression
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
    // InternalMGLang.g:7853:1: rule__IfElseCase__BodyAssignment_3 : ( ruleCaseBody ) ;
    public final void rule__IfElseCase__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7857:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:7858:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:7858:2: ( ruleCaseBody )
            // InternalMGLang.g:7859:3: ruleCaseBody
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
    // InternalMGLang.g:7868:1: rule__SwitchCase__AttributeAssignment_2 : ( ruleRefOrCall ) ;
    public final void rule__SwitchCase__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7872:1: ( ( ruleRefOrCall ) )
            // InternalMGLang.g:7873:2: ( ruleRefOrCall )
            {
            // InternalMGLang.g:7873:2: ( ruleRefOrCall )
            // InternalMGLang.g:7874:3: ruleRefOrCall
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
    // InternalMGLang.g:7883:1: rule__SwitchCase__CasesAssignment_5 : ( ruleCase ) ;
    public final void rule__SwitchCase__CasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7887:1: ( ( ruleCase ) )
            // InternalMGLang.g:7888:2: ( ruleCase )
            {
            // InternalMGLang.g:7888:2: ( ruleCase )
            // InternalMGLang.g:7889:3: ruleCase
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
    // InternalMGLang.g:7898:1: rule__SwitchCase__DefaultAssignment_6 : ( ruleDefault ) ;
    public final void rule__SwitchCase__DefaultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7902:1: ( ( ruleDefault ) )
            // InternalMGLang.g:7903:2: ( ruleDefault )
            {
            // InternalMGLang.g:7903:2: ( ruleDefault )
            // InternalMGLang.g:7904:3: ruleDefault
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


    // $ANTLR start "rule__Case__NodeAssignment_1"
    // InternalMGLang.g:7913:1: rule__Case__NodeAssignment_1 : ( ruleNode ) ;
    public final void rule__Case__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7917:1: ( ( ruleNode ) )
            // InternalMGLang.g:7918:2: ( ruleNode )
            {
            // InternalMGLang.g:7918:2: ( ruleNode )
            // InternalMGLang.g:7919:3: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getNodeNodeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getNodeNodeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__NodeAssignment_1"


    // $ANTLR start "rule__Case__WhenAssignment_2_1"
    // InternalMGLang.g:7928:1: rule__Case__WhenAssignment_2_1 : ( ruleArithmeticExpression ) ;
    public final void rule__Case__WhenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7932:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7933:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7933:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:7934:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getWhenArithmeticExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getWhenArithmeticExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__WhenAssignment_2_1"


    // $ANTLR start "rule__Case__BodyAssignment_4"
    // InternalMGLang.g:7943:1: rule__Case__BodyAssignment_4 : ( ruleCaseBody ) ;
    public final void rule__Case__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7947:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:7948:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:7948:2: ( ruleCaseBody )
            // InternalMGLang.g:7949:3: ruleCaseBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getBodyCaseBodyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getBodyCaseBodyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__BodyAssignment_4"


    // $ANTLR start "rule__CaseBody__ExpressionsAssignment_0_2"
    // InternalMGLang.g:7958:1: rule__CaseBody__ExpressionsAssignment_0_2 : ( ruleGeneratorExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7962:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:7963:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:7963:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:7964:3: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:7973:1: rule__CaseBody__ExpressionsAssignment_1_0 : ( ruleGeneratorExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7977:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:7978:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:7978:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:7979:3: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:7988:1: rule__List__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7992:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7993:2: ( RULE_ID )
            {
            // InternalMGLang.g:7993:2: ( RULE_ID )
            // InternalMGLang.g:7994:3: RULE_ID
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


    // $ANTLR start "rule__ListAdHoc__ElementsAssignment_1"
    // InternalMGLang.g:8003:1: rule__ListAdHoc__ElementsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ListAdHoc__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8007:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8008:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8008:2: ( ruleLiteral )
            // InternalMGLang.g:8009:3: ruleLiteral
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
    // InternalMGLang.g:8018:1: rule__ListAdHoc__ElementsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ListAdHoc__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8022:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8023:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8023:2: ( ruleLiteral )
            // InternalMGLang.g:8024:3: ruleLiteral
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
    // InternalMGLang.g:8033:1: rule__Map__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Map__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8037:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8038:2: ( RULE_ID )
            {
            // InternalMGLang.g:8038:2: ( RULE_ID )
            // InternalMGLang.g:8039:3: RULE_ID
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


    // $ANTLR start "rule__MapAdHoc__EntriesAssignment_1"
    // InternalMGLang.g:8048:1: rule__MapAdHoc__EntriesAssignment_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8052:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:8053:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:8053:2: ( ruleMapTupel )
            // InternalMGLang.g:8054:3: ruleMapTupel
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
    // InternalMGLang.g:8063:1: rule__MapAdHoc__EntriesAssignment_2_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8067:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:8068:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:8068:2: ( ruleMapTupel )
            // InternalMGLang.g:8069:3: ruleMapTupel
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
    // InternalMGLang.g:8078:1: rule__MapTupel__KeyAssignment_1 : ( ruleLiteral ) ;
    public final void rule__MapTupel__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8082:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8083:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8083:2: ( ruleLiteral )
            // InternalMGLang.g:8084:3: ruleLiteral
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
    // InternalMGLang.g:8093:1: rule__MapTupel__ValueAssignment_3 : ( ruleArithmeticExpression ) ;
    public final void rule__MapTupel__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8097:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8098:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8098:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8099:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8108:1: rule__ForRange__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8112:1: ( ( RULE_INT ) )
            // InternalMGLang.g:8113:2: ( RULE_INT )
            {
            // InternalMGLang.g:8113:2: ( RULE_INT )
            // InternalMGLang.g:8114:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getStartINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeAccess().getStartINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:8123:1: rule__ForRange__EndAssignment_2 : ( RULE_INT ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8127:1: ( ( RULE_INT ) )
            // InternalMGLang.g:8128:2: ( RULE_INT )
            {
            // InternalMGLang.g:8128:2: ( RULE_INT )
            // InternalMGLang.g:8129:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getEndINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRangeAccess().getEndINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:8138:1: rule__TertiaryExpression__OpAssignment_1_1 : ( ruleTertiaryOp ) ;
    public final void rule__TertiaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8142:1: ( ( ruleTertiaryOp ) )
            // InternalMGLang.g:8143:2: ( ruleTertiaryOp )
            {
            // InternalMGLang.g:8143:2: ( ruleTertiaryOp )
            // InternalMGLang.g:8144:3: ruleTertiaryOp
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
    // InternalMGLang.g:8153:1: rule__TertiaryExpression__RightAssignment_1_2 : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8157:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:8158:2: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:8158:2: ( ruleSecondaryExpression )
            // InternalMGLang.g:8159:3: ruleSecondaryExpression
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
    // InternalMGLang.g:8168:1: rule__SecondaryExpression__OpAssignment_1_1 : ( ruleSecondaryOp ) ;
    public final void rule__SecondaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8172:1: ( ( ruleSecondaryOp ) )
            // InternalMGLang.g:8173:2: ( ruleSecondaryOp )
            {
            // InternalMGLang.g:8173:2: ( ruleSecondaryOp )
            // InternalMGLang.g:8174:3: ruleSecondaryOp
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
    // InternalMGLang.g:8183:1: rule__SecondaryExpression__RightAssignment_1_2 : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8187:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:8188:2: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:8188:2: ( rulePrimaryExpr )
            // InternalMGLang.g:8189:3: rulePrimaryExpr
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
    // InternalMGLang.g:8198:1: rule__PrimaryExpr__OpAssignment_1_1 : ( rulePrimaryOp ) ;
    public final void rule__PrimaryExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8202:1: ( ( rulePrimaryOp ) )
            // InternalMGLang.g:8203:2: ( rulePrimaryOp )
            {
            // InternalMGLang.g:8203:2: ( rulePrimaryOp )
            // InternalMGLang.g:8204:3: rulePrimaryOp
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
    // InternalMGLang.g:8213:1: rule__PrimaryExpr__RightAssignment_1_2 : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8217:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:8218:2: ( ruleRelationExpression )
            {
            // InternalMGLang.g:8218:2: ( ruleRelationExpression )
            // InternalMGLang.g:8219:3: ruleRelationExpression
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
    // InternalMGLang.g:8228:1: rule__RelationExpression__RelationAssignment_1_1 : ( ruleRelationalOp ) ;
    public final void rule__RelationExpression__RelationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8232:1: ( ( ruleRelationalOp ) )
            // InternalMGLang.g:8233:2: ( ruleRelationalOp )
            {
            // InternalMGLang.g:8233:2: ( ruleRelationalOp )
            // InternalMGLang.g:8234:3: ruleRelationalOp
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
    // InternalMGLang.g:8243:1: rule__RelationExpression__RightAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8247:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:8248:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:8248:2: ( ruleBaseExpr )
            // InternalMGLang.g:8249:3: ruleBaseExpr
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
    // InternalMGLang.g:8258:1: rule__BaseExpr__ExprAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__BaseExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8262:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:8263:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:8263:2: ( ruleBaseExpr )
            // InternalMGLang.g:8264:3: ruleBaseExpr
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
    // InternalMGLang.g:8273:1: rule__BaseExpr__FuncAssignment_2_1 : ( ruleMathFunc ) ;
    public final void rule__BaseExpr__FuncAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8277:1: ( ( ruleMathFunc ) )
            // InternalMGLang.g:8278:2: ( ruleMathFunc )
            {
            // InternalMGLang.g:8278:2: ( ruleMathFunc )
            // InternalMGLang.g:8279:3: ruleMathFunc
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
    // InternalMGLang.g:8288:1: rule__BaseExpr__ExprAssignment_2_3 : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__ExprAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8292:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8293:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8293:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8294:3: ruleArithmeticExpression
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

    // $ANTLR start synpred1_InternalMGLang
    public final void synpred1_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:6927:8: ( rule__Pattern__CollsAssignment_4_0 )
        // InternalMGLang.g:6927:9: rule__Pattern__CollsAssignment_4_0
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
        // InternalMGLang.g:6949:8: ( rule__Pattern__NodesAssignment_4_1 )
        // InternalMGLang.g:6949:9: rule__Pattern__NodesAssignment_4_1
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
        // InternalMGLang.g:6971:8: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
        // InternalMGLang.g:6971:9: rule__Pattern__ParamManipulationsAssignment_4_2
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
        // InternalMGLang.g:6993:8: ( rule__Pattern__SwitchesAssignment_4_3 )
        // InternalMGLang.g:6993:9: rule__Pattern__SwitchesAssignment_4_3
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000802000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0484000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000200001E0400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000001E0400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800030000018670L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0800010000018672L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0800010000018670L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000001E0402L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0485008000000400L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0485000000000402L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0485000000000400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0485004000000400L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0900010000018670L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200040000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000007E00002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0480000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0484000000000402L});

}
