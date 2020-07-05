package org.mofgen.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMGLangLexer extends Lexer {
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

    public InternalMGLangLexer() {;} 
    public InternalMGLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMGLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMGLang.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:11:7: ( 'sqrt' )
            // InternalMGLang.g:11:9: 'sqrt'
            {
            match("sqrt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:12:7: ( 'abs' )
            // InternalMGLang.g:12:9: 'abs'
            {
            match("abs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:13:7: ( 'int' )
            // InternalMGLang.g:13:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:14:7: ( 'char' )
            // InternalMGLang.g:14:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:15:7: ( 'double' )
            // InternalMGLang.g:15:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:16:7: ( 'String' )
            // InternalMGLang.g:16:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:17:7: ( '>' )
            // InternalMGLang.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:18:7: ( '>=' )
            // InternalMGLang.g:18:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:19:7: ( '==' )
            // InternalMGLang.g:19:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:20:7: ( '!=' )
            // InternalMGLang.g:20:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:21:7: ( '<=' )
            // InternalMGLang.g:21:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:22:7: ( '<' )
            // InternalMGLang.g:22:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:23:7: ( '+' )
            // InternalMGLang.g:23:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:24:7: ( '-' )
            // InternalMGLang.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:25:7: ( '||' )
            // InternalMGLang.g:25:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:26:7: ( '%' )
            // InternalMGLang.g:26:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:27:7: ( '^' )
            // InternalMGLang.g:27:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:28:7: ( '*' )
            // InternalMGLang.g:28:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:29:7: ( '/' )
            // InternalMGLang.g:29:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:30:7: ( '&&' )
            // InternalMGLang.g:30:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:31:7: ( 'import' )
            // InternalMGLang.g:31:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:32:7: ( 'as' )
            // InternalMGLang.g:32:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:33:7: ( 'pattern' )
            // InternalMGLang.g:33:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:34:7: ( '{' )
            // InternalMGLang.g:34:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:35:7: ( '}' )
            // InternalMGLang.g:35:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:36:7: ( '(' )
            // InternalMGLang.g:36:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:37:7: ( ')' )
            // InternalMGLang.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:38:7: ( ',' )
            // InternalMGLang.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:39:7: ( 'return' )
            // InternalMGLang.g:39:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:40:7: ( 'this' )
            // InternalMGLang.g:40:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:41:7: ( '.' )
            // InternalMGLang.g:41:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:42:7: ( '[' )
            // InternalMGLang.g:42:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:43:7: ( ']' )
            // InternalMGLang.g:43:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:44:7: ( '->' )
            // InternalMGLang.g:44:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:45:7: ( '!' )
            // InternalMGLang.g:45:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:46:7: ( 'gen' )
            // InternalMGLang.g:46:9: 'gen'
            {
            match("gen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:47:7: ( 'for' )
            // InternalMGLang.g:47:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:48:7: ( 'in' )
            // InternalMGLang.g:48:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:49:7: ( 'if' )
            // InternalMGLang.g:49:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:50:7: ( 'switch' )
            // InternalMGLang.g:50:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:51:7: ( 'default' )
            // InternalMGLang.g:51:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:52:7: ( ':' )
            // InternalMGLang.g:52:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:53:7: ( 'case' )
            // InternalMGLang.g:53:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:54:7: ( 'List' )
            // InternalMGLang.g:54:9: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:55:7: ( 'Map' )
            // InternalMGLang.g:55:9: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8255:11: ( 'true' )
            // InternalMGLang.g:8255:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8257:12: ( 'false' )
            // InternalMGLang.g:8257:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_ASSIGNMENT_OP"
    public final void mRULE_ASSIGNMENT_OP() throws RecognitionException {
        try {
            int _type = RULE_ASSIGNMENT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8259:20: ( '=' )
            // InternalMGLang.g:8259:22: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGNMENT_OP"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8261:14: ( '\\n' )
            // InternalMGLang.g:8261:16: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8263:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMGLang.g:8263:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMGLang.g:8263:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGLang.g:8263:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMGLang.g:8263:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMGLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8265:10: ( ( '0' .. '9' )+ )
            // InternalMGLang.g:8265:12: ( '0' .. '9' )+
            {
            // InternalMGLang.g:8265:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMGLang.g:8265:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8267:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMGLang.g:8267:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMGLang.g:8267:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMGLang.g:8267:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMGLang.g:8267:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMGLang.g:8267:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMGLang.g:8267:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMGLang.g:8267:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMGLang.g:8267:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMGLang.g:8267:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMGLang.g:8267:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8269:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMGLang.g:8269:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMGLang.g:8269:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMGLang.g:8269:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8271:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMGLang.g:8271:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMGLang.g:8271:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMGLang.g:8271:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMGLang.g:8271:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGLang.g:8271:41: ( '\\r' )? '\\n'
                    {
                    // InternalMGLang.g:8271:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMGLang.g:8271:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8273:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMGLang.g:8273:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMGLang.g:8273:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMGLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGLang.g:8275:16: ( . )
            // InternalMGLang.g:8275:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMGLang.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_TRUE | RULE_FALSE | RULE_ASSIGNMENT_OP | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=56;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMGLang.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalMGLang.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalMGLang.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalMGLang.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalMGLang.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalMGLang.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalMGLang.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalMGLang.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalMGLang.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalMGLang.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalMGLang.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalMGLang.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalMGLang.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalMGLang.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalMGLang.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalMGLang.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalMGLang.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalMGLang.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalMGLang.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalMGLang.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalMGLang.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalMGLang.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalMGLang.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalMGLang.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalMGLang.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalMGLang.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalMGLang.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalMGLang.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalMGLang.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalMGLang.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalMGLang.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalMGLang.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalMGLang.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalMGLang.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalMGLang.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalMGLang.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalMGLang.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalMGLang.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalMGLang.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalMGLang.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalMGLang.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalMGLang.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalMGLang.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalMGLang.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalMGLang.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalMGLang.g:1:280: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 47 :
                // InternalMGLang.g:1:290: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 48 :
                // InternalMGLang.g:1:301: RULE_ASSIGNMENT_OP
                {
                mRULE_ASSIGNMENT_OP(); 

                }
                break;
            case 49 :
                // InternalMGLang.g:1:320: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 50 :
                // InternalMGLang.g:1:333: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalMGLang.g:1:341: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalMGLang.g:1:350: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalMGLang.g:1:362: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // InternalMGLang.g:1:378: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // InternalMGLang.g:1:394: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // InternalMGLang.g:1:402: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\6\54\1\70\1\72\1\74\1\76\1\uffff\1\101\1\51\1\uffff\1\104\1\uffff\1\110\1\51\1\54\5\uffff\2\54\3\uffff\2\54\1\uffff\2\54\1\134\2\uffff\2\51\2\uffff\2\54\1\uffff\1\54\1\143\1\145\1\54\1\147\5\54\23\uffff\1\54\5\uffff\3\54\3\uffff\3\54\1\uffff\2\54\4\uffff\2\54\1\170\1\uffff\1\171\1\uffff\1\54\1\uffff\11\54\1\u0084\1\u0085\2\54\1\u0088\1\u0089\1\54\2\uffff\1\54\1\u008c\1\u008d\5\54\1\u0093\1\u0094\2\uffff\1\54\1\u0096\2\uffff\2\54\2\uffff\5\54\2\uffff\1\u009e\1\uffff\1\u009f\1\u00a0\1\u00a1\1\54\1\u00a3\1\54\1\u00a5\4\uffff\1\u00a6\1\uffff\1\u00a7\3\uffff";
    static final String DFA12_eofS =
        "\u00a8\uffff";
    static final String DFA12_minS =
        "\1\0\1\161\1\142\1\146\1\141\1\145\1\164\4\75\1\uffff\1\76\1\174\1\uffff\1\101\1\uffff\1\52\1\46\1\141\5\uffff\1\145\1\150\3\uffff\1\145\1\141\1\uffff\1\151\1\141\1\11\2\uffff\2\0\2\uffff\1\162\1\151\1\uffff\1\163\2\60\1\160\1\60\1\141\1\163\1\165\1\146\1\162\23\uffff\1\164\5\uffff\1\164\1\151\1\165\3\uffff\1\156\1\162\1\154\1\uffff\1\163\1\160\4\uffff\2\164\1\60\1\uffff\1\60\1\uffff\1\157\1\uffff\1\162\1\145\1\142\1\141\1\151\1\164\1\165\1\163\1\145\2\60\1\163\1\164\2\60\1\143\2\uffff\1\162\2\60\1\154\1\165\1\156\1\145\1\162\2\60\2\uffff\1\145\1\60\2\uffff\1\150\1\164\2\uffff\1\145\1\154\1\147\1\162\1\156\2\uffff\1\60\1\uffff\3\60\1\164\1\60\1\156\1\60\4\uffff\1\60\1\uffff\1\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\167\1\163\1\156\1\150\1\157\1\164\4\75\1\uffff\1\76\1\174\1\uffff\1\172\1\uffff\1\57\1\46\1\141\5\uffff\1\145\1\162\3\uffff\1\145\1\157\1\uffff\1\151\1\141\1\40\2\uffff\2\uffff\2\uffff\1\162\1\151\1\uffff\1\163\2\172\1\160\1\172\1\141\1\163\1\165\1\146\1\162\23\uffff\1\164\5\uffff\1\164\1\151\1\165\3\uffff\1\156\1\162\1\154\1\uffff\1\163\1\160\4\uffff\2\164\1\172\1\uffff\1\172\1\uffff\1\157\1\uffff\1\162\1\145\1\142\1\141\1\151\1\164\1\165\1\163\1\145\2\172\1\163\1\164\2\172\1\143\2\uffff\1\162\2\172\1\154\1\165\1\156\1\145\1\162\2\172\2\uffff\1\145\1\172\2\uffff\1\150\1\164\2\uffff\1\145\1\154\1\147\1\162\1\156\2\uffff\1\172\1\uffff\3\172\1\164\1\172\1\156\1\172\4\uffff\1\172\1\uffff\1\172\3\uffff";
    static final String DFA12_acceptS =
        "\13\uffff\1\15\2\uffff\1\20\1\uffff\1\22\3\uffff\1\30\1\31\1\32\1\33\1\34\2\uffff\1\37\1\40\1\41\2\uffff\1\52\3\uffff\1\62\1\63\2\uffff\1\67\1\70\2\uffff\1\62\12\uffff\1\10\1\7\1\11\1\60\1\12\1\43\1\13\1\14\1\15\1\42\1\16\1\17\1\20\1\21\1\22\1\65\1\66\1\23\1\24\1\uffff\1\30\1\31\1\32\1\33\1\34\3\uffff\1\37\1\40\1\41\3\uffff\1\52\2\uffff\1\61\1\67\1\63\1\64\3\uffff\1\26\1\uffff\1\46\1\uffff\1\47\20\uffff\1\2\1\3\12\uffff\1\44\1\45\2\uffff\1\55\1\1\2\uffff\1\4\1\53\5\uffff\1\36\1\56\1\uffff\1\54\7\uffff\1\57\1\50\1\25\1\5\1\uffff\1\6\1\uffff\1\35\1\51\1\27";
    static final String DFA12_specialS =
        "\1\1\45\uffff\1\0\1\2\u0080\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\51\1\50\1\43\2\51\1\50\22\51\1\50\1\11\1\46\2\51\1\16\1\22\1\47\1\26\1\27\1\20\1\13\1\30\1\14\1\33\1\21\12\45\1\40\1\51\1\12\1\10\1\7\2\51\13\44\1\41\1\42\5\44\1\6\7\44\1\34\1\51\1\35\1\17\1\44\1\51\1\2\1\44\1\4\1\5\1\44\1\37\1\36\1\44\1\3\6\44\1\23\1\44\1\31\1\1\1\32\6\44\1\24\1\15\1\25\uff82\51",
            "\1\52\5\uffff\1\53",
            "\1\55\20\uffff\1\56",
            "\1\61\6\uffff\1\60\1\57",
            "\1\63\6\uffff\1\62",
            "\1\65\11\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\71",
            "\1\73",
            "\1\75",
            "",
            "\1\100",
            "\1\102",
            "",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\106\4\uffff\1\107",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121\11\uffff\1\122",
            "",
            "",
            "",
            "\1\126",
            "\1\130\15\uffff\1\127",
            "",
            "\1\132",
            "\1\133",
            "\2\135\2\uffff\1\135\22\uffff\1\135",
            "",
            "",
            "\0\137",
            "\0\137",
            "",
            "",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\144\6\54",
            "\1\146",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0086",
            "\1\u0087",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u0095",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_TRUE | RULE_FALSE | RULE_ASSIGNMENT_OP | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='s') ) {s = 1;}

                        else if ( (LA12_0=='a') ) {s = 2;}

                        else if ( (LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0=='d') ) {s = 5;}

                        else if ( (LA12_0=='S') ) {s = 6;}

                        else if ( (LA12_0=='>') ) {s = 7;}

                        else if ( (LA12_0=='=') ) {s = 8;}

                        else if ( (LA12_0=='!') ) {s = 9;}

                        else if ( (LA12_0=='<') ) {s = 10;}

                        else if ( (LA12_0=='+') ) {s = 11;}

                        else if ( (LA12_0=='-') ) {s = 12;}

                        else if ( (LA12_0=='|') ) {s = 13;}

                        else if ( (LA12_0=='%') ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( (LA12_0=='*') ) {s = 16;}

                        else if ( (LA12_0=='/') ) {s = 17;}

                        else if ( (LA12_0=='&') ) {s = 18;}

                        else if ( (LA12_0=='p') ) {s = 19;}

                        else if ( (LA12_0=='{') ) {s = 20;}

                        else if ( (LA12_0=='}') ) {s = 21;}

                        else if ( (LA12_0=='(') ) {s = 22;}

                        else if ( (LA12_0==')') ) {s = 23;}

                        else if ( (LA12_0==',') ) {s = 24;}

                        else if ( (LA12_0=='r') ) {s = 25;}

                        else if ( (LA12_0=='t') ) {s = 26;}

                        else if ( (LA12_0=='.') ) {s = 27;}

                        else if ( (LA12_0=='[') ) {s = 28;}

                        else if ( (LA12_0==']') ) {s = 29;}

                        else if ( (LA12_0=='g') ) {s = 30;}

                        else if ( (LA12_0=='f') ) {s = 31;}

                        else if ( (LA12_0==':') ) {s = 32;}

                        else if ( (LA12_0=='L') ) {s = 33;}

                        else if ( (LA12_0=='M') ) {s = 34;}

                        else if ( (LA12_0=='\n') ) {s = 35;}

                        else if ( ((LA12_0>='A' && LA12_0<='K')||(LA12_0>='N' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='e'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='o')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {s = 36;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 37;}

                        else if ( (LA12_0=='\"') ) {s = 38;}

                        else if ( (LA12_0=='\'') ) {s = 39;}

                        else if ( (LA12_0=='\t'||LA12_0=='\r'||LA12_0==' ') ) {s = 40;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}