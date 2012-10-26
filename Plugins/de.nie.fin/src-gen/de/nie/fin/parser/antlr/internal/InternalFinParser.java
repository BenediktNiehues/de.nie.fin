package de.nie.fin.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.nie.fin.services.FinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFinParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'Konto'", "'{'", "'KtoNr'", "'Blz'", "'Bank'", "'Verwendung'", "'Inhaber'", "'}'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'10'", "'11'", "'12'", "'13'", "'14'", "'15'", "'16'", "'17'", "'18'", "'19'", "'20'", "'21'", "'22'", "'23'", "'24'", "'25'", "'26'", "'27'", "'28'", "'29'", "'30'", "'31'", "'Januar'", "'Februar'", "'M\\u00E4rz'", "'April'", "'Mai'", "'Juni'", "'Juli'", "'August'", "'September'", "'Oktober'", "'November'", "'Dezember'", "'Buchungsintervall'", "'Monat'", "'Tag'", "'Kategorie'", "'Buchung'", "'Betrag'", "'Empf\\u00E4nger'", "'von'", "'Intervall'", "'Stra\\u00DFe'", "'PLZ'", "'Ort'", "'Bemerkung'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=7;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_DECIMAL=8;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=5;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
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
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=4;
    public static final int T__113=113;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalFinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFinParser.tokenNames; }
    public String getGrammarFileName() { return "../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g"; }



     	private FinGrammarAccess grammarAccess;
     	
        public InternalFinParser(TokenStream input, FinGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FinModelFile";	
       	}
       	
       	@Override
       	protected FinGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFinModelFile"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:67:1: entryRuleFinModelFile returns [EObject current=null] : iv_ruleFinModelFile= ruleFinModelFile EOF ;
    public final EObject entryRuleFinModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinModelFile = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:68:2: (iv_ruleFinModelFile= ruleFinModelFile EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:69:2: iv_ruleFinModelFile= ruleFinModelFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFinModelFileRule()); 
            }
            pushFollow(FOLLOW_ruleFinModelFile_in_entryRuleFinModelFile75);
            iv_ruleFinModelFile=ruleFinModelFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFinModelFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinModelFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinModelFile"


    // $ANTLR start "ruleFinModelFile"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:76:1: ruleFinModelFile returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleElement ) )* ) ;
    public final EObject ruleFinModelFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:79:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleElement ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleElement ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleElement ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_elements_3_0= ruleElement ) )*
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFinModelFile123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getFinModelFileAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:86:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFinModelFileAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFinModelFile144);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFinModelFileRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:102:4: ( (lv_imports_2_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFinModelFileAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleFinModelFile167);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFinModelFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:120:3: ( (lv_elements_3_0= ruleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==66||(LA3_0>=69 && LA3_0<=70)||LA3_0==72) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:121:1: (lv_elements_3_0= ruleElement )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:121:1: (lv_elements_3_0= ruleElement )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:122:3: lv_elements_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFinModelFileAccess().getElementsElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleFinModelFile189);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFinModelFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"Element");
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
    // $ANTLR end "ruleFinModelFile"


    // $ANTLR start "entryRuleImport"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:146:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:147:2: (iv_ruleImport= ruleImport EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:148:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport226);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport236); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:155:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:158:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:159:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:163:1: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:164:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:164:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:165:3: lv_importedNamespace_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport294);
            lv_importedNamespace_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedName");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleElement"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:189:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:190:2: (iv_ruleElement= ruleElement EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:191:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement330);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement340); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:198:1: ruleElement returns [EObject current=null] : (this_Konto_0= ruleKonto | this_Buchung_1= ruleBuchung | this_Empfaenger_2= ruleEmpfaenger | this_Buchungsintervall_3= ruleBuchungsintervall | this_Kategorie_4= ruleKategorie ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Konto_0 = null;

        EObject this_Buchung_1 = null;

        EObject this_Empfaenger_2 = null;

        EObject this_Buchungsintervall_3 = null;

        EObject this_Kategorie_4 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:201:28: ( (this_Konto_0= ruleKonto | this_Buchung_1= ruleBuchung | this_Empfaenger_2= ruleEmpfaenger | this_Buchungsintervall_3= ruleBuchungsintervall | this_Kategorie_4= ruleKategorie ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:202:1: (this_Konto_0= ruleKonto | this_Buchung_1= ruleBuchung | this_Empfaenger_2= ruleEmpfaenger | this_Buchungsintervall_3= ruleBuchungsintervall | this_Kategorie_4= ruleKategorie )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:202:1: (this_Konto_0= ruleKonto | this_Buchung_1= ruleBuchung | this_Empfaenger_2= ruleEmpfaenger | this_Buchungsintervall_3= ruleBuchungsintervall | this_Kategorie_4= ruleKategorie )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 70:
                {
                alt4=2;
                }
                break;
            case 72:
                {
                alt4=3;
                }
                break;
            case 66:
                {
                alt4=4;
                }
                break;
            case 69:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:203:5: this_Konto_0= ruleKonto
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getKontoParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKonto_in_ruleElement387);
                    this_Konto_0=ruleKonto();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Konto_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:213:5: this_Buchung_1= ruleBuchung
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getBuchungParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuchung_in_ruleElement414);
                    this_Buchung_1=ruleBuchung();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Buchung_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:223:5: this_Empfaenger_2= ruleEmpfaenger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getEmpfaengerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmpfaenger_in_ruleElement441);
                    this_Empfaenger_2=ruleEmpfaenger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Empfaenger_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:233:5: this_Buchungsintervall_3= ruleBuchungsintervall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getBuchungsintervallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuchungsintervall_in_ruleElement468);
                    this_Buchungsintervall_3=ruleBuchungsintervall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Buchungsintervall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:243:5: this_Kategorie_4= ruleKategorie
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getKategorieParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKategorie_in_ruleElement495);
                    this_Kategorie_4=ruleKategorie();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Kategorie_4; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleKonto"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:259:1: entryRuleKonto returns [EObject current=null] : iv_ruleKonto= ruleKonto EOF ;
    public final EObject entryRuleKonto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKonto = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:260:2: (iv_ruleKonto= ruleKonto EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:261:2: iv_ruleKonto= ruleKonto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKontoRule()); 
            }
            pushFollow(FOLLOW_ruleKonto_in_entryRuleKonto530);
            iv_ruleKonto=ruleKonto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKonto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKonto540); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKonto"


    // $ANTLR start "ruleKonto"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:268:1: ruleKonto returns [EObject current=null] : (otherlv_0= 'Konto' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'KtoNr' ( (lv_ktoNr_4_0= RULE_INT ) ) otherlv_5= 'Blz' ( (lv_blz_6_0= RULE_INT ) ) otherlv_7= 'Bank' ( (lv_bank_8_0= RULE_STRING ) ) otherlv_9= 'Verwendung' ( (lv_verwendung_10_0= RULE_STRING ) ) otherlv_11= 'Inhaber' ( (lv_inhaber_12_0= RULE_STRING ) ) otherlv_13= '}' ) ;
    public final EObject ruleKonto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_ktoNr_4_0=null;
        Token otherlv_5=null;
        Token lv_blz_6_0=null;
        Token otherlv_7=null;
        Token lv_bank_8_0=null;
        Token otherlv_9=null;
        Token lv_verwendung_10_0=null;
        Token otherlv_11=null;
        Token lv_inhaber_12_0=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:271:28: ( (otherlv_0= 'Konto' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'KtoNr' ( (lv_ktoNr_4_0= RULE_INT ) ) otherlv_5= 'Blz' ( (lv_blz_6_0= RULE_INT ) ) otherlv_7= 'Bank' ( (lv_bank_8_0= RULE_STRING ) ) otherlv_9= 'Verwendung' ( (lv_verwendung_10_0= RULE_STRING ) ) otherlv_11= 'Inhaber' ( (lv_inhaber_12_0= RULE_STRING ) ) otherlv_13= '}' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:272:1: (otherlv_0= 'Konto' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'KtoNr' ( (lv_ktoNr_4_0= RULE_INT ) ) otherlv_5= 'Blz' ( (lv_blz_6_0= RULE_INT ) ) otherlv_7= 'Bank' ( (lv_bank_8_0= RULE_STRING ) ) otherlv_9= 'Verwendung' ( (lv_verwendung_10_0= RULE_STRING ) ) otherlv_11= 'Inhaber' ( (lv_inhaber_12_0= RULE_STRING ) ) otherlv_13= '}' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:272:1: (otherlv_0= 'Konto' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'KtoNr' ( (lv_ktoNr_4_0= RULE_INT ) ) otherlv_5= 'Blz' ( (lv_blz_6_0= RULE_INT ) ) otherlv_7= 'Bank' ( (lv_bank_8_0= RULE_STRING ) ) otherlv_9= 'Verwendung' ( (lv_verwendung_10_0= RULE_STRING ) ) otherlv_11= 'Inhaber' ( (lv_inhaber_12_0= RULE_STRING ) ) otherlv_13= '}' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:272:3: otherlv_0= 'Konto' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'KtoNr' ( (lv_ktoNr_4_0= RULE_INT ) ) otherlv_5= 'Blz' ( (lv_blz_6_0= RULE_INT ) ) otherlv_7= 'Bank' ( (lv_bank_8_0= RULE_STRING ) ) otherlv_9= 'Verwendung' ( (lv_verwendung_10_0= RULE_STRING ) ) otherlv_11= 'Inhaber' ( (lv_inhaber_12_0= RULE_STRING ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleKonto577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKontoAccess().getKontoKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:276:1: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:277:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:277:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:278:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKontoAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleKonto598);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKontoRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleKonto610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getKontoAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleKonto622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getKontoAccess().getKtoNrKeyword_3());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:302:1: ( (lv_ktoNr_4_0= RULE_INT ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:303:1: (lv_ktoNr_4_0= RULE_INT )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:303:1: (lv_ktoNr_4_0= RULE_INT )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:304:3: lv_ktoNr_4_0= RULE_INT
            {
            lv_ktoNr_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKonto639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_ktoNr_4_0, grammarAccess.getKontoAccess().getKtoNrINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKontoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"ktoNr",
                      		lv_ktoNr_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleKonto656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getKontoAccess().getBlzKeyword_5());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:324:1: ( (lv_blz_6_0= RULE_INT ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:325:1: (lv_blz_6_0= RULE_INT )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:325:1: (lv_blz_6_0= RULE_INT )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:326:3: lv_blz_6_0= RULE_INT
            {
            lv_blz_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKonto673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_blz_6_0, grammarAccess.getKontoAccess().getBlzINTTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKontoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"blz",
                      		lv_blz_6_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleKonto690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getKontoAccess().getBankKeyword_7());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:346:1: ( (lv_bank_8_0= RULE_STRING ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:347:1: (lv_bank_8_0= RULE_STRING )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:347:1: (lv_bank_8_0= RULE_STRING )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:348:3: lv_bank_8_0= RULE_STRING
            {
            lv_bank_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKonto707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_bank_8_0, grammarAccess.getKontoAccess().getBankSTRINGTerminalRuleCall_8_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKontoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"bank",
                      		lv_bank_8_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleKonto724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getKontoAccess().getVerwendungKeyword_9());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:368:1: ( (lv_verwendung_10_0= RULE_STRING ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:369:1: (lv_verwendung_10_0= RULE_STRING )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:369:1: (lv_verwendung_10_0= RULE_STRING )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:370:3: lv_verwendung_10_0= RULE_STRING
            {
            lv_verwendung_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKonto741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_verwendung_10_0, grammarAccess.getKontoAccess().getVerwendungSTRINGTerminalRuleCall_10_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKontoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"verwendung",
                      		lv_verwendung_10_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleKonto758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getKontoAccess().getInhaberKeyword_11());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:390:1: ( (lv_inhaber_12_0= RULE_STRING ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:391:1: (lv_inhaber_12_0= RULE_STRING )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:391:1: (lv_inhaber_12_0= RULE_STRING )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:392:3: lv_inhaber_12_0= RULE_STRING
            {
            lv_inhaber_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKonto775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_inhaber_12_0, grammarAccess.getKontoAccess().getInhaberSTRINGTerminalRuleCall_12_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKontoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"inhaber",
                      		lv_inhaber_12_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleKonto792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getKontoAccess().getRightCurlyBracketKeyword_13());
                  
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
    // $ANTLR end "ruleKonto"


    // $ANTLR start "entryRuleTag"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:420:1: entryRuleTag returns [String current=null] : iv_ruleTag= ruleTag EOF ;
    public final String entryRuleTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTag = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:421:2: (iv_ruleTag= ruleTag EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:422:2: iv_ruleTag= ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_ruleTag_in_entryRuleTag829);
            iv_ruleTag=ruleTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTag.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTag840); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:429:1: ruleTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= '10' | kw= '11' | kw= '12' | kw= '13' | kw= '14' | kw= '15' | kw= '16' | kw= '17' | kw= '18' | kw= '19' | kw= '20' | kw= '21' | kw= '22' | kw= '23' | kw= '24' | kw= '25' | kw= '26' | kw= '27' | kw= '28' | kw= '29' | kw= '30' | kw= '31' ) ;
    public final AntlrDatatypeRuleToken ruleTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:432:28: ( (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= '10' | kw= '11' | kw= '12' | kw= '13' | kw= '14' | kw= '15' | kw= '16' | kw= '17' | kw= '18' | kw= '19' | kw= '20' | kw= '21' | kw= '22' | kw= '23' | kw= '24' | kw= '25' | kw= '26' | kw= '27' | kw= '28' | kw= '29' | kw= '30' | kw= '31' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:433:1: (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= '10' | kw= '11' | kw= '12' | kw= '13' | kw= '14' | kw= '15' | kw= '16' | kw= '17' | kw= '18' | kw= '19' | kw= '20' | kw= '21' | kw= '22' | kw= '23' | kw= '24' | kw= '25' | kw= '26' | kw= '27' | kw= '28' | kw= '29' | kw= '30' | kw= '31' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:433:1: (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= '10' | kw= '11' | kw= '12' | kw= '13' | kw= '14' | kw= '15' | kw= '16' | kw= '17' | kw= '18' | kw= '19' | kw= '20' | kw= '21' | kw= '22' | kw= '23' | kw= '24' | kw= '25' | kw= '26' | kw= '27' | kw= '28' | kw= '29' | kw= '30' | kw= '31' )
            int alt5=31;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 28:
                {
                alt5=6;
                }
                break;
            case 29:
                {
                alt5=7;
                }
                break;
            case 30:
                {
                alt5=8;
                }
                break;
            case 31:
                {
                alt5=9;
                }
                break;
            case 32:
                {
                alt5=10;
                }
                break;
            case 33:
                {
                alt5=11;
                }
                break;
            case 34:
                {
                alt5=12;
                }
                break;
            case 35:
                {
                alt5=13;
                }
                break;
            case 36:
                {
                alt5=14;
                }
                break;
            case 37:
                {
                alt5=15;
                }
                break;
            case 38:
                {
                alt5=16;
                }
                break;
            case 39:
                {
                alt5=17;
                }
                break;
            case 40:
                {
                alt5=18;
                }
                break;
            case 41:
                {
                alt5=19;
                }
                break;
            case 42:
                {
                alt5=20;
                }
                break;
            case 43:
                {
                alt5=21;
                }
                break;
            case 44:
                {
                alt5=22;
                }
                break;
            case 45:
                {
                alt5=23;
                }
                break;
            case 46:
                {
                alt5=24;
                }
                break;
            case 47:
                {
                alt5=25;
                }
                break;
            case 48:
                {
                alt5=26;
                }
                break;
            case 49:
                {
                alt5=27;
                }
                break;
            case 50:
                {
                alt5=28;
                }
                break;
            case 51:
                {
                alt5=29;
                }
                break;
            case 52:
                {
                alt5=30;
                }
                break;
            case 53:
                {
                alt5=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:434:2: kw= '1'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleTag878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:441:2: kw= '2'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleTag897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:448:2: kw= '3'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleTag916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitThreeKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:455:2: kw= '4'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleTag935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitFourKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:462:2: kw= '5'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleTag954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitFiveKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:469:2: kw= '6'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleTag973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitSixKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:476:2: kw= '7'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleTag992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitSevenKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:483:2: kw= '8'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleTag1011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitEightKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:490:2: kw= '9'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleTag1030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitNineKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:497:2: kw= '10'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleTag1049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitZeroKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:504:2: kw= '11'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTag1068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitOneKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:511:2: kw= '12'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleTag1087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitTwoKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:518:2: kw= '13'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleTag1106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitThreeKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:525:2: kw= '14'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleTag1125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitFourKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:532:2: kw= '15'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleTag1144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitFiveKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:539:2: kw= '16'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleTag1163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitSixKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:546:2: kw= '17'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleTag1182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitSevenKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:553:2: kw= '18'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleTag1201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitEightKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:560:2: kw= '19'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleTag1220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitOneDigitNineKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:567:2: kw= '20'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleTag1239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitZeroKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:574:2: kw= '21'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleTag1258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitOneKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:581:2: kw= '22'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleTag1277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitTwoKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:588:2: kw= '23'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleTag1296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitThreeKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:595:2: kw= '24'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleTag1315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitFourKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:602:2: kw= '25'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleTag1334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitFiveKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:609:2: kw= '26'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleTag1353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitSixKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:616:2: kw= '27'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleTag1372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitSevenKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:623:2: kw= '28'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleTag1391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitEightKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:630:2: kw= '29'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleTag1410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitTwoDigitNineKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:637:2: kw= '30'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleTag1429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitThreeDigitZeroKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:644:2: kw= '31'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleTag1448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTagAccess().getDigitThreeDigitOneKeyword_30()); 
                          
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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleMonat"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:657:1: entryRuleMonat returns [String current=null] : iv_ruleMonat= ruleMonat EOF ;
    public final String entryRuleMonat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMonat = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:658:2: (iv_ruleMonat= ruleMonat EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:659:2: iv_ruleMonat= ruleMonat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMonatRule()); 
            }
            pushFollow(FOLLOW_ruleMonat_in_entryRuleMonat1489);
            iv_ruleMonat=ruleMonat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMonat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonat1500); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonat"


    // $ANTLR start "ruleMonat"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:666:1: ruleMonat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Januar' | kw= 'Februar' | kw= 'M\\u00E4rz' | kw= 'April' | kw= 'Mai' | kw= 'Juni' | kw= 'Juli' | kw= 'August' | kw= 'September' | kw= 'Oktober' | kw= 'November' | kw= 'Dezember' ) ;
    public final AntlrDatatypeRuleToken ruleMonat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:669:28: ( (kw= 'Januar' | kw= 'Februar' | kw= 'M\\u00E4rz' | kw= 'April' | kw= 'Mai' | kw= 'Juni' | kw= 'Juli' | kw= 'August' | kw= 'September' | kw= 'Oktober' | kw= 'November' | kw= 'Dezember' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:670:1: (kw= 'Januar' | kw= 'Februar' | kw= 'M\\u00E4rz' | kw= 'April' | kw= 'Mai' | kw= 'Juni' | kw= 'Juli' | kw= 'August' | kw= 'September' | kw= 'Oktober' | kw= 'November' | kw= 'Dezember' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:670:1: (kw= 'Januar' | kw= 'Februar' | kw= 'M\\u00E4rz' | kw= 'April' | kw= 'Mai' | kw= 'Juni' | kw= 'Juli' | kw= 'August' | kw= 'September' | kw= 'Oktober' | kw= 'November' | kw= 'Dezember' )
            int alt6=12;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt6=1;
                }
                break;
            case 55:
                {
                alt6=2;
                }
                break;
            case 56:
                {
                alt6=3;
                }
                break;
            case 57:
                {
                alt6=4;
                }
                break;
            case 58:
                {
                alt6=5;
                }
                break;
            case 59:
                {
                alt6=6;
                }
                break;
            case 60:
                {
                alt6=7;
                }
                break;
            case 61:
                {
                alt6=8;
                }
                break;
            case 62:
                {
                alt6=9;
                }
                break;
            case 63:
                {
                alt6=10;
                }
                break;
            case 64:
                {
                alt6=11;
                }
                break;
            case 65:
                {
                alt6=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:671:2: kw= 'Januar'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleMonat1538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getJanuarKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:678:2: kw= 'Februar'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleMonat1557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getFebruarKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:685:2: kw= 'M\\u00E4rz'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleMonat1576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getM�rzKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:692:2: kw= 'April'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleMonat1595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getAprilKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:699:2: kw= 'Mai'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleMonat1614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getMaiKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:706:2: kw= 'Juni'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleMonat1633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getJuniKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:713:2: kw= 'Juli'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleMonat1652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getJuliKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:720:2: kw= 'August'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleMonat1671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getAugustKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:727:2: kw= 'September'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleMonat1690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getSeptemberKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:734:2: kw= 'Oktober'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleMonat1709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getOktoberKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:741:2: kw= 'November'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleMonat1728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getNovemberKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:748:2: kw= 'Dezember'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleMonat1747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMonatAccess().getDezemberKeyword_11()); 
                          
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
    // $ANTLR end "ruleMonat"


    // $ANTLR start "entryRuleBuchungsintervall"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:761:1: entryRuleBuchungsintervall returns [EObject current=null] : iv_ruleBuchungsintervall= ruleBuchungsintervall EOF ;
    public final EObject entryRuleBuchungsintervall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuchungsintervall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:762:2: (iv_ruleBuchungsintervall= ruleBuchungsintervall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:763:2: iv_ruleBuchungsintervall= ruleBuchungsintervall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuchungsintervallRule()); 
            }
            pushFollow(FOLLOW_ruleBuchungsintervall_in_entryRuleBuchungsintervall1787);
            iv_ruleBuchungsintervall=ruleBuchungsintervall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuchungsintervall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuchungsintervall1797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuchungsintervall"


    // $ANTLR start "ruleBuchungsintervall"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:770:1: ruleBuchungsintervall returns [EObject current=null] : (otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Monat' ( (lv_monate_4_0= ruleMonat ) ) otherlv_5= 'Tag' ( (lv_tag_6_0= ruleTag ) ) otherlv_7= '}' ) ;
    public final EObject ruleBuchungsintervall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_monate_4_0 = null;

        AntlrDatatypeRuleToken lv_tag_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:773:28: ( (otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Monat' ( (lv_monate_4_0= ruleMonat ) ) otherlv_5= 'Tag' ( (lv_tag_6_0= ruleTag ) ) otherlv_7= '}' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:774:1: (otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Monat' ( (lv_monate_4_0= ruleMonat ) ) otherlv_5= 'Tag' ( (lv_tag_6_0= ruleTag ) ) otherlv_7= '}' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:774:1: (otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Monat' ( (lv_monate_4_0= ruleMonat ) ) otherlv_5= 'Tag' ( (lv_tag_6_0= ruleTag ) ) otherlv_7= '}' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:774:3: otherlv_0= 'Buchungsintervall' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Monat' ( (lv_monate_4_0= ruleMonat ) ) otherlv_5= 'Tag' ( (lv_tag_6_0= ruleTag ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleBuchungsintervall1834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBuchungsintervallAccess().getBuchungsintervallKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:778:1: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:779:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:779:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:780:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuchungsintervallAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBuchungsintervall1855);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuchungsintervallRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBuchungsintervall1867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBuchungsintervallAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleBuchungsintervall1879); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBuchungsintervallAccess().getMonatKeyword_3());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:804:1: ( (lv_monate_4_0= ruleMonat ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:805:1: (lv_monate_4_0= ruleMonat )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:805:1: (lv_monate_4_0= ruleMonat )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:806:3: lv_monate_4_0= ruleMonat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuchungsintervallAccess().getMonateMonatParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMonat_in_ruleBuchungsintervall1900);
            lv_monate_4_0=ruleMonat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuchungsintervallRule());
              	        }
                     		add(
                     			current, 
                     			"monate",
                      		lv_monate_4_0, 
                      		"Monat");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleBuchungsintervall1912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBuchungsintervallAccess().getTagKeyword_5());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:826:1: ( (lv_tag_6_0= ruleTag ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:827:1: (lv_tag_6_0= ruleTag )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:827:1: (lv_tag_6_0= ruleTag )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:828:3: lv_tag_6_0= ruleTag
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuchungsintervallAccess().getTagTagParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTag_in_ruleBuchungsintervall1933);
            lv_tag_6_0=ruleTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuchungsintervallRule());
              	        }
                     		set(
                     			current, 
                     			"tag",
                      		lv_tag_6_0, 
                      		"Tag");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleBuchungsintervall1945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getBuchungsintervallAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleBuchungsintervall"


    // $ANTLR start "entryRuleKategorie"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:856:1: entryRuleKategorie returns [EObject current=null] : iv_ruleKategorie= ruleKategorie EOF ;
    public final EObject entryRuleKategorie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKategorie = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:857:2: (iv_ruleKategorie= ruleKategorie EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:858:2: iv_ruleKategorie= ruleKategorie EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKategorieRule()); 
            }
            pushFollow(FOLLOW_ruleKategorie_in_entryRuleKategorie1981);
            iv_ruleKategorie=ruleKategorie();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKategorie; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKategorie1991); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKategorie"


    // $ANTLR start "ruleKategorie"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:865:1: ruleKategorie returns [EObject current=null] : (otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleKategorie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_beschreibung_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:868:28: ( (otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:869:1: (otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:869:1: (otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:869:3: otherlv_0= 'Kategorie' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleKategorie2028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKategorieAccess().getKategorieKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:873:1: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:874:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:874:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:875:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKategorieAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleKategorie2049);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKategorieRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:891:2: (otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:891:4: otherlv_2= '{' ( (lv_beschreibung_3_0= RULE_STRING ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleKategorie2062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getKategorieAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:895:1: ( (lv_beschreibung_3_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:896:1: (lv_beschreibung_3_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:896:1: (lv_beschreibung_3_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:897:3: lv_beschreibung_3_0= RULE_STRING
                    {
                    lv_beschreibung_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKategorie2079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_beschreibung_3_0, grammarAccess.getKategorieAccess().getBeschreibungSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getKategorieRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"beschreibung",
                              		lv_beschreibung_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleKategorie2096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getKategorieAccess().getRightCurlyBracketKeyword_2_2());
                          
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
    // $ANTLR end "ruleKategorie"


    // $ANTLR start "entryRuleBuchung"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:925:1: entryRuleBuchung returns [EObject current=null] : iv_ruleBuchung= ruleBuchung EOF ;
    public final EObject entryRuleBuchung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuchung = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:926:2: (iv_ruleBuchung= ruleBuchung EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:927:2: iv_ruleBuchung= ruleBuchung EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuchungRule()); 
            }
            pushFollow(FOLLOW_ruleBuchung_in_entryRuleBuchung2134);
            iv_ruleBuchung=ruleBuchung();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuchung; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuchung2144); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuchung"


    // $ANTLR start "ruleBuchung"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:934:1: ruleBuchung returns [EObject current=null] : (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Kategorie' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) ;
    public final EObject ruleBuchung() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_betrag_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:937:28: ( (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Kategorie' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:938:1: (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Kategorie' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:938:1: (otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Kategorie' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:938:3: otherlv_0= 'Buchung' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' otherlv_3= 'Konto' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Betrag' ( (lv_betrag_6_0= RULE_INT ) ) ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) ) otherlv_11= 'Intervall' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'Kategorie' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleBuchung2181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBuchungAccess().getBuchungKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:942:1: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:943:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:943:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:944:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBuchungAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBuchung2202);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBuchungRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBuchung2214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBuchungAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleBuchung2226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBuchungAccess().getKontoKeyword_3());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:968:1: ( (otherlv_4= RULE_ID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:969:1: (otherlv_4= RULE_ID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:969:1: (otherlv_4= RULE_ID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:970:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBuchungRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung2246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getBuchungAccess().getKontoKontoCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleBuchung2258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBuchungAccess().getBetragKeyword_5());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:985:1: ( (lv_betrag_6_0= RULE_INT ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:986:1: (lv_betrag_6_0= RULE_INT )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:986:1: (lv_betrag_6_0= RULE_INT )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:987:3: lv_betrag_6_0= RULE_INT
            {
            lv_betrag_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBuchung2275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_betrag_6_0, grammarAccess.getBuchungAccess().getBetragINTTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBuchungRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"betrag",
                      		lv_betrag_6_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1003:2: ( (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==72) ) {
                alt8=1;
            }
            else if ( (LA8_0==73) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1003:3: (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1003:3: (otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1003:5: otherlv_7= 'Empf\\u00E4nger' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,72,FOLLOW_72_in_ruleBuchung2294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBuchungAccess().getEmpf�ngerKeyword_7_0_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1007:1: ( (otherlv_8= RULE_ID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1008:1: (otherlv_8= RULE_ID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1008:1: (otherlv_8= RULE_ID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1009:3: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBuchungRule());
                      	        }
                              
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung2314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_8, grammarAccess.getBuchungAccess().getEmpfaengerEmpfaengerCrossReference_7_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1021:6: (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1021:6: (otherlv_9= 'von' ( (otherlv_10= RULE_ID ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1021:8: otherlv_9= 'von' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,73,FOLLOW_73_in_ruleBuchung2334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBuchungAccess().getVonKeyword_7_1_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1025:1: ( (otherlv_10= RULE_ID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1026:1: (otherlv_10= RULE_ID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1026:1: (otherlv_10= RULE_ID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1027:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBuchungRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung2354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getBuchungAccess().getVonEmpfaengerCrossReference_7_1_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,74,FOLLOW_74_in_ruleBuchung2368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getBuchungAccess().getIntervallKeyword_8());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1042:1: ( (otherlv_12= RULE_ID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1043:1: (otherlv_12= RULE_ID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1043:1: (otherlv_12= RULE_ID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1044:3: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBuchungRule());
              	        }
                      
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung2388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_12, grammarAccess.getBuchungAccess().getIntervallBuchungsintervallCrossReference_9_0()); 
              	
            }

            }


            }

            otherlv_13=(Token)match(input,69,FOLLOW_69_in_ruleBuchung2400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getBuchungAccess().getKategorieKeyword_10());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1059:1: ( (otherlv_14= RULE_ID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1060:1: (otherlv_14= RULE_ID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1060:1: (otherlv_14= RULE_ID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1061:3: otherlv_14= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBuchungRule());
              	        }
                      
            }
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuchung2420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_14, grammarAccess.getBuchungAccess().getKategorieKategorieCrossReference_11_0()); 
              	
            }

            }


            }

            otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleBuchung2432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getBuchungAccess().getRightCurlyBracketKeyword_12());
                  
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
    // $ANTLR end "ruleBuchung"


    // $ANTLR start "entryRuleEmpfaenger"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1084:1: entryRuleEmpfaenger returns [EObject current=null] : iv_ruleEmpfaenger= ruleEmpfaenger EOF ;
    public final EObject entryRuleEmpfaenger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpfaenger = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1085:2: (iv_ruleEmpfaenger= ruleEmpfaenger EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1086:2: iv_ruleEmpfaenger= ruleEmpfaenger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmpfaengerRule()); 
            }
            pushFollow(FOLLOW_ruleEmpfaenger_in_entryRuleEmpfaenger2468);
            iv_ruleEmpfaenger=ruleEmpfaenger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmpfaenger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmpfaenger2478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmpfaenger"


    // $ANTLR start "ruleEmpfaenger"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1093:1: ruleEmpfaenger returns [EObject current=null] : (otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )? ) ;
    public final EObject ruleEmpfaenger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_strasse_4_0=null;
        Token otherlv_5=null;
        Token lv_plz_6_0=null;
        Token otherlv_7=null;
        Token lv_ort_8_0=null;
        Token otherlv_9=null;
        Token lv_bemerkung_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1096:28: ( (otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1097:1: (otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1097:1: (otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1097:3: otherlv_0= 'Empf\\u00E4nger' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleEmpfaenger2515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEmpfaengerAccess().getEmpf�ngerKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1101:1: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1102:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1102:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1103:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmpfaengerAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleEmpfaenger2536);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEmpfaengerRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1119:2: (otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1119:4: otherlv_2= '{' otherlv_3= 'Stra\\u00DFe' ( (lv_strasse_4_0= RULE_STRING ) ) otherlv_5= 'PLZ' ( (lv_plz_6_0= RULE_STRING ) ) otherlv_7= 'Ort' ( (lv_ort_8_0= RULE_STRING ) ) otherlv_9= 'Bemerkung' ( (lv_bemerkung_10_0= RULE_STRING ) ) otherlv_11= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEmpfaenger2549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmpfaengerAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    otherlv_3=(Token)match(input,75,FOLLOW_75_in_ruleEmpfaenger2561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEmpfaengerAccess().getStraEKeyword_2_1());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1127:1: ( (lv_strasse_4_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1128:1: (lv_strasse_4_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1128:1: (lv_strasse_4_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1129:3: lv_strasse_4_0= RULE_STRING
                    {
                    lv_strasse_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEmpfaenger2578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_strasse_4_0, grammarAccess.getEmpfaengerAccess().getStrasseSTRINGTerminalRuleCall_2_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEmpfaengerRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"strasse",
                              		lv_strasse_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,76,FOLLOW_76_in_ruleEmpfaenger2595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmpfaengerAccess().getPLZKeyword_2_3());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1149:1: ( (lv_plz_6_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1150:1: (lv_plz_6_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1150:1: (lv_plz_6_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1151:3: lv_plz_6_0= RULE_STRING
                    {
                    lv_plz_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEmpfaenger2612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_plz_6_0, grammarAccess.getEmpfaengerAccess().getPlzSTRINGTerminalRuleCall_2_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEmpfaengerRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"plz",
                              		lv_plz_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,77,FOLLOW_77_in_ruleEmpfaenger2629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEmpfaengerAccess().getOrtKeyword_2_5());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1171:1: ( (lv_ort_8_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1172:1: (lv_ort_8_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1172:1: (lv_ort_8_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1173:3: lv_ort_8_0= RULE_STRING
                    {
                    lv_ort_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEmpfaenger2646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ort_8_0, grammarAccess.getEmpfaengerAccess().getOrtSTRINGTerminalRuleCall_2_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEmpfaengerRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ort",
                              		lv_ort_8_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleEmpfaenger2663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEmpfaengerAccess().getBemerkungKeyword_2_7());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1193:1: ( (lv_bemerkung_10_0= RULE_STRING ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1194:1: (lv_bemerkung_10_0= RULE_STRING )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1194:1: (lv_bemerkung_10_0= RULE_STRING )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1195:3: lv_bemerkung_10_0= RULE_STRING
                    {
                    lv_bemerkung_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEmpfaenger2680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_bemerkung_10_0, grammarAccess.getEmpfaengerAccess().getBemerkungSTRINGTerminalRuleCall_2_8_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEmpfaengerRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"bemerkung",
                              		lv_bemerkung_10_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleEmpfaenger2697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEmpfaengerAccess().getRightCurlyBracketKeyword_2_9());
                          
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
    // $ANTLR end "ruleEmpfaenger"


    // $ANTLR start "entryRuleXExpression"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1223:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1224:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1225:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2735);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2745); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1232:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1235:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1237:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2791);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1253:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1254:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1255:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2825);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2835); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1262:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1265:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1266:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1266:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==79) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||(LA11_1>=RULE_INT && LA11_1<=RULE_DECIMAL)||LA11_1==16||LA11_1==22||(LA11_1>=80 && LA11_1<=110)||(LA11_1>=112 && LA11_1<=136)) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||(LA11_0>=RULE_HEX && LA11_0<=RULE_DECIMAL)||LA11_0==16||LA11_0==89||(LA11_0>=96 && LA11_0<=97)||LA11_0==102||LA11_0==108||LA11_0==110||LA11_0==114||LA11_0==116||(LA11_0>=120 && LA11_0<=122)||LA11_0==125||(LA11_0>=127 && LA11_0<=134)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1266:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1266:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1266:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1266:3: ()
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1267:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1272:2: ( ( ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1273:1: ( ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1273:1: ( ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1274:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2893);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2909);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1295:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1296:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1296:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1297:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2929);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1314:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1314:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1315:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2959);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==80) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred1_InternalFin()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1328:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1328:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1328:7: ()
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1329:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1334:2: ( ( ruleOpMultiAssign ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1335:1: ( ruleOpMultiAssign )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1335:1: ( ruleOpMultiAssign )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1336:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3012);
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

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1349:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1350:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1350:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1351:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3035);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1375:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1376:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1377:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3075);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign3086); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1384:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1387:28: (kw= '=' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1389:2: kw= '='
            {
            kw=(Token)match(input,79,FOLLOW_79_in_ruleOpSingleAssign3123); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1402:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1403:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1404:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3163);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign3174); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1411:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1414:28: (kw= '+=' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1416:2: kw= '+='
            {
            kw=(Token)match(input,80,FOLLOW_80_in_ruleOpMultiAssign3211); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1429:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1430:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1431:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3250);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression3260); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1438:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1441:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1442:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1442:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1443:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3307);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==81) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalFin()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1456:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1456:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1456:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1457:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1462:2: ( ( ruleOpOr ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1463:1: ( ruleOpOr )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1463:1: ( ruleOpOr )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1464:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression3360);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1477:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1478:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1478:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1479:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3383);
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
            	    break loop12;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1503:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1504:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1505:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr3422);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr3433); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1512:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1515:28: (kw= '||' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1517:2: kw= '||'
            {
            kw=(Token)match(input,81,FOLLOW_81_in_ruleOpOr3470); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1530:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1531:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1532:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3509);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression3519); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1539:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1542:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1543:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1543:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1544:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3566);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==82) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalFin()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1557:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1557:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1557:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1558:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1563:2: ( ( ruleOpAnd ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1564:1: ( ruleOpAnd )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1564:1: ( ruleOpAnd )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1565:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3619);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1578:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1579:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1579:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1580:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3642);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1604:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1605:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1606:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3681);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3692); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1613:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1616:28: (kw= '&&' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1618:2: kw= '&&'
            {
            kw=(Token)match(input,82,FOLLOW_82_in_ruleOpAnd3729); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1631:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1632:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1633:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3768);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3778); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1640:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1643:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1644:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1645:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3825);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==83) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalFin()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==84) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalFin()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1658:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1658:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1658:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1659:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1664:2: ( ( ruleOpEquality ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1665:1: ( ruleOpEquality )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1665:1: ( ruleOpEquality )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1666:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3878);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1679:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1680:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1680:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1681:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3901);
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
            	    break loop14;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1705:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1706:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1707:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3940);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3951); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1714:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1717:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1718:1: (kw= '==' | kw= '!=' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1718:1: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==83) ) {
                alt15=1;
            }
            else if ( (LA15_0==84) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1719:2: kw= '=='
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleOpEquality3989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1726:2: kw= '!='
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleOpEquality4008); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1739:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1740:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1741:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4048);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression4058); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1748:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1751:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1752:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1752:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1753:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4105);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 88:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred6_InternalFin()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 89:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalFin()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 85:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred5_InternalFin()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 86:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalFin()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 87:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred6_InternalFin()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1763:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1763:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1763:6: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1764:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,85,FOLLOW_85_in_ruleXRelationalExpression4141); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1773:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1774:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1774:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1775:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression4164);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
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


            	    }
            	    break;
            	case 2 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1797:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1797:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1797:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1798:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1803:2: ( ( ruleOpCompare ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1804:1: ( ruleOpCompare )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1804:1: ( ruleOpCompare )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1805:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4225);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1818:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1819:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1819:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1820:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4248);
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
            	    break loop16;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1844:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1845:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1846:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare4288);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare4299); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1853:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1856:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1857:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1857:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt17=1;
                }
                break;
            case 87:
                {
                alt17=2;
                }
                break;
            case 88:
                {
                alt17=3;
                }
                break;
            case 89:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1858:2: kw= '>='
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleOpCompare4337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1865:2: kw= '<='
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleOpCompare4356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1872:2: kw= '>'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleOpCompare4375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1879:2: kw= '<'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleOpCompare4394); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1892:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1893:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1894:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4434);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4444); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1901:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1904:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1905:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1905:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1906:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4491);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1919:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1919:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1919:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1920:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1925:2: ( ( ruleOpOther ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1926:1: ( ruleOpOther )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1926:1: ( ruleOpOther )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1927:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4544);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1940:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1941:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1941:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1942:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4567);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1966:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1967:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1968:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4606);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4617); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1975:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1978:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1979:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1979:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt21=1;
                }
                break;
            case 91:
                {
                alt21=2;
                }
                break;
            case 92:
                {
                alt21=3;
                }
                break;
            case 88:
                {
                alt21=4;
                }
                break;
            case 89:
                {
                alt21=5;
                }
                break;
            case 93:
                {
                alt21=6;
                }
                break;
            case 94:
                {
                alt21=7;
                }
                break;
            case 95:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1980:2: kw= '->'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleOpOther4655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1987:2: kw= '..'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleOpOther4674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1994:2: kw= '=>'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleOpOther4693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2000:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2000:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2001:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleOpOther4713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2006:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==88) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==EOF||(LA19_1>=RULE_INT && LA19_1<=RULE_DECIMAL)||LA19_1==16||LA19_1==89||(LA19_1>=96 && LA19_1<=97)||LA19_1==102||LA19_1==108||LA19_1==110||LA19_1==114||LA19_1==116||(LA19_1>=120 && LA19_1<=122)||LA19_1==125||(LA19_1>=127 && LA19_1<=134)) ) {
                            alt19=2;
                        }
                        else if ( (LA19_1==88) && (synpred8_InternalFin())) {
                            alt19=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2006:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2006:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2006:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2010:5: (kw= '>' kw= '>' )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2011:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,88,FOLLOW_88_in_ruleOpOther4744); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,88,FOLLOW_88_in_ruleOpOther4757); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2024:2: kw= '>'
                            {
                            kw=(Token)match(input,88,FOLLOW_88_in_ruleOpOther4778); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2030:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2030:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2031:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleOpOther4800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2036:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==89) ) {
                        int LA20_1 = input.LA(2);

                        if ( (synpred9_InternalFin()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2036:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2036:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2036:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2040:5: (kw= '<' kw= '<' )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2041:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,89,FOLLOW_89_in_ruleOpOther4831); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,89,FOLLOW_89_in_ruleOpOther4844); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2054:2: kw= '<'
                            {
                            kw=(Token)match(input,89,FOLLOW_89_in_ruleOpOther4865); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2061:2: kw= '<>'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleOpOther4886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2068:2: kw= '?:'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleOpOther4905); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2075:2: kw= '<=>'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleOpOther4924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2088:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2089:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2090:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4964);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4974); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2097:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2100:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2101:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2101:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2102:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5021);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==96) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalFin()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==97) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalFin()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2115:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2115:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2115:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2116:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2121:2: ( ( ruleOpAdd ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2122:1: ( ruleOpAdd )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2122:1: ( ruleOpAdd )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2123:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5074);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2136:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2137:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2137:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2138:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5097);
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
            	    break loop22;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2162:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2163:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2164:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd5136);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd5147); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2171:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2174:28: ( (kw= '+' | kw= '-' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2175:1: (kw= '+' | kw= '-' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2175:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==96) ) {
                alt23=1;
            }
            else if ( (LA23_0==97) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2176:2: kw= '+'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleOpAdd5185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2183:2: kw= '-'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleOpAdd5204); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2196:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2197:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2198:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5244);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5254); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2205:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2208:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2209:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2209:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2210:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5301);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 98:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred11_InternalFin()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 99:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred11_InternalFin()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 100:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred11_InternalFin()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 101:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred11_InternalFin()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2223:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2223:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2223:7: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2224:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2229:2: ( ( ruleOpMulti ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2230:1: ( ruleOpMulti )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2230:1: ( ruleOpMulti )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2231:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5354);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2244:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2245:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2245:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2246:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5377);
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
            	    break loop24;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2270:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2271:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2272:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti5416);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti5427); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2279:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2282:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2283:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2283:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt25=1;
                }
                break;
            case 99:
                {
                alt25=2;
                }
                break;
            case 100:
                {
                alt25=3;
                }
                break;
            case 101:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2284:2: kw= '*'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleOpMulti5465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2291:2: kw= '**'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleOpMulti5484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2298:2: kw= '/'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleOpMulti5503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2305:2: kw= '%'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleOpMulti5522); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2318:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2319:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2320:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5562);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation5572); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2327:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2330:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2331:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2331:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=96 && LA26_0<=97)||LA26_0==102) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_DECIMAL)||LA26_0==16||LA26_0==89||LA26_0==108||LA26_0==110||LA26_0==114||LA26_0==116||(LA26_0>=120 && LA26_0<=122)||LA26_0==125||(LA26_0>=127 && LA26_0<=134)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2331:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2331:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2331:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2331:3: ()
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2332:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2337:2: ( ( ruleOpUnary ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2338:1: ( ruleOpUnary )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2338:1: ( ruleOpUnary )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2339:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5630);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2352:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2353:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2353:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2354:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5651);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2372:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5680);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2388:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2389:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2390:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary5716);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary5727); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2397:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2400:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2401:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2401:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt27=1;
                }
                break;
            case 97:
                {
                alt27=2;
                }
                break;
            case 96:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2402:2: kw= '!'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleOpUnary5765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2409:2: kw= '-'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleOpUnary5784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2416:2: kw= '+'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleOpUnary5803); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2429:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2430:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2431:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5843);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5853); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2438:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2441:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2442:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2442:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2443:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5900);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==103) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred12_InternalFin()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2453:5: ( () otherlv_2= 'as' )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2453:6: () otherlv_2= 'as'
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2453:6: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2454:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,103,FOLLOW_103_in_ruleXCastedExpression5935); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2463:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2464:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2464:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2465:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5958);
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
            	    break loop28;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2489:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2490:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2491:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5996);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall6006); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2498:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
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

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2501:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2502:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2502:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2503:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6053);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 104:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred13_InternalFin()) ) {
                        alt36=1;
                    }
                    else if ( (synpred14_InternalFin()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 105:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred14_InternalFin()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred14_InternalFin()) ) {
                        alt36=2;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2517:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2517:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2517:26: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2518:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,104,FOLLOW_104_in_ruleXMemberFeatureCall6102); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2527:1: ( ( ruleValidID ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2528:1: ( ruleValidID )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2528:1: ( ruleValidID )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2529:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6125);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6141);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2550:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2551:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2551:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2552:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6163);
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
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2585:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2585:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2585:8: ()
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2586:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2591:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 104:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 105:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 106:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2591:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,104,FOLLOW_104_in_ruleXMemberFeatureCall6249); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2596:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2596:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2597:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2597:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2598:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,105,FOLLOW_105_in_ruleXMemberFeatureCall6273); if (state.failed) return current;
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
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2612:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2612:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2613:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2613:1: (lv_spreading_9_0= '*.' )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2614:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,106,FOLLOW_106_in_ruleXMemberFeatureCall6310); if (state.failed) return current;
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2627:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==89) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2627:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,89,FOLLOW_89_in_ruleXMemberFeatureCall6339); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2631:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2632:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2632:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2633:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6360);
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

            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2649:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==107) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2649:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,107,FOLLOW_107_in_ruleXMemberFeatureCall6373); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2653:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2654:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2654:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2655:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6394);
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
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,88,FOLLOW_88_in_ruleXMemberFeatureCall6408); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2675:3: ( ( ruleValidID ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2676:1: ( ruleValidID )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2676:1: ( ruleValidID )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2677:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6433);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2690:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2690:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2690:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2690:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2697:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2698:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,108,FOLLOW_108_in_ruleXMemberFeatureCall6467); if (state.failed) return current;
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

            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2728:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2729:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6552);
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
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2746:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2746:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2746:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2746:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2747:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2747:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2748:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6580);
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

            	                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2764:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==107) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2764:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,107,FOLLOW_107_in_ruleXMemberFeatureCall6593); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2768:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2769:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2769:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2770:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6614);
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
            	                    	    break loop32;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,109,FOLLOW_109_in_ruleXMemberFeatureCall6631); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2790:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2790:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2793:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2794:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall6666);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2818:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2819:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2820:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6706);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6716); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2827:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2830:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2831:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2831:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2832:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6763);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2842:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6790);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2852:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6817);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2862:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6844);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2872:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6871);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2882:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6898);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2892:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6925);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2902:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6952);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2912:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6979);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2922:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression7006);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2932:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7033);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2942:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7060);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2952:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7087);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2968:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2969:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2970:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral7122);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral7132); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2977:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2980:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==110) && (synpred18_InternalFin())) {
                alt38=1;
            }
            else if ( ((LA38_0>=128 && LA38_0<=129)) ) {
                alt38=2;
            }
            else if ( (LA38_0==RULE_INT||(LA38_0>=RULE_HEX && LA38_0<=RULE_DECIMAL)) ) {
                alt38=3;
            }
            else if ( (LA38_0==130) ) {
                alt38=4;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=5;
            }
            else if ( (LA38_0==131) ) {
                alt38=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral7192);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2994:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7220);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3004:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral7247);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3014:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral7274);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3024:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral7301);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3034:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7328);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3050:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3051:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3052:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure7363);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure7373); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3059:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3062:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3063:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3063:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3063:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3063:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3063:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3065:5: ( () otherlv_1= '[' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3065:6: () otherlv_1= '['
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3065:6: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3066:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,110,FOLLOW_110_in_ruleXClosure7433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3090:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3090:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3090:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==92||LA40_0==108) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3090:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3090:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3091:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3091:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3092:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7506);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3108:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==107) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3108:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,107,FOLLOW_107_in_ruleXClosure7519); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3112:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3113:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3113:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3114:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7540);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3130:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3131:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3131:1: (lv_explicitSyntax_5_0= '|' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3132:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,111,FOLLOW_111_in_ruleXClosure7562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3145:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3146:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3146:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3147:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure7599);
            lv_expression_6_0=ruleXExpressionInClosure();

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
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,112,FOLLOW_112_in_ruleXClosure7611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
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


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3175:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3176:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3177:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure7647);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure7657); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3184:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3187:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3188:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3188:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3188:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3188:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3189:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3194:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_DECIMAL)||LA43_0==16||LA43_0==89||(LA43_0>=96 && LA43_0<=97)||LA43_0==102||LA43_0==108||LA43_0==110||LA43_0==114||LA43_0==116||(LA43_0>=120 && LA43_0<=125)||(LA43_0>=127 && LA43_0<=134)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3194:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3194:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3195:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3195:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3196:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure7713);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3212:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==113) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3212:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,113,FOLLOW_113_in_ruleXExpressionInClosure7726); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3224:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3225:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3226:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7766);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure7776); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3233:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3236:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3237:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3237:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3237:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3237:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3237:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3253:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3253:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3253:7: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3254:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3259:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==92||LA45_0==108) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3259:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3259:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3260:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3260:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3261:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7884);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3277:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==107) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3277:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,107,FOLLOW_107_in_ruleXShortClosure7897); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3281:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3282:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3282:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3283:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7918);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3299:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3300:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3300:1: (lv_explicitSyntax_4_0= '|' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3301:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,111,FOLLOW_111_in_ruleXShortClosure7940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3314:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3315:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3315:1: (lv_expression_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3316:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7976);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3340:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3341:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3342:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8012);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression8022); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3349:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3352:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3353:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3353:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3353:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleXParenthesizedExpression8059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8081);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,109,FOLLOW_109_in_ruleXParenthesizedExpression8092); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3378:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3379:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3380:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8128);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression8138); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3387:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3390:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3391:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3391:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3391:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3391:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3392:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,114,FOLLOW_114_in_ruleXIfExpression8184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,108,FOLLOW_108_in_ruleXIfExpression8196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3405:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3406:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3406:1: (lv_if_3_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3407:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8217);
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

            otherlv_4=(Token)match(input,109,FOLLOW_109_in_ruleXIfExpression8229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3427:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3428:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3428:1: (lv_then_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3429:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8250);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3445:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==115) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred22_InternalFin()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3445:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3445:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3445:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,115,FOLLOW_115_in_ruleXIfExpression8271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3450:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3451:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3451:1: (lv_else_7_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3452:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression8293);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3476:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3477:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3478:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8331);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression8341); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3485:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3488:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3489:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3489:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3489:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3489:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3490:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,116,FOLLOW_116_in_ruleXSwitchExpression8387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_INT && LA48_0<=RULE_DECIMAL)||LA48_0==16||LA48_0==89||(LA48_0>=96 && LA48_0<=97)||LA48_0==102||LA48_0==110||LA48_0==114||LA48_0==116||(LA48_0>=120 && LA48_0<=122)||LA48_0==125||(LA48_0>=127 && LA48_0<=134)) ) {
                alt48=1;
            }
            else if ( (LA48_0==108) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_3 = input.LA(3);

                    if ( ((LA48_3>=79 && LA48_3<=101)||(LA48_3>=103 && LA48_3<=106)||(LA48_3>=108 && LA48_3<=110)||LA48_3==126) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==117) && (synpred24_InternalFin())) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_2>=RULE_INT && LA48_2<=RULE_STRING)||(LA48_2>=RULE_HEX && LA48_2<=RULE_DECIMAL)||LA48_2==16||LA48_2==89||(LA48_2>=96 && LA48_2<=97)||LA48_2==102||LA48_2==108||LA48_2==110||LA48_2==114||LA48_2==116||(LA48_2>=120 && LA48_2<=122)||LA48_2==125||(LA48_2>=127 && LA48_2<=134)) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==117) && (synpred23_InternalFin())) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3504:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3504:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3504:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3505:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3505:1: (lv_localVarName_2_0= ruleValidID )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3506:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression8430);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,117,FOLLOW_117_in_ruleXSwitchExpression8442); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3526:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3527:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3527:1: (lv_switch_4_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3528:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8466);
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


                    }


                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3551:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3551:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,108,FOLLOW_108_in_ruleXSwitchExpression8510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3555:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3556:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3556:1: (lv_localVarName_6_0= ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3557:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression8531);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,117,FOLLOW_117_in_ruleXSwitchExpression8543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3577:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3578:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3578:1: (lv_switch_8_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3579:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8566);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,109,FOLLOW_109_in_ruleXSwitchExpression8578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression8592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3603:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==92||LA49_0==108||LA49_0==117||LA49_0==119) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3604:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3604:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3605:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8613);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3621:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==118) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3621:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,118,FOLLOW_118_in_ruleXSwitchExpression8627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,117,FOLLOW_117_in_ruleXSwitchExpression8639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3629:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3630:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3630:1: (lv_default_14_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3631:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression8660);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleXSwitchExpression8674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3659:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3660:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3661:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart8710);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart8720); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3668:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3671:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3672:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3672:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3672:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3672:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==92||LA51_0==108) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3673:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3673:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3674:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8766);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3690:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==119) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3690:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,119,FOLLOW_119_in_ruleXCasePart8780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3694:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3695:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3695:1: (lv_case_2_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3696:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8801);
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

            otherlv_3=(Token)match(input,117,FOLLOW_117_in_ruleXCasePart8815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3716:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3717:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3717:1: (lv_then_4_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3718:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8836);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3742:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3743:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3744:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8872);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression8882); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3751:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3754:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3755:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3755:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3755:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3755:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3756:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,120,FOLLOW_120_in_ruleXForLoopExpression8928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,108,FOLLOW_108_in_ruleXForLoopExpression8940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3769:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3770:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3770:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3771:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8961);
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

            otherlv_4=(Token)match(input,117,FOLLOW_117_in_ruleXForLoopExpression8973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3791:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3792:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3792:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3793:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8994);
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

            otherlv_6=(Token)match(input,109,FOLLOW_109_in_ruleXForLoopExpression9006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3813:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3814:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3814:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3815:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression9027);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3839:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3840:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3841:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression9063);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression9073); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3848:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3851:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3852:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3852:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3852:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3852:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3853:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,121,FOLLOW_121_in_ruleXWhileExpression9119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,108,FOLLOW_108_in_ruleXWhileExpression9131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3866:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3867:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3867:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3868:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression9152);
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

            otherlv_4=(Token)match(input,109,FOLLOW_109_in_ruleXWhileExpression9164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3888:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3889:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3889:1: (lv_body_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3890:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression9185);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3914:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3915:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3916:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression9221);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression9231); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3923:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3926:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3927:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3927:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3927:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3927:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3928:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,122,FOLLOW_122_in_ruleXDoWhileExpression9277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3937:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3938:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3938:1: (lv_body_2_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3939:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9298);
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

            otherlv_3=(Token)match(input,121,FOLLOW_121_in_ruleXDoWhileExpression9310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,108,FOLLOW_108_in_ruleXDoWhileExpression9322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3963:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3964:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3964:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3965:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9343);
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

            otherlv_6=(Token)match(input,109,FOLLOW_109_in_ruleXDoWhileExpression9355); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3993:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3994:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3995:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression9391);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression9401); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4002:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4005:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4006:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4006:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4006:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4006:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4007:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression9447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4016:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_DECIMAL)||LA54_0==16||LA54_0==89||(LA54_0>=96 && LA54_0<=97)||LA54_0==102||LA54_0==108||LA54_0==110||LA54_0==114||LA54_0==116||(LA54_0>=120 && LA54_0<=125)||(LA54_0>=127 && LA54_0<=134)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4016:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4016:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4017:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4017:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4018:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9469);
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

            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4034:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==113) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4034:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,113,FOLLOW_113_in_ruleXBlockExpression9482); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXBlockExpression9498); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4050:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4051:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4052:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9534);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9544); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4059:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4062:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4063:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4063:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=123 && LA55_0<=124)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_INT && LA55_0<=RULE_DECIMAL)||LA55_0==16||LA55_0==89||(LA55_0>=96 && LA55_0<=97)||LA55_0==102||LA55_0==108||LA55_0==110||LA55_0==114||LA55_0==116||(LA55_0>=120 && LA55_0<=122)||LA55_0==125||(LA55_0>=127 && LA55_0<=134)) ) {
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4064:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9591);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4074:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9618);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4090:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4091:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4092:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9653);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration9663); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4099:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4102:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4103:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4103:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4103:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4103:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4104:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4109:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==123) ) {
                alt56=1;
            }
            else if ( (LA56_0==124) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4109:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4109:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4110:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4110:1: (lv_writeable_1_0= 'var' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4111:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,123,FOLLOW_123_in_ruleXVariableDeclaration9716); if (state.failed) return current;
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4125:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,124,FOLLOW_124_in_ruleXVariableDeclaration9747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred25_InternalFin()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==108) && (synpred25_InternalFin())) {
                alt57=1;
            }
            else if ( (LA57_0==92) && (synpred25_InternalFin())) {
                alt57=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4137:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4137:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4137:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4138:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4138:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4139:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9795);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4155:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4156:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4156:1: (lv_name_4_0= ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4157:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9816);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4174:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4174:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4175:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4175:1: (lv_name_5_0= ruleValidID )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4176:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9845);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4192:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==79) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4192:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,79,FOLLOW_79_in_ruleXVariableDeclaration9859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4196:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4197:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4197:1: (lv_right_7_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4198:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9880);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4222:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4223:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4224:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9918);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter9928); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4231:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4234:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4235:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4235:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4235:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4235:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==89||LA59_1==104||LA59_1==110) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==92||LA59_0==108) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4236:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4236:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4237:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9974);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4253:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4254:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4254:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4255:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter9996);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4279:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4280:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4281:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter10032);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter10042); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4288:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4291:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4292:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4292:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4292:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4292:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4293:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4293:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4294:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter10088);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4310:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4311:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4311:1: (lv_name_1_0= ruleValidID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4312:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter10109);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4336:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4337:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4338:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall10145);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall10155); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4345:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4348:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4349:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4349:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4349:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4349:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4350:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4355:2: ( ( ruleStaticQualifier ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==126) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4356:1: ( ruleStaticQualifier )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4356:1: ( ruleStaticQualifier )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4357:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall10212);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4370:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==89) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4370:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,89,FOLLOW_89_in_ruleXFeatureCall10226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4374:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4375:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4375:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4376:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10247);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4392:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==107) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4392:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,107,FOLLOW_107_in_ruleXFeatureCall10260); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4396:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4397:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4397:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4398:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10281);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,88,FOLLOW_88_in_ruleXFeatureCall10295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4418:3: ( ( ruleIdOrSuper ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4419:1: ( ruleIdOrSuper )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4419:1: ( ruleIdOrSuper )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4420:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall10320);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4433:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4433:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4433:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4433:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4440:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4441:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,108,FOLLOW_108_in_ruleXFeatureCall10354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4471:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4472:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall10439);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

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
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4489:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4489:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4489:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4489:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4490:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4490:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4491:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall10467);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4507:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==107) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4507:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,107,FOLLOW_107_in_ruleXFeatureCall10480); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4511:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4512:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4512:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4513:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall10501);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop63;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,109,FOLLOW_109_in_ruleXFeatureCall10518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4533:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4533:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4536:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4537:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall10553);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4561:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4562:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4563:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10591);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper10602); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4570:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4573:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4574:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4574:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==125) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4575:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper10649);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4587:2: kw= 'super'
                    {
                    kw=(Token)match(input,125,FOLLOW_125_in_ruleIdOrSuper10673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4600:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4601:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4602:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10714);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier10725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4609:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4612:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4613:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4613:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==126) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4614:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier10772);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,126,FOLLOW_126_in_ruleStaticQualifier10790); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4638:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4639:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4640:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10831);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall10841); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4647:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4650:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4651:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4651:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4651:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4651:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4652:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,127,FOLLOW_127_in_ruleXConstructorCall10887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4661:1: ( ( ruleQualifiedName ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4662:1: ( ruleQualifiedName )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4662:1: ( ruleQualifiedName )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4663:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10910);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4676:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4676:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4676:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4676:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_89_in_ruleXConstructorCall10931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4681:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4682:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4682:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4683:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10953);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4699:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==107) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4699:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,107,FOLLOW_107_in_ruleXConstructorCall10966); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4703:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4704:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4704:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4705:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10987);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,88,FOLLOW_88_in_ruleXConstructorCall11001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4725:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4725:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4725:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4725:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,108,FOLLOW_108_in_ruleXConstructorCall11024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4747:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4748:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall11097);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4765:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4765:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4765:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4765:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4766:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4766:1: (lv_arguments_10_0= ruleXExpression )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4767:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall11125);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4783:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==107) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4783:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,107,FOLLOW_107_in_ruleXConstructorCall11138); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4787:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4788:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4788:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4789:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall11159);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,109,FOLLOW_109_in_ruleXConstructorCall11176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4809:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4809:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4812:1: (lv_arguments_14_0= ruleXClosure )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4813:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall11211);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4837:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4838:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4839:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral11248);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral11258); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4846:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4849:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4850:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4850:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4850:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4850:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4851:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4856:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==128) ) {
                alt75=1;
            }
            else if ( (LA75_0==129) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4856:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,128,FOLLOW_128_in_ruleXBooleanLiteral11305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4861:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4861:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4862:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4862:1: (lv_isTrue_2_0= 'true' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4863:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,129,FOLLOW_129_in_ruleXBooleanLiteral11329); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4884:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4885:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4886:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral11379);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral11389); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4893:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4896:28: ( ( () otherlv_1= 'null' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4897:1: ( () otherlv_1= 'null' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4897:1: ( () otherlv_1= 'null' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4897:2: () otherlv_1= 'null'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4897:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4898:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,130,FOLLOW_130_in_ruleXNullLiteral11435); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4915:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4916:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4917:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral11471);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral11481); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4924:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4927:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4928:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4928:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4928:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4928:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4929:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4934:2: ( (lv_value_1_0= ruleNumber ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4935:1: (lv_value_1_0= ruleNumber )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4935:1: (lv_value_1_0= ruleNumber )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4936:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral11536);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4960:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4961:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4962:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral11572);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral11582); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4969:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4972:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4973:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4973:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4973:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4973:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4974:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4979:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4980:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4980:1: (lv_value_1_0= RULE_STRING )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4981:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral11633); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5005:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5006:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5007:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11674);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral11684); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5014:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5017:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5018:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5019:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,131,FOLLOW_131_in_ruleXTypeLiteral11730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,108,FOLLOW_108_in_ruleXTypeLiteral11742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5032:1: ( ( ruleQualifiedName ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5033:1: ( ruleQualifiedName )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5033:1: ( ruleQualifiedName )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5034:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11765);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,109,FOLLOW_109_in_ruleXTypeLiteral11777); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5059:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5060:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5061:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11813);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression11823); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5068:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5071:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5072:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5072:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5072:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5072:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5073:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,132,FOLLOW_132_in_ruleXThrowExpression11869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5082:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5083:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5083:1: (lv_expression_2_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5084:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression11890);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5108:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5109:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5110:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11926);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression11936); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5117:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5120:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5121:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5121:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5121:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5121:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5122:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,133,FOLLOW_133_in_ruleXReturnExpression11982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5131:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5131:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5136:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5137:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression12013);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5161:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5162:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5163:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression12050);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression12060); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5170:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5173:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5174:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5174:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5174:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5174:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5175:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,134,FOLLOW_134_in_ruleXTryCatchFinallyExpression12106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5184:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5185:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5185:1: (lv_expression_2_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5186:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression12127);
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

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==136) ) {
                alt79=1;
            }
            else if ( (LA79_0==135) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==136) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred34_InternalFin()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5204:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5205:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression12157);
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
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5221:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==135) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred35_InternalFin()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5221:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5221:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5221:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,135,FOLLOW_135_in_ruleXTryCatchFinallyExpression12179); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5226:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5227:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5227:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5228:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression12201);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5245:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5245:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5245:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,135,FOLLOW_135_in_ruleXTryCatchFinallyExpression12223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5249:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5250:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5250:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5251:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression12244);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5275:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5276:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5277:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause12282);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause12292); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5284:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5287:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5288:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5288:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5288:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5288:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5288:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,136,FOLLOW_136_in_ruleXCatchClause12337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,108,FOLLOW_108_in_ruleXCatchClause12350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5297:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5298:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5298:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5299:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause12371);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

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
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,109,FOLLOW_109_in_ruleXCatchClause12383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5319:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5320:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5320:1: (lv_expression_4_0= ruleXExpression )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5321:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause12404);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5345:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5346:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5347:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12441);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12452); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5354:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5357:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5358:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5358:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5359:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName12499);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5369:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==104) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==RULE_ID) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred37_InternalFin()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5369:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5369:2: ( ( '.' )=>kw= '.' )
            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5369:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,104,FOLLOW_104_in_ruleQualifiedName12527); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName12550);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
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


    // $ANTLR start "entryRuleNumber"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5396:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5400:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5401:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber12604);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber12615); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5411:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5415:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5416:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5416:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_HEX) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_INT||LA84_0==RULE_DECIMAL) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5416:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber12659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5424:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5424:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5424:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5424:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_INT) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==RULE_DECIMAL) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5424:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber12687); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5432:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber12713); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5439:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==104) ) {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==RULE_INT||LA83_1==RULE_DECIMAL) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5440:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,104,FOLLOW_104_in_ruleNumber12733); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5445:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==RULE_INT) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==RULE_DECIMAL) ) {
                                alt82=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 82, 0, input);

                                throw nvae;
                            }
                            switch (alt82) {
                                case 1 :
                                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5445:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber12749); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5453:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber12775); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5471:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5472:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5473:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12828);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference12838); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5480:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5483:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5484:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5484:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==92||LA86_0==108) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5484:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5484:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5485:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12886);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5493:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==110) ) {
                            int LA85_2 = input.LA(2);

                            if ( (LA85_2==112) ) {
                                int LA85_3 = input.LA(3);

                                if ( (synpred38_InternalFin()) ) {
                                    alt85=1;
                                }


                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5493:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5496:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5496:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5496:6: ()
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5497:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,110,FOLLOW_110_in_ruleJvmTypeReference12924); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,112,FOLLOW_112_in_ruleJvmTypeReference12936); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5512:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12968);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5528:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5529:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5530:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef13003);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef13013); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5537:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5540:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5541:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5541:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5541:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5541:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==108) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5541:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleXFunctionTypeRef13051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5545:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ID||LA88_0==92||LA88_0==108) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5545:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5545:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5546:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5546:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5547:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef13073);
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

                            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5563:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==107) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5563:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,107,FOLLOW_107_in_ruleXFunctionTypeRef13086); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5567:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5568:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5568:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5569:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef13107);
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
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,109,FOLLOW_109_in_ruleXFunctionTypeRef13123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,92,FOLLOW_92_in_ruleXFunctionTypeRef13137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5593:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5594:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5594:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5595:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef13158);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5619:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5620:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5621:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference13194);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference13204); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5628:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5631:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5632:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5632:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5632:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5632:2: ( ( ruleQualifiedName ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5633:1: ( ruleQualifiedName )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5633:1: ( ruleQualifiedName )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5634:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference13252);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5647:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5647:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5647:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5647:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleJvmParameterizedTypeReference13273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5652:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5653:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5653:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5654:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference13295);
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

                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5670:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==107) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5670:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,107,FOLLOW_107_in_ruleJvmParameterizedTypeReference13308); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5674:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5675:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5675:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5676:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference13329);
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
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,88,FOLLOW_88_in_ruleJvmParameterizedTypeReference13343); if (state.failed) return current;
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5704:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5705:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5706:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference13381);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference13391); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5713:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5716:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5717:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5717:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==92||LA92_0==108) ) {
                alt92=1;
            }
            else if ( (LA92_0==137) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5718:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference13438);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5728:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference13465);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5744:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5745:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5746:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference13500);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference13510); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5753:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5756:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5757:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5757:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5757:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5757:2: ()
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5758:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,137,FOLLOW_137_in_ruleJvmWildcardTypeReference13556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5767:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==138) ) {
                alt93=1;
            }
            else if ( (LA93_0==125) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5767:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5767:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5768:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5768:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5769:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference13578);
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
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5786:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5786:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5787:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5787:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5788:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference13605);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5812:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5813:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5814:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound13643);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound13653); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5821:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5824:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5825:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5825:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5825:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,138,FOLLOW_138_in_ruleJvmUpperBound13690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5829:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5830:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5830:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5831:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound13711);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5855:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5856:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5857:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded13747);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded13757); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5864:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5867:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5868:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5868:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5868:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,139,FOLLOW_139_in_ruleJvmUpperBoundAnded13794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5872:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5873:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5873:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5874:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13815);
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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5898:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5899:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5900:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13851);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound13861); if (state.failed) return current;

            }

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
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5907:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5910:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5911:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5911:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5911:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,125,FOLLOW_125_in_ruleJvmLowerBound13898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5915:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5916:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5916:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5917:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13919);
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


    // $ANTLR start "entryRuleValidID"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5943:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5944:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5945:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID13958);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID13969); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5952:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5955:28: (this_ID_0= RULE_ID )
            // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5956:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID14008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalFin
    public final void synpred1_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1323:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1324:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1324:2: ( ( ruleOpMultiAssign ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1325:1: ( ruleOpMultiAssign )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1325:1: ( ruleOpMultiAssign )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1326:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFin2980);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalFin

    // $ANTLR start synpred2_InternalFin
    public final void synpred2_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:4: ( () ( ( ruleOpOr ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:5: () ( ( ruleOpOr ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1451:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1452:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1452:2: ( ( ruleOpOr ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1453:1: ( ruleOpOr )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1453:1: ( ruleOpOr )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1454:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalFin3328);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalFin

    // $ANTLR start synpred3_InternalFin
    public final void synpred3_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:5: () ( ( ruleOpAnd ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1552:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1553:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1553:2: ( ( ruleOpAnd ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1554:1: ( ruleOpAnd )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1554:1: ( ruleOpAnd )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1555:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalFin3587);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalFin

    // $ANTLR start synpred4_InternalFin
    public final void synpred4_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:5: () ( ( ruleOpEquality ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1653:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1654:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1654:2: ( ( ruleOpEquality ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1655:1: ( ruleOpEquality )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1655:1: ( ruleOpEquality )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1656:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalFin3846);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalFin

    // $ANTLR start synpred5_InternalFin
    public final void synpred5_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:4: ( ( () 'instanceof' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:5: ( () 'instanceof' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:5: ( () 'instanceof' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:6: () 'instanceof'
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1761:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1762:1: 
        {
        }

        match(input,85,FOLLOW_85_in_synpred5_InternalFin4122); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFin

    // $ANTLR start synpred6_InternalFin
    public final void synpred6_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:10: () ( ( ruleOpCompare ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1792:10: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1793:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1793:2: ( ( ruleOpCompare ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1794:1: ( ruleOpCompare )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1794:1: ( ruleOpCompare )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1795:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalFin4193);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalFin

    // $ANTLR start synpred7_InternalFin
    public final void synpred7_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:4: ( () ( ( ruleOpOther ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:5: () ( ( ruleOpOther ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1914:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1915:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1915:2: ( ( ruleOpOther ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1916:1: ( ruleOpOther )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1916:1: ( ruleOpOther )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:1917:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalFin4512);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalFin

    // $ANTLR start synpred8_InternalFin
    public final void synpred8_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2006:3: ( ( '>' '>' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2006:4: ( '>' '>' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2006:4: ( '>' '>' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2007:2: '>' '>'
        {
        match(input,88,FOLLOW_88_in_synpred8_InternalFin4728); if (state.failed) return ;
        match(input,88,FOLLOW_88_in_synpred8_InternalFin4733); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalFin

    // $ANTLR start synpred9_InternalFin
    public final void synpred9_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2036:3: ( ( '<' '<' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2036:4: ( '<' '<' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2036:4: ( '<' '<' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2037:2: '<' '<'
        {
        match(input,89,FOLLOW_89_in_synpred9_InternalFin4815); if (state.failed) return ;
        match(input,89,FOLLOW_89_in_synpred9_InternalFin4820); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalFin

    // $ANTLR start synpred10_InternalFin
    public final void synpred10_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:5: () ( ( ruleOpAdd ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2110:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2111:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2111:2: ( ( ruleOpAdd ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2112:1: ( ruleOpAdd )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2112:1: ( ruleOpAdd )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2113:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalFin5042);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalFin

    // $ANTLR start synpred11_InternalFin
    public final void synpred11_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:5: () ( ( ruleOpMulti ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2218:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2219:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2219:2: ( ( ruleOpMulti ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2220:1: ( ruleOpMulti )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2220:1: ( ruleOpMulti )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2221:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalFin5322);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalFin

    // $ANTLR start synpred12_InternalFin
    public final void synpred12_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:3: ( ( () 'as' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:4: ( () 'as' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:4: ( () 'as' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:5: () 'as'
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2451:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2452:1: 
        {
        }

        match(input,103,FOLLOW_103_in_synpred12_InternalFin5916); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalFin

    // $ANTLR start synpred13_InternalFin
    public final void synpred13_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2511:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2512:1: 
        {
        }

        match(input,104,FOLLOW_104_in_synpred13_InternalFin6070); if (state.failed) return ;
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2513:1: ( ( ruleValidID ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2514:1: ( ruleValidID )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2514:1: ( ruleValidID )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2515:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalFin6079);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalFin6085);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalFin

    // $ANTLR start synpred14_InternalFin
    public final void synpred14_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2569:10: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2570:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2570:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 104:
            {
            alt94=1;
            }
            break;
        case 105:
            {
            alt94=2;
            }
            break;
        case 106:
            {
            alt94=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }

        switch (alt94) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2570:4: '.'
                {
                match(input,104,FOLLOW_104_in_synpred14_InternalFin6188); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2572:6: ( ( '?.' ) )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2572:6: ( ( '?.' ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2573:1: ( '?.' )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2573:1: ( '?.' )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2574:2: '?.'
                {
                match(input,105,FOLLOW_105_in_synpred14_InternalFin6202); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2579:6: ( ( '*.' ) )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2579:6: ( ( '*.' ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2580:1: ( '*.' )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2580:1: ( '*.' )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2581:2: '*.'
                {
                match(input,106,FOLLOW_106_in_synpred14_InternalFin6222); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalFin

    // $ANTLR start synpred15_InternalFin
    public final void synpred15_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2690:4: ( ( '(' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2691:1: ( '(' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2691:1: ( '(' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2692:2: '('
        {
        match(input,108,FOLLOW_108_in_synpred15_InternalFin6449); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalFin

    // $ANTLR start synpred16_InternalFin
    public final void synpred16_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2711:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2712:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2712:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==92||LA96_0==108) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2712:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2712:3: ( ( ruleJvmFormalParameter ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2713:1: ( ruleJvmFormalParameter )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2713:1: ( ruleJvmFormalParameter )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2714:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFin6501);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2716:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==107) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2716:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,107,FOLLOW_107_in_synpred16_InternalFin6508); if (state.failed) return ;
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2717:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2718:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2718:1: ( ruleJvmFormalParameter )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2719:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFin6515);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2721:6: ( ( '|' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2722:1: ( '|' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2722:1: ( '|' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2723:2: '|'
        {
        match(input,111,FOLLOW_111_in_synpred16_InternalFin6529); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalFin

    // $ANTLR start synpred17_InternalFin
    public final void synpred17_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2790:4: ( ( () '[' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2790:5: ( () '[' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2790:5: ( () '[' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2790:6: () '['
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2790:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2791:1: 
        {
        }

        match(input,110,FOLLOW_110_in_synpred17_InternalFin6649); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalFin

    // $ANTLR start synpred18_InternalFin
    public final void synpred18_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:3: ( ( () '[' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:4: ( () '[' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:4: ( () '[' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:5: () '['
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2981:5: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:2982:1: 
        {
        }

        match(input,110,FOLLOW_110_in_synpred18_InternalFin7173); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalFin

    // $ANTLR start synpred20_InternalFin
    public final void synpred20_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==92||LA98_0==108) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3075:7: ( ( ruleJvmFormalParameter ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3076:1: ( ruleJvmFormalParameter )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3076:1: ( ruleJvmFormalParameter )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3077:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFin7452);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3079:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==107) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3079:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,107,FOLLOW_107_in_synpred20_InternalFin7459); if (state.failed) return ;
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3080:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3081:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3081:1: ( ruleJvmFormalParameter )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3082:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFin7466);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3084:6: ( ( '|' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3085:1: ( '|' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3085:1: ( '|' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3086:2: '|'
        {
        match(input,111,FOLLOW_111_in_synpred20_InternalFin7480); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalFin

    // $ANTLR start synpred22_InternalFin
    public final void synpred22_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3445:4: ( 'else' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3445:6: 'else'
        {
        match(input,115,FOLLOW_115_in_synpred22_InternalFin8263); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalFin

    // $ANTLR start synpred23_InternalFin
    public final void synpred23_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:5: ( ( ( ruleValidID ) ) ':' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:6: ( ( ruleValidID ) ) ':'
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3499:6: ( ( ruleValidID ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3500:1: ( ruleValidID )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3500:1: ( ruleValidID )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3501:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalFin8405);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,117,FOLLOW_117_in_synpred23_InternalFin8411); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalFin

    // $ANTLR start synpred24_InternalFin
    public final void synpred24_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3545:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,108,FOLLOW_108_in_synpred24_InternalFin8487); if (state.failed) return ;
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3546:1: ( ( ruleValidID ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3547:1: ( ruleValidID )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3547:1: ( ruleValidID )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:3548:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalFin8494);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,117,FOLLOW_117_in_synpred24_InternalFin8500); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalFin

    // $ANTLR start synpred25_InternalFin
    public final void synpred25_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4129:6: ( ( ruleJvmTypeReference ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4130:1: ( ruleJvmTypeReference )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4130:1: ( ruleJvmTypeReference )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4131:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalFin9765);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4133:2: ( ( ruleValidID ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4134:1: ( ruleValidID )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4134:1: ( ruleValidID )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4135:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalFin9774);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalFin

    // $ANTLR start synpred26_InternalFin
    public final void synpred26_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4433:4: ( ( '(' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4434:1: ( '(' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4434:1: ( '(' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4435:2: '('
        {
        match(input,108,FOLLOW_108_in_synpred26_InternalFin10336); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalFin

    // $ANTLR start synpred27_InternalFin
    public final void synpred27_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4454:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==92||LA102_0==108) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4455:3: ( ( ruleJvmFormalParameter ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4456:1: ( ruleJvmFormalParameter )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4456:1: ( ruleJvmFormalParameter )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4457:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalFin10388);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4459:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==107) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4459:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,107,FOLLOW_107_in_synpred27_InternalFin10395); if (state.failed) return ;
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4460:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4461:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4461:1: ( ruleJvmFormalParameter )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4462:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalFin10402);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4464:6: ( ( '|' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4465:1: ( '|' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4465:1: ( '|' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4466:2: '|'
        {
        match(input,111,FOLLOW_111_in_synpred27_InternalFin10416); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalFin

    // $ANTLR start synpred28_InternalFin
    public final void synpred28_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4533:4: ( ( () '[' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4533:5: ( () '[' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4533:5: ( () '[' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4533:6: () '['
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4533:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4534:1: 
        {
        }

        match(input,110,FOLLOW_110_in_synpred28_InternalFin10536); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalFin

    // $ANTLR start synpred29_InternalFin
    public final void synpred29_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4676:4: ( '<' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4676:6: '<'
        {
        match(input,89,FOLLOW_89_in_synpred29_InternalFin10923); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalFin

    // $ANTLR start synpred30_InternalFin
    public final void synpred30_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4725:5: ( '(' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4725:7: '('
        {
        match(input,108,FOLLOW_108_in_synpred30_InternalFin11016); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalFin

    // $ANTLR start synpred31_InternalFin
    public final void synpred31_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4730:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4731:1: 
        {
        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4731:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==92||LA104_0==108) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4731:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4731:3: ( ( ruleJvmFormalParameter ) )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4732:1: ( ruleJvmFormalParameter )
                {
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4732:1: ( ruleJvmFormalParameter )
                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4733:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalFin11046);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4735:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==107) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4735:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,107,FOLLOW_107_in_synpred31_InternalFin11053); if (state.failed) return ;
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4736:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4737:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4737:1: ( ruleJvmFormalParameter )
                	    // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4738:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalFin11060);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop103;
                    }
                } while (true);


                }
                break;

        }

        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4740:6: ( ( '|' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4741:1: ( '|' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4741:1: ( '|' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4742:2: '|'
        {
        match(input,111,FOLLOW_111_in_synpred31_InternalFin11074); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalFin

    // $ANTLR start synpred32_InternalFin
    public final void synpred32_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4809:4: ( ( () '[' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4809:5: ( () '[' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4809:5: ( () '[' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4809:6: () '['
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4809:6: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:4810:1: 
        {
        }

        match(input,110,FOLLOW_110_in_synpred32_InternalFin11194); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalFin

    // $ANTLR start synpred33_InternalFin
    public final void synpred33_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5131:2: ( ( ruleXExpression ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5132:1: ( ruleXExpression )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5132:1: ( ruleXExpression )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5133:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalFin11996);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalFin

    // $ANTLR start synpred34_InternalFin
    public final void synpred34_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:5: ( 'catch' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5202:7: 'catch'
        {
        match(input,136,FOLLOW_136_in_synpred34_InternalFin12141); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalFin

    // $ANTLR start synpred35_InternalFin
    public final void synpred35_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5221:5: ( 'finally' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5221:7: 'finally'
        {
        match(input,135,FOLLOW_135_in_synpred35_InternalFin12171); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalFin

    // $ANTLR start synpred37_InternalFin
    public final void synpred37_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5369:3: ( '.' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5370:2: '.'
        {
        match(input,104,FOLLOW_104_in_synpred37_InternalFin12518); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalFin

    // $ANTLR start synpred38_InternalFin
    public final void synpred38_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5493:2: ( ( () '[' ']' ) )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5493:3: ( () '[' ']' )
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5493:3: ( () '[' ']' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5493:4: () '[' ']'
        {
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5493:4: ()
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5494:1: 
        {
        }

        match(input,110,FOLLOW_110_in_synpred38_InternalFin12901); if (state.failed) return ;
        match(input,112,FOLLOW_112_in_synpred38_InternalFin12905); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalFin

    // $ANTLR start synpred39_InternalFin
    public final void synpred39_InternalFin_fragment() throws RecognitionException {   
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5647:4: ( '<' )
        // ../de.nie.fin/src-gen/de/nie/fin/parser/antlr/internal/InternalFin.g:5647:6: '<'
        {
        match(input,89,FOLLOW_89_in_synpred39_InternalFin13265); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalFin

    // Delegated rules

    public final boolean synpred32_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalFin() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalFin_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\1\1\12\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA18_maxS =
        "\1\u0088\1\uffff\10\0\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA18_specialS =
        "\2\uffff\1\4\1\6\1\5\1\1\1\7\1\0\1\2\1\3\1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\5\1\7\uffff\1\1\5\uffff\1\1\71\uffff\10\1\1\2\1\3\1\4\1\5"+
            "\1\6\1\7\1\10\1\11\17\1\1\uffff\16\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1914:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalFin()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\101\uffff";
    static final String DFA34_eofS =
        "\1\2\100\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA34_maxS =
        "\1\u0088\1\0\77\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\7\uffff\1\2\5\uffff\1\2\71\uffff\34\2\1\1\2\2\1\uffff"+
            "\16\2\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2690:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\36\uffff";
    static final String DFA33_eofS =
        "\36\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA33_maxS =
        "\1\u0086\2\0\33\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\5\1\1\2\5\7\uffff\1\5\110\uffff\1\5\2\uffff\1\3\3\uffff"+
            "\2\5\4\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2711:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==108) ) {s = 2;}

                        else if ( (LA33_0==92) && (synpred16_InternalFin())) {s = 3;}

                        else if ( (LA33_0==111) && (synpred16_InternalFin())) {s = 4;}

                        else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||(LA33_0>=RULE_HEX && LA33_0<=RULE_DECIMAL)||LA33_0==16||LA33_0==89||(LA33_0>=96 && LA33_0<=97)||LA33_0==102||LA33_0==110||LA33_0==114||LA33_0==116||(LA33_0>=120 && LA33_0<=122)||LA33_0==125||(LA33_0>=127 && LA33_0<=134)) ) {s = 5;}

                        else if ( (LA33_0==109) ) {s = 29;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalFin()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalFin()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\101\uffff";
    static final String DFA35_eofS =
        "\1\2\100\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA35_maxS =
        "\1\u0088\1\0\77\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA35_transitionS = {
            "\5\2\7\uffff\1\2\5\uffff\1\2\71\uffff\36\2\1\1\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2790:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\16\uffff";
    static final String DFA37_eofS =
        "\16\uffff";
    static final String DFA37_minS =
        "\1\4\15\uffff";
    static final String DFA37_maxS =
        "\1\u0086\15\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA37_specialS =
        "\16\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\5\1\4\2\5\7\uffff\1\2\110\uffff\1\4\22\uffff\1\15\1\uffff"+
            "\1\5\3\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1\11\2\uffff\1"+
            "\4\1\uffff\1\1\4\5\1\12\1\13\1\14",
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

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2831:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA41_eotS =
        "\40\uffff";
    static final String DFA41_eofS =
        "\40\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA41_maxS =
        "\1\u0086\2\0\35\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\5\1\1\2\5\7\uffff\1\5\110\uffff\1\5\2\uffff\1\3\3\uffff"+
            "\2\5\4\uffff\1\5\5\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\6\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "3075:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==RULE_ID) ) {s = 1;}

                        else if ( (LA41_0==108) ) {s = 2;}

                        else if ( (LA41_0==92) && (synpred20_InternalFin())) {s = 3;}

                        else if ( (LA41_0==111) && (synpred20_InternalFin())) {s = 4;}

                        else if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_STRING)||(LA41_0>=RULE_HEX && LA41_0<=RULE_DECIMAL)||LA41_0==16||LA41_0==89||(LA41_0>=96 && LA41_0<=97)||LA41_0==102||LA41_0==110||LA41_0==112||LA41_0==114||LA41_0==116||(LA41_0>=120 && LA41_0<=125)||(LA41_0>=127 && LA41_0<=134)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalFin()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalFin()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\101\uffff";
    static final String DFA65_eofS =
        "\1\2\100\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA65_maxS =
        "\1\u0088\1\0\77\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\7\uffff\1\2\5\uffff\1\2\71\uffff\34\2\1\1\2\2\1\uffff"+
            "\16\2\1\uffff\12\2",
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
            return "4433:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalFin()) ) {s = 64;}

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
    static final String DFA64_eotS =
        "\36\uffff";
    static final String DFA64_eofS =
        "\36\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA64_maxS =
        "\1\u0086\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
            "\2\5\1\1\2\5\7\uffff\1\5\110\uffff\1\5\2\uffff\1\3\3\uffff"+
            "\2\5\4\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "4454:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==108) ) {s = 2;}

                        else if ( (LA64_0==92) && (synpred27_InternalFin())) {s = 3;}

                        else if ( (LA64_0==111) && (synpred27_InternalFin())) {s = 4;}

                        else if ( ((LA64_0>=RULE_INT && LA64_0<=RULE_STRING)||(LA64_0>=RULE_HEX && LA64_0<=RULE_DECIMAL)||LA64_0==16||LA64_0==89||(LA64_0>=96 && LA64_0<=97)||LA64_0==102||LA64_0==110||LA64_0==114||LA64_0==116||(LA64_0>=120 && LA64_0<=122)||LA64_0==125||(LA64_0>=127 && LA64_0<=134)) ) {s = 5;}

                        else if ( (LA64_0==109) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalFin()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalFin()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\101\uffff";
    static final String DFA66_eofS =
        "\1\2\100\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA66_maxS =
        "\1\u0088\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\7\uffff\1\2\5\uffff\1\2\71\uffff\36\2\1\1\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "4533:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\101\uffff";
    static final String DFA70_eofS =
        "\1\2\100\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA70_maxS =
        "\1\u0088\1\0\77\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\7\uffff\1\2\5\uffff\1\2\71\uffff\11\2\1\1\25\2\1\uffff"+
            "\16\2\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4676:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\101\uffff";
    static final String DFA73_eofS =
        "\1\2\100\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA73_maxS =
        "\1\u0088\1\0\77\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\7\uffff\1\2\5\uffff\1\2\71\uffff\34\2\1\1\2\2\1\uffff"+
            "\16\2\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4725:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\36\uffff";
    static final String DFA72_eofS =
        "\36\uffff";
    static final String DFA72_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA72_maxS =
        "\1\u0086\2\0\33\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA72_transitionS = {
            "\2\5\1\1\2\5\7\uffff\1\5\110\uffff\1\5\2\uffff\1\3\3\uffff"+
            "\2\5\4\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4730:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==RULE_ID) ) {s = 1;}

                        else if ( (LA72_0==108) ) {s = 2;}

                        else if ( (LA72_0==92) && (synpred31_InternalFin())) {s = 3;}

                        else if ( (LA72_0==111) && (synpred31_InternalFin())) {s = 4;}

                        else if ( ((LA72_0>=RULE_INT && LA72_0<=RULE_STRING)||(LA72_0>=RULE_HEX && LA72_0<=RULE_DECIMAL)||LA72_0==16||LA72_0==89||(LA72_0>=96 && LA72_0<=97)||LA72_0==102||LA72_0==110||LA72_0==114||LA72_0==116||(LA72_0>=120 && LA72_0<=122)||LA72_0==125||(LA72_0>=127 && LA72_0<=134)) ) {s = 5;}

                        else if ( (LA72_0==109) ) {s = 29;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalFin()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalFin()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\101\uffff";
    static final String DFA74_eofS =
        "\1\2\100\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA74_maxS =
        "\1\u0088\1\0\77\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\7\uffff\1\2\5\uffff\1\2\71\uffff\36\2\1\1\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4809:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\101\uffff";
    static final String DFA76_eofS =
        "\1\33\100\uffff";
    static final String DFA76_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA76_maxS =
        "\1\u0088\32\0\46\uffff";
    static final String DFA76_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\46\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\16\1\21\1\1\1\15\1\17\7\uffff\1\6\5\uffff\1\33\71\uffff"+
            "\11\33\1\10\6\33\1\4\1\3\4\33\1\2\5\33\1\32\1\33\1\12\1\uffff"+
            "\2\33\1\23\1\33\1\7\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1"+
            "\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
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
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "5131:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_11 = input.LA(1);

                         
                        int index76_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_12 = input.LA(1);

                         
                        int index76_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_13 = input.LA(1);

                         
                        int index76_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_14 = input.LA(1);

                         
                        int index76_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA76_25 = input.LA(1);

                         
                        int index76_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA76_26 = input.LA(1);

                         
                        int index76_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\101\uffff";
    static final String DFA91_eofS =
        "\1\2\100\uffff";
    static final String DFA91_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA91_maxS =
        "\1\u0088\1\0\77\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA91_transitionS = {
            "\5\2\7\uffff\1\2\5\uffff\1\2\71\uffff\11\2\1\1\25\2\1\uffff"+
            "\16\2\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "5647:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalFin()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleFinModelFile_in_entryRuleFinModelFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinModelFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFinModelFile123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFinModelFile144 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000164L});
    public static final BitSet FOLLOW_ruleImport_in_ruleFinModelFile167 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000164L});
    public static final BitSet FOLLOW_ruleElement_in_ruleFinModelFile189 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000164L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport273 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKonto_in_ruleElement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuchung_in_ruleElement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpfaenger_in_ruleElement441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuchungsintervall_in_ruleElement468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKategorie_in_ruleElement495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKonto_in_entryRuleKonto530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKonto540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleKonto577 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleKonto598 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleKonto610 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKonto622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKonto639 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKonto656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKonto673 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKonto690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKonto707 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleKonto724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKonto741 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleKonto758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKonto775 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleKonto792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_entryRuleTag829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTag840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTag878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTag897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTag916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTag935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTag954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTag973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTag992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTag1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTag1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTag1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTag1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTag1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTag1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTag1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTag1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTag1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTag1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTag1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTag1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTag1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTag1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTag1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTag1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTag1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTag1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTag1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTag1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTag1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTag1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTag1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTag1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonat_in_entryRuleMonat1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonat1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMonat1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleMonat1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMonat1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMonat1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMonat1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMonat1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleMonat1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMonat1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleMonat1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleMonat1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleMonat1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleMonat1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuchungsintervall_in_entryRuleBuchungsintervall1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuchungsintervall1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBuchungsintervall1834 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBuchungsintervall1855 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBuchungsintervall1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleBuchungsintervall1879 = new BitSet(new long[]{0xFFC0000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMonat_in_ruleBuchungsintervall1900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleBuchungsintervall1912 = new BitSet(new long[]{0x003FFFFFFF800000L});
    public static final BitSet FOLLOW_ruleTag_in_ruleBuchungsintervall1933 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBuchungsintervall1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKategorie_in_entryRuleKategorie1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKategorie1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleKategorie2028 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleKategorie2049 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleKategorie2062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKategorie2079 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleKategorie2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuchung_in_entryRuleBuchung2134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuchung2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBuchung2181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBuchung2202 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBuchung2214 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBuchung2226 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung2246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleBuchung2258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBuchung2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleBuchung2294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_73_in_ruleBuchung2334 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleBuchung2368 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleBuchung2400 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuchung2420 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBuchung2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmpfaenger_in_entryRuleEmpfaenger2468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmpfaenger2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleEmpfaenger2515 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleEmpfaenger2536 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleEmpfaenger2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleEmpfaenger2561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEmpfaenger2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleEmpfaenger2595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEmpfaenger2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleEmpfaenger2629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEmpfaenger2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleEmpfaenger2663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEmpfaenger2680 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEmpfaenger2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2909 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2959 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3012 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOpSingleAssign3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOpMultiAssign3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3307 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression3360 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr3422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOpOr3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3619 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3642 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOpAnd3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3878 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOpEquality3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOpEquality4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4105 = new BitSet(new long[]{0x0000000000000002L,0x0000000003E00000L});
    public static final BitSet FOLLOW_85_in_ruleXRelationalExpression4141 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression4164 = new BitSet(new long[]{0x0000000000000002L,0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4225 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4248 = new BitSet(new long[]{0x0000000000000002L,0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare4288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOpCompare4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOpCompare4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOpCompare4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOpCompare4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4491 = new BitSet(new long[]{0x0000000000000002L,0x00000000FF000000L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4544 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4567 = new BitSet(new long[]{0x0000000000000002L,0x00000000FF000000L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOpOther4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOpOther4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOpOther4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOpOther4713 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleOpOther4744 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleOpOther4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOpOther4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOpOther4800 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleOpOther4831 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleOpOther4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOpOther4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleOpOther4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleOpOther4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOpOther4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5021 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression5074 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression5097 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd5136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleOpAdd5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOpAdd5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression5244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5301 = new BitSet(new long[]{0x0000000000000002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5354 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5377 = new BitSet(new long[]{0x0000000000000002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti5416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleOpMulti5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleOpMulti5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleOpMulti5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleOpMulti5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5630 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary5716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleOpUnary5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOpUnary5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleOpUnary5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5900 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleXCastedExpression5935 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5958 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall6053 = new BitSet(new long[]{0x0000000000000002L,0x0000070000000000L});
    public static final BitSet FOLLOW_104_in_ruleXMemberFeatureCall6102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall6141 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall6163 = new BitSet(new long[]{0x0000000000000002L,0x0000070000000000L});
    public static final BitSet FOLLOW_104_in_ruleXMemberFeatureCall6249 = new BitSet(new long[]{0x0000000000000040L,0x0000000002000000L});
    public static final BitSet FOLLOW_105_in_ruleXMemberFeatureCall6273 = new BitSet(new long[]{0x0000000000000040L,0x0000000002000000L});
    public static final BitSet FOLLOW_106_in_ruleXMemberFeatureCall6310 = new BitSet(new long[]{0x0000000000000040L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleXMemberFeatureCall6339 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6360 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_107_in_ruleXMemberFeatureCall6373 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6394 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_88_in_ruleXMemberFeatureCall6408 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6433 = new BitSet(new long[]{0x0000000000000002L,0x0000570000000000L});
    public static final BitSet FOLLOW_108_in_ruleXMemberFeatureCall6467 = new BitSet(new long[]{0x00000000000101F0L,0xA714F04312000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6552 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6580 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_ruleXMemberFeatureCall6593 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6614 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_ruleXMemberFeatureCall6631 = new BitSet(new long[]{0x0000000000000002L,0x0000470000000000L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall6666 = new BitSet(new long[]{0x0000000000000002L,0x0000070000000000L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral7122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure7363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleXClosure7433 = new BitSet(new long[]{0x00000000000101F0L,0xBF15D04312000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7506 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_107_in_ruleXClosure7519 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7540 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_111_in_ruleXClosure7562 = new BitSet(new long[]{0x00000000000101F0L,0xBF15504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure7599 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleXClosure7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure7647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure7713 = new BitSet(new long[]{0x00000000000101F2L,0xBF16504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_113_in_ruleXExpressionInClosure7726 = new BitSet(new long[]{0x00000000000101F2L,0xBF14504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure7776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7884 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_107_in_ruleXShortClosure7897 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7918 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_111_in_ruleXShortClosure7940 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression8012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleXParenthesizedExpression8059 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression8081 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleXParenthesizedExpression8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression8128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleXIfExpression8184 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleXIfExpression8196 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8217 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleXIfExpression8229 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8250 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleXIfExpression8271 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression8331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleXSwitchExpression8387 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression8430 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleXSwitchExpression8442 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8466 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_108_in_ruleXSwitchExpression8510 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression8531 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleXSwitchExpression8543 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8566 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleXSwitchExpression8578 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression8592 = new BitSet(new long[]{0x0000000000000040L,0x00A0100010000000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression8613 = new BitSet(new long[]{0x0000000000400040L,0x00E0100010000000L});
    public static final BitSet FOLLOW_118_in_ruleXSwitchExpression8627 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleXSwitchExpression8639 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression8660 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXSwitchExpression8674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart8710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8766 = new BitSet(new long[]{0x0000000000000000L,0x00A0000000000000L});
    public static final BitSet FOLLOW_119_in_ruleXCasePart8780 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8801 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleXCasePart8815 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleXForLoopExpression8928 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleXForLoopExpression8940 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8961 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleXForLoopExpression8973 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8994 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleXForLoopExpression9006 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression9027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression9063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression9073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleXWhileExpression9119 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleXWhileExpression9131 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression9152 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleXWhileExpression9164 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression9185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression9221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression9231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleXDoWhileExpression9277 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9298 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleXDoWhileExpression9310 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleXDoWhileExpression9322 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression9343 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleXDoWhileExpression9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression9391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression9447 = new BitSet(new long[]{0x00000000004101F0L,0xBF14504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression9469 = new BitSet(new long[]{0x00000000004101F0L,0xBF16504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_113_in_ruleXBlockExpression9482 = new BitSet(new long[]{0x00000000004101F0L,0xBF14504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_22_in_ruleXBlockExpression9498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock9534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock9544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock9618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration9653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleXVariableDeclaration9716 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_124_in_ruleXVariableDeclaration9747 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9795 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleXVariableDeclaration9859 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9974 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter10032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter10042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter10088 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter10109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall10145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall10155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall10212 = new BitSet(new long[]{0x0000000000000040L,0x2000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleXFeatureCall10226 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10247 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_107_in_ruleXFeatureCall10260 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall10281 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_88_in_ruleXFeatureCall10295 = new BitSet(new long[]{0x0000000000000040L,0x2000000002000000L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall10320 = new BitSet(new long[]{0x0000000000000002L,0x0000500000000000L});
    public static final BitSet FOLLOW_108_in_ruleXFeatureCall10354 = new BitSet(new long[]{0x00000000000101F0L,0xA714F04312000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall10439 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall10467 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_ruleXFeatureCall10480 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall10501 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_ruleXFeatureCall10518 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper10591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper10602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper10649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleIdOrSuper10673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier10714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier10725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier10772 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleStaticQualifier10790 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall10831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall10841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleXConstructorCall10887 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10910 = new BitSet(new long[]{0x0000000000000002L,0x0000500002000000L});
    public static final BitSet FOLLOW_89_in_ruleXConstructorCall10931 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10953 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_107_in_ruleXConstructorCall10966 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10987 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_88_in_ruleXConstructorCall11001 = new BitSet(new long[]{0x0000000000000002L,0x0000500000000000L});
    public static final BitSet FOLLOW_108_in_ruleXConstructorCall11024 = new BitSet(new long[]{0x00000000000101F0L,0xA714F04312000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall11097 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall11125 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_ruleXConstructorCall11138 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall11159 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_ruleXConstructorCall11176 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral11248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleXBooleanLiteral11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleXBooleanLiteral11329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral11379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral11389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleXNullLiteral11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral11471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral11536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral11572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral11674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleXTypeLiteral11730 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleXTypeLiteral11742 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral11765 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleXTypeLiteral11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression11813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression11823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleXThrowExpression11869 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression11890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleXReturnExpression11982 = new BitSet(new long[]{0x00000000000101F2L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression12050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression12060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleXTryCatchFinallyExpression12106 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression12127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression12157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_135_in_ruleXTryCatchFinallyExpression12179 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression12201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleXTryCatchFinallyExpression12223 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause12282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause12292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleXCatchClause12337 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleXCatchClause12350 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause12371 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleXCatchClause12383 = new BitSet(new long[]{0x00000000000101F0L,0xA714504302000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName12499 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleQualifiedName12527 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName12550 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber12604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber12615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber12659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber12687 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber12713 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleNumber12733 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber12749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference12828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference12838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference12886 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleJvmTypeReference12924 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleJvmTypeReference12936 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference12968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef13003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef13013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleXFunctionTypeRef13051 = new BitSet(new long[]{0x0000000000000040L,0x0000300010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef13073 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_ruleXFunctionTypeRef13086 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef13107 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_ruleXFunctionTypeRef13123 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleXFunctionTypeRef13137 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef13158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference13194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference13204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference13252 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleJvmParameterizedTypeReference13273 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference13295 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_107_in_ruleJvmParameterizedTypeReference13308 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference13329 = new BitSet(new long[]{0x0000000000000000L,0x0000080001000000L});
    public static final BitSet FOLLOW_88_in_ruleJvmParameterizedTypeReference13343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference13381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference13391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference13438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference13500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference13510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleJvmWildcardTypeReference13556 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference13578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound13643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound13653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleJvmUpperBound13690 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded13747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleJvmUpperBoundAnded13794 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded13815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound13851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleJvmLowerBound13898 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound13919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID13958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID13969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID14008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFin2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalFin3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalFin3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalFin3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_synpred5_InternalFin4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalFin4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalFin4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_synpred8_InternalFin4728 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_synpred8_InternalFin4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_synpred9_InternalFin4815 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_synpred9_InternalFin4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalFin5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalFin5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_synpred12_InternalFin5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_synpred13_InternalFin6070 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalFin6079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalFin6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_synpred14_InternalFin6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_synpred14_InternalFin6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_synpred14_InternalFin6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_synpred15_InternalFin6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFin6501 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_107_in_synpred16_InternalFin6508 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFin6515 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_111_in_synpred16_InternalFin6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_synpred17_InternalFin6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_synpred18_InternalFin7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFin7452 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_107_in_synpred20_InternalFin7459 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFin7466 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_111_in_synpred20_InternalFin7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_synpred22_InternalFin8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalFin8405 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_synpred23_InternalFin8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_synpred24_InternalFin8487 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalFin8494 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_synpred24_InternalFin8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalFin9765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalFin9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_synpred26_InternalFin10336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalFin10388 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_107_in_synpred27_InternalFin10395 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalFin10402 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_111_in_synpred27_InternalFin10416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_synpred28_InternalFin10536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_synpred29_InternalFin10923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_synpred30_InternalFin11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalFin11046 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_107_in_synpred31_InternalFin11053 = new BitSet(new long[]{0x0000000000000040L,0x0000100010000000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalFin11060 = new BitSet(new long[]{0x0000000000000000L,0x0000880000000000L});
    public static final BitSet FOLLOW_111_in_synpred31_InternalFin11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_synpred32_InternalFin11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalFin11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_synpred34_InternalFin12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_synpred35_InternalFin12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_synpred37_InternalFin12518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_synpred38_InternalFin12901 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_synpred38_InternalFin12905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_synpred39_InternalFin13265 = new BitSet(new long[]{0x0000000000000002L});

}