package de.nie.fin.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFinLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=5;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_DECIMAL=7;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_TAG=9;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__125=125;
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=6;
    public static final int T__112=112;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalFinLexer() {;} 
    public InternalFinLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFinLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:11:7: ( '=' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:12:7: ( '+=' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:12:9: '+='
            {
            match("+="); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:13:7: ( '||' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:13:9: '||'
            {
            match("||"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:14:7: ( '&&' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:14:9: '&&'
            {
            match("&&"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:15:7: ( '==' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:15:9: '=='
            {
            match("=="); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:16:7: ( '!=' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:16:9: '!='
            {
            match("!="); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:17:7: ( '>=' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:17:9: '>='
            {
            match(">="); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18:7: ( '<=' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18:9: '<='
            {
            match("<="); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19:7: ( '>' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19:9: '>'
            {
            match('>'); 

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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:20:7: ( '<' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:20:9: '<'
            {
            match('<'); 

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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:21:7: ( '->' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:21:9: '->'
            {
            match("->"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:22:7: ( '..' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:22:9: '..'
            {
            match(".."); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:23:7: ( '=>' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:23:9: '=>'
            {
            match("=>"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:24:7: ( '<>' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:24:9: '<>'
            {
            match("<>"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:25:7: ( '?:' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:25:9: '?:'
            {
            match("?:"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:26:7: ( '<=>' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:26:9: '<=>'
            {
            match("<=>"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:27:7: ( '+' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:27:9: '+'
            {
            match('+'); 

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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:28:7: ( '-' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:28:9: '-'
            {
            match('-'); 

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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:29:7: ( '*' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:29:9: '*'
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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:30:7: ( '**' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:30:9: '**'
            {
            match("**"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:31:7: ( '/' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:31:9: '/'
            {
            match('/'); 

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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:32:7: ( '%' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:32:9: '%'
            {
            match('%'); 

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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:33:7: ( '!' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:33:9: '!'
            {
            match('!'); 

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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:34:7: ( '.' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:34:9: '.'
            {
            match('.'); 

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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:35:7: ( 'val' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:35:9: 'val'
            {
            match("val"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:36:7: ( 'super' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:36:9: 'super'
            {
            match("super"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:37:7: ( 'false' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:37:9: 'false'
            {
            match("false"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:38:7: ( 'monatlich' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:38:9: 'monatlich'
            {
            match("monatlich"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:39:7: ( 'Januar' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:39:9: 'Januar'
            {
            match("Januar"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:40:7: ( 'Jan' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:40:9: 'Jan'
            {
            match("Jan"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:41:7: ( 'Februar' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:41:9: 'Februar'
            {
            match("Februar"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:42:7: ( 'Feb' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:42:9: 'Feb'
            {
            match("Feb"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:43:7: ( 'M\\u00E4rz' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:43:9: 'M\\u00E4rz'
            {
            match("M\u00E4rz"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:44:7: ( 'Mar' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:44:9: 'Mar'
            {
            match("Mar"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:45:7: ( 'April' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:45:9: 'April'
            {
            match("April"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:46:7: ( 'Apr' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:46:9: 'Apr'
            {
            match("Apr"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:47:7: ( 'Mai' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:47:9: 'Mai'
            {
            match("Mai"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:48:7: ( 'May' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:48:9: 'May'
            {
            match("May"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:49:7: ( 'Juni' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:49:9: 'Juni'
            {
            match("Juni"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:50:7: ( 'Jun' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:50:9: 'Jun'
            {
            match("Jun"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:51:7: ( 'Juli' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:51:9: 'Juli'
            {
            match("Juli"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:52:7: ( 'Jul' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:52:9: 'Jul'
            {
            match("Jul"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:53:7: ( 'August' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:53:9: 'August'
            {
            match("August"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:54:7: ( 'Aug' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:54:9: 'Aug'
            {
            match("Aug"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:55:7: ( 'September' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:55:9: 'September'
            {
            match("September"); 


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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:56:7: ( 'Sep' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:56:9: 'Sep'
            {
            match("Sep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:57:7: ( 'Oktober' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:57:9: 'Oktober'
            {
            match("Oktober"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:58:7: ( 'Okt' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:58:9: 'Okt'
            {
            match("Okt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:59:7: ( 'November' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:59:9: 'November'
            {
            match("November"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:60:7: ( 'Nov' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:60:9: 'Nov'
            {
            match("Nov"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:61:7: ( 'Dezember' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:61:9: 'Dezember'
            {
            match("Dezember"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:62:7: ( 'Dez' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:62:9: 'Dez'
            {
            match("Dez"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:63:7: ( 'package' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:63:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:64:7: ( 'import' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:64:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:65:7: ( 'Konto' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:65:9: 'Konto'
            {
            match("Konto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:66:7: ( '{' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:66:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:67:7: ( 'KtoNr' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:67:9: 'KtoNr'
            {
            match("KtoNr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:68:7: ( 'Blz' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:68:9: 'Blz'
            {
            match("Blz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:69:7: ( 'Bank' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:69:9: 'Bank'
            {
            match("Bank"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:70:7: ( 'Verwendung' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:70:9: 'Verwendung'
            {
            match("Verwendung"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:71:7: ( 'Inhaber' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:71:9: 'Inhaber'
            {
            match("Inhaber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:72:7: ( '}' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:72:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:73:7: ( 'Buchungsintervall' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:73:9: 'Buchungsintervall'
            {
            match("Buchungsintervall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:74:7: ( 'Zum' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:74:9: 'Zum'
            {
            match("Zum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:75:7: ( 'der Monate' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:75:9: 'der Monate'
            {
            match("der Monate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:76:7: ( ',' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:76:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:77:7: ( 'Kategorie' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:77:9: 'Kategorie'
            {
            match("Kategorie"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:78:7: ( 'Buchung' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:78:9: 'Buchung'
            {
            match("Buchung"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:79:7: ( 'Betrag' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:79:9: 'Betrag'
            {
            match("Betrag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:80:7: ( 'Empf\\u00E4nger' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:80:9: 'Empf\\u00E4nger'
            {
            match("Empf\u00E4nger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:81:7: ( 'Empf\\u00E4ngerKonto' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:81:9: 'Empf\\u00E4ngerKonto'
            {
            match("Empf\u00E4ngerKonto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:82:7: ( 'von' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:82:9: 'von'
            {
            match("von"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:83:7: ( 'Intervall' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:83:9: 'Intervall'
            {
            match("Intervall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:84:7: ( 'Kontakt' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:84:9: 'Kontakt'
            {
            match("Kontakt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:85:7: ( 'Stra\\u00DFe' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:85:9: 'Stra\\u00DFe'
            {
            match("Stra\u00DFe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:86:7: ( 'PLZ' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:86:9: 'PLZ'
            {
            match("PLZ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:87:7: ( 'Ort' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:87:9: 'Ort'
            {
            match("Ort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:88:7: ( 'Konten' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:88:9: 'Konten'
            {
            match("Konten"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:89:7: ( 'Bemerkung' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:89:9: 'Bemerkung'
            {
            match("Bemerkung"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:90:7: ( 'instanceof' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:90:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:91:7: ( 'as' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:91:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:92:7: ( ')' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:92:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:93:7: ( ']' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:93:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:94:7: ( '[' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:94:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:95:7: ( ';' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:95:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:96:7: ( '(' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:96:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:97:8: ( 'if' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:97:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:98:8: ( 'else' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:98:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:99:8: ( 'switch' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:99:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:100:8: ( ':' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:100:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:101:8: ( 'default' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:101:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:102:8: ( 'case' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:102:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:103:8: ( 'for' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:103:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:104:8: ( 'while' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:104:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:105:8: ( 'do' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:105:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:106:8: ( '::' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:106:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:107:8: ( 'new' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:107:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:108:8: ( 'null' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:108:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:109:8: ( 'typeof' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:109:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:110:8: ( 'throw' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:110:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:111:8: ( 'return' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:111:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:112:8: ( 'try' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:112:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:113:8: ( 'finally' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:113:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:114:8: ( 'catch' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:114:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:115:8: ( '?' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:115:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:116:8: ( 'extends' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:116:10: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:117:8: ( '&' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:117:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:118:8: ( '?.' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:118:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:119:8: ( '*.' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:119:10: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:120:8: ( '|' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:120:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:121:8: ( 'var' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:121:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:122:8: ( 'true' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:122:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "RULE_TAG"
    public final void mRULE_TAG() throws RecognitionException {
        try {
            int _type = RULE_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:10: ( ( '1.' | '2.' | '3.' | '4.' | '5.' | '6.' | '7.' | '8.' | '9.' | '10.' | '11.' | '12.' | '13.' | '14.' | '15.' | '16.' | '17.' | '18.' | '19.' | '20.' | '21.' | '22.' | '23.' | '24.' | '25.' | '26.' | '27.' | '28.' | '29.' | '30.' | '31.' ) )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:12: ( '1.' | '2.' | '3.' | '4.' | '5.' | '6.' | '7.' | '8.' | '9.' | '10.' | '11.' | '12.' | '13.' | '14.' | '15.' | '16.' | '17.' | '18.' | '19.' | '20.' | '21.' | '22.' | '23.' | '24.' | '25.' | '26.' | '27.' | '28.' | '29.' | '30.' | '31.' )
            {
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:12: ( '1.' | '2.' | '3.' | '4.' | '5.' | '6.' | '7.' | '8.' | '9.' | '10.' | '11.' | '12.' | '13.' | '14.' | '15.' | '16.' | '17.' | '18.' | '19.' | '20.' | '21.' | '22.' | '23.' | '24.' | '25.' | '26.' | '27.' | '28.' | '29.' | '30.' | '31.' )
            int alt1=31;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:13: '1.'
                    {
                    match("1."); 


                    }
                    break;
                case 2 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:18: '2.'
                    {
                    match("2."); 


                    }
                    break;
                case 3 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:23: '3.'
                    {
                    match("3."); 


                    }
                    break;
                case 4 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:28: '4.'
                    {
                    match("4."); 


                    }
                    break;
                case 5 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:33: '5.'
                    {
                    match("5."); 


                    }
                    break;
                case 6 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:38: '6.'
                    {
                    match("6."); 


                    }
                    break;
                case 7 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:43: '7.'
                    {
                    match("7."); 


                    }
                    break;
                case 8 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:48: '8.'
                    {
                    match("8."); 


                    }
                    break;
                case 9 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:53: '9.'
                    {
                    match("9."); 


                    }
                    break;
                case 10 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:58: '10.'
                    {
                    match("10."); 


                    }
                    break;
                case 11 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:64: '11.'
                    {
                    match("11."); 


                    }
                    break;
                case 12 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:70: '12.'
                    {
                    match("12."); 


                    }
                    break;
                case 13 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:76: '13.'
                    {
                    match("13."); 


                    }
                    break;
                case 14 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:82: '14.'
                    {
                    match("14."); 


                    }
                    break;
                case 15 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:88: '15.'
                    {
                    match("15."); 


                    }
                    break;
                case 16 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:94: '16.'
                    {
                    match("16."); 


                    }
                    break;
                case 17 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:100: '17.'
                    {
                    match("17."); 


                    }
                    break;
                case 18 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:106: '18.'
                    {
                    match("18."); 


                    }
                    break;
                case 19 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:112: '19.'
                    {
                    match("19."); 


                    }
                    break;
                case 20 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:118: '20.'
                    {
                    match("20."); 


                    }
                    break;
                case 21 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:124: '21.'
                    {
                    match("21."); 


                    }
                    break;
                case 22 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:130: '22.'
                    {
                    match("22."); 


                    }
                    break;
                case 23 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:136: '23.'
                    {
                    match("23."); 


                    }
                    break;
                case 24 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:142: '24.'
                    {
                    match("24."); 


                    }
                    break;
                case 25 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:148: '25.'
                    {
                    match("25."); 


                    }
                    break;
                case 26 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:154: '26.'
                    {
                    match("26."); 


                    }
                    break;
                case 27 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:160: '27.'
                    {
                    match("27."); 


                    }
                    break;
                case 28 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:166: '28.'
                    {
                    match("28."); 


                    }
                    break;
                case 29 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:172: '29.'
                    {
                    match("29."); 


                    }
                    break;
                case 30 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:178: '30.'
                    {
                    match("30."); 


                    }
                    break;
                case 31 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18988:184: '31.'
                    {
                    match("31."); 


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
    // $ANTLR end "RULE_TAG"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:12: ( '0x' | '0X' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='x') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='X') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='f')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='#') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='B'||LA4_0=='b') ) {
                        alt4=1;
                    }
                    else if ( (LA4_0=='L'||LA4_0=='l') ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18990:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18992:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18992:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18992:21: ( '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||LA6_0=='_') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18994:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18994:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18994:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18994:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18994:36: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18994:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='B'||LA9_0=='b') ) {
                alt9=1;
            }
            else if ( (LA9_0=='D'||LA9_0=='F'||LA9_0=='L'||LA9_0=='d'||LA9_0=='f'||LA9_0=='l') ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18994:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18994:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18996:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18996:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18996:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18996:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18996:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='$'||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:18998:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19000:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19000:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19000:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19000:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19002:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19002:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19002:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19002:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19002:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19002:41: ( '\\r' )? '\\n'
                    {
                    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19002:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19002:41: '\\r'
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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19004:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19004:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19004:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19006:16: ( . )
            // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:19006:18: .
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
        // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | RULE_TAG | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=122;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:547: T__103
                {
                mT__103(); 

                }
                break;
            case 91 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:554: T__104
                {
                mT__104(); 

                }
                break;
            case 92 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:561: T__105
                {
                mT__105(); 

                }
                break;
            case 93 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:568: T__106
                {
                mT__106(); 

                }
                break;
            case 94 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:575: T__107
                {
                mT__107(); 

                }
                break;
            case 95 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:582: T__108
                {
                mT__108(); 

                }
                break;
            case 96 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:589: T__109
                {
                mT__109(); 

                }
                break;
            case 97 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:596: T__110
                {
                mT__110(); 

                }
                break;
            case 98 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:603: T__111
                {
                mT__111(); 

                }
                break;
            case 99 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:610: T__112
                {
                mT__112(); 

                }
                break;
            case 100 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:617: T__113
                {
                mT__113(); 

                }
                break;
            case 101 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:624: T__114
                {
                mT__114(); 

                }
                break;
            case 102 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:631: T__115
                {
                mT__115(); 

                }
                break;
            case 103 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:638: T__116
                {
                mT__116(); 

                }
                break;
            case 104 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:645: T__117
                {
                mT__117(); 

                }
                break;
            case 105 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:652: T__118
                {
                mT__118(); 

                }
                break;
            case 106 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:659: T__119
                {
                mT__119(); 

                }
                break;
            case 107 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:666: T__120
                {
                mT__120(); 

                }
                break;
            case 108 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:673: T__121
                {
                mT__121(); 

                }
                break;
            case 109 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:680: T__122
                {
                mT__122(); 

                }
                break;
            case 110 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:687: T__123
                {
                mT__123(); 

                }
                break;
            case 111 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:694: T__124
                {
                mT__124(); 

                }
                break;
            case 112 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:701: T__125
                {
                mT__125(); 

                }
                break;
            case 113 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:708: RULE_TAG
                {
                mRULE_TAG(); 

                }
                break;
            case 114 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:717: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 115 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:726: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 116 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:735: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 117 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:748: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 118 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:756: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 119 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:768: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 120 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:784: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 121 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:800: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 122 :
                // ../de.nie.fin.ui/src-gen/de/nie/fin/ui/contentassist/antlr/internal/InternalFin.g:1:808: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA1_eotS =
        "\43\uffff";
    static final String DFA1_eofS =
        "\43\uffff";
    static final String DFA1_minS =
        "\1\61\3\56\37\uffff";
    static final String DFA1_maxS =
        "\3\71\1\61\37\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\1\1\12\1\13\1\14\1\15\1\16"+
        "\1\17\1\20\1\21\1\22\1\23\1\2\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
        "\1\33\1\34\1\35\1\3\1\36\1\37";
    static final String DFA1_specialS =
        "\43\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12\1\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\24",
            "\1\25\1\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
            "\1\37",
            "\1\40\1\uffff\1\41\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "18988:12: ( '1.' | '2.' | '3.' | '4.' | '5.' | '6.' | '7.' | '8.' | '9.' | '10.' | '11.' | '12.' | '13.' | '14.' | '15.' | '16.' | '17.' | '18.' | '19.' | '20.' | '21.' | '22.' | '23.' | '24.' | '25.' | '26.' | '27.' | '28.' | '29.' | '30.' | '31.' )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\106\1\110\1\112\1\114\1\116\1\120\1\123\1\125\1\127"+
        "\1\132\1\135\1\140\1\uffff\17\144\1\uffff\3\144\1\uffff\2\144\1"+
        "\uffff\3\144\5\uffff\1\144\1\u0096\5\144\12\u00ab\1\103\1\uffff"+
        "\2\103\17\uffff\1\u00bd\20\uffff\2\144\1\uffff\11\144\1\uffff\14"+
        "\144\1\u00d9\3\144\1\uffff\6\144\1\uffff\2\144\1\u00e8\1\uffff\2"+
        "\144\1\u00eb\5\uffff\2\144\2\uffff\10\144\1\uffff\13\u00ab\2\uffff"+
        "\14\u00ab\5\uffff\1\u00f8\1\u00f9\1\u00fa\3\144\1\u00fe\2\144\1"+
        "\u0102\1\u0104\1\u0106\1\u0108\1\u0109\1\u010a\1\u010b\1\u010d\1"+
        "\u010f\1\u0111\1\144\1\u0114\1\u0115\1\u0117\1\u0119\3\144\1\uffff"+
        "\3\144\1\u0120\7\144\1\u0128\2\144\1\uffff\1\144\1\u012c\1\uffff"+
        "\5\144\1\u0132\3\144\1\u0136\2\144\3\uffff\3\144\1\uffff\3\144\1"+
        "\uffff\1\u013f\1\uffff\1\u0140\1\uffff\1\144\4\uffff\1\144\1\uffff"+
        "\1\144\1\uffff\1\144\1\uffff\2\144\2\uffff\1\144\1\uffff\1\144\1"+
        "\uffff\6\144\1\uffff\1\u0151\6\144\2\uffff\2\144\1\uffff\1\u015a"+
        "\1\144\1\u015c\2\144\1\uffff\1\u015f\2\144\1\uffff\1\u0162\1\144"+
        "\1\u0164\1\144\1\u0166\3\144\2\uffff\1\144\1\u016b\2\144\1\uffff"+
        "\6\144\1\u0174\2\144\1\u0177\1\144\1\uffff\7\144\2\uffff\1\144\1"+
        "\uffff\1\u0182\1\u0183\1\uffff\1\144\1\u0185\1\uffff\1\144\1\uffff"+
        "\1\u0187\1\uffff\2\144\1\u018a\1\144\1\uffff\1\u018c\5\144\1\u0192"+
        "\1\144\1\uffff\1\144\1\u0195\1\uffff\2\144\1\u0198\5\144\1\uffff"+
        "\1\144\2\uffff\1\u01a0\1\uffff\1\u01a1\1\uffff\1\u01a2\1\144\1\uffff"+
        "\1\u01a4\1\uffff\1\144\1\u01a6\2\144\1\u01a9\1\uffff\1\144\1\u01ab"+
        "\1\uffff\1\144\1\u01ae\1\uffff\2\144\1\u01b1\1\144\1\u01b3\1\uffff"+
        "\1\u01b5\3\uffff\1\144\1\uffff\1\144\1\uffff\1\u01b8\1\u01b9\1\uffff"+
        "\1\144\1\uffff\2\144\1\uffff\2\144\1\uffff\1\144\3\uffff\1\u01c1"+
        "\1\u01c2\2\uffff\1\144\1\u01c4\1\144\1\u01c6\1\144\1\u01c8\1\u01ca"+
        "\2\uffff\1\u01cb\1\uffff\1\144\1\uffff\1\u01cd\4\uffff\1\144\1\uffff"+
        "\5\144\1\u01d4\1\uffff";
    static final String DFA20_eofS =
        "\u01d5\uffff";
    static final String DFA20_minS =
        "\1\0\2\75\1\174\1\46\3\75\1\76\2\56\2\52\1\uffff\1\141\1\165\1"+
        "\141\1\157\1\141\1\145\1\141\1\160\1\145\1\153\1\157\1\145\1\141"+
        "\1\146\1\141\1\uffff\1\141\1\145\1\156\1\uffff\1\165\1\145\1\uffff"+
        "\1\155\1\114\1\163\5\uffff\1\154\1\72\1\141\1\150\1\145\1\150\1"+
        "\145\11\56\1\60\1\44\1\uffff\2\0\17\uffff\1\76\20\uffff\1\154\1"+
        "\156\1\uffff\1\160\1\151\1\154\1\162\3\156\1\154\1\142\1\uffff\1"+
        "\151\1\162\1\147\1\160\1\162\2\164\1\166\1\172\1\143\1\160\1\163"+
        "\1\44\1\156\1\157\1\164\1\uffff\1\172\1\156\1\143\1\155\1\162\1"+
        "\150\1\uffff\1\155\1\146\1\44\1\uffff\1\160\1\132\1\44\5\uffff\1"+
        "\163\1\164\2\uffff\1\163\1\151\1\167\1\154\1\160\1\162\1\165\1\164"+
        "\1\uffff\12\56\1\60\2\uffff\14\56\5\uffff\3\44\1\145\1\164\1\163"+
        "\1\44\2\141\12\44\1\141\4\44\1\153\1\157\1\164\1\uffff\1\164\1\116"+
        "\1\145\1\44\1\153\1\150\1\162\1\145\1\167\1\141\1\145\1\44\1\40"+
        "\1\141\1\uffff\1\146\1\44\1\uffff\3\145\1\143\1\154\1\44\1\154\1"+
        "\145\1\157\1\44\1\145\1\165\3\uffff\1\162\1\143\1\145\1\uffff\1"+
        "\154\1\164\1\141\1\uffff\1\44\1\uffff\1\44\1\uffff\1\165\4\uffff"+
        "\1\154\1\uffff\1\163\1\uffff\1\145\1\uffff\1\u00df\1\142\2\uffff"+
        "\1\155\1\uffff\1\155\1\uffff\1\141\1\162\2\141\1\162\1\147\1\uffff"+
        "\1\44\1\165\1\141\1\162\1\145\1\142\1\162\2\uffff\1\165\1\u00e4"+
        "\1\uffff\1\44\1\156\1\44\1\150\1\145\1\uffff\1\44\1\157\1\167\1"+
        "\uffff\1\44\1\162\1\44\1\150\1\44\2\154\1\162\2\uffff\1\141\1\44"+
        "\1\164\1\155\1\uffff\1\145\2\142\1\147\1\164\1\156\1\44\1\153\1"+
        "\156\1\44\1\157\1\uffff\1\156\1\147\1\153\1\156\1\145\1\166\1\154"+
        "\1\156\1\uffff\1\144\1\uffff\2\44\1\uffff\1\146\1\44\1\uffff\1\156"+
        "\1\uffff\1\44\1\uffff\1\171\1\151\1\44\1\162\1\uffff\1\44\1\142"+
        "\1\162\3\145\1\44\1\143\1\uffff\1\164\1\44\1\uffff\1\162\1\147\1"+
        "\44\1\165\1\144\1\162\1\141\1\164\1\147\1\163\2\uffff\1\44\1\uffff"+
        "\1\44\1\uffff\1\44\1\143\1\uffff\1\44\1\uffff\1\145\1\44\2\162\1"+
        "\44\1\uffff\1\145\1\44\1\uffff\1\151\1\44\1\uffff\1\156\1\165\1"+
        "\44\1\154\1\44\1\145\1\44\3\uffff\1\150\1\uffff\1\162\1\uffff\2"+
        "\44\1\uffff\1\157\1\uffff\1\145\1\151\1\uffff\1\147\1\156\1\uffff"+
        "\1\154\1\uffff\1\162\1\uffff\2\44\2\uffff\1\146\1\44\1\156\1\44"+
        "\1\147\1\44\1\113\2\uffff\1\44\1\uffff\1\164\1\uffff\1\44\4\uffff"+
        "\1\145\1\uffff\1\162\1\166\1\141\2\154\1\44\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\76\1\75\1\174\1\46\2\75\2\76\1\56\1\72\1\56\1\57\1\uffff"+
        "\1\157\1\167\2\157\1\165\1\145\1\u00e4\1\165\1\164\1\162\1\157\1"+
        "\145\1\141\1\156\1\164\1\uffff\1\165\1\145\1\156\1\uffff\1\165\1"+
        "\157\1\uffff\1\155\1\114\1\163\5\uffff\1\170\1\72\1\141\1\150\1"+
        "\165\1\171\1\145\11\154\1\170\1\172\1\uffff\2\uffff\17\uffff\1\76"+
        "\20\uffff\1\162\1\156\1\uffff\1\160\1\151\1\154\1\162\4\156\1\142"+
        "\1\uffff\1\171\1\162\1\147\1\160\1\162\2\164\1\166\1\172\1\143\1"+
        "\160\1\163\1\172\1\156\1\157\1\164\1\uffff\1\172\1\156\1\143\1\164"+
        "\1\162\1\164\1\uffff\1\155\1\162\1\172\1\uffff\1\160\1\132\1\172"+
        "\5\uffff\1\163\1\164\2\uffff\1\164\1\151\1\167\1\154\1\160\1\162"+
        "\1\171\1\164\1\uffff\13\154\2\uffff\14\154\5\uffff\3\172\1\145\1"+
        "\164\1\163\1\172\2\141\12\172\1\141\4\172\1\153\1\157\1\164\1\uffff"+
        "\1\164\1\116\1\145\1\172\1\153\1\150\1\162\1\145\1\167\1\141\1\145"+
        "\1\172\1\40\1\141\1\uffff\1\146\1\172\1\uffff\3\145\1\143\1\154"+
        "\1\172\1\154\1\145\1\157\1\172\1\145\1\165\3\uffff\1\162\1\143\1"+
        "\145\1\uffff\1\154\1\164\1\141\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\165\4\uffff\1\154\1\uffff\1\163\1\uffff\1\145\1\uffff\1\u00df"+
        "\1\142\2\uffff\1\155\1\uffff\1\155\1\uffff\1\141\1\162\1\141\1\157"+
        "\1\162\1\147\1\uffff\1\172\1\165\1\141\1\162\1\145\1\142\1\162\2"+
        "\uffff\1\165\1\u00e4\1\uffff\1\172\1\156\1\172\1\150\1\145\1\uffff"+
        "\1\172\1\157\1\167\1\uffff\1\172\1\162\1\172\1\150\1\172\2\154\1"+
        "\162\2\uffff\1\141\1\172\1\164\1\155\1\uffff\1\145\2\142\1\147\1"+
        "\164\1\156\1\172\1\153\1\156\1\172\1\157\1\uffff\1\156\1\147\1\153"+
        "\1\156\1\145\1\166\1\154\1\156\1\uffff\1\144\1\uffff\2\172\1\uffff"+
        "\1\146\1\172\1\uffff\1\156\1\uffff\1\172\1\uffff\1\171\1\151\1\172"+
        "\1\162\1\uffff\1\172\1\142\1\162\3\145\1\172\1\143\1\uffff\1\164"+
        "\1\172\1\uffff\1\162\1\147\1\172\1\165\1\144\1\162\1\141\1\164\1"+
        "\147\1\163\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\143\1\uffff"+
        "\1\172\1\uffff\1\145\1\172\2\162\1\172\1\uffff\1\145\1\172\1\uffff"+
        "\1\151\1\172\1\uffff\1\156\1\165\1\172\1\154\1\172\1\145\1\172\3"+
        "\uffff\1\150\1\uffff\1\162\1\uffff\2\172\1\uffff\1\157\1\uffff\1"+
        "\145\1\151\1\uffff\1\147\1\156\1\uffff\1\154\1\uffff\1\162\1\uffff"+
        "\2\172\2\uffff\1\146\1\172\1\156\1\172\1\147\1\172\1\113\2\uffff"+
        "\1\172\1\uffff\1\164\1\uffff\1\172\4\uffff\1\145\1\uffff\1\162\1"+
        "\166\1\141\2\154\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\15\uffff\1\26\17\uffff\1\70\3\uffff\1\76\2\uffff\1\102\3\uffff"+
        "\1\122\1\123\1\124\1\125\1\126\22\uffff\1\165\2\uffff\1\171\1\172"+
        "\1\5\1\15\1\1\1\2\1\21\1\3\1\156\1\4\1\153\1\6\1\27\1\7\1\11\1\uffff"+
        "\1\16\1\12\1\13\1\22\1\14\1\30\1\17\1\154\1\151\1\24\1\155\1\23"+
        "\1\167\1\170\1\25\1\26\2\uffff\1\165\11\uffff\1\41\20\uffff\1\70"+
        "\6\uffff\1\76\3\uffff\1\102\3\uffff\1\122\1\123\1\124\1\125\1\126"+
        "\2\uffff\1\140\1\132\10\uffff\1\161\13\uffff\1\163\1\164\14\uffff"+
        "\1\162\1\166\1\171\1\20\1\10\33\uffff\1\127\16\uffff\1\137\2\uffff"+
        "\1\121\14\uffff\1\31\1\157\1\110\3\uffff\1\135\3\uffff\1\36\1\uffff"+
        "\1\50\1\uffff\1\52\1\uffff\1\40\1\42\1\45\1\46\1\uffff\1\44\1\uffff"+
        "\1\54\1\uffff\1\56\2\uffff\1\60\1\115\1\uffff\1\62\1\uffff\1\64"+
        "\6\uffff\1\72\7\uffff\1\100\1\101\2\uffff\1\114\5\uffff\1\141\3"+
        "\uffff\1\146\10\uffff\1\47\1\51\4\uffff\1\113\13\uffff\1\73\10\uffff"+
        "\1\130\1\uffff\1\134\2\uffff\1\142\2\uffff\1\160\1\uffff\1\32\1"+
        "\uffff\1\33\4\uffff\1\43\10\uffff\1\67\2\uffff\1\71\12\uffff\1\150"+
        "\1\136\1\uffff\1\144\1\uffff\1\131\2\uffff\1\35\1\uffff\1\53\5\uffff"+
        "\1\66\2\uffff\1\116\2\uffff\1\105\7\uffff\1\143\1\145\1\147\1\uffff"+
        "\1\37\1\uffff\1\57\2\uffff\1\65\1\uffff\1\112\2\uffff\1\104\2\uffff"+
        "\1\75\1\uffff\1\133\1\uffff\1\152\2\uffff\1\61\1\63\7\uffff\1\34"+
        "\1\55\1\uffff\1\103\1\uffff\1\117\1\uffff\1\111\1\107\1\106\1\120"+
        "\1\uffff\1\74\6\uffff\1\77";
    static final String DFA20_specialS =
        "\1\1\77\uffff\1\2\1\0\u0193\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\103\2\102\2\103\1\102\22\103\1\102\1\5\1\100\1\103\1\77"+
            "\1\15\1\4\1\101\1\54\1\50\1\13\1\2\1\44\1\10\1\11\1\14\1\75"+
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\56\1\53\1\7"+
            "\1\1\1\6\1\12\1\103\1\25\1\36\1\77\1\31\1\45\1\23\2\77\1\40"+
            "\1\22\1\34\1\77\1\24\1\30\1\27\1\46\2\77\1\26\2\77\1\37\3\77"+
            "\1\42\1\52\1\103\1\51\1\76\1\77\1\103\1\47\1\77\1\57\1\43\1"+
            "\55\1\20\2\77\1\33\3\77\1\21\1\61\1\77\1\32\1\77\1\63\1\17\1"+
            "\62\1\77\1\16\1\60\3\77\1\35\1\3\1\41\uff82\103",
            "\1\104\1\105",
            "\1\107",
            "\1\111",
            "\1\113",
            "\1\115",
            "\1\117",
            "\1\121\1\122",
            "\1\124",
            "\1\126",
            "\1\131\13\uffff\1\130",
            "\1\133\3\uffff\1\134",
            "\1\136\4\uffff\1\137",
            "",
            "\1\142\15\uffff\1\143",
            "\1\145\1\uffff\1\146",
            "\1\147\7\uffff\1\151\5\uffff\1\150",
            "\1\152",
            "\1\153\23\uffff\1\154",
            "\1\155",
            "\1\157\u0082\uffff\1\156",
            "\1\160\4\uffff\1\161",
            "\1\162\16\uffff\1\163",
            "\1\164\6\uffff\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\173\6\uffff\1\171\1\172",
            "\1\176\15\uffff\1\174\4\uffff\1\175",
            "",
            "\1\u0081\3\uffff\1\u0083\6\uffff\1\u0080\10\uffff\1\u0082",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0087",
            "\1\u0088\11\uffff\1\u0089",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "\1\u0093\13\uffff\1\u0094",
            "\1\u0095",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\17\uffff\1\u009a",
            "\1\u009c\11\uffff\1\u009d\6\uffff\1\u009b",
            "\1\u009e",
            "\1\u009f\1\uffff\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1"+
            "\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\10\uffff\1\u00ac\1\uffff"+
            "\3\u00ac\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1"+
            "\uffff\3\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1"+
            "\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\10\uffff\1\u00ac\1\uffff"+
            "\3\u00ac\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1"+
            "\uffff\3\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\1\u00b7\1\u00b8\10\u00aa\10\uffff\1\u00ac"+
            "\1\uffff\3\u00ac\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1"+
            "\u00ac\1\uffff\3\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac\5\uffff\1\u00ac"+
            "\13\uffff\1\u00b9\6\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac\13\uffff\1\u00b9",
            "\1\144\34\uffff\32\144\4\uffff\1\144\1\uffff\32\144",
            "",
            "\0\u00ba",
            "\0\u00ba",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be\5\uffff\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c9\1\uffff\1\u00c8",
            "\1\u00ca",
            "",
            "\1\u00cc\10\uffff\1\u00cb\6\uffff\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e1\6\uffff\1\u00e0",
            "\1\u00e2",
            "\1\u00e3\13\uffff\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e7\13\uffff\1\u00e6",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f6\3\uffff\1\u00f5",
            "\1\u00f7",
            "",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac\5\uffff\1\u00ac"+
            "\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3\u00ac\5\uffff\1"+
            "\u00ac",
            "",
            "",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "\1\u009f\1\uffff\12\u00aa\10\uffff\1\u00ac\1\uffff\3\u00ac"+
            "\5\uffff\1\u00ac\22\uffff\1\u00aa\2\uffff\1\u00ac\1\uffff\3"+
            "\u00ac\5\uffff\1\u00ac",
            "",
            "",
            "",
            "",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u00ff",
            "\1\u0100",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\24\144\1\u0101\5\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\10\144\1\u0103\21\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\10\144\1\u0105\21\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\21\144\1\u0107\10\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\10\144\1\u010c\21\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\24\144\1\u010e\5\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\23\144\1\u0110\6\144",
            "\1\u0112",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\16\144\1\u0113\13\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\4\144\1\u0116\25\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\4\144\1\u0118\25\144",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0137",
            "\1\u0138",
            "",
            "",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u0141",
            "",
            "",
            "",
            "",
            "\1\u0142",
            "",
            "\1\u0143",
            "",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "",
            "",
            "\1\u0147",
            "",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014d\3\uffff\1\u014e\11\uffff\1\u014c",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u015b",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0160",
            "\1\u0161",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0163",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0165",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "",
            "\1\u016a",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u016c",
            "\1\u016d",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0175",
            "\1\u0176",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "",
            "\1\u0181",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u0184",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u0186",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u018b",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0193",
            "",
            "\1\u0194",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u0196",
            "\1\u0197",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u01a3",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u01a5",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u01a7",
            "\1\u01a8",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u01aa",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u01ac",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\22\144\1\u01ad\7\144",
            "",
            "\1\u01af",
            "\1\u01b0",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u01b2",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u01b4",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "",
            "",
            "\1\u01b6",
            "",
            "\1\u01b7",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u01ba",
            "",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "\1\u01bd",
            "\1\u01be",
            "",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "",
            "\1\u01c3",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u01c5",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u01c7",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "\1\u01c9",
            "",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "\1\u01cc",
            "",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            "",
            "",
            "",
            "",
            "\1\u01ce",
            "",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\144\13\uffff\12\144\7\uffff\32\144\4\uffff\1\144\1\uffff"+
            "\32\144",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | RULE_TAG | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_65 = input.LA(1);

                        s = -1;
                        if ( ((LA20_65>='\u0000' && LA20_65<='\uFFFF')) ) {s = 186;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='=') ) {s = 1;}

                        else if ( (LA20_0=='+') ) {s = 2;}

                        else if ( (LA20_0=='|') ) {s = 3;}

                        else if ( (LA20_0=='&') ) {s = 4;}

                        else if ( (LA20_0=='!') ) {s = 5;}

                        else if ( (LA20_0=='>') ) {s = 6;}

                        else if ( (LA20_0=='<') ) {s = 7;}

                        else if ( (LA20_0=='-') ) {s = 8;}

                        else if ( (LA20_0=='.') ) {s = 9;}

                        else if ( (LA20_0=='?') ) {s = 10;}

                        else if ( (LA20_0=='*') ) {s = 11;}

                        else if ( (LA20_0=='/') ) {s = 12;}

                        else if ( (LA20_0=='%') ) {s = 13;}

                        else if ( (LA20_0=='v') ) {s = 14;}

                        else if ( (LA20_0=='s') ) {s = 15;}

                        else if ( (LA20_0=='f') ) {s = 16;}

                        else if ( (LA20_0=='m') ) {s = 17;}

                        else if ( (LA20_0=='J') ) {s = 18;}

                        else if ( (LA20_0=='F') ) {s = 19;}

                        else if ( (LA20_0=='M') ) {s = 20;}

                        else if ( (LA20_0=='A') ) {s = 21;}

                        else if ( (LA20_0=='S') ) {s = 22;}

                        else if ( (LA20_0=='O') ) {s = 23;}

                        else if ( (LA20_0=='N') ) {s = 24;}

                        else if ( (LA20_0=='D') ) {s = 25;}

                        else if ( (LA20_0=='p') ) {s = 26;}

                        else if ( (LA20_0=='i') ) {s = 27;}

                        else if ( (LA20_0=='K') ) {s = 28;}

                        else if ( (LA20_0=='{') ) {s = 29;}

                        else if ( (LA20_0=='B') ) {s = 30;}

                        else if ( (LA20_0=='V') ) {s = 31;}

                        else if ( (LA20_0=='I') ) {s = 32;}

                        else if ( (LA20_0=='}') ) {s = 33;}

                        else if ( (LA20_0=='Z') ) {s = 34;}

                        else if ( (LA20_0=='d') ) {s = 35;}

                        else if ( (LA20_0==',') ) {s = 36;}

                        else if ( (LA20_0=='E') ) {s = 37;}

                        else if ( (LA20_0=='P') ) {s = 38;}

                        else if ( (LA20_0=='a') ) {s = 39;}

                        else if ( (LA20_0==')') ) {s = 40;}

                        else if ( (LA20_0==']') ) {s = 41;}

                        else if ( (LA20_0=='[') ) {s = 42;}

                        else if ( (LA20_0==';') ) {s = 43;}

                        else if ( (LA20_0=='(') ) {s = 44;}

                        else if ( (LA20_0=='e') ) {s = 45;}

                        else if ( (LA20_0==':') ) {s = 46;}

                        else if ( (LA20_0=='c') ) {s = 47;}

                        else if ( (LA20_0=='w') ) {s = 48;}

                        else if ( (LA20_0=='n') ) {s = 49;}

                        else if ( (LA20_0=='t') ) {s = 50;}

                        else if ( (LA20_0=='r') ) {s = 51;}

                        else if ( (LA20_0=='1') ) {s = 52;}

                        else if ( (LA20_0=='2') ) {s = 53;}

                        else if ( (LA20_0=='3') ) {s = 54;}

                        else if ( (LA20_0=='4') ) {s = 55;}

                        else if ( (LA20_0=='5') ) {s = 56;}

                        else if ( (LA20_0=='6') ) {s = 57;}

                        else if ( (LA20_0=='7') ) {s = 58;}

                        else if ( (LA20_0=='8') ) {s = 59;}

                        else if ( (LA20_0=='9') ) {s = 60;}

                        else if ( (LA20_0=='0') ) {s = 61;}

                        else if ( (LA20_0=='^') ) {s = 62;}

                        else if ( (LA20_0=='$'||LA20_0=='C'||(LA20_0>='G' && LA20_0<='H')||LA20_0=='L'||(LA20_0>='Q' && LA20_0<='R')||(LA20_0>='T' && LA20_0<='U')||(LA20_0>='W' && LA20_0<='Y')||LA20_0=='_'||LA20_0=='b'||(LA20_0>='g' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='l')||LA20_0=='o'||LA20_0=='q'||LA20_0=='u'||(LA20_0>='x' && LA20_0<='z')) ) {s = 63;}

                        else if ( (LA20_0=='\"') ) {s = 64;}

                        else if ( (LA20_0=='\'') ) {s = 65;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 66;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='#'||LA20_0=='@'||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 67;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_64 = input.LA(1);

                        s = -1;
                        if ( ((LA20_64>='\u0000' && LA20_64<='\uFFFF')) ) {s = 186;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}