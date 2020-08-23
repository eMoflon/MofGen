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


    // $ANTLR start "entryRuleForStatement"
    // InternalMGLang.g:628:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalMGLang.g:629:1: ( ruleForStatement EOF )
            // InternalMGLang.g:630:1: ruleForStatement EOF
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
    // InternalMGLang.g:637:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:641:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalMGLang.g:642:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalMGLang.g:642:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalMGLang.g:643:3: ( rule__ForStatement__Group__0 )
            {
             before(grammarAccess.getForStatementAccess().getGroup()); 
            // InternalMGLang.g:644:3: ( rule__ForStatement__Group__0 )
            // InternalMGLang.g:644:4: rule__ForStatement__Group__0
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
    // InternalMGLang.g:653:1: entryRuleForHead : ruleForHead EOF ;
    public final void entryRuleForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:654:1: ( ruleForHead EOF )
            // InternalMGLang.g:655:1: ruleForHead EOF
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
    // InternalMGLang.g:662:1: ruleForHead : ( ( rule__ForHead__Alternatives ) ) ;
    public final void ruleForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:666:2: ( ( ( rule__ForHead__Alternatives ) ) )
            // InternalMGLang.g:667:2: ( ( rule__ForHead__Alternatives ) )
            {
            // InternalMGLang.g:667:2: ( ( rule__ForHead__Alternatives ) )
            // InternalMGLang.g:668:3: ( rule__ForHead__Alternatives )
            {
             before(grammarAccess.getForHeadAccess().getAlternatives()); 
            // InternalMGLang.g:669:3: ( rule__ForHead__Alternatives )
            // InternalMGLang.g:669:4: rule__ForHead__Alternatives
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
    // InternalMGLang.g:678:1: entryRuleGeneralForHead : ruleGeneralForHead EOF ;
    public final void entryRuleGeneralForHead() throws RecognitionException {
        try {
            // InternalMGLang.g:679:1: ( ruleGeneralForHead EOF )
            // InternalMGLang.g:680:1: ruleGeneralForHead EOF
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
    // InternalMGLang.g:687:1: ruleGeneralForHead : ( ( rule__GeneralForHead__Group__0 ) ) ;
    public final void ruleGeneralForHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:691:2: ( ( ( rule__GeneralForHead__Group__0 ) ) )
            // InternalMGLang.g:692:2: ( ( rule__GeneralForHead__Group__0 ) )
            {
            // InternalMGLang.g:692:2: ( ( rule__GeneralForHead__Group__0 ) )
            // InternalMGLang.g:693:3: ( rule__GeneralForHead__Group__0 )
            {
             before(grammarAccess.getGeneralForHeadAccess().getGroup()); 
            // InternalMGLang.g:694:3: ( rule__GeneralForHead__Group__0 )
            // InternalMGLang.g:694:4: rule__GeneralForHead__Group__0
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
    // InternalMGLang.g:703:1: entryRuleForEachHead : ruleForEachHead EOF ;
    public final void entryRuleForEachHead() throws RecognitionException {
        try {
            // InternalMGLang.g:704:1: ( ruleForEachHead EOF )
            // InternalMGLang.g:705:1: ruleForEachHead EOF
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
    // InternalMGLang.g:712:1: ruleForEachHead : ( ( rule__ForEachHead__Group__0 ) ) ;
    public final void ruleForEachHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:716:2: ( ( ( rule__ForEachHead__Group__0 ) ) )
            // InternalMGLang.g:717:2: ( ( rule__ForEachHead__Group__0 ) )
            {
            // InternalMGLang.g:717:2: ( ( rule__ForEachHead__Group__0 ) )
            // InternalMGLang.g:718:3: ( rule__ForEachHead__Group__0 )
            {
             before(grammarAccess.getForEachHeadAccess().getGroup()); 
            // InternalMGLang.g:719:3: ( rule__ForEachHead__Group__0 )
            // InternalMGLang.g:719:4: rule__ForEachHead__Group__0
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
    // InternalMGLang.g:728:1: entryRuleForBody : ruleForBody EOF ;
    public final void entryRuleForBody() throws RecognitionException {
        try {
            // InternalMGLang.g:729:1: ( ruleForBody EOF )
            // InternalMGLang.g:730:1: ruleForBody EOF
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
    // InternalMGLang.g:737:1: ruleForBody : ( ( rule__ForBody__Group__0 ) ) ;
    public final void ruleForBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:741:2: ( ( ( rule__ForBody__Group__0 ) ) )
            // InternalMGLang.g:742:2: ( ( rule__ForBody__Group__0 ) )
            {
            // InternalMGLang.g:742:2: ( ( rule__ForBody__Group__0 ) )
            // InternalMGLang.g:743:3: ( rule__ForBody__Group__0 )
            {
             before(grammarAccess.getForBodyAccess().getGroup()); 
            // InternalMGLang.g:744:3: ( rule__ForBody__Group__0 )
            // InternalMGLang.g:744:4: rule__ForBody__Group__0
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
    // InternalMGLang.g:753:1: entryRuleSwitchExpression : ruleSwitchExpression EOF ;
    public final void entryRuleSwitchExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:754:1: ( ruleSwitchExpression EOF )
            // InternalMGLang.g:755:1: ruleSwitchExpression EOF
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
    // InternalMGLang.g:762:1: ruleSwitchExpression : ( ( rule__SwitchExpression__Alternatives ) ) ;
    public final void ruleSwitchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:766:2: ( ( ( rule__SwitchExpression__Alternatives ) ) )
            // InternalMGLang.g:767:2: ( ( rule__SwitchExpression__Alternatives ) )
            {
            // InternalMGLang.g:767:2: ( ( rule__SwitchExpression__Alternatives ) )
            // InternalMGLang.g:768:3: ( rule__SwitchExpression__Alternatives )
            {
             before(grammarAccess.getSwitchExpressionAccess().getAlternatives()); 
            // InternalMGLang.g:769:3: ( rule__SwitchExpression__Alternatives )
            // InternalMGLang.g:769:4: rule__SwitchExpression__Alternatives
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
    // InternalMGLang.g:778:1: entryRuleSwitch : ruleSwitch EOF ;
    public final void entryRuleSwitch() throws RecognitionException {
        try {
            // InternalMGLang.g:779:1: ( ruleSwitch EOF )
            // InternalMGLang.g:780:1: ruleSwitch EOF
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
    // InternalMGLang.g:787:1: ruleSwitch : ( ( rule__Switch__Alternatives ) ) ;
    public final void ruleSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:791:2: ( ( ( rule__Switch__Alternatives ) ) )
            // InternalMGLang.g:792:2: ( ( rule__Switch__Alternatives ) )
            {
            // InternalMGLang.g:792:2: ( ( rule__Switch__Alternatives ) )
            // InternalMGLang.g:793:3: ( rule__Switch__Alternatives )
            {
             before(grammarAccess.getSwitchAccess().getAlternatives()); 
            // InternalMGLang.g:794:3: ( rule__Switch__Alternatives )
            // InternalMGLang.g:794:4: rule__Switch__Alternatives
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
    // InternalMGLang.g:803:1: entryRuleIfElseSwitch : ruleIfElseSwitch EOF ;
    public final void entryRuleIfElseSwitch() throws RecognitionException {
        try {
            // InternalMGLang.g:804:1: ( ruleIfElseSwitch EOF )
            // InternalMGLang.g:805:1: ruleIfElseSwitch EOF
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
    // InternalMGLang.g:812:1: ruleIfElseSwitch : ( ( rule__IfElseSwitch__Group__0 ) ) ;
    public final void ruleIfElseSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:816:2: ( ( ( rule__IfElseSwitch__Group__0 ) ) )
            // InternalMGLang.g:817:2: ( ( rule__IfElseSwitch__Group__0 ) )
            {
            // InternalMGLang.g:817:2: ( ( rule__IfElseSwitch__Group__0 ) )
            // InternalMGLang.g:818:3: ( rule__IfElseSwitch__Group__0 )
            {
             before(grammarAccess.getIfElseSwitchAccess().getGroup()); 
            // InternalMGLang.g:819:3: ( rule__IfElseSwitch__Group__0 )
            // InternalMGLang.g:819:4: rule__IfElseSwitch__Group__0
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
    // InternalMGLang.g:828:1: entryRuleIfElseCase : ruleIfElseCase EOF ;
    public final void entryRuleIfElseCase() throws RecognitionException {
        try {
            // InternalMGLang.g:829:1: ( ruleIfElseCase EOF )
            // InternalMGLang.g:830:1: ruleIfElseCase EOF
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
    // InternalMGLang.g:837:1: ruleIfElseCase : ( ( rule__IfElseCase__Group__0 ) ) ;
    public final void ruleIfElseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:841:2: ( ( ( rule__IfElseCase__Group__0 ) ) )
            // InternalMGLang.g:842:2: ( ( rule__IfElseCase__Group__0 ) )
            {
            // InternalMGLang.g:842:2: ( ( rule__IfElseCase__Group__0 ) )
            // InternalMGLang.g:843:3: ( rule__IfElseCase__Group__0 )
            {
             before(grammarAccess.getIfElseCaseAccess().getGroup()); 
            // InternalMGLang.g:844:3: ( rule__IfElseCase__Group__0 )
            // InternalMGLang.g:844:4: rule__IfElseCase__Group__0
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
    // InternalMGLang.g:853:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // InternalMGLang.g:854:1: ( ruleDefault EOF )
            // InternalMGLang.g:855:1: ruleDefault EOF
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
    // InternalMGLang.g:862:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:866:2: ( ( ( rule__Default__Group__0 ) ) )
            // InternalMGLang.g:867:2: ( ( rule__Default__Group__0 ) )
            {
            // InternalMGLang.g:867:2: ( ( rule__Default__Group__0 ) )
            // InternalMGLang.g:868:3: ( rule__Default__Group__0 )
            {
             before(grammarAccess.getDefaultAccess().getGroup()); 
            // InternalMGLang.g:869:3: ( rule__Default__Group__0 )
            // InternalMGLang.g:869:4: rule__Default__Group__0
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
    // InternalMGLang.g:878:1: entryRuleSwitchCase : ruleSwitchCase EOF ;
    public final void entryRuleSwitchCase() throws RecognitionException {
        try {
            // InternalMGLang.g:879:1: ( ruleSwitchCase EOF )
            // InternalMGLang.g:880:1: ruleSwitchCase EOF
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
    // InternalMGLang.g:887:1: ruleSwitchCase : ( ( rule__SwitchCase__Group__0 ) ) ;
    public final void ruleSwitchCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:891:2: ( ( ( rule__SwitchCase__Group__0 ) ) )
            // InternalMGLang.g:892:2: ( ( rule__SwitchCase__Group__0 ) )
            {
            // InternalMGLang.g:892:2: ( ( rule__SwitchCase__Group__0 ) )
            // InternalMGLang.g:893:3: ( rule__SwitchCase__Group__0 )
            {
             before(grammarAccess.getSwitchCaseAccess().getGroup()); 
            // InternalMGLang.g:894:3: ( rule__SwitchCase__Group__0 )
            // InternalMGLang.g:894:4: rule__SwitchCase__Group__0
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
    // InternalMGLang.g:903:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalMGLang.g:904:1: ( ruleCase EOF )
            // InternalMGLang.g:905:1: ruleCase EOF
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
    // InternalMGLang.g:912:1: ruleCase : ( ( rule__Case__Alternatives ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:916:2: ( ( ( rule__Case__Alternatives ) ) )
            // InternalMGLang.g:917:2: ( ( rule__Case__Alternatives ) )
            {
            // InternalMGLang.g:917:2: ( ( rule__Case__Alternatives ) )
            // InternalMGLang.g:918:3: ( rule__Case__Alternatives )
            {
             before(grammarAccess.getCaseAccess().getAlternatives()); 
            // InternalMGLang.g:919:3: ( rule__Case__Alternatives )
            // InternalMGLang.g:919:4: rule__Case__Alternatives
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
    // InternalMGLang.g:928:1: entryRuleCaseWithCast : ruleCaseWithCast EOF ;
    public final void entryRuleCaseWithCast() throws RecognitionException {
        try {
            // InternalMGLang.g:929:1: ( ruleCaseWithCast EOF )
            // InternalMGLang.g:930:1: ruleCaseWithCast EOF
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
    // InternalMGLang.g:937:1: ruleCaseWithCast : ( ( rule__CaseWithCast__Group__0 ) ) ;
    public final void ruleCaseWithCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:941:2: ( ( ( rule__CaseWithCast__Group__0 ) ) )
            // InternalMGLang.g:942:2: ( ( rule__CaseWithCast__Group__0 ) )
            {
            // InternalMGLang.g:942:2: ( ( rule__CaseWithCast__Group__0 ) )
            // InternalMGLang.g:943:3: ( rule__CaseWithCast__Group__0 )
            {
             before(grammarAccess.getCaseWithCastAccess().getGroup()); 
            // InternalMGLang.g:944:3: ( rule__CaseWithCast__Group__0 )
            // InternalMGLang.g:944:4: rule__CaseWithCast__Group__0
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
    // InternalMGLang.g:953:1: entryRuleCaseWithoutCast : ruleCaseWithoutCast EOF ;
    public final void entryRuleCaseWithoutCast() throws RecognitionException {
        try {
            // InternalMGLang.g:954:1: ( ruleCaseWithoutCast EOF )
            // InternalMGLang.g:955:1: ruleCaseWithoutCast EOF
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
    // InternalMGLang.g:962:1: ruleCaseWithoutCast : ( ( rule__CaseWithoutCast__Group__0 ) ) ;
    public final void ruleCaseWithoutCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:966:2: ( ( ( rule__CaseWithoutCast__Group__0 ) ) )
            // InternalMGLang.g:967:2: ( ( rule__CaseWithoutCast__Group__0 ) )
            {
            // InternalMGLang.g:967:2: ( ( rule__CaseWithoutCast__Group__0 ) )
            // InternalMGLang.g:968:3: ( rule__CaseWithoutCast__Group__0 )
            {
             before(grammarAccess.getCaseWithoutCastAccess().getGroup()); 
            // InternalMGLang.g:969:3: ( rule__CaseWithoutCast__Group__0 )
            // InternalMGLang.g:969:4: rule__CaseWithoutCast__Group__0
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
    // InternalMGLang.g:978:1: entryRuleCaseBody : ruleCaseBody EOF ;
    public final void entryRuleCaseBody() throws RecognitionException {
        try {
            // InternalMGLang.g:979:1: ( ruleCaseBody EOF )
            // InternalMGLang.g:980:1: ruleCaseBody EOF
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
    // InternalMGLang.g:987:1: ruleCaseBody : ( ( rule__CaseBody__Alternatives ) ) ;
    public final void ruleCaseBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:991:2: ( ( ( rule__CaseBody__Alternatives ) ) )
            // InternalMGLang.g:992:2: ( ( rule__CaseBody__Alternatives ) )
            {
            // InternalMGLang.g:992:2: ( ( rule__CaseBody__Alternatives ) )
            // InternalMGLang.g:993:3: ( rule__CaseBody__Alternatives )
            {
             before(grammarAccess.getCaseBodyAccess().getAlternatives()); 
            // InternalMGLang.g:994:3: ( rule__CaseBody__Alternatives )
            // InternalMGLang.g:994:4: rule__CaseBody__Alternatives
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
    // InternalMGLang.g:1003:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMGLang.g:1004:1: ( ruleCollection EOF )
            // InternalMGLang.g:1005:1: ruleCollection EOF
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
    // InternalMGLang.g:1012:1: ruleCollection : ( ( rule__Collection__Alternatives ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1016:2: ( ( ( rule__Collection__Alternatives ) ) )
            // InternalMGLang.g:1017:2: ( ( rule__Collection__Alternatives ) )
            {
            // InternalMGLang.g:1017:2: ( ( rule__Collection__Alternatives ) )
            // InternalMGLang.g:1018:3: ( rule__Collection__Alternatives )
            {
             before(grammarAccess.getCollectionAccess().getAlternatives()); 
            // InternalMGLang.g:1019:3: ( rule__Collection__Alternatives )
            // InternalMGLang.g:1019:4: rule__Collection__Alternatives
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
    // InternalMGLang.g:1028:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMGLang.g:1029:1: ( ruleList EOF )
            // InternalMGLang.g:1030:1: ruleList EOF
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
    // InternalMGLang.g:1037:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1041:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalMGLang.g:1042:2: ( ( rule__List__Group__0 ) )
            {
            // InternalMGLang.g:1042:2: ( ( rule__List__Group__0 ) )
            // InternalMGLang.g:1043:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalMGLang.g:1044:3: ( rule__List__Group__0 )
            // InternalMGLang.g:1044:4: rule__List__Group__0
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
    // InternalMGLang.g:1053:1: entryRuleListAssignment : ruleListAssignment EOF ;
    public final void entryRuleListAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:1054:1: ( ruleListAssignment EOF )
            // InternalMGLang.g:1055:1: ruleListAssignment EOF
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
    // InternalMGLang.g:1062:1: ruleListAssignment : ( ( rule__ListAssignment__Alternatives ) ) ;
    public final void ruleListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1066:2: ( ( ( rule__ListAssignment__Alternatives ) ) )
            // InternalMGLang.g:1067:2: ( ( rule__ListAssignment__Alternatives ) )
            {
            // InternalMGLang.g:1067:2: ( ( rule__ListAssignment__Alternatives ) )
            // InternalMGLang.g:1068:3: ( rule__ListAssignment__Alternatives )
            {
             before(grammarAccess.getListAssignmentAccess().getAlternatives()); 
            // InternalMGLang.g:1069:3: ( rule__ListAssignment__Alternatives )
            // InternalMGLang.g:1069:4: rule__ListAssignment__Alternatives
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
    // InternalMGLang.g:1078:1: entryRuleListAdHoc : ruleListAdHoc EOF ;
    public final void entryRuleListAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:1079:1: ( ruleListAdHoc EOF )
            // InternalMGLang.g:1080:1: ruleListAdHoc EOF
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
    // InternalMGLang.g:1087:1: ruleListAdHoc : ( ( rule__ListAdHoc__Group__0 ) ) ;
    public final void ruleListAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1091:2: ( ( ( rule__ListAdHoc__Group__0 ) ) )
            // InternalMGLang.g:1092:2: ( ( rule__ListAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:1092:2: ( ( rule__ListAdHoc__Group__0 ) )
            // InternalMGLang.g:1093:3: ( rule__ListAdHoc__Group__0 )
            {
             before(grammarAccess.getListAdHocAccess().getGroup()); 
            // InternalMGLang.g:1094:3: ( rule__ListAdHoc__Group__0 )
            // InternalMGLang.g:1094:4: rule__ListAdHoc__Group__0
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
    // InternalMGLang.g:1103:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalMGLang.g:1104:1: ( ruleMap EOF )
            // InternalMGLang.g:1105:1: ruleMap EOF
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
    // InternalMGLang.g:1112:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1116:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalMGLang.g:1117:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalMGLang.g:1117:2: ( ( rule__Map__Group__0 ) )
            // InternalMGLang.g:1118:3: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // InternalMGLang.g:1119:3: ( rule__Map__Group__0 )
            // InternalMGLang.g:1119:4: rule__Map__Group__0
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
    // InternalMGLang.g:1128:1: entryRuleMapAssignment : ruleMapAssignment EOF ;
    public final void entryRuleMapAssignment() throws RecognitionException {
        try {
            // InternalMGLang.g:1129:1: ( ruleMapAssignment EOF )
            // InternalMGLang.g:1130:1: ruleMapAssignment EOF
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
    // InternalMGLang.g:1137:1: ruleMapAssignment : ( ( rule__MapAssignment__Alternatives ) ) ;
    public final void ruleMapAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1141:2: ( ( ( rule__MapAssignment__Alternatives ) ) )
            // InternalMGLang.g:1142:2: ( ( rule__MapAssignment__Alternatives ) )
            {
            // InternalMGLang.g:1142:2: ( ( rule__MapAssignment__Alternatives ) )
            // InternalMGLang.g:1143:3: ( rule__MapAssignment__Alternatives )
            {
             before(grammarAccess.getMapAssignmentAccess().getAlternatives()); 
            // InternalMGLang.g:1144:3: ( rule__MapAssignment__Alternatives )
            // InternalMGLang.g:1144:4: rule__MapAssignment__Alternatives
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
    // InternalMGLang.g:1153:1: entryRuleMapAdHoc : ruleMapAdHoc EOF ;
    public final void entryRuleMapAdHoc() throws RecognitionException {
        try {
            // InternalMGLang.g:1154:1: ( ruleMapAdHoc EOF )
            // InternalMGLang.g:1155:1: ruleMapAdHoc EOF
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
    // InternalMGLang.g:1162:1: ruleMapAdHoc : ( ( rule__MapAdHoc__Group__0 ) ) ;
    public final void ruleMapAdHoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1166:2: ( ( ( rule__MapAdHoc__Group__0 ) ) )
            // InternalMGLang.g:1167:2: ( ( rule__MapAdHoc__Group__0 ) )
            {
            // InternalMGLang.g:1167:2: ( ( rule__MapAdHoc__Group__0 ) )
            // InternalMGLang.g:1168:3: ( rule__MapAdHoc__Group__0 )
            {
             before(grammarAccess.getMapAdHocAccess().getGroup()); 
            // InternalMGLang.g:1169:3: ( rule__MapAdHoc__Group__0 )
            // InternalMGLang.g:1169:4: rule__MapAdHoc__Group__0
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
    // InternalMGLang.g:1178:1: entryRuleMapTupel : ruleMapTupel EOF ;
    public final void entryRuleMapTupel() throws RecognitionException {
        try {
            // InternalMGLang.g:1179:1: ( ruleMapTupel EOF )
            // InternalMGLang.g:1180:1: ruleMapTupel EOF
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
    // InternalMGLang.g:1187:1: ruleMapTupel : ( ( rule__MapTupel__Group__0 ) ) ;
    public final void ruleMapTupel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1191:2: ( ( ( rule__MapTupel__Group__0 ) ) )
            // InternalMGLang.g:1192:2: ( ( rule__MapTupel__Group__0 ) )
            {
            // InternalMGLang.g:1192:2: ( ( rule__MapTupel__Group__0 ) )
            // InternalMGLang.g:1193:3: ( rule__MapTupel__Group__0 )
            {
             before(grammarAccess.getMapTupelAccess().getGroup()); 
            // InternalMGLang.g:1194:3: ( rule__MapTupel__Group__0 )
            // InternalMGLang.g:1194:4: rule__MapTupel__Group__0
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
    // InternalMGLang.g:1203:1: entryRuleForRange : ruleForRange EOF ;
    public final void entryRuleForRange() throws RecognitionException {
        try {
            // InternalMGLang.g:1204:1: ( ruleForRange EOF )
            // InternalMGLang.g:1205:1: ruleForRange EOF
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
    // InternalMGLang.g:1212:1: ruleForRange : ( ( rule__ForRange__Group__0 ) ) ;
    public final void ruleForRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1216:2: ( ( ( rule__ForRange__Group__0 ) ) )
            // InternalMGLang.g:1217:2: ( ( rule__ForRange__Group__0 ) )
            {
            // InternalMGLang.g:1217:2: ( ( rule__ForRange__Group__0 ) )
            // InternalMGLang.g:1218:3: ( rule__ForRange__Group__0 )
            {
             before(grammarAccess.getForRangeAccess().getGroup()); 
            // InternalMGLang.g:1219:3: ( rule__ForRange__Group__0 )
            // InternalMGLang.g:1219:4: rule__ForRange__Group__0
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
    // InternalMGLang.g:1228:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1229:1: ( ruleArithmeticExpression EOF )
            // InternalMGLang.g:1230:1: ruleArithmeticExpression EOF
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
    // InternalMGLang.g:1237:1: ruleArithmeticExpression : ( ruleTertiaryExpression ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1241:2: ( ( ruleTertiaryExpression ) )
            // InternalMGLang.g:1242:2: ( ruleTertiaryExpression )
            {
            // InternalMGLang.g:1242:2: ( ruleTertiaryExpression )
            // InternalMGLang.g:1243:3: ruleTertiaryExpression
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
    // InternalMGLang.g:1253:1: entryRuleTertiaryExpression : ruleTertiaryExpression EOF ;
    public final void entryRuleTertiaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1254:1: ( ruleTertiaryExpression EOF )
            // InternalMGLang.g:1255:1: ruleTertiaryExpression EOF
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
    // InternalMGLang.g:1262:1: ruleTertiaryExpression : ( ( rule__TertiaryExpression__Group__0 ) ) ;
    public final void ruleTertiaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1266:2: ( ( ( rule__TertiaryExpression__Group__0 ) ) )
            // InternalMGLang.g:1267:2: ( ( rule__TertiaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:1267:2: ( ( rule__TertiaryExpression__Group__0 ) )
            // InternalMGLang.g:1268:3: ( rule__TertiaryExpression__Group__0 )
            {
             before(grammarAccess.getTertiaryExpressionAccess().getGroup()); 
            // InternalMGLang.g:1269:3: ( rule__TertiaryExpression__Group__0 )
            // InternalMGLang.g:1269:4: rule__TertiaryExpression__Group__0
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
    // InternalMGLang.g:1278:1: entryRuleSecondaryExpression : ruleSecondaryExpression EOF ;
    public final void entryRuleSecondaryExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1279:1: ( ruleSecondaryExpression EOF )
            // InternalMGLang.g:1280:1: ruleSecondaryExpression EOF
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
    // InternalMGLang.g:1287:1: ruleSecondaryExpression : ( ( rule__SecondaryExpression__Group__0 ) ) ;
    public final void ruleSecondaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1291:2: ( ( ( rule__SecondaryExpression__Group__0 ) ) )
            // InternalMGLang.g:1292:2: ( ( rule__SecondaryExpression__Group__0 ) )
            {
            // InternalMGLang.g:1292:2: ( ( rule__SecondaryExpression__Group__0 ) )
            // InternalMGLang.g:1293:3: ( rule__SecondaryExpression__Group__0 )
            {
             before(grammarAccess.getSecondaryExpressionAccess().getGroup()); 
            // InternalMGLang.g:1294:3: ( rule__SecondaryExpression__Group__0 )
            // InternalMGLang.g:1294:4: rule__SecondaryExpression__Group__0
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
    // InternalMGLang.g:1303:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:1304:1: ( rulePrimaryExpr EOF )
            // InternalMGLang.g:1305:1: rulePrimaryExpr EOF
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
    // InternalMGLang.g:1312:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Group__0 ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1316:2: ( ( ( rule__PrimaryExpr__Group__0 ) ) )
            // InternalMGLang.g:1317:2: ( ( rule__PrimaryExpr__Group__0 ) )
            {
            // InternalMGLang.g:1317:2: ( ( rule__PrimaryExpr__Group__0 ) )
            // InternalMGLang.g:1318:3: ( rule__PrimaryExpr__Group__0 )
            {
             before(grammarAccess.getPrimaryExprAccess().getGroup()); 
            // InternalMGLang.g:1319:3: ( rule__PrimaryExpr__Group__0 )
            // InternalMGLang.g:1319:4: rule__PrimaryExpr__Group__0
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
    // InternalMGLang.g:1328:1: entryRuleRelationExpression : ruleRelationExpression EOF ;
    public final void entryRuleRelationExpression() throws RecognitionException {
        try {
            // InternalMGLang.g:1329:1: ( ruleRelationExpression EOF )
            // InternalMGLang.g:1330:1: ruleRelationExpression EOF
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
    // InternalMGLang.g:1337:1: ruleRelationExpression : ( ( rule__RelationExpression__Group__0 ) ) ;
    public final void ruleRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1341:2: ( ( ( rule__RelationExpression__Group__0 ) ) )
            // InternalMGLang.g:1342:2: ( ( rule__RelationExpression__Group__0 ) )
            {
            // InternalMGLang.g:1342:2: ( ( rule__RelationExpression__Group__0 ) )
            // InternalMGLang.g:1343:3: ( rule__RelationExpression__Group__0 )
            {
             before(grammarAccess.getRelationExpressionAccess().getGroup()); 
            // InternalMGLang.g:1344:3: ( rule__RelationExpression__Group__0 )
            // InternalMGLang.g:1344:4: rule__RelationExpression__Group__0
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
    // InternalMGLang.g:1353:1: entryRuleBaseExpr : ruleBaseExpr EOF ;
    public final void entryRuleBaseExpr() throws RecognitionException {
        try {
            // InternalMGLang.g:1354:1: ( ruleBaseExpr EOF )
            // InternalMGLang.g:1355:1: ruleBaseExpr EOF
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
    // InternalMGLang.g:1362:1: ruleBaseExpr : ( ( rule__BaseExpr__Alternatives ) ) ;
    public final void ruleBaseExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1366:2: ( ( ( rule__BaseExpr__Alternatives ) ) )
            // InternalMGLang.g:1367:2: ( ( rule__BaseExpr__Alternatives ) )
            {
            // InternalMGLang.g:1367:2: ( ( rule__BaseExpr__Alternatives ) )
            // InternalMGLang.g:1368:3: ( rule__BaseExpr__Alternatives )
            {
             before(grammarAccess.getBaseExprAccess().getAlternatives()); 
            // InternalMGLang.g:1369:3: ( rule__BaseExpr__Alternatives )
            // InternalMGLang.g:1369:4: rule__BaseExpr__Alternatives
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
    // InternalMGLang.g:1378:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1379:1: ( ruleLiteral EOF )
            // InternalMGLang.g:1380:1: ruleLiteral EOF
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
    // InternalMGLang.g:1387:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1391:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMGLang.g:1392:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMGLang.g:1392:2: ( ( rule__Literal__Alternatives ) )
            // InternalMGLang.g:1393:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalMGLang.g:1394:3: ( rule__Literal__Alternatives )
            // InternalMGLang.g:1394:4: rule__Literal__Alternatives
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
    // InternalMGLang.g:1403:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1404:1: ( ruleBooleanLiteral EOF )
            // InternalMGLang.g:1405:1: ruleBooleanLiteral EOF
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
    // InternalMGLang.g:1412:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1416:2: ( ( ( rule__BooleanLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1417:2: ( ( rule__BooleanLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1417:2: ( ( rule__BooleanLiteral__ValAssignment ) )
            // InternalMGLang.g:1418:3: ( rule__BooleanLiteral__ValAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValAssignment()); 
            // InternalMGLang.g:1419:3: ( rule__BooleanLiteral__ValAssignment )
            // InternalMGLang.g:1419:4: rule__BooleanLiteral__ValAssignment
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
    // InternalMGLang.g:1428:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1429:1: ( ruleStringLiteral EOF )
            // InternalMGLang.g:1430:1: ruleStringLiteral EOF
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
    // InternalMGLang.g:1437:1: ruleStringLiteral : ( ( rule__StringLiteral__ValAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1441:2: ( ( ( rule__StringLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1442:2: ( ( rule__StringLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1442:2: ( ( rule__StringLiteral__ValAssignment ) )
            // InternalMGLang.g:1443:3: ( rule__StringLiteral__ValAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValAssignment()); 
            // InternalMGLang.g:1444:3: ( rule__StringLiteral__ValAssignment )
            // InternalMGLang.g:1444:4: rule__StringLiteral__ValAssignment
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
    // InternalMGLang.g:1453:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMGLang.g:1454:1: ( ruleNumberLiteral EOF )
            // InternalMGLang.g:1455:1: ruleNumberLiteral EOF
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
    // InternalMGLang.g:1462:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1466:2: ( ( ( rule__NumberLiteral__ValAssignment ) ) )
            // InternalMGLang.g:1467:2: ( ( rule__NumberLiteral__ValAssignment ) )
            {
            // InternalMGLang.g:1467:2: ( ( rule__NumberLiteral__ValAssignment ) )
            // InternalMGLang.g:1468:3: ( rule__NumberLiteral__ValAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValAssignment()); 
            // InternalMGLang.g:1469:3: ( rule__NumberLiteral__ValAssignment )
            // InternalMGLang.g:1469:4: rule__NumberLiteral__ValAssignment
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
    // InternalMGLang.g:1478:1: ruleMathFunc : ( ( rule__MathFunc__Alternatives ) ) ;
    public final void ruleMathFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1482:1: ( ( ( rule__MathFunc__Alternatives ) ) )
            // InternalMGLang.g:1483:2: ( ( rule__MathFunc__Alternatives ) )
            {
            // InternalMGLang.g:1483:2: ( ( rule__MathFunc__Alternatives ) )
            // InternalMGLang.g:1484:3: ( rule__MathFunc__Alternatives )
            {
             before(grammarAccess.getMathFuncAccess().getAlternatives()); 
            // InternalMGLang.g:1485:3: ( rule__MathFunc__Alternatives )
            // InternalMGLang.g:1485:4: rule__MathFunc__Alternatives
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
    // InternalMGLang.g:1494:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1498:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalMGLang.g:1499:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalMGLang.g:1499:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalMGLang.g:1500:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalMGLang.g:1501:3: ( rule__PrimitiveType__Alternatives )
            // InternalMGLang.g:1501:4: rule__PrimitiveType__Alternatives
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
    // InternalMGLang.g:1510:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1514:1: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // InternalMGLang.g:1515:2: ( ( rule__RelationalOp__Alternatives ) )
            {
            // InternalMGLang.g:1515:2: ( ( rule__RelationalOp__Alternatives ) )
            // InternalMGLang.g:1516:3: ( rule__RelationalOp__Alternatives )
            {
             before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            // InternalMGLang.g:1517:3: ( rule__RelationalOp__Alternatives )
            // InternalMGLang.g:1517:4: rule__RelationalOp__Alternatives
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
    // InternalMGLang.g:1526:1: ruleTertiaryOp : ( ( rule__TertiaryOp__Alternatives ) ) ;
    public final void ruleTertiaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1530:1: ( ( ( rule__TertiaryOp__Alternatives ) ) )
            // InternalMGLang.g:1531:2: ( ( rule__TertiaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1531:2: ( ( rule__TertiaryOp__Alternatives ) )
            // InternalMGLang.g:1532:3: ( rule__TertiaryOp__Alternatives )
            {
             before(grammarAccess.getTertiaryOpAccess().getAlternatives()); 
            // InternalMGLang.g:1533:3: ( rule__TertiaryOp__Alternatives )
            // InternalMGLang.g:1533:4: rule__TertiaryOp__Alternatives
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
    // InternalMGLang.g:1542:1: ruleSecondaryOp : ( ( rule__SecondaryOp__Alternatives ) ) ;
    public final void ruleSecondaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1546:1: ( ( ( rule__SecondaryOp__Alternatives ) ) )
            // InternalMGLang.g:1547:2: ( ( rule__SecondaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1547:2: ( ( rule__SecondaryOp__Alternatives ) )
            // InternalMGLang.g:1548:3: ( rule__SecondaryOp__Alternatives )
            {
             before(grammarAccess.getSecondaryOpAccess().getAlternatives()); 
            // InternalMGLang.g:1549:3: ( rule__SecondaryOp__Alternatives )
            // InternalMGLang.g:1549:4: rule__SecondaryOp__Alternatives
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
    // InternalMGLang.g:1558:1: rulePrimaryOp : ( ( rule__PrimaryOp__Alternatives ) ) ;
    public final void rulePrimaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1562:1: ( ( ( rule__PrimaryOp__Alternatives ) ) )
            // InternalMGLang.g:1563:2: ( ( rule__PrimaryOp__Alternatives ) )
            {
            // InternalMGLang.g:1563:2: ( ( rule__PrimaryOp__Alternatives ) )
            // InternalMGLang.g:1564:3: ( rule__PrimaryOp__Alternatives )
            {
             before(grammarAccess.getPrimaryOpAccess().getAlternatives()); 
            // InternalMGLang.g:1565:3: ( rule__PrimaryOp__Alternatives )
            // InternalMGLang.g:1565:4: rule__PrimaryOp__Alternatives
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
    // InternalMGLang.g:1573:1: rule__FileCommand__Alternatives : ( ( rulePattern ) | ( ruleGenerator ) );
    public final void rule__FileCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1577:1: ( ( rulePattern ) | ( ruleGenerator ) )
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
                    // InternalMGLang.g:1578:2: ( rulePattern )
                    {
                    // InternalMGLang.g:1578:2: ( rulePattern )
                    // InternalMGLang.g:1579:3: rulePattern
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
                    // InternalMGLang.g:1584:2: ( ruleGenerator )
                    {
                    // InternalMGLang.g:1584:2: ( ruleGenerator )
                    // InternalMGLang.g:1585:3: ruleGenerator
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
    // InternalMGLang.g:1594:1: rule__PatternCommand__Alternatives : ( ( ruleCollection ) | ( ruleNode ) | ( ruleParamManipulation ) | ( ruleSwitch ) );
    public final void rule__PatternCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1598:1: ( ( ruleCollection ) | ( ruleNode ) | ( ruleParamManipulation ) | ( ruleSwitch ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 58:
            case 61:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==42) ) {
                    alt2=3;
                }
                else if ( (LA2_2==RULE_ID) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 53:
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
                    // InternalMGLang.g:1599:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1599:2: ( ruleCollection )
                    // InternalMGLang.g:1600:3: ruleCollection
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
                    // InternalMGLang.g:1605:2: ( ruleNode )
                    {
                    // InternalMGLang.g:1605:2: ( ruleNode )
                    // InternalMGLang.g:1606:3: ruleNode
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
                    // InternalMGLang.g:1611:2: ( ruleParamManipulation )
                    {
                    // InternalMGLang.g:1611:2: ( ruleParamManipulation )
                    // InternalMGLang.g:1612:3: ruleParamManipulation
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
                    // InternalMGLang.g:1617:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1617:2: ( ruleSwitch )
                    // InternalMGLang.g:1618:3: ruleSwitch
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


    // $ANTLR start "rule__Node__Alternatives_2"
    // InternalMGLang.g:1627:1: rule__Node__Alternatives_2 : ( ( ( rule__Node__CreatedByAssignment_2_0 ) ) | ( ( rule__Node__Group_2_1__0 ) ) );
    public final void rule__Node__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1631:1: ( ( ( rule__Node__CreatedByAssignment_2_0 ) ) | ( ( rule__Node__Group_2_1__0 ) ) )
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
                    // InternalMGLang.g:1632:2: ( ( rule__Node__CreatedByAssignment_2_0 ) )
                    {
                    // InternalMGLang.g:1632:2: ( ( rule__Node__CreatedByAssignment_2_0 ) )
                    // InternalMGLang.g:1633:3: ( rule__Node__CreatedByAssignment_2_0 )
                    {
                     before(grammarAccess.getNodeAccess().getCreatedByAssignment_2_0()); 
                    // InternalMGLang.g:1634:3: ( rule__Node__CreatedByAssignment_2_0 )
                    // InternalMGLang.g:1634:4: rule__Node__CreatedByAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__CreatedByAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getCreatedByAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1638:2: ( ( rule__Node__Group_2_1__0 ) )
                    {
                    // InternalMGLang.g:1638:2: ( ( rule__Node__Group_2_1__0 ) )
                    // InternalMGLang.g:1639:3: ( rule__Node__Group_2_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_2_1()); 
                    // InternalMGLang.g:1640:3: ( rule__Node__Group_2_1__0 )
                    // InternalMGLang.g:1640:4: rule__Node__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_2_1()); 

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
    // InternalMGLang.g:1648:1: rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives : ( ( rulePatternNodeReference ) | ( ruleAssignment ) | ( ruleSwitch ) );
    public final void rule__NodeReferenceOrAssignmentOrControlFlow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1652:1: ( ( rulePatternNodeReference ) | ( ruleAssignment ) | ( ruleSwitch ) )
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
            else if ( (LA4_0==53) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGLang.g:1653:2: ( rulePatternNodeReference )
                    {
                    // InternalMGLang.g:1653:2: ( rulePatternNodeReference )
                    // InternalMGLang.g:1654:3: rulePatternNodeReference
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
                    // InternalMGLang.g:1659:2: ( ruleAssignment )
                    {
                    // InternalMGLang.g:1659:2: ( ruleAssignment )
                    // InternalMGLang.g:1660:3: ruleAssignment
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
                    // InternalMGLang.g:1665:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1665:2: ( ruleSwitch )
                    // InternalMGLang.g:1666:3: ruleSwitch
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
    // InternalMGLang.g:1675:1: rule__Parameter__Alternatives : ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1679:1: ( ( rulePrimitiveParameter ) | ( ruleParameterNode ) )
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
                    // InternalMGLang.g:1680:2: ( rulePrimitiveParameter )
                    {
                    // InternalMGLang.g:1680:2: ( rulePrimitiveParameter )
                    // InternalMGLang.g:1681:3: rulePrimitiveParameter
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
                    // InternalMGLang.g:1686:2: ( ruleParameterNode )
                    {
                    // InternalMGLang.g:1686:2: ( ruleParameterNode )
                    // InternalMGLang.g:1687:3: ruleParameterNode
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
    // InternalMGLang.g:1696:1: rule__GeneratorExpression__Alternatives : ( ( ruleForStatement ) | ( ruleSwitch ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) );
    public final void rule__GeneratorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1700:1: ( ( ruleForStatement ) | ( ruleSwitch ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt6=1;
                }
                break;
            case 53:
                {
                alt6=2;
                }
                break;
            case 58:
            case 61:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==RULE_ID) ) {
                    alt6=5;
                }
                else if ( (LA6_4==40) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:1701:2: ( ruleForStatement )
                    {
                    // InternalMGLang.g:1701:2: ( ruleForStatement )
                    // InternalMGLang.g:1702:3: ruleForStatement
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
                    // InternalMGLang.g:1707:2: ( ruleSwitch )
                    {
                    // InternalMGLang.g:1707:2: ( ruleSwitch )
                    // InternalMGLang.g:1708:3: ruleSwitch
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
                    // InternalMGLang.g:1713:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1713:2: ( ruleCollection )
                    // InternalMGLang.g:1714:3: ruleCollection
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
                    // InternalMGLang.g:1719:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1719:2: ( rulePatternCall )
                    // InternalMGLang.g:1720:3: rulePatternCall
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
                    // InternalMGLang.g:1725:2: ( rulePatternVariable )
                    {
                    // InternalMGLang.g:1725:2: ( rulePatternVariable )
                    // InternalMGLang.g:1726:3: rulePatternVariable
                    {
                     before(grammarAccess.getGeneratorExpressionAccess().getPatternVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePatternVariable();

                    state._fsp--;

                     after(grammarAccess.getGeneratorExpressionAccess().getPatternVariableParserRuleCall_4()); 

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
    // InternalMGLang.g:1735:1: rule__ForHead__Alternatives : ( ( ruleGeneralForHead ) | ( ruleForEachHead ) );
    public final void rule__ForHead__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1739:1: ( ( ruleGeneralForHead ) | ( ruleForEachHead ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==52) ) {
                    alt7=1;
                }
                else if ( (LA7_1==30||LA7_1==48) ) {
                    alt7=2;
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
                    // InternalMGLang.g:1740:2: ( ruleGeneralForHead )
                    {
                    // InternalMGLang.g:1740:2: ( ruleGeneralForHead )
                    // InternalMGLang.g:1741:3: ruleGeneralForHead
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
                    // InternalMGLang.g:1746:2: ( ruleForEachHead )
                    {
                    // InternalMGLang.g:1746:2: ( ruleForEachHead )
                    // InternalMGLang.g:1747:3: ruleForEachHead
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
    // InternalMGLang.g:1756:1: rule__SwitchExpression__Alternatives : ( ( ruleForStatement ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) | ( ruleNodeReferenceOrAssignmentOrControlFlow ) );
    public final void rule__SwitchExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1760:1: ( ( ruleForStatement ) | ( ruleCollection ) | ( rulePatternCall ) | ( rulePatternVariable ) | ( ruleNodeReferenceOrAssignmentOrControlFlow ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt8=1;
                }
                break;
            case 58:
            case 61:
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
            case 53:
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
                    // InternalMGLang.g:1761:2: ( ruleForStatement )
                    {
                    // InternalMGLang.g:1761:2: ( ruleForStatement )
                    // InternalMGLang.g:1762:3: ruleForStatement
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
                    // InternalMGLang.g:1767:2: ( ruleCollection )
                    {
                    // InternalMGLang.g:1767:2: ( ruleCollection )
                    // InternalMGLang.g:1768:3: ruleCollection
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
                    // InternalMGLang.g:1773:2: ( rulePatternCall )
                    {
                    // InternalMGLang.g:1773:2: ( rulePatternCall )
                    // InternalMGLang.g:1774:3: rulePatternCall
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
                    // InternalMGLang.g:1779:2: ( rulePatternVariable )
                    {
                    // InternalMGLang.g:1779:2: ( rulePatternVariable )
                    // InternalMGLang.g:1780:3: rulePatternVariable
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
                    // InternalMGLang.g:1785:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
                    {
                    // InternalMGLang.g:1785:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
                    // InternalMGLang.g:1786:3: ruleNodeReferenceOrAssignmentOrControlFlow
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
    // InternalMGLang.g:1795:1: rule__Switch__Alternatives : ( ( ruleIfElseSwitch ) | ( ruleSwitchCase ) );
    public final void rule__Switch__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1799:1: ( ( ruleIfElseSwitch ) | ( ruleSwitchCase ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==53) ) {
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
                    // InternalMGLang.g:1800:2: ( ruleIfElseSwitch )
                    {
                    // InternalMGLang.g:1800:2: ( ruleIfElseSwitch )
                    // InternalMGLang.g:1801:3: ruleIfElseSwitch
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
                    // InternalMGLang.g:1806:2: ( ruleSwitchCase )
                    {
                    // InternalMGLang.g:1806:2: ( ruleSwitchCase )
                    // InternalMGLang.g:1807:3: ruleSwitchCase
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
    // InternalMGLang.g:1816:1: rule__Case__Alternatives : ( ( ruleCaseWithCast ) | ( ruleCaseWithoutCast ) );
    public final void rule__Case__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1820:1: ( ( ruleCaseWithCast ) | ( ruleCaseWithoutCast ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==54) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=RULE_TRUE && LA10_1<=RULE_FALSE)||LA10_1==RULE_STRING||LA10_1==RULE_DOUBLE||(LA10_1>=17 && LA10_1<=18)||LA10_1==40||LA10_1==62) ) {
                    alt10=2;
                }
                else if ( (LA10_1==RULE_ID) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==RULE_ID) ) {
                        alt10=1;
                    }
                    else if ( ((LA10_3>=23 && LA10_3<=36)||LA10_3==48||LA10_3==55) ) {
                        alt10=2;
                    }
                    else {
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
                    // InternalMGLang.g:1821:2: ( ruleCaseWithCast )
                    {
                    // InternalMGLang.g:1821:2: ( ruleCaseWithCast )
                    // InternalMGLang.g:1822:3: ruleCaseWithCast
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
                    // InternalMGLang.g:1827:2: ( ruleCaseWithoutCast )
                    {
                    // InternalMGLang.g:1827:2: ( ruleCaseWithoutCast )
                    // InternalMGLang.g:1828:3: ruleCaseWithoutCast
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
    // InternalMGLang.g:1837:1: rule__CaseBody__Alternatives : ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__Group_1__0 ) ) );
    public final void rule__CaseBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1841:1: ( ( ( rule__CaseBody__Group_0__0 ) ) | ( ( rule__CaseBody__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||LA11_0==51||LA11_0==53||LA11_0==58||LA11_0==61) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMGLang.g:1842:2: ( ( rule__CaseBody__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1842:2: ( ( rule__CaseBody__Group_0__0 ) )
                    // InternalMGLang.g:1843:3: ( rule__CaseBody__Group_0__0 )
                    {
                     before(grammarAccess.getCaseBodyAccess().getGroup_0()); 
                    // InternalMGLang.g:1844:3: ( rule__CaseBody__Group_0__0 )
                    // InternalMGLang.g:1844:4: rule__CaseBody__Group_0__0
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
                    // InternalMGLang.g:1848:2: ( ( rule__CaseBody__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1848:2: ( ( rule__CaseBody__Group_1__0 ) )
                    // InternalMGLang.g:1849:3: ( rule__CaseBody__Group_1__0 )
                    {
                     before(grammarAccess.getCaseBodyAccess().getGroup_1()); 
                    // InternalMGLang.g:1850:3: ( rule__CaseBody__Group_1__0 )
                    // InternalMGLang.g:1850:4: rule__CaseBody__Group_1__0
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
    // InternalMGLang.g:1858:1: rule__Collection__Alternatives : ( ( ruleList ) | ( ruleMap ) );
    public final void rule__Collection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1862:1: ( ( ruleList ) | ( ruleMap ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==58) ) {
                alt12=1;
            }
            else if ( (LA12_0==61) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGLang.g:1863:2: ( ruleList )
                    {
                    // InternalMGLang.g:1863:2: ( ruleList )
                    // InternalMGLang.g:1864:3: ruleList
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
                    // InternalMGLang.g:1869:2: ( ruleMap )
                    {
                    // InternalMGLang.g:1869:2: ( ruleMap )
                    // InternalMGLang.g:1870:3: ruleMap
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
    // InternalMGLang.g:1879:1: rule__ListAssignment__Alternatives : ( ( ruleListAdHoc ) | ( ruleRefOrCall ) );
    public final void rule__ListAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1883:1: ( ( ruleListAdHoc ) | ( ruleRefOrCall ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==59) ) {
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
                    // InternalMGLang.g:1884:2: ( ruleListAdHoc )
                    {
                    // InternalMGLang.g:1884:2: ( ruleListAdHoc )
                    // InternalMGLang.g:1885:3: ruleListAdHoc
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
                    // InternalMGLang.g:1890:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1890:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1891:3: ruleRefOrCall
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
    // InternalMGLang.g:1900:1: rule__MapAssignment__Alternatives : ( ( ruleMapAdHoc ) | ( ruleRefOrCall ) );
    public final void rule__MapAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1904:1: ( ( ruleMapAdHoc ) | ( ruleRefOrCall ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==59) ) {
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
                    // InternalMGLang.g:1905:2: ( ruleMapAdHoc )
                    {
                    // InternalMGLang.g:1905:2: ( ruleMapAdHoc )
                    // InternalMGLang.g:1906:3: ruleMapAdHoc
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
                    // InternalMGLang.g:1911:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1911:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1912:3: ruleRefOrCall
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
    // InternalMGLang.g:1921:1: rule__BaseExpr__Alternatives : ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ruleLiteral ) | ( ruleRefOrCall ) );
    public final void rule__BaseExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1925:1: ( ( ( rule__BaseExpr__Group_0__0 ) ) | ( ( rule__BaseExpr__Group_1__0 ) ) | ( ( rule__BaseExpr__Group_2__0 ) ) | ( ruleLiteral ) | ( ruleRefOrCall ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt15=1;
                }
                break;
            case 62:
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
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMGLang.g:1926:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    {
                    // InternalMGLang.g:1926:2: ( ( rule__BaseExpr__Group_0__0 ) )
                    // InternalMGLang.g:1927:3: ( rule__BaseExpr__Group_0__0 )
                    {
                     before(grammarAccess.getBaseExprAccess().getGroup_0()); 
                    // InternalMGLang.g:1928:3: ( rule__BaseExpr__Group_0__0 )
                    // InternalMGLang.g:1928:4: rule__BaseExpr__Group_0__0
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
                    // InternalMGLang.g:1932:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    {
                    // InternalMGLang.g:1932:2: ( ( rule__BaseExpr__Group_1__0 ) )
                    // InternalMGLang.g:1933:3: ( rule__BaseExpr__Group_1__0 )
                    {
                     before(grammarAccess.getBaseExprAccess().getGroup_1()); 
                    // InternalMGLang.g:1934:3: ( rule__BaseExpr__Group_1__0 )
                    // InternalMGLang.g:1934:4: rule__BaseExpr__Group_1__0
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
                    // InternalMGLang.g:1938:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    {
                    // InternalMGLang.g:1938:2: ( ( rule__BaseExpr__Group_2__0 ) )
                    // InternalMGLang.g:1939:3: ( rule__BaseExpr__Group_2__0 )
                    {
                     before(grammarAccess.getBaseExprAccess().getGroup_2()); 
                    // InternalMGLang.g:1940:3: ( rule__BaseExpr__Group_2__0 )
                    // InternalMGLang.g:1940:4: rule__BaseExpr__Group_2__0
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
                    // InternalMGLang.g:1944:2: ( ruleLiteral )
                    {
                    // InternalMGLang.g:1944:2: ( ruleLiteral )
                    // InternalMGLang.g:1945:3: ruleLiteral
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
                    // InternalMGLang.g:1950:2: ( ruleRefOrCall )
                    {
                    // InternalMGLang.g:1950:2: ( ruleRefOrCall )
                    // InternalMGLang.g:1951:3: ruleRefOrCall
                    {
                     before(grammarAccess.getBaseExprAccess().getRefOrCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRefOrCall();

                    state._fsp--;

                     after(grammarAccess.getBaseExprAccess().getRefOrCallParserRuleCall_4()); 

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
    // InternalMGLang.g:1960:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1964:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) )
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
                    // InternalMGLang.g:1965:2: ( ruleBooleanLiteral )
                    {
                    // InternalMGLang.g:1965:2: ( ruleBooleanLiteral )
                    // InternalMGLang.g:1966:3: ruleBooleanLiteral
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
                    // InternalMGLang.g:1971:2: ( ruleStringLiteral )
                    {
                    // InternalMGLang.g:1971:2: ( ruleStringLiteral )
                    // InternalMGLang.g:1972:3: ruleStringLiteral
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
                    // InternalMGLang.g:1977:2: ( ruleNumberLiteral )
                    {
                    // InternalMGLang.g:1977:2: ( ruleNumberLiteral )
                    // InternalMGLang.g:1978:3: ruleNumberLiteral
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
    // InternalMGLang.g:1987:1: rule__BooleanLiteral__ValAlternatives_0 : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
    public final void rule__BooleanLiteral__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:1991:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
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
                    // InternalMGLang.g:1992:2: ( RULE_TRUE )
                    {
                    // InternalMGLang.g:1992:2: ( RULE_TRUE )
                    // InternalMGLang.g:1993:3: RULE_TRUE
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValTRUETerminalRuleCall_0_0()); 
                    match(input,RULE_TRUE,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValTRUETerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:1998:2: ( RULE_FALSE )
                    {
                    // InternalMGLang.g:1998:2: ( RULE_FALSE )
                    // InternalMGLang.g:1999:3: RULE_FALSE
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
    // InternalMGLang.g:2008:1: rule__MathFunc__Alternatives : ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) );
    public final void rule__MathFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2012:1: ( ( ( 'sqrt' ) ) | ( ( 'abs' ) ) )
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
                    // InternalMGLang.g:2013:2: ( ( 'sqrt' ) )
                    {
                    // InternalMGLang.g:2013:2: ( ( 'sqrt' ) )
                    // InternalMGLang.g:2014:3: ( 'sqrt' )
                    {
                     before(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2015:3: ( 'sqrt' )
                    // InternalMGLang.g:2015:4: 'sqrt'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathFuncAccess().getSQRTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2019:2: ( ( 'abs' ) )
                    {
                    // InternalMGLang.g:2019:2: ( ( 'abs' ) )
                    // InternalMGLang.g:2020:3: ( 'abs' )
                    {
                     before(grammarAccess.getMathFuncAccess().getABSEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2021:3: ( 'abs' )
                    // InternalMGLang.g:2021:4: 'abs'
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
    // InternalMGLang.g:2029:1: rule__PrimitiveType__Alternatives : ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2033:1: ( ( ( 'int' ) ) | ( ( 'char' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
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
                    // InternalMGLang.g:2034:2: ( ( 'int' ) )
                    {
                    // InternalMGLang.g:2034:2: ( ( 'int' ) )
                    // InternalMGLang.g:2035:3: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2036:3: ( 'int' )
                    // InternalMGLang.g:2036:4: 'int'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2040:2: ( ( 'char' ) )
                    {
                    // InternalMGLang.g:2040:2: ( ( 'char' ) )
                    // InternalMGLang.g:2041:3: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2042:3: ( 'char' )
                    // InternalMGLang.g:2042:4: 'char'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2046:2: ( ( 'double' ) )
                    {
                    // InternalMGLang.g:2046:2: ( ( 'double' ) )
                    // InternalMGLang.g:2047:3: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:2048:3: ( 'double' )
                    // InternalMGLang.g:2048:4: 'double'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:2052:2: ( ( 'String' ) )
                    {
                    // InternalMGLang.g:2052:2: ( ( 'String' ) )
                    // InternalMGLang.g:2053:3: ( 'String' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalMGLang.g:2054:3: ( 'String' )
                    // InternalMGLang.g:2054:4: 'String'
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
    // InternalMGLang.g:2062:1: rule__RelationalOp__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2066:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
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
                    // InternalMGLang.g:2067:2: ( ( '>' ) )
                    {
                    // InternalMGLang.g:2067:2: ( ( '>' ) )
                    // InternalMGLang.g:2068:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2069:3: ( '>' )
                    // InternalMGLang.g:2069:4: '>'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2073:2: ( ( '>=' ) )
                    {
                    // InternalMGLang.g:2073:2: ( ( '>=' ) )
                    // InternalMGLang.g:2074:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2075:3: ( '>=' )
                    // InternalMGLang.g:2075:4: '>='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2079:2: ( ( '==' ) )
                    {
                    // InternalMGLang.g:2079:2: ( ( '==' ) )
                    // InternalMGLang.g:2080:3: ( '==' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:2081:3: ( '==' )
                    // InternalMGLang.g:2081:4: '=='
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMGLang.g:2085:2: ( ( '!=' ) )
                    {
                    // InternalMGLang.g:2085:2: ( ( '!=' ) )
                    // InternalMGLang.g:2086:3: ( '!=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 
                    // InternalMGLang.g:2087:3: ( '!=' )
                    // InternalMGLang.g:2087:4: '!='
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getUNEQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMGLang.g:2091:2: ( ( '<=' ) )
                    {
                    // InternalMGLang.g:2091:2: ( ( '<=' ) )
                    // InternalMGLang.g:2092:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    // InternalMGLang.g:2093:3: ( '<=' )
                    // InternalMGLang.g:2093:4: '<='
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMGLang.g:2097:2: ( ( '<' ) )
                    {
                    // InternalMGLang.g:2097:2: ( ( '<' ) )
                    // InternalMGLang.g:2098:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOpAccess().getLESSEnumLiteralDeclaration_5()); 
                    // InternalMGLang.g:2099:3: ( '<' )
                    // InternalMGLang.g:2099:4: '<'
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
    // InternalMGLang.g:2107:1: rule__TertiaryOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) );
    public final void rule__TertiaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2111:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '||' ) ) )
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
                    // InternalMGLang.g:2112:2: ( ( '+' ) )
                    {
                    // InternalMGLang.g:2112:2: ( ( '+' ) )
                    // InternalMGLang.g:2113:3: ( '+' )
                    {
                     before(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2114:3: ( '+' )
                    // InternalMGLang.g:2114:4: '+'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTertiaryOpAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2118:2: ( ( '-' ) )
                    {
                    // InternalMGLang.g:2118:2: ( ( '-' ) )
                    // InternalMGLang.g:2119:3: ( '-' )
                    {
                     before(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2120:3: ( '-' )
                    // InternalMGLang.g:2120:4: '-'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTertiaryOpAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2124:2: ( ( '||' ) )
                    {
                    // InternalMGLang.g:2124:2: ( ( '||' ) )
                    // InternalMGLang.g:2125:3: ( '||' )
                    {
                     before(grammarAccess.getTertiaryOpAccess().getOREnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:2126:3: ( '||' )
                    // InternalMGLang.g:2126:4: '||'
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
    // InternalMGLang.g:2134:1: rule__SecondaryOp__Alternatives : ( ( ( '%' ) ) | ( ( '^' ) ) );
    public final void rule__SecondaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2138:1: ( ( ( '%' ) ) | ( ( '^' ) ) )
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
                    // InternalMGLang.g:2139:2: ( ( '%' ) )
                    {
                    // InternalMGLang.g:2139:2: ( ( '%' ) )
                    // InternalMGLang.g:2140:3: ( '%' )
                    {
                     before(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2141:3: ( '%' )
                    // InternalMGLang.g:2141:4: '%'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getSecondaryOpAccess().getMODEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2145:2: ( ( '^' ) )
                    {
                    // InternalMGLang.g:2145:2: ( ( '^' ) )
                    // InternalMGLang.g:2146:3: ( '^' )
                    {
                     before(grammarAccess.getSecondaryOpAccess().getXOREnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2147:3: ( '^' )
                    // InternalMGLang.g:2147:4: '^'
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
    // InternalMGLang.g:2155:1: rule__PrimaryOp__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) );
    public final void rule__PrimaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2159:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '&&' ) ) )
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
                    // InternalMGLang.g:2160:2: ( ( '*' ) )
                    {
                    // InternalMGLang.g:2160:2: ( ( '*' ) )
                    // InternalMGLang.g:2161:3: ( '*' )
                    {
                     before(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 
                    // InternalMGLang.g:2162:3: ( '*' )
                    // InternalMGLang.g:2162:4: '*'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimaryOpAccess().getMULEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMGLang.g:2166:2: ( ( '/' ) )
                    {
                    // InternalMGLang.g:2166:2: ( ( '/' ) )
                    // InternalMGLang.g:2167:3: ( '/' )
                    {
                     before(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 
                    // InternalMGLang.g:2168:3: ( '/' )
                    // InternalMGLang.g:2168:4: '/'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimaryOpAccess().getDIVEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMGLang.g:2172:2: ( ( '&&' ) )
                    {
                    // InternalMGLang.g:2172:2: ( ( '&&' ) )
                    // InternalMGLang.g:2173:3: ( '&&' )
                    {
                     before(grammarAccess.getPrimaryOpAccess().getANDEnumLiteralDeclaration_2()); 
                    // InternalMGLang.g:2174:3: ( '&&' )
                    // InternalMGLang.g:2174:4: '&&'
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
    // InternalMGLang.g:2182:1: rule__MofgenFile__Group__0 : rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 ;
    public final void rule__MofgenFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2186:1: ( rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1 )
            // InternalMGLang.g:2187:2: rule__MofgenFile__Group__0__Impl rule__MofgenFile__Group__1
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
    // InternalMGLang.g:2194:1: rule__MofgenFile__Group__0__Impl : ( ( rule__MofgenFile__ImportsAssignment_0 )* ) ;
    public final void rule__MofgenFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2198:1: ( ( ( rule__MofgenFile__ImportsAssignment_0 )* ) )
            // InternalMGLang.g:2199:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            {
            // InternalMGLang.g:2199:1: ( ( rule__MofgenFile__ImportsAssignment_0 )* )
            // InternalMGLang.g:2200:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMofgenFileAccess().getImportsAssignment_0()); 
            // InternalMGLang.g:2201:2: ( rule__MofgenFile__ImportsAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGLang.g:2201:3: rule__MofgenFile__ImportsAssignment_0
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
    // InternalMGLang.g:2209:1: rule__MofgenFile__Group__1 : rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2 ;
    public final void rule__MofgenFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2213:1: ( rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2 )
            // InternalMGLang.g:2214:2: rule__MofgenFile__Group__1__Impl rule__MofgenFile__Group__2
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
    // InternalMGLang.g:2221:1: rule__MofgenFile__Group__1__Impl : ( ( rule__MofgenFile__ConfigAssignment_1 ) ) ;
    public final void rule__MofgenFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2225:1: ( ( ( rule__MofgenFile__ConfigAssignment_1 ) ) )
            // InternalMGLang.g:2226:1: ( ( rule__MofgenFile__ConfigAssignment_1 ) )
            {
            // InternalMGLang.g:2226:1: ( ( rule__MofgenFile__ConfigAssignment_1 ) )
            // InternalMGLang.g:2227:2: ( rule__MofgenFile__ConfigAssignment_1 )
            {
             before(grammarAccess.getMofgenFileAccess().getConfigAssignment_1()); 
            // InternalMGLang.g:2228:2: ( rule__MofgenFile__ConfigAssignment_1 )
            // InternalMGLang.g:2228:3: rule__MofgenFile__ConfigAssignment_1
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
    // InternalMGLang.g:2236:1: rule__MofgenFile__Group__2 : rule__MofgenFile__Group__2__Impl ;
    public final void rule__MofgenFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2240:1: ( rule__MofgenFile__Group__2__Impl )
            // InternalMGLang.g:2241:2: rule__MofgenFile__Group__2__Impl
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
    // InternalMGLang.g:2247:1: rule__MofgenFile__Group__2__Impl : ( ( rule__MofgenFile__CommandsAssignment_2 )* ) ;
    public final void rule__MofgenFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2251:1: ( ( ( rule__MofgenFile__CommandsAssignment_2 )* ) )
            // InternalMGLang.g:2252:1: ( ( rule__MofgenFile__CommandsAssignment_2 )* )
            {
            // InternalMGLang.g:2252:1: ( ( rule__MofgenFile__CommandsAssignment_2 )* )
            // InternalMGLang.g:2253:2: ( rule__MofgenFile__CommandsAssignment_2 )*
            {
             before(grammarAccess.getMofgenFileAccess().getCommandsAssignment_2()); 
            // InternalMGLang.g:2254:2: ( rule__MofgenFile__CommandsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44||LA25_0==50) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMGLang.g:2254:3: rule__MofgenFile__CommandsAssignment_2
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
    // InternalMGLang.g:2263:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2267:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMGLang.g:2268:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMGLang.g:2275:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2279:1: ( ( 'import' ) )
            // InternalMGLang.g:2280:1: ( 'import' )
            {
            // InternalMGLang.g:2280:1: ( 'import' )
            // InternalMGLang.g:2281:2: 'import'
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
    // InternalMGLang.g:2290:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2294:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMGLang.g:2295:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalMGLang.g:2302:1: rule__Import__Group__1__Impl : ( ( rule__Import__UriAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2306:1: ( ( ( rule__Import__UriAssignment_1 ) ) )
            // InternalMGLang.g:2307:1: ( ( rule__Import__UriAssignment_1 ) )
            {
            // InternalMGLang.g:2307:1: ( ( rule__Import__UriAssignment_1 ) )
            // InternalMGLang.g:2308:2: ( rule__Import__UriAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getUriAssignment_1()); 
            // InternalMGLang.g:2309:2: ( rule__Import__UriAssignment_1 )
            // InternalMGLang.g:2309:3: rule__Import__UriAssignment_1
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
    // InternalMGLang.g:2317:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2321:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMGLang.g:2322:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalMGLang.g:2329:1: rule__Import__Group__2__Impl : ( 'as' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2333:1: ( ( 'as' ) )
            // InternalMGLang.g:2334:1: ( 'as' )
            {
            // InternalMGLang.g:2334:1: ( 'as' )
            // InternalMGLang.g:2335:2: 'as'
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
    // InternalMGLang.g:2344:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2348:1: ( rule__Import__Group__3__Impl )
            // InternalMGLang.g:2349:2: rule__Import__Group__3__Impl
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
    // InternalMGLang.g:2355:1: rule__Import__Group__3__Impl : ( ( rule__Import__NameAssignment_3 ) ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2359:1: ( ( ( rule__Import__NameAssignment_3 ) ) )
            // InternalMGLang.g:2360:1: ( ( rule__Import__NameAssignment_3 ) )
            {
            // InternalMGLang.g:2360:1: ( ( rule__Import__NameAssignment_3 ) )
            // InternalMGLang.g:2361:2: ( rule__Import__NameAssignment_3 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_3()); 
            // InternalMGLang.g:2362:2: ( rule__Import__NameAssignment_3 )
            // InternalMGLang.g:2362:3: rule__Import__NameAssignment_3
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
    // InternalMGLang.g:2371:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2375:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // InternalMGLang.g:2376:2: rule__Config__Group__0__Impl rule__Config__Group__1
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
    // InternalMGLang.g:2383:1: rule__Config__Group__0__Impl : ( () ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2387:1: ( ( () ) )
            // InternalMGLang.g:2388:1: ( () )
            {
            // InternalMGLang.g:2388:1: ( () )
            // InternalMGLang.g:2389:2: ()
            {
             before(grammarAccess.getConfigAccess().getConfigAction_0()); 
            // InternalMGLang.g:2390:2: ()
            // InternalMGLang.g:2390:3: 
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
    // InternalMGLang.g:2398:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2402:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // InternalMGLang.g:2403:2: rule__Config__Group__1__Impl rule__Config__Group__2
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
    // InternalMGLang.g:2410:1: rule__Config__Group__1__Impl : ( 'config' ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2414:1: ( ( 'config' ) )
            // InternalMGLang.g:2415:1: ( 'config' )
            {
            // InternalMGLang.g:2415:1: ( 'config' )
            // InternalMGLang.g:2416:2: 'config'
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
    // InternalMGLang.g:2425:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2429:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // InternalMGLang.g:2430:2: rule__Config__Group__2__Impl rule__Config__Group__3
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
    // InternalMGLang.g:2437:1: rule__Config__Group__2__Impl : ( '(' ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2441:1: ( ( '(' ) )
            // InternalMGLang.g:2442:1: ( '(' )
            {
            // InternalMGLang.g:2442:1: ( '(' )
            // InternalMGLang.g:2443:2: '('
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
    // InternalMGLang.g:2452:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2456:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // InternalMGLang.g:2457:2: rule__Config__Group__3__Impl rule__Config__Group__4
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
    // InternalMGLang.g:2464:1: rule__Config__Group__3__Impl : ( ')' ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2468:1: ( ( ')' ) )
            // InternalMGLang.g:2469:1: ( ')' )
            {
            // InternalMGLang.g:2469:1: ( ')' )
            // InternalMGLang.g:2470:2: ')'
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
    // InternalMGLang.g:2479:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2483:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // InternalMGLang.g:2484:2: rule__Config__Group__4__Impl rule__Config__Group__5
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
    // InternalMGLang.g:2491:1: rule__Config__Group__4__Impl : ( '{' ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2495:1: ( ( '{' ) )
            // InternalMGLang.g:2496:1: ( '{' )
            {
            // InternalMGLang.g:2496:1: ( '{' )
            // InternalMGLang.g:2497:2: '{'
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
    // InternalMGLang.g:2506:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2510:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // InternalMGLang.g:2511:2: rule__Config__Group__5__Impl rule__Config__Group__6
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
    // InternalMGLang.g:2518:1: rule__Config__Group__5__Impl : ( ( rule__Config__ExpressionsAssignment_5 )* ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2522:1: ( ( ( rule__Config__ExpressionsAssignment_5 )* ) )
            // InternalMGLang.g:2523:1: ( ( rule__Config__ExpressionsAssignment_5 )* )
            {
            // InternalMGLang.g:2523:1: ( ( rule__Config__ExpressionsAssignment_5 )* )
            // InternalMGLang.g:2524:2: ( rule__Config__ExpressionsAssignment_5 )*
            {
             before(grammarAccess.getConfigAccess().getExpressionsAssignment_5()); 
            // InternalMGLang.g:2525:2: ( rule__Config__ExpressionsAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMGLang.g:2525:3: rule__Config__ExpressionsAssignment_5
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
    // InternalMGLang.g:2533:1: rule__Config__Group__6 : rule__Config__Group__6__Impl ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2537:1: ( rule__Config__Group__6__Impl )
            // InternalMGLang.g:2538:2: rule__Config__Group__6__Impl
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
    // InternalMGLang.g:2544:1: rule__Config__Group__6__Impl : ( '}' ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2548:1: ( ( '}' ) )
            // InternalMGLang.g:2549:1: ( '}' )
            {
            // InternalMGLang.g:2549:1: ( '}' )
            // InternalMGLang.g:2550:2: '}'
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
    // InternalMGLang.g:2560:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2564:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalMGLang.g:2565:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // InternalMGLang.g:2572:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2576:1: ( ( 'pattern' ) )
            // InternalMGLang.g:2577:1: ( 'pattern' )
            {
            // InternalMGLang.g:2577:1: ( 'pattern' )
            // InternalMGLang.g:2578:2: 'pattern'
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
    // InternalMGLang.g:2587:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2591:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalMGLang.g:2592:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // InternalMGLang.g:2599:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2603:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalMGLang.g:2604:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalMGLang.g:2604:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalMGLang.g:2605:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalMGLang.g:2606:2: ( rule__Pattern__NameAssignment_1 )
            // InternalMGLang.g:2606:3: rule__Pattern__NameAssignment_1
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
    // InternalMGLang.g:2614:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2618:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalMGLang.g:2619:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // InternalMGLang.g:2626:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2630:1: ( ( ( rule__Pattern__Group_2__0 ) ) )
            // InternalMGLang.g:2631:1: ( ( rule__Pattern__Group_2__0 ) )
            {
            // InternalMGLang.g:2631:1: ( ( rule__Pattern__Group_2__0 ) )
            // InternalMGLang.g:2632:2: ( rule__Pattern__Group_2__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup_2()); 
            // InternalMGLang.g:2633:2: ( rule__Pattern__Group_2__0 )
            // InternalMGLang.g:2633:3: rule__Pattern__Group_2__0
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
    // InternalMGLang.g:2641:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2645:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalMGLang.g:2646:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
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
    // InternalMGLang.g:2653:1: rule__Pattern__Group__3__Impl : ( '{' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2657:1: ( ( '{' ) )
            // InternalMGLang.g:2658:1: ( '{' )
            {
            // InternalMGLang.g:2658:1: ( '{' )
            // InternalMGLang.g:2659:2: '{'
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
    // InternalMGLang.g:2668:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2672:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalMGLang.g:2673:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalMGLang.g:2680:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__CommandsAssignment_4 )* ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2684:1: ( ( ( rule__Pattern__CommandsAssignment_4 )* ) )
            // InternalMGLang.g:2685:1: ( ( rule__Pattern__CommandsAssignment_4 )* )
            {
            // InternalMGLang.g:2685:1: ( ( rule__Pattern__CommandsAssignment_4 )* )
            // InternalMGLang.g:2686:2: ( rule__Pattern__CommandsAssignment_4 )*
            {
             before(grammarAccess.getPatternAccess().getCommandsAssignment_4()); 
            // InternalMGLang.g:2687:2: ( rule__Pattern__CommandsAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==53||LA27_0==58||LA27_0==61) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMGLang.g:2687:3: rule__Pattern__CommandsAssignment_4
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
    // InternalMGLang.g:2695:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2699:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalMGLang.g:2700:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
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
    // InternalMGLang.g:2707:1: rule__Pattern__Group__5__Impl : ( '}' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2711:1: ( ( '}' ) )
            // InternalMGLang.g:2712:1: ( '}' )
            {
            // InternalMGLang.g:2712:1: ( '}' )
            // InternalMGLang.g:2713:2: '}'
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
    // InternalMGLang.g:2722:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2726:1: ( rule__Pattern__Group__6__Impl )
            // InternalMGLang.g:2727:2: rule__Pattern__Group__6__Impl
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
    // InternalMGLang.g:2733:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__ReturnAssignment_6 )? ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2737:1: ( ( ( rule__Pattern__ReturnAssignment_6 )? ) )
            // InternalMGLang.g:2738:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            {
            // InternalMGLang.g:2738:1: ( ( rule__Pattern__ReturnAssignment_6 )? )
            // InternalMGLang.g:2739:2: ( rule__Pattern__ReturnAssignment_6 )?
            {
             before(grammarAccess.getPatternAccess().getReturnAssignment_6()); 
            // InternalMGLang.g:2740:2: ( rule__Pattern__ReturnAssignment_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMGLang.g:2740:3: rule__Pattern__ReturnAssignment_6
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
    // InternalMGLang.g:2749:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2753:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMGLang.g:2754:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // InternalMGLang.g:2761:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2765:1: ( ( '(' ) )
            // InternalMGLang.g:2766:1: ( '(' )
            {
            // InternalMGLang.g:2766:1: ( '(' )
            // InternalMGLang.g:2767:2: '('
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
    // InternalMGLang.g:2776:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2780:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMGLang.g:2781:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
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
    // InternalMGLang.g:2788:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__Group_2_1__0 )? ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2792:1: ( ( ( rule__Pattern__Group_2_1__0 )? ) )
            // InternalMGLang.g:2793:1: ( ( rule__Pattern__Group_2_1__0 )? )
            {
            // InternalMGLang.g:2793:1: ( ( rule__Pattern__Group_2_1__0 )? )
            // InternalMGLang.g:2794:2: ( rule__Pattern__Group_2_1__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1()); 
            // InternalMGLang.g:2795:2: ( rule__Pattern__Group_2_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=19 && LA29_0<=22)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMGLang.g:2795:3: rule__Pattern__Group_2_1__0
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
    // InternalMGLang.g:2803:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2807:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMGLang.g:2808:2: rule__Pattern__Group_2__2__Impl
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
    // InternalMGLang.g:2814:1: rule__Pattern__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2818:1: ( ( ')' ) )
            // InternalMGLang.g:2819:1: ( ')' )
            {
            // InternalMGLang.g:2819:1: ( ')' )
            // InternalMGLang.g:2820:2: ')'
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
    // InternalMGLang.g:2830:1: rule__Pattern__Group_2_1__0 : rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 ;
    public final void rule__Pattern__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2834:1: ( rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1 )
            // InternalMGLang.g:2835:2: rule__Pattern__Group_2_1__0__Impl rule__Pattern__Group_2_1__1
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
    // InternalMGLang.g:2842:1: rule__Pattern__Group_2_1__0__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Pattern__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2846:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_0 ) ) )
            // InternalMGLang.g:2847:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            {
            // InternalMGLang.g:2847:1: ( ( rule__Pattern__ParametersAssignment_2_1_0 ) )
            // InternalMGLang.g:2848:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_0()); 
            // InternalMGLang.g:2849:2: ( rule__Pattern__ParametersAssignment_2_1_0 )
            // InternalMGLang.g:2849:3: rule__Pattern__ParametersAssignment_2_1_0
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
    // InternalMGLang.g:2857:1: rule__Pattern__Group_2_1__1 : rule__Pattern__Group_2_1__1__Impl ;
    public final void rule__Pattern__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2861:1: ( rule__Pattern__Group_2_1__1__Impl )
            // InternalMGLang.g:2862:2: rule__Pattern__Group_2_1__1__Impl
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
    // InternalMGLang.g:2868:1: rule__Pattern__Group_2_1__1__Impl : ( ( rule__Pattern__Group_2_1_1__0 )* ) ;
    public final void rule__Pattern__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2872:1: ( ( ( rule__Pattern__Group_2_1_1__0 )* ) )
            // InternalMGLang.g:2873:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            {
            // InternalMGLang.g:2873:1: ( ( rule__Pattern__Group_2_1_1__0 )* )
            // InternalMGLang.g:2874:2: ( rule__Pattern__Group_2_1_1__0 )*
            {
             before(grammarAccess.getPatternAccess().getGroup_2_1_1()); 
            // InternalMGLang.g:2875:2: ( rule__Pattern__Group_2_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMGLang.g:2875:3: rule__Pattern__Group_2_1_1__0
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
    // InternalMGLang.g:2884:1: rule__Pattern__Group_2_1_1__0 : rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 ;
    public final void rule__Pattern__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2888:1: ( rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1 )
            // InternalMGLang.g:2889:2: rule__Pattern__Group_2_1_1__0__Impl rule__Pattern__Group_2_1_1__1
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
    // InternalMGLang.g:2896:1: rule__Pattern__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2900:1: ( ( ',' ) )
            // InternalMGLang.g:2901:1: ( ',' )
            {
            // InternalMGLang.g:2901:1: ( ',' )
            // InternalMGLang.g:2902:2: ','
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
    // InternalMGLang.g:2911:1: rule__Pattern__Group_2_1_1__1 : rule__Pattern__Group_2_1_1__1__Impl ;
    public final void rule__Pattern__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2915:1: ( rule__Pattern__Group_2_1_1__1__Impl )
            // InternalMGLang.g:2916:2: rule__Pattern__Group_2_1_1__1__Impl
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
    // InternalMGLang.g:2922:1: rule__Pattern__Group_2_1_1__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Pattern__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2926:1: ( ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) ) )
            // InternalMGLang.g:2927:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalMGLang.g:2927:1: ( ( rule__Pattern__ParametersAssignment_2_1_1_1 ) )
            // InternalMGLang.g:2928:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPatternAccess().getParametersAssignment_2_1_1_1()); 
            // InternalMGLang.g:2929:2: ( rule__Pattern__ParametersAssignment_2_1_1_1 )
            // InternalMGLang.g:2929:3: rule__Pattern__ParametersAssignment_2_1_1_1
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
    // InternalMGLang.g:2938:1: rule__PatternReturn__Group__0 : rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 ;
    public final void rule__PatternReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2942:1: ( rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1 )
            // InternalMGLang.g:2943:2: rule__PatternReturn__Group__0__Impl rule__PatternReturn__Group__1
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
    // InternalMGLang.g:2950:1: rule__PatternReturn__Group__0__Impl : ( () ) ;
    public final void rule__PatternReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2954:1: ( ( () ) )
            // InternalMGLang.g:2955:1: ( () )
            {
            // InternalMGLang.g:2955:1: ( () )
            // InternalMGLang.g:2956:2: ()
            {
             before(grammarAccess.getPatternReturnAccess().getPatternReturnAction_0()); 
            // InternalMGLang.g:2957:2: ()
            // InternalMGLang.g:2957:3: 
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
    // InternalMGLang.g:2965:1: rule__PatternReturn__Group__1 : rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 ;
    public final void rule__PatternReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2969:1: ( rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2 )
            // InternalMGLang.g:2970:2: rule__PatternReturn__Group__1__Impl rule__PatternReturn__Group__2
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
    // InternalMGLang.g:2977:1: rule__PatternReturn__Group__1__Impl : ( 'return' ) ;
    public final void rule__PatternReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2981:1: ( ( 'return' ) )
            // InternalMGLang.g:2982:1: ( 'return' )
            {
            // InternalMGLang.g:2982:1: ( 'return' )
            // InternalMGLang.g:2983:2: 'return'
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
    // InternalMGLang.g:2992:1: rule__PatternReturn__Group__2 : rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 ;
    public final void rule__PatternReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:2996:1: ( rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3 )
            // InternalMGLang.g:2997:2: rule__PatternReturn__Group__2__Impl rule__PatternReturn__Group__3
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
    // InternalMGLang.g:3004:1: rule__PatternReturn__Group__2__Impl : ( 'this' ) ;
    public final void rule__PatternReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3008:1: ( ( 'this' ) )
            // InternalMGLang.g:3009:1: ( 'this' )
            {
            // InternalMGLang.g:3009:1: ( 'this' )
            // InternalMGLang.g:3010:2: 'this'
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
    // InternalMGLang.g:3019:1: rule__PatternReturn__Group__3 : rule__PatternReturn__Group__3__Impl ;
    public final void rule__PatternReturn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3023:1: ( rule__PatternReturn__Group__3__Impl )
            // InternalMGLang.g:3024:2: rule__PatternReturn__Group__3__Impl
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
    // InternalMGLang.g:3030:1: rule__PatternReturn__Group__3__Impl : ( ( rule__PatternReturn__Group_3__0 )? ) ;
    public final void rule__PatternReturn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3034:1: ( ( ( rule__PatternReturn__Group_3__0 )? ) )
            // InternalMGLang.g:3035:1: ( ( rule__PatternReturn__Group_3__0 )? )
            {
            // InternalMGLang.g:3035:1: ( ( rule__PatternReturn__Group_3__0 )? )
            // InternalMGLang.g:3036:2: ( rule__PatternReturn__Group_3__0 )?
            {
             before(grammarAccess.getPatternReturnAccess().getGroup_3()); 
            // InternalMGLang.g:3037:2: ( rule__PatternReturn__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMGLang.g:3037:3: rule__PatternReturn__Group_3__0
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
    // InternalMGLang.g:3046:1: rule__PatternReturn__Group_3__0 : rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 ;
    public final void rule__PatternReturn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3050:1: ( rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1 )
            // InternalMGLang.g:3051:2: rule__PatternReturn__Group_3__0__Impl rule__PatternReturn__Group_3__1
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
    // InternalMGLang.g:3058:1: rule__PatternReturn__Group_3__0__Impl : ( '.' ) ;
    public final void rule__PatternReturn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3062:1: ( ( '.' ) )
            // InternalMGLang.g:3063:1: ( '.' )
            {
            // InternalMGLang.g:3063:1: ( '.' )
            // InternalMGLang.g:3064:2: '.'
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
    // InternalMGLang.g:3073:1: rule__PatternReturn__Group_3__1 : rule__PatternReturn__Group_3__1__Impl ;
    public final void rule__PatternReturn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3077:1: ( rule__PatternReturn__Group_3__1__Impl )
            // InternalMGLang.g:3078:2: rule__PatternReturn__Group_3__1__Impl
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
    // InternalMGLang.g:3084:1: rule__PatternReturn__Group_3__1__Impl : ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) ;
    public final void rule__PatternReturn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3088:1: ( ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) ) )
            // InternalMGLang.g:3089:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            {
            // InternalMGLang.g:3089:1: ( ( rule__PatternReturn__ReturnValueAssignment_3_1 ) )
            // InternalMGLang.g:3090:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueAssignment_3_1()); 
            // InternalMGLang.g:3091:2: ( rule__PatternReturn__ReturnValueAssignment_3_1 )
            // InternalMGLang.g:3091:3: rule__PatternReturn__ReturnValueAssignment_3_1
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
    // InternalMGLang.g:3100:1: rule__ParamManipulation__Group__0 : rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 ;
    public final void rule__ParamManipulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3104:1: ( rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1 )
            // InternalMGLang.g:3105:2: rule__ParamManipulation__Group__0__Impl rule__ParamManipulation__Group__1
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
    // InternalMGLang.g:3112:1: rule__ParamManipulation__Group__0__Impl : ( ( rule__ParamManipulation__ParamAssignment_0 ) ) ;
    public final void rule__ParamManipulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3116:1: ( ( ( rule__ParamManipulation__ParamAssignment_0 ) ) )
            // InternalMGLang.g:3117:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            {
            // InternalMGLang.g:3117:1: ( ( rule__ParamManipulation__ParamAssignment_0 ) )
            // InternalMGLang.g:3118:2: ( rule__ParamManipulation__ParamAssignment_0 )
            {
             before(grammarAccess.getParamManipulationAccess().getParamAssignment_0()); 
            // InternalMGLang.g:3119:2: ( rule__ParamManipulation__ParamAssignment_0 )
            // InternalMGLang.g:3119:3: rule__ParamManipulation__ParamAssignment_0
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
    // InternalMGLang.g:3127:1: rule__ParamManipulation__Group__1 : rule__ParamManipulation__Group__1__Impl ;
    public final void rule__ParamManipulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3131:1: ( rule__ParamManipulation__Group__1__Impl )
            // InternalMGLang.g:3132:2: rule__ParamManipulation__Group__1__Impl
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
    // InternalMGLang.g:3138:1: rule__ParamManipulation__Group__1__Impl : ( ( rule__ParamManipulation__ContentAssignment_1 ) ) ;
    public final void rule__ParamManipulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3142:1: ( ( ( rule__ParamManipulation__ContentAssignment_1 ) ) )
            // InternalMGLang.g:3143:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            {
            // InternalMGLang.g:3143:1: ( ( rule__ParamManipulation__ContentAssignment_1 ) )
            // InternalMGLang.g:3144:2: ( rule__ParamManipulation__ContentAssignment_1 )
            {
             before(grammarAccess.getParamManipulationAccess().getContentAssignment_1()); 
            // InternalMGLang.g:3145:2: ( rule__ParamManipulation__ContentAssignment_1 )
            // InternalMGLang.g:3145:3: rule__ParamManipulation__ContentAssignment_1
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
    // InternalMGLang.g:3154:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3158:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalMGLang.g:3159:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalMGLang.g:3166:1: rule__Node__Group__0__Impl : ( ( rule__Node__TypeAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3170:1: ( ( ( rule__Node__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3171:1: ( ( rule__Node__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3171:1: ( ( rule__Node__TypeAssignment_0 ) )
            // InternalMGLang.g:3172:2: ( rule__Node__TypeAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:3173:2: ( rule__Node__TypeAssignment_0 )
            // InternalMGLang.g:3173:3: rule__Node__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3181:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3185:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalMGLang.g:3186:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMGLang.g:3193:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3197:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalMGLang.g:3198:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3198:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalMGLang.g:3199:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalMGLang.g:3200:2: ( rule__Node__NameAssignment_1 )
            // InternalMGLang.g:3200:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3208:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3212:1: ( rule__Node__Group__2__Impl )
            // InternalMGLang.g:3213:2: rule__Node__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__2__Impl();

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
    // InternalMGLang.g:3219:1: rule__Node__Group__2__Impl : ( ( rule__Node__Alternatives_2 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3223:1: ( ( ( rule__Node__Alternatives_2 )? ) )
            // InternalMGLang.g:3224:1: ( ( rule__Node__Alternatives_2 )? )
            {
            // InternalMGLang.g:3224:1: ( ( rule__Node__Alternatives_2 )? )
            // InternalMGLang.g:3225:2: ( rule__Node__Alternatives_2 )?
            {
             before(grammarAccess.getNodeAccess().getAlternatives_2()); 
            // InternalMGLang.g:3226:2: ( rule__Node__Alternatives_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ASSIGNMENT_OP||LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMGLang.g:3226:3: rule__Node__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalMGLang.g:3235:1: rule__Node__Group_2_1__0 : rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1 ;
    public final void rule__Node__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3239:1: ( rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1 )
            // InternalMGLang.g:3240:2: rule__Node__Group_2_1__0__Impl rule__Node__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Node__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_2_1__1();

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
    // $ANTLR end "rule__Node__Group_2_1__0"


    // $ANTLR start "rule__Node__Group_2_1__0__Impl"
    // InternalMGLang.g:3247:1: rule__Node__Group_2_1__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Node__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3251:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3252:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3252:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3253:2: RULE_ASSIGNMENT_OP
            {
             before(grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_2_1_0()); 
            match(input,RULE_ASSIGNMENT_OP,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getASSIGNMENT_OPTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:3262:1: rule__Node__Group_2_1__1 : rule__Node__Group_2_1__1__Impl ;
    public final void rule__Node__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3266:1: ( rule__Node__Group_2_1__1__Impl )
            // InternalMGLang.g:3267:2: rule__Node__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Node__Group_2_1__1"


    // $ANTLR start "rule__Node__Group_2_1__1__Impl"
    // InternalMGLang.g:3273:1: rule__Node__Group_2_1__1__Impl : ( ( rule__Node__CreatedByAssignment_2_1_1 ) ) ;
    public final void rule__Node__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3277:1: ( ( ( rule__Node__CreatedByAssignment_2_1_1 ) ) )
            // InternalMGLang.g:3278:1: ( ( rule__Node__CreatedByAssignment_2_1_1 ) )
            {
            // InternalMGLang.g:3278:1: ( ( rule__Node__CreatedByAssignment_2_1_1 ) )
            // InternalMGLang.g:3279:2: ( rule__Node__CreatedByAssignment_2_1_1 )
            {
             before(grammarAccess.getNodeAccess().getCreatedByAssignment_2_1_1()); 
            // InternalMGLang.g:3280:2: ( rule__Node__CreatedByAssignment_2_1_1 )
            // InternalMGLang.g:3280:3: rule__Node__CreatedByAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__CreatedByAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getCreatedByAssignment_2_1_1()); 

            }


            }

        }
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
    // InternalMGLang.g:3289:1: rule__NodeContent__Group__0 : rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 ;
    public final void rule__NodeContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3293:1: ( rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1 )
            // InternalMGLang.g:3294:2: rule__NodeContent__Group__0__Impl rule__NodeContent__Group__1
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
    // InternalMGLang.g:3301:1: rule__NodeContent__Group__0__Impl : ( () ) ;
    public final void rule__NodeContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3305:1: ( ( () ) )
            // InternalMGLang.g:3306:1: ( () )
            {
            // InternalMGLang.g:3306:1: ( () )
            // InternalMGLang.g:3307:2: ()
            {
             before(grammarAccess.getNodeContentAccess().getNodeContentAction_0()); 
            // InternalMGLang.g:3308:2: ()
            // InternalMGLang.g:3308:3: 
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
    // InternalMGLang.g:3316:1: rule__NodeContent__Group__1 : rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 ;
    public final void rule__NodeContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3320:1: ( rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2 )
            // InternalMGLang.g:3321:2: rule__NodeContent__Group__1__Impl rule__NodeContent__Group__2
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
    // InternalMGLang.g:3328:1: rule__NodeContent__Group__1__Impl : ( '{' ) ;
    public final void rule__NodeContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3332:1: ( ( '{' ) )
            // InternalMGLang.g:3333:1: ( '{' )
            {
            // InternalMGLang.g:3333:1: ( '{' )
            // InternalMGLang.g:3334:2: '{'
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
    // InternalMGLang.g:3343:1: rule__NodeContent__Group__2 : rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 ;
    public final void rule__NodeContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3347:1: ( rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3 )
            // InternalMGLang.g:3348:2: rule__NodeContent__Group__2__Impl rule__NodeContent__Group__3
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
    // InternalMGLang.g:3355:1: rule__NodeContent__Group__2__Impl : ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) ;
    public final void rule__NodeContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3359:1: ( ( ( rule__NodeContent__RefsAssignsAssignment_2 )* ) )
            // InternalMGLang.g:3360:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            {
            // InternalMGLang.g:3360:1: ( ( rule__NodeContent__RefsAssignsAssignment_2 )* )
            // InternalMGLang.g:3361:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            {
             before(grammarAccess.getNodeContentAccess().getRefsAssignsAssignment_2()); 
            // InternalMGLang.g:3362:2: ( rule__NodeContent__RefsAssignsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==53) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMGLang.g:3362:3: rule__NodeContent__RefsAssignsAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__NodeContent__RefsAssignsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMGLang.g:3370:1: rule__NodeContent__Group__3 : rule__NodeContent__Group__3__Impl ;
    public final void rule__NodeContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3374:1: ( rule__NodeContent__Group__3__Impl )
            // InternalMGLang.g:3375:2: rule__NodeContent__Group__3__Impl
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
    // InternalMGLang.g:3381:1: rule__NodeContent__Group__3__Impl : ( '}' ) ;
    public final void rule__NodeContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3385:1: ( ( '}' ) )
            // InternalMGLang.g:3386:1: ( '}' )
            {
            // InternalMGLang.g:3386:1: ( '}' )
            // InternalMGLang.g:3387:2: '}'
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
    // InternalMGLang.g:3397:1: rule__PatternCall__Group__0 : rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 ;
    public final void rule__PatternCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3401:1: ( rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1 )
            // InternalMGLang.g:3402:2: rule__PatternCall__Group__0__Impl rule__PatternCall__Group__1
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
    // InternalMGLang.g:3409:1: rule__PatternCall__Group__0__Impl : ( ( rule__PatternCall__CalledAssignment_0 ) ) ;
    public final void rule__PatternCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3413:1: ( ( ( rule__PatternCall__CalledAssignment_0 ) ) )
            // InternalMGLang.g:3414:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            {
            // InternalMGLang.g:3414:1: ( ( rule__PatternCall__CalledAssignment_0 ) )
            // InternalMGLang.g:3415:2: ( rule__PatternCall__CalledAssignment_0 )
            {
             before(grammarAccess.getPatternCallAccess().getCalledAssignment_0()); 
            // InternalMGLang.g:3416:2: ( rule__PatternCall__CalledAssignment_0 )
            // InternalMGLang.g:3416:3: rule__PatternCall__CalledAssignment_0
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
    // InternalMGLang.g:3424:1: rule__PatternCall__Group__1 : rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 ;
    public final void rule__PatternCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3428:1: ( rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2 )
            // InternalMGLang.g:3429:2: rule__PatternCall__Group__1__Impl rule__PatternCall__Group__2
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
    // InternalMGLang.g:3436:1: rule__PatternCall__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3440:1: ( ( '(' ) )
            // InternalMGLang.g:3441:1: ( '(' )
            {
            // InternalMGLang.g:3441:1: ( '(' )
            // InternalMGLang.g:3442:2: '('
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
    // InternalMGLang.g:3451:1: rule__PatternCall__Group__2 : rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 ;
    public final void rule__PatternCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3455:1: ( rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3 )
            // InternalMGLang.g:3456:2: rule__PatternCall__Group__2__Impl rule__PatternCall__Group__3
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
    // InternalMGLang.g:3463:1: rule__PatternCall__Group__2__Impl : ( ( rule__PatternCall__Group_2__0 )? ) ;
    public final void rule__PatternCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3467:1: ( ( ( rule__PatternCall__Group_2__0 )? ) )
            // InternalMGLang.g:3468:1: ( ( rule__PatternCall__Group_2__0 )? )
            {
            // InternalMGLang.g:3468:1: ( ( rule__PatternCall__Group_2__0 )? )
            // InternalMGLang.g:3469:2: ( rule__PatternCall__Group_2__0 )?
            {
             before(grammarAccess.getPatternCallAccess().getGroup_2()); 
            // InternalMGLang.g:3470:2: ( rule__PatternCall__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_TRUE && LA34_0<=RULE_FALSE)||(LA34_0>=RULE_STRING && LA34_0<=RULE_DOUBLE)||(LA34_0>=17 && LA34_0<=18)||LA34_0==40||LA34_0==62) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMGLang.g:3470:3: rule__PatternCall__Group_2__0
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
    // InternalMGLang.g:3478:1: rule__PatternCall__Group__3 : rule__PatternCall__Group__3__Impl ;
    public final void rule__PatternCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3482:1: ( rule__PatternCall__Group__3__Impl )
            // InternalMGLang.g:3483:2: rule__PatternCall__Group__3__Impl
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
    // InternalMGLang.g:3489:1: rule__PatternCall__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3493:1: ( ( ')' ) )
            // InternalMGLang.g:3494:1: ( ')' )
            {
            // InternalMGLang.g:3494:1: ( ')' )
            // InternalMGLang.g:3495:2: ')'
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
    // InternalMGLang.g:3505:1: rule__PatternCall__Group_2__0 : rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1 ;
    public final void rule__PatternCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3509:1: ( rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1 )
            // InternalMGLang.g:3510:2: rule__PatternCall__Group_2__0__Impl rule__PatternCall__Group_2__1
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
    // InternalMGLang.g:3517:1: rule__PatternCall__Group_2__0__Impl : ( ( rule__PatternCall__ParamsAssignment_2_0 ) ) ;
    public final void rule__PatternCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3521:1: ( ( ( rule__PatternCall__ParamsAssignment_2_0 ) ) )
            // InternalMGLang.g:3522:1: ( ( rule__PatternCall__ParamsAssignment_2_0 ) )
            {
            // InternalMGLang.g:3522:1: ( ( rule__PatternCall__ParamsAssignment_2_0 ) )
            // InternalMGLang.g:3523:2: ( rule__PatternCall__ParamsAssignment_2_0 )
            {
             before(grammarAccess.getPatternCallAccess().getParamsAssignment_2_0()); 
            // InternalMGLang.g:3524:2: ( rule__PatternCall__ParamsAssignment_2_0 )
            // InternalMGLang.g:3524:3: rule__PatternCall__ParamsAssignment_2_0
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
    // InternalMGLang.g:3532:1: rule__PatternCall__Group_2__1 : rule__PatternCall__Group_2__1__Impl ;
    public final void rule__PatternCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3536:1: ( rule__PatternCall__Group_2__1__Impl )
            // InternalMGLang.g:3537:2: rule__PatternCall__Group_2__1__Impl
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
    // InternalMGLang.g:3543:1: rule__PatternCall__Group_2__1__Impl : ( ( rule__PatternCall__Group_2_1__0 )* ) ;
    public final void rule__PatternCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3547:1: ( ( ( rule__PatternCall__Group_2_1__0 )* ) )
            // InternalMGLang.g:3548:1: ( ( rule__PatternCall__Group_2_1__0 )* )
            {
            // InternalMGLang.g:3548:1: ( ( rule__PatternCall__Group_2_1__0 )* )
            // InternalMGLang.g:3549:2: ( rule__PatternCall__Group_2_1__0 )*
            {
             before(grammarAccess.getPatternCallAccess().getGroup_2_1()); 
            // InternalMGLang.g:3550:2: ( rule__PatternCall__Group_2_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMGLang.g:3550:3: rule__PatternCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__PatternCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalMGLang.g:3559:1: rule__PatternCall__Group_2_1__0 : rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1 ;
    public final void rule__PatternCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3563:1: ( rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1 )
            // InternalMGLang.g:3564:2: rule__PatternCall__Group_2_1__0__Impl rule__PatternCall__Group_2_1__1
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
    // InternalMGLang.g:3571:1: rule__PatternCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__PatternCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3575:1: ( ( ',' ) )
            // InternalMGLang.g:3576:1: ( ',' )
            {
            // InternalMGLang.g:3576:1: ( ',' )
            // InternalMGLang.g:3577:2: ','
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
    // InternalMGLang.g:3586:1: rule__PatternCall__Group_2_1__1 : rule__PatternCall__Group_2_1__1__Impl ;
    public final void rule__PatternCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3590:1: ( rule__PatternCall__Group_2_1__1__Impl )
            // InternalMGLang.g:3591:2: rule__PatternCall__Group_2_1__1__Impl
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
    // InternalMGLang.g:3597:1: rule__PatternCall__Group_2_1__1__Impl : ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) ) ;
    public final void rule__PatternCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3601:1: ( ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) ) )
            // InternalMGLang.g:3602:1: ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) )
            {
            // InternalMGLang.g:3602:1: ( ( rule__PatternCall__ParamsAssignment_2_1_1 ) )
            // InternalMGLang.g:3603:2: ( rule__PatternCall__ParamsAssignment_2_1_1 )
            {
             before(grammarAccess.getPatternCallAccess().getParamsAssignment_2_1_1()); 
            // InternalMGLang.g:3604:2: ( rule__PatternCall__ParamsAssignment_2_1_1 )
            // InternalMGLang.g:3604:3: rule__PatternCall__ParamsAssignment_2_1_1
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
    // InternalMGLang.g:3613:1: rule__PatternNodeReference__Group__0 : rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 ;
    public final void rule__PatternNodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3617:1: ( rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1 )
            // InternalMGLang.g:3618:2: rule__PatternNodeReference__Group__0__Impl rule__PatternNodeReference__Group__1
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
    // InternalMGLang.g:3625:1: rule__PatternNodeReference__Group__0__Impl : ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) ;
    public final void rule__PatternNodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3629:1: ( ( ( rule__PatternNodeReference__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3630:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3630:1: ( ( rule__PatternNodeReference__TypeAssignment_0 ) )
            // InternalMGLang.g:3631:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:3632:2: ( rule__PatternNodeReference__TypeAssignment_0 )
            // InternalMGLang.g:3632:3: rule__PatternNodeReference__TypeAssignment_0
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
    // InternalMGLang.g:3640:1: rule__PatternNodeReference__Group__1 : rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 ;
    public final void rule__PatternNodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3644:1: ( rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2 )
            // InternalMGLang.g:3645:2: rule__PatternNodeReference__Group__1__Impl rule__PatternNodeReference__Group__2
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
    // InternalMGLang.g:3652:1: rule__PatternNodeReference__Group__1__Impl : ( '->' ) ;
    public final void rule__PatternNodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3656:1: ( ( '->' ) )
            // InternalMGLang.g:3657:1: ( '->' )
            {
            // InternalMGLang.g:3657:1: ( '->' )
            // InternalMGLang.g:3658:2: '->'
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
    // InternalMGLang.g:3667:1: rule__PatternNodeReference__Group__2 : rule__PatternNodeReference__Group__2__Impl ;
    public final void rule__PatternNodeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3671:1: ( rule__PatternNodeReference__Group__2__Impl )
            // InternalMGLang.g:3672:2: rule__PatternNodeReference__Group__2__Impl
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
    // InternalMGLang.g:3678:1: rule__PatternNodeReference__Group__2__Impl : ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) ;
    public final void rule__PatternNodeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3682:1: ( ( ( rule__PatternNodeReference__TargetAssignment_2 ) ) )
            // InternalMGLang.g:3683:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            {
            // InternalMGLang.g:3683:1: ( ( rule__PatternNodeReference__TargetAssignment_2 ) )
            // InternalMGLang.g:3684:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetAssignment_2()); 
            // InternalMGLang.g:3685:2: ( rule__PatternNodeReference__TargetAssignment_2 )
            // InternalMGLang.g:3685:3: rule__PatternNodeReference__TargetAssignment_2
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
    // InternalMGLang.g:3694:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3698:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMGLang.g:3699:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalMGLang.g:3706:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__TargetAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3710:1: ( ( ( rule__Assignment__TargetAssignment_0 ) ) )
            // InternalMGLang.g:3711:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            {
            // InternalMGLang.g:3711:1: ( ( rule__Assignment__TargetAssignment_0 ) )
            // InternalMGLang.g:3712:2: ( rule__Assignment__TargetAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getTargetAssignment_0()); 
            // InternalMGLang.g:3713:2: ( rule__Assignment__TargetAssignment_0 )
            // InternalMGLang.g:3713:3: rule__Assignment__TargetAssignment_0
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
    // InternalMGLang.g:3721:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3725:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMGLang.g:3726:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalMGLang.g:3733:1: rule__Assignment__Group__1__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3737:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:3738:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:3738:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:3739:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:3748:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3752:1: ( rule__Assignment__Group__2__Impl )
            // InternalMGLang.g:3753:2: rule__Assignment__Group__2__Impl
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
    // InternalMGLang.g:3759:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3763:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMGLang.g:3764:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMGLang.g:3764:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMGLang.g:3765:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalMGLang.g:3766:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMGLang.g:3766:3: rule__Assignment__ValueAssignment_2
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
    // InternalMGLang.g:3775:1: rule__PrimitiveParameter__Group__0 : rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 ;
    public final void rule__PrimitiveParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3779:1: ( rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1 )
            // InternalMGLang.g:3780:2: rule__PrimitiveParameter__Group__0__Impl rule__PrimitiveParameter__Group__1
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
    // InternalMGLang.g:3787:1: rule__PrimitiveParameter__Group__0__Impl : ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3791:1: ( ( ( rule__PrimitiveParameter__TypeAssignment_0 ) ) )
            // InternalMGLang.g:3792:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:3792:1: ( ( rule__PrimitiveParameter__TypeAssignment_0 ) )
            // InternalMGLang.g:3793:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:3794:2: ( rule__PrimitiveParameter__TypeAssignment_0 )
            // InternalMGLang.g:3794:3: rule__PrimitiveParameter__TypeAssignment_0
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
    // InternalMGLang.g:3802:1: rule__PrimitiveParameter__Group__1 : rule__PrimitiveParameter__Group__1__Impl ;
    public final void rule__PrimitiveParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3806:1: ( rule__PrimitiveParameter__Group__1__Impl )
            // InternalMGLang.g:3807:2: rule__PrimitiveParameter__Group__1__Impl
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
    // InternalMGLang.g:3813:1: rule__PrimitiveParameter__Group__1__Impl : ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3817:1: ( ( ( rule__PrimitiveParameter__NameAssignment_1 ) ) )
            // InternalMGLang.g:3818:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            {
            // InternalMGLang.g:3818:1: ( ( rule__PrimitiveParameter__NameAssignment_1 ) )
            // InternalMGLang.g:3819:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveParameterAccess().getNameAssignment_1()); 
            // InternalMGLang.g:3820:2: ( rule__PrimitiveParameter__NameAssignment_1 )
            // InternalMGLang.g:3820:3: rule__PrimitiveParameter__NameAssignment_1
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
    // InternalMGLang.g:3829:1: rule__ParameterNode__Group__0 : rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 ;
    public final void rule__ParameterNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3833:1: ( rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1 )
            // InternalMGLang.g:3834:2: rule__ParameterNode__Group__0__Impl rule__ParameterNode__Group__1
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
    // InternalMGLang.g:3841:1: rule__ParameterNode__Group__0__Impl : ( ( rule__ParameterNode__Group_0__0 )? ) ;
    public final void rule__ParameterNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3845:1: ( ( ( rule__ParameterNode__Group_0__0 )? ) )
            // InternalMGLang.g:3846:1: ( ( rule__ParameterNode__Group_0__0 )? )
            {
            // InternalMGLang.g:3846:1: ( ( rule__ParameterNode__Group_0__0 )? )
            // InternalMGLang.g:3847:2: ( rule__ParameterNode__Group_0__0 )?
            {
             before(grammarAccess.getParameterNodeAccess().getGroup_0()); 
            // InternalMGLang.g:3848:2: ( rule__ParameterNode__Group_0__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==48) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalMGLang.g:3848:3: rule__ParameterNode__Group_0__0
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
    // InternalMGLang.g:3856:1: rule__ParameterNode__Group__1 : rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2 ;
    public final void rule__ParameterNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3860:1: ( rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2 )
            // InternalMGLang.g:3861:2: rule__ParameterNode__Group__1__Impl rule__ParameterNode__Group__2
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
    // InternalMGLang.g:3868:1: rule__ParameterNode__Group__1__Impl : ( ( rule__ParameterNode__TypeAssignment_1 ) ) ;
    public final void rule__ParameterNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3872:1: ( ( ( rule__ParameterNode__TypeAssignment_1 ) ) )
            // InternalMGLang.g:3873:1: ( ( rule__ParameterNode__TypeAssignment_1 ) )
            {
            // InternalMGLang.g:3873:1: ( ( rule__ParameterNode__TypeAssignment_1 ) )
            // InternalMGLang.g:3874:2: ( rule__ParameterNode__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterNodeAccess().getTypeAssignment_1()); 
            // InternalMGLang.g:3875:2: ( rule__ParameterNode__TypeAssignment_1 )
            // InternalMGLang.g:3875:3: rule__ParameterNode__TypeAssignment_1
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
    // InternalMGLang.g:3883:1: rule__ParameterNode__Group__2 : rule__ParameterNode__Group__2__Impl ;
    public final void rule__ParameterNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3887:1: ( rule__ParameterNode__Group__2__Impl )
            // InternalMGLang.g:3888:2: rule__ParameterNode__Group__2__Impl
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
    // InternalMGLang.g:3894:1: rule__ParameterNode__Group__2__Impl : ( ( rule__ParameterNode__NameAssignment_2 ) ) ;
    public final void rule__ParameterNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3898:1: ( ( ( rule__ParameterNode__NameAssignment_2 ) ) )
            // InternalMGLang.g:3899:1: ( ( rule__ParameterNode__NameAssignment_2 ) )
            {
            // InternalMGLang.g:3899:1: ( ( rule__ParameterNode__NameAssignment_2 ) )
            // InternalMGLang.g:3900:2: ( rule__ParameterNode__NameAssignment_2 )
            {
             before(grammarAccess.getParameterNodeAccess().getNameAssignment_2()); 
            // InternalMGLang.g:3901:2: ( rule__ParameterNode__NameAssignment_2 )
            // InternalMGLang.g:3901:3: rule__ParameterNode__NameAssignment_2
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
    // InternalMGLang.g:3910:1: rule__ParameterNode__Group_0__0 : rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1 ;
    public final void rule__ParameterNode__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3914:1: ( rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1 )
            // InternalMGLang.g:3915:2: rule__ParameterNode__Group_0__0__Impl rule__ParameterNode__Group_0__1
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
    // InternalMGLang.g:3922:1: rule__ParameterNode__Group_0__0__Impl : ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) ) ;
    public final void rule__ParameterNode__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3926:1: ( ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) ) )
            // InternalMGLang.g:3927:1: ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) )
            {
            // InternalMGLang.g:3927:1: ( ( rule__ParameterNode__SrcModelAssignment_0_0 ) )
            // InternalMGLang.g:3928:2: ( rule__ParameterNode__SrcModelAssignment_0_0 )
            {
             before(grammarAccess.getParameterNodeAccess().getSrcModelAssignment_0_0()); 
            // InternalMGLang.g:3929:2: ( rule__ParameterNode__SrcModelAssignment_0_0 )
            // InternalMGLang.g:3929:3: rule__ParameterNode__SrcModelAssignment_0_0
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
    // InternalMGLang.g:3937:1: rule__ParameterNode__Group_0__1 : rule__ParameterNode__Group_0__1__Impl ;
    public final void rule__ParameterNode__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3941:1: ( rule__ParameterNode__Group_0__1__Impl )
            // InternalMGLang.g:3942:2: rule__ParameterNode__Group_0__1__Impl
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
    // InternalMGLang.g:3948:1: rule__ParameterNode__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ParameterNode__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3952:1: ( ( '.' ) )
            // InternalMGLang.g:3953:1: ( '.' )
            {
            // InternalMGLang.g:3953:1: ( '.' )
            // InternalMGLang.g:3954:2: '.'
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
    // InternalMGLang.g:3964:1: rule__RefOrCall__Group__0 : rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1 ;
    public final void rule__RefOrCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3968:1: ( rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1 )
            // InternalMGLang.g:3969:2: rule__RefOrCall__Group__0__Impl rule__RefOrCall__Group__1
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
    // InternalMGLang.g:3976:1: rule__RefOrCall__Group__0__Impl : ( ( rule__RefOrCall__RefAssignment_0 ) ) ;
    public final void rule__RefOrCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3980:1: ( ( ( rule__RefOrCall__RefAssignment_0 ) ) )
            // InternalMGLang.g:3981:1: ( ( rule__RefOrCall__RefAssignment_0 ) )
            {
            // InternalMGLang.g:3981:1: ( ( rule__RefOrCall__RefAssignment_0 ) )
            // InternalMGLang.g:3982:2: ( rule__RefOrCall__RefAssignment_0 )
            {
             before(grammarAccess.getRefOrCallAccess().getRefAssignment_0()); 
            // InternalMGLang.g:3983:2: ( rule__RefOrCall__RefAssignment_0 )
            // InternalMGLang.g:3983:3: rule__RefOrCall__RefAssignment_0
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
    // InternalMGLang.g:3991:1: rule__RefOrCall__Group__1 : rule__RefOrCall__Group__1__Impl ;
    public final void rule__RefOrCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:3995:1: ( rule__RefOrCall__Group__1__Impl )
            // InternalMGLang.g:3996:2: rule__RefOrCall__Group__1__Impl
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
    // InternalMGLang.g:4002:1: rule__RefOrCall__Group__1__Impl : ( ( rule__RefOrCall__Group_1__0 )* ) ;
    public final void rule__RefOrCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4006:1: ( ( ( rule__RefOrCall__Group_1__0 )* ) )
            // InternalMGLang.g:4007:1: ( ( rule__RefOrCall__Group_1__0 )* )
            {
            // InternalMGLang.g:4007:1: ( ( rule__RefOrCall__Group_1__0 )* )
            // InternalMGLang.g:4008:2: ( rule__RefOrCall__Group_1__0 )*
            {
             before(grammarAccess.getRefOrCallAccess().getGroup_1()); 
            // InternalMGLang.g:4009:2: ( rule__RefOrCall__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==48) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMGLang.g:4009:3: rule__RefOrCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__RefOrCall__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalMGLang.g:4018:1: rule__RefOrCall__Group_1__0 : rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1 ;
    public final void rule__RefOrCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4022:1: ( rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1 )
            // InternalMGLang.g:4023:2: rule__RefOrCall__Group_1__0__Impl rule__RefOrCall__Group_1__1
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
    // InternalMGLang.g:4030:1: rule__RefOrCall__Group_1__0__Impl : ( () ) ;
    public final void rule__RefOrCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4034:1: ( ( () ) )
            // InternalMGLang.g:4035:1: ( () )
            {
            // InternalMGLang.g:4035:1: ( () )
            // InternalMGLang.g:4036:2: ()
            {
             before(grammarAccess.getRefOrCallAccess().getRefOrCallTargetAction_1_0()); 
            // InternalMGLang.g:4037:2: ()
            // InternalMGLang.g:4037:3: 
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
    // InternalMGLang.g:4045:1: rule__RefOrCall__Group_1__1 : rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2 ;
    public final void rule__RefOrCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4049:1: ( rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2 )
            // InternalMGLang.g:4050:2: rule__RefOrCall__Group_1__1__Impl rule__RefOrCall__Group_1__2
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
    // InternalMGLang.g:4057:1: rule__RefOrCall__Group_1__1__Impl : ( '.' ) ;
    public final void rule__RefOrCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4061:1: ( ( '.' ) )
            // InternalMGLang.g:4062:1: ( '.' )
            {
            // InternalMGLang.g:4062:1: ( '.' )
            // InternalMGLang.g:4063:2: '.'
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
    // InternalMGLang.g:4072:1: rule__RefOrCall__Group_1__2 : rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3 ;
    public final void rule__RefOrCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4076:1: ( rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3 )
            // InternalMGLang.g:4077:2: rule__RefOrCall__Group_1__2__Impl rule__RefOrCall__Group_1__3
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
    // InternalMGLang.g:4084:1: rule__RefOrCall__Group_1__2__Impl : ( ( rule__RefOrCall__RefAssignment_1_2 ) ) ;
    public final void rule__RefOrCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4088:1: ( ( ( rule__RefOrCall__RefAssignment_1_2 ) ) )
            // InternalMGLang.g:4089:1: ( ( rule__RefOrCall__RefAssignment_1_2 ) )
            {
            // InternalMGLang.g:4089:1: ( ( rule__RefOrCall__RefAssignment_1_2 ) )
            // InternalMGLang.g:4090:2: ( rule__RefOrCall__RefAssignment_1_2 )
            {
             before(grammarAccess.getRefOrCallAccess().getRefAssignment_1_2()); 
            // InternalMGLang.g:4091:2: ( rule__RefOrCall__RefAssignment_1_2 )
            // InternalMGLang.g:4091:3: rule__RefOrCall__RefAssignment_1_2
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
    // InternalMGLang.g:4099:1: rule__RefOrCall__Group_1__3 : rule__RefOrCall__Group_1__3__Impl ;
    public final void rule__RefOrCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4103:1: ( rule__RefOrCall__Group_1__3__Impl )
            // InternalMGLang.g:4104:2: rule__RefOrCall__Group_1__3__Impl
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
    // InternalMGLang.g:4110:1: rule__RefOrCall__Group_1__3__Impl : ( ( rule__RefOrCall__Group_1_3__0 )? ) ;
    public final void rule__RefOrCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4114:1: ( ( ( rule__RefOrCall__Group_1_3__0 )? ) )
            // InternalMGLang.g:4115:1: ( ( rule__RefOrCall__Group_1_3__0 )? )
            {
            // InternalMGLang.g:4115:1: ( ( rule__RefOrCall__Group_1_3__0 )? )
            // InternalMGLang.g:4116:2: ( rule__RefOrCall__Group_1_3__0 )?
            {
             before(grammarAccess.getRefOrCallAccess().getGroup_1_3()); 
            // InternalMGLang.g:4117:2: ( rule__RefOrCall__Group_1_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMGLang.g:4117:3: rule__RefOrCall__Group_1_3__0
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
    // InternalMGLang.g:4126:1: rule__RefOrCall__Group_1_3__0 : rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1 ;
    public final void rule__RefOrCall__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4130:1: ( rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1 )
            // InternalMGLang.g:4131:2: rule__RefOrCall__Group_1_3__0__Impl rule__RefOrCall__Group_1_3__1
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
    // InternalMGLang.g:4138:1: rule__RefOrCall__Group_1_3__0__Impl : ( '(' ) ;
    public final void rule__RefOrCall__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4142:1: ( ( '(' ) )
            // InternalMGLang.g:4143:1: ( '(' )
            {
            // InternalMGLang.g:4143:1: ( '(' )
            // InternalMGLang.g:4144:2: '('
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
    // InternalMGLang.g:4153:1: rule__RefOrCall__Group_1_3__1 : rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2 ;
    public final void rule__RefOrCall__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4157:1: ( rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2 )
            // InternalMGLang.g:4158:2: rule__RefOrCall__Group_1_3__1__Impl rule__RefOrCall__Group_1_3__2
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
    // InternalMGLang.g:4165:1: rule__RefOrCall__Group_1_3__1__Impl : ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? ) ;
    public final void rule__RefOrCall__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4169:1: ( ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? ) )
            // InternalMGLang.g:4170:1: ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? )
            {
            // InternalMGLang.g:4170:1: ( ( rule__RefOrCall__ParamsAssignment_1_3_1 )? )
            // InternalMGLang.g:4171:2: ( rule__RefOrCall__ParamsAssignment_1_3_1 )?
            {
             before(grammarAccess.getRefOrCallAccess().getParamsAssignment_1_3_1()); 
            // InternalMGLang.g:4172:2: ( rule__RefOrCall__ParamsAssignment_1_3_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_TRUE && LA39_0<=RULE_FALSE)||(LA39_0>=RULE_STRING && LA39_0<=RULE_DOUBLE)||(LA39_0>=17 && LA39_0<=18)||LA39_0==40||LA39_0==62) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMGLang.g:4172:3: rule__RefOrCall__ParamsAssignment_1_3_1
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
    // InternalMGLang.g:4180:1: rule__RefOrCall__Group_1_3__2 : rule__RefOrCall__Group_1_3__2__Impl ;
    public final void rule__RefOrCall__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4184:1: ( rule__RefOrCall__Group_1_3__2__Impl )
            // InternalMGLang.g:4185:2: rule__RefOrCall__Group_1_3__2__Impl
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
    // InternalMGLang.g:4191:1: rule__RefOrCall__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__RefOrCall__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4195:1: ( ( ')' ) )
            // InternalMGLang.g:4196:1: ( ')' )
            {
            // InternalMGLang.g:4196:1: ( ')' )
            // InternalMGLang.g:4197:2: ')'
            {
             before(grammarAccess.getRefOrCallAccess().getRightParenthesisKeyword_1_3_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRefOrCallAccess().getRightParenthesisKeyword_1_3_2()); 

            }


            }

        }
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
    // InternalMGLang.g:4207:1: rule__RefParams__Group__0 : rule__RefParams__Group__0__Impl rule__RefParams__Group__1 ;
    public final void rule__RefParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4211:1: ( rule__RefParams__Group__0__Impl rule__RefParams__Group__1 )
            // InternalMGLang.g:4212:2: rule__RefParams__Group__0__Impl rule__RefParams__Group__1
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
    // InternalMGLang.g:4219:1: rule__RefParams__Group__0__Impl : ( ( rule__RefParams__ParamsAssignment_0 ) ) ;
    public final void rule__RefParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4223:1: ( ( ( rule__RefParams__ParamsAssignment_0 ) ) )
            // InternalMGLang.g:4224:1: ( ( rule__RefParams__ParamsAssignment_0 ) )
            {
            // InternalMGLang.g:4224:1: ( ( rule__RefParams__ParamsAssignment_0 ) )
            // InternalMGLang.g:4225:2: ( rule__RefParams__ParamsAssignment_0 )
            {
             before(grammarAccess.getRefParamsAccess().getParamsAssignment_0()); 
            // InternalMGLang.g:4226:2: ( rule__RefParams__ParamsAssignment_0 )
            // InternalMGLang.g:4226:3: rule__RefParams__ParamsAssignment_0
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
    // InternalMGLang.g:4234:1: rule__RefParams__Group__1 : rule__RefParams__Group__1__Impl ;
    public final void rule__RefParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4238:1: ( rule__RefParams__Group__1__Impl )
            // InternalMGLang.g:4239:2: rule__RefParams__Group__1__Impl
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
    // InternalMGLang.g:4245:1: rule__RefParams__Group__1__Impl : ( ( rule__RefParams__Group_1__0 )* ) ;
    public final void rule__RefParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4249:1: ( ( ( rule__RefParams__Group_1__0 )* ) )
            // InternalMGLang.g:4250:1: ( ( rule__RefParams__Group_1__0 )* )
            {
            // InternalMGLang.g:4250:1: ( ( rule__RefParams__Group_1__0 )* )
            // InternalMGLang.g:4251:2: ( rule__RefParams__Group_1__0 )*
            {
             before(grammarAccess.getRefParamsAccess().getGroup_1()); 
            // InternalMGLang.g:4252:2: ( rule__RefParams__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==45) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMGLang.g:4252:3: rule__RefParams__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RefParams__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalMGLang.g:4261:1: rule__RefParams__Group_1__0 : rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1 ;
    public final void rule__RefParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4265:1: ( rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1 )
            // InternalMGLang.g:4266:2: rule__RefParams__Group_1__0__Impl rule__RefParams__Group_1__1
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
    // InternalMGLang.g:4273:1: rule__RefParams__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RefParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4277:1: ( ( ',' ) )
            // InternalMGLang.g:4278:1: ( ',' )
            {
            // InternalMGLang.g:4278:1: ( ',' )
            // InternalMGLang.g:4279:2: ','
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
    // InternalMGLang.g:4288:1: rule__RefParams__Group_1__1 : rule__RefParams__Group_1__1__Impl ;
    public final void rule__RefParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4292:1: ( rule__RefParams__Group_1__1__Impl )
            // InternalMGLang.g:4293:2: rule__RefParams__Group_1__1__Impl
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
    // InternalMGLang.g:4299:1: rule__RefParams__Group_1__1__Impl : ( ( rule__RefParams__ParamsAssignment_1_1 ) ) ;
    public final void rule__RefParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4303:1: ( ( ( rule__RefParams__ParamsAssignment_1_1 ) ) )
            // InternalMGLang.g:4304:1: ( ( rule__RefParams__ParamsAssignment_1_1 ) )
            {
            // InternalMGLang.g:4304:1: ( ( rule__RefParams__ParamsAssignment_1_1 ) )
            // InternalMGLang.g:4305:2: ( rule__RefParams__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getRefParamsAccess().getParamsAssignment_1_1()); 
            // InternalMGLang.g:4306:2: ( rule__RefParams__ParamsAssignment_1_1 )
            // InternalMGLang.g:4306:3: rule__RefParams__ParamsAssignment_1_1
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
    // InternalMGLang.g:4315:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4319:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalMGLang.g:4320:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
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
    // InternalMGLang.g:4327:1: rule__Generator__Group__0__Impl : ( () ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4331:1: ( ( () ) )
            // InternalMGLang.g:4332:1: ( () )
            {
            // InternalMGLang.g:4332:1: ( () )
            // InternalMGLang.g:4333:2: ()
            {
             before(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
            // InternalMGLang.g:4334:2: ()
            // InternalMGLang.g:4334:3: 
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
    // InternalMGLang.g:4342:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4346:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // InternalMGLang.g:4347:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
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
    // InternalMGLang.g:4354:1: rule__Generator__Group__1__Impl : ( 'gen' ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4358:1: ( ( 'gen' ) )
            // InternalMGLang.g:4359:1: ( 'gen' )
            {
            // InternalMGLang.g:4359:1: ( 'gen' )
            // InternalMGLang.g:4360:2: 'gen'
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
    // InternalMGLang.g:4369:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4373:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // InternalMGLang.g:4374:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
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
    // InternalMGLang.g:4381:1: rule__Generator__Group__2__Impl : ( '(' ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4385:1: ( ( '(' ) )
            // InternalMGLang.g:4386:1: ( '(' )
            {
            // InternalMGLang.g:4386:1: ( '(' )
            // InternalMGLang.g:4387:2: '('
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
    // InternalMGLang.g:4396:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4400:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // InternalMGLang.g:4401:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
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
    // InternalMGLang.g:4408:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__ParamsAssignment_3 )* ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4412:1: ( ( ( rule__Generator__ParamsAssignment_3 )* ) )
            // InternalMGLang.g:4413:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            {
            // InternalMGLang.g:4413:1: ( ( rule__Generator__ParamsAssignment_3 )* )
            // InternalMGLang.g:4414:2: ( rule__Generator__ParamsAssignment_3 )*
            {
             before(grammarAccess.getGeneratorAccess().getParamsAssignment_3()); 
            // InternalMGLang.g:4415:2: ( rule__Generator__ParamsAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||(LA41_0>=19 && LA41_0<=22)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMGLang.g:4415:3: rule__Generator__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Generator__ParamsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalMGLang.g:4423:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4427:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // InternalMGLang.g:4428:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
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
    // InternalMGLang.g:4435:1: rule__Generator__Group__4__Impl : ( ')' ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4439:1: ( ( ')' ) )
            // InternalMGLang.g:4440:1: ( ')' )
            {
            // InternalMGLang.g:4440:1: ( ')' )
            // InternalMGLang.g:4441:2: ')'
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
    // InternalMGLang.g:4450:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4454:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // InternalMGLang.g:4455:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
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
    // InternalMGLang.g:4462:1: rule__Generator__Group__5__Impl : ( '{' ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4466:1: ( ( '{' ) )
            // InternalMGLang.g:4467:1: ( '{' )
            {
            // InternalMGLang.g:4467:1: ( '{' )
            // InternalMGLang.g:4468:2: '{'
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
    // InternalMGLang.g:4477:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl rule__Generator__Group__7 ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4481:1: ( rule__Generator__Group__6__Impl rule__Generator__Group__7 )
            // InternalMGLang.g:4482:2: rule__Generator__Group__6__Impl rule__Generator__Group__7
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
    // InternalMGLang.g:4489:1: rule__Generator__Group__6__Impl : ( ( rule__Generator__CommandsAssignment_6 )* ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4493:1: ( ( ( rule__Generator__CommandsAssignment_6 )* ) )
            // InternalMGLang.g:4494:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            {
            // InternalMGLang.g:4494:1: ( ( rule__Generator__CommandsAssignment_6 )* )
            // InternalMGLang.g:4495:2: ( rule__Generator__CommandsAssignment_6 )*
            {
             before(grammarAccess.getGeneratorAccess().getCommandsAssignment_6()); 
            // InternalMGLang.g:4496:2: ( rule__Generator__CommandsAssignment_6 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==51||LA42_0==53||LA42_0==58||LA42_0==61) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMGLang.g:4496:3: rule__Generator__CommandsAssignment_6
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Generator__CommandsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalMGLang.g:4504:1: rule__Generator__Group__7 : rule__Generator__Group__7__Impl ;
    public final void rule__Generator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4508:1: ( rule__Generator__Group__7__Impl )
            // InternalMGLang.g:4509:2: rule__Generator__Group__7__Impl
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
    // InternalMGLang.g:4515:1: rule__Generator__Group__7__Impl : ( '}' ) ;
    public final void rule__Generator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4519:1: ( ( '}' ) )
            // InternalMGLang.g:4520:1: ( '}' )
            {
            // InternalMGLang.g:4520:1: ( '}' )
            // InternalMGLang.g:4521:2: '}'
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
    // InternalMGLang.g:4531:1: rule__PatternVariable__Group__0 : rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 ;
    public final void rule__PatternVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4535:1: ( rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1 )
            // InternalMGLang.g:4536:2: rule__PatternVariable__Group__0__Impl rule__PatternVariable__Group__1
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
    // InternalMGLang.g:4543:1: rule__PatternVariable__Group__0__Impl : ( ( rule__PatternVariable__TypeAssignment_0 ) ) ;
    public final void rule__PatternVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4547:1: ( ( ( rule__PatternVariable__TypeAssignment_0 ) ) )
            // InternalMGLang.g:4548:1: ( ( rule__PatternVariable__TypeAssignment_0 ) )
            {
            // InternalMGLang.g:4548:1: ( ( rule__PatternVariable__TypeAssignment_0 ) )
            // InternalMGLang.g:4549:2: ( rule__PatternVariable__TypeAssignment_0 )
            {
             before(grammarAccess.getPatternVariableAccess().getTypeAssignment_0()); 
            // InternalMGLang.g:4550:2: ( rule__PatternVariable__TypeAssignment_0 )
            // InternalMGLang.g:4550:3: rule__PatternVariable__TypeAssignment_0
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
    // InternalMGLang.g:4558:1: rule__PatternVariable__Group__1 : rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 ;
    public final void rule__PatternVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4562:1: ( rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2 )
            // InternalMGLang.g:4563:2: rule__PatternVariable__Group__1__Impl rule__PatternVariable__Group__2
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
    // InternalMGLang.g:4570:1: rule__PatternVariable__Group__1__Impl : ( ( rule__PatternVariable__NameAssignment_1 ) ) ;
    public final void rule__PatternVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4574:1: ( ( ( rule__PatternVariable__NameAssignment_1 ) ) )
            // InternalMGLang.g:4575:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            {
            // InternalMGLang.g:4575:1: ( ( rule__PatternVariable__NameAssignment_1 ) )
            // InternalMGLang.g:4576:2: ( rule__PatternVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPatternVariableAccess().getNameAssignment_1()); 
            // InternalMGLang.g:4577:2: ( rule__PatternVariable__NameAssignment_1 )
            // InternalMGLang.g:4577:3: rule__PatternVariable__NameAssignment_1
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
    // InternalMGLang.g:4585:1: rule__PatternVariable__Group__2 : rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 ;
    public final void rule__PatternVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4589:1: ( rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3 )
            // InternalMGLang.g:4590:2: rule__PatternVariable__Group__2__Impl rule__PatternVariable__Group__3
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
    // InternalMGLang.g:4597:1: rule__PatternVariable__Group__2__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__PatternVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4601:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:4602:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:4602:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:4603:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:4612:1: rule__PatternVariable__Group__3 : rule__PatternVariable__Group__3__Impl ;
    public final void rule__PatternVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4616:1: ( rule__PatternVariable__Group__3__Impl )
            // InternalMGLang.g:4617:2: rule__PatternVariable__Group__3__Impl
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
    // InternalMGLang.g:4623:1: rule__PatternVariable__Group__3__Impl : ( ( rule__PatternVariable__PatternCallAssignment_3 ) ) ;
    public final void rule__PatternVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4627:1: ( ( ( rule__PatternVariable__PatternCallAssignment_3 ) ) )
            // InternalMGLang.g:4628:1: ( ( rule__PatternVariable__PatternCallAssignment_3 ) )
            {
            // InternalMGLang.g:4628:1: ( ( rule__PatternVariable__PatternCallAssignment_3 ) )
            // InternalMGLang.g:4629:2: ( rule__PatternVariable__PatternCallAssignment_3 )
            {
             before(grammarAccess.getPatternVariableAccess().getPatternCallAssignment_3()); 
            // InternalMGLang.g:4630:2: ( rule__PatternVariable__PatternCallAssignment_3 )
            // InternalMGLang.g:4630:3: rule__PatternVariable__PatternCallAssignment_3
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


    // $ANTLR start "rule__ForStatement__Group__0"
    // InternalMGLang.g:4639:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4643:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalMGLang.g:4644:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:4651:1: rule__ForStatement__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4655:1: ( ( 'for' ) )
            // InternalMGLang.g:4656:1: ( 'for' )
            {
            // InternalMGLang.g:4656:1: ( 'for' )
            // InternalMGLang.g:4657:2: 'for'
            {
             before(grammarAccess.getForStatementAccess().getForKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMGLang.g:4666:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4670:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalMGLang.g:4671:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
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
    // InternalMGLang.g:4678:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__HeadAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4682:1: ( ( ( rule__ForStatement__HeadAssignment_1 ) ) )
            // InternalMGLang.g:4683:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            {
            // InternalMGLang.g:4683:1: ( ( rule__ForStatement__HeadAssignment_1 ) )
            // InternalMGLang.g:4684:2: ( rule__ForStatement__HeadAssignment_1 )
            {
             before(grammarAccess.getForStatementAccess().getHeadAssignment_1()); 
            // InternalMGLang.g:4685:2: ( rule__ForStatement__HeadAssignment_1 )
            // InternalMGLang.g:4685:3: rule__ForStatement__HeadAssignment_1
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
    // InternalMGLang.g:4693:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4697:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalMGLang.g:4698:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
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
    // InternalMGLang.g:4705:1: rule__ForStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4709:1: ( ( '{' ) )
            // InternalMGLang.g:4710:1: ( '{' )
            {
            // InternalMGLang.g:4710:1: ( '{' )
            // InternalMGLang.g:4711:2: '{'
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
    // InternalMGLang.g:4720:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4724:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalMGLang.g:4725:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
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
    // InternalMGLang.g:4732:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__BodyAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4736:1: ( ( ( rule__ForStatement__BodyAssignment_3 ) ) )
            // InternalMGLang.g:4737:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:4737:1: ( ( rule__ForStatement__BodyAssignment_3 ) )
            // InternalMGLang.g:4738:2: ( rule__ForStatement__BodyAssignment_3 )
            {
             before(grammarAccess.getForStatementAccess().getBodyAssignment_3()); 
            // InternalMGLang.g:4739:2: ( rule__ForStatement__BodyAssignment_3 )
            // InternalMGLang.g:4739:3: rule__ForStatement__BodyAssignment_3
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
    // InternalMGLang.g:4747:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4751:1: ( rule__ForStatement__Group__4__Impl )
            // InternalMGLang.g:4752:2: rule__ForStatement__Group__4__Impl
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
    // InternalMGLang.g:4758:1: rule__ForStatement__Group__4__Impl : ( '}' ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4762:1: ( ( '}' ) )
            // InternalMGLang.g:4763:1: ( '}' )
            {
            // InternalMGLang.g:4763:1: ( '}' )
            // InternalMGLang.g:4764:2: '}'
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
    // InternalMGLang.g:4774:1: rule__GeneralForHead__Group__0 : rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 ;
    public final void rule__GeneralForHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4778:1: ( rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1 )
            // InternalMGLang.g:4779:2: rule__GeneralForHead__Group__0__Impl rule__GeneralForHead__Group__1
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
    // InternalMGLang.g:4786:1: rule__GeneralForHead__Group__0__Impl : ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) ;
    public final void rule__GeneralForHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4790:1: ( ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) ) )
            // InternalMGLang.g:4791:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            {
            // InternalMGLang.g:4791:1: ( ( rule__GeneralForHead__IteratorVarAssignment_0 ) )
            // InternalMGLang.g:4792:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            {
             before(grammarAccess.getGeneralForHeadAccess().getIteratorVarAssignment_0()); 
            // InternalMGLang.g:4793:2: ( rule__GeneralForHead__IteratorVarAssignment_0 )
            // InternalMGLang.g:4793:3: rule__GeneralForHead__IteratorVarAssignment_0
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
    // InternalMGLang.g:4801:1: rule__GeneralForHead__Group__1 : rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 ;
    public final void rule__GeneralForHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4805:1: ( rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2 )
            // InternalMGLang.g:4806:2: rule__GeneralForHead__Group__1__Impl rule__GeneralForHead__Group__2
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
    // InternalMGLang.g:4813:1: rule__GeneralForHead__Group__1__Impl : ( 'in' ) ;
    public final void rule__GeneralForHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4817:1: ( ( 'in' ) )
            // InternalMGLang.g:4818:1: ( 'in' )
            {
            // InternalMGLang.g:4818:1: ( 'in' )
            // InternalMGLang.g:4819:2: 'in'
            {
             before(grammarAccess.getGeneralForHeadAccess().getInKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMGLang.g:4828:1: rule__GeneralForHead__Group__2 : rule__GeneralForHead__Group__2__Impl ;
    public final void rule__GeneralForHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4832:1: ( rule__GeneralForHead__Group__2__Impl )
            // InternalMGLang.g:4833:2: rule__GeneralForHead__Group__2__Impl
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
    // InternalMGLang.g:4839:1: rule__GeneralForHead__Group__2__Impl : ( ( rule__GeneralForHead__RangeAssignment_2 ) ) ;
    public final void rule__GeneralForHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4843:1: ( ( ( rule__GeneralForHead__RangeAssignment_2 ) ) )
            // InternalMGLang.g:4844:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            {
            // InternalMGLang.g:4844:1: ( ( rule__GeneralForHead__RangeAssignment_2 ) )
            // InternalMGLang.g:4845:2: ( rule__GeneralForHead__RangeAssignment_2 )
            {
             before(grammarAccess.getGeneralForHeadAccess().getRangeAssignment_2()); 
            // InternalMGLang.g:4846:2: ( rule__GeneralForHead__RangeAssignment_2 )
            // InternalMGLang.g:4846:3: rule__GeneralForHead__RangeAssignment_2
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
    // InternalMGLang.g:4855:1: rule__ForEachHead__Group__0 : rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 ;
    public final void rule__ForEachHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4859:1: ( rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1 )
            // InternalMGLang.g:4860:2: rule__ForEachHead__Group__0__Impl rule__ForEachHead__Group__1
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
    // InternalMGLang.g:4867:1: rule__ForEachHead__Group__0__Impl : ( ( rule__ForEachHead__SrcAssignment_0 ) ) ;
    public final void rule__ForEachHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4871:1: ( ( ( rule__ForEachHead__SrcAssignment_0 ) ) )
            // InternalMGLang.g:4872:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            {
            // InternalMGLang.g:4872:1: ( ( rule__ForEachHead__SrcAssignment_0 ) )
            // InternalMGLang.g:4873:2: ( rule__ForEachHead__SrcAssignment_0 )
            {
             before(grammarAccess.getForEachHeadAccess().getSrcAssignment_0()); 
            // InternalMGLang.g:4874:2: ( rule__ForEachHead__SrcAssignment_0 )
            // InternalMGLang.g:4874:3: rule__ForEachHead__SrcAssignment_0
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
    // InternalMGLang.g:4882:1: rule__ForEachHead__Group__1 : rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 ;
    public final void rule__ForEachHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4886:1: ( rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2 )
            // InternalMGLang.g:4887:2: rule__ForEachHead__Group__1__Impl rule__ForEachHead__Group__2
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
    // InternalMGLang.g:4894:1: rule__ForEachHead__Group__1__Impl : ( '-' ) ;
    public final void rule__ForEachHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4898:1: ( ( '-' ) )
            // InternalMGLang.g:4899:1: ( '-' )
            {
            // InternalMGLang.g:4899:1: ( '-' )
            // InternalMGLang.g:4900:2: '-'
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
    // InternalMGLang.g:4909:1: rule__ForEachHead__Group__2 : rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 ;
    public final void rule__ForEachHead__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4913:1: ( rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3 )
            // InternalMGLang.g:4914:2: rule__ForEachHead__Group__2__Impl rule__ForEachHead__Group__3
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
    // InternalMGLang.g:4921:1: rule__ForEachHead__Group__2__Impl : ( ( rule__ForEachHead__ErefAssignment_2 ) ) ;
    public final void rule__ForEachHead__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4925:1: ( ( ( rule__ForEachHead__ErefAssignment_2 ) ) )
            // InternalMGLang.g:4926:1: ( ( rule__ForEachHead__ErefAssignment_2 ) )
            {
            // InternalMGLang.g:4926:1: ( ( rule__ForEachHead__ErefAssignment_2 ) )
            // InternalMGLang.g:4927:2: ( rule__ForEachHead__ErefAssignment_2 )
            {
             before(grammarAccess.getForEachHeadAccess().getErefAssignment_2()); 
            // InternalMGLang.g:4928:2: ( rule__ForEachHead__ErefAssignment_2 )
            // InternalMGLang.g:4928:3: rule__ForEachHead__ErefAssignment_2
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
    // InternalMGLang.g:4936:1: rule__ForEachHead__Group__3 : rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 ;
    public final void rule__ForEachHead__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4940:1: ( rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4 )
            // InternalMGLang.g:4941:2: rule__ForEachHead__Group__3__Impl rule__ForEachHead__Group__4
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
    // InternalMGLang.g:4948:1: rule__ForEachHead__Group__3__Impl : ( '->' ) ;
    public final void rule__ForEachHead__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4952:1: ( ( '->' ) )
            // InternalMGLang.g:4953:1: ( '->' )
            {
            // InternalMGLang.g:4953:1: ( '->' )
            // InternalMGLang.g:4954:2: '->'
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
    // InternalMGLang.g:4963:1: rule__ForEachHead__Group__4 : rule__ForEachHead__Group__4__Impl ;
    public final void rule__ForEachHead__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4967:1: ( rule__ForEachHead__Group__4__Impl )
            // InternalMGLang.g:4968:2: rule__ForEachHead__Group__4__Impl
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
    // InternalMGLang.g:4974:1: rule__ForEachHead__Group__4__Impl : ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) ;
    public final void rule__ForEachHead__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4978:1: ( ( ( rule__ForEachHead__IteratorVarAssignment_4 ) ) )
            // InternalMGLang.g:4979:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            {
            // InternalMGLang.g:4979:1: ( ( rule__ForEachHead__IteratorVarAssignment_4 ) )
            // InternalMGLang.g:4980:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            {
             before(grammarAccess.getForEachHeadAccess().getIteratorVarAssignment_4()); 
            // InternalMGLang.g:4981:2: ( rule__ForEachHead__IteratorVarAssignment_4 )
            // InternalMGLang.g:4981:3: rule__ForEachHead__IteratorVarAssignment_4
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
    // InternalMGLang.g:4990:1: rule__ForBody__Group__0 : rule__ForBody__Group__0__Impl rule__ForBody__Group__1 ;
    public final void rule__ForBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:4994:1: ( rule__ForBody__Group__0__Impl rule__ForBody__Group__1 )
            // InternalMGLang.g:4995:2: rule__ForBody__Group__0__Impl rule__ForBody__Group__1
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
    // InternalMGLang.g:5002:1: rule__ForBody__Group__0__Impl : ( () ) ;
    public final void rule__ForBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5006:1: ( ( () ) )
            // InternalMGLang.g:5007:1: ( () )
            {
            // InternalMGLang.g:5007:1: ( () )
            // InternalMGLang.g:5008:2: ()
            {
             before(grammarAccess.getForBodyAccess().getForBodyAction_0()); 
            // InternalMGLang.g:5009:2: ()
            // InternalMGLang.g:5009:3: 
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
    // InternalMGLang.g:5017:1: rule__ForBody__Group__1 : rule__ForBody__Group__1__Impl ;
    public final void rule__ForBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5021:1: ( rule__ForBody__Group__1__Impl )
            // InternalMGLang.g:5022:2: rule__ForBody__Group__1__Impl
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
    // InternalMGLang.g:5028:1: rule__ForBody__Group__1__Impl : ( ( rule__ForBody__CommandsAssignment_1 )* ) ;
    public final void rule__ForBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5032:1: ( ( ( rule__ForBody__CommandsAssignment_1 )* ) )
            // InternalMGLang.g:5033:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            {
            // InternalMGLang.g:5033:1: ( ( rule__ForBody__CommandsAssignment_1 )* )
            // InternalMGLang.g:5034:2: ( rule__ForBody__CommandsAssignment_1 )*
            {
             before(grammarAccess.getForBodyAccess().getCommandsAssignment_1()); 
            // InternalMGLang.g:5035:2: ( rule__ForBody__CommandsAssignment_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==51||LA43_0==53||LA43_0==58||LA43_0==61) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMGLang.g:5035:3: rule__ForBody__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ForBody__CommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalMGLang.g:5044:1: rule__IfElseSwitch__Group__0 : rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1 ;
    public final void rule__IfElseSwitch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5048:1: ( rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1 )
            // InternalMGLang.g:5049:2: rule__IfElseSwitch__Group__0__Impl rule__IfElseSwitch__Group__1
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
    // InternalMGLang.g:5056:1: rule__IfElseSwitch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__IfElseSwitch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5060:1: ( ( 'switch' ) )
            // InternalMGLang.g:5061:1: ( 'switch' )
            {
            // InternalMGLang.g:5061:1: ( 'switch' )
            // InternalMGLang.g:5062:2: 'switch'
            {
             before(grammarAccess.getIfElseSwitchAccess().getSwitchKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMGLang.g:5071:1: rule__IfElseSwitch__Group__1 : rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2 ;
    public final void rule__IfElseSwitch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5075:1: ( rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2 )
            // InternalMGLang.g:5076:2: rule__IfElseSwitch__Group__1__Impl rule__IfElseSwitch__Group__2
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
    // InternalMGLang.g:5083:1: rule__IfElseSwitch__Group__1__Impl : ( '{' ) ;
    public final void rule__IfElseSwitch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5087:1: ( ( '{' ) )
            // InternalMGLang.g:5088:1: ( '{' )
            {
            // InternalMGLang.g:5088:1: ( '{' )
            // InternalMGLang.g:5089:2: '{'
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
    // InternalMGLang.g:5098:1: rule__IfElseSwitch__Group__2 : rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3 ;
    public final void rule__IfElseSwitch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5102:1: ( rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3 )
            // InternalMGLang.g:5103:2: rule__IfElseSwitch__Group__2__Impl rule__IfElseSwitch__Group__3
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
    // InternalMGLang.g:5110:1: rule__IfElseSwitch__Group__2__Impl : ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) ) ;
    public final void rule__IfElseSwitch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5114:1: ( ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) ) )
            // InternalMGLang.g:5115:1: ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) )
            {
            // InternalMGLang.g:5115:1: ( ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* ) )
            // InternalMGLang.g:5116:2: ( ( rule__IfElseSwitch__CasesAssignment_2 ) ) ( ( rule__IfElseSwitch__CasesAssignment_2 )* )
            {
            // InternalMGLang.g:5116:2: ( ( rule__IfElseSwitch__CasesAssignment_2 ) )
            // InternalMGLang.g:5117:3: ( rule__IfElseSwitch__CasesAssignment_2 )
            {
             before(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            // InternalMGLang.g:5118:3: ( rule__IfElseSwitch__CasesAssignment_2 )
            // InternalMGLang.g:5118:4: rule__IfElseSwitch__CasesAssignment_2
            {
            pushFollow(FOLLOW_39);
            rule__IfElseSwitch__CasesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 

            }

            // InternalMGLang.g:5121:2: ( ( rule__IfElseSwitch__CasesAssignment_2 )* )
            // InternalMGLang.g:5122:3: ( rule__IfElseSwitch__CasesAssignment_2 )*
            {
             before(grammarAccess.getIfElseSwitchAccess().getCasesAssignment_2()); 
            // InternalMGLang.g:5123:3: ( rule__IfElseSwitch__CasesAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==54) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMGLang.g:5123:4: rule__IfElseSwitch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__IfElseSwitch__CasesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalMGLang.g:5132:1: rule__IfElseSwitch__Group__3 : rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4 ;
    public final void rule__IfElseSwitch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5136:1: ( rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4 )
            // InternalMGLang.g:5137:2: rule__IfElseSwitch__Group__3__Impl rule__IfElseSwitch__Group__4
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
    // InternalMGLang.g:5144:1: rule__IfElseSwitch__Group__3__Impl : ( ( rule__IfElseSwitch__DefaultAssignment_3 )? ) ;
    public final void rule__IfElseSwitch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5148:1: ( ( ( rule__IfElseSwitch__DefaultAssignment_3 )? ) )
            // InternalMGLang.g:5149:1: ( ( rule__IfElseSwitch__DefaultAssignment_3 )? )
            {
            // InternalMGLang.g:5149:1: ( ( rule__IfElseSwitch__DefaultAssignment_3 )? )
            // InternalMGLang.g:5150:2: ( rule__IfElseSwitch__DefaultAssignment_3 )?
            {
             before(grammarAccess.getIfElseSwitchAccess().getDefaultAssignment_3()); 
            // InternalMGLang.g:5151:2: ( rule__IfElseSwitch__DefaultAssignment_3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMGLang.g:5151:3: rule__IfElseSwitch__DefaultAssignment_3
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
    // InternalMGLang.g:5159:1: rule__IfElseSwitch__Group__4 : rule__IfElseSwitch__Group__4__Impl ;
    public final void rule__IfElseSwitch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5163:1: ( rule__IfElseSwitch__Group__4__Impl )
            // InternalMGLang.g:5164:2: rule__IfElseSwitch__Group__4__Impl
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
    // InternalMGLang.g:5170:1: rule__IfElseSwitch__Group__4__Impl : ( '}' ) ;
    public final void rule__IfElseSwitch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5174:1: ( ( '}' ) )
            // InternalMGLang.g:5175:1: ( '}' )
            {
            // InternalMGLang.g:5175:1: ( '}' )
            // InternalMGLang.g:5176:2: '}'
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
    // InternalMGLang.g:5186:1: rule__IfElseCase__Group__0 : rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1 ;
    public final void rule__IfElseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5190:1: ( rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1 )
            // InternalMGLang.g:5191:2: rule__IfElseCase__Group__0__Impl rule__IfElseCase__Group__1
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
    // InternalMGLang.g:5198:1: rule__IfElseCase__Group__0__Impl : ( 'case' ) ;
    public final void rule__IfElseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5202:1: ( ( 'case' ) )
            // InternalMGLang.g:5203:1: ( 'case' )
            {
            // InternalMGLang.g:5203:1: ( 'case' )
            // InternalMGLang.g:5204:2: 'case'
            {
             before(grammarAccess.getIfElseCaseAccess().getCaseKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMGLang.g:5213:1: rule__IfElseCase__Group__1 : rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2 ;
    public final void rule__IfElseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5217:1: ( rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2 )
            // InternalMGLang.g:5218:2: rule__IfElseCase__Group__1__Impl rule__IfElseCase__Group__2
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
    // InternalMGLang.g:5225:1: rule__IfElseCase__Group__1__Impl : ( ( rule__IfElseCase__ValAssignment_1 ) ) ;
    public final void rule__IfElseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5229:1: ( ( ( rule__IfElseCase__ValAssignment_1 ) ) )
            // InternalMGLang.g:5230:1: ( ( rule__IfElseCase__ValAssignment_1 ) )
            {
            // InternalMGLang.g:5230:1: ( ( rule__IfElseCase__ValAssignment_1 ) )
            // InternalMGLang.g:5231:2: ( rule__IfElseCase__ValAssignment_1 )
            {
             before(grammarAccess.getIfElseCaseAccess().getValAssignment_1()); 
            // InternalMGLang.g:5232:2: ( rule__IfElseCase__ValAssignment_1 )
            // InternalMGLang.g:5232:3: rule__IfElseCase__ValAssignment_1
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
    // InternalMGLang.g:5240:1: rule__IfElseCase__Group__2 : rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3 ;
    public final void rule__IfElseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5244:1: ( rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3 )
            // InternalMGLang.g:5245:2: rule__IfElseCase__Group__2__Impl rule__IfElseCase__Group__3
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
    // InternalMGLang.g:5252:1: rule__IfElseCase__Group__2__Impl : ( ':' ) ;
    public final void rule__IfElseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5256:1: ( ( ':' ) )
            // InternalMGLang.g:5257:1: ( ':' )
            {
            // InternalMGLang.g:5257:1: ( ':' )
            // InternalMGLang.g:5258:2: ':'
            {
             before(grammarAccess.getIfElseCaseAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMGLang.g:5267:1: rule__IfElseCase__Group__3 : rule__IfElseCase__Group__3__Impl ;
    public final void rule__IfElseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5271:1: ( rule__IfElseCase__Group__3__Impl )
            // InternalMGLang.g:5272:2: rule__IfElseCase__Group__3__Impl
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
    // InternalMGLang.g:5278:1: rule__IfElseCase__Group__3__Impl : ( ( rule__IfElseCase__BodyAssignment_3 ) ) ;
    public final void rule__IfElseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5282:1: ( ( ( rule__IfElseCase__BodyAssignment_3 ) ) )
            // InternalMGLang.g:5283:1: ( ( rule__IfElseCase__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:5283:1: ( ( rule__IfElseCase__BodyAssignment_3 ) )
            // InternalMGLang.g:5284:2: ( rule__IfElseCase__BodyAssignment_3 )
            {
             before(grammarAccess.getIfElseCaseAccess().getBodyAssignment_3()); 
            // InternalMGLang.g:5285:2: ( rule__IfElseCase__BodyAssignment_3 )
            // InternalMGLang.g:5285:3: rule__IfElseCase__BodyAssignment_3
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
    // InternalMGLang.g:5294:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5298:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalMGLang.g:5299:2: rule__Default__Group__0__Impl rule__Default__Group__1
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
    // InternalMGLang.g:5306:1: rule__Default__Group__0__Impl : ( 'default' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5310:1: ( ( 'default' ) )
            // InternalMGLang.g:5311:1: ( 'default' )
            {
            // InternalMGLang.g:5311:1: ( 'default' )
            // InternalMGLang.g:5312:2: 'default'
            {
             before(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMGLang.g:5321:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5325:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalMGLang.g:5326:2: rule__Default__Group__1__Impl rule__Default__Group__2
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
    // InternalMGLang.g:5333:1: rule__Default__Group__1__Impl : ( ':' ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5337:1: ( ( ':' ) )
            // InternalMGLang.g:5338:1: ( ':' )
            {
            // InternalMGLang.g:5338:1: ( ':' )
            // InternalMGLang.g:5339:2: ':'
            {
             before(grammarAccess.getDefaultAccess().getColonKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMGLang.g:5348:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5352:1: ( rule__Default__Group__2__Impl )
            // InternalMGLang.g:5353:2: rule__Default__Group__2__Impl
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
    // InternalMGLang.g:5359:1: rule__Default__Group__2__Impl : ( ruleCaseBody ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5363:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:5364:1: ( ruleCaseBody )
            {
            // InternalMGLang.g:5364:1: ( ruleCaseBody )
            // InternalMGLang.g:5365:2: ruleCaseBody
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
    // InternalMGLang.g:5375:1: rule__SwitchCase__Group__0 : rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 ;
    public final void rule__SwitchCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5379:1: ( rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1 )
            // InternalMGLang.g:5380:2: rule__SwitchCase__Group__0__Impl rule__SwitchCase__Group__1
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
    // InternalMGLang.g:5387:1: rule__SwitchCase__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5391:1: ( ( 'switch' ) )
            // InternalMGLang.g:5392:1: ( 'switch' )
            {
            // InternalMGLang.g:5392:1: ( 'switch' )
            // InternalMGLang.g:5393:2: 'switch'
            {
             before(grammarAccess.getSwitchCaseAccess().getSwitchKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMGLang.g:5402:1: rule__SwitchCase__Group__1 : rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 ;
    public final void rule__SwitchCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5406:1: ( rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2 )
            // InternalMGLang.g:5407:2: rule__SwitchCase__Group__1__Impl rule__SwitchCase__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMGLang.g:5414:1: rule__SwitchCase__Group__1__Impl : ( '(' ) ;
    public final void rule__SwitchCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5418:1: ( ( '(' ) )
            // InternalMGLang.g:5419:1: ( '(' )
            {
            // InternalMGLang.g:5419:1: ( '(' )
            // InternalMGLang.g:5420:2: '('
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
    // InternalMGLang.g:5429:1: rule__SwitchCase__Group__2 : rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 ;
    public final void rule__SwitchCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5433:1: ( rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3 )
            // InternalMGLang.g:5434:2: rule__SwitchCase__Group__2__Impl rule__SwitchCase__Group__3
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
    // InternalMGLang.g:5441:1: rule__SwitchCase__Group__2__Impl : ( ( rule__SwitchCase__AttributeAssignment_2 ) ) ;
    public final void rule__SwitchCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5445:1: ( ( ( rule__SwitchCase__AttributeAssignment_2 ) ) )
            // InternalMGLang.g:5446:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            {
            // InternalMGLang.g:5446:1: ( ( rule__SwitchCase__AttributeAssignment_2 ) )
            // InternalMGLang.g:5447:2: ( rule__SwitchCase__AttributeAssignment_2 )
            {
             before(grammarAccess.getSwitchCaseAccess().getAttributeAssignment_2()); 
            // InternalMGLang.g:5448:2: ( rule__SwitchCase__AttributeAssignment_2 )
            // InternalMGLang.g:5448:3: rule__SwitchCase__AttributeAssignment_2
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
    // InternalMGLang.g:5456:1: rule__SwitchCase__Group__3 : rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 ;
    public final void rule__SwitchCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5460:1: ( rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4 )
            // InternalMGLang.g:5461:2: rule__SwitchCase__Group__3__Impl rule__SwitchCase__Group__4
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
    // InternalMGLang.g:5468:1: rule__SwitchCase__Group__3__Impl : ( ')' ) ;
    public final void rule__SwitchCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5472:1: ( ( ')' ) )
            // InternalMGLang.g:5473:1: ( ')' )
            {
            // InternalMGLang.g:5473:1: ( ')' )
            // InternalMGLang.g:5474:2: ')'
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
    // InternalMGLang.g:5483:1: rule__SwitchCase__Group__4 : rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 ;
    public final void rule__SwitchCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5487:1: ( rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5 )
            // InternalMGLang.g:5488:2: rule__SwitchCase__Group__4__Impl rule__SwitchCase__Group__5
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
    // InternalMGLang.g:5495:1: rule__SwitchCase__Group__4__Impl : ( '{' ) ;
    public final void rule__SwitchCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5499:1: ( ( '{' ) )
            // InternalMGLang.g:5500:1: ( '{' )
            {
            // InternalMGLang.g:5500:1: ( '{' )
            // InternalMGLang.g:5501:2: '{'
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
    // InternalMGLang.g:5510:1: rule__SwitchCase__Group__5 : rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 ;
    public final void rule__SwitchCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5514:1: ( rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6 )
            // InternalMGLang.g:5515:2: rule__SwitchCase__Group__5__Impl rule__SwitchCase__Group__6
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
    // InternalMGLang.g:5522:1: rule__SwitchCase__Group__5__Impl : ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) ;
    public final void rule__SwitchCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5526:1: ( ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) ) )
            // InternalMGLang.g:5527:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            {
            // InternalMGLang.g:5527:1: ( ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* ) )
            // InternalMGLang.g:5528:2: ( ( rule__SwitchCase__CasesAssignment_5 ) ) ( ( rule__SwitchCase__CasesAssignment_5 )* )
            {
            // InternalMGLang.g:5528:2: ( ( rule__SwitchCase__CasesAssignment_5 ) )
            // InternalMGLang.g:5529:3: ( rule__SwitchCase__CasesAssignment_5 )
            {
             before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            // InternalMGLang.g:5530:3: ( rule__SwitchCase__CasesAssignment_5 )
            // InternalMGLang.g:5530:4: rule__SwitchCase__CasesAssignment_5
            {
            pushFollow(FOLLOW_39);
            rule__SwitchCase__CasesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 

            }

            // InternalMGLang.g:5533:2: ( ( rule__SwitchCase__CasesAssignment_5 )* )
            // InternalMGLang.g:5534:3: ( rule__SwitchCase__CasesAssignment_5 )*
            {
             before(grammarAccess.getSwitchCaseAccess().getCasesAssignment_5()); 
            // InternalMGLang.g:5535:3: ( rule__SwitchCase__CasesAssignment_5 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==54) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMGLang.g:5535:4: rule__SwitchCase__CasesAssignment_5
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__SwitchCase__CasesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalMGLang.g:5544:1: rule__SwitchCase__Group__6 : rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7 ;
    public final void rule__SwitchCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5548:1: ( rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7 )
            // InternalMGLang.g:5549:2: rule__SwitchCase__Group__6__Impl rule__SwitchCase__Group__7
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
    // InternalMGLang.g:5556:1: rule__SwitchCase__Group__6__Impl : ( ( rule__SwitchCase__DefaultAssignment_6 )? ) ;
    public final void rule__SwitchCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5560:1: ( ( ( rule__SwitchCase__DefaultAssignment_6 )? ) )
            // InternalMGLang.g:5561:1: ( ( rule__SwitchCase__DefaultAssignment_6 )? )
            {
            // InternalMGLang.g:5561:1: ( ( rule__SwitchCase__DefaultAssignment_6 )? )
            // InternalMGLang.g:5562:2: ( rule__SwitchCase__DefaultAssignment_6 )?
            {
             before(grammarAccess.getSwitchCaseAccess().getDefaultAssignment_6()); 
            // InternalMGLang.g:5563:2: ( rule__SwitchCase__DefaultAssignment_6 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMGLang.g:5563:3: rule__SwitchCase__DefaultAssignment_6
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
    // InternalMGLang.g:5571:1: rule__SwitchCase__Group__7 : rule__SwitchCase__Group__7__Impl ;
    public final void rule__SwitchCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5575:1: ( rule__SwitchCase__Group__7__Impl )
            // InternalMGLang.g:5576:2: rule__SwitchCase__Group__7__Impl
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
    // InternalMGLang.g:5582:1: rule__SwitchCase__Group__7__Impl : ( '}' ) ;
    public final void rule__SwitchCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5586:1: ( ( '}' ) )
            // InternalMGLang.g:5587:1: ( '}' )
            {
            // InternalMGLang.g:5587:1: ( '}' )
            // InternalMGLang.g:5588:2: '}'
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
    // InternalMGLang.g:5598:1: rule__CaseWithCast__Group__0 : rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1 ;
    public final void rule__CaseWithCast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5602:1: ( rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1 )
            // InternalMGLang.g:5603:2: rule__CaseWithCast__Group__0__Impl rule__CaseWithCast__Group__1
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
    // InternalMGLang.g:5610:1: rule__CaseWithCast__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseWithCast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5614:1: ( ( 'case' ) )
            // InternalMGLang.g:5615:1: ( 'case' )
            {
            // InternalMGLang.g:5615:1: ( 'case' )
            // InternalMGLang.g:5616:2: 'case'
            {
             before(grammarAccess.getCaseWithCastAccess().getCaseKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMGLang.g:5625:1: rule__CaseWithCast__Group__1 : rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2 ;
    public final void rule__CaseWithCast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5629:1: ( rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2 )
            // InternalMGLang.g:5630:2: rule__CaseWithCast__Group__1__Impl rule__CaseWithCast__Group__2
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
    // InternalMGLang.g:5637:1: rule__CaseWithCast__Group__1__Impl : ( ( rule__CaseWithCast__NodeAssignment_1 ) ) ;
    public final void rule__CaseWithCast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5641:1: ( ( ( rule__CaseWithCast__NodeAssignment_1 ) ) )
            // InternalMGLang.g:5642:1: ( ( rule__CaseWithCast__NodeAssignment_1 ) )
            {
            // InternalMGLang.g:5642:1: ( ( rule__CaseWithCast__NodeAssignment_1 ) )
            // InternalMGLang.g:5643:2: ( rule__CaseWithCast__NodeAssignment_1 )
            {
             before(grammarAccess.getCaseWithCastAccess().getNodeAssignment_1()); 
            // InternalMGLang.g:5644:2: ( rule__CaseWithCast__NodeAssignment_1 )
            // InternalMGLang.g:5644:3: rule__CaseWithCast__NodeAssignment_1
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
    // InternalMGLang.g:5652:1: rule__CaseWithCast__Group__2 : rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3 ;
    public final void rule__CaseWithCast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5656:1: ( rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3 )
            // InternalMGLang.g:5657:2: rule__CaseWithCast__Group__2__Impl rule__CaseWithCast__Group__3
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
    // InternalMGLang.g:5664:1: rule__CaseWithCast__Group__2__Impl : ( ( rule__CaseWithCast__Group_2__0 )? ) ;
    public final void rule__CaseWithCast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5668:1: ( ( ( rule__CaseWithCast__Group_2__0 )? ) )
            // InternalMGLang.g:5669:1: ( ( rule__CaseWithCast__Group_2__0 )? )
            {
            // InternalMGLang.g:5669:1: ( ( rule__CaseWithCast__Group_2__0 )? )
            // InternalMGLang.g:5670:2: ( rule__CaseWithCast__Group_2__0 )?
            {
             before(grammarAccess.getCaseWithCastAccess().getGroup_2()); 
            // InternalMGLang.g:5671:2: ( rule__CaseWithCast__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMGLang.g:5671:3: rule__CaseWithCast__Group_2__0
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
    // InternalMGLang.g:5679:1: rule__CaseWithCast__Group__3 : rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4 ;
    public final void rule__CaseWithCast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5683:1: ( rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4 )
            // InternalMGLang.g:5684:2: rule__CaseWithCast__Group__3__Impl rule__CaseWithCast__Group__4
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
    // InternalMGLang.g:5691:1: rule__CaseWithCast__Group__3__Impl : ( ':' ) ;
    public final void rule__CaseWithCast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5695:1: ( ( ':' ) )
            // InternalMGLang.g:5696:1: ( ':' )
            {
            // InternalMGLang.g:5696:1: ( ':' )
            // InternalMGLang.g:5697:2: ':'
            {
             before(grammarAccess.getCaseWithCastAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMGLang.g:5706:1: rule__CaseWithCast__Group__4 : rule__CaseWithCast__Group__4__Impl ;
    public final void rule__CaseWithCast__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5710:1: ( rule__CaseWithCast__Group__4__Impl )
            // InternalMGLang.g:5711:2: rule__CaseWithCast__Group__4__Impl
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
    // InternalMGLang.g:5717:1: rule__CaseWithCast__Group__4__Impl : ( ( rule__CaseWithCast__BodyAssignment_4 ) ) ;
    public final void rule__CaseWithCast__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5721:1: ( ( ( rule__CaseWithCast__BodyAssignment_4 ) ) )
            // InternalMGLang.g:5722:1: ( ( rule__CaseWithCast__BodyAssignment_4 ) )
            {
            // InternalMGLang.g:5722:1: ( ( rule__CaseWithCast__BodyAssignment_4 ) )
            // InternalMGLang.g:5723:2: ( rule__CaseWithCast__BodyAssignment_4 )
            {
             before(grammarAccess.getCaseWithCastAccess().getBodyAssignment_4()); 
            // InternalMGLang.g:5724:2: ( rule__CaseWithCast__BodyAssignment_4 )
            // InternalMGLang.g:5724:3: rule__CaseWithCast__BodyAssignment_4
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
    // InternalMGLang.g:5733:1: rule__CaseWithCast__Group_2__0 : rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1 ;
    public final void rule__CaseWithCast__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5737:1: ( rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1 )
            // InternalMGLang.g:5738:2: rule__CaseWithCast__Group_2__0__Impl rule__CaseWithCast__Group_2__1
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
    // InternalMGLang.g:5745:1: rule__CaseWithCast__Group_2__0__Impl : ( 'when' ) ;
    public final void rule__CaseWithCast__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5749:1: ( ( 'when' ) )
            // InternalMGLang.g:5750:1: ( 'when' )
            {
            // InternalMGLang.g:5750:1: ( 'when' )
            // InternalMGLang.g:5751:2: 'when'
            {
             before(grammarAccess.getCaseWithCastAccess().getWhenKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMGLang.g:5760:1: rule__CaseWithCast__Group_2__1 : rule__CaseWithCast__Group_2__1__Impl ;
    public final void rule__CaseWithCast__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5764:1: ( rule__CaseWithCast__Group_2__1__Impl )
            // InternalMGLang.g:5765:2: rule__CaseWithCast__Group_2__1__Impl
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
    // InternalMGLang.g:5771:1: rule__CaseWithCast__Group_2__1__Impl : ( ( rule__CaseWithCast__WhenAssignment_2_1 ) ) ;
    public final void rule__CaseWithCast__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5775:1: ( ( ( rule__CaseWithCast__WhenAssignment_2_1 ) ) )
            // InternalMGLang.g:5776:1: ( ( rule__CaseWithCast__WhenAssignment_2_1 ) )
            {
            // InternalMGLang.g:5776:1: ( ( rule__CaseWithCast__WhenAssignment_2_1 ) )
            // InternalMGLang.g:5777:2: ( rule__CaseWithCast__WhenAssignment_2_1 )
            {
             before(grammarAccess.getCaseWithCastAccess().getWhenAssignment_2_1()); 
            // InternalMGLang.g:5778:2: ( rule__CaseWithCast__WhenAssignment_2_1 )
            // InternalMGLang.g:5778:3: rule__CaseWithCast__WhenAssignment_2_1
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
    // InternalMGLang.g:5787:1: rule__CaseWithoutCast__Group__0 : rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1 ;
    public final void rule__CaseWithoutCast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5791:1: ( rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1 )
            // InternalMGLang.g:5792:2: rule__CaseWithoutCast__Group__0__Impl rule__CaseWithoutCast__Group__1
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
    // InternalMGLang.g:5799:1: rule__CaseWithoutCast__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseWithoutCast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5803:1: ( ( 'case' ) )
            // InternalMGLang.g:5804:1: ( 'case' )
            {
            // InternalMGLang.g:5804:1: ( 'case' )
            // InternalMGLang.g:5805:2: 'case'
            {
             before(grammarAccess.getCaseWithoutCastAccess().getCaseKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMGLang.g:5814:1: rule__CaseWithoutCast__Group__1 : rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2 ;
    public final void rule__CaseWithoutCast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5818:1: ( rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2 )
            // InternalMGLang.g:5819:2: rule__CaseWithoutCast__Group__1__Impl rule__CaseWithoutCast__Group__2
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
    // InternalMGLang.g:5826:1: rule__CaseWithoutCast__Group__1__Impl : ( ( rule__CaseWithoutCast__ValAssignment_1 ) ) ;
    public final void rule__CaseWithoutCast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5830:1: ( ( ( rule__CaseWithoutCast__ValAssignment_1 ) ) )
            // InternalMGLang.g:5831:1: ( ( rule__CaseWithoutCast__ValAssignment_1 ) )
            {
            // InternalMGLang.g:5831:1: ( ( rule__CaseWithoutCast__ValAssignment_1 ) )
            // InternalMGLang.g:5832:2: ( rule__CaseWithoutCast__ValAssignment_1 )
            {
             before(grammarAccess.getCaseWithoutCastAccess().getValAssignment_1()); 
            // InternalMGLang.g:5833:2: ( rule__CaseWithoutCast__ValAssignment_1 )
            // InternalMGLang.g:5833:3: rule__CaseWithoutCast__ValAssignment_1
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
    // InternalMGLang.g:5841:1: rule__CaseWithoutCast__Group__2 : rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3 ;
    public final void rule__CaseWithoutCast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5845:1: ( rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3 )
            // InternalMGLang.g:5846:2: rule__CaseWithoutCast__Group__2__Impl rule__CaseWithoutCast__Group__3
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
    // InternalMGLang.g:5853:1: rule__CaseWithoutCast__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseWithoutCast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5857:1: ( ( ':' ) )
            // InternalMGLang.g:5858:1: ( ':' )
            {
            // InternalMGLang.g:5858:1: ( ':' )
            // InternalMGLang.g:5859:2: ':'
            {
             before(grammarAccess.getCaseWithoutCastAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMGLang.g:5868:1: rule__CaseWithoutCast__Group__3 : rule__CaseWithoutCast__Group__3__Impl ;
    public final void rule__CaseWithoutCast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5872:1: ( rule__CaseWithoutCast__Group__3__Impl )
            // InternalMGLang.g:5873:2: rule__CaseWithoutCast__Group__3__Impl
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
    // InternalMGLang.g:5879:1: rule__CaseWithoutCast__Group__3__Impl : ( ( rule__CaseWithoutCast__BodyAssignment_3 ) ) ;
    public final void rule__CaseWithoutCast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5883:1: ( ( ( rule__CaseWithoutCast__BodyAssignment_3 ) ) )
            // InternalMGLang.g:5884:1: ( ( rule__CaseWithoutCast__BodyAssignment_3 ) )
            {
            // InternalMGLang.g:5884:1: ( ( rule__CaseWithoutCast__BodyAssignment_3 ) )
            // InternalMGLang.g:5885:2: ( rule__CaseWithoutCast__BodyAssignment_3 )
            {
             before(grammarAccess.getCaseWithoutCastAccess().getBodyAssignment_3()); 
            // InternalMGLang.g:5886:2: ( rule__CaseWithoutCast__BodyAssignment_3 )
            // InternalMGLang.g:5886:3: rule__CaseWithoutCast__BodyAssignment_3
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
    // InternalMGLang.g:5895:1: rule__CaseBody__Group_0__0 : rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 ;
    public final void rule__CaseBody__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5899:1: ( rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1 )
            // InternalMGLang.g:5900:2: rule__CaseBody__Group_0__0__Impl rule__CaseBody__Group_0__1
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
    // InternalMGLang.g:5907:1: rule__CaseBody__Group_0__0__Impl : ( () ) ;
    public final void rule__CaseBody__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5911:1: ( ( () ) )
            // InternalMGLang.g:5912:1: ( () )
            {
            // InternalMGLang.g:5912:1: ( () )
            // InternalMGLang.g:5913:2: ()
            {
             before(grammarAccess.getCaseBodyAccess().getCaseBodyAction_0_0()); 
            // InternalMGLang.g:5914:2: ()
            // InternalMGLang.g:5914:3: 
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
    // InternalMGLang.g:5922:1: rule__CaseBody__Group_0__1 : rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 ;
    public final void rule__CaseBody__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5926:1: ( rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2 )
            // InternalMGLang.g:5927:2: rule__CaseBody__Group_0__1__Impl rule__CaseBody__Group_0__2
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
    // InternalMGLang.g:5934:1: rule__CaseBody__Group_0__1__Impl : ( '{' ) ;
    public final void rule__CaseBody__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5938:1: ( ( '{' ) )
            // InternalMGLang.g:5939:1: ( '{' )
            {
            // InternalMGLang.g:5939:1: ( '{' )
            // InternalMGLang.g:5940:2: '{'
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
    // InternalMGLang.g:5949:1: rule__CaseBody__Group_0__2 : rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 ;
    public final void rule__CaseBody__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5953:1: ( rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3 )
            // InternalMGLang.g:5954:2: rule__CaseBody__Group_0__2__Impl rule__CaseBody__Group_0__3
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
    // InternalMGLang.g:5961:1: rule__CaseBody__Group_0__2__Impl : ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) ;
    public final void rule__CaseBody__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5965:1: ( ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* ) )
            // InternalMGLang.g:5966:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            {
            // InternalMGLang.g:5966:1: ( ( rule__CaseBody__ExpressionsAssignment_0_2 )* )
            // InternalMGLang.g:5967:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            {
             before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_0_2()); 
            // InternalMGLang.g:5968:2: ( rule__CaseBody__ExpressionsAssignment_0_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==51||LA49_0==53||LA49_0==58||LA49_0==61) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMGLang.g:5968:3: rule__CaseBody__ExpressionsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__CaseBody__ExpressionsAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalMGLang.g:5976:1: rule__CaseBody__Group_0__3 : rule__CaseBody__Group_0__3__Impl ;
    public final void rule__CaseBody__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5980:1: ( rule__CaseBody__Group_0__3__Impl )
            // InternalMGLang.g:5981:2: rule__CaseBody__Group_0__3__Impl
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
    // InternalMGLang.g:5987:1: rule__CaseBody__Group_0__3__Impl : ( '}' ) ;
    public final void rule__CaseBody__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:5991:1: ( ( '}' ) )
            // InternalMGLang.g:5992:1: ( '}' )
            {
            // InternalMGLang.g:5992:1: ( '}' )
            // InternalMGLang.g:5993:2: '}'
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
    // InternalMGLang.g:6003:1: rule__CaseBody__Group_1__0 : rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1 ;
    public final void rule__CaseBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6007:1: ( rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1 )
            // InternalMGLang.g:6008:2: rule__CaseBody__Group_1__0__Impl rule__CaseBody__Group_1__1
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
    // InternalMGLang.g:6015:1: rule__CaseBody__Group_1__0__Impl : ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__CaseBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6019:1: ( ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) ) )
            // InternalMGLang.g:6020:1: ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) )
            {
            // InternalMGLang.g:6020:1: ( ( rule__CaseBody__ExpressionsAssignment_1_0 ) )
            // InternalMGLang.g:6021:2: ( rule__CaseBody__ExpressionsAssignment_1_0 )
            {
             before(grammarAccess.getCaseBodyAccess().getExpressionsAssignment_1_0()); 
            // InternalMGLang.g:6022:2: ( rule__CaseBody__ExpressionsAssignment_1_0 )
            // InternalMGLang.g:6022:3: rule__CaseBody__ExpressionsAssignment_1_0
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
    // InternalMGLang.g:6030:1: rule__CaseBody__Group_1__1 : rule__CaseBody__Group_1__1__Impl ;
    public final void rule__CaseBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6034:1: ( rule__CaseBody__Group_1__1__Impl )
            // InternalMGLang.g:6035:2: rule__CaseBody__Group_1__1__Impl
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
    // InternalMGLang.g:6041:1: rule__CaseBody__Group_1__1__Impl : ( RULE_NEWLINE ) ;
    public final void rule__CaseBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6045:1: ( ( RULE_NEWLINE ) )
            // InternalMGLang.g:6046:1: ( RULE_NEWLINE )
            {
            // InternalMGLang.g:6046:1: ( RULE_NEWLINE )
            // InternalMGLang.g:6047:2: RULE_NEWLINE
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
    // InternalMGLang.g:6057:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6061:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalMGLang.g:6062:2: rule__List__Group__0__Impl rule__List__Group__1
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
    // InternalMGLang.g:6069:1: rule__List__Group__0__Impl : ( 'List' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6073:1: ( ( 'List' ) )
            // InternalMGLang.g:6074:1: ( 'List' )
            {
            // InternalMGLang.g:6074:1: ( 'List' )
            // InternalMGLang.g:6075:2: 'List'
            {
             before(grammarAccess.getListAccess().getListKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMGLang.g:6084:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6088:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalMGLang.g:6089:2: rule__List__Group__1__Impl rule__List__Group__2
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
    // InternalMGLang.g:6096:1: rule__List__Group__1__Impl : ( ( rule__List__NameAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6100:1: ( ( ( rule__List__NameAssignment_1 ) ) )
            // InternalMGLang.g:6101:1: ( ( rule__List__NameAssignment_1 ) )
            {
            // InternalMGLang.g:6101:1: ( ( rule__List__NameAssignment_1 ) )
            // InternalMGLang.g:6102:2: ( rule__List__NameAssignment_1 )
            {
             before(grammarAccess.getListAccess().getNameAssignment_1()); 
            // InternalMGLang.g:6103:2: ( rule__List__NameAssignment_1 )
            // InternalMGLang.g:6103:3: rule__List__NameAssignment_1
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
    // InternalMGLang.g:6111:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6115:1: ( rule__List__Group__2__Impl )
            // InternalMGLang.g:6116:2: rule__List__Group__2__Impl
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
    // InternalMGLang.g:6122:1: rule__List__Group__2__Impl : ( ( rule__List__Group_2__0 )? ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6126:1: ( ( ( rule__List__Group_2__0 )? ) )
            // InternalMGLang.g:6127:1: ( ( rule__List__Group_2__0 )? )
            {
            // InternalMGLang.g:6127:1: ( ( rule__List__Group_2__0 )? )
            // InternalMGLang.g:6128:2: ( rule__List__Group_2__0 )?
            {
             before(grammarAccess.getListAccess().getGroup_2()); 
            // InternalMGLang.g:6129:2: ( rule__List__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ASSIGNMENT_OP) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMGLang.g:6129:3: rule__List__Group_2__0
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
    // InternalMGLang.g:6138:1: rule__List__Group_2__0 : rule__List__Group_2__0__Impl rule__List__Group_2__1 ;
    public final void rule__List__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6142:1: ( rule__List__Group_2__0__Impl rule__List__Group_2__1 )
            // InternalMGLang.g:6143:2: rule__List__Group_2__0__Impl rule__List__Group_2__1
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
    // InternalMGLang.g:6150:1: rule__List__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__List__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6154:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:6155:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:6155:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:6156:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:6165:1: rule__List__Group_2__1 : rule__List__Group_2__1__Impl ;
    public final void rule__List__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6169:1: ( rule__List__Group_2__1__Impl )
            // InternalMGLang.g:6170:2: rule__List__Group_2__1__Impl
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
    // InternalMGLang.g:6176:1: rule__List__Group_2__1__Impl : ( ( rule__List__CreatedByAssignment_2_1 ) ) ;
    public final void rule__List__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6180:1: ( ( ( rule__List__CreatedByAssignment_2_1 ) ) )
            // InternalMGLang.g:6181:1: ( ( rule__List__CreatedByAssignment_2_1 ) )
            {
            // InternalMGLang.g:6181:1: ( ( rule__List__CreatedByAssignment_2_1 ) )
            // InternalMGLang.g:6182:2: ( rule__List__CreatedByAssignment_2_1 )
            {
             before(grammarAccess.getListAccess().getCreatedByAssignment_2_1()); 
            // InternalMGLang.g:6183:2: ( rule__List__CreatedByAssignment_2_1 )
            // InternalMGLang.g:6183:3: rule__List__CreatedByAssignment_2_1
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
    // InternalMGLang.g:6192:1: rule__ListAdHoc__Group__0 : rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 ;
    public final void rule__ListAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6196:1: ( rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1 )
            // InternalMGLang.g:6197:2: rule__ListAdHoc__Group__0__Impl rule__ListAdHoc__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalMGLang.g:6204:1: rule__ListAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__ListAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6208:1: ( ( '[' ) )
            // InternalMGLang.g:6209:1: ( '[' )
            {
            // InternalMGLang.g:6209:1: ( '[' )
            // InternalMGLang.g:6210:2: '['
            {
             before(grammarAccess.getListAdHocAccess().getLeftSquareBracketKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMGLang.g:6219:1: rule__ListAdHoc__Group__1 : rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 ;
    public final void rule__ListAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6223:1: ( rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2 )
            // InternalMGLang.g:6224:2: rule__ListAdHoc__Group__1__Impl rule__ListAdHoc__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMGLang.g:6231:1: rule__ListAdHoc__Group__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) ;
    public final void rule__ListAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6235:1: ( ( ( rule__ListAdHoc__ElementsAssignment_1 ) ) )
            // InternalMGLang.g:6236:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            {
            // InternalMGLang.g:6236:1: ( ( rule__ListAdHoc__ElementsAssignment_1 ) )
            // InternalMGLang.g:6237:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            {
             before(grammarAccess.getListAdHocAccess().getElementsAssignment_1()); 
            // InternalMGLang.g:6238:2: ( rule__ListAdHoc__ElementsAssignment_1 )
            // InternalMGLang.g:6238:3: rule__ListAdHoc__ElementsAssignment_1
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
    // InternalMGLang.g:6246:1: rule__ListAdHoc__Group__2 : rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 ;
    public final void rule__ListAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6250:1: ( rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3 )
            // InternalMGLang.g:6251:2: rule__ListAdHoc__Group__2__Impl rule__ListAdHoc__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalMGLang.g:6258:1: rule__ListAdHoc__Group__2__Impl : ( ( rule__ListAdHoc__Group_2__0 )* ) ;
    public final void rule__ListAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6262:1: ( ( ( rule__ListAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:6263:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:6263:1: ( ( rule__ListAdHoc__Group_2__0 )* )
            // InternalMGLang.g:6264:2: ( rule__ListAdHoc__Group_2__0 )*
            {
             before(grammarAccess.getListAdHocAccess().getGroup_2()); 
            // InternalMGLang.g:6265:2: ( rule__ListAdHoc__Group_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==45) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalMGLang.g:6265:3: rule__ListAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ListAdHoc__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalMGLang.g:6273:1: rule__ListAdHoc__Group__3 : rule__ListAdHoc__Group__3__Impl ;
    public final void rule__ListAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6277:1: ( rule__ListAdHoc__Group__3__Impl )
            // InternalMGLang.g:6278:2: rule__ListAdHoc__Group__3__Impl
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
    // InternalMGLang.g:6284:1: rule__ListAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__ListAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6288:1: ( ( ']' ) )
            // InternalMGLang.g:6289:1: ( ']' )
            {
            // InternalMGLang.g:6289:1: ( ']' )
            // InternalMGLang.g:6290:2: ']'
            {
             before(grammarAccess.getListAdHocAccess().getRightSquareBracketKeyword_3()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMGLang.g:6300:1: rule__ListAdHoc__Group_2__0 : rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 ;
    public final void rule__ListAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6304:1: ( rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1 )
            // InternalMGLang.g:6305:2: rule__ListAdHoc__Group_2__0__Impl rule__ListAdHoc__Group_2__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalMGLang.g:6312:1: rule__ListAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6316:1: ( ( ',' ) )
            // InternalMGLang.g:6317:1: ( ',' )
            {
            // InternalMGLang.g:6317:1: ( ',' )
            // InternalMGLang.g:6318:2: ','
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
    // InternalMGLang.g:6327:1: rule__ListAdHoc__Group_2__1 : rule__ListAdHoc__Group_2__1__Impl ;
    public final void rule__ListAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6331:1: ( rule__ListAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:6332:2: rule__ListAdHoc__Group_2__1__Impl
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
    // InternalMGLang.g:6338:1: rule__ListAdHoc__Group_2__1__Impl : ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) ;
    public final void rule__ListAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6342:1: ( ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) ) )
            // InternalMGLang.g:6343:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            {
            // InternalMGLang.g:6343:1: ( ( rule__ListAdHoc__ElementsAssignment_2_1 ) )
            // InternalMGLang.g:6344:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getListAdHocAccess().getElementsAssignment_2_1()); 
            // InternalMGLang.g:6345:2: ( rule__ListAdHoc__ElementsAssignment_2_1 )
            // InternalMGLang.g:6345:3: rule__ListAdHoc__ElementsAssignment_2_1
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
    // InternalMGLang.g:6354:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6358:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalMGLang.g:6359:2: rule__Map__Group__0__Impl rule__Map__Group__1
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
    // InternalMGLang.g:6366:1: rule__Map__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6370:1: ( ( 'Map' ) )
            // InternalMGLang.g:6371:1: ( 'Map' )
            {
            // InternalMGLang.g:6371:1: ( 'Map' )
            // InternalMGLang.g:6372:2: 'Map'
            {
             before(grammarAccess.getMapAccess().getMapKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMGLang.g:6381:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6385:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // InternalMGLang.g:6386:2: rule__Map__Group__1__Impl rule__Map__Group__2
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
    // InternalMGLang.g:6393:1: rule__Map__Group__1__Impl : ( ( rule__Map__NameAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6397:1: ( ( ( rule__Map__NameAssignment_1 ) ) )
            // InternalMGLang.g:6398:1: ( ( rule__Map__NameAssignment_1 ) )
            {
            // InternalMGLang.g:6398:1: ( ( rule__Map__NameAssignment_1 ) )
            // InternalMGLang.g:6399:2: ( rule__Map__NameAssignment_1 )
            {
             before(grammarAccess.getMapAccess().getNameAssignment_1()); 
            // InternalMGLang.g:6400:2: ( rule__Map__NameAssignment_1 )
            // InternalMGLang.g:6400:3: rule__Map__NameAssignment_1
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
    // InternalMGLang.g:6408:1: rule__Map__Group__2 : rule__Map__Group__2__Impl ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6412:1: ( rule__Map__Group__2__Impl )
            // InternalMGLang.g:6413:2: rule__Map__Group__2__Impl
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
    // InternalMGLang.g:6419:1: rule__Map__Group__2__Impl : ( ( rule__Map__Group_2__0 )? ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6423:1: ( ( ( rule__Map__Group_2__0 )? ) )
            // InternalMGLang.g:6424:1: ( ( rule__Map__Group_2__0 )? )
            {
            // InternalMGLang.g:6424:1: ( ( rule__Map__Group_2__0 )? )
            // InternalMGLang.g:6425:2: ( rule__Map__Group_2__0 )?
            {
             before(grammarAccess.getMapAccess().getGroup_2()); 
            // InternalMGLang.g:6426:2: ( rule__Map__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ASSIGNMENT_OP) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMGLang.g:6426:3: rule__Map__Group_2__0
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
    // InternalMGLang.g:6435:1: rule__Map__Group_2__0 : rule__Map__Group_2__0__Impl rule__Map__Group_2__1 ;
    public final void rule__Map__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6439:1: ( rule__Map__Group_2__0__Impl rule__Map__Group_2__1 )
            // InternalMGLang.g:6440:2: rule__Map__Group_2__0__Impl rule__Map__Group_2__1
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
    // InternalMGLang.g:6447:1: rule__Map__Group_2__0__Impl : ( RULE_ASSIGNMENT_OP ) ;
    public final void rule__Map__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6451:1: ( ( RULE_ASSIGNMENT_OP ) )
            // InternalMGLang.g:6452:1: ( RULE_ASSIGNMENT_OP )
            {
            // InternalMGLang.g:6452:1: ( RULE_ASSIGNMENT_OP )
            // InternalMGLang.g:6453:2: RULE_ASSIGNMENT_OP
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
    // InternalMGLang.g:6462:1: rule__Map__Group_2__1 : rule__Map__Group_2__1__Impl ;
    public final void rule__Map__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6466:1: ( rule__Map__Group_2__1__Impl )
            // InternalMGLang.g:6467:2: rule__Map__Group_2__1__Impl
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
    // InternalMGLang.g:6473:1: rule__Map__Group_2__1__Impl : ( ( rule__Map__CreatedByAssignment_2_1 ) ) ;
    public final void rule__Map__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6477:1: ( ( ( rule__Map__CreatedByAssignment_2_1 ) ) )
            // InternalMGLang.g:6478:1: ( ( rule__Map__CreatedByAssignment_2_1 ) )
            {
            // InternalMGLang.g:6478:1: ( ( rule__Map__CreatedByAssignment_2_1 ) )
            // InternalMGLang.g:6479:2: ( rule__Map__CreatedByAssignment_2_1 )
            {
             before(grammarAccess.getMapAccess().getCreatedByAssignment_2_1()); 
            // InternalMGLang.g:6480:2: ( rule__Map__CreatedByAssignment_2_1 )
            // InternalMGLang.g:6480:3: rule__Map__CreatedByAssignment_2_1
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
    // InternalMGLang.g:6489:1: rule__MapAdHoc__Group__0 : rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 ;
    public final void rule__MapAdHoc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6493:1: ( rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1 )
            // InternalMGLang.g:6494:2: rule__MapAdHoc__Group__0__Impl rule__MapAdHoc__Group__1
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
    // InternalMGLang.g:6501:1: rule__MapAdHoc__Group__0__Impl : ( '[' ) ;
    public final void rule__MapAdHoc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6505:1: ( ( '[' ) )
            // InternalMGLang.g:6506:1: ( '[' )
            {
            // InternalMGLang.g:6506:1: ( '[' )
            // InternalMGLang.g:6507:2: '['
            {
             before(grammarAccess.getMapAdHocAccess().getLeftSquareBracketKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMGLang.g:6516:1: rule__MapAdHoc__Group__1 : rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 ;
    public final void rule__MapAdHoc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6520:1: ( rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2 )
            // InternalMGLang.g:6521:2: rule__MapAdHoc__Group__1__Impl rule__MapAdHoc__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMGLang.g:6528:1: rule__MapAdHoc__Group__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) ;
    public final void rule__MapAdHoc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6532:1: ( ( ( rule__MapAdHoc__EntriesAssignment_1 ) ) )
            // InternalMGLang.g:6533:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            {
            // InternalMGLang.g:6533:1: ( ( rule__MapAdHoc__EntriesAssignment_1 ) )
            // InternalMGLang.g:6534:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            {
             before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_1()); 
            // InternalMGLang.g:6535:2: ( rule__MapAdHoc__EntriesAssignment_1 )
            // InternalMGLang.g:6535:3: rule__MapAdHoc__EntriesAssignment_1
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
    // InternalMGLang.g:6543:1: rule__MapAdHoc__Group__2 : rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 ;
    public final void rule__MapAdHoc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6547:1: ( rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3 )
            // InternalMGLang.g:6548:2: rule__MapAdHoc__Group__2__Impl rule__MapAdHoc__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalMGLang.g:6555:1: rule__MapAdHoc__Group__2__Impl : ( ( rule__MapAdHoc__Group_2__0 )* ) ;
    public final void rule__MapAdHoc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6559:1: ( ( ( rule__MapAdHoc__Group_2__0 )* ) )
            // InternalMGLang.g:6560:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            {
            // InternalMGLang.g:6560:1: ( ( rule__MapAdHoc__Group_2__0 )* )
            // InternalMGLang.g:6561:2: ( rule__MapAdHoc__Group_2__0 )*
            {
             before(grammarAccess.getMapAdHocAccess().getGroup_2()); 
            // InternalMGLang.g:6562:2: ( rule__MapAdHoc__Group_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==45) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMGLang.g:6562:3: rule__MapAdHoc__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MapAdHoc__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalMGLang.g:6570:1: rule__MapAdHoc__Group__3 : rule__MapAdHoc__Group__3__Impl ;
    public final void rule__MapAdHoc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6574:1: ( rule__MapAdHoc__Group__3__Impl )
            // InternalMGLang.g:6575:2: rule__MapAdHoc__Group__3__Impl
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
    // InternalMGLang.g:6581:1: rule__MapAdHoc__Group__3__Impl : ( ']' ) ;
    public final void rule__MapAdHoc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6585:1: ( ( ']' ) )
            // InternalMGLang.g:6586:1: ( ']' )
            {
            // InternalMGLang.g:6586:1: ( ']' )
            // InternalMGLang.g:6587:2: ']'
            {
             before(grammarAccess.getMapAdHocAccess().getRightSquareBracketKeyword_3()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMGLang.g:6597:1: rule__MapAdHoc__Group_2__0 : rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 ;
    public final void rule__MapAdHoc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6601:1: ( rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1 )
            // InternalMGLang.g:6602:2: rule__MapAdHoc__Group_2__0__Impl rule__MapAdHoc__Group_2__1
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
    // InternalMGLang.g:6609:1: rule__MapAdHoc__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MapAdHoc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6613:1: ( ( ',' ) )
            // InternalMGLang.g:6614:1: ( ',' )
            {
            // InternalMGLang.g:6614:1: ( ',' )
            // InternalMGLang.g:6615:2: ','
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
    // InternalMGLang.g:6624:1: rule__MapAdHoc__Group_2__1 : rule__MapAdHoc__Group_2__1__Impl ;
    public final void rule__MapAdHoc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6628:1: ( rule__MapAdHoc__Group_2__1__Impl )
            // InternalMGLang.g:6629:2: rule__MapAdHoc__Group_2__1__Impl
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
    // InternalMGLang.g:6635:1: rule__MapAdHoc__Group_2__1__Impl : ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) ;
    public final void rule__MapAdHoc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6639:1: ( ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) ) )
            // InternalMGLang.g:6640:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            {
            // InternalMGLang.g:6640:1: ( ( rule__MapAdHoc__EntriesAssignment_2_1 ) )
            // InternalMGLang.g:6641:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            {
             before(grammarAccess.getMapAdHocAccess().getEntriesAssignment_2_1()); 
            // InternalMGLang.g:6642:2: ( rule__MapAdHoc__EntriesAssignment_2_1 )
            // InternalMGLang.g:6642:3: rule__MapAdHoc__EntriesAssignment_2_1
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
    // InternalMGLang.g:6651:1: rule__MapTupel__Group__0 : rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 ;
    public final void rule__MapTupel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6655:1: ( rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1 )
            // InternalMGLang.g:6656:2: rule__MapTupel__Group__0__Impl rule__MapTupel__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalMGLang.g:6663:1: rule__MapTupel__Group__0__Impl : ( '(' ) ;
    public final void rule__MapTupel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6667:1: ( ( '(' ) )
            // InternalMGLang.g:6668:1: ( '(' )
            {
            // InternalMGLang.g:6668:1: ( '(' )
            // InternalMGLang.g:6669:2: '('
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
    // InternalMGLang.g:6678:1: rule__MapTupel__Group__1 : rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 ;
    public final void rule__MapTupel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6682:1: ( rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2 )
            // InternalMGLang.g:6683:2: rule__MapTupel__Group__1__Impl rule__MapTupel__Group__2
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
    // InternalMGLang.g:6690:1: rule__MapTupel__Group__1__Impl : ( ( rule__MapTupel__KeyAssignment_1 ) ) ;
    public final void rule__MapTupel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6694:1: ( ( ( rule__MapTupel__KeyAssignment_1 ) ) )
            // InternalMGLang.g:6695:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            {
            // InternalMGLang.g:6695:1: ( ( rule__MapTupel__KeyAssignment_1 ) )
            // InternalMGLang.g:6696:2: ( rule__MapTupel__KeyAssignment_1 )
            {
             before(grammarAccess.getMapTupelAccess().getKeyAssignment_1()); 
            // InternalMGLang.g:6697:2: ( rule__MapTupel__KeyAssignment_1 )
            // InternalMGLang.g:6697:3: rule__MapTupel__KeyAssignment_1
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
    // InternalMGLang.g:6705:1: rule__MapTupel__Group__2 : rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 ;
    public final void rule__MapTupel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6709:1: ( rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3 )
            // InternalMGLang.g:6710:2: rule__MapTupel__Group__2__Impl rule__MapTupel__Group__3
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
    // InternalMGLang.g:6717:1: rule__MapTupel__Group__2__Impl : ( ',' ) ;
    public final void rule__MapTupel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6721:1: ( ( ',' ) )
            // InternalMGLang.g:6722:1: ( ',' )
            {
            // InternalMGLang.g:6722:1: ( ',' )
            // InternalMGLang.g:6723:2: ','
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
    // InternalMGLang.g:6732:1: rule__MapTupel__Group__3 : rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 ;
    public final void rule__MapTupel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6736:1: ( rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4 )
            // InternalMGLang.g:6737:2: rule__MapTupel__Group__3__Impl rule__MapTupel__Group__4
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
    // InternalMGLang.g:6744:1: rule__MapTupel__Group__3__Impl : ( ( rule__MapTupel__ValueAssignment_3 ) ) ;
    public final void rule__MapTupel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6748:1: ( ( ( rule__MapTupel__ValueAssignment_3 ) ) )
            // InternalMGLang.g:6749:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            {
            // InternalMGLang.g:6749:1: ( ( rule__MapTupel__ValueAssignment_3 ) )
            // InternalMGLang.g:6750:2: ( rule__MapTupel__ValueAssignment_3 )
            {
             before(grammarAccess.getMapTupelAccess().getValueAssignment_3()); 
            // InternalMGLang.g:6751:2: ( rule__MapTupel__ValueAssignment_3 )
            // InternalMGLang.g:6751:3: rule__MapTupel__ValueAssignment_3
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
    // InternalMGLang.g:6759:1: rule__MapTupel__Group__4 : rule__MapTupel__Group__4__Impl ;
    public final void rule__MapTupel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6763:1: ( rule__MapTupel__Group__4__Impl )
            // InternalMGLang.g:6764:2: rule__MapTupel__Group__4__Impl
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
    // InternalMGLang.g:6770:1: rule__MapTupel__Group__4__Impl : ( ')' ) ;
    public final void rule__MapTupel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6774:1: ( ( ')' ) )
            // InternalMGLang.g:6775:1: ( ')' )
            {
            // InternalMGLang.g:6775:1: ( ')' )
            // InternalMGLang.g:6776:2: ')'
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
    // InternalMGLang.g:6786:1: rule__ForRange__Group__0 : rule__ForRange__Group__0__Impl rule__ForRange__Group__1 ;
    public final void rule__ForRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6790:1: ( rule__ForRange__Group__0__Impl rule__ForRange__Group__1 )
            // InternalMGLang.g:6791:2: rule__ForRange__Group__0__Impl rule__ForRange__Group__1
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
    // InternalMGLang.g:6798:1: rule__ForRange__Group__0__Impl : ( ( rule__ForRange__StartAssignment_0 ) ) ;
    public final void rule__ForRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6802:1: ( ( ( rule__ForRange__StartAssignment_0 ) ) )
            // InternalMGLang.g:6803:1: ( ( rule__ForRange__StartAssignment_0 ) )
            {
            // InternalMGLang.g:6803:1: ( ( rule__ForRange__StartAssignment_0 ) )
            // InternalMGLang.g:6804:2: ( rule__ForRange__StartAssignment_0 )
            {
             before(grammarAccess.getForRangeAccess().getStartAssignment_0()); 
            // InternalMGLang.g:6805:2: ( rule__ForRange__StartAssignment_0 )
            // InternalMGLang.g:6805:3: rule__ForRange__StartAssignment_0
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
    // InternalMGLang.g:6813:1: rule__ForRange__Group__1 : rule__ForRange__Group__1__Impl rule__ForRange__Group__2 ;
    public final void rule__ForRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6817:1: ( rule__ForRange__Group__1__Impl rule__ForRange__Group__2 )
            // InternalMGLang.g:6818:2: rule__ForRange__Group__1__Impl rule__ForRange__Group__2
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
    // InternalMGLang.g:6825:1: rule__ForRange__Group__1__Impl : ( ':' ) ;
    public final void rule__ForRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6829:1: ( ( ':' ) )
            // InternalMGLang.g:6830:1: ( ':' )
            {
            // InternalMGLang.g:6830:1: ( ':' )
            // InternalMGLang.g:6831:2: ':'
            {
             before(grammarAccess.getForRangeAccess().getColonKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMGLang.g:6840:1: rule__ForRange__Group__2 : rule__ForRange__Group__2__Impl ;
    public final void rule__ForRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6844:1: ( rule__ForRange__Group__2__Impl )
            // InternalMGLang.g:6845:2: rule__ForRange__Group__2__Impl
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
    // InternalMGLang.g:6851:1: rule__ForRange__Group__2__Impl : ( ( rule__ForRange__EndAssignment_2 ) ) ;
    public final void rule__ForRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6855:1: ( ( ( rule__ForRange__EndAssignment_2 ) ) )
            // InternalMGLang.g:6856:1: ( ( rule__ForRange__EndAssignment_2 ) )
            {
            // InternalMGLang.g:6856:1: ( ( rule__ForRange__EndAssignment_2 ) )
            // InternalMGLang.g:6857:2: ( rule__ForRange__EndAssignment_2 )
            {
             before(grammarAccess.getForRangeAccess().getEndAssignment_2()); 
            // InternalMGLang.g:6858:2: ( rule__ForRange__EndAssignment_2 )
            // InternalMGLang.g:6858:3: rule__ForRange__EndAssignment_2
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
    // InternalMGLang.g:6867:1: rule__TertiaryExpression__Group__0 : rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 ;
    public final void rule__TertiaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6871:1: ( rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1 )
            // InternalMGLang.g:6872:2: rule__TertiaryExpression__Group__0__Impl rule__TertiaryExpression__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalMGLang.g:6879:1: rule__TertiaryExpression__Group__0__Impl : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6883:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:6884:1: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:6884:1: ( ruleSecondaryExpression )
            // InternalMGLang.g:6885:2: ruleSecondaryExpression
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
    // InternalMGLang.g:6894:1: rule__TertiaryExpression__Group__1 : rule__TertiaryExpression__Group__1__Impl ;
    public final void rule__TertiaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6898:1: ( rule__TertiaryExpression__Group__1__Impl )
            // InternalMGLang.g:6899:2: rule__TertiaryExpression__Group__1__Impl
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
    // InternalMGLang.g:6905:1: rule__TertiaryExpression__Group__1__Impl : ( ( rule__TertiaryExpression__Group_1__0 )* ) ;
    public final void rule__TertiaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6909:1: ( ( ( rule__TertiaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:6910:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:6910:1: ( ( rule__TertiaryExpression__Group_1__0 )* )
            // InternalMGLang.g:6911:2: ( rule__TertiaryExpression__Group_1__0 )*
            {
             before(grammarAccess.getTertiaryExpressionAccess().getGroup_1()); 
            // InternalMGLang.g:6912:2: ( rule__TertiaryExpression__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=29 && LA54_0<=31)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMGLang.g:6912:3: rule__TertiaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__TertiaryExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalMGLang.g:6921:1: rule__TertiaryExpression__Group_1__0 : rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 ;
    public final void rule__TertiaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6925:1: ( rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1 )
            // InternalMGLang.g:6926:2: rule__TertiaryExpression__Group_1__0__Impl rule__TertiaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalMGLang.g:6933:1: rule__TertiaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TertiaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6937:1: ( ( () ) )
            // InternalMGLang.g:6938:1: ( () )
            {
            // InternalMGLang.g:6938:1: ( () )
            // InternalMGLang.g:6939:2: ()
            {
             before(grammarAccess.getTertiaryExpressionAccess().getTertiaryLeftAction_1_0()); 
            // InternalMGLang.g:6940:2: ()
            // InternalMGLang.g:6940:3: 
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
    // InternalMGLang.g:6948:1: rule__TertiaryExpression__Group_1__1 : rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 ;
    public final void rule__TertiaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6952:1: ( rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2 )
            // InternalMGLang.g:6953:2: rule__TertiaryExpression__Group_1__1__Impl rule__TertiaryExpression__Group_1__2
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
    // InternalMGLang.g:6960:1: rule__TertiaryExpression__Group_1__1__Impl : ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__TertiaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6964:1: ( ( ( rule__TertiaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:6965:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:6965:1: ( ( rule__TertiaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:6966:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getTertiaryExpressionAccess().getOpAssignment_1_1()); 
            // InternalMGLang.g:6967:2: ( rule__TertiaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:6967:3: rule__TertiaryExpression__OpAssignment_1_1
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
    // InternalMGLang.g:6975:1: rule__TertiaryExpression__Group_1__2 : rule__TertiaryExpression__Group_1__2__Impl ;
    public final void rule__TertiaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6979:1: ( rule__TertiaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:6980:2: rule__TertiaryExpression__Group_1__2__Impl
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
    // InternalMGLang.g:6986:1: rule__TertiaryExpression__Group_1__2__Impl : ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__TertiaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:6990:1: ( ( ( rule__TertiaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:6991:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:6991:1: ( ( rule__TertiaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:6992:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getTertiaryExpressionAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:6993:2: ( rule__TertiaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:6993:3: rule__TertiaryExpression__RightAssignment_1_2
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
    // InternalMGLang.g:7002:1: rule__SecondaryExpression__Group__0 : rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 ;
    public final void rule__SecondaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7006:1: ( rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1 )
            // InternalMGLang.g:7007:2: rule__SecondaryExpression__Group__0__Impl rule__SecondaryExpression__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalMGLang.g:7014:1: rule__SecondaryExpression__Group__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7018:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:7019:1: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:7019:1: ( rulePrimaryExpr )
            // InternalMGLang.g:7020:2: rulePrimaryExpr
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
    // InternalMGLang.g:7029:1: rule__SecondaryExpression__Group__1 : rule__SecondaryExpression__Group__1__Impl ;
    public final void rule__SecondaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7033:1: ( rule__SecondaryExpression__Group__1__Impl )
            // InternalMGLang.g:7034:2: rule__SecondaryExpression__Group__1__Impl
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
    // InternalMGLang.g:7040:1: rule__SecondaryExpression__Group__1__Impl : ( ( rule__SecondaryExpression__Group_1__0 )* ) ;
    public final void rule__SecondaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7044:1: ( ( ( rule__SecondaryExpression__Group_1__0 )* ) )
            // InternalMGLang.g:7045:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:7045:1: ( ( rule__SecondaryExpression__Group_1__0 )* )
            // InternalMGLang.g:7046:2: ( rule__SecondaryExpression__Group_1__0 )*
            {
             before(grammarAccess.getSecondaryExpressionAccess().getGroup_1()); 
            // InternalMGLang.g:7047:2: ( rule__SecondaryExpression__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=32 && LA55_0<=33)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMGLang.g:7047:3: rule__SecondaryExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__SecondaryExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalMGLang.g:7056:1: rule__SecondaryExpression__Group_1__0 : rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 ;
    public final void rule__SecondaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7060:1: ( rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1 )
            // InternalMGLang.g:7061:2: rule__SecondaryExpression__Group_1__0__Impl rule__SecondaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalMGLang.g:7068:1: rule__SecondaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SecondaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7072:1: ( ( () ) )
            // InternalMGLang.g:7073:1: ( () )
            {
            // InternalMGLang.g:7073:1: ( () )
            // InternalMGLang.g:7074:2: ()
            {
             before(grammarAccess.getSecondaryExpressionAccess().getSecondaryLeftAction_1_0()); 
            // InternalMGLang.g:7075:2: ()
            // InternalMGLang.g:7075:3: 
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
    // InternalMGLang.g:7083:1: rule__SecondaryExpression__Group_1__1 : rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 ;
    public final void rule__SecondaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7087:1: ( rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2 )
            // InternalMGLang.g:7088:2: rule__SecondaryExpression__Group_1__1__Impl rule__SecondaryExpression__Group_1__2
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
    // InternalMGLang.g:7095:1: rule__SecondaryExpression__Group_1__1__Impl : ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__SecondaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7099:1: ( ( ( rule__SecondaryExpression__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:7100:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:7100:1: ( ( rule__SecondaryExpression__OpAssignment_1_1 ) )
            // InternalMGLang.g:7101:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getSecondaryExpressionAccess().getOpAssignment_1_1()); 
            // InternalMGLang.g:7102:2: ( rule__SecondaryExpression__OpAssignment_1_1 )
            // InternalMGLang.g:7102:3: rule__SecondaryExpression__OpAssignment_1_1
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
    // InternalMGLang.g:7110:1: rule__SecondaryExpression__Group_1__2 : rule__SecondaryExpression__Group_1__2__Impl ;
    public final void rule__SecondaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7114:1: ( rule__SecondaryExpression__Group_1__2__Impl )
            // InternalMGLang.g:7115:2: rule__SecondaryExpression__Group_1__2__Impl
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
    // InternalMGLang.g:7121:1: rule__SecondaryExpression__Group_1__2__Impl : ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SecondaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7125:1: ( ( ( rule__SecondaryExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7126:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7126:1: ( ( rule__SecondaryExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:7127:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getSecondaryExpressionAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:7128:2: ( rule__SecondaryExpression__RightAssignment_1_2 )
            // InternalMGLang.g:7128:3: rule__SecondaryExpression__RightAssignment_1_2
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
    // InternalMGLang.g:7137:1: rule__PrimaryExpr__Group__0 : rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 ;
    public final void rule__PrimaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7141:1: ( rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 )
            // InternalMGLang.g:7142:2: rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalMGLang.g:7149:1: rule__PrimaryExpr__Group__0__Impl : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7153:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:7154:1: ( ruleRelationExpression )
            {
            // InternalMGLang.g:7154:1: ( ruleRelationExpression )
            // InternalMGLang.g:7155:2: ruleRelationExpression
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
    // InternalMGLang.g:7164:1: rule__PrimaryExpr__Group__1 : rule__PrimaryExpr__Group__1__Impl ;
    public final void rule__PrimaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7168:1: ( rule__PrimaryExpr__Group__1__Impl )
            // InternalMGLang.g:7169:2: rule__PrimaryExpr__Group__1__Impl
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
    // InternalMGLang.g:7175:1: rule__PrimaryExpr__Group__1__Impl : ( ( rule__PrimaryExpr__Group_1__0 )* ) ;
    public final void rule__PrimaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7179:1: ( ( ( rule__PrimaryExpr__Group_1__0 )* ) )
            // InternalMGLang.g:7180:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            {
            // InternalMGLang.g:7180:1: ( ( rule__PrimaryExpr__Group_1__0 )* )
            // InternalMGLang.g:7181:2: ( rule__PrimaryExpr__Group_1__0 )*
            {
             before(grammarAccess.getPrimaryExprAccess().getGroup_1()); 
            // InternalMGLang.g:7182:2: ( rule__PrimaryExpr__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=34 && LA56_0<=36)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMGLang.g:7182:3: rule__PrimaryExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__PrimaryExpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalMGLang.g:7191:1: rule__PrimaryExpr__Group_1__0 : rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 ;
    public final void rule__PrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7195:1: ( rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1 )
            // InternalMGLang.g:7196:2: rule__PrimaryExpr__Group_1__0__Impl rule__PrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalMGLang.g:7203:1: rule__PrimaryExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7207:1: ( ( () ) )
            // InternalMGLang.g:7208:1: ( () )
            {
            // InternalMGLang.g:7208:1: ( () )
            // InternalMGLang.g:7209:2: ()
            {
             before(grammarAccess.getPrimaryExprAccess().getPrimaryLeftAction_1_0()); 
            // InternalMGLang.g:7210:2: ()
            // InternalMGLang.g:7210:3: 
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
    // InternalMGLang.g:7218:1: rule__PrimaryExpr__Group_1__1 : rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 ;
    public final void rule__PrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7222:1: ( rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2 )
            // InternalMGLang.g:7223:2: rule__PrimaryExpr__Group_1__1__Impl rule__PrimaryExpr__Group_1__2
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
    // InternalMGLang.g:7230:1: rule__PrimaryExpr__Group_1__1__Impl : ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7234:1: ( ( ( rule__PrimaryExpr__OpAssignment_1_1 ) ) )
            // InternalMGLang.g:7235:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            {
            // InternalMGLang.g:7235:1: ( ( rule__PrimaryExpr__OpAssignment_1_1 ) )
            // InternalMGLang.g:7236:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExprAccess().getOpAssignment_1_1()); 
            // InternalMGLang.g:7237:2: ( rule__PrimaryExpr__OpAssignment_1_1 )
            // InternalMGLang.g:7237:3: rule__PrimaryExpr__OpAssignment_1_1
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
    // InternalMGLang.g:7245:1: rule__PrimaryExpr__Group_1__2 : rule__PrimaryExpr__Group_1__2__Impl ;
    public final void rule__PrimaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7249:1: ( rule__PrimaryExpr__Group_1__2__Impl )
            // InternalMGLang.g:7250:2: rule__PrimaryExpr__Group_1__2__Impl
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
    // InternalMGLang.g:7256:1: rule__PrimaryExpr__Group_1__2__Impl : ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7260:1: ( ( ( rule__PrimaryExpr__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7261:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7261:1: ( ( rule__PrimaryExpr__RightAssignment_1_2 ) )
            // InternalMGLang.g:7262:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExprAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:7263:2: ( rule__PrimaryExpr__RightAssignment_1_2 )
            // InternalMGLang.g:7263:3: rule__PrimaryExpr__RightAssignment_1_2
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
    // InternalMGLang.g:7272:1: rule__RelationExpression__Group__0 : rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 ;
    public final void rule__RelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7276:1: ( rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1 )
            // InternalMGLang.g:7277:2: rule__RelationExpression__Group__0__Impl rule__RelationExpression__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalMGLang.g:7284:1: rule__RelationExpression__Group__0__Impl : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7288:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:7289:1: ( ruleBaseExpr )
            {
            // InternalMGLang.g:7289:1: ( ruleBaseExpr )
            // InternalMGLang.g:7290:2: ruleBaseExpr
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
    // InternalMGLang.g:7299:1: rule__RelationExpression__Group__1 : rule__RelationExpression__Group__1__Impl ;
    public final void rule__RelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7303:1: ( rule__RelationExpression__Group__1__Impl )
            // InternalMGLang.g:7304:2: rule__RelationExpression__Group__1__Impl
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
    // InternalMGLang.g:7310:1: rule__RelationExpression__Group__1__Impl : ( ( rule__RelationExpression__Group_1__0 )* ) ;
    public final void rule__RelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7314:1: ( ( ( rule__RelationExpression__Group_1__0 )* ) )
            // InternalMGLang.g:7315:1: ( ( rule__RelationExpression__Group_1__0 )* )
            {
            // InternalMGLang.g:7315:1: ( ( rule__RelationExpression__Group_1__0 )* )
            // InternalMGLang.g:7316:2: ( rule__RelationExpression__Group_1__0 )*
            {
             before(grammarAccess.getRelationExpressionAccess().getGroup_1()); 
            // InternalMGLang.g:7317:2: ( rule__RelationExpression__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=23 && LA57_0<=28)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMGLang.g:7317:3: rule__RelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__RelationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalMGLang.g:7326:1: rule__RelationExpression__Group_1__0 : rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 ;
    public final void rule__RelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7330:1: ( rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1 )
            // InternalMGLang.g:7331:2: rule__RelationExpression__Group_1__0__Impl rule__RelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalMGLang.g:7338:1: rule__RelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7342:1: ( ( () ) )
            // InternalMGLang.g:7343:1: ( () )
            {
            // InternalMGLang.g:7343:1: ( () )
            // InternalMGLang.g:7344:2: ()
            {
             before(grammarAccess.getRelationExpressionAccess().getRelLeftAction_1_0()); 
            // InternalMGLang.g:7345:2: ()
            // InternalMGLang.g:7345:3: 
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
    // InternalMGLang.g:7353:1: rule__RelationExpression__Group_1__1 : rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 ;
    public final void rule__RelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7357:1: ( rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2 )
            // InternalMGLang.g:7358:2: rule__RelationExpression__Group_1__1__Impl rule__RelationExpression__Group_1__2
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
    // InternalMGLang.g:7365:1: rule__RelationExpression__Group_1__1__Impl : ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) ;
    public final void rule__RelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7369:1: ( ( ( rule__RelationExpression__RelationAssignment_1_1 ) ) )
            // InternalMGLang.g:7370:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            {
            // InternalMGLang.g:7370:1: ( ( rule__RelationExpression__RelationAssignment_1_1 ) )
            // InternalMGLang.g:7371:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            {
             before(grammarAccess.getRelationExpressionAccess().getRelationAssignment_1_1()); 
            // InternalMGLang.g:7372:2: ( rule__RelationExpression__RelationAssignment_1_1 )
            // InternalMGLang.g:7372:3: rule__RelationExpression__RelationAssignment_1_1
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
    // InternalMGLang.g:7380:1: rule__RelationExpression__Group_1__2 : rule__RelationExpression__Group_1__2__Impl ;
    public final void rule__RelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7384:1: ( rule__RelationExpression__Group_1__2__Impl )
            // InternalMGLang.g:7385:2: rule__RelationExpression__Group_1__2__Impl
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
    // InternalMGLang.g:7391:1: rule__RelationExpression__Group_1__2__Impl : ( ( rule__RelationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__RelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7395:1: ( ( ( rule__RelationExpression__RightAssignment_1_2 ) ) )
            // InternalMGLang.g:7396:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            {
            // InternalMGLang.g:7396:1: ( ( rule__RelationExpression__RightAssignment_1_2 ) )
            // InternalMGLang.g:7397:2: ( rule__RelationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getRelationExpressionAccess().getRightAssignment_1_2()); 
            // InternalMGLang.g:7398:2: ( rule__RelationExpression__RightAssignment_1_2 )
            // InternalMGLang.g:7398:3: rule__RelationExpression__RightAssignment_1_2
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
    // InternalMGLang.g:7407:1: rule__BaseExpr__Group_0__0 : rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 ;
    public final void rule__BaseExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7411:1: ( rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1 )
            // InternalMGLang.g:7412:2: rule__BaseExpr__Group_0__0__Impl rule__BaseExpr__Group_0__1
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
    // InternalMGLang.g:7419:1: rule__BaseExpr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7423:1: ( ( '(' ) )
            // InternalMGLang.g:7424:1: ( '(' )
            {
            // InternalMGLang.g:7424:1: ( '(' )
            // InternalMGLang.g:7425:2: '('
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
    // InternalMGLang.g:7434:1: rule__BaseExpr__Group_0__1 : rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 ;
    public final void rule__BaseExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7438:1: ( rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2 )
            // InternalMGLang.g:7439:2: rule__BaseExpr__Group_0__1__Impl rule__BaseExpr__Group_0__2
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
    // InternalMGLang.g:7446:1: rule__BaseExpr__Group_0__1__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7450:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:7451:1: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:7451:1: ( ruleArithmeticExpression )
            // InternalMGLang.g:7452:2: ruleArithmeticExpression
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
    // InternalMGLang.g:7461:1: rule__BaseExpr__Group_0__2 : rule__BaseExpr__Group_0__2__Impl ;
    public final void rule__BaseExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7465:1: ( rule__BaseExpr__Group_0__2__Impl )
            // InternalMGLang.g:7466:2: rule__BaseExpr__Group_0__2__Impl
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
    // InternalMGLang.g:7472:1: rule__BaseExpr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7476:1: ( ( ')' ) )
            // InternalMGLang.g:7477:1: ( ')' )
            {
            // InternalMGLang.g:7477:1: ( ')' )
            // InternalMGLang.g:7478:2: ')'
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
    // InternalMGLang.g:7488:1: rule__BaseExpr__Group_1__0 : rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 ;
    public final void rule__BaseExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7492:1: ( rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1 )
            // InternalMGLang.g:7493:2: rule__BaseExpr__Group_1__0__Impl rule__BaseExpr__Group_1__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalMGLang.g:7500:1: rule__BaseExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7504:1: ( ( () ) )
            // InternalMGLang.g:7505:1: ( () )
            {
            // InternalMGLang.g:7505:1: ( () )
            // InternalMGLang.g:7506:2: ()
            {
             before(grammarAccess.getBaseExprAccess().getNegationExpressionAction_1_0()); 
            // InternalMGLang.g:7507:2: ()
            // InternalMGLang.g:7507:3: 
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
    // InternalMGLang.g:7515:1: rule__BaseExpr__Group_1__1 : rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 ;
    public final void rule__BaseExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7519:1: ( rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2 )
            // InternalMGLang.g:7520:2: rule__BaseExpr__Group_1__1__Impl rule__BaseExpr__Group_1__2
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
    // InternalMGLang.g:7527:1: rule__BaseExpr__Group_1__1__Impl : ( '!' ) ;
    public final void rule__BaseExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7531:1: ( ( '!' ) )
            // InternalMGLang.g:7532:1: ( '!' )
            {
            // InternalMGLang.g:7532:1: ( '!' )
            // InternalMGLang.g:7533:2: '!'
            {
             before(grammarAccess.getBaseExprAccess().getExclamationMarkKeyword_1_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMGLang.g:7542:1: rule__BaseExpr__Group_1__2 : rule__BaseExpr__Group_1__2__Impl ;
    public final void rule__BaseExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7546:1: ( rule__BaseExpr__Group_1__2__Impl )
            // InternalMGLang.g:7547:2: rule__BaseExpr__Group_1__2__Impl
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
    // InternalMGLang.g:7553:1: rule__BaseExpr__Group_1__2__Impl : ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) ;
    public final void rule__BaseExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7557:1: ( ( ( rule__BaseExpr__ExprAssignment_1_2 ) ) )
            // InternalMGLang.g:7558:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            {
            // InternalMGLang.g:7558:1: ( ( rule__BaseExpr__ExprAssignment_1_2 ) )
            // InternalMGLang.g:7559:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            {
             before(grammarAccess.getBaseExprAccess().getExprAssignment_1_2()); 
            // InternalMGLang.g:7560:2: ( rule__BaseExpr__ExprAssignment_1_2 )
            // InternalMGLang.g:7560:3: rule__BaseExpr__ExprAssignment_1_2
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
    // InternalMGLang.g:7569:1: rule__BaseExpr__Group_2__0 : rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 ;
    public final void rule__BaseExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7573:1: ( rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1 )
            // InternalMGLang.g:7574:2: rule__BaseExpr__Group_2__0__Impl rule__BaseExpr__Group_2__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalMGLang.g:7581:1: rule__BaseExpr__Group_2__0__Impl : ( () ) ;
    public final void rule__BaseExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7585:1: ( ( () ) )
            // InternalMGLang.g:7586:1: ( () )
            {
            // InternalMGLang.g:7586:1: ( () )
            // InternalMGLang.g:7587:2: ()
            {
             before(grammarAccess.getBaseExprAccess().getFunctionCallAction_2_0()); 
            // InternalMGLang.g:7588:2: ()
            // InternalMGLang.g:7588:3: 
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
    // InternalMGLang.g:7596:1: rule__BaseExpr__Group_2__1 : rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 ;
    public final void rule__BaseExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7600:1: ( rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2 )
            // InternalMGLang.g:7601:2: rule__BaseExpr__Group_2__1__Impl rule__BaseExpr__Group_2__2
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
    // InternalMGLang.g:7608:1: rule__BaseExpr__Group_2__1__Impl : ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) ;
    public final void rule__BaseExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7612:1: ( ( ( rule__BaseExpr__FuncAssignment_2_1 ) ) )
            // InternalMGLang.g:7613:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            {
            // InternalMGLang.g:7613:1: ( ( rule__BaseExpr__FuncAssignment_2_1 ) )
            // InternalMGLang.g:7614:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            {
             before(grammarAccess.getBaseExprAccess().getFuncAssignment_2_1()); 
            // InternalMGLang.g:7615:2: ( rule__BaseExpr__FuncAssignment_2_1 )
            // InternalMGLang.g:7615:3: rule__BaseExpr__FuncAssignment_2_1
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
    // InternalMGLang.g:7623:1: rule__BaseExpr__Group_2__2 : rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 ;
    public final void rule__BaseExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7627:1: ( rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3 )
            // InternalMGLang.g:7628:2: rule__BaseExpr__Group_2__2__Impl rule__BaseExpr__Group_2__3
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
    // InternalMGLang.g:7635:1: rule__BaseExpr__Group_2__2__Impl : ( '(' ) ;
    public final void rule__BaseExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7639:1: ( ( '(' ) )
            // InternalMGLang.g:7640:1: ( '(' )
            {
            // InternalMGLang.g:7640:1: ( '(' )
            // InternalMGLang.g:7641:2: '('
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
    // InternalMGLang.g:7650:1: rule__BaseExpr__Group_2__3 : rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 ;
    public final void rule__BaseExpr__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7654:1: ( rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4 )
            // InternalMGLang.g:7655:2: rule__BaseExpr__Group_2__3__Impl rule__BaseExpr__Group_2__4
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
    // InternalMGLang.g:7662:1: rule__BaseExpr__Group_2__3__Impl : ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) ;
    public final void rule__BaseExpr__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7666:1: ( ( ( rule__BaseExpr__ExprAssignment_2_3 ) ) )
            // InternalMGLang.g:7667:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            {
            // InternalMGLang.g:7667:1: ( ( rule__BaseExpr__ExprAssignment_2_3 ) )
            // InternalMGLang.g:7668:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            {
             before(grammarAccess.getBaseExprAccess().getExprAssignment_2_3()); 
            // InternalMGLang.g:7669:2: ( rule__BaseExpr__ExprAssignment_2_3 )
            // InternalMGLang.g:7669:3: rule__BaseExpr__ExprAssignment_2_3
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
    // InternalMGLang.g:7677:1: rule__BaseExpr__Group_2__4 : rule__BaseExpr__Group_2__4__Impl ;
    public final void rule__BaseExpr__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7681:1: ( rule__BaseExpr__Group_2__4__Impl )
            // InternalMGLang.g:7682:2: rule__BaseExpr__Group_2__4__Impl
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
    // InternalMGLang.g:7688:1: rule__BaseExpr__Group_2__4__Impl : ( ')' ) ;
    public final void rule__BaseExpr__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7692:1: ( ( ')' ) )
            // InternalMGLang.g:7693:1: ( ')' )
            {
            // InternalMGLang.g:7693:1: ( ')' )
            // InternalMGLang.g:7694:2: ')'
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
    // InternalMGLang.g:7704:1: rule__MofgenFile__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MofgenFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7708:1: ( ( ruleImport ) )
            // InternalMGLang.g:7709:2: ( ruleImport )
            {
            // InternalMGLang.g:7709:2: ( ruleImport )
            // InternalMGLang.g:7710:3: ruleImport
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
    // InternalMGLang.g:7719:1: rule__MofgenFile__ConfigAssignment_1 : ( ruleConfig ) ;
    public final void rule__MofgenFile__ConfigAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7723:1: ( ( ruleConfig ) )
            // InternalMGLang.g:7724:2: ( ruleConfig )
            {
            // InternalMGLang.g:7724:2: ( ruleConfig )
            // InternalMGLang.g:7725:3: ruleConfig
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
    // InternalMGLang.g:7734:1: rule__MofgenFile__CommandsAssignment_2 : ( ruleFileCommand ) ;
    public final void rule__MofgenFile__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7738:1: ( ( ruleFileCommand ) )
            // InternalMGLang.g:7739:2: ( ruleFileCommand )
            {
            // InternalMGLang.g:7739:2: ( ruleFileCommand )
            // InternalMGLang.g:7740:3: ruleFileCommand
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
    // InternalMGLang.g:7749:1: rule__Import__UriAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__UriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7753:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:7754:2: ( RULE_STRING )
            {
            // InternalMGLang.g:7754:2: ( RULE_STRING )
            // InternalMGLang.g:7755:3: RULE_STRING
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
    // InternalMGLang.g:7764:1: rule__Import__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7768:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7769:2: ( RULE_ID )
            {
            // InternalMGLang.g:7769:2: ( RULE_ID )
            // InternalMGLang.g:7770:3: RULE_ID
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
    // InternalMGLang.g:7779:1: rule__Config__ExpressionsAssignment_5 : ( ruleConfigExpression ) ;
    public final void rule__Config__ExpressionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7783:1: ( ( ruleConfigExpression ) )
            // InternalMGLang.g:7784:2: ( ruleConfigExpression )
            {
            // InternalMGLang.g:7784:2: ( ruleConfigExpression )
            // InternalMGLang.g:7785:3: ruleConfigExpression
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
    // InternalMGLang.g:7794:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7798:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7799:2: ( RULE_ID )
            {
            // InternalMGLang.g:7799:2: ( RULE_ID )
            // InternalMGLang.g:7800:3: RULE_ID
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
    // InternalMGLang.g:7809:1: rule__Pattern__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7813:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7814:2: ( ruleParameter )
            {
            // InternalMGLang.g:7814:2: ( ruleParameter )
            // InternalMGLang.g:7815:3: ruleParameter
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
    // InternalMGLang.g:7824:1: rule__Pattern__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7828:1: ( ( ruleParameter ) )
            // InternalMGLang.g:7829:2: ( ruleParameter )
            {
            // InternalMGLang.g:7829:2: ( ruleParameter )
            // InternalMGLang.g:7830:3: ruleParameter
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
    // InternalMGLang.g:7839:1: rule__Pattern__CommandsAssignment_4 : ( rulePatternCommand ) ;
    public final void rule__Pattern__CommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7843:1: ( ( rulePatternCommand ) )
            // InternalMGLang.g:7844:2: ( rulePatternCommand )
            {
            // InternalMGLang.g:7844:2: ( rulePatternCommand )
            // InternalMGLang.g:7845:3: rulePatternCommand
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
    // InternalMGLang.g:7854:1: rule__Pattern__ReturnAssignment_6 : ( rulePatternReturn ) ;
    public final void rule__Pattern__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7858:1: ( ( rulePatternReturn ) )
            // InternalMGLang.g:7859:2: ( rulePatternReturn )
            {
            // InternalMGLang.g:7859:2: ( rulePatternReturn )
            // InternalMGLang.g:7860:3: rulePatternReturn
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
    // InternalMGLang.g:7869:1: rule__PatternReturn__ReturnValueAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PatternReturn__ReturnValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7873:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7874:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7874:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7875:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternReturnAccess().getReturnValueNodeCrossReference_3_1_0()); 
            // InternalMGLang.g:7876:3: ( RULE_ID )
            // InternalMGLang.g:7877:4: RULE_ID
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
    // InternalMGLang.g:7888:1: rule__ParamManipulation__ParamAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParamManipulation__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7892:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7893:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7893:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7894:3: ( RULE_ID )
            {
             before(grammarAccess.getParamManipulationAccess().getParamParameterNodeCrossReference_0_0()); 
            // InternalMGLang.g:7895:3: ( RULE_ID )
            // InternalMGLang.g:7896:4: RULE_ID
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
    // InternalMGLang.g:7907:1: rule__ParamManipulation__ContentAssignment_1 : ( ruleNodeContent ) ;
    public final void rule__ParamManipulation__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7911:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:7912:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:7912:2: ( ruleNodeContent )
            // InternalMGLang.g:7913:3: ruleNodeContent
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


    // $ANTLR start "rule__Node__TypeAssignment_0"
    // InternalMGLang.g:7922:1: rule__Node__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7926:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:7927:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:7927:2: ( ( RULE_ID ) )
            // InternalMGLang.g:7928:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 
            // InternalMGLang.g:7929:3: ( RULE_ID )
            // InternalMGLang.g:7930:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getTypeEClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getTypeEClassIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getTypeEClassCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7941:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7945:1: ( ( RULE_ID ) )
            // InternalMGLang.g:7946:2: ( RULE_ID )
            {
            // InternalMGLang.g:7946:2: ( RULE_ID )
            // InternalMGLang.g:7947:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7956:1: rule__Node__CreatedByAssignment_2_0 : ( ruleNodeContent ) ;
    public final void rule__Node__CreatedByAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7960:1: ( ( ruleNodeContent ) )
            // InternalMGLang.g:7961:2: ( ruleNodeContent )
            {
            // InternalMGLang.g:7961:2: ( ruleNodeContent )
            // InternalMGLang.g:7962:3: ruleNodeContent
            {
             before(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeContent();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getCreatedByNodeContentParserRuleCall_2_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7971:1: rule__Node__CreatedByAssignment_2_1_1 : ( rulePatternCall ) ;
    public final void rule__Node__CreatedByAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7975:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:7976:2: ( rulePatternCall )
            {
            // InternalMGLang.g:7976:2: ( rulePatternCall )
            // InternalMGLang.g:7977:3: rulePatternCall
            {
             before(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternCall();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getCreatedByPatternCallParserRuleCall_2_1_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:7986:1: rule__NodeContent__RefsAssignsAssignment_2 : ( ruleNodeReferenceOrAssignmentOrControlFlow ) ;
    public final void rule__NodeContent__RefsAssignsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:7990:1: ( ( ruleNodeReferenceOrAssignmentOrControlFlow ) )
            // InternalMGLang.g:7991:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
            {
            // InternalMGLang.g:7991:2: ( ruleNodeReferenceOrAssignmentOrControlFlow )
            // InternalMGLang.g:7992:3: ruleNodeReferenceOrAssignmentOrControlFlow
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
    // InternalMGLang.g:8001:1: rule__PatternCall__CalledAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternCall__CalledAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8005:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8006:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8006:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8007:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternCallAccess().getCalledPatternCrossReference_0_0()); 
            // InternalMGLang.g:8008:3: ( RULE_ID )
            // InternalMGLang.g:8009:4: RULE_ID
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
    // InternalMGLang.g:8020:1: rule__PatternCall__ParamsAssignment_2_0 : ( ruleArithmeticExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8024:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8025:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8025:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8026:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8035:1: rule__PatternCall__ParamsAssignment_2_1_1 : ( ruleArithmeticExpression ) ;
    public final void rule__PatternCall__ParamsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8039:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8040:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8040:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8041:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8050:1: rule__PatternNodeReference__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8054:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8055:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8055:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8056:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTypeEReferenceCrossReference_0_0()); 
            // InternalMGLang.g:8057:3: ( RULE_ID )
            // InternalMGLang.g:8058:4: RULE_ID
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
    // InternalMGLang.g:8069:1: rule__PatternNodeReference__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PatternNodeReference__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8073:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8074:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8074:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8075:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternNodeReferenceAccess().getTargetNodeCrossReference_2_0()); 
            // InternalMGLang.g:8076:3: ( RULE_ID )
            // InternalMGLang.g:8077:4: RULE_ID
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
    // InternalMGLang.g:8088:1: rule__Assignment__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8092:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8093:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8093:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8094:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 
            // InternalMGLang.g:8095:3: ( RULE_ID )
            // InternalMGLang.g:8096:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getTargetEAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getTargetEAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getTargetEAttributeCrossReference_0_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8107:1: rule__Assignment__ValueAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8111:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8112:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8112:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8113:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8122:1: rule__PrimitiveParameter__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8126:1: ( ( rulePrimitiveType ) )
            // InternalMGLang.g:8127:2: ( rulePrimitiveType )
            {
            // InternalMGLang.g:8127:2: ( rulePrimitiveType )
            // InternalMGLang.g:8128:3: rulePrimitiveType
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
    // InternalMGLang.g:8137:1: rule__PrimitiveParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8141:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8142:2: ( RULE_ID )
            {
            // InternalMGLang.g:8142:2: ( RULE_ID )
            // InternalMGLang.g:8143:3: RULE_ID
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
    // InternalMGLang.g:8152:1: rule__ParameterNode__SrcModelAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterNode__SrcModelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8156:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8157:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8157:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8158:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterNodeAccess().getSrcModelImportCrossReference_0_0_0()); 
            // InternalMGLang.g:8159:3: ( RULE_ID )
            // InternalMGLang.g:8160:4: RULE_ID
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
    // InternalMGLang.g:8171:1: rule__ParameterNode__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8175:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8176:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8176:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8177:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterNodeAccess().getTypeEClassifierCrossReference_1_0()); 
            // InternalMGLang.g:8178:3: ( RULE_ID )
            // InternalMGLang.g:8179:4: RULE_ID
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
    // InternalMGLang.g:8190:1: rule__ParameterNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8194:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8195:2: ( RULE_ID )
            {
            // InternalMGLang.g:8195:2: ( RULE_ID )
            // InternalMGLang.g:8196:3: RULE_ID
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
    // InternalMGLang.g:8205:1: rule__RefOrCall__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RefOrCall__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8209:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8210:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8210:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8211:3: ( RULE_ID )
            {
             before(grammarAccess.getRefOrCallAccess().getRefRefTypeCrossReference_0_0()); 
            // InternalMGLang.g:8212:3: ( RULE_ID )
            // InternalMGLang.g:8213:4: RULE_ID
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
    // InternalMGLang.g:8224:1: rule__RefOrCall__RefAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__RefOrCall__RefAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8228:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8229:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8229:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8230:3: ( RULE_ID )
            {
             before(grammarAccess.getRefOrCallAccess().getRefETypedElementCrossReference_1_2_0()); 
            // InternalMGLang.g:8231:3: ( RULE_ID )
            // InternalMGLang.g:8232:4: RULE_ID
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
    // InternalMGLang.g:8243:1: rule__RefOrCall__ParamsAssignment_1_3_1 : ( ruleRefParams ) ;
    public final void rule__RefOrCall__ParamsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8247:1: ( ( ruleRefParams ) )
            // InternalMGLang.g:8248:2: ( ruleRefParams )
            {
            // InternalMGLang.g:8248:2: ( ruleRefParams )
            // InternalMGLang.g:8249:3: ruleRefParams
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


    // $ANTLR start "rule__RefParams__ParamsAssignment_0"
    // InternalMGLang.g:8258:1: rule__RefParams__ParamsAssignment_0 : ( ruleArithmeticExpression ) ;
    public final void rule__RefParams__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8262:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8263:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8263:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8264:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8273:1: rule__RefParams__ParamsAssignment_1_1 : ( ruleArithmeticExpression ) ;
    public final void rule__RefParams__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8277:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8278:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8278:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8279:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8288:1: rule__Generator__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__Generator__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8292:1: ( ( ruleParameter ) )
            // InternalMGLang.g:8293:2: ( ruleParameter )
            {
            // InternalMGLang.g:8293:2: ( ruleParameter )
            // InternalMGLang.g:8294:3: ruleParameter
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
    // InternalMGLang.g:8303:1: rule__Generator__CommandsAssignment_6 : ( ruleGeneratorExpression ) ;
    public final void rule__Generator__CommandsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8307:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8308:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8308:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8309:3: ruleGeneratorExpression
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
    // InternalMGLang.g:8318:1: rule__PatternVariable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PatternVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8322:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8323:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8323:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8324:3: ( RULE_ID )
            {
             before(grammarAccess.getPatternVariableAccess().getTypePatternCrossReference_0_0()); 
            // InternalMGLang.g:8325:3: ( RULE_ID )
            // InternalMGLang.g:8326:4: RULE_ID
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
    // InternalMGLang.g:8337:1: rule__PatternVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PatternVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8341:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8342:2: ( RULE_ID )
            {
            // InternalMGLang.g:8342:2: ( RULE_ID )
            // InternalMGLang.g:8343:3: RULE_ID
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
    // InternalMGLang.g:8352:1: rule__PatternVariable__PatternCallAssignment_3 : ( rulePatternCall ) ;
    public final void rule__PatternVariable__PatternCallAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8356:1: ( ( rulePatternCall ) )
            // InternalMGLang.g:8357:2: ( rulePatternCall )
            {
            // InternalMGLang.g:8357:2: ( rulePatternCall )
            // InternalMGLang.g:8358:3: rulePatternCall
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


    // $ANTLR start "rule__ForStatement__HeadAssignment_1"
    // InternalMGLang.g:8367:1: rule__ForStatement__HeadAssignment_1 : ( ruleForHead ) ;
    public final void rule__ForStatement__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8371:1: ( ( ruleForHead ) )
            // InternalMGLang.g:8372:2: ( ruleForHead )
            {
            // InternalMGLang.g:8372:2: ( ruleForHead )
            // InternalMGLang.g:8373:3: ruleForHead
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
    // InternalMGLang.g:8382:1: rule__ForStatement__BodyAssignment_3 : ( ruleForBody ) ;
    public final void rule__ForStatement__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8386:1: ( ( ruleForBody ) )
            // InternalMGLang.g:8387:2: ( ruleForBody )
            {
            // InternalMGLang.g:8387:2: ( ruleForBody )
            // InternalMGLang.g:8388:3: ruleForBody
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
    // InternalMGLang.g:8397:1: rule__GeneralForHead__IteratorVarAssignment_0 : ( RULE_ID ) ;
    public final void rule__GeneralForHead__IteratorVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8401:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8402:2: ( RULE_ID )
            {
            // InternalMGLang.g:8402:2: ( RULE_ID )
            // InternalMGLang.g:8403:3: RULE_ID
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
    // InternalMGLang.g:8412:1: rule__GeneralForHead__RangeAssignment_2 : ( ruleForRange ) ;
    public final void rule__GeneralForHead__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8416:1: ( ( ruleForRange ) )
            // InternalMGLang.g:8417:2: ( ruleForRange )
            {
            // InternalMGLang.g:8417:2: ( ruleForRange )
            // InternalMGLang.g:8418:3: ruleForRange
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
    // InternalMGLang.g:8427:1: rule__ForEachHead__SrcAssignment_0 : ( ruleRefOrCall ) ;
    public final void rule__ForEachHead__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8431:1: ( ( ruleRefOrCall ) )
            // InternalMGLang.g:8432:2: ( ruleRefOrCall )
            {
            // InternalMGLang.g:8432:2: ( ruleRefOrCall )
            // InternalMGLang.g:8433:3: ruleRefOrCall
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
    // InternalMGLang.g:8442:1: rule__ForEachHead__ErefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ForEachHead__ErefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8446:1: ( ( ( RULE_ID ) ) )
            // InternalMGLang.g:8447:2: ( ( RULE_ID ) )
            {
            // InternalMGLang.g:8447:2: ( ( RULE_ID ) )
            // InternalMGLang.g:8448:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachHeadAccess().getErefEReferenceCrossReference_2_0()); 
            // InternalMGLang.g:8449:3: ( RULE_ID )
            // InternalMGLang.g:8450:4: RULE_ID
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
    // InternalMGLang.g:8461:1: rule__ForEachHead__IteratorVarAssignment_4 : ( RULE_ID ) ;
    public final void rule__ForEachHead__IteratorVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8465:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8466:2: ( RULE_ID )
            {
            // InternalMGLang.g:8466:2: ( RULE_ID )
            // InternalMGLang.g:8467:3: RULE_ID
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
    // InternalMGLang.g:8476:1: rule__ForBody__CommandsAssignment_1 : ( ruleGeneratorExpression ) ;
    public final void rule__ForBody__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8480:1: ( ( ruleGeneratorExpression ) )
            // InternalMGLang.g:8481:2: ( ruleGeneratorExpression )
            {
            // InternalMGLang.g:8481:2: ( ruleGeneratorExpression )
            // InternalMGLang.g:8482:3: ruleGeneratorExpression
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
    // InternalMGLang.g:8491:1: rule__IfElseSwitch__CasesAssignment_2 : ( ruleIfElseCase ) ;
    public final void rule__IfElseSwitch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8495:1: ( ( ruleIfElseCase ) )
            // InternalMGLang.g:8496:2: ( ruleIfElseCase )
            {
            // InternalMGLang.g:8496:2: ( ruleIfElseCase )
            // InternalMGLang.g:8497:3: ruleIfElseCase
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
    // InternalMGLang.g:8506:1: rule__IfElseSwitch__DefaultAssignment_3 : ( ruleDefault ) ;
    public final void rule__IfElseSwitch__DefaultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8510:1: ( ( ruleDefault ) )
            // InternalMGLang.g:8511:2: ( ruleDefault )
            {
            // InternalMGLang.g:8511:2: ( ruleDefault )
            // InternalMGLang.g:8512:3: ruleDefault
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
    // InternalMGLang.g:8521:1: rule__IfElseCase__ValAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__IfElseCase__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8525:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8526:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8526:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8527:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8536:1: rule__IfElseCase__BodyAssignment_3 : ( ruleCaseBody ) ;
    public final void rule__IfElseCase__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8540:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8541:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8541:2: ( ruleCaseBody )
            // InternalMGLang.g:8542:3: ruleCaseBody
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
    // InternalMGLang.g:8551:1: rule__SwitchCase__AttributeAssignment_2 : ( ruleRefOrCall ) ;
    public final void rule__SwitchCase__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8555:1: ( ( ruleRefOrCall ) )
            // InternalMGLang.g:8556:2: ( ruleRefOrCall )
            {
            // InternalMGLang.g:8556:2: ( ruleRefOrCall )
            // InternalMGLang.g:8557:3: ruleRefOrCall
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
    // InternalMGLang.g:8566:1: rule__SwitchCase__CasesAssignment_5 : ( ruleCase ) ;
    public final void rule__SwitchCase__CasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8570:1: ( ( ruleCase ) )
            // InternalMGLang.g:8571:2: ( ruleCase )
            {
            // InternalMGLang.g:8571:2: ( ruleCase )
            // InternalMGLang.g:8572:3: ruleCase
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
    // InternalMGLang.g:8581:1: rule__SwitchCase__DefaultAssignment_6 : ( ruleDefault ) ;
    public final void rule__SwitchCase__DefaultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8585:1: ( ( ruleDefault ) )
            // InternalMGLang.g:8586:2: ( ruleDefault )
            {
            // InternalMGLang.g:8586:2: ( ruleDefault )
            // InternalMGLang.g:8587:3: ruleDefault
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
    // InternalMGLang.g:8596:1: rule__CaseWithCast__NodeAssignment_1 : ( ruleNode ) ;
    public final void rule__CaseWithCast__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8600:1: ( ( ruleNode ) )
            // InternalMGLang.g:8601:2: ( ruleNode )
            {
            // InternalMGLang.g:8601:2: ( ruleNode )
            // InternalMGLang.g:8602:3: ruleNode
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
    // InternalMGLang.g:8611:1: rule__CaseWithCast__WhenAssignment_2_1 : ( ruleArithmeticExpression ) ;
    public final void rule__CaseWithCast__WhenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8615:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8616:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8616:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8617:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8626:1: rule__CaseWithCast__BodyAssignment_4 : ( ruleCaseBody ) ;
    public final void rule__CaseWithCast__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8630:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8631:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8631:2: ( ruleCaseBody )
            // InternalMGLang.g:8632:3: ruleCaseBody
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
    // InternalMGLang.g:8641:1: rule__CaseWithoutCast__ValAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__CaseWithoutCast__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8645:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8646:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8646:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8647:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8656:1: rule__CaseWithoutCast__BodyAssignment_3 : ( ruleCaseBody ) ;
    public final void rule__CaseWithoutCast__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8660:1: ( ( ruleCaseBody ) )
            // InternalMGLang.g:8661:2: ( ruleCaseBody )
            {
            // InternalMGLang.g:8661:2: ( ruleCaseBody )
            // InternalMGLang.g:8662:3: ruleCaseBody
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
    // InternalMGLang.g:8671:1: rule__CaseBody__ExpressionsAssignment_0_2 : ( ruleSwitchExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8675:1: ( ( ruleSwitchExpression ) )
            // InternalMGLang.g:8676:2: ( ruleSwitchExpression )
            {
            // InternalMGLang.g:8676:2: ( ruleSwitchExpression )
            // InternalMGLang.g:8677:3: ruleSwitchExpression
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
    // InternalMGLang.g:8686:1: rule__CaseBody__ExpressionsAssignment_1_0 : ( ruleSwitchExpression ) ;
    public final void rule__CaseBody__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8690:1: ( ( ruleSwitchExpression ) )
            // InternalMGLang.g:8691:2: ( ruleSwitchExpression )
            {
            // InternalMGLang.g:8691:2: ( ruleSwitchExpression )
            // InternalMGLang.g:8692:3: ruleSwitchExpression
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
    // InternalMGLang.g:8701:1: rule__List__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__List__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8705:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8706:2: ( RULE_ID )
            {
            // InternalMGLang.g:8706:2: ( RULE_ID )
            // InternalMGLang.g:8707:3: RULE_ID
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
    // InternalMGLang.g:8716:1: rule__List__CreatedByAssignment_2_1 : ( ruleListAssignment ) ;
    public final void rule__List__CreatedByAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8720:1: ( ( ruleListAssignment ) )
            // InternalMGLang.g:8721:2: ( ruleListAssignment )
            {
            // InternalMGLang.g:8721:2: ( ruleListAssignment )
            // InternalMGLang.g:8722:3: ruleListAssignment
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
    // InternalMGLang.g:8731:1: rule__ListAdHoc__ElementsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ListAdHoc__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8735:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8736:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8736:2: ( ruleLiteral )
            // InternalMGLang.g:8737:3: ruleLiteral
            {
             before(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8746:1: rule__ListAdHoc__ElementsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ListAdHoc__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8750:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8751:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8751:2: ( ruleLiteral )
            // InternalMGLang.g:8752:3: ruleLiteral
            {
             before(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getListAdHocAccess().getElementsLiteralParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8761:1: rule__Map__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Map__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8765:1: ( ( RULE_ID ) )
            // InternalMGLang.g:8766:2: ( RULE_ID )
            {
            // InternalMGLang.g:8766:2: ( RULE_ID )
            // InternalMGLang.g:8767:3: RULE_ID
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
    // InternalMGLang.g:8776:1: rule__Map__CreatedByAssignment_2_1 : ( ruleMapAssignment ) ;
    public final void rule__Map__CreatedByAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8780:1: ( ( ruleMapAssignment ) )
            // InternalMGLang.g:8781:2: ( ruleMapAssignment )
            {
            // InternalMGLang.g:8781:2: ( ruleMapAssignment )
            // InternalMGLang.g:8782:3: ruleMapAssignment
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
    // InternalMGLang.g:8791:1: rule__MapAdHoc__EntriesAssignment_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8795:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:8796:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:8796:2: ( ruleMapTupel )
            // InternalMGLang.g:8797:3: ruleMapTupel
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
    // InternalMGLang.g:8806:1: rule__MapAdHoc__EntriesAssignment_2_1 : ( ruleMapTupel ) ;
    public final void rule__MapAdHoc__EntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8810:1: ( ( ruleMapTupel ) )
            // InternalMGLang.g:8811:2: ( ruleMapTupel )
            {
            // InternalMGLang.g:8811:2: ( ruleMapTupel )
            // InternalMGLang.g:8812:3: ruleMapTupel
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
    // InternalMGLang.g:8821:1: rule__MapTupel__KeyAssignment_1 : ( ruleLiteral ) ;
    public final void rule__MapTupel__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8825:1: ( ( ruleLiteral ) )
            // InternalMGLang.g:8826:2: ( ruleLiteral )
            {
            // InternalMGLang.g:8826:2: ( ruleLiteral )
            // InternalMGLang.g:8827:3: ruleLiteral
            {
             before(grammarAccess.getMapTupelAccess().getKeyLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMapTupelAccess().getKeyLiteralParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMGLang.g:8836:1: rule__MapTupel__ValueAssignment_3 : ( ruleArithmeticExpression ) ;
    public final void rule__MapTupel__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8840:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8841:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8841:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8842:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8851:1: rule__ForRange__StartAssignment_0 : ( ruleArithmeticExpression ) ;
    public final void rule__ForRange__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8855:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8856:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8856:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8857:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8866:1: rule__ForRange__EndAssignment_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ForRange__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8870:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:8871:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:8871:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:8872:3: ruleArithmeticExpression
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
    // InternalMGLang.g:8881:1: rule__TertiaryExpression__OpAssignment_1_1 : ( ruleTertiaryOp ) ;
    public final void rule__TertiaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8885:1: ( ( ruleTertiaryOp ) )
            // InternalMGLang.g:8886:2: ( ruleTertiaryOp )
            {
            // InternalMGLang.g:8886:2: ( ruleTertiaryOp )
            // InternalMGLang.g:8887:3: ruleTertiaryOp
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
    // InternalMGLang.g:8896:1: rule__TertiaryExpression__RightAssignment_1_2 : ( ruleSecondaryExpression ) ;
    public final void rule__TertiaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8900:1: ( ( ruleSecondaryExpression ) )
            // InternalMGLang.g:8901:2: ( ruleSecondaryExpression )
            {
            // InternalMGLang.g:8901:2: ( ruleSecondaryExpression )
            // InternalMGLang.g:8902:3: ruleSecondaryExpression
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
    // InternalMGLang.g:8911:1: rule__SecondaryExpression__OpAssignment_1_1 : ( ruleSecondaryOp ) ;
    public final void rule__SecondaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8915:1: ( ( ruleSecondaryOp ) )
            // InternalMGLang.g:8916:2: ( ruleSecondaryOp )
            {
            // InternalMGLang.g:8916:2: ( ruleSecondaryOp )
            // InternalMGLang.g:8917:3: ruleSecondaryOp
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
    // InternalMGLang.g:8926:1: rule__SecondaryExpression__RightAssignment_1_2 : ( rulePrimaryExpr ) ;
    public final void rule__SecondaryExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8930:1: ( ( rulePrimaryExpr ) )
            // InternalMGLang.g:8931:2: ( rulePrimaryExpr )
            {
            // InternalMGLang.g:8931:2: ( rulePrimaryExpr )
            // InternalMGLang.g:8932:3: rulePrimaryExpr
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
    // InternalMGLang.g:8941:1: rule__PrimaryExpr__OpAssignment_1_1 : ( rulePrimaryOp ) ;
    public final void rule__PrimaryExpr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8945:1: ( ( rulePrimaryOp ) )
            // InternalMGLang.g:8946:2: ( rulePrimaryOp )
            {
            // InternalMGLang.g:8946:2: ( rulePrimaryOp )
            // InternalMGLang.g:8947:3: rulePrimaryOp
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
    // InternalMGLang.g:8956:1: rule__PrimaryExpr__RightAssignment_1_2 : ( ruleRelationExpression ) ;
    public final void rule__PrimaryExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8960:1: ( ( ruleRelationExpression ) )
            // InternalMGLang.g:8961:2: ( ruleRelationExpression )
            {
            // InternalMGLang.g:8961:2: ( ruleRelationExpression )
            // InternalMGLang.g:8962:3: ruleRelationExpression
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
    // InternalMGLang.g:8971:1: rule__RelationExpression__RelationAssignment_1_1 : ( ruleRelationalOp ) ;
    public final void rule__RelationExpression__RelationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8975:1: ( ( ruleRelationalOp ) )
            // InternalMGLang.g:8976:2: ( ruleRelationalOp )
            {
            // InternalMGLang.g:8976:2: ( ruleRelationalOp )
            // InternalMGLang.g:8977:3: ruleRelationalOp
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
    // InternalMGLang.g:8986:1: rule__RelationExpression__RightAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__RelationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:8990:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:8991:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:8991:2: ( ruleBaseExpr )
            // InternalMGLang.g:8992:3: ruleBaseExpr
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
    // InternalMGLang.g:9001:1: rule__BaseExpr__ExprAssignment_1_2 : ( ruleBaseExpr ) ;
    public final void rule__BaseExpr__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9005:1: ( ( ruleBaseExpr ) )
            // InternalMGLang.g:9006:2: ( ruleBaseExpr )
            {
            // InternalMGLang.g:9006:2: ( ruleBaseExpr )
            // InternalMGLang.g:9007:3: ruleBaseExpr
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
    // InternalMGLang.g:9016:1: rule__BaseExpr__FuncAssignment_2_1 : ( ruleMathFunc ) ;
    public final void rule__BaseExpr__FuncAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9020:1: ( ( ruleMathFunc ) )
            // InternalMGLang.g:9021:2: ( ruleMathFunc )
            {
            // InternalMGLang.g:9021:2: ( ruleMathFunc )
            // InternalMGLang.g:9022:3: ruleMathFunc
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
    // InternalMGLang.g:9031:1: rule__BaseExpr__ExprAssignment_2_3 : ( ruleArithmeticExpression ) ;
    public final void rule__BaseExpr__ExprAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9035:1: ( ( ruleArithmeticExpression ) )
            // InternalMGLang.g:9036:2: ( ruleArithmeticExpression )
            {
            // InternalMGLang.g:9036:2: ( ruleArithmeticExpression )
            // InternalMGLang.g:9037:3: ruleArithmeticExpression
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
    // InternalMGLang.g:9046:1: rule__BooleanLiteral__ValAssignment : ( ( rule__BooleanLiteral__ValAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9050:1: ( ( ( rule__BooleanLiteral__ValAlternatives_0 ) ) )
            // InternalMGLang.g:9051:2: ( ( rule__BooleanLiteral__ValAlternatives_0 ) )
            {
            // InternalMGLang.g:9051:2: ( ( rule__BooleanLiteral__ValAlternatives_0 ) )
            // InternalMGLang.g:9052:3: ( rule__BooleanLiteral__ValAlternatives_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValAlternatives_0()); 
            // InternalMGLang.g:9053:3: ( rule__BooleanLiteral__ValAlternatives_0 )
            // InternalMGLang.g:9053:4: rule__BooleanLiteral__ValAlternatives_0
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
    // InternalMGLang.g:9061:1: rule__StringLiteral__ValAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9065:1: ( ( RULE_STRING ) )
            // InternalMGLang.g:9066:2: ( RULE_STRING )
            {
            // InternalMGLang.g:9066:2: ( RULE_STRING )
            // InternalMGLang.g:9067:3: RULE_STRING
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
    // InternalMGLang.g:9076:1: rule__NumberLiteral__ValAssignment : ( RULE_DOUBLE ) ;
    public final void rule__NumberLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMGLang.g:9080:1: ( ( RULE_DOUBLE ) )
            // InternalMGLang.g:9081:2: ( RULE_DOUBLE )
            {
            // InternalMGLang.g:9081:2: ( RULE_DOUBLE )
            // InternalMGLang.g:9082:3: RULE_DOUBLE
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2420080000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x2420000000000202L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000780200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000780200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x4000030000060730L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x4000010000060730L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000780202L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2428080000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2428000000000202L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2428000000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2428040000000200L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x24280C0000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2428040000000202L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4800010000060730L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000530L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000060000L});

}