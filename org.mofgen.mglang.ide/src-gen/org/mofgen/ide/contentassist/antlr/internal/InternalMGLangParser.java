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

@SuppressWarnings("all")
public class InternalMGLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TRUE", "RULE_FALSE", "RULE_ASSIGNMENT_OP", "RULE_NEWLINE", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'test'", "'sqrt'", "'abs'", "'int'", "'char'", "'double'", "'String'", "'>'", "'>='", "'=='", "'!='", "'<='", "'<'", "'+'", "'-'", "'||'", "'%'", "'^'", "'*'", "'/'", "'&&'", "'import'", "'as'", "'config'", "'('", "')'", "'{'", "'}'", "'pattern'", "','", "'return'", "'this'", "'.'", "'->'", "'gen'", "'var'", "'for'", "'in'", "'switch'", "'case'", "':'", "'default'", "'when'", "'List'", "'['", "']'", "'Map'", "'!'"
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
    public static final int T__63=63;
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
             before(grammarAccess.getMofgenFileRule()); 
            pushFollow(FOLLOW_1);
            ruleMofgenFile();

            state._fsp--;

             after(grammarAccess.getMofgenFileRule()); 
            match(input,EOF,FOLLOW_2); 

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
             before(grammarAccess.getMofgenFileAccess().getGroup()); 
            // InternalMGLang.g:69:3: ( rule__MofgenFile__Group__0 )
            // InternalMGLang.g:69:4: rule__MofgenFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMofgenFileAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFileCommand"
    // InternalMGLang.g:78:1: entryRuleFileCommand : ruleFileCommand EOF ;
    public final void entryRuleFileCommand() throws RecognitionException {
        try {
            // InternalMGLang.g:79:1: ( ruleFileCommand EOF )
            // InternalMGLang.g:80:1: ruleFileCommand EOF
            {
             before(grammarAccess.getFileCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleFileCommand();

            state._fsp--;

             after(grammarAccess.getFileCommandRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFileCommand"


    // $ANTLR start "ruleFileCommand"
    // InternalMGLang.g:87:1: ruleFileCommand : ( ( rule__FileCommand__Alternatives ) ) ;
    public final void ruleFileCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:91:2: ( ( ( rule__FileCommand__Alternatives ) ) )
            // InternalMGLang.g:92:2: ( ( rule__FileCommand__Alternatives ) )
            {
            // InternalMGLang.g:92:2: ( ( rule__FileCommand__Alternatives ) )
            // InternalMGLang.g:93:3: ( rule__FileCommand__Alternatives )
            {
             before(grammarAccess.getFileCommandAccess().getAlternatives()); 
            // InternalMGLang.g:94:3: ( rule__FileCommand__Alternatives )
            // InternalMGLang.g:94:4: rule__FileCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FileCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileCommand"


    // $ANTLR start "entryRuleImport"
    // InternalMGLang.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMGLang.g:104:1: ( ruleImport EOF )
            // InternalMGLang.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMGLang.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMGLang.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalMGLang.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMGLang.g:119:3: ( rule__Import__Group__0 )
            // InternalMGLang.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:128:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // InternalMGLang.g:129:1: ( ruleConfig EOF )
            // InternalMGLang.g:130:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:137:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:141:2: ( ( ( rule__Config__Group__0 ) ) )
            // InternalMGLang.g:142:2: ( ( rule__Config__Group__0 ) )
            {
            // InternalMGLang.g:142:2: ( ( rule__Config__Group__0 ) )
            // InternalMGLang.g:143:3: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // InternalMGLang.g:144:3: ( rule__Config__Group__0 )
            // InternalMGLang.g:144:4: rule__Config__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:153:1: entryRuleConfigExpression : ruleConfigExpression EOF ;
    public final void entryRuleConfigExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:154:1: ( ruleConfigExpression EOF )
            // InternalMGLang.g:155:1: ruleConfigExpression EOF
            {
             before(grammarAccess.getConfigExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigExpression();

            state._fsp--;

             after(grammarAccess.getConfigExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:162:1: ruleConfigExpression : ( 'test' ) ;
    public final void ruleConfigExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:166:2: ( ( 'test' ) )
            // InternalMGLang.g:167:2: ( 'test' )
            {
            // InternalMGLang.g:167:2: ( 'test' )
            // InternalMGLang.g:168:3: 'test'
            {
             before(grammarAccess.getConfigExpressionAccess().getTestKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigExpressionAccess().getTestKeyword()); 

            }


            }

        }
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
    // InternalMGLang.g:178:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMGLang.g:179:1: ( rulePattern EOF )
            // InternalMGLang.g:180:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:187:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:191:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalMGLang.g:192:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalMGLang.g:192:2: ( ( rule__Pattern__Group__0 ) )
            // InternalMGLang.g:193:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalMGLang.g:194:3: ( rule__Pattern__Group__0 )
            // InternalMGLang.g:194:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePatternCommand"
    // InternalMGLang.g:203:1: entryRulePatternCommand : rulePatternCommand EOF ;
    public final void entryRulePatternCommand() throws RecognitionException {
        try {
            // InternalMGLang.g:204:1: ( rulePatternCommand EOF )
            // InternalMGLang.g:205:1: rulePatternCommand EOF
            {
             before(grammarAccess.getPatternCommandRule()); 
            pushFollow(FOLLOW_1);
            rulePatternCommand();

            state._fsp--;

             after(grammarAccess.getPatternCommandRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePatternCommand"


    // $ANTLR start "rulePatternCommand"
    // InternalMGLang.g:212:1: rulePatternCommand : ( ( rule__PatternCommand__Alternatives ) ) ;
    public final void rulePatternCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:216:2: ( ( ( rule__PatternCommand__Alternatives ) ) )
            // InternalMGLang.g:217:2: ( ( rule__PatternCommand__Alternatives ) )
            {
            // InternalMGLang.g:217:2: ( ( rule__PatternCommand__Alternatives ) )
            // InternalMGLang.g:218:3: ( rule__PatternCommand__Alternatives )
            {
             before(grammarAccess.getPatternCommandAccess().getAlternatives()); 
            // InternalMGLang.g:219:3: ( rule__PatternCommand__Alternatives )
            // InternalMGLang.g:219:4: rule__PatternCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PatternCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternCommand"


    // $ANTLR start "entryRulePatternReturn"
    // InternalMGLang.g:228:1: entryRulePatternReturn : rulePatternReturn EOF ;
    public final void entryRulePatternReturn() throws RecognitionException {
        try {
            // InternalMGLang.g:229:1: ( rulePatternReturn EOF )
            // InternalMGLang.g:230:1: rulePatternReturn EOF
            {
             before(grammarAccess.getPatternReturnRule()); 
            pushFollow(FOLLOW_1);
            rulePatternReturn();

            state._fsp--;

             after(grammarAccess.getPatternReturnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:237:1: rulePatternReturn : ( ( rule__PatternReturn__Group__0 ) ) ;
    public final void rulePatternReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:241:2: ( ( ( rule__PatternReturn__Group__0 ) ) )
            // InternalMGLang.g:242:2: ( ( rule__PatternReturn__Group__0 ) )
            {
            // InternalMGLang.g:242:2: ( ( rule__PatternReturn__Group__0 ) )
            // InternalMGLang.g:243:3: ( rule__PatternReturn__Group__0 )
            {
             before(grammarAccess.getPatternReturnAccess().getGroup()); 
            // InternalMGLang.g:244:3: ( rule__PatternReturn__Group__0 )
            // InternalMGLang.g:244:4: rule__PatternReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternReturnAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:253:1: entryRuleParamManipulation : ruleParamManipulation EOF ;
    public final void entryRuleParamManipulation() throws RecognitionException {
        try {
            // InternalMGLang.g:254:1: ( ruleParamManipulation EOF )
            // InternalMGLang.g:255:1: ruleParamManipulation EOF
            {
             before(grammarAccess.getParamManipulationRule()); 
            pushFollow(FOLLOW_1);
            ruleParamManipulation();

            state._fsp--;

             after(grammarAccess.getParamManipulationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:262:1: ruleParamManipulation : ( ( rule__ParamManipulation__Group__0 ) ) ;
    public final void ruleParamManipulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:266:2: ( ( ( rule__ParamManipulation__Group__0 ) ) )
            // InternalMGLang.g:267:2: ( ( rule__ParamManipulation__Group__0 ) )
            {
            // InternalMGLang.g:267:2: ( ( rule__ParamManipulation__Group__0 ) )
            // InternalMGLang.g:268:3: ( rule__ParamManipulation__Group__0 )
            {
             before(grammarAccess.getParamManipulationAccess().getGroup()); 
            // InternalMGLang.g:269:3: ( rule__ParamManipulation__Group__0 )
            // InternalMGLang.g:269:4: rule__ParamManipulation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamManipulationAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:278:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalMGLang.g:279:1: ( ruleNode EOF )
            // InternalMGLang.g:280:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:287:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:291:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalMGLang.g:292:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalMGLang.g:292:2: ( ( rule__Node__Group__0 ) )
            // InternalMGLang.g:293:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalMGLang.g:294:3: ( rule__Node__Group__0 )
            // InternalMGLang.g:294:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:303:1: entryRuleNodeContent : ruleNodeContent EOF ;
    public final void entryRuleNodeContent() throws RecognitionException {
        try {
            // InternalMGLang.g:304:1: ( ruleNodeContent EOF )
            // InternalMGLang.g:305:1: ruleNodeContent EOF
            {
             before(grammarAccess.getNodeContentRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeContent();

            state._fsp--;

             after(grammarAccess.getNodeContentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:312:1: ruleNodeContent : ( ( rule__NodeContent__Group__0 ) ) ;
    public final void ruleNodeContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:316:2: ( ( ( rule__NodeContent__Group__0 ) ) )
            // InternalMGLang.g:317:2: ( ( rule__NodeContent__Group__0 ) )
            {
            // InternalMGLang.g:317:2: ( ( rule__NodeContent__Group__0 ) )
            // InternalMGLang.g:318:3: ( rule__NodeContent__Group__0 )
            {
             before(grammarAccess.getNodeContentAccess().getGroup()); 
            // InternalMGLang.g:319:3: ( rule__NodeContent__Group__0 )
            // InternalMGLang.g:319:4: rule__NodeContent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeContentAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:328:1: entryRulePatternCall : rulePatternCall EOF ;
    public final void entryRulePatternCall() throws RecognitionException {
        try {
            // InternalMGLang.g:329:1: ( rulePatternCall EOF )
            // InternalMGLang.g:330:1: rulePatternCall EOF
            {
             before(grammarAccess.getPatternCallRule()); 
            pushFollow(FOLLOW_1);
            rulePatternCall();

            state._fsp--;

             after(grammarAccess.getPatternCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:337:1: rulePatternCall : ( ( rule__PatternCall__Group__0 ) ) ;
    public final void rulePatternCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:341:2: ( ( ( rule__PatternCall__Group__0 ) ) )
            // InternalMGLang.g:342:2: ( ( rule__PatternCall__Group__0 ) )
            {
            // InternalMGLang.g:342:2: ( ( rule__PatternCall__Group__0 ) )
            // InternalMGLang.g:343:3: ( rule__PatternCall__Group__0 )
            {
             before(grammarAccess.getPatternCallAccess().getGroup()); 
            // InternalMGLang.g:344:3: ( rule__PatternCall__Group__0 )
            // InternalMGLang.g:344:4: rule__PatternCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternCallAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:353:1: entryRuleNodeReferenceOrAssignmentOrControlFlow : ruleNodeReferenceOrAssignmentOrControlFlow EOF ;
    public final void entryRuleNodeReferenceOrAssignmentOrControlFlow() throws RecognitionException {
        try {
            // InternalMGLang.g:354:1: ( ruleNodeReferenceOrAssignmentOrControlFlow EOF )
            // InternalMGLang.g:355:1: ruleNodeReferenceOrAssignmentOrControlFlow EOF
            {
             before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeReferenceOrAssignmentOrControlFlow();

            state._fsp--;

             after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:362:1: ruleNodeReferenceOrAssignmentOrControlFlow : ( ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives ) ) ;
    public final void ruleNodeReferenceOrAssignmentOrControlFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:366:2: ( ( ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives ) ) )
            // InternalMGLang.g:367:2: ( ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives ) )
            {
            // InternalMGLang.g:367:2: ( ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives ) )
            // InternalMGLang.g:368:3: ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives )
            {
             before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAlternatives()); 
            // InternalMGLang.g:369:3: ( rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives )
            // InternalMGLang.g:369:4: rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:378:1: entryRulePatternNodeReference : rulePatternNodeReference EOF ;
    public final void entryRulePatternNodeReference() throws RecognitionException {
        try {
            // InternalMGLang.g:379:1: ( rulePatternNodeReference EOF )
            // InternalMGLang.g:380:1: rulePatternNodeReference EOF
            {
             before(grammarAccess.getPatternNodeReferenceRule()); 
            pushFollow(FOLLOW_1);
            rulePatternNodeReference();

            state._fsp--;

             after(grammarAccess.getPatternNodeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:387:1: rulePatternNodeReference : ( ( rule__PatternNodeReference__Group__0 ) ) ;
    public final void rulePatternNodeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:391:2: ( ( ( rule__PatternNodeReference__Group__0 ) ) )
            // InternalMGLang.g:392:2: ( ( rule__PatternNodeReference__Group__0 ) )
            {
            // InternalMGLang.g:392:2: ( ( rule__PatternNodeReference__Group__0 ) )
            // InternalMGLang.g:393:3: ( rule__PatternNodeReference__Group__0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 
            // InternalMGLang.g:394:3: ( rule__PatternNodeReference__Group__0 )
            // InternalMGLang.g:394:4: rule__PatternNodeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:403:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:404:1: ( ruleAssignment EOF )
            // InternalMGLang.g:405:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:412:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:416:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMGLang.g:417:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMGLang.g:417:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMGLang.g:418:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalMGLang.g:419:3: ( rule__Assignment__Group__0 )
            // InternalMGLang.g:419:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:428:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:429:1: ( ruleParameter EOF )
            // InternalMGLang.g:430:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:437:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:441:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalMGLang.g:442:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalMGLang.g:442:2: ( ( rule__Parameter__Alternatives ) )
            // InternalMGLang.g:443:3: ( rule__Parameter__Alternatives )
            {
             before(grammarAccess.getParameterAccess().getAlternatives()); 
            // InternalMGLang.g:444:3: ( rule__Parameter__Alternatives )
            // InternalMGLang.g:444:4: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:453:1: entryRulePrimitiveParameter : rulePrimitiveParameter EOF ;
    public final void entryRulePrimitiveParameter() throws RecognitionException {
        try {
            // InternalMGLang.g:454:1: ( rulePrimitiveParameter EOF )
            // InternalMGLang.g:455:1: rulePrimitiveParameter EOF
            {
             before(grammarAccess.getPrimitiveParameterRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveParameter();

            state._fsp--;

             after(grammarAccess.getPrimitiveParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:462:1: rulePrimitiveParameter : ( ( rule__PrimitiveParameter__Group__0 ) ) ;
    public final void rulePrimitiveParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:466:2: ( ( ( rule__PrimitiveParameter__Group__0 ) ) )
            // InternalMGLang.g:467:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            {
            // InternalMGLang.g:467:2: ( ( rule__PrimitiveParameter__Group__0 ) )
            // InternalMGLang.g:468:3: ( rule__PrimitiveParameter__Group__0 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getGroup()); 
            // InternalMGLang.g:469:3: ( rule__PrimitiveParameter__Group__0 )
            // InternalMGLang.g:469:4: rule__PrimitiveParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveParameterAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:478:1: entryRuleParameterNode : ruleParameterNode EOF ;
    public final void entryRuleParameterNode() throws RecognitionException {
        try {
            // InternalMGLang.g:479:1: ( ruleParameterNode EOF )
            // InternalMGLang.g:480:1: ruleParameterNode EOF
            {
             before(grammarAccess.getParameterNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterNode();

            state._fsp--;

             after(grammarAccess.getParameterNodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:487:1: ruleParameterNode : ( ( rule__ParameterNode__Group__0 ) ) ;
    public final void ruleParameterNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:491:2: ( ( ( rule__ParameterNode__Group__0 ) ) )
            // InternalMGLang.g:492:2: ( ( rule__ParameterNode__Group__0 ) )
            {
            // InternalMGLang.g:492:2: ( ( rule__ParameterNode__Group__0 ) )
            // InternalMGLang.g:493:3: ( rule__ParameterNode__Group__0 )
            {
             before(grammarAccess.getParameterNodeAccess().getGroup()); 
            // InternalMGLang.g:494:3: ( rule__ParameterNode__Group__0 )
            // InternalMGLang.g:494:4: rule__ParameterNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterNodeAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:503:1: entryRuleRefOrCall : ruleRefOrCall EOF ;
    public final void entryRuleRefOrCall() throws RecognitionException {
        try {
            // InternalMGLang.g:504:1: ( ruleRefOrCall EOF )
            // InternalMGLang.g:505:1: ruleRefOrCall EOF
            {
             before(grammarAccess.getRefOrCallRule()); 
            pushFollow(FOLLOW_1);
            ruleRefOrCall();

            state._fsp--;

             after(grammarAccess.getRefOrCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:512:1: ruleRefOrCall : ( ( rule__RefOrCall__Group__0 ) ) ;
    public final void ruleRefOrCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:516:2: ( ( ( rule__RefOrCall__Group__0 ) ) )
            // InternalMGLang.g:517:2: ( ( rule__RefOrCall__Group__0 ) )
            {
            // InternalMGLang.g:517:2: ( ( rule__RefOrCall__Group__0 ) )
            // InternalMGLang.g:518:3: ( rule__RefOrCall__Group__0 )
            {
             before(grammarAccess.getRefOrCallAccess().getGroup()); 
            // InternalMGLang.g:519:3: ( rule__RefOrCall__Group__0 )
            // InternalMGLang.g:519:4: rule__RefOrCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefOrCallAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:528:1: entryRuleRefParams : ruleRefParams EOF ;
    public final void entryRuleRefParams() throws RecognitionException {
        try {
            // InternalMGLang.g:529:1: ( ruleRefParams EOF )
            // InternalMGLang.g:530:1: ruleRefParams EOF
            {
             before(grammarAccess.getRefParamsRule()); 
            pushFollow(FOLLOW_1);
            ruleRefParams();

            state._fsp--;

             after(grammarAccess.getRefParamsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:537:1: ruleRefParams : ( ( rule__RefParams__Group__0 ) ) ;
    public final void ruleRefParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:541:2: ( ( ( rule__RefParams__Group__0 ) ) )
            // InternalMGLang.g:542:2: ( ( rule__RefParams__Group__0 ) )
            {
            // InternalMGLang.g:542:2: ( ( rule__RefParams__Group__0 ) )
            // InternalMGLang.g:543:3: ( rule__RefParams__Group__0 )
            {
             before(grammarAccess.getRefParamsAccess().getGroup()); 
            // InternalMGLang.g:544:3: ( rule__RefParams__Group__0 )
            // InternalMGLang.g:544:4: rule__RefParams__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefParamsAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:553:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalMGLang.g:554:1: ( ruleGenerator EOF )
            // InternalMGLang.g:555:1: ruleGenerator EOF
            {
             before(grammarAccess.getGeneratorRule()); 
            pushFollow(FOLLOW_1);
            ruleGenerator();

            state._fsp--;

             after(grammarAccess.getGeneratorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:562:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:566:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalMGLang.g:567:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalMGLang.g:567:2: ( ( rule__Generator__Group__0 ) )
            // InternalMGLang.g:568:3: ( rule__Generator__Group__0 )
            {
             before(grammarAccess.getGeneratorAccess().getGroup()); 
            // InternalMGLang.g:569:3: ( rule__Generator__Group__0 )
            // InternalMGLang.g:569:4: rule__Generator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:578:1: entryRuleGeneratorExpression : ruleGeneratorExpression EOF ;
    public final void entryRuleGeneratorExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:579:1: ( ruleGeneratorExpression EOF )
            // InternalMGLang.g:580:1: ruleGeneratorExpression EOF
            {
             before(grammarAccess.getGeneratorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneratorExpression();

            state._fsp--;

             after(grammarAccess.getGeneratorExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:587:1: ruleGeneratorExpression : ( ( rule__GeneratorExpression__Alternatives ) ) ;
    public final void ruleGeneratorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:591:2: ( ( ( rule__GeneratorExpression__Alternatives ) ) )
            // InternalMGLang.g:592:2: ( ( rule__GeneratorExpression__Alternatives ) )
            {
            // InternalMGLang.g:592:2: ( ( rule__GeneratorExpression__Alternatives ) )
            // InternalMGLang.g:593:3: ( rule__GeneratorExpression__Alternatives )
            {
             before(grammarAccess.getGeneratorExpressionAccess().getAlternatives()); 
            // InternalMGLang.g:594:3: ( rule__GeneratorExpression__Alternatives )
            // InternalMGLang.g:594:4: rule__GeneratorExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GeneratorExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:603:1: entryRulePatternVariable : rulePatternVariable EOF ;
    public final void entryRulePatternVariable() throws RecognitionException {
        try {
            // InternalMGLang.g:604:1: ( rulePatternVariable EOF )
            // InternalMGLang.g:605:1: rulePatternVariable EOF
            {
             before(grammarAccess.getPatternVariableRule()); 
            pushFollow(FOLLOW_1);
            rulePatternVariable();

            state._fsp--;

             after(grammarAccess.getPatternVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:612:1: rulePatternVariable : ( ( rule__PatternVariable__Group__0 ) ) ;
    public final void rulePatternVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:616:2: ( ( ( rule__PatternVariable__Group__0 ) ) )
            // InternalMGLang.g:617:2: ( ( rule__PatternVariable__Group__0 ) )
            {
            // InternalMGLang.g:617:2: ( ( rule__PatternVariable__Group__0 ) )
            // InternalMGLang.g:618:3: ( rule__PatternVariable__Group__0 )
            {
             before(grammarAccess.getPatternVariableAccess().getGroup()); 
            // InternalMGLang.g:619:3: ( rule__PatternVariable__Group__0 )
            // InternalMGLang.g:619:4: rule__PatternVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternVariableAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariable"
    // InternalMGLang.g:628:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMGLang.g:629:1: ( ruleVariable EOF )
            // InternalMGLang.g:630:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMGLang.g:637:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:641:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMGLang.g:642:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMGLang.g:642:2: ( ( rule__Variable__Group__0 ) )
            // InternalMGLang.g:643:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMGLang.g:644:3: ( rule__Variable__Group__0 )
            // InternalMGLang.g:644:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleForStatement"
    // InternalMGLang.g:653:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalMGLang.g:654:1: ( ruleForStatement EOF )
            // InternalMGLang.g:655:1: ruleForStatement EOF
            {
             before(grammarAccess.getForStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleForStatement();

            state._fsp--;

             after(grammarAccess.getForStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:662:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:666:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalMGLang.g:667:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalMGLang.g:667:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalMGLang.g:668:3: ( rule__ForStatement__Group__0 )
            {
             before(grammarAccess.getForStatementAccess().getGroup()); 
            // InternalMGLang.g:669:3: ( rule__ForStatement__Group__0 )
            // InternalMGLang.g:669:4: rule__ForStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForStatementAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:678:1: entryRuleForHead : ruleForHead EOF ;
    public final void entryRuleForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:679:1: ( ruleForHead EOF )
            // InternalMGLang.g:680:1: ruleForHead EOF
            {
             before(grammarAccess.getForHeadRule()); 
            pushFollow(FOLLOW_1);
            ruleForHead();

            state._fsp--;

             after(grammarAccess.getForHeadRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:687:1: ruleForHead : ( ( rule__ForHead__Alternatives ) ) ;
    public final void ruleForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:691:2: ( ( ( rule__ForHead__Alternatives ) ) )
            // InternalMGLang.g:692:2: ( ( rule__ForHead__Alternatives ) )
            {
            // InternalMGLang.g:692:2: ( ( rule__ForHead__Alternatives ) )
            // InternalMGLang.g:693:3: ( rule__ForHead__Alternatives )
            {
             before(grammarAccess.getForHeadAccess().getAlternatives()); 
            // InternalMGLang.g:694:3: ( rule__ForHead__Alternatives )
            // InternalMGLang.g:694:4: rule__ForHead__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ForHead__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getForHeadAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:703:1: entryRuleGeneralForHead : ruleGeneralForHead EOF ;
    public final void entryRuleGeneralForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:704:1: ( ruleGeneralForHead EOF )
            // InternalMGLang.g:705:1: ruleGeneralForHead EOF
            {
             before(grammarAccess.getGeneralForHeadRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralForHead();

            state._fsp--;

             after(grammarAccess.getGeneralForHeadRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:712:1: ruleGeneralForHead : ( ( rule__GeneralForHead__Group__0 ) ) ;
    public final void ruleGeneralForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:716:2: ( ( ( rule__GeneralForHead__Group__0 ) ) )
            // InternalMGLang.g:717:2: ( ( rule__GeneralForHead__Group__0 ) )
            {
            // InternalMGLang.g:717:2: ( ( rule__GeneralForHead__Group__0 ) )
            // InternalMGLang.g:718:3: ( rule__GeneralForHead__Group__0 )
            {
             before(grammarAccess.getGeneralForHeadAccess().getGroup()); 
            // InternalMGLang.g:719:3: ( rule__GeneralForHead__Group__0 )
            // InternalMGLang.g:719:4: rule__GeneralForHead__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralForHeadAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:728:1: entryRuleForEachHead : ruleForEachHead EOF ;
    public final void entryRuleForEachHead() throws RecognitionException {
        try {
            // InternalMGLang.g:729:1: ( ruleForEachHead EOF )
            // InternalMGLang.g:730:1: ruleForEachHead EOF
            {
             before(grammarAccess.getForEachHeadRule()); 
            pushFollow(FOLLOW_1);
            ruleForEachHead();

            state._fsp--;

             after(grammarAccess.getForEachHeadRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:737:1: ruleForEachHead : ( ( rule__ForEachHead__Group__0 ) ) ;
    public final void ruleForEachHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:741:2: ( ( ( rule__ForEachHead__Group__0 ) ) )
            // InternalMGLang.g:742:2: ( ( rule__ForEachHead__Group__0 ) )
            {
            // InternalMGLang.g:742:2: ( ( rule__ForEachHead__Group__0 ) )
            // InternalMGLang.g:743:3: ( rule__ForEachHead__Group__0 )
            {
             before(grammarAccess.getForEachHeadAccess().getGroup()); 
            // InternalMGLang.g:744:3: ( rule__ForEachHead__Group__0 )
            // InternalMGLang.g:744:4: rule__ForEachHead__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForEachHeadAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:753:1: entryRuleForBody : ruleForBody EOF ;
    public final void entryRuleForBody() throws RecognitionException {
        try {
            // InternalMGLang.g:754:1: ( ruleForBody EOF )
            // InternalMGLang.g:755:1: ruleForBody EOF
            {
             before(grammarAccess.getForBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleForBody();

            state._fsp--;

             after(grammarAccess.getForBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:762:1: ruleForBody : ( ( rule__ForBody__Group__0 ) ) ;
    public final void ruleForBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:766:2: ( ( ( rule__ForBody__Group__0 ) ) )
            // InternalMGLang.g:767:2: ( ( rule__ForBody__Group__0 ) )
            {
            // InternalMGLang.g:767:2: ( ( rule__ForBody__Group__0 ) )
            // InternalMGLang.g:768:3: ( rule__ForBody__Group__0 )
            {
             before(grammarAccess.getForBodyAccess().getGroup()); 
            // InternalMGLang.g:769:3: ( rule__ForBody__Group__0 )
            // InternalMGLang.g:769:4: rule__ForBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForBodyAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:778:1: entryRuleSwitchExpression : ruleSwitchExpression EOF ;
    public final void entryRuleSwitchExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:779:1: ( ruleSwitchExpression EOF )
            // InternalMGLang.g:780:1: ruleSwitchExpression EOF
            {
             before(grammarAccess.getSwitchExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSwitchExpression();

            state._fsp--;

             after(grammarAccess.getSwitchExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:787:1: ruleSwitchExpression : ( ( rule__SwitchExpression__Alternatives ) ) ;
    public final void ruleSwitchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:791:2: ( ( ( rule__SwitchExpression__Alternatives ) ) )
            // InternalMGLang.g:792:2: ( ( rule__SwitchExpression__Alternatives ) )
            {
            // InternalMGLang.g:792:2: ( ( rule__SwitchExpression__Alternatives ) )
            // InternalMGLang.g:793:3: ( rule__SwitchExpression__Alternatives )
            {
             before(grammarAccess.getSwitchExpressionAccess().getAlternatives()); 
            // InternalMGLang.g:794:3: ( rule__SwitchExpression__Alternatives )
            // InternalMGLang.g:794:4: rule__SwitchExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SwitchExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSwitchExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:803:1: entryRuleSwitch : ruleSwitch EOF ;
    public final void entryRuleSwitch() throws RecognitionException {
        try {
            // InternalMGLang.g:804:1: ( ruleSwitch EOF )
            // InternalMGLang.g:805:1: ruleSwitch EOF
            {
             before(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            ruleSwitch();

            state._fsp--;

             after(grammarAccess.getSwitchRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:812:1: ruleSwitch : ( ( rule__Switch__Alternatives ) ) ;
    public final void ruleSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:816:2: ( ( ( rule__Switch__Alternatives ) ) )
            // InternalMGLang.g:817:2: ( ( rule__Switch__Alternatives ) )
            {
            // InternalMGLang.g:817:2: ( ( rule__Switch__Alternatives ) )
            // InternalMGLang.g:818:3: ( rule__Switch__Alternatives )
            {
             before(grammarAccess.getSwitchAccess().getAlternatives()); 
            // InternalMGLang.g:819:3: ( rule__Switch__Alternatives )
            // InternalMGLang.g:819:4: rule__Switch__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Switch__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:828:1: entryRuleIfElseSwitch : ruleIfElseSwitch EOF ;
    public final void entryRuleIfElseSwitch() throws RecognitionException {
        try {
            // InternalMGLang.g:829:1: ( ruleIfElseSwitch EOF )
            // InternalMGLang.g:830:1: ruleIfElseSwitch EOF
            {
             before(grammarAccess.getIfElseSwitchRule()); 
            pushFollow(FOLLOW_1);
            ruleIfElseSwitch();

            state._fsp--;

             after(grammarAccess.getIfElseSwitchRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:837:1: ruleIfElseSwitch : ( ( rule__IfElseSwitch__Group__0 ) ) ;
    public final void ruleIfElseSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:841:2: ( ( ( rule__IfElseSwitch__Group__0 ) ) )
            // InternalMGLang.g:842:2: ( ( rule__IfElseSwitch__Group__0 ) )
            {
            // InternalMGLang.g:842:2: ( ( rule__IfElseSwitch__Group__0 ) )
            // InternalMGLang.g:843:3: ( rule__IfElseSwitch__Group__0 )
            {
             before(grammarAccess.getIfElseSwitchAccess().getGroup()); 
            // InternalMGLang.g:844:3: ( rule__IfElseSwitch__Group__0 )
            // InternalMGLang.g:844:4: rule__IfElseSwitch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfElseSwitchAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:853:1: entryRuleIfElseCase : ruleIfElseCase EOF ;
    public final void entryRuleIfElseCase() throws RecognitionException {
        try {
            // InternalMGLang.g:854:1: ( ruleIfElseCase EOF )
            // InternalMGLang.g:855:1: ruleIfElseCase EOF
            {
             before(grammarAccess.getIfElseCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleIfElseCase();

            state._fsp--;

             after(grammarAccess.getIfElseCaseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:862:1: ruleIfElseCase : ( ( rule__IfElseCase__Group__0 ) ) ;
    public final void ruleIfElseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:866:2: ( ( ( rule__IfElseCase__Group__0 ) ) )
            // InternalMGLang.g:867:2: ( ( rule__IfElseCase__Group__0 ) )
            {
            // InternalMGLang.g:867:2: ( ( rule__IfElseCase__Group__0 ) )
            // InternalMGLang.g:868:3: ( rule__IfElseCase__Group__0 )
            {
             before(grammarAccess.getIfElseCaseAccess().getGroup()); 
            // InternalMGLang.g:869:3: ( rule__IfElseCase__Group__0 )
            // InternalMGLang.g:869:4: rule__IfElseCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfElseCaseAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:878:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // InternalMGLang.g:879:1: ( ruleDefault EOF )
            // InternalMGLang.g:880:1: ruleDefault EOF
            {
             before(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getDefaultRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:887:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:891:2: ( ( ( rule__Default__Group__0 ) ) )
            // InternalMGLang.g:892:2: ( ( rule__Default__Group__0 ) )
            {
            // InternalMGLang.g:892:2: ( ( rule__Default__Group__0 ) )
            // InternalMGLang.g:893:3: ( rule__Default__Group__0 )
            {
             before(grammarAccess.getDefaultAccess().getGroup()); 
            // InternalMGLang.g:894:3: ( rule__Default__Group__0 )
            // InternalMGLang.g:894:4: rule__Default__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:903:1: entryRuleSwitchCase : ruleSwitchCase EOF ;
    public final void entryRuleSwitchCase() throws RecognitionException {
        try {
            // InternalMGLang.g:904:1: ( ruleSwitchCase EOF )
            // InternalMGLang.g:905:1: ruleSwitchCase EOF
            {
             before(grammarAccess.getSwitchCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleSwitchCase();

            state._fsp--;

             after(grammarAccess.getSwitchCaseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:912:1: ruleSwitchCase : ( ( rule__SwitchCase__Group__0 ) ) ;
    public final void ruleSwitchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:916:2: ( ( ( rule__SwitchCase__Group__0 ) ) )
            // InternalMGLang.g:917:2: ( ( rule__SwitchCase__Group__0 ) )
            {
            // InternalMGLang.g:917:2: ( ( rule__SwitchCase__Group__0 ) )
            // InternalMGLang.g:918:3: ( rule__SwitchCase__Group__0 )
            {
             before(grammarAccess.getSwitchCaseAccess().getGroup()); 
            // InternalMGLang.g:919:3: ( rule__SwitchCase__Group__0 )
            // InternalMGLang.g:919:4: rule__SwitchCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSwitchCaseAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:928:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalMGLang.g:929:1: ( ruleCase EOF )
            // InternalMGLang.g:930:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:937:1: ruleCase : ( ( rule__Case__Alternatives ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:941:2: ( ( ( rule__Case__Alternatives ) ) )
            // InternalMGLang.g:942:2: ( ( rule__Case__Alternatives ) )
            {
            // InternalMGLang.g:942:2: ( ( rule__Case__Alternatives ) )
            // InternalMGLang.g:943:3: ( rule__Case__Alternatives )
            {
             before(grammarAccess.getCaseAccess().getAlternatives()); 
            // InternalMGLang.g:944:3: ( rule__Case__Alternatives )
            // InternalMGLang.g:944:4: rule__Case__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Case__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:953:1: entryRuleCaseWithCast : ruleCaseWithCast EOF ;
    public final void entryRuleCaseWithCast() throws RecognitionException {
        try {
            // InternalMGLang.g:954:1: ( ruleCaseWithCast EOF )
            // InternalMGLang.g:955:1: ruleCaseWithCast EOF
            {
             before(grammarAccess.getCaseWithCastRule()); 
            pushFollow(FOLLOW_1);
            ruleCaseWithCast();

            state._fsp--;

             after(grammarAccess.getCaseWithCastRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:962:1: ruleCaseWithCast : ( ( rule__CaseWithCast__Group__0 ) ) ;
    public final void ruleCaseWithCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:966:2: ( ( ( rule__CaseWithCast__Group__0 ) ) )
            // InternalMGLang.g:967:2: ( ( rule__CaseWithCast__Group__0 ) )
            {
            // InternalMGLang.g:967:2: ( ( rule__CaseWithCast__Group__0 ) )
            // InternalMGLang.g:968:3: ( rule__CaseWithCast__Group__0 )
            {
             before(grammarAccess.getCaseWithCastAccess().getGroup()); 
            // InternalMGLang.g:969:3: ( rule__CaseWithCast__Group__0 )
            // InternalMGLang.g:969:4: rule__CaseWithCast__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseWithCastAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:978:1: entryRuleCaseWithoutCast : ruleCaseWithoutCast EOF ;
    public final void entryRuleCaseWithoutCast() throws RecognitionException {
        try {
            // InternalMGLang.g:979:1: ( ruleCaseWithoutCast EOF )
            // InternalMGLang.g:980:1: ruleCaseWithoutCast EOF
            {
             before(grammarAccess.getCaseWithoutCastRule()); 
            pushFollow(FOLLOW_1);
            ruleCaseWithoutCast();

            state._fsp--;

             after(grammarAccess.getCaseWithoutCastRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:987:1: ruleCaseWithoutCast : ( ( rule__CaseWithoutCast__Group__0 ) ) ;
    public final void ruleCaseWithoutCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:991:2: ( ( ( rule__CaseWithoutCast__Group__0 ) ) )
            // InternalMGLang.g:992:2: ( ( rule__CaseWithoutCast__Group__0 ) )
            {
            // InternalMGLang.g:992:2: ( ( rule__CaseWithoutCast__Group__0 ) )
            // InternalMGLang.g:993:3: ( rule__CaseWithoutCast__Group__0 )
            {
             before(grammarAccess.getCaseWithoutCastAccess().getGroup()); 
            // InternalMGLang.g:994:3: ( rule__CaseWithoutCast__Group__0 )
            // InternalMGLang.g:994:4: rule__CaseWithoutCast__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseWithoutCastAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1003:1: entryRuleCaseBody : ruleCaseBody EOF ;
    public final void entryRuleCaseBody() throws RecognitionException {
        try {
            // InternalMGLang.g:1004:1: ( ruleCaseBody EOF )
            // InternalMGLang.g:1005:1: ruleCaseBody EOF
            {
             before(grammarAccess.getCaseBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleCaseBody();

            state._fsp--;

             after(grammarAccess.getCaseBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1012:1: ruleCaseBody : ( ( rule__CaseBody__Alternatives ) ) ;
    public final void ruleCaseBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1016:2: ( ( ( rule__CaseBody__Alternatives ) ) )
            // InternalMGLang.g:1017:2: ( ( rule__CaseBody__Alternatives ) )
            {
            // InternalMGLang.g:1017:2: ( ( rule__CaseBody__Alternatives ) )
            // InternalMGLang.g:1018:3: ( rule__CaseBody__Alternatives )
            {
             before(grammarAccess.getCaseBodyAccess().getAlternatives()); 
            // InternalMGLang.g:1019:3: ( rule__CaseBody__Alternatives )
            // InternalMGLang.g:1019:4: rule__CaseBody__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CaseBody__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCaseBodyAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1028:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMGLang.g:1029:1: ( ruleCollection EOF )
            // InternalMGLang.g:1030:1: ruleCollection EOF
            {
             before(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1037:1: ruleCollection : ( ( rule__Collection__Alternatives ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1041:2: ( ( ( rule__Collection__Alternatives ) ) )
            // InternalMGLang.g:1042:2: ( ( rule__Collection__Alternatives ) )
            {
            // InternalMGLang.g:1042:2: ( ( rule__Collection__Alternatives ) )
            // InternalMGLang.g:1043:3: ( rule__Collection__Alternatives )
            {
             before(grammarAccess.getCollectionAccess().getAlternatives()); 
            // InternalMGLang.g:1044:3: ( rule__Collection__Alternatives )
            // InternalMGLang.g:1044:4: rule__Collection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1053:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMGLang.g:1054:1: ( ruleList EOF )
            // InternalMGLang.g:1055:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1062:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1066:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalMGLang.g:1067:2: ( ( rule__List__Group__0 ) )
            {
            // InternalMGLang.g:1067:2: ( ( rule__List__Group__0 ) )
            // InternalMGLang.g:1068:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalMGLang.g:1069:3: ( rule__List__Group__0 )
            // InternalMGLang.g:1069:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1078:1: entryRuleListAssignment : ruleListAssignment EOF ;
    public final void entryRuleListAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:1079:1: ( ruleListAssignment EOF )
            // InternalMGLang.g:1080:1: ruleListAssignment EOF
            {
             before(grammarAccess.getListAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleListAssignment();

            state._fsp--;

             after(grammarAccess.getListAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1087:1: ruleListAssignment : ( ( rule__ListAssignment__Alternatives ) ) ;
    public final void ruleListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1091:2: ( ( ( rule__ListAssignment__Alternatives ) ) )
            // InternalMGLang.g:1092:2: ( ( rule__ListAssignment__Alternatives ) )
            {
            // InternalMGLang.g:1092:2: ( ( rule__ListAssignment__Alternatives ) )
            // InternalMGLang.g:1093:3: ( rule__ListAssignment__Alternatives )
            {
             before(grammarAccess.getListAssignmentAccess().getAlternatives()); 
            // InternalMGLang.g:1094:3: ( rule__ListAssignment__Alternatives )
            // InternalMGLang.g:1094:4: rule__ListAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListAssignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListAssignmentAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1103:1: entryRuleListAdHoc : ruleListAdHoc EOF ;
    public final void entryRuleListAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:1104:1: ( ruleListAdHoc EOF )
            // InternalMGLang.g:1105:1: ruleListAdHoc EOF
            {
             before(grammarAccess.getListAdHocRule()); 
            pushFollow(FOLLOW_1);
            ruleListAdHoc();

            state._fsp--;

             after(grammarAccess.getListAdHocRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1112:1: ruleListAdHoc : ( ( rule__ListAdHoc__Group__0 ) ) ;
    public final void ruleListAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1116:2: ( ( ( rule__ListAdHoc__Group__0 ) ) )
            // InternalMGLang.g:1117:2: ( ( rule__ListAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:1117:2: ( ( rule__ListAdHoc__Group__0 ) )
            // InternalMGLang.g:1118:3: ( rule__ListAdHoc__Group__0 )
            {
             before(grammarAccess.getListAdHocAccess().getGroup()); 
            // InternalMGLang.g:1119:3: ( rule__ListAdHoc__Group__0 )
            // InternalMGLang.g:1119:4: rule__ListAdHoc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAdHocAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1128:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalMGLang.g:1129:1: ( ruleMap EOF )
            // InternalMGLang.g:1130:1: ruleMap EOF
            {
             before(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getMapRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1137:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1141:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalMGLang.g:1142:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalMGLang.g:1142:2: ( ( rule__Map__Group__0 ) )
            // InternalMGLang.g:1143:3: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // InternalMGLang.g:1144:3: ( rule__Map__Group__0 )
            // InternalMGLang.g:1144:4: rule__Map__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1153:1: entryRuleMapAssignment : ruleMapAssignment EOF ;
    public final void entryRuleMapAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:1154:1: ( ruleMapAssignment EOF )
            // InternalMGLang.g:1155:1: ruleMapAssignment EOF
            {
             before(grammarAccess.getMapAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleMapAssignment();

            state._fsp--;

             after(grammarAccess.getMapAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1162:1: ruleMapAssignment : ( ( rule__MapAssignment__Alternatives ) ) ;
    public final void ruleMapAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1166:2: ( ( ( rule__MapAssignment__Alternatives ) ) )
            // InternalMGLang.g:1167:2: ( ( rule__MapAssignment__Alternatives ) )
            {
            // InternalMGLang.g:1167:2: ( ( rule__MapAssignment__Alternatives ) )
            // InternalMGLang.g:1168:3: ( rule__MapAssignment__Alternatives )
            {
             before(grammarAccess.getMapAssignmentAccess().getAlternatives()); 
            // InternalMGLang.g:1169:3: ( rule__MapAssignment__Alternatives )
            // InternalMGLang.g:1169:4: rule__MapAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MapAssignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMapAssignmentAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1178:1: entryRuleMapAdHoc : ruleMapAdHoc EOF ;
    public final void entryRuleMapAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:1179:1: ( ruleMapAdHoc EOF )
            // InternalMGLang.g:1180:1: ruleMapAdHoc EOF
            {
             before(grammarAccess.getMapAdHocRule()); 
            pushFollow(FOLLOW_1);
            ruleMapAdHoc();

            state._fsp--;

             after(grammarAccess.getMapAdHocRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1187:1: ruleMapAdHoc : ( ( rule__MapAdHoc__Group__0 ) ) ;
    public final void ruleMapAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1191:2: ( ( ( rule__MapAdHoc__Group__0 ) ) )
            // InternalMGLang.g:1192:2: ( ( rule__MapAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:1192:2: ( ( rule__MapAdHoc__Group__0 ) )
            // InternalMGLang.g:1193:3: ( rule__MapAdHoc__Group__0 )
            {
             before(grammarAccess.getMapAdHocAccess().getGroup()); 
            // InternalMGLang.g:1194:3: ( rule__MapAdHoc__Group__0 )
            // InternalMGLang.g:1194:4: rule__MapAdHoc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapAdHocAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1203:1: entryRuleMapTupel : ruleMapTupel EOF ;
    public final void entryRuleMapTupel() throws RecognitionException {
        try {
            // InternalMGLang.g:1204:1: ( ruleMapTupel EOF )
            // InternalMGLang.g:1205:1: ruleMapTupel EOF
            {
             before(grammarAccess.getMapTupelRule()); 
            pushFollow(FOLLOW_1);
            ruleMapTupel();

            state._fsp--;

             after(grammarAccess.getMapTupelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1212:1: ruleMapTupel : ( ( rule__MapTupel__Group__0 ) ) ;
    public final void ruleMapTupel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1216:2: ( ( ( rule__MapTupel__Group__0 ) ) )
            // InternalMGLang.g:1217:2: ( ( rule__MapTupel__Group__0 ) )
            {
            // InternalMGLang.g:1217:2: ( ( rule__MapTupel__Group__0 ) )
            // InternalMGLang.g:1218:3: ( rule__MapTupel__Group__0 )
            {
             before(grammarAccess.getMapTupelAccess().getGroup()); 
            // InternalMGLang.g:1219:3: ( rule__MapTupel__Group__0 )
            // InternalMGLang.g:1219:4: rule__MapTupel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapTupelAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1228:1: entryRuleForRange : ruleForRange EOF ;
    public final void entryRuleForRange() throws RecognitionException {
        try {
            // InternalMGLang.g:1229:1: ( ruleForRange EOF )
            // InternalMGLang.g:1230:1: ruleForRange EOF
            {
             before(grammarAccess.getForRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleForRange();

            state._fsp--;

             after(grammarAccess.getForRangeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1237:1: ruleForRange : ( ( rule__ForRange__Group__0 ) ) ;
    public final void ruleForRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1241:2: ( ( ( rule__ForRange__Group__0 ) ) )
            // InternalMGLang.g:1242:2: ( ( rule__ForRange__Group__0 ) )
            {
            // InternalMGLang.g:1242:2: ( ( rule__ForRange__Group__0 ) )
            // InternalMGLang.g:1243:3: ( rule__ForRange__Group__0 )
            {
             before(grammarAccess.getForRangeAccess().getGroup()); 
            // InternalMGLang.g:1244:3: ( rule__ForRange__Group__0 )
            // InternalMGLang.g:1244:4: rule__ForRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForRangeAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1253:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1254:1: ( ruleArithmeticExpression EOF )
            // InternalMGLang.g:1255:1: ruleArithmeticExpression EOF
            {
             before(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1262:1: ruleArithmeticExpression : ( ruleTertiaryExpression ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1266:2: ( ( ruleTertiaryExpression ) )
            // InternalMGLang.g:1267:2: ( ruleTertiaryExpression )
            {
            // InternalMGLang.g:1267:2: ( ruleTertiaryExpression )
            // InternalMGLang.g:1268:3: ruleTertiaryExpression
            {
             before(grammarAccess.getArithmeticExpressionAccess().getTertiaryExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTertiaryExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getTertiaryExpressionParserRuleCall()); 

            }


            }

        }
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
    // InternalMGLang.g:1278:1: entryRuleTertiaryExpression : ruleTertiaryExpression EOF ;
    public final void entryRuleTertiaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1279:1: ( ruleTertiaryExpression EOF )
            // InternalMGLang.g:1280:1: ruleTertiaryExpression EOF
            {
             before(grammarAccess.getTertiaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTertiaryExpression();

            state._fsp--;

             after(grammarAccess.getTertiaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1287:1: ruleTertiaryExpression : ( ( rule__TertiaryExpression__Group__0 ) ) ;
    public final void ruleTertiaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1291:2: ( ( ( rule__TertiaryExpression__Group__0 ) ) )
            // InternalMGLang.g:1292:2: ( ( rule__TertiaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:1292:2: ( ( rule__TertiaryExpression__Group__0 ) )
            // InternalMGLang.g:1293:3: ( rule__TertiaryExpression__Group__0 )
            {
             before(grammarAccess.getTertiaryExpressionAccess().getGroup()); 
            // InternalMGLang.g:1294:3: ( rule__TertiaryExpression__Group__0 )
            // InternalMGLang.g:1294:4: rule__TertiaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTertiaryExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1303:1: entryRuleSecondaryExpression : ruleSecondaryExpression EOF ;
    public final void entryRuleSecondaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1304:1: ( ruleSecondaryExpression EOF )
            // InternalMGLang.g:1305:1: ruleSecondaryExpression EOF
            {
             before(grammarAccess.getSecondaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSecondaryExpression();

            state._fsp--;

             after(grammarAccess.getSecondaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1312:1: ruleSecondaryExpression : ( ( rule__SecondaryExpression__Group__0 ) ) ;
    public final void ruleSecondaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1316:2: ( ( ( rule__SecondaryExpression__Group__0 ) ) )
            // InternalMGLang.g:1317:2: ( ( rule__SecondaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:1317:2: ( ( rule__SecondaryExpression__Group__0 ) )
            // InternalMGLang.g:1318:3: ( rule__SecondaryExpression__Group__0 )
            {
             before(grammarAccess.getSecondaryExpressionAccess().getGroup()); 
            // InternalMGLang.g:1319:3: ( rule__SecondaryExpression__Group__0 )
            // InternalMGLang.g:1319:4: rule__SecondaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1328:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:1329:1: ( rulePrimaryExpr EOF )
            // InternalMGLang.g:1330:1: rulePrimaryExpr EOF
            {
             before(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpr();

            state._fsp--;

             after(grammarAccess.getPrimaryExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1337:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Group__0 ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1341:2: ( ( ( rule__PrimaryExpr__Group__0 ) ) )
            // InternalMGLang.g:1342:2: ( ( rule__PrimaryExpr__Group__0 ) )
            {
            // InternalMGLang.g:1342:2: ( ( rule__PrimaryExpr__Group__0 ) )
            // InternalMGLang.g:1343:3: ( rule__PrimaryExpr__Group__0 )
            {
             before(grammarAccess.getPrimaryExprAccess().getGroup()); 
            // InternalMGLang.g:1344:3: ( rule__PrimaryExpr__Group__0 )
            // InternalMGLang.g:1344:4: rule__PrimaryExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExprAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1353:1: entryRuleRelationExpression : ruleRelationExpression EOF ;
    public final void entryRuleRelationExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1354:1: ( ruleRelationExpression EOF )
            // InternalMGLang.g:1355:1: ruleRelationExpression EOF
            {
             before(grammarAccess.getRelationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationExpression();

            state._fsp--;

             after(grammarAccess.getRelationExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1362:1: ruleRelationExpression : ( ( rule__RelationExpression__Group__0 ) ) ;
    public final void ruleRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1366:2: ( ( ( rule__RelationExpression__Group__0 ) ) )
            // InternalMGLang.g:1367:2: ( ( rule__RelationExpression__Group__0 ) )
            {
            // InternalMGLang.g:1367:2: ( ( rule__RelationExpression__Group__0 ) )
            // InternalMGLang.g:1368:3: ( rule__RelationExpression__Group__0 )
            {
             before(grammarAccess.getRelationExpressionAccess().getGroup()); 
            // InternalMGLang.g:1369:3: ( rule__RelationExpression__Group__0 )
            // InternalMGLang.g:1369:4: rule__RelationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalMGLang.g:1378:1: entryRuleBaseExpr : ruleBaseExpr EOF ;
    public final void entryRuleBaseExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:1379:1: ( ruleBaseExpr EOF )
            // InternalMGLang.g:1380:1: ruleBaseExpr EOF
            {
             before(grammarAccess.getBaseExprRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseExpr();

            state._fsp--;

             after(grammarAccess.getBaseExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1387:1: ruleBaseExpr : ( ( rule__BaseExpr__Alternatives ) ) ;
    public final void ruleBaseExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1391:2: ( ( ( rule__BaseExpr__Alternatives ) ) )
            // InternalMGLang.g:1392:2: ( ( rule__BaseExpr__Alternatives ) )
            {
            // InternalMGLang.g:1392:2: ( ( rule__BaseExpr__Alternatives ) )
            // InternalMGLang.g:1393:3: ( rule__BaseExpr__Alternatives )
            {
             before(grammarAccess.getBaseExprAccess().getAlternatives()); 
            // InternalMGLang.g:1394:3: ( rule__BaseExpr__Alternatives )
            // InternalMGLang.g:1394:4: rule__BaseExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseExprAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1403:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1404:1: ( ruleLiteral EOF )
            // InternalMGLang.g:1405:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1412:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1416:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMGLang.g:1417:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMGLang.g:1417:2: ( ( rule__Literal__Alternatives ) )
            // InternalMGLang.g:1418:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalMGLang.g:1419:3: ( rule__Literal__Alternatives )
            // InternalMGLang.g:1419:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1428:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1429:1: ( ruleBooleanLiteral EOF )
            // InternalMGLang.g:1430:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1437:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1441:2: ( ( ( rule__BooleanLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1442:2: ( ( rule__BooleanLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1442:2: ( ( rule__BooleanLiteral__ValAssignment ) )
            // InternalMGLang.g:1443:3: ( rule__BooleanLiteral__ValAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValAssignment()); 
            // InternalMGLang.g:1444:3: ( rule__BooleanLiteral__ValAssignment )
            // InternalMGLang.g:1444:4: rule__BooleanLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValAssignment()); 

            }


            }

        }
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
    // InternalMGLang.g:1453:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1454:1: ( ruleStringLiteral EOF )
            // InternalMGLang.g:1455:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1462:1: ruleStringLiteral : ( ( rule__StringLiteral__ValAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1466:2: ( ( ( rule__StringLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1467:2: ( ( rule__StringLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1467:2: ( ( rule__StringLiteral__ValAssignment ) )
            // InternalMGLang.g:1468:3: ( rule__StringLiteral__ValAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValAssignment()); 
            // InternalMGLang.g:1469:3: ( rule__StringLiteral__ValAssignment )
            // InternalMGLang.g:1469:4: rule__StringLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValAssignment()); 

            }


            }

        }
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
    // InternalMGLang.g:1478:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1479:1: ( ruleNumberLiteral EOF )
            // InternalMGLang.g:1480:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMGLang.g:1487:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1491:2: ( ( ( rule__NumberLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1492:2: ( ( rule__NumberLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1492:2: ( ( rule__NumberLiteral__ValAssignment ) )
            // InternalMGLang.g:1493:3: ( rule__NumberLiteral__ValAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValAssignment()); 
            // InternalMGLang.g:1494:3: ( rule__NumberLiteral__ValAssignment )
            // InternalMGLang.g:1494:4: rule__NumberLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValAssignment()); 

            }


            }

        }
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
    // InternalMGLang.g:1503:1: ruleMathFunc : ( ( rule__MathFunc__Alternatives ) ) ;
    public final void ruleMathFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1507:1: ( ( ( rule__MathFunc__Alternatives ) ) )
            // InternalMGLang.g:1508:2: ( ( rule__MathFunc__Alternatives ) )
            {
            // InternalMGLang.g:1508:2: ( ( rule__MathFunc__Alternatives ) )
            // InternalMGLang.g:1509:3: ( rule__MathFunc__Alternatives )
            {
             before(grammarAccess.getMathFuncAccess().getAlternatives()); 
            // InternalMGLang.g:1510:3: ( rule__MathFunc__Alternatives )
            // InternalMGLang.g:1510:4: rule__MathFunc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MathFunc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathFuncAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1519:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1523:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMGLang.g:1524:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMGLang.g:1524:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMGLang.g:1525:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalMGLang.g:1526:3: ( rule__PrimitiveType__Alternatives )
            // InternalMGLang.g:1526:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1535:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1539:1: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // InternalMGLang.g:1540:2: ( ( rule__RelationalOp__Alternatives ) )
            {
            // InternalMGLang.g:1540:2: ( ( rule__RelationalOp__Alternatives ) )
            // InternalMGLang.g:1541:3: ( rule__RelationalOp__Alternatives )
            {
             before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            // InternalMGLang.g:1542:3: ( rule__RelationalOp__Alternatives )
            // InternalMGLang.g:1542:4: rule__RelationalOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOpAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1551:1: ruleTertiaryOp : ( ( rule__TertiaryOp__Alternatives ) ) ;
    public final void ruleTertiaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1555:1: ( ( ( rule__TertiaryOp__Alternatives ) ) )
            // InternalMGLang.g:1556:2: ( ( rule__TertiaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1556:2: ( ( rule__TertiaryOp__Alternatives ) )
            // InternalMGLang.g:1557:3: ( rule__TertiaryOp__Alternatives )
            {
             before(grammarAccess.getTertiaryOpAccess().getAlternatives()); 
            // InternalMGLang.g:1558:3: ( rule__TertiaryOp__Alternatives )
            // InternalMGLang.g:1558:4: rule__TertiaryOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTertiaryOpAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1567:1: ruleSecondaryOp : ( ( rule__SecondaryOp__Alternatives ) ) ;
    public final void ruleSecondaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1571:1: ( ( ( rule__SecondaryOp__Alternatives ) ) )
            // InternalMGLang.g:1572:2: ( ( rule__SecondaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1572:2: ( ( rule__SecondaryOp__Alternatives ) )
            // InternalMGLang.g:1573:3: ( rule__SecondaryOp__Alternatives )
            {
             before(grammarAccess.getSecondaryOpAccess().getAlternatives()); 
            // InternalMGLang.g:1574:3: ( rule__SecondaryOp__Alternatives )
            // InternalMGLang.g:1574:4: rule__SecondaryOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryOpAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMGLang.g:1583:1: rulePrimaryOp : ( ( rule__PrimaryOp__Alternatives ) ) ;
    public final void rulePrimaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1587:1: ( ( ( rule__PrimaryOp__Alternatives ) ) )
            // InternalMGLang.g:1588:2: ( ( rule__PrimaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1588:2: ( ( rule__PrimaryOp__Alternatives ) )
            // InternalMGLang.g:1589:3: ( rule__PrimaryOp__Alternatives )
            {
             before(grammarAccess.getPrimaryOpAccess().getAlternatives()); 
            // InternalMGLang.g:1590:3: ( rule__PrimaryOp__Alternatives )
            // InternalMGLang.g:1590:4: rule__PrimaryOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryOpAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__FileCommand__Alternatives"
    // InternalMGLang.g:1598:1: rule__FileCommand__Alternatives : ( ( rulePattern ) | ( ruleGenerator ) );
    public final void rule__FileCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1602:1: ( ( rulePattern ) | ( ruleGenerator ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            else if ( (LA1_0==50) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGLang.g:1603:2: ( rulePattern )
                    {
                    // InternalMGLang.g:1603:2: ( rulePattern )
                    // InternalMGLang.g:1604:3: rulePattern
                    {
                     before(grammarAccess.getFileCommandAccess().getPatternParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePattern();

                    state._fsp--;

                     after(grammarAccess.getFileCommandAccess().getPatternParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1609:2: ( ruleGenerator )
                    {
                    // InternalMGLang.g:1609:2: ( ruleGenerator )
                    // InternalMGLang.g:1610:3: ruleGenerator
                    {
                     before(grammarAccess.getFileCommandAccess().getGeneratorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGenerator();

                    state._fsp--;

                     after(grammarAccess.getFileCommandAccess().getGeneratorParserRuleCall_1()); 

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
    // $ANTLR end "rule__FileCommand__Alternatives"


    // $ANTLR start "rule__PatternCommand__Alternatives"
    // InternalMGLang.g:1619:1: rule__PatternCommand__Alternatives : ( ( ruleCollection ) | ( ruleNode ) | ( ruleParamManipulation ) | ( ruleSwitch ) );
    public final void rule__PatternCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1623:1: ( ( ruleCollection ) | ( ruleNode ) | ( ruleParamManipulation ) | ( ruleSwitch ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 59:
            case 62:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID||LA2_2==48) ) {
                    alt2=2;
                }
                else if ( (LA2_2==42) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMGLang.g:1624:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1624:2: ( ruleCollection )
                    // InternalMGLang.g:1625:3: ruleCollection
                    {
                     before(grammarAccess.getPatternCommandAccess().getCollectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCollection();

                    state._fsp--;

                     after(grammarAccess.getPatternCommandAccess().getCollectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1630:2: ( ruleNode )
                    {
                    // InternalMGLang.g:1630:2: ( ruleNode )
                    // InternalMGLang.g:1631:3: ruleNode
                    {
                     before(grammarAccess.getPatternCommandAccess().getNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getPatternCommandAccess().getNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1636:2: ( ruleParamManipulation )
                    {
                    // InternalMGLang.g:1636:2: ( ruleParamManipulation )
                    // InternalMGLang.g:1637:3: ruleParamManipulation
                    {
                     before(grammarAccess.getPatternCommandAccess().getParamManipulationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParamManipulation();

                    state._fsp--;

                     after(grammarAccess.getPatternCommandAccess().getParamManipulationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1642:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1642:2: ( ruleSwitch )
                    // InternalMGLang.g:1643:3: ruleSwitch
                    {
                     before(grammarAccess.getPatternCommandAccess().getSwitchParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSwitch();

                    state._fsp--;

                     after(grammarAccess.getPatternCommandAccess().getSwitchParserRuleCall_3()); 

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
    // $ANTLR end "rule__PatternCommand__Alternatives"


    // $ANTLR start "rule__Node__Alternatives_3"
    // InternalMGLang.g:1652:1: rule__Node__Alternatives_3 : ( ( ( rule__Node__CreatedByAssignment_3_0 ) ) | ( ( rule__Node__Group_3_1__0 ) ) );
    public final void rule__Node__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1656:1: ( ( ( rule__Node__CreatedByAssignment_3_0 ) ) | ( ( rule__Node__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==42) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ASSIGNMENT_OP) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMGLang.g:1657:2: ( ( rule__Node__CreatedByAssignment_3_0 ) )
                    {
                    // InternalMGLang.g:1657:2: ( ( rule__Node__CreatedByAssignment_3_0 ) )
                    // InternalMGLang.g:1658:3: ( rule__Node__CreatedByAssignment_3_0 )
                    {
                     before(grammarAccess.getNodeAccess().getCreatedByAssignment_3_0()); 
                    // InternalMGLang.g:1659:3: ( rule__Node__CreatedByAssignment_3_0 )
                    // InternalMGLang.g:1659:4: rule__Node__CreatedByAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__CreatedByAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getCreatedByAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1663:2: ( ( rule__Node__Group_3_1__0 ) )
                    {
                    // InternalMGLang.g:1663:2: ( ( rule__Node__Group_3_1__0 ) )
                    // InternalMGLang.g:1664:3: ( rule__Node__Group_3_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_1()); 
                    // InternalMGLang.g:1665:3: ( rule__Node__Group_3_1__0 )
                    // InternalMGLang.g:1665:4: rule__Node__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Node__Alternatives_3"


    // $ANTLR start "rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives"
    // InternalMGLang.g:1673:1: rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives : ( ( rulePatternNodeReference ) | ( ruleAssignment ) | ( ruleSwitch ) );
    public final void rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1677:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) | ( ruleSwitch ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==49) ) {
                    alt4=1;
                }
                else if ( (LA4_1==RULE_ASSIGNMENT_OP) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==54) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGLang.g:1678:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:1678:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:1679:3: rulePatternNodeReference
                    {
                     before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getPatternNodeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePatternNodeReference();

                    state._fsp--;

                     after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getPatternNodeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1684:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:1684:2: ( ruleAssignment )
                    // InternalMGLang.g:1685:3: ruleAssignment
                    {
                     before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1690:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1690:2: ( ruleSwitch )
                    // InternalMGLang.g:1691:3: ruleSwitch
                    {
                     before(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getSwitchParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSwitch();

                    state._fsp--;

                     after(grammarAccess.getNodeReferenceOrAssignmentOrControlFlowAccess().getSwitchParserRuleCall_2()); 

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
    // InternalMGLang.g:1700:1: rule__Parameter__Alternatives : ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1704:1: ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=19 && LA5_0<=22)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMGLang.g:1705:2: ( rulePrimitiveParameter )
                    {
                    // InternalMGLang.g:1705:2: ( rulePrimitiveParameter )
                    // InternalMGLang.g:1706:3: rulePrimitiveParameter
                    {
                     before(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveParameter();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getPrimitiveParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1711:2: ( ruleParameterNode )
                    {
                    // InternalMGLang.g:1711:2: ( ruleParameterNode )
                    // InternalMGLang.g:1712:3: ruleParameterNode
                    {
                     before(grammarAccess.getParameterAccess().getParameterNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterNode();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getParameterNodeParserRuleCall_1()); 

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
    // InternalMGLang.g:1721:1: rule__GeneratorExpression__Alternatives : ( ( ruleForStatement ) | ( ruleSwitch ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) | ( ruleVariable ) );
    public final void rule__GeneratorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1725:1: ( ( ruleForStatement ) | ( ruleSwitch ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) | ( ruleVariable ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt6=1;
                }
                break;
            case 54:
                {
                alt6=2;
                }
                break;
            case 59:
            case 62:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==40) ) {
                    alt6=4;
                }
                else if ( (LA6_4==RULE_ID) ) {
                    alt6=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:1726:2: ( ruleForStatement )
                    {
                    // InternalMGLang.g:1726:2: ( ruleForStatement )
                    // InternalMGLang.g:1727:3: ruleForStatement
                    {
                     before(grammarAccess.getGeneratorExpressionAccess().getForStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForStatement();

                    state._fsp--;

                     after(grammarAccess.getGeneratorExpressionAccess().getForStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1732:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1732:2: ( ruleSwitch )
                    // InternalMGLang.g:1733:3: ruleSwitch
                    {
                     before(grammarAccess.getGeneratorExpressionAccess().getSwitchParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSwitch();

                    state._fsp--;

                     after(grammarAccess.getGeneratorExpressionAccess().getSwitchParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1738:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1738:2: ( ruleCollection )
                    // InternalMGLang.g:1739:3: ruleCollection
                    {
                     before(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCollection();

                    state._fsp--;

                     after(grammarAccess.getGeneratorExpressionAccess().getCollectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1744:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1744:2: ( rulePatternCall )
                    // InternalMGLang.g:1745:3: rulePatternCall
                    {
                     before(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePatternCall();

                    state._fsp--;

                     after(grammarAccess.getGeneratorExpressionAccess().getPatternCallParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1750:2: ( rulePatternVariable )
                    {
                    // InternalMGLang.g:1750:2: ( rulePatternVariable )
                    // InternalMGLang.g:1751:3: rulePatternVariable
                    {
                     before(grammarAccess.getGeneratorExpressionAccess().getPatternVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePatternVariable();

                    state._fsp--;

                     after(grammarAccess.getGeneratorExpressionAccess().getPatternVariableParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:1756:2: ( ruleVariable )
                    {
                    // InternalMGLang.g:1756:2: ( ruleVariable )
                    // InternalMGLang.g:1757:3: ruleVariable
                    {
                     before(grammarAccess.getGeneratorExpressionAccess().getVariableParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getGeneratorExpressionAccess().getVariableParserRuleCall_5()); 

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
    // InternalMGLang.g:1766:1: rule__ForHead__Alternatives : ( ( ruleGeneralForHead ) | ( ruleForEachHead ) );
    public final void rule__ForHead__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1770:1: ( ( ruleGeneralForHead ) | ( ruleForEachHead ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==30||LA7_1==48) ) {
                    alt7=2;
                }
                else if ( (LA7_1==53) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGLang.g:1771:2: ( ruleGeneralForHead )
                    {
                    // InternalMGLang.g:1771:2: ( ruleGeneralForHead )
                    // InternalMGLang.g:1772:3: ruleGeneralForHead
                    {
                     before(grammarAccess.getForHeadAccess().getGeneralForHeadParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralForHead();

                    state._fsp--;

                     after(grammarAccess.getForHeadAccess().getGeneralForHeadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1777:2: ( ruleForEachHead )
                    {
                    // InternalMGLang.g:1777:2: ( ruleForEachHead )
                    // InternalMGLang.g:1778:3: ruleForEachHead
                    {
                     before(grammarAccess.getForHeadAccess().getForEachHeadParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleForEachHead();

                    state._fsp--;

                     after(grammarAccess.getForHeadAccess().getForEachHeadParserRuleCall_1()); 

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
    // InternalMGLang.g:1787:1: rule__SwitchExpression__Alternatives : ( ( ruleForStatement ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) | ( ruleNodeReferenceOrAssignmentOrControlFlow ) );
    public final void rule__SwitchExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1791:1: ( ( ruleForStatement ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) | ( ruleNodeReferenceOrAssignmentOrControlFlow ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt8=1;
                }
                break;
            case 59:
            case 62:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt8=3;
                    }
                    break;
                case RULE_ASSIGNMENT_OP:
                case 49:
                    {
                    alt8=5;
                    }
                    break;
                case RULE_ID:
                    {
                    alt8=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }

                }
                break;
            case 54:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMGLang.g:1792:2: ( ruleForStatement )
                    {
                    // InternalMGLang.g:1792:2: ( ruleForStatement )
                    // InternalMGLang.g:1793:3: ruleForStatement
                    {
                     before(grammarAccess.getSwitchExpressionAccess().getForStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForStatement();

                    state._fsp--;

                     after(grammarAccess.getSwitchExpressionAccess().getForStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1798:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1798:2: ( ruleCollection )
                    // InternalMGLang.g:1799:3: ruleCollection
                    {
                     before(grammarAccess.getSwitchExpressionAccess().getCollectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCollection();

                    state._fsp--;

                     after(grammarAccess.getSwitchExpressionAccess().getCollectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1804:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1804:2: ( rulePatternCall )
                    // InternalMGLang.g:1805:3: rulePatternCall
                    {
                     before(grammarAccess.getSwitchExpressionAccess().getPatternCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePatternCall();

                    state._fsp--;

                     after(grammarAccess.getSwitchExpressionAccess().getPatternCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1810:2: ( rulePatternVariable )
                    {
                    // InternalMGLang.g:1810:2: ( rulePatternVariable )
                    // InternalMGLang.g:1811:3: rulePatternVariable
                    {
                     before(grammarAccess.getSwitchExpressionAccess().getPatternVariableParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePatternVariable();

                    state._fsp--;

                     after(grammarAccess.getSwitchExpressionAccess().getPatternVariableParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1816:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
                    {
                    // InternalMGLang.g:1816:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
                    // InternalMGLang.g:1817:3: ruleNodeReferenceOrAssignmentOrControlFlow
                    {
                     before(grammarAccess.getSwitchExpressionAccess().getNodeReferenceOrAssignmentOrControlFlowParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeReferenceOrAssignmentOrControlFlow();

                    state._fsp--;

                     after(grammarAccess.getSwitchExpressionAccess().getNodeReferenceOrAssignmentOrControlFlowParserRuleCall_4()); 

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
    // InternalMGLang.g:1826:1: rule__Switch__Alternatives : ( ( ruleIfElseSwitch ) | ( ruleSwitchCase ) );
    public final void rule__Switch__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1830:1: ( ( ruleIfElseSwitch ) | ( ruleSwitchCase ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==54) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==42) ) {
                    alt9=1;
                }
                else if ( (LA9_1==40) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGLang.g:1831:2: ( ruleIfElseSwitch )
                    {
                    // InternalMGLang.g:1831:2: ( ruleIfElseSwitch )
                    // InternalMGLang.g:1832:3: ruleIfElseSwitch
                    {
                     before(grammarAccess.getSwitchAccess().getIfElseSwitchParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIfElseSwitch();

                    state._fsp--;

                     after(grammarAccess.getSwitchAccess().getIfElseSwitchParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1837:2: ( ruleSwitchCase )
                    {
                    // InternalMGLang.g:1837:2: ( ruleSwitchCase )
                    // InternalMGLang.g:1838:3: ruleSwitchCase
                    {
                     before(grammarAccess.getSwitchAccess().getSwitchCaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSwitchCase();

                    state._fsp--;

                     after(grammarAccess.getSwitchAccess().getSwitchCaseParserRuleCall_1()); 

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
    // InternalMGLang.g:1847:1: rule__Case__Alternatives : ( ( ruleCaseWithCast ) | ( ruleCaseWithoutCast ) );
    public final void rule__Case__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1851:1: ( ( ruleCaseWithCast ) | ( ruleCaseWithoutCast ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==55) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=RULE_TRUE && LA10_1<=RULE_FALSE)||LA10_1==RULE_STRING||LA10_1==RULE_DOUBLE||(LA10_1>=17 && LA10_1<=18)||LA10_1==40||LA10_1==63) ) {
                    alt10=2;
                }
                else if ( (LA10_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 48:
                        {
                        int LA10_4 = input.LA(4);

                        if ( (LA10_4==RULE_ID) ) {
                            int LA10_6 = input.LA(5);

                            if ( (LA10_6==RULE_ID) ) {
                                alt10=1;
                            }
                            else if ( ((LA10_6>=23 && LA10_6<=36)||LA10_6==40||LA10_6==48||LA10_6==56) ) {
                                alt10=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 40:
                    case 56:
                        {
                        alt10=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt10=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:1852:2: ( ruleCaseWithCast )
                    {
                    // InternalMGLang.g:1852:2: ( ruleCaseWithCast )
                    // InternalMGLang.g:1853:3: ruleCaseWithCast
                    {
                     before(grammarAccess.getCaseAccess().getCaseWithCastParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCaseWithCast();

                    state._fsp--;

                     after(grammarAccess.getCaseAccess().getCaseWithCastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1858:2: ( ruleCaseWithoutCast )
                    {
                    // InternalMGLang.g:1858:2: ( ruleCaseWithoutCast )
                    // InternalMGLang.g:1859:3: ruleCaseWithoutCast
                    {
                     before(grammarAccess.getCaseAccess().getCaseWithoutCastParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCaseWithoutCast();

                    state._fsp--;

                     after(grammarAccess.getCaseAccess().getCaseWithoutCastParserRuleCall_1()); 

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
    // InternalMGLang.g:1868:1: rule__CaseBody__Alternatives : ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__Group_1__0 ) ) );
    public final void rule__CaseBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1872:1: ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||LA11_0==52||LA11_0==54||LA11_0==59||LA11_0==62) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:1873:2: ( ( rule__CaseBody__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1873:2: ( ( rule__CaseBody__Group_0__0 ) )
                    // InternalMGLang.g:1874:3: ( rule__CaseBody__Group_0__0 )
                    {
                     before(grammarAccess.getCaseBodyAccess().getGroup_0()); 
                    // InternalMGLang.g:1875:3: ( rule__CaseBody__Group_0__0 )
                    // InternalMGLang.g:1875:4: rule__CaseBody__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseBody__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCaseBodyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1879:2: ( ( rule__CaseBody__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1879:2: ( ( rule__CaseBody__Group_1__0 ) )
                    // InternalMGLang.g:1880:3: ( rule__CaseBody__Group_1__0 )
                    {
                     before(grammarAccess.getCaseBodyAccess().getGroup_1()); 
                    // InternalMGLang.g:1881:3: ( rule__CaseBody__Group_1__0 )
                    // InternalMGLang.g:1881:4: rule__CaseBody__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseBody__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCaseBodyAccess().getGroup_1()); 

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
    // InternalMGLang.g:1889:1: rule__Collection__Alternatives : ( ( ruleList ) | ( ruleMap ) );
    public final void rule__Collection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1893:1: ( ( ruleList ) | ( ruleMap ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==59) ) {
                alt12=1;
            }
            else if ( (LA12_0==62) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGLang.g:1894:2: ( ruleList )
                    {
                    // InternalMGLang.g:1894:2: ( ruleList )
                    // InternalMGLang.g:1895:3: ruleList
                    {
                     before(grammarAccess.getCollectionAccess().getListParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getCollectionAccess().getListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1900:2: ( ruleMap )
                    {
                    // InternalMGLang.g:1900:2: ( ruleMap )
                    // InternalMGLang.g:1901:3: ruleMap
                    {
                     before(grammarAccess.getCollectionAccess().getMapParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMap();

                    state._fsp--;

                     after(grammarAccess.getCollectionAccess().getMapParserRuleCall_1()); 

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
    // InternalMGLang.g:1910:1: rule__ListAssignment__Alternatives : ( ( ruleListAdHoc ) | ( ruleRefOrCall ) );
    public final void rule__ListAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1914:1: ( ( ruleListAdHoc ) | ( ruleRefOrCall ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==60) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGLang.g:1915:2: ( ruleListAdHoc )
                    {
                    // InternalMGLang.g:1915:2: ( ruleListAdHoc )
                    // InternalMGLang.g:1916:3: ruleListAdHoc
                    {
                     before(grammarAccess.getListAssignmentAccess().getListAdHocParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListAdHoc();

                    state._fsp--;

                     after(grammarAccess.getListAssignmentAccess().getListAdHocParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1921:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1921:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1922:3: ruleRefOrCall
                    {
                     before(grammarAccess.getListAssignmentAccess().getRefOrCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefOrCall();

                    state._fsp--;

                     after(grammarAccess.getListAssignmentAccess().getRefOrCallParserRuleCall_1()); 

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
    // InternalMGLang.g:1931:1: rule__MapAssignment__Alternatives : ( ( ruleMapAdHoc ) | ( ruleRefOrCall ) );
    public final void rule__MapAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1935:1: ( ( ruleMapAdHoc ) | ( ruleRefOrCall ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==60) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMGLang.g:1936:2: ( ruleMapAdHoc )
                    {
                    // InternalMGLang.g:1936:2: ( ruleMapAdHoc )
                    // InternalMGLang.g:1937:3: ruleMapAdHoc
                    {
                     before(grammarAccess.getMapAssignmentAccess().getMapAdHocParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMapAdHoc();

                    state._fsp--;

                     after(grammarAccess.getMapAssignmentAccess().getMapAdHocParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1942:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1942:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1943:3: ruleRefOrCall
                    {
                     before(grammarAccess.getMapAssignmentAccess().getRefOrCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefOrCall();

                    state._fsp--;

                     after(grammarAccess.getMapAssignmentAccess().getRefOrCallParserRuleCall_1()); 

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
    // InternalMGLang.g:1952:1: rule__BaseExpr__Alternatives : ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ruleLiteral ) | ( ruleRefOrCall ) | ( rulePatternCall ) );
    public final void rule__BaseExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1956:1: ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ruleLiteral ) | ( ruleRefOrCall ) | ( rulePatternCall ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt15=1;
                }
                break;
            case 63:
                {
                alt15=2;
                }
                break;
            case 17:
            case 18:
                {
                alt15=3;
                }
                break;
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_STRING:
            case RULE_DOUBLE:
                {
                alt15=4;
                }
                break;
            case RULE_ID:
                {
                int LA15_5 = input.LA(2);

                if ( (LA15_5==EOF||LA15_5==RULE_NEWLINE||LA15_5==RULE_ID||(LA15_5>=23 && LA15_5<=36)||(LA15_5>=41 && LA15_5<=43)||LA15_5==45||LA15_5==48||(LA15_5>=51 && LA15_5<=52)||LA15_5==54||LA15_5==56||LA15_5==59||(LA15_5>=61 && LA15_5<=62)) ) {
                    alt15=5;
                }
                else if ( (LA15_5==40) ) {
                    alt15=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:1957:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1957:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    // InternalMGLang.g:1958:3: ( rule__BaseExpr__Group_0__0 )
                    {
                     before(grammarAccess.getBaseExprAccess().getGroup_0()); 
                    // InternalMGLang.g:1959:3: ( rule__BaseExpr__Group_0__0 )
                    // InternalMGLang.g:1959:4: rule__BaseExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpr__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1963:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1963:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    // InternalMGLang.g:1964:3: ( rule__BaseExpr__Group_1__0 )
                    {
                     before(grammarAccess.getBaseExprAccess().getGroup_1()); 
                    // InternalMGLang.g:1965:3: ( rule__BaseExpr__Group_1__0 )
                    // InternalMGLang.g:1965:4: rule__BaseExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseExprAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:1969:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    {
                    // InternalMGLang.g:1969:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    // InternalMGLang.g:1970:3: ( rule__BaseExpr__Group_2__0 )
                    {
                     before(grammarAccess.getBaseExprAccess().getGroup_2()); 
                    // InternalMGLang.g:1971:3: ( rule__BaseExpr__Group_2__0 )
                    // InternalMGLang.g:1971:4: rule__BaseExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseExpr__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseExprAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:1975:2: ( ruleLiteral )
                    {
                    // InternalMGLang.g:1975:2: ( ruleLiteral )
                    // InternalMGLang.g:1976:3: ruleLiteral
                    {
                     before(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getBaseExprAccess().getLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:1981:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1981:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1982:3: ruleRefOrCall
                    {
                     before(grammarAccess.getBaseExprAccess().getRefOrCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRefOrCall();

                    state._fsp--;

                     after(grammarAccess.getBaseExprAccess().getRefOrCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:1987:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1987:2: ( rulePatternCall )
                    // InternalMGLang.g:1988:3: rulePatternCall
                    {
                     before(grammarAccess.getBaseExprAccess().getPatternCallParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePatternCall();

                    state._fsp--;

                     after(grammarAccess.getBaseExprAccess().getPatternCallParserRuleCall_5()); 

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
    // InternalMGLang.g:1997:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2001:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMGLang.g:2002:2: ( ruleBooleanLiteral )
                    {
                    // InternalMGLang.g:2002:2: ( ruleBooleanLiteral )
                    // InternalMGLang.g:2003:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2008:2: ( ruleStringLiteral )
                    {
                    // InternalMGLang.g:2008:2: ( ruleStringLiteral )
                    // InternalMGLang.g:2009:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2014:2: ( ruleNumberLiteral )
                    {
                    // InternalMGLang.g:2014:2: ( ruleNumberLiteral )
                    // InternalMGLang.g:2015:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 

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
    // InternalMGLang.g:2024:1: rule__BooleanLiteral__ValAlternatives_0 : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
    public final void rule__BooleanLiteral__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2028:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_TRUE) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_FALSE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGLang.g:2029:2: ( RULE_TRUE )
                    {
                    // InternalMGLang.g:2029:2: ( RULE_TRUE )
                    // InternalMGLang.g:2030:3: RULE_TRUE
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValTRUETerminalRuleCall_0_0()); 
                    match(input,RULE_TRUE,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValTRUETerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2035:2: ( RULE_FALSE )
                    {
                    // InternalMGLang.g:2035:2: ( RULE_FALSE )
                    // InternalMGLang.g:2036:3: RULE_FALSE
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValFALSETerminalRuleCall_0_1()); 
                    match(input,RULE_FALSE,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValFALSETerminalRuleCall_0_1()); 

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
    // InternalMGLang.g:2045:1: rule__MathFunc__Alternatives : ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) );
    public final void rule__MathFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2049:1: ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMGLang.g:2050:2: ( ( 'sqrt' ) )
                    {
                    // InternalMGLang.g:2050:2: ( ( 'sqrt' ) )
                    // InternalMGLang.g:2051:3: ( 'sqrt' )
                    {
                     before(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2052:3: ( 'sqrt' )
                    // InternalMGLang.g:2052:4: 'sqrt'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2056:2: ( ( 'abs' ) )
                    {
                    // InternalMGLang.g:2056:2: ( ( 'abs' ) )
                    // InternalMGLang.g:2057:3: ( 'abs' )
                    {
                     before(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2058:3: ( 'abs' )
                    // InternalMGLang.g:2058:4: 'abs'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 

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
    // InternalMGLang.g:2066:1: rule__PrimitiveType__Alternatives : ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2070:1: ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt19=1;
                }
                break;
            case 20:
                {
                alt19=2;
                }
                break;
            case 21:
                {
                alt19=3;
                }
                break;
            case 22:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMGLang.g:2071:2: ( ( 'int' ) )
                    {
                    // InternalMGLang.g:2071:2: ( ( 'int' ) )
                    // InternalMGLang.g:2072:3: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2073:3: ( 'int' )
                    // InternalMGLang.g:2073:4: 'int'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2077:2: ( ( 'char' ) )
                    {
                    // InternalMGLang.g:2077:2: ( ( 'char' ) )
                    // InternalMGLang.g:2078:3: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2079:3: ( 'char' )
                    // InternalMGLang.g:2079:4: 'char'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2083:2: ( ( 'double' ) )
                    {
                    // InternalMGLang.g:2083:2: ( ( 'double' ) )
                    // InternalMGLang.g:2084:3: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:2085:3: ( 'double' )
                    // InternalMGLang.g:2085:4: 'double'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:2089:2: ( ( 'String' ) )
                    {
                    // InternalMGLang.g:2089:2: ( ( 'String' ) )
                    // InternalMGLang.g:2090:3: ( 'String' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalMGLang.g:2091:3: ( 'String' )
                    // InternalMGLang.g:2091:4: 'String'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

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
    // InternalMGLang.g:2099:1: rule__RelationalOp__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2103:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt20=1;
                }
                break;
            case 24:
                {
                alt20=2;
                }
                break;
            case 25:
                {
                alt20=3;
                }
                break;
            case 26:
                {
                alt20=4;
                }
                break;
            case 27:
                {
                alt20=5;
                }
                break;
            case 28:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMGLang.g:2104:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:2104:2: ( ( '>' ) )
                    // InternalMGLang.g:2105:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2106:3: ( '>' )
                    // InternalMGLang.g:2106:4: '>'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2110:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:2110:2: ( ( '>=' ) )
                    // InternalMGLang.g:2111:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2112:3: ( '>=' )
                    // InternalMGLang.g:2112:4: '>='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2116:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:2116:2: ( ( '==' ) )
                    // InternalMGLang.g:2117:3: ( '==' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:2118:3: ( '==' )
                    // InternalMGLang.g:2118:4: '=='
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:2122:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:2122:2: ( ( '!=' ) )
                    // InternalMGLang.g:2123:3: ( '!=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    // InternalMGLang.g:2124:3: ( '!=' )
                    // InternalMGLang.g:2124:4: '!='
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:2128:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:2128:2: ( ( '<=' ) )
                    // InternalMGLang.g:2129:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    // InternalMGLang.g:2130:3: ( '<=' )
                    // InternalMGLang.g:2130:4: '<='
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:2134:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:2134:2: ( ( '<' ) )
                    // InternalMGLang.g:2135:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getLESSEnumLiteralDeclaration_5()); 
                    // InternalMGLang.g:2136:3: ( '<' )
                    // InternalMGLang.g:2136:4: '<'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getLESSEnumLiteralDeclaration_5()); 

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
    // InternalMGLang.g:2144:1: rule__TertiaryOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) );
    public final void rule__TertiaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2148:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMGLang.g:2149:2: ( ( '+' ) )
                    {
                    // InternalMGLang.g:2149:2: ( ( '+' ) )
                    // InternalMGLang.g:2150:3: ( '+' )
                    {
                     before(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2151:3: ( '+' )
                    // InternalMGLang.g:2151:4: '+'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2155:2: ( ( '-' ) )
                    {
                    // InternalMGLang.g:2155:2: ( ( '-' ) )
                    // InternalMGLang.g:2156:3: ( '-' )
                    {
                     before(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2157:3: ( '-' )
                    // InternalMGLang.g:2157:4: '-'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2161:2: ( ( '||' ) )
                    {
                    // InternalMGLang.g:2161:2: ( ( '||' ) )
                    // InternalMGLang.g:2162:3: ( '||' )
                    {
                     before(grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:2163:3: ( '||' )
                    // InternalMGLang.g:2163:4: '||'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2()); 

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
    // InternalMGLang.g:2171:1: rule__SecondaryOp__Alternatives : ( ( ( '%' ) ) | ( ( '^' ) ) );
    public final void rule__SecondaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2175:1: ( ( ( '%' ) ) | ( ( '^' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMGLang.g:2176:2: ( ( '%' ) )
                    {
                    // InternalMGLang.g:2176:2: ( ( '%' ) )
                    // InternalMGLang.g:2177:3: ( '%' )
                    {
                     before(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2178:3: ( '%' )
                    // InternalMGLang.g:2178:4: '%'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2182:2: ( ( '^' ) )
                    {
                    // InternalMGLang.g:2182:2: ( ( '^' ) )
                    // InternalMGLang.g:2183:3: ( '^' )
                    {
                     before(grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2184:3: ( '^' )
                    // InternalMGLang.g:2184:4: '^'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1()); 

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
    // InternalMGLang.g:2192:1: rule__PrimaryOp__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) );
    public final void rule__PrimaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2196:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt23=1;
                }
                break;
            case 35:
                {
                alt23=2;
                }
                break;
            case 36:
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
                    // InternalMGLang.g:2197:2: ( ( '*' ) )
                    {
                    // InternalMGLang.g:2197:2: ( ( '*' ) )
                    // InternalMGLang.g:2198:3: ( '*' )
                    {
                     before(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2199:3: ( '*' )
                    // InternalMGLang.g:2199:4: '*'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2203:2: ( ( '/' ) )
                    {
                    // InternalMGLang.g:2203:2: ( ( '/' ) )
                    // InternalMGLang.g:2204:3: ( '/' )
                    {
                     before(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2205:3: ( '/' )
                    // InternalMGLang.g:2205:4: '/'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2209:2: ( ( '&&' ) )
                    {
                    // InternalMGLang.g:2209:2: ( ( '&&' ) )
                    // InternalMGLang.g:2210:3: ( '&&' )
                    {
                     before(grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:2211:3: ( '&&' )
                    // InternalMGLang.g:2211:4: '&&'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2()); 

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
    // InternalMGLang.g:2219:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2223:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:2224:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MofgenFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2231:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2235:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:2236:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:2236:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:2237:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            // InternalMGLang.g:2238:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGLang.g:2238:3: rule__MofgenFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MofgenFile__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:2246:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2 ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2250:1: ( rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2 )
            // InternalMGLang.g:2251:2: rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MofgenFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2258:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__ConfigAssignment_1 ) ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2262:1: ( ( ( rule__MofgenFile__ConfigAssignment_1 ) ) )
            // InternalMGLang.g:2263:1: ( ( rule__MofgenFile__ConfigAssignment_1 ) )
            {
            // InternalMGLang.g:2263:1: ( ( rule__MofgenFile__ConfigAssignment_1 ) )
            // InternalMGLang.g:2264:2: ( rule__MofgenFile__ConfigAssignment_1 )
            {
             before(grammarAccess.getMofgenFileAccess().getConfigAssignment_1()); 
            // InternalMGLang.g:2265:2: ( rule__MofgenFile__ConfigAssignment_1 )
            // InternalMGLang.g:2265:3: rule__MofgenFile__ConfigAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__ConfigAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMofgenFileAccess().getConfigAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:2273:1: rule__MofgenFile__Group__2 : rule__MofgenFile__Group__2__Impl ;
    public final void rule__MofgenFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2277:1: ( rule__MofgenFile__Group__2__Impl )
            // InternalMGLang.g:2278:2: rule__MofgenFile__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MofgenFile__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2284:1: rule__MofgenFile__Group__2__Impl : ( ( rule__MofgenFile__CommandsAssignment_2 )* ) ;
    public final void rule__MofgenFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2288:1: ( ( ( rule__MofgenFile__CommandsAssignment_2 )* ) )
            // InternalMGLang.g:2289:1: ( ( rule__MofgenFile__CommandsAssignment_2 )* )
            {
            // InternalMGLang.g:2289:1: ( ( rule__MofgenFile__CommandsAssignment_2 )* )
            // InternalMGLang.g:2290:2: ( rule__MofgenFile__CommandsAssignment_2 )*
            {
             before(grammarAccess.getMofgenFileAccess().getCommandsAssignment_2()); 
            // InternalMGLang.g:2291:2: ( rule__MofgenFile__CommandsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44||LA25_0==50) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMGLang.g:2291:3: rule__MofgenFile__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__MofgenFile__CommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMofgenFileAccess().getCommandsAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:2300:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2304:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:2305:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2312:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2316:1: ( ( 'import' ) )
            // InternalMGLang.g:2317:1: ( 'import' )
            {
            // InternalMGLang.g:2317:1: ( 'import' )
            // InternalMGLang.g:2318:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:2327:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2331:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:2332:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2339:1: rule__Import__Group__1__Impl : ( ( rule__Import__UriAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2343:1: ( ( ( rule__Import__UriAssignment_1 ) ) )
            // InternalMGLang.g:2344:1: ( ( rule__Import__UriAssignment_1 ) )
            {
            // InternalMGLang.g:2344:1: ( ( rule__Import__UriAssignment_1 ) )
            // InternalMGLang.g:2345:2: ( rule__Import__UriAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getUriAssignment_1()); 
            // InternalMGLang.g:2346:2: ( rule__Import__UriAssignment_1 )
            // InternalMGLang.g:2346:3: rule__Import__UriAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__UriAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getUriAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:2354:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2358:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:2359:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2366:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2370:1: ( ( 'as' ) )
            // InternalMGLang.g:2371:1: ( 'as' )
            {
            // InternalMGLang.g:2371:1: ( 'as' )
            // InternalMGLang.g:2372:2: 'as'
            {
             before(grammarAccess.getImportAccess().getAsKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getAsKeyword_2()); 

            }


            }

        }
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
    // InternalMGLang.g:2381:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2385:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:2386:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2392:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2396:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalMGLang.g:2397:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalMGLang.g:2397:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalMGLang.g:2398:2: ( rule__Import__NameAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            // InternalMGLang.g:2399:2: ( rule__Import__NameAssignment_3 )
            // InternalMGLang.g:2399:3: rule__Import__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalMGLang.g:2408:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2412:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // InternalMGLang.g:2413:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2420:1: rule__Config__Group__0__Impl : ( () ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2424:1: ( ( () ) )
            // InternalMGLang.g:2425:1: ( () )
            {
            // InternalMGLang.g:2425:1: ( () )
            // InternalMGLang.g:2426:2: ()
            {
             before(grammarAccess.getConfigAccess().getConfigAction_0()); 
            // InternalMGLang.g:2427:2: ()
            // InternalMGLang.g:2427:3: 
            {
            }

             after(grammarAccess.getConfigAccess().getConfigAction_0()); 

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
    // InternalMGLang.g:2435:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2439:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // InternalMGLang.g:2440:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2447:1: rule__Config__Group__1__Impl : ( 'config' ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2451:1: ( ( 'config' ) )
            // InternalMGLang.g:2452:1: ( 'config' )
            {
            // InternalMGLang.g:2452:1: ( 'config' )
            // InternalMGLang.g:2453:2: 'config'
            {
             before(grammarAccess.getConfigAccess().getConfigKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getConfigKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:2462:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2466:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // InternalMGLang.g:2467:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2474:1: rule__Config__Group__2__Impl : ( '(' ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2478:1: ( ( '(' ) )
            // InternalMGLang.g:2479:1: ( '(' )
            {
            // InternalMGLang.g:2479:1: ( '(' )
            // InternalMGLang.g:2480:2: '('
            {
             before(grammarAccess.getConfigAccess().getLeftParenthesisKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalMGLang.g:2489:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2493:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // InternalMGLang.g:2494:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2501:1: rule__Config__Group__3__Impl : ( ')' ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2505:1: ( ( ')' ) )
            // InternalMGLang.g:2506:1: ( ')' )
            {
            // InternalMGLang.g:2506:1: ( ')' )
            // InternalMGLang.g:2507:2: ')'
            {
             before(grammarAccess.getConfigAccess().getRightParenthesisKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:2516:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2520:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // InternalMGLang.g:2521:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2528:1: rule__Config__Group__4__Impl : ( '{' ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2532:1: ( ( '{' ) )
            // InternalMGLang.g:2533:1: ( '{' )
            {
            // InternalMGLang.g:2533:1: ( '{' )
            // InternalMGLang.g:2534:2: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMGLang.g:2543:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2547:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // InternalMGLang.g:2548:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Config__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2555:1: rule__Config__Group__5__Impl : ( ( rule__Config__ExpressionsAssignment_5 )* ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2559:1: ( ( ( rule__Config__ExpressionsAssignment_5 )* ) )
            // InternalMGLang.g:2560:1: ( ( rule__Config__ExpressionsAssignment_5 )* )
            {
            // InternalMGLang.g:2560:1: ( ( rule__Config__ExpressionsAssignment_5 )* )
            // InternalMGLang.g:2561:2: ( rule__Config__ExpressionsAssignment_5 )*
            {
             before(grammarAccess.getConfigAccess().getExpressionsAssignment_5()); 
            // InternalMGLang.g:2562:2: ( rule__Config__ExpressionsAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMGLang.g:2562:3: rule__Config__ExpressionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Config__ExpressionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getExpressionsAssignment_5()); 

            }


            }

        }
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
    // InternalMGLang.g:2570:1: rule__Config__Group__6 : rule__Config__Group__6__Impl ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2574:1: ( rule__Config__Group__6__Impl )
            // InternalMGLang.g:2575:2: rule__Config__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2581:1: rule__Config__Group__6__Impl : ( '}' ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2585:1: ( ( '}' ) )
            // InternalMGLang.g:2586:1: ( '}' )
            {
            // InternalMGLang.g:2586:1: ( '}' )
            // InternalMGLang.g:2587:2: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalMGLang.g:2597:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2601:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:2602:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2609:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2613:1: ( ( 'pattern' ) )
            // InternalMGLang.g:2614:1: ( 'pattern' )
            {
            // InternalMGLang.g:2614:1: ( 'pattern' )
            // InternalMGLang.g:2615:2: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:2624:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2628:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:2629:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2636:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2640:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:2641:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2641:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:2642:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2643:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:2643:3: rule__Pattern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:2651:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2655:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:2656:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2663:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2667:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:2668:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:2668:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:2669:2: ( rule__Pattern__Group_2__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalMGLang.g:2670:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:2670:3: rule__Pattern__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMGLang.g:2678:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2682:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:2683:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2690:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2694:1: ( ( '{' ) )
            // InternalMGLang.g:2695:1: ( '{' )
            {
            // InternalMGLang.g:2695:1: ( '{' )
            // InternalMGLang.g:2696:2: '{'
            {
             before(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:2705:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2709:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:2710:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Pattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2717:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__CommandsAssignment_4 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2721:1: ( ( ( rule__Pattern__CommandsAssignment_4 )* ) )
            // InternalMGLang.g:2722:1: ( ( rule__Pattern__CommandsAssignment_4 )* )
            {
            // InternalMGLang.g:2722:1: ( ( rule__Pattern__CommandsAssignment_4 )* )
            // InternalMGLang.g:2723:2: ( rule__Pattern__CommandsAssignment_4 )*
            {
             before(grammarAccess.getPatternAccess().getCommandsAssignment_4()); 
            // InternalMGLang.g:2724:2: ( rule__Pattern__CommandsAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==54||LA27_0==59||LA27_0==62) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMGLang.g:2724:3: rule__Pattern__CommandsAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Pattern__CommandsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getCommandsAssignment_4()); 

            }


            }

        }
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
    // InternalMGLang.g:2732:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2736:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:2737:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Pattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2744:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2748:1: ( ( '}' ) )
            // InternalMGLang.g:2749:1: ( '}' )
            {
            // InternalMGLang.g:2749:1: ( '}' )
            // InternalMGLang.g:2750:2: '}'
            {
             before(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalMGLang.g:2759:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2763:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:2764:2: rule__Pattern__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2770:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 )? ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2774:1: ( ( ( rule__Pattern__ReturnAssignment_6 )? ) )
            // InternalMGLang.g:2775:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            {
            // InternalMGLang.g:2775:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            // InternalMGLang.g:2776:2: ( rule__Pattern__ReturnAssignment_6 )?
            {
             before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            // InternalMGLang.g:2777:2: ( rule__Pattern__ReturnAssignment_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMGLang.g:2777:3: rule__Pattern__ReturnAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__ReturnAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getReturnAssignment_6()); 

            }


            }

        }
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
    // InternalMGLang.g:2786:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2790:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:2791:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Pattern__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2798:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2802:1: ( ( '(' ) )
            // InternalMGLang.g:2803:1: ( '(' )
            {
            // InternalMGLang.g:2803:1: ( '(' )
            // InternalMGLang.g:2804:2: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:2813:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2817:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:2818:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Pattern__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2825:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2829:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:2830:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:2830:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:2831:2: ( rule__Pattern__Group_2_1__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalMGLang.g:2832:2: ( rule__Pattern__Group_2_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=19 && LA29_0<=22)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMGLang.g:2832:3: rule__Pattern__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_2_1()); 

            }


            }

        }
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
    // InternalMGLang.g:2840:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2844:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:2845:2: rule__Pattern__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2851:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2855:1: ( ( ')' ) )
            // InternalMGLang.g:2856:1: ( ')' )
            {
            // InternalMGLang.g:2856:1: ( ')' )
            // InternalMGLang.g:2857:2: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
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
    // InternalMGLang.g:2867:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2871:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:2872:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Pattern__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2879:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2883:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:2884:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:2884:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:2885:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            // InternalMGLang.g:2886:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:2886:3: rule__Pattern__ParametersAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__ParametersAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:2894:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2898:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:2899:2: rule__Pattern__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2905:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2909:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:2910:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:2910:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:2911:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            // InternalMGLang.g:2912:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMGLang.g:2912:3: rule__Pattern__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Pattern__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getGroup_2_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:2921:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2925:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:2926:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Pattern__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2933:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2937:1: ( ( ',' ) )
            // InternalMGLang.g:2938:1: ( ',' )
            {
            // InternalMGLang.g:2938:1: ( ',' )
            // InternalMGLang.g:2939:2: ','
            {
             before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:2948:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2952:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:2953:2: rule__Pattern__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2959:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2963:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:2964:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:2964:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:2965:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            // InternalMGLang.g:2966:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:2966:3: rule__Pattern__ParametersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__ParametersAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:2975:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2979:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:2980:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__PatternReturn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:2987:1: rule__PatternReturn__Group__0__Impl : ( () ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2991:1: ( ( () ) )
            // InternalMGLang.g:2992:1: ( () )
            {
            // InternalMGLang.g:2992:1: ( () )
            // InternalMGLang.g:2993:2: ()
            {
             before(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 
            // InternalMGLang.g:2994:2: ()
            // InternalMGLang.g:2994:3: 
            {
            }

             after(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 

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
    // InternalMGLang.g:3002:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3006:1: ( rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 )
            // InternalMGLang.g:3007:2: rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__PatternReturn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3014:1: rule__PatternReturn__Group__1__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3018:1: ( ( 'return' ) )
            // InternalMGLang.g:3019:1: ( 'return' )
            {
            // InternalMGLang.g:3019:1: ( 'return' )
            // InternalMGLang.g:3020:2: 'return'
            {
             before(grammarAccess.getPatternReturnAccess().getReturnKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getReturnKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3029:1: rule__PatternReturn__Group__2 : rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 ;
    public final void rule__PatternReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3033:1: ( rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 )
            // InternalMGLang.g:3034:2: rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__PatternReturn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3041:1: rule__PatternReturn__Group__2__Impl : ( 'this' ) ;
    public final void rule__PatternReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3045:1: ( ( 'this' ) )
            // InternalMGLang.g:3046:1: ( 'this' )
            {
            // InternalMGLang.g:3046:1: ( 'this' )
            // InternalMGLang.g:3047:2: 'this'
            {
             before(grammarAccess.getPatternReturnAccess().getThisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getThisKeyword_2()); 

            }


            }

        }
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
    // InternalMGLang.g:3056:1: rule__PatternReturn__Group__3 : rule__PatternReturn__Group__3__Impl ;
    public final void rule__PatternReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3060:1: ( rule__PatternReturn__Group__3__Impl )
            // InternalMGLang.g:3061:2: rule__PatternReturn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3067:1: rule__PatternReturn__Group__3__Impl : ( ( rule__PatternReturn__Group_3__0 )? ) ;
    public final void rule__PatternReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3071:1: ( ( ( rule__PatternReturn__Group_3__0 )? ) )
            // InternalMGLang.g:3072:1: ( ( rule__PatternReturn__Group_3__0 )? )
            {
            // InternalMGLang.g:3072:1: ( ( rule__PatternReturn__Group_3__0 )? )
            // InternalMGLang.g:3073:2: ( rule__PatternReturn__Group_3__0 )?
            {
             before(grammarAccess.getPatternReturnAccess().getGroup_3()); 
            // InternalMGLang.g:3074:2: ( rule__PatternReturn__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMGLang.g:3074:3: rule__PatternReturn__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternReturn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternReturnAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalMGLang.g:3083:1: rule__PatternReturn__Group_3__0 : rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 ;
    public final void rule__PatternReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3087:1: ( rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 )
            // InternalMGLang.g:3088:2: rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__PatternReturn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3095:1: rule__PatternReturn__Group_3__0__Impl : ( '.' ) ;
    public final void rule__PatternReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3099:1: ( ( '.' ) )
            // InternalMGLang.g:3100:1: ( '.' )
            {
            // InternalMGLang.g:3100:1: ( '.' )
            // InternalMGLang.g:3101:2: '.'
            {
             before(grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getFullStopKeyword_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3110:1: rule__PatternReturn__Group_3__1 : rule__PatternReturn__Group_3__1__Impl ;
    public final void rule__PatternReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3114:1: ( rule__PatternReturn__Group_3__1__Impl )
            // InternalMGLang.g:3115:2: rule__PatternReturn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3121:1: rule__PatternReturn__Group_3__1__Impl : ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) ;
    public final void rule__PatternReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3125:1: ( ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) )
            // InternalMGLang.g:3126:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            {
            // InternalMGLang.g:3126:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            // InternalMGLang.g:3127:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 
            // InternalMGLang.g:3128:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            // InternalMGLang.g:3128:3: rule__PatternReturn__ReturnValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternReturn__ReturnValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3137:1: rule__ParamManipulation__Group__0 : rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 ;
    public final void rule__ParamManipulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3141:1: ( rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 )
            // InternalMGLang.g:3142:2: rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ParamManipulation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamManipulation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3149:1: rule__ParamManipulation__Group__0__Impl : ( ( rule__ParamManipulation__ParamAssignment_0 ) ) ;
    public final void rule__ParamManipulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3153:1: ( ( ( rule__ParamManipulation__ParamAssignment_0 ) ) )
            // InternalMGLang.g:3154:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            {
            // InternalMGLang.g:3154:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            // InternalMGLang.g:3155:2: ( rule__ParamManipulation__ParamAssignment_0 )
            {
             before(grammarAccess.getParamManipulationAccess().getParamAssignment_0()); 
            // InternalMGLang.g:3156:2: ( rule__ParamManipulation__ParamAssignment_0 )
            // InternalMGLang.g:3156:3: rule__ParamManipulation__ParamAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__ParamAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamManipulationAccess().getParamAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3164:1: rule__ParamManipulation__Group__1 : rule__ParamManipulation__Group__1__Impl ;
    public final void rule__ParamManipulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3168:1: ( rule__ParamManipulation__Group__1__Impl )
            // InternalMGLang.g:3169:2: rule__ParamManipulation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3175:1: rule__ParamManipulation__Group__1__Impl : ( ( rule__ParamManipulation__ContentAssignment_1 ) ) ;
    public final void rule__ParamManipulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3179:1: ( ( ( rule__ParamManipulation__ContentAssignment_1 ) ) )
            // InternalMGLang.g:3180:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            {
            // InternalMGLang.g:3180:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            // InternalMGLang.g:3181:2: ( rule__ParamManipulation__ContentAssignment_1 )
            {
             before(grammarAccess.getParamManipulationAccess().getContentAssignment_1()); 
            // InternalMGLang.g:3182:2: ( rule__ParamManipulation__ContentAssignment_1 )
            // InternalMGLang.g:3182:3: rule__ParamManipulation__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamManipulation__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamManipulationAccess().getContentAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3191:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3195:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:3196:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3203:1: rule__Node__Group__0__Impl : ( ( rule__Node__Group_0__0 )? ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3207:1: ( ( ( rule__Node__Group_0__0 )? ) )
            // InternalMGLang.g:3208:1: ( ( rule__Node__Group_0__0 )? )
            {
            // InternalMGLang.g:3208:1: ( ( rule__Node__Group_0__0 )? )
            // InternalMGLang.g:3209:2: ( rule__Node__Group_0__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_0()); 
            // InternalMGLang.g:3210:2: ( rule__Node__Group_0__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==48) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalMGLang.g:3210:3: rule__Node__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3218:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3222:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalMGLang.g:3223:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3230:1: rule__Node__Group__1__Impl : ( ( rule__Node__TypeAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3234:1: ( ( ( rule__Node__TypeAssignment_1 ) ) )
            // InternalMGLang.g:3235:1: ( ( rule__Node__TypeAssignment_1 ) )
            {
            // InternalMGLang.g:3235:1: ( ( rule__Node__TypeAssignment_1 ) )
            // InternalMGLang.g:3236:2: ( rule__Node__TypeAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // InternalMGLang.g:3237:2: ( rule__Node__TypeAssignment_1 )
            // InternalMGLang.g:3237:3: rule__Node__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3245:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3249:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalMGLang.g:3250:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3257:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3261:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // InternalMGLang.g:3262:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // InternalMGLang.g:3262:1: ( ( rule__Node__NameAssignment_2 ) )
            // InternalMGLang.g:3263:2: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // InternalMGLang.g:3264:2: ( rule__Node__NameAssignment_2 )
            // InternalMGLang.g:3264:3: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Node__Group__3"
    // InternalMGLang.g:3272:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3276:1: ( rule__Node__Group__3__Impl )
            // InternalMGLang.g:3277:2: rule__Node__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalMGLang.g:3283:1: rule__Node__Group__3__Impl : ( ( rule__Node__Alternatives_3 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3287:1: ( ( ( rule__Node__Alternatives_3 )? ) )
            // InternalMGLang.g:3288:1: ( ( rule__Node__Alternatives_3 )? )
            {
            // InternalMGLang.g:3288:1: ( ( rule__Node__Alternatives_3 )? )
            // InternalMGLang.g:3289:2: ( rule__Node__Alternatives_3 )?
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3()); 
            // InternalMGLang.g:3290:2: ( rule__Node__Alternatives_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ASSIGNMENT_OP||LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMGLang.g:3290:3: rule__Node__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group_0__0"
    // InternalMGLang.g:3299:1: rule__Node__Group_0__0 : rule__Node__Group_0__0__Impl rule__Node__Group_0__1 ;
    public final void rule__Node__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3303:1: ( rule__Node__Group_0__0__Impl rule__Node__Group_0__1 )
            // InternalMGLang.g:3304:2: rule__Node__Group_0__0__Impl rule__Node__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Node__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_0__0"


    // $ANTLR start "rule__Node__Group_0__0__Impl"
    // InternalMGLang.g:3311:1: rule__Node__Group_0__0__Impl : ( ( rule__Node__SrcModelAssignment_0_0 ) ) ;
    public final void rule__Node__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3315:1: ( ( ( rule__Node__SrcModelAssignment_0_0 ) ) )
            // InternalMGLang.g:3316:1: ( ( rule__Node__SrcModelAssignment_0_0 ) )
            {
            // InternalMGLang.g:3316:1: ( ( rule__Node__SrcModelAssignment_0_0 ) )
            // InternalMGLang.g:3317:2: ( rule__Node__SrcModelAssignment_0_0 )
            {
             before(grammarAccess.getNodeAccess().getSrcModelAssignment_0_0()); 
            // InternalMGLang.g:3318:2: ( rule__Node__SrcModelAssignment_0_0 )
            // InternalMGLang.g:3318:3: rule__Node__SrcModelAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__SrcModelAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getSrcModelAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_0__0__Impl"


    // $ANTLR start "rule__Node__Group_0__1"
    // InternalMGLang.g:3326:1: rule__Node__Group_0__1 : rule__Node__Group_0__1__Impl ;
    public final void rule__Node__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3330:1: ( rule__Node__Group_0__1__Impl )
            // InternalMGLang.g:3331:2: rule__Node__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_0__1"


    // $ANTLR start "rule__Node__Group_0__1__Impl"
    // InternalMGLang.g:3337:1: rule__Node__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Node__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3341:1: ( ( '.' ) )
            // InternalMGLang.g:3342:1: ( '.' )
            {
            // InternalMGLang.g:3342:1: ( '.' )
            // InternalMGLang.g:3343:2: '.'
            {
             before(grammarAccess.getNodeAccess().getFullStopKeyword_0_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_0__1__Impl"


    // $ANTLR start "rule__Node__Group_3_1__0"
    // InternalMGLang.g:3353:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3357:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // InternalMGLang.g:3358:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Node__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__0"


    // $ANTLR start "rule__Node__Group_3_1__0__Impl"
    // InternalMGLang.g:3365:1: rule__Node__Group_3_1__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3369:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3370:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3370:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3371:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_3_1_0()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__0__Impl"


    // $ANTLR start "rule__Node__Group_3_1__1"
    // InternalMGLang.g:3380:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3384:1: ( rule__Node__Group_3_1__1__Impl )
            // InternalMGLang.g:3385:2: rule__Node__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__1"


    // $ANTLR start "rule__Node__Group_3_1__1__Impl"
    // InternalMGLang.g:3391:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__CreatedByAssignment_3_1_1 ) ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3395:1: ( ( ( rule__Node__CreatedByAssignment_3_1_1 ) ) )
            // InternalMGLang.g:3396:1: ( ( rule__Node__CreatedByAssignment_3_1_1 ) )
            {
            // InternalMGLang.g:3396:1: ( ( rule__Node__CreatedByAssignment_3_1_1 ) )
            // InternalMGLang.g:3397:2: ( rule__Node__CreatedByAssignment_3_1_1 )
            {
             before(grammarAccess.getNodeAccess().getCreatedByAssignment_3_1_1()); 
            // InternalMGLang.g:3398:2: ( rule__Node__CreatedByAssignment_3_1_1 )
            // InternalMGLang.g:3398:3: rule__Node__CreatedByAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__CreatedByAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getCreatedByAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__1__Impl"


    // $ANTLR start "rule__NodeContent__Group__0"
    // InternalMGLang.g:3407:1: rule__NodeContent__Group__0 : rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 ;
    public final void rule__NodeContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3411:1: ( rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 )
            // InternalMGLang.g:3412:2: rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__NodeContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3419:1: rule__NodeContent__Group__0__Impl : ( () ) ;
    public final void rule__NodeContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3423:1: ( ( () ) )
            // InternalMGLang.g:3424:1: ( () )
            {
            // InternalMGLang.g:3424:1: ( () )
            // InternalMGLang.g:3425:2: ()
            {
             before(grammarAccess.getNodeContentAccess().getNodeContentAction_0()); 
            // InternalMGLang.g:3426:2: ()
            // InternalMGLang.g:3426:3: 
            {
            }

             after(grammarAccess.getNodeContentAccess().getNodeContentAction_0()); 

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
    // InternalMGLang.g:3434:1: rule__NodeContent__Group__1 : rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 ;
    public final void rule__NodeContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3438:1: ( rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 )
            // InternalMGLang.g:3439:2: rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__NodeContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3446:1: rule__NodeContent__Group__1__Impl : ( '{' ) ;
    public final void rule__NodeContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3450:1: ( ( '{' ) )
            // InternalMGLang.g:3451:1: ( '{' )
            {
            // InternalMGLang.g:3451:1: ( '{' )
            // InternalMGLang.g:3452:2: '{'
            {
             before(grammarAccess.getNodeContentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNodeContentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3461:1: rule__NodeContent__Group__2 : rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 ;
    public final void rule__NodeContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3465:1: ( rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 )
            // InternalMGLang.g:3466:2: rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__NodeContent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3473:1: rule__NodeContent__Group__2__Impl : ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) ;
    public final void rule__NodeContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3477:1: ( ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) )
            // InternalMGLang.g:3478:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            {
            // InternalMGLang.g:3478:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            // InternalMGLang.g:3479:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            {
             before(grammarAccess.getNodeContentAccess().getRefsAssignsAssignment_2()); 
            // InternalMGLang.g:3480:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==54) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMGLang.g:3480:3: rule__NodeContent__RefsAssignsAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__NodeContent__RefsAssignsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getNodeContentAccess().getRefsAssignsAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:3488:1: rule__NodeContent__Group__3 : rule__NodeContent__Group__3__Impl ;
    public final void rule__NodeContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3492:1: ( rule__NodeContent__Group__3__Impl )
            // InternalMGLang.g:3493:2: rule__NodeContent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeContent__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3499:1: rule__NodeContent__Group__3__Impl : ( '}' ) ;
    public final void rule__NodeContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3503:1: ( ( '}' ) )
            // InternalMGLang.g:3504:1: ( '}' )
            {
            // InternalMGLang.g:3504:1: ( '}' )
            // InternalMGLang.g:3505:2: '}'
            {
             before(grammarAccess.getNodeContentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNodeContentAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:3515:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3519:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:3520:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PatternCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3527:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3531:1: ( ( ( rule__PatternCall__CalledAssignment_0 ) ) )
            // InternalMGLang.g:3532:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            {
            // InternalMGLang.g:3532:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            // InternalMGLang.g:3533:2: ( rule__PatternCall__CalledAssignment_0 )
            {
             before(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 
            // InternalMGLang.g:3534:2: ( rule__PatternCall__CalledAssignment_0 )
            // InternalMGLang.g:3534:3: rule__PatternCall__CalledAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__CalledAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3542:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3546:1: ( rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 )
            // InternalMGLang.g:3547:2: rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__PatternCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3554:1: rule__PatternCall__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3558:1: ( ( '(' ) )
            // InternalMGLang.g:3559:1: ( '(' )
            {
            // InternalMGLang.g:3559:1: ( '(' )
            // InternalMGLang.g:3560:2: '('
            {
             before(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3569:1: rule__PatternCall__Group__2 : rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 ;
    public final void rule__PatternCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3573:1: ( rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 )
            // InternalMGLang.g:3574:2: rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__PatternCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3581:1: rule__PatternCall__Group__2__Impl : ( ( rule__PatternCall__Group_2__0 )? ) ;
    public final void rule__PatternCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3585:1: ( ( ( rule__PatternCall__Group_2__0 )? ) )
            // InternalMGLang.g:3586:1: ( ( rule__PatternCall__Group_2__0 )? )
            {
            // InternalMGLang.g:3586:1: ( ( rule__PatternCall__Group_2__0 )? )
            // InternalMGLang.g:3587:2: ( rule__PatternCall__Group_2__0 )?
            {
             before(grammarAccess.getPatternCallAccess().getGroup_2()); 
            // InternalMGLang.g:3588:2: ( rule__PatternCall__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_TRUE && LA35_0<=RULE_FALSE)||(LA35_0>=RULE_STRING && LA35_0<=RULE_DOUBLE)||(LA35_0>=17 && LA35_0<=18)||LA35_0==40||LA35_0==63) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMGLang.g:3588:3: rule__PatternCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternCallAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMGLang.g:3596:1: rule__PatternCall__Group__3 : rule__PatternCall__Group__3__Impl ;
    public final void rule__PatternCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3600:1: ( rule__PatternCall__Group__3__Impl )
            // InternalMGLang.g:3601:2: rule__PatternCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3607:1: rule__PatternCall__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3611:1: ( ( ')' ) )
            // InternalMGLang.g:3612:1: ( ')' )
            {
            // InternalMGLang.g:3612:1: ( ')' )
            // InternalMGLang.g:3613:2: ')'
            {
             before(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:3623:1: rule__PatternCall__Group_2__0 : rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1 ;
    public final void rule__PatternCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3627:1: ( rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1 )
            // InternalMGLang.g:3628:2: rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__PatternCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3635:1: rule__PatternCall__Group_2__0__Impl : ( ( rule__PatternCall__ParamsAssignment_2_0 ) ) ;
    public final void rule__PatternCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3639:1: ( ( ( rule__PatternCall__ParamsAssignment_2_0 ) ) )
            // InternalMGLang.g:3640:1: ( ( rule__PatternCall__ParamsAssignment_2_0 ) )
            {
            // InternalMGLang.g:3640:1: ( ( rule__PatternCall__ParamsAssignment_2_0 ) )
            // InternalMGLang.g:3641:2: ( rule__PatternCall__ParamsAssignment_2_0 )
            {
             before(grammarAccess.getPatternCallAccess().getParamsAssignment_2_0()); 
            // InternalMGLang.g:3642:2: ( rule__PatternCall__ParamsAssignment_2_0 )
            // InternalMGLang.g:3642:3: rule__PatternCall__ParamsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__ParamsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternCallAccess().getParamsAssignment_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3650:1: rule__PatternCall__Group_2__1 : rule__PatternCall__Group_2__1__Impl ;
    public final void rule__PatternCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3654:1: ( rule__PatternCall__Group_2__1__Impl )
            // InternalMGLang.g:3655:2: rule__PatternCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3661:1: rule__PatternCall__Group_2__1__Impl : ( ( rule__PatternCall__Group_2_1__0 )* ) ;
    public final void rule__PatternCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3665:1: ( ( ( rule__PatternCall__Group_2_1__0 )* ) )
            // InternalMGLang.g:3666:1: ( ( rule__PatternCall__Group_2_1__0 )* )
            {
            // InternalMGLang.g:3666:1: ( ( rule__PatternCall__Group_2_1__0 )* )
            // InternalMGLang.g:3667:2: ( rule__PatternCall__Group_2_1__0 )*
            {
             before(grammarAccess.getPatternCallAccess().getGroup_2_1()); 
            // InternalMGLang.g:3668:2: ( rule__PatternCall__Group_2_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==45) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMGLang.g:3668:3: rule__PatternCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__PatternCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getPatternCallAccess().getGroup_2_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3677:1: rule__PatternCall__Group_2_1__0 : rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1 ;
    public final void rule__PatternCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3681:1: ( rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1 )
            // InternalMGLang.g:3682:2: rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1
            {
            pushFollow(FOLLOW_26);
            rule__PatternCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_2_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3689:1: rule__PatternCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__PatternCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3693:1: ( ( ',' ) )
            // InternalMGLang.g:3694:1: ( ',' )
            {
            // InternalMGLang.g:3694:1: ( ',' )
            // InternalMGLang.g:3695:2: ','
            {
             before(grammarAccess.getPatternCallAccess().getCommaKeyword_2_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3704:1: rule__PatternCall__Group_2_1__1 : rule__PatternCall__Group_2_1__1__Impl ;
    public final void rule__PatternCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3708:1: ( rule__PatternCall__Group_2_1__1__Impl )
            // InternalMGLang.g:3709:2: rule__PatternCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3715:1: rule__PatternCall__Group_2_1__1__Impl : ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) ) ;
    public final void rule__PatternCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3719:1: ( ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) ) )
            // InternalMGLang.g:3720:1: ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) )
            {
            // InternalMGLang.g:3720:1: ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) )
            // InternalMGLang.g:3721:2: ( rule__PatternCall__ParamsAssignment_2_1_1 )
            {
             before(grammarAccess.getPatternCallAccess().getParamsAssignment_2_1_1()); 
            // InternalMGLang.g:3722:2: ( rule__PatternCall__ParamsAssignment_2_1_1 )
            // InternalMGLang.g:3722:3: rule__PatternCall__ParamsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternCall__ParamsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternCallAccess().getParamsAssignment_2_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3731:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3735:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:3736:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__PatternNodeReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3743:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3747:1: ( ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3748:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3748:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            // InternalMGLang.g:3749:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:3750:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            // InternalMGLang.g:3750:3: rule__PatternNodeReference__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3758:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3762:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:3763:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PatternNodeReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3770:1: rule__PatternNodeReference__Group__1__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3774:1: ( ( '->' ) )
            // InternalMGLang.g:3775:1: ( '->' )
            {
            // InternalMGLang.g:3775:1: ( '->' )
            // InternalMGLang.g:3776:2: '->'
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3785:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3789:1: ( rule__PatternNodeReference__Group__2__Impl )
            // InternalMGLang.g:3790:2: rule__PatternNodeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3796:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3800:1: ( ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) )
            // InternalMGLang.g:3801:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            {
            // InternalMGLang.g:3801:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            // InternalMGLang.g:3802:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 
            // InternalMGLang.g:3803:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            // InternalMGLang.g:3803:3: rule__PatternNodeReference__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternNodeReference__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:3812:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3816:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:3817:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3824:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3828:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMGLang.g:3829:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMGLang.g:3829:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMGLang.g:3830:2: ( rule__Assignment__TargetAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            // InternalMGLang.g:3831:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMGLang.g:3831:3: rule__Assignment__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3839:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3843:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:3844:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3851:1: rule__Assignment__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3855:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3856:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3856:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3857:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getASSIGNMENT_OPTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3866:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3870:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:3871:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3877:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3881:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:3882:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:3882:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:3883:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMGLang.g:3884:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:3884:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:3893:1: rule__PrimitiveParameter__Group__0 : rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 ;
    public final void rule__PrimitiveParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3897:1: ( rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 )
            // InternalMGLang.g:3898:2: rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PrimitiveParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3905:1: rule__PrimitiveParameter__Group__0__Impl : ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3909:1: ( ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3910:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3910:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:3911:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:3912:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            // InternalMGLang.g:3912:3: rule__PrimitiveParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3920:1: rule__PrimitiveParameter__Group__1 : rule__PrimitiveParameter__Group__1__Impl ;
    public final void rule__PrimitiveParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3924:1: ( rule__PrimitiveParameter__Group__1__Impl )
            // InternalMGLang.g:3925:2: rule__PrimitiveParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3931:1: rule__PrimitiveParameter__Group__1__Impl : ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3935:1: ( ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:3936:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3936:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            // InternalMGLang.g:3937:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 
            // InternalMGLang.g:3938:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            // InternalMGLang.g:3938:3: rule__PrimitiveParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3947:1: rule__ParameterNode__Group__0 : rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 ;
    public final void rule__ParameterNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3951:1: ( rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 )
            // InternalMGLang.g:3952:2: rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3959:1: rule__ParameterNode__Group__0__Impl : ( ( rule__ParameterNode__Group_0__0 )? ) ;
    public final void rule__ParameterNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3963:1: ( ( ( rule__ParameterNode__Group_0__0 )? ) )
            // InternalMGLang.g:3964:1: ( ( rule__ParameterNode__Group_0__0 )? )
            {
            // InternalMGLang.g:3964:1: ( ( rule__ParameterNode__Group_0__0 )? )
            // InternalMGLang.g:3965:2: ( rule__ParameterNode__Group_0__0 )?
            {
             before(grammarAccess.getParameterNodeAccess().getGroup_0()); 
            // InternalMGLang.g:3966:2: ( rule__ParameterNode__Group_0__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==48) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalMGLang.g:3966:3: rule__ParameterNode__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterNode__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterNodeAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3974:1: rule__ParameterNode__Group__1 : rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2 ;
    public final void rule__ParameterNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3978:1: ( rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2 )
            // InternalMGLang.g:3979:2: rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ParameterNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:3986:1: rule__ParameterNode__Group__1__Impl : ( ( rule__ParameterNode__TypeAssignment_1 ) ) ;
    public final void rule__ParameterNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3990:1: ( ( ( rule__ParameterNode__TypeAssignment_1 ) ) )
            // InternalMGLang.g:3991:1: ( ( rule__ParameterNode__TypeAssignment_1 ) )
            {
            // InternalMGLang.g:3991:1: ( ( rule__ParameterNode__TypeAssignment_1 ) )
            // InternalMGLang.g:3992:2: ( rule__ParameterNode__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterNodeAccess().getTypeAssignment_1()); 
            // InternalMGLang.g:3993:2: ( rule__ParameterNode__TypeAssignment_1 )
            // InternalMGLang.g:3993:3: rule__ParameterNode__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterNodeAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4001:1: rule__ParameterNode__Group__2 : rule__ParameterNode__Group__2__Impl ;
    public final void rule__ParameterNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4005:1: ( rule__ParameterNode__Group__2__Impl )
            // InternalMGLang.g:4006:2: rule__ParameterNode__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4012:1: rule__ParameterNode__Group__2__Impl : ( ( rule__ParameterNode__NameAssignment_2 ) ) ;
    public final void rule__ParameterNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4016:1: ( ( ( rule__ParameterNode__NameAssignment_2 ) ) )
            // InternalMGLang.g:4017:1: ( ( rule__ParameterNode__NameAssignment_2 ) )
            {
            // InternalMGLang.g:4017:1: ( ( rule__ParameterNode__NameAssignment_2 ) )
            // InternalMGLang.g:4018:2: ( rule__ParameterNode__NameAssignment_2 )
            {
             before(grammarAccess.getParameterNodeAccess().getNameAssignment_2()); 
            // InternalMGLang.g:4019:2: ( rule__ParameterNode__NameAssignment_2 )
            // InternalMGLang.g:4019:3: rule__ParameterNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterNodeAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:4028:1: rule__ParameterNode__Group_0__0 : rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1 ;
    public final void rule__ParameterNode__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4032:1: ( rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1 )
            // InternalMGLang.g:4033:2: rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__ParameterNode__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4040:1: rule__ParameterNode__Group_0__0__Impl : ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) ) ;
    public final void rule__ParameterNode__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4044:1: ( ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) ) )
            // InternalMGLang.g:4045:1: ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) )
            {
            // InternalMGLang.g:4045:1: ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) )
            // InternalMGLang.g:4046:2: ( rule__ParameterNode__SrcModelAssignment_0_0 )
            {
             before(grammarAccess.getParameterNodeAccess().getSrcModelAssignment_0_0()); 
            // InternalMGLang.g:4047:2: ( rule__ParameterNode__SrcModelAssignment_0_0 )
            // InternalMGLang.g:4047:3: rule__ParameterNode__SrcModelAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__SrcModelAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterNodeAccess().getSrcModelAssignment_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4055:1: rule__ParameterNode__Group_0__1 : rule__ParameterNode__Group_0__1__Impl ;
    public final void rule__ParameterNode__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4059:1: ( rule__ParameterNode__Group_0__1__Impl )
            // InternalMGLang.g:4060:2: rule__ParameterNode__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterNode__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4066:1: rule__ParameterNode__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ParameterNode__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4070:1: ( ( '.' ) )
            // InternalMGLang.g:4071:1: ( '.' )
            {
            // InternalMGLang.g:4071:1: ( '.' )
            // InternalMGLang.g:4072:2: '.'
            {
             before(grammarAccess.getParameterNodeAccess().getFullStopKeyword_0_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getParameterNodeAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4082:1: rule__RefOrCall__Group__0 : rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1 ;
    public final void rule__RefOrCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4086:1: ( rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1 )
            // InternalMGLang.g:4087:2: rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RefOrCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4094:1: rule__RefOrCall__Group__0__Impl : ( ( rule__RefOrCall__RefAssignment_0 ) ) ;
    public final void rule__RefOrCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4098:1: ( ( ( rule__RefOrCall__RefAssignment_0 ) ) )
            // InternalMGLang.g:4099:1: ( ( rule__RefOrCall__RefAssignment_0 ) )
            {
            // InternalMGLang.g:4099:1: ( ( rule__RefOrCall__RefAssignment_0 ) )
            // InternalMGLang.g:4100:2: ( rule__RefOrCall__RefAssignment_0 )
            {
             before(grammarAccess.getRefOrCallAccess().getRefAssignment_0()); 
            // InternalMGLang.g:4101:2: ( rule__RefOrCall__RefAssignment_0 )
            // InternalMGLang.g:4101:3: rule__RefOrCall__RefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRefOrCallAccess().getRefAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4109:1: rule__RefOrCall__Group__1 : rule__RefOrCall__Group__1__Impl ;
    public final void rule__RefOrCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4113:1: ( rule__RefOrCall__Group__1__Impl )
            // InternalMGLang.g:4114:2: rule__RefOrCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4120:1: rule__RefOrCall__Group__1__Impl : ( ( rule__RefOrCall__Group_1__0 )* ) ;
    public final void rule__RefOrCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4124:1: ( ( ( rule__RefOrCall__Group_1__0 )* ) )
            // InternalMGLang.g:4125:1: ( ( rule__RefOrCall__Group_1__0 )* )
            {
            // InternalMGLang.g:4125:1: ( ( rule__RefOrCall__Group_1__0 )* )
            // InternalMGLang.g:4126:2: ( rule__RefOrCall__Group_1__0 )*
            {
             before(grammarAccess.getRefOrCallAccess().getGroup_1()); 
            // InternalMGLang.g:4127:2: ( rule__RefOrCall__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==48) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMGLang.g:4127:3: rule__RefOrCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__RefOrCall__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getRefOrCallAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4136:1: rule__RefOrCall__Group_1__0 : rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1 ;
    public final void rule__RefOrCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4140:1: ( rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1 )
            // InternalMGLang.g:4141:2: rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__RefOrCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4148:1: rule__RefOrCall__Group_1__0__Impl : ( () ) ;
    public final void rule__RefOrCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4152:1: ( ( () ) )
            // InternalMGLang.g:4153:1: ( () )
            {
            // InternalMGLang.g:4153:1: ( () )
            // InternalMGLang.g:4154:2: ()
            {
             before(grammarAccess.getRefOrCallAccess().getRefOrCallTargetAction_1_0()); 
            // InternalMGLang.g:4155:2: ()
            // InternalMGLang.g:4155:3: 
            {
            }

             after(grammarAccess.getRefOrCallAccess().getRefOrCallTargetAction_1_0()); 

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
    // InternalMGLang.g:4163:1: rule__RefOrCall__Group_1__1 : rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2 ;
    public final void rule__RefOrCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4167:1: ( rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2 )
            // InternalMGLang.g:4168:2: rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__RefOrCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4175:1: rule__RefOrCall__Group_1__1__Impl : ( '.' ) ;
    public final void rule__RefOrCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4179:1: ( ( '.' ) )
            // InternalMGLang.g:4180:1: ( '.' )
            {
            // InternalMGLang.g:4180:1: ( '.' )
            // InternalMGLang.g:4181:2: '.'
            {
             before(grammarAccess.getRefOrCallAccess().getFullStopKeyword_1_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRefOrCallAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4190:1: rule__RefOrCall__Group_1__2 : rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3 ;
    public final void rule__RefOrCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4194:1: ( rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3 )
            // InternalMGLang.g:4195:2: rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__RefOrCall__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4202:1: rule__RefOrCall__Group_1__2__Impl : ( ( rule__RefOrCall__RefAssignment_1_2 ) ) ;
    public final void rule__RefOrCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4206:1: ( ( ( rule__RefOrCall__RefAssignment_1_2 ) ) )
            // InternalMGLang.g:4207:1: ( ( rule__RefOrCall__RefAssignment_1_2 ) )
            {
            // InternalMGLang.g:4207:1: ( ( rule__RefOrCall__RefAssignment_1_2 ) )
            // InternalMGLang.g:4208:2: ( rule__RefOrCall__RefAssignment_1_2 )
            {
             before(grammarAccess.getRefOrCallAccess().getRefAssignment_1_2()); 
            // InternalMGLang.g:4209:2: ( rule__RefOrCall__RefAssignment_1_2 )
            // InternalMGLang.g:4209:3: rule__RefOrCall__RefAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__RefAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRefOrCallAccess().getRefAssignment_1_2()); 

            }


            }

        }
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
    // InternalMGLang.g:4217:1: rule__RefOrCall__Group_1__3 : rule__RefOrCall__Group_1__3__Impl ;
    public final void rule__RefOrCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4221:1: ( rule__RefOrCall__Group_1__3__Impl )
            // InternalMGLang.g:4222:2: rule__RefOrCall__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4228:1: rule__RefOrCall__Group_1__3__Impl : ( ( rule__RefOrCall__Group_1_3__0 )? ) ;
    public final void rule__RefOrCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4232:1: ( ( ( rule__RefOrCall__Group_1_3__0 )? ) )
            // InternalMGLang.g:4233:1: ( ( rule__RefOrCall__Group_1_3__0 )? )
            {
            // InternalMGLang.g:4233:1: ( ( rule__RefOrCall__Group_1_3__0 )? )
            // InternalMGLang.g:4234:2: ( rule__RefOrCall__Group_1_3__0 )?
            {
             before(grammarAccess.getRefOrCallAccess().getGroup_1_3()); 
            // InternalMGLang.g:4235:2: ( rule__RefOrCall__Group_1_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMGLang.g:4235:3: rule__RefOrCall__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefOrCall__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefOrCallAccess().getGroup_1_3()); 

            }


            }

        }
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
    // InternalMGLang.g:4244:1: rule__RefOrCall__Group_1_3__0 : rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1 ;
    public final void rule__RefOrCall__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4248:1: ( rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1 )
            // InternalMGLang.g:4249:2: rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1
            {
            pushFollow(FOLLOW_25);
            rule__RefOrCall__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1_3__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4256:1: rule__RefOrCall__Group_1_3__0__Impl : ( '(' ) ;
    public final void rule__RefOrCall__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4260:1: ( ( '(' ) )
            // InternalMGLang.g:4261:1: ( '(' )
            {
            // InternalMGLang.g:4261:1: ( '(' )
            // InternalMGLang.g:4262:2: '('
            {
             before(grammarAccess.getRefOrCallAccess().getLeftParenthesisKeyword_1_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRefOrCallAccess().getLeftParenthesisKeyword_1_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4271:1: rule__RefOrCall__Group_1_3__1 : rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2 ;
    public final void rule__RefOrCall__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4275:1: ( rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2 )
            // InternalMGLang.g:4276:2: rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2
            {
            pushFollow(FOLLOW_25);
            rule__RefOrCall__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1_3__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4283:1: rule__RefOrCall__Group_1_3__1__Impl : ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? ) ;
    public final void rule__RefOrCall__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4287:1: ( ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? ) )
            // InternalMGLang.g:4288:1: ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? )
            {
            // InternalMGLang.g:4288:1: ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? )
            // InternalMGLang.g:4289:2: ( rule__RefOrCall__ParamsAssignment_1_3_1 )?
            {
             before(grammarAccess.getRefOrCallAccess().getParamsAssignment_1_3_1()); 
            // InternalMGLang.g:4290:2: ( rule__RefOrCall__ParamsAssignment_1_3_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_TRUE && LA40_0<=RULE_FALSE)||(LA40_0>=RULE_STRING && LA40_0<=RULE_DOUBLE)||(LA40_0>=17 && LA40_0<=18)||LA40_0==40||LA40_0==63) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMGLang.g:4290:3: rule__RefOrCall__ParamsAssignment_1_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefOrCall__ParamsAssignment_1_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefOrCallAccess().getParamsAssignment_1_3_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4298:1: rule__RefOrCall__Group_1_3__2 : rule__RefOrCall__Group_1_3__2__Impl ;
    public final void rule__RefOrCall__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4302:1: ( rule__RefOrCall__Group_1_3__2__Impl )
            // InternalMGLang.g:4303:2: rule__RefOrCall__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4309:1: rule__RefOrCall__Group_1_3__2__Impl : ( ( rule__RefOrCall__BracesSetAssignment_1_3_2 ) ) ;
    public final void rule__RefOrCall__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4313:1: ( ( ( rule__RefOrCall__BracesSetAssignment_1_3_2 ) ) )
            // InternalMGLang.g:4314:1: ( ( rule__RefOrCall__BracesSetAssignment_1_3_2 ) )
            {
            // InternalMGLang.g:4314:1: ( ( rule__RefOrCall__BracesSetAssignment_1_3_2 ) )
            // InternalMGLang.g:4315:2: ( rule__RefOrCall__BracesSetAssignment_1_3_2 )
            {
             before(grammarAccess.getRefOrCallAccess().getBracesSetAssignment_1_3_2()); 
            // InternalMGLang.g:4316:2: ( rule__RefOrCall__BracesSetAssignment_1_3_2 )
            // InternalMGLang.g:4316:3: rule__RefOrCall__BracesSetAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RefOrCall__BracesSetAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRefOrCallAccess().getBracesSetAssignment_1_3_2()); 

            }


            }

        }
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
    // InternalMGLang.g:4325:1: rule__RefParams__Group__0 : rule__RefParams__Group__0__Impl rule__RefParams__Group__1 ;
    public final void rule__RefParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4329:1: ( rule__RefParams__Group__0__Impl rule__RefParams__Group__1 )
            // InternalMGLang.g:4330:2: rule__RefParams__Group__0__Impl rule__RefParams__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__RefParams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefParams__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4337:1: rule__RefParams__Group__0__Impl : ( ( rule__RefParams__ParamsAssignment_0 ) ) ;
    public final void rule__RefParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4341:1: ( ( ( rule__RefParams__ParamsAssignment_0 ) ) )
            // InternalMGLang.g:4342:1: ( ( rule__RefParams__ParamsAssignment_0 ) )
            {
            // InternalMGLang.g:4342:1: ( ( rule__RefParams__ParamsAssignment_0 ) )
            // InternalMGLang.g:4343:2: ( rule__RefParams__ParamsAssignment_0 )
            {
             before(grammarAccess.getRefParamsAccess().getParamsAssignment_0()); 
            // InternalMGLang.g:4344:2: ( rule__RefParams__ParamsAssignment_0 )
            // InternalMGLang.g:4344:3: rule__RefParams__ParamsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__ParamsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRefParamsAccess().getParamsAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4352:1: rule__RefParams__Group__1 : rule__RefParams__Group__1__Impl ;
    public final void rule__RefParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4356:1: ( rule__RefParams__Group__1__Impl )
            // InternalMGLang.g:4357:2: rule__RefParams__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4363:1: rule__RefParams__Group__1__Impl : ( ( rule__RefParams__Group_1__0 )* ) ;
    public final void rule__RefParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4367:1: ( ( ( rule__RefParams__Group_1__0 )* ) )
            // InternalMGLang.g:4368:1: ( ( rule__RefParams__Group_1__0 )* )
            {
            // InternalMGLang.g:4368:1: ( ( rule__RefParams__Group_1__0 )* )
            // InternalMGLang.g:4369:2: ( rule__RefParams__Group_1__0 )*
            {
             before(grammarAccess.getRefParamsAccess().getGroup_1()); 
            // InternalMGLang.g:4370:2: ( rule__RefParams__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==45) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMGLang.g:4370:3: rule__RefParams__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RefParams__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getRefParamsAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4379:1: rule__RefParams__Group_1__0 : rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1 ;
    public final void rule__RefParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4383:1: ( rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1 )
            // InternalMGLang.g:4384:2: rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__RefParams__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefParams__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4391:1: rule__RefParams__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RefParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4395:1: ( ( ',' ) )
            // InternalMGLang.g:4396:1: ( ',' )
            {
            // InternalMGLang.g:4396:1: ( ',' )
            // InternalMGLang.g:4397:2: ','
            {
             before(grammarAccess.getRefParamsAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRefParamsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4406:1: rule__RefParams__Group_1__1 : rule__RefParams__Group_1__1__Impl ;
    public final void rule__RefParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4410:1: ( rule__RefParams__Group_1__1__Impl )
            // InternalMGLang.g:4411:2: rule__RefParams__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4417:1: rule__RefParams__Group_1__1__Impl : ( ( rule__RefParams__ParamsAssignment_1_1 ) ) ;
    public final void rule__RefParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4421:1: ( ( ( rule__RefParams__ParamsAssignment_1_1 ) ) )
            // InternalMGLang.g:4422:1: ( ( rule__RefParams__ParamsAssignment_1_1 ) )
            {
            // InternalMGLang.g:4422:1: ( ( rule__RefParams__ParamsAssignment_1_1 ) )
            // InternalMGLang.g:4423:2: ( rule__RefParams__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getRefParamsAccess().getParamsAssignment_1_1()); 
            // InternalMGLang.g:4424:2: ( rule__RefParams__ParamsAssignment_1_1 )
            // InternalMGLang.g:4424:3: rule__RefParams__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RefParams__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRefParamsAccess().getParamsAssignment_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4433:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4437:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:4438:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Generator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4445:1: rule__Generator__Group__0__Impl : ( () ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4449:1: ( ( () ) )
            // InternalMGLang.g:4450:1: ( () )
            {
            // InternalMGLang.g:4450:1: ( () )
            // InternalMGLang.g:4451:2: ()
            {
             before(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
            // InternalMGLang.g:4452:2: ()
            // InternalMGLang.g:4452:3: 
            {
            }

             after(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 

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
    // InternalMGLang.g:4460:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4464:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:4465:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Generator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4472:1: rule__Generator__Group__1__Impl : ( 'gen' ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4476:1: ( ( 'gen' ) )
            // InternalMGLang.g:4477:1: ( 'gen' )
            {
            // InternalMGLang.g:4477:1: ( 'gen' )
            // InternalMGLang.g:4478:2: 'gen'
            {
             before(grammarAccess.getGeneratorAccess().getGenKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getGenKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4487:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4491:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:4492:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Generator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4499:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4503:1: ( ( '(' ) )
            // InternalMGLang.g:4504:1: ( '(' )
            {
            // InternalMGLang.g:4504:1: ( '(' )
            // InternalMGLang.g:4505:2: '('
            {
             before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalMGLang.g:4514:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4518:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:4519:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Generator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4526:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__ParamsAssignment_3 )* ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4530:1: ( ( ( rule__Generator__ParamsAssignment_3 )* ) )
            // InternalMGLang.g:4531:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            {
            // InternalMGLang.g:4531:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            // InternalMGLang.g:4532:2: ( rule__Generator__ParamsAssignment_3 )*
            {
             before(grammarAccess.getGeneratorAccess().getParamsAssignment_3()); 
            // InternalMGLang.g:4533:2: ( rule__Generator__ParamsAssignment_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||(LA42_0>=19 && LA42_0<=22)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMGLang.g:4533:3: rule__Generator__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Generator__ParamsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getGeneratorAccess().getParamsAssignment_3()); 

            }


            }

        }
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
    // InternalMGLang.g:4541:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4545:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:4546:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Generator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4553:1: rule__Generator__Group__4__Impl : ( ')' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4557:1: ( ( ')' ) )
            // InternalMGLang.g:4558:1: ( ')' )
            {
            // InternalMGLang.g:4558:1: ( ')' )
            // InternalMGLang.g:4559:2: ')'
            {
             before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalMGLang.g:4568:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4572:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:4573:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Generator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4580:1: rule__Generator__Group__5__Impl : ( '{' ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4584:1: ( ( '{' ) )
            // InternalMGLang.g:4585:1: ( '{' )
            {
            // InternalMGLang.g:4585:1: ( '{' )
            // InternalMGLang.g:4586:2: '{'
            {
             before(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalMGLang.g:4595:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl rule__Generator__Group__7 ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4599:1: ( rule__Generator__Group__6__Impl rule__Generator__Group__7 )
            // InternalMGLang.g:4600:2: rule__Generator__Group__6__Impl rule__Generator__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Generator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__7();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4607:1: rule__Generator__Group__6__Impl : ( ( rule__Generator__CommandsAssignment_6 )* ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4611:1: ( ( ( rule__Generator__CommandsAssignment_6 )* ) )
            // InternalMGLang.g:4612:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            {
            // InternalMGLang.g:4612:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            // InternalMGLang.g:4613:2: ( rule__Generator__CommandsAssignment_6 )*
            {
             before(grammarAccess.getGeneratorAccess().getCommandsAssignment_6()); 
            // InternalMGLang.g:4614:2: ( rule__Generator__CommandsAssignment_6 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||(LA43_0>=51 && LA43_0<=52)||LA43_0==54||LA43_0==59||LA43_0==62) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMGLang.g:4614:3: rule__Generator__CommandsAssignment_6
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Generator__CommandsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getGeneratorAccess().getCommandsAssignment_6()); 

            }


            }

        }
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
    // InternalMGLang.g:4622:1: rule__Generator__Group__7 : rule__Generator__Group__7__Impl ;
    public final void rule__Generator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4626:1: ( rule__Generator__Group__7__Impl )
            // InternalMGLang.g:4627:2: rule__Generator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generator__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4633:1: rule__Generator__Group__7__Impl : ( '}' ) ;
    public final void rule__Generator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4637:1: ( ( '}' ) )
            // InternalMGLang.g:4638:1: ( '}' )
            {
            // InternalMGLang.g:4638:1: ( '}' )
            // InternalMGLang.g:4639:2: '}'
            {
             before(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGeneratorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalMGLang.g:4649:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4653:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalMGLang.g:4654:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PatternVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4661:1: rule__PatternVariable__Group__0__Impl : ( ( rule__PatternVariable__TypeAssignment_0 ) ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4665:1: ( ( ( rule__PatternVariable__TypeAssignment_0 ) ) )
            // InternalMGLang.g:4666:1: ( ( rule__PatternVariable__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:4666:1: ( ( rule__PatternVariable__TypeAssignment_0 ) )
            // InternalMGLang.g:4667:2: ( rule__PatternVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternVariableAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:4668:2: ( rule__PatternVariable__TypeAssignment_0 )
            // InternalMGLang.g:4668:3: rule__PatternVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternVariableAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4676:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4680:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalMGLang.g:4681:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__PatternVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4688:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4692:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalMGLang.g:4693:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalMGLang.g:4693:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalMGLang.g:4694:2: ( rule__PatternVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            // InternalMGLang.g:4695:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalMGLang.g:4695:3: rule__PatternVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4703:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4707:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalMGLang.g:4708:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PatternVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4715:1: rule__PatternVariable__Group__2__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4719:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:4720:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:4720:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:4721:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getPatternVariableAccess().getASSIGNMENT_OPTerminalRuleCall_2()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getPatternVariableAccess().getASSIGNMENT_OPTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalMGLang.g:4730:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4734:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalMGLang.g:4735:2: rule__PatternVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4741:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternCallAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4745:1: ( ( ( rule__PatternVariable__PatternCallAssignment_3 ) ) )
            // InternalMGLang.g:4746:1: ( ( rule__PatternVariable__PatternCallAssignment_3 ) )
            {
            // InternalMGLang.g:4746:1: ( ( rule__PatternVariable__PatternCallAssignment_3 ) )
            // InternalMGLang.g:4747:2: ( rule__PatternVariable__PatternCallAssignment_3 )
            {
             before(grammarAccess.getPatternVariableAccess().getPatternCallAssignment_3()); 
            // InternalMGLang.g:4748:2: ( rule__PatternVariable__PatternCallAssignment_3 )
            // InternalMGLang.g:4748:3: rule__PatternVariable__PatternCallAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PatternVariable__PatternCallAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPatternVariableAccess().getPatternCallAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMGLang.g:4757:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4761:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMGLang.g:4762:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMGLang.g:4769:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4773:1: ( ( 'var' ) )
            // InternalMGLang.g:4774:1: ( 'var' )
            {
            // InternalMGLang.g:4774:1: ( 'var' )
            // InternalMGLang.g:4775:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMGLang.g:4784:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4788:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMGLang.g:4789:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMGLang.g:4796:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4800:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalMGLang.g:4801:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalMGLang.g:4801:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalMGLang.g:4802:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalMGLang.g:4803:2: ( rule__Variable__NameAssignment_1 )
            // InternalMGLang.g:4803:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMGLang.g:4811:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4815:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalMGLang.g:4816:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMGLang.g:4823:1: rule__Variable__Group__2__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4827:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:4828:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:4828:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:4829:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getVariableAccess().getASSIGNMENT_OPTerminalRuleCall_2()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getASSIGNMENT_OPTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalMGLang.g:4838:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4842:1: ( rule__Variable__Group__3__Impl )
            // InternalMGLang.g:4843:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalMGLang.g:4849:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ValueAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4853:1: ( ( ( rule__Variable__ValueAssignment_3 ) ) )
            // InternalMGLang.g:4854:1: ( ( rule__Variable__ValueAssignment_3 ) )
            {
            // InternalMGLang.g:4854:1: ( ( rule__Variable__ValueAssignment_3 ) )
            // InternalMGLang.g:4855:2: ( rule__Variable__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_3()); 
            // InternalMGLang.g:4856:2: ( rule__Variable__ValueAssignment_3 )
            // InternalMGLang.g:4856:3: rule__Variable__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__ForStatement__Group__0"
    // InternalMGLang.g:4865:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4869:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalMGLang.g:4870:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ForStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4877:1: rule__ForStatement__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4881:1: ( ( 'for' ) )
            // InternalMGLang.g:4882:1: ( 'for' )
            {
            // InternalMGLang.g:4882:1: ( 'for' )
            // InternalMGLang.g:4883:2: 'for'
            {
             before(grammarAccess.getForStatementAccess().getForKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getForStatementAccess().getForKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:4892:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4896:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalMGLang.g:4897:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ForStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4904:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__HeadAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4908:1: ( ( ( rule__ForStatement__HeadAssignment_1 ) ) )
            // InternalMGLang.g:4909:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            {
            // InternalMGLang.g:4909:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            // InternalMGLang.g:4910:2: ( rule__ForStatement__HeadAssignment_1 )
            {
             before(grammarAccess.getForStatementAccess().getHeadAssignment_1()); 
            // InternalMGLang.g:4911:2: ( rule__ForStatement__HeadAssignment_1 )
            // InternalMGLang.g:4911:3: rule__ForStatement__HeadAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__HeadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForStatementAccess().getHeadAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:4919:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4923:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalMGLang.g:4924:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ForStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4931:1: rule__ForStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4935:1: ( ( '{' ) )
            // InternalMGLang.g:4936:1: ( '{' )
            {
            // InternalMGLang.g:4936:1: ( '{' )
            // InternalMGLang.g:4937:2: '{'
            {
             before(grammarAccess.getForStatementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getForStatementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalMGLang.g:4946:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4950:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalMGLang.g:4951:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__ForStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4958:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__BodyAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4962:1: ( ( ( rule__ForStatement__BodyAssignment_3 ) ) )
            // InternalMGLang.g:4963:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:4963:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            // InternalMGLang.g:4964:2: ( rule__ForStatement__BodyAssignment_3 )
            {
             before(grammarAccess.getForStatementAccess().getBodyAssignment_3()); 
            // InternalMGLang.g:4965:2: ( rule__ForStatement__BodyAssignment_3 )
            // InternalMGLang.g:4965:3: rule__ForStatement__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForStatementAccess().getBodyAssignment_3()); 

            }


            }

        }
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
    // InternalMGLang.g:4973:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4977:1: ( rule__ForStatement__Group__4__Impl )
            // InternalMGLang.g:4978:2: rule__ForStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:4984:1: rule__ForStatement__Group__4__Impl : ( '}' ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4988:1: ( ( '}' ) )
            // InternalMGLang.g:4989:1: ( '}' )
            {
            // InternalMGLang.g:4989:1: ( '}' )
            // InternalMGLang.g:4990:2: '}'
            {
             before(grammarAccess.getForStatementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getForStatementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMGLang.g:5000:1: rule__GeneralForHead__Group__0 : rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 ;
    public final void rule__GeneralForHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5004:1: ( rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 )
            // InternalMGLang.g:5005:2: rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__GeneralForHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralForHead__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5012:1: rule__GeneralForHead__Group__0__Impl : ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) ;
    public final void rule__GeneralForHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5016:1: ( ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) )
            // InternalMGLang.g:5017:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            {
            // InternalMGLang.g:5017:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            // InternalMGLang.g:5018:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            {
             before(grammarAccess.getGeneralForHeadAccess().getIteratorVarAssignment_0()); 
            // InternalMGLang.g:5019:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            // InternalMGLang.g:5019:3: rule__GeneralForHead__IteratorVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__IteratorVarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralForHeadAccess().getIteratorVarAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:5027:1: rule__GeneralForHead__Group__1 : rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 ;
    public final void rule__GeneralForHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5031:1: ( rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 )
            // InternalMGLang.g:5032:2: rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__GeneralForHead__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralForHead__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5039:1: rule__GeneralForHead__Group__1__Impl : ( 'in' ) ;
    public final void rule__GeneralForHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5043:1: ( ( 'in' ) )
            // InternalMGLang.g:5044:1: ( 'in' )
            {
            // InternalMGLang.g:5044:1: ( 'in' )
            // InternalMGLang.g:5045:2: 'in'
            {
             before(grammarAccess.getGeneralForHeadAccess().getInKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGeneralForHeadAccess().getInKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:5054:1: rule__GeneralForHead__Group__2 : rule__GeneralForHead__Group__2__Impl ;
    public final void rule__GeneralForHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5058:1: ( rule__GeneralForHead__Group__2__Impl )
            // InternalMGLang.g:5059:2: rule__GeneralForHead__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5065:1: rule__GeneralForHead__Group__2__Impl : ( ( rule__GeneralForHead__RangeAssignment_2 ) ) ;
    public final void rule__GeneralForHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5069:1: ( ( ( rule__GeneralForHead__RangeAssignment_2 ) ) )
            // InternalMGLang.g:5070:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            {
            // InternalMGLang.g:5070:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            // InternalMGLang.g:5071:2: ( rule__GeneralForHead__RangeAssignment_2 )
            {
             before(grammarAccess.getGeneralForHeadAccess().getRangeAssignment_2()); 
            // InternalMGLang.g:5072:2: ( rule__GeneralForHead__RangeAssignment_2 )
            // InternalMGLang.g:5072:3: rule__GeneralForHead__RangeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GeneralForHead__RangeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeneralForHeadAccess().getRangeAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:5081:1: rule__ForEachHead__Group__0 : rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 ;
    public final void rule__ForEachHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5085:1: ( rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 )
            // InternalMGLang.g:5086:2: rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ForEachHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5093:1: rule__ForEachHead__Group__0__Impl : ( ( rule__ForEachHead__SrcAssignment_0 ) ) ;
    public final void rule__ForEachHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5097:1: ( ( ( rule__ForEachHead__SrcAssignment_0 ) ) )
            // InternalMGLang.g:5098:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            {
            // InternalMGLang.g:5098:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            // InternalMGLang.g:5099:2: ( rule__ForEachHead__SrcAssignment_0 )
            {
             before(grammarAccess.getForEachHeadAccess().getSrcAssignment_0()); 
            // InternalMGLang.g:5100:2: ( rule__ForEachHead__SrcAssignment_0 )
            // InternalMGLang.g:5100:3: rule__ForEachHead__SrcAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__SrcAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getForEachHeadAccess().getSrcAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:5108:1: rule__ForEachHead__Group__1 : rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 ;
    public final void rule__ForEachHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5112:1: ( rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 )
            // InternalMGLang.g:5113:2: rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ForEachHead__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5120:1: rule__ForEachHead__Group__1__Impl : ( '-' ) ;
    public final void rule__ForEachHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5124:1: ( ( '-' ) )
            // InternalMGLang.g:5125:1: ( '-' )
            {
            // InternalMGLang.g:5125:1: ( '-' )
            // InternalMGLang.g:5126:2: '-'
            {
             before(grammarAccess.getForEachHeadAccess().getHyphenMinusKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getForEachHeadAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:5135:1: rule__ForEachHead__Group__2 : rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 ;
    public final void rule__ForEachHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5139:1: ( rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 )
            // InternalMGLang.g:5140:2: rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ForEachHead__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5147:1: rule__ForEachHead__Group__2__Impl : ( ( rule__ForEachHead__ErefAssignment_2 ) ) ;
    public final void rule__ForEachHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5151:1: ( ( ( rule__ForEachHead__ErefAssignment_2 ) ) )
            // InternalMGLang.g:5152:1: ( ( rule__ForEachHead__ErefAssignment_2 ) )
            {
            // InternalMGLang.g:5152:1: ( ( rule__ForEachHead__ErefAssignment_2 ) )
            // InternalMGLang.g:5153:2: ( rule__ForEachHead__ErefAssignment_2 )
            {
             before(grammarAccess.getForEachHeadAccess().getErefAssignment_2()); 
            // InternalMGLang.g:5154:2: ( rule__ForEachHead__ErefAssignment_2 )
            // InternalMGLang.g:5154:3: rule__ForEachHead__ErefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__ErefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForEachHeadAccess().getErefAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:5162:1: rule__ForEachHead__Group__3 : rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 ;
    public final void rule__ForEachHead__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5166:1: ( rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 )
            // InternalMGLang.g:5167:2: rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ForEachHead__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5174:1: rule__ForEachHead__Group__3__Impl : ( '->' ) ;
    public final void rule__ForEachHead__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5178:1: ( ( '->' ) )
            // InternalMGLang.g:5179:1: ( '->' )
            {
            // InternalMGLang.g:5179:1: ( '->' )
            // InternalMGLang.g:5180:2: '->'
            {
             before(grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getForEachHeadAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:5189:1: rule__ForEachHead__Group__4 : rule__ForEachHead__Group__4__Impl ;
    public final void rule__ForEachHead__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5193:1: ( rule__ForEachHead__Group__4__Impl )
            // InternalMGLang.g:5194:2: rule__ForEachHead__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5200:1: rule__ForEachHead__Group__4__Impl : ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) ;
    public final void rule__ForEachHead__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5204:1: ( ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) )
            // InternalMGLang.g:5205:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            {
            // InternalMGLang.g:5205:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            // InternalMGLang.g:5206:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            {
             before(grammarAccess.getForEachHeadAccess().getIteratorVarAssignment_4()); 
            // InternalMGLang.g:5207:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            // InternalMGLang.g:5207:3: rule__ForEachHead__IteratorVarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForEachHead__IteratorVarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForEachHeadAccess().getIteratorVarAssignment_4()); 

            }


            }

        }
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
    // InternalMGLang.g:5216:1: rule__ForBody__Group__0 : rule__ForBody__Group__0__Impl rule__ForBody__Group__1 ;
    public final void rule__ForBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5220:1: ( rule__ForBody__Group__0__Impl rule__ForBody__Group__1 )
            // InternalMGLang.g:5221:2: rule__ForBody__Group__0__Impl rule__ForBody__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ForBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBody__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5228:1: rule__ForBody__Group__0__Impl : ( () ) ;
    public final void rule__ForBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5232:1: ( ( () ) )
            // InternalMGLang.g:5233:1: ( () )
            {
            // InternalMGLang.g:5233:1: ( () )
            // InternalMGLang.g:5234:2: ()
            {
             before(grammarAccess.getForBodyAccess().getForBodyAction_0()); 
            // InternalMGLang.g:5235:2: ()
            // InternalMGLang.g:5235:3: 
            {
            }

             after(grammarAccess.getForBodyAccess().getForBodyAction_0()); 

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
    // InternalMGLang.g:5243:1: rule__ForBody__Group__1 : rule__ForBody__Group__1__Impl ;
    public final void rule__ForBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5247:1: ( rule__ForBody__Group__1__Impl )
            // InternalMGLang.g:5248:2: rule__ForBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForBody__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5254:1: rule__ForBody__Group__1__Impl : ( ( rule__ForBody__CommandsAssignment_1 )* ) ;
    public final void rule__ForBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5258:1: ( ( ( rule__ForBody__CommandsAssignment_1 )* ) )
            // InternalMGLang.g:5259:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            {
            // InternalMGLang.g:5259:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            // InternalMGLang.g:5260:2: ( rule__ForBody__CommandsAssignment_1 )*
            {
             before(grammarAccess.getForBodyAccess().getCommandsAssignment_1()); 
            // InternalMGLang.g:5261:2: ( rule__ForBody__CommandsAssignment_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||(LA44_0>=51 && LA44_0<=52)||LA44_0==54||LA44_0==59||LA44_0==62) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMGLang.g:5261:3: rule__ForBody__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ForBody__CommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getForBodyAccess().getCommandsAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:5270:1: rule__IfElseSwitch__Group__0 : rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1 ;
    public final void rule__IfElseSwitch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5274:1: ( rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1 )
            // InternalMGLang.g:5275:2: rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__IfElseSwitch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5282:1: rule__IfElseSwitch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__IfElseSwitch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5286:1: ( ( 'switch' ) )
            // InternalMGLang.g:5287:1: ( 'switch' )
            {
            // InternalMGLang.g:5287:1: ( 'switch' )
            // InternalMGLang.g:5288:2: 'switch'
            {
             before(grammarAccess.getIfElseSwitchAccess().getSwitchKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getIfElseSwitchAccess().getSwitchKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:5297:1: rule__IfElseSwitch__Group__1 : rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2 ;
    public final void rule__IfElseSwitch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5301:1: ( rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2 )
            // InternalMGLang.g:5302:2: rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__IfElseSwitch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5309:1: rule__IfElseSwitch__Group__1__Impl : ( '{' ) ;
    public final void rule__IfElseSwitch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5313:1: ( ( '{' ) )
            // InternalMGLang.g:5314:1: ( '{' )
            {
            // InternalMGLang.g:5314:1: ( '{' )
            // InternalMGLang.g:5315:2: '{'
            {
             before(grammarAccess.getIfElseSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getIfElseSwitchAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:5324:1: rule__IfElseSwitch__Group__2 : rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3 ;
    public final void rule__IfElseSwitch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5328:1: ( rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3 )
            // InternalMGLang.g:5329:2: rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__IfElseSwitch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5336:1: rule__IfElseSwitch__Group__2__Impl : ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) ) ;
    public final void rule__IfElseSwitch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5340:1: ( ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) ) )
            // InternalMGLang.g:5341:1: ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) )
            {
            // InternalMGLang.g:5341:1: ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) )
            // InternalMGLang.g:5342:2: ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* )
            {
            // InternalMGLang.g:5342:2: ( ( rule__IfElseSwitch__CasesAssignment_2 ) )
            // InternalMGLang.g:5343:3: ( rule__IfElseSwitch__CasesAssignment_2 )
            {
             before(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            // InternalMGLang.g:5344:3: ( rule__IfElseSwitch__CasesAssignment_2 )
            // InternalMGLang.g:5344:4: rule__IfElseSwitch__CasesAssignment_2
            {
            pushFollow(FOLLOW_39);
            rule__IfElseSwitch__CasesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 

            }

            // InternalMGLang.g:5347:2: ( ( rule__IfElseSwitch__CasesAssignment_2 )* )
            // InternalMGLang.g:5348:3: ( rule__IfElseSwitch__CasesAssignment_2 )*
            {
             before(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            // InternalMGLang.g:5349:3: ( rule__IfElseSwitch__CasesAssignment_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==55) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMGLang.g:5349:4: rule__IfElseSwitch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__IfElseSwitch__CasesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 

            }


            }


            }

        }
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
    // InternalMGLang.g:5358:1: rule__IfElseSwitch__Group__3 : rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4 ;
    public final void rule__IfElseSwitch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5362:1: ( rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4 )
            // InternalMGLang.g:5363:2: rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__IfElseSwitch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5370:1: rule__IfElseSwitch__Group__3__Impl : ( ( rule__IfElseSwitch__DefaultAssignment_3 )? ) ;
    public final void rule__IfElseSwitch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5374:1: ( ( ( rule__IfElseSwitch__DefaultAssignment_3 )? ) )
            // InternalMGLang.g:5375:1: ( ( rule__IfElseSwitch__DefaultAssignment_3 )? )
            {
            // InternalMGLang.g:5375:1: ( ( rule__IfElseSwitch__DefaultAssignment_3 )? )
            // InternalMGLang.g:5376:2: ( rule__IfElseSwitch__DefaultAssignment_3 )?
            {
             before(grammarAccess.getIfElseSwitchAccess().getDefaultAssignment_3()); 
            // InternalMGLang.g:5377:2: ( rule__IfElseSwitch__DefaultAssignment_3 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMGLang.g:5377:3: rule__IfElseSwitch__DefaultAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfElseSwitch__DefaultAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfElseSwitchAccess().getDefaultAssignment_3()); 

            }


            }

        }
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
    // InternalMGLang.g:5385:1: rule__IfElseSwitch__Group__4 : rule__IfElseSwitch__Group__4__Impl ;
    public final void rule__IfElseSwitch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5389:1: ( rule__IfElseSwitch__Group__4__Impl )
            // InternalMGLang.g:5390:2: rule__IfElseSwitch__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfElseSwitch__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5396:1: rule__IfElseSwitch__Group__4__Impl : ( '}' ) ;
    public final void rule__IfElseSwitch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5400:1: ( ( '}' ) )
            // InternalMGLang.g:5401:1: ( '}' )
            {
            // InternalMGLang.g:5401:1: ( '}' )
            // InternalMGLang.g:5402:2: '}'
            {
             before(grammarAccess.getIfElseSwitchAccess().getRightCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getIfElseSwitchAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMGLang.g:5412:1: rule__IfElseCase__Group__0 : rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1 ;
    public final void rule__IfElseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5416:1: ( rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1 )
            // InternalMGLang.g:5417:2: rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__IfElseCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5424:1: rule__IfElseCase__Group__0__Impl : ( 'case' ) ;
    public final void rule__IfElseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5428:1: ( ( 'case' ) )
            // InternalMGLang.g:5429:1: ( 'case' )
            {
            // InternalMGLang.g:5429:1: ( 'case' )
            // InternalMGLang.g:5430:2: 'case'
            {
             before(grammarAccess.getIfElseCaseAccess().getCaseKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getIfElseCaseAccess().getCaseKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:5439:1: rule__IfElseCase__Group__1 : rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2 ;
    public final void rule__IfElseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5443:1: ( rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2 )
            // InternalMGLang.g:5444:2: rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__IfElseCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5451:1: rule__IfElseCase__Group__1__Impl : ( ( rule__IfElseCase__ValAssignment_1 ) ) ;
    public final void rule__IfElseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5455:1: ( ( ( rule__IfElseCase__ValAssignment_1 ) ) )
            // InternalMGLang.g:5456:1: ( ( rule__IfElseCase__ValAssignment_1 ) )
            {
            // InternalMGLang.g:5456:1: ( ( rule__IfElseCase__ValAssignment_1 ) )
            // InternalMGLang.g:5457:2: ( rule__IfElseCase__ValAssignment_1 )
            {
             before(grammarAccess.getIfElseCaseAccess().getValAssignment_1()); 
            // InternalMGLang.g:5458:2: ( rule__IfElseCase__ValAssignment_1 )
            // InternalMGLang.g:5458:3: rule__IfElseCase__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfElseCase__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfElseCaseAccess().getValAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:5466:1: rule__IfElseCase__Group__2 : rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3 ;
    public final void rule__IfElseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5470:1: ( rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3 )
            // InternalMGLang.g:5471:2: rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__IfElseCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5478:1: rule__IfElseCase__Group__2__Impl : ( ':' ) ;
    public final void rule__IfElseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5482:1: ( ( ':' ) )
            // InternalMGLang.g:5483:1: ( ':' )
            {
            // InternalMGLang.g:5483:1: ( ':' )
            // InternalMGLang.g:5484:2: ':'
            {
             before(grammarAccess.getIfElseCaseAccess().getColonKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getIfElseCaseAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalMGLang.g:5493:1: rule__IfElseCase__Group__3 : rule__IfElseCase__Group__3__Impl ;
    public final void rule__IfElseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5497:1: ( rule__IfElseCase__Group__3__Impl )
            // InternalMGLang.g:5498:2: rule__IfElseCase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfElseCase__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5504:1: rule__IfElseCase__Group__3__Impl : ( ( rule__IfElseCase__BodyAssignment_3 ) ) ;
    public final void rule__IfElseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5508:1: ( ( ( rule__IfElseCase__BodyAssignment_3 ) ) )
            // InternalMGLang.g:5509:1: ( ( rule__IfElseCase__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:5509:1: ( ( rule__IfElseCase__BodyAssignment_3 ) )
            // InternalMGLang.g:5510:2: ( rule__IfElseCase__BodyAssignment_3 )
            {
             before(grammarAccess.getIfElseCaseAccess().getBodyAssignment_3()); 
            // InternalMGLang.g:5511:2: ( rule__IfElseCase__BodyAssignment_3 )
            // InternalMGLang.g:5511:3: rule__IfElseCase__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfElseCase__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfElseCaseAccess().getBodyAssignment_3()); 

            }


            }

        }
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
    // InternalMGLang.g:5520:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5524:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalMGLang.g:5525:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Default__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5532:1: rule__Default__Group__0__Impl : ( 'default' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5536:1: ( ( 'default' ) )
            // InternalMGLang.g:5537:1: ( 'default' )
            {
            // InternalMGLang.g:5537:1: ( 'default' )
            // InternalMGLang.g:5538:2: 'default'
            {
             before(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:5547:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5551:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalMGLang.g:5552:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Default__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Default__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5559:1: rule__Default__Group__1__Impl : ( ':' ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5563:1: ( ( ':' ) )
            // InternalMGLang.g:5564:1: ( ':' )
            {
            // InternalMGLang.g:5564:1: ( ':' )
            // InternalMGLang.g:5565:2: ':'
            {
             before(grammarAccess.getDefaultAccess().getColonKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDefaultAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:5574:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5578:1: ( rule__Default__Group__2__Impl )
            // InternalMGLang.g:5579:2: rule__Default__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5585:1: rule__Default__Group__2__Impl : ( ruleCaseBody ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5589:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:5590:1: ( ruleCaseBody )
            {
            // InternalMGLang.g:5590:1: ( ruleCaseBody )
            // InternalMGLang.g:5591:2: ruleCaseBody
            {
             before(grammarAccess.getDefaultAccess().getCaseBodyParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;

             after(grammarAccess.getDefaultAccess().getCaseBodyParserRuleCall_2()); 

            }


            }

        }
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
    // InternalMGLang.g:5601:1: rule__SwitchCase__Group__0 : rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 ;
    public final void rule__SwitchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5605:1: ( rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 )
            // InternalMGLang.g:5606:2: rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SwitchCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5613:1: rule__SwitchCase__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5617:1: ( ( 'switch' ) )
            // InternalMGLang.g:5618:1: ( 'switch' )
            {
            // InternalMGLang.g:5618:1: ( 'switch' )
            // InternalMGLang.g:5619:2: 'switch'
            {
             before(grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:5628:1: rule__SwitchCase__Group__1 : rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 ;
    public final void rule__SwitchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5632:1: ( rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 )
            // InternalMGLang.g:5633:2: rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SwitchCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5640:1: rule__SwitchCase__Group__1__Impl : ( '(' ) ;
    public final void rule__SwitchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5644:1: ( ( '(' ) )
            // InternalMGLang.g:5645:1: ( '(' )
            {
            // InternalMGLang.g:5645:1: ( '(' )
            // InternalMGLang.g:5646:2: '('
            {
             before(grammarAccess.getSwitchCaseAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSwitchCaseAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:5655:1: rule__SwitchCase__Group__2 : rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 ;
    public final void rule__SwitchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5659:1: ( rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 )
            // InternalMGLang.g:5660:2: rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SwitchCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5667:1: rule__SwitchCase__Group__2__Impl : ( ( rule__SwitchCase__AttributeAssignment_2 ) ) ;
    public final void rule__SwitchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5671:1: ( ( ( rule__SwitchCase__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:5672:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:5672:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            // InternalMGLang.g:5673:2: ( rule__SwitchCase__AttributeAssignment_2 )
            {
             before(grammarAccess.getSwitchCaseAccess().getAttributeAssignment_2()); 
            // InternalMGLang.g:5674:2: ( rule__SwitchCase__AttributeAssignment_2 )
            // InternalMGLang.g:5674:3: rule__SwitchCase__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCase__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSwitchCaseAccess().getAttributeAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:5682:1: rule__SwitchCase__Group__3 : rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 ;
    public final void rule__SwitchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5686:1: ( rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 )
            // InternalMGLang.g:5687:2: rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SwitchCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5694:1: rule__SwitchCase__Group__3__Impl : ( ')' ) ;
    public final void rule__SwitchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5698:1: ( ( ')' ) )
            // InternalMGLang.g:5699:1: ( ')' )
            {
            // InternalMGLang.g:5699:1: ( ')' )
            // InternalMGLang.g:5700:2: ')'
            {
             before(grammarAccess.getSwitchCaseAccess().getRightParenthesisKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSwitchCaseAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:5709:1: rule__SwitchCase__Group__4 : rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 ;
    public final void rule__SwitchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5713:1: ( rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 )
            // InternalMGLang.g:5714:2: rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__SwitchCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5721:1: rule__SwitchCase__Group__4__Impl : ( '{' ) ;
    public final void rule__SwitchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5725:1: ( ( '{' ) )
            // InternalMGLang.g:5726:1: ( '{' )
            {
            // InternalMGLang.g:5726:1: ( '{' )
            // InternalMGLang.g:5727:2: '{'
            {
             before(grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMGLang.g:5736:1: rule__SwitchCase__Group__5 : rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 ;
    public final void rule__SwitchCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5740:1: ( rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 )
            // InternalMGLang.g:5741:2: rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__SwitchCase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5748:1: rule__SwitchCase__Group__5__Impl : ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) ;
    public final void rule__SwitchCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5752:1: ( ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) )
            // InternalMGLang.g:5753:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            {
            // InternalMGLang.g:5753:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            // InternalMGLang.g:5754:2: ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* )
            {
            // InternalMGLang.g:5754:2: ( ( rule__SwitchCase__CasesAssignment_5 ) )
            // InternalMGLang.g:5755:3: ( rule__SwitchCase__CasesAssignment_5 )
            {
             before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            // InternalMGLang.g:5756:3: ( rule__SwitchCase__CasesAssignment_5 )
            // InternalMGLang.g:5756:4: rule__SwitchCase__CasesAssignment_5
            {
            pushFollow(FOLLOW_39);
            rule__SwitchCase__CasesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 

            }

            // InternalMGLang.g:5759:2: ( ( rule__SwitchCase__CasesAssignment_5 )* )
            // InternalMGLang.g:5760:3: ( rule__SwitchCase__CasesAssignment_5 )*
            {
             before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            // InternalMGLang.g:5761:3: ( rule__SwitchCase__CasesAssignment_5 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==55) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMGLang.g:5761:4: rule__SwitchCase__CasesAssignment_5
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__SwitchCase__CasesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 

            }


            }


            }

        }
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
    // InternalMGLang.g:5770:1: rule__SwitchCase__Group__6 : rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7 ;
    public final void rule__SwitchCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5774:1: ( rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7 )
            // InternalMGLang.g:5775:2: rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__SwitchCase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__7();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5782:1: rule__SwitchCase__Group__6__Impl : ( ( rule__SwitchCase__DefaultAssignment_6 )? ) ;
    public final void rule__SwitchCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5786:1: ( ( ( rule__SwitchCase__DefaultAssignment_6 )? ) )
            // InternalMGLang.g:5787:1: ( ( rule__SwitchCase__DefaultAssignment_6 )? )
            {
            // InternalMGLang.g:5787:1: ( ( rule__SwitchCase__DefaultAssignment_6 )? )
            // InternalMGLang.g:5788:2: ( rule__SwitchCase__DefaultAssignment_6 )?
            {
             before(grammarAccess.getSwitchCaseAccess().getDefaultAssignment_6()); 
            // InternalMGLang.g:5789:2: ( rule__SwitchCase__DefaultAssignment_6 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMGLang.g:5789:3: rule__SwitchCase__DefaultAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__SwitchCase__DefaultAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchCaseAccess().getDefaultAssignment_6()); 

            }


            }

        }
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
    // InternalMGLang.g:5797:1: rule__SwitchCase__Group__7 : rule__SwitchCase__Group__7__Impl ;
    public final void rule__SwitchCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5801:1: ( rule__SwitchCase__Group__7__Impl )
            // InternalMGLang.g:5802:2: rule__SwitchCase__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCase__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5808:1: rule__SwitchCase__Group__7__Impl : ( '}' ) ;
    public final void rule__SwitchCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5812:1: ( ( '}' ) )
            // InternalMGLang.g:5813:1: ( '}' )
            {
            // InternalMGLang.g:5813:1: ( '}' )
            // InternalMGLang.g:5814:2: '}'
            {
             before(grammarAccess.getSwitchCaseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSwitchCaseAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalMGLang.g:5824:1: rule__CaseWithCast__Group__0 : rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1 ;
    public final void rule__CaseWithCast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5828:1: ( rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1 )
            // InternalMGLang.g:5829:2: rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CaseWithCast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5836:1: rule__CaseWithCast__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseWithCast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5840:1: ( ( 'case' ) )
            // InternalMGLang.g:5841:1: ( 'case' )
            {
            // InternalMGLang.g:5841:1: ( 'case' )
            // InternalMGLang.g:5842:2: 'case'
            {
             before(grammarAccess.getCaseWithCastAccess().getCaseKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCaseWithCastAccess().getCaseKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:5851:1: rule__CaseWithCast__Group__1 : rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2 ;
    public final void rule__CaseWithCast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5855:1: ( rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2 )
            // InternalMGLang.g:5856:2: rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__CaseWithCast__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5863:1: rule__CaseWithCast__Group__1__Impl : ( ( rule__CaseWithCast__NodeAssignment_1 ) ) ;
    public final void rule__CaseWithCast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5867:1: ( ( ( rule__CaseWithCast__NodeAssignment_1 ) ) )
            // InternalMGLang.g:5868:1: ( ( rule__CaseWithCast__NodeAssignment_1 ) )
            {
            // InternalMGLang.g:5868:1: ( ( rule__CaseWithCast__NodeAssignment_1 ) )
            // InternalMGLang.g:5869:2: ( rule__CaseWithCast__NodeAssignment_1 )
            {
             before(grammarAccess.getCaseWithCastAccess().getNodeAssignment_1()); 
            // InternalMGLang.g:5870:2: ( rule__CaseWithCast__NodeAssignment_1 )
            // InternalMGLang.g:5870:3: rule__CaseWithCast__NodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__NodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseWithCastAccess().getNodeAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:5878:1: rule__CaseWithCast__Group__2 : rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3 ;
    public final void rule__CaseWithCast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5882:1: ( rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3 )
            // InternalMGLang.g:5883:2: rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__CaseWithCast__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5890:1: rule__CaseWithCast__Group__2__Impl : ( ( rule__CaseWithCast__Group_2__0 )? ) ;
    public final void rule__CaseWithCast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5894:1: ( ( ( rule__CaseWithCast__Group_2__0 )? ) )
            // InternalMGLang.g:5895:1: ( ( rule__CaseWithCast__Group_2__0 )? )
            {
            // InternalMGLang.g:5895:1: ( ( rule__CaseWithCast__Group_2__0 )? )
            // InternalMGLang.g:5896:2: ( rule__CaseWithCast__Group_2__0 )?
            {
             before(grammarAccess.getCaseWithCastAccess().getGroup_2()); 
            // InternalMGLang.g:5897:2: ( rule__CaseWithCast__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMGLang.g:5897:3: rule__CaseWithCast__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseWithCast__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCaseWithCastAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMGLang.g:5905:1: rule__CaseWithCast__Group__3 : rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4 ;
    public final void rule__CaseWithCast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5909:1: ( rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4 )
            // InternalMGLang.g:5910:2: rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__CaseWithCast__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5917:1: rule__CaseWithCast__Group__3__Impl : ( ':' ) ;
    public final void rule__CaseWithCast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5921:1: ( ( ':' ) )
            // InternalMGLang.g:5922:1: ( ':' )
            {
            // InternalMGLang.g:5922:1: ( ':' )
            // InternalMGLang.g:5923:2: ':'
            {
             before(grammarAccess.getCaseWithCastAccess().getColonKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCaseWithCastAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:5932:1: rule__CaseWithCast__Group__4 : rule__CaseWithCast__Group__4__Impl ;
    public final void rule__CaseWithCast__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5936:1: ( rule__CaseWithCast__Group__4__Impl )
            // InternalMGLang.g:5937:2: rule__CaseWithCast__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5943:1: rule__CaseWithCast__Group__4__Impl : ( ( rule__CaseWithCast__BodyAssignment_4 ) ) ;
    public final void rule__CaseWithCast__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5947:1: ( ( ( rule__CaseWithCast__BodyAssignment_4 ) ) )
            // InternalMGLang.g:5948:1: ( ( rule__CaseWithCast__BodyAssignment_4 ) )
            {
            // InternalMGLang.g:5948:1: ( ( rule__CaseWithCast__BodyAssignment_4 ) )
            // InternalMGLang.g:5949:2: ( rule__CaseWithCast__BodyAssignment_4 )
            {
             before(grammarAccess.getCaseWithCastAccess().getBodyAssignment_4()); 
            // InternalMGLang.g:5950:2: ( rule__CaseWithCast__BodyAssignment_4 )
            // InternalMGLang.g:5950:3: rule__CaseWithCast__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCaseWithCastAccess().getBodyAssignment_4()); 

            }


            }

        }
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
    // InternalMGLang.g:5959:1: rule__CaseWithCast__Group_2__0 : rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1 ;
    public final void rule__CaseWithCast__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5963:1: ( rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1 )
            // InternalMGLang.g:5964:2: rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__CaseWithCast__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5971:1: rule__CaseWithCast__Group_2__0__Impl : ( 'when' ) ;
    public final void rule__CaseWithCast__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5975:1: ( ( 'when' ) )
            // InternalMGLang.g:5976:1: ( 'when' )
            {
            // InternalMGLang.g:5976:1: ( 'when' )
            // InternalMGLang.g:5977:2: 'when'
            {
             before(grammarAccess.getCaseWithCastAccess().getWhenKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getCaseWithCastAccess().getWhenKeyword_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:5986:1: rule__CaseWithCast__Group_2__1 : rule__CaseWithCast__Group_2__1__Impl ;
    public final void rule__CaseWithCast__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5990:1: ( rule__CaseWithCast__Group_2__1__Impl )
            // InternalMGLang.g:5991:2: rule__CaseWithCast__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:5997:1: rule__CaseWithCast__Group_2__1__Impl : ( ( rule__CaseWithCast__WhenAssignment_2_1 ) ) ;
    public final void rule__CaseWithCast__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6001:1: ( ( ( rule__CaseWithCast__WhenAssignment_2_1 ) ) )
            // InternalMGLang.g:6002:1: ( ( rule__CaseWithCast__WhenAssignment_2_1 ) )
            {
            // InternalMGLang.g:6002:1: ( ( rule__CaseWithCast__WhenAssignment_2_1 ) )
            // InternalMGLang.g:6003:2: ( rule__CaseWithCast__WhenAssignment_2_1 )
            {
             before(grammarAccess.getCaseWithCastAccess().getWhenAssignment_2_1()); 
            // InternalMGLang.g:6004:2: ( rule__CaseWithCast__WhenAssignment_2_1 )
            // InternalMGLang.g:6004:3: rule__CaseWithCast__WhenAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithCast__WhenAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseWithCastAccess().getWhenAssignment_2_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6013:1: rule__CaseWithoutCast__Group__0 : rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1 ;
    public final void rule__CaseWithoutCast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6017:1: ( rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1 )
            // InternalMGLang.g:6018:2: rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__CaseWithoutCast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6025:1: rule__CaseWithoutCast__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseWithoutCast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6029:1: ( ( 'case' ) )
            // InternalMGLang.g:6030:1: ( 'case' )
            {
            // InternalMGLang.g:6030:1: ( 'case' )
            // InternalMGLang.g:6031:2: 'case'
            {
             before(grammarAccess.getCaseWithoutCastAccess().getCaseKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCaseWithoutCastAccess().getCaseKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6040:1: rule__CaseWithoutCast__Group__1 : rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2 ;
    public final void rule__CaseWithoutCast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6044:1: ( rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2 )
            // InternalMGLang.g:6045:2: rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__CaseWithoutCast__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6052:1: rule__CaseWithoutCast__Group__1__Impl : ( ( rule__CaseWithoutCast__ValAssignment_1 ) ) ;
    public final void rule__CaseWithoutCast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6056:1: ( ( ( rule__CaseWithoutCast__ValAssignment_1 ) ) )
            // InternalMGLang.g:6057:1: ( ( rule__CaseWithoutCast__ValAssignment_1 ) )
            {
            // InternalMGLang.g:6057:1: ( ( rule__CaseWithoutCast__ValAssignment_1 ) )
            // InternalMGLang.g:6058:2: ( rule__CaseWithoutCast__ValAssignment_1 )
            {
             before(grammarAccess.getCaseWithoutCastAccess().getValAssignment_1()); 
            // InternalMGLang.g:6059:2: ( rule__CaseWithoutCast__ValAssignment_1 )
            // InternalMGLang.g:6059:3: rule__CaseWithoutCast__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseWithoutCastAccess().getValAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6067:1: rule__CaseWithoutCast__Group__2 : rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3 ;
    public final void rule__CaseWithoutCast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6071:1: ( rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3 )
            // InternalMGLang.g:6072:2: rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__CaseWithoutCast__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6079:1: rule__CaseWithoutCast__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseWithoutCast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6083:1: ( ( ':' ) )
            // InternalMGLang.g:6084:1: ( ':' )
            {
            // InternalMGLang.g:6084:1: ( ':' )
            // InternalMGLang.g:6085:2: ':'
            {
             before(grammarAccess.getCaseWithoutCastAccess().getColonKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCaseWithoutCastAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalMGLang.g:6094:1: rule__CaseWithoutCast__Group__3 : rule__CaseWithoutCast__Group__3__Impl ;
    public final void rule__CaseWithoutCast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6098:1: ( rule__CaseWithoutCast__Group__3__Impl )
            // InternalMGLang.g:6099:2: rule__CaseWithoutCast__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6105:1: rule__CaseWithoutCast__Group__3__Impl : ( ( rule__CaseWithoutCast__BodyAssignment_3 ) ) ;
    public final void rule__CaseWithoutCast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6109:1: ( ( ( rule__CaseWithoutCast__BodyAssignment_3 ) ) )
            // InternalMGLang.g:6110:1: ( ( rule__CaseWithoutCast__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:6110:1: ( ( rule__CaseWithoutCast__BodyAssignment_3 ) )
            // InternalMGLang.g:6111:2: ( rule__CaseWithoutCast__BodyAssignment_3 )
            {
             before(grammarAccess.getCaseWithoutCastAccess().getBodyAssignment_3()); 
            // InternalMGLang.g:6112:2: ( rule__CaseWithoutCast__BodyAssignment_3 )
            // InternalMGLang.g:6112:3: rule__CaseWithoutCast__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CaseWithoutCast__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCaseWithoutCastAccess().getBodyAssignment_3()); 

            }


            }

        }
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
    // InternalMGLang.g:6121:1: rule__CaseBody__Group_0__0 : rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 ;
    public final void rule__CaseBody__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6125:1: ( rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 )
            // InternalMGLang.g:6126:2: rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CaseBody__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6133:1: rule__CaseBody__Group_0__0__Impl : ( () ) ;
    public final void rule__CaseBody__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6137:1: ( ( () ) )
            // InternalMGLang.g:6138:1: ( () )
            {
            // InternalMGLang.g:6138:1: ( () )
            // InternalMGLang.g:6139:2: ()
            {
             before(grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0()); 
            // InternalMGLang.g:6140:2: ()
            // InternalMGLang.g:6140:3: 
            {
            }

             after(grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0()); 

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
    // InternalMGLang.g:6148:1: rule__CaseBody__Group_0__1 : rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 ;
    public final void rule__CaseBody__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6152:1: ( rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 )
            // InternalMGLang.g:6153:2: rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2
            {
            pushFollow(FOLLOW_43);
            rule__CaseBody__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6160:1: rule__CaseBody__Group_0__1__Impl : ( '{' ) ;
    public final void rule__CaseBody__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6164:1: ( ( '{' ) )
            // InternalMGLang.g:6165:1: ( '{' )
            {
            // InternalMGLang.g:6165:1: ( '{' )
            // InternalMGLang.g:6166:2: '{'
            {
             before(grammarAccess.getCaseBodyAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCaseBodyAccess().getLeftCurlyBracketKeyword_0_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6175:1: rule__CaseBody__Group_0__2 : rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 ;
    public final void rule__CaseBody__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6179:1: ( rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 )
            // InternalMGLang.g:6180:2: rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3
            {
            pushFollow(FOLLOW_43);
            rule__CaseBody__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_0__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6187:1: rule__CaseBody__Group_0__2__Impl : ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) ;
    public final void rule__CaseBody__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6191:1: ( ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) )
            // InternalMGLang.g:6192:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            {
            // InternalMGLang.g:6192:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            // InternalMGLang.g:6193:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            {
             before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_0_2()); 
            // InternalMGLang.g:6194:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID||LA50_0==52||LA50_0==54||LA50_0==59||LA50_0==62) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMGLang.g:6194:3: rule__CaseBody__ExpressionsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__CaseBody__ExpressionsAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_0_2()); 

            }


            }

        }
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
    // InternalMGLang.g:6202:1: rule__CaseBody__Group_0__3 : rule__CaseBody__Group_0__3__Impl ;
    public final void rule__CaseBody__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6206:1: ( rule__CaseBody__Group_0__3__Impl )
            // InternalMGLang.g:6207:2: rule__CaseBody__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_0__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6213:1: rule__CaseBody__Group_0__3__Impl : ( '}' ) ;
    public final void rule__CaseBody__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6217:1: ( ( '}' ) )
            // InternalMGLang.g:6218:1: ( '}' )
            {
            // InternalMGLang.g:6218:1: ( '}' )
            // InternalMGLang.g:6219:2: '}'
            {
             before(grammarAccess.getCaseBodyAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCaseBodyAccess().getRightCurlyBracketKeyword_0_3()); 

            }


            }

        }
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
    // InternalMGLang.g:6229:1: rule__CaseBody__Group_1__0 : rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1 ;
    public final void rule__CaseBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6233:1: ( rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1 )
            // InternalMGLang.g:6234:2: rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__CaseBody__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6241:1: rule__CaseBody__Group_1__0__Impl : ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__CaseBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6245:1: ( ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) ) )
            // InternalMGLang.g:6246:1: ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) )
            {
            // InternalMGLang.g:6246:1: ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) )
            // InternalMGLang.g:6247:2: ( rule__CaseBody__ExpressionsAssignment_1_0 )
            {
             before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_1_0()); 
            // InternalMGLang.g:6248:2: ( rule__CaseBody__ExpressionsAssignment_1_0 )
            // InternalMGLang.g:6248:3: rule__CaseBody__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CaseBody__ExpressionsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6256:1: rule__CaseBody__Group_1__1 : rule__CaseBody__Group_1__1__Impl ;
    public final void rule__CaseBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6260:1: ( rule__CaseBody__Group_1__1__Impl )
            // InternalMGLang.g:6261:2: rule__CaseBody__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseBody__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6267:1: rule__CaseBody__Group_1__1__Impl : ( RULE_NEWLINE ) ;
    public final void rule__CaseBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6271:1: ( ( RULE_NEWLINE ) )
            // InternalMGLang.g:6272:1: ( RULE_NEWLINE )
            {
            // InternalMGLang.g:6272:1: ( RULE_NEWLINE )
            // InternalMGLang.g:6273:2: RULE_NEWLINE
            {
             before(grammarAccess.getCaseBodyAccess().getNEWLINETerminalRuleCall_1_1()); 
            match(input,RULE_NEWLINE,FOLLOW_2); 
             after(grammarAccess.getCaseBodyAccess().getNEWLINETerminalRuleCall_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6283:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6287:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalMGLang.g:6288:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6295:1: rule__List__Group__0__Impl : ( 'List' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6299:1: ( ( 'List' ) )
            // InternalMGLang.g:6300:1: ( 'List' )
            {
            // InternalMGLang.g:6300:1: ( 'List' )
            // InternalMGLang.g:6301:2: 'List'
            {
             before(grammarAccess.getListAccess().getListKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getListAccess().getListKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6310:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6314:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalMGLang.g:6315:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__List__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6322:1: rule__List__Group__1__Impl : ( ( rule__List__NameAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6326:1: ( ( ( rule__List__NameAssignment_1 ) ) )
            // InternalMGLang.g:6327:1: ( ( rule__List__NameAssignment_1 ) )
            {
            // InternalMGLang.g:6327:1: ( ( rule__List__NameAssignment_1 ) )
            // InternalMGLang.g:6328:2: ( rule__List__NameAssignment_1 )
            {
             before(grammarAccess.getListAccess().getNameAssignment_1()); 
            // InternalMGLang.g:6329:2: ( rule__List__NameAssignment_1 )
            // InternalMGLang.g:6329:3: rule__List__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__List__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6337:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6341:1: ( rule__List__Group__2__Impl )
            // InternalMGLang.g:6342:2: rule__List__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6348:1: rule__List__Group__2__Impl : ( ( rule__List__Group_2__0 )? ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6352:1: ( ( ( rule__List__Group_2__0 )? ) )
            // InternalMGLang.g:6353:1: ( ( rule__List__Group_2__0 )? )
            {
            // InternalMGLang.g:6353:1: ( ( rule__List__Group_2__0 )? )
            // InternalMGLang.g:6354:2: ( rule__List__Group_2__0 )?
            {
             before(grammarAccess.getListAccess().getGroup_2()); 
            // InternalMGLang.g:6355:2: ( rule__List__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ASSIGNMENT_OP) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMGLang.g:6355:3: rule__List__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMGLang.g:6364:1: rule__List__Group_2__0 : rule__List__Group_2__0__Impl rule__List__Group_2__1 ;
    public final void rule__List__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6368:1: ( rule__List__Group_2__0__Impl rule__List__Group_2__1 )
            // InternalMGLang.g:6369:2: rule__List__Group_2__0__Impl rule__List__Group_2__1
            {
            pushFollow(FOLLOW_46);
            rule__List__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6376:1: rule__List__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__List__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6380:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:6381:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:6381:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:6382:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getListAccess().getASSIGNMENT_OPTerminalRuleCall_2_0()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getListAccess().getASSIGNMENT_OPTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6391:1: rule__List__Group_2__1 : rule__List__Group_2__1__Impl ;
    public final void rule__List__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6395:1: ( rule__List__Group_2__1__Impl )
            // InternalMGLang.g:6396:2: rule__List__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6402:1: rule__List__Group_2__1__Impl : ( ( rule__List__CreatedByAssignment_2_1 ) ) ;
    public final void rule__List__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6406:1: ( ( ( rule__List__CreatedByAssignment_2_1 ) ) )
            // InternalMGLang.g:6407:1: ( ( rule__List__CreatedByAssignment_2_1 ) )
            {
            // InternalMGLang.g:6407:1: ( ( rule__List__CreatedByAssignment_2_1 ) )
            // InternalMGLang.g:6408:2: ( rule__List__CreatedByAssignment_2_1 )
            {
             before(grammarAccess.getListAccess().getCreatedByAssignment_2_1()); 
            // InternalMGLang.g:6409:2: ( rule__List__CreatedByAssignment_2_1 )
            // InternalMGLang.g:6409:3: rule__List__CreatedByAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__List__CreatedByAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getCreatedByAssignment_2_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6418:1: rule__ListAdHoc__Group__0 : rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 ;
    public final void rule__ListAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6422:1: ( rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 )
            // InternalMGLang.g:6423:2: rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ListAdHoc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6430:1: rule__ListAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__ListAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6434:1: ( ( '[' ) )
            // InternalMGLang.g:6435:1: ( '[' )
            {
            // InternalMGLang.g:6435:1: ( '[' )
            // InternalMGLang.g:6436:2: '['
            {
             before(grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6445:1: rule__ListAdHoc__Group__1 : rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 ;
    public final void rule__ListAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6449:1: ( rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 )
            // InternalMGLang.g:6450:2: rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__ListAdHoc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6457:1: rule__ListAdHoc__Group__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) ;
    public final void rule__ListAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6461:1: ( ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) )
            // InternalMGLang.g:6462:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            {
            // InternalMGLang.g:6462:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            // InternalMGLang.g:6463:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            {
             before(grammarAccess.getListAdHocAccess().getElementsAssignment_1()); 
            // InternalMGLang.g:6464:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            // InternalMGLang.g:6464:3: rule__ListAdHoc__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListAdHocAccess().getElementsAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6472:1: rule__ListAdHoc__Group__2 : rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 ;
    public final void rule__ListAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6476:1: ( rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 )
            // InternalMGLang.g:6477:2: rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__ListAdHoc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6484:1: rule__ListAdHoc__Group__2__Impl : ( ( rule__ListAdHoc__Group_2__0 )* ) ;
    public final void rule__ListAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6488:1: ( ( ( rule__ListAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:6489:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:6489:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            // InternalMGLang.g:6490:2: ( rule__ListAdHoc__Group_2__0 )*
            {
             before(grammarAccess.getListAdHocAccess().getGroup_2()); 
            // InternalMGLang.g:6491:2: ( rule__ListAdHoc__Group_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==45) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMGLang.g:6491:3: rule__ListAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ListAdHoc__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getListAdHocAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMGLang.g:6499:1: rule__ListAdHoc__Group__3 : rule__ListAdHoc__Group__3__Impl ;
    public final void rule__ListAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6503:1: ( rule__ListAdHoc__Group__3__Impl )
            // InternalMGLang.g:6504:2: rule__ListAdHoc__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6510:1: rule__ListAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__ListAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6514:1: ( ( ']' ) )
            // InternalMGLang.g:6515:1: ( ']' )
            {
            // InternalMGLang.g:6515:1: ( ']' )
            // InternalMGLang.g:6516:2: ']'
            {
             before(grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:6526:1: rule__ListAdHoc__Group_2__0 : rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 ;
    public final void rule__ListAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6530:1: ( rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 )
            // InternalMGLang.g:6531:2: rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__ListAdHoc__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6538:1: rule__ListAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6542:1: ( ( ',' ) )
            // InternalMGLang.g:6543:1: ( ',' )
            {
            // InternalMGLang.g:6543:1: ( ',' )
            // InternalMGLang.g:6544:2: ','
            {
             before(grammarAccess.getListAdHocAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getListAdHocAccess().getCommaKeyword_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6553:1: rule__ListAdHoc__Group_2__1 : rule__ListAdHoc__Group_2__1__Impl ;
    public final void rule__ListAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6557:1: ( rule__ListAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:6558:2: rule__ListAdHoc__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6564:1: rule__ListAdHoc__Group_2__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) ;
    public final void rule__ListAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6568:1: ( ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) )
            // InternalMGLang.g:6569:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            {
            // InternalMGLang.g:6569:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            // InternalMGLang.g:6570:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getListAdHocAccess().getElementsAssignment_2_1()); 
            // InternalMGLang.g:6571:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            // InternalMGLang.g:6571:3: rule__ListAdHoc__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListAdHoc__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListAdHocAccess().getElementsAssignment_2_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6580:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6584:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalMGLang.g:6585:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Map__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6592:1: rule__Map__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6596:1: ( ( 'Map' ) )
            // InternalMGLang.g:6597:1: ( 'Map' )
            {
            // InternalMGLang.g:6597:1: ( 'Map' )
            // InternalMGLang.g:6598:2: 'Map'
            {
             before(grammarAccess.getMapAccess().getMapKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getMapKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6607:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6611:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // InternalMGLang.g:6612:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Map__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6619:1: rule__Map__Group__1__Impl : ( ( rule__Map__NameAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6623:1: ( ( ( rule__Map__NameAssignment_1 ) ) )
            // InternalMGLang.g:6624:1: ( ( rule__Map__NameAssignment_1 ) )
            {
            // InternalMGLang.g:6624:1: ( ( rule__Map__NameAssignment_1 ) )
            // InternalMGLang.g:6625:2: ( rule__Map__NameAssignment_1 )
            {
             before(grammarAccess.getMapAccess().getNameAssignment_1()); 
            // InternalMGLang.g:6626:2: ( rule__Map__NameAssignment_1 )
            // InternalMGLang.g:6626:3: rule__Map__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Map__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6634:1: rule__Map__Group__2 : rule__Map__Group__2__Impl ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6638:1: ( rule__Map__Group__2__Impl )
            // InternalMGLang.g:6639:2: rule__Map__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6645:1: rule__Map__Group__2__Impl : ( ( rule__Map__Group_2__0 )? ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6649:1: ( ( ( rule__Map__Group_2__0 )? ) )
            // InternalMGLang.g:6650:1: ( ( rule__Map__Group_2__0 )? )
            {
            // InternalMGLang.g:6650:1: ( ( rule__Map__Group_2__0 )? )
            // InternalMGLang.g:6651:2: ( rule__Map__Group_2__0 )?
            {
             before(grammarAccess.getMapAccess().getGroup_2()); 
            // InternalMGLang.g:6652:2: ( rule__Map__Group_2__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ASSIGNMENT_OP) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMGLang.g:6652:3: rule__Map__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Map__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMapAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMGLang.g:6661:1: rule__Map__Group_2__0 : rule__Map__Group_2__0__Impl rule__Map__Group_2__1 ;
    public final void rule__Map__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6665:1: ( rule__Map__Group_2__0__Impl rule__Map__Group_2__1 )
            // InternalMGLang.g:6666:2: rule__Map__Group_2__0__Impl rule__Map__Group_2__1
            {
            pushFollow(FOLLOW_46);
            rule__Map__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6673:1: rule__Map__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Map__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6677:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:6678:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:6678:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:6679:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getMapAccess().getASSIGNMENT_OPTerminalRuleCall_2_0()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getASSIGNMENT_OPTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6688:1: rule__Map__Group_2__1 : rule__Map__Group_2__1__Impl ;
    public final void rule__Map__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6692:1: ( rule__Map__Group_2__1__Impl )
            // InternalMGLang.g:6693:2: rule__Map__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6699:1: rule__Map__Group_2__1__Impl : ( ( rule__Map__CreatedByAssignment_2_1 ) ) ;
    public final void rule__Map__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6703:1: ( ( ( rule__Map__CreatedByAssignment_2_1 ) ) )
            // InternalMGLang.g:6704:1: ( ( rule__Map__CreatedByAssignment_2_1 ) )
            {
            // InternalMGLang.g:6704:1: ( ( rule__Map__CreatedByAssignment_2_1 ) )
            // InternalMGLang.g:6705:2: ( rule__Map__CreatedByAssignment_2_1 )
            {
             before(grammarAccess.getMapAccess().getCreatedByAssignment_2_1()); 
            // InternalMGLang.g:6706:2: ( rule__Map__CreatedByAssignment_2_1 )
            // InternalMGLang.g:6706:3: rule__Map__CreatedByAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Map__CreatedByAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getCreatedByAssignment_2_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6715:1: rule__MapAdHoc__Group__0 : rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 ;
    public final void rule__MapAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6719:1: ( rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 )
            // InternalMGLang.g:6720:2: rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MapAdHoc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6727:1: rule__MapAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__MapAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6731:1: ( ( '[' ) )
            // InternalMGLang.g:6732:1: ( '[' )
            {
            // InternalMGLang.g:6732:1: ( '[' )
            // InternalMGLang.g:6733:2: '['
            {
             before(grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6742:1: rule__MapAdHoc__Group__1 : rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 ;
    public final void rule__MapAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6746:1: ( rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 )
            // InternalMGLang.g:6747:2: rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__MapAdHoc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6754:1: rule__MapAdHoc__Group__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) ;
    public final void rule__MapAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6758:1: ( ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) )
            // InternalMGLang.g:6759:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            {
            // InternalMGLang.g:6759:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            // InternalMGLang.g:6760:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            {
             before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_1()); 
            // InternalMGLang.g:6761:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            // InternalMGLang.g:6761:3: rule__MapAdHoc__EntriesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__EntriesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAdHocAccess().getEntriesAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6769:1: rule__MapAdHoc__Group__2 : rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 ;
    public final void rule__MapAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6773:1: ( rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 )
            // InternalMGLang.g:6774:2: rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__MapAdHoc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6781:1: rule__MapAdHoc__Group__2__Impl : ( ( rule__MapAdHoc__Group_2__0 )* ) ;
    public final void rule__MapAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6785:1: ( ( ( rule__MapAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:6786:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:6786:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            // InternalMGLang.g:6787:2: ( rule__MapAdHoc__Group_2__0 )*
            {
             before(grammarAccess.getMapAdHocAccess().getGroup_2()); 
            // InternalMGLang.g:6788:2: ( rule__MapAdHoc__Group_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==45) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMGLang.g:6788:3: rule__MapAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MapAdHoc__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getMapAdHocAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMGLang.g:6796:1: rule__MapAdHoc__Group__3 : rule__MapAdHoc__Group__3__Impl ;
    public final void rule__MapAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6800:1: ( rule__MapAdHoc__Group__3__Impl )
            // InternalMGLang.g:6801:2: rule__MapAdHoc__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6807:1: rule__MapAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__MapAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6811:1: ( ( ']' ) )
            // InternalMGLang.g:6812:1: ( ']' )
            {
            // InternalMGLang.g:6812:1: ( ']' )
            // InternalMGLang.g:6813:2: ']'
            {
             before(grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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
    // InternalMGLang.g:6823:1: rule__MapAdHoc__Group_2__0 : rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 ;
    public final void rule__MapAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6827:1: ( rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 )
            // InternalMGLang.g:6828:2: rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__MapAdHoc__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6835:1: rule__MapAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MapAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6839:1: ( ( ',' ) )
            // InternalMGLang.g:6840:1: ( ',' )
            {
            // InternalMGLang.g:6840:1: ( ',' )
            // InternalMGLang.g:6841:2: ','
            {
             before(grammarAccess.getMapAdHocAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMapAdHocAccess().getCommaKeyword_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6850:1: rule__MapAdHoc__Group_2__1 : rule__MapAdHoc__Group_2__1__Impl ;
    public final void rule__MapAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6854:1: ( rule__MapAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:6855:2: rule__MapAdHoc__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6861:1: rule__MapAdHoc__Group_2__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) ;
    public final void rule__MapAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6865:1: ( ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) )
            // InternalMGLang.g:6866:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            {
            // InternalMGLang.g:6866:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            // InternalMGLang.g:6867:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            {
             before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_2_1()); 
            // InternalMGLang.g:6868:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            // InternalMGLang.g:6868:3: rule__MapAdHoc__EntriesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MapAdHoc__EntriesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAdHocAccess().getEntriesAssignment_2_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6877:1: rule__MapTupel__Group__0 : rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 ;
    public final void rule__MapTupel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6881:1: ( rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 )
            // InternalMGLang.g:6882:2: rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__MapTupel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6889:1: rule__MapTupel__Group__0__Impl : ( '(' ) ;
    public final void rule__MapTupel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6893:1: ( ( '(' ) )
            // InternalMGLang.g:6894:1: ( '(' )
            {
            // InternalMGLang.g:6894:1: ( '(' )
            // InternalMGLang.g:6895:2: '('
            {
             before(grammarAccess.getMapTupelAccess().getLeftParenthesisKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMapTupelAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // InternalMGLang.g:6904:1: rule__MapTupel__Group__1 : rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 ;
    public final void rule__MapTupel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6908:1: ( rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 )
            // InternalMGLang.g:6909:2: rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__MapTupel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6916:1: rule__MapTupel__Group__1__Impl : ( ( rule__MapTupel__KeyAssignment_1 ) ) ;
    public final void rule__MapTupel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6920:1: ( ( ( rule__MapTupel__KeyAssignment_1 ) ) )
            // InternalMGLang.g:6921:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            {
            // InternalMGLang.g:6921:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            // InternalMGLang.g:6922:2: ( rule__MapTupel__KeyAssignment_1 )
            {
             before(grammarAccess.getMapTupelAccess().getKeyAssignment_1()); 
            // InternalMGLang.g:6923:2: ( rule__MapTupel__KeyAssignment_1 )
            // InternalMGLang.g:6923:3: rule__MapTupel__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MapTupel__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapTupelAccess().getKeyAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:6931:1: rule__MapTupel__Group__2 : rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 ;
    public final void rule__MapTupel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6935:1: ( rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 )
            // InternalMGLang.g:6936:2: rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__MapTupel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6943:1: rule__MapTupel__Group__2__Impl : ( ',' ) ;
    public final void rule__MapTupel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6947:1: ( ( ',' ) )
            // InternalMGLang.g:6948:1: ( ',' )
            {
            // InternalMGLang.g:6948:1: ( ',' )
            // InternalMGLang.g:6949:2: ','
            {
             before(grammarAccess.getMapTupelAccess().getCommaKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMapTupelAccess().getCommaKeyword_2()); 

            }


            }

        }
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
    // InternalMGLang.g:6958:1: rule__MapTupel__Group__3 : rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 ;
    public final void rule__MapTupel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6962:1: ( rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 )
            // InternalMGLang.g:6963:2: rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__MapTupel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6970:1: rule__MapTupel__Group__3__Impl : ( ( rule__MapTupel__ValueAssignment_3 ) ) ;
    public final void rule__MapTupel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6974:1: ( ( ( rule__MapTupel__ValueAssignment_3 ) ) )
            // InternalMGLang.g:6975:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            {
            // InternalMGLang.g:6975:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            // InternalMGLang.g:6976:2: ( rule__MapTupel__ValueAssignment_3 )
            {
             before(grammarAccess.getMapTupelAccess().getValueAssignment_3()); 
            // InternalMGLang.g:6977:2: ( rule__MapTupel__ValueAssignment_3 )
            // InternalMGLang.g:6977:3: rule__MapTupel__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MapTupel__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMapTupelAccess().getValueAssignment_3()); 

            }


            }

        }
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
    // InternalMGLang.g:6985:1: rule__MapTupel__Group__4 : rule__MapTupel__Group__4__Impl ;
    public final void rule__MapTupel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6989:1: ( rule__MapTupel__Group__4__Impl )
            // InternalMGLang.g:6990:2: rule__MapTupel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapTupel__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:6996:1: rule__MapTupel__Group__4__Impl : ( ')' ) ;
    public final void rule__MapTupel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7000:1: ( ( ')' ) )
            // InternalMGLang.g:7001:1: ( ')' )
            {
            // InternalMGLang.g:7001:1: ( ')' )
            // InternalMGLang.g:7002:2: ')'
            {
             before(grammarAccess.getMapTupelAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMapTupelAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalMGLang.g:7012:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7016:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:7017:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ForRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForRange__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7024:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7028:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:7029:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:7029:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:7030:2: ( rule__ForRange__StartAssignment_0 )
            {
             before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            // InternalMGLang.g:7031:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:7031:3: rule__ForRange__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getForRangeAccess().getStartAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7039:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7043:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:7044:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ForRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForRange__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7051:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7055:1: ( ( ':' ) )
            // InternalMGLang.g:7056:1: ( ':' )
            {
            // InternalMGLang.g:7056:1: ( ':' )
            // InternalMGLang.g:7057:2: ':'
            {
             before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getForRangeAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7066:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7070:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:7071:2: rule__ForRange__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7077:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7081:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:7082:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:7082:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:7083:2: ( rule__ForRange__EndAssignment_2 )
            {
             before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            // InternalMGLang.g:7084:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:7084:3: rule__ForRange__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForRange__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForRangeAccess().getEndAssignment_2()); 

            }


            }

        }
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
    // InternalMGLang.g:7093:1: rule__TertiaryExpression__Group__0 : rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 ;
    public final void rule__TertiaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7097:1: ( rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 )
            // InternalMGLang.g:7098:2: rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__TertiaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7105:1: rule__TertiaryExpression__Group__0__Impl : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7109:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:7110:1: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:7110:1: ( ruleSecondaryExpression )
            // InternalMGLang.g:7111:2: ruleSecondaryExpression
            {
             before(grammarAccess.getTertiaryExpressionAccess().getSecondaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSecondaryExpression();

            state._fsp--;

             after(grammarAccess.getTertiaryExpressionAccess().getSecondaryExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7120:1: rule__TertiaryExpression__Group__1 : rule__TertiaryExpression__Group__1__Impl ;
    public final void rule__TertiaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7124:1: ( rule__TertiaryExpression__Group__1__Impl )
            // InternalMGLang.g:7125:2: rule__TertiaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7131:1: rule__TertiaryExpression__Group__1__Impl : ( ( rule__TertiaryExpression__Group_1__0 )* ) ;
    public final void rule__TertiaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7135:1: ( ( ( rule__TertiaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:7136:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:7136:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            // InternalMGLang.g:7137:2: ( rule__TertiaryExpression__Group_1__0 )*
            {
             before(grammarAccess.getTertiaryExpressionAccess().getGroup_1()); 
            // InternalMGLang.g:7138:2: ( rule__TertiaryExpression__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=29 && LA55_0<=31)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMGLang.g:7138:3: rule__TertiaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__TertiaryExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getTertiaryExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7147:1: rule__TertiaryExpression__Group_1__0 : rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 ;
    public final void rule__TertiaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7151:1: ( rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 )
            // InternalMGLang.g:7152:2: rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__TertiaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7159:1: rule__TertiaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TertiaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7163:1: ( ( () ) )
            // InternalMGLang.g:7164:1: ( () )
            {
            // InternalMGLang.g:7164:1: ( () )
            // InternalMGLang.g:7165:2: ()
            {
             before(grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0()); 
            // InternalMGLang.g:7166:2: ()
            // InternalMGLang.g:7166:3: 
            {
            }

             after(grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0()); 

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
    // InternalMGLang.g:7174:1: rule__TertiaryExpression__Group_1__1 : rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 ;
    public final void rule__TertiaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7178:1: ( rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 )
            // InternalMGLang.g:7179:2: rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__TertiaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7186:1: rule__TertiaryExpression__Group_1__1__Impl : ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__TertiaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7190:1: ( ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:7191:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:7191:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:7192:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getTertiaryExpressionAccess().getOpAssignment_1_1()); 
            // InternalMGLang.g:7193:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:7193:3: rule__TertiaryExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTertiaryExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7201:1: rule__TertiaryExpression__Group_1__2 : rule__TertiaryExpression__Group_1__2__Impl ;
    public final void rule__TertiaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7205:1: ( rule__TertiaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:7206:2: rule__TertiaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7212:1: rule__TertiaryExpression__Group_1__2__Impl : ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__TertiaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7216:1: ( ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7217:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7217:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:7218:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getTertiaryExpressionAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:7219:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:7219:3: rule__TertiaryExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TertiaryExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTertiaryExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
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
    // InternalMGLang.g:7228:1: rule__SecondaryExpression__Group__0 : rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 ;
    public final void rule__SecondaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7232:1: ( rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 )
            // InternalMGLang.g:7233:2: rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__SecondaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7240:1: rule__SecondaryExpression__Group__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7244:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:7245:1: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:7245:1: ( rulePrimaryExpr )
            // InternalMGLang.g:7246:2: rulePrimaryExpr
            {
             before(grammarAccess.getSecondaryExpressionAccess().getPrimaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;

             after(grammarAccess.getSecondaryExpressionAccess().getPrimaryExprParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7255:1: rule__SecondaryExpression__Group__1 : rule__SecondaryExpression__Group__1__Impl ;
    public final void rule__SecondaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7259:1: ( rule__SecondaryExpression__Group__1__Impl )
            // InternalMGLang.g:7260:2: rule__SecondaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7266:1: rule__SecondaryExpression__Group__1__Impl : ( ( rule__SecondaryExpression__Group_1__0 )* ) ;
    public final void rule__SecondaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7270:1: ( ( ( rule__SecondaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:7271:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:7271:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            // InternalMGLang.g:7272:2: ( rule__SecondaryExpression__Group_1__0 )*
            {
             before(grammarAccess.getSecondaryExpressionAccess().getGroup_1()); 
            // InternalMGLang.g:7273:2: ( rule__SecondaryExpression__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=32 && LA56_0<=33)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMGLang.g:7273:3: rule__SecondaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__SecondaryExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getSecondaryExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7282:1: rule__SecondaryExpression__Group_1__0 : rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 ;
    public final void rule__SecondaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7286:1: ( rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 )
            // InternalMGLang.g:7287:2: rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__SecondaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7294:1: rule__SecondaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SecondaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7298:1: ( ( () ) )
            // InternalMGLang.g:7299:1: ( () )
            {
            // InternalMGLang.g:7299:1: ( () )
            // InternalMGLang.g:7300:2: ()
            {
             before(grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0()); 
            // InternalMGLang.g:7301:2: ()
            // InternalMGLang.g:7301:3: 
            {
            }

             after(grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0()); 

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
    // InternalMGLang.g:7309:1: rule__SecondaryExpression__Group_1__1 : rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 ;
    public final void rule__SecondaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7313:1: ( rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 )
            // InternalMGLang.g:7314:2: rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__SecondaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7321:1: rule__SecondaryExpression__Group_1__1__Impl : ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__SecondaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7325:1: ( ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:7326:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:7326:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:7327:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getSecondaryExpressionAccess().getOpAssignment_1_1()); 
            // InternalMGLang.g:7328:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:7328:3: rule__SecondaryExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7336:1: rule__SecondaryExpression__Group_1__2 : rule__SecondaryExpression__Group_1__2__Impl ;
    public final void rule__SecondaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7340:1: ( rule__SecondaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:7341:2: rule__SecondaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7347:1: rule__SecondaryExpression__Group_1__2__Impl : ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SecondaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7351:1: ( ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7352:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7352:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:7353:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getSecondaryExpressionAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:7354:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:7354:3: rule__SecondaryExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
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
    // InternalMGLang.g:7363:1: rule__PrimaryExpr__Group__0 : rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 ;
    public final void rule__PrimaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7367:1: ( rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 )
            // InternalMGLang.g:7368:2: rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__PrimaryExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7375:1: rule__PrimaryExpr__Group__0__Impl : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7379:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:7380:1: ( ruleRelationExpression )
            {
            // InternalMGLang.g:7380:1: ( ruleRelationExpression )
            // InternalMGLang.g:7381:2: ruleRelationExpression
            {
             before(grammarAccess.getPrimaryExprAccess().getRelationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExprAccess().getRelationExpressionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7390:1: rule__PrimaryExpr__Group__1 : rule__PrimaryExpr__Group__1__Impl ;
    public final void rule__PrimaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7394:1: ( rule__PrimaryExpr__Group__1__Impl )
            // InternalMGLang.g:7395:2: rule__PrimaryExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7401:1: rule__PrimaryExpr__Group__1__Impl : ( ( rule__PrimaryExpr__Group_1__0 )* ) ;
    public final void rule__PrimaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7405:1: ( ( ( rule__PrimaryExpr__Group_1__0 )* ) )
            // InternalMGLang.g:7406:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            {
            // InternalMGLang.g:7406:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            // InternalMGLang.g:7407:2: ( rule__PrimaryExpr__Group_1__0 )*
            {
             before(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
            // InternalMGLang.g:7408:2: ( rule__PrimaryExpr__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=34 && LA57_0<=36)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMGLang.g:7408:3: rule__PrimaryExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__PrimaryExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getPrimaryExprAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7417:1: rule__PrimaryExpr__Group_1__0 : rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 ;
    public final void rule__PrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7421:1: ( rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 )
            // InternalMGLang.g:7422:2: rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_52);
            rule__PrimaryExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7429:1: rule__PrimaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7433:1: ( ( () ) )
            // InternalMGLang.g:7434:1: ( () )
            {
            // InternalMGLang.g:7434:1: ( () )
            // InternalMGLang.g:7435:2: ()
            {
             before(grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0()); 
            // InternalMGLang.g:7436:2: ()
            // InternalMGLang.g:7436:3: 
            {
            }

             after(grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0()); 

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
    // InternalMGLang.g:7444:1: rule__PrimaryExpr__Group_1__1 : rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 ;
    public final void rule__PrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7448:1: ( rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 )
            // InternalMGLang.g:7449:2: rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__PrimaryExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7456:1: rule__PrimaryExpr__Group_1__1__Impl : ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7460:1: ( ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:7461:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:7461:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            // InternalMGLang.g:7462:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExprAccess().getOpAssignment_1_1()); 
            // InternalMGLang.g:7463:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            // InternalMGLang.g:7463:3: rule__PrimaryExpr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExprAccess().getOpAssignment_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7471:1: rule__PrimaryExpr__Group_1__2 : rule__PrimaryExpr__Group_1__2__Impl ;
    public final void rule__PrimaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7475:1: ( rule__PrimaryExpr__Group_1__2__Impl )
            // InternalMGLang.g:7476:2: rule__PrimaryExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7482:1: rule__PrimaryExpr__Group_1__2__Impl : ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7486:1: ( ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7487:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7487:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            // InternalMGLang.g:7488:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExprAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:7489:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            // InternalMGLang.g:7489:3: rule__PrimaryExpr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExprAccess().getRightAssignment_1_2()); 

            }


            }

        }
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
    // InternalMGLang.g:7498:1: rule__RelationExpression__Group__0 : rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 ;
    public final void rule__RelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7502:1: ( rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 )
            // InternalMGLang.g:7503:2: rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__RelationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7510:1: rule__RelationExpression__Group__0__Impl : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7514:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:7515:1: ( ruleBaseExpr )
            {
            // InternalMGLang.g:7515:1: ( ruleBaseExpr )
            // InternalMGLang.g:7516:2: ruleBaseExpr
            {
             before(grammarAccess.getRelationExpressionAccess().getBaseExprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseExpr();

            state._fsp--;

             after(grammarAccess.getRelationExpressionAccess().getBaseExprParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7525:1: rule__RelationExpression__Group__1 : rule__RelationExpression__Group__1__Impl ;
    public final void rule__RelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7529:1: ( rule__RelationExpression__Group__1__Impl )
            // InternalMGLang.g:7530:2: rule__RelationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7536:1: rule__RelationExpression__Group__1__Impl : ( ( rule__RelationExpression__Group_1__0 )* ) ;
    public final void rule__RelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7540:1: ( ( ( rule__RelationExpression__Group_1__0 )* ) )
            // InternalMGLang.g:7541:1: ( ( rule__RelationExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:7541:1: ( ( rule__RelationExpression__Group_1__0 )* )
            // InternalMGLang.g:7542:2: ( rule__RelationExpression__Group_1__0 )*
            {
             before(grammarAccess.getRelationExpressionAccess().getGroup_1()); 
            // InternalMGLang.g:7543:2: ( rule__RelationExpression__Group_1__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=23 && LA58_0<=28)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMGLang.g:7543:3: rule__RelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__RelationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getRelationExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7552:1: rule__RelationExpression__Group_1__0 : rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 ;
    public final void rule__RelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7556:1: ( rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 )
            // InternalMGLang.g:7557:2: rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_54);
            rule__RelationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7564:1: rule__RelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7568:1: ( ( () ) )
            // InternalMGLang.g:7569:1: ( () )
            {
            // InternalMGLang.g:7569:1: ( () )
            // InternalMGLang.g:7570:2: ()
            {
             before(grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0()); 
            // InternalMGLang.g:7571:2: ()
            // InternalMGLang.g:7571:3: 
            {
            }

             after(grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0()); 

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
    // InternalMGLang.g:7579:1: rule__RelationExpression__Group_1__1 : rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 ;
    public final void rule__RelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7583:1: ( rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 )
            // InternalMGLang.g:7584:2: rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__RelationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7591:1: rule__RelationExpression__Group_1__1__Impl : ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) ;
    public final void rule__RelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7595:1: ( ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) )
            // InternalMGLang.g:7596:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            {
            // InternalMGLang.g:7596:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            // InternalMGLang.g:7597:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            {
             before(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1_1()); 
            // InternalMGLang.g:7598:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            // InternalMGLang.g:7598:3: rule__RelationExpression__RelationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__RelationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7606:1: rule__RelationExpression__Group_1__2 : rule__RelationExpression__Group_1__2__Impl ;
    public final void rule__RelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7610:1: ( rule__RelationExpression__Group_1__2__Impl )
            // InternalMGLang.g:7611:2: rule__RelationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7617:1: rule__RelationExpression__Group_1__2__Impl : ( ( rule__RelationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__RelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7621:1: ( ( ( rule__RelationExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7622:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7622:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:7623:2: ( rule__RelationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getRelationExpressionAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:7624:2: ( rule__RelationExpression__RightAssignment_1_2 )
            // InternalMGLang.g:7624:3: rule__RelationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
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
    // InternalMGLang.g:7633:1: rule__BaseExpr__Group_0__0 : rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 ;
    public final void rule__BaseExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7637:1: ( rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 )
            // InternalMGLang.g:7638:2: rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__BaseExpr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7645:1: rule__BaseExpr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7649:1: ( ( '(' ) )
            // InternalMGLang.g:7650:1: ( '(' )
            {
            // InternalMGLang.g:7650:1: ( '(' )
            // InternalMGLang.g:7651:2: '('
            {
             before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7660:1: rule__BaseExpr__Group_0__1 : rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 ;
    public final void rule__BaseExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7664:1: ( rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 )
            // InternalMGLang.g:7665:2: rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__BaseExpr__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7672:1: rule__BaseExpr__Group_0__1__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7676:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7677:1: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7677:1: ( ruleArithmeticExpression )
            // InternalMGLang.g:7678:2: ruleArithmeticExpression
            {
             before(grammarAccess.getBaseExprAccess().getArithmeticExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getBaseExprAccess().getArithmeticExpressionParserRuleCall_0_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7687:1: rule__BaseExpr__Group_0__2 : rule__BaseExpr__Group_0__2__Impl ;
    public final void rule__BaseExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7691:1: ( rule__BaseExpr__Group_0__2__Impl )
            // InternalMGLang.g:7692:2: rule__BaseExpr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7698:1: rule__BaseExpr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7702:1: ( ( ')' ) )
            // InternalMGLang.g:7703:1: ( ')' )
            {
            // InternalMGLang.g:7703:1: ( ')' )
            // InternalMGLang.g:7704:2: ')'
            {
             before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_0_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
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
    // InternalMGLang.g:7714:1: rule__BaseExpr__Group_1__0 : rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 ;
    public final void rule__BaseExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7718:1: ( rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 )
            // InternalMGLang.g:7719:2: rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1
            {
            pushFollow(FOLLOW_56);
            rule__BaseExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7726:1: rule__BaseExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7730:1: ( ( () ) )
            // InternalMGLang.g:7731:1: ( () )
            {
            // InternalMGLang.g:7731:1: ( () )
            // InternalMGLang.g:7732:2: ()
            {
             before(grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0()); 
            // InternalMGLang.g:7733:2: ()
            // InternalMGLang.g:7733:3: 
            {
            }

             after(grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0()); 

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
    // InternalMGLang.g:7741:1: rule__BaseExpr__Group_1__1 : rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 ;
    public final void rule__BaseExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7745:1: ( rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 )
            // InternalMGLang.g:7746:2: rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__BaseExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7753:1: rule__BaseExpr__Group_1__1__Impl : ( '!' ) ;
    public final void rule__BaseExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7757:1: ( ( '!' ) )
            // InternalMGLang.g:7758:1: ( '!' )
            {
            // InternalMGLang.g:7758:1: ( '!' )
            // InternalMGLang.g:7759:2: '!'
            {
             before(grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7768:1: rule__BaseExpr__Group_1__2 : rule__BaseExpr__Group_1__2__Impl ;
    public final void rule__BaseExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7772:1: ( rule__BaseExpr__Group_1__2__Impl )
            // InternalMGLang.g:7773:2: rule__BaseExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7779:1: rule__BaseExpr__Group_1__2__Impl : ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__BaseExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7783:1: ( ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) )
            // InternalMGLang.g:7784:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            {
            // InternalMGLang.g:7784:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            // InternalMGLang.g:7785:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            {
             before(grammarAccess.getBaseExprAccess().getExprAssignment_1_2()); 
            // InternalMGLang.g:7786:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            // InternalMGLang.g:7786:3: rule__BaseExpr__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__ExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseExprAccess().getExprAssignment_1_2()); 

            }


            }

        }
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
    // InternalMGLang.g:7795:1: rule__BaseExpr__Group_2__0 : rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 ;
    public final void rule__BaseExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7799:1: ( rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 )
            // InternalMGLang.g:7800:2: rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1
            {
            pushFollow(FOLLOW_57);
            rule__BaseExpr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7807:1: rule__BaseExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7811:1: ( ( () ) )
            // InternalMGLang.g:7812:1: ( () )
            {
            // InternalMGLang.g:7812:1: ( () )
            // InternalMGLang.g:7813:2: ()
            {
             before(grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0()); 
            // InternalMGLang.g:7814:2: ()
            // InternalMGLang.g:7814:3: 
            {
            }

             after(grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0()); 

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
    // InternalMGLang.g:7822:1: rule__BaseExpr__Group_2__1 : rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 ;
    public final void rule__BaseExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7826:1: ( rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 )
            // InternalMGLang.g:7827:2: rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__BaseExpr__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__2();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7834:1: rule__BaseExpr__Group_2__1__Impl : ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) ;
    public final void rule__BaseExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7838:1: ( ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) )
            // InternalMGLang.g:7839:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            {
            // InternalMGLang.g:7839:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            // InternalMGLang.g:7840:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            {
             before(grammarAccess.getBaseExprAccess().getFuncAssignment_2_1()); 
            // InternalMGLang.g:7841:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            // InternalMGLang.g:7841:3: rule__BaseExpr__FuncAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__FuncAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseExprAccess().getFuncAssignment_2_1()); 

            }


            }

        }
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
    // InternalMGLang.g:7849:1: rule__BaseExpr__Group_2__2 : rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 ;
    public final void rule__BaseExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7853:1: ( rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 )
            // InternalMGLang.g:7854:2: rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3
            {
            pushFollow(FOLLOW_26);
            rule__BaseExpr__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__3();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7861:1: rule__BaseExpr__Group_2__2__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7865:1: ( ( '(' ) )
            // InternalMGLang.g:7866:1: ( '(' )
            {
            // InternalMGLang.g:7866:1: ( '(' )
            // InternalMGLang.g:7867:2: '('
            {
             before(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBaseExprAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
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
    // InternalMGLang.g:7876:1: rule__BaseExpr__Group_2__3 : rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 ;
    public final void rule__BaseExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7880:1: ( rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 )
            // InternalMGLang.g:7881:2: rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4
            {
            pushFollow(FOLLOW_11);
            rule__BaseExpr__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__4();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7888:1: rule__BaseExpr__Group_2__3__Impl : ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) ;
    public final void rule__BaseExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7892:1: ( ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) )
            // InternalMGLang.g:7893:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            {
            // InternalMGLang.g:7893:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            // InternalMGLang.g:7894:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            {
             before(grammarAccess.getBaseExprAccess().getExprAssignment_2_3()); 
            // InternalMGLang.g:7895:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            // InternalMGLang.g:7895:3: rule__BaseExpr__ExprAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__ExprAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getBaseExprAccess().getExprAssignment_2_3()); 

            }


            }

        }
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
    // InternalMGLang.g:7903:1: rule__BaseExpr__Group_2__4 : rule__BaseExpr__Group_2__4__Impl ;
    public final void rule__BaseExpr__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7907:1: ( rule__BaseExpr__Group_2__4__Impl )
            // InternalMGLang.g:7908:2: rule__BaseExpr__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseExpr__Group_2__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMGLang.g:7914:1: rule__BaseExpr__Group_2__4__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7918:1: ( ( ')' ) )
            // InternalMGLang.g:7919:1: ( ')' )
            {
            // InternalMGLang.g:7919:1: ( ')' )
            // InternalMGLang.g:7920:2: ')'
            {
             before(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBaseExprAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__MofgenFile__ImportsAssignment_0"
    // InternalMGLang.g:7930:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7934:1: ( ( ruleImport ) )
            // InternalMGLang.g:7935:2: ( ruleImport )
            {
            // InternalMGLang.g:7935:2: ( ruleImport )
            // InternalMGLang.g:7936:3: ruleImport
            {
             before(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getMofgenFileAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7945:1: rule__MofgenFile__ConfigAssignment_1 : ( ruleConfig ) ;
    public final void rule__MofgenFile__ConfigAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7949:1: ( ( ruleConfig ) )
            // InternalMGLang.g:7950:2: ( ruleConfig )
            {
            // InternalMGLang.g:7950:2: ( ruleConfig )
            // InternalMGLang.g:7951:3: ruleConfig
            {
             before(grammarAccess.getMofgenFileAccess().getConfigConfigParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getMofgenFileAccess().getConfigConfigParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__MofgenFile__CommandsAssignment_2"
    // InternalMGLang.g:7960:1: rule__MofgenFile__CommandsAssignment_2 : ( ruleFileCommand ) ;
    public final void rule__MofgenFile__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7964:1: ( ( ruleFileCommand ) )
            // InternalMGLang.g:7965:2: ( ruleFileCommand )
            {
            // InternalMGLang.g:7965:2: ( ruleFileCommand )
            // InternalMGLang.g:7966:3: ruleFileCommand
            {
             before(grammarAccess.getMofgenFileAccess().getCommandsFileCommandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFileCommand();

            state._fsp--;

             after(grammarAccess.getMofgenFileAccess().getCommandsFileCommandParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MofgenFile__CommandsAssignment_2"


    // $ANTLR start "rule__Import__UriAssignment_1"
    // InternalMGLang.g:7975:1: rule__Import__UriAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__UriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7979:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:7980:2: ( RULE_STRING )
            {
            // InternalMGLang.g:7980:2: ( RULE_STRING )
            // InternalMGLang.g:7981:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getUriSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getUriSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7990:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7994:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7995:2: ( RULE_ID )
            {
            // InternalMGLang.g:7995:2: ( RULE_ID )
            // InternalMGLang.g:7996:3: RULE_ID
            {
             before(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8005:1: rule__Config__ExpressionsAssignment_5 : ( ruleConfigExpression ) ;
    public final void rule__Config__ExpressionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8009:1: ( ( ruleConfigExpression ) )
            // InternalMGLang.g:8010:2: ( ruleConfigExpression )
            {
            // InternalMGLang.g:8010:2: ( ruleConfigExpression )
            // InternalMGLang.g:8011:3: ruleConfigExpression
            {
             before(grammarAccess.getConfigAccess().getExpressionsConfigExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigExpression();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getExpressionsConfigExpressionParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8020:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8024:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8025:2: ( RULE_ID )
            {
            // InternalMGLang.g:8025:2: ( RULE_ID )
            // InternalMGLang.g:8026:3: RULE_ID
            {
             before(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8035:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8039:1: ( ( ruleParameter ) )
            // InternalMGLang.g:8040:2: ( ruleParameter )
            {
            // InternalMGLang.g:8040:2: ( ruleParameter )
            // InternalMGLang.g:8041:3: ruleParameter
            {
             before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8050:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8054:1: ( ( ruleParameter ) )
            // InternalMGLang.g:8055:2: ( ruleParameter )
            {
            // InternalMGLang.g:8055:2: ( ruleParameter )
            // InternalMGLang.g:8056:3: ruleParameter
            {
             before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pattern__CommandsAssignment_4"
    // InternalMGLang.g:8065:1: rule__Pattern__CommandsAssignment_4 : ( rulePatternCommand ) ;
    public final void rule__Pattern__CommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8069:1: ( ( rulePatternCommand ) )
            // InternalMGLang.g:8070:2: ( rulePatternCommand )
            {
            // InternalMGLang.g:8070:2: ( rulePatternCommand )
            // InternalMGLang.g:8071:3: rulePatternCommand
            {
             before(grammarAccess.getPatternAccess().getCommandsPatternCommandParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePatternCommand();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getCommandsPatternCommandParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__CommandsAssignment_4"


    // $ANTLR start "rule__Pattern__ReturnAssignment_6"
    // InternalMGLang.g:8080:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8084:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:8085:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:8085:2: ( rulePatternReturn )
            // InternalMGLang.g:8086:3: rulePatternReturn
            {
             before(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePatternReturn();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getReturnPatternReturnParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8095:1: rule__PatternReturn__ReturnValueAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PatternReturn__ReturnValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8099:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8100:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8100:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8101:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 
            // InternalMGLang.g:8102:3: ( RULE_ID )
            // InternalMGLang.g:8103:4: RULE_ID
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueNodeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternReturnAccess().getReturnValueNodeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8114:1: rule__ParamManipulation__ParamAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParamManipulation__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8118:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8119:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8119:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8120:3: ( RULE_ID )
            {
             before(grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0()); 
            // InternalMGLang.g:8121:3: ( RULE_ID )
            // InternalMGLang.g:8122:4: RULE_ID
            {
             before(grammarAccess.getParamManipulationAccess().getParamParameterNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamManipulationAccess().getParamParameterNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8133:1: rule__ParamManipulation__ContentAssignment_1 : ( ruleNodeContent ) ;
    public final void rule__ParamManipulation__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8137:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:8138:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:8138:2: ( ruleNodeContent )
            // InternalMGLang.g:8139:3: ruleNodeContent
            {
             before(grammarAccess.getParamManipulationAccess().getContentNodeContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeContent();

            state._fsp--;

             after(grammarAccess.getParamManipulationAccess().getContentNodeContentParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Node__SrcModelAssignment_0_0"
    // InternalMGLang.g:8148:1: rule__Node__SrcModelAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__SrcModelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8152:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8153:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8153:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8154:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getSrcModelImportCrossReference_0_0_0()); 
            // InternalMGLang.g:8155:3: ( RULE_ID )
            // InternalMGLang.g:8156:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getSrcModelImportIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSrcModelImportIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getSrcModelImportCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__SrcModelAssignment_0_0"


    // $ANTLR start "rule__Node__TypeAssignment_1"
    // InternalMGLang.g:8167:1: rule__Node__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8171:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8172:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8172:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8173:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_1_0()); 
            // InternalMGLang.g:8174:3: ( RULE_ID )
            // InternalMGLang.g:8175:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getTypeEClassIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getTypeEClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__TypeAssignment_1"


    // $ANTLR start "rule__Node__NameAssignment_2"
    // InternalMGLang.g:8186:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8190:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8191:2: ( RULE_ID )
            {
            // InternalMGLang.g:8191:2: ( RULE_ID )
            // InternalMGLang.g:8192:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_2"


    // $ANTLR start "rule__Node__CreatedByAssignment_3_0"
    // InternalMGLang.g:8201:1: rule__Node__CreatedByAssignment_3_0 : ( ruleNodeContent ) ;
    public final void rule__Node__CreatedByAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8205:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:8206:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:8206:2: ( ruleNodeContent )
            // InternalMGLang.g:8207:3: ruleNodeContent
            {
             before(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeContent();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__CreatedByAssignment_3_0"


    // $ANTLR start "rule__Node__CreatedByAssignment_3_1_1"
    // InternalMGLang.g:8216:1: rule__Node__CreatedByAssignment_3_1_1 : ( rulePatternCall ) ;
    public final void rule__Node__CreatedByAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8220:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:8221:2: ( rulePatternCall )
            {
            // InternalMGLang.g:8221:2: ( rulePatternCall )
            // InternalMGLang.g:8222:3: rulePatternCall
            {
             before(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternCall();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__CreatedByAssignment_3_1_1"


    // $ANTLR start "rule__NodeContent__RefsAssignsAssignment_2"
    // InternalMGLang.g:8231:1: rule__NodeContent__RefsAssignsAssignment_2 : ( ruleNodeReferenceOrAssignmentOrControlFlow ) ;
    public final void rule__NodeContent__RefsAssignsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8235:1: ( ( ruleNodeReferenceOrAssignmentOrControlFlow ) )
            // InternalMGLang.g:8236:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
            {
            // InternalMGLang.g:8236:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
            // InternalMGLang.g:8237:3: ruleNodeReferenceOrAssignmentOrControlFlow
            {
             before(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentOrControlFlowParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeReferenceOrAssignmentOrControlFlow();

            state._fsp--;

             after(grammarAccess.getNodeContentAccess().getRefsAssignsNodeReferenceOrAssignmentOrControlFlowParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8246:1: rule__PatternCall__CalledAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8250:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8251:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8251:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8252:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 
            // InternalMGLang.g:8253:3: ( RULE_ID )
            // InternalMGLang.g:8254:4: RULE_ID
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternCallAccess().getCalledPatternIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8265:1: rule__PatternCall__ParamsAssignment_2_0 : ( ruleArithmeticExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8269:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8270:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8270:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8271:3: ruleArithmeticExpression
            {
             before(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8280:1: rule__PatternCall__ParamsAssignment_2_1_1 : ( ruleArithmeticExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8284:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8285:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8285:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8286:3: ruleArithmeticExpression
            {
             before(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getPatternCallAccess().getParamsArithmeticExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8295:1: rule__PatternNodeReference__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8299:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8300:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8300:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8301:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 
            // InternalMGLang.g:8302:3: ( RULE_ID )
            // InternalMGLang.g:8303:4: RULE_ID
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8314:1: rule__PatternNodeReference__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8318:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8319:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8319:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8320:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 
            // InternalMGLang.g:8321:3: ( RULE_ID )
            // InternalMGLang.g:8322:4: RULE_ID
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8333:1: rule__Assignment__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8337:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8338:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8338:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8339:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTargetENamedElementCrossReference_0_0()); 
            // InternalMGLang.g:8340:3: ( RULE_ID )
            // InternalMGLang.g:8341:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getTargetENamedElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getTargetENamedElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getTargetENamedElementCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8352:1: rule__Assignment__ValueAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8356:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8357:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8357:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8358:3: ruleArithmeticExpression
            {
             before(grammarAccess.getAssignmentAccess().getValueArithmeticExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueArithmeticExpressionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8367:1: rule__PrimitiveParameter__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8371:1: ( ( rulePrimitiveType ) )
            // InternalMGLang.g:8372:2: ( rulePrimitiveType )
            {
            // InternalMGLang.g:8372:2: ( rulePrimitiveType )
            // InternalMGLang.g:8373:3: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveParameterAccess().getTypePrimitiveTypeEnumRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8382:1: rule__PrimitiveParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8386:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8387:2: ( RULE_ID )
            {
            // InternalMGLang.g:8387:2: ( RULE_ID )
            // InternalMGLang.g:8388:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8397:1: rule__ParameterNode__SrcModelAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterNode__SrcModelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8401:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8402:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8402:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8403:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterNodeAccess().getSrcModelImportCrossReference_0_0_0()); 
            // InternalMGLang.g:8404:3: ( RULE_ID )
            // InternalMGLang.g:8405:4: RULE_ID
            {
             before(grammarAccess.getParameterNodeAccess().getSrcModelImportIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterNodeAccess().getSrcModelImportIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getParameterNodeAccess().getSrcModelImportCrossReference_0_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8416:1: rule__ParameterNode__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8420:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8421:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8421:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8422:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_1_0()); 
            // InternalMGLang.g:8423:3: ( RULE_ID )
            // InternalMGLang.g:8424:4: RULE_ID
            {
             before(grammarAccess.getParameterNodeAccess().getTypeEClassifierIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterNodeAccess().getTypeEClassifierIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8435:1: rule__ParameterNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8439:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8440:2: ( RULE_ID )
            {
            // InternalMGLang.g:8440:2: ( RULE_ID )
            // InternalMGLang.g:8441:3: RULE_ID
            {
             before(grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8450:1: rule__RefOrCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RefOrCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8454:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8455:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8455:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8456:3: ( RULE_ID )
            {
             before(grammarAccess.getRefOrCallAccess().getRefRefTypeCrossReference_0_0()); 
            // InternalMGLang.g:8457:3: ( RULE_ID )
            // InternalMGLang.g:8458:4: RULE_ID
            {
             before(grammarAccess.getRefOrCallAccess().getRefRefTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefOrCallAccess().getRefRefTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRefOrCallAccess().getRefRefTypeCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8469:1: rule__RefOrCall__RefAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__RefOrCall__RefAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8473:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8474:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8474:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8475:3: ( RULE_ID )
            {
             before(grammarAccess.getRefOrCallAccess().getRefETypedElementCrossReference_1_2_0()); 
            // InternalMGLang.g:8476:3: ( RULE_ID )
            // InternalMGLang.g:8477:4: RULE_ID
            {
             before(grammarAccess.getRefOrCallAccess().getRefETypedElementIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefOrCallAccess().getRefETypedElementIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getRefOrCallAccess().getRefETypedElementCrossReference_1_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8488:1: rule__RefOrCall__ParamsAssignment_1_3_1 : ( ruleRefParams ) ;
    public final void rule__RefOrCall__ParamsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8492:1: ( ( ruleRefParams ) )
            // InternalMGLang.g:8493:2: ( ruleRefParams )
            {
            // InternalMGLang.g:8493:2: ( ruleRefParams )
            // InternalMGLang.g:8494:3: ruleRefParams
            {
             before(grammarAccess.getRefOrCallAccess().getParamsRefParamsParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRefParams();

            state._fsp--;

             after(grammarAccess.getRefOrCallAccess().getParamsRefParamsParserRuleCall_1_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RefOrCall__BracesSetAssignment_1_3_2"
    // InternalMGLang.g:8503:1: rule__RefOrCall__BracesSetAssignment_1_3_2 : ( ( ')' ) ) ;
    public final void rule__RefOrCall__BracesSetAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8507:1: ( ( ( ')' ) ) )
            // InternalMGLang.g:8508:2: ( ( ')' ) )
            {
            // InternalMGLang.g:8508:2: ( ( ')' ) )
            // InternalMGLang.g:8509:3: ( ')' )
            {
             before(grammarAccess.getRefOrCallAccess().getBracesSetRightParenthesisKeyword_1_3_2_0()); 
            // InternalMGLang.g:8510:3: ( ')' )
            // InternalMGLang.g:8511:4: ')'
            {
             before(grammarAccess.getRefOrCallAccess().getBracesSetRightParenthesisKeyword_1_3_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRefOrCallAccess().getBracesSetRightParenthesisKeyword_1_3_2_0()); 

            }

             after(grammarAccess.getRefOrCallAccess().getBracesSetRightParenthesisKeyword_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefOrCall__BracesSetAssignment_1_3_2"


    // $ANTLR start "rule__RefParams__ParamsAssignment_0"
    // InternalMGLang.g:8522:1: rule__RefParams__ParamsAssignment_0 : ( ruleArithmeticExpression ) ;
    public final void rule__RefParams__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8526:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8527:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8527:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8528:3: ruleArithmeticExpression
            {
             before(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8537:1: rule__RefParams__ParamsAssignment_1_1 : ( ruleArithmeticExpression ) ;
    public final void rule__RefParams__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8541:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8542:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8542:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8543:3: ruleArithmeticExpression
            {
             before(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getRefParamsAccess().getParamsArithmeticExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8552:1: rule__Generator__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__Generator__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8556:1: ( ( ruleParameter ) )
            // InternalMGLang.g:8557:2: ( ruleParameter )
            {
            // InternalMGLang.g:8557:2: ( ruleParameter )
            // InternalMGLang.g:8558:3: ruleParameter
            {
             before(grammarAccess.getGeneratorAccess().getParamsParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getGeneratorAccess().getParamsParameterParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8567:1: rule__Generator__CommandsAssignment_6 : ( ruleGeneratorExpression ) ;
    public final void rule__Generator__CommandsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8571:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8572:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8572:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8573:3: ruleGeneratorExpression
            {
             before(grammarAccess.getGeneratorAccess().getCommandsGeneratorExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;

             after(grammarAccess.getGeneratorAccess().getCommandsGeneratorExpressionParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8582:1: rule__PatternVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8586:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8587:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8587:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8588:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternVariableAccess().getTypePatternCrossReference_0_0()); 
            // InternalMGLang.g:8589:3: ( RULE_ID )
            // InternalMGLang.g:8590:4: RULE_ID
            {
             before(grammarAccess.getPatternVariableAccess().getTypePatternIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternVariableAccess().getTypePatternIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPatternVariableAccess().getTypePatternCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8601:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8605:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8606:2: ( RULE_ID )
            {
            // InternalMGLang.g:8606:2: ( RULE_ID )
            // InternalMGLang.g:8607:3: RULE_ID
            {
             before(grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8616:1: rule__PatternVariable__PatternCallAssignment_3 : ( rulePatternCall ) ;
    public final void rule__PatternVariable__PatternCallAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8620:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:8621:2: ( rulePatternCall )
            {
            // InternalMGLang.g:8621:2: ( rulePatternCall )
            // InternalMGLang.g:8622:3: rulePatternCall
            {
             before(grammarAccess.getPatternVariableAccess().getPatternCallPatternCallParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePatternCall();

            state._fsp--;

             after(grammarAccess.getPatternVariableAccess().getPatternCallPatternCallParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalMGLang.g:8631:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8635:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8636:2: ( RULE_ID )
            {
            // InternalMGLang.g:8636:2: ( RULE_ID )
            // InternalMGLang.g:8637:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__ValueAssignment_3"
    // InternalMGLang.g:8646:1: rule__Variable__ValueAssignment_3 : ( ruleArithmeticExpression ) ;
    public final void rule__Variable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8650:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8651:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8651:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8652:3: ruleArithmeticExpression
            {
             before(grammarAccess.getVariableAccess().getValueArithmeticExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValueArithmeticExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValueAssignment_3"


    // $ANTLR start "rule__ForStatement__HeadAssignment_1"
    // InternalMGLang.g:8661:1: rule__ForStatement__HeadAssignment_1 : ( ruleForHead ) ;
    public final void rule__ForStatement__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8665:1: ( ( ruleForHead ) )
            // InternalMGLang.g:8666:2: ( ruleForHead )
            {
            // InternalMGLang.g:8666:2: ( ruleForHead )
            // InternalMGLang.g:8667:3: ruleForHead
            {
             before(grammarAccess.getForStatementAccess().getHeadForHeadParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForHead();

            state._fsp--;

             after(grammarAccess.getForStatementAccess().getHeadForHeadParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8676:1: rule__ForStatement__BodyAssignment_3 : ( ruleForBody ) ;
    public final void rule__ForStatement__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8680:1: ( ( ruleForBody ) )
            // InternalMGLang.g:8681:2: ( ruleForBody )
            {
            // InternalMGLang.g:8681:2: ( ruleForBody )
            // InternalMGLang.g:8682:3: ruleForBody
            {
             before(grammarAccess.getForStatementAccess().getBodyForBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleForBody();

            state._fsp--;

             after(grammarAccess.getForStatementAccess().getBodyForBodyParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8691:1: rule__GeneralForHead__IteratorVarAssignment_0 : ( RULE_ID ) ;
    public final void rule__GeneralForHead__IteratorVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8695:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8696:2: ( RULE_ID )
            {
            // InternalMGLang.g:8696:2: ( RULE_ID )
            // InternalMGLang.g:8697:3: RULE_ID
            {
             before(grammarAccess.getGeneralForHeadAccess().getIteratorVarIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralForHeadAccess().getIteratorVarIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8706:1: rule__GeneralForHead__RangeAssignment_2 : ( ruleForRange ) ;
    public final void rule__GeneralForHead__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8710:1: ( ( ruleForRange ) )
            // InternalMGLang.g:8711:2: ( ruleForRange )
            {
            // InternalMGLang.g:8711:2: ( ruleForRange )
            // InternalMGLang.g:8712:3: ruleForRange
            {
             before(grammarAccess.getGeneralForHeadAccess().getRangeForRangeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleForRange();

            state._fsp--;

             after(grammarAccess.getGeneralForHeadAccess().getRangeForRangeParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8721:1: rule__ForEachHead__SrcAssignment_0 : ( ruleRefOrCall ) ;
    public final void rule__ForEachHead__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8725:1: ( ( ruleRefOrCall ) )
            // InternalMGLang.g:8726:2: ( ruleRefOrCall )
            {
            // InternalMGLang.g:8726:2: ( ruleRefOrCall )
            // InternalMGLang.g:8727:3: ruleRefOrCall
            {
             before(grammarAccess.getForEachHeadAccess().getSrcRefOrCallParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRefOrCall();

            state._fsp--;

             after(grammarAccess.getForEachHeadAccess().getSrcRefOrCallParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8736:1: rule__ForEachHead__ErefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachHead__ErefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8740:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8741:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8741:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8742:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachHeadAccess().getErefEReferenceCrossReference_2_0()); 
            // InternalMGLang.g:8743:3: ( RULE_ID )
            // InternalMGLang.g:8744:4: RULE_ID
            {
             before(grammarAccess.getForEachHeadAccess().getErefEReferenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachHeadAccess().getErefEReferenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getForEachHeadAccess().getErefEReferenceCrossReference_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8755:1: rule__ForEachHead__IteratorVarAssignment_4 : ( RULE_ID ) ;
    public final void rule__ForEachHead__IteratorVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8759:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8760:2: ( RULE_ID )
            {
            // InternalMGLang.g:8760:2: ( RULE_ID )
            // InternalMGLang.g:8761:3: RULE_ID
            {
             before(grammarAccess.getForEachHeadAccess().getIteratorVarIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachHeadAccess().getIteratorVarIDTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8770:1: rule__ForBody__CommandsAssignment_1 : ( ruleGeneratorExpression ) ;
    public final void rule__ForBody__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8774:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8775:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8775:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8776:3: ruleGeneratorExpression
            {
             before(grammarAccess.getForBodyAccess().getCommandsGeneratorExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneratorExpression();

            state._fsp--;

             after(grammarAccess.getForBodyAccess().getCommandsGeneratorExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8785:1: rule__IfElseSwitch__CasesAssignment_2 : ( ruleIfElseCase ) ;
    public final void rule__IfElseSwitch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8789:1: ( ( ruleIfElseCase ) )
            // InternalMGLang.g:8790:2: ( ruleIfElseCase )
            {
            // InternalMGLang.g:8790:2: ( ruleIfElseCase )
            // InternalMGLang.g:8791:3: ruleIfElseCase
            {
             before(grammarAccess.getIfElseSwitchAccess().getCasesIfElseCaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIfElseCase();

            state._fsp--;

             after(grammarAccess.getIfElseSwitchAccess().getCasesIfElseCaseParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8800:1: rule__IfElseSwitch__DefaultAssignment_3 : ( ruleDefault ) ;
    public final void rule__IfElseSwitch__DefaultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8804:1: ( ( ruleDefault ) )
            // InternalMGLang.g:8805:2: ( ruleDefault )
            {
            // InternalMGLang.g:8805:2: ( ruleDefault )
            // InternalMGLang.g:8806:3: ruleDefault
            {
             before(grammarAccess.getIfElseSwitchAccess().getDefaultDefaultParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getIfElseSwitchAccess().getDefaultDefaultParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8815:1: rule__IfElseCase__ValAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__IfElseCase__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8819:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8820:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8820:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8821:3: ruleArithmeticExpression
            {
             before(grammarAccess.getIfElseCaseAccess().getValArithmeticExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getIfElseCaseAccess().getValArithmeticExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8830:1: rule__IfElseCase__BodyAssignment_3 : ( ruleCaseBody ) ;
    public final void rule__IfElseCase__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8834:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8835:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8835:2: ( ruleCaseBody )
            // InternalMGLang.g:8836:3: ruleCaseBody
            {
             before(grammarAccess.getIfElseCaseAccess().getBodyCaseBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;

             after(grammarAccess.getIfElseCaseAccess().getBodyCaseBodyParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8845:1: rule__SwitchCase__AttributeAssignment_2 : ( ruleRefOrCall ) ;
    public final void rule__SwitchCase__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8849:1: ( ( ruleRefOrCall ) )
            // InternalMGLang.g:8850:2: ( ruleRefOrCall )
            {
            // InternalMGLang.g:8850:2: ( ruleRefOrCall )
            // InternalMGLang.g:8851:3: ruleRefOrCall
            {
             before(grammarAccess.getSwitchCaseAccess().getAttributeRefOrCallParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRefOrCall();

            state._fsp--;

             after(grammarAccess.getSwitchCaseAccess().getAttributeRefOrCallParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8860:1: rule__SwitchCase__CasesAssignment_5 : ( ruleCase ) ;
    public final void rule__SwitchCase__CasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8864:1: ( ( ruleCase ) )
            // InternalMGLang.g:8865:2: ( ruleCase )
            {
            // InternalMGLang.g:8865:2: ( ruleCase )
            // InternalMGLang.g:8866:3: ruleCase
            {
             before(grammarAccess.getSwitchCaseAccess().getCasesCaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getSwitchCaseAccess().getCasesCaseParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8875:1: rule__SwitchCase__DefaultAssignment_6 : ( ruleDefault ) ;
    public final void rule__SwitchCase__DefaultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8879:1: ( ( ruleDefault ) )
            // InternalMGLang.g:8880:2: ( ruleDefault )
            {
            // InternalMGLang.g:8880:2: ( ruleDefault )
            // InternalMGLang.g:8881:3: ruleDefault
            {
             before(grammarAccess.getSwitchCaseAccess().getDefaultDefaultParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getSwitchCaseAccess().getDefaultDefaultParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8890:1: rule__CaseWithCast__NodeAssignment_1 : ( ruleNode ) ;
    public final void rule__CaseWithCast__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8894:1: ( ( ruleNode ) )
            // InternalMGLang.g:8895:2: ( ruleNode )
            {
            // InternalMGLang.g:8895:2: ( ruleNode )
            // InternalMGLang.g:8896:3: ruleNode
            {
             before(grammarAccess.getCaseWithCastAccess().getNodeNodeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getCaseWithCastAccess().getNodeNodeParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8905:1: rule__CaseWithCast__WhenAssignment_2_1 : ( ruleArithmeticExpression ) ;
    public final void rule__CaseWithCast__WhenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8909:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8910:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8910:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8911:3: ruleArithmeticExpression
            {
             before(grammarAccess.getCaseWithCastAccess().getWhenArithmeticExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getCaseWithCastAccess().getWhenArithmeticExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8920:1: rule__CaseWithCast__BodyAssignment_4 : ( ruleCaseBody ) ;
    public final void rule__CaseWithCast__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8924:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8925:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8925:2: ( ruleCaseBody )
            // InternalMGLang.g:8926:3: ruleCaseBody
            {
             before(grammarAccess.getCaseWithCastAccess().getBodyCaseBodyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;

             after(grammarAccess.getCaseWithCastAccess().getBodyCaseBodyParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8935:1: rule__CaseWithoutCast__ValAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__CaseWithoutCast__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8939:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8940:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8940:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8941:3: ruleArithmeticExpression
            {
             before(grammarAccess.getCaseWithoutCastAccess().getValArithmeticExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getCaseWithoutCastAccess().getValArithmeticExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8950:1: rule__CaseWithoutCast__BodyAssignment_3 : ( ruleCaseBody ) ;
    public final void rule__CaseWithoutCast__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8954:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8955:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8955:2: ( ruleCaseBody )
            // InternalMGLang.g:8956:3: ruleCaseBody
            {
             before(grammarAccess.getCaseWithoutCastAccess().getBodyCaseBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCaseBody();

            state._fsp--;

             after(grammarAccess.getCaseWithoutCastAccess().getBodyCaseBodyParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8965:1: rule__CaseBody__ExpressionsAssignment_0_2 : ( ruleSwitchExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8969:1: ( ( ruleSwitchExpression ) )
            // InternalMGLang.g:8970:2: ( ruleSwitchExpression )
            {
            // InternalMGLang.g:8970:2: ( ruleSwitchExpression )
            // InternalMGLang.g:8971:3: ruleSwitchExpression
            {
             before(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSwitchExpression();

            state._fsp--;

             after(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_0_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8980:1: rule__CaseBody__ExpressionsAssignment_1_0 : ( ruleSwitchExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8984:1: ( ( ruleSwitchExpression ) )
            // InternalMGLang.g:8985:2: ( ruleSwitchExpression )
            {
            // InternalMGLang.g:8985:2: ( ruleSwitchExpression )
            // InternalMGLang.g:8986:3: ruleSwitchExpression
            {
             before(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSwitchExpression();

            state._fsp--;

             after(grammarAccess.getCaseBodyAccess().getExpressionsSwitchExpressionParserRuleCall_1_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8995:1: rule__List__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8999:1: ( ( RULE_ID ) )
            // InternalMGLang.g:9000:2: ( RULE_ID )
            {
            // InternalMGLang.g:9000:2: ( RULE_ID )
            // InternalMGLang.g:9001:3: RULE_ID
            {
             before(grammarAccess.getListAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9010:1: rule__List__CreatedByAssignment_2_1 : ( ruleListAssignment ) ;
    public final void rule__List__CreatedByAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9014:1: ( ( ruleListAssignment ) )
            // InternalMGLang.g:9015:2: ( ruleListAssignment )
            {
            // InternalMGLang.g:9015:2: ( ruleListAssignment )
            // InternalMGLang.g:9016:3: ruleListAssignment
            {
             before(grammarAccess.getListAccess().getCreatedByListAssignmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListAssignment();

            state._fsp--;

             after(grammarAccess.getListAccess().getCreatedByListAssignmentParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9025:1: rule__ListAdHoc__ElementsAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__ListAdHoc__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9029:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9030:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9030:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9031:3: ruleArithmeticExpression
            {
             before(grammarAccess.getListAdHocAccess().getElementsArithmeticExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getListAdHocAccess().getElementsArithmeticExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9040:1: rule__ListAdHoc__ElementsAssignment_2_1 : ( ruleArithmeticExpression ) ;
    public final void rule__ListAdHoc__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9044:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9045:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9045:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9046:3: ruleArithmeticExpression
            {
             before(grammarAccess.getListAdHocAccess().getElementsArithmeticExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getListAdHocAccess().getElementsArithmeticExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9055:1: rule__Map__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Map__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9059:1: ( ( RULE_ID ) )
            // InternalMGLang.g:9060:2: ( RULE_ID )
            {
            // InternalMGLang.g:9060:2: ( RULE_ID )
            // InternalMGLang.g:9061:3: RULE_ID
            {
             before(grammarAccess.getMapAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9070:1: rule__Map__CreatedByAssignment_2_1 : ( ruleMapAssignment ) ;
    public final void rule__Map__CreatedByAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9074:1: ( ( ruleMapAssignment ) )
            // InternalMGLang.g:9075:2: ( ruleMapAssignment )
            {
            // InternalMGLang.g:9075:2: ( ruleMapAssignment )
            // InternalMGLang.g:9076:3: ruleMapAssignment
            {
             before(grammarAccess.getMapAccess().getCreatedByMapAssignmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMapAssignment();

            state._fsp--;

             after(grammarAccess.getMapAccess().getCreatedByMapAssignmentParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9085:1: rule__MapAdHoc__EntriesAssignment_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9089:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:9090:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:9090:2: ( ruleMapTupel )
            // InternalMGLang.g:9091:3: ruleMapTupel
            {
             before(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMapTupel();

            state._fsp--;

             after(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9100:1: rule__MapAdHoc__EntriesAssignment_2_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9104:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:9105:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:9105:2: ( ruleMapTupel )
            // InternalMGLang.g:9106:3: ruleMapTupel
            {
             before(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMapTupel();

            state._fsp--;

             after(grammarAccess.getMapAdHocAccess().getEntriesMapTupelParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9115:1: rule__MapTupel__KeyAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__MapTupel__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9119:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9120:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9120:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9121:3: ruleArithmeticExpression
            {
             before(grammarAccess.getMapTupelAccess().getKeyArithmeticExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getMapTupelAccess().getKeyArithmeticExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9130:1: rule__MapTupel__ValueAssignment_3 : ( ruleArithmeticExpression ) ;
    public final void rule__MapTupel__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9134:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9135:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9135:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9136:3: ruleArithmeticExpression
            {
             before(grammarAccess.getMapTupelAccess().getValueArithmeticExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getMapTupelAccess().getValueArithmeticExpressionParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9145:1: rule__ForRange__StartAssignment_0 : ( ruleArithmeticExpression ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9149:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9150:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9150:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9151:3: ruleArithmeticExpression
            {
             before(grammarAccess.getForRangeAccess().getStartArithmeticExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getForRangeAccess().getStartArithmeticExpressionParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9160:1: rule__ForRange__EndAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9164:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9165:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9165:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9166:3: ruleArithmeticExpression
            {
             before(grammarAccess.getForRangeAccess().getEndArithmeticExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getForRangeAccess().getEndArithmeticExpressionParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9175:1: rule__TertiaryExpression__OpAssignment_1_1 : ( ruleTertiaryOp ) ;
    public final void rule__TertiaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9179:1: ( ( ruleTertiaryOp ) )
            // InternalMGLang.g:9180:2: ( ruleTertiaryOp )
            {
            // InternalMGLang.g:9180:2: ( ruleTertiaryOp )
            // InternalMGLang.g:9181:3: ruleTertiaryOp
            {
             before(grammarAccess.getTertiaryExpressionAccess().getOpTertiaryOpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTertiaryOp();

            state._fsp--;

             after(grammarAccess.getTertiaryExpressionAccess().getOpTertiaryOpEnumRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9190:1: rule__TertiaryExpression__RightAssignment_1_2 : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9194:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:9195:2: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:9195:2: ( ruleSecondaryExpression )
            // InternalMGLang.g:9196:3: ruleSecondaryExpression
            {
             before(grammarAccess.getTertiaryExpressionAccess().getRightSecondaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSecondaryExpression();

            state._fsp--;

             after(grammarAccess.getTertiaryExpressionAccess().getRightSecondaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9205:1: rule__SecondaryExpression__OpAssignment_1_1 : ( ruleSecondaryOp ) ;
    public final void rule__SecondaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9209:1: ( ( ruleSecondaryOp ) )
            // InternalMGLang.g:9210:2: ( ruleSecondaryOp )
            {
            // InternalMGLang.g:9210:2: ( ruleSecondaryOp )
            // InternalMGLang.g:9211:3: ruleSecondaryOp
            {
             before(grammarAccess.getSecondaryExpressionAccess().getOpSecondaryOpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSecondaryOp();

            state._fsp--;

             after(grammarAccess.getSecondaryExpressionAccess().getOpSecondaryOpEnumRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9220:1: rule__SecondaryExpression__RightAssignment_1_2 : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9224:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:9225:2: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:9225:2: ( rulePrimaryExpr )
            // InternalMGLang.g:9226:3: rulePrimaryExpr
            {
             before(grammarAccess.getSecondaryExpressionAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;

             after(grammarAccess.getSecondaryExpressionAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9235:1: rule__PrimaryExpr__OpAssignment_1_1 : ( rulePrimaryOp ) ;
    public final void rule__PrimaryExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9239:1: ( ( rulePrimaryOp ) )
            // InternalMGLang.g:9240:2: ( rulePrimaryOp )
            {
            // InternalMGLang.g:9240:2: ( rulePrimaryOp )
            // InternalMGLang.g:9241:3: rulePrimaryOp
            {
             before(grammarAccess.getPrimaryExprAccess().getOpPrimaryOpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryOp();

            state._fsp--;

             after(grammarAccess.getPrimaryExprAccess().getOpPrimaryOpEnumRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9250:1: rule__PrimaryExpr__RightAssignment_1_2 : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9254:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:9255:2: ( ruleRelationExpression )
            {
            // InternalMGLang.g:9255:2: ( ruleRelationExpression )
            // InternalMGLang.g:9256:3: ruleRelationExpression
            {
             before(grammarAccess.getPrimaryExprAccess().getRightRelationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExprAccess().getRightRelationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9265:1: rule__RelationExpression__RelationAssignment_1_1 : ( ruleRelationalOp ) ;
    public final void rule__RelationExpression__RelationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9269:1: ( ( ruleRelationalOp ) )
            // InternalMGLang.g:9270:2: ( ruleRelationalOp )
            {
            // InternalMGLang.g:9270:2: ( ruleRelationalOp )
            // InternalMGLang.g:9271:3: ruleRelationalOp
            {
             before(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOp();

            state._fsp--;

             after(grammarAccess.getRelationExpressionAccess().getRelationRelationalOpEnumRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9280:1: rule__RelationExpression__RightAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9284:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:9285:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:9285:2: ( ruleBaseExpr )
            // InternalMGLang.g:9286:3: ruleBaseExpr
            {
             before(grammarAccess.getRelationExpressionAccess().getRightBaseExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseExpr();

            state._fsp--;

             after(grammarAccess.getRelationExpressionAccess().getRightBaseExprParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9295:1: rule__BaseExpr__ExprAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__BaseExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9299:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:9300:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:9300:2: ( ruleBaseExpr )
            // InternalMGLang.g:9301:3: ruleBaseExpr
            {
             before(grammarAccess.getBaseExprAccess().getExprBaseExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseExpr();

            state._fsp--;

             after(grammarAccess.getBaseExprAccess().getExprBaseExprParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9310:1: rule__BaseExpr__FuncAssignment_2_1 : ( ruleMathFunc ) ;
    public final void rule__BaseExpr__FuncAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9314:1: ( ( ruleMathFunc ) )
            // InternalMGLang.g:9315:2: ( ruleMathFunc )
            {
            // InternalMGLang.g:9315:2: ( ruleMathFunc )
            // InternalMGLang.g:9316:3: ruleMathFunc
            {
             before(grammarAccess.getBaseExprAccess().getFuncMathFuncEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathFunc();

            state._fsp--;

             after(grammarAccess.getBaseExprAccess().getFuncMathFuncEnumRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9325:1: rule__BaseExpr__ExprAssignment_2_3 : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__ExprAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9329:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9330:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9330:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9331:3: ruleArithmeticExpression
            {
             before(grammarAccess.getBaseExprAccess().getExprArithmeticExpressionParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getBaseExprAccess().getExprArithmeticExpressionParserRuleCall_2_3_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9340:1: rule__BooleanLiteral__ValAssignment : ( ( rule__BooleanLiteral__ValAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9344:1: ( ( ( rule__BooleanLiteral__ValAlternatives_0 ) ) )
            // InternalMGLang.g:9345:2: ( ( rule__BooleanLiteral__ValAlternatives_0 ) )
            {
            // InternalMGLang.g:9345:2: ( ( rule__BooleanLiteral__ValAlternatives_0 ) )
            // InternalMGLang.g:9346:3: ( rule__BooleanLiteral__ValAlternatives_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValAlternatives_0()); 
            // InternalMGLang.g:9347:3: ( rule__BooleanLiteral__ValAlternatives_0 )
            // InternalMGLang.g:9347:4: rule__BooleanLiteral__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValAlternatives_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9355:1: rule__StringLiteral__ValAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9359:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:9360:2: ( RULE_STRING )
            {
            // InternalMGLang.g:9360:2: ( RULE_STRING )
            // InternalMGLang.g:9361:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValSTRINGTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalMGLang.g:9370:1: rule__NumberLiteral__ValAssignment : ( RULE_DOUBLE ) ;
    public final void rule__NumberLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9374:1: ( ( RULE_DOUBLE ) )
            // InternalMGLang.g:9375:2: ( RULE_DOUBLE )
            {
            // InternalMGLang.g:9375:2: ( RULE_DOUBLE )
            // InternalMGLang.g:9376:3: RULE_DOUBLE
            {
             before(grammarAccess.getNumberLiteralAccess().getValDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getValDOUBLETerminalRuleCall_0()); 

            }


            }

        }
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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x4840080000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4840000000000202L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000780200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000780200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8000030000060730L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x8000010000060730L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000780202L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4858080000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4858000000000202L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x4858000000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4850040000000200L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x48500C0000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4850040000000202L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000060000L});

}