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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TRUE", "RULE_FALSE", "RULE_ASSIGNMENT_OP", "RULE_INT", "RULE_ID", "RULE_NEWLINE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sqrt'", "'abs'", "'int'", "'char'", "'double'", "'String'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'+'", "'-'", "'||'", "'%'", "'^'", "'*'", "'/'", "'&&'", "'import'", "'as'", "'pattern'", "'{'", "'}'", "'('", "')'", "','", "'return'", "'this'", "'.'", "'['", "']'", "'->'", "'!'", "'gen'", "'for'", "'in'", "'if'", "'else'", "'switch'", "'default'", "':'", "'case'", "'List'", "'Map'"
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
    public static final int RULE_ID=9;
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
    public static final int RULE_FALSE=6;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=10;
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
    // InternalMGLang.g:54:1: entryRuleMofgenFile : ruleMofgenFile EOF ;
    public final void entryRuleMofgenFile() throws RecognitionException {
        try {
            // InternalMGLang.g:55:1: ( ruleMofgenFile EOF )
            // InternalMGLang.g:56:1: ruleMofgenFile EOF
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
    // InternalMGLang.g:63:1: ruleMofgenFile : ( ( rule__MofgenFile__Group__0 ) ) ;
    public final void ruleMofgenFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:67:2: ( ( ( rule__MofgenFile__Group__0 ) ) )
            // InternalMGLang.g:68:2: ( ( rule__MofgenFile__Group__0 ) )
            {
            // InternalMGLang.g:68:2: ( ( rule__MofgenFile__Group__0 ) )
            // InternalMGLang.g:69:3: ( rule__MofgenFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getGroup()); 
            }
            // InternalMGLang.g:70:3: ( rule__MofgenFile__Group__0 )
            // InternalMGLang.g:70:4: rule__MofgenFile__Group__0
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
    // InternalMGLang.g:79:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMGLang.g:80:1: ( ruleImport EOF )
            // InternalMGLang.g:81:1: ruleImport EOF
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
    // InternalMGLang.g:88:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:92:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMGLang.g:93:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMGLang.g:93:2: ( ( rule__Import__Group__0 ) )
            // InternalMGLang.g:94:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalMGLang.g:95:3: ( rule__Import__Group__0 )
            // InternalMGLang.g:95:4: rule__Import__Group__0
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
    // InternalMGLang.g:104:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMGLang.g:105:1: ( rulePattern EOF )
            // InternalMGLang.g:106:1: rulePattern EOF
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
    // InternalMGLang.g:113:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:117:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalMGLang.g:118:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalMGLang.g:118:2: ( ( rule__Pattern__Group__0 ) )
            // InternalMGLang.g:119:3: ( rule__Pattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup()); 
            }
            // InternalMGLang.g:120:3: ( rule__Pattern__Group__0 )
            // InternalMGLang.g:120:4: rule__Pattern__Group__0
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
    // InternalMGLang.g:129:1: entryRulePatternReturn : rulePatternReturn EOF ;
    public final void entryRulePatternReturn() throws RecognitionException {
        try {
            // InternalMGLang.g:130:1: ( rulePatternReturn EOF )
            // InternalMGLang.g:131:1: rulePatternReturn EOF
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
    // InternalMGLang.g:138:1: rulePatternReturn : ( ( rule__PatternReturn__Group__0 ) ) ;
    public final void rulePatternReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:142:2: ( ( ( rule__PatternReturn__Group__0 ) ) )
            // InternalMGLang.g:143:2: ( ( rule__PatternReturn__Group__0 ) )
            {
            // InternalMGLang.g:143:2: ( ( rule__PatternReturn__Group__0 ) )
            // InternalMGLang.g:144:3: ( rule__PatternReturn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getGroup()); 
            }
            // InternalMGLang.g:145:3: ( rule__PatternReturn__Group__0 )
            // InternalMGLang.g:145:4: rule__PatternReturn__Group__0
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
    // InternalMGLang.g:154:1: entryRuleParamManipulation : ruleParamManipulation EOF ;
    public final void entryRuleParamManipulation() throws RecognitionException {
        try {
            // InternalMGLang.g:155:1: ( ruleParamManipulation EOF )
            // InternalMGLang.g:156:1: ruleParamManipulation EOF
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
    // InternalMGLang.g:163:1: ruleParamManipulation : ( ( rule__ParamManipulation__Group__0 ) ) ;
    public final void ruleParamManipulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:167:2: ( ( ( rule__ParamManipulation__Group__0 ) ) )
            // InternalMGLang.g:168:2: ( ( rule__ParamManipulation__Group__0 ) )
            {
            // InternalMGLang.g:168:2: ( ( rule__ParamManipulation__Group__0 ) )
            // InternalMGLang.g:169:3: ( rule__ParamManipulation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getGroup()); 
            }
            // InternalMGLang.g:170:3: ( rule__ParamManipulation__Group__0 )
            // InternalMGLang.g:170:4: rule__ParamManipulation__Group__0
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
    // InternalMGLang.g:179:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalMGLang.g:180:1: ( ruleNode EOF )
            // InternalMGLang.g:181:1: ruleNode EOF
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
    // InternalMGLang.g:188:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:192:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalMGLang.g:193:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalMGLang.g:193:2: ( ( rule__Node__Group__0 ) )
            // InternalMGLang.g:194:3: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalMGLang.g:195:3: ( rule__Node__Group__0 )
            // InternalMGLang.g:195:4: rule__Node__Group__0
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
    // InternalMGLang.g:204:1: entryRuleNodeContent : ruleNodeContent EOF ;
    public final void entryRuleNodeContent() throws RecognitionException {
        try {
            // InternalMGLang.g:205:1: ( ruleNodeContent EOF )
            // InternalMGLang.g:206:1: ruleNodeContent EOF
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
    // InternalMGLang.g:213:1: ruleNodeContent : ( ( rule__NodeContent__Group__0 ) ) ;
    public final void ruleNodeContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:217:2: ( ( ( rule__NodeContent__Group__0 ) ) )
            // InternalMGLang.g:218:2: ( ( rule__NodeContent__Group__0 ) )
            {
            // InternalMGLang.g:218:2: ( ( rule__NodeContent__Group__0 ) )
            // InternalMGLang.g:219:3: ( rule__NodeContent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getGroup()); 
            }
            // InternalMGLang.g:220:3: ( rule__NodeContent__Group__0 )
            // InternalMGLang.g:220:4: rule__NodeContent__Group__0
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
    // InternalMGLang.g:229:1: entryRulePatternCall : rulePatternCall EOF ;
    public final void entryRulePatternCall() throws RecognitionException {
        try {
            // InternalMGLang.g:230:1: ( rulePatternCall EOF )
            // InternalMGLang.g:231:1: rulePatternCall EOF
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
    // InternalMGLang.g:238:1: rulePatternCall : ( ( rule__PatternCall__Group__0 ) ) ;
    public final void rulePatternCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:242:2: ( ( ( rule__PatternCall__Group__0 ) ) )
            // InternalMGLang.g:243:2: ( ( rule__PatternCall__Group__0 ) )
            {
            // InternalMGLang.g:243:2: ( ( rule__PatternCall__Group__0 ) )
            // InternalMGLang.g:244:3: ( rule__PatternCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getGroup()); 
            }
            // InternalMGLang.g:245:3: ( rule__PatternCall__Group__0 )
            // InternalMGLang.g:245:4: rule__PatternCall__Group__0
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
    // InternalMGLang.g:254:1: entryRuleNodeReferenceOrAssignment : ruleNodeReferenceOrAssignment EOF ;
    public final void entryRuleNodeReferenceOrAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:255:1: ( ruleNodeReferenceOrAssignment EOF )
            // InternalMGLang.g:256:1: ruleNodeReferenceOrAssignment EOF
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
    // InternalMGLang.g:263:1: ruleNodeReferenceOrAssignment : ( ( rule__NodeReferenceOrAssignment__Group__0 ) ) ;
    public final void ruleNodeReferenceOrAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:267:2: ( ( ( rule__NodeReferenceOrAssignment__Group__0 ) ) )
            // InternalMGLang.g:268:2: ( ( rule__NodeReferenceOrAssignment__Group__0 ) )
            {
            // InternalMGLang.g:268:2: ( ( rule__NodeReferenceOrAssignment__Group__0 ) )
            // InternalMGLang.g:269:3: ( rule__NodeReferenceOrAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup()); 
            }
            // InternalMGLang.g:270:3: ( rule__NodeReferenceOrAssignment__Group__0 )
            // InternalMGLang.g:270:4: rule__NodeReferenceOrAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:279:1: entryRulePatternNodeReference : rulePatternNodeReference EOF ;
    public final void entryRulePatternNodeReference() throws RecognitionException {
        try {
            // InternalMGLang.g:280:1: ( rulePatternNodeReference EOF )
            // InternalMGLang.g:281:1: rulePatternNodeReference EOF
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
    // InternalMGLang.g:288:1: rulePatternNodeReference : ( ( rule__PatternNodeReference__Group__0 ) ) ;
    public final void rulePatternNodeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:292:2: ( ( ( rule__PatternNodeReference__Group__0 ) ) )
            // InternalMGLang.g:293:2: ( ( rule__PatternNodeReference__Group__0 ) )
            {
            // InternalMGLang.g:293:2: ( ( rule__PatternNodeReference__Group__0 ) )
            // InternalMGLang.g:294:3: ( rule__PatternNodeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 
            }
            // InternalMGLang.g:295:3: ( rule__PatternNodeReference__Group__0 )
            // InternalMGLang.g:295:4: rule__PatternNodeReference__Group__0
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
    // InternalMGLang.g:304:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:305:1: ( ruleAssignment EOF )
            // InternalMGLang.g:306:1: ruleAssignment EOF
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
    // InternalMGLang.g:313:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:317:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMGLang.g:318:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMGLang.g:318:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMGLang.g:319:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalMGLang.g:320:3: ( rule__Assignment__Group__0 )
            // InternalMGLang.g:320:4: rule__Assignment__Group__0
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
    // InternalMGLang.g:329:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:330:1: ( ruleParameter EOF )
            // InternalMGLang.g:331:1: ruleParameter EOF
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
    // InternalMGLang.g:338:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:342:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalMGLang.g:343:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalMGLang.g:343:2: ( ( rule__Parameter__Alternatives ) )
            // InternalMGLang.g:344:3: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // InternalMGLang.g:345:3: ( rule__Parameter__Alternatives )
            // InternalMGLang.g:345:4: rule__Parameter__Alternatives
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
    // InternalMGLang.g:354:1: entryRulePrimitiveParameter : rulePrimitiveParameter EOF ;
    public final void entryRulePrimitiveParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:355:1: ( rulePrimitiveParameter EOF )
            // InternalMGLang.g:356:1: rulePrimitiveParameter EOF
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
    // InternalMGLang.g:363:1: rulePrimitiveParameter : ( ( rule__PrimitiveParameter__Group__0 ) ) ;
    public final void rulePrimitiveParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:367:2: ( ( ( rule__PrimitiveParameter__Group__0 ) ) )
            // InternalMGLang.g:368:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            {
            // InternalMGLang.g:368:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            // InternalMGLang.g:369:3: ( rule__PrimitiveParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getGroup()); 
            }
            // InternalMGLang.g:370:3: ( rule__PrimitiveParameter__Group__0 )
            // InternalMGLang.g:370:4: rule__PrimitiveParameter__Group__0
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
    // InternalMGLang.g:379:1: entryRuleParameterNode : ruleParameterNode EOF ;
    public final void entryRuleParameterNode() throws RecognitionException {
        try {
            // InternalMGLang.g:380:1: ( ruleParameterNode EOF )
            // InternalMGLang.g:381:1: ruleParameterNode EOF
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
    // InternalMGLang.g:388:1: ruleParameterNode : ( ( rule__ParameterNode__Group__0 ) ) ;
    public final void ruleParameterNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:392:2: ( ( ( rule__ParameterNode__Group__0 ) ) )
            // InternalMGLang.g:393:2: ( ( rule__ParameterNode__Group__0 ) )
            {
            // InternalMGLang.g:393:2: ( ( rule__ParameterNode__Group__0 ) )
            // InternalMGLang.g:394:3: ( rule__ParameterNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getGroup()); 
            }
            // InternalMGLang.g:395:3: ( rule__ParameterNode__Group__0 )
            // InternalMGLang.g:395:4: rule__ParameterNode__Group__0
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


    // $ANTLR start "entryRuleParameterRefOrMethodCall"
    // InternalMGLang.g:404:1: entryRuleParameterRefOrMethodCall : ruleParameterRefOrMethodCall EOF ;
    public final void entryRuleParameterRefOrMethodCall() throws RecognitionException {
        try {
            // InternalMGLang.g:405:1: ( ruleParameterRefOrMethodCall EOF )
            // InternalMGLang.g:406:1: ruleParameterRefOrMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefOrMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterRefOrMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefOrMethodCallRule()); 
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
    // $ANTLR end "entryRuleParameterRefOrMethodCall"


    // $ANTLR start "ruleParameterRefOrMethodCall"
    // InternalMGLang.g:413:1: ruleParameterRefOrMethodCall : ( ( rule__ParameterRefOrMethodCall__Alternatives ) ) ;
    public final void ruleParameterRefOrMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:417:2: ( ( ( rule__ParameterRefOrMethodCall__Alternatives ) ) )
            // InternalMGLang.g:418:2: ( ( rule__ParameterRefOrMethodCall__Alternatives ) )
            {
            // InternalMGLang.g:418:2: ( ( rule__ParameterRefOrMethodCall__Alternatives ) )
            // InternalMGLang.g:419:3: ( rule__ParameterRefOrMethodCall__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefOrMethodCallAccess().getAlternatives()); 
            }
            // InternalMGLang.g:420:3: ( rule__ParameterRefOrMethodCall__Alternatives )
            // InternalMGLang.g:420:4: rule__ParameterRefOrMethodCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterRefOrMethodCall__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefOrMethodCallAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterRefOrMethodCall"


    // $ANTLR start "entryRuleParameterRef"
    // InternalMGLang.g:429:1: entryRuleParameterRef : ruleParameterRef EOF ;
    public final void entryRuleParameterRef() throws RecognitionException {
        try {
            // InternalMGLang.g:430:1: ( ruleParameterRef EOF )
            // InternalMGLang.g:431:1: ruleParameterRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefRule()); 
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
    // $ANTLR end "entryRuleParameterRef"


    // $ANTLR start "ruleParameterRef"
    // InternalMGLang.g:438:1: ruleParameterRef : ( ( rule__ParameterRef__RefAssignment ) ) ;
    public final void ruleParameterRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:442:2: ( ( ( rule__ParameterRef__RefAssignment ) ) )
            // InternalMGLang.g:443:2: ( ( rule__ParameterRef__RefAssignment ) )
            {
            // InternalMGLang.g:443:2: ( ( rule__ParameterRef__RefAssignment ) )
            // InternalMGLang.g:444:3: ( rule__ParameterRef__RefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefAssignment()); 
            }
            // InternalMGLang.g:445:3: ( rule__ParameterRef__RefAssignment )
            // InternalMGLang.g:445:4: rule__ParameterRef__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterRef__RefAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefAccess().getRefAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterRef"


    // $ANTLR start "entryRuleMethodCall"
    // InternalMGLang.g:454:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // InternalMGLang.g:455:1: ( ruleMethodCall EOF )
            // InternalMGLang.g:456:1: ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallRule()); 
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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalMGLang.g:463:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:467:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // InternalMGLang.g:468:2: ( ( rule__MethodCall__Group__0 ) )
            {
            // InternalMGLang.g:468:2: ( ( rule__MethodCall__Group__0 ) )
            // InternalMGLang.g:469:3: ( rule__MethodCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getGroup()); 
            }
            // InternalMGLang.g:470:3: ( rule__MethodCall__Group__0 )
            // InternalMGLang.g:470:4: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalMGLang.g:479:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:480:1: ( ruleArithmeticExpression EOF )
            // InternalMGLang.g:481:1: ruleArithmeticExpression EOF
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
    // InternalMGLang.g:488:1: ruleArithmeticExpression : ( ruleTertiaryExpression ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:492:2: ( ( ruleTertiaryExpression ) )
            // InternalMGLang.g:493:2: ( ruleTertiaryExpression )
            {
            // InternalMGLang.g:493:2: ( ruleTertiaryExpression )
            // InternalMGLang.g:494:3: ruleTertiaryExpression
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
    // InternalMGLang.g:504:1: entryRuleTertiaryExpression : ruleTertiaryExpression EOF ;
    public final void entryRuleTertiaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:505:1: ( ruleTertiaryExpression EOF )
            // InternalMGLang.g:506:1: ruleTertiaryExpression EOF
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
    // InternalMGLang.g:513:1: ruleTertiaryExpression : ( ( rule__TertiaryExpression__Group__0 ) ) ;
    public final void ruleTertiaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:517:2: ( ( ( rule__TertiaryExpression__Group__0 ) ) )
            // InternalMGLang.g:518:2: ( ( rule__TertiaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:518:2: ( ( rule__TertiaryExpression__Group__0 ) )
            // InternalMGLang.g:519:3: ( rule__TertiaryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:520:3: ( rule__TertiaryExpression__Group__0 )
            // InternalMGLang.g:520:4: rule__TertiaryExpression__Group__0
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
    // InternalMGLang.g:529:1: entryRuleSecondaryExpression : ruleSecondaryExpression EOF ;
    public final void entryRuleSecondaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:530:1: ( ruleSecondaryExpression EOF )
            // InternalMGLang.g:531:1: ruleSecondaryExpression EOF
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
    // InternalMGLang.g:538:1: ruleSecondaryExpression : ( ( rule__SecondaryExpression__Group__0 ) ) ;
    public final void ruleSecondaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:542:2: ( ( ( rule__SecondaryExpression__Group__0 ) ) )
            // InternalMGLang.g:543:2: ( ( rule__SecondaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:543:2: ( ( rule__SecondaryExpression__Group__0 ) )
            // InternalMGLang.g:544:3: ( rule__SecondaryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:545:3: ( rule__SecondaryExpression__Group__0 )
            // InternalMGLang.g:545:4: rule__SecondaryExpression__Group__0
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
    // InternalMGLang.g:554:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:555:1: ( rulePrimaryExpr EOF )
            // InternalMGLang.g:556:1: rulePrimaryExpr EOF
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
    // InternalMGLang.g:563:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Group__0 ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:567:2: ( ( ( rule__PrimaryExpr__Group__0 ) ) )
            // InternalMGLang.g:568:2: ( ( rule__PrimaryExpr__Group__0 ) )
            {
            // InternalMGLang.g:568:2: ( ( rule__PrimaryExpr__Group__0 ) )
            // InternalMGLang.g:569:3: ( rule__PrimaryExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup()); 
            }
            // InternalMGLang.g:570:3: ( rule__PrimaryExpr__Group__0 )
            // InternalMGLang.g:570:4: rule__PrimaryExpr__Group__0
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
    // InternalMGLang.g:579:1: entryRuleRelationExpression : ruleRelationExpression EOF ;
    public final void entryRuleRelationExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:580:1: ( ruleRelationExpression EOF )
            // InternalMGLang.g:581:1: ruleRelationExpression EOF
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
    // InternalMGLang.g:588:1: ruleRelationExpression : ( ( rule__RelationExpression__Group__0 ) ) ;
    public final void ruleRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:592:2: ( ( ( rule__RelationExpression__Group__0 ) ) )
            // InternalMGLang.g:593:2: ( ( rule__RelationExpression__Group__0 ) )
            {
            // InternalMGLang.g:593:2: ( ( rule__RelationExpression__Group__0 ) )
            // InternalMGLang.g:594:3: ( rule__RelationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getGroup()); 
            }
            // InternalMGLang.g:595:3: ( rule__RelationExpression__Group__0 )
            // InternalMGLang.g:595:4: rule__RelationExpression__Group__0
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
    // InternalMGLang.g:604:1: entryRuleBaseExpr : ruleBaseExpr EOF ;
    public final void entryRuleBaseExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:605:1: ( ruleBaseExpr EOF )
            // InternalMGLang.g:606:1: ruleBaseExpr EOF
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
    // InternalMGLang.g:613:1: ruleBaseExpr : ( ( rule__BaseExpr__Alternatives ) ) ;
    public final void ruleBaseExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:617:2: ( ( ( rule__BaseExpr__Alternatives ) ) )
            // InternalMGLang.g:618:2: ( ( rule__BaseExpr__Alternatives ) )
            {
            // InternalMGLang.g:618:2: ( ( rule__BaseExpr__Alternatives ) )
            // InternalMGLang.g:619:3: ( rule__BaseExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getAlternatives()); 
            }
            // InternalMGLang.g:620:3: ( rule__BaseExpr__Alternatives )
            // InternalMGLang.g:620:4: rule__BaseExpr__Alternatives
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
    // InternalMGLang.g:629:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:630:1: ( ruleLiteral EOF )
            // InternalMGLang.g:631:1: ruleLiteral EOF
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
    // InternalMGLang.g:638:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:642:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMGLang.g:643:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMGLang.g:643:2: ( ( rule__Literal__Alternatives ) )
            // InternalMGLang.g:644:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalMGLang.g:645:3: ( rule__Literal__Alternatives )
            // InternalMGLang.g:645:4: rule__Literal__Alternatives
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
    // InternalMGLang.g:654:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:655:1: ( ruleBooleanLiteral EOF )
            // InternalMGLang.g:656:1: ruleBooleanLiteral EOF
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
    // InternalMGLang.g:663:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:667:2: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // InternalMGLang.g:668:2: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // InternalMGLang.g:668:2: ( ( rule__BooleanLiteral__Alternatives ) )
            // InternalMGLang.g:669:3: ( rule__BooleanLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            }
            // InternalMGLang.g:670:3: ( rule__BooleanLiteral__Alternatives )
            // InternalMGLang.g:670:4: rule__BooleanLiteral__Alternatives
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
    // InternalMGLang.g:679:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:680:1: ( ruleStringLiteral EOF )
            // InternalMGLang.g:681:1: ruleStringLiteral EOF
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
    // InternalMGLang.g:688:1: ruleStringLiteral : ( RULE_STRING ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:692:2: ( ( RULE_STRING ) )
            // InternalMGLang.g:693:2: ( RULE_STRING )
            {
            // InternalMGLang.g:693:2: ( RULE_STRING )
            // InternalMGLang.g:694:3: RULE_STRING
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
    // InternalMGLang.g:704:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:705:1: ( ruleNumberLiteral EOF )
            // InternalMGLang.g:706:1: ruleNumberLiteral EOF
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
    // InternalMGLang.g:713:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:717:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalMGLang.g:718:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalMGLang.g:718:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalMGLang.g:719:3: ( rule__NumberLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            }
            // InternalMGLang.g:720:3: ( rule__NumberLiteral__Group__0 )
            // InternalMGLang.g:720:4: rule__NumberLiteral__Group__0
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


    // $ANTLR start "entryRuleGenerator"
    // InternalMGLang.g:729:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalMGLang.g:730:1: ( ruleGenerator EOF )
            // InternalMGLang.g:731:1: ruleGenerator EOF
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
    // InternalMGLang.g:738:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:742:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalMGLang.g:743:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalMGLang.g:743:2: ( ( rule__Generator__Group__0 ) )
            // InternalMGLang.g:744:3: ( rule__Generator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup()); 
            }
            // InternalMGLang.g:745:3: ( rule__Generator__Group__0 )
            // InternalMGLang.g:745:4: rule__Generator__Group__0
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
    // InternalMGLang.g:754:1: entryRuleGeneratorExpression : ruleGeneratorExpression EOF ;
    public final void entryRuleGeneratorExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:755:1: ( ruleGeneratorExpression EOF )
            // InternalMGLang.g:756:1: ruleGeneratorExpression EOF
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
    // InternalMGLang.g:763:1: ruleGeneratorExpression : ( ( rule__GeneratorExpression__Alternatives ) ) ;
    public final void ruleGeneratorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:767:2: ( ( ( rule__GeneratorExpression__Alternatives ) ) )
            // InternalMGLang.g:768:2: ( ( rule__GeneratorExpression__Alternatives ) )
            {
            // InternalMGLang.g:768:2: ( ( rule__GeneratorExpression__Alternatives ) )
            // InternalMGLang.g:769:3: ( rule__GeneratorExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorExpressionAccess().getAlternatives()); 
            }
            // InternalMGLang.g:770:3: ( rule__GeneratorExpression__Alternatives )
            // InternalMGLang.g:770:4: rule__GeneratorExpression__Alternatives
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
    // InternalMGLang.g:779:1: entryRulePatternObjectCreation : rulePatternObjectCreation EOF ;
    public final void entryRulePatternObjectCreation() throws RecognitionException {
        try {
            // InternalMGLang.g:780:1: ( rulePatternObjectCreation EOF )
            // InternalMGLang.g:781:1: rulePatternObjectCreation EOF
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
    // InternalMGLang.g:788:1: rulePatternObjectCreation : ( ( rule__PatternObjectCreation__Group__0 ) ) ;
    public final void rulePatternObjectCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:792:2: ( ( ( rule__PatternObjectCreation__Group__0 ) ) )
            // InternalMGLang.g:793:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            {
            // InternalMGLang.g:793:2: ( ( rule__PatternObjectCreation__Group__0 ) )
            // InternalMGLang.g:794:3: ( rule__PatternObjectCreation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getGroup()); 
            }
            // InternalMGLang.g:795:3: ( rule__PatternObjectCreation__Group__0 )
            // InternalMGLang.g:795:4: rule__PatternObjectCreation__Group__0
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
    // InternalMGLang.g:804:1: entryRulePatternObject : rulePatternObject EOF ;
    public final void entryRulePatternObject() throws RecognitionException {
        try {
            // InternalMGLang.g:805:1: ( rulePatternObject EOF )
            // InternalMGLang.g:806:1: rulePatternObject EOF
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
    // InternalMGLang.g:813:1: rulePatternObject : ( ( rule__PatternObject__Group__0 ) ) ;
    public final void rulePatternObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:817:2: ( ( ( rule__PatternObject__Group__0 ) ) )
            // InternalMGLang.g:818:2: ( ( rule__PatternObject__Group__0 ) )
            {
            // InternalMGLang.g:818:2: ( ( rule__PatternObject__Group__0 ) )
            // InternalMGLang.g:819:3: ( rule__PatternObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getGroup()); 
            }
            // InternalMGLang.g:820:3: ( rule__PatternObject__Group__0 )
            // InternalMGLang.g:820:4: rule__PatternObject__Group__0
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
    // InternalMGLang.g:829:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalMGLang.g:830:1: ( ruleForStatement EOF )
            // InternalMGLang.g:831:1: ruleForStatement EOF
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
    // InternalMGLang.g:838:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:842:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalMGLang.g:843:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalMGLang.g:843:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalMGLang.g:844:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalMGLang.g:845:3: ( rule__ForStatement__Group__0 )
            // InternalMGLang.g:845:4: rule__ForStatement__Group__0
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
    // InternalMGLang.g:854:1: entryRuleForHead : ruleForHead EOF ;
    public final void entryRuleForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:855:1: ( ruleForHead EOF )
            // InternalMGLang.g:856:1: ruleForHead EOF
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
    // InternalMGLang.g:863:1: ruleForHead : ( ( rule__ForHead__Alternatives ) ) ;
    public final void ruleForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:867:2: ( ( ( rule__ForHead__Alternatives ) ) )
            // InternalMGLang.g:868:2: ( ( rule__ForHead__Alternatives ) )
            {
            // InternalMGLang.g:868:2: ( ( rule__ForHead__Alternatives ) )
            // InternalMGLang.g:869:3: ( rule__ForHead__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForHeadAccess().getAlternatives()); 
            }
            // InternalMGLang.g:870:3: ( rule__ForHead__Alternatives )
            // InternalMGLang.g:870:4: rule__ForHead__Alternatives
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
    // InternalMGLang.g:879:1: entryRuleGeneralForHead : ruleGeneralForHead EOF ;
    public final void entryRuleGeneralForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:880:1: ( ruleGeneralForHead EOF )
            // InternalMGLang.g:881:1: ruleGeneralForHead EOF
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
    // InternalMGLang.g:888:1: ruleGeneralForHead : ( ( rule__GeneralForHead__Group__0 ) ) ;
    public final void ruleGeneralForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:892:2: ( ( ( rule__GeneralForHead__Group__0 ) ) )
            // InternalMGLang.g:893:2: ( ( rule__GeneralForHead__Group__0 ) )
            {
            // InternalMGLang.g:893:2: ( ( rule__GeneralForHead__Group__0 ) )
            // InternalMGLang.g:894:3: ( rule__GeneralForHead__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getGroup()); 
            }
            // InternalMGLang.g:895:3: ( rule__GeneralForHead__Group__0 )
            // InternalMGLang.g:895:4: rule__GeneralForHead__Group__0
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
    // InternalMGLang.g:904:1: entryRuleForEachHead : ruleForEachHead EOF ;
    public final void entryRuleForEachHead() throws RecognitionException {
        try {
            // InternalMGLang.g:905:1: ( ruleForEachHead EOF )
            // InternalMGLang.g:906:1: ruleForEachHead EOF
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
    // InternalMGLang.g:913:1: ruleForEachHead : ( ( rule__ForEachHead__Group__0 ) ) ;
    public final void ruleForEachHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:917:2: ( ( ( rule__ForEachHead__Group__0 ) ) )
            // InternalMGLang.g:918:2: ( ( rule__ForEachHead__Group__0 ) )
            {
            // InternalMGLang.g:918:2: ( ( rule__ForEachHead__Group__0 ) )
            // InternalMGLang.g:919:3: ( rule__ForEachHead__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getGroup()); 
            }
            // InternalMGLang.g:920:3: ( rule__ForEachHead__Group__0 )
            // InternalMGLang.g:920:4: rule__ForEachHead__Group__0
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
    // InternalMGLang.g:929:1: entryRuleForBody : ruleForBody EOF ;
    public final void entryRuleForBody() throws RecognitionException {
        try {
            // InternalMGLang.g:930:1: ( ruleForBody EOF )
            // InternalMGLang.g:931:1: ruleForBody EOF
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
    // InternalMGLang.g:938:1: ruleForBody : ( ( rule__ForBody__Group__0 ) ) ;
    public final void ruleForBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:942:2: ( ( ( rule__ForBody__Group__0 ) ) )
            // InternalMGLang.g:943:2: ( ( rule__ForBody__Group__0 ) )
            {
            // InternalMGLang.g:943:2: ( ( rule__ForBody__Group__0 ) )
            // InternalMGLang.g:944:3: ( rule__ForBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getGroup()); 
            }
            // InternalMGLang.g:945:3: ( rule__ForBody__Group__0 )
            // InternalMGLang.g:945:4: rule__ForBody__Group__0
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


    // $ANTLR start "entryRuleIfStatement"
    // InternalMGLang.g:954:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalMGLang.g:955:1: ( ruleIfStatement EOF )
            // InternalMGLang.g:956:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMGLang.g:963:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:967:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalMGLang.g:968:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalMGLang.g:968:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalMGLang.g:969:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalMGLang.g:970:3: ( rule__IfStatement__Group__0 )
            // InternalMGLang.g:970:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElseIfOrElse"
    // InternalMGLang.g:979:1: entryRuleElseIfOrElse : ruleElseIfOrElse EOF ;
    public final void entryRuleElseIfOrElse() throws RecognitionException {
        try {
            // InternalMGLang.g:980:1: ( ruleElseIfOrElse EOF )
            // InternalMGLang.g:981:1: ruleElseIfOrElse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElseIfOrElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseRule()); 
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
    // $ANTLR end "entryRuleElseIfOrElse"


    // $ANTLR start "ruleElseIfOrElse"
    // InternalMGLang.g:988:1: ruleElseIfOrElse : ( ( rule__ElseIfOrElse__Alternatives ) ) ;
    public final void ruleElseIfOrElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:992:2: ( ( ( rule__ElseIfOrElse__Alternatives ) ) )
            // InternalMGLang.g:993:2: ( ( rule__ElseIfOrElse__Alternatives ) )
            {
            // InternalMGLang.g:993:2: ( ( rule__ElseIfOrElse__Alternatives ) )
            // InternalMGLang.g:994:3: ( rule__ElseIfOrElse__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getAlternatives()); 
            }
            // InternalMGLang.g:995:3: ( rule__ElseIfOrElse__Alternatives )
            // InternalMGLang.g:995:4: rule__ElseIfOrElse__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseIfOrElse"


    // $ANTLR start "entryRuleElseStatement"
    // InternalMGLang.g:1004:1: entryRuleElseStatement : ruleElseStatement EOF ;
    public final void entryRuleElseStatement() throws RecognitionException {
        try {
            // InternalMGLang.g:1005:1: ( ruleElseStatement EOF )
            // InternalMGLang.g:1006:1: ruleElseStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElseStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseStatementRule()); 
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
    // $ANTLR end "entryRuleElseStatement"


    // $ANTLR start "ruleElseStatement"
    // InternalMGLang.g:1013:1: ruleElseStatement : ( ( rule__ElseStatement__Group__0 ) ) ;
    public final void ruleElseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1017:2: ( ( ( rule__ElseStatement__Group__0 ) ) )
            // InternalMGLang.g:1018:2: ( ( rule__ElseStatement__Group__0 ) )
            {
            // InternalMGLang.g:1018:2: ( ( rule__ElseStatement__Group__0 ) )
            // InternalMGLang.g:1019:3: ( rule__ElseStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseStatementAccess().getGroup()); 
            }
            // InternalMGLang.g:1020:3: ( rule__ElseStatement__Group__0 )
            // InternalMGLang.g:1020:4: rule__ElseStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseStatement"


    // $ANTLR start "entryRuleSwitchCase"
    // InternalMGLang.g:1029:1: entryRuleSwitchCase : ruleSwitchCase EOF ;
    public final void entryRuleSwitchCase() throws RecognitionException {
        try {
            // InternalMGLang.g:1030:1: ( ruleSwitchCase EOF )
            // InternalMGLang.g:1031:1: ruleSwitchCase EOF
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
    // InternalMGLang.g:1038:1: ruleSwitchCase : ( ( rule__SwitchCase__Group__0 ) ) ;
    public final void ruleSwitchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1042:2: ( ( ( rule__SwitchCase__Group__0 ) ) )
            // InternalMGLang.g:1043:2: ( ( rule__SwitchCase__Group__0 ) )
            {
            // InternalMGLang.g:1043:2: ( ( rule__SwitchCase__Group__0 ) )
            // InternalMGLang.g:1044:3: ( rule__SwitchCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getGroup()); 
            }
            // InternalMGLang.g:1045:3: ( rule__SwitchCase__Group__0 )
            // InternalMGLang.g:1045:4: rule__SwitchCase__Group__0
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


    // $ANTLR start "entryRuleDefault"
    // InternalMGLang.g:1054:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // InternalMGLang.g:1055:1: ( ruleDefault EOF )
            // InternalMGLang.g:1056:1: ruleDefault EOF
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
    // InternalMGLang.g:1063:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1067:2: ( ( ( rule__Default__Group__0 ) ) )
            // InternalMGLang.g:1068:2: ( ( rule__Default__Group__0 ) )
            {
            // InternalMGLang.g:1068:2: ( ( rule__Default__Group__0 ) )
            // InternalMGLang.g:1069:3: ( rule__Default__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getGroup()); 
            }
            // InternalMGLang.g:1070:3: ( rule__Default__Group__0 )
            // InternalMGLang.g:1070:4: rule__Default__Group__0
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


    // $ANTLR start "entryRuleCase"
    // InternalMGLang.g:1079:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalMGLang.g:1080:1: ( ruleCase EOF )
            // InternalMGLang.g:1081:1: ruleCase EOF
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
    // InternalMGLang.g:1088:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1092:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalMGLang.g:1093:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalMGLang.g:1093:2: ( ( rule__Case__Group__0 ) )
            // InternalMGLang.g:1094:3: ( rule__Case__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getGroup()); 
            }
            // InternalMGLang.g:1095:3: ( rule__Case__Group__0 )
            // InternalMGLang.g:1095:4: rule__Case__Group__0
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
    // InternalMGLang.g:1104:1: entryRuleCaseBody : ruleCaseBody EOF ;
    public final void entryRuleCaseBody() throws RecognitionException {
        try {
            // InternalMGLang.g:1105:1: ( ruleCaseBody EOF )
            // InternalMGLang.g:1106:1: ruleCaseBody EOF
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
    // InternalMGLang.g:1113:1: ruleCaseBody : ( ( rule__CaseBody__Alternatives ) ) ;
    public final void ruleCaseBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1117:2: ( ( ( rule__CaseBody__Alternatives ) ) )
            // InternalMGLang.g:1118:2: ( ( rule__CaseBody__Alternatives ) )
            {
            // InternalMGLang.g:1118:2: ( ( rule__CaseBody__Alternatives ) )
            // InternalMGLang.g:1119:3: ( rule__CaseBody__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1120:3: ( rule__CaseBody__Alternatives )
            // InternalMGLang.g:1120:4: rule__CaseBody__Alternatives
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
    // InternalMGLang.g:1129:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMGLang.g:1130:1: ( ruleCollection EOF )
            // InternalMGLang.g:1131:1: ruleCollection EOF
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
    // InternalMGLang.g:1138:1: ruleCollection : ( ( rule__Collection__Alternatives ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1142:2: ( ( ( rule__Collection__Alternatives ) ) )
            // InternalMGLang.g:1143:2: ( ( rule__Collection__Alternatives ) )
            {
            // InternalMGLang.g:1143:2: ( ( rule__Collection__Alternatives ) )
            // InternalMGLang.g:1144:3: ( rule__Collection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1145:3: ( rule__Collection__Alternatives )
            // InternalMGLang.g:1145:4: rule__Collection__Alternatives
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
    // InternalMGLang.g:1154:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMGLang.g:1155:1: ( ruleList EOF )
            // InternalMGLang.g:1156:1: ruleList EOF
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
    // InternalMGLang.g:1163:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1167:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalMGLang.g:1168:2: ( ( rule__List__Group__0 ) )
            {
            // InternalMGLang.g:1168:2: ( ( rule__List__Group__0 ) )
            // InternalMGLang.g:1169:3: ( rule__List__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup()); 
            }
            // InternalMGLang.g:1170:3: ( rule__List__Group__0 )
            // InternalMGLang.g:1170:4: rule__List__Group__0
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


    // $ANTLR start "entryRuleListAdHoc"
    // InternalMGLang.g:1179:1: entryRuleListAdHoc : ruleListAdHoc EOF ;
    public final void entryRuleListAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:1180:1: ( ruleListAdHoc EOF )
            // InternalMGLang.g:1181:1: ruleListAdHoc EOF
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
    // InternalMGLang.g:1188:1: ruleListAdHoc : ( ( rule__ListAdHoc__Group__0 ) ) ;
    public final void ruleListAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1192:2: ( ( ( rule__ListAdHoc__Group__0 ) ) )
            // InternalMGLang.g:1193:2: ( ( rule__ListAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:1193:2: ( ( rule__ListAdHoc__Group__0 ) )
            // InternalMGLang.g:1194:3: ( rule__ListAdHoc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getGroup()); 
            }
            // InternalMGLang.g:1195:3: ( rule__ListAdHoc__Group__0 )
            // InternalMGLang.g:1195:4: rule__ListAdHoc__Group__0
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
    // InternalMGLang.g:1204:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalMGLang.g:1205:1: ( ruleMap EOF )
            // InternalMGLang.g:1206:1: ruleMap EOF
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
    // InternalMGLang.g:1213:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1217:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalMGLang.g:1218:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalMGLang.g:1218:2: ( ( rule__Map__Group__0 ) )
            // InternalMGLang.g:1219:3: ( rule__Map__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getGroup()); 
            }
            // InternalMGLang.g:1220:3: ( rule__Map__Group__0 )
            // InternalMGLang.g:1220:4: rule__Map__Group__0
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


    // $ANTLR start "entryRuleMapAdHoc"
    // InternalMGLang.g:1229:1: entryRuleMapAdHoc : ruleMapAdHoc EOF ;
    public final void entryRuleMapAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:1230:1: ( ruleMapAdHoc EOF )
            // InternalMGLang.g:1231:1: ruleMapAdHoc EOF
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
    // InternalMGLang.g:1238:1: ruleMapAdHoc : ( ( rule__MapAdHoc__Group__0 ) ) ;
    public final void ruleMapAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1242:2: ( ( ( rule__MapAdHoc__Group__0 ) ) )
            // InternalMGLang.g:1243:2: ( ( rule__MapAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:1243:2: ( ( rule__MapAdHoc__Group__0 ) )
            // InternalMGLang.g:1244:3: ( rule__MapAdHoc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getGroup()); 
            }
            // InternalMGLang.g:1245:3: ( rule__MapAdHoc__Group__0 )
            // InternalMGLang.g:1245:4: rule__MapAdHoc__Group__0
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
    // InternalMGLang.g:1254:1: entryRuleMapTupel : ruleMapTupel EOF ;
    public final void entryRuleMapTupel() throws RecognitionException {
        try {
            // InternalMGLang.g:1255:1: ( ruleMapTupel EOF )
            // InternalMGLang.g:1256:1: ruleMapTupel EOF
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
    // InternalMGLang.g:1263:1: ruleMapTupel : ( ( rule__MapTupel__Group__0 ) ) ;
    public final void ruleMapTupel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1267:2: ( ( ( rule__MapTupel__Group__0 ) ) )
            // InternalMGLang.g:1268:2: ( ( rule__MapTupel__Group__0 ) )
            {
            // InternalMGLang.g:1268:2: ( ( rule__MapTupel__Group__0 ) )
            // InternalMGLang.g:1269:3: ( rule__MapTupel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getGroup()); 
            }
            // InternalMGLang.g:1270:3: ( rule__MapTupel__Group__0 )
            // InternalMGLang.g:1270:4: rule__MapTupel__Group__0
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
    // InternalMGLang.g:1279:1: entryRuleForRange : ruleForRange EOF ;
    public final void entryRuleForRange() throws RecognitionException {
        try {
            // InternalMGLang.g:1280:1: ( ruleForRange EOF )
            // InternalMGLang.g:1281:1: ruleForRange EOF
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
    // InternalMGLang.g:1288:1: ruleForRange : ( ( rule__ForRange__Group__0 ) ) ;
    public final void ruleForRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1292:2: ( ( ( rule__ForRange__Group__0 ) ) )
            // InternalMGLang.g:1293:2: ( ( rule__ForRange__Group__0 ) )
            {
            // InternalMGLang.g:1293:2: ( ( rule__ForRange__Group__0 ) )
            // InternalMGLang.g:1294:3: ( rule__ForRange__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getGroup()); 
            }
            // InternalMGLang.g:1295:3: ( rule__ForRange__Group__0 )
            // InternalMGLang.g:1295:4: rule__ForRange__Group__0
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


    // $ANTLR start "ruleMathFunc"
    // InternalMGLang.g:1304:1: ruleMathFunc : ( ( rule__MathFunc__Alternatives ) ) ;
    public final void ruleMathFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1308:1: ( ( ( rule__MathFunc__Alternatives ) ) )
            // InternalMGLang.g:1309:2: ( ( rule__MathFunc__Alternatives ) )
            {
            // InternalMGLang.g:1309:2: ( ( rule__MathFunc__Alternatives ) )
            // InternalMGLang.g:1310:3: ( rule__MathFunc__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathFuncAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1311:3: ( rule__MathFunc__Alternatives )
            // InternalMGLang.g:1311:4: rule__MathFunc__Alternatives
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
    // InternalMGLang.g:1320:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1324:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMGLang.g:1325:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMGLang.g:1325:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMGLang.g:1326:3: ( rule__PrimitiveType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1327:3: ( rule__PrimitiveType__Alternatives )
            // InternalMGLang.g:1327:4: rule__PrimitiveType__Alternatives
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
    // InternalMGLang.g:1336:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1340:1: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // InternalMGLang.g:1341:2: ( ( rule__RelationalOp__Alternatives ) )
            {
            // InternalMGLang.g:1341:2: ( ( rule__RelationalOp__Alternatives ) )
            // InternalMGLang.g:1342:3: ( rule__RelationalOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1343:3: ( rule__RelationalOp__Alternatives )
            // InternalMGLang.g:1343:4: rule__RelationalOp__Alternatives
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
    // InternalMGLang.g:1352:1: ruleTertiaryOp : ( ( rule__TertiaryOp__Alternatives ) ) ;
    public final void ruleTertiaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1356:1: ( ( ( rule__TertiaryOp__Alternatives ) ) )
            // InternalMGLang.g:1357:2: ( ( rule__TertiaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1357:2: ( ( rule__TertiaryOp__Alternatives ) )
            // InternalMGLang.g:1358:3: ( rule__TertiaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1359:3: ( rule__TertiaryOp__Alternatives )
            // InternalMGLang.g:1359:4: rule__TertiaryOp__Alternatives
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
    // InternalMGLang.g:1368:1: ruleSecondaryOp : ( ( rule__SecondaryOp__Alternatives ) ) ;
    public final void ruleSecondaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1372:1: ( ( ( rule__SecondaryOp__Alternatives ) ) )
            // InternalMGLang.g:1373:2: ( ( rule__SecondaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1373:2: ( ( rule__SecondaryOp__Alternatives ) )
            // InternalMGLang.g:1374:3: ( rule__SecondaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1375:3: ( rule__SecondaryOp__Alternatives )
            // InternalMGLang.g:1375:4: rule__SecondaryOp__Alternatives
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
    // InternalMGLang.g:1384:1: rulePrimaryOp : ( ( rule__PrimaryOp__Alternatives ) ) ;
    public final void rulePrimaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1388:1: ( ( ( rule__PrimaryOp__Alternatives ) ) )
            // InternalMGLang.g:1389:2: ( ( rule__PrimaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1389:2: ( ( rule__PrimaryOp__Alternatives ) )
            // InternalMGLang.g:1390:3: ( rule__PrimaryOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryOpAccess().getAlternatives()); 
            }
            // InternalMGLang.g:1391:3: ( rule__PrimaryOp__Alternatives )
            // InternalMGLang.g:1391:4: rule__PrimaryOp__Alternatives
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
    // InternalMGLang.g:1399:1: rule__MofgenFile__Alternatives_1 : ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) );
    public final void rule__MofgenFile__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1403:1: ( ( ( rule__MofgenFile__PatternsAssignment_1_0 ) ) | ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
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
                    // InternalMGLang.g:1404:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    {
                    // InternalMGLang.g:1404:2: ( ( rule__MofgenFile__PatternsAssignment_1_0 ) )
                    // InternalMGLang.g:1405:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMofgenFileAccess().getPatternsAssignment_1_0()); 
                    }
                    // InternalMGLang.g:1406:3: ( rule__MofgenFile__PatternsAssignment_1_0 )
                    // InternalMGLang.g:1406:4: rule__MofgenFile__PatternsAssignment_1_0
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
                    // InternalMGLang.g:1410:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    {
                    // InternalMGLang.g:1410:2: ( ( rule__MofgenFile__GeneratorsAssignment_1_1 ) )
                    // InternalMGLang.g:1411:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMofgenFileAccess().getGeneratorsAssignment_1_1()); 
                    }
                    // InternalMGLang.g:1412:3: ( rule__MofgenFile__GeneratorsAssignment_1_1 )
                    // InternalMGLang.g:1412:4: rule__MofgenFile__GeneratorsAssignment_1_1
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
    // InternalMGLang.g:1420:1: rule__Node__Alternatives_2 : ( ( ( rule__Node__CreatedByAssignment_2_0 ) ) | ( ( rule__Node__Group_2_1__0 ) ) );
    public final void rule__Node__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1424:1: ( ( ( rule__Node__CreatedByAssignment_2_0 ) ) | ( ( rule__Node__Group_2_1__0 ) ) )
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
                    // InternalMGLang.g:1425:2: ( ( rule__Node__CreatedByAssignment_2_0 ) )
                    {
                    // InternalMGLang.g:1425:2: ( ( rule__Node__CreatedByAssignment_2_0 ) )
                    // InternalMGLang.g:1426:3: ( rule__Node__CreatedByAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getCreatedByAssignment_2_0()); 
                    }
                    // InternalMGLang.g:1427:3: ( rule__Node__CreatedByAssignment_2_0 )
                    // InternalMGLang.g:1427:4: rule__Node__CreatedByAssignment_2_0
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
                    // InternalMGLang.g:1431:2: ( ( rule__Node__Group_2_1__0 ) )
                    {
                    // InternalMGLang.g:1431:2: ( ( rule__Node__Group_2_1__0 ) )
                    // InternalMGLang.g:1432:3: ( rule__Node__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getGroup_2_1()); 
                    }
                    // InternalMGLang.g:1433:3: ( rule__Node__Group_2_1__0 )
                    // InternalMGLang.g:1433:4: rule__Node__Group_2_1__0
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


    // $ANTLR start "rule__NodeReferenceOrAssignment__Alternatives_0"
    // InternalMGLang.g:1441:1: rule__NodeReferenceOrAssignment__Alternatives_0 : ( ( rulePatternNodeReference ) | ( ruleAssignment ) );
    public final void rule__NodeReferenceOrAssignment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1445:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==48) ) {
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
                    // InternalMGLang.g:1446:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:1446:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:1447:3: rulePatternNodeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternNodeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeReferenceOrAssignmentAccess().getPatternNodeReferenceParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1452:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:1452:2: ( ruleAssignment )
                    // InternalMGLang.g:1453:3: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeReferenceOrAssignmentAccess().getAssignmentParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__NodeReferenceOrAssignment__Alternatives_0"


    // $ANTLR start "rule__Parameter__Alternatives"
    // InternalMGLang.g:1462:1: rule__Parameter__Alternatives : ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1466:1: ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) )
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
                    // InternalMGLang.g:1467:2: ( rulePrimitiveParameter )
                    {
                    // InternalMGLang.g:1467:2: ( rulePrimitiveParameter )
                    // InternalMGLang.g:1468:3: rulePrimitiveParameter
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
                    // InternalMGLang.g:1473:2: ( ruleParameterNode )
                    {
                    // InternalMGLang.g:1473:2: ( ruleParameterNode )
                    // InternalMGLang.g:1474:3: ruleParameterNode
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


    // $ANTLR start "rule__ParameterRefOrMethodCall__Alternatives"
    // InternalMGLang.g:1483:1: rule__ParameterRefOrMethodCall__Alternatives : ( ( ruleParameterRef ) | ( ruleMethodCall ) );
    public final void rule__ParameterRefOrMethodCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1487:1: ( ( ruleParameterRef ) | ( ruleMethodCall ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=RULE_STRING && LA5_1<=RULE_FALSE)||(LA5_1>=RULE_INT && LA5_1<=RULE_ID)||(LA5_1>=15 && LA5_1<=16)||(LA5_1>=21 && LA5_1<=34)||(LA5_1>=39 && LA5_1<=41)||(LA5_1>=46 && LA5_1<=47)||LA5_1==49||LA5_1==57) ) {
                    alt5=1;
                }
                else if ( (LA5_1==45) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMGLang.g:1488:2: ( ruleParameterRef )
                    {
                    // InternalMGLang.g:1488:2: ( ruleParameterRef )
                    // InternalMGLang.g:1489:3: ruleParameterRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterRefOrMethodCallAccess().getParameterRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameterRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterRefOrMethodCallAccess().getParameterRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1494:2: ( ruleMethodCall )
                    {
                    // InternalMGLang.g:1494:2: ( ruleMethodCall )
                    // InternalMGLang.g:1495:3: ruleMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterRefOrMethodCallAccess().getMethodCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethodCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterRefOrMethodCallAccess().getMethodCallParserRuleCall_1()); 
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
    // $ANTLR end "rule__ParameterRefOrMethodCall__Alternatives"


    // $ANTLR start "rule__BaseExpr__Alternatives"
    // InternalMGLang.g:1504:1: rule__BaseExpr__Alternatives : ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ( rule__BaseExpr__Group_3__0 ) ) | ( ruleParameterRefOrMethodCall ) );
    public final void rule__BaseExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1508:1: ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ( rule__BaseExpr__Group_3__0 ) ) | ( ruleParameterRefOrMethodCall ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt6=1;
                }
                break;
            case 49:
                {
                alt6=2;
                }
                break;
            case 15:
            case 16:
                {
                alt6=3;
                }
                break;
            case RULE_STRING:
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_INT:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:1509:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1509:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    // InternalMGLang.g:1510:3: ( rule__BaseExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_0()); 
                    }
                    // InternalMGLang.g:1511:3: ( rule__BaseExpr__Group_0__0 )
                    // InternalMGLang.g:1511:4: rule__BaseExpr__Group_0__0
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
                    // InternalMGLang.g:1515:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1515:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    // InternalMGLang.g:1516:3: ( rule__BaseExpr__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_1()); 
                    }
                    // InternalMGLang.g:1517:3: ( rule__BaseExpr__Group_1__0 )
                    // InternalMGLang.g:1517:4: rule__BaseExpr__Group_1__0
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
                    // InternalMGLang.g:1521:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    {
                    // InternalMGLang.g:1521:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    // InternalMGLang.g:1522:3: ( rule__BaseExpr__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_2()); 
                    }
                    // InternalMGLang.g:1523:3: ( rule__BaseExpr__Group_2__0 )
                    // InternalMGLang.g:1523:4: rule__BaseExpr__Group_2__0
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
                    // InternalMGLang.g:1527:2: ( ( rule__BaseExpr__Group_3__0 ) )
                    {
                    // InternalMGLang.g:1527:2: ( ( rule__BaseExpr__Group_3__0 ) )
                    // InternalMGLang.g:1528:3: ( rule__BaseExpr__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getGroup_3()); 
                    }
                    // InternalMGLang.g:1529:3: ( rule__BaseExpr__Group_3__0 )
                    // InternalMGLang.g:1529:4: rule__BaseExpr__Group_3__0
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
                    // InternalMGLang.g:1533:2: ( ruleParameterRefOrMethodCall )
                    {
                    // InternalMGLang.g:1533:2: ( ruleParameterRefOrMethodCall )
                    // InternalMGLang.g:1534:3: ruleParameterRefOrMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseExprAccess().getParameterRefOrMethodCallParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameterRefOrMethodCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseExprAccess().getParameterRefOrMethodCallParserRuleCall_4()); 
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
    // InternalMGLang.g:1543:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1547:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
                {
                alt7=3;
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
                    // InternalMGLang.g:1548:2: ( ruleBooleanLiteral )
                    {
                    // InternalMGLang.g:1548:2: ( ruleBooleanLiteral )
                    // InternalMGLang.g:1549:3: ruleBooleanLiteral
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
                    // InternalMGLang.g:1554:2: ( ruleStringLiteral )
                    {
                    // InternalMGLang.g:1554:2: ( ruleStringLiteral )
                    // InternalMGLang.g:1555:3: ruleStringLiteral
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
                    // InternalMGLang.g:1560:2: ( ruleNumberLiteral )
                    {
                    // InternalMGLang.g:1560:2: ( ruleNumberLiteral )
                    // InternalMGLang.g:1561:3: ruleNumberLiteral
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
    // InternalMGLang.g:1570:1: rule__BooleanLiteral__Alternatives : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1574:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_TRUE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_FALSE) ) {
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
                    // InternalMGLang.g:1575:2: ( RULE_TRUE )
                    {
                    // InternalMGLang.g:1575:2: ( RULE_TRUE )
                    // InternalMGLang.g:1576:3: RULE_TRUE
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
                    // InternalMGLang.g:1581:2: ( RULE_FALSE )
                    {
                    // InternalMGLang.g:1581:2: ( RULE_FALSE )
                    // InternalMGLang.g:1582:3: RULE_FALSE
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


    // $ANTLR start "rule__GeneratorExpression__Alternatives"
    // InternalMGLang.g:1591:1: rule__GeneratorExpression__Alternatives : ( ( ruleForStatement ) | ( ruleIfStatement ) | ( ruleSwitchCase ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternObjectCreation ) );
    public final void rule__GeneratorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1595:1: ( ( ruleForStatement ) | ( ruleIfStatement ) | ( ruleSwitchCase ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternObjectCreation ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt9=1;
                }
                break;
            case 53:
                {
                alt9=2;
                }
                break;
            case 55:
                {
                alt9=3;
                }
                break;
            case 59:
            case 60:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                int LA9_5 = input.LA(2);

                if ( (LA9_5==40) ) {
                    alt9=5;
                }
                else if ( (LA9_5==RULE_ID) ) {
                    alt9=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:1596:2: ( ruleForStatement )
                    {
                    // InternalMGLang.g:1596:2: ( ruleForStatement )
                    // InternalMGLang.g:1597:3: ruleForStatement
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
                    // InternalMGLang.g:1602:2: ( ruleIfStatement )
                    {
                    // InternalMGLang.g:1602:2: ( ruleIfStatement )
                    // InternalMGLang.g:1603:3: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getIfStatementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getIfStatementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1608:2: ( ruleSwitchCase )
                    {
                    // InternalMGLang.g:1608:2: ( ruleSwitchCase )
                    // InternalMGLang.g:1609:3: ruleSwitchCase
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getSwitchCaseParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitchCase();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getSwitchCaseParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1614:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1614:2: ( ruleCollection )
                    // InternalMGLang.g:1615:3: ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCollection();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1620:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1620:2: ( rulePatternCall )
                    // InternalMGLang.g:1621:3: rulePatternCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:1626:2: ( rulePatternObjectCreation )
                    {
                    // InternalMGLang.g:1626:2: ( rulePatternObjectCreation )
                    // InternalMGLang.g:1627:3: rulePatternObjectCreation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGeneratorExpressionAccess().getPatternObjectCreationParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePatternObjectCreation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGeneratorExpressionAccess().getPatternObjectCreationParserRuleCall_5()); 
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
    // InternalMGLang.g:1636:1: rule__ForHead__Alternatives : ( ( ruleGeneralForHead ) | ( ruleForEachHead ) );
    public final void rule__ForHead__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1640:1: ( ( ruleGeneralForHead ) | ( ruleForEachHead ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==28) ) {
                    alt10=2;
                }
                else if ( (LA10_1==52) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:1641:2: ( ruleGeneralForHead )
                    {
                    // InternalMGLang.g:1641:2: ( ruleGeneralForHead )
                    // InternalMGLang.g:1642:3: ruleGeneralForHead
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
                    // InternalMGLang.g:1647:2: ( ruleForEachHead )
                    {
                    // InternalMGLang.g:1647:2: ( ruleForEachHead )
                    // InternalMGLang.g:1648:3: ruleForEachHead
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


    // $ANTLR start "rule__ElseIfOrElse__Alternatives"
    // InternalMGLang.g:1657:1: rule__ElseIfOrElse__Alternatives : ( ( ( rule__ElseIfOrElse__Group_0__0 ) ) | ( ruleElseStatement ) );
    public final void rule__ElseIfOrElse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1661:1: ( ( ( rule__ElseIfOrElse__Group_0__0 ) ) | ( ruleElseStatement ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
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
                    // InternalMGLang.g:1662:2: ( ( rule__ElseIfOrElse__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1662:2: ( ( rule__ElseIfOrElse__Group_0__0 ) )
                    // InternalMGLang.g:1663:3: ( rule__ElseIfOrElse__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElseIfOrElseAccess().getGroup_0()); 
                    }
                    // InternalMGLang.g:1664:3: ( rule__ElseIfOrElse__Group_0__0 )
                    // InternalMGLang.g:1664:4: rule__ElseIfOrElse__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElseIfOrElse__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElseIfOrElseAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1668:2: ( ruleElseStatement )
                    {
                    // InternalMGLang.g:1668:2: ( ruleElseStatement )
                    // InternalMGLang.g:1669:3: ruleElseStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElseIfOrElseAccess().getElseStatementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleElseStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElseIfOrElseAccess().getElseStatementParserRuleCall_1()); 
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
    // $ANTLR end "rule__ElseIfOrElse__Alternatives"


    // $ANTLR start "rule__CaseBody__Alternatives"
    // InternalMGLang.g:1678:1: rule__CaseBody__Alternatives : ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__ExpressionsAssignment_1 ) ) );
    public final void rule__CaseBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1682:1: ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__ExpressionsAssignment_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID||LA12_0==51||LA12_0==53||LA12_0==55||(LA12_0>=59 && LA12_0<=60)) ) {
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
                    // InternalMGLang.g:1683:2: ( ( rule__CaseBody__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1683:2: ( ( rule__CaseBody__Group_0__0 ) )
                    // InternalMGLang.g:1684:3: ( rule__CaseBody__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCaseBodyAccess().getGroup_0()); 
                    }
                    // InternalMGLang.g:1685:3: ( rule__CaseBody__Group_0__0 )
                    // InternalMGLang.g:1685:4: rule__CaseBody__Group_0__0
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
                    // InternalMGLang.g:1689:2: ( ( rule__CaseBody__ExpressionsAssignment_1 ) )
                    {
                    // InternalMGLang.g:1689:2: ( ( rule__CaseBody__ExpressionsAssignment_1 ) )
                    // InternalMGLang.g:1690:3: ( rule__CaseBody__ExpressionsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_1()); 
                    }
                    // InternalMGLang.g:1691:3: ( rule__CaseBody__ExpressionsAssignment_1 )
                    // InternalMGLang.g:1691:4: rule__CaseBody__ExpressionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseBody__ExpressionsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_1()); 
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
    // InternalMGLang.g:1699:1: rule__Collection__Alternatives : ( ( ruleList ) | ( ruleMap ) );
    public final void rule__Collection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1703:1: ( ( ruleList ) | ( ruleMap ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==59) ) {
                alt13=1;
            }
            else if ( (LA13_0==60) ) {
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
                    // InternalMGLang.g:1704:2: ( ruleList )
                    {
                    // InternalMGLang.g:1704:2: ( ruleList )
                    // InternalMGLang.g:1705:3: ruleList
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
                    // InternalMGLang.g:1710:2: ( ruleMap )
                    {
                    // InternalMGLang.g:1710:2: ( ruleMap )
                    // InternalMGLang.g:1711:3: ruleMap
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


    // $ANTLR start "rule__MathFunc__Alternatives"
    // InternalMGLang.g:1720:1: rule__MathFunc__Alternatives : ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) );
    public final void rule__MathFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1724:1: ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            else if ( (LA14_0==16) ) {
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
                    // InternalMGLang.g:1725:2: ( ( 'sqrt' ) )
                    {
                    // InternalMGLang.g:1725:2: ( ( 'sqrt' ) )
                    // InternalMGLang.g:1726:3: ( 'sqrt' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1727:3: ( 'sqrt' )
                    // InternalMGLang.g:1727:4: 'sqrt'
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
                    // InternalMGLang.g:1731:2: ( ( 'abs' ) )
                    {
                    // InternalMGLang.g:1731:2: ( ( 'abs' ) )
                    // InternalMGLang.g:1732:3: ( 'abs' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1733:3: ( 'abs' )
                    // InternalMGLang.g:1733:4: 'abs'
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
    // InternalMGLang.g:1741:1: rule__PrimitiveType__Alternatives : ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1745:1: ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt15=1;
                }
                break;
            case 18:
                {
                alt15=2;
                }
                break;
            case 19:
                {
                alt15=3;
                }
                break;
            case 20:
                {
                alt15=4;
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
                    // InternalMGLang.g:1746:2: ( ( 'int' ) )
                    {
                    // InternalMGLang.g:1746:2: ( ( 'int' ) )
                    // InternalMGLang.g:1747:3: ( 'int' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1748:3: ( 'int' )
                    // InternalMGLang.g:1748:4: 'int'
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
                    // InternalMGLang.g:1752:2: ( ( 'char' ) )
                    {
                    // InternalMGLang.g:1752:2: ( ( 'char' ) )
                    // InternalMGLang.g:1753:3: ( 'char' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1754:3: ( 'char' )
                    // InternalMGLang.g:1754:4: 'char'
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
                    // InternalMGLang.g:1758:2: ( ( 'double' ) )
                    {
                    // InternalMGLang.g:1758:2: ( ( 'double' ) )
                    // InternalMGLang.g:1759:3: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1760:3: ( 'double' )
                    // InternalMGLang.g:1760:4: 'double'
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
                    // InternalMGLang.g:1764:2: ( ( 'String' ) )
                    {
                    // InternalMGLang.g:1764:2: ( ( 'String' ) )
                    // InternalMGLang.g:1765:3: ( 'String' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    }
                    // InternalMGLang.g:1766:3: ( 'String' )
                    // InternalMGLang.g:1766:4: 'String'
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
    // InternalMGLang.g:1774:1: rule__RelationalOp__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1778:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt16=1;
                }
                break;
            case 22:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            case 24:
                {
                alt16=4;
                }
                break;
            case 25:
                {
                alt16=5;
                }
                break;
            case 26:
                {
                alt16=6;
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
                    // InternalMGLang.g:1779:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:1779:2: ( ( '>' ) )
                    // InternalMGLang.g:1780:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1781:3: ( '>' )
                    // InternalMGLang.g:1781:4: '>'
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
                    // InternalMGLang.g:1785:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:1785:2: ( ( '>=' ) )
                    // InternalMGLang.g:1786:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1787:3: ( '>=' )
                    // InternalMGLang.g:1787:4: '>='
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
                    // InternalMGLang.g:1791:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:1791:2: ( ( '==' ) )
                    // InternalMGLang.g:1792:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1793:3: ( '==' )
                    // InternalMGLang.g:1793:4: '=='
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
                    // InternalMGLang.g:1797:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:1797:2: ( ( '!=' ) )
                    // InternalMGLang.g:1798:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalMGLang.g:1799:3: ( '!=' )
                    // InternalMGLang.g:1799:4: '!='
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
                    // InternalMGLang.g:1803:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:1803:2: ( ( '<=' ) )
                    // InternalMGLang.g:1804:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getSMALLER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalMGLang.g:1805:3: ( '<=' )
                    // InternalMGLang.g:1805:4: '<='
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
                    // InternalMGLang.g:1809:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:1809:2: ( ( '<' ) )
                    // InternalMGLang.g:1810:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalOpAccess().getSMALLEREnumLiteralDeclaration_5()); 
                    }
                    // InternalMGLang.g:1811:3: ( '<' )
                    // InternalMGLang.g:1811:4: '<'
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
    // InternalMGLang.g:1819:1: rule__TertiaryOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) );
    public final void rule__TertiaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1823:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case 29:
                {
                alt17=3;
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
                    // InternalMGLang.g:1824:2: ( ( '+' ) )
                    {
                    // InternalMGLang.g:1824:2: ( ( '+' ) )
                    // InternalMGLang.g:1825:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1826:3: ( '+' )
                    // InternalMGLang.g:1826:4: '+'
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
                    // InternalMGLang.g:1830:2: ( ( '-' ) )
                    {
                    // InternalMGLang.g:1830:2: ( ( '-' ) )
                    // InternalMGLang.g:1831:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1832:3: ( '-' )
                    // InternalMGLang.g:1832:4: '-'
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
                    // InternalMGLang.g:1836:2: ( ( '||' ) )
                    {
                    // InternalMGLang.g:1836:2: ( ( '||' ) )
                    // InternalMGLang.g:1837:3: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1838:3: ( '||' )
                    // InternalMGLang.g:1838:4: '||'
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
    // InternalMGLang.g:1846:1: rule__SecondaryOp__Alternatives : ( ( ( '%' ) ) | ( ( '^' ) ) );
    public final void rule__SecondaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1850:1: ( ( ( '%' ) ) | ( ( '^' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMGLang.g:1851:2: ( ( '%' ) )
                    {
                    // InternalMGLang.g:1851:2: ( ( '%' ) )
                    // InternalMGLang.g:1852:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1853:3: ( '%' )
                    // InternalMGLang.g:1853:4: '%'
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
                    // InternalMGLang.g:1857:2: ( ( '^' ) )
                    {
                    // InternalMGLang.g:1857:2: ( ( '^' ) )
                    // InternalMGLang.g:1858:3: ( '^' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1859:3: ( '^' )
                    // InternalMGLang.g:1859:4: '^'
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
    // InternalMGLang.g:1867:1: rule__PrimaryOp__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) );
    public final void rule__PrimaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1871:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 34:
                {
                alt19=3;
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
                    // InternalMGLang.g:1872:2: ( ( '*' ) )
                    {
                    // InternalMGLang.g:1872:2: ( ( '*' ) )
                    // InternalMGLang.g:1873:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 
                    }
                    // InternalMGLang.g:1874:3: ( '*' )
                    // InternalMGLang.g:1874:4: '*'
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
                    // InternalMGLang.g:1878:2: ( ( '/' ) )
                    {
                    // InternalMGLang.g:1878:2: ( ( '/' ) )
                    // InternalMGLang.g:1879:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 
                    }
                    // InternalMGLang.g:1880:3: ( '/' )
                    // InternalMGLang.g:1880:4: '/'
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
                    // InternalMGLang.g:1884:2: ( ( '&&' ) )
                    {
                    // InternalMGLang.g:1884:2: ( ( '&&' ) )
                    // InternalMGLang.g:1885:3: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2()); 
                    }
                    // InternalMGLang.g:1886:3: ( '&&' )
                    // InternalMGLang.g:1886:4: '&&'
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
    // InternalMGLang.g:1894:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1898:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:1899:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
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
    // InternalMGLang.g:1906:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1910:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:1911:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:1911:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:1912:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            }
            // InternalMGLang.g:1913:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMGLang.g:1913:3: rule__MofgenFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MofgenFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMGLang.g:1921:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1925:1: ( rule__MofgenFile__Group__1__Impl )
            // InternalMGLang.g:1926:2: rule__MofgenFile__Group__1__Impl
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
    // InternalMGLang.g:1932:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__Alternatives_1 )* ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1936:1: ( ( ( rule__MofgenFile__Alternatives_1 )* ) )
            // InternalMGLang.g:1937:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            {
            // InternalMGLang.g:1937:1: ( ( rule__MofgenFile__Alternatives_1 )* )
            // InternalMGLang.g:1938:2: ( rule__MofgenFile__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMofgenFileAccess().getAlternatives_1()); 
            }
            // InternalMGLang.g:1939:2: ( rule__MofgenFile__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37||LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMGLang.g:1939:3: rule__MofgenFile__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MofgenFile__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMGLang.g:1948:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1952:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:1953:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMGLang.g:1960:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1964:1: ( ( 'import' ) )
            // InternalMGLang.g:1965:1: ( 'import' )
            {
            // InternalMGLang.g:1965:1: ( 'import' )
            // InternalMGLang.g:1966:2: 'import'
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
    // InternalMGLang.g:1975:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1979:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:1980:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalMGLang.g:1987:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1991:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalMGLang.g:1992:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalMGLang.g:1992:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalMGLang.g:1993:2: ( rule__Import__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:1994:2: ( rule__Import__NameAssignment_1 )
            // InternalMGLang.g:1994:3: rule__Import__NameAssignment_1
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
    // InternalMGLang.g:2002:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2006:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:2007:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalMGLang.g:2014:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2018:1: ( ( 'as' ) )
            // InternalMGLang.g:2019:1: ( 'as' )
            {
            // InternalMGLang.g:2019:1: ( 'as' )
            // InternalMGLang.g:2020:2: 'as'
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
    // InternalMGLang.g:2029:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2033:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:2034:2: rule__Import__Group__3__Impl
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
    // InternalMGLang.g:2040:1: rule__Import__Group__3__Impl : ( ( rule__Import__AliasAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2044:1: ( ( ( rule__Import__AliasAssignment_3 ) ) )
            // InternalMGLang.g:2045:1: ( ( rule__Import__AliasAssignment_3 ) )
            {
            // InternalMGLang.g:2045:1: ( ( rule__Import__AliasAssignment_3 ) )
            // InternalMGLang.g:2046:2: ( rule__Import__AliasAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAliasAssignment_3()); 
            }
            // InternalMGLang.g:2047:2: ( rule__Import__AliasAssignment_3 )
            // InternalMGLang.g:2047:3: rule__Import__AliasAssignment_3
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
    // InternalMGLang.g:2056:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2060:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:2061:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalMGLang.g:2068:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2072:1: ( ( 'pattern' ) )
            // InternalMGLang.g:2073:1: ( 'pattern' )
            {
            // InternalMGLang.g:2073:1: ( 'pattern' )
            // InternalMGLang.g:2074:2: 'pattern'
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
    // InternalMGLang.g:2083:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2087:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:2088:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalMGLang.g:2095:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2099:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:2100:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2100:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:2101:2: ( rule__Pattern__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:2102:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:2102:3: rule__Pattern__NameAssignment_1
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
    // InternalMGLang.g:2110:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2114:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:2115:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalMGLang.g:2122:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2126:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:2127:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:2127:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:2128:2: ( rule__Pattern__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2()); 
            }
            // InternalMGLang.g:2129:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:2129:3: rule__Pattern__Group_2__0
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
    // InternalMGLang.g:2137:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2141:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:2142:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalMGLang.g:2149:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2153:1: ( ( '{' ) )
            // InternalMGLang.g:2154:1: ( '{' )
            {
            // InternalMGLang.g:2154:1: ( '{' )
            // InternalMGLang.g:2155:2: '{'
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
    // InternalMGLang.g:2164:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2168:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:2169:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalMGLang.g:2176:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__UnorderedGroup_4 ) ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2180:1: ( ( ( rule__Pattern__UnorderedGroup_4 ) ) )
            // InternalMGLang.g:2181:1: ( ( rule__Pattern__UnorderedGroup_4 ) )
            {
            // InternalMGLang.g:2181:1: ( ( rule__Pattern__UnorderedGroup_4 ) )
            // InternalMGLang.g:2182:2: ( rule__Pattern__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getUnorderedGroup_4()); 
            }
            // InternalMGLang.g:2183:2: ( rule__Pattern__UnorderedGroup_4 )
            // InternalMGLang.g:2183:3: rule__Pattern__UnorderedGroup_4
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
    // InternalMGLang.g:2191:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2195:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:2196:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
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
    // InternalMGLang.g:2203:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2207:1: ( ( '}' ) )
            // InternalMGLang.g:2208:1: ( '}' )
            {
            // InternalMGLang.g:2208:1: ( '}' )
            // InternalMGLang.g:2209:2: '}'
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
    // InternalMGLang.g:2218:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2222:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:2223:2: rule__Pattern__Group__6__Impl
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
    // InternalMGLang.g:2229:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 )? ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2233:1: ( ( ( rule__Pattern__ReturnAssignment_6 )? ) )
            // InternalMGLang.g:2234:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            {
            // InternalMGLang.g:2234:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            // InternalMGLang.g:2235:2: ( rule__Pattern__ReturnAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            }
            // InternalMGLang.g:2236:2: ( rule__Pattern__ReturnAssignment_6 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMGLang.g:2236:3: rule__Pattern__ReturnAssignment_6
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
    // InternalMGLang.g:2245:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2249:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:2250:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // InternalMGLang.g:2257:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2261:1: ( ( '(' ) )
            // InternalMGLang.g:2262:1: ( '(' )
            {
            // InternalMGLang.g:2262:1: ( '(' )
            // InternalMGLang.g:2263:2: '('
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
    // InternalMGLang.g:2272:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2276:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:2277:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
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
    // InternalMGLang.g:2284:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2288:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:2289:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:2289:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:2290:2: ( rule__Pattern__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            }
            // InternalMGLang.g:2291:2: ( rule__Pattern__Group_2_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=17 && LA23_0<=20)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMGLang.g:2291:3: rule__Pattern__Group_2_1__0
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
    // InternalMGLang.g:2299:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2303:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:2304:2: rule__Pattern__Group_2__2__Impl
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
    // InternalMGLang.g:2310:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2314:1: ( ( ')' ) )
            // InternalMGLang.g:2315:1: ( ')' )
            {
            // InternalMGLang.g:2315:1: ( ')' )
            // InternalMGLang.g:2316:2: ')'
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
    // InternalMGLang.g:2326:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2330:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:2331:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
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
    // InternalMGLang.g:2338:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2342:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:2343:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:2343:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:2344:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            }
            // InternalMGLang.g:2345:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:2345:3: rule__Pattern__ParametersAssignment_2_1_0
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
    // InternalMGLang.g:2353:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2357:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:2358:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalMGLang.g:2364:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2368:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:2369:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:2369:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:2370:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            }
            // InternalMGLang.g:2371:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGLang.g:2371:3: rule__Pattern__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Pattern__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMGLang.g:2380:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2384:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:2385:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
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
    // InternalMGLang.g:2392:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2396:1: ( ( ',' ) )
            // InternalMGLang.g:2397:1: ( ',' )
            {
            // InternalMGLang.g:2397:1: ( ',' )
            // InternalMGLang.g:2398:2: ','
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
    // InternalMGLang.g:2407:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2411:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:2412:2: rule__Pattern__Group_2_1_1__1__Impl
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
    // InternalMGLang.g:2418:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2422:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:2423:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:2423:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:2424:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            }
            // InternalMGLang.g:2425:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:2425:3: rule__Pattern__ParametersAssignment_2_1_1_1
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
    // InternalMGLang.g:2434:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2438:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:2439:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
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
    // InternalMGLang.g:2446:1: rule__PatternReturn__Group__0__Impl : ( () ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2450:1: ( ( () ) )
            // InternalMGLang.g:2451:1: ( () )
            {
            // InternalMGLang.g:2451:1: ( () )
            // InternalMGLang.g:2452:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 
            }
            // InternalMGLang.g:2453:2: ()
            // InternalMGLang.g:2453:3: 
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
    // InternalMGLang.g:2461:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2465:1: ( rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 )
            // InternalMGLang.g:2466:2: rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2
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
    // InternalMGLang.g:2473:1: rule__PatternReturn__Group__1__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2477:1: ( ( 'return' ) )
            // InternalMGLang.g:2478:1: ( 'return' )
            {
            // InternalMGLang.g:2478:1: ( 'return' )
            // InternalMGLang.g:2479:2: 'return'
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
    // InternalMGLang.g:2488:1: rule__PatternReturn__Group__2 : rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 ;
    public final void rule__PatternReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2492:1: ( rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 )
            // InternalMGLang.g:2493:2: rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3
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
    // InternalMGLang.g:2500:1: rule__PatternReturn__Group__2__Impl : ( 'this' ) ;
    public final void rule__PatternReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2504:1: ( ( 'this' ) )
            // InternalMGLang.g:2505:1: ( 'this' )
            {
            // InternalMGLang.g:2505:1: ( 'this' )
            // InternalMGLang.g:2506:2: 'this'
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
    // InternalMGLang.g:2515:1: rule__PatternReturn__Group__3 : rule__PatternReturn__Group__3__Impl ;
    public final void rule__PatternReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2519:1: ( rule__PatternReturn__Group__3__Impl )
            // InternalMGLang.g:2520:2: rule__PatternReturn__Group__3__Impl
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
    // InternalMGLang.g:2526:1: rule__PatternReturn__Group__3__Impl : ( ( rule__PatternReturn__Group_3__0 )? ) ;
    public final void rule__PatternReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2530:1: ( ( ( rule__PatternReturn__Group_3__0 )? ) )
            // InternalMGLang.g:2531:1: ( ( rule__PatternReturn__Group_3__0 )? )
            {
            // InternalMGLang.g:2531:1: ( ( rule__PatternReturn__Group_3__0 )? )
            // InternalMGLang.g:2532:2: ( rule__PatternReturn__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getGroup_3()); 
            }
            // InternalMGLang.g:2533:2: ( rule__PatternReturn__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMGLang.g:2533:3: rule__PatternReturn__Group_3__0
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
    // InternalMGLang.g:2542:1: rule__PatternReturn__Group_3__0 : rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 ;
    public final void rule__PatternReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2546:1: ( rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 )
            // InternalMGLang.g:2547:2: rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1
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
    // InternalMGLang.g:2554:1: rule__PatternReturn__Group_3__0__Impl : ( '.' ) ;
    public final void rule__PatternReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2558:1: ( ( '.' ) )
            // InternalMGLang.g:2559:1: ( '.' )
            {
            // InternalMGLang.g:2559:1: ( '.' )
            // InternalMGLang.g:2560:2: '.'
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
    // InternalMGLang.g:2569:1: rule__PatternReturn__Group_3__1 : rule__PatternReturn__Group_3__1__Impl ;
    public final void rule__PatternReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2573:1: ( rule__PatternReturn__Group_3__1__Impl )
            // InternalMGLang.g:2574:2: rule__PatternReturn__Group_3__1__Impl
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
    // InternalMGLang.g:2580:1: rule__PatternReturn__Group_3__1__Impl : ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) ;
    public final void rule__PatternReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2584:1: ( ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) )
            // InternalMGLang.g:2585:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            {
            // InternalMGLang.g:2585:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            // InternalMGLang.g:2586:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 
            }
            // InternalMGLang.g:2587:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            // InternalMGLang.g:2587:3: rule__PatternReturn__ReturnValueAssignment_3_1
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
    // InternalMGLang.g:2596:1: rule__ParamManipulation__Group__0 : rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 ;
    public final void rule__ParamManipulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2600:1: ( rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 )
            // InternalMGLang.g:2601:2: rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1
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
    // InternalMGLang.g:2608:1: rule__ParamManipulation__Group__0__Impl : ( ( rule__ParamManipulation__ParamAssignment_0 ) ) ;
    public final void rule__ParamManipulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2612:1: ( ( ( rule__ParamManipulation__ParamAssignment_0 ) ) )
            // InternalMGLang.g:2613:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            {
            // InternalMGLang.g:2613:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            // InternalMGLang.g:2614:2: ( rule__ParamManipulation__ParamAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getParamAssignment_0()); 
            }
            // InternalMGLang.g:2615:2: ( rule__ParamManipulation__ParamAssignment_0 )
            // InternalMGLang.g:2615:3: rule__ParamManipulation__ParamAssignment_0
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
    // InternalMGLang.g:2623:1: rule__ParamManipulation__Group__1 : rule__ParamManipulation__Group__1__Impl ;
    public final void rule__ParamManipulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2627:1: ( rule__ParamManipulation__Group__1__Impl )
            // InternalMGLang.g:2628:2: rule__ParamManipulation__Group__1__Impl
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
    // InternalMGLang.g:2634:1: rule__ParamManipulation__Group__1__Impl : ( ( rule__ParamManipulation__ContentAssignment_1 ) ) ;
    public final void rule__ParamManipulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2638:1: ( ( ( rule__ParamManipulation__ContentAssignment_1 ) ) )
            // InternalMGLang.g:2639:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            {
            // InternalMGLang.g:2639:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            // InternalMGLang.g:2640:2: ( rule__ParamManipulation__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getContentAssignment_1()); 
            }
            // InternalMGLang.g:2641:2: ( rule__ParamManipulation__ContentAssignment_1 )
            // InternalMGLang.g:2641:3: rule__ParamManipulation__ContentAssignment_1
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
    // InternalMGLang.g:2650:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2654:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:2655:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalMGLang.g:2662:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2666:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalMGLang.g:2667:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:2667:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalMGLang.g:2668:2: ( rule__Node__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:2669:2: ( rule__Node__TypeAssignment_0 )
            // InternalMGLang.g:2669:3: rule__Node__TypeAssignment_0
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
    // InternalMGLang.g:2677:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2681:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalMGLang.g:2682:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalMGLang.g:2689:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2693:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalMGLang.g:2694:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2694:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalMGLang.g:2695:2: ( rule__Node__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:2696:2: ( rule__Node__NameAssignment_1 )
            // InternalMGLang.g:2696:3: rule__Node__NameAssignment_1
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
    // InternalMGLang.g:2704:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2708:1: ( rule__Node__Group__2__Impl )
            // InternalMGLang.g:2709:2: rule__Node__Group__2__Impl
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
    // InternalMGLang.g:2715:1: rule__Node__Group__2__Impl : ( ( rule__Node__Alternatives_2 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2719:1: ( ( ( rule__Node__Alternatives_2 )? ) )
            // InternalMGLang.g:2720:1: ( ( rule__Node__Alternatives_2 )? )
            {
            // InternalMGLang.g:2720:1: ( ( rule__Node__Alternatives_2 )? )
            // InternalMGLang.g:2721:2: ( rule__Node__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_2()); 
            }
            // InternalMGLang.g:2722:2: ( rule__Node__Alternatives_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ASSIGNMENT_OP||LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMGLang.g:2722:3: rule__Node__Alternatives_2
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
    // InternalMGLang.g:2731:1: rule__Node__Group_2_1__0 : rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1 ;
    public final void rule__Node__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2735:1: ( rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1 )
            // InternalMGLang.g:2736:2: rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1
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
    // InternalMGLang.g:2743:1: rule__Node__Group_2_1__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Node__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2747:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:2748:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:2748:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:2749:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:2758:1: rule__Node__Group_2_1__1 : rule__Node__Group_2_1__1__Impl ;
    public final void rule__Node__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2762:1: ( rule__Node__Group_2_1__1__Impl )
            // InternalMGLang.g:2763:2: rule__Node__Group_2_1__1__Impl
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
    // InternalMGLang.g:2769:1: rule__Node__Group_2_1__1__Impl : ( ( rule__Node__CreatedByAssignment_2_1_1 ) ) ;
    public final void rule__Node__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2773:1: ( ( ( rule__Node__CreatedByAssignment_2_1_1 ) ) )
            // InternalMGLang.g:2774:1: ( ( rule__Node__CreatedByAssignment_2_1_1 ) )
            {
            // InternalMGLang.g:2774:1: ( ( rule__Node__CreatedByAssignment_2_1_1 ) )
            // InternalMGLang.g:2775:2: ( rule__Node__CreatedByAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getCreatedByAssignment_2_1_1()); 
            }
            // InternalMGLang.g:2776:2: ( rule__Node__CreatedByAssignment_2_1_1 )
            // InternalMGLang.g:2776:3: rule__Node__CreatedByAssignment_2_1_1
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
    // InternalMGLang.g:2785:1: rule__NodeContent__Group__0 : rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 ;
    public final void rule__NodeContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2789:1: ( rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 )
            // InternalMGLang.g:2790:2: rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1
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
    // InternalMGLang.g:2797:1: rule__NodeContent__Group__0__Impl : ( () ) ;
    public final void rule__NodeContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2801:1: ( ( () ) )
            // InternalMGLang.g:2802:1: ( () )
            {
            // InternalMGLang.g:2802:1: ( () )
            // InternalMGLang.g:2803:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getNodeContentAction_0()); 
            }
            // InternalMGLang.g:2804:2: ()
            // InternalMGLang.g:2804:3: 
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
    // InternalMGLang.g:2812:1: rule__NodeContent__Group__1 : rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 ;
    public final void rule__NodeContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2816:1: ( rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 )
            // InternalMGLang.g:2817:2: rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2
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
    // InternalMGLang.g:2824:1: rule__NodeContent__Group__1__Impl : ( '{' ) ;
    public final void rule__NodeContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2828:1: ( ( '{' ) )
            // InternalMGLang.g:2829:1: ( '{' )
            {
            // InternalMGLang.g:2829:1: ( '{' )
            // InternalMGLang.g:2830:2: '{'
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
    // InternalMGLang.g:2839:1: rule__NodeContent__Group__2 : rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 ;
    public final void rule__NodeContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2843:1: ( rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 )
            // InternalMGLang.g:2844:2: rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3
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
    // InternalMGLang.g:2851:1: rule__NodeContent__Group__2__Impl : ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) ;
    public final void rule__NodeContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2855:1: ( ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) )
            // InternalMGLang.g:2856:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            {
            // InternalMGLang.g:2856:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            // InternalMGLang.g:2857:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeContentAccess().getRefsAssignsAssignment_2()); 
            }
            // InternalMGLang.g:2858:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMGLang.g:2858:3: rule__NodeContent__RefsAssignsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__NodeContent__RefsAssignsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMGLang.g:2866:1: rule__NodeContent__Group__3 : rule__NodeContent__Group__3__Impl ;
    public final void rule__NodeContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2870:1: ( rule__NodeContent__Group__3__Impl )
            // InternalMGLang.g:2871:2: rule__NodeContent__Group__3__Impl
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
    // InternalMGLang.g:2877:1: rule__NodeContent__Group__3__Impl : ( '}' ) ;
    public final void rule__NodeContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2881:1: ( ( '}' ) )
            // InternalMGLang.g:2882:1: ( '}' )
            {
            // InternalMGLang.g:2882:1: ( '}' )
            // InternalMGLang.g:2883:2: '}'
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
    // InternalMGLang.g:2893:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2897:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:2898:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
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
    // InternalMGLang.g:2905:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2909:1: ( ( ( rule__PatternCall__CalledAssignment_0 ) ) )
            // InternalMGLang.g:2910:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            {
            // InternalMGLang.g:2910:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            // InternalMGLang.g:2911:2: ( rule__PatternCall__CalledAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 
            }
            // InternalMGLang.g:2912:2: ( rule__PatternCall__CalledAssignment_0 )
            // InternalMGLang.g:2912:3: rule__PatternCall__CalledAssignment_0
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
    // InternalMGLang.g:2920:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2924:1: ( rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 )
            // InternalMGLang.g:2925:2: rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2
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
    // InternalMGLang.g:2932:1: rule__PatternCall__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2936:1: ( ( '(' ) )
            // InternalMGLang.g:2937:1: ( '(' )
            {
            // InternalMGLang.g:2937:1: ( '(' )
            // InternalMGLang.g:2938:2: '('
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
    // InternalMGLang.g:2947:1: rule__PatternCall__Group__2 : rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 ;
    public final void rule__PatternCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2951:1: ( rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 )
            // InternalMGLang.g:2952:2: rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3
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
    // InternalMGLang.g:2959:1: rule__PatternCall__Group__2__Impl : ( ( rule__PatternCall__ParamsAssignment_2 )* ) ;
    public final void rule__PatternCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2963:1: ( ( ( rule__PatternCall__ParamsAssignment_2 )* ) )
            // InternalMGLang.g:2964:1: ( ( rule__PatternCall__ParamsAssignment_2 )* )
            {
            // InternalMGLang.g:2964:1: ( ( rule__PatternCall__ParamsAssignment_2 )* )
            // InternalMGLang.g:2965:2: ( rule__PatternCall__ParamsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getParamsAssignment_2()); 
            }
            // InternalMGLang.g:2966:2: ( rule__PatternCall__ParamsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_FALSE)||(LA28_0>=RULE_INT && LA28_0<=RULE_ID)||(LA28_0>=15 && LA28_0<=16)||LA28_0==40||LA28_0==49) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMGLang.g:2966:3: rule__PatternCall__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__PatternCall__ParamsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMGLang.g:2974:1: rule__PatternCall__Group__3 : rule__PatternCall__Group__3__Impl ;
    public final void rule__PatternCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2978:1: ( rule__PatternCall__Group__3__Impl )
            // InternalMGLang.g:2979:2: rule__PatternCall__Group__3__Impl
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
    // InternalMGLang.g:2985:1: rule__PatternCall__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2989:1: ( ( ')' ) )
            // InternalMGLang.g:2990:1: ( ')' )
            {
            // InternalMGLang.g:2990:1: ( ')' )
            // InternalMGLang.g:2991:2: ')'
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


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__0"
    // InternalMGLang.g:3001:1: rule__NodeReferenceOrAssignment__Group__0 : rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 ;
    public final void rule__NodeReferenceOrAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3005:1: ( rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1 )
            // InternalMGLang.g:3006:2: rule__NodeReferenceOrAssignment__Group__0__Impl rule__NodeReferenceOrAssignment__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__NodeReferenceOrAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group__0"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__0__Impl"
    // InternalMGLang.g:3013:1: rule__NodeReferenceOrAssignment__Group__0__Impl : ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3017:1: ( ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) ) )
            // InternalMGLang.g:3018:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            {
            // InternalMGLang.g:3018:1: ( ( rule__NodeReferenceOrAssignment__Alternatives_0 ) )
            // InternalMGLang.g:3019:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives_0()); 
            }
            // InternalMGLang.g:3020:2: ( rule__NodeReferenceOrAssignment__Alternatives_0 )
            // InternalMGLang.g:3020:3: rule__NodeReferenceOrAssignment__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group__0__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__1"
    // InternalMGLang.g:3028:1: rule__NodeReferenceOrAssignment__Group__1 : rule__NodeReferenceOrAssignment__Group__1__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3032:1: ( rule__NodeReferenceOrAssignment__Group__1__Impl )
            // InternalMGLang.g:3033:2: rule__NodeReferenceOrAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group__1"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group__1__Impl"
    // InternalMGLang.g:3039:1: rule__NodeReferenceOrAssignment__Group__1__Impl : ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) ;
    public final void rule__NodeReferenceOrAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3043:1: ( ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? ) )
            // InternalMGLang.g:3044:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            {
            // InternalMGLang.g:3044:1: ( ( rule__NodeReferenceOrAssignment__Group_1__0 )? )
            // InternalMGLang.g:3045:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup_1()); 
            }
            // InternalMGLang.g:3046:2: ( rule__NodeReferenceOrAssignment__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMGLang.g:3046:3: rule__NodeReferenceOrAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeReferenceOrAssignment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group__1__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__0"
    // InternalMGLang.g:3055:1: rule__NodeReferenceOrAssignment__Group_1__0 : rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3059:1: ( rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1 )
            // InternalMGLang.g:3060:2: rule__NodeReferenceOrAssignment__Group_1__0__Impl rule__NodeReferenceOrAssignment__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__NodeReferenceOrAssignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__0"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__0__Impl"
    // InternalMGLang.g:3067:1: rule__NodeReferenceOrAssignment__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3071:1: ( ( '[' ) )
            // InternalMGLang.g:3072:1: ( '[' )
            {
            // InternalMGLang.g:3072:1: ( '[' )
            // InternalMGLang.g:3073:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__1"
    // InternalMGLang.g:3082:1: rule__NodeReferenceOrAssignment__Group_1__1 : rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3086:1: ( rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2 )
            // InternalMGLang.g:3087:2: rule__NodeReferenceOrAssignment__Group_1__1__Impl rule__NodeReferenceOrAssignment__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__NodeReferenceOrAssignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__1"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__1__Impl"
    // InternalMGLang.g:3094:1: rule__NodeReferenceOrAssignment__Group_1__1__Impl : ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3098:1: ( ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) ) )
            // InternalMGLang.g:3099:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            {
            // InternalMGLang.g:3099:1: ( ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 ) )
            // InternalMGLang.g:3100:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionAssignment_1_1()); 
            }
            // InternalMGLang.g:3101:2: ( rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 )
            // InternalMGLang.g:3101:3: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__ConditionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__2"
    // InternalMGLang.g:3109:1: rule__NodeReferenceOrAssignment__Group_1__2 : rule__NodeReferenceOrAssignment__Group_1__2__Impl ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3113:1: ( rule__NodeReferenceOrAssignment__Group_1__2__Impl )
            // InternalMGLang.g:3114:2: rule__NodeReferenceOrAssignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__2"


    // $ANTLR start "rule__NodeReferenceOrAssignment__Group_1__2__Impl"
    // InternalMGLang.g:3120:1: rule__NodeReferenceOrAssignment__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeReferenceOrAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3124:1: ( ( ']' ) )
            // InternalMGLang.g:3125:1: ( ']' )
            {
            // InternalMGLang.g:3125:1: ( ']' )
            // InternalMGLang.g:3126:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentAccess().getRightSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__Group_1__2__Impl"


    // $ANTLR start "rule__PatternNodeReference__Group__0"
    // InternalMGLang.g:3136:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3140:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:3141:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMGLang.g:3148:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3152:1: ( ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3153:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3153:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            // InternalMGLang.g:3154:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3155:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            // InternalMGLang.g:3155:3: rule__PatternNodeReference__TypeAssignment_0
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
    // InternalMGLang.g:3163:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3167:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:3168:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
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
    // InternalMGLang.g:3175:1: rule__PatternNodeReference__Group__1__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3179:1: ( ( '->' ) )
            // InternalMGLang.g:3180:1: ( '->' )
            {
            // InternalMGLang.g:3180:1: ( '->' )
            // InternalMGLang.g:3181:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:3190:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3194:1: ( rule__PatternNodeReference__Group__2__Impl )
            // InternalMGLang.g:3195:2: rule__PatternNodeReference__Group__2__Impl
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
    // InternalMGLang.g:3201:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3205:1: ( ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) )
            // InternalMGLang.g:3206:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            {
            // InternalMGLang.g:3206:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            // InternalMGLang.g:3207:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 
            }
            // InternalMGLang.g:3208:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            // InternalMGLang.g:3208:3: rule__PatternNodeReference__TargetAssignment_2
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
    // InternalMGLang.g:3217:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3221:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:3222:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMGLang.g:3229:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3233:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMGLang.g:3234:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMGLang.g:3234:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMGLang.g:3235:2: ( rule__Assignment__TargetAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            }
            // InternalMGLang.g:3236:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMGLang.g:3236:3: rule__Assignment__TargetAssignment_0
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
    // InternalMGLang.g:3244:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3248:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:3249:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:3256:1: rule__Assignment__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3260:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3261:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3261:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3262:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:3271:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3275:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:3276:2: rule__Assignment__Group__2__Impl
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
    // InternalMGLang.g:3282:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3286:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:3287:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:3287:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:3288:2: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // InternalMGLang.g:3289:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:3289:3: rule__Assignment__ValueAssignment_2
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
    // InternalMGLang.g:3298:1: rule__PrimitiveParameter__Group__0 : rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 ;
    public final void rule__PrimitiveParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3302:1: ( rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 )
            // InternalMGLang.g:3303:2: rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1
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
    // InternalMGLang.g:3310:1: rule__PrimitiveParameter__Group__0__Impl : ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3314:1: ( ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3315:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3315:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:3316:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3317:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            // InternalMGLang.g:3317:3: rule__PrimitiveParameter__TypeAssignment_0
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
    // InternalMGLang.g:3325:1: rule__PrimitiveParameter__Group__1 : rule__PrimitiveParameter__Group__1__Impl ;
    public final void rule__PrimitiveParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3329:1: ( rule__PrimitiveParameter__Group__1__Impl )
            // InternalMGLang.g:3330:2: rule__PrimitiveParameter__Group__1__Impl
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
    // InternalMGLang.g:3336:1: rule__PrimitiveParameter__Group__1__Impl : ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3340:1: ( ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:3341:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3341:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            // InternalMGLang.g:3342:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:3343:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            // InternalMGLang.g:3343:3: rule__PrimitiveParameter__NameAssignment_1
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
    // InternalMGLang.g:3352:1: rule__ParameterNode__Group__0 : rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 ;
    public final void rule__ParameterNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3356:1: ( rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 )
            // InternalMGLang.g:3357:2: rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1
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
    // InternalMGLang.g:3364:1: rule__ParameterNode__Group__0__Impl : ( ( rule__ParameterNode__TypeAssignment_0 ) ) ;
    public final void rule__ParameterNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3368:1: ( ( ( rule__ParameterNode__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3369:1: ( ( rule__ParameterNode__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3369:1: ( ( rule__ParameterNode__TypeAssignment_0 ) )
            // InternalMGLang.g:3370:2: ( rule__ParameterNode__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:3371:2: ( rule__ParameterNode__TypeAssignment_0 )
            // InternalMGLang.g:3371:3: rule__ParameterNode__TypeAssignment_0
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
    // InternalMGLang.g:3379:1: rule__ParameterNode__Group__1 : rule__ParameterNode__Group__1__Impl ;
    public final void rule__ParameterNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3383:1: ( rule__ParameterNode__Group__1__Impl )
            // InternalMGLang.g:3384:2: rule__ParameterNode__Group__1__Impl
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
    // InternalMGLang.g:3390:1: rule__ParameterNode__Group__1__Impl : ( ( rule__ParameterNode__NameAssignment_1 ) ) ;
    public final void rule__ParameterNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3394:1: ( ( ( rule__ParameterNode__NameAssignment_1 ) ) )
            // InternalMGLang.g:3395:1: ( ( rule__ParameterNode__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3395:1: ( ( rule__ParameterNode__NameAssignment_1 ) )
            // InternalMGLang.g:3396:2: ( rule__ParameterNode__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:3397:2: ( rule__ParameterNode__NameAssignment_1 )
            // InternalMGLang.g:3397:3: rule__ParameterNode__NameAssignment_1
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


    // $ANTLR start "rule__MethodCall__Group__0"
    // InternalMGLang.g:3406:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3410:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // InternalMGLang.g:3411:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // InternalMGLang.g:3418:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__CalledNodeAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3422:1: ( ( ( rule__MethodCall__CalledNodeAssignment_0 ) ) )
            // InternalMGLang.g:3423:1: ( ( rule__MethodCall__CalledNodeAssignment_0 ) )
            {
            // InternalMGLang.g:3423:1: ( ( rule__MethodCall__CalledNodeAssignment_0 ) )
            // InternalMGLang.g:3424:2: ( rule__MethodCall__CalledNodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getCalledNodeAssignment_0()); 
            }
            // InternalMGLang.g:3425:2: ( rule__MethodCall__CalledNodeAssignment_0 )
            // InternalMGLang.g:3425:3: rule__MethodCall__CalledNodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__CalledNodeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getCalledNodeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0__Impl"


    // $ANTLR start "rule__MethodCall__Group__1"
    // InternalMGLang.g:3433:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3437:1: ( rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2 )
            // InternalMGLang.g:3438:2: rule__MethodCall__Group__1__Impl rule__MethodCall__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // InternalMGLang.g:3445:1: rule__MethodCall__Group__1__Impl : ( '.' ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3449:1: ( ( '.' ) )
            // InternalMGLang.g:3450:1: ( '.' )
            {
            // InternalMGLang.g:3450:1: ( '.' )
            // InternalMGLang.g:3451:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__2"
    // InternalMGLang.g:3460:1: rule__MethodCall__Group__2 : rule__MethodCall__Group__2__Impl ;
    public final void rule__MethodCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3464:1: ( rule__MethodCall__Group__2__Impl )
            // InternalMGLang.g:3465:2: rule__MethodCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__2"


    // $ANTLR start "rule__MethodCall__Group__2__Impl"
    // InternalMGLang.g:3471:1: rule__MethodCall__Group__2__Impl : ( ( rule__MethodCall__MethodAssignment_2 ) ) ;
    public final void rule__MethodCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3475:1: ( ( ( rule__MethodCall__MethodAssignment_2 ) ) )
            // InternalMGLang.g:3476:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            {
            // InternalMGLang.g:3476:1: ( ( rule__MethodCall__MethodAssignment_2 ) )
            // InternalMGLang.g:3477:2: ( rule__MethodCall__MethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            }
            // InternalMGLang.g:3478:2: ( rule__MethodCall__MethodAssignment_2 )
            // InternalMGLang.g:3478:3: rule__MethodCall__MethodAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__MethodAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__2__Impl"


    // $ANTLR start "rule__TertiaryExpression__Group__0"
    // InternalMGLang.g:3487:1: rule__TertiaryExpression__Group__0 : rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 ;
    public final void rule__TertiaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3491:1: ( rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 )
            // InternalMGLang.g:3492:2: rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMGLang.g:3499:1: rule__TertiaryExpression__Group__0__Impl : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3503:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:3504:1: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:3504:1: ( ruleSecondaryExpression )
            // InternalMGLang.g:3505:2: ruleSecondaryExpression
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
    // InternalMGLang.g:3514:1: rule__TertiaryExpression__Group__1 : rule__TertiaryExpression__Group__1__Impl ;
    public final void rule__TertiaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3518:1: ( rule__TertiaryExpression__Group__1__Impl )
            // InternalMGLang.g:3519:2: rule__TertiaryExpression__Group__1__Impl
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
    // InternalMGLang.g:3525:1: rule__TertiaryExpression__Group__1__Impl : ( ( rule__TertiaryExpression__Group_1__0 )* ) ;
    public final void rule__TertiaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3529:1: ( ( ( rule__TertiaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:3530:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:3530:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            // InternalMGLang.g:3531:2: ( rule__TertiaryExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:3532:2: ( rule__TertiaryExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=27 && LA30_0<=29)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMGLang.g:3532:3: rule__TertiaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__TertiaryExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMGLang.g:3541:1: rule__TertiaryExpression__Group_1__0 : rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 ;
    public final void rule__TertiaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3545:1: ( rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 )
            // InternalMGLang.g:3546:2: rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMGLang.g:3553:1: rule__TertiaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TertiaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3557:1: ( ( () ) )
            // InternalMGLang.g:3558:1: ( () )
            {
            // InternalMGLang.g:3558:1: ( () )
            // InternalMGLang.g:3559:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:3560:2: ()
            // InternalMGLang.g:3560:3: 
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
    // InternalMGLang.g:3568:1: rule__TertiaryExpression__Group_1__1 : rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 ;
    public final void rule__TertiaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3572:1: ( rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 )
            // InternalMGLang.g:3573:2: rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:3580:1: rule__TertiaryExpression__Group_1__1__Impl : ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__TertiaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3584:1: ( ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:3585:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:3585:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:3586:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:3587:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:3587:3: rule__TertiaryExpression__OpAssignment_1_1
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
    // InternalMGLang.g:3595:1: rule__TertiaryExpression__Group_1__2 : rule__TertiaryExpression__Group_1__2__Impl ;
    public final void rule__TertiaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3599:1: ( rule__TertiaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:3600:2: rule__TertiaryExpression__Group_1__2__Impl
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
    // InternalMGLang.g:3606:1: rule__TertiaryExpression__Group_1__2__Impl : ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__TertiaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3610:1: ( ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:3611:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:3611:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:3612:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTertiaryExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:3613:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:3613:3: rule__TertiaryExpression__RightAssignment_1_2
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
    // InternalMGLang.g:3622:1: rule__SecondaryExpression__Group__0 : rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 ;
    public final void rule__SecondaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3626:1: ( rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 )
            // InternalMGLang.g:3627:2: rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMGLang.g:3634:1: rule__SecondaryExpression__Group__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3638:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:3639:1: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:3639:1: ( rulePrimaryExpr )
            // InternalMGLang.g:3640:2: rulePrimaryExpr
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
    // InternalMGLang.g:3649:1: rule__SecondaryExpression__Group__1 : rule__SecondaryExpression__Group__1__Impl ;
    public final void rule__SecondaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3653:1: ( rule__SecondaryExpression__Group__1__Impl )
            // InternalMGLang.g:3654:2: rule__SecondaryExpression__Group__1__Impl
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
    // InternalMGLang.g:3660:1: rule__SecondaryExpression__Group__1__Impl : ( ( rule__SecondaryExpression__Group_1__0 )* ) ;
    public final void rule__SecondaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3664:1: ( ( ( rule__SecondaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:3665:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:3665:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            // InternalMGLang.g:3666:2: ( rule__SecondaryExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:3667:2: ( rule__SecondaryExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=30 && LA31_0<=31)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMGLang.g:3667:3: rule__SecondaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SecondaryExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalMGLang.g:3676:1: rule__SecondaryExpression__Group_1__0 : rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 ;
    public final void rule__SecondaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3680:1: ( rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 )
            // InternalMGLang.g:3681:2: rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMGLang.g:3688:1: rule__SecondaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SecondaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3692:1: ( ( () ) )
            // InternalMGLang.g:3693:1: ( () )
            {
            // InternalMGLang.g:3693:1: ( () )
            // InternalMGLang.g:3694:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:3695:2: ()
            // InternalMGLang.g:3695:3: 
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
    // InternalMGLang.g:3703:1: rule__SecondaryExpression__Group_1__1 : rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 ;
    public final void rule__SecondaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3707:1: ( rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 )
            // InternalMGLang.g:3708:2: rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:3715:1: rule__SecondaryExpression__Group_1__1__Impl : ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__SecondaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3719:1: ( ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:3720:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:3720:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:3721:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:3722:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:3722:3: rule__SecondaryExpression__OpAssignment_1_1
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
    // InternalMGLang.g:3730:1: rule__SecondaryExpression__Group_1__2 : rule__SecondaryExpression__Group_1__2__Impl ;
    public final void rule__SecondaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3734:1: ( rule__SecondaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:3735:2: rule__SecondaryExpression__Group_1__2__Impl
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
    // InternalMGLang.g:3741:1: rule__SecondaryExpression__Group_1__2__Impl : ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SecondaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3745:1: ( ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:3746:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:3746:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:3747:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:3748:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:3748:3: rule__SecondaryExpression__RightAssignment_1_2
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
    // InternalMGLang.g:3757:1: rule__PrimaryExpr__Group__0 : rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 ;
    public final void rule__PrimaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3761:1: ( rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 )
            // InternalMGLang.g:3762:2: rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMGLang.g:3769:1: rule__PrimaryExpr__Group__0__Impl : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3773:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:3774:1: ( ruleRelationExpression )
            {
            // InternalMGLang.g:3774:1: ( ruleRelationExpression )
            // InternalMGLang.g:3775:2: ruleRelationExpression
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
    // InternalMGLang.g:3784:1: rule__PrimaryExpr__Group__1 : rule__PrimaryExpr__Group__1__Impl ;
    public final void rule__PrimaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3788:1: ( rule__PrimaryExpr__Group__1__Impl )
            // InternalMGLang.g:3789:2: rule__PrimaryExpr__Group__1__Impl
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
    // InternalMGLang.g:3795:1: rule__PrimaryExpr__Group__1__Impl : ( ( rule__PrimaryExpr__Group_1__0 )* ) ;
    public final void rule__PrimaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3799:1: ( ( ( rule__PrimaryExpr__Group_1__0 )* ) )
            // InternalMGLang.g:3800:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            {
            // InternalMGLang.g:3800:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            // InternalMGLang.g:3801:2: ( rule__PrimaryExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
            }
            // InternalMGLang.g:3802:2: ( rule__PrimaryExpr__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=32 && LA32_0<=34)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMGLang.g:3802:3: rule__PrimaryExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__PrimaryExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalMGLang.g:3811:1: rule__PrimaryExpr__Group_1__0 : rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 ;
    public final void rule__PrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3815:1: ( rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 )
            // InternalMGLang.g:3816:2: rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMGLang.g:3823:1: rule__PrimaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3827:1: ( ( () ) )
            // InternalMGLang.g:3828:1: ( () )
            {
            // InternalMGLang.g:3828:1: ( () )
            // InternalMGLang.g:3829:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0()); 
            }
            // InternalMGLang.g:3830:2: ()
            // InternalMGLang.g:3830:3: 
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
    // InternalMGLang.g:3838:1: rule__PrimaryExpr__Group_1__1 : rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 ;
    public final void rule__PrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3842:1: ( rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 )
            // InternalMGLang.g:3843:2: rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:3850:1: rule__PrimaryExpr__Group_1__1__Impl : ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3854:1: ( ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:3855:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:3855:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            // InternalMGLang.g:3856:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getOpAssignment_1_1()); 
            }
            // InternalMGLang.g:3857:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            // InternalMGLang.g:3857:3: rule__PrimaryExpr__OpAssignment_1_1
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
    // InternalMGLang.g:3865:1: rule__PrimaryExpr__Group_1__2 : rule__PrimaryExpr__Group_1__2__Impl ;
    public final void rule__PrimaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3869:1: ( rule__PrimaryExpr__Group_1__2__Impl )
            // InternalMGLang.g:3870:2: rule__PrimaryExpr__Group_1__2__Impl
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
    // InternalMGLang.g:3876:1: rule__PrimaryExpr__Group_1__2__Impl : ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3880:1: ( ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:3881:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:3881:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            // InternalMGLang.g:3882:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:3883:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            // InternalMGLang.g:3883:3: rule__PrimaryExpr__RightAssignment_1_2
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
    // InternalMGLang.g:3892:1: rule__RelationExpression__Group__0 : rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 ;
    public final void rule__RelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3896:1: ( rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 )
            // InternalMGLang.g:3897:2: rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMGLang.g:3904:1: rule__RelationExpression__Group__0__Impl : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3908:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:3909:1: ( ruleBaseExpr )
            {
            // InternalMGLang.g:3909:1: ( ruleBaseExpr )
            // InternalMGLang.g:3910:2: ruleBaseExpr
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
    // InternalMGLang.g:3919:1: rule__RelationExpression__Group__1 : rule__RelationExpression__Group__1__Impl ;
    public final void rule__RelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3923:1: ( rule__RelationExpression__Group__1__Impl )
            // InternalMGLang.g:3924:2: rule__RelationExpression__Group__1__Impl
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
    // InternalMGLang.g:3930:1: rule__RelationExpression__Group__1__Impl : ( ( rule__RelationExpression__Group_1__0 )* ) ;
    public final void rule__RelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3934:1: ( ( ( rule__RelationExpression__Group_1__0 )* ) )
            // InternalMGLang.g:3935:1: ( ( rule__RelationExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:3935:1: ( ( rule__RelationExpression__Group_1__0 )* )
            // InternalMGLang.g:3936:2: ( rule__RelationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getGroup_1()); 
            }
            // InternalMGLang.g:3937:2: ( rule__RelationExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=21 && LA33_0<=26)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMGLang.g:3937:3: rule__RelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__RelationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMGLang.g:3946:1: rule__RelationExpression__Group_1__0 : rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 ;
    public final void rule__RelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3950:1: ( rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 )
            // InternalMGLang.g:3951:2: rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMGLang.g:3958:1: rule__RelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3962:1: ( ( () ) )
            // InternalMGLang.g:3963:1: ( () )
            {
            // InternalMGLang.g:3963:1: ( () )
            // InternalMGLang.g:3964:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0()); 
            }
            // InternalMGLang.g:3965:2: ()
            // InternalMGLang.g:3965:3: 
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
    // InternalMGLang.g:3973:1: rule__RelationExpression__Group_1__1 : rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 ;
    public final void rule__RelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3977:1: ( rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 )
            // InternalMGLang.g:3978:2: rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:3985:1: rule__RelationExpression__Group_1__1__Impl : ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) ;
    public final void rule__RelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3989:1: ( ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) )
            // InternalMGLang.g:3990:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            {
            // InternalMGLang.g:3990:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            // InternalMGLang.g:3991:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1_1()); 
            }
            // InternalMGLang.g:3992:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            // InternalMGLang.g:3992:3: rule__RelationExpression__RelationAssignment_1_1
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
    // InternalMGLang.g:4000:1: rule__RelationExpression__Group_1__2 : rule__RelationExpression__Group_1__2__Impl ;
    public final void rule__RelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4004:1: ( rule__RelationExpression__Group_1__2__Impl )
            // InternalMGLang.g:4005:2: rule__RelationExpression__Group_1__2__Impl
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
    // InternalMGLang.g:4011:1: rule__RelationExpression__Group_1__2__Impl : ( ( rule__RelationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__RelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4015:1: ( ( ( rule__RelationExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:4016:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:4016:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:4017:2: ( rule__RelationExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalMGLang.g:4018:2: ( rule__RelationExpression__RightAssignment_1_2 )
            // InternalMGLang.g:4018:3: rule__RelationExpression__RightAssignment_1_2
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
    // InternalMGLang.g:4027:1: rule__BaseExpr__Group_0__0 : rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 ;
    public final void rule__BaseExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4031:1: ( rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 )
            // InternalMGLang.g:4032:2: rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:4039:1: rule__BaseExpr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4043:1: ( ( '(' ) )
            // InternalMGLang.g:4044:1: ( '(' )
            {
            // InternalMGLang.g:4044:1: ( '(' )
            // InternalMGLang.g:4045:2: '('
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
    // InternalMGLang.g:4054:1: rule__BaseExpr__Group_0__1 : rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 ;
    public final void rule__BaseExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4058:1: ( rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 )
            // InternalMGLang.g:4059:2: rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMGLang.g:4066:1: rule__BaseExpr__Group_0__1__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4070:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:4071:1: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:4071:1: ( ruleArithmeticExpression )
            // InternalMGLang.g:4072:2: ruleArithmeticExpression
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
    // InternalMGLang.g:4081:1: rule__BaseExpr__Group_0__2 : rule__BaseExpr__Group_0__2__Impl ;
    public final void rule__BaseExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4085:1: ( rule__BaseExpr__Group_0__2__Impl )
            // InternalMGLang.g:4086:2: rule__BaseExpr__Group_0__2__Impl
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
    // InternalMGLang.g:4092:1: rule__BaseExpr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4096:1: ( ( ')' ) )
            // InternalMGLang.g:4097:1: ( ')' )
            {
            // InternalMGLang.g:4097:1: ( ')' )
            // InternalMGLang.g:4098:2: ')'
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
    // InternalMGLang.g:4108:1: rule__BaseExpr__Group_1__0 : rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 ;
    public final void rule__BaseExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4112:1: ( rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 )
            // InternalMGLang.g:4113:2: rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMGLang.g:4120:1: rule__BaseExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4124:1: ( ( () ) )
            // InternalMGLang.g:4125:1: ( () )
            {
            // InternalMGLang.g:4125:1: ( () )
            // InternalMGLang.g:4126:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0()); 
            }
            // InternalMGLang.g:4127:2: ()
            // InternalMGLang.g:4127:3: 
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
    // InternalMGLang.g:4135:1: rule__BaseExpr__Group_1__1 : rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 ;
    public final void rule__BaseExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4139:1: ( rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 )
            // InternalMGLang.g:4140:2: rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:4147:1: rule__BaseExpr__Group_1__1__Impl : ( '!' ) ;
    public final void rule__BaseExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4151:1: ( ( '!' ) )
            // InternalMGLang.g:4152:1: ( '!' )
            {
            // InternalMGLang.g:4152:1: ( '!' )
            // InternalMGLang.g:4153:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:4162:1: rule__BaseExpr__Group_1__2 : rule__BaseExpr__Group_1__2__Impl ;
    public final void rule__BaseExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4166:1: ( rule__BaseExpr__Group_1__2__Impl )
            // InternalMGLang.g:4167:2: rule__BaseExpr__Group_1__2__Impl
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
    // InternalMGLang.g:4173:1: rule__BaseExpr__Group_1__2__Impl : ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__BaseExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4177:1: ( ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) )
            // InternalMGLang.g:4178:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            {
            // InternalMGLang.g:4178:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            // InternalMGLang.g:4179:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExprAssignment_1_2()); 
            }
            // InternalMGLang.g:4180:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            // InternalMGLang.g:4180:3: rule__BaseExpr__ExprAssignment_1_2
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
    // InternalMGLang.g:4189:1: rule__BaseExpr__Group_2__0 : rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 ;
    public final void rule__BaseExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4193:1: ( rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 )
            // InternalMGLang.g:4194:2: rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMGLang.g:4201:1: rule__BaseExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4205:1: ( ( () ) )
            // InternalMGLang.g:4206:1: ( () )
            {
            // InternalMGLang.g:4206:1: ( () )
            // InternalMGLang.g:4207:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0()); 
            }
            // InternalMGLang.g:4208:2: ()
            // InternalMGLang.g:4208:3: 
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
    // InternalMGLang.g:4216:1: rule__BaseExpr__Group_2__1 : rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 ;
    public final void rule__BaseExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4220:1: ( rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 )
            // InternalMGLang.g:4221:2: rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2
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
    // InternalMGLang.g:4228:1: rule__BaseExpr__Group_2__1__Impl : ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) ;
    public final void rule__BaseExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4232:1: ( ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) )
            // InternalMGLang.g:4233:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            {
            // InternalMGLang.g:4233:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            // InternalMGLang.g:4234:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getFuncAssignment_2_1()); 
            }
            // InternalMGLang.g:4235:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            // InternalMGLang.g:4235:3: rule__BaseExpr__FuncAssignment_2_1
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
    // InternalMGLang.g:4243:1: rule__BaseExpr__Group_2__2 : rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 ;
    public final void rule__BaseExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4247:1: ( rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 )
            // InternalMGLang.g:4248:2: rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:4255:1: rule__BaseExpr__Group_2__2__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4259:1: ( ( '(' ) )
            // InternalMGLang.g:4260:1: ( '(' )
            {
            // InternalMGLang.g:4260:1: ( '(' )
            // InternalMGLang.g:4261:2: '('
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
    // InternalMGLang.g:4270:1: rule__BaseExpr__Group_2__3 : rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 ;
    public final void rule__BaseExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4274:1: ( rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 )
            // InternalMGLang.g:4275:2: rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMGLang.g:4282:1: rule__BaseExpr__Group_2__3__Impl : ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) ;
    public final void rule__BaseExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4286:1: ( ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) )
            // InternalMGLang.g:4287:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            {
            // InternalMGLang.g:4287:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            // InternalMGLang.g:4288:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getExprAssignment_2_3()); 
            }
            // InternalMGLang.g:4289:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            // InternalMGLang.g:4289:3: rule__BaseExpr__ExprAssignment_2_3
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
    // InternalMGLang.g:4297:1: rule__BaseExpr__Group_2__4 : rule__BaseExpr__Group_2__4__Impl ;
    public final void rule__BaseExpr__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4301:1: ( rule__BaseExpr__Group_2__4__Impl )
            // InternalMGLang.g:4302:2: rule__BaseExpr__Group_2__4__Impl
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
    // InternalMGLang.g:4308:1: rule__BaseExpr__Group_2__4__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4312:1: ( ( ')' ) )
            // InternalMGLang.g:4313:1: ( ')' )
            {
            // InternalMGLang.g:4313:1: ( ')' )
            // InternalMGLang.g:4314:2: ')'
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
    // InternalMGLang.g:4324:1: rule__BaseExpr__Group_3__0 : rule__BaseExpr__Group_3__0__Impl rule__BaseExpr__Group_3__1 ;
    public final void rule__BaseExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4328:1: ( rule__BaseExpr__Group_3__0__Impl rule__BaseExpr__Group_3__1 )
            // InternalMGLang.g:4329:2: rule__BaseExpr__Group_3__0__Impl rule__BaseExpr__Group_3__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:4336:1: rule__BaseExpr__Group_3__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4340:1: ( ( () ) )
            // InternalMGLang.g:4341:1: ( () )
            {
            // InternalMGLang.g:4341:1: ( () )
            // InternalMGLang.g:4342:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseExprAccess().getLiteralAction_3_0()); 
            }
            // InternalMGLang.g:4343:2: ()
            // InternalMGLang.g:4343:3: 
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
    // InternalMGLang.g:4351:1: rule__BaseExpr__Group_3__1 : rule__BaseExpr__Group_3__1__Impl ;
    public final void rule__BaseExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4355:1: ( rule__BaseExpr__Group_3__1__Impl )
            // InternalMGLang.g:4356:2: rule__BaseExpr__Group_3__1__Impl
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
    // InternalMGLang.g:4362:1: rule__BaseExpr__Group_3__1__Impl : ( ruleLiteral ) ;
    public final void rule__BaseExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4366:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:4367:1: ( ruleLiteral )
            {
            // InternalMGLang.g:4367:1: ( ruleLiteral )
            // InternalMGLang.g:4368:2: ruleLiteral
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
    // InternalMGLang.g:4378:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4382:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalMGLang.g:4383:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
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
    // InternalMGLang.g:4390:1: rule__NumberLiteral__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4394:1: ( ( RULE_INT ) )
            // InternalMGLang.g:4395:1: ( RULE_INT )
            {
            // InternalMGLang.g:4395:1: ( RULE_INT )
            // InternalMGLang.g:4396:2: RULE_INT
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
    // InternalMGLang.g:4405:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4409:1: ( rule__NumberLiteral__Group__1__Impl )
            // InternalMGLang.g:4410:2: rule__NumberLiteral__Group__1__Impl
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
    // InternalMGLang.g:4416:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__Group_1__0 )? ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4420:1: ( ( ( rule__NumberLiteral__Group_1__0 )? ) )
            // InternalMGLang.g:4421:1: ( ( rule__NumberLiteral__Group_1__0 )? )
            {
            // InternalMGLang.g:4421:1: ( ( rule__NumberLiteral__Group_1__0 )? )
            // InternalMGLang.g:4422:2: ( rule__NumberLiteral__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getGroup_1()); 
            }
            // InternalMGLang.g:4423:2: ( rule__NumberLiteral__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMGLang.g:4423:3: rule__NumberLiteral__Group_1__0
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
    // InternalMGLang.g:4432:1: rule__NumberLiteral__Group_1__0 : rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 ;
    public final void rule__NumberLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4436:1: ( rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1 )
            // InternalMGLang.g:4437:2: rule__NumberLiteral__Group_1__0__Impl rule__NumberLiteral__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMGLang.g:4444:1: rule__NumberLiteral__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NumberLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4448:1: ( ( '.' ) )
            // InternalMGLang.g:4449:1: ( '.' )
            {
            // InternalMGLang.g:4449:1: ( '.' )
            // InternalMGLang.g:4450:2: '.'
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
    // InternalMGLang.g:4459:1: rule__NumberLiteral__Group_1__1 : rule__NumberLiteral__Group_1__1__Impl ;
    public final void rule__NumberLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4463:1: ( rule__NumberLiteral__Group_1__1__Impl )
            // InternalMGLang.g:4464:2: rule__NumberLiteral__Group_1__1__Impl
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
    // InternalMGLang.g:4470:1: rule__NumberLiteral__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NumberLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4474:1: ( ( RULE_INT ) )
            // InternalMGLang.g:4475:1: ( RULE_INT )
            {
            // InternalMGLang.g:4475:1: ( RULE_INT )
            // InternalMGLang.g:4476:2: RULE_INT
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


    // $ANTLR start "rule__Generator__Group__0"
    // InternalMGLang.g:4486:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4490:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:4491:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
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
    // InternalMGLang.g:4498:1: rule__Generator__Group__0__Impl : ( () ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4502:1: ( ( () ) )
            // InternalMGLang.g:4503:1: ( () )
            {
            // InternalMGLang.g:4503:1: ( () )
            // InternalMGLang.g:4504:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
            }
            // InternalMGLang.g:4505:2: ()
            // InternalMGLang.g:4505:3: 
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
    // InternalMGLang.g:4513:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4517:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:4518:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
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
    // InternalMGLang.g:4525:1: rule__Generator__Group__1__Impl : ( 'gen' ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4529:1: ( ( 'gen' ) )
            // InternalMGLang.g:4530:1: ( 'gen' )
            {
            // InternalMGLang.g:4530:1: ( 'gen' )
            // InternalMGLang.g:4531:2: 'gen'
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
    // InternalMGLang.g:4540:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4544:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:4545:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
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
    // InternalMGLang.g:4552:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4556:1: ( ( '(' ) )
            // InternalMGLang.g:4557:1: ( '(' )
            {
            // InternalMGLang.g:4557:1: ( '(' )
            // InternalMGLang.g:4558:2: '('
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
    // InternalMGLang.g:4567:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4571:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:4572:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
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
    // InternalMGLang.g:4579:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__ParamsAssignment_3 )* ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4583:1: ( ( ( rule__Generator__ParamsAssignment_3 )* ) )
            // InternalMGLang.g:4584:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            {
            // InternalMGLang.g:4584:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            // InternalMGLang.g:4585:2: ( rule__Generator__ParamsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getParamsAssignment_3()); 
            }
            // InternalMGLang.g:4586:2: ( rule__Generator__ParamsAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||(LA35_0>=17 && LA35_0<=20)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMGLang.g:4586:3: rule__Generator__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Generator__ParamsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalMGLang.g:4594:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4598:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:4599:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
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
    // InternalMGLang.g:4606:1: rule__Generator__Group__4__Impl : ( ')' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4610:1: ( ( ')' ) )
            // InternalMGLang.g:4611:1: ( ')' )
            {
            // InternalMGLang.g:4611:1: ( ')' )
            // InternalMGLang.g:4612:2: ')'
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
    // InternalMGLang.g:4621:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4625:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:4626:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_44);
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
    // InternalMGLang.g:4633:1: rule__Generator__Group__5__Impl : ( '{' ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4637:1: ( ( '{' ) )
            // InternalMGLang.g:4638:1: ( '{' )
            {
            // InternalMGLang.g:4638:1: ( '{' )
            // InternalMGLang.g:4639:2: '{'
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
    // InternalMGLang.g:4648:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl rule__Generator__Group__7 ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4652:1: ( rule__Generator__Group__6__Impl rule__Generator__Group__7 )
            // InternalMGLang.g:4653:2: rule__Generator__Group__6__Impl rule__Generator__Group__7
            {
            pushFollow(FOLLOW_44);
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
    // InternalMGLang.g:4660:1: rule__Generator__Group__6__Impl : ( ( rule__Generator__CommandsAssignment_6 )* ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4664:1: ( ( ( rule__Generator__CommandsAssignment_6 )* ) )
            // InternalMGLang.g:4665:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            {
            // InternalMGLang.g:4665:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            // InternalMGLang.g:4666:2: ( rule__Generator__CommandsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommandsAssignment_6()); 
            }
            // InternalMGLang.g:4667:2: ( rule__Generator__CommandsAssignment_6 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==51||LA36_0==53||LA36_0==55||(LA36_0>=59 && LA36_0<=60)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMGLang.g:4667:3: rule__Generator__CommandsAssignment_6
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Generator__CommandsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalMGLang.g:4675:1: rule__Generator__Group__7 : rule__Generator__Group__7__Impl ;
    public final void rule__Generator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4679:1: ( rule__Generator__Group__7__Impl )
            // InternalMGLang.g:4680:2: rule__Generator__Group__7__Impl
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
    // InternalMGLang.g:4686:1: rule__Generator__Group__7__Impl : ( '}' ) ;
    public final void rule__Generator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4690:1: ( ( '}' ) )
            // InternalMGLang.g:4691:1: ( '}' )
            {
            // InternalMGLang.g:4691:1: ( '}' )
            // InternalMGLang.g:4692:2: '}'
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
    // InternalMGLang.g:4702:1: rule__PatternObjectCreation__Group__0 : rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 ;
    public final void rule__PatternObjectCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4706:1: ( rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1 )
            // InternalMGLang.g:4707:2: rule__PatternObjectCreation__Group__0__Impl rule__PatternObjectCreation__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMGLang.g:4714:1: rule__PatternObjectCreation__Group__0__Impl : ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) ;
    public final void rule__PatternObjectCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4718:1: ( ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) ) )
            // InternalMGLang.g:4719:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            {
            // InternalMGLang.g:4719:1: ( ( rule__PatternObjectCreation__PObjectAssignment_0 ) )
            // InternalMGLang.g:4720:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getPObjectAssignment_0()); 
            }
            // InternalMGLang.g:4721:2: ( rule__PatternObjectCreation__PObjectAssignment_0 )
            // InternalMGLang.g:4721:3: rule__PatternObjectCreation__PObjectAssignment_0
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
    // InternalMGLang.g:4729:1: rule__PatternObjectCreation__Group__1 : rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 ;
    public final void rule__PatternObjectCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4733:1: ( rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2 )
            // InternalMGLang.g:4734:2: rule__PatternObjectCreation__Group__1__Impl rule__PatternObjectCreation__Group__2
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
    // InternalMGLang.g:4741:1: rule__PatternObjectCreation__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternObjectCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4745:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:4746:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:4746:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:4747:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:4756:1: rule__PatternObjectCreation__Group__2 : rule__PatternObjectCreation__Group__2__Impl ;
    public final void rule__PatternObjectCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4760:1: ( rule__PatternObjectCreation__Group__2__Impl )
            // InternalMGLang.g:4761:2: rule__PatternObjectCreation__Group__2__Impl
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
    // InternalMGLang.g:4767:1: rule__PatternObjectCreation__Group__2__Impl : ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) ;
    public final void rule__PatternObjectCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4771:1: ( ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) ) )
            // InternalMGLang.g:4772:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            {
            // InternalMGLang.g:4772:1: ( ( rule__PatternObjectCreation__PatternCallAssignment_2 ) )
            // InternalMGLang.g:4773:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectCreationAccess().getPatternCallAssignment_2()); 
            }
            // InternalMGLang.g:4774:2: ( rule__PatternObjectCreation__PatternCallAssignment_2 )
            // InternalMGLang.g:4774:3: rule__PatternObjectCreation__PatternCallAssignment_2
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
    // InternalMGLang.g:4783:1: rule__PatternObject__Group__0 : rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 ;
    public final void rule__PatternObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4787:1: ( rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1 )
            // InternalMGLang.g:4788:2: rule__PatternObject__Group__0__Impl rule__PatternObject__Group__1
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
    // InternalMGLang.g:4795:1: rule__PatternObject__Group__0__Impl : ( ( rule__PatternObject__TypeAssignment_0 ) ) ;
    public final void rule__PatternObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4799:1: ( ( ( rule__PatternObject__TypeAssignment_0 ) ) )
            // InternalMGLang.g:4800:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:4800:1: ( ( rule__PatternObject__TypeAssignment_0 ) )
            // InternalMGLang.g:4801:2: ( rule__PatternObject__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getTypeAssignment_0()); 
            }
            // InternalMGLang.g:4802:2: ( rule__PatternObject__TypeAssignment_0 )
            // InternalMGLang.g:4802:3: rule__PatternObject__TypeAssignment_0
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
    // InternalMGLang.g:4810:1: rule__PatternObject__Group__1 : rule__PatternObject__Group__1__Impl ;
    public final void rule__PatternObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4814:1: ( rule__PatternObject__Group__1__Impl )
            // InternalMGLang.g:4815:2: rule__PatternObject__Group__1__Impl
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
    // InternalMGLang.g:4821:1: rule__PatternObject__Group__1__Impl : ( ( rule__PatternObject__NameAssignment_1 ) ) ;
    public final void rule__PatternObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4825:1: ( ( ( rule__PatternObject__NameAssignment_1 ) ) )
            // InternalMGLang.g:4826:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            {
            // InternalMGLang.g:4826:1: ( ( rule__PatternObject__NameAssignment_1 ) )
            // InternalMGLang.g:4827:2: ( rule__PatternObject__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:4828:2: ( rule__PatternObject__NameAssignment_1 )
            // InternalMGLang.g:4828:3: rule__PatternObject__NameAssignment_1
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
    // InternalMGLang.g:4837:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4841:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalMGLang.g:4842:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMGLang.g:4849:1: rule__ForStatement__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4853:1: ( ( 'for' ) )
            // InternalMGLang.g:4854:1: ( 'for' )
            {
            // InternalMGLang.g:4854:1: ( 'for' )
            // InternalMGLang.g:4855:2: 'for'
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
    // InternalMGLang.g:4864:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4868:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalMGLang.g:4869:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
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
    // InternalMGLang.g:4876:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__HeadAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4880:1: ( ( ( rule__ForStatement__HeadAssignment_1 ) ) )
            // InternalMGLang.g:4881:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            {
            // InternalMGLang.g:4881:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            // InternalMGLang.g:4882:2: ( rule__ForStatement__HeadAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getHeadAssignment_1()); 
            }
            // InternalMGLang.g:4883:2: ( rule__ForStatement__HeadAssignment_1 )
            // InternalMGLang.g:4883:3: rule__ForStatement__HeadAssignment_1
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
    // InternalMGLang.g:4891:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4895:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalMGLang.g:4896:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalMGLang.g:4903:1: rule__ForStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4907:1: ( ( '{' ) )
            // InternalMGLang.g:4908:1: ( '{' )
            {
            // InternalMGLang.g:4908:1: ( '{' )
            // InternalMGLang.g:4909:2: '{'
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
    // InternalMGLang.g:4918:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4922:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalMGLang.g:4923:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
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
    // InternalMGLang.g:4930:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__BodyAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4934:1: ( ( ( rule__ForStatement__BodyAssignment_3 ) ) )
            // InternalMGLang.g:4935:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:4935:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            // InternalMGLang.g:4936:2: ( rule__ForStatement__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getBodyAssignment_3()); 
            }
            // InternalMGLang.g:4937:2: ( rule__ForStatement__BodyAssignment_3 )
            // InternalMGLang.g:4937:3: rule__ForStatement__BodyAssignment_3
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
    // InternalMGLang.g:4945:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4949:1: ( rule__ForStatement__Group__4__Impl )
            // InternalMGLang.g:4950:2: rule__ForStatement__Group__4__Impl
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
    // InternalMGLang.g:4956:1: rule__ForStatement__Group__4__Impl : ( '}' ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4960:1: ( ( '}' ) )
            // InternalMGLang.g:4961:1: ( '}' )
            {
            // InternalMGLang.g:4961:1: ( '}' )
            // InternalMGLang.g:4962:2: '}'
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
    // InternalMGLang.g:4972:1: rule__GeneralForHead__Group__0 : rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 ;
    public final void rule__GeneralForHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4976:1: ( rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 )
            // InternalMGLang.g:4977:2: rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalMGLang.g:4984:1: rule__GeneralForHead__Group__0__Impl : ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) ;
    public final void rule__GeneralForHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4988:1: ( ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) )
            // InternalMGLang.g:4989:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            {
            // InternalMGLang.g:4989:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            // InternalMGLang.g:4990:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getIteratorVarAssignment_0()); 
            }
            // InternalMGLang.g:4991:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            // InternalMGLang.g:4991:3: rule__GeneralForHead__IteratorVarAssignment_0
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
    // InternalMGLang.g:4999:1: rule__GeneralForHead__Group__1 : rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 ;
    public final void rule__GeneralForHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5003:1: ( rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 )
            // InternalMGLang.g:5004:2: rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalMGLang.g:5011:1: rule__GeneralForHead__Group__1__Impl : ( 'in' ) ;
    public final void rule__GeneralForHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5015:1: ( ( 'in' ) )
            // InternalMGLang.g:5016:1: ( 'in' )
            {
            // InternalMGLang.g:5016:1: ( 'in' )
            // InternalMGLang.g:5017:2: 'in'
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
    // InternalMGLang.g:5026:1: rule__GeneralForHead__Group__2 : rule__GeneralForHead__Group__2__Impl ;
    public final void rule__GeneralForHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5030:1: ( rule__GeneralForHead__Group__2__Impl )
            // InternalMGLang.g:5031:2: rule__GeneralForHead__Group__2__Impl
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
    // InternalMGLang.g:5037:1: rule__GeneralForHead__Group__2__Impl : ( ( rule__GeneralForHead__RangeAssignment_2 ) ) ;
    public final void rule__GeneralForHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5041:1: ( ( ( rule__GeneralForHead__RangeAssignment_2 ) ) )
            // InternalMGLang.g:5042:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            {
            // InternalMGLang.g:5042:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            // InternalMGLang.g:5043:2: ( rule__GeneralForHead__RangeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralForHeadAccess().getRangeAssignment_2()); 
            }
            // InternalMGLang.g:5044:2: ( rule__GeneralForHead__RangeAssignment_2 )
            // InternalMGLang.g:5044:3: rule__GeneralForHead__RangeAssignment_2
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
    // InternalMGLang.g:5053:1: rule__ForEachHead__Group__0 : rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 ;
    public final void rule__ForEachHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5057:1: ( rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 )
            // InternalMGLang.g:5058:2: rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalMGLang.g:5065:1: rule__ForEachHead__Group__0__Impl : ( ( rule__ForEachHead__SrcAssignment_0 ) ) ;
    public final void rule__ForEachHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5069:1: ( ( ( rule__ForEachHead__SrcAssignment_0 ) ) )
            // InternalMGLang.g:5070:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            {
            // InternalMGLang.g:5070:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            // InternalMGLang.g:5071:2: ( rule__ForEachHead__SrcAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getSrcAssignment_0()); 
            }
            // InternalMGLang.g:5072:2: ( rule__ForEachHead__SrcAssignment_0 )
            // InternalMGLang.g:5072:3: rule__ForEachHead__SrcAssignment_0
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
    // InternalMGLang.g:5080:1: rule__ForEachHead__Group__1 : rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 ;
    public final void rule__ForEachHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5084:1: ( rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 )
            // InternalMGLang.g:5085:2: rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2
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
    // InternalMGLang.g:5092:1: rule__ForEachHead__Group__1__Impl : ( '-' ) ;
    public final void rule__ForEachHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5096:1: ( ( '-' ) )
            // InternalMGLang.g:5097:1: ( '-' )
            {
            // InternalMGLang.g:5097:1: ( '-' )
            // InternalMGLang.g:5098:2: '-'
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
    // InternalMGLang.g:5107:1: rule__ForEachHead__Group__2 : rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 ;
    public final void rule__ForEachHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5111:1: ( rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 )
            // InternalMGLang.g:5112:2: rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMGLang.g:5119:1: rule__ForEachHead__Group__2__Impl : ( ( rule__ForEachHead__RefAssignment_2 ) ) ;
    public final void rule__ForEachHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5123:1: ( ( ( rule__ForEachHead__RefAssignment_2 ) ) )
            // InternalMGLang.g:5124:1: ( ( rule__ForEachHead__RefAssignment_2 ) )
            {
            // InternalMGLang.g:5124:1: ( ( rule__ForEachHead__RefAssignment_2 ) )
            // InternalMGLang.g:5125:2: ( rule__ForEachHead__RefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getRefAssignment_2()); 
            }
            // InternalMGLang.g:5126:2: ( rule__ForEachHead__RefAssignment_2 )
            // InternalMGLang.g:5126:3: rule__ForEachHead__RefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__RefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getRefAssignment_2()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:5134:1: rule__ForEachHead__Group__3 : rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 ;
    public final void rule__ForEachHead__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5138:1: ( rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 )
            // InternalMGLang.g:5139:2: rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4
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
    // InternalMGLang.g:5146:1: rule__ForEachHead__Group__3__Impl : ( '->' ) ;
    public final void rule__ForEachHead__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5150:1: ( ( '->' ) )
            // InternalMGLang.g:5151:1: ( '->' )
            {
            // InternalMGLang.g:5151:1: ( '->' )
            // InternalMGLang.g:5152:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5161:1: rule__ForEachHead__Group__4 : rule__ForEachHead__Group__4__Impl ;
    public final void rule__ForEachHead__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5165:1: ( rule__ForEachHead__Group__4__Impl )
            // InternalMGLang.g:5166:2: rule__ForEachHead__Group__4__Impl
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
    // InternalMGLang.g:5172:1: rule__ForEachHead__Group__4__Impl : ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) ;
    public final void rule__ForEachHead__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5176:1: ( ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) )
            // InternalMGLang.g:5177:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            {
            // InternalMGLang.g:5177:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            // InternalMGLang.g:5178:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getIteratorVarAssignment_4()); 
            }
            // InternalMGLang.g:5179:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            // InternalMGLang.g:5179:3: rule__ForEachHead__IteratorVarAssignment_4
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
    // InternalMGLang.g:5188:1: rule__ForBody__Group__0 : rule__ForBody__Group__0__Impl rule__ForBody__Group__1 ;
    public final void rule__ForBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5192:1: ( rule__ForBody__Group__0__Impl rule__ForBody__Group__1 )
            // InternalMGLang.g:5193:2: rule__ForBody__Group__0__Impl rule__ForBody__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalMGLang.g:5200:1: rule__ForBody__Group__0__Impl : ( () ) ;
    public final void rule__ForBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5204:1: ( ( () ) )
            // InternalMGLang.g:5205:1: ( () )
            {
            // InternalMGLang.g:5205:1: ( () )
            // InternalMGLang.g:5206:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getForBodyAction_0()); 
            }
            // InternalMGLang.g:5207:2: ()
            // InternalMGLang.g:5207:3: 
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
    // InternalMGLang.g:5215:1: rule__ForBody__Group__1 : rule__ForBody__Group__1__Impl ;
    public final void rule__ForBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5219:1: ( rule__ForBody__Group__1__Impl )
            // InternalMGLang.g:5220:2: rule__ForBody__Group__1__Impl
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
    // InternalMGLang.g:5226:1: rule__ForBody__Group__1__Impl : ( ( rule__ForBody__CommandsAssignment_1 )* ) ;
    public final void rule__ForBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5230:1: ( ( ( rule__ForBody__CommandsAssignment_1 )* ) )
            // InternalMGLang.g:5231:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            {
            // InternalMGLang.g:5231:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            // InternalMGLang.g:5232:2: ( rule__ForBody__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForBodyAccess().getCommandsAssignment_1()); 
            }
            // InternalMGLang.g:5233:2: ( rule__ForBody__CommandsAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==51||LA37_0==53||LA37_0==55||(LA37_0>=59 && LA37_0<=60)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMGLang.g:5233:3: rule__ForBody__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ForBody__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalMGLang.g:5242:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5246:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalMGLang.g:5247:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalMGLang.g:5254:1: rule__IfStatement__Group__0__Impl : ( () ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5258:1: ( ( () ) )
            // InternalMGLang.g:5259:1: ( () )
            {
            // InternalMGLang.g:5259:1: ( () )
            // InternalMGLang.g:5260:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfStatementAction_0()); 
            }
            // InternalMGLang.g:5261:2: ()
            // InternalMGLang.g:5261:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalMGLang.g:5269:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5273:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalMGLang.g:5274:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalMGLang.g:5281:1: rule__IfStatement__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5285:1: ( ( 'if' ) )
            // InternalMGLang.g:5286:1: ( 'if' )
            {
            // InternalMGLang.g:5286:1: ( 'if' )
            // InternalMGLang.g:5287:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfKeyword_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalMGLang.g:5296:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5300:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalMGLang.g:5301:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalMGLang.g:5308:1: rule__IfStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5312:1: ( ( '(' ) )
            // InternalMGLang.g:5313:1: ( '(' )
            {
            // InternalMGLang.g:5313:1: ( '(' )
            // InternalMGLang.g:5314:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalMGLang.g:5323:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5327:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalMGLang.g:5328:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalMGLang.g:5335:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__CondAssignment_3 ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5339:1: ( ( ( rule__IfStatement__CondAssignment_3 ) ) )
            // InternalMGLang.g:5340:1: ( ( rule__IfStatement__CondAssignment_3 ) )
            {
            // InternalMGLang.g:5340:1: ( ( rule__IfStatement__CondAssignment_3 ) )
            // InternalMGLang.g:5341:2: ( rule__IfStatement__CondAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCondAssignment_3()); 
            }
            // InternalMGLang.g:5342:2: ( rule__IfStatement__CondAssignment_3 )
            // InternalMGLang.g:5342:3: rule__IfStatement__CondAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__CondAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCondAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalMGLang.g:5350:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5354:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalMGLang.g:5355:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalMGLang.g:5362:1: rule__IfStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5366:1: ( ( ')' ) )
            // InternalMGLang.g:5367:1: ( ')' )
            {
            // InternalMGLang.g:5367:1: ( ')' )
            // InternalMGLang.g:5368:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalMGLang.g:5377:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5381:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalMGLang.g:5382:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalMGLang.g:5389:1: rule__IfStatement__Group__5__Impl : ( '{' ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5393:1: ( ( '{' ) )
            // InternalMGLang.g:5394:1: ( '{' )
            {
            // InternalMGLang.g:5394:1: ( '{' )
            // InternalMGLang.g:5395:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalMGLang.g:5404:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5408:1: ( rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 )
            // InternalMGLang.g:5409:2: rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalMGLang.g:5416:1: rule__IfStatement__Group__6__Impl : ( ( rule__IfStatement__ThenAssignment_6 )* ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5420:1: ( ( ( rule__IfStatement__ThenAssignment_6 )* ) )
            // InternalMGLang.g:5421:1: ( ( rule__IfStatement__ThenAssignment_6 )* )
            {
            // InternalMGLang.g:5421:1: ( ( rule__IfStatement__ThenAssignment_6 )* )
            // InternalMGLang.g:5422:2: ( rule__IfStatement__ThenAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenAssignment_6()); 
            }
            // InternalMGLang.g:5423:2: ( rule__IfStatement__ThenAssignment_6 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==51||LA38_0==53||LA38_0==55||(LA38_0>=59 && LA38_0<=60)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMGLang.g:5423:3: rule__IfStatement__ThenAssignment_6
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__IfStatement__ThenAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group__7"
    // InternalMGLang.g:5431:1: rule__IfStatement__Group__7 : rule__IfStatement__Group__7__Impl rule__IfStatement__Group__8 ;
    public final void rule__IfStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5435:1: ( rule__IfStatement__Group__7__Impl rule__IfStatement__Group__8 )
            // InternalMGLang.g:5436:2: rule__IfStatement__Group__7__Impl rule__IfStatement__Group__8
            {
            pushFollow(FOLLOW_50);
            rule__IfStatement__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__7"


    // $ANTLR start "rule__IfStatement__Group__7__Impl"
    // InternalMGLang.g:5443:1: rule__IfStatement__Group__7__Impl : ( '}' ) ;
    public final void rule__IfStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5447:1: ( ( '}' ) )
            // InternalMGLang.g:5448:1: ( '}' )
            {
            // InternalMGLang.g:5448:1: ( '}' )
            // InternalMGLang.g:5449:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__7__Impl"


    // $ANTLR start "rule__IfStatement__Group__8"
    // InternalMGLang.g:5458:1: rule__IfStatement__Group__8 : rule__IfStatement__Group__8__Impl ;
    public final void rule__IfStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5462:1: ( rule__IfStatement__Group__8__Impl )
            // InternalMGLang.g:5463:2: rule__IfStatement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__8"


    // $ANTLR start "rule__IfStatement__Group__8__Impl"
    // InternalMGLang.g:5469:1: rule__IfStatement__Group__8__Impl : ( ( rule__IfStatement__Group_8__0 )? ) ;
    public final void rule__IfStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5473:1: ( ( ( rule__IfStatement__Group_8__0 )? ) )
            // InternalMGLang.g:5474:1: ( ( rule__IfStatement__Group_8__0 )? )
            {
            // InternalMGLang.g:5474:1: ( ( rule__IfStatement__Group_8__0 )? )
            // InternalMGLang.g:5475:2: ( rule__IfStatement__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_8()); 
            }
            // InternalMGLang.g:5476:2: ( rule__IfStatement__Group_8__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMGLang.g:5476:3: rule__IfStatement__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__8__Impl"


    // $ANTLR start "rule__IfStatement__Group_8__0"
    // InternalMGLang.g:5485:1: rule__IfStatement__Group_8__0 : rule__IfStatement__Group_8__0__Impl rule__IfStatement__Group_8__1 ;
    public final void rule__IfStatement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5489:1: ( rule__IfStatement__Group_8__0__Impl rule__IfStatement__Group_8__1 )
            // InternalMGLang.g:5490:2: rule__IfStatement__Group_8__0__Impl rule__IfStatement__Group_8__1
            {
            pushFollow(FOLLOW_51);
            rule__IfStatement__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_8__0"


    // $ANTLR start "rule__IfStatement__Group_8__0__Impl"
    // InternalMGLang.g:5497:1: rule__IfStatement__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5501:1: ( ( 'else' ) )
            // InternalMGLang.g:5502:1: ( 'else' )
            {
            // InternalMGLang.g:5502:1: ( 'else' )
            // InternalMGLang.g:5503:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseKeyword_8_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_8__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_8__1"
    // InternalMGLang.g:5512:1: rule__IfStatement__Group_8__1 : rule__IfStatement__Group_8__1__Impl ;
    public final void rule__IfStatement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5516:1: ( rule__IfStatement__Group_8__1__Impl )
            // InternalMGLang.g:5517:2: rule__IfStatement__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_8__1"


    // $ANTLR start "rule__IfStatement__Group_8__1__Impl"
    // InternalMGLang.g:5523:1: rule__IfStatement__Group_8__1__Impl : ( ( rule__IfStatement__ElseIfAssignment_8_1 ) ) ;
    public final void rule__IfStatement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5527:1: ( ( ( rule__IfStatement__ElseIfAssignment_8_1 ) ) )
            // InternalMGLang.g:5528:1: ( ( rule__IfStatement__ElseIfAssignment_8_1 ) )
            {
            // InternalMGLang.g:5528:1: ( ( rule__IfStatement__ElseIfAssignment_8_1 ) )
            // InternalMGLang.g:5529:2: ( rule__IfStatement__ElseIfAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseIfAssignment_8_1()); 
            }
            // InternalMGLang.g:5530:2: ( rule__IfStatement__ElseIfAssignment_8_1 )
            // InternalMGLang.g:5530:3: rule__IfStatement__ElseIfAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElseIfAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseIfAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_8__1__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__0"
    // InternalMGLang.g:5539:1: rule__ElseIfOrElse__Group_0__0 : rule__ElseIfOrElse__Group_0__0__Impl rule__ElseIfOrElse__Group_0__1 ;
    public final void rule__ElseIfOrElse__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5543:1: ( rule__ElseIfOrElse__Group_0__0__Impl rule__ElseIfOrElse__Group_0__1 )
            // InternalMGLang.g:5544:2: rule__ElseIfOrElse__Group_0__0__Impl rule__ElseIfOrElse__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__ElseIfOrElse__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__0"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__0__Impl"
    // InternalMGLang.g:5551:1: rule__ElseIfOrElse__Group_0__0__Impl : ( 'if' ) ;
    public final void rule__ElseIfOrElse__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5555:1: ( ( 'if' ) )
            // InternalMGLang.g:5556:1: ( 'if' )
            {
            // InternalMGLang.g:5556:1: ( 'if' )
            // InternalMGLang.g:5557:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getIfKeyword_0_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getIfKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__0__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__1"
    // InternalMGLang.g:5566:1: rule__ElseIfOrElse__Group_0__1 : rule__ElseIfOrElse__Group_0__1__Impl rule__ElseIfOrElse__Group_0__2 ;
    public final void rule__ElseIfOrElse__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5570:1: ( rule__ElseIfOrElse__Group_0__1__Impl rule__ElseIfOrElse__Group_0__2 )
            // InternalMGLang.g:5571:2: rule__ElseIfOrElse__Group_0__1__Impl rule__ElseIfOrElse__Group_0__2
            {
            pushFollow(FOLLOW_26);
            rule__ElseIfOrElse__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__1"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__1__Impl"
    // InternalMGLang.g:5578:1: rule__ElseIfOrElse__Group_0__1__Impl : ( '(' ) ;
    public final void rule__ElseIfOrElse__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5582:1: ( ( '(' ) )
            // InternalMGLang.g:5583:1: ( '(' )
            {
            // InternalMGLang.g:5583:1: ( '(' )
            // InternalMGLang.g:5584:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getLeftParenthesisKeyword_0_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getLeftParenthesisKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__1__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__2"
    // InternalMGLang.g:5593:1: rule__ElseIfOrElse__Group_0__2 : rule__ElseIfOrElse__Group_0__2__Impl rule__ElseIfOrElse__Group_0__3 ;
    public final void rule__ElseIfOrElse__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5597:1: ( rule__ElseIfOrElse__Group_0__2__Impl rule__ElseIfOrElse__Group_0__3 )
            // InternalMGLang.g:5598:2: rule__ElseIfOrElse__Group_0__2__Impl rule__ElseIfOrElse__Group_0__3
            {
            pushFollow(FOLLOW_38);
            rule__ElseIfOrElse__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__2"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__2__Impl"
    // InternalMGLang.g:5605:1: rule__ElseIfOrElse__Group_0__2__Impl : ( ( rule__ElseIfOrElse__CondAssignment_0_2 ) ) ;
    public final void rule__ElseIfOrElse__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5609:1: ( ( ( rule__ElseIfOrElse__CondAssignment_0_2 ) ) )
            // InternalMGLang.g:5610:1: ( ( rule__ElseIfOrElse__CondAssignment_0_2 ) )
            {
            // InternalMGLang.g:5610:1: ( ( rule__ElseIfOrElse__CondAssignment_0_2 ) )
            // InternalMGLang.g:5611:2: ( rule__ElseIfOrElse__CondAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getCondAssignment_0_2()); 
            }
            // InternalMGLang.g:5612:2: ( rule__ElseIfOrElse__CondAssignment_0_2 )
            // InternalMGLang.g:5612:3: rule__ElseIfOrElse__CondAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__CondAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getCondAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__2__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__3"
    // InternalMGLang.g:5620:1: rule__ElseIfOrElse__Group_0__3 : rule__ElseIfOrElse__Group_0__3__Impl rule__ElseIfOrElse__Group_0__4 ;
    public final void rule__ElseIfOrElse__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5624:1: ( rule__ElseIfOrElse__Group_0__3__Impl rule__ElseIfOrElse__Group_0__4 )
            // InternalMGLang.g:5625:2: rule__ElseIfOrElse__Group_0__3__Impl rule__ElseIfOrElse__Group_0__4
            {
            pushFollow(FOLLOW_10);
            rule__ElseIfOrElse__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__3"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__3__Impl"
    // InternalMGLang.g:5632:1: rule__ElseIfOrElse__Group_0__3__Impl : ( ')' ) ;
    public final void rule__ElseIfOrElse__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5636:1: ( ( ')' ) )
            // InternalMGLang.g:5637:1: ( ')' )
            {
            // InternalMGLang.g:5637:1: ( ')' )
            // InternalMGLang.g:5638:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getRightParenthesisKeyword_0_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getRightParenthesisKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__3__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__4"
    // InternalMGLang.g:5647:1: rule__ElseIfOrElse__Group_0__4 : rule__ElseIfOrElse__Group_0__4__Impl rule__ElseIfOrElse__Group_0__5 ;
    public final void rule__ElseIfOrElse__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5651:1: ( rule__ElseIfOrElse__Group_0__4__Impl rule__ElseIfOrElse__Group_0__5 )
            // InternalMGLang.g:5652:2: rule__ElseIfOrElse__Group_0__4__Impl rule__ElseIfOrElse__Group_0__5
            {
            pushFollow(FOLLOW_44);
            rule__ElseIfOrElse__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__4"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__4__Impl"
    // InternalMGLang.g:5659:1: rule__ElseIfOrElse__Group_0__4__Impl : ( '{' ) ;
    public final void rule__ElseIfOrElse__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5663:1: ( ( '{' ) )
            // InternalMGLang.g:5664:1: ( '{' )
            {
            // InternalMGLang.g:5664:1: ( '{' )
            // InternalMGLang.g:5665:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getLeftCurlyBracketKeyword_0_4()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getLeftCurlyBracketKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__4__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__5"
    // InternalMGLang.g:5674:1: rule__ElseIfOrElse__Group_0__5 : rule__ElseIfOrElse__Group_0__5__Impl rule__ElseIfOrElse__Group_0__6 ;
    public final void rule__ElseIfOrElse__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5678:1: ( rule__ElseIfOrElse__Group_0__5__Impl rule__ElseIfOrElse__Group_0__6 )
            // InternalMGLang.g:5679:2: rule__ElseIfOrElse__Group_0__5__Impl rule__ElseIfOrElse__Group_0__6
            {
            pushFollow(FOLLOW_44);
            rule__ElseIfOrElse__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__5"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__5__Impl"
    // InternalMGLang.g:5686:1: rule__ElseIfOrElse__Group_0__5__Impl : ( ( rule__ElseIfOrElse__ThenAssignment_0_5 )* ) ;
    public final void rule__ElseIfOrElse__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5690:1: ( ( ( rule__ElseIfOrElse__ThenAssignment_0_5 )* ) )
            // InternalMGLang.g:5691:1: ( ( rule__ElseIfOrElse__ThenAssignment_0_5 )* )
            {
            // InternalMGLang.g:5691:1: ( ( rule__ElseIfOrElse__ThenAssignment_0_5 )* )
            // InternalMGLang.g:5692:2: ( rule__ElseIfOrElse__ThenAssignment_0_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getThenAssignment_0_5()); 
            }
            // InternalMGLang.g:5693:2: ( rule__ElseIfOrElse__ThenAssignment_0_5 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==51||LA40_0==53||LA40_0==55||(LA40_0>=59 && LA40_0<=60)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMGLang.g:5693:3: rule__ElseIfOrElse__ThenAssignment_0_5
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ElseIfOrElse__ThenAssignment_0_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getThenAssignment_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__5__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__6"
    // InternalMGLang.g:5701:1: rule__ElseIfOrElse__Group_0__6 : rule__ElseIfOrElse__Group_0__6__Impl rule__ElseIfOrElse__Group_0__7 ;
    public final void rule__ElseIfOrElse__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5705:1: ( rule__ElseIfOrElse__Group_0__6__Impl rule__ElseIfOrElse__Group_0__7 )
            // InternalMGLang.g:5706:2: rule__ElseIfOrElse__Group_0__6__Impl rule__ElseIfOrElse__Group_0__7
            {
            pushFollow(FOLLOW_50);
            rule__ElseIfOrElse__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__6"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__6__Impl"
    // InternalMGLang.g:5713:1: rule__ElseIfOrElse__Group_0__6__Impl : ( '}' ) ;
    public final void rule__ElseIfOrElse__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5717:1: ( ( '}' ) )
            // InternalMGLang.g:5718:1: ( '}' )
            {
            // InternalMGLang.g:5718:1: ( '}' )
            // InternalMGLang.g:5719:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getRightCurlyBracketKeyword_0_6()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getRightCurlyBracketKeyword_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__6__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__7"
    // InternalMGLang.g:5728:1: rule__ElseIfOrElse__Group_0__7 : rule__ElseIfOrElse__Group_0__7__Impl ;
    public final void rule__ElseIfOrElse__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5732:1: ( rule__ElseIfOrElse__Group_0__7__Impl )
            // InternalMGLang.g:5733:2: rule__ElseIfOrElse__Group_0__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__7"


    // $ANTLR start "rule__ElseIfOrElse__Group_0__7__Impl"
    // InternalMGLang.g:5739:1: rule__ElseIfOrElse__Group_0__7__Impl : ( ( rule__ElseIfOrElse__Group_0_7__0 ) ) ;
    public final void rule__ElseIfOrElse__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5743:1: ( ( ( rule__ElseIfOrElse__Group_0_7__0 ) ) )
            // InternalMGLang.g:5744:1: ( ( rule__ElseIfOrElse__Group_0_7__0 ) )
            {
            // InternalMGLang.g:5744:1: ( ( rule__ElseIfOrElse__Group_0_7__0 ) )
            // InternalMGLang.g:5745:2: ( rule__ElseIfOrElse__Group_0_7__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getGroup_0_7()); 
            }
            // InternalMGLang.g:5746:2: ( rule__ElseIfOrElse__Group_0_7__0 )
            // InternalMGLang.g:5746:3: rule__ElseIfOrElse__Group_0_7__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0_7__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getGroup_0_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0__7__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0_7__0"
    // InternalMGLang.g:5755:1: rule__ElseIfOrElse__Group_0_7__0 : rule__ElseIfOrElse__Group_0_7__0__Impl rule__ElseIfOrElse__Group_0_7__1 ;
    public final void rule__ElseIfOrElse__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5759:1: ( rule__ElseIfOrElse__Group_0_7__0__Impl rule__ElseIfOrElse__Group_0_7__1 )
            // InternalMGLang.g:5760:2: rule__ElseIfOrElse__Group_0_7__0__Impl rule__ElseIfOrElse__Group_0_7__1
            {
            pushFollow(FOLLOW_51);
            rule__ElseIfOrElse__Group_0_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0_7__0"


    // $ANTLR start "rule__ElseIfOrElse__Group_0_7__0__Impl"
    // InternalMGLang.g:5767:1: rule__ElseIfOrElse__Group_0_7__0__Impl : ( 'else' ) ;
    public final void rule__ElseIfOrElse__Group_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5771:1: ( ( 'else' ) )
            // InternalMGLang.g:5772:1: ( 'else' )
            {
            // InternalMGLang.g:5772:1: ( 'else' )
            // InternalMGLang.g:5773:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getElseKeyword_0_7_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getElseKeyword_0_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0_7__0__Impl"


    // $ANTLR start "rule__ElseIfOrElse__Group_0_7__1"
    // InternalMGLang.g:5782:1: rule__ElseIfOrElse__Group_0_7__1 : rule__ElseIfOrElse__Group_0_7__1__Impl ;
    public final void rule__ElseIfOrElse__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5786:1: ( rule__ElseIfOrElse__Group_0_7__1__Impl )
            // InternalMGLang.g:5787:2: rule__ElseIfOrElse__Group_0_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__Group_0_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0_7__1"


    // $ANTLR start "rule__ElseIfOrElse__Group_0_7__1__Impl"
    // InternalMGLang.g:5793:1: rule__ElseIfOrElse__Group_0_7__1__Impl : ( ( rule__ElseIfOrElse__ElseIfAssignment_0_7_1 ) ) ;
    public final void rule__ElseIfOrElse__Group_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5797:1: ( ( ( rule__ElseIfOrElse__ElseIfAssignment_0_7_1 ) ) )
            // InternalMGLang.g:5798:1: ( ( rule__ElseIfOrElse__ElseIfAssignment_0_7_1 ) )
            {
            // InternalMGLang.g:5798:1: ( ( rule__ElseIfOrElse__ElseIfAssignment_0_7_1 ) )
            // InternalMGLang.g:5799:2: ( rule__ElseIfOrElse__ElseIfAssignment_0_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getElseIfAssignment_0_7_1()); 
            }
            // InternalMGLang.g:5800:2: ( rule__ElseIfOrElse__ElseIfAssignment_0_7_1 )
            // InternalMGLang.g:5800:3: rule__ElseIfOrElse__ElseIfAssignment_0_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfOrElse__ElseIfAssignment_0_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getElseIfAssignment_0_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__Group_0_7__1__Impl"


    // $ANTLR start "rule__ElseStatement__Group__0"
    // InternalMGLang.g:5809:1: rule__ElseStatement__Group__0 : rule__ElseStatement__Group__0__Impl rule__ElseStatement__Group__1 ;
    public final void rule__ElseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5813:1: ( rule__ElseStatement__Group__0__Impl rule__ElseStatement__Group__1 )
            // InternalMGLang.g:5814:2: rule__ElseStatement__Group__0__Impl rule__ElseStatement__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__ElseStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__0"


    // $ANTLR start "rule__ElseStatement__Group__0__Impl"
    // InternalMGLang.g:5821:1: rule__ElseStatement__Group__0__Impl : ( () ) ;
    public final void rule__ElseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5825:1: ( ( () ) )
            // InternalMGLang.g:5826:1: ( () )
            {
            // InternalMGLang.g:5826:1: ( () )
            // InternalMGLang.g:5827:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseStatementAccess().getElseStatementAction_0()); 
            }
            // InternalMGLang.g:5828:2: ()
            // InternalMGLang.g:5828:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseStatementAccess().getElseStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__0__Impl"


    // $ANTLR start "rule__ElseStatement__Group__1"
    // InternalMGLang.g:5836:1: rule__ElseStatement__Group__1 : rule__ElseStatement__Group__1__Impl rule__ElseStatement__Group__2 ;
    public final void rule__ElseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5840:1: ( rule__ElseStatement__Group__1__Impl rule__ElseStatement__Group__2 )
            // InternalMGLang.g:5841:2: rule__ElseStatement__Group__1__Impl rule__ElseStatement__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__ElseStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__1"


    // $ANTLR start "rule__ElseStatement__Group__1__Impl"
    // InternalMGLang.g:5848:1: rule__ElseStatement__Group__1__Impl : ( '{' ) ;
    public final void rule__ElseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5852:1: ( ( '{' ) )
            // InternalMGLang.g:5853:1: ( '{' )
            {
            // InternalMGLang.g:5853:1: ( '{' )
            // InternalMGLang.g:5854:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseStatementAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseStatementAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__1__Impl"


    // $ANTLR start "rule__ElseStatement__Group__2"
    // InternalMGLang.g:5863:1: rule__ElseStatement__Group__2 : rule__ElseStatement__Group__2__Impl rule__ElseStatement__Group__3 ;
    public final void rule__ElseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5867:1: ( rule__ElseStatement__Group__2__Impl rule__ElseStatement__Group__3 )
            // InternalMGLang.g:5868:2: rule__ElseStatement__Group__2__Impl rule__ElseStatement__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ElseStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__2"


    // $ANTLR start "rule__ElseStatement__Group__2__Impl"
    // InternalMGLang.g:5875:1: rule__ElseStatement__Group__2__Impl : ( ( rule__ElseStatement__ElseAssignment_2 )* ) ;
    public final void rule__ElseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5879:1: ( ( ( rule__ElseStatement__ElseAssignment_2 )* ) )
            // InternalMGLang.g:5880:1: ( ( rule__ElseStatement__ElseAssignment_2 )* )
            {
            // InternalMGLang.g:5880:1: ( ( rule__ElseStatement__ElseAssignment_2 )* )
            // InternalMGLang.g:5881:2: ( rule__ElseStatement__ElseAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseStatementAccess().getElseAssignment_2()); 
            }
            // InternalMGLang.g:5882:2: ( rule__ElseStatement__ElseAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==51||LA41_0==53||LA41_0==55||(LA41_0>=59 && LA41_0<=60)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMGLang.g:5882:3: rule__ElseStatement__ElseAssignment_2
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ElseStatement__ElseAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseStatementAccess().getElseAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__2__Impl"


    // $ANTLR start "rule__ElseStatement__Group__3"
    // InternalMGLang.g:5890:1: rule__ElseStatement__Group__3 : rule__ElseStatement__Group__3__Impl ;
    public final void rule__ElseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5894:1: ( rule__ElseStatement__Group__3__Impl )
            // InternalMGLang.g:5895:2: rule__ElseStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__3"


    // $ANTLR start "rule__ElseStatement__Group__3__Impl"
    // InternalMGLang.g:5901:1: rule__ElseStatement__Group__3__Impl : ( '}' ) ;
    public final void rule__ElseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5905:1: ( ( '}' ) )
            // InternalMGLang.g:5906:1: ( '}' )
            {
            // InternalMGLang.g:5906:1: ( '}' )
            // InternalMGLang.g:5907:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseStatementAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseStatementAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__3__Impl"


    // $ANTLR start "rule__SwitchCase__Group__0"
    // InternalMGLang.g:5917:1: rule__SwitchCase__Group__0 : rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 ;
    public final void rule__SwitchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5921:1: ( rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 )
            // InternalMGLang.g:5922:2: rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1
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
    // InternalMGLang.g:5929:1: rule__SwitchCase__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5933:1: ( ( 'switch' ) )
            // InternalMGLang.g:5934:1: ( 'switch' )
            {
            // InternalMGLang.g:5934:1: ( 'switch' )
            // InternalMGLang.g:5935:2: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:5944:1: rule__SwitchCase__Group__1 : rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 ;
    public final void rule__SwitchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5948:1: ( rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 )
            // InternalMGLang.g:5949:2: rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:5956:1: rule__SwitchCase__Group__1__Impl : ( '(' ) ;
    public final void rule__SwitchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5960:1: ( ( '(' ) )
            // InternalMGLang.g:5961:1: ( '(' )
            {
            // InternalMGLang.g:5961:1: ( '(' )
            // InternalMGLang.g:5962:2: '('
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
    // InternalMGLang.g:5971:1: rule__SwitchCase__Group__2 : rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 ;
    public final void rule__SwitchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5975:1: ( rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 )
            // InternalMGLang.g:5976:2: rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalMGLang.g:5983:1: rule__SwitchCase__Group__2__Impl : ( ( rule__SwitchCase__AttributeAssignment_2 ) ) ;
    public final void rule__SwitchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5987:1: ( ( ( rule__SwitchCase__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:5988:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:5988:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            // InternalMGLang.g:5989:2: ( rule__SwitchCase__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getAttributeAssignment_2()); 
            }
            // InternalMGLang.g:5990:2: ( rule__SwitchCase__AttributeAssignment_2 )
            // InternalMGLang.g:5990:3: rule__SwitchCase__AttributeAssignment_2
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
    // InternalMGLang.g:5998:1: rule__SwitchCase__Group__3 : rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 ;
    public final void rule__SwitchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6002:1: ( rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 )
            // InternalMGLang.g:6003:2: rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4
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
    // InternalMGLang.g:6010:1: rule__SwitchCase__Group__3__Impl : ( ')' ) ;
    public final void rule__SwitchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6014:1: ( ( ')' ) )
            // InternalMGLang.g:6015:1: ( ')' )
            {
            // InternalMGLang.g:6015:1: ( ')' )
            // InternalMGLang.g:6016:2: ')'
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
    // InternalMGLang.g:6025:1: rule__SwitchCase__Group__4 : rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 ;
    public final void rule__SwitchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6029:1: ( rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 )
            // InternalMGLang.g:6030:2: rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5
            {
            pushFollow(FOLLOW_52);
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
    // InternalMGLang.g:6037:1: rule__SwitchCase__Group__4__Impl : ( '{' ) ;
    public final void rule__SwitchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6041:1: ( ( '{' ) )
            // InternalMGLang.g:6042:1: ( '{' )
            {
            // InternalMGLang.g:6042:1: ( '{' )
            // InternalMGLang.g:6043:2: '{'
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
    // InternalMGLang.g:6052:1: rule__SwitchCase__Group__5 : rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 ;
    public final void rule__SwitchCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6056:1: ( rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 )
            // InternalMGLang.g:6057:2: rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6
            {
            pushFollow(FOLLOW_53);
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
    // InternalMGLang.g:6064:1: rule__SwitchCase__Group__5__Impl : ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) ;
    public final void rule__SwitchCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6068:1: ( ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) )
            // InternalMGLang.g:6069:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            {
            // InternalMGLang.g:6069:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            // InternalMGLang.g:6070:2: ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* )
            {
            // InternalMGLang.g:6070:2: ( ( rule__SwitchCase__CasesAssignment_5 ) )
            // InternalMGLang.g:6071:3: ( rule__SwitchCase__CasesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }
            // InternalMGLang.g:6072:3: ( rule__SwitchCase__CasesAssignment_5 )
            // InternalMGLang.g:6072:4: rule__SwitchCase__CasesAssignment_5
            {
            pushFollow(FOLLOW_54);
            rule__SwitchCase__CasesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }

            }

            // InternalMGLang.g:6075:2: ( ( rule__SwitchCase__CasesAssignment_5 )* )
            // InternalMGLang.g:6076:3: ( rule__SwitchCase__CasesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            }
            // InternalMGLang.g:6077:3: ( rule__SwitchCase__CasesAssignment_5 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==58) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMGLang.g:6077:4: rule__SwitchCase__CasesAssignment_5
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__SwitchCase__CasesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalMGLang.g:6086:1: rule__SwitchCase__Group__6 : rule__SwitchCase__Group__6__Impl ;
    public final void rule__SwitchCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6090:1: ( rule__SwitchCase__Group__6__Impl )
            // InternalMGLang.g:6091:2: rule__SwitchCase__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMGLang.g:6097:1: rule__SwitchCase__Group__6__Impl : ( ( rule__SwitchCase__DefaultAssignment_6 ) ) ;
    public final void rule__SwitchCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6101:1: ( ( ( rule__SwitchCase__DefaultAssignment_6 ) ) )
            // InternalMGLang.g:6102:1: ( ( rule__SwitchCase__DefaultAssignment_6 ) )
            {
            // InternalMGLang.g:6102:1: ( ( rule__SwitchCase__DefaultAssignment_6 ) )
            // InternalMGLang.g:6103:2: ( rule__SwitchCase__DefaultAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getDefaultAssignment_6()); 
            }
            // InternalMGLang.g:6104:2: ( rule__SwitchCase__DefaultAssignment_6 )
            // InternalMGLang.g:6104:3: rule__SwitchCase__DefaultAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCase__DefaultAssignment_6();

            state._fsp--;
            if (state.failed) return ;

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


    // $ANTLR start "rule__Default__Group__0"
    // InternalMGLang.g:6113:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6117:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalMGLang.g:6118:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalMGLang.g:6125:1: rule__Default__Group__0__Impl : ( 'default' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6129:1: ( ( 'default' ) )
            // InternalMGLang.g:6130:1: ( 'default' )
            {
            // InternalMGLang.g:6130:1: ( 'default' )
            // InternalMGLang.g:6131:2: 'default'
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
    // InternalMGLang.g:6140:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6144:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalMGLang.g:6145:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMGLang.g:6152:1: rule__Default__Group__1__Impl : ( ':' ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6156:1: ( ( ':' ) )
            // InternalMGLang.g:6157:1: ( ':' )
            {
            // InternalMGLang.g:6157:1: ( ':' )
            // InternalMGLang.g:6158:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getColonKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6167:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6171:1: ( rule__Default__Group__2__Impl )
            // InternalMGLang.g:6172:2: rule__Default__Group__2__Impl
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
    // InternalMGLang.g:6178:1: rule__Default__Group__2__Impl : ( ruleGeneratorExpression ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6182:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:6183:1: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:6183:1: ( ruleGeneratorExpression )
            // InternalMGLang.g:6184:2: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getGeneratorExpressionParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getGeneratorExpressionParserRuleCall_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Case__Group__0"
    // InternalMGLang.g:6194:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6198:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalMGLang.g:6199:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:6206:1: rule__Case__Group__0__Impl : ( 'case' ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6210:1: ( ( 'case' ) )
            // InternalMGLang.g:6211:1: ( 'case' )
            {
            // InternalMGLang.g:6211:1: ( 'case' )
            // InternalMGLang.g:6212:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getCaseKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6221:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6225:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalMGLang.g:6226:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalMGLang.g:6233:1: rule__Case__Group__1__Impl : ( ( rule__Case__ValAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6237:1: ( ( ( rule__Case__ValAssignment_1 ) ) )
            // InternalMGLang.g:6238:1: ( ( rule__Case__ValAssignment_1 ) )
            {
            // InternalMGLang.g:6238:1: ( ( rule__Case__ValAssignment_1 ) )
            // InternalMGLang.g:6239:2: ( rule__Case__ValAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getValAssignment_1()); 
            }
            // InternalMGLang.g:6240:2: ( rule__Case__ValAssignment_1 )
            // InternalMGLang.g:6240:3: rule__Case__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Case__ValAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getValAssignment_1()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:6248:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6252:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // InternalMGLang.g:6253:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_56);
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
    // InternalMGLang.g:6260:1: rule__Case__Group__2__Impl : ( ':' ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6264:1: ( ( ':' ) )
            // InternalMGLang.g:6265:1: ( ':' )
            {
            // InternalMGLang.g:6265:1: ( ':' )
            // InternalMGLang.g:6266:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getColonKeyword_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getColonKeyword_2()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:6275:1: rule__Case__Group__3 : rule__Case__Group__3__Impl ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6279:1: ( rule__Case__Group__3__Impl )
            // InternalMGLang.g:6280:2: rule__Case__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMGLang.g:6286:1: rule__Case__Group__3__Impl : ( ( rule__Case__BodyAssignment_3 ) ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6290:1: ( ( ( rule__Case__BodyAssignment_3 ) ) )
            // InternalMGLang.g:6291:1: ( ( rule__Case__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:6291:1: ( ( rule__Case__BodyAssignment_3 ) )
            // InternalMGLang.g:6292:2: ( rule__Case__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getBodyAssignment_3()); 
            }
            // InternalMGLang.g:6293:2: ( rule__Case__BodyAssignment_3 )
            // InternalMGLang.g:6293:3: rule__Case__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Case__BodyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getBodyAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__CaseBody__Group_0__0"
    // InternalMGLang.g:6302:1: rule__CaseBody__Group_0__0 : rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 ;
    public final void rule__CaseBody__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6306:1: ( rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 )
            // InternalMGLang.g:6307:2: rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1
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
    // InternalMGLang.g:6314:1: rule__CaseBody__Group_0__0__Impl : ( () ) ;
    public final void rule__CaseBody__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6318:1: ( ( () ) )
            // InternalMGLang.g:6319:1: ( () )
            {
            // InternalMGLang.g:6319:1: ( () )
            // InternalMGLang.g:6320:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0()); 
            }
            // InternalMGLang.g:6321:2: ()
            // InternalMGLang.g:6321:3: 
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
    // InternalMGLang.g:6329:1: rule__CaseBody__Group_0__1 : rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 ;
    public final void rule__CaseBody__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6333:1: ( rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 )
            // InternalMGLang.g:6334:2: rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2
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
    // InternalMGLang.g:6341:1: rule__CaseBody__Group_0__1__Impl : ( '{' ) ;
    public final void rule__CaseBody__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6345:1: ( ( '{' ) )
            // InternalMGLang.g:6346:1: ( '{' )
            {
            // InternalMGLang.g:6346:1: ( '{' )
            // InternalMGLang.g:6347:2: '{'
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
    // InternalMGLang.g:6356:1: rule__CaseBody__Group_0__2 : rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 ;
    public final void rule__CaseBody__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6360:1: ( rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 )
            // InternalMGLang.g:6361:2: rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3
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
    // InternalMGLang.g:6368:1: rule__CaseBody__Group_0__2__Impl : ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) ;
    public final void rule__CaseBody__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6372:1: ( ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) )
            // InternalMGLang.g:6373:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            {
            // InternalMGLang.g:6373:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            // InternalMGLang.g:6374:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_0_2()); 
            }
            // InternalMGLang.g:6375:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==51||LA43_0==53||LA43_0==55||(LA43_0>=59 && LA43_0<=60)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMGLang.g:6375:3: rule__CaseBody__ExpressionsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__CaseBody__ExpressionsAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalMGLang.g:6383:1: rule__CaseBody__Group_0__3 : rule__CaseBody__Group_0__3__Impl ;
    public final void rule__CaseBody__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6387:1: ( rule__CaseBody__Group_0__3__Impl )
            // InternalMGLang.g:6388:2: rule__CaseBody__Group_0__3__Impl
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
    // InternalMGLang.g:6394:1: rule__CaseBody__Group_0__3__Impl : ( '}' ) ;
    public final void rule__CaseBody__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6398:1: ( ( '}' ) )
            // InternalMGLang.g:6399:1: ( '}' )
            {
            // InternalMGLang.g:6399:1: ( '}' )
            // InternalMGLang.g:6400:2: '}'
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


    // $ANTLR start "rule__List__Group__0"
    // InternalMGLang.g:6410:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6414:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalMGLang.g:6415:2: rule__List__Group__0__Impl rule__List__Group__1
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
    // InternalMGLang.g:6422:1: rule__List__Group__0__Impl : ( 'List' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6426:1: ( ( 'List' ) )
            // InternalMGLang.g:6427:1: ( 'List' )
            {
            // InternalMGLang.g:6427:1: ( 'List' )
            // InternalMGLang.g:6428:2: 'List'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6437:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6441:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalMGLang.g:6442:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMGLang.g:6449:1: rule__List__Group__1__Impl : ( ( rule__List__NameAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6453:1: ( ( ( rule__List__NameAssignment_1 ) ) )
            // InternalMGLang.g:6454:1: ( ( rule__List__NameAssignment_1 ) )
            {
            // InternalMGLang.g:6454:1: ( ( rule__List__NameAssignment_1 ) )
            // InternalMGLang.g:6455:2: ( rule__List__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:6456:2: ( rule__List__NameAssignment_1 )
            // InternalMGLang.g:6456:3: rule__List__NameAssignment_1
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
    // InternalMGLang.g:6464:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6468:1: ( rule__List__Group__2__Impl )
            // InternalMGLang.g:6469:2: rule__List__Group__2__Impl
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
    // InternalMGLang.g:6475:1: rule__List__Group__2__Impl : ( ( rule__List__Group_2__0 ) ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6479:1: ( ( ( rule__List__Group_2__0 ) ) )
            // InternalMGLang.g:6480:1: ( ( rule__List__Group_2__0 ) )
            {
            // InternalMGLang.g:6480:1: ( ( rule__List__Group_2__0 ) )
            // InternalMGLang.g:6481:2: ( rule__List__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup_2()); 
            }
            // InternalMGLang.g:6482:2: ( rule__List__Group_2__0 )
            // InternalMGLang.g:6482:3: rule__List__Group_2__0
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
    // InternalMGLang.g:6491:1: rule__List__Group_2__0 : rule__List__Group_2__0__Impl rule__List__Group_2__1 ;
    public final void rule__List__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6495:1: ( rule__List__Group_2__0__Impl rule__List__Group_2__1 )
            // InternalMGLang.g:6496:2: rule__List__Group_2__0__Impl rule__List__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMGLang.g:6503:1: rule__List__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__List__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6507:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:6508:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:6508:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:6509:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:6518:1: rule__List__Group_2__1 : rule__List__Group_2__1__Impl ;
    public final void rule__List__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6522:1: ( rule__List__Group_2__1__Impl )
            // InternalMGLang.g:6523:2: rule__List__Group_2__1__Impl
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
    // InternalMGLang.g:6529:1: rule__List__Group_2__1__Impl : ( ruleListAdHoc ) ;
    public final void rule__List__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6533:1: ( ( ruleListAdHoc ) )
            // InternalMGLang.g:6534:1: ( ruleListAdHoc )
            {
            // InternalMGLang.g:6534:1: ( ruleListAdHoc )
            // InternalMGLang.g:6535:2: ruleListAdHoc
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListAdHocParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleListAdHoc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getListAdHocParserRuleCall_2_1()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:6545:1: rule__ListAdHoc__Group__0 : rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 ;
    public final void rule__ListAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6549:1: ( rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 )
            // InternalMGLang.g:6550:2: rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:6557:1: rule__ListAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__ListAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6561:1: ( ( '[' ) )
            // InternalMGLang.g:6562:1: ( '[' )
            {
            // InternalMGLang.g:6562:1: ( '[' )
            // InternalMGLang.g:6563:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6572:1: rule__ListAdHoc__Group__1 : rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 ;
    public final void rule__ListAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6576:1: ( rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 )
            // InternalMGLang.g:6577:2: rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2
            {
            pushFollow(FOLLOW_57);
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
    // InternalMGLang.g:6584:1: rule__ListAdHoc__Group__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) ;
    public final void rule__ListAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6588:1: ( ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) )
            // InternalMGLang.g:6589:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            {
            // InternalMGLang.g:6589:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            // InternalMGLang.g:6590:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getElementsAssignment_1()); 
            }
            // InternalMGLang.g:6591:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            // InternalMGLang.g:6591:3: rule__ListAdHoc__ElementsAssignment_1
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
    // InternalMGLang.g:6599:1: rule__ListAdHoc__Group__2 : rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 ;
    public final void rule__ListAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6603:1: ( rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 )
            // InternalMGLang.g:6604:2: rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3
            {
            pushFollow(FOLLOW_57);
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
    // InternalMGLang.g:6611:1: rule__ListAdHoc__Group__2__Impl : ( ( rule__ListAdHoc__Group_2__0 )* ) ;
    public final void rule__ListAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6615:1: ( ( ( rule__ListAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:6616:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:6616:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            // InternalMGLang.g:6617:2: ( rule__ListAdHoc__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getGroup_2()); 
            }
            // InternalMGLang.g:6618:2: ( rule__ListAdHoc__Group_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==42) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMGLang.g:6618:3: rule__ListAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ListAdHoc__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalMGLang.g:6626:1: rule__ListAdHoc__Group__3 : rule__ListAdHoc__Group__3__Impl ;
    public final void rule__ListAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6630:1: ( rule__ListAdHoc__Group__3__Impl )
            // InternalMGLang.g:6631:2: rule__ListAdHoc__Group__3__Impl
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
    // InternalMGLang.g:6637:1: rule__ListAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__ListAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6641:1: ( ( ']' ) )
            // InternalMGLang.g:6642:1: ( ']' )
            {
            // InternalMGLang.g:6642:1: ( ']' )
            // InternalMGLang.g:6643:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6653:1: rule__ListAdHoc__Group_2__0 : rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 ;
    public final void rule__ListAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6657:1: ( rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 )
            // InternalMGLang.g:6658:2: rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:6665:1: rule__ListAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6669:1: ( ( ',' ) )
            // InternalMGLang.g:6670:1: ( ',' )
            {
            // InternalMGLang.g:6670:1: ( ',' )
            // InternalMGLang.g:6671:2: ','
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
    // InternalMGLang.g:6680:1: rule__ListAdHoc__Group_2__1 : rule__ListAdHoc__Group_2__1__Impl ;
    public final void rule__ListAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6684:1: ( rule__ListAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:6685:2: rule__ListAdHoc__Group_2__1__Impl
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
    // InternalMGLang.g:6691:1: rule__ListAdHoc__Group_2__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) ;
    public final void rule__ListAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6695:1: ( ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) )
            // InternalMGLang.g:6696:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            {
            // InternalMGLang.g:6696:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            // InternalMGLang.g:6697:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAdHocAccess().getElementsAssignment_2_1()); 
            }
            // InternalMGLang.g:6698:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            // InternalMGLang.g:6698:3: rule__ListAdHoc__ElementsAssignment_2_1
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
    // InternalMGLang.g:6707:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6711:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalMGLang.g:6712:2: rule__Map__Group__0__Impl rule__Map__Group__1
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
    // InternalMGLang.g:6719:1: rule__Map__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6723:1: ( ( 'Map' ) )
            // InternalMGLang.g:6724:1: ( 'Map' )
            {
            // InternalMGLang.g:6724:1: ( 'Map' )
            // InternalMGLang.g:6725:2: 'Map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getMapKeyword_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6734:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6738:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // InternalMGLang.g:6739:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMGLang.g:6746:1: rule__Map__Group__1__Impl : ( ( rule__Map__NameAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6750:1: ( ( ( rule__Map__NameAssignment_1 ) ) )
            // InternalMGLang.g:6751:1: ( ( rule__Map__NameAssignment_1 ) )
            {
            // InternalMGLang.g:6751:1: ( ( rule__Map__NameAssignment_1 ) )
            // InternalMGLang.g:6752:2: ( rule__Map__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getNameAssignment_1()); 
            }
            // InternalMGLang.g:6753:2: ( rule__Map__NameAssignment_1 )
            // InternalMGLang.g:6753:3: rule__Map__NameAssignment_1
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
    // InternalMGLang.g:6761:1: rule__Map__Group__2 : rule__Map__Group__2__Impl ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6765:1: ( rule__Map__Group__2__Impl )
            // InternalMGLang.g:6766:2: rule__Map__Group__2__Impl
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
    // InternalMGLang.g:6772:1: rule__Map__Group__2__Impl : ( ( rule__Map__Group_2__0 ) ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6776:1: ( ( ( rule__Map__Group_2__0 ) ) )
            // InternalMGLang.g:6777:1: ( ( rule__Map__Group_2__0 ) )
            {
            // InternalMGLang.g:6777:1: ( ( rule__Map__Group_2__0 ) )
            // InternalMGLang.g:6778:2: ( rule__Map__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getGroup_2()); 
            }
            // InternalMGLang.g:6779:2: ( rule__Map__Group_2__0 )
            // InternalMGLang.g:6779:3: rule__Map__Group_2__0
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
    // InternalMGLang.g:6788:1: rule__Map__Group_2__0 : rule__Map__Group_2__0__Impl rule__Map__Group_2__1 ;
    public final void rule__Map__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6792:1: ( rule__Map__Group_2__0__Impl rule__Map__Group_2__1 )
            // InternalMGLang.g:6793:2: rule__Map__Group_2__0__Impl rule__Map__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMGLang.g:6800:1: rule__Map__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Map__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6804:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:6805:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:6805:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:6806:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:6815:1: rule__Map__Group_2__1 : rule__Map__Group_2__1__Impl ;
    public final void rule__Map__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6819:1: ( rule__Map__Group_2__1__Impl )
            // InternalMGLang.g:6820:2: rule__Map__Group_2__1__Impl
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
    // InternalMGLang.g:6826:1: rule__Map__Group_2__1__Impl : ( ruleMapAdHoc ) ;
    public final void rule__Map__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6830:1: ( ( ruleMapAdHoc ) )
            // InternalMGLang.g:6831:1: ( ruleMapAdHoc )
            {
            // InternalMGLang.g:6831:1: ( ruleMapAdHoc )
            // InternalMGLang.g:6832:2: ruleMapAdHoc
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAccess().getMapAdHocParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleMapAdHoc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapAccess().getMapAdHocParserRuleCall_2_1()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:6842:1: rule__MapAdHoc__Group__0 : rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 ;
    public final void rule__MapAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6846:1: ( rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 )
            // InternalMGLang.g:6847:2: rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1
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
    // InternalMGLang.g:6854:1: rule__MapAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__MapAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6858:1: ( ( '[' ) )
            // InternalMGLang.g:6859:1: ( '[' )
            {
            // InternalMGLang.g:6859:1: ( '[' )
            // InternalMGLang.g:6860:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6869:1: rule__MapAdHoc__Group__1 : rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 ;
    public final void rule__MapAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6873:1: ( rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 )
            // InternalMGLang.g:6874:2: rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2
            {
            pushFollow(FOLLOW_57);
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
    // InternalMGLang.g:6881:1: rule__MapAdHoc__Group__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) ;
    public final void rule__MapAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6885:1: ( ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) )
            // InternalMGLang.g:6886:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            {
            // InternalMGLang.g:6886:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            // InternalMGLang.g:6887:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_1()); 
            }
            // InternalMGLang.g:6888:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            // InternalMGLang.g:6888:3: rule__MapAdHoc__EntriesAssignment_1
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
    // InternalMGLang.g:6896:1: rule__MapAdHoc__Group__2 : rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 ;
    public final void rule__MapAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6900:1: ( rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 )
            // InternalMGLang.g:6901:2: rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3
            {
            pushFollow(FOLLOW_57);
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
    // InternalMGLang.g:6908:1: rule__MapAdHoc__Group__2__Impl : ( ( rule__MapAdHoc__Group_2__0 )* ) ;
    public final void rule__MapAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6912:1: ( ( ( rule__MapAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:6913:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:6913:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            // InternalMGLang.g:6914:2: ( rule__MapAdHoc__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getGroup_2()); 
            }
            // InternalMGLang.g:6915:2: ( rule__MapAdHoc__Group_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==42) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMGLang.g:6915:3: rule__MapAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__MapAdHoc__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalMGLang.g:6923:1: rule__MapAdHoc__Group__3 : rule__MapAdHoc__Group__3__Impl ;
    public final void rule__MapAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6927:1: ( rule__MapAdHoc__Group__3__Impl )
            // InternalMGLang.g:6928:2: rule__MapAdHoc__Group__3__Impl
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
    // InternalMGLang.g:6934:1: rule__MapAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__MapAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6938:1: ( ( ']' ) )
            // InternalMGLang.g:6939:1: ( ']' )
            {
            // InternalMGLang.g:6939:1: ( ']' )
            // InternalMGLang.g:6940:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:6950:1: rule__MapAdHoc__Group_2__0 : rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 ;
    public final void rule__MapAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6954:1: ( rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 )
            // InternalMGLang.g:6955:2: rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1
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
    // InternalMGLang.g:6962:1: rule__MapAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MapAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6966:1: ( ( ',' ) )
            // InternalMGLang.g:6967:1: ( ',' )
            {
            // InternalMGLang.g:6967:1: ( ',' )
            // InternalMGLang.g:6968:2: ','
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
    // InternalMGLang.g:6977:1: rule__MapAdHoc__Group_2__1 : rule__MapAdHoc__Group_2__1__Impl ;
    public final void rule__MapAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6981:1: ( rule__MapAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:6982:2: rule__MapAdHoc__Group_2__1__Impl
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
    // InternalMGLang.g:6988:1: rule__MapAdHoc__Group_2__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) ;
    public final void rule__MapAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6992:1: ( ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) )
            // InternalMGLang.g:6993:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            {
            // InternalMGLang.g:6993:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            // InternalMGLang.g:6994:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_2_1()); 
            }
            // InternalMGLang.g:6995:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            // InternalMGLang.g:6995:3: rule__MapAdHoc__EntriesAssignment_2_1
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
    // InternalMGLang.g:7004:1: rule__MapTupel__Group__0 : rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 ;
    public final void rule__MapTupel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7008:1: ( rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 )
            // InternalMGLang.g:7009:2: rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMGLang.g:7016:1: rule__MapTupel__Group__0__Impl : ( '(' ) ;
    public final void rule__MapTupel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7020:1: ( ( '(' ) )
            // InternalMGLang.g:7021:1: ( '(' )
            {
            // InternalMGLang.g:7021:1: ( '(' )
            // InternalMGLang.g:7022:2: '('
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
    // InternalMGLang.g:7031:1: rule__MapTupel__Group__1 : rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 ;
    public final void rule__MapTupel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7035:1: ( rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 )
            // InternalMGLang.g:7036:2: rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2
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
    // InternalMGLang.g:7043:1: rule__MapTupel__Group__1__Impl : ( ( rule__MapTupel__KeyAssignment_1 ) ) ;
    public final void rule__MapTupel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7047:1: ( ( ( rule__MapTupel__KeyAssignment_1 ) ) )
            // InternalMGLang.g:7048:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            {
            // InternalMGLang.g:7048:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            // InternalMGLang.g:7049:2: ( rule__MapTupel__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getKeyAssignment_1()); 
            }
            // InternalMGLang.g:7050:2: ( rule__MapTupel__KeyAssignment_1 )
            // InternalMGLang.g:7050:3: rule__MapTupel__KeyAssignment_1
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
    // InternalMGLang.g:7058:1: rule__MapTupel__Group__2 : rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 ;
    public final void rule__MapTupel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7062:1: ( rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 )
            // InternalMGLang.g:7063:2: rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:7070:1: rule__MapTupel__Group__2__Impl : ( ',' ) ;
    public final void rule__MapTupel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7074:1: ( ( ',' ) )
            // InternalMGLang.g:7075:1: ( ',' )
            {
            // InternalMGLang.g:7075:1: ( ',' )
            // InternalMGLang.g:7076:2: ','
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
    // InternalMGLang.g:7085:1: rule__MapTupel__Group__3 : rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 ;
    public final void rule__MapTupel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7089:1: ( rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 )
            // InternalMGLang.g:7090:2: rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMGLang.g:7097:1: rule__MapTupel__Group__3__Impl : ( ( rule__MapTupel__ValueAssignment_3 ) ) ;
    public final void rule__MapTupel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7101:1: ( ( ( rule__MapTupel__ValueAssignment_3 ) ) )
            // InternalMGLang.g:7102:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            {
            // InternalMGLang.g:7102:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            // InternalMGLang.g:7103:2: ( rule__MapTupel__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTupelAccess().getValueAssignment_3()); 
            }
            // InternalMGLang.g:7104:2: ( rule__MapTupel__ValueAssignment_3 )
            // InternalMGLang.g:7104:3: rule__MapTupel__ValueAssignment_3
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
    // InternalMGLang.g:7112:1: rule__MapTupel__Group__4 : rule__MapTupel__Group__4__Impl ;
    public final void rule__MapTupel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7116:1: ( rule__MapTupel__Group__4__Impl )
            // InternalMGLang.g:7117:2: rule__MapTupel__Group__4__Impl
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
    // InternalMGLang.g:7123:1: rule__MapTupel__Group__4__Impl : ( ')' ) ;
    public final void rule__MapTupel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7127:1: ( ( ')' ) )
            // InternalMGLang.g:7128:1: ( ')' )
            {
            // InternalMGLang.g:7128:1: ( ')' )
            // InternalMGLang.g:7129:2: ')'
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
    // InternalMGLang.g:7139:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7143:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:7144:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalMGLang.g:7151:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7155:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:7156:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:7156:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:7157:2: ( rule__ForRange__StartAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            }
            // InternalMGLang.g:7158:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:7158:3: rule__ForRange__StartAssignment_0
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
    // InternalMGLang.g:7166:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7170:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:7171:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalMGLang.g:7178:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7182:1: ( ( ':' ) )
            // InternalMGLang.g:7183:1: ( ':' )
            {
            // InternalMGLang.g:7183:1: ( ':' )
            // InternalMGLang.g:7184:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalMGLang.g:7193:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7197:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:7198:2: rule__ForRange__Group__2__Impl
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
    // InternalMGLang.g:7204:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7208:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:7209:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:7209:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:7210:2: ( rule__ForRange__EndAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            }
            // InternalMGLang.g:7211:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:7211:3: rule__ForRange__EndAssignment_2
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


    // $ANTLR start "rule__Pattern__UnorderedGroup_4"
    // InternalMGLang.g:7220:1: rule__Pattern__UnorderedGroup_4 : ( rule__Pattern__UnorderedGroup_4__0 )? ;
    public final void rule__Pattern__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPatternAccess().getUnorderedGroup_4());
        	
        try {
            // InternalMGLang.g:7225:1: ( ( rule__Pattern__UnorderedGroup_4__0 )? )
            // InternalMGLang.g:7226:2: ( rule__Pattern__UnorderedGroup_4__0 )?
            {
            // InternalMGLang.g:7226:2: ( rule__Pattern__UnorderedGroup_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMGLang.g:0:0: rule__Pattern__UnorderedGroup_4__0
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
    // InternalMGLang.g:7234:1: rule__Pattern__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) ) ;
    public final void rule__Pattern__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMGLang.g:7239:1: ( ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) ) )
            // InternalMGLang.g:7240:3: ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) )
            {
            // InternalMGLang.g:7240:3: ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) ) )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                int LA50_3 = input.LA(2);

                if ( LA50_3 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                    alt50=2;
                }
                else if ( LA50_3 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                    alt50=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 3, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMGLang.g:7241:3: ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) )
                    {
                    // InternalMGLang.g:7241:3: ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) )
                    // InternalMGLang.g:7242:4: {...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalMGLang.g:7242:103: ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) )
                    // InternalMGLang.g:7243:5: ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // InternalMGLang.g:7249:5: ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) )
                    // InternalMGLang.g:7250:6: ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* )
                    {
                    // InternalMGLang.g:7250:6: ( ( rule__Pattern__CollsAssignment_4_0 ) )
                    // InternalMGLang.g:7251:7: ( rule__Pattern__CollsAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }
                    // InternalMGLang.g:7252:7: ( rule__Pattern__CollsAssignment_4_0 )
                    // InternalMGLang.g:7252:8: rule__Pattern__CollsAssignment_4_0
                    {
                    pushFollow(FOLLOW_58);
                    rule__Pattern__CollsAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }

                    }

                    // InternalMGLang.g:7255:6: ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* )
                    // InternalMGLang.g:7256:7: ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
                    }
                    // InternalMGLang.g:7257:7: ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==59) ) {
                            int LA47_1 = input.LA(2);

                            if ( (synpred63_InternalMGLang()) ) {
                                alt47=1;
                            }


                        }
                        else if ( (LA47_0==60) ) {
                            int LA47_2 = input.LA(2);

                            if ( (synpred63_InternalMGLang()) ) {
                                alt47=1;
                            }


                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMGLang.g:7257:8: ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_58);
                    	    rule__Pattern__CollsAssignment_4_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
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
                    // InternalMGLang.g:7263:3: ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) )
                    {
                    // InternalMGLang.g:7263:3: ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) )
                    // InternalMGLang.g:7264:4: {...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalMGLang.g:7264:103: ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) )
                    // InternalMGLang.g:7265:5: ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // InternalMGLang.g:7271:5: ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) )
                    // InternalMGLang.g:7272:6: ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* )
                    {
                    // InternalMGLang.g:7272:6: ( ( rule__Pattern__NodesAssignment_4_1 ) )
                    // InternalMGLang.g:7273:7: ( rule__Pattern__NodesAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }
                    // InternalMGLang.g:7274:7: ( rule__Pattern__NodesAssignment_4_1 )
                    // InternalMGLang.g:7274:8: rule__Pattern__NodesAssignment_4_1
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

                    // InternalMGLang.g:7277:6: ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* )
                    // InternalMGLang.g:7278:7: ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
                    }
                    // InternalMGLang.g:7279:7: ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_ID) ) {
                            int LA48_2 = input.LA(2);

                            if ( (LA48_2==RULE_ID) ) {
                                int LA48_3 = input.LA(3);

                                if ( (synpred65_InternalMGLang()) ) {
                                    alt48=1;
                                }


                            }


                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalMGLang.g:7279:8: ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1
                    	    {
                    	    pushFollow(FOLLOW_22);
                    	    rule__Pattern__NodesAssignment_4_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
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
                    // InternalMGLang.g:7285:3: ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) )
                    {
                    // InternalMGLang.g:7285:3: ({...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) ) )
                    // InternalMGLang.g:7286:4: {...}? => ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Pattern__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalMGLang.g:7286:103: ( ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) ) )
                    // InternalMGLang.g:7287:5: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // InternalMGLang.g:7293:5: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* ) )
                    // InternalMGLang.g:7294:6: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) ) ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* )
                    {
                    // InternalMGLang.g:7294:6: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 ) )
                    // InternalMGLang.g:7295:7: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }
                    // InternalMGLang.g:7296:7: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
                    // InternalMGLang.g:7296:8: rule__Pattern__ParamManipulationsAssignment_4_2
                    {
                    pushFollow(FOLLOW_59);
                    rule__Pattern__ParamManipulationsAssignment_4_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }

                    }

                    // InternalMGLang.g:7299:6: ( ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )* )
                    // InternalMGLang.g:7300:7: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getParamManipulationsAssignment_4_2()); 
                    }
                    // InternalMGLang.g:7301:7: ( ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2 )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            int LA49_3 = input.LA(2);

                            if ( (synpred67_InternalMGLang()) ) {
                                alt49=1;
                            }


                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMGLang.g:7301:8: ( rule__Pattern__ParamManipulationsAssignment_4_2 )=> rule__Pattern__ParamManipulationsAssignment_4_2
                    	    {
                    	    pushFollow(FOLLOW_59);
                    	    rule__Pattern__ParamManipulationsAssignment_4_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
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
    // InternalMGLang.g:7315:1: rule__Pattern__UnorderedGroup_4__0 : rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )? ;
    public final void rule__Pattern__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7319:1: ( rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )? )
            // InternalMGLang.g:7320:2: rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_59);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMGLang.g:7321:2: ( rule__Pattern__UnorderedGroup_4__1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMGLang.g:0:0: rule__Pattern__UnorderedGroup_4__1
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
    // InternalMGLang.g:7327:1: rule__Pattern__UnorderedGroup_4__1 : rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )? ;
    public final void rule__Pattern__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7331:1: ( rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )? )
            // InternalMGLang.g:7332:2: rule__Pattern__UnorderedGroup_4__Impl ( rule__Pattern__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_59);
            rule__Pattern__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMGLang.g:7333:2: ( rule__Pattern__UnorderedGroup_4__2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMGLang.g:0:0: rule__Pattern__UnorderedGroup_4__2
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
    // InternalMGLang.g:7339:1: rule__Pattern__UnorderedGroup_4__2 : rule__Pattern__UnorderedGroup_4__Impl ;
    public final void rule__Pattern__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7343:1: ( rule__Pattern__UnorderedGroup_4__Impl )
            // InternalMGLang.g:7344:2: rule__Pattern__UnorderedGroup_4__Impl
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
    // $ANTLR end "rule__Pattern__UnorderedGroup_4__2"


    // $ANTLR start "rule__MofgenFile__ImportsAssignment_0"
    // InternalMGLang.g:7351:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7355:1: ( ( ruleImport ) )
            // InternalMGLang.g:7356:2: ( ruleImport )
            {
            // InternalMGLang.g:7356:2: ( ruleImport )
            // InternalMGLang.g:7357:3: ruleImport
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
    // InternalMGLang.g:7366:1: rule__MofgenFile__PatternsAssignment_1_0 : ( rulePattern ) ;
    public final void rule__MofgenFile__PatternsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7370:1: ( ( rulePattern ) )
            // InternalMGLang.g:7371:2: ( rulePattern )
            {
            // InternalMGLang.g:7371:2: ( rulePattern )
            // InternalMGLang.g:7372:3: rulePattern
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
    // InternalMGLang.g:7381:1: rule__MofgenFile__GeneratorsAssignment_1_1 : ( ruleGenerator ) ;
    public final void rule__MofgenFile__GeneratorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7385:1: ( ( ruleGenerator ) )
            // InternalMGLang.g:7386:2: ( ruleGenerator )
            {
            // InternalMGLang.g:7386:2: ( ruleGenerator )
            // InternalMGLang.g:7387:3: ruleGenerator
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
    // InternalMGLang.g:7396:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7400:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:7401:2: ( RULE_STRING )
            {
            // InternalMGLang.g:7401:2: ( RULE_STRING )
            // InternalMGLang.g:7402:3: RULE_STRING
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
    // InternalMGLang.g:7411:1: rule__Import__AliasAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7415:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7416:2: ( RULE_ID )
            {
            // InternalMGLang.g:7416:2: ( RULE_ID )
            // InternalMGLang.g:7417:3: RULE_ID
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
    // InternalMGLang.g:7426:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7430:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7431:2: ( RULE_ID )
            {
            // InternalMGLang.g:7431:2: ( RULE_ID )
            // InternalMGLang.g:7432:3: RULE_ID
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
    // InternalMGLang.g:7441:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7445:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7446:2: ( ruleParameter )
            {
            // InternalMGLang.g:7446:2: ( ruleParameter )
            // InternalMGLang.g:7447:3: ruleParameter
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
    // InternalMGLang.g:7456:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7460:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7461:2: ( ruleParameter )
            {
            // InternalMGLang.g:7461:2: ( ruleParameter )
            // InternalMGLang.g:7462:3: ruleParameter
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
    // InternalMGLang.g:7471:1: rule__Pattern__CollsAssignment_4_0 : ( ruleCollection ) ;
    public final void rule__Pattern__CollsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7475:1: ( ( ruleCollection ) )
            // InternalMGLang.g:7476:2: ( ruleCollection )
            {
            // InternalMGLang.g:7476:2: ( ruleCollection )
            // InternalMGLang.g:7477:3: ruleCollection
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
    // InternalMGLang.g:7486:1: rule__Pattern__NodesAssignment_4_1 : ( ruleNode ) ;
    public final void rule__Pattern__NodesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7490:1: ( ( ruleNode ) )
            // InternalMGLang.g:7491:2: ( ruleNode )
            {
            // InternalMGLang.g:7491:2: ( ruleNode )
            // InternalMGLang.g:7492:3: ruleNode
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
    // InternalMGLang.g:7501:1: rule__Pattern__ParamManipulationsAssignment_4_2 : ( ruleParamManipulation ) ;
    public final void rule__Pattern__ParamManipulationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7505:1: ( ( ruleParamManipulation ) )
            // InternalMGLang.g:7506:2: ( ruleParamManipulation )
            {
            // InternalMGLang.g:7506:2: ( ruleParamManipulation )
            // InternalMGLang.g:7507:3: ruleParamManipulation
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


    // $ANTLR start "rule__Pattern__ReturnAssignment_6"
    // InternalMGLang.g:7516:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7520:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:7521:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:7521:2: ( rulePatternReturn )
            // InternalMGLang.g:7522:3: rulePatternReturn
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
    // InternalMGLang.g:7531:1: rule__PatternReturn__ReturnValueAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PatternReturn__ReturnValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7535:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7536:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7536:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7537:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 
            }
            // InternalMGLang.g:7538:3: ( RULE_ID )
            // InternalMGLang.g:7539:4: RULE_ID
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
    // InternalMGLang.g:7550:1: rule__ParamManipulation__ParamAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParamManipulation__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7554:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7555:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7555:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7556:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0()); 
            }
            // InternalMGLang.g:7557:3: ( RULE_ID )
            // InternalMGLang.g:7558:4: RULE_ID
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
    // InternalMGLang.g:7569:1: rule__ParamManipulation__ContentAssignment_1 : ( ruleNodeContent ) ;
    public final void rule__ParamManipulation__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7573:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:7574:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:7574:2: ( ruleNodeContent )
            // InternalMGLang.g:7575:3: ruleNodeContent
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
    // InternalMGLang.g:7584:1: rule__Node__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7588:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7589:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7589:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7590:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            }
            // InternalMGLang.g:7591:3: ( RULE_ID )
            // InternalMGLang.g:7592:4: RULE_ID
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
    // InternalMGLang.g:7603:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7607:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7608:2: ( RULE_ID )
            {
            // InternalMGLang.g:7608:2: ( RULE_ID )
            // InternalMGLang.g:7609:3: RULE_ID
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
    // InternalMGLang.g:7618:1: rule__Node__CreatedByAssignment_2_0 : ( ruleNodeContent ) ;
    public final void rule__Node__CreatedByAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7622:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:7623:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:7623:2: ( ruleNodeContent )
            // InternalMGLang.g:7624:3: ruleNodeContent
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
    // InternalMGLang.g:7633:1: rule__Node__CreatedByAssignment_2_1_1 : ( rulePatternCall ) ;
    public final void rule__Node__CreatedByAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7637:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:7638:2: ( rulePatternCall )
            {
            // InternalMGLang.g:7638:2: ( rulePatternCall )
            // InternalMGLang.g:7639:3: rulePatternCall
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
    // InternalMGLang.g:7648:1: rule__NodeContent__RefsAssignsAssignment_2 : ( ruleNodeReferenceOrAssignment ) ;
    public final void rule__NodeContent__RefsAssignsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7652:1: ( ( ruleNodeReferenceOrAssignment ) )
            // InternalMGLang.g:7653:2: ( ruleNodeReferenceOrAssignment )
            {
            // InternalMGLang.g:7653:2: ( ruleNodeReferenceOrAssignment )
            // InternalMGLang.g:7654:3: ruleNodeReferenceOrAssignment
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
    // InternalMGLang.g:7663:1: rule__PatternCall__CalledAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7667:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7668:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7668:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7669:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 
            }
            // InternalMGLang.g:7670:3: ( RULE_ID )
            // InternalMGLang.g:7671:4: RULE_ID
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
    // InternalMGLang.g:7682:1: rule__PatternCall__ParamsAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7686:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7687:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7687:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:7688:3: ruleArithmeticExpression
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


    // $ANTLR start "rule__NodeReferenceOrAssignment__ConditionAssignment_1_1"
    // InternalMGLang.g:7697:1: rule__NodeReferenceOrAssignment__ConditionAssignment_1_1 : ( ruleArithmeticExpression ) ;
    public final void rule__NodeReferenceOrAssignment__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7701:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7702:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7702:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:7703:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionArithmeticExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeReferenceOrAssignmentAccess().getConditionArithmeticExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReferenceOrAssignment__ConditionAssignment_1_1"


    // $ANTLR start "rule__PatternNodeReference__TypeAssignment_0"
    // InternalMGLang.g:7712:1: rule__PatternNodeReference__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7716:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7717:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7717:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7718:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 
            }
            // InternalMGLang.g:7719:3: ( RULE_ID )
            // InternalMGLang.g:7720:4: RULE_ID
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
    // InternalMGLang.g:7731:1: rule__PatternNodeReference__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7735:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7736:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7736:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7737:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 
            }
            // InternalMGLang.g:7738:3: ( RULE_ID )
            // InternalMGLang.g:7739:4: RULE_ID
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
    // InternalMGLang.g:7750:1: rule__Assignment__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7754:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7755:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7755:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7756:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 
            }
            // InternalMGLang.g:7757:3: ( RULE_ID )
            // InternalMGLang.g:7758:4: RULE_ID
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
    // InternalMGLang.g:7769:1: rule__Assignment__ValueAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7773:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7774:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7774:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:7775:3: ruleArithmeticExpression
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
    // InternalMGLang.g:7784:1: rule__PrimitiveParameter__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7788:1: ( ( rulePrimitiveType ) )
            // InternalMGLang.g:7789:2: ( rulePrimitiveType )
            {
            // InternalMGLang.g:7789:2: ( rulePrimitiveType )
            // InternalMGLang.g:7790:3: rulePrimitiveType
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
    // InternalMGLang.g:7799:1: rule__PrimitiveParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7803:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7804:2: ( RULE_ID )
            {
            // InternalMGLang.g:7804:2: ( RULE_ID )
            // InternalMGLang.g:7805:3: RULE_ID
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
    // InternalMGLang.g:7814:1: rule__ParameterNode__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterNode__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7818:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7819:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7819:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7820:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_0_0()); 
            }
            // InternalMGLang.g:7821:3: ( RULE_ID )
            // InternalMGLang.g:7822:4: RULE_ID
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
    // InternalMGLang.g:7833:1: rule__ParameterNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7837:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7838:2: ( RULE_ID )
            {
            // InternalMGLang.g:7838:2: ( RULE_ID )
            // InternalMGLang.g:7839:3: RULE_ID
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


    // $ANTLR start "rule__ParameterRef__RefAssignment"
    // InternalMGLang.g:7848:1: rule__ParameterRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7852:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7853:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7853:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7854:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0()); 
            }
            // InternalMGLang.g:7855:3: ( RULE_ID )
            // InternalMGLang.g:7856:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefParameterIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefAccess().getRefParameterIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRef__RefAssignment"


    // $ANTLR start "rule__MethodCall__CalledNodeAssignment_0"
    // InternalMGLang.g:7867:1: rule__MethodCall__CalledNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__CalledNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7871:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7872:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7872:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7873:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getCalledNodeNodeCrossReference_0_0()); 
            }
            // InternalMGLang.g:7874:3: ( RULE_ID )
            // InternalMGLang.g:7875:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getCalledNodeNodeIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getCalledNodeNodeIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getCalledNodeNodeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__CalledNodeAssignment_0"


    // $ANTLR start "rule__MethodCall__MethodAssignment_2"
    // InternalMGLang.g:7886:1: rule__MethodCall__MethodAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MethodCall__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7890:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7891:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7891:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7892:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodEOperationCrossReference_2_0()); 
            }
            // InternalMGLang.g:7893:3: ( RULE_ID )
            // InternalMGLang.g:7894:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodCallAccess().getMethodEOperationIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodEOperationIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodCallAccess().getMethodEOperationCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__MethodAssignment_2"


    // $ANTLR start "rule__TertiaryExpression__OpAssignment_1_1"
    // InternalMGLang.g:7905:1: rule__TertiaryExpression__OpAssignment_1_1 : ( ruleTertiaryOp ) ;
    public final void rule__TertiaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7909:1: ( ( ruleTertiaryOp ) )
            // InternalMGLang.g:7910:2: ( ruleTertiaryOp )
            {
            // InternalMGLang.g:7910:2: ( ruleTertiaryOp )
            // InternalMGLang.g:7911:3: ruleTertiaryOp
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
    // InternalMGLang.g:7920:1: rule__TertiaryExpression__RightAssignment_1_2 : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7924:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:7925:2: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:7925:2: ( ruleSecondaryExpression )
            // InternalMGLang.g:7926:3: ruleSecondaryExpression
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
    // InternalMGLang.g:7935:1: rule__SecondaryExpression__OpAssignment_1_1 : ( ruleSecondaryOp ) ;
    public final void rule__SecondaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7939:1: ( ( ruleSecondaryOp ) )
            // InternalMGLang.g:7940:2: ( ruleSecondaryOp )
            {
            // InternalMGLang.g:7940:2: ( ruleSecondaryOp )
            // InternalMGLang.g:7941:3: ruleSecondaryOp
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
    // InternalMGLang.g:7950:1: rule__SecondaryExpression__RightAssignment_1_2 : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7954:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:7955:2: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:7955:2: ( rulePrimaryExpr )
            // InternalMGLang.g:7956:3: rulePrimaryExpr
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
    // InternalMGLang.g:7965:1: rule__PrimaryExpr__OpAssignment_1_1 : ( rulePrimaryOp ) ;
    public final void rule__PrimaryExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7969:1: ( ( rulePrimaryOp ) )
            // InternalMGLang.g:7970:2: ( rulePrimaryOp )
            {
            // InternalMGLang.g:7970:2: ( rulePrimaryOp )
            // InternalMGLang.g:7971:3: rulePrimaryOp
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
    // InternalMGLang.g:7980:1: rule__PrimaryExpr__RightAssignment_1_2 : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7984:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:7985:2: ( ruleRelationExpression )
            {
            // InternalMGLang.g:7985:2: ( ruleRelationExpression )
            // InternalMGLang.g:7986:3: ruleRelationExpression
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
    // InternalMGLang.g:7995:1: rule__RelationExpression__RelationAssignment_1_1 : ( ruleRelationalOp ) ;
    public final void rule__RelationExpression__RelationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7999:1: ( ( ruleRelationalOp ) )
            // InternalMGLang.g:8000:2: ( ruleRelationalOp )
            {
            // InternalMGLang.g:8000:2: ( ruleRelationalOp )
            // InternalMGLang.g:8001:3: ruleRelationalOp
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
    // InternalMGLang.g:8010:1: rule__RelationExpression__RightAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8014:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:8015:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:8015:2: ( ruleBaseExpr )
            // InternalMGLang.g:8016:3: ruleBaseExpr
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
    // InternalMGLang.g:8025:1: rule__BaseExpr__ExprAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__BaseExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8029:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:8030:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:8030:2: ( ruleBaseExpr )
            // InternalMGLang.g:8031:3: ruleBaseExpr
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
    // InternalMGLang.g:8040:1: rule__BaseExpr__FuncAssignment_2_1 : ( ruleMathFunc ) ;
    public final void rule__BaseExpr__FuncAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8044:1: ( ( ruleMathFunc ) )
            // InternalMGLang.g:8045:2: ( ruleMathFunc )
            {
            // InternalMGLang.g:8045:2: ( ruleMathFunc )
            // InternalMGLang.g:8046:3: ruleMathFunc
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
    // InternalMGLang.g:8055:1: rule__BaseExpr__ExprAssignment_2_3 : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__ExprAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8059:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8060:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8060:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8061:3: ruleArithmeticExpression
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


    // $ANTLR start "rule__Generator__ParamsAssignment_3"
    // InternalMGLang.g:8070:1: rule__Generator__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__Generator__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8074:1: ( ( ruleParameter ) )
            // InternalMGLang.g:8075:2: ( ruleParameter )
            {
            // InternalMGLang.g:8075:2: ( ruleParameter )
            // InternalMGLang.g:8076:3: ruleParameter
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
    // InternalMGLang.g:8085:1: rule__Generator__CommandsAssignment_6 : ( ruleGeneratorExpression ) ;
    public final void rule__Generator__CommandsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8089:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8090:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8090:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8091:3: ruleGeneratorExpression
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
    // InternalMGLang.g:8100:1: rule__PatternObjectCreation__PObjectAssignment_0 : ( rulePatternObject ) ;
    public final void rule__PatternObjectCreation__PObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8104:1: ( ( rulePatternObject ) )
            // InternalMGLang.g:8105:2: ( rulePatternObject )
            {
            // InternalMGLang.g:8105:2: ( rulePatternObject )
            // InternalMGLang.g:8106:3: rulePatternObject
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
    // InternalMGLang.g:8115:1: rule__PatternObjectCreation__PatternCallAssignment_2 : ( rulePatternCall ) ;
    public final void rule__PatternObjectCreation__PatternCallAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8119:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:8120:2: ( rulePatternCall )
            {
            // InternalMGLang.g:8120:2: ( rulePatternCall )
            // InternalMGLang.g:8121:3: rulePatternCall
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
    // InternalMGLang.g:8130:1: rule__PatternObject__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8134:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8135:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8135:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8136:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternObjectAccess().getTypePatternCrossReference_0_0()); 
            }
            // InternalMGLang.g:8137:3: ( RULE_ID )
            // InternalMGLang.g:8138:4: RULE_ID
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
    // InternalMGLang.g:8149:1: rule__PatternObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8153:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8154:2: ( RULE_ID )
            {
            // InternalMGLang.g:8154:2: ( RULE_ID )
            // InternalMGLang.g:8155:3: RULE_ID
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
    // InternalMGLang.g:8164:1: rule__ForStatement__HeadAssignment_1 : ( ruleForHead ) ;
    public final void rule__ForStatement__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8168:1: ( ( ruleForHead ) )
            // InternalMGLang.g:8169:2: ( ruleForHead )
            {
            // InternalMGLang.g:8169:2: ( ruleForHead )
            // InternalMGLang.g:8170:3: ruleForHead
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
    // InternalMGLang.g:8179:1: rule__ForStatement__BodyAssignment_3 : ( ruleForBody ) ;
    public final void rule__ForStatement__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8183:1: ( ( ruleForBody ) )
            // InternalMGLang.g:8184:2: ( ruleForBody )
            {
            // InternalMGLang.g:8184:2: ( ruleForBody )
            // InternalMGLang.g:8185:3: ruleForBody
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
    // InternalMGLang.g:8194:1: rule__GeneralForHead__IteratorVarAssignment_0 : ( RULE_ID ) ;
    public final void rule__GeneralForHead__IteratorVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8198:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8199:2: ( RULE_ID )
            {
            // InternalMGLang.g:8199:2: ( RULE_ID )
            // InternalMGLang.g:8200:3: RULE_ID
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
    // InternalMGLang.g:8209:1: rule__GeneralForHead__RangeAssignment_2 : ( ruleForRange ) ;
    public final void rule__GeneralForHead__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8213:1: ( ( ruleForRange ) )
            // InternalMGLang.g:8214:2: ( ruleForRange )
            {
            // InternalMGLang.g:8214:2: ( ruleForRange )
            // InternalMGLang.g:8215:3: ruleForRange
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
    // InternalMGLang.g:8224:1: rule__ForEachHead__SrcAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachHead__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8228:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8229:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8229:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8230:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getSrcNodeOrParameterOrCollectionCrossReference_0_0()); 
            }
            // InternalMGLang.g:8231:3: ( RULE_ID )
            // InternalMGLang.g:8232:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getSrcNodeOrParameterOrCollectionIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getSrcNodeOrParameterOrCollectionIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getSrcNodeOrParameterOrCollectionCrossReference_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ForEachHead__RefAssignment_2"
    // InternalMGLang.g:8243:1: rule__ForEachHead__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachHead__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8247:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8248:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8248:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8249:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getRefEReferenceCrossReference_2_0()); 
            }
            // InternalMGLang.g:8250:3: ( RULE_ID )
            // InternalMGLang.g:8251:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForEachHeadAccess().getRefEReferenceIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getRefEReferenceIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForEachHeadAccess().getRefEReferenceCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachHead__RefAssignment_2"


    // $ANTLR start "rule__ForEachHead__IteratorVarAssignment_4"
    // InternalMGLang.g:8262:1: rule__ForEachHead__IteratorVarAssignment_4 : ( RULE_ID ) ;
    public final void rule__ForEachHead__IteratorVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8266:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8267:2: ( RULE_ID )
            {
            // InternalMGLang.g:8267:2: ( RULE_ID )
            // InternalMGLang.g:8268:3: RULE_ID
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
    // InternalMGLang.g:8277:1: rule__ForBody__CommandsAssignment_1 : ( ruleGeneratorExpression ) ;
    public final void rule__ForBody__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8281:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8282:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8282:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8283:3: ruleGeneratorExpression
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


    // $ANTLR start "rule__IfStatement__CondAssignment_3"
    // InternalMGLang.g:8292:1: rule__IfStatement__CondAssignment_3 : ( ruleArithmeticExpression ) ;
    public final void rule__IfStatement__CondAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8296:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8297:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8297:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8298:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCondArithmeticExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCondArithmeticExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__CondAssignment_3"


    // $ANTLR start "rule__IfStatement__ThenAssignment_6"
    // InternalMGLang.g:8307:1: rule__IfStatement__ThenAssignment_6 : ( ruleGeneratorExpression ) ;
    public final void rule__IfStatement__ThenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8311:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8312:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8312:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8313:3: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenGeneratorExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenGeneratorExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ThenAssignment_6"


    // $ANTLR start "rule__IfStatement__ElseIfAssignment_8_1"
    // InternalMGLang.g:8322:1: rule__IfStatement__ElseIfAssignment_8_1 : ( ruleElseIfOrElse ) ;
    public final void rule__IfStatement__ElseIfAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8326:1: ( ( ruleElseIfOrElse ) )
            // InternalMGLang.g:8327:2: ( ruleElseIfOrElse )
            {
            // InternalMGLang.g:8327:2: ( ruleElseIfOrElse )
            // InternalMGLang.g:8328:3: ruleElseIfOrElse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseIfElseIfOrElseParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElseIfOrElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseIfElseIfOrElseParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseIfAssignment_8_1"


    // $ANTLR start "rule__ElseIfOrElse__CondAssignment_0_2"
    // InternalMGLang.g:8337:1: rule__ElseIfOrElse__CondAssignment_0_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ElseIfOrElse__CondAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8341:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8342:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8342:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8343:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getCondArithmeticExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getCondArithmeticExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__CondAssignment_0_2"


    // $ANTLR start "rule__ElseIfOrElse__ThenAssignment_0_5"
    // InternalMGLang.g:8352:1: rule__ElseIfOrElse__ThenAssignment_0_5 : ( ruleGeneratorExpression ) ;
    public final void rule__ElseIfOrElse__ThenAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8356:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8357:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8357:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8358:3: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getThenGeneratorExpressionParserRuleCall_0_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getThenGeneratorExpressionParserRuleCall_0_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__ThenAssignment_0_5"


    // $ANTLR start "rule__ElseIfOrElse__ElseIfAssignment_0_7_1"
    // InternalMGLang.g:8367:1: rule__ElseIfOrElse__ElseIfAssignment_0_7_1 : ( ruleElseIfOrElse ) ;
    public final void rule__ElseIfOrElse__ElseIfAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8371:1: ( ( ruleElseIfOrElse ) )
            // InternalMGLang.g:8372:2: ( ruleElseIfOrElse )
            {
            // InternalMGLang.g:8372:2: ( ruleElseIfOrElse )
            // InternalMGLang.g:8373:3: ruleElseIfOrElse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfOrElseAccess().getElseIfElseIfOrElseParserRuleCall_0_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElseIfOrElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfOrElseAccess().getElseIfElseIfOrElseParserRuleCall_0_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfOrElse__ElseIfAssignment_0_7_1"


    // $ANTLR start "rule__ElseStatement__ElseAssignment_2"
    // InternalMGLang.g:8382:1: rule__ElseStatement__ElseAssignment_2 : ( ruleGeneratorExpression ) ;
    public final void rule__ElseStatement__ElseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8386:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8387:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8387:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8388:3: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseStatementAccess().getElseGeneratorExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseStatementAccess().getElseGeneratorExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__ElseAssignment_2"


    // $ANTLR start "rule__SwitchCase__AttributeAssignment_2"
    // InternalMGLang.g:8397:1: rule__SwitchCase__AttributeAssignment_2 : ( ruleParameterRefOrMethodCall ) ;
    public final void rule__SwitchCase__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8401:1: ( ( ruleParameterRefOrMethodCall ) )
            // InternalMGLang.g:8402:2: ( ruleParameterRefOrMethodCall )
            {
            // InternalMGLang.g:8402:2: ( ruleParameterRefOrMethodCall )
            // InternalMGLang.g:8403:3: ruleParameterRefOrMethodCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseAccess().getAttributeParameterRefOrMethodCallParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterRefOrMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseAccess().getAttributeParameterRefOrMethodCallParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalMGLang.g:8412:1: rule__SwitchCase__CasesAssignment_5 : ( ruleCase ) ;
    public final void rule__SwitchCase__CasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8416:1: ( ( ruleCase ) )
            // InternalMGLang.g:8417:2: ( ruleCase )
            {
            // InternalMGLang.g:8417:2: ( ruleCase )
            // InternalMGLang.g:8418:3: ruleCase
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
    // InternalMGLang.g:8427:1: rule__SwitchCase__DefaultAssignment_6 : ( ruleDefault ) ;
    public final void rule__SwitchCase__DefaultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8431:1: ( ( ruleDefault ) )
            // InternalMGLang.g:8432:2: ( ruleDefault )
            {
            // InternalMGLang.g:8432:2: ( ruleDefault )
            // InternalMGLang.g:8433:3: ruleDefault
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


    // $ANTLR start "rule__Case__ValAssignment_1"
    // InternalMGLang.g:8442:1: rule__Case__ValAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__Case__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8446:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8447:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8447:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8448:3: ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getValArithmeticExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getValArithmeticExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__ValAssignment_1"


    // $ANTLR start "rule__Case__BodyAssignment_3"
    // InternalMGLang.g:8457:1: rule__Case__BodyAssignment_3 : ( ruleCaseBody ) ;
    public final void rule__Case__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8461:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8462:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8462:2: ( ruleCaseBody )
            // InternalMGLang.g:8463:3: ruleCaseBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseAccess().getBodyCaseBodyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseAccess().getBodyCaseBodyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__BodyAssignment_3"


    // $ANTLR start "rule__CaseBody__ExpressionsAssignment_0_2"
    // InternalMGLang.g:8472:1: rule__CaseBody__ExpressionsAssignment_0_2 : ( ruleGeneratorExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8476:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8477:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8477:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8478:3: ruleGeneratorExpression
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


    // $ANTLR start "rule__CaseBody__ExpressionsAssignment_1"
    // InternalMGLang.g:8487:1: rule__CaseBody__ExpressionsAssignment_1 : ( ruleGeneratorExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8491:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8492:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8492:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8493:3: ruleGeneratorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseBodyAccess().getExpressionsGeneratorExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseBody__ExpressionsAssignment_1"


    // $ANTLR start "rule__List__NameAssignment_1"
    // InternalMGLang.g:8502:1: rule__List__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8506:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8507:2: ( RULE_ID )
            {
            // InternalMGLang.g:8507:2: ( RULE_ID )
            // InternalMGLang.g:8508:3: RULE_ID
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
    // InternalMGLang.g:8517:1: rule__ListAdHoc__ElementsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ListAdHoc__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8521:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8522:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8522:2: ( ruleLiteral )
            // InternalMGLang.g:8523:3: ruleLiteral
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
    // InternalMGLang.g:8532:1: rule__ListAdHoc__ElementsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ListAdHoc__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8536:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8537:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8537:2: ( ruleLiteral )
            // InternalMGLang.g:8538:3: ruleLiteral
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
    // InternalMGLang.g:8547:1: rule__Map__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Map__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8551:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8552:2: ( RULE_ID )
            {
            // InternalMGLang.g:8552:2: ( RULE_ID )
            // InternalMGLang.g:8553:3: RULE_ID
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
    // InternalMGLang.g:8562:1: rule__MapAdHoc__EntriesAssignment_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8566:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:8567:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:8567:2: ( ruleMapTupel )
            // InternalMGLang.g:8568:3: ruleMapTupel
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
    // InternalMGLang.g:8577:1: rule__MapAdHoc__EntriesAssignment_2_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8581:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:8582:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:8582:2: ( ruleMapTupel )
            // InternalMGLang.g:8583:3: ruleMapTupel
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
    // InternalMGLang.g:8592:1: rule__MapTupel__KeyAssignment_1 : ( ruleLiteral ) ;
    public final void rule__MapTupel__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8596:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8597:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8597:2: ( ruleLiteral )
            // InternalMGLang.g:8598:3: ruleLiteral
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
    // InternalMGLang.g:8607:1: rule__MapTupel__ValueAssignment_3 : ( ruleArithmeticExpression ) ;
    public final void rule__MapTupel__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8611:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8612:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8612:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8613:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8622:1: rule__ForRange__StartAssignment_0 : ( RULE_INT ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8626:1: ( ( RULE_INT ) )
            // InternalMGLang.g:8627:2: ( RULE_INT )
            {
            // InternalMGLang.g:8627:2: ( RULE_INT )
            // InternalMGLang.g:8628:3: RULE_INT
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
    // InternalMGLang.g:8637:1: rule__ForRange__EndAssignment_2 : ( RULE_INT ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8641:1: ( ( RULE_INT ) )
            // InternalMGLang.g:8642:2: ( RULE_INT )
            {
            // InternalMGLang.g:8642:2: ( RULE_INT )
            // InternalMGLang.g:8643:3: RULE_INT
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

    // $ANTLR start synpred62_InternalMGLang
    public final void synpred62_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7226:2: ( rule__Pattern__UnorderedGroup_4__0 )
        // InternalMGLang.g:7226:2: rule__Pattern__UnorderedGroup_4__0
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__UnorderedGroup_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalMGLang

    // $ANTLR start synpred63_InternalMGLang
    public final void synpred63_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7257:8: ( rule__Pattern__CollsAssignment_4_0 )
        // InternalMGLang.g:7257:9: rule__Pattern__CollsAssignment_4_0
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__CollsAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalMGLang

    // $ANTLR start synpred64_InternalMGLang
    public final void synpred64_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7241:3: ( ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) ) )
        // InternalMGLang.g:7241:3: ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) )
        {
        // InternalMGLang.g:7241:3: ({...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) ) )
        // InternalMGLang.g:7242:4: {...}? => ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred64_InternalMGLang", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0)");
        }
        // InternalMGLang.g:7242:103: ( ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) ) )
        // InternalMGLang.g:7243:5: ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 0);
        // InternalMGLang.g:7249:5: ( ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* ) )
        // InternalMGLang.g:7250:6: ( ( rule__Pattern__CollsAssignment_4_0 ) ) ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* )
        {
        // InternalMGLang.g:7250:6: ( ( rule__Pattern__CollsAssignment_4_0 ) )
        // InternalMGLang.g:7251:7: ( rule__Pattern__CollsAssignment_4_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
        }
        // InternalMGLang.g:7252:7: ( rule__Pattern__CollsAssignment_4_0 )
        // InternalMGLang.g:7252:8: rule__Pattern__CollsAssignment_4_0
        {
        pushFollow(FOLLOW_58);
        rule__Pattern__CollsAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMGLang.g:7255:6: ( ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )* )
        // InternalMGLang.g:7256:7: ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPatternAccess().getCollsAssignment_4_0()); 
        }
        // InternalMGLang.g:7257:7: ( ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0 )*
        loop53:
        do {
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==59) && (synpred63_InternalMGLang())) {
                alt53=1;
            }
            else if ( (LA53_0==60) && (synpred63_InternalMGLang())) {
                alt53=1;
            }


            switch (alt53) {
        	case 1 :
        	    // InternalMGLang.g:7257:8: ( rule__Pattern__CollsAssignment_4_0 )=> rule__Pattern__CollsAssignment_4_0
        	    {
        	    pushFollow(FOLLOW_58);
        	    rule__Pattern__CollsAssignment_4_0();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop53;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred64_InternalMGLang

    // $ANTLR start synpred65_InternalMGLang
    public final void synpred65_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7279:8: ( rule__Pattern__NodesAssignment_4_1 )
        // InternalMGLang.g:7279:9: rule__Pattern__NodesAssignment_4_1
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__NodesAssignment_4_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalMGLang

    // $ANTLR start synpred66_InternalMGLang
    public final void synpred66_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7263:3: ( ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) ) )
        // InternalMGLang.g:7263:3: ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) )
        {
        // InternalMGLang.g:7263:3: ({...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) ) )
        // InternalMGLang.g:7264:4: {...}? => ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred66_InternalMGLang", "getUnorderedGroupHelper().canSelect(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1)");
        }
        // InternalMGLang.g:7264:103: ( ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) ) )
        // InternalMGLang.g:7265:5: ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getPatternAccess().getUnorderedGroup_4(), 1);
        // InternalMGLang.g:7271:5: ( ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* ) )
        // InternalMGLang.g:7272:6: ( ( rule__Pattern__NodesAssignment_4_1 ) ) ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* )
        {
        // InternalMGLang.g:7272:6: ( ( rule__Pattern__NodesAssignment_4_1 ) )
        // InternalMGLang.g:7273:7: ( rule__Pattern__NodesAssignment_4_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
        }
        // InternalMGLang.g:7274:7: ( rule__Pattern__NodesAssignment_4_1 )
        // InternalMGLang.g:7274:8: rule__Pattern__NodesAssignment_4_1
        {
        pushFollow(FOLLOW_22);
        rule__Pattern__NodesAssignment_4_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMGLang.g:7277:6: ( ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )* )
        // InternalMGLang.g:7278:7: ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPatternAccess().getNodesAssignment_4_1()); 
        }
        // InternalMGLang.g:7279:7: ( ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1 )*
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) && (synpred65_InternalMGLang())) {
                alt54=1;
            }


            switch (alt54) {
        	case 1 :
        	    // InternalMGLang.g:7279:8: ( rule__Pattern__NodesAssignment_4_1 )=> rule__Pattern__NodesAssignment_4_1
        	    {
        	    pushFollow(FOLLOW_22);
        	    rule__Pattern__NodesAssignment_4_1();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop54;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred66_InternalMGLang

    // $ANTLR start synpred67_InternalMGLang
    public final void synpred67_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7301:8: ( rule__Pattern__ParamManipulationsAssignment_4_2 )
        // InternalMGLang.g:7301:9: rule__Pattern__ParamManipulationsAssignment_4_2
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__ParamManipulationsAssignment_4_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalMGLang

    // $ANTLR start synpred68_InternalMGLang
    public final void synpred68_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7321:2: ( rule__Pattern__UnorderedGroup_4__1 )
        // InternalMGLang.g:7321:2: rule__Pattern__UnorderedGroup_4__1
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__UnorderedGroup_4__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalMGLang

    // $ANTLR start synpred69_InternalMGLang
    public final void synpred69_InternalMGLang_fragment() throws RecognitionException {   
        // InternalMGLang.g:7333:2: ( rule__Pattern__UnorderedGroup_4__2 )
        // InternalMGLang.g:7333:2: rule__Pattern__UnorderedGroup_4__2
        {
        pushFollow(FOLLOW_2);
        rule__Pattern__UnorderedGroup_4__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalMGLang

    // Delegated rules

    public final boolean synpred67_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalMGLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalMGLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalMGLang_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0004002000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0004002000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x1800000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000200001E0200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000001E0200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002030000018370L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002010000018372L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002010000018370L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000007E00002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000001E0202L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x18A8008000000200L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x18A8000000000202L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x18A8000000000200L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020004000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x18A8004000000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1800000000000202L});

}
